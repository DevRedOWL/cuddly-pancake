package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.uimanager.annotations.ReactProp;

class LineShadowNode extends RenderableShadowNode {
    private String mX1;
    private String mX2;
    private String mY1;
    private String mY2;

    LineShadowNode() {
    }

    @ReactProp(name = "x1")
    public void setX1(String str) {
        this.mX1 = str;
        markUpdated();
    }

    @ReactProp(name = "y1")
    public void setY1(String str) {
        this.mY1 = str;
        markUpdated();
    }

    @ReactProp(name = "x2")
    public void setX2(String str) {
        this.mX2 = str;
        markUpdated();
    }

    @ReactProp(name = "y2")
    public void setY2(String str) {
        this.mY2 = str;
        markUpdated();
    }

    /* access modifiers changed from: protected */
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double relativeOnWidth = relativeOnWidth(this.mX1);
        double relativeOnHeight = relativeOnHeight(this.mY1);
        double relativeOnWidth2 = relativeOnWidth(this.mX2);
        double relativeOnHeight2 = relativeOnHeight(this.mY2);
        path.moveTo((float) relativeOnWidth, (float) relativeOnHeight);
        path.lineTo((float) relativeOnWidth2, (float) relativeOnHeight2);
        return path;
    }
}
