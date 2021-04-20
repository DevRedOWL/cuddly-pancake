package p035ru.unicorn.ujin.view.activity.navigation.entity.hardware;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.TextView;
import butterknife.BindView;
import com.jakewharton.rxbinding2.view.RxView;
import com.jakewharton.rxbinding2.widget.RxCompoundButton;
import com.kyleduo.switchbutton.SwitchButton;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseHolder;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.device.ListControlType;
import p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.hardware.SignalsSection */
public class SignalsSection extends MultiSection<HardwareSignal, SignalHolder> implements CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener, View.OnClickListener {
    PublishProcessor<HardwareSignal> onSpecialClick = PublishProcessor.create();
    private OnSendSignal sendSignal;

    public int getLayoutId() {
        return R.layout.item_signal;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public PublishProcessor<HardwareSignal> getOnSpecialClick() {
        return this.onSpecialClick;
    }

    public SignalsSection(OnSendSignal onSendSignal) {
        this.sendSignal = onSendSignal;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(SignalHolder signalHolder, HardwareSignal hardwareSignal, int i, List<Object> list) {
        boolean contains = hardwareSignal.getTypeControl().contains("counter");
        int i2 = 0;
        boolean z = hardwareSignal.getReadonlyValue().intValue() == 0 && !hardwareSignal.getTypeControl().contains("toggle") && !hardwareSignal.getTypeControl().contains("counter");
        boolean contains2 = hardwareSignal.getTypeControl().contains("toggle");
        boolean contains3 = hardwareSignal.getTypeControl().contains("uniremote");
        signalHolder.descr.setText(hardwareSignal.getTitle());
        String str = hardwareSignal.getValue() + " " + hardwareSignal.getMeasure();
        if (hardwareSignal.getTypeControl().equals("list")) {
            str = ListControlType.findIdByTitle(hardwareSignal.getListControlTypes(), hardwareSignal.getValue(), hardwareSignal.getTitle());
        }
        signalHolder.value.setText(str);
        if (contains) {
            signalHolder.seekBar.setVisibility(0);
            signalHolder.seekBar.setMax(hardwareSignal.getCounterMax().intValue());
            signalHolder.seekBar.setProgress(Integer.parseInt(hardwareSignal.getValue()));
            signalHolder.seekBar.setOnSeekBarChangeListener(this);
        } else {
            signalHolder.seekBar.setVisibility(8);
        }
        signalHolder.change.setVisibility(z ? 0 : 8);
        if (contains2) {
            signalHolder.value.setVisibility(8);
            signalHolder.checkBox.setVisibility(0);
            signalHolder.checkBox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            signalHolder.checkBox.setChecked(hardwareSignal.getValue().equals("1"));
            signalHolder.checkBox.setOnCheckedChangeListener(this);
        } else {
            signalHolder.value.setVisibility(0);
            signalHolder.checkBox.setVisibility(8);
        }
        Button button = signalHolder.uniRemote;
        if (!contains3) {
            i2 = 8;
        }
        button.setVisibility(i2);
        if (contains3) {
            signalHolder.uniRemote.setText(hardwareSignal.getValue() == null ? "Настроить" : "Выполнить");
            signalHolder.change.setVisibility(8);
            signalHolder.uniRemote.setOnClickListener(this);
        }
    }

    /* access modifiers changed from: protected */
    public SignalHolder createViewHolder(View view) {
        return new SignalHolder(view, this, this);
    }

    private void sendSignal(Integer num, int i) {
        HardwareSignal hardwareSignal = (HardwareSignal) getData(i);
        Device device = new Device();
        device.setId(Long.valueOf(Long.parseLong(hardwareSignal.getId())));
        device.setName(hardwareSignal.getName());
        device.setValue(num.intValue());
        this.sendSignal.sendSignal(device);
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int adapterPositionForViewHolder;
        if ((compoundButton.getTag() instanceof SignalHolder) && (adapterPositionForViewHolder = getAdapterPositionForViewHolder((SignalHolder) compoundButton.getTag())) != -1) {
            HardwareSignal hardwareSignal = (HardwareSignal) getData(adapterPositionForViewHolder);
            String str = compoundButton.isChecked() ? "1" : "0";
            hardwareSignal.setValue(str);
            sendSignal(Integer.valueOf(str), adapterPositionForViewHolder);
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        int adapterPositionForViewHolder;
        Log.d("TAG", "seek 3");
        if ((seekBar.getTag() instanceof SignalHolder) && (adapterPositionForViewHolder = getAdapterPositionForViewHolder((SignalHolder) seekBar.getTag())) != -1) {
            ((HardwareSignal) getData(adapterPositionForViewHolder)).setValue(String.valueOf(seekBar.getProgress()));
            onChanged(adapterPositionForViewHolder, 1, (Object) null);
            sendSignal(Integer.valueOf(seekBar.getProgress()), adapterPositionForViewHolder);
        }
    }

    private void subscribeToClicks(CheckBox checkBox, int i) {
        RxCompoundButton.checkedChanges(checkBox).skipInitialValue().takeUntil(RxView.detaches(checkBox)).debounce(300, TimeUnit.MICROSECONDS).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Consumer(checkBox) {
            private final /* synthetic */ CheckBox f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                SignalsSection.this.lambda$subscribeToClicks$0$SignalsSection(this.f$1, (Boolean) obj);
            }
        }).subscribe();
    }

    public /* synthetic */ void lambda$subscribeToClicks$0$SignalsSection(CheckBox checkBox, Boolean bool) throws Exception {
        int adapterPositionForViewHolder;
        if ((checkBox.getTag() instanceof SignalHolder) && (adapterPositionForViewHolder = getAdapterPositionForViewHolder((SignalHolder) checkBox.getTag())) != -1) {
            HardwareSignal hardwareSignal = (HardwareSignal) getData(adapterPositionForViewHolder);
            String str = checkBox.isChecked() ? "1" : "0";
            hardwareSignal.setValue(str);
            sendSignal(Integer.valueOf(str), adapterPositionForViewHolder);
        }
    }

    public void onClick(View view) {
        int adapterPositionForViewHolder;
        if ((view.getTag() instanceof SignalHolder) && (adapterPositionForViewHolder = getAdapterPositionForViewHolder((SignalHolder) view.getTag())) != -1) {
            HardwareSignal hardwareSignal = (HardwareSignal) getData(adapterPositionForViewHolder);
            if (hardwareSignal.getTypeControl().equals("list") || hardwareSignal.getTypeControl().equals("text")) {
                this.onSpecialClick.onNext(hardwareSignal);
            }
            hardwareSignal.getTypeControl().toLowerCase().equals("uniremote");
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.hardware.SignalsSection$SignalHolder */
    public class SignalHolder extends BaseHolder {
        @BindView(2131362208)
        TextView change;
        @BindView(2131362219)
        SwitchButton checkBox;
        @BindView(2131363481)
        TextView descr;
        @BindView(2131363391)
        SeekBar seekBar;
        Button uniRemote;
        @BindView(2131363987)
        TextView value;

        public SignalHolder(View view, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, View.OnClickListener onClickListener) {
            super(view);
            this.descr = (TextView) view.findViewById(R.id.state);
            this.value = (TextView) view.findViewById(R.id.value);
            this.seekBar = (SeekBar) view.findViewById(R.id.seeckbar);
            this.change = (TextView) view.findViewById(R.id.change);
            this.checkBox = (SwitchButton) view.findViewById(R.id.checkbox);
            this.uniRemote = (Button) view.findViewById(R.id.btn_settings);
            view.setTag(this);
            this.checkBox.setTag(this);
            this.seekBar.setTag(this);
            this.checkBox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            this.change.setTag(this);
            this.change.setOnClickListener(onClickListener);
            this.uniRemote.setOnClickListener(onClickListener);
        }
    }
}
