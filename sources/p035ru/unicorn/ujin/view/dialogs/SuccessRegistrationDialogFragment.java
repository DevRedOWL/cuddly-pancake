package p035ru.unicorn.ujin.view.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\fH\u0016J\u001a\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000¨\u0006\u001d"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/SuccessRegistrationDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "profileViewModel", "Lru/unicorn/ujin/data/profile/ProfileViewModel;", "getProfileViewModel", "()Lru/unicorn/ujin/data/profile/ProfileViewModel;", "profileViewModel$delegate", "Lkotlin/Lazy;", "successRegistrationListener", "Lkotlin/Function1;", "", "", "userToken", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onStart", "onViewCreated", "view", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.dialogs.SuccessRegistrationDialogFragment */
/* compiled from: SuccessRegistrationDialogFragment.kt */
public final class SuccessRegistrationDialogFragment extends DialogFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    private final Lazy profileViewModel$delegate = LazyKt.lazy(new SuccessRegistrationDialogFragment$profileViewModel$2(this));
    /* access modifiers changed from: private */
    public Function1<? super String, Unit> successRegistrationListener;
    /* access modifiers changed from: private */
    public String userToken;

    @JvmStatic
    public static final SuccessRegistrationDialogFragment newInstance(String str, Function1<? super String, Unit> function1) {
        return Companion.newInstance(str, function1);
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

    public static final /* synthetic */ Function1 access$getSuccessRegistrationListener$p(SuccessRegistrationDialogFragment successRegistrationDialogFragment) {
        Function1<? super String, Unit> function1 = successRegistrationDialogFragment.successRegistrationListener;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("successRegistrationListener");
        }
        return function1;
    }

    public static final /* synthetic */ String access$getUserToken$p(SuccessRegistrationDialogFragment successRegistrationDialogFragment) {
        String str = successRegistrationDialogFragment.userToken;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userToken");
        }
        return str;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bH\u0007¨\u0006\n"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/SuccessRegistrationDialogFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/dialogs/SuccessRegistrationDialogFragment;", "userToken", "", "successRegistrationListener", "Lkotlin/Function1;", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.SuccessRegistrationDialogFragment$Companion */
    /* compiled from: SuccessRegistrationDialogFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final SuccessRegistrationDialogFragment newInstance(String str, Function1<? super String, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "userToken");
            Intrinsics.checkNotNullParameter(function1, "successRegistrationListener");
            SuccessRegistrationDialogFragment successRegistrationDialogFragment = new SuccessRegistrationDialogFragment();
            successRegistrationDialogFragment.userToken = str;
            successRegistrationDialogFragment.successRegistrationListener = function1;
            return successRegistrationDialogFragment;
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
        View inflate = layoutInflater.inflate(R.layout.dialog_success_registration, viewGroup);
        inflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ((TextView) _$_findCachedViewById(C5619R.C5622id.tvSuccess)).setOnClickListener(new SuccessRegistrationDialogFragment$onViewCreated$1(this));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "dialog");
        Function1<? super String, Unit> function1 = this.successRegistrationListener;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("successRegistrationListener");
        }
        String str = this.userToken;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userToken");
        }
        function1.invoke(str);
        super.onDismiss(dialogInterface);
    }
}
