package p035ru.unicorn.ujin.ble;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.ble.data.BleReader;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010!\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "Lru/unicorn/ujin/ble/data/BleReader;", "kotlin.jvm.PlatformType", "", "it", "", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.ble.BleRepo$loadGateReader$1 */
/* compiled from: BleRepo.kt */
final class BleRepo$loadGateReader$1<T, R> implements Function<List<BleReader>, Iterable<? extends BleReader>> {
    public static final BleRepo$loadGateReader$1 INSTANCE = new BleRepo$loadGateReader$1();

    BleRepo$loadGateReader$1() {
    }

    public final Iterable<BleReader> apply(List<BleReader> list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list;
    }
}
