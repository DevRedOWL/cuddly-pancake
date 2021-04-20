package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentaTypeSection */
public class RentaTypeSection extends MultiSection<RentType, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<RentType> specialClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_profile_renta;
    }

    public PublishProcessor<RentType> specialClicks() {
        return this.specialClick;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        ViewHolder viewHolder = (ViewHolder) view.getTag();
        if (viewHolder != null) {
            this.specialClick.onNext((RentType) getData(getAdapterPositionForViewHolder(viewHolder)));
        }
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, RentType rentType, int i, List<Object> list) {
        viewHolder.label.setText(rentType.getDisplayName());
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentaTypeSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView label;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.label = (TextView) view.findViewById(R.id.title);
            view.setTag(this);
            view.setOnClickListener(onClickListener);
        }
    }
}
