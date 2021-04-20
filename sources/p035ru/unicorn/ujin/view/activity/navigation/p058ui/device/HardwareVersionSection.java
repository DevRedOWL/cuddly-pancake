package p035ru.unicorn.ujin.view.activity.navigation.p058ui.device;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.device.HardwareVersionSection */
public class HardwareVersionSection extends SingleSection<VersionData, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<String> specialClicks = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_version_hardware;
    }

    public PublishProcessor<String> getSpecialClicks() {
        return this.specialClicks;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, VersionData versionData, List<Object> list) {
        viewHolder.version.setText(versionData.getVersion());
        viewHolder.manual.setVisibility(versionData.hasManual() ? 0 : 4);
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        this.specialClicks.onNext(((VersionData) getData()).getManual());
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.device.HardwareVersionSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(2131362929)
        TextView manual;
        @BindView(2131363994)
        TextView version;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            ButterKnife.bind((Object) this, view);
            this.version = (TextView) view.findViewById(R.id.version);
            this.manual = (TextView) view.findViewById(R.id.manual);
            this.manual.setOnClickListener(onClickListener);
        }
    }
}
