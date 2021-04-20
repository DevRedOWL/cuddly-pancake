package p035ru.unicorn.ujin.data.profile;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.ble.data.BleKeyData;
import p035ru.unicorn.ujin.ble.data.BleReader;
import p046io.reactivex.functions.BiFunction;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "Lkotlin/Pair;", "Lru/unicorn/ujin/ble/data/BleReader;", "Lru/unicorn/ujin/ble/data/BleKeyData;", "bReader", "bKeyData", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.ProfileViewModel$loadPassDeviceRemote$3 */
/* compiled from: ProfileViewModel.kt */
final class ProfileViewModel$loadPassDeviceRemote$3<T1, T2, R> implements BiFunction<BleReader, BleKeyData, Pair<? extends BleReader, ? extends BleKeyData>> {
    public static final ProfileViewModel$loadPassDeviceRemote$3 INSTANCE = new ProfileViewModel$loadPassDeviceRemote$3();

    ProfileViewModel$loadPassDeviceRemote$3() {
    }

    public final Pair<BleReader, BleKeyData> apply(BleReader bleReader, BleKeyData bleKeyData) {
        Intrinsics.checkNotNullParameter(bleReader, "bReader");
        Intrinsics.checkNotNullParameter(bleKeyData, "bKeyData");
        return new Pair<>(bleReader, bleKeyData);
    }
}
