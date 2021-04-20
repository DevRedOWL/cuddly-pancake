package p035ru.unicorn.ujin.view.fragments.qrReader;

import com.budiyev.android.codescanner.CodeScanner;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

@Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.qrReader.QrReaderFragment$onPause$1 */
/* compiled from: QrReaderFragment.kt */
final /* synthetic */ class QrReaderFragment$onPause$1 extends MutablePropertyReference0Impl {
    QrReaderFragment$onPause$1(QrReaderFragment qrReaderFragment) {
        super(qrReaderFragment, QrReaderFragment.class, "codeScanner", "getCodeScanner()Lcom/budiyev/android/codescanner/CodeScanner;", 0);
    }

    public Object get() {
        return QrReaderFragment.access$getCodeScanner$p((QrReaderFragment) this.receiver);
    }

    public void set(Object obj) {
        ((QrReaderFragment) this.receiver).codeScanner = (CodeScanner) obj;
    }
}
