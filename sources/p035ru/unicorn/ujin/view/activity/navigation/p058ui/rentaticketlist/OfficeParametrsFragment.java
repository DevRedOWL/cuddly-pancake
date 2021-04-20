package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.google.android.material.textfield.TextInputEditText;
import com.jakewharton.rxbinding2.view.RxView;
import com.jakewharton.rxbinding2.widget.RxCompoundButton;
import com.jaredrummler.materialspinner.MaterialSpinner;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.OfficeRentTicket;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.HelpDeskViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.CompanyList;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.CreateMyCompanyFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.MyRentaViewModel;
import p035ru.unicorn.ujin.view.customViews.CalendarView;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.Observable;
import p046io.reactivex.functions.BiFunction;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.OfficeParametrsFragment */
public class OfficeParametrsFragment extends BaseFragment {
    private CalendarView calendarView;
    private MaterialSpinner company;
    private TextInputEditText etSquare;
    private MaterialSpinner floor;
    private HelpDeskViewModel helpdeskViewModel;
    private boolean isOffice;
    private boolean isProduction;
    private TextView labelCompany;
    private TextView labelNeedTransport;
    private TextView labelOffice;
    private TextView labelProd;
    private boolean needEnterToTransport;
    private TextView next;
    private CheckBox office;
    private MaterialSpinner periods;
    private CheckBox prod;
    private MyRentaViewModel rentaViewModel;
    private CheckBox transport;
    private View underline;

