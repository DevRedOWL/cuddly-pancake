package p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.create;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.Room;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.Rooms;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a^\u0012(\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00050\u0002 \u0004*.\u0012(\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00050\u0002\u0018\u00010\u00010\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001H\n¢\u0006\u0002\b\b"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/data/realm/Resource;", "", "Lru/unicorn/ujin/view/activity/navigation/ui/mainsmart/Rooms;", "kotlin.jvm.PlatformType", "", "resource", "Lru/unicorn/ujin/view/activity/navigation/ui/mainsmart/Room;", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.create.CreateDeviceRemoteRepository$getRooms$1 */
/* compiled from: CreateDeviceRemoteRepository.kt */
final class CreateDeviceRemoteRepository$getRooms$1<T, R> implements Function<Resource<Room>, Resource<List<Rooms>>> {
    public static final CreateDeviceRemoteRepository$getRooms$1 INSTANCE = new CreateDeviceRemoteRepository$getRooms$1();

    CreateDeviceRemoteRepository$getRooms$1() {
    }

    public final Resource<List<Rooms>> apply(Resource<Room> resource) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        Integer error = resource.getError();
        String message = resource.getMessage();
        Room data = resource.getData();
        Intrinsics.checkNotNullExpressionValue(data, "resource.data");
        return Resource.success(error, message, data.getList());
    }
}
