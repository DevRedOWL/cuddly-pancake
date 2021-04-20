package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.ble.data.BleReader;
import p046io.reactivex.functions.Predicate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "", "Lru/unicorn/ujin/ble/data/BleReader;", "test"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_profile.PassProfileVM$migrateKey$1 */
/* compiled from: PassProfileVM.kt */
final class PassProfileVM$migrateKey$1<T> implements Predicate<List<BleReader>> {
    public static final PassProfileVM$migrateKey$1 INSTANCE = new PassProfileVM$migrateKey$1();

    PassProfileVM$migrateKey$1() {
    }

    public final boolean test(List<BleReader> list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return !list.isEmpty();
    }
}
