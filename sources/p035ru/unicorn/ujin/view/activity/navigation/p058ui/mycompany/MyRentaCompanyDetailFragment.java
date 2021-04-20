package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.KeyValueSection;
import p035ru.unicorn.ujin.view.activity.navigation.entity.KolyaSuccesModel;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ButtonProps;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ButtonSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ChooseSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.EmptySection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.AddEmployerDialogFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.response.CompanyObject;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentPermissions;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.CreateUserCompany;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team.TeamMapper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rooms.TitleSection;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.employee.EmployeeListFragment;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.MyRentaCompanyDetailFragment */
public class MyRentaCompanyDetailFragment extends BaseSectionFragment<MyRentaCompanyViewModel> implements AddEmployerDialogFragment.OnAddPersonClick {
    private AddEmployerDialogFragment addEmployerDialogFragment;
    private View bottomSheet;
    private BottomSheetBehavior bottomSheetBehavior;
    /* access modifiers changed from: private */
    public ButtonSection buttonSection;
    private ChooseSection chooseEmployeeSection;
    private ChooseSection chooseRentObjectSection;
    boolean isAbleToManage = false;
    private KeyValueSection organisationInfoSection;
    /* access modifiers changed from: private */
    public ButtonSection refreshSection;
    private ButtonSection removeSection;
    /* access modifiers changed from: private */
    public RentCompany rentCompany;
    private TitleSection titleSection;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_section_base_with_bottom_sheet;
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        return null;
    }

    public static MyRentaCompanyDetailFragment start() {
        MyRentaCompanyDetailFragment myRentaCompanyDetailFragment = new MyRentaCompanyDetailFragment();
        myRentaCompanyDetailFragment.setArguments(new Bundle());
        return myRentaCompanyDetailFragment;
    }

    public void onCreateView(View view) {
        initBottomSheet(view);
    }

    private void initBottomSheet(View view) {
        this.bottomSheet = view.findViewById(R.id.bottom_sheet_company);
        initButtonsSheet(this.bottomSheet);
        this.bottomSheetBehavior = BottomSheetBehavior.from(this.bottomSheet);
        this.bottomSheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            public void onSlide(View view, float f) {
            }

            public void onStateChanged(View view, int i) {
                if (4 == i) {
                    MyRentaCompanyDetailFragment.this.refreshSection.show(true);
                    if (MyRentaCompanyDetailFragment.this.rentCompany.getUserProfiles() != null) {
                        for (UserProfile next : MyRentaCompanyDetailFragment.this.rentCompany.getUserProfiles()) {
                            if (next.getMe() != null && next.getMe().booleanValue()) {
                                Iterator<RentPermissions> it = next.getPermissions().iterator();
                                while (it.hasNext()) {
                                    RentPermissions next2 = it.next();
                                    if (next2.getPermissionKey().equals(RentPermissions.MANAGE_EMPLOYEES) && next2.isValue()) {
                                        MyRentaCompanyDetailFragment.this.isAbleToManage = true;
                                    }
                                }
                            }
                        }
                    }
                    if (MyRentaCompanyDetailFragment.this.rentCompany.isEmployeeVerified() && MyRentaCompanyDetailFragment.this.isAbleToManage) {
                        MyRentaCompanyDetailFragment.this.buttonSection.show(true);
                    }
                }
            }
        });
    }

    private void initButtonsSheet(View view) {
        view.findViewById(R.id.delete).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                MyRentaCompanyDetailFragment.this.lambda$initButtonsSheet$0$MyRentaCompanyDetailFragment(view);
            }
        });
        view.findViewById(R.id.cancel).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                MyRentaCompanyDetailFragment.this.lambda$initButtonsSheet$1$MyRentaCompanyDetailFragment(view);
            }
        });
    }

    public /* synthetic */ void lambda$initButtonsSheet$0$MyRentaCompanyDetailFragment(View view) {
        showDeleteDialog();
    }

    public /* synthetic */ void lambda$initButtonsSheet$1$MyRentaCompanyDetailFragment(View view) {
        showBottomSheet();
    }

    private void onCreateClick() {
        nextFragment(CreateMyCompanyFragment.start(), false);
    }

    private void editCompany() {
        RentCompany value = getViewModell().getCurrentCompanyMutableLiveData().getValue();
        nextFragment(CreateMyCompanyFragment.start(value.getTitle(), value.getOgrn(), value.getInn(), true), false);
    }

    private void showDeleteDialog() {
        DialogHelper.showDialog(getActivity(), getString(R.string.dialog_delete_company), R.string.button_delete, R.string.button_cancel, new DialogHelper.OnButtonDialogClick() {
            public void onNegativeClick() {
            }

            public void onPositiveClick() {
                MyRentaCompanyDetailFragment.this.getViewModell().deleteCompany();
                MyRentaCompanyDetailFragment.this.getViewModell().isSuccesDeleteCompany().observe(MyRentaCompanyDetailFragment.this.getViewLifecycleOwner(), new Observer() {
                    public final void onChanged(Object obj) {
                        MyRentaCompanyDetailFragment.this.showDeleteResult((Resource) obj);
                    }
                });
            }
        });
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.MyRentaCompanyDetailFragment$3 */
    static /* synthetic */ class C58793 {
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
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.LOADING     // Catch:{ NoSuchFieldError -> 0x001f }
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
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.MyRentaCompanyDetailFragment.C58793.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void showDeleteResult(Resource<KolyaSuccesModel> resource) {
        if (resource != null) {
            int i = C58793.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6913pb.setVisibility(4);
                if (resource.getData().isSuccess()) {
                    getBaseActivity().onBackPressed();
                } else {
                    DialogHelper.showDialog((Context) getActivity(), "Что-то пошло не так");
                }
            } else if (i == 2) {
                this.f6913pb.setVisibility(0);
            } else if (i == 3) {
                this.f6913pb.setVisibility(4);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void initSections() {
        if (this.organisationInfoSection == null) {
            this.organisationInfoSection = new KeyValueSection();
        }
        if (this.buttonSection == null) {
            this.buttonSection = new ButtonSection();
            this.buttonSection.setData(new ButtonProps(getString(R.string.btn_add_employer)));
            this.buttonSection.getSpecialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    MyRentaCompanyDetailFragment.this.lambda$initSections$2$MyRentaCompanyDetailFragment((ButtonProps) obj);
                }
            });
            this.buttonSection.show(false);
        }
        if (this.refreshSection == null) {
            this.refreshSection = new ButtonSection();
            this.refreshSection.setData(new ButtonProps(getString(R.string.myRentaCompanyRefreshStatus)));
            this.refreshSection.getSpecialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    MyRentaCompanyDetailFragment.this.lambda$initSections$3$MyRentaCompanyDetailFragment((ButtonProps) obj);
                }
            });
            this.refreshSection.show(false);
        }
        if (this.removeSection == null) {
            this.removeSection = new ButtonSection();
            this.removeSection.setData(new ButtonProps(getString(R.string.button_delete_company), DynamicBackgroundButton.Type.OUTLINED));
            this.removeSection.getSpecialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    MyRentaCompanyDetailFragment.this.lambda$initSections$4$MyRentaCompanyDetailFragment((ButtonProps) obj);
                }
            });
            this.removeSection.show(false);
        }
        if (this.chooseEmployeeSection == null) {
            this.chooseEmployeeSection = new ChooseSection();
            this.chooseEmployeeSection.setHideTitle(true);
            this.chooseEmployeeSection.getOnCkick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    MyRentaCompanyDetailFragment.this.showEmployeeList((SomeString) obj);
                }
            });
        }
        if (this.chooseRentObjectSection == null) {
            this.chooseRentObjectSection = new ChooseSection();
            this.chooseRentObjectSection.setHideTitle(true);
            this.chooseRentObjectSection.getOnCkick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    MyRentaCompanyDetailFragment.this.showRentObjectsList((SomeString) obj);
                }
            });
        }
        EmptySection emptySection = new EmptySection(false, 1);
        emptySection.setData(new SomeString(" "));
        this.sectionedAdapter.addSection(this.organisationInfoSection);
        this.sectionedAdapter.addSection(this.chooseEmployeeSection);
        this.sectionedAdapter.addSection(this.chooseRentObjectSection);
        this.sectionedAdapter.addSection(this.refreshSection);
        this.sectionedAdapter.addSection(emptySection);
        this.sectionedAdapter.addSection(this.buttonSection);
        this.sectionedAdapter.addSection(this.removeSection);
    }

    public /* synthetic */ void lambda$initSections$2$MyRentaCompanyDetailFragment(ButtonProps buttonProps) throws Exception {
        onAddEmploerClick();
    }

    public /* synthetic */ void lambda$initSections$3$MyRentaCompanyDetailFragment(ButtonProps buttonProps) throws Exception {
        refreshClick();
    }

    public /* synthetic */ void lambda$initSections$4$MyRentaCompanyDetailFragment(ButtonProps buttonProps) throws Exception {
        onRemoveCompanyClick();
    }

    /* access modifiers changed from: private */
    public void showEmployeeList(SomeString someString) {
        nextFragment(EmployeeListFragment.Companion.newInstance(EmployeeListFragment.COMPANY_EMPLOYEES), false);
    }

    /* access modifiers changed from: private */
    public void showRentObjectsList(SomeString someString) {
        ((MyRentaCompanyViewModel) this.viewModell).getUsersCompanyMutableLiveData().setValue(this.rentCompany.getUserProfiles());
        nextFragment(new CompanyObjectListFragment(), false);
    }

    private void refreshClick() {
        this.f6913pb.setVisibility(0);
        ((MyRentaCompanyViewModel) this.viewModell).loadCurrentCompany();
    }

    private void showDetail(TeamMapper teamMapper) {
        nextFragment(MyTeamPersonDetailFragment.start(teamMapper.getId()), false);
    }

    private void onAddEmploerClick() {
        this.addEmployerDialogFragment = new AddEmployerDialogFragment(this);
        this.addEmployerDialogFragment.show(getFragmentManager(), "");
    }

    private void onRemoveCompanyClick() {
        showDeleteDialog();
    }

    public MyRentaCompanyViewModel getViewModell() {
        return (MyRentaCompanyViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(MyRentaCompanyViewModel.class);
    }

    public void onViewCreated(MyRentaCompanyViewModel myRentaCompanyViewModel) {
        this.f6913pb.setVisibility(0);
        myRentaCompanyViewModel.getCurrentCompanyMutableLiveData().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                MyRentaCompanyDetailFragment.this.showCompany((RentCompany) obj);
            }
        });
        myRentaCompanyViewModel.getCompanyById();
        myRentaCompanyViewModel.getCompanyObjectsMutableLiveData().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                MyRentaCompanyDetailFragment.this.showCompanyObjects((List) obj);
            }
        });
        myRentaCompanyViewModel.getEnterpriseCompanyObjects();
    }

    private void showUsers(List<UserProfile> list) {
        RentCompany rentCompany2 = this.rentCompany;
        if (rentCompany2 != null) {
            if (rentCompany2.isVerified()) {
                if (list != null) {
                    this.chooseEmployeeSection.setData(new SomeString(getResources().getString(R.string.label_employers, new Object[]{Integer.valueOf(list.size())})));
                } else {
                    this.chooseEmployeeSection.setData(new SomeString(getResources().getString(R.string.label_employers, new Object[]{0})));
                }
                this.refreshSection.show(false);
                UserProfile userProfile = null;
                if (list != null) {
                    for (UserProfile next : list) {
                        if (next.getMe() != null && next.getMe().booleanValue()) {
                            userProfile = next;
                        }
                    }
                }
                if (userProfile != null && userProfile.getPermissions() != null) {
                    Iterator<RentPermissions> it = userProfile.getPermissions().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        RentPermissions next2 = it.next();
                        if (next2.getPermissionKey().equals(RentPermissions.MANAGE_EMPLOYEES) && next2.isValue()) {
                            this.isAbleToManage = true;
                            break;
                        }
                    }
                }
                if (userProfile != null && userProfile.isVerified() != null && userProfile.isVerified().booleanValue() && this.isAbleToManage) {
                    this.buttonSection.show(true);
                    return;
                }
                return;
            }
            this.refreshSection.show(true);
            this.buttonSection.show(false);
            new AlertDialog.Builder(getBaseActivity()).setTitle((CharSequence) "Документы загружены").setMessage((CharSequence) "Компания на верификации.\n\nПосле проверки документов\nвы сможете управлять\nкомпанией и добавить\nсотрудников.").setPositiveButton((int) R.string.ok, (DialogInterface.OnClickListener) C5871x22c5f4c6.INSTANCE).show();
        }
    }

    /* access modifiers changed from: private */
    public void showCompany(RentCompany rentCompany2) {
        if (((MyRentaCompanyViewModel) this.viewModell).companyLoaded && ((MyRentaCompanyViewModel) this.viewModell).companyObjectsLoaded) {
            this.f6913pb.setVisibility(8);
            showCompany();
            showCompanyObjects();
        }
    }

    private void showCompany() {
        this.rentCompany = ((MyRentaCompanyViewModel) this.viewModell).getCurrentCompanyMutableLiveData().getValue();
        if (this.rentCompany != null) {
            this.bottomSheet.findViewById(R.id.delete).setVisibility(!this.rentCompany.isDirector() ? 8 : 0);
            this.organisationInfoSection.setData(RentCompany.m6928to(this.rentCompany));
            this.removeSection.show(this.rentCompany.isDirector());
            showUsers(this.rentCompany.getUserProfiles());
        }
    }

    /* access modifiers changed from: private */
    public void showCompanyObjects(List<CompanyObject> list) {
        if (((MyRentaCompanyViewModel) this.viewModell).companyLoaded && ((MyRentaCompanyViewModel) this.viewModell).companyObjectsLoaded) {
            this.f6913pb.setVisibility(8);
            showCompany();
            showCompanyObjects();
        }
    }

    private void showCompanyObjects() {
        List value = ((MyRentaCompanyViewModel) this.viewModell).getCompanyObjectsMutableLiveData().getValue();
        if (value == null || value.isEmpty()) {
            this.chooseRentObjectSection.setData(new SomeString(getResources().getString(R.string.label_company_objects, new Object[]{0})));
            return;
        }
        this.chooseRentObjectSection.setData(new SomeString(getResources().getString(R.string.label_company_objects, new Object[]{Integer.valueOf(value.size())})));
    }

    private ArrayList<View> getParams() {
        ArrayList<View> arrayList = new ArrayList<>();
        ImageView imageView = new ImageView(getActivity());
        imageView.setImageResource(R.drawable.ic_svg_points);
        arrayList.add(imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                MyRentaCompanyDetailFragment.this.lambda$getParams$6$MyRentaCompanyDetailFragment(view);
            }
        });
        return arrayList;
    }

    public /* synthetic */ void lambda$getParams$6$MyRentaCompanyDetailFragment(View view) {
        showBottomSheet();
    }

    private void showBottomSheet() {
        int i = 3;
        boolean z = true;
        boolean z2 = this.bottomSheetBehavior.getState() == 3;
        BottomSheetBehavior bottomSheetBehavior2 = this.bottomSheetBehavior;
        if (z2) {
            i = 4;
        }
        bottomSheetBehavior2.setState(i);
        this.buttonSection.show(z2 && this.rentCompany.isEmployeeVerified() && this.isAbleToManage);
        ButtonSection buttonSection2 = this.refreshSection;
        if (!z2 || this.rentCompany.isVerified()) {
            z = false;
        }
        buttonSection2.show(z);
    }

    public void onPause() {
        super.onPause();
        this.bottomSheetBehavior.setState(4);
    }

    public void onAddPersonCLick(CreateUserCompany createUserCompany) {
        this.addEmployerDialogFragment.dismiss();
        getViewModell().addPerson(createUserCompany.getTel(), createUserCompany.getPos(), createUserCompany.getName(), createUserCompany.getSurname(), createUserCompany.getPatronymic());
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        super.showToolbar();
        getBaseActivity().setTextTitle(getString(R.string.label_my_company));
    }
}
