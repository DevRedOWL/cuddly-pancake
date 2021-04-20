package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.entity.KolyaSuccesModel;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ButtonProps;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ButtonSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ChooseSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.response.CompanyObject;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentPermissions;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.FullProfileMapper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.MyProfileSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rooms.TitleSection;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.MyTeamPersonDetailFragment */
public class MyTeamPersonDetailFragment extends BaseSectionFragment<MyRentaCompanyViewModel> {
    public static final String ARG_ID = "arg_id";
    public static final String ARG_MODE = "arg_mode";
    private boolean canManage;
    protected ChooseSection chooseRentSection;
    private String currentPropertyId;
    private ButtonSection deletePerson;
    private ButtonSection deletePlace;
    private ButtonSection goToChat;
    private boolean isDirector;
    private boolean isEditMode;
    private PermissionsSection permissionsSection;
    private MyProfileSection personSection;
    private String phone = "";
    private TitleSection titleSection;

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        return "";
    }

    public static MyTeamPersonDetailFragment start(Integer num) {
        return start(num, false);
    }

    private static MyTeamPersonDetailFragment start(Integer num, boolean z) {
        MyTeamPersonDetailFragment myTeamPersonDetailFragment = new MyTeamPersonDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("arg_id", num.intValue());
        bundle.putBoolean(ARG_MODE, z);
        myTeamPersonDetailFragment.setArguments(bundle);
        return myTeamPersonDetailFragment;
    }

    public void onCreateView(View view) {
        super.onCreateView(view);
        this.isEditMode = getArguments().getBoolean(ARG_MODE, false);
    }

    public void onViewCreated(MyRentaCompanyViewModel myRentaCompanyViewModel) {
        myRentaCompanyViewModel.getCurrentCompanyMutableLiveData().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                MyTeamPersonDetailFragment.this.showCompany((RentCompany) obj);
            }
        });
        myRentaCompanyViewModel.getUserById(getArguments().getInt("arg_id"));
        myRentaCompanyViewModel.getCurrentProfile().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                MyTeamPersonDetailFragment.this.showData((UserProfile) obj);
            }
        });
        showRes((CompanyObject) null);
    }

    /* access modifiers changed from: private */
    public void showCompany(RentCompany rentCompany) {
        this.isDirector = rentCompany.isDirector();
        this.permissionsSection.setIsDirector(this.isDirector);
    }

    /* access modifiers changed from: private */
    public void showData(UserProfile userProfile) {
        UserProfile userProfile2;
        this.personSection.setData(FullProfileMapper.mapTo(userProfile, false));
        this.phone = userProfile.getUserdata().getPhone();
        List<UserProfile> value = ((MyRentaCompanyViewModel) this.viewModell).getUsersCompanyMutableLiveData().getValue();
        this.permissionsSection.setIsMe(false);
        String str = null;
        if (value == null || value.isEmpty()) {
            userProfile2 = null;
        } else {
            userProfile2 = null;
            for (UserProfile userProfile3 : value) {
                if (userProfile3.getMe() != null && userProfile3.getMe().booleanValue()) {
                    userProfile2 = userProfile3;
                }
            }
        }
        if (userProfile2 == null || userProfile2.getPosition() == null || userProfile2.getPosition().isDirector() == null) {
            this.permissionsSection.setIsDirector(false);
        } else {
            this.permissionsSection.setIsDirector(userProfile2.getPosition().isDirector().booleanValue());
        }
        this.permissionsSection.setIsMe(userProfile.getMe() == null ? false : userProfile.getMe().booleanValue());
        this.permissionsSection.setData(userProfile.getPermissions());
        if (userProfile2 != null && userProfile2.getPermissions() != null && !userProfile2.getPermissions().isEmpty()) {
            Iterator<RentPermissions> it = userProfile2.getPermissions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                RentPermissions next = it.next();
                if (next.getPermissionKey().equals(RentPermissions.MANAGE_EMPLOYEES) && next.isValue()) {
                    this.canManage = true;
                    break;
                }
            }
        }
        if (userProfile.getPropertyId() != null) {
            str = userProfile.getPropertyId().toString();
        }
        this.currentPropertyId = str;
        if (this.currentPropertyId != null) {
            if (((MyRentaCompanyViewModel) this.viewModell).getCompanyObjectsMutableLiveData().getValue() != null) {
                showMyRenta(((MyRentaCompanyViewModel) this.viewModell).getCompanyObjectsMutableLiveData().getValue());
            }
            this.deletePlace.show(this.canManage);
            this.chooseRentSection.show(true);
        } else {
            this.deletePlace.show(false);
            this.chooseRentSection.show(this.canManage);
        }
        this.deletePerson.show(this.canManage);
    }

    public MyRentaCompanyViewModel getViewModell() {
        return (MyRentaCompanyViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(MyRentaCompanyViewModel.class);
    }

    /* access modifiers changed from: protected */
    public void initSections() {
        if (this.personSection == null) {
            this.personSection = new MyProfileSection();
        }
        if (this.deletePerson == null) {
            this.deletePerson = new ButtonSection();
            this.deletePerson.setData(new ButtonProps(getString(R.string.label_delete_person)));
            this.deletePerson.getSpecialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    MyTeamPersonDetailFragment.this.lambda$initSections$0$MyTeamPersonDetailFragment((ButtonProps) obj);
                }
            });
        }
        if (this.deletePlace == null) {
            this.deletePlace = new ButtonSection();
            this.deletePlace.setData(new ButtonProps(getString(R.string.label_delete_place)));
            this.deletePlace.getSpecialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    MyTeamPersonDetailFragment.this.lambda$initSections$1$MyTeamPersonDetailFragment((ButtonProps) obj);
                }
            });
        }
        if (this.permissionsSection == null) {
            this.permissionsSection = new PermissionsSection();
            this.permissionsSection.getKeysPermishions().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    MyTeamPersonDetailFragment.this.lambda$initSections$2$MyTeamPersonDetailFragment((List) obj);
                }
            });
        }
        if (this.titleSection == null) {
            this.titleSection = new TitleSection();
            this.titleSection.setData(new SomeString("Права"));
        }
        if (this.chooseRentSection == null) {
            this.chooseRentSection = new ChooseSection();
            this.chooseRentSection.getOnCkick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    MyTeamPersonDetailFragment.this.chooseRent((SomeString) obj);
                }
            });
        }
        this.sectionedAdapter.addSection(this.personSection);
        this.sectionedAdapter.addSection(this.chooseRentSection);
        this.sectionedAdapter.addSection(this.deletePlace);
        this.sectionedAdapter.addSection(this.titleSection);
        this.sectionedAdapter.addSection(this.permissionsSection);
        this.sectionedAdapter.addSection(this.deletePerson);
    }

    public /* synthetic */ void lambda$initSections$0$MyTeamPersonDetailFragment(ButtonProps buttonProps) throws Exception {
        deletePerson();
    }

    public /* synthetic */ void lambda$initSections$1$MyTeamPersonDetailFragment(ButtonProps buttonProps) throws Exception {
        deletePlace();
    }

    /* access modifiers changed from: private */
    /* renamed from: onPermissionChage */
    public void lambda$initSections$2$MyTeamPersonDetailFragment(List<String> list) {
        getViewModell().changePermissioms(list);
    }

    private void deletePerson() {
        getViewModell().deletePerson();
        getViewModell().getIsSuccesDeletePerson().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                MyTeamPersonDetailFragment.this.onDeleteResult((Resource) obj);
            }
        });
    }

    private void deletePlace() {
        getViewModell().deletePlace(this.currentPropertyId);
        getViewModell().getIsSuccessDeletePlace().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                MyTeamPersonDetailFragment.this.onDeletePlaceResult((Resource) obj);
            }
        });
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.MyTeamPersonDetailFragment$1 */
    static /* synthetic */ class C58811 {
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
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.MyTeamPersonDetailFragment.C58811.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void onDeleteResult(Resource<KolyaSuccesModel> resource) {
        if (resource != null) {
            int i = C58811.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6913pb.setVisibility(4);
                backFragment();
            } else if (i == 2) {
                this.f6913pb.setVisibility(4);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            } else if (i == 3) {
                this.f6913pb.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: private */
    public void onDeletePlaceResult(Resource<EmployerListSingle> resource) {
        if (resource != null) {
            int i = C58811.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6913pb.setVisibility(4);
                showRes((CompanyObject) null);
                this.deletePlace.show(false);
            } else if (i == 2) {
                this.f6913pb.setVisibility(4);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            } else if (i == 3) {
                this.f6913pb.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        super.showToolbar();
        getBaseActivity().hideBottomNavigation();
    }

    public void onResume() {
        super.onResume();
        if (this.isDirector) {
            showAdditionalToolbarButton();
        }
        getBaseActivity().setTextTitle(this.phone);
    }

    private void showAdditionalToolbarButton() {
        ArrayList arrayList = new ArrayList();
        TextView textView = new TextView(getActivity());
        textView.setTextColor(getResources().getColor(R.color.toolbar_text_color));
        textView.setText(this.isEditMode ? "Готово" : "Изм.");
        arrayList.add(textView);
        textView.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                MyTeamPersonDetailFragment.this.lambda$showAdditionalToolbarButton$3$MyTeamPersonDetailFragment(view);
            }
        });
    }

    public /* synthetic */ void lambda$showAdditionalToolbarButton$3$MyTeamPersonDetailFragment(View view) {
        UIHelper.hideKeyboard(getActivity(), view);
        nextFragment(start(Integer.valueOf(getArguments().getInt("arg_id")), true), false);
    }

    private void showRes(CompanyObject companyObject) {
        if (companyObject == null) {
            this.chooseRentSection.setData(setRentData("Выбрать помещение"));
            this.currentPropertyId = null;
            this.deletePlace.show(false);
            return;
        }
        this.chooseRentSection.setData(setRentData(companyObject.getTitle()));
        ((MyRentaCompanyViewModel) this.viewModell).setEmployeePlace(companyObject.getRents().get(0).getId());
        this.currentPropertyId = companyObject.getRents().get(0).getId();
        this.deletePlace.show(this.canManage);
    }

    private void showMyRenta(List<CompanyObject> list) {
        this.f6913pb.setVisibility(8);
        if (list != null && !list.isEmpty()) {
            for (CompanyObject next : list) {
                if (!(next == null || next.getId() == null || !next.getId().equals(this.currentPropertyId))) {
                    showRes(next);
                }
            }
        }
    }

    private SomeString setRentData(String str) {
        SomeString someString = new SomeString(str);
        HashMap hashMap = new HashMap();
        hashMap.put("name", "Выбрать помещение");
        hashMap.put(ChooseSection.ARROW_VISABILITY, true);
        someString.setValues(hashMap);
        return someString;
    }

    /* access modifiers changed from: private */
    public void chooseRent(SomeString someString) {
        if (this.canManage) {
            nextFragment(new ChooseObjectListFragment(), false);
        }
    }
}
