package com.jjoe64.graphview.helper;

import com.jjoe64.graphview.DefaultLabelFormatter;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.LabelFormatter;
import com.jjoe64.graphview.Viewport;

public class StaticLabelsFormatter implements LabelFormatter {
    protected LabelFormatter mDynamicLabelFormatter;
    protected final GraphView mGraphView;
    protected String[] mHorizontalLabels;
    protected String[] mVerticalLabels;
    protected Viewport mViewport;

    public StaticLabelsFormatter(GraphView graphView) {
        this.mGraphView = graphView;
        init((String[]) null, (String[]) null, (LabelFormatter) null);
    }

    public StaticLabelsFormatter(GraphView graphView, LabelFormatter labelFormatter) {
        this.mGraphView = graphView;
        init((String[]) null, (String[]) null, labelFormatter);
    }

    public StaticLabelsFormatter(GraphView graphView, String[] strArr, String[] strArr2) {
        this.mGraphView = graphView;
        init(strArr, strArr2, (LabelFormatter) null);
    }

    public StaticLabelsFormatter(GraphView graphView, String[] strArr, String[] strArr2, LabelFormatter labelFormatter) {
        this.mGraphView = graphView;
        init(strArr, strArr2, labelFormatter);
    }

    /* access modifiers changed from: protected */
    public void init(String[] strArr, String[] strArr2, LabelFormatter labelFormatter) {
        this.mDynamicLabelFormatter = labelFormatter;
        if (this.mDynamicLabelFormatter == null) {
            this.mDynamicLabelFormatter = new DefaultLabelFormatter();
        }
        this.mHorizontalLabels = strArr;
        this.mVerticalLabels = strArr2;
    }

    public void setDynamicLabelFormatter(LabelFormatter labelFormatter) {
        this.mDynamicLabelFormatter = labelFormatter;
        adjust();
    }

    public void setHorizontalLabels(String[] strArr) {
        this.mHorizontalLabels = strArr;
        adjust();
    }

    public void setVerticalLabels(String[] strArr) {
        this.mVerticalLabels = strArr;
        adjust();
    }

    public String formatLabel(double d, boolean z) {
        if (z && this.mHorizontalLabels != null) {
            double minX = this.mViewport.getMinX(false);
            double d2 = d - minX;
            String[] strArr = this.mHorizontalLabels;
            return strArr[(int) ((d2 / (this.mViewport.getMaxX(false) - minX)) * ((double) (strArr.length - 1)))];
        } else if (z || this.mVerticalLabels == null) {
            return this.mDynamicLabelFormatter.formatLabel(d, z);
        } else {
            double minY = this.mViewport.getMinY(false);
            double d3 = d - minY;
            String[] strArr2 = this.mVerticalLabels;
            return strArr2[(int) ((d3 / (this.mViewport.getMaxY(false) - minY)) * ((double) (strArr2.length - 1)))];
        }
    }

    public void setViewport(Viewport viewport) {
        this.mViewport = viewport;
        adjust();
    }

    /* access modifiers changed from: protected */
    public void adjust() {
        this.mDynamicLabelFormatter.setViewport(this.mViewport);
        String[] strArr = this.mVerticalLabels;
        if (strArr != null) {
            if (strArr.length >= 2) {
                this.mGraphView.getGridLabelRenderer().setNumVerticalLabels(this.mVerticalLabels.length);
            } else {
                throw new IllegalStateException("You need at least 2 vertical labels if you use static label formatter.");
            }
        }
        String[] strArr2 = this.mHorizontalLabels;
        if (strArr2 == null) {
            return;
        }
        if (strArr2.length >= 2) {
            this.mGraphView.getGridLabelRenderer().setNumHorizontalLabels(this.mHorizontalLabels.length);
            return;
        }
        throw new IllegalStateException("You need at least 2 horizontal labels if you use static label formatter.");
    }
}
