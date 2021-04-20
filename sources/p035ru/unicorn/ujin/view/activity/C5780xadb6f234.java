package p035ru.unicorn.ujin.view.activity;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, mo51343d2 = {"ru/unicorn/ujin/view/activity/PaymentWebViewActivity$handleCreateWebWindowRequest$1$2", "Landroid/webkit/WebChromeClient;", "onCloseWindow", "", "window", "Landroid/webkit/WebView;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.PaymentWebViewActivity$handleCreateWebWindowRequest$$inlined$apply$lambda$1 */
/* compiled from: PaymentWebViewActivity.kt */
public final class C5780xadb6f234 extends WebChromeClient {
    final /* synthetic */ PaymentWebViewActivity this$0;

    C5780xadb6f234(PaymentWebViewActivity paymentWebViewActivity) {
        this.this$0 = paymentWebViewActivity;
    }

    public void onCloseWindow(WebView webView) {
        super.onCloseWindow(webView);
        this.this$0.handleCloseWebWindowRequest();
    }
}
