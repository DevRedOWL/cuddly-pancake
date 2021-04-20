package p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rooms.RoomSection;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.ScenarioSettingsSection */
public class ScenarioSettingsSection extends MultiSection<Options, RecyclerView.ViewHolder> implements View.OnClickListener {
    private PublishProcessor<Options> specialClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_scenario_type_checkbox;
    }

    public PublishProcessor<Options> specialClicks() {
        return this.specialClick;
    }

    /* access modifiers changed from: protected */
    public RecyclerView.ViewHolder createViewHolder(View view) {
        return new CheckBoxViewHolder(view, this);
    }

    public void onClick(View view) {
        if (!(view.getTag() instanceof RoomSection.ViewHolder) || getAdapterPositionForViewHolder((RoomSection.ViewHolder) view.getTag()) == -1) {
        }
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(RecyclerView.ViewHolder viewHolder, Options options, int i, List<Object> list) {
        CheckBoxViewHolder checkBoxViewHolder = (CheckBoxViewHolder) viewHolder;
        boolean z = true;
        if (options.getApartmentScenarioOptionState().intValue() != 1) {
            z = false;
        }
        checkBoxViewHolder.checkBox.setChecked(z);
        checkBoxViewHolder.title.setText(options.getOptionName());
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.ScenarioSettingsSection$CheckBoxViewHolder */
    public static class CheckBoxViewHolder extends RecyclerView.ViewHolder {
        @BindView(2131362216)
        CheckBox checkBox;
        @BindView(2131363684)
        TextView title;

        public CheckBoxViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            ButterKnife.bind((Object) this, view);
        }
    }
}
