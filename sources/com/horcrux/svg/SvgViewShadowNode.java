package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.Base64;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.horcrux.svg.VirtualNode;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

public class SvgViewShadowNode extends LayoutShadowNode {
    private String mAlign;
    private Canvas mCanvas;
    private final Map<String, Brush> mDefinedBrushes = new HashMap();
    private final Map<String, VirtualNode> mDefinedClipPaths = new HashMap();
    private final Map<String, VirtualNode> mDefinedTemplates = new HashMap();
    private Matrix mInvViewBoxMatrix = new Matrix();
    private boolean mInvertible = true;
    private int mMeetOrSlice;
    private float mMinX;
    private float mMinY;
    /* access modifiers changed from: private */
    public boolean mResponsible = false;
    private final float mScale = DisplayMetricsHolder.getScreenDisplayMetrics().density;
    private float mVbHeight;
    private float mVbWidth;
    private String mbbHeight;
    private String mbbWidth;

    public boolean isVirtual() {
        return false;
    }

    public boolean isVirtualAnchor() {
        return false;
    }

    @ReactProp(name = "minX")
    public void setMinX(float f) {
        this.mMinX = f;
        markUpdated();
    }

    @ReactProp(name = "minY")
    public void setMinY(float f) {
        this.mMinY = f;
        markUpdated();
    }

    @ReactProp(name = "vbWidth")
    public void setVbWidth(float f) {
        this.mVbWidth = f;
        markUpdated();
    }

    @ReactProp(name = "vbHeight")
    public void setVbHeight(float f) {
        this.mVbHeight = f;
        markUpdated();
    }

    @ReactProp(name = "bbWidth")
    public void setVbWidth(String str) {
        this.mbbWidth = str;
        markUpdated();
    }

    @ReactProp(name = "bbHeight")
    public void setVbHeight(String str) {
        this.mbbHeight = str;
        markUpdated();
    }

    @ReactProp(name = "align")
    public void setAlign(String str) {
        this.mAlign = str;
        markUpdated();
    }

    @ReactProp(name = "meetOrSlice")
    public void setMeetOrSlice(int i) {
        this.mMeetOrSlice = i;
        markUpdated();
    }

    public void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
        super.onCollectExtraUpdates(uIViewOperationQueue);
        uIViewOperationQueue.enqueueUpdateExtraData(getReactTag(), drawOutput());
    }

    public void setReactTag(int i) {
        super.setReactTag(i);
        SvgViewManager.setShadowNode(this);
    }

    private Object drawOutput() {
        int layoutWidth = (int) getLayoutWidth();
        int layoutHeight = (int) getLayoutHeight();
        if (layoutHeight == 0 || layoutWidth == 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(layoutWidth, layoutHeight, Bitmap.Config.ARGB_8888);
        drawChildren(new Canvas(createBitmap));
        return createBitmap;
    }

    /* access modifiers changed from: package-private */
    public Rect getCanvasBounds() {
        return this.mCanvas.getClipBounds();
    }

    /* access modifiers changed from: package-private */
    public void drawChildren(final Canvas canvas) {
        float f;
        float f2;
        this.mCanvas = canvas;
        if (this.mAlign != null) {
            RectF viewBox = getViewBox();
            boolean z = getNativeParent() instanceof SvgViewShadowNode;
            if (z) {
                f2 = Float.parseFloat(this.mbbWidth) * this.mScale;
                f = Float.parseFloat(this.mbbHeight) * this.mScale;
            } else {
                f2 = getLayoutWidth();
                f = getLayoutHeight();
            }
            RectF rectF = new RectF(0.0f, 0.0f, f2, f);
            if (z) {
                canvas.clipRect(rectF);
            }
            Matrix transform = ViewBox.getTransform(viewBox, rectF, this.mAlign, this.mMeetOrSlice);
            this.mInvertible = transform.invert(this.mInvViewBoxMatrix);
            canvas.concat(transform);
        }
        final Paint paint = new Paint();
        paint.setFlags(385);
        paint.setTypeface(Typeface.DEFAULT);
        traverseChildren(new VirtualNode.NodeRunnable() {
            public void run(ReactShadowNode reactShadowNode) {
                if (reactShadowNode instanceof VirtualNode) {
                    ((VirtualNode) reactShadowNode).saveDefinition();
                }
            }
        });
        traverseChildren(new VirtualNode.NodeRunnable() {
            public void run(ReactShadowNode reactShadowNode) {
                if (reactShadowNode instanceof VirtualNode) {
                    VirtualNode virtualNode = (VirtualNode) reactShadowNode;
                    int saveAndSetupCanvas = virtualNode.saveAndSetupCanvas(canvas);
                    virtualNode.draw(canvas, paint, 1.0f);
                    virtualNode.restoreCanvas(canvas, saveAndSetupCanvas);
                    virtualNode.markUpdateSeen();
                    if (virtualNode.isResponsible() && !SvgViewShadowNode.this.mResponsible) {
                        boolean unused = SvgViewShadowNode.this.mResponsible = true;
                        return;
                    }
                    return;
                }
                reactShadowNode.calculateLayout();
            }
        });
    }

    private RectF getViewBox() {
        float f = this.mMinX;
        float f2 = this.mScale;
        float f3 = this.mMinY;
        return new RectF(f * f2, f3 * f2, (f + this.mVbWidth) * f2, (f3 + this.mVbHeight) * f2);
    }

    /* access modifiers changed from: package-private */
    public String toDataURL() {
        Bitmap createBitmap = Bitmap.createBitmap((int) getLayoutWidth(), (int) getLayoutHeight(), Bitmap.Config.ARGB_8888);
        drawChildren(new Canvas(createBitmap));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        createBitmap.recycle();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }

    /* access modifiers changed from: package-private */
    public void enableTouchEvents() {
        if (!this.mResponsible) {
            this.mResponsible = true;
        }
    }

    /* access modifiers changed from: package-private */
    public int hitTest(Point point) {
        if (!this.mResponsible || !this.mInvertible) {
            return -1;
        }
        float[] fArr = {(float) point.x, (float) point.y};
        this.mInvViewBoxMatrix.mapPoints(fArr);
        int childCount = getChildCount() - 1;
        int i = -1;
        while (childCount >= 0 && (!(getChildAt(childCount) instanceof VirtualNode) || (i = ((VirtualNode) getChildAt(childCount)).hitTest(fArr)) == -1)) {
            childCount--;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public void defineClipPath(VirtualNode virtualNode, String str) {
        this.mDefinedClipPaths.put(str, virtualNode);
    }

    /* access modifiers changed from: package-private */
    public VirtualNode getDefinedClipPath(String str) {
        return this.mDefinedClipPaths.get(str);
    }

    /* access modifiers changed from: package-private */
    public void defineTemplate(VirtualNode virtualNode, String str) {
        this.mDefinedTemplates.put(str, virtualNode);
    }

    /* access modifiers changed from: package-private */
    public VirtualNode getDefinedTemplate(String str) {
        return this.mDefinedTemplates.get(str);
    }

    /* access modifiers changed from: package-private */
    public void defineBrush(Brush brush, String str) {
        this.mDefinedBrushes.put(str, brush);
    }

    /* access modifiers changed from: package-private */
    public Brush getDefinedBrush(String str) {
        return this.mDefinedBrushes.get(str);
    }

    /* access modifiers changed from: package-private */
    public void traverseChildren(VirtualNode.NodeRunnable nodeRunnable) {
        for (int i = 0; i < getChildCount(); i++) {
            nodeRunnable.run(getChildAt(i));
        }
    }
}
