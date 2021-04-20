package p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;
import p046io.realm.RealmList;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.ScenarioSettingsFragment */
public class ScenarioSettingsFragment extends BaseFragment {
    private static final String ARG_SCEBARIO_TITLE = "arg_scenario_name";
    private static final String ARG_SCENARIO_ID = "arg_scenario_id";
    private ScenarioSettingsAdapter adapter;
    private RecyclerView recyclerView;
    private ScenarioViewModel scenarioViewModel;

    private void onUpdateState(Void voidR) {
    }

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.scenario_settings_fragment;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    public static ScenarioSettingsFragment start(int i, String str) {
        ScenarioSettingsFragment scenarioSettingsFragment = new ScenarioSettingsFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SCENARIO_ID, i);
        bundle.putString(ARG_SCEBARIO_TITLE, str);
        scenarioSettingsFragment.setArguments(bundle);
        return scenarioSettingsFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.recyclerView = (RecyclerView) inflate.findViewById(R.id.rv);
        return inflate;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        int i = getArguments().getInt(ARG_SCENARIO_ID);
        this.adapter = new ScenarioSettingsAdapter();
        this.disposable.add(this.adapter.getOptionClicks().subscribe(new Consumer() {
            public final void accept(Object obj) {
                ScenarioSettingsFragment.this.lambda$onViewCreated$0$ScenarioSettingsFragment((Options) obj);
            }
        }));
        this.recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.recyclerView.setAdapter(this.adapter);
        this.scenarioViewModel = (ScenarioViewModel) ViewModelProviders.m10of((Fragment) this).get(ScenarioViewModel.class);
        this.scenarioViewModel.getOptions(i).observe(this, new Observer() {
            public final void onChanged(Object obj) {
                ScenarioSettingsFragment.this.onGetOptions((RealmList) obj);
            }
        });
        this.scenarioViewModel.getSingleLiveEvent().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                ScenarioSettingsFragment.this.onUpdateState((Resource<Void>) (Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onViewCreated$0$ScenarioSettingsFragment(Options options) throws Exception {
        this.scenarioViewModel.saveState(options);
    }

    /* access modifiers changed from: private */
    public void onUpdateState(Resource<Void> resource) {
        resource.getStatus().equals(Resource.Status.ERROR);
    }

    /* access modifiers changed from: private */
    public void onGetOptions(List<Options> list) {
        list.add(0, new Options(getString(R.string.label_settings)));
        this.adapter.setData(list);
        this.adapter.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setTextTitle(getArguments().getString(ARG_SCEBARIO_TITLE));
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
    }
}
