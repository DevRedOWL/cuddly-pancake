package p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.jakewharton.rxbinding2.view.RxView;
import com.jakewharton.rxbinding2.widget.RxCompoundButton;
import com.jakewharton.rxbinding2.widget.RxSeekBar;
import com.kyleduo.switchbutton.SwitchButton;
import java.util.concurrent.TimeUnit;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseHolder;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.ScenarioSettingsAdapter */
public class ScenarioSettingsAdapter extends BaseAdapter<Options, BaseHolder> {
    private static final int TYPE_CHECKBOX = 0;
    private static final int TYPE_TEMPERATURE = 1;
    private static final int TYPE_TIME = 2;
    private static final int TYPE_TITLE = 3;
    private PublishProcessor<Options> optionClick = PublishProcessor.create();

    public Options getItemById(String str) {
        return null;
    }

    public PublishProcessor<Options> getOptionClicks() {
        return this.optionClick;
    }

    public int getItemViewType(int i) {
        String apartmentScenarioOptionType = ((Options) getItem(i)).getApartmentScenarioOptionType();
        if (i == 0) {
            return 3;
        }
        if (apartmentScenarioOptionType.equals("checkbox") || apartmentScenarioOptionType.equals("imitationaudio")) {
            return 0;
        }
        return apartmentScenarioOptionType.equals("time") ? 2 : 1;
    }

    /* access modifiers changed from: protected */
    public BaseHolder getViewHolder(View view, int i, int i2) {
        if (i2 == 0) {
            return new CheckBoxViewHolder(LayoutInflater.from(view.getContext()).inflate(R.layout.item_scenario_type_checkbox, (ViewGroup) view, false));
        }
        if (i2 == 1) {
            return new TemperatureViewHolder(LayoutInflater.from(view.getContext()).inflate(R.layout.item_scenario_type_temperature, (ViewGroup) view, false));
        }
        if (i2 == 2) {
            return new TimeViewHolder(LayoutInflater.from(view.getContext()).inflate(R.layout.item_scenario_type_times, (ViewGroup) view, false));
        }
        if (i2 == 3) {
            return new TitleViewHolder(LayoutInflater.from(view.getContext()).inflate(R.layout.item_title, (ViewGroup) view, false));
        }
        throw new RuntimeException("no such viewholder");
    }

    /* access modifiers changed from: protected */
    public void onBindViewHolder(BaseHolder baseHolder, Options options, int i, int i2) {
        if (i2 == 0) {
            ((TitleViewHolder) baseHolder).title.setText(options.getHeader());
            return;
        }
        boolean z = options.getApartmentScenarioOptionState().intValue() == 1;
        String optionName = options.getOptionName();
        int itemViewType = getItemViewType(i2);
        if (itemViewType == 0) {
            CheckBoxViewHolder checkBoxViewHolder = (CheckBoxViewHolder) baseHolder;
            checkBoxViewHolder.checkBox.setChecked(z);
            checkBoxViewHolder.title.setText(optionName);
            subscribeOnCheck(checkBoxViewHolder.checkBox, i2);
        } else if (itemViewType == 1) {
            TemperatureViewHolder temperatureViewHolder = (TemperatureViewHolder) baseHolder;
            temperatureViewHolder.checkBox.setChecked(z);
            temperatureViewHolder.title.setText(optionName);
            temperatureViewHolder.title2.setText(optionName);
            String temperature = options.getApartmentScenarioOptionAdd().getTemperature();
            temperatureViewHolder.value.getContext().getString(R.string.format_celsium, new Object[]{temperature});
            temperatureViewHolder.value.setText(temperature);
            temperatureViewHolder.seekbar.setProgress(Integer.parseInt(temperature));
            subscribeOnCheck(temperatureViewHolder.checkBox, i2);
            subscribeOnTextChanges(temperatureViewHolder.seekbar, i2, 1);
        } else if (itemViewType == 2) {
            TimeViewHolder timeViewHolder = (TimeViewHolder) baseHolder;
            timeViewHolder.checkBox.setChecked(z);
            timeViewHolder.title.setText(optionName);
            timeViewHolder.value.setText(String.valueOf(options.getApartmentScenarioOptionState()));
            subscribeOnCheck(timeViewHolder.checkBox, i2);
        }
    }

