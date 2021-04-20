package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import java.util.List;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicket;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.NoTypeRentTicket;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.service.SimpleServiceRentTicket;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.EmptySection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.HelpDeskViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.RentTicketListSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicketFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.Tickets;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.TicketListFragment */
public class TicketListFragment extends BaseFragment implements View.OnClickListener {
    private static final int ACTIVE_TICKETS = 0;
    private static final int ARCHIVE_TICKETS = 1;
    public static final String ARG_TICKET_SECTION_ID = "arg_ticket_section_id";
    public static final String ARG_TICKET_SECTION_TITLE = "arg_ticket_section_title";
    public static final String ARG_TICKET_TITLE = "arg_ticket_title";
    public static final String ARG_TICKET_TYPE = "arg_ticket_type";
    public static final String ARG_TYPE_PROPERTY = "property_type";
    public static final String ARG_TYPE_PROPERTY_SERVICE = "property_service";
    private Button btnCreate;
    private Intent data;
    private EmptySection emptySection;
    /* access modifiers changed from: private */
    public HelpDeskViewModel helpdeskViewModel;
    /* access modifiers changed from: private */
    public LinearLayoutManager linearLayoutManager;

    /* renamed from: pb */
    private ProgressBar f6861pb;

    /* renamed from: rv */
    private RecyclerView f6862rv;
    private String sectionId;
    private SectionedAdapter sectionedAdapter;
    /* access modifiers changed from: private */
    public int selectedTabIndex = 0;
    private TabLayout tabLayout;
    private String text;
    private RentTicketListSection ticketListSection;
    private String title;

