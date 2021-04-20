package p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.activity.navigation.api.DeviceModel;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.ClassModelSection */
public class ClassModelSection extends MultiSection<DeviceModel, ViewHolder> implements View.OnClickListener {
    public static final String NO_ITEM = "нет подходящих устройств";
    private PublishProcessor<DeviceModel> classDeviceClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_class_device;
    }

    public PublishProcessor<DeviceModel> specialClicks() {
        return this.classDeviceClick;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, DeviceModel deviceModel, int i, List<Object> list) {
        viewHolder.title.setText(deviceModel.getTitle());
    }

    public void onClick(View view) {
        int adapterPositionForViewHolder;
        if ((view.getTag() instanceof ViewHolder) && (adapterPositionForViewHolder = getAdapterPositionForViewHolder((ViewHolder) view.getTag())) != -1) {
            DeviceModel deviceModel = (DeviceModel) getData(adapterPositionForViewHolder);
            if (!NO_ITEM.equals(deviceModel.getClassName().toLowerCase())) {
                this.classDeviceClick.onNext(deviceModel);
            }
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.ClassModelSection$ViewHolder */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(2131362384)
        ImageView delete;
        @BindView(2131363684)
        TextView title;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            ButterKnife.bind((Object) this, view);
            this.title = (TextView) view.findViewById(R.id.title);
            this.delete = (ImageView) view.findViewById(R.id.delete);
            view.setOnClickListener(onClickListener);
            view.setTag(this);
            this.delete.setTag(this);
            this.delete.setOnClickListener(onClickListener);
        }
    }
}
