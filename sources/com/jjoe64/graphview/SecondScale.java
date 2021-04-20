package com.jjoe64.graphview;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.utils.Utils;
import com.jjoe64.graphview.series.Series;
import java.util.ArrayList;
import java.util.List;

public class SecondScale {
    protected RectD mCompleteRange = new RectD();
    protected RectD mCurrentViewport = new RectD();
    protected final GraphView mGraph;
    protected LabelFormatter mLabelFormatter;
    private Paint mPaintAxisTitle;
    protected double mReferenceY = Double.NaN;
    protected List<Series> mSeries;
    private String mVerticalAxisTitle;
    public int mVerticalAxisTitleColor;
    public float mVerticalAxisTitleTextSize;
    private boolean mYAxisBoundsManual = true;

    SecondScale(GraphView graphView) {
        this.mGraph = graphView;
        this.mSeries = new ArrayList();
        this.mLabelFormatter = new DefaultLabelFormatter();
        this.mLabelFormatter.setViewport(this.mGraph.getViewport());
    }

    public void addSeries(Series series) {
        series.onGraphViewAttached(this.mGraph);
        this.mSeries.add(series);
        this.mGraph.onDataChanged(false, false);
    }

    public void setMinY(double d) {
        this.mReferenceY = d;
        this.mCurrentViewport.bottom = d;
    }

    public void setMaxY(double d) {
        this.mCurrentViewport.top = d;
    }

    public List<Series> getSeries() {
        return this.mSeries;
    }

    public double getMinY(boolean z) {
        return (z ? this.mCompleteRange : this.mCurrentViewport).bottom;
    }

    public double getMaxY(boolean z) {
        return (z ? this.mCompleteRange : this.mCurrentViewport).top;
    }

    public boolean isYAxisBoundsManual() {
        return this.mYAxisBoundsManual;
    }

    public LabelFormatter getLabelFormatter() {
        return this.mLabelFormatter;
    }

    public void setLabelFormatter(LabelFormatter labelFormatter) {
        this.mLabelFormatter = labelFormatter;
        this.mLabelFormatter.setViewport(this.mGraph.getViewport());
    }

    public void removeAllSeries() {
        this.mSeries.clear();
        this.mGraph.onDataChanged(false, false);
    }

    public void removeSeries(Series series) {
        this.mSeries.remove(series);
        this.mGraph.onDataChanged(false, false);
    }

    public void calcCompleteRange() {
        List<Series> series = getSeries();
        this.mCompleteRange.set(Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON);
        if (!series.isEmpty() && !series.get(0).isEmpty()) {
            double lowestValueX = series.get(0).getLowestValueX();
            for (Series next : series) {
                if (!next.isEmpty() && lowestValueX > next.getLowestValueX()) {
                    lowestValueX = next.getLowestValueX();
                }
            }
            this.mCompleteRange.left = lowestValueX;
            double highestValueX = series.get(0).getHighestValueX();
            for (Series next2 : series) {
                if (!next2.isEmpty() && highestValueX < next2.getHighestValueX()) {
                    highestValueX = next2.getHighestValueX();
                }
            }
            this.mCompleteRange.right = highestValueX;
            if (!series.isEmpty() && !series.get(0).isEmpty()) {
                double lowestValueY = series.get(0).getLowestValueY();
                for (Series next3 : series) {
                    if (!next3.isEmpty() && lowestValueY > next3.getLowestValueY()) {
                        lowestValueY = next3.getLowestValueY();
                    }
                }
                this.mCompleteRange.bottom = lowestValueY;
                double highestValueY = series.get(0).getHighestValueY();
                for (Series next4 : series) {
                    if (!next4.isEmpty() && highestValueY < next4.getHighestValueY()) {
                        highestValueY = next4.getHighestValueY();
                    }
                }
                this.mCompleteRange.top = highestValueY;
            }
        }
    }

    public String getVerticalAxisTitle() {
        return this.mVerticalAxisTitle;
    }

    public void setVerticalAxisTitle(String str) {
        if (this.mPaintAxisTitle == null) {
            this.mPaintAxisTitle = new Paint();
            this.mPaintAxisTitle.setTextSize(getVerticalAxisTitleTextSize());
            this.mPaintAxisTitle.setTextAlign(Paint.Align.CENTER);
        }
        this.mVerticalAxisTitle = str;
    }

    public float getVerticalAxisTitleTextSize() {
        if (getVerticalAxisTitle() == null || getVerticalAxisTitle().length() == 0) {
            return 0.0f;
        }
        return this.mVerticalAxisTitleTextSize;
    }

    public void setVerticalAxisTitleTextSize(float f) {
        this.mVerticalAxisTitleTextSize = f;
    }

    public int getVerticalAxisTitleColor() {
        return this.mVerticalAxisTitleColor;
    }

    public void setVerticalAxisTitleColor(int i) {
        this.mVerticalAxisTitleColor = i;
    }

    /* access modifiers changed from: protected */
    public void drawVerticalAxisTitle(Canvas canvas) {
        String str = this.mVerticalAxisTitle;
        if (str != null && str.length() > 0) {
            this.mPaintAxisTitle.setColor(getVerticalAxisTitleColor());
            this.mPaintAxisTitle.setTextSize(getVerticalAxisTitleTextSize());
            float width = ((float) canvas.getWidth()) - (getVerticalAxisTitleTextSize() / 2.0f);
            float height = (float) (canvas.getHeight() / 2);
            canvas.save();
            canvas.rotate(-90.0f, width, height);
            canvas.drawText(this.mVerticalAxisTitle, width, height, this.mPaintAxisTitle);
            canvas.restore();
        }
    }
}
