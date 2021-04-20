package com.jjoe64.graphview.helper;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import com.jjoe64.graphview.C2746R;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.BaseSeries;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.series.PointsGraphSeries;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.MapField;

public class GraphViewXML extends GraphView {
    public GraphViewXML(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        BaseSeries baseSeries;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2746R.styleable.GraphViewXML);
        String string = obtainStyledAttributes.getString(C2746R.styleable.GraphViewXML_seriesData);
        int color = obtainStyledAttributes.getColor(C2746R.styleable.GraphViewXML_seriesColor, 0);
        String string2 = obtainStyledAttributes.getString(C2746R.styleable.GraphViewXML_seriesType);
        String string3 = obtainStyledAttributes.getString(C2746R.styleable.GraphViewXML_seriesTitle);
        String string4 = obtainStyledAttributes.getString(C2746R.styleable.GraphViewXML_android_title);
        obtainStyledAttributes.recycle();
        if (string == null || string.isEmpty()) {
            throw new IllegalArgumentException("Attribute seriesData is required in the format: 0=5.0;1=5;2=4;3=9");
        }
        String[] split = string.split(";");
        try {
            DataPoint[] dataPointArr = new DataPoint[split.length];
            int i = 0;
            for (String split2 : split) {
                String[] split3 = split2.split("=");
                dataPointArr[i] = new DataPoint(Double.parseDouble(split3[0]), Double.parseDouble(split3[1]));
                i++;
            }
            string2 = (string2 == null || string2.isEmpty()) ? "line" : string2;
            if (string2.equals("line")) {
                baseSeries = new LineGraphSeries(dataPointArr);
            } else if (string2.equals("bar")) {
                baseSeries = new BarGraphSeries(dataPointArr);
            } else if (string2.equals(MapField.JsonFields.pointList)) {
                baseSeries = new PointsGraphSeries(dataPointArr);
            } else {
                throw new IllegalArgumentException("unknown graph type: " + string2 + ". Possible is line|bar|points");
            }
            if (color != 0) {
                baseSeries.setColor(color);
            }
            addSeries(baseSeries);
            if (string3 != null && !string3.isEmpty()) {
                baseSeries.setTitle(string3);
                getLegendRenderer().setVisible(true);
            }
            if (string4 != null && !string4.isEmpty()) {
                setTitle(string4);
            }
        } catch (Exception e) {
            Log.e("GraphViewXML", e.toString());
            throw new IllegalArgumentException("Attribute seriesData is broken. Use this format: 0=5.0;1=5;2=4;3=9");
        }
    }
}
