package p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import java.util.List;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;

@Deprecated
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.ticket.TicketFragment */
public class TicketFragment extends BaseFragment {
    private AccountAdapter accountAdapter;
    private TicketAdapter adapter;
    @BindView(2131363166)

    /* renamed from: pb */
    ProgressBar f6870pb;
    @BindView(2131363322)

    /* renamed from: rv */
    RecyclerView f6871rv;
    TextView ticketTitle;
    private TicketViewModel ticketViewModel;
    TextView tvTicketSum;

    /* access modifiers changed from: private */
    public void onAccountClick(List<Ticket> list) {
    }

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_ticket;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    public static TicketFragment start() {
        TicketFragment ticketFragment = new TicketFragment();
        ticketFragment.setArguments(new Bundle());
        return ticketFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.f6871rv = (RecyclerView) inflate.findViewById(R.id.rv);
        this.f6870pb = (ProgressBar) inflate.findViewById(R.id.pb);
        this.ticketTitle = (TextView) inflate.findViewById(R.id.tv_ticket_title);
        this.tvTicketSum = (TextView) inflate.findViewById(R.id.tv_ticket_summ);
        return inflate;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        initAdapter();
        this.ticketViewModel = (TicketViewModel) ViewModelProviders.m10of((Fragment) this).get(TicketViewModel.class);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.ticket.TicketFragment$1 */
    static /* synthetic */ class C59411 {
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
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket.TicketFragment.C59411.<clinit>():void");
        }
    }

    private void showTickets(Resource<TicketUnder> resource) {
        if (resource != null) {
            int i = C59411.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            boolean z = false;
            if (i == 1) {
                this.f6870pb.setVisibility(0);
            } else if (i == 2) {
                this.f6870pb.setVisibility(8);
                List<TicketList> ticketList = resource.getData().getTicketList();
                if (ticketList.size() > 1) {
                    z = true;
                }
                showTicketOrAccount(z);
                this.f6871rv.setAdapter(this.adapter);
                this.adapter.setData(ticketList);
            } else if (i == 3) {
                this.f6870pb.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }

    private void showTicketOrAccount(boolean z) {
        this.tvTicketSum.setVisibility(z ? 4 : 0);
        this.ticketTitle.setText(getString(z ? R.string.label_ticket_account : R.string.label_date));
    }

    private void initAdapter() {
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getActivity(), 1);
        this.accountAdapter = new AccountAdapter();
        this.adapter = new TicketAdapter();
        this.f6871rv.addItemDecoration(dividerItemDecoration);
        this.f6871rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f6871rv.setNestedScrollingEnabled(false);
        this.adapter.ticketClicks().subscribe(new Consumer() {
            public final void accept(Object obj) {
                TicketFragment.this.onTicketClick((TicketList) obj);
            }
        });
        this.accountAdapter.accountClicks().subscribe(new Consumer() {
            public final void accept(Object obj) {
                TicketFragment.this.onAccountClick((List) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public void onTicketClick(TicketList ticketList) {
        nextFragment(TicketDetailFragment.start(ticketList.getTickets().getId()), false);
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getString(R.string.label_kvit));
    }
}
