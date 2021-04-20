package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.horcrux.svg.VirtualNode;
import javax.annotation.Nullable;

class GroupShadowNode extends RenderableShadowNode {
    @Nullable
    ReadableMap mFont;
    private GlyphContext mGlyphContext;

    GroupShadowNode() {
    }

    @ReactProp(name = "font")
    public void setFont(@Nullable ReadableMap readableMap) {
        this.mFont = readableMap;
        markUpdated();
    }

    /* access modifiers changed from: package-private */
    public void setupGlyphContext(Canvas canvas) {
        RectF rectF = new RectF(canvas.getClipBounds());
        this.mMatrix.mapRect(rectF);
        this.mGlyphContext = new GlyphContext(this.mScale, rectF.width(), rectF.height());
    }

    /* access modifiers changed from: package-private */
    public GlyphContext getGlyphContext() {
        return this.mGlyphContext;
    }

    /* access modifiers changed from: package-private */
    public GlyphContext getTextRootGlyphContext() {
        return getTextRoot().getGlyphContext();
    }

    /* access modifiers changed from: package-private */
    public void pushGlyphContext() {
        getTextRootGlyphContext().pushContext(this, this.mFont);
    }

    /* access modifiers changed from: package-private */
    public void popGlyphContext() {
        getTextRootGlyphContext().popContext();
    }

    public void draw(Canvas canvas, Paint paint, float f) {
        setupGlyphContext(canvas);
        if (f > 0.01f) {
            clip(canvas, paint);
            drawGroup(canvas, paint, f);
        }
    }

    /* access modifiers changed from: package-private */
    public void drawGroup(Canvas canvas, Paint paint, float f) {
        pushGlyphContext();
        final SvgViewShadowNode svgShadowNode = getSvgShadowNode();
        RectF rectF = new RectF();
        final Canvas canvas2 = canvas;
        final Paint paint2 = paint;
        final float f2 = f;
        final RectF rectF2 = rectF;
        traverseChildren(new VirtualNode.NodeRunnable() {
            public void run(ReactShadowNode reactShadowNode) {
                if (reactShadowNode instanceof VirtualNode) {
                    VirtualNode virtualNode = (VirtualNode) reactShadowNode;
                    boolean z = virtualNode instanceof RenderableShadowNode;
                    if (z) {
                        ((RenderableShadowNode) virtualNode).mergeProperties(this);
                    }
                    int saveAndSetupCanvas = virtualNode.saveAndSetupCanvas(canvas2);
                    virtualNode.draw(canvas2, paint2, f2 * GroupShadowNode.this.mOpacity);
                    RectF clientRect = virtualNode.getClientRect();
                    if (clientRect != null) {
                        rectF2.union(clientRect);
                    }
                    virtualNode.restoreCanvas(canvas2, saveAndSetupCanvas);
                    if (z) {
                        ((RenderableShadowNode) virtualNode).resetProperties();
                    }
                    virtualNode.markUpdateSeen();
                    if (virtualNode.isResponsible()) {
                        svgShadowNode.enableTouchEvents();
                    }
                } else if (reactShadowNode instanceof SvgViewShadowNode) {
                    ((SvgViewShadowNode) reactShadowNode).drawChildren(canvas2);
                } else {
                    reactShadowNode.calculateLayout();
                }
            }
        });
        setClientRect(rectF);
        popGlyphContext();
    }

    /* access modifiers changed from: package-private */
    public void drawPath(Canvas canvas, Paint paint, float f) {
        super.draw(canvas, paint, f);
    }

    /* access modifiers changed from: protected */
    public Path getPath(final Canvas canvas, final Paint paint) {
        final Path path = new Path();
        traverseChildren(new VirtualNode.NodeRunnable() {
            public void run(ReactShadowNode reactShadowNode) {
                if (reactShadowNode instanceof VirtualNode) {
                    path.addPath(((VirtualNode) reactShadowNode).getPath(canvas, paint));
                }
            }
        });
        return path;
    }

    public int hitTest(float[] fArr) {
        VirtualNode virtualNode;
        int hitTest;
        if (!this.mInvertible) {
            return -1;
        }
        float[] fArr2 = new float[2];
        this.mInvMatrix.mapPoints(fArr2, fArr);
        int round = Math.round(fArr2[0]);
        int round2 = Math.round(fArr2[1]);
        Path clipPath = getClipPath();
        if (clipPath != null) {
            if (this.mClipRegionPath != clipPath) {
                this.mClipRegionPath = clipPath;
                this.mClipRegion = getRegion(clipPath);
            }
            if (!this.mClipRegion.contains(round, round2)) {
                return -1;
            }
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            ReactShadowNodeImpl childAt = getChildAt(childCount);
            if ((childAt instanceof VirtualNode) && (hitTest = virtualNode.hitTest(fArr2)) != -1) {
                return ((virtualNode = (VirtualNode) childAt).isResponsible() || hitTest != childAt.getReactTag()) ? hitTest : getReactTag();
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgShadowNode().defineTemplate(this, this.mName);
        }
        traverseChildren(new VirtualNode.NodeRunnable() {
            public void run(ReactShadowNode reactShadowNode) {
                if (reactShadowNode instanceof VirtualNode) {
                    ((VirtualNode) reactShadowNode).saveDefinition();
                }
            }
        });
    }

    public void resetProperties() {
        traverseChildren(new VirtualNode.NodeRunnable() {
            public void run(ReactShadowNode reactShadowNode) {
                if (reactShadowNode instanceof RenderableShadowNode) {
                    ((RenderableShadowNode) reactShadowNode).resetProperties();
                }
            }
        });
    }
}
