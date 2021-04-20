package com.horcrux.svg;

import android.graphics.Matrix;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.horcrux.svg.Brush;
import javax.annotation.Nullable;

class RadialGradientShadowNode extends DefinitionShadowNode {
    private static final float[] sRawMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private String mCx;
    private String mCy;
    private String mFx;
    private String mFy;
    private ReadableArray mGradient;
    private Brush.BrushUnits mGradientUnits;
    private Matrix mMatrix = null;
    private String mRx;
    private String mRy;

    RadialGradientShadowNode() {
    }

    @ReactProp(name = "fx")
    public void setFx(String str) {
        this.mFx = str;
        markUpdated();
    }

    @ReactProp(name = "fy")
    public void setFy(String str) {
        this.mFy = str;
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

    @ReactProp(name = "gradient")
    public void setGradient(ReadableArray readableArray) {
        this.mGradient = readableArray;
        markUpdated();
    }

    @ReactProp(name = "gradientUnits")
    public void setGradientUnits(int i) {
        if (i == 0) {
            this.mGradientUnits = Brush.BrushUnits.OBJECT_BOUNDING_BOX;
        } else if (i == 1) {
            this.mGradientUnits = Brush.BrushUnits.USER_SPACE_ON_USE;
        }
        markUpdated();
    }

    @ReactProp(name = "gradientTransform")
    public void setGradientTransform(@Nullable ReadableArray readableArray) {
        if (readableArray != null) {
            int matrixData = PropHelper.toMatrixData(readableArray, sRawMatrix, this.mScale);
            if (matrixData == 6) {
                if (this.mMatrix == null) {
                    this.mMatrix = new Matrix();
                }
                this.mMatrix.setValues(sRawMatrix);
            } else if (matrixData != -1) {
                FLog.m662w(ReactConstants.TAG, "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.mMatrix = null;
        }
        markUpdated();
    }

    /* access modifiers changed from: protected */
    public void saveDefinition() {
        if (this.mName != null) {
            WritableArray createArray = Arguments.createArray();
            createArray.pushString(this.mFx);
            createArray.pushString(this.mFy);
            createArray.pushString(this.mRx);
            createArray.pushString(this.mRy);
            createArray.pushString(this.mCx);
            createArray.pushString(this.mCy);
            Brush brush = new Brush(Brush.BrushType.RADIAL_GRADIENT, createArray, this.mGradientUnits);
            brush.setGradientColors(this.mGradient);
            Matrix matrix = this.mMatrix;
            if (matrix != null) {
                brush.setGradientTransform(matrix);
            }
            SvgViewShadowNode svgShadowNode = getSvgShadowNode();
            if (this.mGradientUnits == Brush.BrushUnits.USER_SPACE_ON_USE) {
                brush.setUserSpaceBoundingBox(svgShadowNode.getCanvasBounds());
            }
            svgShadowNode.defineBrush(brush, this.mName);
        }
    }
}
