package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.common.logging.FLog;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.annotations.ReactProp;

class UseShadowNode extends RenderableShadowNode {
    private String mHeight;
    private String mHref;
    private String mWidth;

    UseShadowNode() {
    }

    @ReactProp(name = "href")
    public void setHref(String str) {
        this.mHref = str;
        markUpdated();
    }

    @ReactProp(name = "width")
    public void setWidth(String str) {
        this.mWidth = str;
        markUpdated();
    }

    @ReactProp(name = "height")
    public void setHeight(String str) {
        this.mHeight = str;
        markUpdated();
    }

    public void draw(Canvas canvas, Paint paint, float f) {
        VirtualNode definedTemplate = getSvgShadowNode().getDefinedTemplate(this.mHref);
        if (definedTemplate != null) {
            boolean z = definedTemplate instanceof RenderableShadowNode;
            if (z) {
                ((RenderableShadowNode) definedTemplate).mergeProperties(this);
            }
            int saveAndSetupCanvas = definedTemplate.saveAndSetupCanvas(canvas);
            clip(canvas, paint);
            if (definedTemplate instanceof SymbolShadowNode) {
                ((SymbolShadowNode) definedTemplate).drawSymbol(canvas, paint, f, (float) relativeOnWidth(this.mWidth), (float) relativeOnHeight(this.mHeight));
            } else {
                definedTemplate.draw(canvas, paint, f * this.mOpacity);
            }
            setClientRect(definedTemplate.getClientRect());
            definedTemplate.restoreCanvas(canvas, saveAndSetupCanvas);
            if (z) {
                ((RenderableShadowNode) definedTemplate).resetProperties();
                return;
            }
            return;
        }
        FLog.m662w(ReactConstants.TAG, "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.mHref + " is not defined.");
    }

    public int hitTest(float[] fArr) {
        if (!this.mInvertible) {
            return -1;
        }
        float[] fArr2 = new float[2];
        this.mInvMatrix.mapPoints(fArr2, fArr);
        VirtualNode definedTemplate = getSvgShadowNode().getDefinedTemplate(this.mHref);
        int hitTest = definedTemplate.hitTest(fArr2);
        if (hitTest != -1) {
            return (definedTemplate.isResponsible() || hitTest != definedTemplate.getReactTag()) ? hitTest : getReactTag();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public Path getPath(Canvas canvas, Paint paint) {
        return new Path();
    }
}
