package p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.EmptySection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket.TicketViewModel;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.tickets.TicketsFragment */
public class TicketsFragment extends TicketBaseFragment {
    /* access modifiers changed from: private */
    public AccountDataSection accountDataSection;
    /* access modifiers changed from: private */
    public ButtonSection buttonSection;
    /* access modifiers changed from: private */
    public Integer currentAccountNumber;
    /* access modifiers changed from: private */
    public String currentServiceTitle;
    /* access modifiers changed from: private */
    public EmptySection emptySection;
    /* access modifiers changed from: private */
    public FlowSection flowSection;
    /* access modifiers changed from: private */
    public TextSection infoSection;
    /* access modifiers changed from: private */
    public boolean isPaymentAvailable;

    /* renamed from: pb */
    private ProgressBar f6885pb;
    /* access modifiers changed from: private */

    /* renamed from: rv */
    public RecyclerView f6886rv;
    private SectionedAdapter sectionedAdapter;
    private TabLayout tabLayout;
    /* access modifiers changed from: private */
    public TextSection textSection;
    /* access modifiers changed from: private */
    public TicketViewModel ticketViewModel;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_tickets;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    public /* bridge */ /* synthetic */ void openTicketsFragment() {
        super.openTicketsFragment();
    }

    public /* bridge */ /* synthetic */ void startPaymentActivity(String str) {
        super.startPaymentActivity(str);
    }

