package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.jakewharton.rxbinding2.widget.RxTextView;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.util.Validator;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.BackpressureStrategy;
import p046io.reactivex.Flowable;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.functions.Predicate;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.CreateMyCompanyFragment */
public class CreateMyCompanyFragment extends BaseFragment {
    public static final String ARG_CHANGE_MODE = "arg_mode_change";
    public static final String INN = "inn";
    public static final String OGRN = "ОГРН";
    public static final String TITLE = "title";
    private Button create;
    private TextInputEditText etINN;
    private TextInputEditText etOGRN;
    private TextInputEditText etTitle;
    private MyRentaCompanyViewModel myRentaCompanyViewModel;
    private TextInputLayout tilINN;
    private TextInputLayout tilOGRN;
    private TextInputLayout tilTitle;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_create_company;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    private CreateMyCompanyFragment() {
    }

    public static CreateMyCompanyFragment start(String str, String str2, String str3, boolean z) {
        CreateMyCompanyFragment createMyCompanyFragment = new CreateMyCompanyFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title", str);
        bundle.putString(OGRN, str2);
        bundle.putString(INN, str3);
        bundle.putBoolean(ARG_CHANGE_MODE, z);
        createMyCompanyFragment.setArguments(bundle);
        return createMyCompanyFragment;
    }

    public static CreateMyCompanyFragment start() {
        return start("", "", "", false);
    }

    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.etTitle = (TextInputEditText) inflate.findViewById(R.id.et_title);
        this.tilTitle = (TextInputLayout) inflate.findViewById(R.id.til_title);
        this.etINN = (TextInputEditText) inflate.findViewById(R.id.et_inn);
        this.etOGRN = (TextInputEditText) inflate.findViewById(R.id.et_ogrn);
        this.create = (Button) inflate.findViewById(R.id.button);
        this.f6913pb = (ProgressBar) inflate.findViewById(R.id.pb);
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.myRentaCompanyViewModel = (MyRentaCompanyViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(MyRentaCompanyViewModel.class);
        this.etTitle.setText(getArguments().getString("title", ""));
        this.etOGRN.setText(getArguments().getString(OGRN, ""));
        this.etINN.setText(getArguments().getString(INN, ""));
        this.create.setText(getString(getArguments().getBoolean(ARG_CHANGE_MODE) ? R.string.button_change : R.string.button_create));
        UIHelper.showKeyboard(getActivity());
        Flowable.combineLatest(RxTextView.textChanges(this.etTitle).filter($$Lambda$CreateMyCompanyFragment$iINxz6UFWlX6dc2ytjjfhBhpZgw.INSTANCE).filter(new Predicate() {
            public final boolean test(Object obj) {
                return CreateMyCompanyFragment.this.lambda$onViewCreated$1$CreateMyCompanyFragment((CharSequence) obj);
            }
        }).map($$Lambda$o0pFIlsUNXLvEOX1QJRnwdVBJFE.INSTANCE).toFlowable(BackpressureStrategy.BUFFER), RxTextView.textChanges(this.etOGRN).map($$Lambda$CreateMyCompanyFragment$YefoIAQ2ozjWSWO5jYIvGXJAc.INSTANCE).toFlowable(BackpressureStrategy.BUFFER), RxTextView.textChanges(this.etINN).map($$Lambda$CreateMyCompanyFragment$3lCTZEt02BLeES1bBHtjKJQPrs.INSTANCE).toFlowable(BackpressureStrategy.BUFFER), $$Lambda$4AvwTqeN5CrGECYRAjJmAovOVY.INSTANCE).subscribe(new Consumer() {
            public final void accept(Object obj) {
                CreateMyCompanyFragment.this.lambda$onViewCreated$4$CreateMyCompanyFragment((CreateCompanyModel) obj);
            }
        });
    }

    static /* synthetic */ boolean lambda$onViewCreated$0(CharSequence charSequence) throws Exception {
        return charSequence != null && charSequence.length() > 0;
    }

    public /* synthetic */ boolean lambda$onViewCreated$1$CreateMyCompanyFragment(CharSequence charSequence) throws Exception {
        return Validator.validate(this.etTitle, this.tilTitle, getString(R.string.label_required_filed));
    }

    static /* synthetic */ String lambda$onViewCreated$2(CharSequence charSequence) throws Exception {
        return charSequence == null ? "" : charSequence.toString();
    }

    static /* synthetic */ String lambda$onViewCreated$3(CharSequence charSequence) throws Exception {
        return charSequence == null ? "" : charSequence.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: createComapy */
    public void lambda$onViewCreated$4$CreateMyCompanyFragment(CreateCompanyModel createCompanyModel) {
        this.create.setEnabled(true);
        this.create.setOnClickListener(new View.OnClickListener(createCompanyModel) {
            private final /* synthetic */ CreateCompanyModel f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                CreateMyCompanyFragment.this.lambda$createComapy$5$CreateMyCompanyFragment(this.f$1, view);
            }
        });
    }

    public /* synthetic */ void lambda$createComapy$5$CreateMyCompanyFragment(CreateCompanyModel createCompanyModel, View view) {
        makeAction(createCompanyModel);
    }

    private void makeAction(CreateCompanyModel createCompanyModel) {
        if (createCompanyModel.isAllFieldCorrect()) {
            if (getArguments().getBoolean(ARG_CHANGE_MODE)) {
                this.myRentaCompanyViewModel.updateCompany(createCompanyModel);
            } else {
                this.myRentaCompanyViewModel.createCompany(createCompanyModel);
            }
            this.myRentaCompanyViewModel.getCompanyMutableLiveData().observe(this, new Observer() {
                public final void onChanged(Object obj) {
                    CreateMyCompanyFragment.this.showCreateUpdateResult((Resource) obj);
                }
            });
        } else {
            DialogHelper.showDialog((Context) getActivity(), getString(R.string.message_empty_field));
        }
        UIHelper.hideKeyboard(getActivity(), this.etTitle);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.CreateMyCompanyFragment$1 */
    static /* synthetic */ class C58761 {
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
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.CreateMyCompanyFragment.C58761.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void showCreateUpdateResult(Resource<CompanyListUno> resource) {
        if (resource != null) {
            int i = C58761.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6913pb.setVisibility(4);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            } else if (i == 2) {
                this.f6913pb.setVisibility(0);
            } else if (i == 3) {
                this.f6913pb.setVisibility(4);
                if (!getArguments().getBoolean(ARG_CHANGE_MODE)) {
                    nextFragment(MyRentaCompanyDetailFragment.start(), true);
                } else {
                    popFragment();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().hideBottomNavigation();
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getString(R.string.label_new_company));
    }
}
