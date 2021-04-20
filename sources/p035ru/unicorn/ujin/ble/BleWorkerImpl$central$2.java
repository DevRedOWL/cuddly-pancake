package p035ru.unicorn.ujin.ble;

import android.bluetooth.le.ScanResult;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral;
import p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentralCallback;
import p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothPeripheral;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/ble/ble_helper_class/BluetoothCentral;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.ble.BleWorkerImpl$central$2 */
/* compiled from: BleWorkerImpl.kt */
final class BleWorkerImpl$central$2 extends Lambda implements Function0<BluetoothCentral> {
    final /* synthetic */ BleWorkerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BleWorkerImpl$central$2(BleWorkerImpl bleWorkerImpl) {
        super(0);
        this.this$0 = bleWorkerImpl;
    }

    public final BluetoothCentral invoke() {
        return new BluetoothCentral(this.this$0.getApplication(), new BluetoothCentralCallback(this) {
            final /* synthetic */ BleWorkerImpl$central$2 this$0;

            {
                this.this$0 = r1;
            }

            public void onConnectedPeripheral(BluetoothPeripheral bluetoothPeripheral) {
                Intrinsics.checkNotNullParameter(bluetoothPeripheral, "peripheral");
                super.onConnectedPeripheral(bluetoothPeripheral);
                Log.d("TAG", "SSS onConnectedPeripheral");
            }

            public void onConnectionFailed(BluetoothPeripheral bluetoothPeripheral, int i) {
                Intrinsics.checkNotNullParameter(bluetoothPeripheral, "peripheral");
                super.onConnectionFailed(bluetoothPeripheral, i);
                Log.d("TAG", "SSS onConnectionFailed " + i);
                this.this$0.this$0.getUnique().clear();
                Log.d("TAG", "EEE onConnectionFailed --------------------------------------------------------------\n");
                if (!this.this$0.this$0.isHas41() && this.this$0.this$0.getCountTry() < 3) {
                    BleWorkerImpl bleWorkerImpl = this.this$0.this$0;
                    bleWorkerImpl.setCountTry(bleWorkerImpl.getCountTry() + 1);
                    Log.d("TAG", "EEE onConnectionFailed restart " + this.this$0.this$0.getCountTry() + " --------------------------------------------------------------\n");
                    this.this$0.this$0.startScan();
                }
            }

            public void onDisconnectedPeripheral(BluetoothPeripheral bluetoothPeripheral, int i) {
                Intrinsics.checkNotNullParameter(bluetoothPeripheral, "peripheral");
                super.onDisconnectedPeripheral(bluetoothPeripheral, i);
                Log.d("TAG", "SSS onDisconnectedPeripheral " + i + " " + this.this$0.this$0.isHas41() + " " + this.this$0.this$0.getCountTry());
                Log.d("TAG", "EEE disconect --------------------------------------------------------------\n\n");
                if (!this.this$0.this$0.isHas41() && this.this$0.this$0.getCountTry() < 3) {
                    BleWorkerImpl bleWorkerImpl = this.this$0.this$0;
                    bleWorkerImpl.setCountTry(bleWorkerImpl.getCountTry() + 1);
                    Log.d("TAG", "EEE onDisconnectedPeripheral restart " + this.this$0.this$0.getCountTry() + " --------------------------------------------------------------\n\n");
                    this.this$0.this$0.startScan();
                }
            }

            public void onDiscoveredPeripheral(BluetoothPeripheral bluetoothPeripheral, ScanResult scanResult) {
                Intrinsics.checkNotNullParameter(bluetoothPeripheral, "peripheral");
                Intrinsics.checkNotNullParameter(scanResult, "scanResult");
                super.onDiscoveredPeripheral(bluetoothPeripheral, scanResult);
                Log.d("TAG", "SSS onDiscoveredPeripheral " + scanResult);
            }

            public void onScanFailed(int i) {
                super.onScanFailed(i);
                Log.d("TAG", "SSS onScanFailed " + i);
            }

            public void onBluetoothAdapterStateChanged(int i) {
                super.onBluetoothAdapterStateChanged(i);
                Log.d("TAG", "SSS onBluetoothAdapterStateChanged " + i);
            }
        }, new Handler(Looper.getMainLooper()));
    }
}
