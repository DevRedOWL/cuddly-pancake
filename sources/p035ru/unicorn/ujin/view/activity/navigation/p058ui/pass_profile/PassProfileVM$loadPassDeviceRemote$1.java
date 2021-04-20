package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.ble.BleRepo;
import p035ru.unicorn.ujin.ble.data.BleKeyData;
import p035ru.unicorn.ujin.ble.data.BleReader;
import p046io.reactivex.MaybeSource;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "Lio/reactivex/MaybeSource;", "Lru/unicorn/ujin/ble/data/BleKeyData;", "kotlin.jvm.PlatformType", "bleReader", "Lru/unicorn/ujin/ble/data/BleReader;", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_profile.PassProfileVM$loadPassDeviceRemote$1 */
/* compiled from: PassProfileVM.kt */
final class PassProfileVM$loadPassDeviceRemote$1<T, R> implements Function<BleReader, MaybeSource<? extends BleKeyData>> {
    final /* synthetic */ BleRepo $bleRepo;

    PassProfileVM$loadPassDeviceRemote$1(BleRepo bleRepo) {
        this.$bleRepo = bleRepo;
    }

    public final MaybeSource<? extends BleKeyData> apply(BleReader bleReader) {
        Intrinsics.checkNotNullParameter(bleReader, "bleReader");
        return this.$bleRepo.loadBleKey(bleReader.getDeviceClass());
    }
}
