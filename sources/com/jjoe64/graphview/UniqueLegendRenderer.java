package com.jjoe64.graphview;

import android.util.Pair;
import com.jjoe64.graphview.series.Series;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UniqueLegendRenderer extends LegendRenderer {
    public UniqueLegendRenderer(GraphView graphView) {
        super(graphView);
    }

    /* access modifiers changed from: protected */
    public List<Series> getAllSeries() {
        List<Series> allSeries = super.getAllSeries();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (Series next : allSeries) {
            if (hashSet.add(new Pair(Integer.valueOf(next.getColor()), next.getTitle()))) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
