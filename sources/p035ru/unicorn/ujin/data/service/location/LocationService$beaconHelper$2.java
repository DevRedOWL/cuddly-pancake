package p035ru.unicorn.ujin.data.service.location;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/data/service/location/BeaconHelper;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.service.location.LocationService$beaconHelper$2 */
/* compiled from: LocationService.kt */
final class LocationService$beaconHelper$2 extends Lambda implements Function0<BeaconHelper> {
    final /* synthetic */ LocationService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LocationService$beaconHelper$2(LocationService locationService) {
        super(0);
        this.this$0 = locationService;
    }

    public final BeaconHelper invoke() {
        LocationService locationService = this.this$0;
        return new BeaconHelper(locationService, locationService.getLocalRepository(), this.this$0.getBeaconManager());
    }
}
