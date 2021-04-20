package com.jjoe64.graphview;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.TypedValue;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.utils.Utils;
import com.jjoe64.graphview.Viewport;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class GridLabelRenderer {
    private final GraphView mGraphView;
    private String mHorizontalAxisTitle;
    private boolean mHumanRoundingX;
    private boolean mHumanRoundingY;
    protected boolean mIsAdjusted;
    private LabelFormatter mLabelFormatter;
    private Integer mLabelHorizontalHeight;
    private boolean mLabelHorizontalHeightFixed;
    private Integer mLabelHorizontalWidth;
    private Integer mLabelVerticalHeight;
    private Integer mLabelVerticalSecondScaleHeight;
    private Integer mLabelVerticalSecondScaleWidth;
    private Integer mLabelVerticalWidth;
    private boolean mLabelVerticalWidthFixed;
    private int mNumHorizontalLabels;
    private int mNumVerticalLabels;
    private Paint mPaintAxisTitle;
    private Paint mPaintLabel;
    private Paint mPaintLine;
    private Map<Integer, Double> mStepsHorizontal;
    private Map<Integer, Double> mStepsVertical;
    private Map<Integer, Double> mStepsVerticalSecondScale;
    protected Styles mStyles = new Styles();
    private String mVerticalAxisTitle;

    public enum VerticalLabelsVAlign {
        ABOVE,
        MID,
        BELOW
    }

    public final class Styles {
        public int gridColor;
        GridStyle gridStyle;
        public boolean highlightZeroLines;
        public int horizontalAxisTitleColor;
        public float horizontalAxisTitleTextSize;
        public float horizontalLabelsAngle;
        public int horizontalLabelsColor;
        boolean horizontalLabelsVisible;
        int labelsSpace;
        public int padding;
        public float textSize;
        public int verticalAxisTitleColor;
        public float verticalAxisTitleTextSize;
        public Paint.Align verticalLabelsAlign;
        public int verticalLabelsColor;
        public Paint.Align verticalLabelsSecondScaleAlign;
        public int verticalLabelsSecondScaleColor;
        VerticalLabelsVAlign verticalLabelsVAlign = VerticalLabelsVAlign.MID;
        boolean verticalLabelsVisible;

        public Styles() {
        }
    }

    public enum GridStyle {
        BOTH,
        VERTICAL,
        HORIZONTAL,
        NONE;

        public boolean drawVertical() {
            return this == BOTH || (this == VERTICAL && this != NONE);
        }

        public boolean drawHorizontal() {
            return this == BOTH || (this == HORIZONTAL && this != NONE);
        }
    }

    public void setSecondScaleLabelVerticalWidth(Integer num) {
        this.mLabelVerticalSecondScaleWidth = num;
    }

    public GridLabelRenderer(GraphView graphView) {
        this.mGraphView = graphView;
        setLabelFormatter(new DefaultLabelFormatter());
        resetStyles();
        this.mNumVerticalLabels = 5;
        this.mNumHorizontalLabels = 5;
        this.mHumanRoundingX = true;
        this.mHumanRoundingY = true;
    }

    public void resetStyles() {
        int i;
        TypedValue typedValue = new TypedValue();
        this.mGraphView.getContext().getTheme().resolveAttribute(16842818, typedValue, true);
        int i2 = -7829368;
        int i3 = ViewCompat.MEASURED_STATE_MASK;
        int i4 = 20;
        try {
            TypedArray obtainStyledAttributes = this.mGraphView.getContext().obtainStyledAttributes(typedValue.data, new int[]{16842806, 16842808, 16842901, 16843327});
            int color = obtainStyledAttributes.getColor(0, ViewCompat.MEASURED_STATE_MASK);
            int color2 = obtainStyledAttributes.getColor(1, -7829368);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 20);
            i = obtainStyledAttributes.getDimensionPixelSize(3, 20);
            obtainStyledAttributes.recycle();
            i3 = color;
            i2 = color2;
            i4 = dimensionPixelSize;
        } catch (Exception unused) {
            i = 20;
        }
        Styles styles = this.mStyles;
        styles.verticalLabelsColor = i3;
        styles.verticalLabelsSecondScaleColor = i3;
        styles.horizontalLabelsColor = i3;
        styles.gridColor = i2;
        styles.textSize = (float) i4;
        styles.padding = i;
        styles.labelsSpace = ((int) styles.textSize) / 5;
        this.mStyles.verticalLabelsAlign = Paint.Align.RIGHT;
        this.mStyles.verticalLabelsSecondScaleAlign = Paint.Align.LEFT;
        Styles styles2 = this.mStyles;
        styles2.highlightZeroLines = true;
        styles2.verticalAxisTitleColor = styles2.verticalLabelsColor;
        Styles styles3 = this.mStyles;
        styles3.horizontalAxisTitleColor = styles3.horizontalLabelsColor;
        Styles styles4 = this.mStyles;
        styles4.verticalAxisTitleTextSize = styles4.textSize;
        Styles styles5 = this.mStyles;
        styles5.horizontalAxisTitleTextSize = styles5.textSize;
        Styles styles6 = this.mStyles;
        styles6.horizontalLabelsVisible = true;
        styles6.verticalLabelsVisible = true;
        styles6.horizontalLabelsAngle = 0.0f;
        styles6.gridStyle = GridStyle.BOTH;
        reloadStyles();
    }

    public void reloadStyles() {
        this.mPaintLine = new Paint();
        this.mPaintLine.setColor(this.mStyles.gridColor);
        this.mPaintLine.setStrokeWidth(0.0f);
        this.mPaintLabel = new Paint();
        this.mPaintLabel.setTextSize(getTextSize());
        this.mPaintLabel.setAntiAlias(true);
        this.mPaintAxisTitle = new Paint();
        this.mPaintAxisTitle.setTextSize(getTextSize());
        this.mPaintAxisTitle.setTextAlign(Paint.Align.CENTER);
    }

    public boolean isHumanRoundingX() {
        return this.mHumanRoundingX;
    }

    public boolean isHumanRoundingY() {
        return this.mHumanRoundingY;
    }

    public void setHumanRounding(boolean z, boolean z2) {
        this.mHumanRoundingX = z;
        this.mHumanRoundingY = z2;
    }

    public void setHumanRounding(boolean z) {
        this.mHumanRoundingX = z;
        this.mHumanRoundingY = z;
    }

    public float getTextSize() {
        return this.mStyles.textSize;
    }

    public int getVerticalLabelsColor() {
        return this.mStyles.verticalLabelsColor;
    }

    public Paint.Align getVerticalLabelsAlign() {
        return this.mStyles.verticalLabelsAlign;
    }

    public int getHorizontalLabelsColor() {
        return this.mStyles.horizontalLabelsColor;
    }

    public float getHorizontalLabelsAngle() {
        return this.mStyles.horizontalLabelsAngle;
    }

    public void invalidate(boolean z, boolean z2) {
        if (!z2) {
            this.mIsAdjusted = false;
        }
        if (!z) {
            if (!this.mLabelVerticalWidthFixed) {
                this.mLabelVerticalWidth = null;
            }
            this.mLabelVerticalHeight = null;
            this.mLabelVerticalSecondScaleWidth = null;
            this.mLabelVerticalSecondScaleHeight = null;
        }
    }

    /* access modifiers changed from: protected */
    public boolean adjustVerticalSecondScale() {
        double d;
        if (this.mLabelHorizontalHeight == null) {
            return false;
        }
        if (this.mGraphView.mSecondScale == null) {
            return true;
        }
        double minY = this.mGraphView.mSecondScale.getMinY(false);
        double maxY = this.mGraphView.mSecondScale.getMaxY(false);
        int i = this.mNumVerticalLabels;
        if (this.mGraphView.mSecondScale.isYAxisBoundsManual()) {
            double d2 = maxY - minY;
            double round = ((double) Math.round((d2 / ((double) (i - 1))) * 1000000.0d)) / 1000000.0d;
            Map<Integer, Double> map = this.mStepsVerticalSecondScale;
            if (map != null && map.size() > 1) {
                Iterator<Double> it = this.mStepsVerticalSecondScale.values().iterator();
                double d3 = 0.0d;
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        d = 0.0d;
                        break;
                    }
                    Double next = it.next();
                    if (i2 != 0) {
                        d = next.doubleValue();
                        break;
                    }
                    d3 = next.doubleValue();
                    i2++;
                }
                double d4 = d - d3;
                if (d4 > Utils.DOUBLE_EPSILON) {
                    round = d4 > round ? d4 / 2.0d : d4 < round ? 2.0d * d4 : Double.NaN;
                    int i3 = (int) (d2 / d4);
                    int i4 = (int) (d2 / round);
                    boolean z = i3 > i || i4 > i || i4 > i3;
                    if (round == Double.NaN || !z || i4 > i) {
                        round = d4;
                    }
                }
            }
            double d5 = this.mGraphView.getSecondScale().mReferenceY;
            double floor = (Math.floor((minY - d5) / round) * round) + d5;
            int max = Math.max(((int) ((this.mGraphView.getSecondScale().mCurrentViewport.height() * -1.0d) / round)) + 2, 2);
            Map<Integer, Double> map2 = this.mStepsVerticalSecondScale;
            if (map2 != null) {
                map2.clear();
            } else {
                this.mStepsVerticalSecondScale = new LinkedHashMap(max);
            }
            double graphContentHeight = (((double) this.mGraphView.getGraphContentHeight()) / this.mGraphView.getSecondScale().mCurrentViewport.height()) * -1.0d;
            for (int i5 = 0; i5 < max; i5++) {
                double d6 = (((double) i5) * round) + floor;
                if (d6 <= this.mGraphView.getSecondScale().mCurrentViewport.top && d6 >= this.mGraphView.getSecondScale().mCurrentViewport.bottom) {
                    this.mStepsVerticalSecondScale.put(Integer.valueOf((int) ((d6 - this.mGraphView.getSecondScale().mCurrentViewport.bottom) * graphContentHeight)), Double.valueOf(d6));
                }
            }
            return true;
        }
        throw new IllegalStateException("Not yet implemented");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0137  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean adjustVertical(boolean r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            java.lang.Integer r2 = r0.mLabelHorizontalHeight
            r3 = 0
            if (r2 != 0) goto L_0x000a
            return r3
        L_0x000a:
            com.jjoe64.graphview.GraphView r2 = r0.mGraphView
            com.jjoe64.graphview.Viewport r2 = r2.getViewport()
            double r4 = r2.getMinY(r3)
            com.jjoe64.graphview.GraphView r2 = r0.mGraphView
            com.jjoe64.graphview.Viewport r2 = r2.getViewport()
            double r6 = r2.getMaxY(r3)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0023
            return r3
        L_0x0023:
            int r2 = r0.mNumVerticalLabels
            double r8 = r6 - r4
            int r10 = r2 + -1
            double r10 = (double) r10
            double r8 = r8 / r10
            r12 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r8 = r8 * r12
            long r8 = java.lang.Math.round(r8)
            double r8 = (double) r8
            double r8 = r8 / r12
            r12 = 0
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x0046
            r8 = 4502148214488346440(0x3e7ad7f29abcaf48, double:1.0E-7)
            double r6 = r10 * r8
            double r6 = r6 + r4
        L_0x0046:
            boolean r14 = r22.isHumanRoundingY()
            r15 = 1
            if (r14 == 0) goto L_0x0055
            double r8 = r0.humanRound(r8, r1)
        L_0x0051:
            r20 = r4
            goto L_0x00c2
        L_0x0055:
            java.util.Map<java.lang.Integer, java.lang.Double> r14 = r0.mStepsVertical
            if (r14 == 0) goto L_0x0051
            int r14 = r14.size()
            if (r14 <= r15) goto L_0x0051
            java.util.Map<java.lang.Integer, java.lang.Double> r14 = r0.mStepsVertical
            java.util.Collection r14 = r14.values()
            java.util.Iterator r14 = r14.iterator()
            r17 = r12
            r16 = 0
        L_0x006d:
            boolean r19 = r14.hasNext()
            if (r19 == 0) goto L_0x0087
            java.lang.Object r19 = r14.next()
            java.lang.Double r19 = (java.lang.Double) r19
            if (r16 != 0) goto L_0x0082
            double r17 = r19.doubleValue()
            int r16 = r16 + 1
            goto L_0x006d
        L_0x0082:
            double r19 = r19.doubleValue()
            goto L_0x0089
        L_0x0087:
            r19 = r12
        L_0x0089:
            double r16 = r19 - r17
            int r14 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x0051
            r12 = 4611686018427387904(0x4000000000000000, double:2.0)
            r18 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            int r14 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r14 <= 0) goto L_0x009a
            double r8 = r16 / r12
            goto L_0x00a4
        L_0x009a:
            int r14 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r14 >= 0) goto L_0x00a2
            double r12 = r12 * r16
            r8 = r12
            goto L_0x00a4
        L_0x00a2:
            r8 = r18
        L_0x00a4:
            double r12 = r6 - r4
            r20 = r4
            double r3 = r12 / r16
            int r3 = (int) r3
            double r12 = r12 / r8
            int r4 = (int) r12
            if (r3 > r2) goto L_0x00b6
            if (r4 > r2) goto L_0x00b6
            if (r4 <= r3) goto L_0x00b4
            goto L_0x00b6
        L_0x00b4:
            r3 = 0
            goto L_0x00b7
        L_0x00b6:
            r3 = 1
        L_0x00b7:
            int r5 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r5 == 0) goto L_0x00c0
            if (r3 == 0) goto L_0x00c0
            if (r4 > r2) goto L_0x00c0
            goto L_0x00c2
        L_0x00c0:
            r8 = r16
        L_0x00c2:
            com.jjoe64.graphview.GraphView r2 = r0.mGraphView
            com.jjoe64.graphview.Viewport r2 = r2.getViewport()
            double r2 = r2.getReferenceY()
            double r4 = r20 - r2
            double r4 = r4 / r8
            double r4 = java.lang.Math.floor(r4)
            double r4 = r4 * r8
            double r4 = r4 + r2
            if (r1 == 0) goto L_0x00fb
            com.jjoe64.graphview.GraphView r1 = r0.mGraphView
            com.jjoe64.graphview.Viewport r1 = r1.getViewport()
            r1.setMinY(r4)
            com.jjoe64.graphview.GraphView r1 = r0.mGraphView
            com.jjoe64.graphview.Viewport r1 = r1.getViewport()
            double r10 = r10 * r8
            double r10 = r10 + r4
            double r2 = java.lang.Math.max(r6, r10)
            r1.setMaxY(r2)
            com.jjoe64.graphview.GraphView r1 = r0.mGraphView
            com.jjoe64.graphview.Viewport r1 = r1.getViewport()
            com.jjoe64.graphview.Viewport$AxisBoundsStatus r2 = com.jjoe64.graphview.Viewport.AxisBoundsStatus.AUTO_ADJUSTED
            r1.mYAxisBoundsStatus = r2
        L_0x00fb:
            com.jjoe64.graphview.GraphView r1 = r0.mGraphView
            com.jjoe64.graphview.Viewport r1 = r1.getViewport()
            com.jjoe64.graphview.RectD r1 = r1.mCurrentViewport
            double r1 = r1.height()
            r6 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            double r1 = r1 * r6
            double r1 = r1 / r8
            int r1 = (int) r1
            int r1 = r1 + 2
            java.util.Map<java.lang.Integer, java.lang.Double> r2 = r0.mStepsVertical
            if (r2 == 0) goto L_0x0117
            r2.clear()
            goto L_0x011e
        L_0x0117:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r1)
            r0.mStepsVertical = r2
        L_0x011e:
            com.jjoe64.graphview.GraphView r2 = r0.mGraphView
            int r2 = r2.getGraphContentHeight()
            double r2 = (double) r2
            com.jjoe64.graphview.GraphView r10 = r0.mGraphView
            com.jjoe64.graphview.Viewport r10 = r10.getViewport()
            com.jjoe64.graphview.RectD r10 = r10.mCurrentViewport
            double r10 = r10.height()
            double r2 = r2 / r10
            double r2 = r2 * r6
            r14 = 0
        L_0x0135:
            if (r14 >= r1) goto L_0x0178
            double r6 = (double) r14
            double r6 = r6 * r8
            double r6 = r6 + r4
            com.jjoe64.graphview.GraphView r10 = r0.mGraphView
            com.jjoe64.graphview.Viewport r10 = r10.getViewport()
            com.jjoe64.graphview.RectD r10 = r10.mCurrentViewport
            double r10 = r10.top
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x014a
            goto L_0x0175
        L_0x014a:
            com.jjoe64.graphview.GraphView r10 = r0.mGraphView
            com.jjoe64.graphview.Viewport r10 = r10.getViewport()
            com.jjoe64.graphview.RectD r10 = r10.mCurrentViewport
            double r10 = r10.bottom
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x0159
            goto L_0x0175
        L_0x0159:
            com.jjoe64.graphview.GraphView r10 = r0.mGraphView
            com.jjoe64.graphview.Viewport r10 = r10.getViewport()
            com.jjoe64.graphview.RectD r10 = r10.mCurrentViewport
            double r10 = r10.bottom
            double r10 = r6 - r10
            double r10 = r10 * r2
            java.util.Map<java.lang.Integer, java.lang.Double> r12 = r0.mStepsVertical
            int r10 = (int) r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Double r6 = java.lang.Double.valueOf(r6)
            r12.put(r10, r6)
        L_0x0175:
            int r14 = r14 + 1
            goto L_0x0135
        L_0x0178:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jjoe64.graphview.GridLabelRenderer.adjustVertical(boolean):boolean");
    }

    /* access modifiers changed from: protected */
    public boolean adjustHorizontal(boolean z) {
        double d;
        double d2;
        if (this.mLabelVerticalWidth == null) {
            return false;
        }
        double minX = this.mGraphView.getViewport().getMinX(false);
        double maxX = this.mGraphView.getViewport().getMaxX(false);
        if (minX == maxX) {
            return false;
        }
        int i = this.mNumHorizontalLabels;
        double d3 = (double) (i - 1);
        double round = ((double) Math.round(((maxX - minX) / d3) * 1000000.0d)) / 1000000.0d;
        if (round == Utils.DOUBLE_EPSILON) {
            round = 1.0E-7d;
            maxX = (d3 * 1.0E-7d) + minX;
        }
        if (isHumanRoundingX()) {
            d = humanRound(d, false);
        } else {
            Map<Integer, Double> map = this.mStepsHorizontal;
            if (map != null && map.size() > 1) {
                Iterator<Double> it = this.mStepsHorizontal.values().iterator();
                double d4 = 0.0d;
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        d2 = 0.0d;
                        break;
                    }
                    Double next = it.next();
                    if (i2 != 0) {
                        d2 = next.doubleValue();
                        break;
                    }
                    d4 = next.doubleValue();
                    i2++;
                }
                double d5 = d2 - d4;
                if (d5 > Utils.DOUBLE_EPSILON) {
                    d = d5 > d ? d5 / 2.0d : d5 < d ? 2.0d * d5 : Double.NaN;
                    double d6 = maxX - minX;
                    int i3 = (int) (d6 / d5);
                    int i4 = (int) (d6 / d);
                    boolean z2 = i3 > i || i4 > i || i4 > i3;
                    if (d == Double.NaN || !z2 || i4 > i) {
                        d = d5;
                    }
                }
            }
        }
        double referenceX = this.mGraphView.getViewport().getReferenceX();
        double floor = (Math.floor((minX - referenceX) / d) * d) + referenceX;
        if (z) {
            this.mGraphView.getViewport().setMinX(floor);
            this.mGraphView.getViewport().setMaxX((d3 * d) + floor);
            this.mGraphView.getViewport().mXAxisBoundsStatus = Viewport.AxisBoundsStatus.AUTO_ADJUSTED;
        }
        int width = ((int) (this.mGraphView.getViewport().mCurrentViewport.width() / d)) + 1;
        Map<Integer, Double> map2 = this.mStepsHorizontal;
        if (map2 != null) {
            map2.clear();
        } else {
            this.mStepsHorizontal = new LinkedHashMap(width);
        }
        double graphContentWidth = ((double) this.mGraphView.getGraphContentWidth()) / this.mGraphView.getViewport().mCurrentViewport.width();
        for (int i5 = 0; i5 < width; i5++) {
            double d7 = (((double) i5) * d) + floor;
            if (d7 >= this.mGraphView.getViewport().mCurrentViewport.left) {
                this.mStepsHorizontal.put(Integer.valueOf((int) ((d7 - this.mGraphView.getViewport().mCurrentViewport.left) * graphContentWidth)), Double.valueOf(d7));
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void adjustSteps() {
        this.mIsAdjusted = adjustVertical(!Viewport.AxisBoundsStatus.FIX.equals(this.mGraphView.getViewport().mYAxisBoundsStatus));
        this.mIsAdjusted &= adjustVerticalSecondScale();
        this.mIsAdjusted &= adjustHorizontal(!Viewport.AxisBoundsStatus.FIX.equals(this.mGraphView.getViewport().mXAxisBoundsStatus));
    }

    /* access modifiers changed from: protected */
    public void calcLabelVerticalSize(Canvas canvas) {
        String formatLabel = this.mLabelFormatter.formatLabel(this.mGraphView.getViewport().getMaxY(false), false);
        if (formatLabel == null) {
            formatLabel = "";
        }
        Rect rect = new Rect();
        this.mPaintLabel.getTextBounds(formatLabel, 0, formatLabel.length(), rect);
        this.mLabelVerticalWidth = Integer.valueOf(rect.width());
        this.mLabelVerticalHeight = Integer.valueOf(rect.height());
        String formatLabel2 = this.mLabelFormatter.formatLabel(this.mGraphView.getViewport().getMinY(false), false);
        if (formatLabel2 == null) {
            formatLabel2 = "";
        }
        this.mPaintLabel.getTextBounds(formatLabel2, 0, formatLabel2.length(), rect);
        this.mLabelVerticalWidth = Integer.valueOf(Math.max(this.mLabelVerticalWidth.intValue(), rect.width()));
        this.mLabelVerticalWidth = Integer.valueOf(this.mLabelVerticalWidth.intValue() + 6);
        this.mLabelVerticalWidth = Integer.valueOf(this.mLabelVerticalWidth.intValue() + this.mStyles.labelsSpace);
        int i = 1;
        for (byte b : formatLabel2.getBytes()) {
            if (b == 10) {
                i++;
            }
        }
        this.mLabelVerticalHeight = Integer.valueOf(this.mLabelVerticalHeight.intValue() * i);
    }

    /* access modifiers changed from: protected */
    public void calcLabelVerticalSecondScaleSize(Canvas canvas) {
        if (this.mGraphView.mSecondScale == null) {
            this.mLabelVerticalSecondScaleWidth = 0;
            this.mLabelVerticalSecondScaleHeight = 0;
            return;
        }
        String formatLabel = this.mGraphView.mSecondScale.getLabelFormatter().formatLabel(((this.mGraphView.mSecondScale.getMaxY(false) - this.mGraphView.mSecondScale.getMinY(false)) * 0.783d) + this.mGraphView.mSecondScale.getMinY(false), false);
        Rect rect = new Rect();
        this.mPaintLabel.getTextBounds(formatLabel, 0, formatLabel.length(), rect);
        this.mLabelVerticalSecondScaleWidth = Integer.valueOf(rect.width());
        this.mLabelVerticalSecondScaleHeight = Integer.valueOf(rect.height());
        int i = 1;
        for (byte b : formatLabel.getBytes()) {
            if (b == 10) {
                i++;
            }
        }
        this.mLabelVerticalSecondScaleHeight = Integer.valueOf(this.mLabelVerticalSecondScaleHeight.intValue() * i);
    }

    /* access modifiers changed from: protected */
    public void calcLabelHorizontalSize(Canvas canvas) {
        int i = 1;
        String formatLabel = this.mLabelFormatter.formatLabel(((this.mGraphView.getViewport().getMaxX(false) - this.mGraphView.getViewport().getMinX(false)) * 0.783d) + this.mGraphView.getViewport().getMinX(false), true);
        if (formatLabel == null) {
            formatLabel = "";
        }
        Rect rect = new Rect();
        this.mPaintLabel.getTextBounds(formatLabel, 0, formatLabel.length(), rect);
        this.mLabelHorizontalWidth = Integer.valueOf(rect.width());
        if (!this.mLabelHorizontalHeightFixed) {
            this.mLabelHorizontalHeight = Integer.valueOf(rect.height());
            for (byte b : formatLabel.getBytes()) {
                if (b == 10) {
                    i++;
                }
            }
            this.mLabelHorizontalHeight = Integer.valueOf(this.mLabelHorizontalHeight.intValue() * i);
            this.mLabelHorizontalHeight = Integer.valueOf((int) Math.max((float) this.mLabelHorizontalHeight.intValue(), this.mStyles.textSize));
        }
        if (this.mStyles.horizontalLabelsAngle > 0.0f && this.mStyles.horizontalLabelsAngle <= 180.0f) {
            this.mLabelHorizontalHeight = Integer.valueOf(((int) Math.round(Math.abs(((double) this.mLabelHorizontalHeight.intValue()) * Math.cos(Math.toRadians((double) this.mStyles.horizontalLabelsAngle))))) + ((int) Math.round(Math.abs(((double) this.mLabelHorizontalWidth.intValue()) * Math.sin(Math.toRadians((double) this.mStyles.horizontalLabelsAngle))))));
            this.mLabelHorizontalWidth = Integer.valueOf(((int) Math.round(Math.abs(((double) this.mLabelHorizontalHeight.intValue()) * Math.sin(Math.toRadians((double) this.mStyles.horizontalLabelsAngle))))) + ((int) Math.round(Math.abs(((double) this.mLabelHorizontalWidth.intValue()) * Math.cos(Math.toRadians((double) this.mStyles.horizontalLabelsAngle))))));
        }
        this.mLabelHorizontalHeight = Integer.valueOf(this.mLabelHorizontalHeight.intValue() + this.mStyles.labelsSpace);
    }

    public void draw(Canvas canvas) {
        boolean z;
        if (this.mLabelHorizontalWidth == null) {
            calcLabelHorizontalSize(canvas);
            z = true;
        } else {
            z = false;
        }
        if (this.mLabelVerticalWidth == null) {
            calcLabelVerticalSize(canvas);
            z = true;
        }
        if (this.mLabelVerticalSecondScaleWidth == null) {
            calcLabelVerticalSecondScaleSize(canvas);
            z = true;
        }
        if (z) {
            this.mGraphView.drawGraphElements(canvas);
            return;
        }
        if (!this.mIsAdjusted) {
            adjustSteps();
        }
        if (this.mIsAdjusted) {
            drawVerticalSteps(canvas);
            drawVerticalStepsSecondScale(canvas);
            drawHorizontalSteps(canvas);
            drawHorizontalAxisTitle(canvas);
            drawVerticalAxisTitle(canvas);
            if (this.mGraphView.mSecondScale != null) {
                this.mGraphView.mSecondScale.drawVerticalAxisTitle(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawHorizontalAxisTitle(Canvas canvas) {
        String str = this.mHorizontalAxisTitle;
        if (str != null && str.length() > 0) {
            this.mPaintAxisTitle.setColor(getHorizontalAxisTitleColor());
            this.mPaintAxisTitle.setTextSize(getHorizontalAxisTitleTextSize());
            canvas.drawText(this.mHorizontalAxisTitle, (float) (canvas.getWidth() / 2), (float) (canvas.getHeight() - this.mStyles.padding), this.mPaintAxisTitle);
        }
    }

    /* access modifiers changed from: protected */
    public void drawVerticalAxisTitle(Canvas canvas) {
        String str = this.mVerticalAxisTitle;
        if (str != null && str.length() > 0) {
            this.mPaintAxisTitle.setColor(getVerticalAxisTitleColor());
            this.mPaintAxisTitle.setTextSize(getVerticalAxisTitleTextSize());
            float verticalAxisTitleWidth = (float) getVerticalAxisTitleWidth();
            float height = (float) (canvas.getHeight() / 2);
            canvas.save();
            canvas.rotate(-90.0f, verticalAxisTitleWidth, height);
            canvas.drawText(this.mVerticalAxisTitle, verticalAxisTitleWidth, height, this.mPaintAxisTitle);
            canvas.restore();
        }
    }

    public int getHorizontalAxisTitleHeight() {
        String str = this.mHorizontalAxisTitle;
        if (str == null || str.length() <= 0) {
            return 0;
        }
        return (int) getHorizontalAxisTitleTextSize();
    }

    public int getVerticalAxisTitleWidth() {
        String str = this.mVerticalAxisTitle;
        if (str == null || str.length() <= 0) {
            return 0;
        }
        return (int) getVerticalAxisTitleTextSize();
    }

    /* access modifiers changed from: protected */
    public void drawHorizontalSteps(Canvas canvas) {
        int i;
        Canvas canvas2 = canvas;
        this.mPaintLabel.setColor(getHorizontalLabelsColor());
        int i2 = 0;
        for (Map.Entry next : this.mStepsHorizontal.entrySet()) {
            if (this.mStyles.highlightZeroLines) {
                if (((Double) next.getValue()).doubleValue() == Utils.DOUBLE_EPSILON) {
                    this.mPaintLine.setStrokeWidth(5.0f);
                } else {
                    this.mPaintLine.setStrokeWidth(0.0f);
                }
            }
            if (this.mStyles.gridStyle.drawVertical() && ((Integer) next.getKey()).intValue() <= this.mGraphView.getGraphContentWidth()) {
                canvas.drawLine((float) (this.mGraphView.getGraphContentLeft() + ((Integer) next.getKey()).intValue()), (float) this.mGraphView.getGraphContentTop(), (float) (this.mGraphView.getGraphContentLeft() + ((Integer) next.getKey()).intValue()), (float) (this.mGraphView.getGraphContentTop() + this.mGraphView.getGraphContentHeight()), this.mPaintLine);
            }
            if (isHorizontalLabelsVisible()) {
                float f = 90.0f;
                if (this.mStyles.horizontalLabelsAngle <= 0.0f || this.mStyles.horizontalLabelsAngle > 180.0f) {
                    this.mPaintLabel.setTextAlign(Paint.Align.CENTER);
                    if (i2 == this.mStepsHorizontal.size() - 1) {
                        this.mPaintLabel.setTextAlign(Paint.Align.RIGHT);
                    }
                    if (i2 == 0) {
                        this.mPaintLabel.setTextAlign(Paint.Align.LEFT);
                    }
                } else if (this.mStyles.horizontalLabelsAngle < 90.0f) {
                    this.mPaintLabel.setTextAlign(Paint.Align.RIGHT);
                } else if (this.mStyles.horizontalLabelsAngle <= 180.0f) {
                    this.mPaintLabel.setTextAlign(Paint.Align.LEFT);
                }
                String formatLabel = this.mLabelFormatter.formatLabel(((Double) next.getValue()).doubleValue(), true);
                if (formatLabel == null) {
                    formatLabel = "";
                }
                String[] split = formatLabel.split("\n");
                if (this.mStyles.horizontalLabelsAngle <= 0.0f || this.mStyles.horizontalLabelsAngle > 180.0f) {
                    i = 0;
                } else {
                    Rect rect = new Rect();
                    this.mPaintLabel.getTextBounds(split[0], 0, split[0].length(), rect);
                    i = (int) Math.abs(((double) rect.width()) * Math.cos(Math.toRadians((double) this.mStyles.horizontalLabelsAngle)));
                }
                int i3 = 0;
                while (i3 < split.length) {
                    float height = (((float) ((canvas.getHeight() - this.mStyles.padding) - getHorizontalAxisTitleHeight())) - ((((float) ((split.length - i3) - 1)) * getTextSize()) * 1.1f)) + ((float) this.mStyles.labelsSpace);
                    float graphContentLeft = (float) (this.mGraphView.getGraphContentLeft() + ((Integer) next.getKey()).intValue());
                    if (this.mStyles.horizontalLabelsAngle > 0.0f && this.mStyles.horizontalLabelsAngle < f) {
                        canvas.save();
                        float f2 = graphContentLeft + ((float) i);
                        canvas2.rotate(this.mStyles.horizontalLabelsAngle, f2, height);
                        canvas2.drawText(split[i3], f2, height, this.mPaintLabel);
                        canvas.restore();
                    } else if (this.mStyles.horizontalLabelsAngle <= 0.0f || this.mStyles.horizontalLabelsAngle > 180.0f) {
                        canvas2.drawText(split[i3], graphContentLeft, height, this.mPaintLabel);
                    } else {
                        canvas.save();
                        float f3 = graphContentLeft - ((float) i);
                        canvas2.rotate(this.mStyles.horizontalLabelsAngle - 180.0f, f3, height);
                        canvas2.drawText(split[i3], f3, height, this.mPaintLabel);
                        canvas.restore();
                    }
                    i3++;
                    f = 90.0f;
                }
            }
            i2++;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a1 A[LOOP:1: B:13:0x009e->B:15:0x00a1, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drawVerticalStepsSecondScale(android.graphics.Canvas r12) {
        /*
            r11 = this;
            com.jjoe64.graphview.GraphView r0 = r11.mGraphView
            com.jjoe64.graphview.SecondScale r0 = r0.mSecondScale
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.jjoe64.graphview.GraphView r0 = r11.mGraphView
            int r0 = r0.getGraphContentLeft()
            com.jjoe64.graphview.GraphView r1 = r11.mGraphView
            int r1 = r1.getGraphContentWidth()
            int r0 = r0 + r1
            float r0 = (float) r0
            android.graphics.Paint r1 = r11.mPaintLabel
            int r2 = r11.getVerticalLabelsSecondScaleColor()
            r1.setColor(r2)
            android.graphics.Paint r1 = r11.mPaintLabel
            android.graphics.Paint$Align r2 = r11.getVerticalLabelsSecondScaleAlign()
            r1.setTextAlign(r2)
            java.util.Map<java.lang.Integer, java.lang.Double> r1 = r11.mStepsVerticalSecondScale
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0031:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00bb
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            com.jjoe64.graphview.GraphView r3 = r11.mGraphView
            int r3 = r3.getGraphContentTop()
            com.jjoe64.graphview.GraphView r4 = r11.mGraphView
            int r4 = r4.getGraphContentHeight()
            int r3 = r3 + r4
            java.lang.Object r4 = r2.getKey()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r3 = r3 - r4
            float r3 = (float) r3
            java.lang.Integer r4 = r11.mLabelVerticalSecondScaleWidth
            int r4 = r4.intValue()
            int r5 = (int) r0
            android.graphics.Paint$Align r6 = r11.getVerticalLabelsSecondScaleAlign()
            android.graphics.Paint$Align r7 = android.graphics.Paint.Align.RIGHT
            if (r6 != r7) goto L_0x0067
        L_0x0065:
            int r5 = r5 + r4
            goto L_0x0072
        L_0x0067:
            android.graphics.Paint$Align r6 = r11.getVerticalLabelsSecondScaleAlign()
            android.graphics.Paint$Align r7 = android.graphics.Paint.Align.CENTER
            if (r6 != r7) goto L_0x0072
            int r4 = r4 / 2
            goto L_0x0065
        L_0x0072:
            com.jjoe64.graphview.GraphView r4 = r11.mGraphView
            com.jjoe64.graphview.SecondScale r4 = r4.mSecondScale
            com.jjoe64.graphview.LabelFormatter r4 = r4.mLabelFormatter
            java.lang.Object r2 = r2.getValue()
            java.lang.Double r2 = (java.lang.Double) r2
            double r6 = r2.doubleValue()
            r2 = 0
            java.lang.String r4 = r4.formatLabel(r6, r2)
            java.lang.String r6 = "\n"
            java.lang.String[] r4 = r4.split(r6)
            int r6 = r4.length
            float r6 = (float) r6
            float r7 = r11.getTextSize()
            float r6 = r6 * r7
            r7 = 1066192077(0x3f8ccccd, float:1.1)
            float r6 = r6 * r7
            r8 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r8
            float r3 = r3 + r6
        L_0x009e:
            int r6 = r4.length
            if (r2 >= r6) goto L_0x0031
            int r6 = r4.length
            int r6 = r6 - r2
            int r6 = r6 + -1
            float r6 = (float) r6
            float r8 = r11.getTextSize()
            float r6 = r6 * r8
            float r6 = r6 * r7
            float r6 = r3 - r6
            r8 = r4[r2]
            float r9 = (float) r5
            android.graphics.Paint r10 = r11.mPaintLabel
            r12.drawText(r8, r9, r6, r10)
            int r2 = r2 + 1
            goto L_0x009e
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jjoe64.graphview.GridLabelRenderer.drawVerticalStepsSecondScale(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x012c A[LOOP:1: B:43:0x0129->B:45:0x012c, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drawVerticalSteps(android.graphics.Canvas r15) {
        /*
            r14 = this;
            com.jjoe64.graphview.GraphView r0 = r14.mGraphView
            int r0 = r0.getGraphContentLeft()
            float r0 = (float) r0
            android.graphics.Paint r1 = r14.mPaintLabel
            int r2 = r14.getVerticalLabelsColor()
            r1.setColor(r2)
            android.graphics.Paint r1 = r14.mPaintLabel
            android.graphics.Paint$Align r2 = r14.getVerticalLabelsAlign()
            r1.setTextAlign(r2)
            java.util.Map<java.lang.Integer, java.lang.Double> r1 = r14.mStepsVertical
            int r7 = r1.size()
            java.util.Map<java.lang.Integer, java.lang.Double> r1 = r14.mStepsVertical
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r8 = r1.iterator()
            r9 = 1
            r10 = 1
        L_0x002b:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0149
            java.lang.Object r1 = r8.next()
            r11 = r1
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            com.jjoe64.graphview.GraphView r1 = r14.mGraphView
            int r1 = r1.getGraphContentTop()
            com.jjoe64.graphview.GraphView r2 = r14.mGraphView
            int r2 = r2.getGraphContentHeight()
            int r1 = r1 + r2
            java.lang.Object r2 = r11.getKey()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r1 = r1 - r2
            float r12 = (float) r1
            com.jjoe64.graphview.GridLabelRenderer$Styles r1 = r14.mStyles
            boolean r1 = r1.highlightZeroLines
            r13 = 1084227584(0x40a00000, float:5.0)
            if (r1 == 0) goto L_0x0075
            java.lang.Object r1 = r11.getValue()
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x006f
            android.graphics.Paint r1 = r14.mPaintLine
            r1.setStrokeWidth(r13)
            goto L_0x0075
        L_0x006f:
            android.graphics.Paint r1 = r14.mPaintLine
            r2 = 0
            r1.setStrokeWidth(r2)
        L_0x0075:
            com.jjoe64.graphview.GridLabelRenderer$Styles r1 = r14.mStyles
            com.jjoe64.graphview.GridLabelRenderer$GridStyle r1 = r1.gridStyle
            boolean r1 = r1.drawHorizontal()
            if (r1 == 0) goto L_0x0091
            com.jjoe64.graphview.GraphView r1 = r14.mGraphView
            int r1 = r1.getGraphContentWidth()
            float r1 = (float) r1
            float r4 = r0 + r1
            android.graphics.Paint r6 = r14.mPaintLine
            r1 = r15
            r2 = r0
            r3 = r12
            r5 = r12
            r1.drawLine(r2, r3, r4, r5, r6)
        L_0x0091:
            com.jjoe64.graphview.GridLabelRenderer$Styles r1 = r14.mStyles
            com.jjoe64.graphview.GridLabelRenderer$VerticalLabelsVAlign r1 = r1.verticalLabelsVAlign
            com.jjoe64.graphview.GridLabelRenderer$VerticalLabelsVAlign r2 = com.jjoe64.graphview.GridLabelRenderer.VerticalLabelsVAlign.ABOVE
            r3 = 0
            if (r1 != r2) goto L_0x009c
            if (r10 == r9) goto L_0x00a6
        L_0x009c:
            com.jjoe64.graphview.GridLabelRenderer$Styles r1 = r14.mStyles
            com.jjoe64.graphview.GridLabelRenderer$VerticalLabelsVAlign r1 = r1.verticalLabelsVAlign
            com.jjoe64.graphview.GridLabelRenderer$VerticalLabelsVAlign r2 = com.jjoe64.graphview.GridLabelRenderer.VerticalLabelsVAlign.BELOW
            if (r1 != r2) goto L_0x00a8
            if (r10 != r7) goto L_0x00a8
        L_0x00a6:
            r1 = 0
            goto L_0x00a9
        L_0x00a8:
            r1 = 1
        L_0x00a9:
            boolean r2 = r14.isVerticalLabelsVisible()
            if (r2 == 0) goto L_0x0145
            if (r1 == 0) goto L_0x0145
            java.lang.Integer r1 = r14.mLabelVerticalWidth
            int r1 = r1.intValue()
            android.graphics.Paint$Align r2 = r14.getVerticalLabelsAlign()
            android.graphics.Paint$Align r4 = android.graphics.Paint.Align.RIGHT
            if (r2 != r4) goto L_0x00c5
            com.jjoe64.graphview.GridLabelRenderer$Styles r2 = r14.mStyles
            int r2 = r2.labelsSpace
            int r1 = r1 - r2
            goto L_0x00d1
        L_0x00c5:
            android.graphics.Paint$Align r2 = r14.getVerticalLabelsAlign()
            android.graphics.Paint$Align r4 = android.graphics.Paint.Align.CENTER
            if (r2 != r4) goto L_0x00d0
            int r1 = r1 / 2
            goto L_0x00d1
        L_0x00d0:
            r1 = 0
        L_0x00d1:
            com.jjoe64.graphview.GridLabelRenderer$Styles r2 = r14.mStyles
            int r2 = r2.padding
            int r4 = r14.getVerticalAxisTitleWidth()
            int r2 = r2 + r4
            int r1 = r1 + r2
            com.jjoe64.graphview.LabelFormatter r2 = r14.mLabelFormatter
            java.lang.Object r4 = r11.getValue()
            java.lang.Double r4 = (java.lang.Double) r4
            double r4 = r4.doubleValue()
            java.lang.String r2 = r2.formatLabel(r4, r3)
            if (r2 != 0) goto L_0x00ef
            java.lang.String r2 = ""
        L_0x00ef:
            java.lang.String r4 = "\n"
            java.lang.String[] r2 = r2.split(r4)
            int[] r4 = com.jjoe64.graphview.GridLabelRenderer.C27441.f2290xc1a8ce95
            com.jjoe64.graphview.GridLabelRenderer$Styles r5 = r14.mStyles
            com.jjoe64.graphview.GridLabelRenderer$VerticalLabelsVAlign r5 = r5.verticalLabelsVAlign
            int r5 = r5.ordinal()
            r4 = r4[r5]
            r5 = 1066192077(0x3f8ccccd, float:1.1)
            if (r4 == r9) goto L_0x011b
            r6 = 2
            if (r4 == r6) goto L_0x0119
            r6 = 3
            if (r4 == r6) goto L_0x010d
            goto L_0x0129
        L_0x010d:
            int r4 = r2.length
            float r4 = (float) r4
            float r6 = r14.getTextSize()
            float r4 = r4 * r6
            float r4 = r4 * r5
            float r4 = r4 + r13
            goto L_0x0128
        L_0x0119:
            float r12 = r12 - r13
            goto L_0x0129
        L_0x011b:
            int r4 = r2.length
            float r4 = (float) r4
            float r6 = r14.getTextSize()
            float r4 = r4 * r6
            float r4 = r4 * r5
            r6 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r6
        L_0x0128:
            float r12 = r12 + r4
        L_0x0129:
            int r4 = r2.length
            if (r3 >= r4) goto L_0x0145
            int r4 = r2.length
            int r4 = r4 - r3
            int r4 = r4 - r9
            float r4 = (float) r4
            float r6 = r14.getTextSize()
            float r4 = r4 * r6
            float r4 = r4 * r5
            float r4 = r12 - r4
            r6 = r2[r3]
            float r11 = (float) r1
            android.graphics.Paint r13 = r14.mPaintLabel
            r15.drawText(r6, r11, r4, r13)
            int r3 = r3 + 1
            goto L_0x0129
        L_0x0145:
            int r10 = r10 + 1
            goto L_0x002b
        L_0x0149:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jjoe64.graphview.GridLabelRenderer.drawVerticalSteps(android.graphics.Canvas):void");
    }

    /* renamed from: com.jjoe64.graphview.GridLabelRenderer$1 */
    static /* synthetic */ class C27441 {

        /* renamed from: $SwitchMap$com$jjoe64$graphview$GridLabelRenderer$VerticalLabelsVAlign */
        static final /* synthetic */ int[] f2290xc1a8ce95 = new int[VerticalLabelsVAlign.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.jjoe64.graphview.GridLabelRenderer$VerticalLabelsVAlign[] r0 = com.jjoe64.graphview.GridLabelRenderer.VerticalLabelsVAlign.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2290xc1a8ce95 = r0
                int[] r0 = f2290xc1a8ce95     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.jjoe64.graphview.GridLabelRenderer$VerticalLabelsVAlign r1 = com.jjoe64.graphview.GridLabelRenderer.VerticalLabelsVAlign.MID     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f2290xc1a8ce95     // Catch:{ NoSuchFieldError -> 0x001f }
                com.jjoe64.graphview.GridLabelRenderer$VerticalLabelsVAlign r1 = com.jjoe64.graphview.GridLabelRenderer.VerticalLabelsVAlign.ABOVE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f2290xc1a8ce95     // Catch:{ NoSuchFieldError -> 0x002a }
                com.jjoe64.graphview.GridLabelRenderer$VerticalLabelsVAlign r1 = com.jjoe64.graphview.GridLabelRenderer.VerticalLabelsVAlign.BELOW     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.jjoe64.graphview.GridLabelRenderer.C27441.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r10 < 10.0d) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        if (r10 < 15.0d) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
        r1 = 10.0d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public double humanRound(double r10, boolean r12) {
        /*
            r9 = this;
            r0 = 0
        L_0x0001:
            double r1 = java.lang.Math.abs(r10)
            r3 = 4621819117588971520(0x4024000000000000, double:10.0)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x000f
            double r10 = r10 / r3
            int r0 = r0 + 1
            goto L_0x0001
        L_0x000f:
            double r1 = java.lang.Math.abs(r10)
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x001e
            double r10 = r10 * r3
            int r0 = r0 + -1
            goto L_0x000f
        L_0x001e:
            r1 = 4617315517961601024(0x4014000000000000, double:5.0)
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            if (r12 == 0) goto L_0x0038
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 != 0) goto L_0x0029
            goto L_0x005a
        L_0x0029:
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 > 0) goto L_0x002e
            goto L_0x0046
        L_0x002e:
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0033
            goto L_0x005b
        L_0x0033:
            int r12 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r12 >= 0) goto L_0x005a
            goto L_0x0058
        L_0x0038:
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 != 0) goto L_0x003d
            goto L_0x005a
        L_0x003d:
            r5 = 4617202927970916762(0x401399999999999a, double:4.9)
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 > 0) goto L_0x0048
        L_0x0046:
            r1 = r7
            goto L_0x005b
        L_0x0048:
            r5 = 4621762822593629389(0x4023cccccccccccd, double:9.9)
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 > 0) goto L_0x0052
            goto L_0x005b
        L_0x0052:
            r1 = 4624633867356078080(0x402e000000000000, double:15.0)
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 >= 0) goto L_0x005a
        L_0x0058:
            r1 = r3
            goto L_0x005b
        L_0x005a:
            r1 = r10
        L_0x005b:
            double r10 = (double) r0
            double r10 = java.lang.Math.pow(r3, r10)
            double r1 = r1 * r10
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jjoe64.graphview.GridLabelRenderer.humanRound(double, boolean):double");
    }

    public Styles getStyles() {
        return this.mStyles;
    }

    public int getLabelVerticalWidth() {
        if (this.mStyles.verticalLabelsVAlign == VerticalLabelsVAlign.ABOVE || this.mStyles.verticalLabelsVAlign == VerticalLabelsVAlign.BELOW || this.mLabelVerticalWidth == null || !isVerticalLabelsVisible()) {
            return 0;
        }
        return this.mLabelVerticalWidth.intValue();
    }

    public void setLabelVerticalWidth(Integer num) {
        this.mLabelVerticalWidth = num;
        this.mLabelVerticalWidthFixed = this.mLabelVerticalWidth != null;
    }

    public int getLabelHorizontalHeight() {
        if (this.mLabelHorizontalHeight == null || !isHorizontalLabelsVisible()) {
            return 0;
        }
        return this.mLabelHorizontalHeight.intValue();
    }

    public void setLabelHorizontalHeight(Integer num) {
        this.mLabelHorizontalHeight = num;
        this.mLabelHorizontalHeightFixed = this.mLabelHorizontalHeight != null;
    }

    public int getGridColor() {
        return this.mStyles.gridColor;
    }

    public boolean isHighlightZeroLines() {
        return this.mStyles.highlightZeroLines;
    }

    public int getPadding() {
        return this.mStyles.padding;
    }

    public void setTextSize(float f) {
        this.mStyles.textSize = f;
        reloadStyles();
    }

    public void setVerticalLabelsAlign(Paint.Align align) {
        this.mStyles.verticalLabelsAlign = align;
    }

    public void setVerticalLabelsColor(int i) {
        this.mStyles.verticalLabelsColor = i;
    }

    public void setHorizontalLabelsColor(int i) {
        this.mStyles.horizontalLabelsColor = i;
    }

    public void setHorizontalLabelsAngle(int i) {
        this.mStyles.horizontalLabelsAngle = (float) i;
    }

    public void setGridColor(int i) {
        this.mStyles.gridColor = i;
        reloadStyles();
    }

    public void setHighlightZeroLines(boolean z) {
        this.mStyles.highlightZeroLines = z;
    }

    public void setPadding(int i) {
        this.mStyles.padding = i;
    }

    public LabelFormatter getLabelFormatter() {
        return this.mLabelFormatter;
    }

    public void setLabelFormatter(LabelFormatter labelFormatter) {
        this.mLabelFormatter = labelFormatter;
        labelFormatter.setViewport(this.mGraphView.getViewport());
    }

    public String getHorizontalAxisTitle() {
        return this.mHorizontalAxisTitle;
    }

    public void setHorizontalAxisTitle(String str) {
        this.mHorizontalAxisTitle = str;
    }

    public String getVerticalAxisTitle() {
        return this.mVerticalAxisTitle;
    }

    public void setVerticalAxisTitle(String str) {
        this.mVerticalAxisTitle = str;
    }

    public float getVerticalAxisTitleTextSize() {
        return this.mStyles.verticalAxisTitleTextSize;
    }

    public void setVerticalAxisTitleTextSize(float f) {
        this.mStyles.verticalAxisTitleTextSize = f;
    }

    public int getVerticalAxisTitleColor() {
        return this.mStyles.verticalAxisTitleColor;
    }

    public void setVerticalAxisTitleColor(int i) {
        this.mStyles.verticalAxisTitleColor = i;
    }

    public float getHorizontalAxisTitleTextSize() {
        return this.mStyles.horizontalAxisTitleTextSize;
    }

    public void setHorizontalAxisTitleTextSize(float f) {
        this.mStyles.horizontalAxisTitleTextSize = f;
    }

    public int getHorizontalAxisTitleColor() {
        return this.mStyles.horizontalAxisTitleColor;
    }

    public void setHorizontalAxisTitleColor(int i) {
        this.mStyles.horizontalAxisTitleColor = i;
    }

    public Paint.Align getVerticalLabelsSecondScaleAlign() {
        return this.mStyles.verticalLabelsSecondScaleAlign;
    }

    public void setVerticalLabelsSecondScaleAlign(Paint.Align align) {
        this.mStyles.verticalLabelsSecondScaleAlign = align;
    }

    public int getVerticalLabelsSecondScaleColor() {
        return this.mStyles.verticalLabelsSecondScaleColor;
    }

    public void setVerticalLabelsSecondScaleColor(int i) {
        this.mStyles.verticalLabelsSecondScaleColor = i;
    }

    public int getLabelVerticalSecondScaleWidth() {
        Integer num = this.mLabelVerticalSecondScaleWidth;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public boolean isHorizontalLabelsVisible() {
        return this.mStyles.horizontalLabelsVisible;
    }

    public void setHorizontalLabelsVisible(boolean z) {
        this.mStyles.horizontalLabelsVisible = z;
    }

    public boolean isVerticalLabelsVisible() {
        return this.mStyles.verticalLabelsVisible;
    }

    public void setVerticalLabelsVisible(boolean z) {
        this.mStyles.verticalLabelsVisible = z;
    }

    public int getNumVerticalLabels() {
        return this.mNumVerticalLabels;
    }

    public void setNumVerticalLabels(int i) {
        this.mNumVerticalLabels = i;
    }

    public int getNumHorizontalLabels() {
        return this.mNumHorizontalLabels;
    }

    public void setNumHorizontalLabels(int i) {
        this.mNumHorizontalLabels = i;
    }

    public GridStyle getGridStyle() {
        return this.mStyles.gridStyle;
    }

    public void setGridStyle(GridStyle gridStyle) {
        this.mStyles.gridStyle = gridStyle;
    }

    public int getLabelsSpace() {
        return this.mStyles.labelsSpace;
    }

    public void setLabelsSpace(int i) {
        this.mStyles.labelsSpace = i;
    }

    public void setVerticalLabelsVAlign(VerticalLabelsVAlign verticalLabelsVAlign) {
        this.mStyles.verticalLabelsVAlign = verticalLabelsVAlign;
    }

    public VerticalLabelsVAlign getVerticalLabelsVAlign() {
        return this.mStyles.verticalLabelsVAlign;
    }
}
