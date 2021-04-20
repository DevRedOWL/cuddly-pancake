package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.ble.data.BleKeyData;
import p046io.reactivex.functions.Predicate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "it", "Lru/unicorn/ujin/ble/data/BleKeyData;", "test"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.PassRepo$getAssignKey$3 */
/* compiled from: PassRepo.kt */
final class PassRepo$getAssignKey$3<T> implements Predicate<BleKeyData> {
    public static final PassRepo$getAssignKey$3 INSTANCE = new PassRepo$getAssignKey$3();

    PassRepo$getAssignKey$3() {
    }

    public final boolean test(BleKeyData bleKeyData) {
        Intrinsics.checkNotNullParameter(bleKeyData, "it");
        return bleKeyData.getKeyAssign() == 1;
    }
}
