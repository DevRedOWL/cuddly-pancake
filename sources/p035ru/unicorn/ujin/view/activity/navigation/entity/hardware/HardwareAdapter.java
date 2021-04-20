package p035ru.unicorn.ujin.view.activity.navigation.entity.hardware;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import com.squareup.picasso.Picasso;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseHolder;
import p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.hardware.HardwareAdapter */
public class HardwareAdapter extends BaseAdapter<Hardware, HardwareHolder> implements CompoundButton.OnCheckedChangeListener {
    /* access modifiers changed from: private */
    public OnHardwareClick onHardwareClick;
    private OnSendSignal onSendSignal;

    public Hardware getItemById(String str) {
        return null;
    }

    public HardwareAdapter(OnHardwareClick onHardwareClick2, OnSendSignal onSendSignal2) {
        this.onHardwareClick = onHardwareClick2;
        this.onSendSignal = onSendSignal2;
    }

    /* access modifiers changed from: protected */
    public HardwareHolder getViewHolder(View view, int i, int i2) {
        return new HardwareHolder(LayoutInflater.from(view.getContext()).inflate(R.layout.item_hardware, (ViewGroup) view, false), this);
    }

    /* access modifiers changed from: protected */
    public void onBindViewHolder(HardwareHolder hardwareHolder, Hardware hardware, int i, int i2) {
        int i3 = 0;
        boolean z = hardware.getState().intValue() == 0;
        boolean z2 = hardware.getOnline().intValue() == 1;
        boolean z3 = hardware.getManagementType().getType().equals("switch") && hardware.getManagementType().getRules().equals("rw") && z2;
        hardwareHolder.f6717pb.setVisibility(4);
        hardwareHolder.descr.setText(hardware.getDeviceTitle());
        if (!hardware.getImgApp().equals("")) {
            Picasso.get().load("https://pro100.media/api/ihome/images/icons/icons8-heating-room-50_negative.png?r=8").placeholder((int) R.drawable.ic_image).into(hardwareHolder.icon);
        }
        if (!z2) {
            hardwareHolder.error.setVisibility(0);
            hardwareHolder.f6716cl.setBackgroundResource(R.drawable.bg_stroke_error);
        }
        hardwareHolder.checkBox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        CheckBox checkBox = hardwareHolder.checkBox;
        if (!z3) {
            i3 = 4;
        }
        checkBox.setVisibility(i3);
        hardwareHolder.checkBox.setChecked(!z);
        hardwareHolder.checkBox.setOnCheckedChangeListener(this);
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int adapterPosition;
        if ((compoundButton.getTag() instanceof HardwareHolder) && (adapterPosition = ((HardwareHolder) compoundButton.getTag()).getAdapterPosition()) != -1) {
            Hardware hardware = (Hardware) getItem(adapterPosition);
            String str = "0";
            String str2 = compoundButton.isChecked() ? "1" : str;
            if (hardware.getTypeName().contains("dimmer")) {
                if (compoundButton.isChecked()) {
                    str = "100";
                }
                str2 = str;
            }
            hardware.setState(Integer.valueOf(str2));
            notifyItemChanged(adapterPosition);
            sendSignal(Integer.valueOf(str2), adapterPosition);
        }
    }

    private void sendSignal(Integer num, int i) {
        Hardware hardware = (Hardware) getItem(i);
        Device device = new Device();
        device.setId(Long.valueOf(Long.parseLong(hardware.getGuid())));
        device.setName(hardware.getName());
        device.setValue(num.intValue());
        this.onSendSignal.sendSignal(device);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.hardware.HardwareAdapter$HardwareHolder */
    public class HardwareHolder extends BaseHolder implements View.OnClickListener {
        @BindView(2131362216)
        CheckBox checkBox;
        @BindView(2131362236)

        /* renamed from: cl */
        ConstraintLayout f6716cl;
        @BindView(2131363481)
        TextView descr;
        @BindView(2131362497)
        ImageView error;
        @BindView(2131362679)
        ImageView icon;
        @BindView(2131363166)

        /* renamed from: pb */
        ProgressBar f6717pb;

        public HardwareHolder(View view, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            super(view);
            this.checkBox.setTag(this);
            this.checkBox.setOnCheckedChangeListener(onCheckedChangeListener);
            view.setTag(this);
            view.setOnClickListener(this);
        }

        public void onClick(View view) {
            int adapterPosition = getAdapterPosition();
            if (adapterPosition != -1) {
                Hardware hardware = (Hardware) HardwareAdapter.this.getItem(adapterPosition);
                HardwareAdapter.this.onHardwareClick.onDeviceClick(hardware.getId(), hardware.getGuid(), hardware.getName());
            }
        }
    }
}
