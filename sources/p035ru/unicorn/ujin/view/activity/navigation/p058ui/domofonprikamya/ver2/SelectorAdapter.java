package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ver2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ServiceFieldItems;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.ver2.SelectorAdapter */
public class SelectorAdapter extends AbstractRecyclerViewAdapter<ServiceFieldItems, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<Integer> specialClicks = PublishProcessor.create();

    public PublishProcessor<Integer> getSpecialClicks() {
        return this.specialClicks;
    }

    public void onClick(View view) {
        int adapterPosition;
        ViewHolder viewHolder = (ViewHolder) view.getTag();
        if (viewHolder != null && (adapterPosition = viewHolder.getAdapterPosition()) != -1) {
            getSpecialClicks().onNext(Integer.valueOf(adapterPosition));
        }
    }

    /* access modifiers changed from: protected */
    public ViewHolder getViewHolder(View view) {
        return new ViewHolder(LayoutInflater.from(view.getContext()).inflate(R.layout.zayavka_section_selector, (ViewGroup) view, false), this);
    }

    /* access modifiers changed from: protected */
    public void onBindViewHolder(ViewHolder viewHolder, ServiceFieldItems serviceFieldItems) {
        viewHolder.text.setText(serviceFieldItems.getValue());
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.ver2.SelectorAdapter$ViewHolder */
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
