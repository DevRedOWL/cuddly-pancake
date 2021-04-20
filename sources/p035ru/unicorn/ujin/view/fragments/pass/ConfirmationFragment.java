package p035ru.unicorn.ujin.view.fragments.pass;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.andrognito.pinlockview.IndicatorDots;
import com.andrognito.pinlockview.PinLockView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.ReactConst;
import p035ru.unicorn.ujin.data.profile.event.RentConfirmCodeEvent;
import p035ru.unicorn.ujin.util.DialogUtils;
import p035ru.unicorn.ujin.view.activity.pass.PassRegistrationActivity;
import p035ru.unicorn.ujin.view.fragments.AuthBaseFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0014J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0017\u001a\u00020\bH\u0014J\u0017\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/pass/ConfirmationFragment;", "Lru/unicorn/ujin/view/fragments/AuthBaseFragment;", "()V", "afterFailLogging", "", "baseActivity", "Lru/unicorn/ujin/view/activity/pass/PassRegistrationActivity;", "handleEvent", "", "event", "Lru/unicorn/ujin/data/profile/event/RentConfirmCodeEvent;", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showToolbar", "toggleProgressVisibility", "isLoading", "(Ljava/lang/Boolean;)V", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.pass.ConfirmationFragment */
/* compiled from: ConfirmationFragment.kt */
public final class ConfirmationFragment extends AuthBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public boolean afterFailLogging;
    /* access modifiers changed from: private */
    public PassRegistrationActivity baseActivity;

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

    public static final /* synthetic */ PassRegistrationActivity access$getBaseActivity$p(ConfirmationFragment confirmationFragment) {
        PassRegistrationActivity passRegistrationActivity = confirmationFragment.baseActivity;
        if (passRegistrationActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseActivity");
        }
        return passRegistrationActivity;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_morion_confirmation, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.baseActivity = (PassRegistrationActivity) activity;
            ((PinLockView) _$_findCachedViewById(C5619R.C5622id.pinLockView)).attachIndicatorDots((IndicatorDots) _$_findCachedViewById(C5619R.C5622id.indicatorDots));
            ((PinLockView) _$_findCachedViewById(C5619R.C5622id.pinLockView)).setPinLockListener(new ConfirmationFragment$onViewCreated$1(this));
            LifecycleOwner lifecycleOwner = this;
            getProfileViewModel().getShowProgressLiveData().observe(lifecycleOwner, new ConfirmationFragment$onViewCreated$2(this));
            getProfileViewModel().getRentConfirmCodeLiveData().observe(lifecycleOwner, new ConfirmationFragment$onViewCreated$3(this));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.activity.pass.PassRegistrationActivity");
    }

    /* access modifiers changed from: private */
    public final void handleEvent(RentConfirmCodeEvent rentConfirmCodeEvent) {
        if (rentConfirmCodeEvent.getSuccess()) {
            if (rentConfirmCodeEvent.getCodeConfirmed()) {
                PassRegistrationActivity passRegistrationActivity = this.baseActivity;
                if (passRegistrationActivity == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseActivity");
                }
                passRegistrationActivity.startStageThree(ReactConst.CABINET, false);
                return;
            }
            TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvAuth);
            Intrinsics.checkNotNullExpressionValue(textView, "tvAuth");
            textView.setText(getResources().getString(R.string.incorrect_code));
            this.afterFailLogging = true;
        } else if (!StringsKt.isBlank(rentConfirmCodeEvent.getMessage())) {
            DialogUtils dialogUtils = DialogUtils.INSTANCE;
            String message = rentConfirmCodeEvent.getMessage();
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

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/pass/ConfirmationFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/pass/ConfirmationFragment;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.pass.ConfirmationFragment$Companion */
    /* compiled from: ConfirmationFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ConfirmationFragment newInstance() {
            return new ConfirmationFragment();
        }
    }
}
