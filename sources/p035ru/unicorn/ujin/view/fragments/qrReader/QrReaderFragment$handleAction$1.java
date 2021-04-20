package p035ru.unicorn.ujin.view.fragments.qrReader;

import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "run"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.qrReader.QrReaderFragment$handleAction$1 */
/* compiled from: QrReaderFragment.kt */
final class QrReaderFragment$handleAction$1 implements Runnable {
    final /* synthetic */ QrReaderFragment this$0;

    QrReaderFragment$handleAction$1(QrReaderFragment qrReaderFragment) {
        this.this$0 = qrReaderFragment;
    }

    public final void run() {
        QrReaderFragment.access$getCodeScanner$p(this.this$0).startPreview();
    }
}