    private int getLayoutRes() {
        return R.layout.fragment_ticket_list;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    public void onClick(View view) {
    }

    public static TicketListFragment start(String str, String str2, String str3, String str4) {
        TicketListFragment ticketListFragment = new TicketListFragment();
        Bundle bundle = new Bundle();
        bundle.putString("arg_ticket_type", str);
        bundle.putString(ARG_TICKET_SECTION_ID, str2);
        bundle.putString(ARG_TICKET_SECTION_TITLE, str3);
        bundle.putString(ARG_TICKET_TITLE, str4);
        ticketListFragment.setArguments(bundle);
        return ticketListFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.f6862rv = (RecyclerView) inflate.findViewById(R.id.rv);
        this.f6861pb = (ProgressBar) inflate.findViewById(R.id.pb);
        this.tabLayout = (TabLayout) inflate.findViewById(R.id.tab);
        this.btnCreate = (Button) inflate.findViewById(R.id.button);
        this.title = getArguments().getString(ARG_TICKET_TITLE);
        this.sectionId = getArguments().getString(ARG_TICKET_SECTION_ID);
        this.btnCreate.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                TicketListFragment.this.lambda$onCreateView$0$TicketListFragment(view);
            }
        });
        return inflate;
    }

    public /* synthetic */ void lambda$onCreateView$0$TicketListFragment(View view) {
        ITicket noTypeRentTicket = getArguments().getString("arg_ticket_type").equals("property_type") ? new NoTypeRentTicket() : new SimpleServiceRentTicket();
        noTypeRentTicket.saveSectionId(this.sectionId);
        SectionTicketType sectionTicketType = null;
        String str = this.sectionId;
        if (str != null) {
            sectionTicketType = SectionTicketType.getByNumber(str);
        }
        if (this.sectionId == null || sectionTicketType == null) {
            noTypeRentTicket.saveSectionTitle(getArguments().getString(ARG_TICKET_SECTION_TITLE));
        } else {
            noTypeRentTicket.saveSectionTitle(getResources().getString(sectionTicketType.getTitle()));
        }
        nextFragment(AbstractTicketFragment.start(noTypeRentTicket), false, BaseActivity.FRAGMENT_ABSTRACT_TICKET);
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.helpdeskViewModel = (HelpDeskViewModel) ViewModelProviders.m10of((Fragment) this).get(HelpDeskViewModel.class);
        this.helpdeskViewModel.getCurrentTab().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                TicketListFragment.this.onTabChange((Integer) obj);
            }
        });
        this.helpdeskViewModel.getRentTicket().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                TicketListFragment.this.showTicketList((List) obj);
            }
        });
        initTabs();
        initAdapter();
        int i = this.selectedTabIndex;
        if (i != 0) {
            this.tabLayout.getTabAt(i).select();
        }
    }

    /* access modifiers changed from: private */
    public void onTabChange(Integer num) {
        boolean z = true;
        if (num.intValue() != 1) {
            z = false;
        }
        this.helpdeskViewModel.getTicketByType(getArguments().getString("arg_ticket_type"), z, this.sectionId);
        this.text = getString(z ? R.string.empty_archive_ticket : R.string.empty_ticket_list);
    }

    /* access modifiers changed from: private */
    public void showTicketList(List<Tickets> list) {
        if (list.size() == 0) {
            this.emptySection.show(true);
            this.emptySection.setData(new SomeString(this.text));
        } else {
            this.emptySection.show(false);
        }
        this.ticketListSection.setData(list);
        this.f6862rv.getVerticalScrollbarPosition();
        this.f6862rv.scrollToPosition(0);
    }

    private void initAdapter() {
        this.linearLayoutManager = new LinearLayoutManager(getActivity());
        this.f6862rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.sectionedAdapter = new SectionedAdapter();
        this.f6862rv.setAdapter(this.sectionedAdapter);
        if (this.ticketListSection == null) {
            this.ticketListSection = new RentTicketListSection();
            this.ticketListSection.getOnClick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    TicketListFragment.this.showTicket((Tickets) obj);
                }
            });
        }
        if (this.emptySection == null) {
            this.emptySection = new EmptySection(false, 14);
            this.emptySection.setData(new SomeString(getString(R.string.empty_ticket_list)));
            this.emptySection.show(false);
        }
        this.sectionedAdapter.addSection(this.emptySection);
        this.sectionedAdapter.addSection(this.ticketListSection);
    }

    private void initTabs() {
        TabLayout tabLayout2 = this.tabLayout;
        tabLayout2.addTab(tabLayout2.newTab().setText((CharSequence) "Текущие заявки"));
        TabLayout tabLayout3 = this.tabLayout;
        tabLayout3.addTab(tabLayout3.newTab().setText((CharSequence) "Архив"));
        this.tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TabLayout.OnTabSelectedListener() {
            public void onTabReselected(TabLayout.Tab tab) {
            }

            public void onTabUnselected(TabLayout.Tab tab) {
            }

            public void onTabSelected(TabLayout.Tab tab) {
                int unused = TicketListFragment.this.selectedTabIndex = tab.getPosition();
                TicketListFragment.this.helpdeskViewModel.getCurrentTab().setValue(Integer.valueOf(tab.getPosition()));
                int position = tab.getPosition();
                if (position == 0) {
                    TicketListFragment.this.helpdeskViewModel.getCurrentTab().setValue(0);
                    TicketListFragment.this.linearLayoutManager.scrollToPositionWithOffset(5, 0);
                } else if (position == 1) {
                    TicketListFragment.this.helpdeskViewModel.getCurrentTab().setValue(1);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        String string = getArguments().getString("arg_ticket_type");
        String str = this.sectionId;
        if (str == null || str.isEmpty()) {
            getBaseActivity().setTextTitle(getString(string.equals("property_service") ? R.string.label_helpdesk_service : R.string.label_helpdesk_rent));
        } else {
            getBaseActivity().setTextTitle(this.title);
        }
    }

    /* access modifiers changed from: private */
    public void showTicket(Tickets tickets) {
        this.helpdeskViewModel.getCurrentTab().setValue(0);
        nextFragment(ServiceTicketFragment.start(String.valueOf(tickets.getTicket().getId())), false);
    }
}
