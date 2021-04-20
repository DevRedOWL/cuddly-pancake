package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentaInfoSection */
public class RentaInfoSection extends MultiSection<RentInfo.RentObject, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<String> specialClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_renta_show;
    }

    public PublishProcessor<String> specialClicks() {
        return this.specialClick;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, RentInfo.RentObject rentObject, int i, List<Object> list) {
        viewHolder.label.setText(rentObject.getRentFields());
        viewHolder.description.setText((CharSequence) rentObject.getMap().get("val"));
        viewHolder.itemView.setOnClickListener((View.OnClickListener) null);
        if (rentObject.getMap().containsKey("arrow")) {
            viewHolder.f6818iv.setVisibility(0);
            viewHolder.itemView.setOnClickListener(this);
        }
        if (rentObject.getMap().containsKey("desc")) {
            viewHolder.description.setText((CharSequence) rentObject.getMap().get("desc"));
        }
    }

    public void onClick(View view) {
        ViewHolder viewHolder = (ViewHolder) view.getTag();
        if (viewHolder != null && getAdapterPositionForViewHolder(viewHolder) > -1) {
            specialClicks().onNext("show_periods");
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentaInfoSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView description;

        /* renamed from: iv */
        ImageView f6818iv;
        TextView label;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.label = (TextView) view.findViewById(R.id.title);
            this.description = (TextView) view.findViewById(R.id.subtitle);
            this.f6818iv = (ImageView) view.findViewById(R.id.arrow);
            this.f6818iv.setTag(this);
            this.f6818iv.setOnClickListener(onClickListener);
            view.setTag(this);
            view.setOnClickListener(onClickListener);
        }
    }
}
