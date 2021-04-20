package p035ru.unicorn.ujin.view.fragments.mortgage;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.Glide;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.api.response.SimpleResponse;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;
import p035ru.unicorn.ujin.data.realm.Bank;
import p035ru.unicorn.ujin.data.realm.ContextBanner;
import p035ru.unicorn.ujin.data.realm.Layout;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.view.activity.WebViewActivity;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.customViews.fields.PhoneMaskedEditText;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 92\u00020\u0001:\u00019B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0006H\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0006H\u0002J\b\u0010\u001e\u001a\u00020\u0006H\u0014J$\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0018\u0010)\u001a\u00020\u00152\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+H\u0002J\b\u0010-\u001a\u00020\u0015H\u0002J\b\u0010.\u001a\u00020\u0015H\u0002J\b\u0010/\u001a\u00020\u0015H\u0014J\u0010\u00100\u001a\u00020\u00152\u0006\u00101\u001a\u00020\u0006H\u0002J\u0010\u00102\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u0006H\u0002J\u001c\u00104\u001a\u00020\u0015*\u0002052\u0006\u00103\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u0006H\u0002J\f\u00107\u001a\u00020\u0015*\u000208H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8FX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006:"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/mortgage/MortgageApplicationFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "()V", "calendar", "Ljava/util/Calendar;", "complexId", "", "editTextWatcher", "Landroid/text/TextWatcher;", "formData", "", "mortgage", "Lru/unicorn/ujin/data/realm/ContextBanner;", "mortgageId", "profileViewModel", "Lru/unicorn/ujin/data/profile/ProfileViewModel;", "getProfileViewModel", "()Lru/unicorn/ujin/data/profile/ProfileViewModel;", "profileViewModel$delegate", "Lkotlin/Lazy;", "addFormItem", "", "key", "value", "checkFormIsValid", "darkenColor", "", "color", "initSendAppButton", "lightenColor", "metricsScreenName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showData", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/SimpleResponse;", "showDatePickerDialog", "showSuccessMessage", "showToolbar", "startCallIntent", "number", "startWebIntent", "url", "makeLink", "Landroid/widget/TextView;", "linkText", "markRequired", "Lcom/google/android/material/textfield/TextInputLayout;", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.mortgage.MortgageApplicationFragment */
/* compiled from: MortgageApplicationFragment.kt */
public final class MortgageApplicationFragment extends BaseFragment {
    public static final String COMPLEX_ID = "complexId";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String MORTGAGE_ID = "mortgageId";
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public Calendar calendar;
    /* access modifiers changed from: private */
    public String complexId;
    private TextWatcher editTextWatcher = new MortgageApplicationFragment$editTextWatcher$1(this);
    /* access modifiers changed from: private */
    public final Map<String, String> formData = new LinkedHashMap();
    private ContextBanner mortgage;
    /* access modifiers changed from: private */
    public String mortgageId;
    private final Lazy profileViewModel$delegate = LazyKt.lazy(new MortgageApplicationFragment$profileViewModel$2(this));

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.mortgage.MortgageApplicationFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 1;
            $EnumSwitchMapping$0[Resource.Status.ERROR.ordinal()] = 2;
            $EnumSwitchMapping$0[Resource.Status.LOADING.ordinal()] = 3;
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final ProfileViewModel getProfileViewModel() {
        return (ProfileViewModel) this.profileViewModel$delegate.getValue();
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public MortgageApplicationFragment() {
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "Calendar.getInstance()");
        this.calendar = instance;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getResources().getString(R.string.mortgage_application));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        Bundle arguments = getArguments();
        this.mortgageId = arguments != null ? arguments.getString(MORTGAGE_ID) : null;
        View inflate = layoutInflater.inflate(R.layout.fragment_mortgage_application, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layou…cation, container, false)");
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        String phone;
        Bank bank;
        String accentColor;
        Bank bank2;
        String agreementUrl;
        Bank bank3;
        Bank bank4;
        Bank bank5;
        String logo;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String str = null;
        this.mortgageId = arguments != null ? arguments.getString(MORTGAGE_ID) : null;
        Bundle arguments2 = getArguments();
        this.complexId = arguments2 != null ? arguments2.getString("complexId") : null;
        String str2 = this.mortgageId;
        if (str2 != null) {
            this.mortgage = this.viewModel.getBannerById(str2);
        }
        ContextBanner contextBanner = this.mortgage;
        if (contextBanner != null) {
            Layout layout = contextBanner.getLayout();
            if (!(layout == null || (bank5 = layout.getBank()) == null || (logo = bank5.getLogo()) == null)) {
                Glide.with((View) (AppCompatImageView) _$_findCachedViewById(C5619R.C5622id.ivBankLogo)).load(logo).into((ImageView) (AppCompatImageView) _$_findCachedViewById(C5619R.C5622id.ivBankLogo));
            }
            Layout layout2 = contextBanner.getLayout();
            CharSequence title = layout2 != null ? layout2.getTitle() : null;
            if (title == null || StringsKt.isBlank(title)) {
                TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvBankTitle);
                Intrinsics.checkNotNullExpressionValue(textView, "tvBankTitle");
                textView.setVisibility(8);
            } else {
                TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvBankTitle);
                Layout layout3 = contextBanner.getLayout();
                textView2.setText(layout3 != null ? layout3.getTitle() : null);
                Layout layout4 = contextBanner.getLayout();
                if (!(layout4 == null || (bank3 = layout4.getBank()) == null)) {
                    CharSequence accentColor2 = bank3.getAccentColor();
                    if (!(accentColor2 == null || StringsKt.isBlank(accentColor2))) {
                        Layout layout5 = contextBanner.getLayout();
                        if (!(layout5 == null || (bank4 = layout5.getBank()) == null)) {
                            str = bank4.getAccentColor();
                        }
                        textView2.setTextColor(Color.parseColor(str));
                    }
                }
            }
            TextInputEditText textInputEditText = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etBirthday);
            textInputEditText.setFocusable(false);
            textInputEditText.setOnClickListener(new MortgageApplicationFragment$onViewCreated$$inlined$let$lambda$1(this));
            Layout layout6 = contextBanner.getLayout();
            if (!(layout6 == null || (bank2 = layout6.getBank()) == null || (agreementUrl = bank2.getAgreementUrl()) == null)) {
                TextView textView3 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvTerms);
                Intrinsics.checkNotNullExpressionValue(textView3, "tvTerms");
                makeLink(textView3, agreementUrl, "персональных данных");
            }
            Layout layout7 = contextBanner.getLayout();
            if (!(layout7 == null || (bank = layout7.getBank()) == null || (accentColor = bank.getAccentColor()) == null)) {
                ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnSendApp)).setCustomColors(Color.parseColor(accentColor), darkenColor(accentColor), lightenColor(accentColor), ContextCompat.getColor(getBaseActivity(), R.color.buttonPrimaryText));
                ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnCall)).setCustomColors(Color.parseColor(accentColor), darkenColor(accentColor), lightenColor(accentColor), Color.parseColor(accentColor));
            }
            Layout layout8 = contextBanner.getLayout();
            if (!(layout8 == null || (phone = layout8.getPhone()) == null)) {
                if (!StringsKt.isBlank(phone)) {
                    DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnCall);
                    dynamicBackgroundButton.setVisibility(0);
                    dynamicBackgroundButton.setOnClickListener(new MortgageApplicationFragment$onViewCreated$$inlined$let$lambda$2(phone, this));
                    TextView textView4 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvConsultMessage);
                    Intrinsics.checkNotNullExpressionValue(textView4, "tvConsultMessage");
                    textView4.setVisibility(0);
                } else {
                    DynamicBackgroundButton dynamicBackgroundButton2 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnCall);
                    Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton2, "btnCall");
                    dynamicBackgroundButton2.setVisibility(8);
                    TextView textView5 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvConsultMessage);
                    Intrinsics.checkNotNullExpressionValue(textView5, "tvConsultMessage");
                    textView5.setVisibility(8);
                }
            }
        }
        TextInputLayout textInputLayout = (TextInputLayout) _$_findCachedViewById(C5619R.C5622id.tilName);
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "tilName");
        markRequired(textInputLayout);
        TextInputLayout textInputLayout2 = (TextInputLayout) _$_findCachedViewById(C5619R.C5622id.tilPhone);
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "tilPhone");
        markRequired(textInputLayout2);
        ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etName)).addTextChangedListener(this.editTextWatcher);
        ((PhoneMaskedEditText) _$_findCachedViewById(C5619R.C5622id.etPhone)).addTextChangedListener(this.editTextWatcher);
        ((CheckBox) _$_findCachedViewById(C5619R.C5622id.cbTerms)).addTextChangedListener(this.editTextWatcher);
        User user = getProfileViewModel().getUser();
        ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etSurname)).setText(user.getSurname());
        ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etName)).setText(user.getName());
        ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etPatronymic)).setText(user.getPatronymic());
        ((PhoneMaskedEditText) _$_findCachedViewById(C5619R.C5622id.etPhone)).setText(getProfileViewModel().getUserPhone());
        initSendAppButton();
        this.viewModel.getApplyMortgageLiveData().observe(this, new MortgageApplicationFragment$onViewCreated$4(this));
    }

    private final void makeLink(TextView textView, String str, String str2) {
        SpannableString spannableString = new SpannableString(textView.getText());
        MortgageApplicationFragment$makeLink$clickableSpan$1 mortgageApplicationFragment$makeLink$clickableSpan$1 = new MortgageApplicationFragment$makeLink$clickableSpan$1(str);
        int indexOf$default = StringsKt.indexOf$default((CharSequence) textView.getText().toString(), str2, 0, false, 6, (Object) null);
        spannableString.setSpan(mortgageApplicationFragment$makeLink$clickableSpan$1, indexOf$default, str2.length() + indexOf$default, 33);
        spannableString.setSpan(new ForegroundColorSpan(textView.getResources().getColor(R.color.colorAccentControl)), indexOf$default, str2.length() + indexOf$default, 33);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
    }

    /* access modifiers changed from: private */
    public final void showData(Resource<SimpleResponse> resource) {
        Resource.Status status;
        if (resource != null && (status = resource.getStatus()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                progressBar.setVisibility(8);
                showSuccessMessage();
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                progressBar2.setVisibility(8);
                Integer error = resource.getError();
                Intrinsics.checkNotNullExpressionValue(error, "resource.error");
                showMessage(error.intValue());
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                progressBar3.setVisibility(0);
            }
        }
    }

    private final void showSuccessMessage() {
        new AlertDialog.Builder(getBaseActivity()).setMessage((CharSequence) getResources().getString(R.string.mortgage_success_apply)).setPositiveButton((CharSequence) getResources().getString(R.string.ok), (DialogInterface.OnClickListener) new MortgageApplicationFragment$showSuccessMessage$1(this)).create().show();
    }

    private final void initSendAppButton() {
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnSendApp)).setOnClickListener(new MortgageApplicationFragment$initSendAppButton$1(this));
    }

    /* access modifiers changed from: private */
    public final void addFormItem(String str, String str2) {
        if (!StringsKt.isBlank(str2)) {
            Map<String, String> map = this.formData;
            map.put("form[" + str + ']', str2);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004e, code lost:
        if (r1.isChecked() != false) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void checkFormIsValid() {
        /*
            r5 = this;
            int r0 = p035ru.unicorn.C5619R.C5622id.btnSendApp
            android.view.View r0 = r5._$_findCachedViewById(r0)
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r0 = (p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton) r0
            java.lang.String r1 = "btnSendApp"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r1 = p035ru.unicorn.C5619R.C5622id.etName
            android.view.View r1 = r5._$_findCachedViewById(r1)
            com.google.android.material.textfield.TextInputEditText r1 = (com.google.android.material.textfield.TextInputEditText) r1
            java.lang.String r2 = "etName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            android.text.Editable r1 = r1.getText()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x002c
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = kotlin.text.StringsKt.isBlank(r1)
            if (r1 != 0) goto L_0x002c
            r1 = 1
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            if (r1 == 0) goto L_0x0051
            int r1 = p035ru.unicorn.C5619R.C5622id.etPhone
            android.view.View r1 = r5._$_findCachedViewById(r1)
            ru.unicorn.ujin.view.customViews.fields.PhoneMaskedEditText r1 = (p035ru.unicorn.ujin.view.customViews.fields.PhoneMaskedEditText) r1
            boolean r1 = r1.isValid()
            if (r1 == 0) goto L_0x0051
            int r1 = p035ru.unicorn.C5619R.C5622id.cbTerms
            android.view.View r1 = r5._$_findCachedViewById(r1)
            android.widget.CheckBox r1 = (android.widget.CheckBox) r1
            java.lang.String r4 = "cbTerms"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r2 = 0
        L_0x0052:
            r0.setEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.mortgage.MortgageApplicationFragment.checkFormIsValid():void");
    }

    /* access modifiers changed from: private */
    public final void showDatePickerDialog() {
        TextInputEditText textInputEditText = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etBirthday);
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "etBirthday");
        DatePickerDialog datePickerDialog = new DatePickerDialog(textInputEditText.getContext(), R.style.YCalendar, new C6033xcdb16a93(this), this.calendar.get(1), this.calendar.get(2), this.calendar.get(5));
        DatePicker datePicker = datePickerDialog.getDatePicker();
        Intrinsics.checkNotNullExpressionValue(datePicker, "datePickerDialog.datePicker");
        datePicker.setMaxDate(new Date().getTime());
        datePickerDialog.show();
    }

    private final int darkenColor(String str) {
        float[] fArr = new float[3];
        Color.colorToHSV(Color.parseColor(str), fArr);
        fArr[2] = fArr[2] * 0.8f;
        return Color.HSVToColor(fArr);
    }

    private final int lightenColor(String str) {
        float[] fArr = new float[3];
        Color.colorToHSV(Color.parseColor(str), fArr);
        return Color.HSVToColor(80, fArr);
    }

    /* access modifiers changed from: private */
    public final void startCallIntent(String str) {
        startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str)));
    }

    private final void startWebIntent(String str) {
        Intent putExtra = new Intent(getContext(), WebViewActivity.class).putExtra("url", str);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(context, WebViewA…WebViewActivity.URL, url)");
        startActivity(putExtra);
    }

    private final void markRequired(TextInputLayout textInputLayout) {
        StringBuilder sb = new StringBuilder();
        sb.append(textInputLayout.getHint());
        sb.append(Html.fromHtml(textInputLayout.getResources().getString(R.string.required_asterisk)));
        textInputLayout.setHint((CharSequence) sb.toString());
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/mortgage/MortgageApplicationFragment$Companion;", "", "()V", "COMPLEX_ID", "", "MORTGAGE_ID", "newInstance", "Lru/unicorn/ujin/view/fragments/mortgage/MortgageApplicationFragment;", "mortgageId", "complexId", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.mortgage.MortgageApplicationFragment$Companion */
    /* compiled from: MortgageApplicationFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MortgageApplicationFragment newInstance(String str, String str2) {
            MortgageApplicationFragment mortgageApplicationFragment = new MortgageApplicationFragment();
            Bundle bundle = new Bundle();
            bundle.putString(MortgageApplicationFragment.MORTGAGE_ID, str);
            bundle.putString("complexId", str2);
            Unit unit = Unit.INSTANCE;
            mortgageApplicationFragment.setArguments(bundle);
            return mortgageApplicationFragment;
        }
    }
}
