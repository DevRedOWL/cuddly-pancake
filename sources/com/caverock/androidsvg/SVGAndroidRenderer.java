package com.caverock.androidsvg;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.support.p001v4.media.session.PlaybackStateCompat;
import android.util.Base64;
import android.util.Log;
import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.SVG;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

class SVGAndroidRenderer {
    private static final float BEZIER_ARC_FACTOR = 0.5522848f;
    private static final String DEFAULT_FONT_FAMILY = "serif";
    public static final float LUMINANCE_TO_ALPHA_BLUE = 0.0722f;
    public static final float LUMINANCE_TO_ALPHA_GREEN = 0.7151f;
    public static final float LUMINANCE_TO_ALPHA_RED = 0.2127f;
    private static final String TAG = "SVGAndroidRenderer";
    private static HashSet<String> supportedFeatures;
    /* access modifiers changed from: private */
    public Canvas canvas;
    private SVG document;
    private float dpi;
    private Stack<Matrix> matrixStack;
    private Stack<SVG.SvgContainer> parentStack;
    private CSSParser.RuleMatchContext ruleMatchContext = null;
    /* access modifiers changed from: private */
    public RendererState state;
    private Stack<RendererState> stateStack;

    private static int clamp255(float f) {
        int i = (int) (f * 256.0f);
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    /* access modifiers changed from: private */
    public static void debug(String str, Object... objArr) {
    }

    private float dotProduct(float f, float f2, float f3, float f4) {
        return (f * f3) + (f2 * f4);
    }

    private class RendererState {
        Paint fillPaint;
        boolean hasFill;
        boolean hasStroke;
        boolean spacePreserve;
        Paint strokePaint;
        SVG.Style style;
        SVG.Box viewBox;
        SVG.Box viewPort;

        RendererState() {
            this.fillPaint = new Paint();
            this.fillPaint.setFlags(385);
            this.fillPaint.setStyle(Paint.Style.FILL);
            this.fillPaint.setTypeface(Typeface.DEFAULT);
            this.strokePaint = new Paint();
            this.strokePaint.setFlags(385);
            this.strokePaint.setStyle(Paint.Style.STROKE);
            this.strokePaint.setTypeface(Typeface.DEFAULT);
            this.style = SVG.Style.getDefaultStyle();
        }

        RendererState(RendererState rendererState) {
            this.hasFill = rendererState.hasFill;
            this.hasStroke = rendererState.hasStroke;
            this.fillPaint = new Paint(rendererState.fillPaint);
            this.strokePaint = new Paint(rendererState.strokePaint);
            SVG.Box box = rendererState.viewPort;
            if (box != null) {
                this.viewPort = new SVG.Box(box);
            }
            SVG.Box box2 = rendererState.viewBox;
            if (box2 != null) {
                this.viewBox = new SVG.Box(box2);
            }
            this.spacePreserve = rendererState.spacePreserve;
            try {
                this.style = (SVG.Style) rendererState.style.clone();
            } catch (CloneNotSupportedException e) {
                Log.e(SVGAndroidRenderer.TAG, "Unexpected clone error", e);
                this.style = SVG.Style.getDefaultStyle();
            }
        }
    }

    private void resetState() {
        this.state = new RendererState();
        this.stateStack = new Stack<>();
        updateStyle(this.state, SVG.Style.getDefaultStyle());
        RendererState rendererState = this.state;
        rendererState.viewPort = null;
        rendererState.spacePreserve = false;
        this.stateStack.push(new RendererState(rendererState));
        this.matrixStack = new Stack<>();
        this.parentStack = new Stack<>();
    }

    SVGAndroidRenderer(Canvas canvas2, float f) {
        this.canvas = canvas2;
        this.dpi = f;
    }

    /* access modifiers changed from: package-private */
    public float getDPI() {
        return this.dpi;
    }

    /* access modifiers changed from: package-private */
    public float getCurrentFontSize() {
        return this.state.fillPaint.getTextSize();
    }

    /* access modifiers changed from: package-private */
    public float getCurrentFontXHeight() {
        return this.state.fillPaint.getTextSize() / 2.0f;
    }

    /* access modifiers changed from: package-private */
    public SVG.Box getCurrentViewPortInUserUnits() {
        if (this.state.viewBox != null) {
            return this.state.viewBox;
        }
        return this.state.viewPort;
    }

    /* access modifiers changed from: package-private */
    public void renderDocument(SVG svg, RenderOptions renderOptions) {
        PreserveAspectRatio preserveAspectRatio;
        SVG.Box box;
        if (renderOptions != null) {
            this.document = svg;
            SVG.Svg rootElement = svg.getRootElement();
            if (rootElement == null) {
                warn("Nothing to render. Document is empty.", new Object[0]);
                return;
            }
            if (renderOptions.hasView()) {
                SVG.SvgElementBase elementById = this.document.getElementById(renderOptions.viewId);
                if (elementById == null || !(elementById instanceof SVG.View)) {
                    Log.w(TAG, String.format("View element with id \"%s\" not found.", new Object[]{renderOptions.viewId}));
                    return;
                }
                SVG.View view = (SVG.View) elementById;
                if (view.viewBox == null) {
                    Log.w(TAG, String.format("View element with id \"%s\" is missing a viewBox attribute.", new Object[]{renderOptions.viewId}));
                    return;
                } else {
                    box = view.viewBox;
                    preserveAspectRatio = view.preserveAspectRatio;
                }
            } else {
                box = renderOptions.hasViewBox() ? renderOptions.viewBox : rootElement.viewBox;
                preserveAspectRatio = renderOptions.hasPreserveAspectRatio() ? renderOptions.preserveAspectRatio : rootElement.preserveAspectRatio;
            }
            if (renderOptions.hasCss()) {
                svg.addCSSRules(renderOptions.css);
            }
            if (renderOptions.hasTarget()) {
                this.ruleMatchContext = new CSSParser.RuleMatchContext();
                this.ruleMatchContext.targetElement = svg.getElementById(renderOptions.targetId);
            }
            resetState();
            checkXMLSpaceAttribute(rootElement);
            statePush();
            SVG.Box box2 = new SVG.Box(renderOptions.viewPort);
            if (rootElement.width != null) {
                box2.width = rootElement.width.floatValue(this, box2.width);
            }
            if (rootElement.height != null) {
                box2.height = rootElement.height.floatValue(this, box2.height);
            }
            render(rootElement, box2, box, preserveAspectRatio);
            statePop();
            if (renderOptions.hasCss()) {
                svg.clearRenderCSSRules();
                return;
            }
            return;
        }
        throw new NullPointerException("renderOptions shouldn't be null");
    }

    private void render(SVG.SvgObject svgObject) {
        if (!(svgObject instanceof SVG.NotDirectlyRendered)) {
            statePush();
            checkXMLSpaceAttribute(svgObject);
            if (svgObject instanceof SVG.Svg) {
                render((SVG.Svg) svgObject);
            } else if (svgObject instanceof SVG.Use) {
                render((SVG.Use) svgObject);
            } else if (svgObject instanceof SVG.Switch) {
                render((SVG.Switch) svgObject);
            } else if (svgObject instanceof SVG.Group) {
                render((SVG.Group) svgObject);
            } else if (svgObject instanceof SVG.C1176Image) {
                render((SVG.C1176Image) svgObject);
            } else if (svgObject instanceof SVG.Path) {
                render((SVG.Path) svgObject);
            } else if (svgObject instanceof SVG.Rect) {
                render((SVG.Rect) svgObject);
            } else if (svgObject instanceof SVG.Circle) {
                render((SVG.Circle) svgObject);
            } else if (svgObject instanceof SVG.Ellipse) {
                render((SVG.Ellipse) svgObject);
            } else if (svgObject instanceof SVG.Line) {
                render((SVG.Line) svgObject);
            } else if (svgObject instanceof SVG.Polygon) {
                render((SVG.Polygon) svgObject);
            } else if (svgObject instanceof SVG.PolyLine) {
                render((SVG.PolyLine) svgObject);
            } else if (svgObject instanceof SVG.Text) {
                render((SVG.Text) svgObject);
            }
            statePop();
        }
    }

    private void renderChildren(SVG.SvgContainer svgContainer, boolean z) {
        if (z) {
            parentPush(svgContainer);
        }
        for (SVG.SvgObject render : svgContainer.getChildren()) {
            render(render);
        }
        if (z) {
            parentPop();
        }
    }

    private void statePush() {
        this.canvas.save();
        this.stateStack.push(this.state);
        this.state = new RendererState(this.state);
    }

    private void statePop() {
        this.canvas.restore();
        this.state = this.stateStack.pop();
    }

    private void parentPush(SVG.SvgContainer svgContainer) {
        this.parentStack.push(svgContainer);
        this.matrixStack.push(this.canvas.getMatrix());
    }

    private void parentPop() {
        this.parentStack.pop();
        this.matrixStack.pop();
    }

    private void updateStyleForElement(RendererState rendererState, SVG.SvgElementBase svgElementBase) {
        rendererState.style.resetNonInheritingProperties(svgElementBase.parent == null);
        if (svgElementBase.baseStyle != null) {
            updateStyle(rendererState, svgElementBase.baseStyle);
        }
        if (this.document.hasCSSRules()) {
            for (CSSParser.Rule next : this.document.getCSSRules()) {
                if (CSSParser.ruleMatch(this.ruleMatchContext, next.selector, svgElementBase)) {
                    updateStyle(rendererState, next.style);
                }
            }
        }
        if (svgElementBase.style != null) {
            updateStyle(rendererState, svgElementBase.style);
        }
    }

    private void checkXMLSpaceAttribute(SVG.SvgObject svgObject) {
        if (svgObject instanceof SVG.SvgElementBase) {
            SVG.SvgElementBase svgElementBase = (SVG.SvgElementBase) svgObject;
            if (svgElementBase.spacePreserve != null) {
                this.state.spacePreserve = svgElementBase.spacePreserve.booleanValue();
            }
        }
    }

    private void doFilledPath(SVG.SvgElement svgElement, Path path) {
        if (this.state.style.fill instanceof SVG.PaintReference) {
            SVG.SvgObject resolveIRI = this.document.resolveIRI(((SVG.PaintReference) this.state.style.fill).href);
            if (resolveIRI instanceof SVG.Pattern) {
                fillWithPattern(svgElement, path, (SVG.Pattern) resolveIRI);
                return;
            }
        }
        this.canvas.drawPath(path, this.state.fillPaint);
    }

    private void doStroke(Path path) {
        if (this.state.style.vectorEffect == SVG.Style.VectorEffect.NonScalingStroke) {
            Matrix matrix = this.canvas.getMatrix();
            Path path2 = new Path();
            path.transform(matrix, path2);
            this.canvas.setMatrix(new Matrix());
            Shader shader = this.state.strokePaint.getShader();
            Matrix matrix2 = new Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            this.canvas.drawPath(path2, this.state.strokePaint);
            this.canvas.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(matrix2);
                return;
            }
            return;
        }
        this.canvas.drawPath(path, this.state.strokePaint);
    }

    /* access modifiers changed from: private */
    public static void warn(String str, Object... objArr) {
        Log.w(TAG, String.format(str, objArr));
    }

    /* access modifiers changed from: private */
    public static void error(String str, Object... objArr) {
        Log.e(TAG, String.format(str, objArr));
    }

    private void render(SVG.Svg svg) {
        render(svg, makeViewPort(svg.f1240x, svg.f1241y, svg.width, svg.height), svg.viewBox, svg.preserveAspectRatio);
    }

    private void render(SVG.Svg svg, SVG.Box box) {
        render(svg, box, svg.viewBox, svg.preserveAspectRatio);
    }

    private void render(SVG.Svg svg, SVG.Box box, SVG.Box box2, PreserveAspectRatio preserveAspectRatio) {
        debug("Svg render", new Object[0]);
        if (box.width != 0.0f && box.height != 0.0f) {
            if (preserveAspectRatio == null) {
                preserveAspectRatio = svg.preserveAspectRatio != null ? svg.preserveAspectRatio : PreserveAspectRatio.LETTERBOX;
            }
            updateStyleForElement(this.state, svg);
            if (display()) {
                RendererState rendererState = this.state;
                rendererState.viewPort = box;
                if (!rendererState.style.overflow.booleanValue()) {
                    setClipRect(this.state.viewPort.minX, this.state.viewPort.minY, this.state.viewPort.width, this.state.viewPort.height);
                }
                checkForClipPath(svg, this.state.viewPort);
                if (box2 != null) {
                    this.canvas.concat(calculateViewBoxTransform(this.state.viewPort, box2, preserveAspectRatio));
                    this.state.viewBox = svg.viewBox;
                } else {
                    this.canvas.translate(this.state.viewPort.minX, this.state.viewPort.minY);
                }
                boolean pushLayer = pushLayer();
                viewportFill();
                renderChildren(svg, true);
                if (pushLayer) {
                    popLayer(svg);
                }
                updateParentBoundingBox(svg);
            }
        }
    }

    private SVG.Box makeViewPort(SVG.Length length, SVG.Length length2, SVG.Length length3, SVG.Length length4) {
        float f = 0.0f;
        float floatValueX = length != null ? length.floatValueX(this) : 0.0f;
        if (length2 != null) {
            f = length2.floatValueY(this);
        }
        SVG.Box currentViewPortInUserUnits = getCurrentViewPortInUserUnits();
        return new SVG.Box(floatValueX, f, length3 != null ? length3.floatValueX(this) : currentViewPortInUserUnits.width, length4 != null ? length4.floatValueY(this) : currentViewPortInUserUnits.height);
    }

    private void render(SVG.Group group) {
        debug("Group render", new Object[0]);
        updateStyleForElement(this.state, group);
        if (display()) {
            if (group.transform != null) {
                this.canvas.concat(group.transform);
            }
            checkForClipPath(group);
            boolean pushLayer = pushLayer();
            renderChildren(group, true);
            if (pushLayer) {
                popLayer(group);
            }
            updateParentBoundingBox(group);
        }
    }

    private void updateParentBoundingBox(SVG.SvgElement svgElement) {
        if (svgElement.parent != null && svgElement.boundingBox != null) {
            Matrix matrix = new Matrix();
            if (this.matrixStack.peek().invert(matrix)) {
                float[] fArr = {svgElement.boundingBox.minX, svgElement.boundingBox.minY, svgElement.boundingBox.maxX(), svgElement.boundingBox.minY, svgElement.boundingBox.maxX(), svgElement.boundingBox.maxY(), svgElement.boundingBox.minX, svgElement.boundingBox.maxY()};
                matrix.preConcat(this.canvas.getMatrix());
                matrix.mapPoints(fArr);
                RectF rectF = new RectF(fArr[0], fArr[1], fArr[0], fArr[1]);
                for (int i = 2; i <= 6; i += 2) {
                    if (fArr[i] < rectF.left) {
                        rectF.left = fArr[i];
                    }
                    if (fArr[i] > rectF.right) {
                        rectF.right = fArr[i];
                    }
                    int i2 = i + 1;
                    if (fArr[i2] < rectF.top) {
                        rectF.top = fArr[i2];
                    }
                    if (fArr[i2] > rectF.bottom) {
                        rectF.bottom = fArr[i2];
                    }
                }
                SVG.SvgElement svgElement2 = (SVG.SvgElement) this.parentStack.peek();
                if (svgElement2.boundingBox == null) {
                    svgElement2.boundingBox = SVG.Box.fromLimits(rectF.left, rectF.top, rectF.right, rectF.bottom);
                } else {
                    svgElement2.boundingBox.union(SVG.Box.fromLimits(rectF.left, rectF.top, rectF.right, rectF.bottom));
                }
            }
        }
    }

    private boolean pushLayer() {
        SVG.SvgObject resolveIRI;
        if (!requiresCompositing()) {
            return false;
        }
        this.canvas.saveLayerAlpha((RectF) null, clamp255(this.state.style.opacity.floatValue()), 31);
        this.stateStack.push(this.state);
        this.state = new RendererState(this.state);
        if (this.state.style.mask != null && ((resolveIRI = this.document.resolveIRI(this.state.style.mask)) == null || !(resolveIRI instanceof SVG.Mask))) {
            error("Mask reference '%s' not found", this.state.style.mask);
            this.state.style.mask = null;
        }
        return true;
    }

