package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.DomofonPrikamyaFragment */
public class DomofonPrikamyaFragment extends BaseFragment {
    private AgreementSection agreementSection;
    private ButtonSection buttonSection;
    private DomofonPrikamyaViewModel domofonPrikamyaViewModel;
    private FilesSection filesSection;

    /* renamed from: pb */
    private ProgressBar f6767pb;

    /* renamed from: rv */
    private RecyclerView f6768rv;
    private SectionedAdapter sectionedAdapter;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_domofon_prokamya;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    public static DomofonPrikamyaFragment start() {
        DomofonPrikamyaFragment domofonPrikamyaFragment = new DomofonPrikamyaFragment();
        domofonPrikamyaFragment.setArguments(new Bundle());
        return domofonPrikamyaFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.f6768rv = (RecyclerView) inflate.findViewById(R.id.rv);
        this.f6767pb = (ProgressBar) inflate.findViewById(R.id.pb);
        return inflate;
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.DomofonPrikamyaFragment$1 */
    static /* synthetic */ class C58251 {
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
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.LOADING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x001f }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.SUCCESS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x002a }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.ERROR     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.DomofonPrikamyaFragment.C58251.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void onGetServiceList(Resource<List<ServiceData>> resource) {
        if (resource != null) {
            int i = C58251.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            boolean z = true;
            if (i == 1) {
                this.f6767pb.setVisibility(0);
            } else if (i == 2) {
                this.f6767pb.setVisibility(8);
                ServiceData serviceData = (ServiceData) resource.getData().get(0);
                this.filesSection.setData(serviceData.getFiles());
                this.agreementSection.setData(serviceData);
                ButtonProps buttonProps = new ButtonProps();
                serviceData.getStatus().getValue().toLowerCase().equals("cancel");
                if (!serviceData.isAgree() || !serviceData.getStatus().getValue().toLowerCase().equals("cancel")) {
                    z = false;
                }
                buttonProps.setEnable(z);
                this.buttonSection.setData(buttonProps);
            } else if (i == 3) {
                DialogHelper.showDialog(getContext(), resource.getMessage());
                this.f6767pb.setVisibility(8);
            }
        }
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        initAdapter();
        this.domofonPrikamyaViewModel = (DomofonPrikamyaViewModel) ViewModelProviders.m10of((Fragment) this).get(DomofonPrikamyaViewModel.class);
        this.domofonPrikamyaViewModel.getServiceDataMutableLiveData().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                DomofonPrikamyaFragment.this.onGetServiceList((Resource) obj);
            }
        });
    }

    private void initAdapter() {
        this.f6768rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.sectionedAdapter = new SectionedAdapter();
        this.f6768rv.setAdapter(this.sectionedAdapter);
        if (this.buttonSection == null) {
            this.buttonSection = new ButtonSection();
            this.buttonSection.getSpecialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    DomofonPrikamyaFragment.this.lambda$initAdapter$0$DomofonPrikamyaFragment((ButtonProps) obj);
                }
            });
        }
        if (this.agreementSection == null) {
            this.agreementSection = new AgreementSection();
            this.agreementSection.getSpecialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    DomofonPrikamyaFragment.this.onAgree((ServiceData) obj);
                }
            });
        }
        if (this.filesSection == null) {
            this.filesSection = new FilesSection();
        }
        this.sectionedAdapter.addSection(this.filesSection);
        this.sectionedAdapter.addSection(this.agreementSection);
        this.sectionedAdapter.addSection(this.buttonSection);
    }

    public /* synthetic */ void lambda$initAdapter$0$DomofonPrikamyaFragment(ButtonProps buttonProps) throws Exception {
        onButtonClick();
    }

    /* access modifiers changed from: private */
    public void onAgree(ServiceData serviceData) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(serviceData);
        this.domofonPrikamyaViewModel.getServiceDataMutableLiveData().setValue(Resource.success(0, "", arrayList));
        ButtonProps buttonProps = (ButtonProps) this.buttonSection.getData();
        buttonProps.setEnable(serviceData.isAgree());
        this.buttonSection.setData(buttonProps);
        this.buttonSection.notifySectionChanged();
    }

    private void onButtonClick() {
        nextFragment(DomofonConnectionTicketFragment.start(), false);
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getString(R.string.label_domofon_access));
    }
}
