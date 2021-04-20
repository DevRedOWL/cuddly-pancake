package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.EmptySection;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentaPeriodsFragment */
public class RentaPeriodsFragment extends BaseFragment {
    public static final String ARG_TITLE = "arg_title";
    private EmptySection emptySection;
    private RentaPeriodSection rentaSection;
    private MyRentaViewModel rentaViewModel;

    /* renamed from: rv */
    private RecyclerView f6819rv;
    private SectionedAdapter sectionedAdapter;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_prfile_renta_periods;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    private RentaPeriodsFragment() {
    }

    public static RentaPeriodsFragment start() {
        RentaPeriodsFragment rentaPeriodsFragment = new RentaPeriodsFragment();
        rentaPeriodsFragment.setArguments(new Bundle());
        return rentaPeriodsFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.f6819rv = (RecyclerView) inflate.findViewById(R.id.rv);
        this.f6913pb = (ProgressBar) inflate.findViewById(R.id.pb);
        initAdapter();
        return inflate;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.rentaViewModel = (MyRentaViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(MyRentaViewModel.class);
        this.rentaViewModel.getCurrentPeriod();
        this.rentaViewModel.getRentPeriodsMutableLiveData().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                RentaPeriodsFragment.this.showPeriods((List) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public void showPeriods(List<RentInfo> list) {
        this.rentaSection.setData(list);
        if (list.isEmpty()) {
            this.emptySection.setData(new SomeString("нет активных аренд"));
        }
    }

    private void initAdapter() {
        this.sectionedAdapter = new SectionedAdapter();
        this.f6819rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f6819rv.setAdapter(this.sectionedAdapter);
        if (this.rentaSection == null) {
            this.rentaSection = new RentaPeriodSection();
            this.rentaSection.specialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    RentaPeriodsFragment.this.lambda$initAdapter$0$RentaPeriodsFragment((RentInfo) obj);
                }
            });
            this.rentaSection.showUsersClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    RentaPeriodsFragment.this.lambda$initAdapter$1$RentaPeriodsFragment((RentInfo) obj);
                }
            });
        }
        if (this.emptySection == null) {
            this.emptySection = new EmptySection(false, 14);
        }
        this.sectionedAdapter.addSection(this.rentaSection);
        this.sectionedAdapter.addSection(this.emptySection);
    }

    /* access modifiers changed from: private */
    /* renamed from: onShowUsersClick */
    public void lambda$initAdapter$1$RentaPeriodsFragment(RentInfo rentInfo) {
        nextFragment(RentaUsersPermissions.start(rentInfo.getId(), rentInfo.getRentPermissions().isCanManage()), false);
    }

    /* access modifiers changed from: private */
    /* renamed from: onDeleteClick */
    public void lambda$initAdapter$0$RentaPeriodsFragment(RentInfo rentInfo) {
        new AlertDialog.Builder(getBaseActivity()).setTitle((CharSequence) getString(R.string.dialog_title_delete)).setPositiveButton((int) R.string.dialog_title_delete_button, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(rentInfo) {
            private final /* synthetic */ RentInfo f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                RentaPeriodsFragment.this.lambda$onDeleteClick$2$RentaPeriodsFragment(this.f$1, dialogInterface, i);
            }
        }).setNegativeButton((int) R.string.button_no, (DialogInterface.OnClickListener) $$Lambda$RentaPeriodsFragment$Nar00OlVkYd6rDBrkNJotp_jTc.INSTANCE).create().show();
    }

    public /* synthetic */ void lambda$onDeleteClick$2$RentaPeriodsFragment(RentInfo rentInfo, DialogInterface dialogInterface, int i) {
        deleteRent(rentInfo.getId());
        dialogInterface.dismiss();
    }

    private void deleteRent(Integer num) {
        this.rentaViewModel.delete(num);
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getArguments().getString("arg_title"));
    }
}
