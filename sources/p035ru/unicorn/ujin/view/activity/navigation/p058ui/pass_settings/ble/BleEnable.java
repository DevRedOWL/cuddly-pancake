package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.ble;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/ble/BleEnable;", "", "()V", "checkIsEnable", "", "context", "Landroid/content/Context;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.ble.BleEnable */
/* compiled from: BleEnable.kt */
public final class BleEnable {
    public static final BleEnable INSTANCE = new BleEnable();

    private BleEnable() {
    }

    public final boolean checkIsEnable(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("bluetooth");
        if (systemService != null) {
            BluetoothAdapter adapter = ((BluetoothManager) systemService).getAdapter();
            Intrinsics.checkNotNullExpressionValue(adapter, "bluetoothManager.adapter");
            return adapter.isEnabled();
        }
        throw new NullPointerException("null cannot be cast to non-null type android.bluetooth.BluetoothManager");
    }
}
