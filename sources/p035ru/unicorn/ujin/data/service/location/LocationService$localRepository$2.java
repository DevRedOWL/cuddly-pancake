package p035ru.unicorn.ujin.data.service.location;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/view/activity/navigation/repository/LocalRepository;", "kotlin.jvm.PlatformType", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.service.location.LocationService$localRepository$2 */
/* compiled from: LocationService.kt */
final class LocationService$localRepository$2 extends Lambda implements Function0<LocalRepository> {
    public static final LocationService$localRepository$2 INSTANCE = new LocationService$localRepository$2();

    LocationService$localRepository$2() {
        super(0);
    }

    public final LocalRepository invoke() {
        return LocalRepository.getInstance();
    }
}
