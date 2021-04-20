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

class LinearGradientShadowNode extends DefinitionShadowNode {
    private static final float[] sRawMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private ReadableArray mGradient;
    private Brush.BrushUnits mGradientUnits;
    private Matrix mMatrix = null;
    private String mX1;
    private String mX2;
    private String mY1;
    private String mY2;

    LinearGradientShadowNode() {
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
            createArray.pushString(this.mX1);
            createArray.pushString(this.mY1);
            createArray.pushString(this.mX2);
            createArray.pushString(this.mY2);
            Brush brush = new Brush(Brush.BrushType.LINEAR_GRADIENT, createArray, this.mGradientUnits);
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
