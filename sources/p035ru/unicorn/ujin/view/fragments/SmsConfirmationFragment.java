package p035ru.unicorn.ujin.view.fragments;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 B2\u00020\u0001:\u0001BB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u00103\u001a\u00020\u00182\u0006\u00104\u001a\u00020\u000eH\u0002J\u0010\u00105\u001a\u00020\u00182\u0006\u00104\u001a\u00020\u000eH\u0002J\b\u00106\u001a\u00020\u0004H\u0014J&\u00107\u001a\u0004\u0018\u0001082\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u001a\u0010?\u001a\u00020\u00182\u0006\u0010@\u001a\u0002082\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\b\u0010A\u001a\u00020\u0018H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00180%X.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0010\"\u0004\b,\u0010\u0012R\u001a\u0010-\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001a\u00100\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\b¨\u0006C"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/SmsConfirmationFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "()V", "activityTitle", "", "getActivityTitle", "()Ljava/lang/String;", "setActivityTitle", "(Ljava/lang/String;)V", "code", "getCode", "setCode", "codeLiveData", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "getCodeLiveData", "()Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "setCodeLiveData", "(Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;)V", "fragmentTitle", "getFragmentTitle", "setFragmentTitle", "getSmsRequest", "Lkotlin/Function0;", "", "getGetSmsRequest", "()Lkotlin/jvm/functions/Function0;", "setGetSmsRequest", "(Lkotlin/jvm/functions/Function0;)V", "loaderLivaData", "Landroidx/lifecycle/MutableLiveData;", "", "getLoaderLivaData", "()Landroidx/lifecycle/MutableLiveData;", "setLoaderLivaData", "(Landroidx/lifecycle/MutableLiveData;)V", "sendCodeRequest", "Lkotlin/Function1;", "getSendCodeRequest", "()Lkotlin/jvm/functions/Function1;", "setSendCodeRequest", "(Lkotlin/jvm/functions/Function1;)V", "smsLiveData", "getSmsLiveData", "setSmsLiveData", "successMessage", "getSuccessMessage", "setSuccessMessage", "successTitle", "getSuccessTitle", "setSuccessTitle", "handleConfirm", "event", "handleSms", "metricsScreenName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.SmsConfirmationFragment */
/* compiled from: SmsConfirmationFragment.kt */
public final class SmsConfirmationFragment extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    public String activityTitle;
    private String code = "";
    public SingleLiveEvent<UpdateEvent> codeLiveData;
    public String fragmentTitle;
    public Function0<Unit> getSmsRequest;
    public MutableLiveData<Boolean> loaderLivaData;
    public Function1<? super String, Unit> sendCodeRequest;
    public SingleLiveEvent<UpdateEvent> smsLiveData;
    public String successMessage;
    public String successTitle;

    @JvmStatic
    public static final SmsConfirmationFragment newInstance(String str, String str2, Function0<Unit> function0, Function1<? super String, Unit> function1, SingleLiveEvent<UpdateEvent> singleLiveEvent, SingleLiveEvent<UpdateEvent> singleLiveEvent2, MutableLiveData<Boolean> mutableLiveData, String str3, String str4) {
        return Companion.newInstance(str, str2, function0, function1, singleLiveEvent, singleLiveEvent2, mutableLiveData, str3, str4);
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

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "Подтверждение по СМС";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final String getActivityTitle() {
        String str = this.activityTitle;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityTitle");
        }
        return str;
    }

    public final void setActivityTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.activityTitle = str;
    }

    public final String getFragmentTitle() {
        String str = this.fragmentTitle;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentTitle");
        }
        return str;
    }

    public final void setFragmentTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fragmentTitle = str;
    }

    public final Function0<Unit> getGetSmsRequest() {
        Function0<Unit> function0 = this.getSmsRequest;
        if (function0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getSmsRequest");
        }
        return function0;
    }

    public final void setGetSmsRequest(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.getSmsRequest = function0;
    }

    public final Function1<String, Unit> getSendCodeRequest() {
        Function1<? super String, Unit> function1 = this.sendCodeRequest;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sendCodeRequest");
        }
        return function1;
    }

    public final void setSendCodeRequest(Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.sendCodeRequest = function1;
    }

    public final String getSuccessTitle() {
        String str = this.successTitle;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("successTitle");
        }
        return str;
    }

    public final void setSuccessTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.successTitle = str;
    }

    public final String getSuccessMessage() {
        String str = this.successMessage;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("successMessage");
        }
        return str;
    }

    public final void setSuccessMessage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.successMessage = str;
    }

    public final SingleLiveEvent<UpdateEvent> getSmsLiveData() {
        SingleLiveEvent<UpdateEvent> singleLiveEvent = this.smsLiveData;
        if (singleLiveEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smsLiveData");
        }
        return singleLiveEvent;
    }

    public final void setSmsLiveData(SingleLiveEvent<UpdateEvent> singleLiveEvent) {
        Intrinsics.checkNotNullParameter(singleLiveEvent, "<set-?>");
        this.smsLiveData = singleLiveEvent;
    }

    public final SingleLiveEvent<UpdateEvent> getCodeLiveData() {
        SingleLiveEvent<UpdateEvent> singleLiveEvent = this.codeLiveData;
        if (singleLiveEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("codeLiveData");
        }
        return singleLiveEvent;
    }

    public final void setCodeLiveData(SingleLiveEvent<UpdateEvent> singleLiveEvent) {
        Intrinsics.checkNotNullParameter(singleLiveEvent, "<set-?>");
        this.codeLiveData = singleLiveEvent;
    }

    public final MutableLiveData<Boolean> getLoaderLivaData() {
        MutableLiveData<Boolean> mutableLiveData = this.loaderLivaData;
        if (mutableLiveData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loaderLivaData");
        }
        return mutableLiveData;
    }

    public final void setLoaderLivaData(MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.loaderLivaData = mutableLiveData;
    }

    public final String getCode() {
        return this.code;
    }

    public final void setCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.code = str;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        String str = this.activityTitle;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityTitle");
        }
        if (str.length() > 0) {
            BaseActivity baseActivity = getBaseActivity();
            String str2 = this.activityTitle;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityTitle");
            }
            baseActivity.setTextTitle(str2);
        } else {
            getBaseActivity().showImageLogo();
        }
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_sms_confirmation, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvTitle);
        Intrinsics.checkNotNullExpressionValue(textView, "tvTitle");
        String str = this.fragmentTitle;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentTitle");
        }
        textView.setText(str);
        ((TextView) _$_findCachedViewById(C5619R.C5622id.tvResendSMS)).setOnClickListener(new SmsConfirmationFragment$onViewCreated$1(this));
        SingleLiveEvent<UpdateEvent> singleLiveEvent = this.smsLiveData;
        if (singleLiveEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smsLiveData");
        }
        singleLiveEvent.observe(getViewLifecycleOwner(), new SmsConfirmationFragment$onViewCreated$2(this));
        SingleLiveEvent<UpdateEvent> singleLiveEvent2 = this.codeLiveData;
        if (singleLiveEvent2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("codeLiveData");
        }
        singleLiveEvent2.observe(getViewLifecycleOwner(), new SmsConfirmationFragment$onViewCreated$3(this));
        MutableLiveData<Boolean> mutableLiveData = this.loaderLivaData;
        if (mutableLiveData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loaderLivaData");
        }
        mutableLiveData.observe(getViewLifecycleOwner(), new SmsConfirmationFragment$onViewCreated$4(this));
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnConfirm)).setOnClickListener(new SmsConfirmationFragment$onViewCreated$5(this));
        ((TextView) _$_findCachedViewById(C5619R.C5622id.tv1)).setOnClickListener(new SmsConfirmationFragment$onViewCreated$6(this));
        ((TextView) _$_findCachedViewById(C5619R.C5622id.tv2)).setOnClickListener(new SmsConfirmationFragment$onViewCreated$7(this));
        ((TextView) _$_findCachedViewById(C5619R.C5622id.tv3)).setOnClickListener(new SmsConfirmationFragment$onViewCreated$8(this));
        ((TextView) _$_findCachedViewById(C5619R.C5622id.tv4)).setOnClickListener(new SmsConfirmationFragment$onViewCreated$9(this));
        EditText editText = (EditText) _$_findCachedViewById(C5619R.C5622id.etPin);
        Intrinsics.checkNotNullExpressionValue(editText, "etPin");
        editText.setOnFocusChangeListener(new SmsConfirmationFragment$onViewCreated$10(this));
        ((EditText) _$_findCachedViewById(C5619R.C5622id.etPin)).addTextChangedListener(new SmsConfirmationFragment$onViewCreated$11(this));
        ((EditText) _$_findCachedViewById(C5619R.C5622id.etPin)).requestFocus();
    }

    /* access modifiers changed from: private */
    public final void handleConfirm(UpdateEvent updateEvent) {
        if (updateEvent.getSuccess()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getBaseActivity());
            String str = this.successTitle;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("successTitle");
            }
            AlertDialog.Builder title = builder.setTitle(str);
            String str2 = this.successMessage;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("successMessage");
            }
            title.setMessage(str2).setPositiveButton(getString(R.string.sms_confirmation_dialog_success_close), new SmsConfirmationFragment$handleConfirm$1(this)).show();
            return;
        }
        showMessage(updateEvent.getMessage());
    }

    /* access modifiers changed from: private */
    public final void handleSms(UpdateEvent updateEvent) {
        if (!updateEvent.getSuccess()) {
            showMessage(updateEvent.getMessage());
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jt\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0007¨\u0006\u0016"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/SmsConfirmationFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/SmsConfirmationFragment;", "activityTitle", "", "fragmentTitle", "getSmsRequest", "Lkotlin/Function0;", "", "sendCodeRequest", "Lkotlin/Function1;", "smsLiveData", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "codeLiveData", "loaderLivaData", "Landroidx/lifecycle/MutableLiveData;", "", "successTitle", "successMessage", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.SmsConfirmationFragment$Companion */
    /* compiled from: SmsConfirmationFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final SmsConfirmationFragment newInstance(String str, String str2, Function0<Unit> function0, Function1<? super String, Unit> function1, SingleLiveEvent<UpdateEvent> singleLiveEvent, SingleLiveEvent<UpdateEvent> singleLiveEvent2, MutableLiveData<Boolean> mutableLiveData, String str3, String str4) {
            Intrinsics.checkNotNullParameter(str, "activityTitle");
            Intrinsics.checkNotNullParameter(str2, "fragmentTitle");
            Intrinsics.checkNotNullParameter(function0, "getSmsRequest");
            Intrinsics.checkNotNullParameter(function1, "sendCodeRequest");
            Intrinsics.checkNotNullParameter(singleLiveEvent, "smsLiveData");
            Intrinsics.checkNotNullParameter(singleLiveEvent2, "codeLiveData");
            Intrinsics.checkNotNullParameter(mutableLiveData, "loaderLivaData");
            Intrinsics.checkNotNullParameter(str3, "successTitle");
            Intrinsics.checkNotNullParameter(str4, "successMessage");
            SmsConfirmationFragment smsConfirmationFragment = new SmsConfirmationFragment();
            smsConfirmationFragment.setActivityTitle(str);
            smsConfirmationFragment.setFragmentTitle(str2);
            smsConfirmationFragment.setGetSmsRequest(function0);
            smsConfirmationFragment.setSendCodeRequest(function1);
            smsConfirmationFragment.setSuccessTitle(str3);
            smsConfirmationFragment.setSuccessMessage(str4);
            smsConfirmationFragment.setSmsLiveData(singleLiveEvent);
            smsConfirmationFragment.setCodeLiveData(singleLiveEvent2);
            smsConfirmationFragment.setLoaderLivaData(mutableLiveData);
            return smsConfirmationFragment;
        }
    }
}
