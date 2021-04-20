package p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import com.jakewharton.rxbinding2.view.RxView;
import com.jakewharton.rxbinding2.widget.RxTextView;
import java.math.BigDecimal;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.util.AmounTextWatcher;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket.TicketViewModel;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.tickets.PaymentFormFragment */
public class PaymentFormFragment extends TicketBaseFragment {
    public static final String ACCOUNT_ID = "account_id";
    public static final String AMOUNT = "amount";
    public static final String SERVICE_TITLE = "service_title";
    private int accountId;
    private BigDecimal balance;
    private Button btnPay;
    private EditText etAmount;
    private ScrollView formLayout;

    /* renamed from: pb */
    private ProgressBar f6878pb;
    private String receiptAmount;

    /* renamed from: rv */
    private RecyclerView f6879rv;
    private SectionedAdapter sectionedAdapter;
    private String serviceTitle;
    private TicketDescriptionSection ticketDescriptionSection;
    private TicketViewModel ticketViewModel;
    private TextInputLayout tilAmountOfPayment;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_ticket_payment_form;
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

    public static PaymentFormFragment start(int i, String str, String str2) {
        PaymentFormFragment paymentFormFragment = new PaymentFormFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("account_id", i);
        bundle.putString("service_title", str);
        bundle.putString(AMOUNT, str2);
        paymentFormFragment.setArguments(bundle);
        return paymentFormFragment;
    }

