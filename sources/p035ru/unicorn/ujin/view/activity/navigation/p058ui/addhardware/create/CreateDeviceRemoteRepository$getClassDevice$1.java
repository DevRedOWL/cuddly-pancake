package p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.create;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.ClassDevice;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/data/realm/Resource;", "", "Lru/unicorn/ujin/view/activity/navigation/ui/addhardware/ClassDevice;", "kotlin.jvm.PlatformType", "resource", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.create.CreateDeviceRemoteRepository$getClassDevice$1 */
/* compiled from: CreateDeviceRemoteRepository.kt */
final class CreateDeviceRemoteRepository$getClassDevice$1<T, R> implements Function<Resource<List<? extends ClassDevice>>, Resource<List<? extends ClassDevice>>> {
    public static final CreateDeviceRemoteRepository$getClassDevice$1 INSTANCE = new CreateDeviceRemoteRepository$getClassDevice$1();

    CreateDeviceRemoteRepository$getClassDevice$1() {
    }

    public final Resource<List<ClassDevice>> apply(Resource<List<ClassDevice>> resource) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        return Resource.success(resource.getError(), resource.getMessage(), resource.getData());
    }
}
