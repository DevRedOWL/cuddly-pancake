package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile;

import android.util.Pair;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.ble.data.BleKeyData;
import p035ru.unicorn.ujin.ble.data.BleReader;
import p046io.reactivex.functions.BiFunction;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "Landroid/util/Pair;", "Lru/unicorn/ujin/ble/data/BleReader;", "kotlin.jvm.PlatformType", "Lru/unicorn/ujin/ble/data/BleKeyData;", "bReader", "bKeyData", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_profile.PassProfileVM$loadPassDeviceRemote$2 */
/* compiled from: PassProfileVM.kt */
final class PassProfileVM$loadPassDeviceRemote$2<T1, T2, R> implements BiFunction<BleReader, BleKeyData, Pair<BleReader, BleKeyData>> {
    public static final PassProfileVM$loadPassDeviceRemote$2 INSTANCE = new PassProfileVM$loadPassDeviceRemote$2();

    PassProfileVM$loadPassDeviceRemote$2() {
    }

    public final Pair<BleReader, BleKeyData> apply(BleReader bleReader, BleKeyData bleKeyData) {
        Intrinsics.checkNotNullParameter(bleReader, "bReader");
        Intrinsics.checkNotNullParameter(bleKeyData, "bKeyData");
        return new Pair<>(bleReader, bleKeyData);
    }
}
