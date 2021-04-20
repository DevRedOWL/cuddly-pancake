package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.api.response.notification.NotificationListResponse;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.company.CompanyApplication;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicketRouter;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.MyRentaCompanyFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentType;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.ApplicationToCompanyFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.response.CompanyApplicationsResponse;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassEditProfileFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba.CompanyApplicationAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba.ProfileTabFragment;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.fragments.notification.NotificationListFragment;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p046io.reactivex.functions.Consumer;
import p046io.realm.RealmList;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.ProfileTabFragment */
public class ProfileTabFragment extends BaseFragment {
    public static final String SHOW_RESIDENT_MESSAGE = "showResidentMessage";
    private AlertDialog alertDialog;
    private Button btnIsResident;
    private Button btnNoResident;
    /* access modifiers changed from: private */
    public CompanyApplicationAdapter companyApplicationAdapter;
    private Integer notificationsCount;
    private ProfileSection profileSection;
    private ProfileTabViewModel profileTabViewModel;
    private TopProfileTabItem profileView;
    private ConstraintLayout residentLayout;

    /* renamed from: rv */
    private RecyclerView f6854rv;
    private RecyclerView rvStatusList;
    private SchemaRouter schemaRouter;
    private SectionedAdapter sectionedAdapter;
    SharedPreferences sharedPreferences;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_prfile_tab;
    }

    public /* synthetic */ void lambda$onCreateView$0$ProfileTabFragment(View view) {
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    public static ProfileTabFragment start() {
        return new ProfileTabFragment();
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        this.sharedPreferences = getBaseActivity().getSharedPreferences(getString(R.string.app_name_app), 0);
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.f6854rv = (RecyclerView) inflate.findViewById(R.id.rv);
        this.profileView = (TopProfileTabItem) inflate.findViewById(R.id.sec);
        this.profileView.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ProfileTabFragment.this.lambda$onCreateView$0$ProfileTabFragment(view);
            }
        });
        initAdapter();
        this.residentLayout = (ConstraintLayout) inflate.findViewById(R.id.residentLayout);
        this.btnIsResident = (Button) inflate.findViewById(R.id.btnIsResident);
        this.btnNoResident = (Button) inflate.findViewById(R.id.btnNoResident);
        this.btnNoResident.setTextColor(getResources().getColor(R.color.textColorAvailable));
        this.btnIsResident.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ProfileTabFragment.this.lambda$onCreateView$1$ProfileTabFragment(view);
            }
        });
        this.btnNoResident.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ProfileTabFragment.this.lambda$onCreateView$2$ProfileTabFragment(view);
            }
        });
        this.rvStatusList = (RecyclerView) inflate.findViewById(R.id.rvStatusList);
        updateProfileView();
        return inflate;
    }

    public /* synthetic */ void lambda$onCreateView$1$ProfileTabFragment(View view) {
        this.sharedPreferences.edit().putBoolean(SHOW_RESIDENT_MESSAGE, false).apply();
        nextFragment(new MyRentaCompanyFragment(), false);
    }

    public /* synthetic */ void lambda$onCreateView$2$ProfileTabFragment(View view) {
        this.sharedPreferences.edit().putBoolean(SHOW_RESIDENT_MESSAGE, false).apply();
        this.residentLayout.setVisibility(8);
    }

    private void initAdapter() {
        this.sectionedAdapter = new SectionedAdapter();
        this.f6854rv.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        this.f6854rv.setAdapter(this.sectionedAdapter);
        if (this.profileSection == null) {
            this.profileSection = new ProfileSection();
            this.profileSection.specialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    ProfileTabFragment.this.onItemClick((Schema) obj);
                }
            });
        }
        this.sectionedAdapter.addSection(this.profileSection);
    }

    private void initStatusAdapter(List<CompanyApplication> list) {
        this.companyApplicationAdapter = new CompanyApplicationAdapter(list, new CompanyApplicationAdapter.OnItemClickedListener() {
            public void onCanceledClicked(int i) {
                String str;
                CompanyApplication item = ProfileTabFragment.this.companyApplicationAdapter.getItem(i);
                ProfileTabFragment.this.removeApplicationNotification(i);
                AlertDialog.Builder builder = new AlertDialog.Builder(ProfileTabFragment.this.getBaseActivity());
                if (item.getComment() == null || item.getComment().isEmpty()) {
                    str = ProfileTabFragment.this.getResources().getString(R.string.request_canceled_message);
                } else {
                    str = ProfileTabFragment.this.getResources().getString(R.string.request_canceled_with_comment_message, new Object[]{item.getComment()});
                }
                builder.setTitle((CharSequence) ProfileTabFragment.this.getResources().getString(R.string.request_canceled)).setMessage((CharSequence) str).setPositiveButton((CharSequence) ProfileTabFragment.this.getResources().getString(R.string.create_new_request), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(item) {
                    private final /* synthetic */ CompanyApplication f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ProfileTabFragment.C59261.this.lambda$onCanceledClicked$0$ProfileTabFragment$1(this.f$1, dialogInterface, i);
                    }
                }).setNegativeButton((CharSequence) ProfileTabFragment.this.getResources().getString(R.string.btn_close), (DialogInterface.OnClickListener) $$Lambda$ProfileTabFragment$1$jmnGnyJAFf2nB6JWiH2M2cYXktE.INSTANCE);
                builder.show().setCanceledOnTouchOutside(false);
            }

            public /* synthetic */ void lambda$onCanceledClicked$0$ProfileTabFragment$1(CompanyApplication companyApplication, DialogInterface dialogInterface, int i) {
                if (companyApplication.getEnterprise() != null && companyApplication.getEnterprise().getId() != null && companyApplication.getEnterprise().getTitle() != null) {
                    ProfileTabFragment.this.nextFragment(ApplicationToCompanyFragment.Companion.newInstance(companyApplication.getEnterprise().getId(), companyApplication.getEnterprise().getTitle()), false);
                }
            }

            public void onApprovedClicked(int i) {
                ProfileTabFragment.this.removeApplicationNotification(i);
            }
        });
        this.rvStatusList.setLayoutManager(new LinearLayoutManager(getBaseActivity()));
        this.rvStatusList.setAdapter(this.companyApplicationAdapter);
    }

    /* access modifiers changed from: private */
    public void removeApplicationNotification(int i) {
        CompanyApplication item = this.companyApplicationAdapter.getItem(i);
        this.companyApplicationAdapter.removeItem(i);
        if (item.getEnterprise() != null && item.getEnterprise().getId() != null) {
            this.profileTabViewModel.readApplicationNotification(item.getEnterprise().getId());
        }
    }

    /* access modifiers changed from: private */
    public void onItemClick(Schema schema) {
        if (this.schemaRouter == null) {
            this.schemaRouter = new SchemaRouter(getBaseActivity(), this);
        }
        this.schemaRouter.getFragmentByAction(schema);
    }

    /* access modifiers changed from: private */
    public void snowChoosenTypeFragment(RentType rentType) {
        ITicketRouter.getInstance().ticketRouter((BaseFragment) this, rentType);
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.profileTabViewModel = (ProfileTabViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(ProfileTabViewModel.class);
        this.profileTabViewModel.getSchemas();
        this.profileTabViewModel.getSchemaMutableLiveData().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                ProfileTabFragment.this.showItems((List) obj);
            }
        });
        this.profileTabViewModel.getRentInfoByName().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                ProfileTabFragment.this.snowChoosenTypeFragment((RentType) obj);
            }
        });
        this.profileTabViewModel.getCompanyList();
        this.profileTabViewModel.getListCompanyMutableLiveData().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                ProfileTabFragment.this.showData((Resource) obj);
            }
        });
        getBaseActivity().profileViewModel.requestUser();
        getBaseActivity().profileViewModel.getLoginMutableLiveData().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                ProfileTabFragment.this.showProfile((UpdateEvent) obj);
            }
        });
        this.notificationsCount = Integer.valueOf(getBaseActivity().profileViewModel.getUnreadNotificationList().size());
        getBaseActivity().profileViewModel.loadSplashscreen();
        getBaseActivity().profileViewModel.loadNotificationList(1);
        getBaseActivity().profileViewModel.getNotificationListLiveData().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                ProfileTabFragment.this.showNotifications((Resource) obj);
            }
        });
        this.profileTabViewModel.getCompanyApplications();
        this.profileTabViewModel.getCompanyApplicationsLiveData().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                ProfileTabFragment.this.showCompanyStatus((Resource) obj);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void showImageToolbar() {
        showToolbarTitle();
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.ProfileTabFragment$2 */
    static /* synthetic */ class C59272 {
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
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba.ProfileTabFragment.C59272.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void showData(Resource<List<RentCompany>> resource) {
        int i;
        if (resource != null && (i = C59272.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()]) != 1 && i != 2 && i == 3) {
            List data = resource.getData();
            if (!this.sharedPreferences.getBoolean(SHOW_RESIDENT_MESSAGE, true) || (data != null && !data.isEmpty())) {
                this.residentLayout.setVisibility(8);
            } else {
                this.residentLayout.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: private */
    public void showProfile(UpdateEvent updateEvent) {
        updateProfileView();
        User user = getBaseActivity().profileViewModel.getUser();
        if ((user.getSurname() == null ? user.getFullName() == null ? "" : user.getFullName() : user.getSurname()).isEmpty()) {
            this.profileTabViewModel.getHasFIO().setValue(false);
        }
        if (!(user.getName() == null || user.getName().isEmpty() || user.getSurname() == null || user.getSurname().isEmpty() || user.getPatronymic() == null)) {
            boolean isEmpty = user.getPatronymic().isEmpty();
        }
        if (user.getEmail() != null) {
            boolean isEmpty2 = user.getEmail().isEmpty();
        }
    }

    private void updateProfileView() {
        String str;
        User user = getBaseActivity().profileViewModel.getUser();
        String str2 = "";
        String surname = user.getSurname() == null ? str2 : user.getSurname();
        if (user.getFullName() != null) {
            str2 = user.getFullName();
        }
        if (user.getName().length() >= 1) {
            surname = surname + " " + user.getName().substring(0, 1) + ".";
        }
        if (user.getPatronymic().length() >= 1) {
            str = surname + " " + user.getPatronymic().substring(0, 1) + ".";
        } else {
            str = surname;
        }
        if (str.isEmpty() && !str2.isEmpty()) {
            str = str2;
        }
        TextView textView = this.profileView.title;
        if (str.isEmpty()) {
            str = "Гость";
        }
        textView.setText(str);
    }

    private void showAlertThatHasEmptyRequredFields() {
        if (this.alertDialog == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setMessage((CharSequence) getResources().getString(R.string.dialog_has_empty_reqired_fileds)).setPositiveButton((CharSequence) getResources().getString(R.string.button_OK), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ProfileTabFragment.this.lambda$showAlertThatHasEmptyRequredFields$3$ProfileTabFragment(dialogInterface, i);
                }
            });
            this.alertDialog = builder.create();
        }
        if (!this.alertDialog.isShowing()) {
            this.alertDialog.show();
            this.alertDialog.setCanceledOnTouchOutside(false);
        }
    }

    public /* synthetic */ void lambda$showAlertThatHasEmptyRequredFields$3$ProfileTabFragment(DialogInterface dialogInterface, int i) {
        nextFragment(new PassEditProfileFragment(), false);
    }

    /* access modifiers changed from: private */
    public void showItems(List<Schema> list) {
        this.profileSection.setData(list);
    }

    /* access modifiers changed from: private */
    public void showNotifications(Resource<NotificationListResponse> resource) {
        if (resource != null) {
            int i = C59272.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.notificationsCount = 0;
                showBellIcon();
            } else if (i != 2 && i == 3) {
                if (resource.getData() == null || resource.getData().getNotifications() == null || resource.getData().getNotifications().isEmpty()) {
                    this.notificationsCount = 0;
                    showBellIcon();
                    return;
                }
                this.notificationsCount = Integer.valueOf(resource.getData().getNotifications().size());
                showBellIcon();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarBackground(getResources().getColor(R.color.backgroundSecondary));
        getBaseActivity().showImageLogo();
        getBaseActivity().removeToolbarElevation();
        showBellIcon();
    }

    private void showToolbarTitle() {
        getBaseActivity().showImageLogo();
    }

    private void showBellIcon() {
        if (this.notificationsCount != null) {
            ArrayList arrayList = new ArrayList();
            ConstraintLayout constraintLayout = (ConstraintLayout) LayoutInflater.from(getContext()).inflate(R.layout.toolbar_bell_notifications, getBaseActivity().llButtonsRight, false);
            TextView textView = (TextView) constraintLayout.getViewById(R.id.tvCount);
            if (this.notificationsCount.intValue() == 0) {
                textView.setVisibility(8);
            } else {
                textView.setText(this.notificationsCount.toString());
            }
            constraintLayout.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    ProfileTabFragment.this.lambda$showBellIcon$4$ProfileTabFragment(view);
                }
            });
            arrayList.add(constraintLayout);
            getBaseActivity().setToolbarRight(arrayList);
        }
    }

    public /* synthetic */ void lambda$showBellIcon$4$ProfileTabFragment(View view) {
        nextFragment(new NotificationListFragment(), false);
    }

    /* access modifiers changed from: private */
    public void showCompanyStatus(Resource<CompanyApplicationsResponse> resource) {
        int i;
        if (resource != null && (i = C59272.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()]) != 1 && i != 2 && i == 3 && resource.getData() != null && resource.getData().getEmployee() != null) {
            RealmList<CompanyApplication> employee = resource.getData().getEmployee();
            if (!employee.isEmpty()) {
                initStatusAdapter(employee);
            }
        }
    }
}
