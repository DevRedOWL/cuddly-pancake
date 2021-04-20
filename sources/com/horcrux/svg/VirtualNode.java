package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.OnLayoutEvent;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.github.mikephil.charting.utils.Utils;
import javax.annotation.Nullable;

abstract class VirtualNode extends LayoutShadowNode {
    private static final int CLIP_RULE_EVENODD = 0;
    private static final int CLIP_RULE_NONZERO = 1;
    static final float MIN_OPACITY_FOR_DRAW = 0.01f;
    private static final double M_SQRT1_2l = 0.7071067811865476d;
    private static final float[] sRawMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private float canvasHeight = -1.0f;
    private float canvasWidth = -1.0f;
    private GlyphContext glyphContext;
    RectF mBox;
    private Path mCachedClipPath;
    RectF mClientRect;
    @Nullable
    private String mClipPath;
    Region mClipRegion;
    Path mClipRegionPath;
    private int mClipRule;
    Matrix mInvMatrix = new Matrix();
    boolean mInvertible = true;
    Matrix mMatrix = new Matrix();
    String mName;
    float mOpacity = 1.0f;
    Path mPath;
    Region mRegion;
    private boolean mResponsible;
    final float mScale;
    private SvgViewShadowNode mSvgShadowNode;
    private GroupShadowNode mTextRoot;

    interface NodeRunnable {
        void run(ReactShadowNode reactShadowNode);
    }

    public abstract void draw(Canvas canvas, Paint paint, float f);

    /* access modifiers changed from: protected */
    public abstract Path getPath(Canvas canvas, Paint paint);

    public abstract int hitTest(float[] fArr);

    public boolean isVirtual() {
        return true;
    }

    public boolean isVirtualAnchor() {
        return true;
    }

    VirtualNode() {
        setIsLayoutOnly(true);
        this.mScale = DisplayMetricsHolder.getScreenDisplayMetrics().density;
    }

