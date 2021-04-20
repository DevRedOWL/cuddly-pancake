package p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints;

import android.bluetooth.le.ScanResult;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral;
import p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentralCallback;
import p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothPeripheral;
import p035ru.unicorn.ujin.data.realm.MyBeacon;
import p035ru.unicorn.ujin.data.realm.Point;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b¸\u0006\u0000"}, mo51343d2 = {"ru/unicorn/ujin/view/activity/navigation/ui/alertpoints/GatesFragment$initBleSearch$1$1", "Lru/unicorn/ujin/ble/ble_helper_class/BluetoothCentralCallback;", "onDiscoveredPeripheral", "", "peripheral", "Lru/unicorn/ujin/ble/ble_helper_class/BluetoothPeripheral;", "scanResult", "Landroid/bluetooth/le/ScanResult;", "onScanFailed", "errorCode", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.GatesFragment$initBleSearch$$inlined$let$lambda$1 */
/* compiled from: GatesFragment.kt */
public final class GatesFragment$initBleSearch$$inlined$let$lambda$1 extends BluetoothCentralCallback {
    final /* synthetic */ GatesFragment this$0;

    GatesFragment$initBleSearch$$inlined$let$lambda$1(GatesFragment gatesFragment) {
        this.this$0 = gatesFragment;
    }

    public void onDiscoveredPeripheral(BluetoothPeripheral bluetoothPeripheral, ScanResult scanResult) {
        String str;
        Point point;
        RealmList<MyBeacon> beacons;
        MyBeacon myBeacon;
        String bssid;
        Intrinsics.checkNotNullParameter(bluetoothPeripheral, "peripheral");
        Intrinsics.checkNotNullParameter(scanResult, "scanResult");
        super.onDiscoveredPeripheral(bluetoothPeripheral, scanResult);
        String address = bluetoothPeripheral.getAddress();
        Intrinsics.checkNotNullExpressionValue(address, "peripheral.address");
        if (address != null) {
            String lowerCase = address.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            Pair access$getCurrentPair$p = this.this$0.currentPair;
            if (access$getCurrentPair$p == null || (point = (Point) access$getCurrentPair$p.getSecond()) == null || (beacons = point.getBeacons()) == null || (myBeacon = beacons.get(0)) == null || (bssid = myBeacon.getBssid()) == null) {
                str = null;
            } else if (bssid != null) {
                str = bssid.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.String).toLowerCase()");
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            if (Intrinsics.areEqual((Object) lowerCase, (Object) str)) {
                BluetoothCentral access$getCentral$p = this.this$0.central;
                if (access$getCentral$p != null) {
                    access$getCentral$p.stopScan();
                }
                this.this$0.getHandler().removeCallbacks(this.this$0.getR());
                this.this$0.onBeaconFound();
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public void onScanFailed(int i) {
        super.onScanFailed(i);
    }
}
