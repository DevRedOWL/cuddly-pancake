package p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.create;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.api.DeviceModel;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/data/realm/Resource;", "", "Lru/unicorn/ujin/view/activity/navigation/api/DeviceModel;", "kotlin.jvm.PlatformType", "throwable", "", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.create.CreateDeviceRemoteRepository$getDeviceModel$2 */
/* compiled from: CreateDeviceRemoteRepository.kt */
final class CreateDeviceRemoteRepository$getDeviceModel$2<T, R> implements Function<Throwable, Resource<List<? extends DeviceModel>>> {
    public static final CreateDeviceRemoteRepository$getDeviceModel$2 INSTANCE = new CreateDeviceRemoteRepository$getDeviceModel$2();

    CreateDeviceRemoteRepository$getDeviceModel$2() {
    }

    public final Resource<List<DeviceModel>> apply(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "throwable");
        return Resource.error(th.getMessage());
    }
}
