package p035ru.unicorn.ujin.view.fragments.domru;

import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.material.textfield.TextInputEditText;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.ReactConst;
import p035ru.unicorn.ujin.util.DialogUtils;
import p035ru.unicorn.ujin.util.Validator;
import p035ru.unicorn.ujin.view.activity.domru.RegistrationUserActivity;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.AuthBaseFragment;
import p035ru.unicorn.ujin.viewModel.events.profile.UpdateUserProviderEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0014J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001a\u001a\u00020\bH\u0014J\u0017\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/domru/RegistrationSecondFragment;", "Lru/unicorn/ujin/view/fragments/AuthBaseFragment;", "()V", "baseActivity", "Lru/unicorn/ujin/view/activity/domru/RegistrationUserActivity;", "editTextWatcher", "Landroid/text/TextWatcher;", "handleEvent", "", "event", "Lru/unicorn/ujin/viewModel/events/profile/UpdateUserProviderEvent;", "isPasswordCorrect", "", "isRegisterDataValid", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showToolbar", "toggleProgressVisibility", "isLoading", "(Ljava/lang/Boolean;)V", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.domru.RegistrationSecondFragment */
/* compiled from: RegistrationSecondFragment.kt */
public final class RegistrationSecondFragment extends AuthBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public RegistrationUserActivity baseActivity;
    private TextWatcher editTextWatcher = new RegistrationSecondFragment$editTextWatcher$1(this);

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

    public static final /* synthetic */ RegistrationUserActivity access$getBaseActivity$p(RegistrationSecondFragment registrationSecondFragment) {
        RegistrationUserActivity registrationUserActivity = registrationSecondFragment.baseActivity;
        if (registrationUserActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseActivity");
        }
        return registrationUserActivity;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_registration_second_step, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.baseActivity = (RegistrationUserActivity) activity;
            ((TextView) _$_findCachedViewById(C5619R.C5622id.tvGoBack)).setOnClickListener(new RegistrationSecondFragment$onViewCreated$1(this));
            ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnComplete)).setOnClickListener(new RegistrationSecondFragment$onViewCreated$2(this));
            ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etEmail)).addTextChangedListener(this.editTextWatcher);
            ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etPassword)).addTextChangedListener(this.editTextWatcher);
            ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etRepeatPassword)).addTextChangedListener(this.editTextWatcher);
            LifecycleOwner lifecycleOwner = this;
            getProfileViewModel().getShowProgressLiveData().observe(lifecycleOwner, new RegistrationSecondFragment$onViewCreated$3(this));
            getProfileViewModel().getUpdateUserProviderLiveData().observe(lifecycleOwner, new RegistrationSecondFragment$onViewCreated$4(this));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.activity.domru.RegistrationUserActivity");
    }

    /* access modifiers changed from: private */
    public final boolean isRegisterDataValid() {
        TextInputEditText textInputEditText = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etPassword);
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "etPassword");
        if (Validator.isPasswordSafe(String.valueOf(textInputEditText.getText()))) {
            TextInputEditText textInputEditText2 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etRepeatPassword);
            Intrinsics.checkNotNullExpressionValue(textInputEditText2, "etRepeatPassword");
            if (Validator.isPasswordSafe(String.valueOf(textInputEditText2.getText()))) {
                TextInputEditText textInputEditText3 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etEmail);
                Intrinsics.checkNotNullExpressionValue(textInputEditText3, "etEmail");
                if (Validator.isEmailValid(String.valueOf(textInputEditText3.getText()))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final boolean isPasswordCorrect() {
        TextInputEditText textInputEditText = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etPassword);
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "etPassword");
        String valueOf = String.valueOf(textInputEditText.getText());
        TextInputEditText textInputEditText2 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etRepeatPassword);
        Intrinsics.checkNotNullExpressionValue(textInputEditText2, "etRepeatPassword");
        if (!(!Intrinsics.areEqual((Object) valueOf, (Object) String.valueOf(textInputEditText2.getText())))) {
            return true;
        }
        Toast.makeText(getContext(), R.string.errorEqualPasswords, 1).show();
        return false;
    }

    /* access modifiers changed from: private */
    public final void handleEvent(UpdateUserProviderEvent updateUserProviderEvent) {
        if (updateUserProviderEvent.getSuccess()) {
            RegistrationUserActivity registrationUserActivity = this.baseActivity;
            if (registrationUserActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseActivity");
            }
            registrationUserActivity.startStageThree(ReactConst.SMARTFLAT, false);
        } else if (!StringsKt.isBlank(updateUserProviderEvent.getMessage())) {
            DialogUtils dialogUtils = DialogUtils.INSTANCE;
            String message = updateUserProviderEvent.getMessage();
            RegistrationUserActivity registrationUserActivity2 = this.baseActivity;
            if (registrationUserActivity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseActivity");
            }
            dialogUtils.showError(message, registrationUserActivity2);
        } else {
            DialogUtils dialogUtils2 = DialogUtils.INSTANCE;
            String string = getResources().getString(R.string.internalError);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.internalError)");
            RegistrationUserActivity registrationUserActivity3 = this.baseActivity;
            if (registrationUserActivity3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseActivity");
            }
            dialogUtils2.showError(string, registrationUserActivity3);
        }
    }

    /* access modifiers changed from: private */
    public final void toggleProgressVisibility(Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                DialogUtils dialogUtils = DialogUtils.INSTANCE;
                RegistrationUserActivity registrationUserActivity = this.baseActivity;
                if (registrationUserActivity == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseActivity");
                }
                dialogUtils.showProgressDialog(registrationUserActivity);
                return;
            }
            DialogUtils.INSTANCE.hideProgressDialog();
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/domru/RegistrationSecondFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/domru/RegistrationSecondFragment;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.domru.RegistrationSecondFragment$Companion */
    /* compiled from: RegistrationSecondFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RegistrationSecondFragment newInstance() {
            return new RegistrationSecondFragment();
        }
    }
}
