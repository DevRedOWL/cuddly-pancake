package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.uimanager.annotations.ReactProp;

class CircleShadowNode extends RenderableShadowNode {
    private String mCx;
    private String mCy;

    /* renamed from: mR */
    private String f2270mR;

    CircleShadowNode() {
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

    @ReactProp(name = "r")
    public void setR(String str) {
        this.f2270mR = str;
        markUpdated();
    }

    /* access modifiers changed from: protected */
    public Path getPath(Canvas canvas, Paint paint) {
        double d;
        Path path = new Path();
        double relativeOnWidth = relativeOnWidth(this.mCx);
        double relativeOnHeight = relativeOnHeight(this.mCy);
        if (PropHelper.isPercentage(this.f2270mR)) {
            d = relativeOnOther(this.f2270mR);
        } else {
            d = Double.parseDouble(this.f2270mR) * ((double) this.mScale);
        }
        path.addCircle((float) relativeOnWidth, (float) relativeOnHeight, (float) d, Path.Direction.CW);
        return path;
    }
}
