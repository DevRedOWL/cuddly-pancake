package p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.util.Flavors;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.NavigationBaseFragment;

@Deprecated
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.ticket.TicketDetailFragment */
public class TicketDetailFragment extends NavigationBaseFragment implements View.OnClickListener {

    /* renamed from: ID */
    public static final String f6867ID = "ticket_id";
    private TicketDetailAdapter adapter;
    @BindView(2131363166)

    /* renamed from: pb */
    ProgressBar f6868pb;
    @BindView(2131363322)

    /* renamed from: rv */
    RecyclerView f6869rv;
    TicketViewModel ticketViewModel;
    @BindView(2131363956)
    TextView tvCash;
    @BindView(2131363946)
    TextView tvDate;
    @BindView(2131363951)
    TextView tvLabelIsPaid;
    @BindView(2131363954)
    TextView tvNumber;
    @BindView(2131363959)
    TextView tvSendTo;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_ticket_detail;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
    }

    public static TicketDetailFragment start(String str) {
        TicketDetailFragment ticketDetailFragment = new TicketDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putString(f6867ID, str);
        ticketDetailFragment.setArguments(bundle);
        return ticketDetailFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.tvNumber = (TextView) inflate.findViewById(R.id.tv_number_value);
        this.tvDate = (TextView) inflate.findViewById(R.id.tv_data_value);
        this.tvCash = (TextView) inflate.findViewById(R.id.tv_price_value);
        this.tvLabelIsPaid = (TextView) inflate.findViewById(R.id.tv_label_is_paid);
        this.tvSendTo = (TextView) inflate.findViewById(R.id.tv_send_to);
        this.tvSendTo.setOnClickListener(this);
        this.f6869rv = (RecyclerView) inflate.findViewById(R.id.rv);
        this.f6868pb = (ProgressBar) inflate.findViewById(R.id.pb);
        this.ticketViewModel = (TicketViewModel) ViewModelProviders.m10of((Fragment) this).get(TicketViewModel.class);
        return inflate;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        initAdapter();
        getArguments().getString(f6867ID);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.ticket.TicketDetailFragment$1 */
    static /* synthetic */ class C59401 {
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
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket.TicketDetailFragment.C59401.<clinit>():void");
        }
    }

    private void onGetTicketDetail(Resource<TicketDetail> resource) {
        if (resource != null) {
            int i = C59401.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            boolean z = false;
            if (i == 1) {
                this.f6868pb.setVisibility(0);
            } else if (i == 2) {
                this.f6868pb.setVisibility(8);
                TicketDetail data = resource.getData();
                this.tvNumber.setText(data.getReceiptsNumber());
                this.tvDate.setText(data.getDateTitle());
                this.tvCash.setText(data.getSum() + " " + data.getMeasure());
                if (data.getPaid().intValue() == 1) {
                    z = true;
                }
                this.tvLabelIsPaid.setText(getString(z ? R.string.label_is_paid : R.string.label_not_paid));
                this.tvLabelIsPaid.setBackgroundColor(getResources().getColor(z ? R.color.green_main : R.color.colorI));
                this.adapter.setData(resource.getData().getDescriptions());
            } else if (i == 3) {
                this.f6868pb.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }

    public void setToolbarOptions(Toolbar toolbar) {
        UIHelper.baseBackToolbarTitle(getActivity(), toolbar, Flavors.MYSMARTFLATRN);
    }

    private void initAdapter() {
        this.adapter = new TicketDetailAdapter();
        this.f6869rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f6869rv.setNestedScrollingEnabled(false);
        this.f6869rv.setAdapter(this.adapter);
    }

    public void onSendClick() {
        this.ticketViewModel.sendTicketToEmail().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                TicketDetailFragment.this.onSendTicket((Resource) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public void onSendTicket(Resource<Void> resource) {
        if (resource != null) {
            int i = C59401.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6868pb.setVisibility(0);
            } else if (i == 2) {
                this.f6868pb.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), "Квитанция отправлена вам на почту", "Успешно");
            } else if (i == 3) {
                this.f6868pb.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.tv_send_to) {
            onSendClick();
        }
    }
}
