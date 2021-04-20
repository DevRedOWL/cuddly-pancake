package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.CounterValueSection */
class CounterValueSection extends MultiSection<Graph, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<Integer> onClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.counter_section;
    }

    CounterValueSection() {
    }

    public PublishProcessor<Integer> getOnClick() {
        return this.onClick;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, Graph graph, int i, List<Object> list) {
        viewHolder.title.setText(graph.getTitle());
        viewHolder.description.setText(graph.getText());
        viewHolder.value.setText(getSpannableValue(graph.getSum() + " ₽"));
    }

    private Spannable getSpannableValue(String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new RelativeSizeSpan(2.0f), 0, str.indexOf(",") + 1, 33);
        return spannableString;
    }

    public void onClick(View view) {
        int layoutPositionForViewHolder;
        if ((view.getTag() instanceof ViewHolder) && (layoutPositionForViewHolder = getLayoutPositionForViewHolder((ViewHolder) view.getTag())) != -1) {
            getOnClick().onNext(Integer.valueOf(layoutPositionForViewHolder));
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.CounterValueSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView description;
        TextView title;
        TextView value;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.title = (TextView) view.findViewById(R.id.title);
            this.value = (TextView) view.findViewById(R.id.value);
            this.description = (TextView) view.findViewById(R.id.description);
            view.setTag(this);
            view.setOnClickListener(onClickListener);
        }
    }
}
