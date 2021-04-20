package p035ru.unicorn.ujin.data.service.location;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Point;
import p035ru.unicorn.ujin.data.realm.Points;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "pointResource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/realm/Points;", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.service.location.LocationService$alarmPoints$subscribe$2 */
/* compiled from: LocationService.kt */
final class LocationService$alarmPoints$subscribe$2<T> implements Consumer<Resource<Points>> {
    final /* synthetic */ LocationService this$0;

    LocationService$alarmPoints$subscribe$2(LocationService locationService) {
        this.this$0 = locationService;
    }

    public final void accept(Resource<Points> resource) {
        Intrinsics.checkNotNullParameter(resource, "pointResource");
        LocalRepository access$getLocalRepository$p = this.this$0.getLocalRepository();
        if (access$getLocalRepository$p != null) {
            Points data = resource.getData();
            Intrinsics.checkNotNullExpressionValue(data, "pointResource.data");
            access$getLocalRepository$p.saveDataAsList(data.getPoints(), Point.class, true);
        }
    }
}
