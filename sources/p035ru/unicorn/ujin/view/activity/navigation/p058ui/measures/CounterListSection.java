package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.CounterListSection */
public class CounterListSection extends MultiSection<MeasuresData, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<MeasuresData> onClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_measures_list;
    }

    public PublishProcessor<MeasuresData> getOnClick() {
        return this.onClick;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        int layoutPositionForViewHolder;
        if ((view.getTag() instanceof ViewHolder) && (layoutPositionForViewHolder = getLayoutPositionForViewHolder((ViewHolder) view.getTag())) != -1) {
            getOnClick().onNext(getData(layoutPositionForViewHolder));
        }
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, MeasuresData measuresData, int i, List<Object> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(measuresData.getTitle());
        sb.append(" (S/N ");
        sb.append(measuresData.getSerialNumber());
        sb.append(")");
        SpannableString spannableString = new SpannableString(sb);
        spannableString.setSpan(new ForegroundColorSpan(viewHolder.title.getResources().getColor(R.color.textPrimary)), 0, measuresData.getTitle().length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(viewHolder.title.getResources().getColor(R.color.textSecondary)), measuresData.getTitle().length(), sb.length(), 33);
        viewHolder.title.setText(spannableString);
        viewHolder.value.setText(measuresData.getLastDateCurrentValue());
        viewHolder.sumValue.setText(String.valueOf(measuresData.getCurrentValueCounter()));
        viewHolder.staus.setText(measuresData.getUnitName());
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.CounterListSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView staus;
        TextView sumValue;
        TextView title;
        TextView value;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.title = (TextView) view.findViewById(R.id.title);
            this.value = (TextView) view.findViewById(R.id.value);
            this.staus = (TextView) view.findViewById(R.id.status);
            this.sumValue = (TextView) view.findViewById(R.id.sum_value);
            view.setOnClickListener(onClickListener);
            view.setTag(this);
        }
    }
}
