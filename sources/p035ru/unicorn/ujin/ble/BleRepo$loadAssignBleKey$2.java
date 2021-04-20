package p035ru.unicorn.ujin.ble;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.ble.data.BleKeyData;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "Lru/unicorn/ujin/ble/data/BleKeyData;", "kotlin.jvm.PlatformType", "", "it", "", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.ble.BleRepo$loadAssignBleKey$2 */
/* compiled from: BleRepo.kt */
final class BleRepo$loadAssignBleKey$2<T, R> implements Function<Throwable, List<BleKeyData>> {
    public static final BleRepo$loadAssignBleKey$2 INSTANCE = new BleRepo$loadAssignBleKey$2();

    BleRepo$loadAssignBleKey$2() {
    }

    public final List<BleKeyData> apply(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "it");
        return new ArrayList<>();
    }
}
