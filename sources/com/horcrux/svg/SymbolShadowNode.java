package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.uimanager.annotations.ReactProp;

class SymbolShadowNode extends GroupShadowNode {
    private String mAlign;
    private int mMeetOrSlice;
    private float mMinX;
    private float mMinY;
    private float mVbHeight;
    private float mVbWidth;

    SymbolShadowNode() {
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

    public void draw(Canvas canvas, Paint paint, float f) {
        saveDefinition();
    }

    /* access modifiers changed from: package-private */
    public void drawSymbol(Canvas canvas, Paint paint, float f, float f2, float f3) {
        if (this.mAlign != null) {
            canvas.concat(ViewBox.getTransform(new RectF(this.mMinX * this.mScale, this.mMinY * this.mScale, (this.mMinX + this.mVbWidth) * this.mScale, (this.mMinY + this.mVbHeight) * this.mScale), new RectF(0.0f, 0.0f, f2, f3), this.mAlign, this.mMeetOrSlice));
            super.draw(canvas, paint, f);
        }
    }
}
