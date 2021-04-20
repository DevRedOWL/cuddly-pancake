package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.uimanager.annotations.ReactProp;

class EllipseShadowNode extends RenderableShadowNode {
    private String mCx;
    private String mCy;
    private String mRx;
    private String mRy;

    EllipseShadowNode() {
    }

    @ReactProp(name = "cx")
    public void setCx(String str) {
        this.mCx = str;
        markUpdated();
    }

    @ReactProp(name = "cy")
    public void setCy(String str) {
        this.mCy = str;
        markUpdated();
    }

    @ReactProp(name = "rx")
    public void setRx(String str) {
        this.mRx = str;
        markUpdated();
    }

    @ReactProp(name = "ry")
    public void setRy(String str) {
        this.mRy = str;
        markUpdated();
    }

    /* access modifiers changed from: protected */
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double relativeOnWidth = relativeOnWidth(this.mCx);
        double relativeOnHeight = relativeOnHeight(this.mCy);
        double relativeOnWidth2 = relativeOnWidth(this.mRx);
        double relativeOnHeight2 = relativeOnHeight(this.mRy);
        path.addOval(new RectF((float) (relativeOnWidth - relativeOnWidth2), (float) (relativeOnHeight - relativeOnHeight2), (float) (relativeOnWidth + relativeOnWidth2), (float) (relativeOnHeight + relativeOnHeight2)), Path.Direction.CW);
        return path;
    }
}
