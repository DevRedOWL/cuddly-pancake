package p035ru.unicorn.ujin.view.fragments.morion;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.jakewharton.rxbinding2.widget.RxTextView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.profile.event.RegisterEvent;
import p035ru.unicorn.ujin.util.DialogUtils;
import p035ru.unicorn.ujin.view.activity.morion.MorionRegistrationActivity;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.customViews.fields.PhoneMaskedEditText;
import p035ru.unicorn.ujin.view.fragments.AuthBaseFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0014J&\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/morion/RegistrationFragment;", "Lru/unicorn/ujin/view/fragments/AuthBaseFragment;", "()V", "baseActivity", "Lru/unicorn/ujin/view/activity/morion/MorionRegistrationActivity;", "handleEvent", "", "event", "Lru/unicorn/ujin/data/profile/event/RegisterEvent;", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showToolbar", "toggleProgressVisibility", "isLoading", "", "(Ljava/lang/Boolean;)V", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.morion.RegistrationFragment */
/* compiled from: RegistrationFragment.kt */
public final class RegistrationFragment extends AuthBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public MorionRegistrationActivity baseActivity;

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

    public static final /* synthetic */ MorionRegistrationActivity access$getBaseActivity$p(RegistrationFragment registrationFragment) {
        MorionRegistrationActivity morionRegistrationActivity = registrationFragment.baseActivity;
        if (morionRegistrationActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseActivity");
        }
        return morionRegistrationActivity;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_morion_registration, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.baseActivity = (MorionRegistrationActivity) activity;
            ((PhoneMaskedEditText) _$_findCachedViewById(C5619R.C5622id.etPhone)).setOnTextChangedListener(new RegistrationFragment$onViewCreated$1(this));
            ((PhoneMaskedEditText) _$_findCachedViewById(C5619R.C5622id.etPhone)).setOnTextCompletedListener(new RegistrationFragment$onViewCreated$2(this));
            RxTextView.textChanges((PhoneMaskedEditText) _$_findCachedViewById(C5619R.C5622id.etPhone)).map(RegistrationFragment$onViewCreated$phone$1.INSTANCE);
            ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnGetCode)).setOnClickListener(new RegistrationFragment$onViewCreated$3(this));
            LifecycleOwner lifecycleOwner = this;
            getProfileViewModel().getShowProgressLiveData().observe(lifecycleOwner, new RegistrationFragment$onViewCreated$4(this));
            getProfileViewModel().getRentRegisterByPhoneLiveData().observe(lifecycleOwner, new RegistrationFragment$onViewCreated$5(this));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.activity.morion.MorionRegistrationActivity");
    }

    /* access modifiers changed from: private */
    public final void handleEvent(RegisterEvent registerEvent) {
        if (registerEvent.getSuccess()) {
            MorionRegistrationActivity morionRegistrationActivity = this.baseActivity;
            if (morionRegistrationActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseActivity");
            }
            morionRegistrationActivity.goToNextStep();
        } else if (!StringsKt.isBlank(registerEvent.getMessage())) {
            DialogUtils dialogUtils = DialogUtils.INSTANCE;
            String message = registerEvent.getMessage();
            MorionRegistrationActivity morionRegistrationActivity2 = this.baseActivity;
            if (morionRegistrationActivity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseActivity");
            }
            dialogUtils.showError(message, morionRegistrationActivity2);
        } else {
            DialogUtils dialogUtils2 = DialogUtils.INSTANCE;
            String string = getResources().getString(R.string.internalError);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.internalError)");
            MorionRegistrationActivity morionRegistrationActivity3 = this.baseActivity;
            if (morionRegistrationActivity3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseActivity");
            }
            dialogUtils2.showError(string, morionRegistrationActivity3);
        }
    }

    /* access modifiers changed from: private */
    public final void toggleProgressVisibility(Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                DialogUtils dialogUtils = DialogUtils.INSTANCE;
                MorionRegistrationActivity morionRegistrationActivity = this.baseActivity;
                if (morionRegistrationActivity == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseActivity");
                }
                dialogUtils.showProgressDialog(morionRegistrationActivity);
                return;
            }
            DialogUtils.INSTANCE.hideProgressDialog();
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/morion/RegistrationFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/morion/RegistrationFragment;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.morion.RegistrationFragment$Companion */
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
