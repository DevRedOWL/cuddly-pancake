package p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import com.jakewharton.rxbinding2.widget.RxTextView;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.TicketDetailFragment;
import p035ru.unicorn.ujin.view.service.DownloadService;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.tickets.TicketDetailFragment */
public class TicketDetailFragment extends TicketBaseFragment {
    public static final String ACCOUNT_ID = "account_id";
    private static final String AMOUNT = "amount";
    public static final String OPERATION_ID = "operation_id";
    public static final String OPERATION_TYPE = "operation_type";
    private static final String PAYMENT_AVAILABLE = "payment_available";
    public static final String SERVICE_TITLE = "service_title";
    private int accountId;
    private Button btnPayBill;
    private String currentServiceTitle;
    private TicketDescriptionSection detailSection;
    private EditText etAmount;
    private String operationType;
    private boolean paymentAvailable;

    /* renamed from: pb */
    private ProgressBar f6880pb;
    private String receiptAmount;

    /* renamed from: rv */
    private RecyclerView f6881rv;
    private SectionedAdapter sectionedAdapter;
    private TicketViewModel ticketViewModel;
    private TextInputLayout tilAmountOfPayment;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_ticket_details;
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

    public static TicketDetailFragment start(String str, int i, String str2, String str3, String str4, boolean z) {
        TicketDetailFragment ticketDetailFragment = new TicketDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putString(OPERATION_ID, str);
        bundle.putInt("account_id", i);
        bundle.putString("service_title", str2);
        bundle.putString(OPERATION_TYPE, str3);
        bundle.putString("amount", str4);
        bundle.putBoolean(PAYMENT_AVAILABLE, z);
        ticketDetailFragment.setArguments(bundle);
        return ticketDetailFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.f6881rv = (RecyclerView) inflate.findViewById(R.id.rv);
        this.f6880pb = (ProgressBar) inflate.findViewById(R.id.pb);
        this.btnPayBill = (Button) inflate.findViewById(R.id.btnPayBill);
        this.etAmount = (EditText) inflate.findViewById(R.id.etAmountOfPayment);
        this.tilAmountOfPayment = (TextInputLayout) inflate.findViewById(R.id.tilAmountOfPayment);
        return inflate;
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        String string = getArguments().getString(OPERATION_ID);
        this.accountId = getArguments().getInt("account_id");
        this.currentServiceTitle = getArguments().getString("service_title");
        this.operationType = getArguments().getString(OPERATION_TYPE, "");
        this.receiptAmount = getArguments().getString("amount");
        this.paymentAvailable = getArguments().getBoolean(PAYMENT_AVAILABLE, false);
        this.ticketViewModel = (TicketViewModel) ViewModelProviders.m10of((Fragment) this).get(TicketViewModel.class);
        this.ticketViewModel.getOperationDescription(string, this.accountId);
        this.ticketViewModel.getOperationAsKeyValue().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                TicketDetailFragment.this.showOperationDetails((List) obj);
            }
        });
        this.ticketViewModel.getShowLoader().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                TicketDetailFragment.this.lambda$onActivityCreated$0$TicketDetailFragment((Boolean) obj);
            }
        });
        this.ticketViewModel.getAccountPaymentLink().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                TicketDetailFragment.this.showPaymentWebView((Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onActivityCreated$0$TicketDetailFragment(Boolean bool) {
        showLoader(bool, this.f6880pb);
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        initAdapter();
    }

    private void showAccountPaymentForm(Integer num) {
        nextFragment(PaymentFormFragment.start(num.intValue(), this.currentServiceTitle, this.receiptAmount), false, FRAGMENT_PAYMENT_FORM);
    }

    /* access modifiers changed from: private */
    public void showOperationDetails(List<OperationModel> list) {
        this.detailSection.setData(list);
        if (this.paymentAvailable && !this.ticketViewModel.isDemoUser().booleanValue() && StringUtils.isNotEmpty(this.operationType)) {
            int i = C59462.f6882x52e146b1[OperationType.valueOf(this.operationType.toUpperCase()).ordinal()];
            if (i == 1) {
                this.btnPayBill.setVisibility(0);
                this.btnPayBill.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        TicketDetailFragment.this.lambda$showOperationDetails$1$TicketDetailFragment(view);
                    }
                });
                this.tilAmountOfPayment.setVisibility(0);
                this.etAmount.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        TicketDetailFragment.this.lambda$showOperationDetails$2$TicketDetailFragment(view);
                    }
                });
                EditText editText = this.etAmount;
                editText.addTextChangedListener(new AmounTextWatcher(editText));
                RxTextView.textChanges(this.etAmount).map($$Lambda$TicketDetailFragment$vm58XbCc0b7mqFHGQKpuufVTUE.INSTANCE).subscribe(new Consumer() {
                    public final void accept(Object obj) {
                        TicketDetailFragment.this.lambda$showOperationDetails$4$TicketDetailFragment((Boolean) obj);
                    }
                });
                if (StringUtils.isNotEmpty(this.receiptAmount)) {
                    BigDecimal abs = new BigDecimal(this.receiptAmount).setScale(2, 4).abs();
                    if (abs.compareTo(BigDecimal.ZERO) > 0) {
                        this.etAmount.setText(abs.toString());
                        EditText editText2 = this.etAmount;
                        editText2.setSelection(editText2.getText().toString().length());
                    }
                }
            } else if (i == 2 || i == 3 || i == 4) {
                this.btnPayBill.setVisibility(8);
            }
        }
    }

    public /* synthetic */ void lambda$showOperationDetails$1$TicketDetailFragment(View view) {
        UIHelper.hideKeyboard(getContext(), this.etAmount);
        this.ticketViewModel.getAccountPaymentLink(this.accountId, new BigDecimal(this.etAmount.getText().toString().replace(" ", "")));
    }

    public /* synthetic */ void lambda$showOperationDetails$2$TicketDetailFragment(View view) {
        this.etAmount.requestFocusFromTouch();
    }

    static /* synthetic */ Boolean lambda$showOperationDetails$3(CharSequence charSequence) throws Exception {
        return Boolean.valueOf(charSequence != null && !charSequence.toString().isEmpty());
    }

    public /* synthetic */ void lambda$showOperationDetails$4$TicketDetailFragment(Boolean bool) throws Exception {
        this.btnPayBill.setEnabled(bool.booleanValue());
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.tickets.TicketDetailFragment$2 */
    static /* synthetic */ class C59462 {
        static final /* synthetic */ int[] $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status = new int[Resource.Status.values().length];

        /* renamed from: $SwitchMap$ru$unicorn$ujin$view$activity$navigation$ui$tickets$OperationType */
        static final /* synthetic */ int[] f6882x52e146b1 = new int[OperationType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0051 */
        static {
            /*
                ru.unicorn.ujin.data.realm.Resource$Status[] r0 = p035ru.unicorn.ujin.data.realm.Resource.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status = r0
                r0 = 1
                int[] r1 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x0014 }
                ru.unicorn.ujin.data.realm.Resource$Status r2 = p035ru.unicorn.ujin.data.realm.Resource.Status.LOADING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x001f }
                ru.unicorn.ujin.data.realm.Resource$Status r3 = p035ru.unicorn.ujin.data.realm.Resource.Status.SUCCESS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x002a }
                ru.unicorn.ujin.data.realm.Resource$Status r4 = p035ru.unicorn.ujin.data.realm.Resource.Status.ERROR     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                ru.unicorn.ujin.view.activity.navigation.ui.tickets.OperationType[] r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.OperationType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f6882x52e146b1 = r3
                int[] r3 = f6882x52e146b1     // Catch:{ NoSuchFieldError -> 0x003d }
                ru.unicorn.ujin.view.activity.navigation.ui.tickets.OperationType r4 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.OperationType.RECEIPT     // Catch:{ NoSuchFieldError -> 0x003d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                int[] r0 = f6882x52e146b1     // Catch:{ NoSuchFieldError -> 0x0047 }
                ru.unicorn.ujin.view.activity.navigation.ui.tickets.OperationType r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.OperationType.FILL     // Catch:{ NoSuchFieldError -> 0x0047 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0047 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                int[] r0 = f6882x52e146b1     // Catch:{ NoSuchFieldError -> 0x0051 }
                ru.unicorn.ujin.view.activity.navigation.ui.tickets.OperationType r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.OperationType.PAYMENT     // Catch:{ NoSuchFieldError -> 0x0051 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0051 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0051 }
            L_0x0051:
                int[] r0 = f6882x52e146b1     // Catch:{ NoSuchFieldError -> 0x005c }
                ru.unicorn.ujin.view.activity.navigation.ui.tickets.OperationType r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.OperationType.EDIT     // Catch:{ NoSuchFieldError -> 0x005c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005c }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005c }
            L_0x005c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.TicketDetailFragment.C59462.<clinit>():void");
        }
    }

    private void showTickets(Resource<List<Tickets>> resource) {
        if (resource != null) {
            int i = C59462.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6880pb.setVisibility(0);
            } else if (i == 2) {
                this.f6880pb.setVisibility(8);
            } else if (i == 3) {
                this.f6880pb.setVisibility(8);
            }
        }
    }

    private void initAdapter() {
        this.f6881rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.sectionedAdapter = new SectionedAdapter();
        this.f6881rv.setAdapter(this.sectionedAdapter);
        new DividerItemDecoration(getBaseActivity(), 1).setDrawable(getBaseActivity().getResources().getDrawable(R.drawable.line_decoration));
        this.f6881rv.addItemDecoration(new DividerItemDecoration(getBaseActivity(), 1));
        if (this.detailSection == null) {
            this.detailSection = new TicketDescriptionSection();
            this.detailSection.getOnClick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    TicketDetailFragment.this.onDownloadClick((OperationModel) obj);
                }
            });
        }
        this.sectionedAdapter.addSection(this.detailSection);
    }

    /* access modifiers changed from: private */
    public void onDownloadClick(final OperationModel operationModel) {
        Dexter.withActivity(getActivity()).withPermission("android.permission.WRITE_EXTERNAL_STORAGE").withListener(new PermissionListener() {
            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
            }

            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                TicketDetailFragment.this.startDownload(operationModel);
            }

            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                AlertDialog.Builder builder = new AlertDialog.Builder(TicketDetailFragment.this.getActivity());
                builder.setMessage((CharSequence) TicketDetailFragment.this.getResources().getString(R.string.storagePermissionMessage)).setPositiveButton((CharSequence) TicketDetailFragment.this.getResources().getString(R.string.button_OK), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        PermissionToken.this.continuePermissionRequest();
                    }
                }).setNegativeButton((CharSequence) TicketDetailFragment.this.getResources().getString(R.string.button_CANCEL), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        TicketDetailFragment.C59451.lambda$onPermissionRationaleShouldBeShown$1(PermissionToken.this, dialogInterface, i);
                    }
                });
                builder.show().setCanceledOnTouchOutside(false);
            }

            static /* synthetic */ void lambda$onPermissionRationaleShouldBeShown$1(PermissionToken permissionToken, DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                permissionToken.cancelPermissionRequest();
            }
        }).check();
    }

    /* access modifiers changed from: private */
    public void startDownload(OperationModel operationModel) {
        Intent intent = new Intent(getActivity(), DownloadService.class);
        intent.putExtra(DownloadService.ARG_URL, operationModel.getProperties().getUrl());
        intent.putExtra(DownloadService.ARG_FILE_NAME, operationModel.getKey());
        getActivity().startService(intent);
    }

    /* access modifiers changed from: private */
    public void showPaymentWebView(Resource<AccountPaymentLink> resource) {
        if (resource != null) {
            int i = C59462.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6880pb.setVisibility(0);
            } else if (i == 2) {
                this.f6880pb.setVisibility(8);
                startPaymentActivity(resource.getData().getPaymentLink());
            } else if (i == 3) {
                this.f6880pb.setVisibility(8);
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
        if (StringUtils.isNotEmpty(this.operationType)) {
            getBaseActivity().setTextTitle(OperationType.valueOf(this.operationType.toUpperCase()).getTitle());
        }
    }
}
