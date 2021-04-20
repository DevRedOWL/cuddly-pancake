package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.ble;

import android.bluetooth.le.ScanResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral;
import p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentralCallback;
import p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothPeripheral;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, mo51343d2 = {"ru/unicorn/ujin/view/activity/navigation/ui/pass_settings/ble/PassCreateBleSecondFragment$onOpenDoorClick$1", "Lru/unicorn/ujin/ble/ble_helper_class/BluetoothCentralCallback;", "onDiscoveredPeripheral", "", "peripheral", "Lru/unicorn/ujin/ble/ble_helper_class/BluetoothPeripheral;", "scanResult", "Landroid/bluetooth/le/ScanResult;", "onScanFailed", "errorCode", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.ble.PassCreateBleSecondFragment$onOpenDoorClick$1 */
/* compiled from: PassCreateBleSecondFragment.kt */
public final class PassCreateBleSecondFragment$onOpenDoorClick$1 extends BluetoothCentralCallback {
    final /* synthetic */ PassCreateBleSecondFragment this$0;

    PassCreateBleSecondFragment$onOpenDoorClick$1(PassCreateBleSecondFragment passCreateBleSecondFragment) {
        this.this$0 = passCreateBleSecondFragment;
    }

    public void onDiscoveredPeripheral(BluetoothPeripheral bluetoothPeripheral, ScanResult scanResult) {
        Intrinsics.checkNotNullParameter(bluetoothPeripheral, "peripheral");
        Intrinsics.checkNotNullParameter(scanResult, "scanResult");
        super.onDiscoveredPeripheral(bluetoothPeripheral, scanResult);
        BluetoothCentral access$getCentral$p = this.this$0.central;
        if (access$getCentral$p != null) {
            access$getCentral$p.stopScan();
        }
        this.this$0.onGetPerifiral(bluetoothPeripheral);
    }

    public void onScanFailed(int i) {
        super.onScanFailed(i);
    }
}
