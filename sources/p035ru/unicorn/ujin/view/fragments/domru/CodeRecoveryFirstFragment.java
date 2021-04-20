package p035ru.unicorn.ujin.view.fragments.domru;

import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
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
import p035ru.unicorn.ujin.viewModel.events.profile.SendCodeProviderEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0014J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J \u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\bH\u0014J\u0017\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0002\u0010\u001fR\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/domru/CodeRecoveryFirstFragment;", "Lru/unicorn/ujin/view/fragments/AuthBaseFragment;", "()V", "baseActivity", "Lru/unicorn/ujin/view/activity/domru/SendingCodeActivity;", "editTextWatcher", "Landroid/text/TextWatcher;", "handleEvent", "", "event", "Lru/unicorn/ujin/viewModel/events/profile/SendCodeProviderEvent;", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showSendingCodeMessage", "title", "message", "isNewUser", "", "showToolbar", "toggleProgressVisibility", "isLoading", "(Ljava/lang/Boolean;)V", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.domru.CodeRecoveryFirstFragment */
/* compiled from: CodeRecoveryFirstFragment.kt */
public final class CodeRecoveryFirstFragment extends AuthBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public SendingCodeActivity baseActivity;
    private TextWatcher editTextWatcher = new CodeRecoveryFirstFragment$editTextWatcher$1(this);

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

    public static final /* synthetic */ SendingCodeActivity access$getBaseActivity$p(CodeRecoveryFirstFragment codeRecoveryFirstFragment) {
        SendingCodeActivity sendingCodeActivity = codeRecoveryFirstFragment.baseActivity;
        if (sendingCodeActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseActivity");
        }
        return sendingCodeActivity;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_code_first_step, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.baseActivity = (SendingCodeActivity) activity;
            ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnSendCode)).setOnClickListener(new CodeRecoveryFirstFragment$onViewCreated$1(this));
            ((TextView) _$_findCachedViewById(C5619R.C5622id.tvGoBack)).setOnClickListener(new CodeRecoveryFirstFragment$onViewCreated$2(this));
            ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etPhone)).addTextChangedListener(this.editTextWatcher);
            LifecycleOwner lifecycleOwner = this;
            getProfileViewModel().getShowProgressLiveData().observe(lifecycleOwner, new CodeRecoveryFirstFragment$onViewCreated$3(this));
            getProfileViewModel().getSendCodeProviderLiveData().observe(lifecycleOwner, new CodeRecoveryFirstFragment$onViewCreated$4(this));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.activity.domru.SendingCodeActivity");
    }

    /* access modifiers changed from: private */
    public final void handleEvent(SendCodeProviderEvent sendCodeProviderEvent) {
        if (sendCodeProviderEvent.getSuccess()) {
            String string = getResources().getString(R.string.codeHasSent);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.codeHasSent)");
            String string2 = getResources().getString(R.string.codeHasSentMessage);
            Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.codeHasSentMessage)");
            showSendingCodeMessage(string, string2, Intrinsics.areEqual((Object) sendCodeProviderEvent.isNewUser(), (Object) true));
        } else if (!StringsKt.isBlank(sendCodeProviderEvent.getMessage())) {
            DialogUtils dialogUtils = DialogUtils.INSTANCE;
            String message = sendCodeProviderEvent.getMessage();
            SendingCodeActivity sendingCodeActivity = this.baseActivity;
            if (sendingCodeActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseActivity");
            }
            dialogUtils.showError(message, sendingCodeActivity);
        } else {
            DialogUtils dialogUtils2 = DialogUtils.INSTANCE;
            String string3 = getResources().getString(R.string.internalError);
            Intrinsics.checkNotNullExpressionValue(string3, "resources.getString(R.string.internalError)");
            SendingCodeActivity sendingCodeActivity2 = this.baseActivity;
            if (sendingCodeActivity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseActivity");
            }
            dialogUtils2.showError(string3, sendingCodeActivity2);
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

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        r5 = r5.getResources();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void showSendingCodeMessage(java.lang.String r4, java.lang.String r5, boolean r6) {
        /*
            r3 = this;
            androidx.appcompat.app.AlertDialog$Builder r0 = new androidx.appcompat.app.AlertDialog$Builder
            ru.unicorn.ujin.view.activity.domru.SendingCodeActivity r1 = r3.baseActivity
            if (r1 != 0) goto L_0x000b
            java.lang.String r2 = "baseActivity"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x000b:
            android.content.Context r1 = (android.content.Context) r1
            r0.<init>(r1)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            androidx.appcompat.app.AlertDialog$Builder r5 = r0.setMessage((java.lang.CharSequence) r5)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            androidx.appcompat.app.AlertDialog$Builder r4 = r5.setTitle((java.lang.CharSequence) r4)
            r5 = 0
            androidx.appcompat.app.AlertDialog$Builder r4 = r4.setCancelable(r5)
            android.content.Context r5 = r3.getContext()
            if (r5 == 0) goto L_0x0035
            android.content.res.Resources r5 = r5.getResources()
            if (r5 == 0) goto L_0x0035
            r1 = 2131886495(0x7f12019f, float:1.940757E38)
            java.lang.String r5 = r5.getString(r1)
            goto L_0x0036
        L_0x0035:
            r5 = 0
        L_0x0036:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            ru.unicorn.ujin.view.fragments.domru.CodeRecoveryFirstFragment$showSendingCodeMessage$1 r1 = new ru.unicorn.ujin.view.fragments.domru.CodeRecoveryFirstFragment$showSendingCodeMessage$1
            r1.<init>(r3, r6)
            android.content.DialogInterface$OnClickListener r1 = (android.content.DialogInterface.OnClickListener) r1
            r4.setPositiveButton((java.lang.CharSequence) r5, (android.content.DialogInterface.OnClickListener) r1)
            androidx.appcompat.app.AlertDialog r4 = r0.create()
            java.lang.String r5 = "builder.create()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r4.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.domru.CodeRecoveryFirstFragment.showSendingCodeMessage(java.lang.String, java.lang.String, boolean):void");
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/domru/CodeRecoveryFirstFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/domru/CodeRecoveryFirstFragment;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.domru.CodeRecoveryFirstFragment$Companion */
    /* compiled from: CodeRecoveryFirstFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CodeRecoveryFirstFragment newInstance() {
            return new CodeRecoveryFirstFragment();
        }
    }
}
