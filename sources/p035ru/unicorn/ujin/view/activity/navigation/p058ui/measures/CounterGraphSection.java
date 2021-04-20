package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import android.content.Context;
import android.graphics.Color;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.utils.Utils;
import com.google.gson.internal.LinkedHashTreeMap;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.CounterGraphSection */
class CounterGraphSection extends SingleSection<Measures, ViewHolder> {
    private static final String MO_LABEL = "";
    private int position;
    private int type = 0;

    public int getLayoutId() {
        return R.layout.counter_graph_layout;
    }

    CounterGraphSection() {
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, Measures measures, List<Object> list) {
        List<Datum> data = measures.getLines().getData();
        viewHolder.chart.removeAllViews();
        viewHolder.tableLayout.removeAllViews();
        int i = 0;
        viewHolder.label.setText(viewHolder.label.getResources().getString(R.string.label_counters, new Object[]{measures.getLines().getTotalSum(), measures.getLines().getUnitName()}));
        int type2 = getType();
        viewHolder.noDataLabel.setVisibility(measures.getLines().getData().size() == 0 ? 0 : 8);
        viewHolder.chart.setVisibility(measures.getLines().getData().size() == 0 ? 4 : 0);
        LinearLayout linearLayout = viewHolder.tableLayout;
        if (measures.getLines().getData().size() == 0) {
            i = 4;
        }
        linearLayout.setVisibility(i);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (type2 == 0) {
            arrayList = new ArrayList();
            for (Datum next : data) {
                float hours = (float) TimeUnit.MILLISECONDS.toHours(next.getX().longValue() * 1000);
                arrayList.add(new Entry(hours, next.getY().floatValue()));
                arrayList2.add(new Entry(hours, next.getY().floatValue()));
            }
        } else if (type2 == 1) {
            for (Map.Entry next2 : getDataDivideBy(4, data).entrySet()) {
                Integer num = (Integer) next2.getKey();
                double findSum = findSum((List) ((Pair) next2.getValue()).second);
                float hours2 = (float) TimeUnit.MILLISECONDS.toHours(((Long) ((Pair) next2.getValue()).first).longValue());
                float f = (float) findSum;
                arrayList.add(new Entry(hours2, f));
                arrayList2.add(new Entry(hours2, f));
            }
        } else if (type2 == 2 || type2 == 3) {
            for (Map.Entry next3 : getDataDivideBy(2, data).entrySet()) {
                Integer num2 = (Integer) next3.getKey();
                double findSum2 = findSum((List) ((Pair) next3.getValue()).second);
                float hours3 = (float) TimeUnit.MILLISECONDS.toHours(((Long) ((Pair) next3.getValue()).first).longValue());
                float f2 = (float) findSum2;
                arrayList.add(new Entry(hours3, f2));
                arrayList2.add(new Entry(hours3, f2));
            }
        }
        graphSettings(viewHolder.chart, arrayList, measures.getLines().getLineColor());
        createValueList(arrayList2, viewHolder.tableLayout, measures.getLines().getUnitName());
    }

