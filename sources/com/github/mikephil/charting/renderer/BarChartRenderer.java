package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.highlight.Range;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

public class BarChartRenderer extends BarLineScatterCandleBubbleRenderer {
    protected Paint mBarBorderPaint;
    protected BarBuffer[] mBarBuffers;
    protected RectF mBarRect = new RectF();
    private RectF mBarShadowRectBuffer = new RectF();
    protected BarDataProvider mChart;
    protected Paint mShadowPaint;

    public void drawExtras(Canvas canvas) {
    }

    public BarChartRenderer(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mChart = barDataProvider;
        this.mHighlightPaint = new Paint(1);
        this.mHighlightPaint.setStyle(Paint.Style.FILL);
        this.mHighlightPaint.setColor(Color.rgb(0, 0, 0));
        this.mHighlightPaint.setAlpha(120);
        this.mShadowPaint = new Paint(1);
        this.mShadowPaint.setStyle(Paint.Style.FILL);
        this.mBarBorderPaint = new Paint(1);
        this.mBarBorderPaint.setStyle(Paint.Style.STROKE);
    }

    public void initBuffers() {
        BarData barData = this.mChart.getBarData();
        this.mBarBuffers = new BarBuffer[barData.getDataSetCount()];
        for (int i = 0; i < this.mBarBuffers.length; i++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i);
            this.mBarBuffers[i] = new BarBuffer(iBarDataSet.getEntryCount() * 4 * (iBarDataSet.isStacked() ? iBarDataSet.getStackSize() : 1), barData.getDataSetCount(), iBarDataSet.isStacked());
        }
    }

    public void drawData(Canvas canvas) {
        BarData barData = this.mChart.getBarData();
        for (int i = 0; i < barData.getDataSetCount(); i++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i);
            if (iBarDataSet.isVisible()) {
                drawDataSet(canvas, iBarDataSet, i);
            }
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
                rectF.left = x - barWidth;
                rectF.right = x + barWidth;
                transformer.rectValueToPixel(rectF);
                if (!this.mViewPortHandler.isInBoundsLeft(this.mBarShadowRectBuffer.right)) {
                    Canvas canvas2 = canvas;
                } else if (!this.mViewPortHandler.isInBoundsRight(this.mBarShadowRectBuffer.left)) {
                    break;
                } else {
                    this.mBarShadowRectBuffer.top = this.mViewPortHandler.contentTop();
                    this.mBarShadowRectBuffer.bottom = this.mViewPortHandler.contentBottom();
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
            int i5 = i3 + 2;
            if (this.mViewPortHandler.isInBoundsLeft(barBuffer.buffer[i5])) {
                if (this.mViewPortHandler.isInBoundsRight(barBuffer.buffer[i3])) {
                    if (!z) {
                        this.mRenderPaint.setColor(iBarDataSet2.getColor(i3 / 4));
                    }
                    if (iBarDataSet.getGradientColor() != null) {
                        GradientColor gradientColor = iBarDataSet.getGradientColor();
                        this.mRenderPaint.setShader(new LinearGradient(barBuffer.buffer[i3], barBuffer.buffer[i3 + 3], barBuffer.buffer[i3], barBuffer.buffer[i3 + 1], gradientColor.getStartColor(), gradientColor.getEndColor(), Shader.TileMode.MIRROR));
                    }
                    if (iBarDataSet.getGradientColors() != null) {
                        int i6 = i3 / 4;
                        this.mRenderPaint.setShader(new LinearGradient(barBuffer.buffer[i3], barBuffer.buffer[i3 + 3], barBuffer.buffer[i3], barBuffer.buffer[i3 + 1], iBarDataSet2.getGradientColor(i6).getStartColor(), iBarDataSet2.getGradientColor(i6).getEndColor(), Shader.TileMode.MIRROR));
                    }
                    int i7 = i3 + 1;
                    int i8 = i3 + 3;
                    canvas.drawRect(barBuffer.buffer[i3], barBuffer.buffer[i7], barBuffer.buffer[i5], barBuffer.buffer[i8], this.mRenderPaint);
                    if (z2) {
                        canvas.drawRect(barBuffer.buffer[i3], barBuffer.buffer[i7], barBuffer.buffer[i5], barBuffer.buffer[i8], this.mBarBorderPaint);
                    }
                } else {
                    return;
                }
            }
            i3 += 4;
            Canvas canvas4 = canvas;
        }
    }

    /* access modifiers changed from: protected */
    public void prepareBarHighlight(float f, float f2, float f3, float f4, Transformer transformer) {
        this.mBarRect.set(f - f4, f2, f + f4, f3);
        transformer.rectToPixelPhase(this.mBarRect, this.mAnimator.getPhaseY());
    }

    public void drawValues(Canvas canvas) {
        boolean z;
        float f;
        float f2;
        List list;
        boolean z2;
        MPPointF mPPointF;
        int i;
        float f3;
        boolean z3;
        Transformer transformer;
        float[] fArr;
        float f4;
        float[] fArr2;
        BarEntry barEntry;
        int i2;
        float f5;
        float f6;
        BarEntry barEntry2;
        List list2;
        int i3;
        ValueFormatter valueFormatter;
        MPPointF mPPointF2;
        float f7;
        BarEntry barEntry3;
        if (isDrawingValuesAllowed(this.mChart)) {
            List dataSets = this.mChart.getBarData().getDataSets();
            float convertDpToPixel = Utils.convertDpToPixel(4.5f);
            boolean isDrawValueAboveBarEnabled = this.mChart.isDrawValueAboveBarEnabled();
            int i4 = 0;
            while (i4 < this.mChart.getBarData().getDataSetCount()) {
                IBarDataSet iBarDataSet = (IBarDataSet) dataSets.get(i4);
                if (!shouldDrawValues(iBarDataSet)) {
                    list = dataSets;
                    f2 = f;
                    z2 = z;
                } else {
                    applyValueTextStyle(iBarDataSet);
                    boolean isInverted = this.mChart.isInverted(iBarDataSet.getAxisDependency());
                    float calcTextHeight = (float) Utils.calcTextHeight(this.mValuePaint, "8");
                    float f8 = z ? -f : calcTextHeight + f;
                    float f9 = z ? calcTextHeight + f : -f;
                    if (isInverted) {
                        f8 = (-f8) - calcTextHeight;
                        f9 = (-f9) - calcTextHeight;
                    }
                    float f10 = f8;
                    float f11 = f9;
                    BarBuffer barBuffer = this.mBarBuffers[i4];
                    float phaseY = this.mAnimator.getPhaseY();
                    ValueFormatter valueFormatter2 = iBarDataSet.getValueFormatter();
                    MPPointF instance = MPPointF.getInstance(iBarDataSet.getIconsOffset());
                    instance.f1365x = Utils.convertDpToPixel(instance.f1365x);
                    instance.f1366y = Utils.convertDpToPixel(instance.f1366y);
                    if (!iBarDataSet.isStacked()) {
                        int i5 = 0;
                        while (((float) i5) < ((float) barBuffer.buffer.length) * this.mAnimator.getPhaseX()) {
                            float f12 = (barBuffer.buffer[i5] + barBuffer.buffer[i5 + 2]) / 2.0f;
                            if (!this.mViewPortHandler.isInBoundsRight(f12)) {
                                break;
                            }
                            int i6 = i5 + 1;
                            if (!this.mViewPortHandler.isInBoundsY(barBuffer.buffer[i6]) || !this.mViewPortHandler.isInBoundsLeft(f12)) {
                                i3 = i5;
                                valueFormatter = valueFormatter2;
                                list2 = dataSets;
                                mPPointF2 = instance;
                            } else {
                                int i7 = i5 / 4;
                                BarEntry barEntry4 = (BarEntry) iBarDataSet.getEntryForIndex(i7);
                                float y = barEntry4.getY();
                                if (iBarDataSet.isDrawValuesEnabled()) {
                                    String barLabel = valueFormatter2.getBarLabel(barEntry4);
                                    int i8 = (y > 0.0f ? 1 : (y == 0.0f ? 0 : -1));
                                    float[] fArr3 = barBuffer.buffer;
                                    barEntry3 = barEntry4;
                                    f7 = f12;
                                    String str = barLabel;
                                    i3 = i5;
                                    list2 = dataSets;
                                    mPPointF2 = instance;
                                    float f13 = i8 >= 0 ? fArr3[i6] + f10 : fArr3[i5 + 3] + f11;
                                    valueFormatter = valueFormatter2;
                                    drawValue(canvas, str, f7, f13, iBarDataSet.getValueTextColor(i7));
                                } else {
                                    barEntry3 = barEntry4;
                                    f7 = f12;
                                    i3 = i5;
                                    valueFormatter = valueFormatter2;
                                    list2 = dataSets;
                                    mPPointF2 = instance;
                                }
                                if (barEntry3.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                    Drawable icon = barEntry3.getIcon();
                                    Utils.drawImage(canvas, icon, (int) (f7 + mPPointF2.f1365x), (int) ((y >= 0.0f ? barBuffer.buffer[i6] + f10 : barBuffer.buffer[i3 + 3] + f11) + mPPointF2.f1366y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                                }
                            }
                            i5 = i3 + 4;
                            instance = mPPointF2;
                            valueFormatter2 = valueFormatter;
                            dataSets = list2;
                        }
                        list = dataSets;
                        mPPointF = instance;
                    } else {
                        ValueFormatter valueFormatter3 = valueFormatter2;
                        list = dataSets;
                        mPPointF = instance;
                        Transformer transformer2 = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
                        int i9 = 0;
                        int i10 = 0;
                        while (((float) i9) < ((float) iBarDataSet.getEntryCount()) * this.mAnimator.getPhaseX()) {
                            BarEntry barEntry5 = (BarEntry) iBarDataSet.getEntryForIndex(i9);
                            float[] yVals = barEntry5.getYVals();
                            float f14 = (barBuffer.buffer[i10] + barBuffer.buffer[i10 + 2]) / 2.0f;
                            int valueTextColor = iBarDataSet.getValueTextColor(i9);
                            if (yVals != null) {
                                BarEntry barEntry6 = barEntry5;
                                i = i9;
                                f3 = f;
                                z3 = z;
                                fArr = yVals;
                                transformer = transformer2;
                                float f15 = f14;
                                float[] fArr4 = new float[(fArr.length * 2)];
                                float f16 = -barEntry6.getNegativeSum();
                                int i11 = 0;
                                int i12 = 0;
                                float f17 = 0.0f;
                                while (i11 < fArr4.length) {
                                    float f18 = fArr[i12];
                                    int i13 = (f18 > 0.0f ? 1 : (f18 == 0.0f ? 0 : -1));
                                    if (!(i13 == 0 && (f17 == 0.0f || f16 == 0.0f))) {
                                        if (i13 >= 0) {
                                            f18 = f17 + f18;
                                            f17 = f18;
                                        } else {
                                            float f19 = f16;
                                            f16 -= f18;
                                            f18 = f19;
                                        }
                                    }
                                    fArr4[i11 + 1] = f18 * phaseY;
                                    i11 += 2;
                                    i12++;
                                }
                                transformer.pointValuesToPixel(fArr4);
                                int i14 = 0;
                                while (i14 < fArr4.length) {
                                    float f20 = fArr[i14 / 2];
                                    float f21 = fArr4[i14 + 1] + (((f20 > 0.0f ? 1 : (f20 == 0.0f ? 0 : -1)) == 0 && (f16 > 0.0f ? 1 : (f16 == 0.0f ? 0 : -1)) == 0 && (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1)) > 0) || (f20 > 0.0f ? 1 : (f20 == 0.0f ? 0 : -1)) < 0 ? f11 : f10);
                                    if (!this.mViewPortHandler.isInBoundsRight(f15)) {
                                        break;
                                    }
                                    if (!this.mViewPortHandler.isInBoundsY(f21) || !this.mViewPortHandler.isInBoundsLeft(f15)) {
                                        fArr2 = fArr4;
                                        f4 = f15;
                                        barEntry = barEntry6;
                                        i2 = i14;
                                    } else {
                                        if (iBarDataSet.isDrawValuesEnabled()) {
                                            BarEntry barEntry7 = barEntry6;
                                            barEntry = barEntry7;
                                            f5 = f21;
                                            i2 = i14;
                                            fArr2 = fArr4;
                                            f4 = f15;
                                            drawValue(canvas, valueFormatter3.getBarStackedLabel(f20, barEntry7), f15, f5, valueTextColor);
                                        } else {
                                            f5 = f21;
                                            fArr2 = fArr4;
                                            f4 = f15;
                                            barEntry = barEntry6;
                                            i2 = i14;
                                        }
                                        if (barEntry.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                            Drawable icon2 = barEntry.getIcon();
                                            Utils.drawImage(canvas, icon2, (int) (f4 + mPPointF.f1365x), (int) (f5 + mPPointF.f1366y), icon2.getIntrinsicWidth(), icon2.getIntrinsicHeight());
                                        }
                                    }
                                    i14 = i2 + 2;
                                    barEntry6 = barEntry;
                                    fArr4 = fArr2;
                                    f15 = f4;
                                }
                            } else if (!this.mViewPortHandler.isInBoundsRight(f14)) {
                                break;
                            } else {
                                float[] fArr5 = yVals;
                                int i15 = i10 + 1;
                                if (!this.mViewPortHandler.isInBoundsY(barBuffer.buffer[i15]) || !this.mViewPortHandler.isInBoundsLeft(f14)) {
                                    transformer2 = transformer2;
                                    z = z;
                                    f = f;
                                    i9 = i9;
                                } else {
                                    if (iBarDataSet.isDrawValuesEnabled()) {
                                        f6 = f14;
                                        f3 = f;
                                        fArr = fArr5;
                                        barEntry2 = barEntry5;
                                        i = i9;
                                        z3 = z;
                                        transformer = transformer2;
                                        drawValue(canvas, valueFormatter3.getBarLabel(barEntry5), f6, barBuffer.buffer[i15] + (barEntry5.getY() >= 0.0f ? f10 : f11), valueTextColor);
                                    } else {
                                        f6 = f14;
                                        i = i9;
                                        f3 = f;
                                        z3 = z;
                                        fArr = fArr5;
                                        barEntry2 = barEntry5;
                                        transformer = transformer2;
                                    }
                                    if (barEntry2.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                        Drawable icon3 = barEntry2.getIcon();
                                        Utils.drawImage(canvas, icon3, (int) (mPPointF.f1365x + f6), (int) (barBuffer.buffer[i15] + (barEntry2.getY() >= 0.0f ? f10 : f11) + mPPointF.f1366y), icon3.getIntrinsicWidth(), icon3.getIntrinsicHeight());
                                    }
                                }
                            }
                            i10 = fArr == null ? i10 + 4 : i10 + (fArr.length * 4);
                            i9 = i + 1;
                            transformer2 = transformer;
                            z = z3;
                            f = f3;
                        }
                    }
                    f2 = f;
                    z2 = z;
                    MPPointF.recycleInstance(mPPointF);
                }
                i4++;
                isDrawValueAboveBarEnabled = z2;
                dataSets = list;
                convertDpToPixel = f2;
            }
        }
    }

    public void drawValue(Canvas canvas, String str, float f, float f2, int i) {
        this.mValuePaint.setColor(i);
        canvas.drawText(str, f, f2, this.mValuePaint);
    }

    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        float f;
        float f2;
        BarData barData = this.mChart.getBarData();
        for (Highlight highlight : highlightArr) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iBarDataSet != null && iBarDataSet.isHighlightEnabled()) {
                BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(barEntry, iBarDataSet)) {
                    Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
                    this.mHighlightPaint.setColor(iBarDataSet.getHighLightColor());
                    this.mHighlightPaint.setAlpha(iBarDataSet.getHighLightAlpha());
                    if (!(highlight.getStackIndex() >= 0 && barEntry.isStacked())) {
                        f2 = barEntry.getY();
                        f = 0.0f;
                    } else if (this.mChart.isHighlightFullBarEnabled()) {
                        float positiveSum = barEntry.getPositiveSum();
                        f = -barEntry.getNegativeSum();
                        f2 = positiveSum;
                    } else {
                        Range range = barEntry.getRanges()[highlight.getStackIndex()];
                        f2 = range.from;
                        f = range.f1354to;
                    }
                    prepareBarHighlight(barEntry.getX(), f2, f, barData.getBarWidth() / 2.0f, transformer);
                    setHighlightDrawPos(highlight, this.mBarRect);
                    canvas.drawRect(this.mBarRect, this.mHighlightPaint);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setHighlightDrawPos(Highlight highlight, RectF rectF) {
        highlight.setDraw(rectF.centerX(), rectF.top);
    }
}
