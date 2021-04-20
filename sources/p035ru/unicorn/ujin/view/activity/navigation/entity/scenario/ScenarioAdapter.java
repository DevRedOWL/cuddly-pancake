package p035ru.unicorn.ujin.view.activity.navigation.entity.scenario;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import com.squareup.picasso.Picasso;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseHolder;
import p035ru.unicorn.ujin.view.activity.navigation.helper.SimpleHelper;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.scenario.ScenarioAdapter */
public class ScenarioAdapter extends BaseAdapter<Scenario, ScenarioHolder> {
    public static final int GRID_TYPE = 0;
    public static final int SCENARIO_STATE_ACTIVATE = 1;
    public static final int SCENARIO_STATE_DISACTIVATE = 0;
    OnScenarioClick onScenarioClick;

    public Scenario getItemById(String str) {
        return null;
    }

    public ScenarioAdapter(OnScenarioClick onScenarioClick2) {
        this.onScenarioClick = onScenarioClick2;
    }

    /* access modifiers changed from: protected */
    public ScenarioHolder getViewHolder(View view, int i, int i2) {
        return new ScenarioHolder(LayoutInflater.from(view.getContext()).inflate(i == 0 ? R.layout.item_scenario : R.layout.item_scenario_wrap, (ViewGroup) view, false));
    }

    /* access modifiers changed from: protected */
    public void onBindViewHolder(ScenarioHolder scenarioHolder, Scenario scenario, int i, int i2) {
        if (getType() != 0) {
            scenarioHolder.itemView.getContext();
            scenarioHolder.cardView.getLayoutParams().width = Resources.getSystem().getDisplayMetrics().widthPixels / 3;
        }
        scenarioHolder.descr.setText(scenario.getName());
        boolean z = true;
        if (scenario.getState().getState().intValue() != 1) {
            z = false;
        }
        scenarioHolder.f6726cl.setBackgroundResource(z ? R.drawable.bg_stroke_active : R.drawable.bg_stroke_disactive);
        if (!scenario.getImg().equals("")) {
            Picasso.get().load("https://pro100.media/api/ihome/images/icons/icons8-heating-room-50_negative.png?r=8").placeholder((int) R.drawable.ic_image).error((int) R.drawable.ic_error_outline_svg).into(scenarioHolder.icon);
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.scenario.ScenarioAdapter$ScenarioHolder */
    public class ScenarioHolder extends BaseHolder implements View.OnClickListener, View.OnLongClickListener {
        @BindView(2131362180)
        CardView cardView;
        @BindView(2131362281)

        /* renamed from: cl */
        ConstraintLayout f6726cl;
        @BindView(2131363481)
        TextView descr;
        @BindView(2131362679)
        ImageView icon;

        public ScenarioHolder(View view) {
            super(view);
            view.setOnClickListener(this);
            view.setOnLongClickListener(this);
            view.setTag(this);
        }

        public void onClick(View view) {
            List data = ScenarioAdapter.this.getData();
            int adapterPosition = getAdapterPosition();
            Scenario scenario = (Scenario) ScenarioAdapter.this.getItem(adapterPosition);
            boolean z = true;
            if (!ScenarioAdapter.this.isModeSelected() || adapterPosition == -1) {
                if (!ScenarioAdapter.this.isModeSelected() && adapterPosition != -1) {
                    if (scenario.getState().getState().intValue() == 1) {
                        SimpleHelper.playTrack(scenario.getAudio().last(), view.getContext());
                        z = false;
                    } else {
                        SimpleHelper.playTrack(scenario.getAudio().first(), view.getContext());
                    }
                }
            } else if (scenario.getState().getState().intValue() == 0) {
                SimpleHelper.playTrack(scenario.getAudio().first(), view.getContext());
            }
            if (scenario != null) {
                ScenarioAdapter.this.onScenarioClick.onChangeScenario(scenario.getId().intValue(), data, z);
            }
        }

        public boolean onLongClick(View view) {
            int adapterPosition = getAdapterPosition();
            if (adapterPosition == -1) {
                return false;
            }
            Scenario scenario = (Scenario) ScenarioAdapter.this.getItem(adapterPosition);
            ScenarioAdapter.this.onScenarioClick.onSccenarioLongClick(scenario.getId().intValue(), scenario.getName());
            return true;
        }
    }
}
