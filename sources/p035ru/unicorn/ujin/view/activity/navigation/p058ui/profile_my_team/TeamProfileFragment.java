package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.MyProfileFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.MyProfileViewModel;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryDialog;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.EditField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Field;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my_team.TeamProfileFragment */
public class TeamProfileFragment extends BaseFragment {
    private Button btnAddMember;
    private boolean isEditMode;
    private MyProfileViewModel myProfileViewModel;

    /* renamed from: rv */
    private RecyclerView f6853rv;
    private SectionedAdapter sectionedAdapter;
    private TeamProfileSection teamProfileSection;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_prfile_team;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.f6853rv = (RecyclerView) inflate.findViewById(R.id.rv);
        this.f6913pb = (ProgressBar) inflate.findViewById(R.id.pb);
        this.btnAddMember = (Button) inflate.findViewById(R.id.member);
        this.btnAddMember.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                TeamProfileFragment.this.lambda$onCreateView$0$TeamProfileFragment(view);
            }
        });
        initAdapter();
        return inflate;
    }

    public /* synthetic */ void lambda$onCreateView$0$TeamProfileFragment(View view) {
        showAddMemberDialog();
    }

    private void showAddMemberDialog() {
        ArrayList arrayList = new ArrayList();
        EditField editField = new EditField("phone", getResources().getString(R.string.enterMemberPhone), "", "", (Function2<? super EditText, ? super EditText, Unit>) null, (Function1<? super EditText, Unit>) null);
        editField.setName("phone");
        editField.setRequired(true);
        arrayList.add(editField);
        DataEntryDialog newInstance = DataEntryDialog.newInstance((int) R.string.linkAccount, (List<? extends Field>) arrayList, (int) R.string.linkTitle);
        newInstance.setLambdaSave(new Function1(newInstance) {
            private final /* synthetic */ DataEntryDialog f$1;

            {
                this.f$1 = r2;
            }

            public final Object invoke(Object obj) {
                return TeamProfileFragment.this.lambda$showAddMemberDialog$1$TeamProfileFragment(this.f$1, (Long) obj);
            }
        });
        newInstance.show(getChildFragmentManager(), "addMember");
    }

    public /* synthetic */ Unit lambda$showAddMemberDialog$1$TeamProfileFragment(DataEntryDialog dataEntryDialog, Long l) {
        return handleSave(dataEntryDialog);
    }

    private Unit handleSave(DataEntryDialog dataEntryDialog) {
        getBaseActivity().hideSoftKeyboard(getBaseActivity());
        dataEntryDialog.dismiss();
        this.myProfileViewModel.inviteContact(dataEntryDialog.getValuesList()[0]);
        this.myProfileViewModel.getTeamInviteContactLiveData().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                TeamProfileFragment.this.addContactToList((Resource) obj);
            }
        });
        return Unit.INSTANCE;
    }

    private void initAdapter() {
        this.sectionedAdapter = new SectionedAdapter();
        this.f6853rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f6853rv.setAdapter(this.sectionedAdapter);
        if (this.teamProfileSection == null) {
            this.teamProfileSection = new TeamProfileSection();
            this.teamProfileSection.specialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    TeamProfileFragment.this.onMemberClick((TeamMapper) obj);
                }
            });
        }
        this.sectionedAdapter.addSection(this.teamProfileSection);
    }

    /* access modifiers changed from: private */
    public void onMemberClick(TeamMapper teamMapper) {
        this.myProfileViewModel.getCurrentChosen().setValue(teamMapper);
        nextFragment(MyProfileFragment.start(false, true), false);
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.myProfileViewModel = (MyProfileViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(MyProfileViewModel.class);
        this.myProfileViewModel.loadContactList();
        this.myProfileViewModel.getTeamContactListLiveData().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                TeamProfileFragment.this.showTeam((Resource) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public void showTeam(Resource<List<TeamMapper>> resource) {
        this.btnAddMember.setVisibility(0);
        if (resource != null) {
            int i = C59251.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6913pb.setVisibility(0);
            } else if (i == 2) {
                this.teamProfileSection.setData(resource.getData());
                this.f6913pb.setVisibility(8);
            } else if (i == 3) {
                this.f6913pb.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my_team.TeamProfileFragment$1 */
    static /* synthetic */ class C59251 {
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
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team.TeamProfileFragment.C59251.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void addContactToList(Resource<TeamMapper> resource) {
        if (resource != null) {
            int i = C59251.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6913pb.setVisibility(0);
            } else if (i == 2) {
                this.f6913pb.setVisibility(8);
                showMessage(getResources().getString(R.string.linkAccountSuccess));
            } else if (i == 3) {
                this.f6913pb.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getString(R.string.title_team));
    }
}