    private void subscribeOnTextChanges(SeekBar seekBar, int i, int i2) {
        RxSeekBar.userChanges(seekBar).skipInitialValue().takeUntil(RxView.detaches(seekBar)).debounce(300, TimeUnit.MILLISECONDS).subscribe(new Consumer(i, i2) {
            private final /* synthetic */ int f$1;
            private final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                ScenarioSettingsAdapter.this.lambda$subscribeOnTextChanges$0$ScenarioSettingsAdapter(this.f$1, this.f$2, (Integer) obj);
            }
        });
    }

    public /* synthetic */ void lambda$subscribeOnTextChanges$0$ScenarioSettingsAdapter(int i, int i2, Integer num) throws Exception {
        saveValue(num.toString(), i, i2);
    }

    private void subscribeOnCheck(SwitchButton switchButton, int i) {
        RxCompoundButton.checkedChanges(switchButton).skipInitialValue().takeUntil(RxView.detaches(switchButton)).subscribe(new Consumer(switchButton, i) {
            private final /* synthetic */ SwitchButton f$1;
            private final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                ScenarioSettingsAdapter.this.lambda$subscribeOnCheck$1$ScenarioSettingsAdapter(this.f$1, this.f$2, (Boolean) obj);
            }
        });
    }

    public /* synthetic */ void lambda$subscribeOnCheck$1$ScenarioSettingsAdapter(SwitchButton switchButton, int i, Boolean bool) throws Exception {
        saveCheckValue(switchButton.isChecked(), i);
    }

    private void saveValue(String str, int i, int i2) {
        Options options = (Options) getItem(i);
        if (i2 == 1) {
            options.getApartmentScenarioOptionAdd().setTemperature(str);
        }
        updateDataOnServer(options);
    }

    private void saveCheckValue(boolean z, int i) {
        Options options = (Options) getItem(i);
        options.setApartmentScenarioOptionState(Integer.valueOf(z ? 1 : 0));
        updateDataOnServer(options);
    }

    private void updateDataOnServer(Options options) {
        this.optionClick.onNext(options);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.ScenarioSettingsAdapter$CheckBoxViewHolder */
    public class CheckBoxViewHolder extends BaseHolder {
        @BindView(2131363513)
        SwitchButton checkBox;
        @BindView(2131363684)
        TextView title;

        public CheckBoxViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
            this.title = (TextView) view.findViewById(R.id.title);
            this.checkBox = (SwitchButton) view.findViewById(R.id.swich);
            this.checkBox.setTag(this);
            this.checkBox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.ScenarioSettingsAdapter$TemperatureViewHolder */
    public class TemperatureViewHolder extends BaseHolder {
        @BindView(2131363513)
        SwitchButton checkBox;
        @BindView(2131363392)
        SeekBar seekbar;
        @BindView(2131363684)
        TextView title;
        @BindView(2131363687)
        TextView title2;
        @BindView(2131363987)
        TextView value;

        public TemperatureViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
            this.title = (TextView) view.findViewById(R.id.title);
            this.title2 = (TextView) view.findViewById(R.id.title2);
            this.value = (TextView) view.findViewById(R.id.value);
            this.checkBox = (SwitchButton) view.findViewById(R.id.swich);
            this.seekbar = (SeekBar) view.findViewById(R.id.seekBar);
            this.checkBox.setTag(this);
            this.checkBox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.ScenarioSettingsAdapter$TimeViewHolder */
    public class TimeViewHolder extends BaseHolder {
        @BindView(2131363513)
        SwitchButton checkBox;
        @BindView(2131363684)
        TextView title;
        @BindView(2131363687)
        TextView title2;
        @BindView(2131363987)
        TextView value;

        public TimeViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
            this.title = (TextView) view.findViewById(R.id.title);
            this.title2 = (TextView) view.findViewById(R.id.title2);
            this.value = (TextView) view.findViewById(R.id.value);
            this.checkBox = (SwitchButton) view.findViewById(R.id.swich);
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.ScenarioSettingsAdapter$TitleViewHolder */
    public class TitleViewHolder extends BaseHolder {
        @BindView(2131363684)
        TextView title;

        public TitleViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
            this.title = (TextView) view.findViewById(R.id.title);
        }
    }
}
