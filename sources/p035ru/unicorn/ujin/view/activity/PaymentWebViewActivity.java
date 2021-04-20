package p035ru.unicorn.ujin.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\u0012\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0003J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\u0012\u0010\u001a\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u0010H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001f"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/PaymentWebViewActivity;", "Lru/unicorn/ujin/view/activity/BaseActivity;", "()V", "returnToBms", "", "getReturnToBms", "()Z", "setReturnToBms", "(Z)V", "webView2", "Landroid/webkit/WebView;", "getWebView2", "()Landroid/webkit/WebView;", "setWebView2", "(Landroid/webkit/WebView;)V", "exit", "", "success", "getBottomNavigationMenuId", "", "handleCloseWebWindowRequest", "handleCreateWebWindowRequest", "resultMsg", "Landroid/os/Message;", "hasBottomSheet", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showChatsFragment", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.PaymentWebViewActivity */
/* compiled from: PaymentWebViewActivity.kt */
public final class PaymentWebViewActivity extends BaseActivity {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int PAYMENT_CODE = 1;
    public static final String PAYMENT_URL = "paymentUrl";
    public static final String SUCCESS = "success";
    private HashMap _$_findViewCache;
    private boolean returnToBms;
    private WebView webView2;

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
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public int getBottomNavigationMenuId() {
        return 0;
    }

    public boolean hasBottomSheet() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void showChatsFragment() {
    }

    public final WebView getWebView2() {
        return this.webView2;
    }

    public final void setWebView2(WebView webView) {
        this.webView2 = webView;
    }

    public final boolean getReturnToBms() {
        return this.returnToBms;
    }

    public final void setReturnToBms(boolean z) {
        this.returnToBms = z;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_payment_web_view);
        ((AppCompatImageView) _$_findCachedViewById(C5619R.C5622id.imageBack)).setOnClickListener(new PaymentWebViewActivity$onCreate$1(this));
        String stringExtra = getIntent().getStringExtra("paymentUrl");
        if (stringExtra == null) {
            stringExtra = "";
        }
        Intrinsics.checkNotNullExpressionValue(stringExtra, "intent.getStringExtra(PAYMENT_URL) ?: \"\"");
        ((WebView) _$_findCachedViewById(C5619R.C5622id.webView)).setInitialScale(1);
        WebView webView = (WebView) _$_findCachedViewById(C5619R.C5622id.webView);
        Intrinsics.checkNotNullExpressionValue(webView, "webView");
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setSupportMultipleWindows(true);
        WebView webView3 = (WebView) _$_findCachedViewById(C5619R.C5622id.webView);
        Intrinsics.checkNotNullExpressionValue(webView3, "webView");
        webView3.setWebViewClient(new PaymentWebViewActivity$onCreate$3(this));
        WebView webView4 = (WebView) _$_findCachedViewById(C5619R.C5622id.webView);
        Intrinsics.checkNotNullExpressionValue(webView4, "webView");
        webView4.setWebChromeClient(new PaymentWebViewActivity$onCreate$4(this));
        ((WebView) _$_findCachedViewById(C5619R.C5622id.webView)).setOnLongClickListener(PaymentWebViewActivity$onCreate$5.INSTANCE);
        WebView webView5 = (WebView) _$_findCachedViewById(C5619R.C5622id.webView);
        Intrinsics.checkNotNullExpressionValue(webView5, "webView");
        webView5.setLongClickable(false);
        ((WebView) _$_findCachedViewById(C5619R.C5622id.webView)).loadUrl(stringExtra);
    }

    public void onBackPressed() {
        if (this.returnToBms) {
            exit(true);
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: private */
    public final void handleCloseWebWindowRequest() {
        WebView webView = this.webView2;
        if (webView != null || (webView != null && webView.getVisibility() == 8)) {
            WebView webView3 = (WebView) _$_findCachedViewById(C5619R.C5622id.webView);
            Intrinsics.checkNotNullExpressionValue(webView3, "webView");
            webView3.setVisibility(0);
            ((ConstraintLayout) _$_findCachedViewById(C5619R.C5622id.container)).removeView(this.webView2);
            this.webView2 = null;
        }
    }

    /* access modifiers changed from: private */
    public final void handleCreateWebWindowRequest(Message message) {
        if (message != null && message.obj != null && (message.obj instanceof WebView.WebViewTransport)) {
            Object obj = message.obj;
            if (obj != null) {
                WebView webView = new WebView(this);
                webView.setInitialScale(1);
                webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                WebSettings settings = webView.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setUseWideViewPort(true);
                settings.setLoadWithOverviewMode(true);
                settings.setBuiltInZoomControls(true);
                settings.setSupportZoom(true);
                settings.setJavaScriptCanOpenWindowsAutomatically(true);
                settings.setSupportMultipleWindows(true);
                webView.setWebViewClient(new WebViewClient());
                webView.setWebChromeClient(new C5780xadb6f234(this));
                Unit unit = Unit.INSTANCE;
                this.webView2 = webView;
                WebView webView3 = (WebView) _$_findCachedViewById(C5619R.C5622id.webView);
                Intrinsics.checkNotNullExpressionValue(webView3, "webView");
                webView3.setVisibility(8);
                ((ConstraintLayout) _$_findCachedViewById(C5619R.C5622id.container)).addView(this.webView2);
                ((WebView.WebViewTransport) obj).setWebView(this.webView2);
                message.sendToTarget();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.webkit.WebView.WebViewTransport");
        }
    }

    /* access modifiers changed from: private */
    public final void exit(boolean z) {
        Intent intent = new Intent();
        intent.putExtra("success", z);
        setResult(-1, intent);
        finish();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/PaymentWebViewActivity$Companion;", "", "()V", "PAYMENT_CODE", "", "PAYMENT_URL", "", "SUCCESS", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.PaymentWebViewActivity$Companion */
    /* compiled from: PaymentWebViewActivity.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
