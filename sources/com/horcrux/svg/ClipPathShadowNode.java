package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.common.logging.FLog;
import com.facebook.react.common.ReactConstants;

class ClipPathShadowNode extends GroupShadowNode {
    public int hitTest(float[] fArr) {
        return -1;
    }

    public boolean isResponsible() {
        return false;
    }

    public void mergeProperties(RenderableShadowNode renderableShadowNode) {
    }

    public void resetProperties() {
    }

    ClipPathShadowNode() {
    }

    public void draw(Canvas canvas, Paint paint, float f) {
        FLog.m662w(ReactConstants.TAG, "RNSVG: ClipPath can't be drawn, it should be defined as a child component for `Defs` ");
    }

    /* access modifiers changed from: protected */
    public void saveDefinition() {
        getSvgShadowNode().defineClipPath(this, this.mName);
    }
}
