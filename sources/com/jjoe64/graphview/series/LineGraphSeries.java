package com.jjoe64.graphview.series;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.animation.AccelerateInterpolator;
import com.drew.metadata.exif.makernotes.NikonType2MakernoteDirectory;
import com.facebook.imageutils.JfifUtil;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPointInterface;

public class LineGraphSeries<E extends DataPointInterface> extends BaseSeries<E> {
    private static final long ANIMATION_DURATION = 333;
    private boolean mAnimated;
    private AccelerateInterpolator mAnimationInterpolator;
    private long mAnimationStart;
    private int mAnimationStartFrameNo;
    private Paint mCustomPaint;
    private boolean mDrawAsPath = false;
    private double mLastAnimatedValue = Double.NaN;
    private Paint mPaint;
    private Paint mPaintBackground;
    private Path mPath;
    private Path mPathBackground;
    private Paint mSelectionPaint;
    private LineGraphSeries<E>.Styles mStyles;

    private final class Styles {
        /* access modifiers changed from: private */
        public int backgroundColor;
        /* access modifiers changed from: private */
        public float dataPointsRadius;
        /* access modifiers changed from: private */
        public boolean drawBackground;
        /* access modifiers changed from: private */
        public boolean drawDataPoints;
        /* access modifiers changed from: private */
        public int thickness;

        private Styles() {
            this.thickness = 5;
            this.drawBackground = false;
            this.drawDataPoints = false;
            this.dataPointsRadius = 10.0f;
            this.backgroundColor = Color.argb(100, NikonType2MakernoteDirectory.TAG_IMAGE_STABILISATION, JfifUtil.MARKER_SOS, 255);
        }
    }

    public LineGraphSeries() {
        init();
    }

    public LineGraphSeries(E[] eArr) {
        super(eArr);
        init();
    }

