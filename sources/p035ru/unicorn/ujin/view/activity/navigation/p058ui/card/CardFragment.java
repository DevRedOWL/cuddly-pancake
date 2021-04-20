package p035ru.unicorn.ujin.view.activity.navigation.p058ui.card;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.jakewharton.rxbinding2.view.RxView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.CardData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.util.ErrorResetWatcher;
import p035ru.unicorn.ujin.util.Validator;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SimpleViewModel;
import p035ru.unicorn.ujin.view.customViews.fields.PhoneMaskedEditText;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.card.CardFragment */
public class CardFragment extends BaseFragment implements DatePickerDialog.OnDateSetListener {
    public static final String ARG_BRAND = "brand";
    public static final String ARG_CAR_OWNER = "car_owner";
    public static final String ARG_COMMENT = "comment";
    public static final String ARG_DATE_END = "dateEnd";
    public static final String ARG_DATE_START = "dateStart";
    public static final String ARG_EDITABLE = "arg_editable";
    public static final String ARG_FIRST = "ARG_FIRST";
    public static final String ARG_ID = "arg_id";
    public static final String ARG_IS_VEHICLE = "arg_is_vehicle";
    public static final String ARG_NAME = "name";
    public static final String ARG_NUMBER = "number";
    public static final String ARG_SECOND = "ARG_SECOND";
    public static final String CAR = "Машина";
    public static final String MAN = "Человек";
    private Button btnAddCode;
    Calendar calendar;
    private TextInputEditText etCarModel;
    private TextInputEditText etCarNumber;
    private TextInputEditText etCarOwner;
    private TextInputEditText etComment;
    private TextInputEditText etDate;
    private PhoneMaskedEditText etPhone;
    boolean isVehilce = false;

    /* renamed from: pb */
    private ProgressBar f6744pb;
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
    SimpleViewModel simpleViewModel;
    private TabLayout tabLayout;
    private TextInputLayout tilCarModel;
    private TextInputLayout tilCarNumber;
    private TextInputLayout tilCarOwner;
    /* access modifiers changed from: private */
    public TextInputLayout tilDate;
    private TextInputLayout tilPhone;
    private TabLayout tlPassType;
    private TabLayout.OnTabSelectedListener tlTimedSelectListener = new TabLayout.OnTabSelectedListener() {
        public void onTabReselected(TabLayout.Tab tab) {
        }

        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public void onTabSelected(TabLayout.Tab tab) {
            String string = CardFragment.this.getResources().getString(R.string.passTimedUntilTo);
            String string2 = CardFragment.this.getResources().getString(R.string.passTimedSingleUse);
            if (tab.getText().equals(string)) {
                CardFragment.this.tilDate.setHint((CharSequence) "Действителен до");
            } else if (tab.getText().toString().equals(string2)) {
                CardFragment.this.tilDate.setHint((CharSequence) "Введите дату");
            }
        }
    };

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_card;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    public static CardFragment start(boolean z) {
        CardFragment cardFragment = new CardFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean(ARG_EDITABLE, z);
        cardFragment.setArguments(bundle);
        return cardFragment;
    }

    public static CardFragment startVehicle(boolean z, boolean z2, String str, String str2, String str3, String str4, long j, long j2, String str5) {
        CardFragment cardFragment = new CardFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean(ARG_EDITABLE, z);
        bundle.putBoolean(ARG_IS_VEHICLE, z2);
        bundle.putString(ARG_NUMBER, str);
        bundle.putString(ARG_BRAND, str2);
        bundle.putString(ARG_CAR_OWNER, str3);
        bundle.putString("comment", str4);
        bundle.putLong(ARG_DATE_END, j2);
        bundle.putLong(ARG_DATE_START, j);
        bundle.putString("arg_id", str5);
        cardFragment.setArguments(bundle);
        return cardFragment;
    }