    public void markUpdated() {
        super.markUpdated();
        this.canvasHeight = -1.0f;
        this.canvasWidth = -1.0f;
        this.mRegion = null;
        this.mPath = null;
        this.mBox = null;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public GroupShadowNode getTextRoot() {
        if (this.mTextRoot == null) {
            VirtualNode virtualNode = this;
            while (true) {
                if (virtualNode == null) {
                    break;
                }
                if (virtualNode instanceof GroupShadowNode) {
                    GroupShadowNode groupShadowNode = (GroupShadowNode) virtualNode;
                    if (groupShadowNode.getGlyphContext() != null) {
                        this.mTextRoot = groupShadowNode;
                        break;
                    }
                }
                ReactShadowNodeImpl parent = virtualNode.getParent();
                if (!(parent instanceof VirtualNode)) {
                    virtualNode = null;
                } else {
                    virtualNode = (VirtualNode) parent;
                }
            }
        }
        return this.mTextRoot;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public GroupShadowNode getParentTextRoot() {
        ReactShadowNodeImpl parent = getParent();
        if (!(parent instanceof VirtualNode)) {
            return null;
        }
        return ((VirtualNode) parent).getTextRoot();
    }

    private double getFontSizeFromContext() {
        GroupShadowNode textRoot = getTextRoot();
        if (textRoot == null) {
            return 12.0d;
        }
        if (this.glyphContext == null) {
            this.glyphContext = textRoot.getGlyphContext();
        }
        return this.glyphContext.getFontSize();
    }

    /* access modifiers changed from: package-private */
    public int saveAndSetupCanvas(Canvas canvas) {
        int save = canvas.save();
        canvas.concat(this.mMatrix);
        return save;
    }

    /* access modifiers changed from: package-private */
    public void restoreCanvas(Canvas canvas, int i) {
        canvas.restoreToCount(i);
    }

    @ReactProp(name = "name")
    public void setName(String str) {
        this.mName = str;
        markUpdated();
    }

    @ReactProp(name = "clipPath")
    public void setClipPath(String str) {
        this.mCachedClipPath = null;
        this.mClipPath = str;
        markUpdated();
    }

    @ReactProp(defaultInt = 1, name = "clipRule")
    public void clipRule(int i) {
        this.mClipRule = i;
        markUpdated();
    }

    @ReactProp(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(float f) {
        this.mOpacity = f;
        markUpdated();
    }

    @ReactProp(name = "matrix")
    public void setMatrix(@Nullable ReadableArray readableArray) {
        if (readableArray != null) {
            int matrixData = PropHelper.toMatrixData(readableArray, sRawMatrix, this.mScale);
            if (matrixData == 6) {
                if (this.mMatrix == null) {
                    this.mMatrix = new Matrix();
                    this.mInvMatrix = new Matrix();
                }
                this.mMatrix.setValues(sRawMatrix);
                this.mInvertible = this.mMatrix.invert(this.mInvMatrix);
            } else if (matrixData != -1) {
                FLog.m662w(ReactConstants.TAG, "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.mMatrix = null;
            this.mInvMatrix = null;
        }
        super.markUpdated();
    }

    @ReactProp(name = "responsible")
    public void setResponsible(boolean z) {
        this.mResponsible = z;
        markUpdated();
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public Path getClipPath() {
        return this.mCachedClipPath;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public Path getClipPath(Canvas canvas, Paint paint) {
        if (this.mClipPath != null) {
            VirtualNode definedClipPath = getSvgShadowNode().getDefinedClipPath(this.mClipPath);
            if (definedClipPath != null) {
                Path path = definedClipPath.getPath(canvas, paint);
                int i = this.mClipRule;
                if (i == 0) {
                    path.setFillType(Path.FillType.EVEN_ODD);
                } else if (i != 1) {
                    FLog.m662w(ReactConstants.TAG, "RNSVG: clipRule: " + this.mClipRule + " unrecognized");
                }
                this.mCachedClipPath = path;
            } else {
                FLog.m662w(ReactConstants.TAG, "RNSVG: Undefined clipPath: " + this.mClipPath);
            }
        }
        return getClipPath();
    }

    /* access modifiers changed from: package-private */
    public void clip(Canvas canvas, Paint paint) {
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath, Region.Op.REPLACE);
        }
    }

    public boolean isResponsible() {
        return this.mResponsible;
    }

    /* access modifiers changed from: package-private */
    public SvgViewShadowNode getSvgShadowNode() {
        SvgViewShadowNode svgViewShadowNode = this.mSvgShadowNode;
        if (svgViewShadowNode != null) {
            return svgViewShadowNode;
        }
        ReactShadowNodeImpl parent = getParent();
        if (parent instanceof SvgViewShadowNode) {
            this.mSvgShadowNode = (SvgViewShadowNode) parent;
        } else if (parent instanceof VirtualNode) {
            this.mSvgShadowNode = ((VirtualNode) parent).getSvgShadowNode();
        } else {
            FLog.m622e(ReactConstants.TAG, "RNSVG: " + getClass().getName() + " should be descendant of a SvgViewShadow.");
        }
        return this.mSvgShadowNode;
    }

    /* access modifiers changed from: package-private */
    public double relativeOnWidth(String str) {
        return PropHelper.fromRelative(str, (double) getCanvasWidth(), Utils.DOUBLE_EPSILON, (double) this.mScale, getFontSizeFromContext());
    }

    /* access modifiers changed from: package-private */
    public double relativeOnHeight(String str) {
        return PropHelper.fromRelative(str, (double) getCanvasHeight(), Utils.DOUBLE_EPSILON, (double) this.mScale, getFontSizeFromContext());
    }

    /* access modifiers changed from: package-private */
    public double relativeOnOther(String str) {
        return PropHelper.fromRelative(str, Math.sqrt(Math.pow((double) getCanvasWidth(), 2.0d) + Math.pow((double) getCanvasHeight(), 2.0d)) * M_SQRT1_2l, Utils.DOUBLE_EPSILON, (double) this.mScale, getFontSizeFromContext());
    }

    private float getCanvasWidth() {
        float f = this.canvasWidth;
        if (f != -1.0f) {
            return f;
        }
        GroupShadowNode textRoot = getTextRoot();
        if (textRoot == null) {
            this.canvasWidth = (float) getSvgShadowNode().getCanvasBounds().width();
        } else {
            this.canvasWidth = textRoot.getGlyphContext().getWidth();
        }
        return this.canvasWidth;
    }

    private float getCanvasHeight() {
        float f = this.canvasHeight;
        if (f != -1.0f) {
            return f;
        }
        GroupShadowNode textRoot = getTextRoot();
        if (textRoot == null) {
            this.canvasHeight = (float) getSvgShadowNode().getCanvasBounds().height();
        } else {
            this.canvasHeight = textRoot.getGlyphContext().getHeight();
        }
        return this.canvasHeight;
    }

    /* access modifiers changed from: package-private */
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgShadowNode().defineTemplate(this, this.mName);
        }
    }

    /* access modifiers changed from: package-private */
    public void traverseChildren(NodeRunnable nodeRunnable) {
        for (int i = 0; i < getChildCount(); i++) {
            nodeRunnable.run(getChildAt(i));
        }
    }

    /* access modifiers changed from: package-private */
    public void setClientRect(RectF rectF) {
        RectF rectF2 = this.mClientRect;
        if (rectF2 == null || !rectF2.equals(rectF)) {
            this.mClientRect = rectF;
            if (this.mClientRect != null) {
                ((UIManagerModule) getThemedContext().getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(OnLayoutEvent.obtain(getReactTag(), (int) this.mClientRect.left, (int) this.mClientRect.top, (int) this.mClientRect.width(), (int) this.mClientRect.height()));
            }
        }
    }

    public RectF getClientRect() {
        return this.mClientRect;
    }
}
