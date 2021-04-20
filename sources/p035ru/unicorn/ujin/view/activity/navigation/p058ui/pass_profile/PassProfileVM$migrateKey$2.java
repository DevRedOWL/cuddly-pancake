package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.ble.data.BleReader;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/ble/data/BleReader;", "kotlin.jvm.PlatformType", "it", "", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_profile.PassProfileVM$migrateKey$2 */
/* compiled from: PassProfileVM.kt */
final class PassProfileVM$migrateKey$2<T, R> implements Function<List<BleReader>, BleReader> {
    public static final PassProfileVM$migrateKey$2 INSTANCE = new PassProfileVM$migrateKey$2();

    PassProfileVM$migrateKey$2() {
    }

    public final BleReader apply(List<BleReader> list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.get(0);
    }
}