    private void createValueList(List<Entry> list, LinearLayout linearLayout, String str) {
        Context context = linearLayout.getContext();
        MyCustomFormatter2 myCustomFormatter2 = new MyCustomFormatter2(getType());
        for (int i = 0; i < list.size(); i++) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.item_counter_value, (ViewGroup) null);
            ((TextView) inflate.findViewById(R.id.title)).setText(myCustomFormatter2.getFormattedValue((long) list.get(i).getX()));
            ((TextView) inflate.findViewById(R.id.value)).setText(new DecimalFormat("#0.00").format((double) list.get(i).getY()) + " " + str);
            linearLayout.addView(inflate);
        }
    }

    private Map<Integer, Pair<Long, List<Double>>> getDataDivideBy(int i, List<Datum> list) {
        LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
        int i2 = 1;
        int i3 = -1;
        for (int i4 = 0; i4 < list.size(); i4++) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(((long) list.get(i4).getX().intValue()) * 1000);
            int i5 = instance.get(i);
            if (i3 != i5) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(list.get(i4).getY());
                linkedHashTreeMap.put(Integer.valueOf(i2), new Pair(Long.valueOf(((long) list.get(i4).getX().intValue()) * 1000), arrayList));
                i2++;
                i3 = i5;
            } else if (list.get(i4).getY() != null) {
                int i6 = i2 - 1;
                Pair pair = (Pair) linkedHashTreeMap.get(Integer.valueOf(i6));
                List arrayList2 = pair.second != null ? (List) pair.second : new ArrayList();
                arrayList2.add(list.get(i4).getY());
                linkedHashTreeMap.put(Integer.valueOf(i6), new Pair(pair.first, arrayList2));
            }
        }
        return linkedHashTreeMap;
    }

    private double findAvarage(List<Double> list) {
        double d = Utils.DOUBLE_EPSILON;
        for (int i = 0; i < list.size(); i++) {
            d += list.get(i).doubleValue();
        }
        return d / ((double) list.size());
    }

    private double findSum(List<Double> list) {
        double d = Utils.DOUBLE_EPSILON;
        for (int i = 0; i < list.size(); i++) {
            d += list.get(i).doubleValue();
        }
        return d;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.CounterGraphSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        LineChart chart;
        TextView label;
        TextView noDataLabel;
        LinearLayout tableLayout;

        public ViewHolder(View view) {
            super(view);
            this.chart = (LineChart) view.findViewById(R.id.chart);
            this.noDataLabel = (TextView) view.findViewById(R.id.no_data_label);
            this.tableLayout = (LinearLayout) view.findViewById(R.id.table);
            this.label = (TextView) view.findViewById(R.id.label);
        }
    }

    private void graphSettings(LineChart lineChart, List<Entry> list, String str) {
        LineDataSet lineDataSet = new LineDataSet(list, "");
        lineDataSet.setHighlightEnabled(true);
        lineDataSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        lineDataSet.setDrawValues(false);
        lineDataSet.setCubicIntensity(0.2f);
        lineDataSet.setLineWidth(1.8f);
        lineDataSet.setColor(Color.parseColor(str));
        lineDataSet.setFillColor(Color.parseColor(str));
        if (list.size() == 1) {
            lineDataSet.setDrawCircles(true);
            lineDataSet.setCircleRadius(4.0f);
            lineDataSet.setCircleColor(Color.parseColor(str));
            lineDataSet.setCircleHoleColor(Color.parseColor(str));
        } else {
            lineDataSet.setDrawCircles(false);
        }
        XAxis xAxis = lineChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setTextSize(10.0f);
        xAxis.setDrawAxisLine(true);
        xAxis.setDrawGridLines(false);
        xAxis.resetAxisMinimum();
        xAxis.resetAxisMaximum();
        xAxis.setTextColor(lineChart.getContext().getResources().getColor(R.color.textSecondary));
        xAxis.setLabelCount(list.size(), true);
        xAxis.setValueFormatter(new MyCustomFormatter(this.type, list));
        xAxis.setGranularity(1.0f);
        if (list.size() > 10) {
            xAxis.setLabelRotationAngle(-90.0f);
        } else {
            xAxis.setLabelRotationAngle(0.0f);
        }
        if (list.size() == 1) {
            xAxis.setCenterAxisLabels(true);
        } else {
            xAxis.setCenterAxisLabels(false);
        }
        YAxis axisRight = lineChart.getAxisRight();
        axisRight.setDrawLabels(false);
        axisRight.setDrawGridLines(false);
        YAxis axisLeft = lineChart.getAxisLeft();
        axisLeft.setTextColor(lineChart.getContext().getResources().getColor(R.color.textSecondary));
        boolean z = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getY() == 0.0f) {
                z = true;
            }
        }
        if (z) {
            axisLeft.setAxisMinimum(0.0f);
        } else {
            axisLeft.resetAxisMinimum();
        }
        LineData lineData = new LineData(lineDataSet);
        lineChart.setBorderColor(lineChart.getContext().getResources().getColor(R.color.textSecondary));
        lineChart.getLegend().setEnabled(false);
        lineChart.getDescription().setEnabled(false);
        lineChart.setDoubleTapToZoomEnabled(false);
        lineChart.setOnTouchListener((ChartTouchListener) null);
        lineChart.setExtraOffsets(5.0f, 0.0f, 25.0f, 5.0f);
        lineChart.setClipToPadding(false);
        lineChart.setData(lineData);
        lineChart.invalidate();
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public int getPosition() {
        return this.position;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }
}
