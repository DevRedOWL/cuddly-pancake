package p035ru.unicorn.ujin.ble;

import android.app.Application;
import android.util.Log;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.ble.data.BleKeyData;
import p035ru.unicorn.ujin.ble.data.BleReader;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, mo51343d2 = {"<anonymous>", "", "pair", "Lkotlin/Pair;", "Lru/unicorn/ujin/ble/data/BleReader;", "Lru/unicorn/ujin/ble/data/BleKeyData;", "kotlin.jvm.PlatformType", "invoke", "ru/unicorn/ujin/ble/TransparentActivity$startScanBT$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.ble.TransparentActivity$startScanBT$$inlined$let$lambda$1 */
/* compiled from: TransparentActivity.kt */
final class TransparentActivity$startScanBT$$inlined$let$lambda$1 extends Lambda implements Function1<Pair<? extends BleReader, ? extends BleKeyData>, Unit> {
    final /* synthetic */ long $it;
    final /* synthetic */ TransparentActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TransparentActivity$startScanBT$$inlined$let$lambda$1(long j, TransparentActivity transparentActivity) {
        super(1);
        this.$it = j;
        this.this$0 = transparentActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Pair<? extends BleReader, ? extends BleKeyData>) (Pair) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Pair<? extends BleReader, ? extends BleKeyData> pair) {
        Log.d("TAG", "MY BLE " + this.$it + ' ');
        Application application = this.this$0.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        new BleWorkerImpl(application, this.this$0, (StringBuilder) null, 4, (DefaultConstructorMarker) null).startScan((BleReader) pair.getFirst(), (BleKeyData) pair.getSecond());
    }
}
