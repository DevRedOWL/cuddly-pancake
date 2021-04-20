package p035ru.unicorn.ujin.view.fragments.qrReader;

import com.budiyev.android.codescanner.ErrorCallback;
import com.facebook.react.bridge.UiThreadUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "onError"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.qrReader.QrReaderFragment$initScanner$2 */
/* compiled from: QrReaderFragment.kt */
final class QrReaderFragment$initScanner$2 implements ErrorCallback {
    public static final QrReaderFragment$initScanner$2 INSTANCE = new QrReaderFragment$initScanner$2();

    QrReaderFragment$initScanner$2() {
    }

    public final void onError(Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "it");
        UiThreadUtil.runOnUiThread(C60831.INSTANCE);
    }
}
