package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Intercom;
import p035ru.unicorn.ujin.data.realm.IntercomVal;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rooms.TitleSection;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServiceListFragment */
public class DomServiceListFragment extends BaseFragment {
    public static final String ARG_TITLE = "arg_title";
    public static final String ARG_TYPE = "arg_type";
    private DomServiceListSection domServiceListSection;
    private DomServiceViewModel domServiceViewModel;

    /* renamed from: rv */
    private RecyclerView f6773rv;
    private SectionedAdapter sectionedAdapter;
    private TitleSection titleSection;
    private DomServiceViewmodelFactory viewModelFactory;

    private void initData(List<IntercomVal> list) {
    }

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_dom_service;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    public static DomServiceListFragment start(String str, String str2) {
        DomServiceListFragment domServiceListFragment = new DomServiceListFragment();
        Bundle bundle = new Bundle();
        bundle.putString("arg_type", str);
        bundle.putString("arg_title", str2);
        domServiceListFragment.setArguments(bundle);
        return domServiceListFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.f6773rv = (RecyclerView) inflate.findViewById(R.id.rv);
        initAdapter();
        return inflate;
    }

    private void initAdapter() {
        this.sectionedAdapter = new SectionedAdapter();
        this.f6773rv.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f6773rv.setAdapter(this.sectionedAdapter);
        if (this.titleSection == null) {
            this.titleSection = new TitleSection();
            this.titleSection.setData(new SomeString(getString(R.string.label_tarif)));
        }
        if (this.domServiceListSection == null) {
            this.domServiceListSection = new DomServiceListSection();
            this.domServiceListSection.setDetailType(false);
            this.domServiceListSection.getSpecialClick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    DomServiceListFragment.this.lambda$initAdapter$0$DomServiceListFragment((DomServiceTariff) obj);
                }
            });
        }
        this.sectionedAdapter.addSection(this.titleSection);
        this.sectionedAdapter.addSection(this.domServiceListSection);
    }

    /* access modifiers changed from: private */
    /* renamed from: makeAction */
    public void lambda$initAdapter$0$DomServiceListFragment(DomServiceTariff domServiceTariff) {
        this.domServiceViewModel.getTariffMutableData().setValue(domServiceTariff);
        nextFragment(new DomServiceFragment(), false);
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.viewModelFactory = DomServiceViewmodelFactory.getInstance();
        this.domServiceViewModel = (DomServiceViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) this.viewModelFactory).get(DomServiceViewModel.class);
        this.domServiceViewModel.getServices(getArguments().getString("arg_type"));
        this.domServiceViewModel.getDomServiceListMutableData().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                DomServiceListFragment.this.showData((Resource) obj);
            }
        });
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServiceListFragment$1 */
    static /* synthetic */ class C58291 {
        static final /* synthetic */ int[] $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status = new int[Resource.Status.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                ru.unicorn.ujin.data.realm.Resource$Status[] r0 = p035ru.unicorn.ujin.data.realm.Resource.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status = r0
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x0014 }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x001f }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.ERROR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x002a }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.LOADING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice.DomServiceListFragment.C58291.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void showData(Resource<List<DomServiceTariff>> resource) {
        if (resource != null) {
            int i = C58291.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.domServiceListSection.setData(resource.getData());
            } else if (i == 2) {
                DialogHelper.showDialog(getContext(), "Ошибка загрузки");
            }
        }
    }

    public void onResume() {
        super.onResume();
    }

    private void showVideo(Resource<Intercom> resource) {
        if (resource == null) {
            return;
        }
        if (C58291.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()] == 1) {
            List<IntercomVal> intercom = resource.getData().getIntercom();
            if (intercom != null && !intercom.isEmpty()) {
                initData(intercom);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().removeToolbarElevation();
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getArguments().getString("arg_title"));
    }
}