    private void popLayer(SVG.SvgElement svgElement) {
        if (this.state.style.mask != null) {
            Paint paint = new Paint();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            this.canvas.saveLayer((RectF) null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.canvas.saveLayer((RectF) null, paint2, 31);
            SVG.Mask mask = (SVG.Mask) this.document.resolveIRI(this.state.style.mask);
            renderMask(mask, svgElement);
            this.canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            this.canvas.saveLayer((RectF) null, paint3, 31);
            renderMask(mask, svgElement);
            this.canvas.restore();
            this.canvas.restore();
        }
        statePop();
    }

    private boolean requiresCompositing() {
        return this.state.style.opacity.floatValue() < 1.0f || this.state.style.mask != null;
    }

    private void render(SVG.Switch switchR) {
        debug("Switch render", new Object[0]);
        updateStyleForElement(this.state, switchR);
        if (display()) {
            if (switchR.transform != null) {
                this.canvas.concat(switchR.transform);
            }
            checkForClipPath(switchR);
            boolean pushLayer = pushLayer();
            renderSwitchChild(switchR);
            if (pushLayer) {
                popLayer(switchR);
            }
            updateParentBoundingBox(switchR);
        }
    }

    private void renderSwitchChild(SVG.Switch switchR) {
        Set<String> systemLanguage;
        String language = Locale.getDefault().getLanguage();
        SVGExternalFileResolver fileResolver = SVG.getFileResolver();
        for (SVG.SvgObject next : switchR.getChildren()) {
            if (next instanceof SVG.SvgConditional) {
                SVG.SvgConditional svgConditional = (SVG.SvgConditional) next;
                if (svgConditional.getRequiredExtensions() == null && ((systemLanguage = svgConditional.getSystemLanguage()) == null || (!systemLanguage.isEmpty() && systemLanguage.contains(language)))) {
                    Set<String> requiredFeatures = svgConditional.getRequiredFeatures();
                    if (requiredFeatures != null) {
                        if (supportedFeatures == null) {
                            initialiseSupportedFeaturesMap();
                        }
                        if (requiredFeatures.isEmpty()) {
                            continue;
                        } else if (!supportedFeatures.containsAll(requiredFeatures)) {
                            continue;
                        }
                    }
                    Set<String> requiredFormats = svgConditional.getRequiredFormats();
                    if (requiredFormats != null) {
                        if (!requiredFormats.isEmpty() && fileResolver != null) {
                            Iterator<String> it = requiredFormats.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (!fileResolver.isFormatSupported(it.next())) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                    Set<String> requiredFonts = svgConditional.getRequiredFonts();
                    if (requiredFonts != null) {
                        if (!requiredFonts.isEmpty() && fileResolver != null) {
                            for (String resolveFont : requiredFonts) {
                                if (fileResolver.resolveFont(resolveFont, this.state.style.fontWeight.intValue(), String.valueOf(this.state.style.fontStyle)) == null) {
                                }
                            }
                        }
                    }
                    render(next);
                    return;
                }
            }
        }
    }

    private static synchronized void initialiseSupportedFeaturesMap() {
        synchronized (SVGAndroidRenderer.class) {
            supportedFeatures = new HashSet<>();
            supportedFeatures.add("Structure");
            supportedFeatures.add("BasicStructure");
            supportedFeatures.add("ConditionalProcessing");
            supportedFeatures.add("Image");
            supportedFeatures.add("Style");
            supportedFeatures.add("ViewportAttribute");
            supportedFeatures.add("Shape");
            supportedFeatures.add("BasicText");
            supportedFeatures.add("PaintAttribute");
            supportedFeatures.add("BasicPaintAttribute");
            supportedFeatures.add("OpacityAttribute");
            supportedFeatures.add("BasicGraphicsAttribute");
            supportedFeatures.add("Marker");
            supportedFeatures.add("Gradient");
            supportedFeatures.add("Pattern");
            supportedFeatures.add("Clip");
            supportedFeatures.add("BasicClip");
            supportedFeatures.add("Mask");
            supportedFeatures.add("View");
        }
    }

    private void render(SVG.Use use) {
        debug("Use render", new Object[0]);
        if (use.width != null && use.width.isZero()) {
            return;
        }
        if (use.height == null || !use.height.isZero()) {
            updateStyleForElement(this.state, use);
            if (display()) {
                SVG.SvgObject resolveIRI = use.document.resolveIRI(use.href);
                if (resolveIRI == null) {
                    error("Use reference '%s' not found", use.href);
                    return;
                }
                if (use.transform != null) {
                    this.canvas.concat(use.transform);
                }
                float f = 0.0f;
                float floatValueX = use.f1264x != null ? use.f1264x.floatValueX(this) : 0.0f;
                if (use.f1265y != null) {
                    f = use.f1265y.floatValueY(this);
                }
                this.canvas.translate(floatValueX, f);
                checkForClipPath(use);
                boolean pushLayer = pushLayer();
                parentPush(use);
                if (resolveIRI instanceof SVG.Svg) {
                    SVG.Box makeViewPort = makeViewPort((SVG.Length) null, (SVG.Length) null, use.width, use.height);
                    statePush();
                    render((SVG.Svg) resolveIRI, makeViewPort);
                    statePop();
                } else if (resolveIRI instanceof SVG.Symbol) {
                    SVG.Box makeViewPort2 = makeViewPort((SVG.Length) null, (SVG.Length) null, use.width != null ? use.width : new SVG.Length(100.0f, SVG.Unit.percent), use.height != null ? use.height : new SVG.Length(100.0f, SVG.Unit.percent));
                    statePush();
                    render((SVG.Symbol) resolveIRI, makeViewPort2);
                    statePop();
                } else {
                    render(resolveIRI);
                }
                parentPop();
                if (pushLayer) {
                    popLayer(use);
                }
                updateParentBoundingBox(use);
            }
        }
    }

    private void render(SVG.Path path) {
        debug("Path render", new Object[0]);
        if (path.f1233d != null) {
            updateStyleForElement(this.state, path);
            if (!display() || !visible()) {
                return;
            }
            if (this.state.hasStroke || this.state.hasFill) {
                if (path.transform != null) {
                    this.canvas.concat(path.transform);
                }
                Path path2 = new PathConverter(path.f1233d).getPath();
                if (path.boundingBox == null) {
                    path.boundingBox = calculatePathBounds(path2);
                }
                updateParentBoundingBox(path);
                checkForGradientsAndPatterns(path);
                checkForClipPath(path);
                boolean pushLayer = pushLayer();
                if (this.state.hasFill) {
                    path2.setFillType(getFillTypeFromState());
                    doFilledPath(path, path2);
                }
                if (this.state.hasStroke) {
                    doStroke(path2);
                }
                renderMarkers(path);
                if (pushLayer) {
                    popLayer(path);
                }
            }
        }
    }

    private SVG.Box calculatePathBounds(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new SVG.Box(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private void render(SVG.Rect rect) {
        debug("Rect render", new Object[0]);
        if (rect.width != null && rect.height != null && !rect.width.isZero() && !rect.height.isZero()) {
            updateStyleForElement(this.state, rect);
            if (display() && visible()) {
                if (rect.transform != null) {
                    this.canvas.concat(rect.transform);
                }
                Path makePathAndBoundingBox = makePathAndBoundingBox(rect);
                updateParentBoundingBox(rect);
                checkForGradientsAndPatterns(rect);
                checkForClipPath(rect);
                boolean pushLayer = pushLayer();
                if (this.state.hasFill) {
                    doFilledPath(rect, makePathAndBoundingBox);
                }
                if (this.state.hasStroke) {
                    doStroke(makePathAndBoundingBox);
                }
                if (pushLayer) {
                    popLayer(rect);
                }
            }
        }
    }

    private void render(SVG.Circle circle) {
        debug("Circle render", new Object[0]);
        if (circle.f1220r != null && !circle.f1220r.isZero()) {
            updateStyleForElement(this.state, circle);
            if (display() && visible()) {
                if (circle.transform != null) {
                    this.canvas.concat(circle.transform);
                }
                Path makePathAndBoundingBox = makePathAndBoundingBox(circle);
                updateParentBoundingBox(circle);
                checkForGradientsAndPatterns(circle);
                checkForClipPath(circle);
                boolean pushLayer = pushLayer();
                if (this.state.hasFill) {
                    doFilledPath(circle, makePathAndBoundingBox);
                }
                if (this.state.hasStroke) {
                    doStroke(makePathAndBoundingBox);
                }
                if (pushLayer) {
                    popLayer(circle);
                }
            }
        }
    }

    private void render(SVG.Ellipse ellipse) {
        debug("Ellipse render", new Object[0]);
        if (ellipse.f1223rx != null && ellipse.f1224ry != null && !ellipse.f1223rx.isZero() && !ellipse.f1224ry.isZero()) {
            updateStyleForElement(this.state, ellipse);
            if (display() && visible()) {
                if (ellipse.transform != null) {
                    this.canvas.concat(ellipse.transform);
                }
                Path makePathAndBoundingBox = makePathAndBoundingBox(ellipse);
                updateParentBoundingBox(ellipse);
                checkForGradientsAndPatterns(ellipse);
                checkForClipPath(ellipse);
                boolean pushLayer = pushLayer();
                if (this.state.hasFill) {
                    doFilledPath(ellipse, makePathAndBoundingBox);
                }
                if (this.state.hasStroke) {
                    doStroke(makePathAndBoundingBox);
                }
                if (pushLayer) {
                    popLayer(ellipse);
                }
            }
        }
    }

    private void render(SVG.Line line) {
        debug("Line render", new Object[0]);
        updateStyleForElement(this.state, line);
        if (display() && visible() && this.state.hasStroke) {
            if (line.transform != null) {
                this.canvas.concat(line.transform);
            }
            Path makePathAndBoundingBox = makePathAndBoundingBox(line);
            updateParentBoundingBox(line);
            checkForGradientsAndPatterns(line);
            checkForClipPath(line);
            boolean pushLayer = pushLayer();
            doStroke(makePathAndBoundingBox);
            renderMarkers(line);
            if (pushLayer) {
                popLayer(line);
            }
        }
    }

    private List<MarkerVector> calculateMarkerPositions(SVG.Line line) {
        float floatValueX = line.f1227x1 != null ? line.f1227x1.floatValueX(this) : 0.0f;
        float floatValueY = line.f1229y1 != null ? line.f1229y1.floatValueY(this) : 0.0f;
        float floatValueX2 = line.f1228x2 != null ? line.f1228x2.floatValueX(this) : 0.0f;
        float floatValueY2 = line.f1230y2 != null ? line.f1230y2.floatValueY(this) : 0.0f;
        ArrayList arrayList = new ArrayList(2);
        float f = floatValueX2 - floatValueX;
        float f2 = floatValueY2 - floatValueY;
        arrayList.add(new MarkerVector(floatValueX, floatValueY, f, f2));
        arrayList.add(new MarkerVector(floatValueX2, floatValueY2, f, f2));
        return arrayList;
    }

    private void render(SVG.PolyLine polyLine) {
        debug("PolyLine render", new Object[0]);
        updateStyleForElement(this.state, polyLine);
        if (!display() || !visible()) {
            return;
        }
        if (this.state.hasStroke || this.state.hasFill) {
            if (polyLine.transform != null) {
                this.canvas.concat(polyLine.transform);
            }
            if (polyLine.points.length >= 2) {
                Path makePathAndBoundingBox = makePathAndBoundingBox(polyLine);
                updateParentBoundingBox(polyLine);
                makePathAndBoundingBox.setFillType(getFillTypeFromState());
                checkForGradientsAndPatterns(polyLine);
                checkForClipPath(polyLine);
                boolean pushLayer = pushLayer();
                if (this.state.hasFill) {
                    doFilledPath(polyLine, makePathAndBoundingBox);
                }
                if (this.state.hasStroke) {
                    doStroke(makePathAndBoundingBox);
                }
                renderMarkers(polyLine);
                if (pushLayer) {
                    popLayer(polyLine);
                }
            }
        }
    }

    private List<MarkerVector> calculateMarkerPositions(SVG.PolyLine polyLine) {
        SVG.PolyLine polyLine2 = polyLine;
        int length = polyLine2.points.length;
        int i = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        MarkerVector markerVector = new MarkerVector(polyLine2.points[0], polyLine2.points[1], 0.0f, 0.0f);
        float f = 0.0f;
        float f2 = 0.0f;
        while (i < length) {
            f = polyLine2.points[i];
            f2 = polyLine2.points[i + 1];
            markerVector.add(f, f2);
            arrayList.add(markerVector);
            i += 2;
            markerVector = new MarkerVector(f, f2, f - markerVector.f1268x, f2 - markerVector.f1269y);
        }
        if (!(polyLine2 instanceof SVG.Polygon)) {
            arrayList.add(markerVector);
        } else if (!(f == polyLine2.points[0] || f2 == polyLine2.points[1])) {
            float f3 = polyLine2.points[0];
            float f4 = polyLine2.points[1];
            markerVector.add(f3, f4);
            arrayList.add(markerVector);
            MarkerVector markerVector2 = new MarkerVector(f3, f4, f3 - markerVector.f1268x, f4 - markerVector.f1269y);
            markerVector2.add((MarkerVector) arrayList.get(0));
            arrayList.add(markerVector2);
            arrayList.set(0, markerVector2);
        }
        return arrayList;
    }

    private void render(SVG.Polygon polygon) {
        debug("Polygon render", new Object[0]);
        updateStyleForElement(this.state, polygon);
        if (!display() || !visible()) {
            return;
        }
        if (this.state.hasStroke || this.state.hasFill) {
            if (polygon.transform != null) {
                this.canvas.concat(polygon.transform);
            }
            if (polygon.points.length >= 2) {
                Path makePathAndBoundingBox = makePathAndBoundingBox((SVG.PolyLine) polygon);
                updateParentBoundingBox(polygon);
                checkForGradientsAndPatterns(polygon);
                checkForClipPath(polygon);
                boolean pushLayer = pushLayer();
                if (this.state.hasFill) {
                    doFilledPath(polygon, makePathAndBoundingBox);
                }
                if (this.state.hasStroke) {
                    doStroke(makePathAndBoundingBox);
                }
                renderMarkers(polygon);
                if (pushLayer) {
                    popLayer(polygon);
                }
            }
        }
    }

    private void render(SVG.Text text) {
        debug("Text render", new Object[0]);
        updateStyleForElement(this.state, text);
        if (display()) {
            if (text.transform != null) {
                this.canvas.concat(text.transform);
            }
            float f = 0.0f;
            float floatValueX = (text.f1254x == null || text.f1254x.size() == 0) ? 0.0f : ((SVG.Length) text.f1254x.get(0)).floatValueX(this);
            float floatValueY = (text.f1255y == null || text.f1255y.size() == 0) ? 0.0f : ((SVG.Length) text.f1255y.get(0)).floatValueY(this);
            float floatValueX2 = (text.f1252dx == null || text.f1252dx.size() == 0) ? 0.0f : ((SVG.Length) text.f1252dx.get(0)).floatValueX(this);
            if (!(text.f1253dy == null || text.f1253dy.size() == 0)) {
                f = ((SVG.Length) text.f1253dy.get(0)).floatValueY(this);
            }
            SVG.Style.TextAnchor anchorPosition = getAnchorPosition();
            if (anchorPosition != SVG.Style.TextAnchor.Start) {
                float calculateTextWidth = calculateTextWidth(text);
                if (anchorPosition == SVG.Style.TextAnchor.Middle) {
                    calculateTextWidth /= 2.0f;
                }
                floatValueX -= calculateTextWidth;
            }
            if (text.boundingBox == null) {
                TextBoundsCalculator textBoundsCalculator = new TextBoundsCalculator(floatValueX, floatValueY);
                enumerateTextSpans(text, textBoundsCalculator);
                text.boundingBox = new SVG.Box(textBoundsCalculator.bbox.left, textBoundsCalculator.bbox.top, textBoundsCalculator.bbox.width(), textBoundsCalculator.bbox.height());
            }
            updateParentBoundingBox(text);
            checkForGradientsAndPatterns(text);
            checkForClipPath(text);
            boolean pushLayer = pushLayer();
            enumerateTextSpans(text, new PlainTextDrawer(floatValueX + floatValueX2, floatValueY + f));
            if (pushLayer) {
                popLayer(text);
            }
        }
    }

    private SVG.Style.TextAnchor getAnchorPosition() {
        if (this.state.style.direction == SVG.Style.TextDirection.LTR || this.state.style.textAnchor == SVG.Style.TextAnchor.Middle) {
            return this.state.style.textAnchor;
        }
        return this.state.style.textAnchor == SVG.Style.TextAnchor.Start ? SVG.Style.TextAnchor.End : SVG.Style.TextAnchor.Start;
    }

    private class PlainTextDrawer extends TextProcessor {

        /* renamed from: x */
        float f1270x;

        /* renamed from: y */
        float f1271y;

        PlainTextDrawer(float f, float f2) {
            super(SVGAndroidRenderer.this, (C11771) null);
            this.f1270x = f;
            this.f1271y = f2;
        }

        public void processText(String str) {
            SVGAndroidRenderer.debug("TextSequence render", new Object[0]);
            if (SVGAndroidRenderer.this.visible()) {
                if (SVGAndroidRenderer.this.state.hasFill) {
                    SVGAndroidRenderer.this.canvas.drawText(str, this.f1270x, this.f1271y, SVGAndroidRenderer.this.state.fillPaint);
                }
                if (SVGAndroidRenderer.this.state.hasStroke) {
                    SVGAndroidRenderer.this.canvas.drawText(str, this.f1270x, this.f1271y, SVGAndroidRenderer.this.state.strokePaint);
                }
            }
            this.f1270x += SVGAndroidRenderer.this.state.fillPaint.measureText(str);
        }
    }

    private abstract class TextProcessor {
        public boolean doTextContainer(SVG.TextContainer textContainer) {
            return true;
        }

        public abstract void processText(String str);

        private TextProcessor() {
        }

        /* synthetic */ TextProcessor(SVGAndroidRenderer sVGAndroidRenderer, C11771 r2) {
            this();
        }
    }

    private void enumerateTextSpans(SVG.TextContainer textContainer, TextProcessor textProcessor) {
        if (display()) {
            Iterator it = textContainer.children.iterator();
            boolean z = true;
            while (it.hasNext()) {
                SVG.SvgObject svgObject = (SVG.SvgObject) it.next();
                if (svgObject instanceof SVG.TextSequence) {
                    textProcessor.processText(textXMLSpaceTransform(((SVG.TextSequence) svgObject).text, z, !it.hasNext()));
                } else {
                    processTextChild(svgObject, textProcessor);
                }
                z = false;
            }
        }
    }

    private void processTextChild(SVG.SvgObject svgObject, TextProcessor textProcessor) {
        float f;
        float f2;
        float f3;
        SVG.Style.TextAnchor anchorPosition;
        if (textProcessor.doTextContainer((SVG.TextContainer) svgObject)) {
            if (svgObject instanceof SVG.TextPath) {
                statePush();
                renderTextPath((SVG.TextPath) svgObject);
                statePop();
                return;
            }
            boolean z = true;
            if (svgObject instanceof SVG.TSpan) {
                debug("TSpan render", new Object[0]);
                statePush();
                SVG.TSpan tSpan = (SVG.TSpan) svgObject;
                updateStyleForElement(this.state, tSpan);
                if (display()) {
                    if (tSpan.f1254x == null || tSpan.f1254x.size() <= 0) {
                        z = false;
                    }
                    boolean z2 = textProcessor instanceof PlainTextDrawer;
                    float f4 = 0.0f;
                    if (z2) {
                        float floatValueX = !z ? ((PlainTextDrawer) textProcessor).f1270x : ((SVG.Length) tSpan.f1254x.get(0)).floatValueX(this);
                        f2 = (tSpan.f1255y == null || tSpan.f1255y.size() == 0) ? ((PlainTextDrawer) textProcessor).f1271y : ((SVG.Length) tSpan.f1255y.get(0)).floatValueY(this);
                        f = (tSpan.f1252dx == null || tSpan.f1252dx.size() == 0) ? 0.0f : ((SVG.Length) tSpan.f1252dx.get(0)).floatValueX(this);
                        if (!(tSpan.f1253dy == null || tSpan.f1253dy.size() == 0)) {
                            f4 = ((SVG.Length) tSpan.f1253dy.get(0)).floatValueY(this);
                        }
                        f3 = f4;
                        f4 = floatValueX;
                    } else {
                        f3 = 0.0f;
                        f2 = 0.0f;
                        f = 0.0f;
                    }
                    if (z && (anchorPosition = getAnchorPosition()) != SVG.Style.TextAnchor.Start) {
                        float calculateTextWidth = calculateTextWidth(tSpan);
                        if (anchorPosition == SVG.Style.TextAnchor.Middle) {
                            calculateTextWidth /= 2.0f;
                        }
                        f4 -= calculateTextWidth;
                    }
                    checkForGradientsAndPatterns((SVG.SvgElement) tSpan.getTextRoot());
                    if (z2) {
                        PlainTextDrawer plainTextDrawer = (PlainTextDrawer) textProcessor;
                        plainTextDrawer.f1270x = f4 + f;
                        plainTextDrawer.f1271y = f2 + f3;
                    }
                    boolean pushLayer = pushLayer();
                    enumerateTextSpans(tSpan, textProcessor);
                    if (pushLayer) {
                        popLayer(tSpan);
                    }
                }
                statePop();
            } else if (svgObject instanceof SVG.TRef) {
                statePush();
                SVG.TRef tRef = (SVG.TRef) svgObject;
                updateStyleForElement(this.state, tRef);
                if (display()) {
                    checkForGradientsAndPatterns((SVG.SvgElement) tRef.getTextRoot());
                    SVG.SvgObject resolveIRI = svgObject.document.resolveIRI(tRef.href);
                    if (resolveIRI == null || !(resolveIRI instanceof SVG.TextContainer)) {
                        error("Tref reference '%s' not found", tRef.href);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        extractRawText((SVG.TextContainer) resolveIRI, sb);
                        if (sb.length() > 0) {
                            textProcessor.processText(sb.toString());
                        }
                    }
                }
                statePop();
            }
        }
    }

    private void renderTextPath(SVG.TextPath textPath) {
        debug("TextPath render", new Object[0]);
        updateStyleForElement(this.state, textPath);
        if (display() && visible()) {
            SVG.SvgObject resolveIRI = textPath.document.resolveIRI(textPath.href);
            if (resolveIRI == null) {
                error("TextPath reference '%s' not found", textPath.href);
                return;
            }
            SVG.Path path = (SVG.Path) resolveIRI;
            Path path2 = new PathConverter(path.f1233d).getPath();
            if (path.transform != null) {
                path2.transform(path.transform);
            }
            float floatValue = textPath.startOffset != null ? textPath.startOffset.floatValue(this, new PathMeasure(path2, false).getLength()) : 0.0f;
            SVG.Style.TextAnchor anchorPosition = getAnchorPosition();
            if (anchorPosition != SVG.Style.TextAnchor.Start) {
                float calculateTextWidth = calculateTextWidth(textPath);
                if (anchorPosition == SVG.Style.TextAnchor.Middle) {
                    calculateTextWidth /= 2.0f;
                }
                floatValue -= calculateTextWidth;
            }
            checkForGradientsAndPatterns((SVG.SvgElement) textPath.getTextRoot());
            boolean pushLayer = pushLayer();
            enumerateTextSpans(textPath, new PathTextDrawer(path2, floatValue, 0.0f));
            if (pushLayer) {
                popLayer(textPath);
            }
        }
    }

    private class PathTextDrawer extends PlainTextDrawer {
        private Path path;

        PathTextDrawer(Path path2, float f, float f2) {
            super(f, f2);
            this.path = path2;
        }

        public void processText(String str) {
            if (SVGAndroidRenderer.this.visible()) {
                if (SVGAndroidRenderer.this.state.hasFill) {
                    SVGAndroidRenderer.this.canvas.drawTextOnPath(str, this.path, this.f1270x, this.f1271y, SVGAndroidRenderer.this.state.fillPaint);
                }
                if (SVGAndroidRenderer.this.state.hasStroke) {
                    SVGAndroidRenderer.this.canvas.drawTextOnPath(str, this.path, this.f1270x, this.f1271y, SVGAndroidRenderer.this.state.strokePaint);
                }
            }
            this.f1270x += SVGAndroidRenderer.this.state.fillPaint.measureText(str);
        }
    }

    private float calculateTextWidth(SVG.TextContainer textContainer) {
        TextWidthCalculator textWidthCalculator = new TextWidthCalculator(this, (C11771) null);
        enumerateTextSpans(textContainer, textWidthCalculator);
        return textWidthCalculator.f1276x;
    }

    private class TextWidthCalculator extends TextProcessor {

        /* renamed from: x */
        float f1276x;

        private TextWidthCalculator() {
            super(SVGAndroidRenderer.this, (C11771) null);
            this.f1276x = 0.0f;
        }

        /* synthetic */ TextWidthCalculator(SVGAndroidRenderer sVGAndroidRenderer, C11771 r2) {
            this();
        }

        public void processText(String str) {
            this.f1276x += SVGAndroidRenderer.this.state.fillPaint.measureText(str);
        }
    }

    private class TextBoundsCalculator extends TextProcessor {
        RectF bbox = new RectF();

        /* renamed from: x */
        float f1274x;

        /* renamed from: y */
        float f1275y;

        TextBoundsCalculator(float f, float f2) {
            super(SVGAndroidRenderer.this, (C11771) null);
            this.f1274x = f;
            this.f1275y = f2;
        }

        public boolean doTextContainer(SVG.TextContainer textContainer) {
            if (!(textContainer instanceof SVG.TextPath)) {
                return true;
            }
            SVG.TextPath textPath = (SVG.TextPath) textContainer;
            SVG.SvgObject resolveIRI = textContainer.document.resolveIRI(textPath.href);
            if (resolveIRI == null) {
                SVGAndroidRenderer.error("TextPath path reference '%s' not found", textPath.href);
                return false;
            }
            SVG.Path path = (SVG.Path) resolveIRI;
            Path path2 = new PathConverter(path.f1233d).getPath();
            if (path.transform != null) {
                path2.transform(path.transform);
            }
            RectF rectF = new RectF();
            path2.computeBounds(rectF, true);
            this.bbox.union(rectF);
            return false;
        }

        public void processText(String str) {
            if (SVGAndroidRenderer.this.visible()) {
                Rect rect = new Rect();
                SVGAndroidRenderer.this.state.fillPaint.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f1274x, this.f1275y);
                this.bbox.union(rectF);
            }
            this.f1274x += SVGAndroidRenderer.this.state.fillPaint.measureText(str);
        }
    }

    private void extractRawText(SVG.TextContainer textContainer, StringBuilder sb) {
        Iterator it = textContainer.children.iterator();
        boolean z = true;
        while (it.hasNext()) {
            SVG.SvgObject svgObject = (SVG.SvgObject) it.next();
            if (svgObject instanceof SVG.TextContainer) {
                extractRawText((SVG.TextContainer) svgObject, sb);
            } else if (svgObject instanceof SVG.TextSequence) {
                sb.append(textXMLSpaceTransform(((SVG.TextSequence) svgObject).text, z, !it.hasNext()));
            }
            z = false;
        }
    }

    private String textXMLSpaceTransform(String str, boolean z, boolean z2) {
        if (this.state.spacePreserve) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String replaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            replaceAll = replaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            replaceAll = replaceAll.replaceAll("\\s+$", "");
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    private void render(SVG.Symbol symbol, SVG.Box box) {
        debug("Symbol render", new Object[0]);
        if (box.width != 0.0f && box.height != 0.0f) {
            PreserveAspectRatio preserveAspectRatio = symbol.preserveAspectRatio != null ? symbol.preserveAspectRatio : PreserveAspectRatio.LETTERBOX;
            updateStyleForElement(this.state, symbol);
            RendererState rendererState = this.state;
            rendererState.viewPort = box;
            if (!rendererState.style.overflow.booleanValue()) {
                setClipRect(this.state.viewPort.minX, this.state.viewPort.minY, this.state.viewPort.width, this.state.viewPort.height);
            }
            if (symbol.viewBox != null) {
                this.canvas.concat(calculateViewBoxTransform(this.state.viewPort, symbol.viewBox, preserveAspectRatio));
                this.state.viewBox = symbol.viewBox;
            } else {
                this.canvas.translate(this.state.viewPort.minX, this.state.viewPort.minY);
            }
            boolean pushLayer = pushLayer();
            renderChildren(symbol, true);
            if (pushLayer) {
                popLayer(symbol);
            }
            updateParentBoundingBox(symbol);
        }
    }

    private void render(SVG.C1176Image image) {
        int i = 0;
        debug("Image render", new Object[0]);
        if (image.width != null && !image.width.isZero() && image.height != null && !image.height.isZero() && image.href != null) {
            PreserveAspectRatio preserveAspectRatio = image.preserveAspectRatio != null ? image.preserveAspectRatio : PreserveAspectRatio.LETTERBOX;
            Bitmap checkForImageDataURL = checkForImageDataURL(image.href);
            if (checkForImageDataURL == null) {
                SVGExternalFileResolver fileResolver = SVG.getFileResolver();
                if (fileResolver != null) {
                    checkForImageDataURL = fileResolver.resolveImage(image.href);
                } else {
                    return;
                }
            }
            if (checkForImageDataURL == null) {
                error("Could not locate image '%s'", image.href);
                return;
            }
            SVG.Box box = new SVG.Box(0.0f, 0.0f, (float) checkForImageDataURL.getWidth(), (float) checkForImageDataURL.getHeight());
            updateStyleForElement(this.state, image);
            if (display() && visible()) {
                if (image.transform != null) {
                    this.canvas.concat(image.transform);
                }
                this.state.viewPort = new SVG.Box(image.f1225x != null ? image.f1225x.floatValueX(this) : 0.0f, image.f1226y != null ? image.f1226y.floatValueY(this) : 0.0f, image.width.floatValueX(this), image.height.floatValueX(this));
                if (!this.state.style.overflow.booleanValue()) {
                    setClipRect(this.state.viewPort.minX, this.state.viewPort.minY, this.state.viewPort.width, this.state.viewPort.height);
                }
                image.boundingBox = this.state.viewPort;
                updateParentBoundingBox(image);
                checkForClipPath(image);
                boolean pushLayer = pushLayer();
                viewportFill();
                this.canvas.save();
                this.canvas.concat(calculateViewBoxTransform(this.state.viewPort, box, preserveAspectRatio));
                if (this.state.style.imageRendering != SVG.Style.RenderQuality.optimizeSpeed) {
                    i = 2;
                }
                this.canvas.drawBitmap(checkForImageDataURL, 0.0f, 0.0f, new Paint(i));
                this.canvas.restore();
                if (pushLayer) {
                    popLayer(image);
                }
            }
        }
    }

    private Bitmap checkForImageDataURL(String str) {
        int indexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (indexOf = str.indexOf(44)) == -1 || indexOf < 12 || !";base64".equals(str.substring(indexOf - 7, indexOf))) {
            return null;
        }
        byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    private boolean display() {
        if (this.state.style.display != null) {
            return this.state.style.display.booleanValue();
        }
        return true;
    }

    /* access modifiers changed from: private */
    public boolean visible() {
        if (this.state.style.visibility != null) {
            return this.state.style.visibility.booleanValue();
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0066, code lost:
        r3 = r3 - r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
        if (r11 != 8) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Matrix calculateViewBoxTransform(com.caverock.androidsvg.SVG.Box r9, com.caverock.androidsvg.SVG.Box r10, com.caverock.androidsvg.PreserveAspectRatio r11) {
        /*
            r8 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r11 == 0) goto L_0x009d
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = r11.getAlignment()
            if (r1 != 0) goto L_0x000f
            goto L_0x009d
        L_0x000f:
            float r1 = r9.width
            float r2 = r10.width
            float r1 = r1 / r2
            float r2 = r9.height
            float r3 = r10.height
            float r2 = r2 / r3
            float r3 = r10.minX
            float r3 = -r3
            float r4 = r10.minY
            float r4 = -r4
            com.caverock.androidsvg.PreserveAspectRatio r5 = com.caverock.androidsvg.PreserveAspectRatio.STRETCH
            boolean r5 = r11.equals(r5)
            if (r5 == 0) goto L_0x0035
            float r10 = r9.minX
            float r9 = r9.minY
            r0.preTranslate(r10, r9)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
            return r0
        L_0x0035:
            com.caverock.androidsvg.PreserveAspectRatio$Scale r5 = r11.getScale()
            com.caverock.androidsvg.PreserveAspectRatio$Scale r6 = com.caverock.androidsvg.PreserveAspectRatio.Scale.slice
            if (r5 != r6) goto L_0x0042
            float r1 = java.lang.Math.max(r1, r2)
            goto L_0x0046
        L_0x0042:
            float r1 = java.lang.Math.min(r1, r2)
        L_0x0046:
            float r2 = r9.width
            float r2 = r2 / r1
            float r5 = r9.height
            float r5 = r5 / r1
            int[] r6 = com.caverock.androidsvg.SVGAndroidRenderer.C11771.$SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r7 = r11.getAlignment()
            int r7 = r7.ordinal()
            r6 = r6[r7]
            r7 = 1073741824(0x40000000, float:2.0)
            switch(r6) {
                case 1: goto L_0x0062;
                case 2: goto L_0x0062;
                case 3: goto L_0x0062;
                case 4: goto L_0x005e;
                case 5: goto L_0x005e;
                case 6: goto L_0x005e;
                default: goto L_0x005d;
            }
        L_0x005d:
            goto L_0x0067
        L_0x005e:
            float r6 = r10.width
            float r6 = r6 - r2
            goto L_0x0066
        L_0x0062:
            float r6 = r10.width
            float r6 = r6 - r2
            float r6 = r6 / r7
        L_0x0066:
            float r3 = r3 - r6
        L_0x0067:
            int[] r2 = com.caverock.androidsvg.SVGAndroidRenderer.C11771.$SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r11 = r11.getAlignment()
            int r11 = r11.ordinal()
            r11 = r2[r11]
            r2 = 2
            if (r11 == r2) goto L_0x008b
            r2 = 3
            if (r11 == r2) goto L_0x0087
            r2 = 5
            if (r11 == r2) goto L_0x008b
            r2 = 6
            if (r11 == r2) goto L_0x0087
            r2 = 7
            if (r11 == r2) goto L_0x008b
            r2 = 8
            if (r11 == r2) goto L_0x0087
            goto L_0x0090
        L_0x0087:
            float r10 = r10.height
            float r10 = r10 - r5
            goto L_0x008f
        L_0x008b:
            float r10 = r10.height
            float r10 = r10 - r5
            float r10 = r10 / r7
        L_0x008f:
            float r4 = r4 - r10
        L_0x0090:
            float r10 = r9.minX
            float r9 = r9.minY
            r0.preTranslate(r10, r9)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
        L_0x009d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGAndroidRenderer.calculateViewBoxTransform(com.caverock.androidsvg.SVG$Box, com.caverock.androidsvg.SVG$Box, com.caverock.androidsvg.PreserveAspectRatio):android.graphics.Matrix");
    }

    private boolean isSpecified(SVG.Style style, long j) {
        return (style.specifiedFlags & j) != 0;
    }

    private void updateStyle(RendererState rendererState, SVG.Style style) {
        if (isSpecified(style, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)) {
            rendererState.style.color = style.color;
        }
        if (isSpecified(style, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH)) {
            rendererState.style.opacity = style.opacity;
        }
        boolean z = false;
        if (isSpecified(style, 1)) {
            rendererState.style.fill = style.fill;
            rendererState.hasFill = (style.fill == null || style.fill == SVG.Colour.TRANSPARENT) ? false : true;
        }
        if (isSpecified(style, 4)) {
            rendererState.style.fillOpacity = style.fillOpacity;
        }
        if (isSpecified(style, 6149)) {
            setPaintColour(rendererState, true, rendererState.style.fill);
        }
        if (isSpecified(style, 2)) {
            rendererState.style.fillRule = style.fillRule;
        }
        if (isSpecified(style, 8)) {
            rendererState.style.stroke = style.stroke;
            rendererState.hasStroke = (style.stroke == null || style.stroke == SVG.Colour.TRANSPARENT) ? false : true;
        }
        if (isSpecified(style, 16)) {
            rendererState.style.strokeOpacity = style.strokeOpacity;
        }
        if (isSpecified(style, 6168)) {
            setPaintColour(rendererState, false, rendererState.style.stroke);
        }
        if (isSpecified(style, 34359738368L)) {
            rendererState.style.vectorEffect = style.vectorEffect;
        }
        if (isSpecified(style, 32)) {
            rendererState.style.strokeWidth = style.strokeWidth;
            rendererState.strokePaint.setStrokeWidth(rendererState.style.strokeWidth.floatValue(this));
        }
        if (isSpecified(style, 64)) {
            rendererState.style.strokeLineCap = style.strokeLineCap;
            int i = C11771.$SwitchMap$com$caverock$androidsvg$SVG$Style$LineCap[style.strokeLineCap.ordinal()];
            if (i == 1) {
                rendererState.strokePaint.setStrokeCap(Paint.Cap.BUTT);
            } else if (i == 2) {
                rendererState.strokePaint.setStrokeCap(Paint.Cap.ROUND);
            } else if (i == 3) {
                rendererState.strokePaint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (isSpecified(style, 128)) {
            rendererState.style.strokeLineJoin = style.strokeLineJoin;
            int i2 = C11771.$SwitchMap$com$caverock$androidsvg$SVG$Style$LineJoin[style.strokeLineJoin.ordinal()];
            if (i2 == 1) {
                rendererState.strokePaint.setStrokeJoin(Paint.Join.MITER);
            } else if (i2 == 2) {
                rendererState.strokePaint.setStrokeJoin(Paint.Join.ROUND);
            } else if (i2 == 3) {
                rendererState.strokePaint.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (isSpecified(style, 256)) {
            rendererState.style.strokeMiterLimit = style.strokeMiterLimit;
            rendererState.strokePaint.setStrokeMiter(style.strokeMiterLimit.floatValue());
        }
        if (isSpecified(style, 512)) {
            rendererState.style.strokeDashArray = style.strokeDashArray;
        }
        if (isSpecified(style, PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID)) {
            rendererState.style.strokeDashOffset = style.strokeDashOffset;
        }
        Typeface typeface = null;
        if (isSpecified(style, 1536)) {
            if (rendererState.style.strokeDashArray == null) {
                rendererState.strokePaint.setPathEffect((PathEffect) null);
            } else {
                int length = rendererState.style.strokeDashArray.length;
                int i3 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i3];
                float f = 0.0f;
                for (int i4 = 0; i4 < i3; i4++) {
                    fArr[i4] = rendererState.style.strokeDashArray[i4 % length].floatValue(this);
                    f += fArr[i4];
                }
                if (f == 0.0f) {
                    rendererState.strokePaint.setPathEffect((PathEffect) null);
                } else {
                    float floatValue = rendererState.style.strokeDashOffset.floatValue(this);
                    if (floatValue < 0.0f) {
                        floatValue = (floatValue % f) + f;
                    }
                    rendererState.strokePaint.setPathEffect(new DashPathEffect(fArr, floatValue));
                }
            }
        }
        if (isSpecified(style, 16384)) {
            float currentFontSize = getCurrentFontSize();
            rendererState.style.fontSize = style.fontSize;
            rendererState.fillPaint.setTextSize(style.fontSize.floatValue(this, currentFontSize));
            rendererState.strokePaint.setTextSize(style.fontSize.floatValue(this, currentFontSize));
        }
        if (isSpecified(style, PlaybackStateCompat.ACTION_PLAY_FROM_URI)) {
            rendererState.style.fontFamily = style.fontFamily;
        }
        if (isSpecified(style, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
            if (style.fontWeight.intValue() == -1 && rendererState.style.fontWeight.intValue() > 100) {
                SVG.Style style2 = rendererState.style;
                style2.fontWeight = Integer.valueOf(style2.fontWeight.intValue() - 100);
            } else if (style.fontWeight.intValue() != 1 || rendererState.style.fontWeight.intValue() >= 900) {
                rendererState.style.fontWeight = style.fontWeight;
            } else {
                SVG.Style style3 = rendererState.style;
                style3.fontWeight = Integer.valueOf(style3.fontWeight.intValue() + 100);
            }
        }
        if (isSpecified(style, 65536)) {
            rendererState.style.fontStyle = style.fontStyle;
        }
        if (isSpecified(style, 106496)) {
            if (rendererState.style.fontFamily != null && this.document != null) {
                SVGExternalFileResolver fileResolver = SVG.getFileResolver();
                for (String next : rendererState.style.fontFamily) {
                    Typeface checkGenericFont = checkGenericFont(next, rendererState.style.fontWeight, rendererState.style.fontStyle);
                    if (checkGenericFont != null || fileResolver == null) {
                        typeface = checkGenericFont;
                        continue;
                    } else {
                        typeface = fileResolver.resolveFont(next, rendererState.style.fontWeight.intValue(), String.valueOf(rendererState.style.fontStyle));
                        continue;
                    }
                    if (typeface != null) {
                        break;
                    }
                }
            }
            if (typeface == null) {
                typeface = checkGenericFont(DEFAULT_FONT_FAMILY, rendererState.style.fontWeight, rendererState.style.fontStyle);
            }
            rendererState.fillPaint.setTypeface(typeface);
            rendererState.strokePaint.setTypeface(typeface);
        }
        if (isSpecified(style, PlaybackStateCompat.ACTION_PREPARE_FROM_URI)) {
            rendererState.style.textDecoration = style.textDecoration;
            rendererState.fillPaint.setStrikeThruText(style.textDecoration == SVG.Style.TextDecoration.LineThrough);
            rendererState.fillPaint.setUnderlineText(style.textDecoration == SVG.Style.TextDecoration.Underline);
            if (Build.VERSION.SDK_INT >= 17) {
                rendererState.strokePaint.setStrikeThruText(style.textDecoration == SVG.Style.TextDecoration.LineThrough);
                Paint paint = rendererState.strokePaint;
                if (style.textDecoration == SVG.Style.TextDecoration.Underline) {
                    z = true;
                }
                paint.setUnderlineText(z);
            }
        }
        if (isSpecified(style, 68719476736L)) {
            rendererState.style.direction = style.direction;
        }
        if (isSpecified(style, PlaybackStateCompat.ACTION_SET_REPEAT_MODE)) {
            rendererState.style.textAnchor = style.textAnchor;
        }
        if (isSpecified(style, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED)) {
            rendererState.style.overflow = style.overflow;
        }
        if (isSpecified(style, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE)) {
            rendererState.style.markerStart = style.markerStart;
        }
        if (isSpecified(style, 4194304)) {
            rendererState.style.markerMid = style.markerMid;
        }
        if (isSpecified(style, 8388608)) {
            rendererState.style.markerEnd = style.markerEnd;
        }
        if (isSpecified(style, 16777216)) {
            rendererState.style.display = style.display;
        }
        if (isSpecified(style, 33554432)) {
            rendererState.style.visibility = style.visibility;
        }
        if (isSpecified(style, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
            rendererState.style.clip = style.clip;
        }
        if (isSpecified(style, 268435456)) {
            rendererState.style.clipPath = style.clipPath;
        }
        if (isSpecified(style, 536870912)) {
            rendererState.style.clipRule = style.clipRule;
        }
        if (isSpecified(style, 1073741824)) {
            rendererState.style.mask = style.mask;
        }
        if (isSpecified(style, 67108864)) {
            rendererState.style.stopColor = style.stopColor;
        }
        if (isSpecified(style, 134217728)) {
            rendererState.style.stopOpacity = style.stopOpacity;
        }
        if (isSpecified(style, 8589934592L)) {
            rendererState.style.viewportFill = style.viewportFill;
        }
        if (isSpecified(style, 17179869184L)) {
            rendererState.style.viewportFillOpacity = style.viewportFillOpacity;
        }
        if (isSpecified(style, 137438953472L)) {
            rendererState.style.imageRendering = style.imageRendering;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVGAndroidRenderer$1 */
    static /* synthetic */ class C11771 {
        static final /* synthetic */ int[] $SwitchMap$com$caverock$androidsvg$SVG$Style$LineCap = new int[SVG.Style.LineCap.values().length];
        static final /* synthetic */ int[] $SwitchMap$com$caverock$androidsvg$SVG$Style$LineJoin = new int[SVG.Style.LineJoin.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x008e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0099 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a4 */
        static {
            /*
                com.caverock.androidsvg.SVG$Style$LineJoin[] r0 = com.caverock.androidsvg.SVG.Style.LineJoin.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$caverock$androidsvg$SVG$Style$LineJoin = r0
                r0 = 1
                int[] r1 = $SwitchMap$com$caverock$androidsvg$SVG$Style$LineJoin     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.caverock.androidsvg.SVG$Style$LineJoin r2 = com.caverock.androidsvg.SVG.Style.LineJoin.Miter     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = $SwitchMap$com$caverock$androidsvg$SVG$Style$LineJoin     // Catch:{ NoSuchFieldError -> 0x001f }
                com.caverock.androidsvg.SVG$Style$LineJoin r3 = com.caverock.androidsvg.SVG.Style.LineJoin.Round     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = $SwitchMap$com$caverock$androidsvg$SVG$Style$LineJoin     // Catch:{ NoSuchFieldError -> 0x002a }
                com.caverock.androidsvg.SVG$Style$LineJoin r4 = com.caverock.androidsvg.SVG.Style.LineJoin.Bevel     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                com.caverock.androidsvg.SVG$Style$LineCap[] r3 = com.caverock.androidsvg.SVG.Style.LineCap.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                $SwitchMap$com$caverock$androidsvg$SVG$Style$LineCap = r3
                int[] r3 = $SwitchMap$com$caverock$androidsvg$SVG$Style$LineCap     // Catch:{ NoSuchFieldError -> 0x003d }
                com.caverock.androidsvg.SVG$Style$LineCap r4 = com.caverock.androidsvg.SVG.Style.LineCap.Butt     // Catch:{ NoSuchFieldError -> 0x003d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                int[] r3 = $SwitchMap$com$caverock$androidsvg$SVG$Style$LineCap     // Catch:{ NoSuchFieldError -> 0x0047 }
                com.caverock.androidsvg.SVG$Style$LineCap r4 = com.caverock.androidsvg.SVG.Style.LineCap.Round     // Catch:{ NoSuchFieldError -> 0x0047 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0047 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                int[] r3 = $SwitchMap$com$caverock$androidsvg$SVG$Style$LineCap     // Catch:{ NoSuchFieldError -> 0x0051 }
                com.caverock.androidsvg.SVG$Style$LineCap r4 = com.caverock.androidsvg.SVG.Style.LineCap.Square     // Catch:{ NoSuchFieldError -> 0x0051 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0051 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0051 }
            L_0x0051:
                com.caverock.androidsvg.PreserveAspectRatio$Alignment[] r3 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment = r3
                int[] r3 = $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.caverock.androidsvg.PreserveAspectRatio$Alignment r4 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMidYMin     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment     // Catch:{ NoSuchFieldError -> 0x006e }
                com.caverock.androidsvg.PreserveAspectRatio$Alignment r3 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMidYMid     // Catch:{ NoSuchFieldError -> 0x006e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMidYMax     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment     // Catch:{ NoSuchFieldError -> 0x0083 }
                com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMaxYMin     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment     // Catch:{ NoSuchFieldError -> 0x008e }
                com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMaxYMid     // Catch:{ NoSuchFieldError -> 0x008e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008e }
            L_0x008e:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment     // Catch:{ NoSuchFieldError -> 0x0099 }
                com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMaxYMax     // Catch:{ NoSuchFieldError -> 0x0099 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0099 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0099 }
            L_0x0099:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment     // Catch:{ NoSuchFieldError -> 0x00a4 }
                com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMinYMid     // Catch:{ NoSuchFieldError -> 0x00a4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a4 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a4 }
            L_0x00a4:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment     // Catch:{ NoSuchFieldError -> 0x00b0 }
                com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMinYMax     // Catch:{ NoSuchFieldError -> 0x00b0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b0 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b0 }
            L_0x00b0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGAndroidRenderer.C11771.<clinit>():void");
        }
    }

    private void setPaintColour(RendererState rendererState, boolean z, SVG.SvgPaint svgPaint) {
        int i;
        SVG.Style style = rendererState.style;
        float floatValue = (z ? style.fillOpacity : style.strokeOpacity).floatValue();
        if (svgPaint instanceof SVG.Colour) {
            i = ((SVG.Colour) svgPaint).colour;
        } else if (svgPaint instanceof SVG.CurrentColor) {
            i = rendererState.style.color.colour;
        } else {
            return;
        }
        int colourWithOpacity = colourWithOpacity(i, floatValue);
        if (z) {
            rendererState.fillPaint.setColor(colourWithOpacity);
        } else {
            rendererState.strokePaint.setColor(colourWithOpacity);
        }
    }

    private Typeface checkGenericFont(String str, Integer num, SVG.Style.FontStyle fontStyle) {
        boolean z = fontStyle == SVG.Style.FontStyle.Italic;
        int i = num.intValue() > 500 ? z ? 3 : 1 : z ? 2 : 0;
        char c = 65535;
        switch (str.hashCode()) {
            case -1536685117:
                if (str.equals("sans-serif")) {
                    c = 1;
                    break;
                }
                break;
            case -1431958525:
                if (str.equals("monospace")) {
                    c = 2;
                    break;
                }
                break;
            case -1081737434:
                if (str.equals("fantasy")) {
                    c = 4;
                    break;
                }
                break;
            case 109326717:
                if (str.equals(DEFAULT_FONT_FAMILY)) {
                    c = 0;
                    break;
                }
                break;
            case 1126973893:
                if (str.equals("cursive")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            return Typeface.create(Typeface.SERIF, i);
        }
        if (c == 1) {
            return Typeface.create(Typeface.SANS_SERIF, i);
        }
        if (c == 2) {
            return Typeface.create(Typeface.MONOSPACE, i);
        }
        if (c == 3) {
            return Typeface.create(Typeface.SANS_SERIF, i);
        }
        if (c != 4) {
            return null;
        }
        return Typeface.create(Typeface.SANS_SERIF, i);
    }

    static int colourWithOpacity(int i, float f) {
        int i2 = 255;
        int round = Math.round(((float) ((i >> 24) & 255)) * f);
        if (round < 0) {
            i2 = 0;
        } else if (round <= 255) {
            i2 = round;
        }
        return (i & 16777215) | (i2 << 24);
    }

    private Path.FillType getFillTypeFromState() {
        if (this.state.style.fillRule == null || this.state.style.fillRule != SVG.Style.FillRule.EvenOdd) {
            return Path.FillType.WINDING;
        }
        return Path.FillType.EVEN_ODD;
    }

    private void setClipRect(float f, float f2, float f3, float f4) {
        float f5 = f3 + f;
        float f6 = f4 + f2;
        if (this.state.style.clip != null) {
            f += this.state.style.clip.left.floatValueX(this);
            f2 += this.state.style.clip.top.floatValueY(this);
            f5 -= this.state.style.clip.right.floatValueX(this);
            f6 -= this.state.style.clip.bottom.floatValueY(this);
        }
        this.canvas.clipRect(f, f2, f5, f6);
    }

    private void viewportFill() {
        int i;
        if (this.state.style.viewportFill instanceof SVG.Colour) {
            i = ((SVG.Colour) this.state.style.viewportFill).colour;
        } else if (this.state.style.viewportFill instanceof SVG.CurrentColor) {
            i = this.state.style.color.colour;
        } else {
            return;
        }
        if (this.state.style.viewportFillOpacity != null) {
            i = colourWithOpacity(i, this.state.style.viewportFillOpacity.floatValue());
        }
        this.canvas.drawColor(i);
    }

    private class PathConverter implements SVG.PathInterface {
        float lastX;
        float lastY;
        Path path = new Path();

        PathConverter(SVG.PathDefinition pathDefinition) {
            if (pathDefinition != null) {
                pathDefinition.enumeratePath(this);
            }
        }

        /* access modifiers changed from: package-private */
        public Path getPath() {
            return this.path;
        }

        public void moveTo(float f, float f2) {
            this.path.moveTo(f, f2);
            this.lastX = f;
            this.lastY = f2;
        }

        public void lineTo(float f, float f2) {
            this.path.lineTo(f, f2);
            this.lastX = f;
            this.lastY = f2;
        }

        public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
            this.path.cubicTo(f, f2, f3, f4, f5, f6);
            this.lastX = f5;
            this.lastY = f6;
        }

        public void quadTo(float f, float f2, float f3, float f4) {
            this.path.quadTo(f, f2, f3, f4);
            this.lastX = f3;
            this.lastY = f4;
        }

        public void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            SVGAndroidRenderer.arcTo(this.lastX, this.lastY, f, f2, f3, z, z2, f4, f5, this);
            this.lastX = f4;
            this.lastY = f5;
        }

        public void close() {
            this.path.close();
        }
    }

    /* access modifiers changed from: private */
    public static void arcTo(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, SVG.PathInterface pathInterface) {
        float f8;
        double d;
        float f9 = f5;
        boolean z3 = z2;
        float f10 = f6;
        float f11 = f7;
        if (f != f10 || f2 != f11) {
            if (f3 == 0.0f || f4 == 0.0f) {
                pathInterface.lineTo(f10, f11);
                return;
            }
            float abs = Math.abs(f3);
            float abs2 = Math.abs(f4);
            double radians = (double) ((float) Math.toRadians(((double) f9) % 360.0d));
            float cos = (float) Math.cos(radians);
            float sin = (float) Math.sin(radians);
            float f12 = (f - f10) / 2.0f;
            float f13 = (f2 - f11) / 2.0f;
            float f14 = (cos * f12) + (sin * f13);
            float f15 = ((-sin) * f12) + (f13 * cos);
            float f16 = abs * abs;
            float f17 = abs2 * abs2;
            float f18 = f14 * f14;
            float f19 = f15 * f15;
            float f20 = (f18 / f16) + (f19 / f17);
            if (f20 > 1.0f) {
                double d2 = (double) f20;
                f8 = cos;
                abs *= (float) Math.sqrt(d2);
                abs2 *= (float) Math.sqrt(d2);
                f16 = abs * abs;
                f17 = abs2 * abs2;
            } else {
                f8 = cos;
            }
            float f21 = z == z3 ? -1.0f : 1.0f;
            float f22 = f16 * f17;
            float f23 = f16 * f19;
            float f24 = f17 * f18;
            float f25 = ((f22 - f23) - f24) / (f23 + f24);
            if (f25 < 0.0f) {
                f25 = 0.0f;
            }
            float sqrt = (float) (((double) f21) * Math.sqrt((double) f25));
            float f26 = ((abs * f15) / abs2) * sqrt;
            float f27 = sqrt * (-((abs2 * f14) / abs));
            float f28 = ((f + f10) / 2.0f) + ((f8 * f26) - (sin * f27));
            float f29 = ((f2 + f11) / 2.0f) + (sin * f26) + (f8 * f27);
            float f30 = (f14 - f26) / abs;
            float f31 = (f15 - f27) / abs2;
            float f32 = ((-f15) - f27) / abs2;
            float f33 = (f30 * f30) + (f31 * f31);
            float f34 = ((-f14) - f26) / abs;
            float f35 = abs;
            float degrees = (float) Math.toDegrees(((double) (f31 < 0.0f ? -1.0f : 1.0f)) * Math.acos((double) (f30 / ((float) Math.sqrt((double) f33)))));
            double degrees2 = Math.toDegrees(((double) ((f30 * f32) - (f31 * f34) < 0.0f ? -1.0f : 1.0f)) * Math.acos((double) (((f30 * f34) + (f31 * f32)) / ((float) Math.sqrt((double) (f33 * ((f34 * f34) + (f32 * f32))))))));
            if (z3 || degrees2 <= Utils.DOUBLE_EPSILON) {
                d = 360.0d;
                if (z3 && degrees2 < Utils.DOUBLE_EPSILON) {
                    degrees2 += 360.0d;
                }
            } else {
                d = 360.0d;
                degrees2 -= 360.0d;
            }
            float[] arcToBeziers = arcToBeziers((double) (degrees % 360.0f), degrees2 % d);
            Matrix matrix = new Matrix();
            matrix.postScale(f35, abs2);
            matrix.postRotate(f9);
            matrix.postTranslate(f28, f29);
            matrix.mapPoints(arcToBeziers);
            arcToBeziers[arcToBeziers.length - 2] = f10;
            arcToBeziers[arcToBeziers.length - 1] = f11;
            for (int i = 0; i < arcToBeziers.length; i += 6) {
                pathInterface.cubicTo(arcToBeziers[i], arcToBeziers[i + 1], arcToBeziers[i + 2], arcToBeziers[i + 3], arcToBeziers[i + 4], arcToBeziers[i + 5]);
            }
        }
    }

    private static float[] arcToBeziers(double d, double d2) {
        int ceil = (int) Math.ceil(Math.abs(d2) / 90.0d);
        double radians = Math.toRadians(d);
        float radians2 = (float) (Math.toRadians(d2) / ((double) ceil));
        double d3 = (double) radians2;
        double d4 = d3 / 2.0d;
        double sin = (Math.sin(d4) * 1.3333333333333333d) / (Math.cos(d4) + 1.0d);
        float[] fArr = new float[(ceil * 6)];
        int i = 0;
        int i2 = 0;
        while (i < ceil) {
            double d5 = ((double) (((float) i) * radians2)) + radians;
            double cos = Math.cos(d5);
            double sin2 = Math.sin(d5);
            int i3 = i2 + 1;
            int i4 = ceil;
            double d6 = radians;
            fArr[i2] = (float) (cos - (sin * sin2));
            int i5 = i3 + 1;
            fArr[i3] = (float) (sin2 + (cos * sin));
            double d7 = d5 + d3;
            double cos2 = Math.cos(d7);
            double sin3 = Math.sin(d7);
            int i6 = i5 + 1;
            fArr[i5] = (float) ((sin * sin3) + cos2);
            int i7 = i6 + 1;
            fArr[i6] = (float) (sin3 - (sin * cos2));
            int i8 = i7 + 1;
            fArr[i7] = (float) cos2;
            fArr[i8] = (float) sin3;
            i++;
            radians = d6;
            i2 = i8 + 1;
            ceil = i4;
        }
        return fArr;
    }

    private class MarkerVector {

        /* renamed from: dx */
        float f1266dx = 0.0f;

        /* renamed from: dy */
        float f1267dy = 0.0f;
        boolean isAmbiguous = false;

        /* renamed from: x */
        float f1268x;

        /* renamed from: y */
        float f1269y;

        MarkerVector(float f, float f2, float f3, float f4) {
            this.f1268x = f;
            this.f1269y = f2;
            double sqrt = Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
            if (sqrt != Utils.DOUBLE_EPSILON) {
                this.f1266dx = (float) (((double) f3) / sqrt);
                this.f1267dy = (float) (((double) f4) / sqrt);
            }
        }

        /* access modifiers changed from: package-private */
        public void add(float f, float f2) {
            float f3 = f - this.f1268x;
            float f4 = f2 - this.f1269y;
            double sqrt = Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
            if (sqrt != Utils.DOUBLE_EPSILON) {
                f3 = (float) (((double) f3) / sqrt);
                f4 = (float) (((double) f4) / sqrt);
            }
            if (f3 == (-this.f1266dx) && f4 == (-this.f1267dy)) {
                this.isAmbiguous = true;
                this.f1266dx = -f4;
                this.f1267dy = f3;
                return;
            }
            this.f1266dx += f3;
            this.f1267dy += f4;
        }

        /* access modifiers changed from: package-private */
        public void add(MarkerVector markerVector) {
            if (markerVector.f1266dx == (-this.f1266dx)) {
                float f = markerVector.f1267dy;
                if (f == (-this.f1267dy)) {
                    this.isAmbiguous = true;
                    this.f1266dx = -f;
                    this.f1267dy = markerVector.f1266dx;
                    return;
                }
            }
            this.f1266dx += markerVector.f1266dx;
            this.f1267dy += markerVector.f1267dy;
        }

        public String toString() {
            return "(" + this.f1268x + "," + this.f1269y + " " + this.f1266dx + "," + this.f1267dy + ")";
        }
    }

    private class MarkerPositionCalculator implements SVG.PathInterface {
        private boolean closepathReAdjustPending;
        private MarkerVector lastPos = null;
        private List<MarkerVector> markers = new ArrayList();
        private boolean normalCubic = true;
        private boolean startArc = false;
        private float startX;
        private float startY;
        private int subpathStartIndex = -1;

        MarkerPositionCalculator(SVG.PathDefinition pathDefinition) {
            if (pathDefinition != null) {
                pathDefinition.enumeratePath(this);
                if (this.closepathReAdjustPending) {
                    this.lastPos.add(this.markers.get(this.subpathStartIndex));
                    this.markers.set(this.subpathStartIndex, this.lastPos);
                    this.closepathReAdjustPending = false;
                }
                MarkerVector markerVector = this.lastPos;
                if (markerVector != null) {
                    this.markers.add(markerVector);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public List<MarkerVector> getMarkers() {
            return this.markers;
        }

        public void moveTo(float f, float f2) {
            if (this.closepathReAdjustPending) {
                this.lastPos.add(this.markers.get(this.subpathStartIndex));
                this.markers.set(this.subpathStartIndex, this.lastPos);
                this.closepathReAdjustPending = false;
            }
            MarkerVector markerVector = this.lastPos;
            if (markerVector != null) {
                this.markers.add(markerVector);
            }
            this.startX = f;
            this.startY = f2;
            this.lastPos = new MarkerVector(f, f2, 0.0f, 0.0f);
            this.subpathStartIndex = this.markers.size();
        }

        public void lineTo(float f, float f2) {
            this.lastPos.add(f, f2);
            this.markers.add(this.lastPos);
            this.lastPos = new MarkerVector(f, f2, f - this.lastPos.f1268x, f2 - this.lastPos.f1269y);
            this.closepathReAdjustPending = false;
        }

        public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
            if (this.normalCubic || this.startArc) {
                this.lastPos.add(f, f2);
                this.markers.add(this.lastPos);
                this.startArc = false;
            }
            this.lastPos = new MarkerVector(f5, f6, f5 - f3, f6 - f4);
            this.closepathReAdjustPending = false;
        }

        public void quadTo(float f, float f2, float f3, float f4) {
            this.lastPos.add(f, f2);
            this.markers.add(this.lastPos);
            this.lastPos = new MarkerVector(f3, f4, f3 - f, f4 - f2);
            this.closepathReAdjustPending = false;
        }

        public void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            this.startArc = true;
            this.normalCubic = false;
            SVGAndroidRenderer.arcTo(this.lastPos.f1268x, this.lastPos.f1269y, f, f2, f3, z, z2, f4, f5, this);
            this.normalCubic = true;
            this.closepathReAdjustPending = false;
        }

        public void close() {
            this.markers.add(this.lastPos);
            lineTo(this.startX, this.startY);
            this.closepathReAdjustPending = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void renderMarkers(com.caverock.androidsvg.SVG.GraphicsElement r11) {
        /*
            r10 = this;
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r0 = r10.state
            com.caverock.androidsvg.SVG$Style r0 = r0.style
            java.lang.String r0 = r0.markerStart
            if (r0 != 0) goto L_0x0019
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r0 = r10.state
            com.caverock.androidsvg.SVG$Style r0 = r0.style
            java.lang.String r0 = r0.markerMid
            if (r0 != 0) goto L_0x0019
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r0 = r10.state
            com.caverock.androidsvg.SVG$Style r0 = r0.style
            java.lang.String r0 = r0.markerEnd
            if (r0 != 0) goto L_0x0019
            return
        L_0x0019:
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r0 = r10.state
            com.caverock.androidsvg.SVG$Style r0 = r0.style
            java.lang.String r0 = r0.markerStart
            java.lang.String r1 = "Marker reference '%s' not found"
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0044
            com.caverock.androidsvg.SVG r0 = r11.document
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r5 = r10.state
            com.caverock.androidsvg.SVG$Style r5 = r5.style
            java.lang.String r5 = r5.markerStart
            com.caverock.androidsvg.SVG$SvgObject r0 = r0.resolveIRI(r5)
            if (r0 == 0) goto L_0x0037
            com.caverock.androidsvg.SVG$Marker r0 = (com.caverock.androidsvg.SVG.Marker) r0
            goto L_0x0045
        L_0x0037:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r5 = r10.state
            com.caverock.androidsvg.SVG$Style r5 = r5.style
            java.lang.String r5 = r5.markerStart
            r0[r3] = r5
            error(r1, r0)
        L_0x0044:
            r0 = r2
        L_0x0045:
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r5 = r10.state
            com.caverock.androidsvg.SVG$Style r5 = r5.style
            java.lang.String r5 = r5.markerMid
            if (r5 == 0) goto L_0x006b
            com.caverock.androidsvg.SVG r5 = r11.document
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r6 = r10.state
            com.caverock.androidsvg.SVG$Style r6 = r6.style
            java.lang.String r6 = r6.markerMid
            com.caverock.androidsvg.SVG$SvgObject r5 = r5.resolveIRI(r6)
            if (r5 == 0) goto L_0x005e
            com.caverock.androidsvg.SVG$Marker r5 = (com.caverock.androidsvg.SVG.Marker) r5
            goto L_0x006c
        L_0x005e:
            java.lang.Object[] r5 = new java.lang.Object[r4]
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r6 = r10.state
            com.caverock.androidsvg.SVG$Style r6 = r6.style
            java.lang.String r6 = r6.markerMid
            r5[r3] = r6
            error(r1, r5)
        L_0x006b:
            r5 = r2
        L_0x006c:
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r6 = r10.state
            com.caverock.androidsvg.SVG$Style r6 = r6.style
            java.lang.String r6 = r6.markerEnd
            if (r6 == 0) goto L_0x0093
            com.caverock.androidsvg.SVG r6 = r11.document
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r7 = r10.state
            com.caverock.androidsvg.SVG$Style r7 = r7.style
            java.lang.String r7 = r7.markerEnd
            com.caverock.androidsvg.SVG$SvgObject r6 = r6.resolveIRI(r7)
            if (r6 == 0) goto L_0x0086
            r1 = r6
            com.caverock.androidsvg.SVG$Marker r1 = (com.caverock.androidsvg.SVG.Marker) r1
            goto L_0x0094
        L_0x0086:
            java.lang.Object[] r6 = new java.lang.Object[r4]
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r7 = r10.state
            com.caverock.androidsvg.SVG$Style r7 = r7.style
            java.lang.String r7 = r7.markerEnd
            r6[r3] = r7
            error(r1, r6)
        L_0x0093:
            r1 = r2
        L_0x0094:
            boolean r6 = r11 instanceof com.caverock.androidsvg.SVG.Path
            if (r6 == 0) goto L_0x00a6
            com.caverock.androidsvg.SVGAndroidRenderer$MarkerPositionCalculator r6 = new com.caverock.androidsvg.SVGAndroidRenderer$MarkerPositionCalculator
            com.caverock.androidsvg.SVG$Path r11 = (com.caverock.androidsvg.SVG.Path) r11
            com.caverock.androidsvg.SVG$PathDefinition r11 = r11.f1233d
            r6.<init>(r11)
            java.util.List r11 = r6.getMarkers()
            goto L_0x00b7
        L_0x00a6:
            boolean r6 = r11 instanceof com.caverock.androidsvg.SVG.Line
            if (r6 == 0) goto L_0x00b1
            com.caverock.androidsvg.SVG$Line r11 = (com.caverock.androidsvg.SVG.Line) r11
            java.util.List r11 = r10.calculateMarkerPositions((com.caverock.androidsvg.SVG.Line) r11)
            goto L_0x00b7
        L_0x00b1:
            com.caverock.androidsvg.SVG$PolyLine r11 = (com.caverock.androidsvg.SVG.PolyLine) r11
            java.util.List r11 = r10.calculateMarkerPositions((com.caverock.androidsvg.SVG.PolyLine) r11)
        L_0x00b7:
            if (r11 != 0) goto L_0x00ba
            return
        L_0x00ba:
            int r6 = r11.size()
            if (r6 != 0) goto L_0x00c1
            return
        L_0x00c1:
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r7 = r10.state
            com.caverock.androidsvg.SVG$Style r7 = r7.style
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r8 = r10.state
            com.caverock.androidsvg.SVG$Style r8 = r8.style
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r9 = r10.state
            com.caverock.androidsvg.SVG$Style r9 = r9.style
            r9.markerEnd = r2
            r8.markerMid = r2
            r7.markerStart = r2
            if (r0 == 0) goto L_0x00de
            java.lang.Object r2 = r11.get(r3)
            com.caverock.androidsvg.SVGAndroidRenderer$MarkerVector r2 = (com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector) r2
            r10.renderMarker(r0, r2)
        L_0x00de:
            if (r5 == 0) goto L_0x010f
            int r0 = r11.size()
            r2 = 2
            if (r0 <= r2) goto L_0x010f
            java.lang.Object r0 = r11.get(r3)
            com.caverock.androidsvg.SVGAndroidRenderer$MarkerVector r0 = (com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector) r0
            java.lang.Object r2 = r11.get(r4)
            com.caverock.androidsvg.SVGAndroidRenderer$MarkerVector r2 = (com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector) r2
            r3 = r0
            r0 = 1
        L_0x00f5:
            int r7 = r6 + -1
            if (r0 >= r7) goto L_0x010f
            int r0 = r0 + 1
            java.lang.Object r7 = r11.get(r0)
            com.caverock.androidsvg.SVGAndroidRenderer$MarkerVector r7 = (com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector) r7
            boolean r8 = r2.isAmbiguous
            if (r8 == 0) goto L_0x0109
            com.caverock.androidsvg.SVGAndroidRenderer$MarkerVector r2 = r10.realignMarkerMid(r3, r2, r7)
        L_0x0109:
            r3 = r2
            r10.renderMarker(r5, r3)
            r2 = r7
            goto L_0x00f5
        L_0x010f:
            if (r1 == 0) goto L_0x011b
            int r6 = r6 - r4
            java.lang.Object r11 = r11.get(r6)
            com.caverock.androidsvg.SVGAndroidRenderer$MarkerVector r11 = (com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector) r11
            r10.renderMarker(r1, r11)
        L_0x011b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGAndroidRenderer.renderMarkers(com.caverock.androidsvg.SVG$GraphicsElement):void");
    }

    private MarkerVector realignMarkerMid(MarkerVector markerVector, MarkerVector markerVector2, MarkerVector markerVector3) {
        float dotProduct = dotProduct(markerVector2.f1266dx, markerVector2.f1267dy, markerVector2.f1268x - markerVector.f1268x, markerVector2.f1269y - markerVector.f1269y);
        if (dotProduct == 0.0f) {
            dotProduct = dotProduct(markerVector2.f1266dx, markerVector2.f1267dy, markerVector3.f1268x - markerVector2.f1268x, markerVector3.f1269y - markerVector2.f1269y);
        }
        int i = (dotProduct > 0.0f ? 1 : (dotProduct == 0.0f ? 0 : -1));
        if (i > 0) {
            return markerVector2;
        }
        if (i == 0 && (markerVector2.f1266dx > 0.0f || markerVector2.f1267dy >= 0.0f)) {
            return markerVector2;
        }
        markerVector2.f1266dx = -markerVector2.f1266dx;
        markerVector2.f1267dy = -markerVector2.f1267dy;
        return markerVector2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fa, code lost:
        r12 = 0.0f - r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fc, code lost:
        r7 = com.caverock.androidsvg.SVGAndroidRenderer.C11771.$SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment[r7.getAlignment().ordinal()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0109, code lost:
        if (r7 == 2) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010c, code lost:
        if (r7 == 3) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010f, code lost:
        if (r7 == 5) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0112, code lost:
        if (r7 == 6) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0115, code lost:
        if (r7 == 7) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0119, code lost:
        if (r7 == 8) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011c, code lost:
        r0 = r4 - r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011f, code lost:
        r0 = (r4 - r0) / 2.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0122, code lost:
        r1 = 0.0f - r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012d, code lost:
        if (r10.state.style.overflow.booleanValue() != false) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012f, code lost:
        setClipRect(r12, r1, r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0132, code lost:
        r3.reset();
        r3.preScale(r5, r6);
        r10.canvas.concat(r3);
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0161  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void renderMarker(com.caverock.androidsvg.SVG.Marker r11, com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector r12) {
        /*
            r10 = this;
            r10.statePush()
            java.lang.Float r0 = r11.orient
            r1 = 0
            if (r0 == 0) goto L_0x0037
            java.lang.Float r0 = r11.orient
            float r0 = r0.floatValue()
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L_0x0030
            float r0 = r12.f1266dx
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0020
            float r0 = r12.f1267dy
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0037
        L_0x0020:
            float r0 = r12.f1267dy
            double r2 = (double) r0
            float r0 = r12.f1266dx
            double r4 = (double) r0
            double r2 = java.lang.Math.atan2(r2, r4)
            double r2 = java.lang.Math.toDegrees(r2)
            float r0 = (float) r2
            goto L_0x0038
        L_0x0030:
            java.lang.Float r0 = r11.orient
            float r0 = r0.floatValue()
            goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            boolean r2 = r11.markerUnitsAreUser
            if (r2 == 0) goto L_0x003f
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x004b
        L_0x003f:
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r2 = r10.state
            com.caverock.androidsvg.SVG$Style r2 = r2.style
            com.caverock.androidsvg.SVG$Length r2 = r2.strokeWidth
            float r3 = r10.dpi
            float r2 = r2.floatValue((float) r3)
        L_0x004b:
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r3 = r10.findInheritFromAncestorState(r11)
            r10.state = r3
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            float r4 = r12.f1268x
            float r12 = r12.f1269y
            r3.preTranslate(r4, r12)
            r3.preRotate(r0)
            r3.preScale(r2, r2)
            com.caverock.androidsvg.SVG$Length r12 = r11.refX
            if (r12 == 0) goto L_0x006e
            com.caverock.androidsvg.SVG$Length r12 = r11.refX
            float r12 = r12.floatValueX(r10)
            goto L_0x006f
        L_0x006e:
            r12 = 0
        L_0x006f:
            com.caverock.androidsvg.SVG$Length r0 = r11.refY
            if (r0 == 0) goto L_0x007a
            com.caverock.androidsvg.SVG$Length r0 = r11.refY
            float r0 = r0.floatValueY(r10)
            goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            com.caverock.androidsvg.SVG$Length r2 = r11.markerWidth
            r4 = 1077936128(0x40400000, float:3.0)
            if (r2 == 0) goto L_0x0088
            com.caverock.androidsvg.SVG$Length r2 = r11.markerWidth
            float r2 = r2.floatValueX(r10)
            goto L_0x008a
        L_0x0088:
            r2 = 1077936128(0x40400000, float:3.0)
        L_0x008a:
            com.caverock.androidsvg.SVG$Length r5 = r11.markerHeight
            if (r5 == 0) goto L_0x0094
            com.caverock.androidsvg.SVG$Length r4 = r11.markerHeight
            float r4 = r4.floatValueY(r10)
        L_0x0094:
            com.caverock.androidsvg.SVG$Box r5 = r11.viewBox
            if (r5 == 0) goto L_0x013e
            com.caverock.androidsvg.SVG$Box r5 = r11.viewBox
            float r5 = r5.width
            float r5 = r2 / r5
            com.caverock.androidsvg.SVG$Box r6 = r11.viewBox
            float r6 = r6.height
            float r6 = r4 / r6
            com.caverock.androidsvg.PreserveAspectRatio r7 = r11.preserveAspectRatio
            if (r7 == 0) goto L_0x00ab
            com.caverock.androidsvg.PreserveAspectRatio r7 = r11.preserveAspectRatio
            goto L_0x00ad
        L_0x00ab:
            com.caverock.androidsvg.PreserveAspectRatio r7 = com.caverock.androidsvg.PreserveAspectRatio.LETTERBOX
        L_0x00ad:
            com.caverock.androidsvg.PreserveAspectRatio r8 = com.caverock.androidsvg.PreserveAspectRatio.STRETCH
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x00c7
            com.caverock.androidsvg.PreserveAspectRatio$Scale r8 = r7.getScale()
            com.caverock.androidsvg.PreserveAspectRatio$Scale r9 = com.caverock.androidsvg.PreserveAspectRatio.Scale.slice
            if (r8 != r9) goto L_0x00c2
            float r5 = java.lang.Math.max(r5, r6)
            goto L_0x00c6
        L_0x00c2:
            float r5 = java.lang.Math.min(r5, r6)
        L_0x00c6:
            r6 = r5
        L_0x00c7:
            float r12 = -r12
            float r12 = r12 * r5
            float r0 = -r0
            float r0 = r0 * r6
            r3.preTranslate(r12, r0)
            android.graphics.Canvas r12 = r10.canvas
            r12.concat(r3)
            com.caverock.androidsvg.SVG$Box r12 = r11.viewBox
            float r12 = r12.width
            float r12 = r12 * r5
            com.caverock.androidsvg.SVG$Box r0 = r11.viewBox
            float r0 = r0.height
            float r0 = r0 * r6
            int[] r8 = com.caverock.androidsvg.SVGAndroidRenderer.C11771.$SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r9 = r7.getAlignment()
            int r9 = r9.ordinal()
            r8 = r8[r9]
            r9 = 1073741824(0x40000000, float:2.0)
            switch(r8) {
                case 1: goto L_0x00f7;
                case 2: goto L_0x00f7;
                case 3: goto L_0x00f7;
                case 4: goto L_0x00f4;
                case 5: goto L_0x00f4;
                case 6: goto L_0x00f4;
                default: goto L_0x00f2;
            }
        L_0x00f2:
            r12 = 0
            goto L_0x00fc
        L_0x00f4:
            float r12 = r2 - r12
            goto L_0x00fa
        L_0x00f7:
            float r12 = r2 - r12
            float r12 = r12 / r9
        L_0x00fa:
            float r12 = r1 - r12
        L_0x00fc:
            int[] r8 = com.caverock.androidsvg.SVGAndroidRenderer.C11771.$SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r7 = r7.getAlignment()
            int r7 = r7.ordinal()
            r7 = r8[r7]
            r8 = 2
            if (r7 == r8) goto L_0x011f
            r8 = 3
            if (r7 == r8) goto L_0x011c
            r8 = 5
            if (r7 == r8) goto L_0x011f
            r8 = 6
            if (r7 == r8) goto L_0x011c
            r8 = 7
            if (r7 == r8) goto L_0x011f
            r8 = 8
            if (r7 == r8) goto L_0x011c
            goto L_0x0123
        L_0x011c:
            float r0 = r4 - r0
            goto L_0x0122
        L_0x011f:
            float r0 = r4 - r0
            float r0 = r0 / r9
        L_0x0122:
            float r1 = r1 - r0
        L_0x0123:
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r0 = r10.state
            com.caverock.androidsvg.SVG$Style r0 = r0.style
            java.lang.Boolean r0 = r0.overflow
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0132
            r10.setClipRect(r12, r1, r2, r4)
        L_0x0132:
            r3.reset()
            r3.preScale(r5, r6)
            android.graphics.Canvas r12 = r10.canvas
            r12.concat(r3)
            goto L_0x0157
        L_0x013e:
            float r12 = -r12
            float r0 = -r0
            r3.preTranslate(r12, r0)
            android.graphics.Canvas r12 = r10.canvas
            r12.concat(r3)
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r12 = r10.state
            com.caverock.androidsvg.SVG$Style r12 = r12.style
            java.lang.Boolean r12 = r12.overflow
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L_0x0157
            r10.setClipRect(r1, r1, r2, r4)
        L_0x0157:
            boolean r12 = r10.pushLayer()
            r0 = 0
            r10.renderChildren(r11, r0)
            if (r12 == 0) goto L_0x0164
            r10.popLayer(r11)
        L_0x0164:
            r10.statePop()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGAndroidRenderer.renderMarker(com.caverock.androidsvg.SVG$Marker, com.caverock.androidsvg.SVGAndroidRenderer$MarkerVector):void");
    }

    private RendererState findInheritFromAncestorState(SVG.SvgObject svgObject) {
        RendererState rendererState = new RendererState();
        updateStyle(rendererState, SVG.Style.getDefaultStyle());
        return findInheritFromAncestorState(svgObject, rendererState);
    }

    private RendererState findInheritFromAncestorState(SVG.SvgObject svgObject, RendererState rendererState) {
        ArrayList<SVG.SvgElementBase> arrayList = new ArrayList<>();
        while (true) {
            if (svgObject instanceof SVG.SvgElementBase) {
                arrayList.add(0, (SVG.SvgElementBase) svgObject);
            }
            if (svgObject.parent == null) {
                break;
            }
            svgObject = (SVG.SvgObject) svgObject.parent;
        }
        for (SVG.SvgElementBase updateStyleForElement : arrayList) {
            updateStyleForElement(rendererState, updateStyleForElement);
        }
        rendererState.viewBox = this.state.viewBox;
        rendererState.viewPort = this.state.viewPort;
        return rendererState;
    }

    private void checkForGradientsAndPatterns(SVG.SvgElement svgElement) {
        if (this.state.style.fill instanceof SVG.PaintReference) {
            decodePaintReference(true, svgElement.boundingBox, (SVG.PaintReference) this.state.style.fill);
        }
        if (this.state.style.stroke instanceof SVG.PaintReference) {
            decodePaintReference(false, svgElement.boundingBox, (SVG.PaintReference) this.state.style.stroke);
        }
    }

    private void decodePaintReference(boolean z, SVG.Box box, SVG.PaintReference paintReference) {
        SVG.SvgObject resolveIRI = this.document.resolveIRI(paintReference.href);
        if (resolveIRI == null) {
            Object[] objArr = new Object[2];
            objArr[0] = z ? "Fill" : "Stroke";
            objArr[1] = paintReference.href;
            error("%s reference '%s' not found", objArr);
            if (paintReference.fallback != null) {
                setPaintColour(this.state, z, paintReference.fallback);
            } else if (z) {
                this.state.hasFill = false;
            } else {
                this.state.hasStroke = false;
            }
        } else if (resolveIRI instanceof SVG.SvgLinearGradient) {
            makeLinearGradient(z, box, (SVG.SvgLinearGradient) resolveIRI);
        } else if (resolveIRI instanceof SVG.SvgRadialGradient) {
            makeRadialGradient(z, box, (SVG.SvgRadialGradient) resolveIRI);
        } else if (resolveIRI instanceof SVG.SolidColor) {
            setSolidColor(z, (SVG.SolidColor) resolveIRI);
        }
    }

    private void makeLinearGradient(boolean z, SVG.Box box, SVG.SvgLinearGradient svgLinearGradient) {
        float f;
        float f2;
        float f3;
        float f4;
        SVG.Box box2 = box;
        SVG.SvgLinearGradient svgLinearGradient2 = svgLinearGradient;
        if (svgLinearGradient2.href != null) {
            fillInChainedGradientFields((SVG.GradientElement) svgLinearGradient2, svgLinearGradient2.href);
        }
        int i = 0;
        boolean z2 = svgLinearGradient2.gradientUnitsAreUser != null && svgLinearGradient2.gradientUnitsAreUser.booleanValue();
        RendererState rendererState = this.state;
        Paint paint = z ? rendererState.fillPaint : rendererState.strokePaint;
        if (z2) {
            SVG.Box currentViewPortInUserUnits = getCurrentViewPortInUserUnits();
            float floatValueX = svgLinearGradient2.f1243x1 != null ? svgLinearGradient2.f1243x1.floatValueX(this) : 0.0f;
            float floatValueY = svgLinearGradient2.f1245y1 != null ? svgLinearGradient2.f1245y1.floatValueY(this) : 0.0f;
            f2 = svgLinearGradient2.f1244x2 != null ? svgLinearGradient2.f1244x2.floatValueX(this) : currentViewPortInUserUnits.width;
            f4 = floatValueX;
            f3 = floatValueY;
            f = svgLinearGradient2.f1246y2 != null ? svgLinearGradient2.f1246y2.floatValueY(this) : 0.0f;
        } else {
            float floatValue = svgLinearGradient2.f1243x1 != null ? svgLinearGradient2.f1243x1.floatValue(this, 1.0f) : 0.0f;
            float floatValue2 = svgLinearGradient2.f1245y1 != null ? svgLinearGradient2.f1245y1.floatValue(this, 1.0f) : 0.0f;
            float floatValue3 = svgLinearGradient2.f1244x2 != null ? svgLinearGradient2.f1244x2.floatValue(this, 1.0f) : 1.0f;
            f4 = floatValue;
            f = svgLinearGradient2.f1246y2 != null ? svgLinearGradient2.f1246y2.floatValue(this, 1.0f) : 0.0f;
            f3 = floatValue2;
            f2 = floatValue3;
        }
        statePush();
        this.state = findInheritFromAncestorState(svgLinearGradient2);
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(box2.minX, box2.minY);
            matrix.preScale(box2.width, box2.height);
        }
        if (svgLinearGradient2.gradientTransform != null) {
            matrix.preConcat(svgLinearGradient2.gradientTransform);
        }
        int size = svgLinearGradient2.children.size();
        if (size == 0) {
            statePop();
            if (z) {
                this.state.hasFill = false;
            } else {
                this.state.hasStroke = false;
            }
        } else {
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            float f5 = -1.0f;
            for (SVG.SvgObject svgObject : svgLinearGradient2.children) {
                SVG.Stop stop = (SVG.Stop) svgObject;
                float floatValue4 = stop.offset != null ? stop.offset.floatValue() : 0.0f;
                if (i == 0 || floatValue4 >= f5) {
                    fArr[i] = floatValue4;
                    f5 = floatValue4;
                } else {
                    fArr[i] = f5;
                }
                statePush();
                updateStyleForElement(this.state, stop);
                SVG.Colour colour = (SVG.Colour) this.state.style.stopColor;
                if (colour == null) {
                    colour = SVG.Colour.BLACK;
                }
                iArr[i] = colourWithOpacity(colour.colour, this.state.style.stopOpacity.floatValue());
                i++;
                statePop();
            }
            if ((f4 == f2 && f3 == f) || size == 1) {
                statePop();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            if (svgLinearGradient2.spreadMethod != null) {
                if (svgLinearGradient2.spreadMethod == SVG.GradientSpread.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (svgLinearGradient2.spreadMethod == SVG.GradientSpread.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            statePop();
            LinearGradient linearGradient = new LinearGradient(f4, f3, f2, f, iArr, fArr, tileMode);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            paint.setAlpha(clamp255(this.state.style.fillOpacity.floatValue()));
        }
    }

    private void makeRadialGradient(boolean z, SVG.Box box, SVG.SvgRadialGradient svgRadialGradient) {
        float f;
        float f2;
        float f3;
        SVG.Box box2 = box;
        SVG.SvgRadialGradient svgRadialGradient2 = svgRadialGradient;
        if (svgRadialGradient2.href != null) {
            fillInChainedGradientFields((SVG.GradientElement) svgRadialGradient2, svgRadialGradient2.href);
        }
        int i = 0;
        boolean z2 = svgRadialGradient2.gradientUnitsAreUser != null && svgRadialGradient2.gradientUnitsAreUser.booleanValue();
        RendererState rendererState = this.state;
        Paint paint = z ? rendererState.fillPaint : rendererState.strokePaint;
        if (z2) {
            SVG.Length length = new SVG.Length(50.0f, SVG.Unit.percent);
            float floatValueX = svgRadialGradient2.f1247cx != null ? svgRadialGradient2.f1247cx.floatValueX(this) : length.floatValueX(this);
            float floatValueY = svgRadialGradient2.f1248cy != null ? svgRadialGradient2.f1248cy.floatValueY(this) : length.floatValueY(this);
            if (svgRadialGradient2.f1251r != null) {
                length = svgRadialGradient2.f1251r;
            }
            f = length.floatValue(this);
            f3 = floatValueX;
            f2 = floatValueY;
        } else {
            float floatValue = svgRadialGradient2.f1247cx != null ? svgRadialGradient2.f1247cx.floatValue(this, 1.0f) : 0.5f;
            float floatValue2 = svgRadialGradient2.f1248cy != null ? svgRadialGradient2.f1248cy.floatValue(this, 1.0f) : 0.5f;
            f3 = floatValue;
            f = svgRadialGradient2.f1251r != null ? svgRadialGradient2.f1251r.floatValue(this, 1.0f) : 0.5f;
            f2 = floatValue2;
        }
        statePush();
        this.state = findInheritFromAncestorState(svgRadialGradient2);
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(box2.minX, box2.minY);
            matrix.preScale(box2.width, box2.height);
        }
        if (svgRadialGradient2.gradientTransform != null) {
            matrix.preConcat(svgRadialGradient2.gradientTransform);
        }
        int size = svgRadialGradient2.children.size();
        if (size == 0) {
            statePop();
            if (z) {
                this.state.hasFill = false;
            } else {
                this.state.hasStroke = false;
            }
        } else {
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            float f4 = -1.0f;
            Iterator it = svgRadialGradient2.children.iterator();
            while (true) {
                float f5 = 0.0f;
                if (!it.hasNext()) {
                    break;
                }
                SVG.Stop stop = (SVG.Stop) ((SVG.SvgObject) it.next());
                if (stop.offset != null) {
                    f5 = stop.offset.floatValue();
                }
                if (i == 0 || f5 >= f4) {
                    fArr[i] = f5;
                    f4 = f5;
                } else {
                    fArr[i] = f4;
                }
                statePush();
                updateStyleForElement(this.state, stop);
                SVG.Colour colour = (SVG.Colour) this.state.style.stopColor;
                if (colour == null) {
                    colour = SVG.Colour.BLACK;
                }
                iArr[i] = colourWithOpacity(colour.colour, this.state.style.stopOpacity.floatValue());
                i++;
                statePop();
            }
            if (f == 0.0f || size == 1) {
                statePop();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            if (svgRadialGradient2.spreadMethod != null) {
                if (svgRadialGradient2.spreadMethod == SVG.GradientSpread.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (svgRadialGradient2.spreadMethod == SVG.GradientSpread.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            statePop();
            RadialGradient radialGradient = new RadialGradient(f3, f2, f, iArr, fArr, tileMode);
            radialGradient.setLocalMatrix(matrix);
            paint.setShader(radialGradient);
            paint.setAlpha(clamp255(this.state.style.fillOpacity.floatValue()));
        }
    }

    private void fillInChainedGradientFields(SVG.GradientElement gradientElement, String str) {
        SVG.SvgObject resolveIRI = gradientElement.document.resolveIRI(str);
        if (resolveIRI == null) {
            warn("Gradient reference '%s' not found", str);
        } else if (!(resolveIRI instanceof SVG.GradientElement)) {
            error("Gradient href attributes must point to other gradient elements", new Object[0]);
        } else if (resolveIRI == gradientElement) {
            error("Circular reference in gradient href attribute '%s'", str);
        } else {
            SVG.GradientElement gradientElement2 = (SVG.GradientElement) resolveIRI;
            if (gradientElement.gradientUnitsAreUser == null) {
                gradientElement.gradientUnitsAreUser = gradientElement2.gradientUnitsAreUser;
            }
            if (gradientElement.gradientTransform == null) {
                gradientElement.gradientTransform = gradientElement2.gradientTransform;
            }
            if (gradientElement.spreadMethod == null) {
                gradientElement.spreadMethod = gradientElement2.spreadMethod;
            }
            if (gradientElement.children.isEmpty()) {
                gradientElement.children = gradientElement2.children;
            }
            try {
                if (gradientElement instanceof SVG.SvgLinearGradient) {
                    fillInChainedGradientFields((SVG.SvgLinearGradient) gradientElement, (SVG.SvgLinearGradient) resolveIRI);
                } else {
                    fillInChainedGradientFields((SVG.SvgRadialGradient) gradientElement, (SVG.SvgRadialGradient) resolveIRI);
                }
            } catch (ClassCastException unused) {
            }
            if (gradientElement2.href != null) {
                fillInChainedGradientFields(gradientElement, gradientElement2.href);
            }
        }
    }

    private void fillInChainedGradientFields(SVG.SvgLinearGradient svgLinearGradient, SVG.SvgLinearGradient svgLinearGradient2) {
        if (svgLinearGradient.f1243x1 == null) {
            svgLinearGradient.f1243x1 = svgLinearGradient2.f1243x1;
        }
        if (svgLinearGradient.f1245y1 == null) {
            svgLinearGradient.f1245y1 = svgLinearGradient2.f1245y1;
        }
        if (svgLinearGradient.f1244x2 == null) {
            svgLinearGradient.f1244x2 = svgLinearGradient2.f1244x2;
        }
        if (svgLinearGradient.f1246y2 == null) {
            svgLinearGradient.f1246y2 = svgLinearGradient2.f1246y2;
        }
    }

    private void fillInChainedGradientFields(SVG.SvgRadialGradient svgRadialGradient, SVG.SvgRadialGradient svgRadialGradient2) {
        if (svgRadialGradient.f1247cx == null) {
            svgRadialGradient.f1247cx = svgRadialGradient2.f1247cx;
        }
        if (svgRadialGradient.f1248cy == null) {
            svgRadialGradient.f1248cy = svgRadialGradient2.f1248cy;
        }
        if (svgRadialGradient.f1251r == null) {
            svgRadialGradient.f1251r = svgRadialGradient2.f1251r;
        }
        if (svgRadialGradient.f1249fx == null) {
            svgRadialGradient.f1249fx = svgRadialGradient2.f1249fx;
        }
        if (svgRadialGradient.f1250fy == null) {
            svgRadialGradient.f1250fy = svgRadialGradient2.f1250fy;
        }
    }

    private void setSolidColor(boolean z, SVG.SolidColor solidColor) {
        boolean z2 = true;
        if (z) {
            if (isSpecified(solidColor.baseStyle, CacheValidityPolicy.MAX_AGE)) {
                this.state.style.fill = solidColor.baseStyle.solidColor;
                RendererState rendererState = this.state;
                if (solidColor.baseStyle.solidColor == null) {
                    z2 = false;
                }
                rendererState.hasFill = z2;
            }
            if (isSpecified(solidColor.baseStyle, 4294967296L)) {
                this.state.style.fillOpacity = solidColor.baseStyle.solidOpacity;
            }
            if (isSpecified(solidColor.baseStyle, 6442450944L)) {
                RendererState rendererState2 = this.state;
                setPaintColour(rendererState2, z, rendererState2.style.fill);
                return;
            }
            return;
        }
        if (isSpecified(solidColor.baseStyle, CacheValidityPolicy.MAX_AGE)) {
            this.state.style.stroke = solidColor.baseStyle.solidColor;
            RendererState rendererState3 = this.state;
            if (solidColor.baseStyle.solidColor == null) {
                z2 = false;
            }
            rendererState3.hasStroke = z2;
        }
        if (isSpecified(solidColor.baseStyle, 4294967296L)) {
            this.state.style.strokeOpacity = solidColor.baseStyle.solidOpacity;
        }
        if (isSpecified(solidColor.baseStyle, 6442450944L)) {
            RendererState rendererState4 = this.state;
            setPaintColour(rendererState4, z, rendererState4.style.stroke);
        }
    }

    private void checkForClipPath(SVG.SvgElement svgElement) {
        checkForClipPath(svgElement, svgElement.boundingBox);
    }

    private void checkForClipPath(SVG.SvgElement svgElement, SVG.Box box) {
        if (this.state.style.clipPath != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                Path calculateClipPath = calculateClipPath(svgElement, box);
                if (calculateClipPath != null) {
                    this.canvas.clipPath(calculateClipPath);
                    return;
                }
                return;
            }
            checkForClipPath_OldStyle(svgElement, box);
        }
    }

    private Path calculateClipPath(SVG.SvgElement svgElement, SVG.Box box) {
        Path objectToPath;
        SVG.SvgObject resolveIRI = svgElement.document.resolveIRI(this.state.style.clipPath);
        boolean z = false;
        if (resolveIRI == null) {
            error("ClipPath reference '%s' not found", this.state.style.clipPath);
            return null;
        }
        SVG.ClipPath clipPath = (SVG.ClipPath) resolveIRI;
        this.stateStack.push(this.state);
        this.state = findInheritFromAncestorState(clipPath);
        if (clipPath.clipPathUnitsAreUser == null || clipPath.clipPathUnitsAreUser.booleanValue()) {
            z = true;
        }
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(box.minX, box.minY);
            matrix.preScale(box.width, box.height);
        }
        if (clipPath.transform != null) {
            matrix.preConcat(clipPath.transform);
        }
        Path path = new Path();
        for (SVG.SvgObject svgObject : clipPath.children) {
            if ((svgObject instanceof SVG.SvgElement) && (objectToPath = objectToPath((SVG.SvgElement) svgObject, true)) != null) {
                path.op(objectToPath, Path.Op.UNION);
            }
        }
        if (this.state.style.clipPath != null) {
            if (clipPath.boundingBox == null) {
                clipPath.boundingBox = calculatePathBounds(path);
            }
            Path calculateClipPath = calculateClipPath(clipPath, clipPath.boundingBox);
            if (calculateClipPath != null) {
                path.op(calculateClipPath, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.state = this.stateStack.pop();
        return path;
    }

    private Path objectToPath(SVG.SvgElement svgElement, boolean z) {
        Path path;
        Path calculateClipPath;
        this.stateStack.push(this.state);
        this.state = new RendererState(this.state);
        updateStyleForElement(this.state, svgElement);
        if (!display() || !visible()) {
            this.state = this.stateStack.pop();
            return null;
        }
        if (svgElement instanceof SVG.Use) {
            if (!z) {
                error("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            SVG.Use use = (SVG.Use) svgElement;
            SVG.SvgObject resolveIRI = svgElement.document.resolveIRI(use.href);
            if (resolveIRI == null) {
                error("Use reference '%s' not found", use.href);
                this.state = this.stateStack.pop();
                return null;
            } else if (!(resolveIRI instanceof SVG.SvgElement)) {
                this.state = this.stateStack.pop();
                return null;
            } else {
                path = objectToPath((SVG.SvgElement) resolveIRI, false);
                if (path == null) {
                    return null;
                }
                if (use.boundingBox == null) {
                    use.boundingBox = calculatePathBounds(path);
                }
                if (use.transform != null) {
                    path.transform(use.transform);
                }
            }
        } else if (svgElement instanceof SVG.GraphicsElement) {
            SVG.GraphicsElement graphicsElement = (SVG.GraphicsElement) svgElement;
            if (svgElement instanceof SVG.Path) {
                path = new PathConverter(((SVG.Path) svgElement).f1233d).getPath();
                if (svgElement.boundingBox == null) {
                    svgElement.boundingBox = calculatePathBounds(path);
                }
            } else {
                path = svgElement instanceof SVG.Rect ? makePathAndBoundingBox((SVG.Rect) svgElement) : svgElement instanceof SVG.Circle ? makePathAndBoundingBox((SVG.Circle) svgElement) : svgElement instanceof SVG.Ellipse ? makePathAndBoundingBox((SVG.Ellipse) svgElement) : svgElement instanceof SVG.PolyLine ? makePathAndBoundingBox((SVG.PolyLine) svgElement) : null;
            }
            if (path == null) {
                return null;
            }
            if (graphicsElement.boundingBox == null) {
                graphicsElement.boundingBox = calculatePathBounds(path);
            }
            if (graphicsElement.transform != null) {
                path.transform(graphicsElement.transform);
            }
            path.setFillType(getClipRuleFromState());
        } else if (svgElement instanceof SVG.Text) {
            SVG.Text text = (SVG.Text) svgElement;
            path = makePathAndBoundingBox(text);
            if (path == null) {
                return null;
            }
            if (text.transform != null) {
                path.transform(text.transform);
            }
            path.setFillType(getClipRuleFromState());
        } else {
            error("Invalid %s element found in clipPath definition", svgElement.getClass().getSimpleName());
            return null;
        }
        if (!(this.state.style.clipPath == null || (calculateClipPath = calculateClipPath(svgElement, svgElement.boundingBox)) == null)) {
            path.op(calculateClipPath, Path.Op.INTERSECT);
        }
        this.state = this.stateStack.pop();
        return path;
    }

    private void checkForClipPath_OldStyle(SVG.SvgElement svgElement, SVG.Box box) {
        SVG.SvgObject resolveIRI = svgElement.document.resolveIRI(this.state.style.clipPath);
        if (resolveIRI == null) {
            error("ClipPath reference '%s' not found", this.state.style.clipPath);
            return;
        }
        SVG.ClipPath clipPath = (SVG.ClipPath) resolveIRI;
        if (clipPath.children.isEmpty()) {
            this.canvas.clipRect(0, 0, 0, 0);
            return;
        }
        boolean z = clipPath.clipPathUnitsAreUser == null || clipPath.clipPathUnitsAreUser.booleanValue();
        if (!(svgElement instanceof SVG.Group) || z) {
            clipStatePush();
            if (!z) {
                Matrix matrix = new Matrix();
                matrix.preTranslate(box.minX, box.minY);
                matrix.preScale(box.width, box.height);
                this.canvas.concat(matrix);
            }
            if (clipPath.transform != null) {
                this.canvas.concat(clipPath.transform);
            }
            this.state = findInheritFromAncestorState(clipPath);
            checkForClipPath(clipPath);
            Path path = new Path();
            for (SVG.SvgObject addObjectToClip : clipPath.children) {
                addObjectToClip(addObjectToClip, true, path, new Matrix());
            }
            this.canvas.clipPath(path);
            clipStatePop();
            return;
        }
        warn("<clipPath clipPathUnits=\"objectBoundingBox\"> is not supported when referenced from container elements (like %s)", svgElement.getClass().getSimpleName());
    }

    private void addObjectToClip(SVG.SvgObject svgObject, boolean z, Path path, Matrix matrix) {
        if (display()) {
            clipStatePush();
            if (svgObject instanceof SVG.Use) {
                if (z) {
                    addObjectToClip((SVG.Use) svgObject, path, matrix);
                } else {
                    error("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
            } else if (svgObject instanceof SVG.Path) {
                addObjectToClip((SVG.Path) svgObject, path, matrix);
            } else if (svgObject instanceof SVG.Text) {
                addObjectToClip((SVG.Text) svgObject, path, matrix);
            } else if (svgObject instanceof SVG.GraphicsElement) {
                addObjectToClip((SVG.GraphicsElement) svgObject, path, matrix);
            } else {
                error("Invalid %s element found in clipPath definition", svgObject.getClass().getSimpleName());
            }
            clipStatePop();
        }
    }

    private void clipStatePush() {
        this.canvas.save(1);
        this.stateStack.push(this.state);
        this.state = new RendererState(this.state);
    }

    private void clipStatePop() {
        this.canvas.restore();
        this.state = this.stateStack.pop();
    }

    private Path.FillType getClipRuleFromState() {
        if (this.state.style.clipRule == null || this.state.style.clipRule != SVG.Style.FillRule.EvenOdd) {
            return Path.FillType.WINDING;
        }
        return Path.FillType.EVEN_ODD;
    }

    private void addObjectToClip(SVG.Path path, Path path2, Matrix matrix) {
        updateStyleForElement(this.state, path);
        if (display() && visible()) {
            if (path.transform != null) {
                matrix.preConcat(path.transform);
            }
            Path path3 = new PathConverter(path.f1233d).getPath();
            if (path.boundingBox == null) {
                path.boundingBox = calculatePathBounds(path3);
            }
            checkForClipPath(path);
            path2.setFillType(getClipRuleFromState());
            path2.addPath(path3, matrix);
        }
    }

    private void addObjectToClip(SVG.GraphicsElement graphicsElement, Path path, Matrix matrix) {
        Path path2;
        updateStyleForElement(this.state, graphicsElement);
        if (display() && visible()) {
            if (graphicsElement.transform != null) {
                matrix.preConcat(graphicsElement.transform);
            }
            if (graphicsElement instanceof SVG.Rect) {
                path2 = makePathAndBoundingBox((SVG.Rect) graphicsElement);
            } else if (graphicsElement instanceof SVG.Circle) {
                path2 = makePathAndBoundingBox((SVG.Circle) graphicsElement);
            } else if (graphicsElement instanceof SVG.Ellipse) {
                path2 = makePathAndBoundingBox((SVG.Ellipse) graphicsElement);
            } else if (graphicsElement instanceof SVG.PolyLine) {
                path2 = makePathAndBoundingBox((SVG.PolyLine) graphicsElement);
            } else {
                return;
            }
            checkForClipPath(graphicsElement);
            path.setFillType(getClipRuleFromState());
            path.addPath(path2, matrix);
        }
    }

    private void addObjectToClip(SVG.Use use, Path path, Matrix matrix) {
        updateStyleForElement(this.state, use);
        if (display() && visible()) {
            if (use.transform != null) {
                matrix.preConcat(use.transform);
            }
            SVG.SvgObject resolveIRI = use.document.resolveIRI(use.href);
            if (resolveIRI == null) {
                error("Use reference '%s' not found", use.href);
                return;
            }
            checkForClipPath(use);
            addObjectToClip(resolveIRI, false, path, matrix);
        }
    }

    private void addObjectToClip(SVG.Text text, Path path, Matrix matrix) {
        updateStyleForElement(this.state, text);
        if (display()) {
            if (text.transform != null) {
                matrix.preConcat(text.transform);
            }
            float f = 0.0f;
            float floatValueX = (text.f1254x == null || text.f1254x.size() == 0) ? 0.0f : ((SVG.Length) text.f1254x.get(0)).floatValueX(this);
            float floatValueY = (text.f1255y == null || text.f1255y.size() == 0) ? 0.0f : ((SVG.Length) text.f1255y.get(0)).floatValueY(this);
            float floatValueX2 = (text.f1252dx == null || text.f1252dx.size() == 0) ? 0.0f : ((SVG.Length) text.f1252dx.get(0)).floatValueX(this);
            if (!(text.f1253dy == null || text.f1253dy.size() == 0)) {
                f = ((SVG.Length) text.f1253dy.get(0)).floatValueY(this);
            }
            if (this.state.style.textAnchor != SVG.Style.TextAnchor.Start) {
                float calculateTextWidth = calculateTextWidth(text);
                if (this.state.style.textAnchor == SVG.Style.TextAnchor.Middle) {
                    calculateTextWidth /= 2.0f;
                }
                floatValueX -= calculateTextWidth;
            }
            if (text.boundingBox == null) {
                TextBoundsCalculator textBoundsCalculator = new TextBoundsCalculator(floatValueX, floatValueY);
                enumerateTextSpans(text, textBoundsCalculator);
                text.boundingBox = new SVG.Box(textBoundsCalculator.bbox.left, textBoundsCalculator.bbox.top, textBoundsCalculator.bbox.width(), textBoundsCalculator.bbox.height());
            }
            checkForClipPath(text);
            Path path2 = new Path();
            enumerateTextSpans(text, new PlainTextToPath(floatValueX + floatValueX2, floatValueY + f, path2));
            path.setFillType(getClipRuleFromState());
            path.addPath(path2, matrix);
        }
    }

    private class PlainTextToPath extends TextProcessor {
        Path textAsPath;

        /* renamed from: x */
        float f1272x;

        /* renamed from: y */
        float f1273y;

        PlainTextToPath(float f, float f2, Path path) {
            super(SVGAndroidRenderer.this, (C11771) null);
            this.f1272x = f;
            this.f1273y = f2;
            this.textAsPath = path;
        }

        public boolean doTextContainer(SVG.TextContainer textContainer) {
            if (!(textContainer instanceof SVG.TextPath)) {
                return true;
            }
            SVGAndroidRenderer.warn("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        public void processText(String str) {
            if (SVGAndroidRenderer.this.visible()) {
                Path path = new Path();
                SVGAndroidRenderer.this.state.fillPaint.getTextPath(str, 0, str.length(), this.f1272x, this.f1273y, path);
                this.textAsPath.addPath(path);
            }
            this.f1272x += SVGAndroidRenderer.this.state.fillPaint.measureText(str);
        }
    }

    private Path makePathAndBoundingBox(SVG.Line line) {
        float f = 0.0f;
        float floatValueX = line.f1227x1 == null ? 0.0f : line.f1227x1.floatValueX(this);
        float floatValueY = line.f1229y1 == null ? 0.0f : line.f1229y1.floatValueY(this);
        float floatValueX2 = line.f1228x2 == null ? 0.0f : line.f1228x2.floatValueX(this);
        if (line.f1230y2 != null) {
            f = line.f1230y2.floatValueY(this);
        }
        if (line.boundingBox == null) {
            line.boundingBox = new SVG.Box(Math.min(floatValueX, floatValueX2), Math.min(floatValueY, f), Math.abs(floatValueX2 - floatValueX), Math.abs(f - floatValueY));
        }
        Path path = new Path();
        path.moveTo(floatValueX, floatValueY);
        path.lineTo(floatValueX2, f);
        return path;
    }

    private Path makePathAndBoundingBox(SVG.Rect rect) {
        float f;
        float f2;
        Path path;
        SVG.Rect rect2 = rect;
        if (rect2.f1236rx == null && rect2.f1237ry == null) {
            f2 = 0.0f;
            f = 0.0f;
        } else {
            if (rect2.f1236rx == null) {
                f2 = rect2.f1237ry.floatValueY(this);
            } else if (rect2.f1237ry == null) {
                f2 = rect2.f1236rx.floatValueX(this);
            } else {
                f2 = rect2.f1236rx.floatValueX(this);
                f = rect2.f1237ry.floatValueY(this);
            }
            f = f2;
        }
        float min = Math.min(f2, rect2.width.floatValueX(this) / 2.0f);
        float min2 = Math.min(f, rect2.height.floatValueY(this) / 2.0f);
        float floatValueX = rect2.f1238x != null ? rect2.f1238x.floatValueX(this) : 0.0f;
        float floatValueY = rect2.f1239y != null ? rect2.f1239y.floatValueY(this) : 0.0f;
        float floatValueX2 = rect2.width.floatValueX(this);
        float floatValueY2 = rect2.height.floatValueY(this);
        if (rect2.boundingBox == null) {
            rect2.boundingBox = new SVG.Box(floatValueX, floatValueY, floatValueX2, floatValueY2);
        }
        float f3 = floatValueX + floatValueX2;
        float f4 = floatValueY + floatValueY2;
        Path path2 = new Path();
        if (min == 0.0f || min2 == 0.0f) {
            path = path2;
            path.moveTo(floatValueX, floatValueY);
            path.lineTo(f3, floatValueY);
            path.lineTo(f3, f4);
            path.lineTo(floatValueX, f4);
            path.lineTo(floatValueX, floatValueY);
        } else {
            float f5 = min * BEZIER_ARC_FACTOR;
            float f6 = BEZIER_ARC_FACTOR * min2;
            float f7 = floatValueY + min2;
            path2.moveTo(floatValueX, f7);
            float f8 = f7 - f6;
            float f9 = floatValueX + min;
            float f10 = f9 - f5;
            path2.cubicTo(floatValueX, f8, f10, floatValueY, f9, floatValueY);
            float f11 = f3 - min;
            path2.lineTo(f11, floatValueY);
            float f12 = f11 + f5;
            float f13 = f7;
            path2.cubicTo(f12, floatValueY, f3, f8, f3, f13);
            float f14 = f4 - min2;
            path2.lineTo(f3, f14);
            float f15 = f6 + f14;
            path = path2;
            path2.cubicTo(f3, f15, f12, f4, f11, f4);
            path.lineTo(f9, f4);
            path.cubicTo(f10, f4, floatValueX, f15, floatValueX, f14);
            path.lineTo(floatValueX, f13);
        }
        path.close();
        return path;
    }

    private Path makePathAndBoundingBox(SVG.Circle circle) {
        SVG.Circle circle2 = circle;
        float f = 0.0f;
        float floatValueX = circle2.f1218cx != null ? circle2.f1218cx.floatValueX(this) : 0.0f;
        if (circle2.f1219cy != null) {
            f = circle2.f1219cy.floatValueY(this);
        }
        float floatValue = circle2.f1220r.floatValue(this);
        float f2 = floatValueX - floatValue;
        float f3 = f - floatValue;
        float f4 = floatValueX + floatValue;
        float f5 = f + floatValue;
        if (circle2.boundingBox == null) {
            float f6 = 2.0f * floatValue;
            circle2.boundingBox = new SVG.Box(f2, f3, f6, f6);
        }
        float f7 = BEZIER_ARC_FACTOR * floatValue;
        Path path = new Path();
        path.moveTo(floatValueX, f3);
        float f8 = floatValueX + f7;
        float f9 = f - f7;
        Path path2 = path;
        path2.cubicTo(f8, f3, f4, f9, f4, f);
        float f10 = f + f7;
        path2.cubicTo(f4, f10, f8, f5, floatValueX, f5);
        float f11 = floatValueX - f7;
        path2.cubicTo(f11, f5, f2, f10, f2, f);
        path2.cubicTo(f2, f9, f11, f3, floatValueX, f3);
        path.close();
        return path;
    }

    private Path makePathAndBoundingBox(SVG.Ellipse ellipse) {
        SVG.Ellipse ellipse2 = ellipse;
        float f = 0.0f;
        float floatValueX = ellipse2.f1221cx != null ? ellipse2.f1221cx.floatValueX(this) : 0.0f;
        if (ellipse2.f1222cy != null) {
            f = ellipse2.f1222cy.floatValueY(this);
        }
        float floatValueX2 = ellipse2.f1223rx.floatValueX(this);
        float floatValueY = ellipse2.f1224ry.floatValueY(this);
        float f2 = floatValueX - floatValueX2;
        float f3 = f - floatValueY;
        float f4 = floatValueX + floatValueX2;
        float f5 = f + floatValueY;
        if (ellipse2.boundingBox == null) {
            ellipse2.boundingBox = new SVG.Box(f2, f3, floatValueX2 * 2.0f, 2.0f * floatValueY);
        }
        float f6 = floatValueX2 * BEZIER_ARC_FACTOR;
        float f7 = BEZIER_ARC_FACTOR * floatValueY;
        Path path = new Path();
        path.moveTo(floatValueX, f3);
        float f8 = floatValueX + f6;
        float f9 = f - f7;
        Path path2 = path;
        path.cubicTo(f8, f3, f4, f9, f4, f);
        float f10 = f7 + f;
        Path path3 = path2;
        path3.cubicTo(f4, f10, f8, f5, floatValueX, f5);
        float f11 = floatValueX - f6;
        path3.cubicTo(f11, f5, f2, f10, f2, f);
        path3.cubicTo(f2, f9, f11, f3, floatValueX, f3);
        path2.close();
        return path2;
    }

    private Path makePathAndBoundingBox(SVG.PolyLine polyLine) {
        Path path = new Path();
        path.moveTo(polyLine.points[0], polyLine.points[1]);
        for (int i = 2; i < polyLine.points.length; i += 2) {
            path.lineTo(polyLine.points[i], polyLine.points[i + 1]);
        }
        if (polyLine instanceof SVG.Polygon) {
            path.close();
        }
        if (polyLine.boundingBox == null) {
            polyLine.boundingBox = calculatePathBounds(path);
        }
        return path;
    }

    private Path makePathAndBoundingBox(SVG.Text text) {
        float f = 0.0f;
        float floatValueX = (text.f1254x == null || text.f1254x.size() == 0) ? 0.0f : ((SVG.Length) text.f1254x.get(0)).floatValueX(this);
        float floatValueY = (text.f1255y == null || text.f1255y.size() == 0) ? 0.0f : ((SVG.Length) text.f1255y.get(0)).floatValueY(this);
        float floatValueX2 = (text.f1252dx == null || text.f1252dx.size() == 0) ? 0.0f : ((SVG.Length) text.f1252dx.get(0)).floatValueX(this);
        if (!(text.f1253dy == null || text.f1253dy.size() == 0)) {
            f = ((SVG.Length) text.f1253dy.get(0)).floatValueY(this);
        }
        if (this.state.style.textAnchor != SVG.Style.TextAnchor.Start) {
            float calculateTextWidth = calculateTextWidth(text);
            if (this.state.style.textAnchor == SVG.Style.TextAnchor.Middle) {
                calculateTextWidth /= 2.0f;
            }
            floatValueX -= calculateTextWidth;
        }
        if (text.boundingBox == null) {
            TextBoundsCalculator textBoundsCalculator = new TextBoundsCalculator(floatValueX, floatValueY);
            enumerateTextSpans(text, textBoundsCalculator);
            text.boundingBox = new SVG.Box(textBoundsCalculator.bbox.left, textBoundsCalculator.bbox.top, textBoundsCalculator.bbox.width(), textBoundsCalculator.bbox.height());
        }
        Path path = new Path();
        enumerateTextSpans(text, new PlainTextToPath(floatValueX + floatValueX2, floatValueY + f, path));
        return path;
    }

    private void fillWithPattern(SVG.SvgElement svgElement, Path path, SVG.Pattern pattern) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        SVG.SvgElement svgElement2 = svgElement;
        SVG.Pattern pattern2 = pattern;
        boolean z = pattern2.patternUnitsAreUser != null && pattern2.patternUnitsAreUser.booleanValue();
        if (pattern2.href != null) {
            fillInChainedPatternFields(pattern2, pattern2.href);
        }
        if (z) {
            f4 = pattern2.f1234x != null ? pattern2.f1234x.floatValueX(this) : 0.0f;
            float floatValueY = pattern2.f1235y != null ? pattern2.f1235y.floatValueY(this) : 0.0f;
            f2 = pattern2.width != null ? pattern2.width.floatValueX(this) : 0.0f;
            f = floatValueY;
            f3 = pattern2.height != null ? pattern2.height.floatValueY(this) : 0.0f;
        } else {
            float floatValue = pattern2.f1234x != null ? pattern2.f1234x.floatValue(this, 1.0f) : 0.0f;
            float floatValue2 = pattern2.f1235y != null ? pattern2.f1235y.floatValue(this, 1.0f) : 0.0f;
            float floatValue3 = pattern2.width != null ? pattern2.width.floatValue(this, 1.0f) : 0.0f;
            float floatValue4 = pattern2.height != null ? pattern2.height.floatValue(this, 1.0f) : 0.0f;
            f4 = (floatValue * svgElement2.boundingBox.width) + svgElement2.boundingBox.minX;
            float f6 = (floatValue2 * svgElement2.boundingBox.height) + svgElement2.boundingBox.minY;
            float f7 = floatValue3 * svgElement2.boundingBox.width;
            f3 = floatValue4 * svgElement2.boundingBox.height;
            float f8 = f7;
            f = f6;
            f2 = f8;
        }
        if (f2 != 0.0f && f3 != 0.0f) {
            PreserveAspectRatio preserveAspectRatio = pattern2.preserveAspectRatio != null ? pattern2.preserveAspectRatio : PreserveAspectRatio.LETTERBOX;
            statePush();
            this.canvas.clipPath(path);
            RendererState rendererState = new RendererState();
            updateStyle(rendererState, SVG.Style.getDefaultStyle());
            rendererState.style.overflow = false;
            this.state = findInheritFromAncestorState(pattern2, rendererState);
            SVG.Box box = svgElement2.boundingBox;
            if (pattern2.patternTransform != null) {
                this.canvas.concat(pattern2.patternTransform);
                Matrix matrix = new Matrix();
                if (pattern2.patternTransform.invert(matrix)) {
                    float[] fArr = {svgElement2.boundingBox.minX, svgElement2.boundingBox.minY, svgElement2.boundingBox.maxX(), svgElement2.boundingBox.minY, svgElement2.boundingBox.maxX(), svgElement2.boundingBox.maxY(), svgElement2.boundingBox.minX, svgElement2.boundingBox.maxY()};
                    matrix.mapPoints(fArr);
                    RectF rectF = new RectF(fArr[0], fArr[1], fArr[0], fArr[1]);
                    for (int i = 2; i <= 6; i += 2) {
                        if (fArr[i] < rectF.left) {
                            rectF.left = fArr[i];
                        }
                        if (fArr[i] > rectF.right) {
                            rectF.right = fArr[i];
                        }
                        int i2 = i + 1;
                        if (fArr[i2] < rectF.top) {
                            rectF.top = fArr[i2];
                        }
                        if (fArr[i2] > rectF.bottom) {
                            rectF.bottom = fArr[i2];
                        }
                    }
                    box = new SVG.Box(rectF.left, rectF.top, rectF.right - rectF.left, rectF.bottom - rectF.top);
                }
            }
            float floor = f4 + (((float) Math.floor((double) ((box.minX - f4) / f2))) * f2);
            float maxX = box.maxX();
            float maxY = box.maxY();
            SVG.Box box2 = new SVG.Box(0.0f, 0.0f, f2, f3);
            boolean pushLayer = pushLayer();
            for (float floor2 = f + (((float) Math.floor((double) ((box.minY - f) / f3))) * f3); floor2 < maxY; floor2 += f3) {
                float f9 = floor;
                while (f9 < maxX) {
                    box2.minX = f9;
                    box2.minY = floor2;
                    statePush();
                    if (!this.state.style.overflow.booleanValue()) {
                        f5 = floor;
                        setClipRect(box2.minX, box2.minY, box2.width, box2.height);
                    } else {
                        f5 = floor;
                    }
                    if (pattern2.viewBox != null) {
                        this.canvas.concat(calculateViewBoxTransform(box2, pattern2.viewBox, preserveAspectRatio));
                    } else {
                        boolean z2 = pattern2.patternContentUnitsAreUser == null || pattern2.patternContentUnitsAreUser.booleanValue();
                        this.canvas.translate(f9, floor2);
                        if (!z2) {
                            this.canvas.scale(svgElement2.boundingBox.width, svgElement2.boundingBox.height);
                        }
                    }
                    for (SVG.SvgObject render : pattern2.children) {
                        render(render);
                    }
                    statePop();
                    f9 += f2;
                    floor = f5;
                }
                float f10 = floor;
            }
            if (pushLayer) {
                popLayer(pattern2);
            }
            statePop();
        }
    }

    private void fillInChainedPatternFields(SVG.Pattern pattern, String str) {
        SVG.SvgObject resolveIRI = pattern.document.resolveIRI(str);
        if (resolveIRI == null) {
            warn("Pattern reference '%s' not found", str);
        } else if (!(resolveIRI instanceof SVG.Pattern)) {
            error("Pattern href attributes must point to other pattern elements", new Object[0]);
        } else if (resolveIRI == pattern) {
            error("Circular reference in pattern href attribute '%s'", str);
        } else {
            SVG.Pattern pattern2 = (SVG.Pattern) resolveIRI;
            if (pattern.patternUnitsAreUser == null) {
                pattern.patternUnitsAreUser = pattern2.patternUnitsAreUser;
            }
            if (pattern.patternContentUnitsAreUser == null) {
                pattern.patternContentUnitsAreUser = pattern2.patternContentUnitsAreUser;
            }
            if (pattern.patternTransform == null) {
                pattern.patternTransform = pattern2.patternTransform;
            }
            if (pattern.f1234x == null) {
                pattern.f1234x = pattern2.f1234x;
            }
            if (pattern.f1235y == null) {
                pattern.f1235y = pattern2.f1235y;
            }
            if (pattern.width == null) {
                pattern.width = pattern2.width;
            }
            if (pattern.height == null) {
                pattern.height = pattern2.height;
            }
            if (pattern.children.isEmpty()) {
                pattern.children = pattern2.children;
            }
            if (pattern.viewBox == null) {
                pattern.viewBox = pattern2.viewBox;
            }
            if (pattern.preserveAspectRatio == null) {
                pattern.preserveAspectRatio = pattern2.preserveAspectRatio;
            }
            if (pattern2.href != null) {
                fillInChainedPatternFields(pattern, pattern2.href);
            }
        }
    }

    private void renderMask(SVG.Mask mask, SVG.SvgElement svgElement) {
        float f;
        float f2;
        debug("Mask render", new Object[0]);
        boolean z = true;
        if (mask.maskUnitsAreUser != null && mask.maskUnitsAreUser.booleanValue()) {
            f2 = mask.width != null ? mask.width.floatValueX(this) : svgElement.boundingBox.width;
            f = mask.height != null ? mask.height.floatValueY(this) : svgElement.boundingBox.height;
        } else {
            float f3 = 1.2f;
            float floatValue = mask.width != null ? mask.width.floatValue(this, 1.0f) : 1.2f;
            if (mask.height != null) {
                f3 = mask.height.floatValue(this, 1.0f);
            }
            f2 = floatValue * svgElement.boundingBox.width;
            f = f3 * svgElement.boundingBox.height;
        }
        if (f2 != 0.0f && f != 0.0f) {
            statePush();
            this.state = findInheritFromAncestorState(mask);
            this.state.style.opacity = Float.valueOf(1.0f);
            if (mask.maskContentUnitsAreUser != null && !mask.maskContentUnitsAreUser.booleanValue()) {
                z = false;
            }
            if (!z) {
                this.canvas.translate(svgElement.boundingBox.minX, svgElement.boundingBox.minY);
                this.canvas.scale(svgElement.boundingBox.width, svgElement.boundingBox.height);
            }
            renderChildren(mask, false);
            statePop();
        }
    }
}
