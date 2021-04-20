package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.SelectorItemsSection */
class SelectorItemsSection extends MultiSection<ServiceFieldItems, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<Integer> specialClicks = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.zayavka_section_selector;
    }

    SelectorItemsSection() {
    }

    public PublishProcessor<Integer> getSpecialClicks() {
        return this.specialClicks;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, ServiceFieldItems serviceFieldItems, int i, List<Object> list) {
        viewHolder.text.setText(serviceFieldItems.getValue());
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        int adapterPositionForViewHolder;
        ViewHolder viewHolder = (ViewHolder) view.getTag();
        if (viewHolder != null && (adapterPositionForViewHolder = getAdapterPositionForViewHolder(viewHolder)) != -1) {
            getSpecialClicks().onNext(Integer.valueOf(adapterPositionForViewHolder));
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.SelectorItemsSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView text;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.text = (TextView) view.findViewById(R.id.title);
            view.setOnClickListener(onClickListener);
            this.text.setOnClickListener(onClickListener);
            view.setTag(this);
            this.text.setTag(this);
        }
    }
}
