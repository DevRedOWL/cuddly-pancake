package com.jjoe64.graphview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import androidx.core.widget.EdgeEffectCompat;
import com.github.mikephil.charting.utils.Utils;
import com.jjoe64.graphview.series.DataPointInterface;
import com.jjoe64.graphview.series.Series;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Viewport {
    private int mBackgroundColor;
    private Integer mBorderColor;
    private Paint mBorderPaint;
    protected RectD mCompleteRange = new RectD();
    protected RectD mCurrentViewport = new RectD();
    private boolean mDrawBorder;
    /* access modifiers changed from: private */
    public EdgeEffectCompat mEdgeEffectBottom;
    /* access modifiers changed from: private */
    public EdgeEffectCompat mEdgeEffectLeft;
    /* access modifiers changed from: private */
    public EdgeEffectCompat mEdgeEffectRight;
    /* access modifiers changed from: private */
    public EdgeEffectCompat mEdgeEffectTop;
    protected GestureDetector mGestureDetector;
    private final GestureDetector.SimpleOnGestureListener mGestureListener = new GestureDetector.SimpleOnGestureListener() {
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return true;
        }

        public boolean onDown(MotionEvent motionEvent) {
            if (Viewport.this.mGraphView.isCursorMode()) {
                return true;
            }
            if (!Viewport.this.mIsScrollable || Viewport.this.mScalingActive) {
                return false;
            }
            Viewport.this.releaseEdgeEffects();
            Viewport.this.mScroller.forceFinished(true);
            ViewCompat.postInvalidateOnAnimation(Viewport.this.mGraphView);
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:49:0x01f5, code lost:
            if (r14 < com.github.mikephil.charting.utils.Utils.DOUBLE_EPSILON) goto L_0x0206;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0204, code lost:
            if (r14 > com.github.mikephil.charting.utils.Utils.DOUBLE_EPSILON) goto L_0x0206;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x024c, code lost:
            if (r5 < com.github.mikephil.charting.utils.Utils.DOUBLE_EPSILON) goto L_0x025c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x025a, code lost:
            if (r5 > com.github.mikephil.charting.utils.Utils.DOUBLE_EPSILON) goto L_0x025c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onScroll(android.view.MotionEvent r34, android.view.MotionEvent r35, float r36, float r37) {
            /*
                r33 = this;
                r0 = r33
                com.jjoe64.graphview.Viewport r1 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.GraphView r1 = r1.mGraphView
                boolean r1 = r1.isCursorMode()
                r2 = 1
                if (r1 == 0) goto L_0x0010
                return r2
            L_0x0010:
                com.jjoe64.graphview.Viewport r1 = com.jjoe64.graphview.Viewport.this
                boolean r1 = r1.mIsScrollable
                if (r1 == 0) goto L_0x0349
                com.jjoe64.graphview.Viewport r1 = com.jjoe64.graphview.Viewport.this
                boolean r1 = r1.mScalingActive
                if (r1 == 0) goto L_0x0020
                goto L_0x0349
            L_0x0020:
                r1 = r36
                double r4 = (double) r1
                com.jjoe64.graphview.Viewport r1 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.RectD r1 = r1.mCurrentViewport
                double r6 = r1.width()
                double r4 = r4 * r6
                com.jjoe64.graphview.Viewport r1 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.GraphView r1 = r1.mGraphView
                int r1 = r1.getGraphContentWidth()
                double r6 = (double) r1
                double r4 = r4 / r6
                r1 = r37
                double r6 = (double) r1
                com.jjoe64.graphview.Viewport r1 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.RectD r1 = r1.mCurrentViewport
                double r8 = r1.height()
                double r8 = r8 * r6
                com.jjoe64.graphview.Viewport r1 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.GraphView r1 = r1.mGraphView
                int r1 = r1.getGraphContentHeight()
                double r10 = (double) r1
                double r8 = r8 / r10
                com.jjoe64.graphview.Viewport r1 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.RectD r1 = r1.mCompleteRange
                double r10 = r1.left
                com.jjoe64.graphview.Viewport r1 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.RectD r1 = r1.mMinimalViewport
                double r12 = r1.left
                boolean r1 = java.lang.Double.isNaN(r12)
                if (r1 != 0) goto L_0x0072
                com.jjoe64.graphview.Viewport r1 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.RectD r1 = r1.mMinimalViewport
                double r12 = r1.left
                double r10 = java.lang.Math.min(r10, r12)
            L_0x0072:
                com.jjoe64.graphview.Viewport r1 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.RectD r1 = r1.mCompleteRange
                double r12 = r1.right
                com.jjoe64.graphview.Viewport r1 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.RectD r1 = r1.mMinimalViewport
                double r14 = r1.right
                boolean r1 = java.lang.Double.isNaN(r14)
                if (r1 != 0) goto L_0x0092
                com.jjoe64.graphview.Viewport r1 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.RectD r1 = r1.mMinimalViewport
                double r14 = r1.right
                double r12 = java.lang.Math.max(r12, r14)
            L_0x0092:
                double r14 = r12 - r10
                com.jjoe64.graphview.Viewport r1 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.RectD r1 = r1.mCompleteRange
                double r2 = r1.bottom
                com.jjoe64.graphview.Viewport r1 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.RectD r1 = r1.mMinimalViewport
                r36 = r6
                double r6 = r1.bottom
                boolean r1 = java.lang.Double.isNaN(r6)
                if (r1 != 0) goto L_0x00b6
                com.jjoe64.graphview.Viewport r1 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.RectD r1 = r1.mMinimalViewport
                double r6 = r1.bottom
                double r2 = java.lang.Math.min(r2, r6)
            L_0x00b6:
                com.jjoe64.graphview.Viewport r1 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.RectD r1 = r1.mCompleteRange
                double r6 = r1.top
                com.jjoe64.graphview.Viewport r1 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.RectD r1 = r1.mMinimalViewport
                r16 = r12
                double r12 = r1.top
                boolean r1 = java.lang.Double.isNaN(r12)
                if (r1 != 0) goto L_0x00d8
                com.jjoe64.graphview.Viewport r1 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.RectD r1 = r1.mMinimalViewport
                double r12 = r1.top
                double r6 = java.lang.Math.max(r6, r12)
            L_0x00d8:
                double r12 = r6 - r2
                com.jjoe64.graphview.Viewport r1 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.RectD r1 = r1.mCurrentViewport
                double r18 = r1.width()
                double r18 = r14 / r18
                com.jjoe64.graphview.Viewport r1 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.GraphView r1 = r1.mGraphView
                int r1 = r1.getGraphContentWidth()
                r20 = r6
                double r6 = (double) r1
                double r6 = r6 * r18
                int r1 = (int) r6
                com.jjoe64.graphview.Viewport r6 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.RectD r6 = r6.mCurrentViewport
                double r6 = r6.height()
                double r6 = r12 / r6
                r18 = r12
                com.jjoe64.graphview.Viewport r12 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.GraphView r12 = r12.mGraphView
                int r12 = r12.getGraphContentHeight()
                double r12 = (double) r12
                double r6 = r6 * r12
                int r6 = (int) r6
                double r12 = (double) r1
                com.jjoe64.graphview.Viewport r7 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.RectD r7 = r7.mCurrentViewport
                r22 = r2
                r3 = r1
                double r1 = r7.left
                double r1 = r1 + r4
                double r1 = r1 - r10
                double r12 = r12 * r1
                double r12 = r12 / r14
                int r1 = (int) r12
                double r12 = (double) r6
                com.jjoe64.graphview.Viewport r2 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.RectD r2 = r2.mCurrentViewport
                double r14 = r2.bottom
                double r14 = r14 + r8
                double r14 = r14 - r22
                double r12 = r12 * r14
                double r12 = r12 / r18
                r14 = -4616189618054758400(0xbff0000000000000, double:-1.0)
                double r12 = r12 * r14
                int r2 = (int) r12
                com.jjoe64.graphview.Viewport r7 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.RectD r7 = r7.mCurrentViewport
                double r12 = r7.left
                int r7 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                if (r7 > 0) goto L_0x0148
                com.jjoe64.graphview.Viewport r7 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.RectD r7 = r7.mCurrentViewport
                double r12 = r7.right
                int r7 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
                if (r7 >= 0) goto L_0x0146
                goto L_0x0148
            L_0x0146:
                r7 = 0
                goto L_0x0149
            L_0x0148:
                r7 = 1
            L_0x0149:
                com.jjoe64.graphview.Viewport r12 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.RectD r12 = r12.mCurrentViewport
                double r12 = r12.bottom
                int r14 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
                if (r14 > 0) goto L_0x0160
                com.jjoe64.graphview.Viewport r12 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.RectD r12 = r12.mCurrentViewport
                double r12 = r12.top
                int r14 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
                if (r14 >= 0) goto L_0x015e
                goto L_0x0160
            L_0x015e:
                r12 = 0
                goto L_0x0161
            L_0x0160:
                r12 = 1
            L_0x0161:
                com.jjoe64.graphview.Viewport r13 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.GraphView r13 = r13.mGraphView
                com.jjoe64.graphview.SecondScale r13 = r13.mSecondScale
                if (r13 == 0) goto L_0x016d
                r13 = 1
                goto L_0x016e
            L_0x016d:
                r13 = 0
            L_0x016e:
                if (r13 == 0) goto L_0x01d2
                com.jjoe64.graphview.Viewport r14 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.GraphView r14 = r14.mGraphView
                com.jjoe64.graphview.SecondScale r14 = r14.mSecondScale
                com.jjoe64.graphview.RectD r14 = r14.mCurrentViewport
                double r14 = r14.height()
                double r14 = r14 * r36
                r36 = r6
                com.jjoe64.graphview.Viewport r6 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.GraphView r6 = r6.mGraphView
                int r6 = r6.getGraphContentHeight()
                r24 = r2
                r37 = r3
                double r2 = (double) r6
                double r14 = r14 / r2
                com.jjoe64.graphview.Viewport r2 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.GraphView r2 = r2.mGraphView
                com.jjoe64.graphview.SecondScale r2 = r2.mSecondScale
                com.jjoe64.graphview.RectD r2 = r2.mCurrentViewport
                double r2 = r2.bottom
                com.jjoe64.graphview.Viewport r6 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.GraphView r6 = r6.mGraphView
                com.jjoe64.graphview.SecondScale r6 = r6.mSecondScale
                com.jjoe64.graphview.RectD r6 = r6.mCompleteRange
                r25 = r14
                double r14 = r6.bottom
                int r6 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
                if (r6 > 0) goto L_0x01cf
                com.jjoe64.graphview.Viewport r2 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.GraphView r2 = r2.mGraphView
                com.jjoe64.graphview.SecondScale r2 = r2.mSecondScale
                com.jjoe64.graphview.RectD r2 = r2.mCurrentViewport
                double r2 = r2.top
                com.jjoe64.graphview.Viewport r6 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.GraphView r6 = r6.mGraphView
                com.jjoe64.graphview.SecondScale r6 = r6.mSecondScale
                com.jjoe64.graphview.RectD r6 = r6.mCompleteRange
                double r14 = r6.top
                int r6 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
                if (r6 >= 0) goto L_0x01cd
                goto L_0x01cf
            L_0x01cd:
                r2 = 0
                goto L_0x01d0
            L_0x01cf:
                r2 = 1
            L_0x01d0:
                r12 = r12 | r2
                goto L_0x01da
            L_0x01d2:
                r24 = r2
                r37 = r3
                r36 = r6
                r25 = 0
            L_0x01da:
                com.jjoe64.graphview.Viewport r2 = com.jjoe64.graphview.Viewport.this
                boolean r2 = r2.scrollableY
                r2 = r2 & r12
                if (r7 == 0) goto L_0x0237
                r14 = 0
                int r3 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
                if (r3 >= 0) goto L_0x01f8
                com.jjoe64.graphview.Viewport r3 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.RectD r3 = r3.mCurrentViewport
                double r14 = r3.left
                double r14 = r14 + r4
                double r14 = r14 - r10
                r10 = 0
                int r3 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
                if (r3 >= 0) goto L_0x0207
                goto L_0x0206
            L_0x01f8:
                r10 = r14
                com.jjoe64.graphview.Viewport r3 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.RectD r3 = r3.mCurrentViewport
                double r14 = r3.right
                double r14 = r14 + r4
                double r14 = r14 - r16
                int r3 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
                if (r3 <= 0) goto L_0x0207
            L_0x0206:
                double r4 = r4 - r14
            L_0x0207:
                com.jjoe64.graphview.Viewport r3 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.RectD r3 = r3.mCurrentViewport
                double r10 = r3.left
                double r10 = r10 + r4
                r3.left = r10
                com.jjoe64.graphview.Viewport r3 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.RectD r3 = r3.mCurrentViewport
                double r10 = r3.right
                double r10 = r10 + r4
                r3.right = r10
                com.jjoe64.graphview.Viewport r3 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.Viewport$OnXAxisBoundsChangedListener r3 = r3.mOnXAxisBoundsChangedListener
                if (r3 == 0) goto L_0x0237
                com.jjoe64.graphview.Viewport r3 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.Viewport$OnXAxisBoundsChangedListener r3 = r3.mOnXAxisBoundsChangedListener
                com.jjoe64.graphview.Viewport r4 = com.jjoe64.graphview.Viewport.this
                r5 = 0
                double r28 = r4.getMinX(r5)
                com.jjoe64.graphview.Viewport r4 = com.jjoe64.graphview.Viewport.this
                double r30 = r4.getMaxX(r5)
                com.jjoe64.graphview.Viewport$OnXAxisBoundsChangedListener$Reason r32 = com.jjoe64.graphview.Viewport.OnXAxisBoundsChangedListener.Reason.SCROLL
                r27 = r3
                r27.onXAxisBoundsChanged(r28, r30, r32)
            L_0x0237:
                if (r2 == 0) goto L_0x0291
                if (r13 != 0) goto L_0x025d
                r3 = 0
                int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r5 >= 0) goto L_0x024f
                com.jjoe64.graphview.Viewport r5 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.RectD r5 = r5.mCurrentViewport
                double r5 = r5.bottom
                double r5 = r5 + r8
                double r5 = r5 - r22
                int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r10 >= 0) goto L_0x025d
                goto L_0x025c
            L_0x024f:
                com.jjoe64.graphview.Viewport r5 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.RectD r5 = r5.mCurrentViewport
                double r5 = r5.top
                double r5 = r5 + r8
                double r5 = r5 - r20
                int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r10 <= 0) goto L_0x025d
            L_0x025c:
                double r8 = r8 - r5
            L_0x025d:
                com.jjoe64.graphview.Viewport r3 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.RectD r3 = r3.mCurrentViewport
                double r4 = r3.top
                double r4 = r4 + r8
                r3.top = r4
                com.jjoe64.graphview.Viewport r3 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.RectD r3 = r3.mCurrentViewport
                double r4 = r3.bottom
                double r4 = r4 + r8
                r3.bottom = r4
                if (r13 == 0) goto L_0x0291
                com.jjoe64.graphview.Viewport r3 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.GraphView r3 = r3.mGraphView
                com.jjoe64.graphview.SecondScale r3 = r3.mSecondScale
                com.jjoe64.graphview.RectD r3 = r3.mCurrentViewport
                double r4 = r3.top
                double r4 = r4 + r25
                r3.top = r4
                com.jjoe64.graphview.Viewport r3 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.GraphView r3 = r3.mGraphView
                com.jjoe64.graphview.SecondScale r3 = r3.mSecondScale
                com.jjoe64.graphview.RectD r3 = r3.mCurrentViewport
                double r4 = r3.bottom
                double r4 = r4 + r25
                r3.bottom = r4
            L_0x0291:
                if (r7 == 0) goto L_0x02ab
                if (r1 >= 0) goto L_0x02ab
                com.jjoe64.graphview.Viewport r3 = com.jjoe64.graphview.Viewport.this
                androidx.core.widget.EdgeEffectCompat r3 = r3.mEdgeEffectLeft
                float r4 = (float) r1
                com.jjoe64.graphview.Viewport r5 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.GraphView r5 = r5.mGraphView
                int r5 = r5.getGraphContentWidth()
                float r5 = (float) r5
                float r4 = r4 / r5
                r3.onPull(r4)
            L_0x02ab:
                if (r13 != 0) goto L_0x02ca
                if (r2 == 0) goto L_0x02ca
                if (r24 >= 0) goto L_0x02ca
                com.jjoe64.graphview.Viewport r3 = com.jjoe64.graphview.Viewport.this
                androidx.core.widget.EdgeEffectCompat r3 = r3.mEdgeEffectBottom
                r4 = r24
                float r5 = (float) r4
                com.jjoe64.graphview.Viewport r6 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.GraphView r6 = r6.mGraphView
                int r6 = r6.getGraphContentHeight()
                float r6 = (float) r6
                float r5 = r5 / r6
                r3.onPull(r5)
                goto L_0x02cc
            L_0x02ca:
                r4 = r24
            L_0x02cc:
                if (r7 == 0) goto L_0x02ff
                com.jjoe64.graphview.Viewport r3 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.GraphView r3 = r3.mGraphView
                int r3 = r3.getGraphContentWidth()
                int r3 = r37 - r3
                if (r1 <= r3) goto L_0x02ff
                com.jjoe64.graphview.Viewport r3 = com.jjoe64.graphview.Viewport.this
                androidx.core.widget.EdgeEffectCompat r3 = r3.mEdgeEffectRight
                int r1 = r1 - r37
                com.jjoe64.graphview.Viewport r5 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.GraphView r5 = r5.mGraphView
                int r5 = r5.getGraphContentWidth()
                int r1 = r1 + r5
                float r1 = (float) r1
                com.jjoe64.graphview.Viewport r5 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.GraphView r5 = r5.mGraphView
                int r5 = r5.getGraphContentWidth()
                float r5 = (float) r5
                float r1 = r1 / r5
                r3.onPull(r1)
            L_0x02ff:
                if (r13 != 0) goto L_0x0334
                if (r2 == 0) goto L_0x0334
                com.jjoe64.graphview.Viewport r1 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.GraphView r1 = r1.mGraphView
                int r1 = r1.getGraphContentHeight()
                int r6 = r36 - r1
                if (r4 <= r6) goto L_0x0334
                com.jjoe64.graphview.Viewport r1 = com.jjoe64.graphview.Viewport.this
                androidx.core.widget.EdgeEffectCompat r1 = r1.mEdgeEffectTop
                int r2 = r4 - r36
                com.jjoe64.graphview.Viewport r3 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.GraphView r3 = r3.mGraphView
                int r3 = r3.getGraphContentHeight()
                int r2 = r2 + r3
                float r2 = (float) r2
                com.jjoe64.graphview.Viewport r3 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.GraphView r3 = r3.mGraphView
                int r3 = r3.getGraphContentHeight()
                float r3 = (float) r3
                float r2 = r2 / r3
                r1.onPull(r2)
            L_0x0334:
                com.jjoe64.graphview.Viewport r1 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.GraphView r1 = r1.mGraphView
                r2 = 1
                r3 = 0
                r1.onDataChanged(r2, r3)
                com.jjoe64.graphview.Viewport r1 = com.jjoe64.graphview.Viewport.this
                com.jjoe64.graphview.GraphView r1 = r1.mGraphView
                androidx.core.view.ViewCompat.postInvalidateOnAnimation(r1)
                return r2
            L_0x0349:
                r3 = 0
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.jjoe64.graphview.Viewport.C27512.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
        }
    };
    /* access modifiers changed from: private */
    public final GraphView mGraphView;
    /* access modifiers changed from: private */
    public boolean mIsScalable;
    /* access modifiers changed from: private */
    public boolean mIsScrollable;
    protected double mMaxXAxisSize = Utils.DOUBLE_EPSILON;
    protected double mMaxYAxisSize = Utils.DOUBLE_EPSILON;
    /* access modifiers changed from: private */
    public RectD mMinimalViewport = new RectD(Double.NaN, Double.NaN, Double.NaN, Double.NaN);
    protected OnXAxisBoundsChangedListener mOnXAxisBoundsChangedListener;
    private Paint mPaint;
    protected ScaleGestureDetector mScaleGestureDetector;
    private final ScaleGestureDetector.OnScaleGestureListener mScaleGestureListener = new ScaleGestureDetector.OnScaleGestureListener() {
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float f;
            double width = Viewport.this.mCurrentViewport.width();
            if (Viewport.this.mMaxXAxisSize != Utils.DOUBLE_EPSILON && width > Viewport.this.mMaxXAxisSize) {
                width = Viewport.this.mMaxXAxisSize;
            }
            double d = Viewport.this.mCurrentViewport.left + (width / 2.0d);
            if (Build.VERSION.SDK_INT < 11 || !Viewport.this.scalableY) {
                f = scaleGestureDetector.getScaleFactor();
            } else {
                f = scaleGestureDetector.getCurrentSpanX() / scaleGestureDetector.getPreviousSpanX();
            }
            double d2 = width / ((double) f);
            Viewport.this.mCurrentViewport.left = d - (d2 / 2.0d);
            Viewport.this.mCurrentViewport.right = Viewport.this.mCurrentViewport.left + d2;
            double minX = Viewport.this.getMinX(true);
            if (!Double.isNaN(Viewport.this.mMinimalViewport.left)) {
                minX = Math.min(minX, Viewport.this.mMinimalViewport.left);
            }
            if (Viewport.this.mCurrentViewport.left < minX) {
                Viewport.this.mCurrentViewport.left = minX;
                Viewport.this.mCurrentViewport.right = Viewport.this.mCurrentViewport.left + d2;
            }
            double maxX = Viewport.this.getMaxX(true);
            if (!Double.isNaN(Viewport.this.mMinimalViewport.right)) {
                maxX = Math.max(maxX, Viewport.this.mMinimalViewport.right);
            }
            if (d2 == Utils.DOUBLE_EPSILON) {
                Viewport.this.mCurrentViewport.right = maxX;
            }
            double d3 = (Viewport.this.mCurrentViewport.left + d2) - maxX;
            if (d3 > Utils.DOUBLE_EPSILON) {
                if (Viewport.this.mCurrentViewport.left - d3 > minX) {
                    Viewport.this.mCurrentViewport.left -= d3;
                    Viewport.this.mCurrentViewport.right = Viewport.this.mCurrentViewport.left + d2;
                } else {
                    Viewport.this.mCurrentViewport.left = minX;
                    Viewport.this.mCurrentViewport.right = maxX;
                }
            }
            if (Viewport.this.scalableY && Build.VERSION.SDK_INT >= 11 && scaleGestureDetector.getCurrentSpanY() != 0.0f && scaleGestureDetector.getPreviousSpanY() != 0.0f) {
                boolean z = Viewport.this.mGraphView.mSecondScale != null;
                double height = Viewport.this.mCurrentViewport.height() * -1.0d;
                if (Viewport.this.mMaxYAxisSize != Utils.DOUBLE_EPSILON && height > Viewport.this.mMaxYAxisSize) {
                    height = Viewport.this.mMaxYAxisSize;
                }
                double d4 = Viewport.this.mCurrentViewport.bottom + (height / 2.0d);
                double currentSpanY = height / ((double) (scaleGestureDetector.getCurrentSpanY() / scaleGestureDetector.getPreviousSpanY()));
                Viewport.this.mCurrentViewport.bottom = d4 - (currentSpanY / 2.0d);
                Viewport.this.mCurrentViewport.top = Viewport.this.mCurrentViewport.bottom + currentSpanY;
                if (!z) {
                    double minY = Viewport.this.getMinY(true);
                    if (!Double.isNaN(Viewport.this.mMinimalViewport.bottom)) {
                        minY = Math.min(minY, Viewport.this.mMinimalViewport.bottom);
                    }
                    if (Viewport.this.mCurrentViewport.bottom < minY) {
                        Viewport.this.mCurrentViewport.bottom = minY;
                        Viewport.this.mCurrentViewport.top = Viewport.this.mCurrentViewport.bottom + currentSpanY;
                    }
                    double maxY = Viewport.this.getMaxY(true);
                    if (!Double.isNaN(Viewport.this.mMinimalViewport.top)) {
                        maxY = Math.max(maxY, Viewport.this.mMinimalViewport.top);
                    }
                    if (currentSpanY == Utils.DOUBLE_EPSILON) {
                        Viewport.this.mCurrentViewport.top = maxY;
                    }
                    double d5 = (Viewport.this.mCurrentViewport.bottom + currentSpanY) - maxY;
                    if (d5 > Utils.DOUBLE_EPSILON) {
                        if (Viewport.this.mCurrentViewport.bottom - d5 > minY) {
                            Viewport.this.mCurrentViewport.bottom -= d5;
                            Viewport.this.mCurrentViewport.top = Viewport.this.mCurrentViewport.bottom + currentSpanY;
                        } else {
                            Viewport.this.mCurrentViewport.bottom = minY;
                            Viewport.this.mCurrentViewport.top = maxY;
                        }
                    }
                } else {
                    double height2 = Viewport.this.mGraphView.mSecondScale.mCurrentViewport.height() * -1.0d;
                    double d6 = Viewport.this.mGraphView.mSecondScale.mCurrentViewport.bottom + (height2 / 2.0d);
                    double currentSpanY2 = height2 / ((double) (scaleGestureDetector.getCurrentSpanY() / scaleGestureDetector.getPreviousSpanY()));
                    Viewport.this.mGraphView.mSecondScale.mCurrentViewport.bottom = d6 - (currentSpanY2 / 2.0d);
                    Viewport.this.mGraphView.mSecondScale.mCurrentViewport.top = Viewport.this.mGraphView.mSecondScale.mCurrentViewport.bottom + currentSpanY2;
                }
            }
            Viewport.this.mGraphView.onDataChanged(true, false);
            ViewCompat.postInvalidateOnAnimation(Viewport.this.mGraphView);
            return true;
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            if (Viewport.this.mGraphView.isCursorMode() || !Viewport.this.mIsScalable) {
                return false;
            }
            Viewport.this.mScalingActive = true;
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            Viewport viewport = Viewport.this;
            viewport.mScalingActive = false;
            if (viewport.mOnXAxisBoundsChangedListener != null) {
                Viewport.this.mOnXAxisBoundsChangedListener.onXAxisBoundsChanged(Viewport.this.getMinX(false), Viewport.this.getMaxX(false), OnXAxisBoundsChangedListener.Reason.SCALE);
            }
            ViewCompat.postInvalidateOnAnimation(Viewport.this.mGraphView);
        }
    };
    protected boolean mScalingActive;
    protected OverScroller mScroller;
    private boolean mXAxisBoundsManual;
    protected AxisBoundsStatus mXAxisBoundsStatus;
    private boolean mYAxisBoundsManual;
    protected AxisBoundsStatus mYAxisBoundsStatus;
    protected double referenceX = Double.NaN;
    protected double referenceY = Double.NaN;
    protected boolean scalableY;
    /* access modifiers changed from: private */
    public boolean scrollableY;

    public enum AxisBoundsStatus {
        INITIAL,
        AUTO_ADJUSTED,
        FIX
    }

    public interface OnXAxisBoundsChangedListener {

        public enum Reason {
            SCROLL,
            SCALE
        }

        void onXAxisBoundsChanged(double d, double d2, Reason reason);
    }

    public void computeScroll() {
    }

    /* access modifiers changed from: protected */
    public double getReferenceX() {
        if (!isXAxisBoundsManual() || this.mGraphView.getGridLabelRenderer().isHumanRoundingX()) {
            return Utils.DOUBLE_EPSILON;
        }
        if (Double.isNaN(this.referenceX)) {
            this.referenceX = getMinX(false);
        }
        return this.referenceX;
    }

    Viewport(GraphView graphView) {
        this.mScroller = new OverScroller(graphView.getContext());
        this.mEdgeEffectTop = new EdgeEffectCompat(graphView.getContext());
        this.mEdgeEffectBottom = new EdgeEffectCompat(graphView.getContext());
        this.mEdgeEffectLeft = new EdgeEffectCompat(graphView.getContext());
        this.mEdgeEffectRight = new EdgeEffectCompat(graphView.getContext());
        this.mGestureDetector = new GestureDetector(graphView.getContext(), this.mGestureListener);
        this.mScaleGestureDetector = new ScaleGestureDetector(graphView.getContext(), this.mScaleGestureListener);
        this.mGraphView = graphView;
        this.mXAxisBoundsStatus = AxisBoundsStatus.INITIAL;
        this.mYAxisBoundsStatus = AxisBoundsStatus.INITIAL;
        this.mBackgroundColor = 0;
        this.mPaint = new Paint();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = this.mScaleGestureDetector.onTouchEvent(motionEvent) | this.mGestureDetector.onTouchEvent(motionEvent);
        if (!this.mGraphView.isCursorMode()) {
            return onTouchEvent;
        }
        if (motionEvent.getAction() == 0) {
            this.mGraphView.getCursorMode().onDown(motionEvent);
            onTouchEvent |= true;
        }
        if (motionEvent.getAction() == 2) {
            this.mGraphView.getCursorMode().onMove(motionEvent);
            onTouchEvent |= true;
        }
        return motionEvent.getAction() == 1 ? onTouchEvent | this.mGraphView.getCursorMode().onUp(motionEvent) : onTouchEvent;
    }

    public void setXAxisBoundsStatus(AxisBoundsStatus axisBoundsStatus) {
        this.mXAxisBoundsStatus = axisBoundsStatus;
    }

    public void setYAxisBoundsStatus(AxisBoundsStatus axisBoundsStatus) {
        this.mYAxisBoundsStatus = axisBoundsStatus;
    }

    public boolean isScrollable() {
        return this.mIsScrollable;
    }

    public void setScrollable(boolean z) {
        this.mIsScrollable = z;
    }

    public AxisBoundsStatus getXAxisBoundsStatus() {
        return this.mXAxisBoundsStatus;
    }

    public AxisBoundsStatus getYAxisBoundsStatus() {
        return this.mYAxisBoundsStatus;
    }

    public void calcCompleteRange() {
        List<Series> series = this.mGraphView.getSeries();
        ArrayList<Series> arrayList = new ArrayList<>(this.mGraphView.getSeries());
        if (this.mGraphView.mSecondScale != null) {
            arrayList.addAll(this.mGraphView.mSecondScale.getSeries());
        }
        this.mCompleteRange.set(Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON);
        if (!arrayList.isEmpty() && !((Series) arrayList.get(0)).isEmpty()) {
            double lowestValueX = ((Series) arrayList.get(0)).getLowestValueX();
            for (Series series2 : arrayList) {
                if (!series2.isEmpty() && lowestValueX > series2.getLowestValueX()) {
                    lowestValueX = series2.getLowestValueX();
                }
            }
            this.mCompleteRange.left = lowestValueX;
            double highestValueX = ((Series) arrayList.get(0)).getHighestValueX();
            for (Series series3 : arrayList) {
                if (!series3.isEmpty() && highestValueX < series3.getHighestValueX()) {
                    highestValueX = series3.getHighestValueX();
                }
            }
            this.mCompleteRange.right = highestValueX;
            if (!series.isEmpty() && !series.get(0).isEmpty()) {
                double lowestValueY = series.get(0).getLowestValueY();
                for (Series next : series) {
                    if (!next.isEmpty() && lowestValueY > next.getLowestValueY()) {
                        lowestValueY = next.getLowestValueY();
                    }
                }
                this.mCompleteRange.bottom = lowestValueY;
                double highestValueY = series.get(0).getHighestValueY();
                for (Series next2 : series) {
                    if (!next2.isEmpty() && highestValueY < next2.getHighestValueY()) {
                        highestValueY = next2.getHighestValueY();
                    }
                }
                this.mCompleteRange.top = highestValueY;
            }
        }
        if (this.mYAxisBoundsStatus == AxisBoundsStatus.AUTO_ADJUSTED) {
            this.mYAxisBoundsStatus = AxisBoundsStatus.INITIAL;
        }
        if (this.mYAxisBoundsStatus == AxisBoundsStatus.INITIAL) {
            this.mCurrentViewport.top = this.mCompleteRange.top;
            this.mCurrentViewport.bottom = this.mCompleteRange.bottom;
        }
        if (this.mXAxisBoundsStatus == AxisBoundsStatus.AUTO_ADJUSTED) {
            this.mXAxisBoundsStatus = AxisBoundsStatus.INITIAL;
        }
        if (this.mXAxisBoundsStatus == AxisBoundsStatus.INITIAL) {
            this.mCurrentViewport.left = this.mCompleteRange.left;
            this.mCurrentViewport.right = this.mCompleteRange.right;
        } else if (this.mXAxisBoundsManual && !this.mYAxisBoundsManual && this.mCompleteRange.width() != Utils.DOUBLE_EPSILON) {
            double d = Double.MAX_VALUE;
            for (Series values : series) {
                Iterator values2 = values.getValues(this.mCurrentViewport.left, this.mCurrentViewport.right);
                while (values2.hasNext()) {
                    double y = ((DataPointInterface) values2.next()).getY();
                    if (d > y) {
                        d = y;
                    }
                }
            }
            if (d != Double.MAX_VALUE) {
                this.mCurrentViewport.bottom = d;
            }
            double d2 = Double.MIN_VALUE;
            for (Series values3 : series) {
                Iterator values4 = values3.getValues(this.mCurrentViewport.left, this.mCurrentViewport.right);
                while (values4.hasNext()) {
                    double y2 = ((DataPointInterface) values4.next()).getY();
                    if (d2 < y2) {
                        d2 = y2;
                    }
                }
            }
            if (d2 != Double.MIN_VALUE) {
                this.mCurrentViewport.top = d2;
            }
        }
        if (this.mCurrentViewport.left == this.mCurrentViewport.right) {
            this.mCurrentViewport.right += 1.0d;
        }
        if (this.mCurrentViewport.top == this.mCurrentViewport.bottom) {
            this.mCurrentViewport.top += 1.0d;
        }
    }

    public double getMinX(boolean z) {
        if (z) {
            return this.mCompleteRange.left;
        }
        return this.mCurrentViewport.left;
    }

    public double getMaxX(boolean z) {
        if (z) {
            return this.mCompleteRange.right;
        }
        return this.mCurrentViewport.right;
    }

    public double getMinY(boolean z) {
        if (z) {
            return this.mCompleteRange.bottom;
        }
        return this.mCurrentViewport.bottom;
    }

    public double getMaxY(boolean z) {
        if (z) {
            return this.mCompleteRange.top;
        }
        return this.mCurrentViewport.top;
    }

    public void setMaxY(double d) {
        this.mCurrentViewport.top = d;
    }

    public void setMinY(double d) {
        this.mCurrentViewport.bottom = d;
    }

    public void setMaxX(double d) {
        this.mCurrentViewport.right = d;
    }

    public void setMinX(double d) {
        this.mCurrentViewport.left = d;
    }

    /* access modifiers changed from: private */
    public void releaseEdgeEffects() {
        this.mEdgeEffectLeft.onRelease();
        this.mEdgeEffectRight.onRelease();
        this.mEdgeEffectTop.onRelease();
        this.mEdgeEffectBottom.onRelease();
    }

    private void fling(int i, int i2) {
        releaseEdgeEffects();
        int width = ((int) ((this.mCurrentViewport.width() / this.mCompleteRange.width()) * ((double) ((float) this.mGraphView.getGraphContentWidth())))) - this.mGraphView.getGraphContentWidth();
        int height = ((int) ((this.mCurrentViewport.height() / this.mCompleteRange.height()) * ((double) ((float) this.mGraphView.getGraphContentHeight())))) - this.mGraphView.getGraphContentHeight();
        int width2 = ((int) ((this.mCurrentViewport.left - this.mCompleteRange.left) / this.mCompleteRange.width())) * width;
        int height2 = ((int) ((this.mCurrentViewport.top - this.mCompleteRange.top) / this.mCompleteRange.height())) * height;
        this.mScroller.forceFinished(true);
        this.mScroller.fling(width2, height2, i, 0, 0, width, 0, height, this.mGraphView.getGraphContentWidth() / 2, this.mGraphView.getGraphContentHeight() / 2);
        ViewCompat.postInvalidateOnAnimation(this.mGraphView);
    }

    private void drawEdgeEffectsUnclipped(Canvas canvas) {
        boolean z;
        if (!this.mEdgeEffectTop.isFinished()) {
            int save = canvas.save();
            canvas.translate((float) this.mGraphView.getGraphContentLeft(), (float) this.mGraphView.getGraphContentTop());
            this.mEdgeEffectTop.setSize(this.mGraphView.getGraphContentWidth(), this.mGraphView.getGraphContentHeight());
            z = this.mEdgeEffectTop.draw(canvas);
            canvas.restoreToCount(save);
        } else {
            z = false;
        }
        if (!this.mEdgeEffectBottom.isFinished()) {
            int save2 = canvas.save();
            canvas.translate((float) this.mGraphView.getGraphContentLeft(), (float) (this.mGraphView.getGraphContentTop() + this.mGraphView.getGraphContentHeight()));
            canvas.rotate(180.0f, (float) (this.mGraphView.getGraphContentWidth() / 2), 0.0f);
            this.mEdgeEffectBottom.setSize(this.mGraphView.getGraphContentWidth(), this.mGraphView.getGraphContentHeight());
            if (this.mEdgeEffectBottom.draw(canvas)) {
                z = true;
            }
            canvas.restoreToCount(save2);
        }
        if (!this.mEdgeEffectLeft.isFinished()) {
            int save3 = canvas.save();
            canvas.translate((float) this.mGraphView.getGraphContentLeft(), (float) (this.mGraphView.getGraphContentTop() + this.mGraphView.getGraphContentHeight()));
            canvas.rotate(-90.0f, 0.0f, 0.0f);
            this.mEdgeEffectLeft.setSize(this.mGraphView.getGraphContentHeight(), this.mGraphView.getGraphContentWidth());
            if (this.mEdgeEffectLeft.draw(canvas)) {
                z = true;
            }
            canvas.restoreToCount(save3);
        }
        if (!this.mEdgeEffectRight.isFinished()) {
            int save4 = canvas.save();
            canvas.translate((float) (this.mGraphView.getGraphContentLeft() + this.mGraphView.getGraphContentWidth()), (float) this.mGraphView.getGraphContentTop());
            canvas.rotate(90.0f, 0.0f, 0.0f);
            this.mEdgeEffectRight.setSize(this.mGraphView.getGraphContentHeight(), this.mGraphView.getGraphContentWidth());
            if (this.mEdgeEffectRight.draw(canvas)) {
                z = true;
            }
            canvas.restoreToCount(save4);
        }
        if (z) {
            ViewCompat.postInvalidateOnAnimation(this.mGraphView);
        }
    }

    public void drawFirst(Canvas canvas) {
        int i = this.mBackgroundColor;
        if (i != 0) {
            this.mPaint.setColor(i);
            canvas.drawRect((float) this.mGraphView.getGraphContentLeft(), (float) this.mGraphView.getGraphContentTop(), (float) (this.mGraphView.getGraphContentLeft() + this.mGraphView.getGraphContentWidth()), (float) (this.mGraphView.getGraphContentTop() + this.mGraphView.getGraphContentHeight()), this.mPaint);
        }
        if (this.mDrawBorder) {
            Paint paint = this.mBorderPaint;
            if (paint == null) {
                paint = this.mPaint;
                paint.setColor(getBorderColor());
            }
            Paint paint2 = paint;
            canvas.drawLine((float) this.mGraphView.getGraphContentLeft(), (float) this.mGraphView.getGraphContentTop(), (float) this.mGraphView.getGraphContentLeft(), (float) (this.mGraphView.getGraphContentTop() + this.mGraphView.getGraphContentHeight()), paint2);
            canvas.drawLine((float) this.mGraphView.getGraphContentLeft(), (float) (this.mGraphView.getGraphContentTop() + this.mGraphView.getGraphContentHeight()), (float) (this.mGraphView.getGraphContentLeft() + this.mGraphView.getGraphContentWidth()), (float) (this.mGraphView.getGraphContentTop() + this.mGraphView.getGraphContentHeight()), paint2);
            if (this.mGraphView.mSecondScale != null) {
                canvas.drawLine((float) (this.mGraphView.getGraphContentLeft() + this.mGraphView.getGraphContentWidth()), (float) this.mGraphView.getGraphContentTop(), (float) (this.mGraphView.getGraphContentLeft() + this.mGraphView.getGraphContentWidth()), (float) (this.mGraphView.getGraphContentTop() + this.mGraphView.getGraphContentHeight()), paint);
            }
        }
    }

    public void draw(Canvas canvas) {
        drawEdgeEffectsUnclipped(canvas);
    }

    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public void setBackgroundColor(int i) {
        this.mBackgroundColor = i;
    }

    public boolean isScalable() {
        return this.mIsScalable;
    }

    public void setScalable(boolean z) {
        this.mIsScalable = z;
        if (z) {
            this.mIsScrollable = true;
            setXAxisBoundsManual(true);
        }
    }

    public boolean isXAxisBoundsManual() {
        return this.mXAxisBoundsManual;
    }

    public void setXAxisBoundsManual(boolean z) {
        this.mXAxisBoundsManual = z;
        if (z) {
            this.mXAxisBoundsStatus = AxisBoundsStatus.FIX;
        }
    }

    public boolean isYAxisBoundsManual() {
        return this.mYAxisBoundsManual;
    }

    public void setYAxisBoundsManual(boolean z) {
        this.mYAxisBoundsManual = z;
        if (z) {
            this.mYAxisBoundsStatus = AxisBoundsStatus.FIX;
        }
    }

    public void scrollToEnd() {
        if (this.mXAxisBoundsManual) {
            double width = this.mCurrentViewport.width();
            this.mCurrentViewport.right = this.mCompleteRange.right;
            this.mCurrentViewport.left = this.mCompleteRange.right - width;
            this.mGraphView.onDataChanged(true, false);
            return;
        }
        Log.w("GraphView", "scrollToEnd works only with manual x axis bounds");
    }

    public OnXAxisBoundsChangedListener getOnXAxisBoundsChangedListener() {
        return this.mOnXAxisBoundsChangedListener;
    }

    public void setOnXAxisBoundsChangedListener(OnXAxisBoundsChangedListener onXAxisBoundsChangedListener) {
        this.mOnXAxisBoundsChangedListener = onXAxisBoundsChangedListener;
    }

    public void setDrawBorder(boolean z) {
        this.mDrawBorder = z;
    }

    public int getBorderColor() {
        Integer num = this.mBorderColor;
        if (num != null) {
            return num.intValue();
        }
        return this.mGraphView.getGridLabelRenderer().getGridColor();
    }

    public void setBorderColor(Integer num) {
        this.mBorderColor = num;
    }

    public void setBorderPaint(Paint paint) {
        this.mBorderPaint = paint;
    }

    public void setScrollableY(boolean z) {
        this.scrollableY = z;
    }

    /* access modifiers changed from: protected */
    public double getReferenceY() {
        if (!isYAxisBoundsManual() || this.mGraphView.getGridLabelRenderer().isHumanRoundingY()) {
            return Utils.DOUBLE_EPSILON;
        }
        if (Double.isNaN(this.referenceY)) {
            this.referenceY = getMinY(false);
        }
        return this.referenceY;
    }

    public void setScalableY(boolean z) {
        if (z) {
            this.scrollableY = true;
            setScalable(true);
            if (Build.VERSION.SDK_INT < 11) {
                Log.w("GraphView", "Vertical scaling requires minimum Android 3.0 (API Level 11)");
            }
        }
        this.scalableY = z;
    }

    public double getMaxXAxisSize() {
        return this.mMaxXAxisSize;
    }

    public double getMaxYAxisSize() {
        return this.mMaxYAxisSize;
    }

    public void setMaxXAxisSize(double d) {
        this.mMaxXAxisSize = d;
    }

    public void setMaxYAxisSize(double d) {
        this.mMaxYAxisSize = d;
    }

    public void setMinimalViewport(double d, double d2, double d3, double d4) {
        this.mMinimalViewport.set(d, d4, d2, d3);
    }
}
