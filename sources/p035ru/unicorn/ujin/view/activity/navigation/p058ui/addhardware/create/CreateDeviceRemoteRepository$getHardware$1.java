package p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.create;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "Lru/unicorn/ujin/view/activity/navigation/entity/hardware/Hardware;", "kotlin.jvm.PlatformType", "it", "Lru/unicorn/ujin/data/realm/Resource;", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.create.CreateDeviceRemoteRepository$getHardware$1 */
/* compiled from: CreateDeviceRemoteRepository.kt */
final class CreateDeviceRemoteRepository$getHardware$1<T, R> implements Function<Resource<List<? extends Hardware>>, List<? extends Hardware>> {
    public static final CreateDeviceRemoteRepository$getHardware$1 INSTANCE = new CreateDeviceRemoteRepository$getHardware$1();

    CreateDeviceRemoteRepository$getHardware$1() {
    }

    public final List<Hardware> apply(Resource<List<Hardware>> resource) {
        Intrinsics.checkNotNullParameter(resource, "it");
        return resource.getData();
    }
}
