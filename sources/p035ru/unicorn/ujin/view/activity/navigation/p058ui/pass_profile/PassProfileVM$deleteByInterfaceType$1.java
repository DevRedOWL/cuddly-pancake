package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.reactivestreams.Publisher;
import p035ru.unicorn.ujin.ble.BleRepo;
import p035ru.unicorn.ujin.ble.data.BleData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001aJ\u0012\u001e\b\u0001\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0003 \u0004*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u0002 \u0004*$\u0012\u001e\b\u0001\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0003 \u0004*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "Lorg/reactivestreams/Publisher;", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/ble/data/BleData;", "kotlin.jvm.PlatformType", "it", "", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_profile.PassProfileVM$deleteByInterfaceType$1 */
/* compiled from: PassProfileVM.kt */
final class PassProfileVM$deleteByInterfaceType$1<T, R> implements Function<Resource<Unit>, Publisher<? extends Resource<BleData>>> {
    public static final PassProfileVM$deleteByInterfaceType$1 INSTANCE = new PassProfileVM$deleteByInterfaceType$1();

    PassProfileVM$deleteByInterfaceType$1() {
    }

    public final Publisher<? extends Resource<BleData>> apply(Resource<Unit> resource) {
        Intrinsics.checkNotNullParameter(resource, "it");
        return new BleRepo().loadMyPassDevice();
    }
}
