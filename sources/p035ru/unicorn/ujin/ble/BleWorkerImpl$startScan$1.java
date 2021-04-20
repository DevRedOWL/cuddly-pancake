package p035ru.unicorn.ujin.ble;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.ble.BleWorkerImpl;
import p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothPeripheral;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "run"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.ble.BleWorkerImpl$startScan$1 */
/* compiled from: BleWorkerImpl.kt */
final class BleWorkerImpl$startScan$1 implements Runnable {
    final /* synthetic */ BluetoothPeripheral $peripheral;
    final /* synthetic */ BleWorkerImpl this$0;

    BleWorkerImpl$startScan$1(BleWorkerImpl bleWorkerImpl, BluetoothPeripheral bluetoothPeripheral) {
        this.this$0 = bleWorkerImpl;
        this.$peripheral = bluetoothPeripheral;
    }

    public final void run() {
        if (this.this$0.isSuccess()) {
            this.$peripheral.cancelConnection();
            this.this$0.getCentral().close();
            this.this$0.setIsa(true);
            BleWorkerImpl.BleWorkerResult bleWorkerResult = this.this$0.getBleWorkerResult();
            String sb = this.this$0.getSb().toString();
            Intrinsics.checkNotNullExpressionValue(sb, "sb.toString()");
            bleWorkerResult.onSuccess(sb);
            return;
        }
        if (this.this$0.getFailCount() > 3) {
            BleWorkerImpl.BleWorkerResult bleWorkerResult2 = this.this$0.getBleWorkerResult();
            String sb2 = this.this$0.getSb().toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
            bleWorkerResult2.onFailure(sb2);
            this.$peripheral.cancelConnection();
            this.this$0.getCentral().close();
        } else {
            BleWorkerImpl.BleWorkerResult bleWorkerResult3 = this.this$0.getBleWorkerResult();
            String sb3 = this.this$0.getSb().toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "sb.toString()");
            bleWorkerResult3.onFailure(sb3);
            this.$peripheral.cancelConnection();
            this.this$0.getCentral().close();
        }
        BleWorkerImpl bleWorkerImpl = this.this$0;
        bleWorkerImpl.setFailCount(bleWorkerImpl.getFailCount() + 1);
    }
}
