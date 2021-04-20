package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

class DefinitionShadowNode extends VirtualNode {
    public void draw(Canvas canvas, Paint paint, float f) {
    }

    /* access modifiers changed from: protected */
    public Path getPath(Canvas canvas, Paint paint) {
        return null;
    }

    public int hitTest(float[] fArr) {
        return -1;
    }

    public boolean isResponsible() {
        return false;
    }

    DefinitionShadowNode() {
    }
}
