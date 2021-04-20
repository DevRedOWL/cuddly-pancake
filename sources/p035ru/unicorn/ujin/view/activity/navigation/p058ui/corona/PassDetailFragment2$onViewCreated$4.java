package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import android.util.Log;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.ble.BleWorkerImpl;
import p035ru.unicorn.ujin.ble.data.BleKeyData;
import p035ru.unicorn.ujin.ble.data.BleReader;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "pair", "Lkotlin/Pair;", "Lru/unicorn/ujin/ble/data/BleReader;", "Lru/unicorn/ujin/ble/data/BleKeyData;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.PassDetailFragment2$onViewCreated$4 */
/* compiled from: PassDetailFragment2.kt */
final class PassDetailFragment2$onViewCreated$4 extends Lambda implements Function1<Pair<? extends BleReader, ? extends BleKeyData>, Unit> {
    final /* synthetic */ PassDetailFragment2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PassDetailFragment2$onViewCreated$4(PassDetailFragment2 passDetailFragment2) {
        super(1);
        this.this$0 = passDetailFragment2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Pair<? extends BleReader, ? extends BleKeyData>) (Pair) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Pair<? extends BleReader, ? extends BleKeyData> pair) {
        BleWorkerImpl access$getBleWorker$p;
        Intrinsics.checkNotNullParameter(pair, "pair");
        Log.d("TAG", "MY BLE 2 " + ((BleReader) pair.getFirst()).toString() + ' ' + ((BleKeyData) pair.getSecond()).toString() + ' ');
        if (this.this$0.getActivity() != null && (access$getBleWorker$p = this.this$0.getBleWorker()) != null) {
            access$getBleWorker$p.startScan((BleReader) pair.getFirst(), (BleKeyData) pair.getSecond());
        }
    }
}
