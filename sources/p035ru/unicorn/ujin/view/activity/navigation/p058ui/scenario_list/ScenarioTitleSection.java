package p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_list;

import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseHolder;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.scenario_list.ScenarioTitleSection */
public class ScenarioTitleSection extends SingleSection<ScenarioTitle, ViewHolder> {
    public int getLayoutId() {
        return R.layout.scenario_title_section;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view);
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, ScenarioTitle scenarioTitle, List<Object> list) {
        viewHolder.title.setText(scenarioTitle.getTitle());
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.scenario_list.ScenarioTitleSection$ViewHolder */
    public class ViewHolder extends BaseHolder {
        @BindView(2131363552)
        TextView title;

        public ViewHolder(View view) {
            super(view);
            this.title = (TextView) view.findViewById(R.id.text);
        }
    }
}
