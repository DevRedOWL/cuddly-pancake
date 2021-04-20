package p035ru.unicorn.ujin.view.activity.navigation.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.profile.Apartment;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.adapter.FlatAdapter */
public class FlatAdapter extends BaseAdapter<Apartment, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<Apartment> onApartamentClick = PublishProcessor.create();

    public Apartment getItemById(String str) {
        return null;
    }

    public PublishProcessor<Apartment> getOnApartamentClick() {
        return this.onApartamentClick;
    }

    public void onClick(View view) {
        int adapterPosition = ((ViewHolder) view.getTag()).getAdapterPosition();
        if (adapterPosition != -1) {
            this.onApartamentClick.onNext((Apartment) getItem(adapterPosition));
        }
    }

    /* access modifiers changed from: protected */
    public ViewHolder getViewHolder(View view, int i, int i2) {
        return new ViewHolder(LayoutInflater.from(view.getContext()).inflate(R.layout.item_flat_contract, (ViewGroup) view, false), this);
    }

    /* access modifiers changed from: protected */
    public void onBindViewHolder(ViewHolder viewHolder, Apartment apartment, int i, int i2) {
        if (i2 != getItemCount() - 1) {
            viewHolder.tvFlat.setText(apartment.getTitle());
            viewHolder.ivPlus.setImageResource(R.drawable.ic_svg_checkbox);
            return;
        }
        viewHolder.tvFlat.setText(R.string.label_add_dogovor);
        viewHolder.ivPlus.setImageResource(R.drawable.ic_svg_plus);
        viewHolder.ivPlus.setVisibility(0);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.adapter.FlatAdapter$ViewHolder */
    public static class ViewHolder extends BaseHolder {
        @BindView(2131362811)
        ImageView ivPlus;
        @BindView(2131363949)
        TextView tvFlat;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.ivPlus = (ImageView) view.findViewById(R.id.iv_plus);
            this.tvFlat = (TextView) view.findViewById(R.id.tv_flat);
            view.setOnClickListener(onClickListener);
            view.setTag(this);
        }
    }
}
