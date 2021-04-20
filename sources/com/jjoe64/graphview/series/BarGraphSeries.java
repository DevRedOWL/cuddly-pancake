package com.jjoe64.graphview.series;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.AccelerateInterpolator;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.RectD;
import com.jjoe64.graphview.ValueDependentColor;
import com.jjoe64.graphview.series.DataPointInterface;
import java.util.HashMap;
import java.util.Map;

public class BarGraphSeries<E extends DataPointInterface> extends BaseSeries<E> {
    private static final long ANIMATION_DURATION = 333;
    private boolean mAnimated;
    private AccelerateInterpolator mAnimationInterpolator;
    private long mAnimationStart;
    private int mAnimationStartFrameNo;
    private Paint mCustomPaint;
    private Map<RectD, E> mDataPoints;
    private double mDataWidth;
    private boolean mDrawValuesOnTop;
    private double mLastAnimatedValue;
    private Paint mPaint;
    private int mSpacing;
    private ValueDependentColor<E> mValueDependentColor;
    private int mValuesOnTopColor;
    private float mValuesOnTopSize;

    public void drawSelection(GraphView graphView, Canvas canvas, boolean z, DataPointInterface dataPointInterface) {
    }

    public BarGraphSeries() {
        this.mDataPoints = new HashMap();
        this.mLastAnimatedValue = Double.NaN;
        this.mPaint = new Paint();
    }

