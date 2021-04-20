package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

public abstract class AxisRenderer extends Renderer {
    protected AxisBase mAxis;
    protected Paint mAxisLabelPaint;
    protected Paint mAxisLinePaint;
    protected Paint mGridPaint;
    protected Paint mLimitLinePaint;
    protected Transformer mTrans;

    public abstract void renderAxisLabels(Canvas canvas);

    public abstract void renderAxisLine(Canvas canvas);

    public abstract void renderGridLines(Canvas canvas);

    public abstract void renderLimitLines(Canvas canvas);

    public AxisRenderer(ViewPortHandler viewPortHandler, Transformer transformer, AxisBase axisBase) {
        super(viewPortHandler);
        this.mTrans = transformer;
        this.mAxis = axisBase;
        if (this.mViewPortHandler != null) {
            this.mAxisLabelPaint = new Paint(1);
            this.mGridPaint = new Paint();
            this.mGridPaint.setColor(-7829368);
            this.mGridPaint.setStrokeWidth(1.0f);
            this.mGridPaint.setStyle(Paint.Style.STROKE);
            this.mGridPaint.setAlpha(90);
            this.mAxisLinePaint = new Paint();
            this.mAxisLinePaint.setColor(ViewCompat.MEASURED_STATE_MASK);
            this.mAxisLinePaint.setStrokeWidth(1.0f);
            this.mAxisLinePaint.setStyle(Paint.Style.STROKE);
            this.mLimitLinePaint = new Paint(1);
            this.mLimitLinePaint.setStyle(Paint.Style.STROKE);
        }
    }

    public Paint getPaintAxisLabels() {
        return this.mAxisLabelPaint;
    }

    public Paint getPaintGrid() {
        return this.mGridPaint;
    }

    public Paint getPaintAxisLine() {
        return this.mAxisLinePaint;
    }

    public Transformer getTransformer() {
        return this.mTrans;
    }

    public void computeAxis(float f, float f2, boolean z) {
        float f3;
        double d;
        if (this.mViewPortHandler != null && this.mViewPortHandler.contentWidth() > 10.0f && !this.mViewPortHandler.isFullyZoomedOutY()) {
            MPPointD valuesByTouchPoint = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop());
            MPPointD valuesByTouchPoint2 = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom());
            if (!z) {
                f3 = (float) valuesByTouchPoint2.f1364y;
                d = valuesByTouchPoint.f1364y;
            } else {
                f3 = (float) valuesByTouchPoint.f1364y;
                d = valuesByTouchPoint2.f1364y;
            }
            MPPointD.recycleInstance(valuesByTouchPoint);
            MPPointD.recycleInstance(valuesByTouchPoint2);
            f = f3;
            f2 = (float) d;
        }
        computeAxisValues(f, f2);
    }

    /* access modifiers changed from: protected */
    public void computeAxisValues(float f, float f2) {
        double d;
        double d2;
        float f3 = f;
        float f4 = f2;
        int labelCount = this.mAxis.getLabelCount();
        double abs = (double) Math.abs(f4 - f3);
        if (labelCount == 0 || abs <= Utils.DOUBLE_EPSILON || Double.isInfinite(abs)) {
            AxisBase axisBase = this.mAxis;
            axisBase.mEntries = new float[0];
            axisBase.mCenteredEntries = new float[0];
            axisBase.mEntryCount = 0;
            return;
        }
        double roundToNextSignificant = (double) Utils.roundToNextSignificant(abs / ((double) labelCount));
        if (this.mAxis.isGranularityEnabled() && roundToNextSignificant < ((double) this.mAxis.getGranularity())) {
            roundToNextSignificant = (double) this.mAxis.getGranularity();
        }
        double roundToNextSignificant2 = (double) Utils.roundToNextSignificant(Math.pow(10.0d, (double) ((int) Math.log10(roundToNextSignificant))));
        if (((int) (roundToNextSignificant / roundToNextSignificant2)) > 5) {
            roundToNextSignificant = Math.floor(roundToNextSignificant2 * 10.0d);
        }
        int isCenterAxisLabelsEnabled = this.mAxis.isCenterAxisLabelsEnabled();
        if (this.mAxis.isForceLabelsEnabled()) {
            roundToNextSignificant = (double) (((float) abs) / ((float) (labelCount - 1)));
            AxisBase axisBase2 = this.mAxis;
            axisBase2.mEntryCount = labelCount;
            if (axisBase2.mEntries.length < labelCount) {
                this.mAxis.mEntries = new float[labelCount];
            }
            float f5 = f3;
            for (int i = 0; i < labelCount; i++) {
                this.mAxis.mEntries[i] = f5;
                f5 = (float) (((double) f5) + roundToNextSignificant);
            }
        } else {
            int i2 = (roundToNextSignificant > Utils.DOUBLE_EPSILON ? 1 : (roundToNextSignificant == Utils.DOUBLE_EPSILON ? 0 : -1));
            if (i2 == 0) {
                d = Utils.DOUBLE_EPSILON;
            } else {
                d = Math.ceil(((double) f3) / roundToNextSignificant) * roundToNextSignificant;
            }
            if (this.mAxis.isCenterAxisLabelsEnabled()) {
                d -= roundToNextSignificant;
            }
            if (i2 == 0) {
                d2 = Utils.DOUBLE_EPSILON;
            } else {
                d2 = Utils.nextUp(Math.floor(((double) f4) / roundToNextSignificant) * roundToNextSignificant);
            }
            if (i2 != 0) {
                for (double d3 = d; d3 <= d2; d3 += roundToNextSignificant) {
                    isCenterAxisLabelsEnabled++;
                }
            }
            labelCount = isCenterAxisLabelsEnabled;
            AxisBase axisBase3 = this.mAxis;
            axisBase3.mEntryCount = labelCount;
            if (axisBase3.mEntries.length < labelCount) {
                this.mAxis.mEntries = new float[labelCount];
            }
            for (int i3 = 0; i3 < labelCount; i3++) {
                if (d == Utils.DOUBLE_EPSILON) {
                    d = 0.0d;
                }
                this.mAxis.mEntries[i3] = (float) d;
                d += roundToNextSignificant;
            }
        }
        if (roundToNextSignificant < 1.0d) {
            this.mAxis.mDecimals = (int) Math.ceil(-Math.log10(roundToNextSignificant));
        } else {
            this.mAxis.mDecimals = 0;
        }
        if (this.mAxis.isCenterAxisLabelsEnabled()) {
            if (this.mAxis.mCenteredEntries.length < labelCount) {
                this.mAxis.mCenteredEntries = new float[labelCount];
            }
            float f6 = ((float) roundToNextSignificant) / 2.0f;
            for (int i4 = 0; i4 < labelCount; i4++) {
                this.mAxis.mCenteredEntries[i4] = this.mAxis.mEntries[i4] + f6;
            }
        }
    }
}