    private int getLayoutRes() {
        return R.layout.fragment_office_parametrs;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    private OfficeParametrsFragment() {
    }

    public static OfficeParametrsFragment start(OfficeRentTicket officeRentTicket) {
        OfficeParametrsFragment officeParametrsFragment = new OfficeParametrsFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("rent", officeRentTicket);
        officeParametrsFragment.setArguments(bundle);
        return officeParametrsFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.calendarView = (CalendarView) inflate.findViewById(R.id.calendarView);
        this.calendarView.setTitle("Дата начала аренды");
        this.company = (MaterialSpinner) inflate.findViewById(R.id.spinner_company);
        this.periods = (MaterialSpinner) inflate.findViewById(R.id.spinner);
        this.etSquare = (TextInputEditText) inflate.findViewById(R.id.et_square);
        this.etSquare.setInputType(2);
        this.floor = (MaterialSpinner) inflate.findViewById(R.id.spinner2);
        this.labelCompany = (TextView) inflate.findViewById(R.id.spinner_label_comapy);
        this.labelProd = (TextView) inflate.findViewById(R.id.label4);
        this.labelOffice = (TextView) inflate.findViewById(R.id.label5);
        this.labelNeedTransport = (TextView) inflate.findViewById(R.id.label6);
        this.prod = (CheckBox) inflate.findViewById(R.id.cb1);
        this.office = (CheckBox) inflate.findViewById(R.id.cb2);
        this.office.setChecked(true);
        this.transport = (CheckBox) inflate.findViewById(R.id.cb3);
        this.underline = inflate.findViewById(R.id.view15);
        this.f6913pb = (ProgressBar) inflate.findViewById(R.id.pb);
        initData();
        return inflate;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.helpdeskViewModel = (HelpDeskViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(HelpDeskViewModel.class);
        this.helpdeskViewModel.getAsImDirector();
        this.helpdeskViewModel.getAsImDirectorSingleLiveEvent().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                OfficeParametrsFragment.this.getCompanyList((Resource) obj);
            }
        });
        Observable.combineLatest(RxCompoundButton.checkedChanges(this.office), RxCompoundButton.checkedChanges(this.prod), new BiFunction() {
            public final Object apply(Object obj, Object obj2) {
                return OfficeParametrsFragment.this.lambda$onViewCreated$0$OfficeParametrsFragment((Boolean) obj, (Boolean) obj2);
            }
        }).subscribe();
        RxView.clicks(this.labelOffice).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                OfficeParametrsFragment.this.lambda$onViewCreated$1$OfficeParametrsFragment(obj);
            }
        }).subscribe();
        RxView.clicks(this.labelProd).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                OfficeParametrsFragment.this.lambda$onViewCreated$2$OfficeParametrsFragment(obj);
            }
        }).subscribe();
        RxView.clicks(this.labelNeedTransport).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                OfficeParametrsFragment.this.lambda$onViewCreated$3$OfficeParametrsFragment(obj);
            }
        }).subscribe();
    }

    public /* synthetic */ Boolean lambda$onViewCreated$0$OfficeParametrsFragment(Boolean bool, Boolean bool2) throws Exception {
        this.isOffice = bool.booleanValue();
        this.isProduction = bool2.booleanValue();
        return true;
    }

    public /* synthetic */ void lambda$onViewCreated$1$OfficeParametrsFragment(Object obj) throws Exception {
        CheckBox checkBox = this.office;
        checkBox.setChecked(!checkBox.isChecked());
    }

    public /* synthetic */ void lambda$onViewCreated$2$OfficeParametrsFragment(Object obj) throws Exception {
        CheckBox checkBox = this.prod;
        checkBox.setChecked(!checkBox.isChecked());
    }

    public /* synthetic */ void lambda$onViewCreated$3$OfficeParametrsFragment(Object obj) throws Exception {
        CheckBox checkBox = this.transport;
        checkBox.setChecked(!checkBox.isChecked());
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.OfficeParametrsFragment$1 */
    static /* synthetic */ class C59321 {
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
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.ERROR     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x001f }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.LOADING     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x002a }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.SUCCESS     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.OfficeParametrsFragment.C59321.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void getCompanyList(Resource<CompanyList> resource) {
        if (resource != null) {
            int i = C59321.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                showError();
                this.f6913pb.setVisibility(8);
            } else if (i == 2) {
                this.f6913pb.setVisibility(0);
            } else if (i == 3) {
                this.f6913pb.setVisibility(8);
                List<RentCompany> rentCompany = resource.getData().getRentCompany();
                if (rentCompany != null && rentCompany.isEmpty()) {
                    showDialogNoComapyAsDirector();
                } else if (rentCompany != null && rentCompany.size() == 1) {
                    if (getActivity().getSharedPreferences(getString(R.string.app_name_app), 0).getBoolean("show_dialog", true)) {
                        DialogHelper.showDialog((Context) getActivity(), getString(R.string.dialog_office_rent));
                        getActivity().getSharedPreferences(getString(R.string.app_name_app), 0).edit().putBoolean("show_dialog", false).apply();
                    }
                    this.company.setItems(rentCompany);
                } else if (rentCompany != null && rentCompany.size() > 1) {
                    initCompanySpinner(rentCompany);
                }
            }
        }
    }

    private void initCompanySpinner(List<RentCompany> list) {
        this.labelCompany.setVisibility(0);
        this.company.setVisibility(0);
        this.underline.setVisibility(0);
        this.company.setItems(list);
    }

    private void showDialogNoComapyAsDirector() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage((CharSequence) getString(R.string.dialog_no_comapny_as_director));
        builder.setPositiveButton((int) R.string.button_create_company, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                OfficeParametrsFragment.this.lambda$showDialogNoComapyAsDirector$4$OfficeParametrsFragment(dialogInterface, i);
            }
        });
        builder.setNegativeButton((int) R.string.button_cancel, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                OfficeParametrsFragment.this.lambda$showDialogNoComapyAsDirector$5$OfficeParametrsFragment(dialogInterface, i);
            }
        });
        builder.setMessage((CharSequence) getString(R.string.dialog_no_comapny_as_director));
        builder.setCancelable(false);
        AlertDialog create = builder.create();
        create.setCanceledOnTouchOutside(false);
        create.show();
    }

    public /* synthetic */ void lambda$showDialogNoComapyAsDirector$4$OfficeParametrsFragment(DialogInterface dialogInterface, int i) {
        nextFragment(CreateMyCompanyFragment.start(), false);
        dialogInterface.dismiss();
    }

    public /* synthetic */ void lambda$showDialogNoComapyAsDirector$5$OfficeParametrsFragment(DialogInterface dialogInterface, int i) {
        backFragment();
        dialogInterface.dismiss();
    }

    private void showError() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage((CharSequence) "Ошибка");
        builder.setNegativeButton((int) R.string.button_cancel, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                OfficeParametrsFragment.this.lambda$showError$6$OfficeParametrsFragment(dialogInterface, i);
            }
        });
        AlertDialog create = builder.create();
        create.setCanceledOnTouchOutside(false);
        create.show();
    }

    public /* synthetic */ void lambda$showError$6$OfficeParametrsFragment(DialogInterface dialogInterface, int i) {
        backFragment();
        dialogInterface.dismiss();
    }

    private String getType() {
        StringBuilder sb = new StringBuilder();
        if (this.isOffice) {
            sb.append("Офис");
        }
        if (this.isOffice && this.isProduction) {
            sb.append(", ");
        }
        if (this.isProduction) {
            sb.append("Производство");
        }
        if (!this.isOffice && !this.isProduction) {
            sb.append("не указано");
        }
        return sb.toString();
    }

    private OfficePeriod getPeriod() {
        return (OfficePeriod) this.periods.getItems().get(this.periods.getSelectedIndex());
    }

    private String getFLor() {
        return (String) this.floor.getItems().get(this.floor.getSelectedIndex());
    }

    private void initData() {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.add(6, 1);
        this.calendarView.setStartDate(instance.getTimeInMillis());
        this.calendarView.setMinDate(instance.getTimeInMillis());
        this.periods.setItems(OfficePeriod.getData());
        this.periods.setSelectedIndex(0);
        this.floor.setItems((T[]) new String[]{"Этаж не важен", "1 этаж", "2 этаж", "3 этаж", "4 этаж"});
        this.floor.setSelectedIndex(0);
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle("Офис");
        getBaseActivity().setToolbarRight(createText());
    }

    private ArrayList<View> createText() {
        ArrayList<View> arrayList = new ArrayList<>();
        this.next = new TextView(getActivity());
        this.next.setText(getString(R.string.next));
        this.next.setTextColor(ContextCompat.getColor(getActivity(), R.color.colorAccent));
        this.next.setTextSize(17.0f);
        this.next.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                OfficeParametrsFragment.this.lambda$createText$7$OfficeParametrsFragment(view);
            }
        });
        arrayList.add(this.next);
        return arrayList;
    }

    public /* synthetic */ void lambda$createText$7$OfficeParametrsFragment(View view) {
        makeActoion();
    }

    private void makeActoion() {
        getResult();
        OfficeRentTicket officeRentTicket = (OfficeRentTicket) getArguments().getParcelable("rent");
        if (officeRentTicket != null) {
            officeRentTicket.setEnterpriseId(Integer.parseInt(getCompanyInSpinner().getId()));
            officeRentTicket.setAdditionalData(getResult());
            officeRentTicket.setStartDate(DateUtils.formatDate(Long.valueOf(getStartRent())));
            officeRentTicket.setFinishDate(DateUtils.formatDate(Long.valueOf(getFinishRent())));
            nextFragment(MorionTicketFragmentE.start(officeRentTicket), false);
            return;
        }
        throw new IllegalStateException(" Ошибка бронирования ");
    }

    private long getStartRent() {
        return this.calendarView.getCalendarPrimary().getTimeInMillis();
    }

    private long getFinishRent() {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(getStartRent());
        instance.add(2, getPeriod().getMonthCount());
        return instance.getTimeInMillis();
    }

    private Map<String, String> getResult() {
        String str;
        HashMap hashMap = new HashMap();
        this.company.getVisibility();
        if (this.etSquare.getText() == null || this.etSquare.getText().toString().isEmpty()) {
            hashMap.put("area", "0");
        } else {
            hashMap.put("area", this.etSquare.getText().toString());
        }
        hashMap.put("floor", getFLor());
        String str2 = "Да";
        hashMap.put("is_office", this.isOffice ? str2 : "Нет");
        if (this.isProduction) {
            str = str2;
        } else {
            str = "Нет";
        }
        hashMap.put("is_manufacture", str);
        if (!this.transport.isChecked()) {
            str2 = "Нет";
        }
        hashMap.put("truck_access", str2);
        return hashMap;
    }

    private RentCompany getCompanyInSpinner() {
        return (RentCompany) this.company.getItems().get(this.company.getSelectedIndex());
    }
}
