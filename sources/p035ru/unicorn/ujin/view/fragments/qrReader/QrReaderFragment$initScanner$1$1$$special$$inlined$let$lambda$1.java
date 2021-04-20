package p035ru.unicorn.ujin.view.fragments.qrReader;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.fragments.qrReader.QrReaderFragment$initScanner$1;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, mo51343d2 = {"<anonymous>", "", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "onChanged", "ru/unicorn/ujin/view/fragments/qrReader/QrReaderFragment$initScanner$1$1$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.qrReader.QrReaderFragment$initScanner$1$1$$special$$inlined$let$lambda$1 */
/* compiled from: QrReaderFragment.kt */
final class QrReaderFragment$initScanner$1$1$$special$$inlined$let$lambda$1<T> implements Observer<Resource<Void>> {
    final /* synthetic */ QrReaderFragment$initScanner$1.C60821 this$0;

    QrReaderFragment$initScanner$1$1$$special$$inlined$let$lambda$1(QrReaderFragment$initScanner$1.C60821 r1) {
        this.this$0 = r1;
    }

    public final void onChanged(Resource<Void> resource) {
        this.this$0.this$0.this$0.handleAction(resource);
    }
}
