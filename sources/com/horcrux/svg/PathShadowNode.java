package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.horcrux.svg.PropHelper;

class PathShadowNode extends RenderableShadowNode {
    private Path mPath;

    PathShadowNode() {
    }

    @ReactProp(name = "d")
    public void setD(String str) {
        this.mPath = new PropHelper.PathParser(str, this.mScale).getPath();
        markUpdated();
    }

    /* access modifiers changed from: protected */
    public Path getPath(Canvas canvas, Paint paint) {
        return this.mPath;
    }

    public Path getPath() {
        return this.mPath;
    }
}
