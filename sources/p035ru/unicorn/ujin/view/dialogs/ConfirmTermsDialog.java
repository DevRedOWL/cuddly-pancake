package p035ru.unicorn.ujin.view.dialogs;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bX.¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bX.¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/ConfirmTermsDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "confirmTermsListener", "Lkotlin/Function1;", "", "", "showServiceRules", "Lkotlin/Function0;", "showTerms", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onViewCreated", "view", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.dialogs.ConfirmTermsDialog */
/* compiled from: ConfirmTermsDialog.kt */
public final class ConfirmTermsDialog extends DialogFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public Function1<? super Boolean, Unit> confirmTermsListener;
    /* access modifiers changed from: private */
    public Function0<Unit> showServiceRules;
    /* access modifiers changed from: private */
    public Function0<Unit> showTerms;

    @JvmStatic
    public static final ConfirmTermsDialog newInstance(Function0<Unit> function0, Function0<Unit> function02, Function1<? super Boolean, Unit> function1) {
        return Companion.newInstance(function0, function02, function1);
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

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ Function1 access$getConfirmTermsListener$p(ConfirmTermsDialog confirmTermsDialog) {
        Function1<? super Boolean, Unit> function1 = confirmTermsDialog.confirmTermsListener;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmTermsListener");
        }
        return function1;
    }

    public static final /* synthetic */ Function0 access$getShowServiceRules$p(ConfirmTermsDialog confirmTermsDialog) {
        Function0<Unit> function0 = confirmTermsDialog.showServiceRules;
        if (function0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("showServiceRules");
        }
        return function0;
    }

    public static final /* synthetic */ Function0 access$getShowTerms$p(ConfirmTermsDialog confirmTermsDialog) {
        Function0<Unit> function0 = confirmTermsDialog.showTerms;
        if (function0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("showTerms");
        }
        return function0;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\nH\u0007¨\u0006\f"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/ConfirmTermsDialog$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/dialogs/ConfirmTermsDialog;", "showTerms", "Lkotlin/Function0;", "", "showServiceRules", "confirmTermsListener", "Lkotlin/Function1;", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.ConfirmTermsDialog$Companion */
    /* compiled from: ConfirmTermsDialog.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ConfirmTermsDialog newInstance(Function0<Unit> function0, Function0<Unit> function02, Function1<? super Boolean, Unit> function1) {
            Intrinsics.checkNotNullParameter(function0, "showTerms");
            Intrinsics.checkNotNullParameter(function02, "showServiceRules");
            Intrinsics.checkNotNullParameter(function1, "confirmTermsListener");
            ConfirmTermsDialog confirmTermsDialog = new ConfirmTermsDialog();
            confirmTermsDialog.showTerms = function0;
            confirmTermsDialog.showServiceRules = function02;
            confirmTermsDialog.confirmTermsListener = function1;
            return confirmTermsDialog;
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
        View inflate = layoutInflater.inflate(R.layout.dialog_confirm_terms, viewGroup);
        inflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ((CheckBox) _$_findCachedViewById(C5619R.C5622id.cbTerms)).setOnCheckedChangeListener(new ConfirmTermsDialog$onViewCreated$1(this));
        ((TextView) _$_findCachedViewById(C5619R.C5622id.tvCancel)).setOnClickListener(new ConfirmTermsDialog$onViewCreated$2(this));
        TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvCheckTerms);
        String string = textView.getResources().getString(R.string.termsOfUseLinkText);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.termsOfUseLinkText)");
        ConfirmTermsDialogKt.makeLink(textView, string, new ConfirmTermsDialog$onViewCreated$$inlined$with$lambda$1(this));
        String string2 = textView.getResources().getString(R.string.serviceRulesLinkText);
        Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.serviceRulesLinkText)");
        ConfirmTermsDialogKt.makeLink(textView, string2, new ConfirmTermsDialog$onViewCreated$$inlined$with$lambda$2(this));
    }
}
