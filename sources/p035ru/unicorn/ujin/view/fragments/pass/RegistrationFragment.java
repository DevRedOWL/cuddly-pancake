package p035ru.unicorn.ujin.view.fragments.pass;

import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.ReactConst;
import p035ru.unicorn.ujin.data.profile.event.RegisterEvent;
import p035ru.unicorn.ujin.data.profile.event.RentAuthorizeEvent;
import p035ru.unicorn.ujin.util.DialogUtils;
import p035ru.unicorn.ujin.view.activity.pass.PassRegistrationActivity;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.customViews.fields.PhoneMaskedEditText;
import p035ru.unicorn.ujin.view.fragments.AuthBaseFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 /2\u00020\u0001:\u0001/B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\rH\u0002J\b\u0010\u0012\u001a\u00020\u000bH\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0014J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001f\u001a\u00020\rH\u0002J\b\u0010 \u001a\u00020\rH\u0014J\b\u0010!\u001a\u00020\rH\u0002J\u0017\u0010\"\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010$J=\u0010%\u001a\u00020\r*\u00020&2*\u0010'\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020*0)0(\"\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020*0)H\u0002¢\u0006\u0002\u0010+J\f\u0010,\u001a\u00020\r*\u00020&H\u0002J\u0014\u0010-\u001a\u00020\r*\u00020&2\u0006\u0010.\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u00060"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/pass/RegistrationFragment;", "Lru/unicorn/ujin/view/fragments/AuthBaseFragment;", "()V", "baseActivity", "Lru/unicorn/ujin/view/activity/pass/PassRegistrationActivity;", "currentLoginMode", "", "currentMode", "editTextWatcher", "Landroid/text/TextWatcher;", "passwordIsVisible", "", "handleEvent", "", "event", "Lru/unicorn/ujin/data/profile/event/RegisterEvent;", "Lru/unicorn/ujin/data/profile/event/RentAuthorizeEvent;", "initTabs", "isRegisterDataValid", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setButtonTextsByMode", "showToolbar", "togglePasswordVisibility", "toggleProgressVisibility", "isLoading", "(Ljava/lang/Boolean;)V", "makeLinks", "Landroid/widget/TextView;", "links", "", "Lkotlin/Pair;", "Landroid/view/View$OnClickListener;", "(Landroid/widget/TextView;[Lkotlin/Pair;)V", "removeUnderline", "underline", "value", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.pass.RegistrationFragment */
/* compiled from: RegistrationFragment.kt */
public final class RegistrationFragment extends AuthBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int LOGIN_BY_EMAIL = 1;
    public static final int LOGIN_BY_PHONE = 0;
    public static final int MODE_LOGIN = 1;
    public static final int MODE_REGISTRATION = 0;
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public PassRegistrationActivity baseActivity;
    /* access modifiers changed from: private */
    public int currentLoginMode;
    /* access modifiers changed from: private */
    public int currentMode;
    private TextWatcher editTextWatcher = new RegistrationFragment$editTextWatcher$1(this);
    private boolean passwordIsVisible;

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

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
    }

    public static final /* synthetic */ PassRegistrationActivity access$getBaseActivity$p(RegistrationFragment registrationFragment) {
        PassRegistrationActivity passRegistrationActivity = registrationFragment.baseActivity;
        if (passRegistrationActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseActivity");
        }
        return passRegistrationActivity;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_corona_registration, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.baseActivity = (PassRegistrationActivity) activity;
            ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnContinue)).setOnClickListener(new RegistrationFragment$onViewCreated$1(this));
            initTabs();
            ((ImageView) _$_findCachedViewById(C5619R.C5622id.ivEye)).setOnClickListener(new RegistrationFragment$onViewCreated$2(this));
            ((PhoneMaskedEditText) _$_findCachedViewById(C5619R.C5622id.etPhone)).addTextChangedListener(this.editTextWatcher);
            ((EditText) _$_findCachedViewById(C5619R.C5622id.etEmail)).addTextChangedListener(this.editTextWatcher);
            ((EditText) _$_findCachedViewById(C5619R.C5622id.etName)).addTextChangedListener(this.editTextWatcher);
            ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etPassword)).addTextChangedListener(this.editTextWatcher);
            TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvLoginHint);
            Intrinsics.checkNotNullExpressionValue(textView, "tvLoginHint");
            makeLinks(textView, new Pair("номер телефона", new RegistrationFragment$onViewCreated$3(this)), new Pair("электронную почту", new RegistrationFragment$onViewCreated$4(this)));
            TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvLoginHint);
            Intrinsics.checkNotNullExpressionValue(textView2, "tvLoginHint");
            underline(textView2, "электронную почту");
            LifecycleOwner lifecycleOwner = this;
            getProfileViewModel().getShowProgressLiveData().observe(lifecycleOwner, new RegistrationFragment$onViewCreated$5(this));
            getProfileViewModel().getRentRegisterByPhoneLiveData().observe(lifecycleOwner, new RegistrationFragment$onViewCreated$6(this));
            getProfileViewModel().getRentAuthorizeLiveData().observe(lifecycleOwner, new RegistrationFragment$onViewCreated$7(this));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.activity.pass.PassRegistrationActivity");
    }

    private final void initTabs() {
        ((TabLayout) _$_findCachedViewById(C5619R.C5622id.tabLayoutLogReg)).addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new RegistrationFragment$initTabs$1(this));
    }

    /* access modifiers changed from: private */
    public final void togglePasswordVisibility() {
        if (this.passwordIsVisible) {
            TextInputEditText textInputEditText = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etPassword);
            Intrinsics.checkNotNullExpressionValue(textInputEditText, "etPassword");
            textInputEditText.setInputType(129);
            ((ImageView) _$_findCachedViewById(C5619R.C5622id.ivEye)).setImageResource(R.drawable.eye_icon);
        } else {
            TextInputEditText textInputEditText2 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etPassword);
            Intrinsics.checkNotNullExpressionValue(textInputEditText2, "etPassword");
            textInputEditText2.setInputType(524288);
            ((ImageView) _$_findCachedViewById(C5619R.C5622id.ivEye)).setImageResource(R.drawable.eye_active_icon);
        }
        ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etPassword)).invalidate();
        TextInputEditText textInputEditText3 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etPassword);
        TextInputEditText textInputEditText4 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etPassword);
        Intrinsics.checkNotNullExpressionValue(textInputEditText4, "etPassword");
        Editable text = textInputEditText4.getText();
        textInputEditText3.setSelection(text != null ? text.length() : 0);
        this.passwordIsVisible = !this.passwordIsVisible;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0086, code lost:
        if (p035ru.unicorn.ujin.util.Validator.isEmailValid(r0.getText().toString()) != false) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isRegisterDataValid() {
        /*
            r4 = this;
            int r0 = r4.currentMode
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x0039
            int r0 = p035ru.unicorn.C5619R.C5622id.etPhone
            android.view.View r0 = r4._$_findCachedViewById(r0)
            ru.unicorn.ujin.view.customViews.fields.PhoneMaskedEditText r0 = (p035ru.unicorn.ujin.view.customViews.fields.PhoneMaskedEditText) r0
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L_0x0036
            int r0 = p035ru.unicorn.C5619R.C5622id.etName
            android.view.View r0 = r4._$_findCachedViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.String r3 = "etName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0031
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 != 0) goto L_0x0031
            r0 = 1
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r0 == 0) goto L_0x0036
            goto L_0x00a8
        L_0x0036:
            r1 = 0
            goto L_0x00a8
        L_0x0039:
            int r0 = r4.currentLoginMode
            if (r0 != 0) goto L_0x004b
            int r0 = p035ru.unicorn.C5619R.C5622id.etPhone
            android.view.View r0 = r4._$_findCachedViewById(r0)
            ru.unicorn.ujin.view.customViews.fields.PhoneMaskedEditText r0 = (p035ru.unicorn.ujin.view.customViews.fields.PhoneMaskedEditText) r0
            boolean r0 = r0.isValid()
            if (r0 != 0) goto L_0x0088
        L_0x004b:
            int r0 = r4.currentLoginMode
            if (r0 != r1) goto L_0x0036
            int r0 = p035ru.unicorn.C5619R.C5622id.etEmail
            android.view.View r0 = r4._$_findCachedViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.String r3 = "etEmail"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x006c
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 != 0) goto L_0x006c
            r0 = 1
            goto L_0x006d
        L_0x006c:
            r0 = 0
        L_0x006d:
            if (r0 == 0) goto L_0x0036
            int r0 = p035ru.unicorn.C5619R.C5622id.etEmail
            android.view.View r0 = r4._$_findCachedViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = p035ru.unicorn.ujin.util.Validator.isEmailValid(r0)
            if (r0 == 0) goto L_0x0036
        L_0x0088:
            int r0 = p035ru.unicorn.C5619R.C5622id.etPassword
            android.view.View r0 = r4._$_findCachedViewById(r0)
            com.google.android.material.textfield.TextInputEditText r0 = (com.google.android.material.textfield.TextInputEditText) r0
            java.lang.String r3 = "etPassword"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x00a5
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 != 0) goto L_0x00a5
            r0 = 1
            goto L_0x00a6
        L_0x00a5:
            r0 = 0
        L_0x00a6:
            if (r0 == 0) goto L_0x0036
        L_0x00a8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.pass.RegistrationFragment.isRegisterDataValid():boolean");
    }

    /* access modifiers changed from: private */
    public final void setButtonTextsByMode() {
        int i = this.currentMode;
        if (i == 0) {
            DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnContinue);
            Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "btnContinue");
            dynamicBackgroundButton.setText(getString(R.string.get_sms_code));
            TextInputLayout textInputLayout = (TextInputLayout) _$_findCachedViewById(C5619R.C5622id.tilPhone);
            Intrinsics.checkNotNullExpressionValue(textInputLayout, "tilPhone");
            textInputLayout.setVisibility(0);
            TextInputLayout textInputLayout2 = (TextInputLayout) _$_findCachedViewById(C5619R.C5622id.tilName);
            Intrinsics.checkNotNullExpressionValue(textInputLayout2, "tilName");
            textInputLayout2.setVisibility(0);
            TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvLoginHint);
            Intrinsics.checkNotNullExpressionValue(textView, "tvLoginHint");
            textView.setVisibility(8);
            TextInputLayout textInputLayout3 = (TextInputLayout) _$_findCachedViewById(C5619R.C5622id.tilPassword);
            Intrinsics.checkNotNullExpressionValue(textInputLayout3, "tilPassword");
            textInputLayout3.setVisibility(4);
            ImageView imageView = (ImageView) _$_findCachedViewById(C5619R.C5622id.ivEye);
            Intrinsics.checkNotNullExpressionValue(imageView, "ivEye");
            imageView.setVisibility(4);
            TextInputLayout textInputLayout4 = (TextInputLayout) _$_findCachedViewById(C5619R.C5622id.tilEmail);
            Intrinsics.checkNotNullExpressionValue(textInputLayout4, "tilEmail");
            textInputLayout4.setVisibility(4);
        } else if (i == 1) {
            DynamicBackgroundButton dynamicBackgroundButton2 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnContinue);
            Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton2, "btnContinue");
            dynamicBackgroundButton2.setText(getString(R.string.login));
            TextInputLayout textInputLayout5 = (TextInputLayout) _$_findCachedViewById(C5619R.C5622id.tilPhone);
            Intrinsics.checkNotNullExpressionValue(textInputLayout5, "tilPhone");
            textInputLayout5.setVisibility(0);
            TextInputLayout textInputLayout6 = (TextInputLayout) _$_findCachedViewById(C5619R.C5622id.tilPassword);
            Intrinsics.checkNotNullExpressionValue(textInputLayout6, "tilPassword");
            textInputLayout6.setVisibility(0);
            ImageView imageView2 = (ImageView) _$_findCachedViewById(C5619R.C5622id.ivEye);
            Intrinsics.checkNotNullExpressionValue(imageView2, "ivEye");
            imageView2.setVisibility(0);
            TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvLoginHint);
            Intrinsics.checkNotNullExpressionValue(textView2, "tvLoginHint");
            textView2.setVisibility(0);
            TextInputLayout textInputLayout7 = (TextInputLayout) _$_findCachedViewById(C5619R.C5622id.tilEmail);
            Intrinsics.checkNotNullExpressionValue(textInputLayout7, "tilEmail");
            textInputLayout7.setVisibility(4);
            TextInputLayout textInputLayout8 = (TextInputLayout) _$_findCachedViewById(C5619R.C5622id.tilName);
            Intrinsics.checkNotNullExpressionValue(textInputLayout8, "tilName");
            textInputLayout8.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public final void handleEvent(RegisterEvent registerEvent) {
        if (registerEvent.getSuccess()) {
            PassRegistrationActivity passRegistrationActivity = this.baseActivity;
            if (passRegistrationActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseActivity");
            }
            passRegistrationActivity.goToNextStep();
        } else if (!StringsKt.isBlank(registerEvent.getMessage())) {
            DialogUtils dialogUtils = DialogUtils.INSTANCE;
            String message = registerEvent.getMessage();
            PassRegistrationActivity passRegistrationActivity2 = this.baseActivity;
            if (passRegistrationActivity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseActivity");
            }
            dialogUtils.showError(message, passRegistrationActivity2);
        } else {
            DialogUtils dialogUtils2 = DialogUtils.INSTANCE;
            String string = getResources().getString(R.string.internalError);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.internalError)");
            PassRegistrationActivity passRegistrationActivity3 = this.baseActivity;
            if (passRegistrationActivity3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseActivity");
            }
            dialogUtils2.showError(string, passRegistrationActivity3);
        }
    }

    /* access modifiers changed from: private */
    public final void handleEvent(RentAuthorizeEvent rentAuthorizeEvent) {
        if (rentAuthorizeEvent.getSuccess()) {
            PassRegistrationActivity passRegistrationActivity = this.baseActivity;
            if (passRegistrationActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseActivity");
            }
            passRegistrationActivity.startStageThree(ReactConst.CABINET, false);
        } else if (!StringsKt.isBlank(rentAuthorizeEvent.getMessage())) {
            DialogUtils dialogUtils = DialogUtils.INSTANCE;
            String message = rentAuthorizeEvent.getMessage();
            PassRegistrationActivity passRegistrationActivity2 = this.baseActivity;
            if (passRegistrationActivity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseActivity");
            }
            dialogUtils.showError(message, passRegistrationActivity2);
        } else {
            DialogUtils dialogUtils2 = DialogUtils.INSTANCE;
            String string = getResources().getString(R.string.internalError);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.internalError)");
            PassRegistrationActivity passRegistrationActivity3 = this.baseActivity;
            if (passRegistrationActivity3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseActivity");
            }
            dialogUtils2.showError(string, passRegistrationActivity3);
        }
    }

    /* access modifiers changed from: private */
    public final void toggleProgressVisibility(Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                DialogUtils dialogUtils = DialogUtils.INSTANCE;
                PassRegistrationActivity passRegistrationActivity = this.baseActivity;
                if (passRegistrationActivity == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseActivity");
                }
                dialogUtils.showProgressDialog(passRegistrationActivity);
                return;
            }
            DialogUtils.INSTANCE.hideProgressDialog();
        }
    }

    private final void makeLinks(TextView textView, Pair<String, ? extends View.OnClickListener>... pairArr) {
        SpannableString spannableString = new SpannableString(textView.getText());
        for (Pair<String, ? extends View.OnClickListener> pair : pairArr) {
            RegistrationFragment$makeLinks$clickableSpan$1 registrationFragment$makeLinks$clickableSpan$1 = new RegistrationFragment$makeLinks$clickableSpan$1(pair);
            int indexOf$default = StringsKt.indexOf$default((CharSequence) textView.getText().toString(), pair.getFirst(), 0, false, 6, (Object) null);
            spannableString.setSpan(registrationFragment$makeLinks$clickableSpan$1, indexOf$default, pair.getFirst().length() + indexOf$default, 33);
            spannableString.setSpan(new ForegroundColorSpan(textView.getResources().getColor(R.color.colorAccentControl)), indexOf$default, pair.getFirst().length() + indexOf$default, 33);
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
    }

    /* access modifiers changed from: private */
    public final void underline(TextView textView, String str) {
        SpannableString spannableString = new SpannableString(textView.getText());
        int indexOf$default = StringsKt.indexOf$default((CharSequence) textView.getText().toString(), str, 0, false, 6, (Object) null);
        TextPaint textPaint = new TextPaint();
        textPaint.underlineThickness = 1.5f;
        UnderlineSpan underlineSpan = new UnderlineSpan();
        underlineSpan.updateDrawState(textPaint);
        spannableString.setSpan(underlineSpan, indexOf$default, str.length() + indexOf$default, 33);
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
    }

    /* access modifiers changed from: private */
    public final void removeUnderline(TextView textView) {
        SpannableString spannableString = new SpannableString(textView.getText());
        Object[] spans = spannableString.getSpans(0, spannableString.length(), UnderlineSpan.class);
        Intrinsics.checkNotNullExpressionValue(spans, "spannableString.getSpans…nderlineSpan::class.java)");
        for (UnderlineSpan removeSpan : (UnderlineSpan[]) spans) {
            spannableString.removeSpan(removeSpan);
        }
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/pass/RegistrationFragment$Companion;", "", "()V", "LOGIN_BY_EMAIL", "", "LOGIN_BY_PHONE", "MODE_LOGIN", "MODE_REGISTRATION", "newInstance", "Lru/unicorn/ujin/view/fragments/pass/RegistrationFragment;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.pass.RegistrationFragment$Companion */
    /* compiled from: RegistrationFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RegistrationFragment newInstance() {
            return new RegistrationFragment();
        }
    }
}
