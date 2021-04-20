package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogBuilder;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseSectionFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.MyProfileViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.ProfileData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.MorionTicketFragmentE;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.MyProfileFragment */
public class MyProfileFragment extends BaseSectionFragment<MyProfileViewModel> {
    private static final String ARG_MEMBER_MODE = "arg_is_member_mode";
    private static final String ARG_MODE = "arg_is_editable_mode";
    public static final String FRAGMENT_MY_PROFILE = "myProfileFragment";
    public static final String FRAGMENT_MY_PROFILE_EDIT = "myProfileEditFragment";
    public static final boolean MODE_EDIT = true;
    private Button btnExit;
    private Button btnGoToChat;
    private Button btnRenter;
    private Button btnUnlinkAccount;
    private boolean isEditMode;
    private boolean isMemberMode;
    private MyProfileEditSection profileEditSection;
    private MyProfileSection profileSection;
    private MyProfileViewModel profileTabViewModel;

    /* renamed from: rv */
    private RecyclerView f6846rv;
    private SectionedAdapter sectionedAdapter;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_prfile_my;
    }

    /* access modifiers changed from: protected */
    public void initSections() {
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    private MyProfileFragment() {
    }

    public static MyProfileFragment start(boolean z) {
        return start(z, false);
    }

    public static MyProfileFragment start(boolean z, boolean z2) {
        MyProfileFragment myProfileFragment = new MyProfileFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean(ARG_MODE, z);
        bundle.putBoolean(ARG_MEMBER_MODE, z2);
        myProfileFragment.setArguments(bundle);
        return myProfileFragment;
    }

    public MyProfileViewModel getViewModell() {
        return (MyProfileViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(MyProfileViewModel.class);
    }

    public void onViewCreated(MyProfileViewModel myProfileViewModel) {
        this.profileTabViewModel = myProfileViewModel;
        if (this.isMemberMode) {
            this.profileTabViewModel.getContactFieldList();
        } else if (this.isEditMode) {
            this.profileTabViewModel.getProfileFieldList();
        } else {
            this.profileTabViewModel.loadProfileData();
        }
        this.profileTabViewModel.getGetProfileLiveData().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                MyProfileFragment.this.showResult((Resource) obj);
            }
        });
        this.profileTabViewModel.getProfileMutableLiveData().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                MyProfileFragment.this.showFields((Resource) obj);
            }
        });
        this.profileTabViewModel.getEditProfileMutableLiveData().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                MyProfileFragment.this.showEditFields((Resource) obj);
            }
        });
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.f6846rv = (RecyclerView) inflate.findViewById(R.id.rv);
        this.f6913pb = (ProgressBar) inflate.findViewById(R.id.pb);
        this.btnRenter = (Button) inflate.findViewById(R.id.renter);
        this.btnRenter.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                MyProfileFragment.this.lambda$onCreateView$0$MyProfileFragment(view);
            }
        });
        this.btnGoToChat = (Button) inflate.findViewById(R.id.btn_go_chat);
        this.btnGoToChat.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                MyProfileFragment.this.lambda$onCreateView$1$MyProfileFragment(view);
            }
        });
        this.btnUnlinkAccount = (Button) inflate.findViewById(R.id.btn_unlink_account);
        this.btnUnlinkAccount.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                MyProfileFragment.this.lambda$onCreateView$2$MyProfileFragment(view);
            }
        });
        this.btnExit = (Button) inflate.findViewById(R.id.btn_exit);
        this.btnExit.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                MyProfileFragment.this.lambda$onCreateView$5$MyProfileFragment(view);
            }
        });
        this.isEditMode = getArguments().getBoolean(ARG_MODE);
        this.isMemberMode = getArguments().getBoolean(ARG_MEMBER_MODE);
        initAdapter();
        return inflate;
    }

    public /* synthetic */ void lambda$onCreateView$0$MyProfileFragment(View view) {
        nextFragment(MorionTicketFragmentE.start(AbstractRentTicket.createTicketByType("no_type")), false);
    }

    public /* synthetic */ void lambda$onCreateView$1$MyProfileFragment(View view) {
        openChat();
    }

    public /* synthetic */ void lambda$onCreateView$2$MyProfileFragment(View view) {
        MyProfileViewModel myProfileViewModel = this.profileTabViewModel;
        myProfileViewModel.destroyContact(myProfileViewModel.getCurrentChosen().getValue().getId().intValue());
        this.profileTabViewModel.getDestroyContactLiveData().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                MyProfileFragment.this.showDestroyResult((Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onCreateView$5$MyProfileFragment(View view) {
        new AlertDialog.Builder(getBaseActivity()).setTitle((CharSequence) getString(R.string.profileLogoutDialogTitle)).setMessage((CharSequence) getString(R.string.profileAreYouSureToLogout)).setPositiveButton((int) R.string.button_yes, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                MyProfileFragment.this.lambda$null$3$MyProfileFragment(dialogInterface, i);
            }
        }).setNegativeButton((int) R.string.button_no, (DialogInterface.OnClickListener) $$Lambda$MyProfileFragment$ZMtdH1G4th3JLL7fXq1lO_fdDlE.INSTANCE).create().show();
    }

    public /* synthetic */ void lambda$null$3$MyProfileFragment(DialogInterface dialogInterface, int i) {
        getBaseActivity().logout();
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: protected */
    public void initAdapter() {
        this.sectionedAdapter = new SectionedAdapter();
        this.f6846rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f6846rv.setAdapter(this.sectionedAdapter);
        if (this.profileSection == null) {
            this.profileSection = new MyProfileSection();
        }
        if (this.profileEditSection == null) {
            this.profileEditSection = new MyProfileEditSection();
        }
        int i = 0;
        this.btnExit.setVisibility((this.isEditMode || this.isMemberMode) ? 8 : 0);
        this.btnGoToChat.setVisibility(this.isMemberMode ? 0 : 8);
        Button button = this.btnUnlinkAccount;
        if (!this.isMemberMode) {
            i = 8;
        }
        button.setVisibility(i);
        this.sectionedAdapter.addSection(this.profileSection);
        this.profileSection.show(!this.isEditMode);
        this.sectionedAdapter.addSection(this.profileEditSection);
        this.profileEditSection.show(this.isEditMode);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.MyProfileFragment$2 */
    static /* synthetic */ class C59242 {
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
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.MyProfileFragment.C59242.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void showFields(Resource<List<FullProfileMapper>> resource) {
        if (resource != null) {
            int i = C59242.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6913pb.setVisibility(0);
            } else if (i == 2) {
                this.f6913pb.setVisibility(8);
                if (!this.isEditMode) {
                    this.profileSection.setData(resource.getData());
                }
            } else if (i == 3) {
                this.f6913pb.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }

    /* access modifiers changed from: private */
    public void showEditFields(Resource<List<FullProfileMapper>> resource) {
        if (resource != null) {
            int i = C59242.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6913pb.setVisibility(0);
            } else if (i == 2) {
                this.f6913pb.setVisibility(8);
                if (this.isEditMode) {
                    this.profileEditSection.setData(resource.getData());
                }
            } else if (i == 3) {
                this.f6913pb.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }

    /* access modifiers changed from: private */
    public void showResult(Resource<List<FullProfileMapper>> resource) {
        if (resource != null) {
            int i = C59242.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6913pb.setVisibility(0);
            } else if (i == 2) {
                this.f6913pb.setVisibility(8);
                if (!this.isEditMode) {
                    this.profileSection.setData(resource.getData());
                }
            } else if (i == 3) {
                this.f6913pb.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }

    /* access modifiers changed from: private */
    public void showDestroyResult(Resource<Boolean> resource) {
        if (resource != null) {
            int i = C59242.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6913pb.setVisibility(0);
            } else if (i == 2) {
                this.f6913pb.setVisibility(8);
                showMessage(getResources().getString(R.string.unlinkAccountSuccess));
                getBaseActivity().onBackPressed();
            } else if (i == 3) {
                this.f6913pb.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }

    private void openChat() {
        ProfileLocalRepository.Companion.getInstance();
    }

    private void showNoFioDialog(Boolean bool) {
        if (!bool.booleanValue()) {
            new DialogBuilder.Builder(getActivity()).title("").subtitle(getString(R.string.dialog_no_fio)).positeButtonName(getString(R.string.ok)).negativeButtonName(getString(R.string.button_later)).subtitleGravity(1).mainBackGroundColor(-1).buttonNegativeColor(getResources().getColor(R.color.brandMain)).subTitleTextColor(getResources().getColor(R.color.brandTextPrimary)).callback(new DialogBuilder.OnButtonDialogClick() {
                public void onPositiveClick(AlertDialog alertDialog) {
                    alertDialog.dismiss();
                }

                public void onNegativeClick(AlertDialog alertDialog) {
                    alertDialog.dismiss();
                }
            }).build();
        }
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        return getString(getArguments().getBoolean(ARG_MEMBER_MODE, false) ? R.string.title_team : R.string.label_my_profile);
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        super.showToolbar();
        getBaseActivity().hideBottomNavigation();
        if (!getArguments().getBoolean(ARG_MEMBER_MODE, false)) {
            showAdditionalToolbarButton();
        }
    }

    private void showAdditionalToolbarButton() {
        ArrayList arrayList = new ArrayList();
        TextView textView = new TextView(getActivity());
        textView.setTextColor(getResources().getColor(R.color.toolbar_text_color));
        textView.setText(this.isEditMode ? "Готово" : "Изм.");
        arrayList.add(textView);
        textView.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                MyProfileFragment.this.lambda$showAdditionalToolbarButton$6$MyProfileFragment(view);
            }
        });
        getBaseActivity().setToolbarRight(arrayList);
    }

    public /* synthetic */ void lambda$showAdditionalToolbarButton$6$MyProfileFragment(View view) {
        UIHelper.hideKeyboard(getActivity(), view);
        if (this.isEditMode) {
            this.profileTabViewModel.updateProfileData(this.profileEditSection.getData());
            this.profileTabViewModel.getUpdateProfileLiveData().observe(this, new Observer() {
                public final void onChanged(Object obj) {
                    MyProfileFragment.this.showUpdateResult((Resource) obj);
                }
            });
            return;
        }
        nextFragment(start(true), false, FRAGMENT_MY_PROFILE_EDIT);
    }

    /* access modifiers changed from: private */
    public void showUpdateResult(Resource<List<FullProfileMapper>> resource) {
        if (resource != null) {
            int i = C59242.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6913pb.setVisibility(0);
            } else if (i == 2) {
                this.f6913pb.setVisibility(8);
                removeFragmentFromBackStack(FRAGMENT_MY_PROFILE);
                removeFragmentFromBackStack(FRAGMENT_MY_PROFILE_EDIT);
                nextFragment(start(false), false, FRAGMENT_MY_PROFILE);
            } else if (i == 3) {
                this.f6913pb.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }

    private void showProfileData(Resource<ProfileData> resource) {
        if (resource != null) {
            int i = C59242.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6913pb.setVisibility(0);
            } else if (i == 2) {
                this.f6913pb.setVisibility(8);
                if (this.isEditMode) {
                    this.profileEditSection.setData(FullProfileMapper.mapTo(resource.getData().getProfile(), Boolean.valueOf(this.isEditMode)));
                } else {
                    this.profileSection.setData(FullProfileMapper.mapTo(resource.getData().getProfile(), Boolean.valueOf(this.isEditMode)));
                }
                this.profileSection.setData(FullProfileMapper.mapTo(resource.getData().getProfile(), Boolean.valueOf(this.isEditMode)));
            } else if (i == 3) {
                this.f6913pb.setVisibility(8);
            }
        }
    }
}
