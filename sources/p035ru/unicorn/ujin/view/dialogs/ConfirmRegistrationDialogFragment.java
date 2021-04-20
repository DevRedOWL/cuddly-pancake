package p035ru.unicorn.ujin.view.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.chaos.view.PinView;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u000fH\u0002J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0006\u0010\u001f\u001a\u00020\u000fJ\b\u0010 \u001a\u00020\u000fH\u0016J\u001a\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR&\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006&"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/ConfirmRegistrationDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "countDownTimer", "Landroid/os/CountDownTimer;", "phone", "", "profileViewModel", "Lru/unicorn/ujin/data/profile/ProfileViewModel;", "getProfileViewModel", "()Lru/unicorn/ujin/data/profile/ProfileViewModel;", "profileViewModel$delegate", "Lkotlin/Lazy;", "sendCodeListener", "Lkotlin/Function3;", "", "totalTime", "", "userName", "exit", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onInvalidCode", "onStart", "onViewCreated", "view", "sendCode", "code", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.dialogs.ConfirmRegistrationDialogFragment */
/* compiled from: ConfirmRegistrationDialogFragment.kt */
public final class ConfirmRegistrationDialogFragment extends DialogFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    private CountDownTimer countDownTimer;
    /* access modifiers changed from: private */
    public String phone;
    private final Lazy profileViewModel$delegate = LazyKt.lazy(new ConfirmRegistrationDialogFragment$profileViewModel$2(this));
    /* access modifiers changed from: private */
    public Function3<? super String, ? super String, ? super String, Unit> sendCodeListener;
    private final long totalTime = 300000;
    /* access modifiers changed from: private */
    public String userName;

    @JvmStatic
    public static final ConfirmRegistrationDialogFragment newInstance(String str, String str2, Function3<? super String, ? super String, ? super String, Unit> function3) {
        return Companion.newInstance(str, str2, function3);
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

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ String access$getPhone$p(ConfirmRegistrationDialogFragment confirmRegistrationDialogFragment) {
        String str = confirmRegistrationDialogFragment.phone;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("phone");
        }
        return str;
    }

    public static final /* synthetic */ Function3 access$getSendCodeListener$p(ConfirmRegistrationDialogFragment confirmRegistrationDialogFragment) {
        Function3<? super String, ? super String, ? super String, Unit> function3 = confirmRegistrationDialogFragment.sendCodeListener;
        if (function3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sendCodeListener");
        }
        return function3;
    }

    public static final /* synthetic */ String access$getUserName$p(ConfirmRegistrationDialogFragment confirmRegistrationDialogFragment) {
        String str = confirmRegistrationDialogFragment.userName;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userName");
        }
        return str;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\tH\u0007¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/ConfirmRegistrationDialogFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/dialogs/ConfirmRegistrationDialogFragment;", "phone", "", "userName", "sendCodeListener", "Lkotlin/Function3;", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.ConfirmRegistrationDialogFragment$Companion */
    /* compiled from: ConfirmRegistrationDialogFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ConfirmRegistrationDialogFragment newInstance(String str, String str2, Function3<? super String, ? super String, ? super String, Unit> function3) {
            Intrinsics.checkNotNullParameter(str, "phone");
            Intrinsics.checkNotNullParameter(str2, "userName");
            Intrinsics.checkNotNullParameter(function3, "sendCodeListener");
            ConfirmRegistrationDialogFragment confirmRegistrationDialogFragment = new ConfirmRegistrationDialogFragment();
            confirmRegistrationDialogFragment.phone = str;
            confirmRegistrationDialogFragment.userName = str2;
            confirmRegistrationDialogFragment.sendCodeListener = function3;
            return confirmRegistrationDialogFragment;
        }
    }

    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -2);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        Dialog dialog = getDialog();
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        View inflate = layoutInflater.inflate(R.layout.dialog_confirm_registration, viewGroup);
        inflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ((PinView) _$_findCachedViewById(C5619R.C5622id.pinView)).addTextChangedListener(new ConfirmRegistrationDialogFragment$onViewCreated$1(this));
        ((PinView) _$_findCachedViewById(C5619R.C5622id.pinView)).requestFocus();
        ((TextView) _$_findCachedViewById(C5619R.C5622id.tvCancel)).setOnClickListener(new ConfirmRegistrationDialogFragment$onViewCreated$2(this));
        this.countDownTimer = new ConfirmRegistrationDialogFragment$onViewCreated$3(this, this.totalTime, 1000);
        CountDownTimer countDownTimer2 = this.countDownTimer;
        if (countDownTimer2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("countDownTimer");
        }
        countDownTimer2.start();
    }

    /* access modifiers changed from: private */
    public final void sendCode(String str) {
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        progressBar.setVisibility(0);
        Function3<? super String, ? super String, ? super String, Unit> function3 = this.sendCodeListener;
        if (function3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sendCodeListener");
        }
        String str2 = this.userName;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userName");
        }
        String str3 = this.phone;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("phone");
        }
        function3.invoke(str2, str3, str);
    }

    public final void onInvalidCode() {
        ((PinView) _$_findCachedViewById(C5619R.C5622id.pinView)).setText("");
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        progressBar.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public final void exit() {
        dismiss();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "dialog");
        UIHelper.hideKeyboard(getActivity(), (PinView) _$_findCachedViewById(C5619R.C5622id.pinView));
        CountDownTimer countDownTimer2 = this.countDownTimer;
        if (countDownTimer2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("countDownTimer");
        }
        countDownTimer2.cancel();
        super.onDismiss(dialogInterface);
    }
}
