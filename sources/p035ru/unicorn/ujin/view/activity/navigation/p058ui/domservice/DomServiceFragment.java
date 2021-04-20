package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ButtonProps;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ButtonSection;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServiceFragment */
public class DomServiceFragment extends BaseFragment {
    public static final String ARG_TYPE = "arg_type";
    public static final int TYPE_INTERNET = 1;
    public static final int TYPE_TELEPHONE = 2;
    public static final int TYPE_TV = 0;
    private ButtonSection buttonSection;
    private DomServiceListSection domServiceListSection;
    private DomServiceViewModel domServiceViewModel;

    /* renamed from: rv */
    private RecyclerView f6772rv;
    private SectionedAdapter sectionedAdapter;
    private DomServiceViewModel viewModelFactory;

    /* access modifiers changed from: private */
    /* renamed from: makeAction */
    public void lambda$initAdapter$0$DomServiceFragment(DomServiceTariff domServiceTariff) {
    }

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_dom_service;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    public static DomServiceFragment start(int i) {
        DomServiceFragment domServiceFragment = new DomServiceFragment();
        new Bundle().putInt("arg_type", i);
        return domServiceFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.f6772rv = (RecyclerView) inflate.findViewById(R.id.rv);
        initAdapter();
        return inflate;
    }

    private void initAdapter() {
        this.sectionedAdapter = new SectionedAdapter();
        this.f6772rv.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f6772rv.setAdapter(this.sectionedAdapter);
        if (this.buttonSection == null) {
            this.buttonSection = new ButtonSection();
            ButtonProps buttonProps = new ButtonProps();
            buttonProps.setTitle(getString(R.string.btn_make_connection));
            buttonProps.setEnable(true);
            this.buttonSection.setData(buttonProps);
            this.buttonSection.getSpecialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    DomServiceFragment.this.onClick((ButtonProps) obj);
                }
            });
        }
        if (this.domServiceListSection == null) {
            this.domServiceListSection = new DomServiceListSection();
            this.domServiceListSection.setDetailType(true);
            this.domServiceListSection.getSpecialClick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    DomServiceFragment.this.lambda$initAdapter$0$DomServiceFragment((DomServiceTariff) obj);
                }
            });
        }
        this.sectionedAdapter.addSection(this.domServiceListSection);
        this.sectionedAdapter.addSection(this.buttonSection);
    }

    /* access modifiers changed from: private */
    public void onClick(ButtonProps buttonProps) {
        nextFragment(new DomServicetTicketFragment(), false);
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.domServiceViewModel = (DomServiceViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) DomServiceViewmodelFactory.getInstance()).get(DomServiceViewModel.class);
        this.domServiceViewModel.getTariffMutableData().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                DomServiceFragment.this.showData((DomServiceTariff) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public void showData(DomServiceTariff domServiceTariff) {
        getBaseActivity().setTextTitle(domServiceTariff.getTitle());
        ArrayList arrayList = new ArrayList();
        arrayList.add(domServiceTariff);
        this.domServiceListSection.setData(arrayList);
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setTextTitle(this.domServiceViewModel.getTariffMutableData().getValue().getTitle());
        getBaseActivity().removeToolbarElevation();
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
    }
}
