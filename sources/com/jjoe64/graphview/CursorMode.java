package com.jjoe64.graphview;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.TypedValue;
import android.view.MotionEvent;
import androidx.core.view.ViewCompat;
import com.jjoe64.graphview.series.BaseSeries;
import com.jjoe64.graphview.series.DataPointInterface;
import com.jjoe64.graphview.series.Series;
import java.util.HashMap;
import java.util.Map;

public class CursorMode {
    protected int cachedLegendWidth;
    protected final Map<BaseSeries, DataPointInterface> mCurrentSelection;
    protected double mCurrentSelectionX;
    protected boolean mCursorVisible;
    protected final GraphView mGraphView;
    protected final Paint mPaintLine;
    protected float mPosX;
    protected float mPosY;
    protected final Paint mRectPaint;
    protected Styles mStyles = new Styles();
    protected final Paint mTextPaint;

    private static final class Styles {
        public int backgroundColor;
        public int margin;
        public int padding;
        public int spacing;
        public int textColor;
        public float textSize;
        public int width;

        private Styles() {
        }
    }

    public CursorMode(GraphView graphView) {
        this.mGraphView = graphView;
        this.mPaintLine = new Paint();
        this.mPaintLine.setColor(Color.argb(128, 180, 180, 180));
        this.mPaintLine.setStrokeWidth(10.0f);
        this.mCurrentSelection = new HashMap();
        this.mRectPaint = new Paint();
        this.mTextPaint = new Paint();
        resetStyles();
    }

    public void resetStyles() {
        this.mStyles.textSize = this.mGraphView.getGridLabelRenderer().getTextSize();
        Styles styles = this.mStyles;
        styles.spacing = (int) (styles.textSize / 5.0f);
        Styles styles2 = this.mStyles;
        styles2.padding = (int) (styles2.textSize / 2.0f);
        Styles styles3 = this.mStyles;
        styles3.width = 0;
        styles3.backgroundColor = Color.argb(180, 100, 100, 100);
        Styles styles4 = this.mStyles;
        styles4.margin = (int) styles4.textSize;
        TypedValue typedValue = new TypedValue();
        this.mGraphView.getContext().getTheme().resolveAttribute(16842818, typedValue, true);
        int i = ViewCompat.MEASURED_STATE_MASK;
        try {
            TypedArray obtainStyledAttributes = this.mGraphView.getContext().obtainStyledAttributes(typedValue.data, new int[]{16842806});
            int color = obtainStyledAttributes.getColor(0, ViewCompat.MEASURED_STATE_MASK);
            obtainStyledAttributes.recycle();
            i = color;
        } catch (Exception unused) {
        }
        this.mStyles.textColor = i;
        this.cachedLegendWidth = 0;
    }

    public void onDown(MotionEvent motionEvent) {
        this.mPosX = Math.max(motionEvent.getX(), (float) this.mGraphView.getGraphContentLeft());
        this.mPosX = Math.min(this.mPosX, (float) (this.mGraphView.getGraphContentLeft() + this.mGraphView.getGraphContentWidth()));
        this.mPosY = motionEvent.getY();
        this.mCursorVisible = true;
        findCurrentDataPoint();
        this.mGraphView.invalidate();
    }

    public void onMove(MotionEvent motionEvent) {
        if (this.mCursorVisible) {
            this.mPosX = Math.max(motionEvent.getX(), (float) this.mGraphView.getGraphContentLeft());
            this.mPosX = Math.min(this.mPosX, (float) (this.mGraphView.getGraphContentLeft() + this.mGraphView.getGraphContentWidth()));
            this.mPosY = motionEvent.getY();
            findCurrentDataPoint();
            this.mGraphView.invalidate();
        }
    }

