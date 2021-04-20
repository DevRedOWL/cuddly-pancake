package com.horcrux.svg;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.ReactConstants;
import com.github.mikephil.charting.utils.Utils;

class Brush {
    private ReadableArray mColors;
    private Matrix mMatrix;
    private final ReadableArray mPoints;
    private BrushType mType = BrushType.LINEAR_GRADIENT;
    private final boolean mUseObjectBoundingBox;
    private Rect mUserSpaceBoundingBox;

    Brush(BrushType brushType, ReadableArray readableArray, BrushUnits brushUnits) {
        this.mType = brushType;
        this.mPoints = readableArray;
        this.mUseObjectBoundingBox = brushUnits == BrushUnits.OBJECT_BOUNDING_BOX;
    }

    enum BrushType {
        LINEAR_GRADIENT(0),
        RADIAL_GRADIENT(1),
        PATTERN(2);
        
        final int nativeInt;

        private BrushType(int i) {
            this.nativeInt = i;
        }
    }

    enum BrushUnits {
        OBJECT_BOUNDING_BOX(0),
        USER_SPACE_ON_USE(1);
        
        final int nativeInt;

        private BrushUnits(int i) {
            this.nativeInt = i;
        }
    }

    private static void parseGradientStops(ReadableArray readableArray, int i, float[] fArr, int[] iArr, float f) {
        int size = readableArray.size() - i;
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = (float) readableArray.getDouble(size + i2);
            int i3 = i2 * 4;
            iArr[i2] = Color.argb((int) (readableArray.getDouble(i3 + 3) * 255.0d * ((double) f)), (int) (readableArray.getDouble(i3) * 255.0d), (int) (readableArray.getDouble(i3 + 1) * 255.0d), (int) (readableArray.getDouble(i3 + 2) * 255.0d));
        }
    }

    /* access modifiers changed from: package-private */
    public void setUserSpaceBoundingBox(Rect rect) {
        this.mUserSpaceBoundingBox = rect;
    }

    /* access modifiers changed from: package-private */
    public void setGradientColors(ReadableArray readableArray) {
        this.mColors = readableArray;
    }

    /* access modifiers changed from: package-private */
    public void setGradientTransform(Matrix matrix) {
        this.mMatrix = matrix;
    }

    private RectF getPaintRect(RectF rectF) {
        float f;
        if (!this.mUseObjectBoundingBox) {
            rectF = new RectF(this.mUserSpaceBoundingBox);
        }
        float width = rectF.width();
        float height = rectF.height();
        float f2 = 0.0f;
        if (this.mUseObjectBoundingBox) {
            f2 = rectF.left;
            f = rectF.top;
        } else {
            f = 0.0f;
        }
        return new RectF(f2, f, width + f2, height + f);
    }

    /* access modifiers changed from: package-private */
    public void setupPaint(Paint paint, RectF rectF, float f, float f2) {
        float[] fArr;
        int[] iArr;
        Paint paint2 = paint;
        float f3 = f;
        RectF paintRect = getPaintRect(rectF);
        float width = paintRect.width();
        float height = paintRect.height();
        float f4 = paintRect.left;
        float f5 = paintRect.top;
        int size = this.mColors.size() / 5;
        int[] iArr2 = new int[size];
        float[] fArr2 = new float[size];
        parseGradientStops(this.mColors, size, fArr2, iArr2, f2);
        if (fArr2.length == 1) {
            iArr = new int[]{iArr2[0], iArr2[0]};
            fArr = new float[]{fArr2[0], fArr2[0]};
            FLog.m662w(ReactConstants.TAG, "Gradient contains only on stop");
        } else {
            iArr = iArr2;
            fArr = fArr2;
        }
        if (this.mType == BrushType.LINEAR_GRADIENT) {
            double d = (double) width;
            double d2 = (double) f4;
            double d3 = (double) f3;
            double fromRelative = PropHelper.fromRelative(this.mPoints.getString(0), d, d2, d3, (double) paint.getTextSize());
            double d4 = (double) height;
            double d5 = (double) f5;
            double d6 = fromRelative;
            double d7 = d3;
            double fromRelative2 = PropHelper.fromRelative(this.mPoints.getString(1), d4, d5, d7, (double) paint.getTextSize());
            LinearGradient linearGradient = new LinearGradient((float) d6, (float) fromRelative2, (float) PropHelper.fromRelative(this.mPoints.getString(2), d, d2, d7, (double) paint.getTextSize()), (float) PropHelper.fromRelative(this.mPoints.getString(3), d4, d5, d7, (double) paint.getTextSize()), iArr, fArr, Shader.TileMode.CLAMP);
            if (this.mMatrix != null) {
                Matrix matrix = new Matrix();
                matrix.preConcat(this.mMatrix);
                linearGradient.setLocalMatrix(matrix);
            }
            paint.setShader(linearGradient);
            return;
        }
        int[] iArr3 = iArr;
        float[] fArr3 = fArr;
        if (this.mType == BrushType.RADIAL_GRADIENT) {
            double d8 = (double) width;
            double d9 = (double) f3;
            double fromRelative3 = PropHelper.fromRelative(this.mPoints.getString(2), d8, Utils.DOUBLE_EPSILON, d9, (double) paint.getTextSize());
            double d10 = (double) height;
            double d11 = d9;
            double fromRelative4 = PropHelper.fromRelative(this.mPoints.getString(3), d10, Utils.DOUBLE_EPSILON, d11, (double) paint.getTextSize());
            double d12 = fromRelative4;
            double fromRelative5 = PropHelper.fromRelative(this.mPoints.getString(4), d8, (double) f4, d9, (double) paint.getTextSize());
            double d13 = d12 / fromRelative3;
            RadialGradient radialGradient = new RadialGradient((float) fromRelative5, (float) (PropHelper.fromRelative(this.mPoints.getString(5), d10, (double) f5, d11, (double) paint.getTextSize()) / d13), (float) fromRelative3, iArr3, fArr3, Shader.TileMode.CLAMP);
            Matrix matrix2 = new Matrix();
            matrix2.preScale(1.0f, (float) d13);
            Matrix matrix3 = this.mMatrix;
            if (matrix3 != null) {
                matrix2.preConcat(matrix3);
            }
            radialGradient.setLocalMatrix(matrix2);
            paint.setShader(radialGradient);
        }
    }
}
