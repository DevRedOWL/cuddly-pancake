package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.ble.data.BleData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/ble/data/BleData;", "test"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_profile.PassProfileVM$getMyPassBy$dateRemote$1 */
/* compiled from: PassProfileVM.kt */
final class PassProfileVM$getMyPassBy$dateRemote$1<T> implements Predicate<Resource<BleData>> {
    public static final PassProfileVM$getMyPassBy$dateRemote$1 INSTANCE = new PassProfileVM$getMyPassBy$dateRemote$1();

    PassProfileVM$getMyPassBy$dateRemote$1() {
    }

    public final boolean test(Resource<BleData> resource) {
        Intrinsics.checkNotNullParameter(resource, "it");
        return resource.getStatus() == Resource.Status.SUCCESS;
    }
}
