package p035ru.unicorn.ujin.data.service.location;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Points;
import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "pointsResource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/realm/Points;", "test"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.service.location.LocationService$alarmPoints$subscribe$1 */
/* compiled from: LocationService.kt */
final class LocationService$alarmPoints$subscribe$1<T> implements Predicate<Resource<Points>> {
    public static final LocationService$alarmPoints$subscribe$1 INSTANCE = new LocationService$alarmPoints$subscribe$1();

    LocationService$alarmPoints$subscribe$1() {
    }

    public final boolean test(Resource<Points> resource) {
        Intrinsics.checkNotNullParameter(resource, "pointsResource");
        return resource.getData() != null;
    }
}
