package p035ru.unicorn.ujin.view.fragments.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.fragments.BaseTitleFragment;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0014J&\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0002¨\u0006\u0017"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/PrivacyFragment;", "Lru/unicorn/ujin/view/fragments/BaseTitleFragment;", "()V", "getLayoutRes", "", "handlePrivacyUpdate", "", "event", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "updateSwitch", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.PrivacyFragment */
/* compiled from: PrivacyFragment.kt */
public final class PrivacyFragment extends BaseTitleFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;

    @JvmStatic
    public static final PrivacyFragment newInstance(String str) {
        return Companion.newInstance(str);
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

    public int getLayoutRes() {
        return R.layout.fragment_privacy;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "Приватность";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/PrivacyFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/profile/PrivacyFragment;", "title", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.profile.PrivacyFragment$Companion */
    /* compiled from: PrivacyFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final PrivacyFragment newInstance(String str) {
            Intrinsics.checkNotNullParameter(str, "title");
            PrivacyFragment privacyFragment = new PrivacyFragment();
            privacyFragment.setTitle(str);
            return privacyFragment;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        getProfileViewModel().getPrivacyUpdateLiveData().observe(getViewLifecycleOwner(), new PrivacyFragment$onCreateView$1(this));
        getProfileViewModel().getProfileUpdateLiveData().observe(getViewLifecycleOwner(), new PrivacyFragment$onCreateView$2(this));
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* access modifiers changed from: private */
    public final void updateSwitch() {
        ((Switch) _$_findCachedViewById(C5619R.C5622id.switchPrivacy)).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        Switch switchR = (Switch) _$_findCachedViewById(C5619R.C5622id.switchPrivacy);
        Intrinsics.checkNotNullExpressionValue(switchR, "switchPrivacy");
        boolean z = true;
        if (getProfileViewModel().getUser().getHideAccount() != 1) {
            z = false;
        }
        switchR.setChecked(z);
        ((Switch) _$_findCachedViewById(C5619R.C5622id.switchPrivacy)).setOnCheckedChangeListener(new PrivacyFragment$updateSwitch$1(this));
    }

    /* access modifiers changed from: private */
    public final void handlePrivacyUpdate(UpdateEvent updateEvent) {
        if (updateEvent == null) {
            getBaseActivity().showMessage((int) R.string.profileErrorUpdatingPrivacy);
        } else if (!updateEvent.getSuccess()) {
            getBaseActivity().showMessage(updateEvent.getMessage());
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        updateSwitch();
        ((TextView) _$_findCachedViewById(C5619R.C5622id.tvPasswordChange)).setOnClickListener(new PrivacyFragment$onViewCreated$1(this));
    }
}
