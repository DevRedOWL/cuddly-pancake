package p035ru.unicorn.ujin.view.fragments.domru;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.material.textfield.TextInputEditText;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.util.DialogUtils;
import p035ru.unicorn.ujin.view.activity.domru.SendingCodeActivity;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.AuthBaseFragment;
import p035ru.unicorn.ujin.viewModel.events.profile.ValidateSmsProviderEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0014J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0019\u001a\u00020\bH\u0014J\u0017\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/domru/CodeRecoverySecondFragment;", "Lru/unicorn/ujin/view/fragments/AuthBaseFragment;", "()V", "baseActivity", "Lru/unicorn/ujin/view/activity/domru/SendingCodeActivity;", "editTextWatcher", "Landroid/text/TextWatcher;", "handleEvent", "", "event", "Lru/unicorn/ujin/viewModel/events/profile/ValidateSmsProviderEvent;", "isRegisterDataValid", "", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showToolbar", "toggleProgressVisibility", "isLoading", "(Ljava/lang/Boolean;)V", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.domru.CodeRecoverySecondFragment */
/* compiled from: CodeRecoverySecondFragment.kt */
public final class CodeRecoverySecondFragment extends AuthBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public SendingCodeActivity baseActivity;
    private TextWatcher editTextWatcher = new CodeRecoverySecondFragment$editTextWatcher$1(this);

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

    public static final /* synthetic */ SendingCodeActivity access$getBaseActivity$p(CodeRecoverySecondFragment codeRecoverySecondFragment) {
        SendingCodeActivity sendingCodeActivity = codeRecoverySecondFragment.baseActivity;
        if (sendingCodeActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseActivity");
        }
        return sendingCodeActivity;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_code_second_step, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.baseActivity = (SendingCodeActivity) activity;
            ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnContinue)).setOnClickListener(new CodeRecoverySecondFragment$onViewCreated$1(this));
            ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etCode)).addTextChangedListener(this.editTextWatcher);
            LifecycleOwner lifecycleOwner = this;
            getProfileViewModel().getShowProgressLiveData().observe(lifecycleOwner, new CodeRecoverySecondFragment$onViewCreated$2(this));
            getProfileViewModel().getValidateSmsProviderLiveData().observe(lifecycleOwner, new CodeRecoverySecondFragment$onViewCreated$3(this));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.activity.domru.SendingCodeActivity");
    }

    /* access modifiers changed from: private */
    public final boolean isRegisterDataValid() {
        TextInputEditText textInputEditText = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etCode);
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "etCode");
        Editable text = textInputEditText.getText();
        return text != null && !StringsKt.isBlank(text);
    }

    /* access modifiers changed from: private */
    public final void handleEvent(ValidateSmsProviderEvent validateSmsProviderEvent) {
        if (validateSmsProviderEvent.getSuccess()) {
            if (Intrinsics.areEqual((Object) validateSmsProviderEvent.isValidCode(), (Object) true)) {
                SendingCodeActivity sendingCodeActivity = this.baseActivity;
                if (sendingCodeActivity == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseActivity");
                }
                sendingCodeActivity.goToRegistrationActivity(1);
                return;
            }
            DialogUtils dialogUtils = DialogUtils.INSTANCE;
            String string = getResources().getString(R.string.errorOneTimeCode);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.errorOneTimeCode)");
            SendingCodeActivity sendingCodeActivity2 = this.baseActivity;
            if (sendingCodeActivity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseActivity");
            }
            dialogUtils.showError(string, sendingCodeActivity2);
        } else if (!StringsKt.isBlank(validateSmsProviderEvent.getMessage())) {
            DialogUtils dialogUtils2 = DialogUtils.INSTANCE;
            String message = validateSmsProviderEvent.getMessage();
            SendingCodeActivity sendingCodeActivity3 = this.baseActivity;
            if (sendingCodeActivity3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseActivity");
            }
            dialogUtils2.showError(message, sendingCodeActivity3);
        } else {
            DialogUtils dialogUtils3 = DialogUtils.INSTANCE;
            String string2 = getResources().getString(R.string.internalError);
            Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.internalError)");
            SendingCodeActivity sendingCodeActivity4 = this.baseActivity;
            if (sendingCodeActivity4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseActivity");
            }
            dialogUtils3.showError(string2, sendingCodeActivity4);
        }
    }

    /* access modifiers changed from: private */
    public final void toggleProgressVisibility(Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                DialogUtils dialogUtils = DialogUtils.INSTANCE;
                SendingCodeActivity sendingCodeActivity = this.baseActivity;
                if (sendingCodeActivity == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseActivity");
                }
                dialogUtils.showProgressDialog(sendingCodeActivity);
                return;
            }
            DialogUtils.INSTANCE.hideProgressDialog();
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/domru/CodeRecoverySecondFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/domru/CodeRecoverySecondFragment;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.domru.CodeRecoverySecondFragment$Companion */
    /* compiled from: CodeRecoverySecondFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CodeRecoverySecondFragment newInstance() {
            return new CodeRecoverySecondFragment();
        }
    }
}
