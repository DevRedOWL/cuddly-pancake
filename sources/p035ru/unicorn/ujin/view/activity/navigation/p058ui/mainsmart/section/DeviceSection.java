package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.section;

import android.content.res.Resources;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import butterknife.BindView;
import com.kyleduo.switchbutton.SwitchButton;
import com.squareup.picasso.Picasso;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseHolder;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.OnHardwareClick;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.OnSendSignal;
import p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.section.DeviceSection */
public class DeviceSection extends MultiSection<Hardware, ViewHolder> implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {
    private OnHardwareClick onHardwareClick;
    private OnSendSignal onSendSignal;

    public int getLayoutId() {
        return R.layout.item_device_sectiom;
    }

    public DeviceSection(OnHardwareClick onHardwareClick2, OnSendSignal onSendSignal2) {
        this.onHardwareClick = onHardwareClick2;
        this.onSendSignal = onSendSignal2;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, Hardware hardware, int i, List<Object> list) {
        boolean z = hardware.getState().intValue() == 0;
        setColor(viewHolder, hardware);
        setVisibility(viewHolder, hardware);
        setActive(viewHolder, hardware);
        showImage(hardware, viewHolder);
        viewHolder.label.setText(hardware.getDeviceTitle());
        viewHolder.description.setText(hardware.getDescription());
        viewHolder.switchButton.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        viewHolder.switchButton.setChecked(!z);
        viewHolder.switchButton.setOnCheckedChangeListener(this);
    }

    private void showImage(Hardware hardware, ViewHolder viewHolder) {
        Picasso.get().load(hardware.getImgApp()).placeholder(AppCompatResources.getDrawable(viewHolder.icon.getContext(), R.drawable.ic_svg_plug_device)).into(viewHolder.icon);
    }

    private void setColor(ViewHolder viewHolder, Hardware hardware) {
        boolean z = true;
        if (hardware.getOnline().intValue() != 1) {
            z = false;
        }
        SwitchButton switchButton = viewHolder.switchButton;
        Resources resources = viewHolder.switchButton.getResources();
        int i = R.color.brandMain;
        switchButton.setTintColor(resources.getColor(z ? R.color.brandMain : R.color.brandSecondary));
        TextView textView = viewHolder.description;
        Resources resources2 = viewHolder.switchButton.getResources();
        if (!z) {
            i = R.color.brandSecondary;
        }
        textView.setTextColor(resources2.getColor(i));
    }

    private void setVisibility(ViewHolder viewHolder, Hardware hardware) {
        boolean z = true;
        int i = 0;
        boolean z2 = hardware.getOnline().intValue() == 1;
        boolean z3 = hardware.getManagementType().getType().equals("switch") && hardware.getManagementType().getRules().equals("rw");
        if (hardware.getState().intValue() != 0) {
            z = false;
        }
        int intValue = hardware.getManagement().intValue();
        viewHolder.switchButton.setVisibility(z3 ? 0 : 4);
        TextView textView = viewHolder.description;
        if (z && !z2) {
            i = 4;
        }
        textView.setVisibility(i);
    }

    private void setActive(ViewHolder viewHolder, Hardware hardware) {
        int intValue = hardware.getOnline().intValue();
        int intValue2 = hardware.getState().intValue();
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this, this);
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int layoutPositionForViewHolder;
        if ((compoundButton.getTag() instanceof ViewHolder) && (layoutPositionForViewHolder = getLayoutPositionForViewHolder((ViewHolder) compoundButton.getTag())) != -1) {
            Hardware hardware = (Hardware) getData(layoutPositionForViewHolder);
            String str = "0";
            String str2 = compoundButton.isChecked() ? "1" : str;
            if (hardware.getTypeName().contains("dimmer")) {
                if (compoundButton.isChecked()) {
                    str = "100";
                }
                str2 = str;
            }
            hardware.setState(Integer.valueOf(str2));
            onChanged(layoutPositionForViewHolder, 0, (Object) null);
            sendSignal(Integer.valueOf(str2), layoutPositionForViewHolder);
        }
    }

    public void onClick(View view) {
        int layoutPositionForViewHolder;
        if ((view.getTag() instanceof ViewHolder) && (layoutPositionForViewHolder = getLayoutPositionForViewHolder((ViewHolder) view.getTag())) != -1) {
            Hardware hardware = (Hardware) getData(layoutPositionForViewHolder);
            this.onHardwareClick.onDeviceClick(hardware.getId(), hardware.getGuid(), hardware.getName());
        }
    }

    private void sendSignal(Integer num, int i) {
        Hardware hardware = (Hardware) getData(i);
        Device device = new Device();
        device.setId(Long.valueOf(Long.parseLong(hardware.getGuid())));
        device.setName(hardware.getName());
        device.setValue(num.intValue());
        this.onSendSignal.sendSignal(device);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.section.DeviceSection$ViewHolder */
    public class ViewHolder extends BaseHolder {
        @BindView(2131362679)
        ImageView attention;
        @BindView(2131362398)
        TextView description;
        @BindView(2131362679)
        ImageView icon;
        @BindView(2131362821)
        TextView label;
        @BindView(2131363513)
        SwitchButton switchButton;

        public ViewHolder(View view, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, View.OnClickListener onClickListener) {
            super(view);
            this.label = (TextView) view.findViewById(R.id.label);
            this.icon = (ImageView) view.findViewById(R.id.icon);
            this.switchButton = (SwitchButton) view.findViewById(R.id.swich);
            this.description = (TextView) view.findViewById(R.id.description);
            this.switchButton.setOnCheckedChangeListener(onCheckedChangeListener);
            this.switchButton.setTag(this);
            view.setTag(this);
            view.setOnClickListener(onClickListener);
        }
    }
}
