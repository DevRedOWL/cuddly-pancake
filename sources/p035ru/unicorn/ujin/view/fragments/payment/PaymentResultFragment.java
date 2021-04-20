package p035ru.unicorn.ujin.view.fragments.payment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0014J&\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0002J\b\u0010\u0019\u001a\u00020\u0005H\u0002J\b\u0010\u001a\u001a\u00020\u0005H\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/payment/PaymentResultFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "()V", "onCancelListener", "Lkotlin/Function0;", "", "onCloseListener", "success", "", "initCloseButtonList", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "metricsScreenName", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showFailView", "showSuccessView", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.payment.PaymentResultFragment */
/* compiled from: PaymentResultFragment.kt */
public final class PaymentResultFragment extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String SUCCESS = "success";
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public Function0<Unit> onCancelListener;
    /* access modifiers changed from: private */
    public Function0<Unit> onCloseListener;
    /* access modifiers changed from: private */
    public boolean success;

    @JvmStatic
    public static final PaymentResultFragment newFailureInstance(Function0<Unit> function0, Function0<Unit> function02) {
        return Companion.newFailureInstance(function0, function02);
    }

    @JvmStatic
    public static final PaymentResultFragment newSuccessInstance(Function0<Unit> function0) {
        return Companion.newSuccessInstance(function0);
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
        return "";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ Function0 access$getOnCancelListener$p(PaymentResultFragment paymentResultFragment) {
        Function0<Unit> function0 = paymentResultFragment.onCancelListener;
        if (function0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onCancelListener");
        }
        return function0;
    }

    public static final /* synthetic */ Function0 access$getOnCloseListener$p(PaymentResultFragment paymentResultFragment) {
        Function0<Unit> function0 = paymentResultFragment.onCloseListener;
        if (function0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onCloseListener");
        }
        return function0;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setTextTitle(getResources().getString(R.string.order_registration));
        getBaseActivity().setToolbarRight(initCloseButtonList());
        getBaseActivity().hideBottomNavigation();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_payment_result, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        if (this.success) {
            showSuccessView();
        } else {
            showFailView();
        }
    }

    private final void showSuccessView() {
        ((AppCompatImageView) _$_findCachedViewById(C5619R.C5622id.ivResultIcon)).setImageResource(R.drawable.ic_payment_success);
        TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvResultTitle);
        Intrinsics.checkNotNullExpressionValue(textView, "tvResultTitle");
        textView.setText(getResources().getString(R.string.payment_success_message));
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnClose);
        dynamicBackgroundButton.setText(R.string.goBack);
        dynamicBackgroundButton.setOnClickListener(new PaymentResultFragment$showSuccessView$$inlined$apply$lambda$1(this));
    }

    private final void showFailView() {
        ((AppCompatImageView) _$_findCachedViewById(C5619R.C5622id.ivResultIcon)).setImageResource(R.drawable.ic_payment_fail);
        TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvResultTitle);
        Intrinsics.checkNotNullExpressionValue(textView, "tvResultTitle");
        textView.setText(getResources().getString(R.string.payment_fail_message));
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnClose);
        dynamicBackgroundButton.setText(R.string.try_again_message);
        dynamicBackgroundButton.setOnClickListener(new PaymentResultFragment$showFailView$$inlined$apply$lambda$1(this));
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(C5619R.C5622id.tvCancel);
        appCompatTextView.setVisibility(0);
        appCompatTextView.setText(R.string.goBack);
        appCompatTextView.setOnClickListener(new PaymentResultFragment$showFailView$$inlined$apply$lambda$2(this));
    }

    private final ArrayList<View> initCloseButtonList() {
        ArrayList<View> arrayList = new ArrayList<>();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.toolbar_button_24dp, getBaseActivity().llButtonsRight, false);
        if (inflate != null) {
            ImageButton imageButton = (ImageButton) inflate;
            imageButton.setImageResource(R.drawable.icon_close);
            imageButton.setOnClickListener(new PaymentResultFragment$initCloseButtonList$1(this));
            arrayList.add(imageButton);
            return arrayList;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\u0016\u0010\u000b\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/payment/PaymentResultFragment$Companion;", "", "()V", "SUCCESS", "", "newFailureInstance", "Lru/unicorn/ujin/view/fragments/payment/PaymentResultFragment;", "onCloseListener", "Lkotlin/Function0;", "", "onCancelListener", "newSuccessInstance", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.payment.PaymentResultFragment$Companion */
    /* compiled from: PaymentResultFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final PaymentResultFragment newSuccessInstance(Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "onCloseListener");
            PaymentResultFragment paymentResultFragment = new PaymentResultFragment();
            paymentResultFragment.success = true;
            paymentResultFragment.onCloseListener = function0;
            return paymentResultFragment;
        }

        @JvmStatic
        public final PaymentResultFragment newFailureInstance(Function0<Unit> function0, Function0<Unit> function02) {
            Intrinsics.checkNotNullParameter(function0, "onCloseListener");
            Intrinsics.checkNotNullParameter(function02, "onCancelListener");
            PaymentResultFragment paymentResultFragment = new PaymentResultFragment();
            paymentResultFragment.success = false;
            paymentResultFragment.onCloseListener = function0;
            paymentResultFragment.onCancelListener = function02;
            return paymentResultFragment;
        }
    }
}