    public static CardFragment startGuest(boolean z, boolean z2, String str, String str2, String str3, long j, long j2, String str4) {
        CardFragment cardFragment = new CardFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean(ARG_EDITABLE, z);
        bundle.putBoolean(ARG_IS_VEHICLE, z2);
        bundle.putString("name", str);
        bundle.putString(ARG_NUMBER, str2);
        bundle.putString("comment", str3);
        bundle.putLong(ARG_DATE_END, j2);
        bundle.putLong(ARG_DATE_START, j);
        bundle.putString("arg_id", str4);
        cardFragment.setArguments(bundle);
        return cardFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.btnAddCode = (Button) inflate.findViewById(R.id.btn_add_code);
        this.tabLayout = (TabLayout) inflate.findViewById(R.id.tab);
        this.f6744pb = (ProgressBar) inflate.findViewById(R.id.pb);
        this.etDate = (TextInputEditText) inflate.findViewById(R.id.et_date);
        this.etCarNumber = (TextInputEditText) inflate.findViewById(R.id.et_car_number);
        this.etCarModel = (TextInputEditText) inflate.findViewById(R.id.et_brand);
        this.etComment = (TextInputEditText) inflate.findViewById(R.id.et_comment);
        this.etCarOwner = (TextInputEditText) inflate.findViewById(R.id.et_car_owner);
        this.tilDate = (TextInputLayout) inflate.findViewById(R.id.til_date);
        this.tilCarNumber = (TextInputLayout) inflate.findViewById(R.id.til_car_number);
        this.tilCarModel = (TextInputLayout) inflate.findViewById(R.id.til_brand);
        this.tlPassType = (TabLayout) inflate.findViewById(R.id.tlPassType);
        this.tilCarOwner = (TextInputLayout) inflate.findViewById(R.id.til_car_owner);
        this.tilPhone = (TextInputLayout) inflate.findViewById(R.id.tilPhone);
        this.etPhone = (PhoneMaskedEditText) inflate.findViewById(R.id.etPhone);
        this.isVehilce = getArguments().getBoolean(ARG_IS_VEHICLE);
        initTabs();
        if (!getArguments().getBoolean(ARG_EDITABLE, false)) {
            boolean z = getArguments().getBoolean(ARG_IS_VEHICLE);
            this.etCarNumber.setText(getArguments().getString(z ? ARG_NUMBER : "name"));
            this.etCarModel.setText(getArguments().getString(z ? ARG_BRAND : ARG_NUMBER));
            this.etCarOwner.setText(z ? getArguments().getString(ARG_CAR_OWNER) : "");
            if (z) {
                this.tilPhone.setVisibility(8);
                this.tilCarModel.setVisibility(0);
                this.etCarModel.setText(getArguments().getString(ARG_BRAND));
            } else {
                this.tilCarModel.setVisibility(8);
                this.tilPhone.setVisibility(0);
                this.etPhone.setText(getArguments().getString(ARG_NUMBER));
            }
            this.etComment.setText(getArguments().getString("comment"));
            this.etDate.setText(this.sdf.format(new Date(getArguments().getLong(ARG_DATE_END) * 1000)));
            this.etCarOwner.setFocusable(false);
            this.etCarNumber.setFocusable(false);
            this.etCarModel.setFocusable(false);
            this.etDate.setFocusable(false);
            this.etComment.setFocusable(false);
            this.etPhone.setFocusable(false);
            this.btnAddCode.setVisibility(4);
            setDateHints();
            this.tabLayout.setVisibility(8);
        } else {
            this.etCarNumber.addTextChangedListener(new ErrorResetWatcher(this.tilCarNumber));
            this.etCarModel.addTextChangedListener(new ErrorResetWatcher(this.tilCarModel));
            this.etPhone.addTextChangedListener(new ErrorResetWatcher(this.tilPhone));
            this.etDate.addTextChangedListener(new ErrorResetWatcher(this.tilDate));
            if (getContext().getResources().getBoolean(R.bool.passChooseTemp)) {
                this.tlPassType.setVisibility(0);
                this.tlPassType.addOnTabSelectedListener(this.tlTimedSelectListener);
            } else {
                this.tlPassType.setVisibility(8);
            }
            RxView.clicks(this.btnAddCode).map(new Function() {
                public final Object apply(Object obj) {
                    return CardFragment.this.lambda$onCreateView$0$CardFragment(obj);
                }
            }).filter($$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE).map(new Function() {
                public final Object apply(Object obj) {
                    return CardFragment.this.lambda$onCreateView$1$CardFragment((Boolean) obj);
                }
            }).filter($$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE).map(new Function() {
                public final Object apply(Object obj) {
                    return CardFragment.this.lambda$onCreateView$2$CardFragment((Boolean) obj);
                }
            }).filter($$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE).map(new Function() {
                public final Object apply(Object obj) {
                    return CardFragment.this.lambda$onCreateView$3$CardFragment((Boolean) obj);
                }
            }).filter($$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE).map(new Function() {
                public final Object apply(Object obj) {
                    return CardFragment.this.lambda$onCreateView$4$CardFragment((Boolean) obj);
                }
            }).filter($$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE).subscribe(new Consumer() {
                public final void accept(Object obj) {
                    CardFragment.this.lambda$onCreateView$5$CardFragment((Boolean) obj);
                }
            });
            this.etDate.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                public final void onFocusChange(View view, boolean z) {
                    CardFragment.this.lambda$onCreateView$6$CardFragment(view, z);
                }
            });
            this.calendar = Calendar.getInstance();
            onDateSet((DatePicker) null, this.calendar.get(1), this.calendar.get(2), this.calendar.get(5));
        }
        return inflate;
    }

    public /* synthetic */ Boolean lambda$onCreateView$0$CardFragment(Object obj) throws Exception {
        return Boolean.valueOf(Validator.validate(this.etCarNumber, this.tilCarNumber));
    }

    public /* synthetic */ Boolean lambda$onCreateView$1$CardFragment(Boolean bool) throws Exception {
        return Boolean.valueOf(Validator.validate(this.etCarModel, this.tilCarModel));
    }

    public /* synthetic */ Boolean lambda$onCreateView$2$CardFragment(Boolean bool) throws Exception {
        return Boolean.valueOf(Validator.validate(this.etPhone, this.tilPhone));
    }

    public /* synthetic */ Boolean lambda$onCreateView$3$CardFragment(Boolean bool) throws Exception {
        return Boolean.valueOf(Validator.validate(this.etDate, this.tilDate));
    }

    public /* synthetic */ Boolean lambda$onCreateView$4$CardFragment(Boolean bool) throws Exception {
        if (this.tilDate.getVisibility() == 0 && !Validator.isCorrectFormatDate(this.etDate.getText().toString())) {
            return false;
        }
        if (this.tilPhone.getVisibility() == 0 && !this.etPhone.isValid()) {
            this.tilPhone.setError(getString(R.string.error_date_format));
            return false;
        } else if (this.tilCarModel.getVisibility() != 0 || !this.etCarModel.getText().toString().isEmpty()) {
            return bool;
        } else {
            return false;
        }
    }

    public /* synthetic */ void lambda$onCreateView$5$CardFragment(Boolean bool) throws Exception {
        onOrderClick();
    }

    public /* synthetic */ void lambda$onCreateView$6$CardFragment(View view, boolean z) {
        if (z) {
            onDateClick();
        }
    }

    private void setDateHints() {
        if (getArguments().getLong(ARG_DATE_END) - getArguments().getLong(ARG_DATE_START) > 86400) {
            this.tilDate.setHint((CharSequence) "Действителен до");
        } else {
            this.tilDate.setHint((CharSequence) "Дата");
        }
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.simpleViewModel = (SimpleViewModel) ViewModelProviders.m10of((Fragment) this).get(SimpleViewModel.class);
        if (getArguments().getBoolean(ARG_EDITABLE)) {
            this.simpleViewModel.getCardTypeLiveData().setValue(getArguments().getBoolean(ARG_IS_VEHICLE) ? CAR : MAN);
        } else {
            this.simpleViewModel.getCardTypeLiveData().setValue("-1");
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00f2, code lost:
        if (r1.equals(MAN) != false) goto L_0x00f6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onOrderClick() {
        /*
            r20 = this;
            r0 = r20
            ru.unicorn.ujin.view.activity.navigation.ui.navigation.SimpleViewModel r1 = r0.simpleViewModel
            androidx.lifecycle.MutableLiveData r1 = r1.getCardTypeLiveData()
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            android.content.res.Resources r2 = r20.getResources()
            r3 = 2131034161(0x7f050031, float:1.7678832E38)
            boolean r2 = r2.getBoolean(r3)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.util.Calendar r10 = java.util.Calendar.getInstance()
            java.util.Calendar r3 = r0.calendar
            r11 = 1
            int r4 = r3.get(r11)
            java.util.Calendar r3 = r0.calendar
            r5 = 2
            int r5 = r3.get(r5)
            java.util.Calendar r3 = r0.calendar
            r6 = 5
            int r6 = r3.get(r6)
            r7 = 0
            r8 = 0
            r9 = 0
            r3 = r10
            r3.set(r4, r5, r6, r7, r8, r9)
            java.util.Calendar r3 = java.util.Calendar.getInstance()
            r4 = 0
            r5 = 11
            r3.set(r5, r4)
            r5 = 12
            r3.set(r5, r4)
            r5 = 13
            r3.set(r5, r4)
            com.google.android.material.textfield.TextInputEditText r5 = r0.etComment
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            boolean r6 = r2.booleanValue()
            r7 = 2131887587(0x7f1205e3, float:1.9409785E38)
            r8 = 1000(0x3e8, double:4.94E-321)
            if (r6 == 0) goto L_0x0090
            com.google.android.material.tabs.TabLayout r6 = r0.tlPassType
            int r12 = r6.getSelectedTabPosition()
            com.google.android.material.tabs.TabLayout$Tab r6 = r6.getTabAt(r12)
            java.lang.CharSequence r6 = r6.getText()
            java.lang.String r6 = r6.toString()
            android.content.res.Resources r12 = r20.getResources()
            java.lang.String r12 = r12.getString(r7)
            boolean r6 = r6.equals(r12)
            if (r6 == 0) goto L_0x0090
            long r12 = r3.getTimeInMillis()
            long r12 = r12 / r8
            java.lang.Long r3 = java.lang.Long.valueOf(r12)
            goto L_0x0099
        L_0x0090:
            long r12 = r10.getTimeInMillis()
            long r12 = r12 / r8
            java.lang.Long r3 = java.lang.Long.valueOf(r12)
        L_0x0099:
            java.util.Calendar r6 = r0.calendar
            long r12 = r6.getTimeInMillis()
            long r12 = r12 / r8
            java.lang.Long r6 = java.lang.Long.valueOf(r12)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x00cd
            com.google.android.material.tabs.TabLayout r2 = r0.tlPassType
            int r8 = r2.getSelectedTabPosition()
            com.google.android.material.tabs.TabLayout$Tab r2 = r2.getTabAt(r8)
            java.lang.CharSequence r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            android.content.res.Resources r8 = r20.getResources()
            java.lang.String r7 = r8.getString(r7)
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x00cb
            goto L_0x00cd
        L_0x00cb:
            r2 = 0
            goto L_0x00ce
        L_0x00cd:
            r2 = 1
        L_0x00ce:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r7 = -1
            int r8 = r1.hashCode()
            r9 = 326025190(0x136ebfe6, float:3.0134437E-27)
            if (r8 == r9) goto L_0x00ec
            r4 = 1076833815(0x402f2e17, float:2.737188)
            if (r8 == r4) goto L_0x00e2
            goto L_0x00f5
        L_0x00e2:
            java.lang.String r4 = "Машина"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00f5
            r4 = 1
            goto L_0x00f6
        L_0x00ec:
            java.lang.String r8 = "Человек"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r4 = -1
        L_0x00f6:
            if (r4 == 0) goto L_0x0127
            if (r4 == r11) goto L_0x00fb
            goto L_0x0143
        L_0x00fb:
            com.google.android.material.textfield.TextInputEditText r1 = r0.etCarNumber
            android.text.Editable r1 = r1.getText()
            java.lang.String r13 = r1.toString()
            com.google.android.material.textfield.TextInputEditText r1 = r0.etCarModel
            android.text.Editable r1 = r1.getText()
            java.lang.String r14 = r1.toString()
            com.google.android.material.textfield.TextInputEditText r1 = r0.etCarOwner
            android.text.Editable r1 = r1.getText()
            java.lang.String r15 = r1.toString()
            ru.unicorn.ujin.view.activity.navigation.ui.navigation.SimpleViewModel r12 = r0.simpleViewModel
            r16 = r3
            r17 = r6
            r18 = r5
            r19 = r2
            r12.carCardOrder(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0143
        L_0x0127:
            com.google.android.material.textfield.TextInputEditText r1 = r0.etCarNumber
            android.text.Editable r1 = r1.getText()
            java.lang.String r13 = r1.toString()
            ru.unicorn.ujin.view.customViews.fields.PhoneMaskedEditText r1 = r0.etPhone
            java.lang.String r14 = r1.getValue()
            ru.unicorn.ujin.view.activity.navigation.ui.navigation.SimpleViewModel r12 = r0.simpleViewModel
            r15 = r3
            r16 = r6
            r17 = r5
            r18 = r2
            r12.cardManOrder(r13, r14, r15, r16, r17, r18)
        L_0x0143:
            ru.unicorn.ujin.view.activity.navigation.ui.navigation.SimpleViewModel r1 = r0.simpleViewModel
            ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent r1 = r1.getAppendDataLiveData()
            ru.unicorn.ujin.view.activity.navigation.ui.card.-$$Lambda$CardFragment$Ue5XpZQdbHyGbViBoQ2NK1AVBS8 r2 = new ru.unicorn.ujin.view.activity.navigation.ui.card.-$$Lambda$CardFragment$Ue5XpZQdbHyGbViBoQ2NK1AVBS8
            r2.<init>()
            r1.observe(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardFragment.onOrderClick():void");
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.card.CardFragment$3 */
    static /* synthetic */ class C58073 {
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
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardFragment.C58073.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void onCreateTicket(Resource<CardData> resource) {
        if (resource != null) {
            int i = C58073.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6744pb.setVisibility(0);
            } else if (i == 2) {
                this.f6744pb.setVisibility(8);
                AlertDialog.Builder createDialogBuilder = DialogHelper.createDialogBuilder(getActivity(), getResources().getString(R.string.dialog_pass_has_created, new Object[]{resource.getData().getId()}));
                createDialogBuilder.setPositiveButton((int) R.string.button_ok, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        CardFragment.this.lambda$onCreateTicket$7$CardFragment(dialogInterface, i);
                    }
                });
                createDialogBuilder.create().show();
            } else if (i == 3) {
                this.f6744pb.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }

    public /* synthetic */ void lambda$onCreateTicket$7$CardFragment(DialogInterface dialogInterface, int i) {
        backFragment();
    }

    /* access modifiers changed from: package-private */
    public void onDateClick() {
        if (this.calendar == null) {
            this.calendar = Calendar.getInstance();
        }
        DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(), R.style.YCalendar, this, this.calendar.get(1), this.calendar.get(2), this.calendar.get(5));
        datePickerDialog.getDatePicker().setMinDate(new Date().getTime());
        datePickerDialog.show();
    }

    private void onOrderHandler(Resource<String> resource) {
        if (resource != null) {
            int i = C58073.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6744pb.setVisibility(0);
            } else if (i == 2) {
                this.f6744pb.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            } else if (i == 3) {
                this.f6744pb.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        UIHelper.hideKeyboard(getActivity(), this.etDate);
        this.calendar.set(i, i2, i3, 23, 59, 59);
        this.etDate.setText(this.sdf.format(this.calendar.getTime()));
        this.etDate.clearFocus();
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        String str;
        getBaseActivity().removeToolbarElevation();
        BaseActivity baseActivity = getBaseActivity();
        if (getArguments().getBoolean(ARG_EDITABLE)) {
            str = getString(R.string.toolbar_label_card);
        } else {
            str = getString(R.string.label_pass_number, getArguments().getString("arg_id"));
        }
        baseActivity.setTextTitle(str);
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
    }

    private void initTabs() {
        TabLayout tabLayout2 = this.tabLayout;
        TabLayout.Tab newTab = tabLayout2.newTab();
        boolean z = getArguments().getBoolean(ARG_IS_VEHICLE);
        String str = CAR;
        tabLayout2.addTab(newTab.setText((CharSequence) z ? str : MAN));
        TabLayout tabLayout3 = this.tabLayout;
        TabLayout.Tab newTab2 = tabLayout3.newTab();
        if (getArguments().getBoolean(ARG_IS_VEHICLE)) {
            str = MAN;
        }
        tabLayout3.addTab(newTab2.setText((CharSequence) str));
        reinit(getArguments().getBoolean(ARG_IS_VEHICLE));
        this.tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TabLayout.OnTabSelectedListener() {
            public void onTabReselected(TabLayout.Tab tab) {
            }

            public void onTabUnselected(TabLayout.Tab tab) {
            }

            public void onTabSelected(TabLayout.Tab tab) {
                CardFragment cardFragment = CardFragment.this;
                boolean z = true;
                if (tab.getPosition() != 1) {
                    z = false;
                }
                cardFragment.reinit(z);
                boolean z2 = CardFragment.this.getArguments().getBoolean(CardFragment.ARG_IS_VEHICLE);
                String str = CardFragment.MAN;
                if (z2) {
                    MutableLiveData<String> cardTypeLiveData = CardFragment.this.simpleViewModel.getCardTypeLiveData();
                    if (tab.getPosition() == 0) {
                        str = CardFragment.CAR;
                    }
                    cardTypeLiveData.setValue(str);
                    return;
                }
                MutableLiveData<String> cardTypeLiveData2 = CardFragment.this.simpleViewModel.getCardTypeLiveData();
                if (tab.getPosition() != 0) {
                    str = CardFragment.CAR;
                }
                cardTypeLiveData2.setValue(str);
            }
        });
        if (!getArguments().getBoolean(ARG_EDITABLE)) {
            LinearLayout linearLayout = (LinearLayout) this.tabLayout.getChildAt(0);
            linearLayout.setEnabled(false);
            for (int i = 0; i < linearLayout.getChildCount(); i++) {
                linearLayout.getChildAt(i).setClickable(false);
            }
        }
    }

    /* access modifiers changed from: private */
    public void reinit(boolean z) {
        this.tilCarNumber.setHint((CharSequence) "");
        this.tilCarNumber.setHint((CharSequence) getString(z ? R.string.label_car_number : R.string.hint_name));
        int i = 0;
        if (z) {
            this.tilPhone.setVisibility(8);
            this.tilCarModel.setVisibility(0);
        } else {
            this.tilCarModel.setVisibility(8);
            this.tilPhone.setVisibility(0);
        }
        this.etCarNumber.setText("");
        this.etCarModel.setText("");
        this.etPhone.setText("");
        this.etDate.setText("");
        this.etComment.setText("");
        TextInputLayout textInputLayout = this.tilCarOwner;
        if (!z) {
            i = 8;
        }
        textInputLayout.setVisibility(i);
        this.calendar = Calendar.getInstance();
        onDateSet((DatePicker) null, this.calendar.get(1), this.calendar.get(2), this.calendar.get(5));
    }
}
