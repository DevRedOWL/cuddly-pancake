package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
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
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicket;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicketRouter;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.EmptySection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.MorionTicketFragment;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.ChooseRentFragment */
public class ChooseRentFragment extends BaseFragment {
    private static final String ARG_MODE = "arg_mode";
    public static final int MODE_CHOOSE = 2;
    public static final int MODE_SHOW_ALL = 1;
    private EmptySection emptySection;
    private RentaSection rentaSection;
    private RentaTypeSection rentaTypeSection;
    private MyRentaViewModel rentaViewModel;

    /* renamed from: rv */
    private RecyclerView f6808rv;
    private SectionedAdapter sectionedAdapter;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_choose_rent_type;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    private ChooseRentFragment() {
    }

    public static ChooseRentFragment start(AbstractRentTicket abstractRentTicket) {
        ChooseRentFragment chooseRentFragment = new ChooseRentFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("rent", abstractRentTicket);
        chooseRentFragment.setArguments(bundle);
        return chooseRentFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.f6808rv = (RecyclerView) inflate.findViewById(R.id.rv);
        this.f6913pb = (ProgressBar) inflate.findViewById(R.id.pb);
        initAdapter();
        return inflate;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.rentaViewModel = (MyRentaViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(MyRentaViewModel.class);
        this.f6913pb.setVisibility(0);
        AbstractRentTicket abstractRentTicket = (AbstractRentTicket) getArguments().getParcelable("rent");
        int i = C58821.f6809xc4c9dd02[abstractRentTicket.getTicketProperty().ordinal()];
        if (i == 1) {
            this.rentaViewModel.getMyRentaUniqe();
            this.rentaViewModel.getMyRentLiveData().observe(this, new Observer() {
                public final void onChanged(Object obj) {
                    ChooseRentFragment.this.showMyRenta((List) obj);
                }
            });
        } else if (i == 2) {
            this.rentaViewModel.showAvailableRenta();
            this.rentaViewModel.getRentTypeMutableLiveData().observe(this, new Observer() {
                public final void onChanged(Object obj) {
                    ChooseRentFragment.this.showAllAvailableType((List) obj);
                }
            });
        } else {
            throw new IllegalStateException("Unexpected value: " + abstractRentTicket.getTicketProperty());
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.ChooseRentFragment$1 */
    static /* synthetic */ class C58821 {

        /* renamed from: $SwitchMap$ru$unicorn$ujin$view$activity$navigation$entity$tickets$base$ITicket$TicketProperty */
        static final /* synthetic */ int[] f6809xc4c9dd02 = new int[ITicket.TicketProperty.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicket$TicketProperty[] r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicket.TicketProperty.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6809xc4c9dd02 = r0
                int[] r0 = f6809xc4c9dd02     // Catch:{ NoSuchFieldError -> 0x0014 }
                ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicket$TicketProperty r1 = p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicket.TicketProperty.property_service     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f6809xc4c9dd02     // Catch:{ NoSuchFieldError -> 0x001f }
                ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicket$TicketProperty r1 = p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicket.TicketProperty.property     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.ChooseRentFragment.C58821.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void showAllAvailableType(List<RentType> list) {
        this.f6913pb.setVisibility(8);
        this.emptySection.show(list.isEmpty());
        if (list.isEmpty()) {
            this.emptySection.setData(new SomeString("Нет доступных помещений"));
        } else {
            this.rentaTypeSection.setData(list);
        }
    }

    /* access modifiers changed from: private */
    public void showMyRenta(List<RentInfo> list) {
        this.f6913pb.setVisibility(4);
        if (list.isEmpty()) {
            this.emptySection.show(true);
            this.emptySection.setData(new SomeString("Нет арендованных помещений"));
            return;
        }
        this.rentaSection.setData(list);
        this.emptySection.show(false);
    }

    private void initAdapter() {
        this.sectionedAdapter = new SectionedAdapter();
        this.f6808rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f6808rv.setAdapter(this.sectionedAdapter);
        if (this.rentaSection == null) {
            this.rentaSection = new RentaSection();
            this.rentaSection.getSpecialClick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    ChooseRentFragment.this.onRentaClick((RentInfo) obj);
                }
            });
        }
        if (this.rentaTypeSection == null) {
            this.rentaTypeSection = new RentaTypeSection();
            this.rentaTypeSection.specialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    ChooseRentFragment.this.onRentaTypeClick((RentType) obj);
                }
            });
        }
        if (this.emptySection == null) {
            this.emptySection = new EmptySection(false, 14);
        }
        this.sectionedAdapter.addSection(this.emptySection);
        this.sectionedAdapter.addSection(this.rentaSection);
        this.sectionedAdapter.addSection(this.rentaTypeSection);
        int i = getArguments().getInt("arg_mode");
        if (i == 1) {
            this.sectionedAdapter.addSection(this.rentaSection);
        } else if (i == 2) {
            this.sectionedAdapter.addSection(this.rentaTypeSection);
        }
    }

    /* access modifiers changed from: private */
    public void onRentaTypeClick(RentType rentType) {
        ITicketRouter.getInstance().ticketRouter((BaseFragment) this, rentType);
    }

    /* access modifiers changed from: private */
    public void onRentaClick(RentInfo rentInfo) {
        nextFragment(MorionTicketFragment.start(getType(), rentInfo.getPropRenta().getTitle(), rentInfo.getPropRenta().getId().intValue()), true);
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getString(R.string.title_renta));
    }

    private String getType() {
        AbstractRentTicket abstractRentTicket = (AbstractRentTicket) getArguments().getParcelable("rent");
        Log.d("TAG", "XXX XXX " + abstractRentTicket.getLocalTicketTypeName());
        return abstractRentTicket.getLocalTicketTypeName();
    }
}
