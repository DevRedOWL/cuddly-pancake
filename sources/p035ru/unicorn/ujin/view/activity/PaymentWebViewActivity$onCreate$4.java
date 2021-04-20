package p035ru.unicorn.ujin.view.activity;

import android.os.Message;
import android.util.Log;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.text.StringsKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J,\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\r"}, mo51343d2 = {"ru/unicorn/ujin/view/activity/PaymentWebViewActivity$onCreate$4", "Landroid/webkit/WebChromeClient;", "onConsoleMessage", "", "consoleMessage", "Landroid/webkit/ConsoleMessage;", "onCreateWindow", "view", "Landroid/webkit/WebView;", "isDialog", "isUserGesture", "resultMsg", "Landroid/os/Message;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.PaymentWebViewActivity$onCreate$4 */
/* compiled from: PaymentWebViewActivity.kt */
public final class PaymentWebViewActivity$onCreate$4 extends WebChromeClient {
    final /* synthetic */ PaymentWebViewActivity this$0;

    PaymentWebViewActivity$onCreate$4(PaymentWebViewActivity paymentWebViewActivity) {
        this.this$0 = paymentWebViewActivity;
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str;
        String message;
        if (consoleMessage == null || (str = consoleMessage.message()) == null) {
            str = "";
        }
        Log.d("PAYMENT_WEBVIEW", str);
        if (!(consoleMessage == null || (message = consoleMessage.message()) == null || !StringsKt.contains$default((CharSequence) message, (CharSequence) "Payment success [for:bms]", false, 2, (Object) null))) {
            this.this$0.setReturnToBms(true);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        this.this$0.handleCreateWebWindowRequest(message);
        return true;
    }
}
