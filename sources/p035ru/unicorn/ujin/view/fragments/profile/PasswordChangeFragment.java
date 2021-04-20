package p035ru.unicorn.ujin.view.fragments.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.google.android.material.textfield.TextInputEditText;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.BaseTitleFragment;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0017\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0014J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0002¨\u0006\u001b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/PasswordChangeFragment;", "Lru/unicorn/ujin/view/fragments/BaseTitleFragment;", "()V", "getLayoutRes", "", "handleLoading", "", "loading", "", "(Ljava/lang/Boolean;)V", "handlePasswordUpdate", "event", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "saveClickListener", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.PasswordChangeFragment */
/* compiled from: PasswordChangeFragment.kt */
public final class PasswordChangeFragment extends BaseTitleFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;

    @JvmStatic
    public static final PasswordChangeFragment newInstance(String str) {
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
        return R.layout.fragment_password_edit;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "Смена пароля";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/PasswordChangeFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/profile/PasswordChangeFragment;", "title", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.profile.PasswordChangeFragment$Companion */
    /* compiled from: PasswordChangeFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final PasswordChangeFragment newInstance(String str) {
            Intrinsics.checkNotNullParameter(str, "title");
            PasswordChangeFragment passwordChangeFragment = new PasswordChangeFragment();
            passwordChangeFragment.setTitle(str);
            return passwordChangeFragment;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        getProfileViewModel().getPasswordUpdateLiveData().observe(getViewLifecycleOwner(), new PasswordChangeFragment$onCreateView$1(this));
        getProfileViewModel().getShowProgressLiveData().observe(getViewLifecycleOwner(), new PasswordChangeFragment$onCreateView$2(this));
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* access modifiers changed from: private */
    public final void handleLoading(Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
            showLoader(bool, (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pbLoading));
            TextInputEditText textInputEditText = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etOldPassword);
            Intrinsics.checkNotNullExpressionValue(textInputEditText, "etOldPassword");
            textInputEditText.setEnabled(!bool.booleanValue());
            TextInputEditText textInputEditText2 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etNewPassword);
            Intrinsics.checkNotNullExpressionValue(textInputEditText2, "etNewPassword");
            textInputEditText2.setEnabled(!bool.booleanValue());
            TextInputEditText textInputEditText3 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etNewPassword);
            Intrinsics.checkNotNullExpressionValue(textInputEditText3, "etNewPassword");
            textInputEditText3.setEnabled(!bool.booleanValue());
            DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnSave);
            Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "btnSave");
            dynamicBackgroundButton.setEnabled(!bool.booleanValue());
        }
    }

    /* access modifiers changed from: private */
    public final void handlePasswordUpdate(UpdateEvent updateEvent) {
        if (updateEvent != null) {
            boolean success = updateEvent.getSuccess();
            if (success) {
                getBaseActivity().showMessage((int) R.string.passChanged);
                backFragment();
            } else if (!success) {
                getBaseActivity().showMessage(updateEvent.getMessage());
            }
        } else {
            getBaseActivity().showMessage((int) R.string.passNotChanged);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnSave)).setOnClickListener(new PasswordChangeFragment$onViewCreated$1(this));
    }

    /* access modifiers changed from: private */
    public final void saveClickListener() {
        TextInputEditText textInputEditText = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etNewPassword);
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "etNewPassword");
        String valueOf = String.valueOf(textInputEditText.getText());
        TextInputEditText textInputEditText2 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etNewPasswordRepeat);
        Intrinsics.checkNotNullExpressionValue(textInputEditText2, "etNewPasswordRepeat");
        if (!Intrinsics.areEqual((Object) valueOf, (Object) String.valueOf(textInputEditText2.getText()))) {
            Toast.makeText(getActivity(), R.string.passNotEqual, 1).show();
            return;
        }
        TextInputEditText textInputEditText3 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etNewPassword);
        Intrinsics.checkNotNullExpressionValue(textInputEditText3, "etNewPassword");
        if (String.valueOf(textInputEditText3.getText()).length() < 8) {
            Toast.makeText(getActivity(), R.string.passLength, 1).show();
            return;
        }
        ProfileViewModel profileViewModel = getProfileViewModel();
        TextInputEditText textInputEditText4 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etOldPassword);
        Intrinsics.checkNotNullExpressionValue(textInputEditText4, "etOldPassword");
        String valueOf2 = String.valueOf(textInputEditText4.getText());
        TextInputEditText textInputEditText5 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etNewPassword);
        Intrinsics.checkNotNullExpressionValue(textInputEditText5, "etNewPassword");
        profileViewModel.requestChangePassword(valueOf2, String.valueOf(textInputEditText5.getText()));
    }
}
