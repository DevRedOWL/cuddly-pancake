package p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_list;

import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseHolder;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.scenario_list.ScenarioListSection */
public class ScenarioListSection extends MultiSection<Scenario, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<Scenario> specialClicks = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_scenario_list;
    }

    public PublishProcessor<Scenario> specialClicks() {
        return this.specialClicks;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, Scenario scenario, int i, List<Object> list) {
        viewHolder.title.setText(scenario.getName());
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        int layoutPositionForViewHolder;
        if ((view.getTag() instanceof ViewHolder) && (layoutPositionForViewHolder = getLayoutPositionForViewHolder((ViewHolder) view.getTag())) != -1) {
            this.specialClicks.onNext((Scenario) getData(layoutPositionForViewHolder));
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.scenario_list.ScenarioListSection$ViewHolder */
    public class ViewHolder extends BaseHolder {
        @BindView(2131363684)
        TextView title;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.title = (TextView) view.findViewById(R.id.title);
            view.setOnClickListener(onClickListener);
            view.setTag(this);
        }
    }
}