    public static TicketsFragment start() {
        TicketsFragment ticketsFragment = new TicketsFragment();
        ticketsFragment.setArguments(new Bundle());
        return ticketsFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.f6886rv = (RecyclerView) inflate.findViewById(R.id.rv);
        this.f6885pb = (ProgressBar) inflate.findViewById(R.id.pb);
        this.tabLayout = (TabLayout) inflate.findViewById(R.id.tab);
        return inflate;
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        this.ticketViewModel = (TicketViewModel) ViewModelProviders.m10of((Fragment) this).get(TicketViewModel.class);
        this.ticketViewModel.getTicketList();
        this.ticketViewModel.getTicketListDSingleLiveEvent().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                TicketsFragment.this.showTickets((Resource) obj);
            }
        });
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        initAdapter();
    }

    public void onResume() {
        super.onResume();
    }

    private void initTabs(final List<Tickets> list) {
        getBaseActivity().removeToolbarElevation();
        if (!list.isEmpty()) {
            this.tabLayout.setVisibility(0);
            this.tabLayout.removeAllTabs();
            for (int i = 0; i < list.size(); i++) {
                String accountNumber = StringUtils.isEmpty(list.get(i).getServiceTitle()) ? list.get(i).getAccountNumber() : list.get(i).getServiceTitle();
                TabLayout tabLayout2 = this.tabLayout;
                tabLayout2.addTab(tabLayout2.newTab().setText((CharSequence) accountNumber));
            }
            this.tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TabLayout.OnTabSelectedListener() {
                public void onTabReselected(TabLayout.Tab tab) {
                }

                public void onTabUnselected(TabLayout.Tab tab) {
                }

                public void onTabSelected(TabLayout.Tab tab) {
                    int position = tab.getPosition();
                    Integer unused = TicketsFragment.this.currentAccountNumber = Integer.valueOf(((Tickets) list.get(position)).getId());
                    String unused2 = TicketsFragment.this.currentServiceTitle = StringUtils.isEmpty(((Tickets) list.get(position)).getServiceTitle()) ? ((Tickets) list.get(position)).getAccountNumber() : ((Tickets) list.get(position)).getServiceTitle();
                    boolean unused3 = TicketsFragment.this.isPaymentAvailable = ((Tickets) list.get(position)).getPaymentAvailable().booleanValue();
                    TicketsFragment.this.ticketViewModel.getOperations(TicketsFragment.this.currentAccountNumber.intValue());
                    TicketsFragment.this.f6886rv.setVisibility(8);
                    TicketsFragment.this.accountDataSection.setData(new ArrayList());
                    TicketsFragment.this.emptySection.setData(new SomeString(""));
                    TicketsFragment.this.flowSection.setData(new ArrayList());
                    TicketsFragment.this.buttonSection.setData(new ButtonModel());
                    TicketsFragment.this.textSection.setData(new SomeString(""));
                    TicketsFragment.this.infoSection.setData(new SomeString(""));
                }
            });
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.tickets.TicketsFragment$2 */
    static /* synthetic */ class C59482 {
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
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.TicketsFragment.C59482.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void showTickets(Resource<List<Tickets>> resource) {
        if (resource != null) {
            int i = C59482.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6885pb.setVisibility(0);
            } else if (i == 2) {
                this.f6885pb.setVisibility(8);
                if (resource.getData() == null || resource.getData().size() <= 0) {
                    this.emptySection.setData(new SomeString("Здесь вы сможете оплачивать квитанции в один клик.\nСообщите о вашем желании в УК."));
                } else {
                    initTabs(resource.getData());
                    Tickets tickets = (Tickets) resource.getData().get(0);
                    this.currentAccountNumber = Integer.valueOf(tickets.getId());
                    this.currentServiceTitle = StringUtils.isEmpty(tickets.getServiceTitle()) ? tickets.getAccountNumber() : tickets.getServiceTitle();
                    this.isPaymentAvailable = tickets.getPaymentAvailable().booleanValue();
                    this.ticketViewModel.getOperations(this.currentAccountNumber.intValue());
                    this.ticketViewModel.getTicket().observe(this, new Observer() {
                        public final void onChanged(Object obj) {
                            TicketsFragment.this.showDescription((Resource) obj);
                        }
                    });
                }
                this.f6886rv.scrollToPosition(0);
            } else if (i == 3) {
                DialogHelper.showDialog(getContext(), resource.getMessage());
                this.f6885pb.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: private */
    public void showDescription(Resource<AccountTicket> resource) {
        if (resource != null) {
            int i = C59482.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6885pb.setVisibility(0);
            } else if (i == 2) {
                this.f6885pb.setVisibility(8);
                List<AccountModel> makeTicketModel = AccountTicket.makeTicketModel(resource.getData());
                if (makeTicketModel.isEmpty()) {
                    this.emptySection.setData(new SomeString("Нет данных по счетам"));
                    return;
                }
                this.textSection.setData(new SomeString(resource.getData().getCompanyTitle()));
                this.accountDataSection.setData(makeTicketModel);
                if (!this.isPaymentAvailable || this.ticketViewModel.isDemoUser().booleanValue()) {
                    this.buttonSection.show(false);
                } else {
                    this.infoSection.setData(new SomeString(getString(R.string.label_pay_with_lag)));
                    this.buttonSection.show(true);
                    this.buttonSection.setData(new ButtonModel(this.currentAccountNumber, getResources().getString(R.string.topUpBalance)));
                }
                List<TicketListModel> makeOperationsModel = AccountTicket.makeOperationsModel(resource.getData());
                if (makeOperationsModel.isEmpty()) {
                    this.emptySection.setData(new SomeString("Нет данных по квитанциям"));
                } else {
                    this.flowSection.setData(makeOperationsModel);
                }
                this.f6886rv.scrollToPosition(0);
                this.f6886rv.setVisibility(0);
            } else if (i == 3) {
                this.f6885pb.setVisibility(8);
            }
        }
    }

    private void initAdapter() {
        this.f6886rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.sectionedAdapter = new SectionedAdapter();
        this.f6886rv.setAdapter(this.sectionedAdapter);
        if (this.accountDataSection == null) {
            this.accountDataSection = new AccountDataSection();
        }
        if (this.flowSection == null) {
            this.flowSection = new FlowSection();
            this.flowSection.ticketClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    TicketsFragment.this.lambda$initAdapter$0$TicketsFragment((TicketListModel) obj);
                }
            });
        }
        if (this.emptySection == null) {
            this.emptySection = new EmptySection(false, 14);
        }
        if (this.buttonSection == null) {
            this.buttonSection = new ButtonSection();
            this.buttonSection.getOnClick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    TicketsFragment.this.showAccountPaymentForm((Integer) obj);
                }
            });
        }
        if (this.textSection == null) {
            this.textSection = new TextSection(false, 17);
        }
        if (this.infoSection == null) {
            this.infoSection = new TextSection(false, 14);
            this.infoSection.setTextAlligment(4);
        }
        this.sectionedAdapter.addSection(this.textSection);
        this.sectionedAdapter.addSection(this.accountDataSection);
        this.sectionedAdapter.addSection(this.infoSection);
        this.sectionedAdapter.addSection(this.buttonSection);
        this.sectionedAdapter.addSection(this.flowSection);
        this.sectionedAdapter.addSection(this.emptySection);
    }

    public /* synthetic */ void lambda$initAdapter$0$TicketsFragment(TicketListModel ticketListModel) throws Exception {
        String str;
        String id = ticketListModel.getId();
        int accountId = ticketListModel.getAccountId();
        String str2 = this.currentServiceTitle;
        String type = ticketListModel.getType();
        if (OperationType.valueOf(ticketListModel.getType().toUpperCase()) == OperationType.FILL) {
            str = ticketListModel.getLastSum().toString();
        } else {
            str = ticketListModel.getBalance().toString();
        }
        nextFragment(TicketDetailFragment.start(id, accountId, str2, type, str, this.isPaymentAvailable), false, FRAGMENT_TICKET_DETAIL);
    }

    /* access modifiers changed from: private */
    public void showAccountPaymentForm(Integer num) {
        nextFragment(PaymentFormFragment.start(num.intValue(), this.currentServiceTitle), false, FRAGMENT_PAYMENT_FORM);
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getString(R.string.label_kvit));
    }
}
