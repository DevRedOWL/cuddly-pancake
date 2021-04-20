package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import android.bluetooth.le.ScanResult;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral;
import p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentralCallback;
import p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothPeripheral;
import p035ru.unicorn.ujin.util.AppUtils;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo51343d2 = {"<anonymous>", "ru/unicorn/ujin/view/activity/navigation/ui/corona/PassDetailFragment2$bleCallBack$2$1", "invoke", "()Lru/unicorn/ujin/view/activity/navigation/ui/corona/PassDetailFragment2$bleCallBack$2$1;"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.PassDetailFragment2$bleCallBack$2 */
/* compiled from: PassDetailFragment2.kt */
final class PassDetailFragment2$bleCallBack$2 extends Lambda implements Function0<C58091> {
    final /* synthetic */ PassDetailFragment2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PassDetailFragment2$bleCallBack$2(PassDetailFragment2 passDetailFragment2) {
        super(0);
        this.this$0 = passDetailFragment2;
    }

    public final C58091 invoke() {
        return new BluetoothCentralCallback(this) {
            final /* synthetic */ PassDetailFragment2$bleCallBack$2 this$0;

            {
                this.this$0 = r1;
            }

            public void onDiscoveredPeripheral(BluetoothPeripheral bluetoothPeripheral, ScanResult scanResult) {
                Intrinsics.checkNotNullParameter(bluetoothPeripheral, "peripheral");
                Intrinsics.checkNotNullParameter(scanResult, "scanResult");
                super.onDiscoveredPeripheral(bluetoothPeripheral, scanResult);
                PassDetailFragment2 passDetailFragment2 = this.this$0.this$0;
                passDetailFragment2.showLog("onDiscoveredPeripheral", bluetoothPeripheral.getAddress() + " rsssi " + String.valueOf(scanResult.getRssi()));
                String address = bluetoothPeripheral.getAddress();
                Intrinsics.checkNotNullExpressionValue(address, "peripheral.address");
                if (address != null) {
                    String lowerCase = address.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                    if (scanResult.getRssi() > -35 && this.this$0.this$0.bleListMac.contains(lowerCase)) {
                        this.this$0.this$0.getMapOfScanResult().clear();
                        BluetoothCentral access$getCentral$p = this.this$0.this$0.central;
                        if (access$getCentral$p != null) {
                            access$getCentral$p.stopScan();
                        }
                        PassDetailFragment2 passDetailFragment22 = this.this$0.this$0;
                        String address2 = bluetoothPeripheral.getAddress();
                        Intrinsics.checkNotNullExpressionValue(address2, "peripheral.address");
                        passDetailFragment22.onGetPerifiral(address2);
                    } else if (DateUtils.getDateDiff(this.this$0.this$0.getBeginScan(), new Date(), TimeUnit.MILLISECONDS) >= ((long) 500) || !this.this$0.this$0.bleListMac.contains(lowerCase)) {
                        BluetoothCentral access$getCentral$p2 = this.this$0.this$0.central;
                        if (access$getCentral$p2 != null) {
                            access$getCentral$p2.stopScan();
                        }
                        Pair<String, Integer> withMinimumValue = AppUtils.getWithMinimumValue(this.this$0.this$0.getMapOfScanResult());
                        if (withMinimumValue != null) {
                            this.this$0.this$0.getMapOfScanResult().clear();
                            PassDetailFragment2 passDetailFragment23 = this.this$0.this$0;
                            String first = withMinimumValue.getFirst();
                            Intrinsics.checkNotNullExpressionValue(first, "it.first");
                            passDetailFragment23.onGetPerifiral(first);
                        }
                    } else {
                        this.this$0.this$0.getMapOfScanResult().put(lowerCase, Integer.valueOf(scanResult.getRssi()));
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }

            public void onScanFailed(int i) {
                super.onScanFailed(i);
                DynamicBackgroundButton dynamicBackgroundButton = this.this$0.this$0.getBinding().openDoor;
                Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "binding.openDoor");
                dynamicBackgroundButton.setEnabled(true);
            }
        };
    }
}
