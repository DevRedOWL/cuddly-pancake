package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.CounterLegendSection */
class CounterLegendSection extends MultiSection<Legend, ViewHolder> {
    public int getLayoutId() {
        return R.layout.counter_legend_section;
    }

    CounterLegendSection() {
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, Legend legend, int i, List<Object> list) {
        viewHolder.title.setText(legend.getTitle());
        viewHolder.title.setTextColor(Color.parseColor(legend.getColor()));
        TextView textView = viewHolder.description;
        textView.setText("Расход  " + legend.getDelta() + legend.getDimension());
        StringBuilder sb = new StringBuilder();
        sb.append(legend.getPrice());
        sb.append(" ₽");
        viewHolder.value.setText(getSpannableValue(sb.toString(), viewHolder));
    }

    private Spannable getSpannableValue(String str, ViewHolder viewHolder) {
        SpannableString spannableString = new SpannableString(str);
        int indexOf = str.indexOf(".") + 1;
        spannableString.setSpan(new RelativeSizeSpan(2.0f), 0, indexOf, 33);
        spannableString.setSpan(new ForegroundColorSpan(viewHolder.title.getResources().getColor(R.color.textPrimary)), 0, indexOf, 33);
        spannableString.setSpan(new ForegroundColorSpan(viewHolder.title.getResources().getColor(R.color.textSecondary)), indexOf, str.length(), 33);
        return spannableString;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.CounterLegendSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView description;
        TextView title;
        TextView value;

        public ViewHolder(View view) {
            super(view);
            this.title = (TextView) view.findViewById(R.id.title);
            this.value = (TextView) view.findViewById(R.id.value);
            this.description = (TextView) view.findViewById(R.id.description);
        }
    }
}
