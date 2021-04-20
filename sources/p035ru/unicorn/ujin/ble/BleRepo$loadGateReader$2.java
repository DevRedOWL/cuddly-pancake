package p035ru.unicorn.ujin.ble;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.unicorn.ujin.ble.data.BleReader;
import p046io.reactivex.functions.Predicate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "it", "Lru/unicorn/ujin/ble/data/BleReader;", "test"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.ble.BleRepo$loadGateReader$2 */
/* compiled from: BleRepo.kt */
final class BleRepo$loadGateReader$2<T> implements Predicate<BleReader> {
    public static final BleRepo$loadGateReader$2 INSTANCE = new BleRepo$loadGateReader$2();

    BleRepo$loadGateReader$2() {
    }

    public final boolean test(BleReader bleReader) {
        Intrinsics.checkNotNullParameter(bleReader, "it");
        return StringsKt.contains((CharSequence) bleReader.getDeviceClass(), (CharSequence) "gate", true);
    }
}
