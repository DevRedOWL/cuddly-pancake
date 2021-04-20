package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.reactivestreams.Publisher;
import p035ru.unicorn.ujin.ble.data.BleReader;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.PassRepo;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "Lorg/reactivestreams/Publisher;", "Lru/unicorn/ujin/data/realm/Resource;", "", "kotlin.jvm.PlatformType", "it", "Lru/unicorn/ujin/ble/data/BleReader;", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_profile.PassProfileVM$migrateKey$3 */
/* compiled from: PassProfileVM.kt */
final class PassProfileVM$migrateKey$3<T, R> implements Function<BleReader, Publisher<? extends Resource<Unit>>> {
    final /* synthetic */ long $phoneUnique;

    PassProfileVM$migrateKey$3(long j) {
        this.$phoneUnique = j;
    }

    public final Publisher<? extends Resource<Unit>> apply(BleReader bleReader) {
        Intrinsics.checkNotNullParameter(bleReader, "it");
        return new PassRepo().enableBleGateReader(String.valueOf(bleReader.getSerialNumber()), String.valueOf(this.$phoneUnique));
    }
}
