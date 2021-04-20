package p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.util.GlideApp;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.FinalAddSection */
public class FinalAddSection extends SingleSection<SomeDevice, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<Integer> specialClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_final_add_model;
    }

    public PublishProcessor<Integer> specialClicks() {
        return this.specialClick;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        int adapterPositionForViewHolder;
        if ((view.getTag() instanceof ViewHolder) && (adapterPositionForViewHolder = getAdapterPositionForViewHolder((ViewHolder) view.getTag())) != -1) {
            this.specialClick.onNext(Integer.valueOf(adapterPositionForViewHolder));
        }
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, SomeDevice someDevice, List<Object> list) {
        viewHolder.title.setText(someDevice.getDeviceType());
        viewHolder.value.setText(someDevice.getDeviceName());
        if (someDevice.getDeviceUrl() != null) {
            GlideApp.with(viewHolder.icon.getContext()).load(someDevice.getDeviceUrl()).placeholder((int) R.drawable.ic_svg_base_device).error((int) R.drawable.ic_svg_base_device).into(viewHolder.icon);
        } else {
            viewHolder.icon.setVisibility(8);
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.FinalAddSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView icon;
        @BindView(2131362808)
        ImageView image;
        @BindView(2131363684)
        TextView title;
        @BindView(2131363987)
        TextView value;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            ButterKnife.bind((Object) this, view);
            this.title = (TextView) view.findViewById(R.id.title);
            this.value = (TextView) view.findViewById(R.id.value);
            this.image = (ImageView) view.findViewById(R.id.iv_edit);
            this.icon = (ImageView) view.findViewById(R.id.icon);
            this.image.setTag(this);
            this.image.setOnClickListener(onClickListener);
        }
    }
}
