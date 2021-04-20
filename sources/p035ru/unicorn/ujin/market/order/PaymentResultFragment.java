package p035ru.unicorn.ujin.market.order;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.market.MarketBaseFragment;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0019\u001a\u00020\tH\u0002J\b\u0010\u001a\u001a\u00020\tH\u0002J\b\u0010\u001b\u001a\u00020\tH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, mo51343d2 = {"Lru/unicorn/ujin/market/order/PaymentResultFragment;", "Lru/unicorn/ujin/market/MarketBaseFragment;", "()V", "paymentUrl", "", "success", "", "metricsScreenName", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showFailView", "showSuccessView", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.order.PaymentResultFragment */
/* compiled from: PaymentResultFragment.kt */
public final class PaymentResultFragment extends MarketBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String PAYMENT_URL = "paymentUrl";
    public static final String SUCCESS = "success";
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public String paymentUrl = "";
    private boolean success;

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
        getBaseActivity().setTextTitle(getResources().getString(R.string.order_registration));
        getBaseActivity().setToolbarRight(initCloseButtonList());
        getBaseActivity().hideBottomNavigation();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_payment_result, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        this.success = arguments != null ? arguments.getBoolean("success") : false;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str = arguments2.getString("paymentUrl")) == null) {
            str = "";
        }
        this.paymentUrl = str;
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

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            boolean z = false;
            if (intent != null) {
                z = intent.getBooleanExtra("success", false);
            }
            if (z) {
                showSuccessView();
            } else {
                showFailView();
            }
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, mo51343d2 = {"Lru/unicorn/ujin/market/order/PaymentResultFragment$Companion;", "", "()V", "PAYMENT_URL", "", "SUCCESS", "newInstance", "Lru/unicorn/ujin/market/order/PaymentResultFragment;", "success", "", "paymentUrl", "(Ljava/lang/Boolean;Ljava/lang/String;)Lru/unicorn/ujin/market/order/PaymentResultFragment;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.order.PaymentResultFragment$Companion */
    /* compiled from: PaymentResultFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PaymentResultFragment newInstance(Boolean bool, String str) {
            PaymentResultFragment paymentResultFragment = new PaymentResultFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("success", bool != null ? bool.booleanValue() : false);
            bundle.putString("paymentUrl", str);
            Unit unit = Unit.INSTANCE;
            paymentResultFragment.setArguments(bundle);
            return paymentResultFragment;
        }
    }
}
