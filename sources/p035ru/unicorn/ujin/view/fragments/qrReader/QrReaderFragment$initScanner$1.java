package p035ru.unicorn.ujin.view.fragments.qrReader;

import android.os.Bundle;
import com.budiyev.android.codescanner.DecodeCallback;
import com.facebook.react.bridge.UiThreadUtil;
import com.google.zxing.Result;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SimpleViewModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "code", "Lcom/google/zxing/Result;", "onDecoded"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.qrReader.QrReaderFragment$initScanner$1 */
/* compiled from: QrReaderFragment.kt */
final class QrReaderFragment$initScanner$1 implements DecodeCallback {
    final /* synthetic */ QrReaderFragment this$0;

    QrReaderFragment$initScanner$1(QrReaderFragment qrReaderFragment) {
        this.this$0 = qrReaderFragment;
    }

    public final void onDecoded(final Result result) {
        Intrinsics.checkNotNullParameter(result, "code");
        UiThreadUtil.runOnUiThread(new Runnable(this) {
            final /* synthetic */ QrReaderFragment$initScanner$1 this$0;

            {
                this.this$0 = r1;
            }

            public final void run() {
                String string;
                Bundle arguments = this.this$0.this$0.getArguments();
                if (arguments != null && (string = arguments.getString("url")) != null) {
                    QrReaderFragment.access$getCodeScanner$p(this.this$0.this$0).stopPreview();
                    this.this$0.this$0.getSimpleViewModel().getSendDynamiceRequest().observe(this.this$0.this$0, new QrReaderFragment$initScanner$1$1$$special$$inlined$let$lambda$1(this));
                    SimpleViewModel simpleViewModel = this.this$0.this$0.getSimpleViewModel();
                    Result result = result;
                    Intrinsics.checkNotNullExpressionValue(result, "code");
                    simpleViewModel.sendDynamicRequestCustomUrl(string, result.getText());
                }
            }
        });
    }
}
