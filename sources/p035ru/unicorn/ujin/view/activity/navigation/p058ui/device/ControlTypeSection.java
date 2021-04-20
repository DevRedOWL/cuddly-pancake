package p035ru.unicorn.ujin.view.activity.navigation.p058ui.device;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import butterknife.BindView;
import com.kyleduo.switchbutton.SwitchButton;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseHolder;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.HardwareSignal;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.OnSendSignal;
import p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.device.ControlTypeSection */
public class ControlTypeSection extends MultiSection<ListControlType, ViewHolder> implements CompoundButton.OnCheckedChangeListener {
    private int currentSelectedItem = -1;
    private HardwareSignal hardwareSiganl;
    private OnSendSignal sendSignal;

    public int getLayoutId() {
        return R.layout.item_control_type;
    }

    public ControlTypeSection(OnSendSignal onSendSignal) {
        this.sendSignal = onSendSignal;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, ListControlType listControlType, int i, List<Object> list) {
        viewHolder.title.setText(listControlType.getTitle());
        viewHolder.checkBox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        viewHolder.checkBox.setChecked(this.currentSelectedItem == i);
        viewHolder.checkBox.setOnCheckedChangeListener(this);
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int adapterPositionForViewHolder;
        if ((compoundButton.getTag() instanceof ViewHolder) && (adapterPositionForViewHolder = getAdapterPositionForViewHolder((ViewHolder) compoundButton.getTag())) != -1) {
            this.currentSelectedItem = adapterPositionForViewHolder;
            sendSiganl(adapterPositionForViewHolder, ((ListControlType) getData(adapterPositionForViewHolder)).getId());
        }
    }

    private void sendSiganl(int i, String str) {
        HardwareSignal hardwareSiganl2 = getHardwareSiganl();
        Device device = new Device();
        device.setId(Long.valueOf(Long.parseLong(hardwareSiganl2.getId())));
        device.setName(hardwareSiganl2.getName());
        device.setValue(Integer.parseInt(str));
        this.sendSignal.sendSignal(device);
    }

    public void setHardwareSignal(HardwareSignal hardwareSignal) {
        this.hardwareSiganl = hardwareSignal;
    }

    public HardwareSignal getHardwareSiganl() {
        return this.hardwareSiganl;
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.device.ControlTypeSection$ViewHolder */
    public class ViewHolder extends BaseHolder {
        @BindView(2131362216)
        SwitchButton checkBox;
        @BindView(2131363684)
        TextView title;

        public ViewHolder(View view, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            super(view);
            this.title = (TextView) view.findViewById(R.id.title);
            this.checkBox = (SwitchButton) view.findViewById(R.id.checkBox);
            view.setTag(this);
            this.checkBox.setTag(this);
            this.checkBox.setOnCheckedChangeListener(onCheckedChangeListener);
        }
    }
}
