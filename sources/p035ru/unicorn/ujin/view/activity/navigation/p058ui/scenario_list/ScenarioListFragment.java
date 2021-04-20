package p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_list;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import java.util.List;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.MainSmartViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.ScenarioSettingsFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.ScenarioViewModel;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.scenario_list.ScenarioListFragment */
public class ScenarioListFragment extends BaseFragment {
    private static final String ARG_SCEBARIO_TITLE = "arg_scenario_name";
    private static final String ARG_SCENARIO_ID = "arg_scenario_id";
    private SectionedAdapter adapter;
    MainSmartViewModel mainSmartViewModel;
    @BindView(2131363322)
    RecyclerView recyclerView;
    ScenarioViewModel scenarioViewModel;
    private ScenarioListSection secondList;
    private ScenarioTitleSection titleOne;
    private ScenarioTitleSection titleTwo;
    private ScenarioListSection unoList;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.scenario_settings_fragment;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.recyclerView = (RecyclerView) inflate.findViewById(R.id.rv);
        return inflate;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        if (this.adapter == null) {
            this.adapter = new SectionedAdapter();
        }
        if (this.titleOne == null) {
            this.titleOne = new ScenarioTitleSection();
            this.adapter.addSection(this.titleOne);
        }
        if (this.unoList == null) {
            this.unoList = new ScenarioListSection();
            this.adapter.addSection(this.unoList);
            this.unoList.specialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    ScenarioListFragment.this.onScenarioClick((Scenario) obj);
                }
            });
        }
        if (this.titleTwo == null) {
            this.titleTwo = new ScenarioTitleSection();
            this.adapter.addSection(this.titleTwo);
        }
        if (this.secondList == null) {
            this.secondList = new ScenarioListSection();
            this.adapter.addSection(this.secondList);
            this.secondList.specialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    ScenarioListFragment.this.onScenarioClick((Scenario) obj);
                }
            });
        }
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getActivity(), 1);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.recyclerView.addItemDecoration(dividerItemDecoration);
        this.recyclerView.setAdapter(this.adapter);
        this.mainSmartViewModel = (MainSmartViewModel) ViewModelProviders.m10of((Fragment) this).get(MainSmartViewModel.class);
        this.mainSmartViewModel.getScenario();
        this.mainSmartViewModel.getScenarioMutableData().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                ScenarioListFragment.this.showScenarioData((List) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public void onScenarioClick(Scenario scenario) {
        nextFragment(ScenarioSettingsFragment.start(scenario.getId().intValue(), scenario.getName()), false);
    }

    /* access modifiers changed from: private */
    public void showScenarioData(List<Scenario> list) {
        this.titleOne.setData(new ScenarioTitle(getString(R.string.scenario_first_title)));
        this.unoList.setData(Scenario.getData(list, "0"));
        this.titleTwo.setData(new ScenarioTitle(getString(R.string.scenario_second_title)));
        this.secondList.setData(Scenario.getData(list, "1"));
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setTextTitle(getString(R.string.label_scenario_settings));
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
    }
}
