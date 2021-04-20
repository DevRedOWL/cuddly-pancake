package p035ru.unicorn.ujin.view.activity;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.unicorn.C5619R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0017J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, mo51343d2 = {"ru/unicorn/ujin/view/activity/PaymentWebViewActivity$onCreate$3", "Landroid/webkit/WebViewClient;", "onPageFinished", "", "view", "Landroid/webkit/WebView;", "url", "", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "shouldOverrideUrlLoading", "", "request", "Landroid/webkit/WebResourceRequest;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.PaymentWebViewActivity$onCreate$3 */
/* compiled from: PaymentWebViewActivity.kt */
public final class PaymentWebViewActivity$onCreate$3 extends WebViewClient {
    final /* synthetic */ PaymentWebViewActivity this$0;

    PaymentWebViewActivity$onCreate$3(PaymentWebViewActivity paymentWebViewActivity) {
        this.this$0 = paymentWebViewActivity;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Intrinsics.checkNotNullParameter(webView, "view");
        Intrinsics.checkNotNullParameter(str, "url");
        webView.loadUrl(str);
        return false;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Intrinsics.checkNotNullParameter(webView, "view");
        Intrinsics.checkNotNullParameter(webResourceRequest, "request");
        webView.loadUrl(webResourceRequest.getUrl().toString());
        return false;
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebView webView2 = (WebView) this.this$0._$_findCachedViewById(C5619R.C5622id.webView);
        Intrinsics.checkNotNullExpressionValue(webView2, "webView");
        webView2.setVisibility(8);
        ProgressBar progressBar = (ProgressBar) this.this$0._$_findCachedViewById(C5619R.C5622id.progressBar);
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        progressBar.setVisibility(0);
        if (str != null ? StringsKt.contains$default((CharSequence) str, (CharSequence) "success", false, 2, (Object) null) : false) {
            this.this$0.exit(true);
            return;
        }
        if (str != null ? StringsKt.contains$default((CharSequence) str, (CharSequence) "fail", false, 2, (Object) null) : false) {
            this.this$0.exit(false);
        }
    }

    public void onPageFinished(WebView webView, String str) {
        ProgressBar progressBar = (ProgressBar) this.this$0._$_findCachedViewById(C5619R.C5622id.progressBar);
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        progressBar.setVisibility(8);
        WebView webView2 = (WebView) this.this$0._$_findCachedViewById(C5619R.C5622id.webView);
        Intrinsics.checkNotNullExpressionValue(webView2, "webView");
        webView2.setVisibility(0);
    }
}