    /* access modifiers changed from: protected */
    public void init() {
        this.mStyles = new Styles();
        this.mPaint = new Paint();
        this.mPaint.setStrokeCap(Paint.Cap.ROUND);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaintBackground = new Paint();
        this.mSelectionPaint = new Paint();
        this.mSelectionPaint.setColor(Color.argb(80, 0, 0, 0));
        this.mSelectionPaint.setStyle(Paint.Style.FILL);
        this.mPathBackground = new Path();
        this.mPath = new Path();
        this.mAnimationInterpolator = new AccelerateInterpolator(2.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x028a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(com.jjoe64.graphview.GraphView r58, android.graphics.Canvas r59, boolean r60) {
        /*
            r57 = this;
            r0 = r57
            r1 = r59
            r57.resetDataPoints()
            com.jjoe64.graphview.Viewport r2 = r58.getViewport()
            r3 = 0
            double r4 = r2.getMaxX(r3)
            com.jjoe64.graphview.Viewport r2 = r58.getViewport()
            double r6 = r2.getMinX(r3)
            if (r60 == 0) goto L_0x002b
            com.jjoe64.graphview.SecondScale r2 = r58.getSecondScale()
            double r8 = r2.getMaxY(r3)
            com.jjoe64.graphview.SecondScale r2 = r58.getSecondScale()
            double r10 = r2.getMinY(r3)
            goto L_0x003b
        L_0x002b:
            com.jjoe64.graphview.Viewport r2 = r58.getViewport()
            double r8 = r2.getMaxY(r3)
            com.jjoe64.graphview.Viewport r2 = r58.getViewport()
            double r10 = r2.getMinY(r3)
        L_0x003b:
            java.util.Iterator r2 = r0.getValues(r6, r4)
            android.graphics.Paint r12 = r0.mPaint
            com.jjoe64.graphview.series.LineGraphSeries<E>$Styles r13 = r0.mStyles
            int r13 = r13.thickness
            float r13 = (float) r13
            r12.setStrokeWidth(r13)
            android.graphics.Paint r12 = r0.mPaint
            int r13 = r57.getColor()
            r12.setColor(r13)
            android.graphics.Paint r12 = r0.mPaintBackground
            com.jjoe64.graphview.series.LineGraphSeries<E>$Styles r13 = r0.mStyles
            int r13 = r13.backgroundColor
            r12.setColor(r13)
            android.graphics.Paint r12 = r0.mCustomPaint
            if (r12 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            android.graphics.Paint r12 = r0.mPaint
        L_0x0066:
            android.graphics.Path r13 = r0.mPath
            r13.reset()
            com.jjoe64.graphview.series.LineGraphSeries<E>$Styles r13 = r0.mStyles
            boolean r13 = r13.drawBackground
            if (r13 == 0) goto L_0x0078
            android.graphics.Path r13 = r0.mPathBackground
            r13.reset()
        L_0x0078:
            double r8 = r8 - r10
            double r4 = r4 - r6
            int r13 = r58.getGraphContentHeight()
            float r13 = (float) r13
            int r14 = r58.getGraphContentWidth()
            float r14 = (float) r14
            int r15 = r58.getGraphContentLeft()
            float r15 = (float) r15
            int r3 = r58.getGraphContentTop()
            float r3 = (float) r3
            r17 = 2143289344(0x7fc00000, float:NaN)
            r18 = 0
            r19 = -1082130432(0xffffffffbf800000, float:-1.0)
            r20 = 0
            r1 = r15
            r23 = r20
            r25 = r23
            r27 = r25
            r29 = r27
            r17 = 0
            r18 = 2143289344(0x7fc00000, float:NaN)
            r22 = -1082130432(0xffffffffbf800000, float:-1.0)
            r31 = -1082130432(0xffffffffbf800000, float:-1.0)
            r32 = 0
            r33 = 0
            r34 = 0
        L_0x00ad:
            boolean r35 = r2.hasNext()
            if (r35 == 0) goto L_0x03d2
            java.lang.Object r35 = r2.next()
            r60 = r2
            r2 = r35
            com.jjoe64.graphview.series.DataPointInterface r2 = (com.jjoe64.graphview.series.DataPointInterface) r2
            double r35 = r2.getY()
            double r35 = r35 - r10
            double r35 = r35 / r8
            r37 = r8
            double r8 = (double) r13
            double r35 = r35 * r8
            r39 = r10
            double r10 = r2.getX()
            double r41 = r10 - r6
            double r41 = r41 / r4
            r43 = r4
            double r4 = (double) r14
            r45 = r6
            double r6 = r4 * r41
            r41 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r47 = 1134985216(0x43a68000, float:333.0)
            r48 = 0
            r50 = 1065353216(0x3f800000, float:1.0)
            if (r17 <= 0) goto L_0x0324
            r27 = 1
            int r28 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r28 <= 0) goto L_0x00fb
            double r28 = r4 - r23
            double r51 = r35 - r25
            double r28 = r28 * r51
            double r51 = r6 - r23
            double r28 = r28 / r51
            double r28 = r25 + r28
            r30 = 1
            goto L_0x0100
        L_0x00fb:
            r4 = r6
            r28 = r35
            r30 = 0
        L_0x0100:
            int r51 = (r28 > r20 ? 1 : (r28 == r20 ? 0 : -1))
            if (r51 >= 0) goto L_0x0122
            int r30 = (r25 > r20 ? 1 : (r25 == r20 ? 0 : -1))
            if (r30 >= 0) goto L_0x010b
            r28 = 1
            goto L_0x0119
        L_0x010b:
            double r51 = r20 - r25
            double r4 = r4 - r23
            double r51 = r51 * r4
            double r28 = r28 - r25
            double r51 = r51 / r28
            double r4 = r23 + r51
            r28 = 0
        L_0x0119:
            r30 = r28
            r51 = 1
            r52 = 1
            r28 = r20
            goto L_0x0128
        L_0x0122:
            r52 = r30
            r30 = 0
            r51 = 0
        L_0x0128:
            int r53 = (r28 > r8 ? 1 : (r28 == r8 ? 0 : -1))
            if (r53 <= 0) goto L_0x0145
            int r51 = (r25 > r8 ? 1 : (r25 == r8 ? 0 : -1))
            if (r51 <= 0) goto L_0x0133
            r30 = 1
            goto L_0x013f
        L_0x0133:
            double r51 = r8 - r25
            double r4 = r4 - r23
            double r51 = r51 * r4
            double r28 = r28 - r25
            double r51 = r51 / r28
            double r4 = r23 + r51
        L_0x013f:
            r28 = r8
            r51 = 1
            r52 = 1
        L_0x0145:
            int r53 = (r23 > r20 ? 1 : (r23 == r20 ? 0 : -1))
            if (r53 >= 0) goto L_0x015c
            double r53 = r20 - r4
            double r25 = r28 - r25
            double r53 = r53 * r25
            double r23 = r23 - r4
            double r53 = r53 / r23
            double r23 = r28 - r53
            r53 = r6
            r25 = r14
            r6 = r20
            goto L_0x0164
        L_0x015c:
            r53 = r6
            r6 = r23
            r23 = r25
            r25 = r14
        L_0x0164:
            float r14 = (float) r6
            float r50 = r15 + r50
            float r14 = r14 + r50
            int r26 = (r23 > r20 ? 1 : (r23 == r20 ? 0 : -1))
            if (r26 >= 0) goto L_0x017f
            if (r30 != 0) goto L_0x017b
            double r55 = r20 - r28
            double r6 = r4 - r6
            double r55 = r55 * r6
            double r23 = r23 - r28
            double r55 = r55 / r23
            double r6 = r4 - r55
        L_0x017b:
            r23 = r20
            r51 = 1
        L_0x017f:
            int r26 = (r23 > r8 ? 1 : (r23 == r8 ? 0 : -1))
            if (r26 <= 0) goto L_0x0195
            if (r30 != 0) goto L_0x0191
            double r55 = r8 - r28
            double r6 = r4 - r6
            double r55 = r55 * r6
            double r23 = r23 - r28
            double r55 = r55 / r23
            double r6 = r4 - r55
        L_0x0191:
            r23 = r8
            r51 = 1
        L_0x0195:
            float r6 = (float) r6
            float r6 = r6 + r50
            double r7 = (double) r3
            r26 = r14
            r9 = r15
            double r14 = r7 - r23
            float r14 = (float) r14
            float r14 = r14 + r13
            float r4 = (float) r4
            float r4 = r4 + r50
            double r7 = r7 - r28
            float r5 = (float) r7
            float r5 = r5 + r13
            int r7 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x01ad
            r30 = 1
        L_0x01ad:
            if (r30 != 0) goto L_0x02c9
            boolean r7 = java.lang.Float.isNaN(r14)
            if (r7 != 0) goto L_0x02c9
            boolean r7 = java.lang.Float.isNaN(r5)
            if (r7 != 0) goto L_0x02c9
            boolean r7 = r0.mAnimated
            if (r7 == 0) goto L_0x0218
            double r7 = r0.mLastAnimatedValue
            boolean r7 = java.lang.Double.isNaN(r7)
            if (r7 != 0) goto L_0x01d4
            double r7 = r0.mLastAnimatedValue
            int r15 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r15 >= 0) goto L_0x01ce
            goto L_0x01d4
        L_0x01ce:
            r1 = r4
            r7 = r1
            r15 = r13
            r23 = r14
            goto L_0x021c
        L_0x01d4:
            long r7 = java.lang.System.currentTimeMillis()
            r15 = r13
            r23 = r14
            long r13 = r0.mAnimationStart
            int r24 = (r13 > r48 ? 1 : (r13 == r48 ? 0 : -1))
            if (r24 != 0) goto L_0x01e7
            r0.mAnimationStart = r7
            r13 = 0
            r0.mAnimationStartFrameNo = r13
            goto L_0x01f3
        L_0x01e7:
            int r13 = r0.mAnimationStartFrameNo
            r14 = 15
            if (r13 >= r14) goto L_0x01f3
            r0.mAnimationStart = r7
            int r13 = r13 + 1
            r0.mAnimationStartFrameNo = r13
        L_0x01f3:
            long r13 = r0.mAnimationStart
            long r7 = r7 - r13
            float r7 = (float) r7
            float r7 = r7 / r47
            android.view.animation.AccelerateInterpolator r8 = r0.mAnimationInterpolator
            float r8 = r8.getInterpolation(r7)
            double r13 = (double) r7
            int r7 = (r13 > r41 ? 1 : (r13 == r41 ? 0 : -1))
            if (r7 > 0) goto L_0x0215
            float r6 = r6 - r1
            float r6 = r6 * r8
            float r6 = r6 + r1
            float r6 = java.lang.Math.max(r6, r1)
            float r7 = r4 - r1
            float r7 = r7 * r8
            float r7 = r7 + r1
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r58)
            goto L_0x021c
        L_0x0215:
            r0.mLastAnimatedValue = r10
            goto L_0x021b
        L_0x0218:
            r15 = r13
            r23 = r14
        L_0x021b:
            r7 = r4
        L_0x021c:
            if (r52 != 0) goto L_0x0244
            com.jjoe64.graphview.series.LineGraphSeries<E>$Styles r8 = r0.mStyles
            boolean r8 = r8.drawDataPoints
            if (r8 == 0) goto L_0x023e
            android.graphics.Paint$Style r8 = r12.getStyle()
            android.graphics.Paint$Style r10 = android.graphics.Paint.Style.FILL
            r12.setStyle(r10)
            com.jjoe64.graphview.series.LineGraphSeries<E>$Styles r10 = r0.mStyles
            float r10 = r10.dataPointsRadius
            r13 = r59
            r13.drawCircle(r7, r5, r10, r12)
            r12.setStyle(r8)
            goto L_0x0240
        L_0x023e:
            r13 = r59
        L_0x0240:
            r0.registerDataPoint(r4, r5, r2)
            goto L_0x0246
        L_0x0244:
            r13 = r59
        L_0x0246:
            boolean r2 = r0.mDrawAsPath
            if (r2 == 0) goto L_0x0252
            android.graphics.Path r2 = r0.mPath
            r14 = r23
            r2.moveTo(r6, r14)
            goto L_0x0254
        L_0x0252:
            r14 = r23
        L_0x0254:
            boolean r2 = java.lang.Float.isNaN(r18)
            if (r2 != 0) goto L_0x028a
            float r2 = r4 - r18
            float r2 = java.lang.Math.abs(r2)
            r8 = 1050253722(0x3e99999a, float:0.3)
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x0268
            goto L_0x028a
        L_0x0268:
            if (r32 == 0) goto L_0x027b
            r8 = r33
            float r33 = java.lang.Math.min(r8, r5)
            r2 = r34
            float r34 = java.lang.Math.max(r2, r5)
            r2 = r34
            r16 = 0
            goto L_0x02d5
        L_0x027b:
            float r33 = java.lang.Math.min(r14, r5)
            float r34 = java.lang.Math.max(r14, r5)
            r2 = r34
            r16 = 0
            r32 = 1
            goto L_0x02d5
        L_0x028a:
            r8 = r33
            r2 = r34
            boolean r10 = r0.mDrawAsPath
            if (r10 == 0) goto L_0x029a
            android.graphics.Path r10 = r0.mPath
            r10.lineTo(r7, r5)
            r16 = 0
            goto L_0x02c6
        L_0x029a:
            r10 = 4
            if (r32 == 0) goto L_0x02b3
            float[] r11 = new float[r10]
            r16 = 0
            r11[r16] = r18
            r11[r27] = r8
            r24 = 2
            r11[r24] = r18
            r18 = 3
            r11[r18] = r2
            r0.renderLine(r13, r11, r12)
            r32 = 0
            goto L_0x02b9
        L_0x02b3:
            r16 = 0
            r18 = 3
            r24 = 2
        L_0x02b9:
            float[] r10 = new float[r10]
            r10[r16] = r6
            r10[r27] = r14
            r10[r24] = r7
            r10[r18] = r5
            r0.renderLine(r13, r10, r12)
        L_0x02c6:
            r18 = r4
            goto L_0x02d3
        L_0x02c9:
            r15 = r13
            r8 = r33
            r2 = r34
            r16 = 0
            r13 = r59
            r7 = r4
        L_0x02d3:
            r33 = r8
        L_0x02d5:
            com.jjoe64.graphview.series.LineGraphSeries<E>$Styles r4 = r0.mStyles
            boolean r4 = r4.drawBackground
            if (r4 == 0) goto L_0x0314
            r4 = r22
            if (r51 == 0) goto L_0x02fa
            int r8 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r8 != 0) goto L_0x02f1
            android.graphics.Path r4 = r0.mPathBackground
            r8 = r26
            r4.moveTo(r8, r14)
            r22 = r8
            r31 = r14
            goto L_0x02f3
        L_0x02f1:
            r22 = r4
        L_0x02f3:
            android.graphics.Path r4 = r0.mPathBackground
            r4.lineTo(r6, r14)
            r4 = r22
        L_0x02fa:
            int r8 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r8 != 0) goto L_0x0308
            android.graphics.Path r4 = r0.mPathBackground
            r4.moveTo(r6, r14)
            r22 = r6
            r31 = r14
            goto L_0x030a
        L_0x0308:
            r22 = r4
        L_0x030a:
            android.graphics.Path r4 = r0.mPathBackground
            r4.lineTo(r6, r14)
            android.graphics.Path r4 = r0.mPathBackground
            r4.lineTo(r7, r5)
        L_0x0314:
            r4 = r22
            double r6 = (double) r7
            double r10 = (double) r5
            r34 = r2
            r22 = r4
            r29 = r6
            r23 = r9
            r27 = r10
            goto L_0x03bb
        L_0x0324:
            r53 = r6
            r25 = r14
            r9 = r15
            r4 = r22
            r8 = r33
            r5 = r34
            r16 = 0
            r15 = r13
            r13 = r59
            com.jjoe64.graphview.series.LineGraphSeries<E>$Styles r6 = r0.mStyles
            boolean r6 = r6.drawDataPoints
            if (r6 == 0) goto L_0x03af
            r6 = r53
            float r14 = (float) r6
            float r22 = r9 + r50
            float r14 = r14 + r22
            r22 = r5
            double r5 = (double) r3
            double r5 = r5 - r35
            float r5 = (float) r5
            float r5 = r5 + r15
            int r6 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r6 < 0) goto L_0x03b1
            float r6 = r3 + r15
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x03b1
            boolean r6 = r0.mAnimated
            if (r6 == 0) goto L_0x0392
            double r6 = r0.mLastAnimatedValue
            boolean r6 = java.lang.Double.isNaN(r6)
            if (r6 != 0) goto L_0x0366
            double r6 = r0.mLastAnimatedValue
            int r23 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r23 >= 0) goto L_0x0392
        L_0x0366:
            long r6 = java.lang.System.currentTimeMillis()
            r24 = r8
            r23 = r9
            long r8 = r0.mAnimationStart
            int r26 = (r8 > r48 ? 1 : (r8 == r48 ? 0 : -1))
            if (r26 != 0) goto L_0x0376
            r0.mAnimationStart = r6
        L_0x0376:
            long r8 = r0.mAnimationStart
            long r6 = r6 - r8
            float r6 = (float) r6
            float r6 = r6 / r47
            android.view.animation.AccelerateInterpolator r7 = r0.mAnimationInterpolator
            float r7 = r7.getInterpolation(r6)
            double r8 = (double) r6
            int r6 = (r8 > r41 ? 1 : (r8 == r41 ? 0 : -1))
            if (r6 > 0) goto L_0x038f
            float r14 = r14 - r1
            float r14 = r14 * r7
            float r14 = r14 + r1
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r58)
            goto L_0x0396
        L_0x038f:
            r0.mLastAnimatedValue = r10
            goto L_0x0396
        L_0x0392:
            r24 = r8
            r23 = r9
        L_0x0396:
            android.graphics.Paint$Style r6 = r12.getStyle()
            android.graphics.Paint$Style r7 = android.graphics.Paint.Style.FILL
            r12.setStyle(r7)
            com.jjoe64.graphview.series.LineGraphSeries<E>$Styles r7 = r0.mStyles
            float r7 = r7.dataPointsRadius
            r13.drawCircle(r14, r5, r7, r12)
            r12.setStyle(r6)
            r0.registerDataPoint(r14, r5, r2)
            goto L_0x03b5
        L_0x03af:
            r22 = r5
        L_0x03b1:
            r24 = r8
            r23 = r9
        L_0x03b5:
            r34 = r22
            r33 = r24
            r22 = r4
        L_0x03bb:
            int r17 = r17 + 1
            r2 = r60
            r13 = r15
            r15 = r23
            r14 = r25
            r25 = r35
            r8 = r37
            r10 = r39
            r4 = r43
            r6 = r45
            r23 = r53
            goto L_0x00ad
        L_0x03d2:
            r15 = r13
            r4 = r22
            r13 = r59
            boolean r1 = r0.mDrawAsPath
            if (r1 == 0) goto L_0x03e0
            android.graphics.Path r1 = r0.mPath
            r13.drawPath(r1, r12)
        L_0x03e0:
            com.jjoe64.graphview.series.LineGraphSeries<E>$Styles r1 = r0.mStyles
            boolean r1 = r1.drawBackground
            if (r1 == 0) goto L_0x0412
            int r1 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r1 == 0) goto L_0x0412
            float r1 = r15 + r3
            double r2 = (double) r1
            int r5 = (r27 > r2 ? 1 : (r27 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x03fb
            android.graphics.Path r2 = r0.mPathBackground
            r5 = r29
            float r3 = (float) r5
            r2.lineTo(r3, r1)
        L_0x03fb:
            android.graphics.Path r2 = r0.mPathBackground
            r2.lineTo(r4, r1)
            r2 = r31
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x040b
            android.graphics.Path r1 = r0.mPathBackground
            r1.lineTo(r4, r2)
        L_0x040b:
            android.graphics.Path r1 = r0.mPathBackground
            android.graphics.Paint r2 = r0.mPaintBackground
            r13.drawPath(r1, r2)
        L_0x0412:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jjoe64.graphview.series.LineGraphSeries.draw(com.jjoe64.graphview.GraphView, android.graphics.Canvas, boolean):void");
    }

    private void renderLine(Canvas canvas, float[] fArr, Paint paint) {
        if (fArr.length != 4 || fArr[0] != fArr[2] || fArr[1] != fArr[3]) {
            canvas.drawLines(fArr, paint);
        }
    }

    public int getThickness() {
        return this.mStyles.thickness;
    }

    public void setThickness(int i) {
        int unused = this.mStyles.thickness = i;
    }

    public boolean isDrawBackground() {
        return this.mStyles.drawBackground;
    }

    public void setDrawBackground(boolean z) {
        boolean unused = this.mStyles.drawBackground = z;
    }

    public boolean isDrawDataPoints() {
        return this.mStyles.drawDataPoints;
    }

    public void setDrawDataPoints(boolean z) {
        boolean unused = this.mStyles.drawDataPoints = z;
    }

    public float getDataPointsRadius() {
        return this.mStyles.dataPointsRadius;
    }

    public void setDataPointsRadius(float f) {
        float unused = this.mStyles.dataPointsRadius = f;
    }

    public int getBackgroundColor() {
        return this.mStyles.backgroundColor;
    }

    public void setBackgroundColor(int i) {
        int unused = this.mStyles.backgroundColor = i;
    }

    public void setCustomPaint(Paint paint) {
        this.mCustomPaint = paint;
    }

    public void setAnimated(boolean z) {
        this.mAnimated = z;
    }

    public boolean isDrawAsPath() {
        return this.mDrawAsPath;
    }

    public void setDrawAsPath(boolean z) {
        this.mDrawAsPath = z;
    }

    public void appendData(E e, boolean z, int i, boolean z2) {
        if (!isAnimationActive()) {
            this.mAnimationStart = 0;
        }
        super.appendData(e, z, i, z2);
    }

    private boolean isAnimationActive() {
        if (!this.mAnimated || System.currentTimeMillis() - this.mAnimationStart > ANIMATION_DURATION) {
            return false;
        }
        return true;
    }

    public void drawSelection(GraphView graphView, Canvas canvas, boolean z, DataPointInterface dataPointInterface) {
        Canvas canvas2 = canvas;
        double maxX = graphView.getViewport().getMaxX(false) - graphView.getViewport().getMinX(false);
        double graphContentWidth = (double) graphView.getGraphContentWidth();
        double maxY = graphView.getViewport().getMaxY(false) - graphView.getViewport().getMinY(false);
        double graphContentHeight = (double) graphView.getGraphContentHeight();
        double x = (((dataPointInterface.getX() - graphView.getViewport().getMinX(false)) * graphContentWidth) / maxX) + ((double) graphView.getGraphContentLeft());
        float f = (float) x;
        float graphContentTop = (float) ((((double) graphView.getGraphContentTop()) + graphContentHeight) - (((dataPointInterface.getY() - graphView.getViewport().getMinY(false)) * graphContentHeight) / maxY));
        canvas2.drawCircle(f, graphContentTop, 30.0f, this.mSelectionPaint);
        Paint.Style style = this.mPaint.getStyle();
        this.mPaint.setStyle(Paint.Style.FILL);
        canvas2.drawCircle(f, graphContentTop, 23.0f, this.mPaint);
        this.mPaint.setStyle(style);
    }
}