    public void draw(Canvas canvas) {
        if (this.mCursorVisible) {
            float f = this.mPosX;
            canvas.drawLine(f, 0.0f, f, (float) canvas.getHeight(), this.mPaintLine);
        }
        for (Map.Entry next : this.mCurrentSelection.entrySet()) {
            ((BaseSeries) next.getKey()).drawSelection(this.mGraphView, canvas, false, (DataPointInterface) next.getValue());
        }
        if (!this.mCurrentSelection.isEmpty()) {
            drawLegend(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public String getTextForSeries(Series series, DataPointInterface dataPointInterface) {
        StringBuffer stringBuffer = new StringBuffer();
        if (series.getTitle() != null) {
            stringBuffer.append(series.getTitle());
            stringBuffer.append(": ");
        }
        stringBuffer.append(this.mGraphView.getGridLabelRenderer().getLabelFormatter().formatLabel(dataPointInterface.getY(), false));
        return stringBuffer.toString();
    }

    /* access modifiers changed from: protected */
    public void drawLegend(Canvas canvas) {
        Canvas canvas2 = canvas;
        this.mTextPaint.setTextSize(this.mStyles.textSize);
        this.mTextPaint.setColor(this.mStyles.textColor);
        int i = (int) (((double) this.mStyles.textSize) * 0.8d);
        int i2 = this.mStyles.width;
        if (i2 == 0 && (i2 = this.cachedLegendWidth) == 0) {
            Rect rect = new Rect();
            for (Map.Entry next : this.mCurrentSelection.entrySet()) {
                String textForSeries = getTextForSeries((Series) next.getKey(), (DataPointInterface) next.getValue());
                this.mTextPaint.getTextBounds(textForSeries, 0, textForSeries.length(), rect);
                i2 = Math.max(i2, rect.width());
            }
            if (i2 == 0) {
                i2 = 1;
            }
            i2 += (this.mStyles.padding * 2) + i + this.mStyles.spacing;
            this.cachedLegendWidth = i2;
        }
        float f = (float) i2;
        float f2 = (this.mPosX - ((float) this.mStyles.margin)) - f;
        float f3 = 0.0f;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        float size = ((this.mStyles.textSize + ((float) this.mStyles.spacing)) * ((float) (this.mCurrentSelection.size() + 1))) - ((float) this.mStyles.spacing);
        float f4 = (this.mPosY - size) - (this.mStyles.textSize * 4.5f);
        if (f4 >= 0.0f) {
            f3 = f4;
        }
        float f5 = size + f3 + ((float) (this.mStyles.padding * 2));
        this.mRectPaint.setColor(this.mStyles.backgroundColor);
        canvas2.drawRoundRect(new RectF(f2, f3, f + f2, f5), 8.0f, 8.0f, this.mRectPaint);
        this.mTextPaint.setFakeBoldText(true);
        canvas2.drawText(this.mGraphView.getGridLabelRenderer().getLabelFormatter().formatLabel(this.mCurrentSelectionX, true), ((float) this.mStyles.padding) + f2, ((float) (this.mStyles.padding / 2)) + f3 + this.mStyles.textSize, this.mTextPaint);
        this.mTextPaint.setFakeBoldText(false);
        int i3 = 1;
        for (Map.Entry next2 : this.mCurrentSelection.entrySet()) {
            this.mRectPaint.setColor(((BaseSeries) next2.getKey()).getColor());
            float f6 = (float) i3;
            float f7 = (float) i;
            canvas2.drawRect(new RectF(((float) this.mStyles.padding) + f2, ((float) this.mStyles.padding) + f3 + ((this.mStyles.textSize + ((float) this.mStyles.spacing)) * f6), ((float) this.mStyles.padding) + f2 + f7, ((float) this.mStyles.padding) + f3 + ((this.mStyles.textSize + ((float) this.mStyles.spacing)) * f6) + f7), this.mRectPaint);
            canvas2.drawText(getTextForSeries((Series) next2.getKey(), (DataPointInterface) next2.getValue()), ((float) this.mStyles.padding) + f2 + f7 + ((float) this.mStyles.spacing), ((float) (this.mStyles.padding / 2)) + f3 + this.mStyles.textSize + (f6 * (this.mStyles.textSize + ((float) this.mStyles.spacing))), this.mTextPaint);
            i3++;
            i = i;
        }
    }

    public boolean onUp(MotionEvent motionEvent) {
        this.mCursorVisible = false;
        findCurrentDataPoint();
        this.mGraphView.invalidate();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        r3 = (com.jjoe64.graphview.series.BaseSeries) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void findCurrentDataPoint() {
        /*
            r6 = this;
            java.util.Map<com.jjoe64.graphview.series.BaseSeries, com.jjoe64.graphview.series.DataPointInterface> r0 = r6.mCurrentSelection
            r0.clear()
            com.jjoe64.graphview.GraphView r0 = r6.mGraphView
            java.util.List r0 = r0.getSeries()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x0011:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0035
            java.lang.Object r3 = r0.next()
            com.jjoe64.graphview.series.Series r3 = (com.jjoe64.graphview.series.Series) r3
            boolean r4 = r3 instanceof com.jjoe64.graphview.series.BaseSeries
            if (r4 == 0) goto L_0x0011
            com.jjoe64.graphview.series.BaseSeries r3 = (com.jjoe64.graphview.series.BaseSeries) r3
            float r4 = r6.mPosX
            com.jjoe64.graphview.series.DataPointInterface r4 = r3.findDataPointAtX(r4)
            if (r4 == 0) goto L_0x0011
            double r1 = r4.getX()
            java.util.Map<com.jjoe64.graphview.series.BaseSeries, com.jjoe64.graphview.series.DataPointInterface> r5 = r6.mCurrentSelection
            r5.put(r3, r4)
            goto L_0x0011
        L_0x0035:
            java.util.Map<com.jjoe64.graphview.series.BaseSeries, com.jjoe64.graphview.series.DataPointInterface> r0 = r6.mCurrentSelection
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x003f
            r6.mCurrentSelectionX = r1
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jjoe64.graphview.CursorMode.findCurrentDataPoint():void");
    }

    public void setTextSize(float f) {
        this.mStyles.textSize = f;
    }

    public void setTextColor(int i) {
        this.mStyles.textColor = i;
    }

    public void setBackgroundColor(int i) {
        this.mStyles.backgroundColor = i;
    }

    public void setSpacing(int i) {
        this.mStyles.spacing = i;
    }

    public void setPadding(int i) {
        this.mStyles.padding = i;
    }

    public void setMargin(int i) {
        this.mStyles.margin = i;
    }

    public void setWidth(int i) {
        this.mStyles.width = i;
    }
}
