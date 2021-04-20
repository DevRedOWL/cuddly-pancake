package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.buffer.HorizontalBarBuffer;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.dataprovider.ChartInterface;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

public class HorizontalBarChartRenderer extends BarChartRenderer {
    private RectF mBarShadowRectBuffer = new RectF();

    public HorizontalBarChartRenderer(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(barDataProvider, chartAnimator, viewPortHandler);
        this.mValuePaint.setTextAlign(Paint.Align.LEFT);
    }

    public void initBuffers() {
        BarData barData = this.mChart.getBarData();
        this.mBarBuffers = new HorizontalBarBuffer[barData.getDataSetCount()];
        for (int i = 0; i < this.mBarBuffers.length; i++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i);
            this.mBarBuffers[i] = new HorizontalBarBuffer(iBarDataSet.getEntryCount() * 4 * (iBarDataSet.isStacked() ? iBarDataSet.getStackSize() : 1), barData.getDataSetCount(), iBarDataSet.isStacked());
        }
    }

    /* access modifiers changed from: protected */
    public void drawDataSet(Canvas canvas, IBarDataSet iBarDataSet, int i) {
        IBarDataSet iBarDataSet2 = iBarDataSet;
        int i2 = i;
        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
        this.mBarBorderPaint.setColor(iBarDataSet.getBarBorderColor());
        this.mBarBorderPaint.setStrokeWidth(Utils.convertDpToPixel(iBarDataSet.getBarBorderWidth()));
        int i3 = 0;
        boolean z = true;
        boolean z2 = iBarDataSet.getBarBorderWidth() > 0.0f;
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        if (this.mChart.isDrawBarShadowEnabled()) {
            this.mShadowPaint.setColor(iBarDataSet.getBarShadowColor());
            float barWidth = this.mChart.getBarData().getBarWidth() / 2.0f;
            int min = Math.min((int) Math.ceil((double) (((float) iBarDataSet.getEntryCount()) * phaseX)), iBarDataSet.getEntryCount());
            for (int i4 = 0; i4 < min; i4++) {
                float x = ((BarEntry) iBarDataSet2.getEntryForIndex(i4)).getX();
                RectF rectF = this.mBarShadowRectBuffer;
                rectF.top = x - barWidth;
                rectF.bottom = x + barWidth;
                transformer.rectValueToPixel(rectF);
                if (!this.mViewPortHandler.isInBoundsTop(this.mBarShadowRectBuffer.bottom)) {
                    Canvas canvas2 = canvas;
                } else if (!this.mViewPortHandler.isInBoundsBottom(this.mBarShadowRectBuffer.top)) {
                    break;
                } else {
                    this.mBarShadowRectBuffer.left = this.mViewPortHandler.contentLeft();
                    this.mBarShadowRectBuffer.right = this.mViewPortHandler.contentRight();
                    canvas.drawRect(this.mBarShadowRectBuffer, this.mShadowPaint);
                }
            }
        }
        Canvas canvas3 = canvas;
        BarBuffer barBuffer = this.mBarBuffers[i2];
        barBuffer.setPhases(phaseX, phaseY);
        barBuffer.setDataSet(i2);
        barBuffer.setInverted(this.mChart.isInverted(iBarDataSet.getAxisDependency()));
        barBuffer.setBarWidth(this.mChart.getBarData().getBarWidth());
        barBuffer.feed(iBarDataSet2);
        transformer.pointValuesToPixel(barBuffer.buffer);
        if (iBarDataSet.getColors().size() != 1) {
            z = false;
        }
        if (z) {
            this.mRenderPaint.setColor(iBarDataSet.getColor());
        }
        while (i3 < barBuffer.size()) {
            int i5 = i3 + 3;
            if (this.mViewPortHandler.isInBoundsTop(barBuffer.buffer[i5])) {
                int i6 = i3 + 1;
                if (this.mViewPortHandler.isInBoundsBottom(barBuffer.buffer[i6])) {
                    if (!z) {
                        this.mRenderPaint.setColor(iBarDataSet2.getColor(i3 / 4));
                    }
                    int i7 = i3 + 2;
                    canvas.drawRect(barBuffer.buffer[i3], barBuffer.buffer[i6], barBuffer.buffer[i7], barBuffer.buffer[i5], this.mRenderPaint);
                    if (z2) {
                        canvas.drawRect(barBuffer.buffer[i3], barBuffer.buffer[i6], barBuffer.buffer[i7], barBuffer.buffer[i5], this.mBarBorderPaint);
                    }
                }
                i3 += 4;
                Canvas canvas4 = canvas;
            } else {
                return;
            }
        }
    }

    public void drawValues(Canvas canvas) {
        boolean z;
        int i;
        List list;
        MPPointF mPPointF;
        int i2;
        boolean z2;
        float[] fArr;
        int i3;
        float[] fArr2;
        float f;
        BarEntry barEntry;
        int i4;
        float f2;
        int i5;
        List list2;
        ValueFormatter valueFormatter;
        BarBuffer barBuffer;
        MPPointF mPPointF2;
        if (isDrawingValuesAllowed(this.mChart)) {
            List dataSets = this.mChart.getBarData().getDataSets();
            float convertDpToPixel = Utils.convertDpToPixel(5.0f);
            boolean isDrawValueAboveBarEnabled = this.mChart.isDrawValueAboveBarEnabled();
            int i6 = 0;
            while (i6 < this.mChart.getBarData().getDataSetCount()) {
                IBarDataSet iBarDataSet = (IBarDataSet) dataSets.get(i6);
                if (!shouldDrawValues(iBarDataSet)) {
                    list = dataSets;
                    z = isDrawValueAboveBarEnabled;
                    i = i6;
                } else {
                    boolean isInverted = this.mChart.isInverted(iBarDataSet.getAxisDependency());
                    applyValueTextStyle(iBarDataSet);
                    float f3 = 2.0f;
                    float calcTextHeight = ((float) Utils.calcTextHeight(this.mValuePaint, "10")) / 2.0f;
                    ValueFormatter valueFormatter2 = iBarDataSet.getValueFormatter();
                    BarBuffer barBuffer2 = this.mBarBuffers[i6];
                    float phaseY = this.mAnimator.getPhaseY();
                    MPPointF instance = MPPointF.getInstance(iBarDataSet.getIconsOffset());
                    instance.f1365x = Utils.convertDpToPixel(instance.f1365x);
                    instance.f1366y = Utils.convertDpToPixel(instance.f1366y);
                    if (!iBarDataSet.isStacked()) {
                        int i7 = 0;
                        while (((float) i7) < ((float) barBuffer2.buffer.length) * this.mAnimator.getPhaseX()) {
                            int i8 = i7 + 1;
                            float f4 = (barBuffer2.buffer[i8] + barBuffer2.buffer[i7 + 3]) / f3;
                            if (!this.mViewPortHandler.isInBoundsTop(barBuffer2.buffer[i8])) {
                                break;
                            }
                            if (this.mViewPortHandler.isInBoundsX(barBuffer2.buffer[i7]) && this.mViewPortHandler.isInBoundsBottom(barBuffer2.buffer[i8])) {
                                BarEntry barEntry2 = (BarEntry) iBarDataSet.getEntryForIndex(i7 / 4);
                                float y = barEntry2.getY();
                                String barLabel = valueFormatter2.getBarLabel(barEntry2);
                                float calcTextWidth = (float) Utils.calcTextWidth(this.mValuePaint, barLabel);
                                String str = barLabel;
                                float f5 = isDrawValueAboveBarEnabled ? convertDpToPixel : -(calcTextWidth + convertDpToPixel);
                                MPPointF mPPointF3 = instance;
                                float f6 = isDrawValueAboveBarEnabled ? -(calcTextWidth + convertDpToPixel) : convertDpToPixel;
                                if (isInverted) {
                                    f5 = (-f5) - calcTextWidth;
                                    f6 = (-f6) - calcTextWidth;
                                }
                                float f7 = f5;
                                float f8 = f6;
                                if (iBarDataSet.isDrawValuesEnabled()) {
                                    float f9 = barBuffer2.buffer[i7 + 2];
                                    float f10 = y >= 0.0f ? f7 : f8;
                                    int valueTextColor = iBarDataSet.getValueTextColor(i7 / 2);
                                    i4 = i7;
                                    String str2 = str;
                                    list2 = dataSets;
                                    mPPointF2 = mPPointF3;
                                    i5 = i6;
                                    barBuffer = barBuffer2;
                                    float f11 = f4 + calcTextHeight;
                                    f2 = calcTextHeight;
                                    valueFormatter = valueFormatter2;
                                    drawValue(canvas, str2, f9 + f10, f11, valueTextColor);
                                } else {
                                    i4 = i7;
                                    list2 = dataSets;
                                    f2 = calcTextHeight;
                                    mPPointF2 = mPPointF3;
                                    valueFormatter = valueFormatter2;
                                    i5 = i6;
                                    barBuffer = barBuffer2;
                                }
                                if (barEntry2.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                    Drawable icon = barEntry2.getIcon();
                                    float f12 = barBuffer.buffer[i4 + 2];
                                    if (y >= 0.0f) {
                                        f8 = f7;
                                    }
                                    Utils.drawImage(canvas, icon, (int) (f12 + f8 + mPPointF2.f1365x), (int) (f4 + mPPointF2.f1366y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                                }
                            } else {
                                i4 = i7;
                                list2 = dataSets;
                                i5 = i6;
                                f2 = calcTextHeight;
                                mPPointF2 = instance;
                                barBuffer = barBuffer2;
                                valueFormatter = valueFormatter2;
                            }
                            i7 = i4 + 4;
                            instance = mPPointF2;
                            barBuffer2 = barBuffer;
                            valueFormatter2 = valueFormatter;
                            dataSets = list2;
                            i6 = i5;
                            calcTextHeight = f2;
                            f3 = 2.0f;
                        }
                        list = dataSets;
                        i = i6;
                        mPPointF = instance;
                    } else {
                        list = dataSets;
                        i = i6;
                        float f13 = calcTextHeight;
                        mPPointF = instance;
                        BarBuffer barBuffer3 = barBuffer2;
                        ValueFormatter valueFormatter3 = valueFormatter2;
                        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
                        int i9 = 0;
                        int i10 = 0;
                        while (((float) i9) < ((float) iBarDataSet.getEntryCount()) * this.mAnimator.getPhaseX()) {
                            BarEntry barEntry3 = (BarEntry) iBarDataSet.getEntryForIndex(i9);
                            int valueTextColor2 = iBarDataSet.getValueTextColor(i9);
                            float[] yVals = barEntry3.getYVals();
                            if (yVals != null) {
                                BarEntry barEntry4 = barEntry3;
                                i2 = i9;
                                fArr = yVals;
                                float[] fArr3 = new float[(fArr.length * 2)];
                                float f14 = -barEntry4.getNegativeSum();
                                int i11 = 0;
                                int i12 = 0;
                                float f15 = 0.0f;
                                while (i11 < fArr3.length) {
                                    float f16 = fArr[i12];
                                    int i13 = (f16 > 0.0f ? 1 : (f16 == 0.0f ? 0 : -1));
                                    if (!(i13 == 0 && (f15 == 0.0f || f14 == 0.0f))) {
                                        if (i13 >= 0) {
                                            f16 = f15 + f16;
                                            f15 = f16;
                                        } else {
                                            float f17 = f14;
                                            f14 -= f16;
                                            f16 = f17;
                                        }
                                    }
                                    fArr3[i11] = f16 * phaseY;
                                    i11 += 2;
                                    i12++;
                                }
                                transformer.pointValuesToPixel(fArr3);
                                int i14 = 0;
                                while (true) {
                                    if (i14 >= fArr3.length) {
                                        break;
                                    }
                                    float f18 = fArr[i14 / 2];
                                    String barStackedLabel = valueFormatter3.getBarStackedLabel(f18, barEntry4);
                                    float calcTextWidth2 = (float) Utils.calcTextWidth(this.mValuePaint, barStackedLabel);
                                    float f19 = isDrawValueAboveBarEnabled ? convertDpToPixel : -(calcTextWidth2 + convertDpToPixel);
                                    z2 = isDrawValueAboveBarEnabled;
                                    float f20 = isDrawValueAboveBarEnabled ? -(calcTextWidth2 + convertDpToPixel) : convertDpToPixel;
                                    if (isInverted) {
                                        f19 = (-f19) - calcTextWidth2;
                                        f20 = (-f20) - calcTextWidth2;
                                    }
                                    boolean z3 = (f18 == 0.0f && f14 == 0.0f && f15 > 0.0f) || f18 < 0.0f;
                                    float f21 = fArr3[i14];
                                    if (z3) {
                                        f19 = f20;
                                    }
                                    float f22 = f21 + f19;
                                    float f23 = (barBuffer3.buffer[i10 + 1] + barBuffer3.buffer[i10 + 3]) / 2.0f;
                                    if (!this.mViewPortHandler.isInBoundsTop(f23)) {
                                        break;
                                    }
                                    if (this.mViewPortHandler.isInBoundsX(f22) && this.mViewPortHandler.isInBoundsBottom(f23)) {
                                        if (iBarDataSet.isDrawValuesEnabled()) {
                                            f = f23;
                                            i3 = i14;
                                            fArr2 = fArr3;
                                            drawValue(canvas, barStackedLabel, f22, f23 + f13, valueTextColor2);
                                        } else {
                                            f = f23;
                                            i3 = i14;
                                            fArr2 = fArr3;
                                        }
                                        if (barEntry4.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                            Drawable icon2 = barEntry4.getIcon();
                                            Utils.drawImage(canvas, icon2, (int) (f22 + mPPointF.f1365x), (int) (f + mPPointF.f1366y), icon2.getIntrinsicWidth(), icon2.getIntrinsicHeight());
                                        }
                                    } else {
                                        i3 = i14;
                                        fArr2 = fArr3;
                                    }
                                    i14 = i3 + 2;
                                    isDrawValueAboveBarEnabled = z2;
                                    fArr3 = fArr2;
                                }
                            } else {
                                int i15 = i10 + 1;
                                if (!this.mViewPortHandler.isInBoundsTop(barBuffer3.buffer[i15])) {
                                    break;
                                } else if (this.mViewPortHandler.isInBoundsX(barBuffer3.buffer[i10]) && this.mViewPortHandler.isInBoundsBottom(barBuffer3.buffer[i15])) {
                                    String barLabel2 = valueFormatter3.getBarLabel(barEntry3);
                                    float calcTextWidth3 = (float) Utils.calcTextWidth(this.mValuePaint, barLabel2);
                                    float f24 = isDrawValueAboveBarEnabled ? convertDpToPixel : -(calcTextWidth3 + convertDpToPixel);
                                    float f25 = isDrawValueAboveBarEnabled ? -(calcTextWidth3 + convertDpToPixel) : convertDpToPixel;
                                    if (isInverted) {
                                        f24 = (-f24) - calcTextWidth3;
                                        f25 = (-f25) - calcTextWidth3;
                                    }
                                    float f26 = f24;
                                    float f27 = f25;
                                    if (iBarDataSet.isDrawValuesEnabled()) {
                                        i2 = i9;
                                        fArr = yVals;
                                        barEntry = barEntry3;
                                        drawValue(canvas, barLabel2, barBuffer3.buffer[i10 + 2] + (barEntry3.getY() >= 0.0f ? f26 : f27), barBuffer3.buffer[i15] + f13, valueTextColor2);
                                    } else {
                                        barEntry = barEntry3;
                                        i2 = i9;
                                        fArr = yVals;
                                    }
                                    if (barEntry.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                        Drawable icon3 = barEntry.getIcon();
                                        float f28 = barBuffer3.buffer[i10 + 2];
                                        if (barEntry.getY() >= 0.0f) {
                                            f27 = f26;
                                        }
                                        Utils.drawImage(canvas, icon3, (int) (f28 + f27 + mPPointF.f1365x), (int) (barBuffer3.buffer[i15] + mPPointF.f1366y), icon3.getIntrinsicWidth(), icon3.getIntrinsicHeight());
                                    }
                                }
                            }
                            z2 = isDrawValueAboveBarEnabled;
                            i10 = fArr == null ? i10 + 4 : i10 + (fArr.length * 4);
                            i9 = i2 + 1;
                            isDrawValueAboveBarEnabled = z2;
                        }
                    }
                    z = isDrawValueAboveBarEnabled;
                    MPPointF.recycleInstance(mPPointF);
                }
                i6 = i + 1;
                dataSets = list;
                isDrawValueAboveBarEnabled = z;
            }
        }
    }

    public void drawValue(Canvas canvas, String str, float f, float f2, int i) {
        this.mValuePaint.setColor(i);
        canvas.drawText(str, f, f2, this.mValuePaint);
    }

    /* access modifiers changed from: protected */
    public void prepareBarHighlight(float f, float f2, float f3, float f4, Transformer transformer) {
        this.mBarRect.set(f2, f - f4, f3, f + f4);
        transformer.rectToPixelPhaseHorizontal(this.mBarRect, this.mAnimator.getPhaseY());
    }

    /* access modifiers changed from: protected */
    public void setHighlightDrawPos(Highlight highlight, RectF rectF) {
        highlight.setDraw(rectF.centerY(), rectF.right);
    }

    /* access modifiers changed from: protected */
    public boolean isDrawingValuesAllowed(ChartInterface chartInterface) {
        return ((float) chartInterface.getData().getEntryCount()) < ((float) chartInterface.getMaxVisibleCount()) * this.mViewPortHandler.getScaleY();
    }
}