    public BarGraphSeries(E[] eArr) {
        super(eArr);
        this.mDataPoints = new HashMap();
        this.mLastAnimatedValue = Double.NaN;
        this.mPaint = new Paint();
        this.mAnimationInterpolator = new AccelerateInterpolator(2.0f);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x00bf A[EDGE_INSN: B:112:0x00bf->B:27:0x00bf ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a9  */
    public void draw(com.jjoe64.graphview.GraphView r55, android.graphics.Canvas r56, boolean r57) {
        /*
            r54 = this;
            r0 = r54
            android.graphics.Paint r1 = r0.mPaint
            android.graphics.Paint$Align r2 = android.graphics.Paint.Align.CENTER
            r1.setTextAlign(r2)
            float r1 = r0.mValuesOnTopSize
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x001a
            com.jjoe64.graphview.GridLabelRenderer r1 = r55.getGridLabelRenderer()
            float r1 = r1.getTextSize()
            r0.mValuesOnTopSize = r1
        L_0x001a:
            android.graphics.Paint r1 = r0.mPaint
            float r2 = r0.mValuesOnTopSize
            r1.setTextSize(r2)
            r54.resetDataPoints()
            com.jjoe64.graphview.Viewport r1 = r55.getViewport()
            r2 = 0
            double r3 = r1.getMaxX(r2)
            com.jjoe64.graphview.Viewport r1 = r55.getViewport()
            double r5 = r1.getMinX(r2)
            if (r57 == 0) goto L_0x0048
            com.jjoe64.graphview.SecondScale r1 = r55.getSecondScale()
            double r7 = r1.getMaxY(r2)
            com.jjoe64.graphview.SecondScale r1 = r55.getSecondScale()
            double r9 = r1.getMinY(r2)
            goto L_0x0058
        L_0x0048:
            com.jjoe64.graphview.Viewport r1 = r55.getViewport()
            double r7 = r1.getMaxY(r2)
            com.jjoe64.graphview.Viewport r1 = r55.getViewport()
            double r9 = r1.getMinY(r2)
        L_0x0058:
            java.util.TreeSet r1 = new java.util.TreeSet
            r1.<init>()
            java.util.List r11 = r55.getSeries()
            java.util.Iterator r11 = r11.iterator()
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x0068:
            boolean r15 = r11.hasNext()
            if (r15 == 0) goto L_0x00c3
            java.lang.Object r15 = r11.next()
            com.jjoe64.graphview.series.Series r15 = (com.jjoe64.graphview.series.Series) r15
            boolean r2 = r15 instanceof com.jjoe64.graphview.series.BarGraphSeries
            if (r2 == 0) goto L_0x00bd
            if (r15 != r0) goto L_0x007c
            r2 = 1
            goto L_0x007d
        L_0x007c:
            r2 = 0
        L_0x007d:
            if (r2 == 0) goto L_0x0080
            r14 = r13
        L_0x0080:
            int r13 = r13 + 1
            java.util.Iterator r15 = r15.getValues(r5, r3)
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x00bd
            java.lang.Object r16 = r15.next()
            com.jjoe64.graphview.series.DataPointInterface r16 = (com.jjoe64.graphview.series.DataPointInterface) r16
            double r16 = r16.getX()
            r18 = r11
            java.lang.Double r11 = java.lang.Double.valueOf(r16)
            r1.add(r11)
            if (r2 == 0) goto L_0x00a3
        L_0x00a1:
            int r12 = r12 + 1
        L_0x00a3:
            boolean r11 = r15.hasNext()
            if (r11 == 0) goto L_0x00bf
            java.lang.Object r11 = r15.next()
            com.jjoe64.graphview.series.DataPointInterface r11 = (com.jjoe64.graphview.series.DataPointInterface) r11
            double r16 = r11.getX()
            java.lang.Double r11 = java.lang.Double.valueOf(r16)
            r1.add(r11)
            if (r2 == 0) goto L_0x00a3
            goto L_0x00a1
        L_0x00bd:
            r18 = r11
        L_0x00bf:
            r11 = r18
            r2 = 0
            goto L_0x0068
        L_0x00c3:
            if (r12 != 0) goto L_0x00c6
            return
        L_0x00c6:
            double r11 = r0.mDataWidth
            r16 = 0
            int r2 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x00cf
            goto L_0x0102
        L_0x00cf:
            r2 = 0
            java.util.Iterator r1 = r1.iterator()
            r11 = r16
        L_0x00d6:
            boolean r15 = r1.hasNext()
            if (r15 == 0) goto L_0x0102
            java.lang.Object r15 = r1.next()
            java.lang.Double r15 = (java.lang.Double) r15
            if (r2 == 0) goto L_0x0100
            double r18 = r15.doubleValue()
            double r20 = r2.doubleValue()
            double r18 = r18 - r20
            double r18 = java.lang.Math.abs(r18)
            int r2 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r2 == 0) goto L_0x00fe
            int r2 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x0100
            int r2 = (r18 > r11 ? 1 : (r18 == r11 ? 0 : -1))
            if (r2 >= 0) goto L_0x0100
        L_0x00fe:
            r11 = r18
        L_0x0100:
            r2 = r15
            goto L_0x00d6
        L_0x0102:
            int r1 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r1 != 0) goto L_0x0109
            r1 = 1
            r2 = 1
            goto L_0x0113
        L_0x0109:
            double r1 = r3 - r5
            double r1 = r1 / r11
            long r1 = java.lang.Math.round(r1)
            int r2 = (int) r1
            r1 = 1
            int r2 = r2 + r1
        L_0x0113:
            java.util.Iterator r11 = r0.getValues(r5, r3)
            if (r2 != r1) goto L_0x011e
            int r2 = r55.getGraphContentWidth()
            goto L_0x0125
        L_0x011e:
            int r12 = r55.getGraphContentWidth()
            int r2 = r2 - r1
            int r2 = r12 / r2
        L_0x0125:
            int r12 = r0.mSpacing
            int r12 = r12 * r2
            int r12 = r12 / 100
            float r12 = (float) r12
            float r15 = (float) r2
            r18 = 1065017672(0x3f7ae148, float:0.98)
            float r15 = r15 * r18
            float r12 = java.lang.Math.min(r12, r15)
            r18 = r14
            double r14 = (double) r12
            double r0 = (double) r2
            double r0 = r0 - r14
            double r12 = (double) r13
            double r0 = r0 / r12
            int r2 = r2 / 2
            double r12 = (double) r2
            double r7 = r7 - r9
            double r3 = r3 - r5
            int r2 = r55.getGraphContentHeight()
            r19 = r0
            double r0 = (double) r2
            int r2 = r55.getGraphContentWidth()
            r21 = r14
            double r14 = (double) r2
            int r2 = r55.getGraphContentLeft()
            r23 = r12
            double r12 = (double) r2
            int r2 = r55.getGraphContentTop()
            r25 = r12
            double r12 = (double) r2
        L_0x015e:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x0314
            java.lang.Object r2 = r11.next()
            com.jjoe64.graphview.series.DataPointInterface r2 = (com.jjoe64.graphview.series.DataPointInterface) r2
            double r27 = r2.getY()
            double r27 = r27 - r9
            double r27 = r27 / r7
            double r27 = r27 * r0
            double r29 = r16 - r9
            double r29 = r29 / r7
            double r29 = r29 * r0
            r31 = r7
            double r7 = r2.getX()
            double r33 = r7 - r5
            double r33 = r33 / r3
            double r33 = r33 * r14
            com.jjoe64.graphview.ValueDependentColor r35 = r54.getValueDependentColor()
            if (r35 == 0) goto L_0x01a0
            r35 = r3
            r3 = r54
            android.graphics.Paint r4 = r3.mPaint
            r37 = r5
            com.jjoe64.graphview.ValueDependentColor r5 = r54.getValueDependentColor()
            int r5 = r5.get(r2)
            r4.setColor(r5)
            goto L_0x01af
        L_0x01a0:
            r35 = r3
            r37 = r5
            r3 = r54
            android.graphics.Paint r4 = r3.mPaint
            int r5 = r54.getColor()
            r4.setColor(r5)
        L_0x01af:
            double r33 = r33 + r25
            double r33 = r33 - r23
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = r21 / r4
            double r33 = r33 + r4
            r4 = r18
            double r5 = (double) r4
            double r5 = r5 * r19
            double r5 = r33 + r5
            double r27 = r12 - r27
            double r27 = r27 + r0
            r33 = r9
            double r9 = r5 + r19
            double r29 = r12 - r29
            double r29 = r29 + r0
            com.jjoe64.graphview.GridLabelRenderer r18 = r55.getGridLabelRenderer()
            boolean r18 = r18.isHighlightZeroLines()
            r39 = 4
            r40 = r0
            if (r18 == 0) goto L_0x01de
            r18 = r4
            r4 = 4
            goto L_0x01e1
        L_0x01de:
            r18 = r4
            r4 = 1
        L_0x01e1:
            double r0 = (double) r4
            double r29 = r29 - r0
            int r0 = (r27 > r29 ? 1 : (r27 == r29 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ea
            r0 = 1
            goto L_0x01eb
        L_0x01ea:
            r0 = 0
        L_0x01eb:
            boolean r1 = r3.mAnimated
            r4 = r2
            if (r1 == 0) goto L_0x0243
            double r1 = r3.mLastAnimatedValue
            boolean r1 = java.lang.Double.isNaN(r1)
            if (r1 != 0) goto L_0x01fe
            double r1 = r3.mLastAnimatedValue
            int r42 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r42 >= 0) goto L_0x0243
        L_0x01fe:
            long r1 = java.lang.System.currentTimeMillis()
            r42 = r11
            r43 = r12
            long r11 = r3.mAnimationStart
            r45 = 0
            int r13 = (r11 > r45 ? 1 : (r11 == r45 ? 0 : -1))
            if (r13 != 0) goto L_0x0214
            r3.mAnimationStart = r1
            r11 = 0
            r3.mAnimationStartFrameNo = r11
            goto L_0x0220
        L_0x0214:
            int r11 = r3.mAnimationStartFrameNo
            r12 = 15
            if (r11 >= r12) goto L_0x0220
            r3.mAnimationStart = r1
            int r11 = r11 + 1
            r3.mAnimationStartFrameNo = r11
        L_0x0220:
            long r11 = r3.mAnimationStart
            long r1 = r1 - r11
            float r1 = (float) r1
            r2 = 1134985216(0x43a68000, float:333.0)
            float r1 = r1 / r2
            android.view.animation.AccelerateInterpolator r2 = r3.mAnimationInterpolator
            float r2 = r2.getInterpolation(r1)
            double r11 = (double) r1
            r45 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r1 = (r11 > r45 ? 1 : (r11 == r45 ? 0 : -1))
            if (r1 > 0) goto L_0x0240
            double r7 = r29 - r27
            double r1 = (double) r2
            double r7 = r7 * r1
            double r27 = r29 - r7
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r55)
            goto L_0x0247
        L_0x0240:
            r3.mLastAnimatedValue = r7
            goto L_0x0247
        L_0x0243:
            r42 = r11
            r43 = r12
        L_0x0247:
            if (r0 == 0) goto L_0x025f
            com.jjoe64.graphview.GridLabelRenderer r1 = r55.getGridLabelRenderer()
            boolean r1 = r1.isHighlightZeroLines()
            if (r1 == 0) goto L_0x0255
            r1 = 4
            goto L_0x0256
        L_0x0255:
            r1 = 1
        L_0x0256:
            double r1 = (double) r1
            double r1 = r29 + r1
            r11 = r1
            r1 = r25
            r7 = r27
            goto L_0x0265
        L_0x025f:
            r1 = r25
            r11 = r27
            r7 = r29
        L_0x0265:
            double r5 = java.lang.Math.max(r5, r1)
            r13 = r4
            r25 = r5
            double r4 = r1 + r14
            double r4 = java.lang.Math.min(r9, r4)
            double r9 = r43 + r40
            double r6 = java.lang.Math.min(r7, r9)
            r27 = r1
            r1 = r43
            double r11 = java.lang.Math.max(r11, r1)
            java.util.Map<com.jjoe64.graphview.RectD, E> r8 = r3.mDataPoints
            r29 = r13
            com.jjoe64.graphview.RectD r13 = new com.jjoe64.graphview.RectD
            r45 = r13
            r46 = r25
            r48 = r11
            r50 = r4
            r52 = r6
            r45.<init>(r46, r48, r50, r52)
            r43 = r14
            r14 = r29
            r8.put(r13, r14)
            android.graphics.Paint r8 = r3.mCustomPaint
            if (r8 == 0) goto L_0x029f
            goto L_0x02a1
        L_0x029f:
            android.graphics.Paint r8 = r3.mPaint
        L_0x02a1:
            r50 = r8
            r29 = r14
            r13 = r25
            float r8 = (float) r13
            float r15 = (float) r11
            r25 = r13
            float r13 = (float) r4
            float r14 = (float) r6
            r45 = r56
            r46 = r8
            r47 = r15
            r48 = r13
            r49 = r14
            r45.drawRect(r46, r47, r48, r49, r50)
            boolean r8 = r3.mDrawValuesOnTop
            if (r8 == 0) goto L_0x02fe
            r13 = 4616189618054758400(0x4010000000000000, double:4.0)
            if (r0 == 0) goto L_0x02ce
            float r0 = r3.mValuesOnTopSize
            double r11 = (double) r0
            double r6 = r6 + r11
            double r6 = r6 + r13
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x02cc
            goto L_0x02d7
        L_0x02cc:
            r9 = r6
            goto L_0x02d7
        L_0x02ce:
            double r9 = r11 - r13
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x02d7
            double r12 = r1 + r13
            double r9 = r9 + r12
        L_0x02d7:
            android.graphics.Paint r0 = r3.mPaint
            int r6 = r3.mValuesOnTopColor
            r0.setColor(r6)
            com.jjoe64.graphview.GridLabelRenderer r0 = r55.getGridLabelRenderer()
            com.jjoe64.graphview.LabelFormatter r0 = r0.getLabelFormatter()
            double r6 = r29.getY()
            r8 = 0
            java.lang.String r0 = r0.formatLabel(r6, r8)
            double r5 = r25 + r4
            float r4 = (float) r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            float r5 = (float) r9
            android.graphics.Paint r6 = r3.mPaint
            r7 = r56
            r7.drawText(r0, r4, r5, r6)
            goto L_0x0301
        L_0x02fe:
            r7 = r56
            r8 = 0
        L_0x0301:
            r12 = r1
            r25 = r27
            r7 = r31
            r9 = r33
            r3 = r35
            r5 = r37
            r0 = r40
            r11 = r42
            r14 = r43
            goto L_0x015e
        L_0x0314:
            r3 = r54
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jjoe64.graphview.series.BarGraphSeries.draw(com.jjoe64.graphview.GraphView, android.graphics.Canvas, boolean):void");
    }

    public ValueDependentColor<E> getValueDependentColor() {
        return this.mValueDependentColor;
    }

    public void setValueDependentColor(ValueDependentColor<E> valueDependentColor) {
        this.mValueDependentColor = valueDependentColor;
    }

    public int getSpacing() {
        return this.mSpacing;
    }

    public void setSpacing(int i) {
        this.mSpacing = i;
    }

    public double getDataWidth() {
        return this.mDataWidth;
    }

    public void setDataWidth(double d) {
        this.mDataWidth = d;
    }

    public boolean isDrawValuesOnTop() {
        return this.mDrawValuesOnTop;
    }

    public void setDrawValuesOnTop(boolean z) {
        this.mDrawValuesOnTop = z;
    }

    public int getValuesOnTopColor() {
        return this.mValuesOnTopColor;
    }

    public void setValuesOnTopColor(int i) {
        this.mValuesOnTopColor = i;
    }

    public float getValuesOnTopSize() {
        return this.mValuesOnTopSize;
    }

    public void setValuesOnTopSize(float f) {
        this.mValuesOnTopSize = f;
    }

    /* access modifiers changed from: protected */
    public void resetDataPoints() {
        this.mDataPoints.clear();
    }

    /* access modifiers changed from: protected */
    public E findDataPoint(float f, float f2) {
        for (Map.Entry next : this.mDataPoints.entrySet()) {
            double d = (double) f;
            if (d >= ((RectD) next.getKey()).left && d <= ((RectD) next.getKey()).right) {
                double d2 = (double) f2;
                if (d2 >= ((RectD) next.getKey()).top && d2 <= ((RectD) next.getKey()).bottom) {
                    return (DataPointInterface) next.getValue();
                }
            }
        }
        return null;
    }

    public Paint getCustomPaint() {
        return this.mCustomPaint;
    }

    public void setCustomPaint(Paint paint) {
        this.mCustomPaint = paint;
    }

    public void setAnimated(boolean z) {
        this.mAnimated = z;
    }

    public boolean isAnimated() {
        return this.mAnimated;
    }
}
