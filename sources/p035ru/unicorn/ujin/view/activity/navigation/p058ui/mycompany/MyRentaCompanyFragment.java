package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.KeyValueSection;
import p035ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueData;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ButtonProps;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ButtonSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.CreatePassCompanyFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.SearchCompanyFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rooms.TitleSection;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.MyRentaCompanyFragment */
public class MyRentaCompanyFragment extends BaseSectionFragment<MyRentaCompanyViewModel> {
    private ButtonSection buttonSection;
    private ButtonSection connectToSection;
    private KeyValueSection organisationInfoSection;
    private TitleSection titleSection;

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        return "Мои компании";
    }

    /* access modifiers changed from: protected */
    public void initSections() {
        if (this.organisationInfoSection == null) {
            this.organisationInfoSection = new KeyValueSection();
            this.organisationInfoSection.specialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    MyRentaCompanyFragment.this.lambda$initSections$0$MyRentaCompanyFragment((IKeyValueData) obj);
                }
            });
        }
        if (this.buttonSection == null) {
            this.buttonSection = new ButtonSection();
            this.buttonSection.setData(new ButtonProps(getString(R.string.btn_add_company)));
            this.buttonSection.getSpecialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    MyRentaCompanyFragment.this.lambda$initSections$1$MyRentaCompanyFragment((ButtonProps) obj);
                }
            });
        }
        if (this.connectToSection == null) {
            this.connectToSection = new ButtonSection();
            this.connectToSection.setData(new ButtonProps(getString(R.string.btn_connect_to_company)));
            this.connectToSection.show(false);
            this.connectToSection.getSpecialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    MyRentaCompanyFragment.this.lambda$initSections$2$MyRentaCompanyFragment((ButtonProps) obj);
                }
            });
        }
        if (this.titleSection == null) {
            this.titleSection = new TitleSection(false, 14);
            this.titleSection.setCustomLayout(R.layout.title_section_custom_2);
        }
        this.sectionedAdapter.addSection(this.organisationInfoSection);
        this.sectionedAdapter.addSection(this.titleSection);
        this.sectionedAdapter.addSection(this.connectToSection);
        this.sectionedAdapter.addSection(this.buttonSection);
    }

    public /* synthetic */ void lambda$initSections$1$MyRentaCompanyFragment(ButtonProps buttonProps) throws Exception {
        onButtonCreateClick();
    }

    public /* synthetic */ void lambda$initSections$2$MyRentaCompanyFragment(ButtonProps buttonProps) throws Exception {
        onConnectToClick();
    }

    private void onConnectToClick() {
        nextFragment(new SearchCompanyFragment(), false);
    }

    public void onViewCreated(MyRentaCompanyViewModel myRentaCompanyViewModel) {
        myRentaCompanyViewModel.getCompanyList();
        myRentaCompanyViewModel.getListCompanyMutableLiveData().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                MyRentaCompanyFragment.this.showData((Resource) obj);
            }
        });
    }

    private void onButtonCreateClick() {
        nextFragment(new CreatePassCompanyFragment(), false);
    }

    /* access modifiers changed from: private */
    /* renamed from: onClick */
    public void lambda$initSections$0$MyRentaCompanyFragment(IKeyValueData iKeyValueData) {
        getViewModell().getCurrentCompanyIdMutableLiveData().setValue(iKeyValueData.getDataId());
        nextFragment(MyRentaCompanyDetailFragment.start(), false);
    }

    public MyRentaCompanyViewModel getViewModell() {
        return (MyRentaCompanyViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(MyRentaCompanyViewModel.class);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.MyRentaCompanyFragment$1 */
    static /* synthetic */ class C58801 {
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
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.ERROR     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x001f }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.LOADING     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x002a }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.SUCCESS     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.MyRentaCompanyFragment.C58801.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void showData(Resource<List<RentCompany>> resource) {
        if (resource != null) {
            int i = C58801.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6913pb.setVisibility(4);
            } else if (i == 2) {
                this.f6913pb.setVisibility(0);
            } else if (i == 3) {
                this.f6913pb.setVisibility(4);
                List data = resource.getData();
                if (data == null || data.isEmpty()) {
                    this.titleSection.show(true);
                    this.titleSection.setData(new SomeString(getString(R.string.label_not_yet_company)));
                    return;
                }
                this.titleSection.show(false);
                this.organisationInfoSection.setValues(RentCompany.setValues());
                this.organisationInfoSection.setData(RentCompany.m6927to((List<RentCompany>) data));
            }
        }
    }
}
