package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import android.os.Bundle;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import java.util.ArrayList;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.BaseSection;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseSectionFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.CompanyList;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Rent;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.RentInfoSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Renters;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentaUsersPermissions */
public class RentaUsersPermissions extends BaseSectionFragment<MyRentaViewModel> {
    public static final String ARG_BOOL_CAN_MANAGE = "arg_bool_canManage";
    private static final String ARG_INT_ID = "arg_id";
    private EnterpriseSection enterpriseSeection;
    private RentInfoSection rentInfoSection;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.rv_permission_rent;
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        return "Приглашенные сотрудники";
    }

    public static RentaUsersPermissions start(Integer num, boolean z) {
        RentaUsersPermissions rentaUsersPermissions = new RentaUsersPermissions();
        Bundle bundle = new Bundle();
        bundle.putInt("arg_id", num.intValue());
        bundle.putBoolean(ARG_BOOL_CAN_MANAGE, z);
        rentaUsersPermissions.setArguments(bundle);
        return rentaUsersPermissions;
    }

    /* access modifiers changed from: protected */
    public void initSections() {
        if (this.rentInfoSection == null) {
            this.rentInfoSection = new RentInfoSection();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: managePermission */
    public void lambda$showRenters$0$RentaUsersPermissions(List<Renters> list) {
        getViewModell().managePErmission(list);
    }

    public MyRentaViewModel getViewModell() {
        return (MyRentaViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(MyRentaViewModel.class);
    }

    public void onViewCreated(MyRentaViewModel myRentaViewModel) {
        myRentaViewModel.getPermisionsForRentById(getArguments().getInt("arg_id"), true);
        myRentaViewModel.getRentaInfoMutableLiveData().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                RentaUsersPermissions.this.showRenters((Pair<Rent, CompanyList>) (Pair) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public void showRenters(Pair<Rent, CompanyList> pair) {
        Rent rent = (Rent) pair.first;
        List<RentCompany> rentCompany = ((CompanyList) pair.second).getRentCompany();
        RentInfo value = getViewModell().getCurrent().getValue();
        this.rentInfoSection.setData(pair.first);
        this.sectionedAdapter = new SectionedAdapter();
        initAdapter();
        this.sectionedAdapter.addSection(this.rentInfoSection);
        for (int i = 0; i < rentCompany.size(); i++) {
            List<UserProfile> userProfiles = rentCompany.get(i).getUserProfiles();
            EnterpriseSection enterpriseSection = new EnterpriseSection(i);
            enterpriseSection.getSectionClick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    RentaUsersPermissions.this.onSectinClick((Integer) obj);
                }
            });
            RentersSection rentersSection = new RentersSection();
            rentersSection.setCanManage(((Rent) pair.first).getCanManage().isCanManage());
            this.sectionedAdapter.addSection(enterpriseSection);
            this.sectionedAdapter.addSection(rentersSection);
            enterpriseSection.setData(rentCompany.get(i));
            rentersSection.setRenters(rent.getRenters());
            rentersSection.setData(userProfiles);
            rentersSection.getRentersPublishProcessor().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    RentaUsersPermissions.this.lambda$showRenters$0$RentaUsersPermissions((List) obj);
                }
            });
            if (i > 0) {
                rentersSection.show(false);
            }
        }
    }

    /* access modifiers changed from: private */
    public void onSectinClick(Integer num) {
        ArrayList<BaseSection> sections = this.sectionedAdapter.getSections();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= sections.size()) {
                break;
            }
            if (sections.get(i) instanceof EnterpriseSection) {
                if (i2 == num.intValue()) {
                    i2 = i + 1;
                    break;
                }
                i2++;
            }
            i++;
        }
        sections.get(i2).show(!sections.get(i2).isShown());
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentaUsersPermissions$1 */
    static /* synthetic */ class C58881 {
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
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentaUsersPermissions.C58881.<clinit>():void");
        }
    }

    private void showRenters(Resource<Rent> resource) {
        if (resource != null) {
            int i = C58881.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6913pb.setVisibility(0);
            } else if (i == 2) {
                this.f6913pb.setVisibility(4);
            } else if (i == 3) {
                this.f6913pb.setVisibility(4);
                DialogHelper.showDialog(getContext(), "Ошибка загрузки");
            }
        }
    }
}