    public static PaymentFormFragment start(int i, String str) {
        return start(i, str, "");
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.f6879rv = (RecyclerView) inflate.findViewById(R.id.rv);
        this.f6878pb = (ProgressBar) inflate.findViewById(R.id.pb);
        this.formLayout = (ScrollView) inflate.findViewById(R.id.formLayout);
        this.etAmount = (EditText) inflate.findViewById(R.id.etAmountOfPayment);
        this.tilAmountOfPayment = (TextInputLayout) inflate.findViewById(R.id.tilAmountOfPayment);
        this.btnPay = (Button) inflate.findViewById(R.id.btnPay);
        this.btnPay.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                PaymentFormFragment.this.lambda$onCreateView$0$PaymentFormFragment(view);
            }
        });
        RxTextView.textChanges(this.etAmount).map($$Lambda$PaymentFormFragment$T529uJHO46I2amYE3UGlBNtW72A.INSTANCE).subscribe(new Consumer() {
            public final void accept(Object obj) {
                PaymentFormFragment.this.lambda$onCreateView$2$PaymentFormFragment((Boolean) obj);
            }
        });
        RxView.globalLayouts(inflate).subscribe(new Consumer(inflate) {
            private final /* synthetic */ View f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                PaymentFormFragment.this.lambda$onCreateView$3$PaymentFormFragment(this.f$1, obj);
            }
        });
        setViewVisibility(false);
        return inflate;
    }

    public /* synthetic */ void lambda$onCreateView$0$PaymentFormFragment(View view) {
        UIHelper.hideKeyboard(getBaseActivity(), this.etAmount);
        this.ticketViewModel.getAccountPaymentLink(this.accountId, new BigDecimal(this.etAmount.getText().toString().replace(" ", "")));
    }

    static /* synthetic */ Boolean lambda$onCreateView$1(CharSequence charSequence) throws Exception {
        return Boolean.valueOf(charSequence != null && !charSequence.toString().isEmpty());
    }

    public /* synthetic */ void lambda$onCreateView$2$PaymentFormFragment(Boolean bool) throws Exception {
        this.btnPay.setEnabled(bool.booleanValue());
    }

    public /* synthetic */ void lambda$onCreateView$3$PaymentFormFragment(View view, Object obj) throws Exception {
        onRootViewChanged(view);
    }

    private void onRootViewChanged(View view) {
        this.formLayout.scrollTo(0, this.etAmount.getBottom() + 150);
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        this.accountId = getArguments().getInt("account_id");
        this.serviceTitle = getArguments().getString("service_title");
        this.receiptAmount = getArguments().getString(AMOUNT);
        this.etAmount.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                PaymentFormFragment.this.lambda$onActivityCreated$4$PaymentFormFragment(view);
            }
        });
        EditText editText = this.etAmount;
        editText.addTextChangedListener(new AmounTextWatcher(editText));
        if (StringUtils.isNotEmpty(this.receiptAmount)) {
            this.etAmount.setText(this.receiptAmount);
            EditText editText2 = this.etAmount;
            editText2.setSelection(editText2.getText().toString().length());
        }
        this.ticketViewModel = (TicketViewModel) ViewModelProviders.m10of((Fragment) this).get(TicketViewModel.class);
        this.ticketViewModel.getOperations(this.accountId);
        this.ticketViewModel.getTicket().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                PaymentFormFragment.this.showAccountDetails((Resource) obj);
            }
        });
        this.ticketViewModel.getShowLoader().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                PaymentFormFragment.this.lambda$onActivityCreated$5$PaymentFormFragment((Boolean) obj);
            }
        });
        this.ticketViewModel.getAccountPaymentLink().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                PaymentFormFragment.this.showPaymentWebView((Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onActivityCreated$4$PaymentFormFragment(View view) {
        this.etAmount.requestFocusFromTouch();
    }

    public /* synthetic */ void lambda$onActivityCreated$5$PaymentFormFragment(Boolean bool) {
        showLoader(bool, this.f6878pb);
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        initAdapter();
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.tickets.PaymentFormFragment$1 */
    static /* synthetic */ class C59441 {
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
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.PaymentFormFragment.C59441.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void showAccountDetails(Resource<AccountTicket> resource) {
        if (resource != null) {
            int i = C59441.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6878pb.setVisibility(0);
            } else if (i == 2) {
                this.f6878pb.setVisibility(8);
                if (resource.getData() != null) {
                    setViewVisibility(true);
                    Double currentBalance = resource.getData().getCurrentBalance();
                    if (currentBalance != null) {
                        this.balance = new BigDecimal(currentBalance.doubleValue()).setScale(2, 4);
                        BigDecimal bigDecimal = this.balance;
                        if (bigDecimal != null && bigDecimal.compareTo(BigDecimal.ZERO) < 0) {
                            this.etAmount.setText(this.balance.abs().toString());
                            EditText editText = this.etAmount;
                            editText.setSelection(editText.getText().toString().length());
                        }
                    }
                    List<OperationModel> makePaymentModel = AccountTicket.makePaymentModel(resource.getData(), this.serviceTitle, this.ticketViewModel.getCurrentFlatAddress());
                    if (!makePaymentModel.isEmpty()) {
                        this.ticketDescriptionSection.setData(makePaymentModel);
                    }
                }
            } else if (i == 3) {
                this.f6878pb.setVisibility(8);
                showMessage(getResources().getString(R.string.internalError));
            }
        }
    }

    private void setViewVisibility(boolean z) {
        int i = 0;
        this.f6879rv.setVisibility(z ? 0 : 8);
        this.tilAmountOfPayment.setVisibility(z ? 0 : 8);
        Button button = this.btnPay;
        if (!z) {
            i = 8;
        }
        button.setVisibility(i);
    }

    private void initAdapter() {
        this.f6879rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.sectionedAdapter = new SectionedAdapter();
        this.f6879rv.setAdapter(this.sectionedAdapter);
        this.f6879rv.addItemDecoration(new DividerItemDecoration(getActivity(), 1));
        if (this.ticketDescriptionSection == null) {
            this.ticketDescriptionSection = new TicketDescriptionSection();
        }
        this.sectionedAdapter.addSection(this.ticketDescriptionSection);
    }

    /* access modifiers changed from: private */
    public void showPaymentWebView(Resource<AccountPaymentLink> resource) {
        if (resource != null) {
            int i = C59441.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6878pb.setVisibility(0);
            } else if (i == 2) {
                this.f6878pb.setVisibility(8);
                startPaymentActivity(resource.getData().getPaymentLink());
            } else if (i == 3) {
                this.f6878pb.setVisibility(8);
                showMessage(getResources().getString(R.string.internalError));
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1 && intent.getBooleanExtra("success", false)) {
            openTicketsFragment();
        }
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getString(R.string.topUpBalanceTitle));
    }
}
