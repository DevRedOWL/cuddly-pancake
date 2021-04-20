package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.github.mikephil.charting.utils.Utils;

class RectShadowNode extends RenderableShadowNode {

    /* renamed from: mH */
    private String f2278mH;
    private String mRx;
    private String mRy;

    /* renamed from: mW */
    private String f2279mW;

    /* renamed from: mX */
    private String f2280mX;

    /* renamed from: mY */
    private String f2281mY;

    RectShadowNode() {
    }

    @ReactProp(name = "x")
    public void setX(String str) {
        this.f2280mX = str;
        markUpdated();
    }

    @ReactProp(name = "y")
    public void setY(String str) {
        this.f2281mY = str;
        markUpdated();
    }

    @ReactProp(name = "width")
    public void setWidth(String str) {
        this.f2279mW = str;
        markUpdated();
    }

    @ReactProp(name = "height")
    public void setHeight(String str) {
        this.f2278mH = str;
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
        double relativeOnWidth = relativeOnWidth(this.f2280mX);
        double relativeOnHeight = relativeOnHeight(this.f2281mY);
        double relativeOnWidth2 = relativeOnWidth(this.f2279mW);
        double relativeOnHeight2 = relativeOnHeight(this.f2278mH);
        double relativeOnWidth3 = relativeOnWidth(this.mRx);
        double relativeOnHeight3 = relativeOnHeight(this.mRy);
        int i = (relativeOnWidth3 > Utils.DOUBLE_EPSILON ? 1 : (relativeOnWidth3 == Utils.DOUBLE_EPSILON ? 0 : -1));
        if (i == 0 && relativeOnHeight3 == Utils.DOUBLE_EPSILON) {
            path.addRect((float) relativeOnWidth, (float) relativeOnHeight, (float) (relativeOnWidth + relativeOnWidth2), (float) (relativeOnHeight + relativeOnHeight2), Path.Direction.CW);
        } else {
            if (i == 0) {
                relativeOnWidth3 = relativeOnHeight3;
            } else if (relativeOnHeight3 == Utils.DOUBLE_EPSILON) {
                relativeOnHeight3 = relativeOnWidth3;
            }
            double d = relativeOnWidth2 / 2.0d;
            if (relativeOnWidth3 > d) {
                relativeOnWidth3 = d;
            }
            double d2 = relativeOnHeight2 / 2.0d;
            if (relativeOnHeight3 <= d2) {
                d2 = relativeOnHeight3;
            }
            path.addRoundRect(new RectF((float) relativeOnWidth, (float) relativeOnHeight, (float) (relativeOnWidth + relativeOnWidth2), (float) (relativeOnHeight + relativeOnHeight2)), (float) relativeOnWidth3, (float) d2, Path.Direction.CW);
        }
        return path;
    }
}
