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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ButtonSection;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentaDescriptionFragment */
public class RentaDescriptionFragment extends BaseFragment {
    public static final String ARG_TITLE = "arg_title";
    private ButtonSection cancellSection;
    private RentaInfoSection rentaSection;
    private MyRentaViewModel rentaViewModel;

    /* renamed from: rv */
    private RecyclerView f6817rv;
    private SectionedAdapter sectionedAdapter;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_prfile_renta_description;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    private RentaDescriptionFragment() {
    }

    public static RentaDescriptionFragment start(String str) {
        RentaDescriptionFragment rentaDescriptionFragment = new RentaDescriptionFragment();
        Bundle bundle = new Bundle();
        bundle.putString("arg_title", str);
        rentaDescriptionFragment.setArguments(bundle);
        return rentaDescriptionFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.f6817rv = (RecyclerView) inflate.findViewById(R.id.rv);
        this.f6913pb = (ProgressBar) inflate.findViewById(R.id.pb);
        initAdapter();
        return inflate;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.rentaViewModel = (MyRentaViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(MyRentaViewModel.class);
        this.rentaViewModel.getCurrentPeriod();
        this.rentaViewModel.getRentPeriodsMutableLiveData().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                RentaDescriptionFragment.this.showPeriods((List) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public void showPeriods(List<RentInfo> list) {
        if (list.size() > 1) {
            this.rentaSection.setData(RentInfo.toKeyValueListForeManyPeriod(list.get(0), list.size()));
        } else if (list.size() == 1) {
            showDescription(list.get(0));
        }
    }

    private void showDescription(RentInfo rentInfo) {
        getBaseActivity().setTextTitle(rentInfo.getPropRenta().getTitle());
        this.rentaSection.setData(RentInfo.toKeyValueListForOnePeriod(rentInfo, rentInfo.getRentersCount()));
    }

    private void initAdapter() {
        this.sectionedAdapter = new SectionedAdapter();
        this.f6817rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f6817rv.setAdapter(this.sectionedAdapter);
        if (this.rentaSection == null) {
            this.rentaSection = new RentaInfoSection();
            this.rentaSection.specialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    RentaDescriptionFragment.this.lambda$initAdapter$0$RentaDescriptionFragment((String) obj);
                }
            });
        }
        if (this.cancellSection == null) {
            this.cancellSection = new ButtonSection();
        }
        this.sectionedAdapter.addSection(this.rentaSection);
        this.sectionedAdapter.addSection(this.cancellSection);
    }

    private void onDeleteRent() {
        new AlertDialog.Builder(getBaseActivity()).setTitle((CharSequence) getString(R.string.dialog_title_delete)).setPositiveButton((int) R.string.dialog_title_delete_button, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                RentaDescriptionFragment.this.lambda$onDeleteRent$1$RentaDescriptionFragment(dialogInterface, i);
            }
        }).setNegativeButton((int) R.string.button_no, (DialogInterface.OnClickListener) $$Lambda$RentaDescriptionFragment$hQKt90KmxDL6MAbGkt8_viUaRDY.INSTANCE).create().show();
    }

    public /* synthetic */ void lambda$onDeleteRent$1$RentaDescriptionFragment(DialogInterface dialogInterface, int i) {
        deleteRent(this.rentaViewModel.getCurrent().getValue().getId());
        dialogInterface.dismiss();
    }

    private void deleteRent(Integer num) {
        this.rentaViewModel.delete(num);
    }

    /* access modifiers changed from: private */
    /* renamed from: onDataClick */
    public void lambda$initAdapter$0$RentaDescriptionFragment(String str) {
        if (((str.hashCode() == 762869648 && str.equals("show_periods")) ? (char) 0 : 65535) == 0) {
            RentInfo rentInfo = (RentInfo) this.rentaViewModel.getRentPeriodsMutableLiveData().getValue().get(0);
            nextFragment(RentaUsersPermissions.start(rentInfo.getId(), rentInfo.getRentPermissions().isCanManage()), false);
        }
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getArguments().getString("arg_title"));
    }
}
