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
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.ClassDeviceSection */
public class ClassDeviceSection extends MultiSection<ClassDevice, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<ClassDevice> classDeviceClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_class_device;
    }

    public PublishProcessor<ClassDevice> specialClicks() {
        return this.classDeviceClick;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, ClassDevice classDevice, int i, List<Object> list) {
        viewHolder.title.setText(classDevice.getTitle());
    }

    public void onClick(View view) {
        int adapterPositionForViewHolder;
        if ((view.getTag() instanceof ViewHolder) && (adapterPositionForViewHolder = getAdapterPositionForViewHolder((ViewHolder) view.getTag())) != -1) {
            this.classDeviceClick.onNext((ClassDevice) getData(adapterPositionForViewHolder));
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.ClassDeviceSection$ViewHolder */
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
