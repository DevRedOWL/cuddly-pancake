package p035ru.unicorn.ujin.data.service.location;

import kotlin.Metadata;
import kotlin.Pair;
import p035ru.unicorn.ujin.data.service.location.BaseBleService;
import p035ru.unicorn.ujin.data.service.location.LocationService;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lru/unicorn/ujin/data/service/location/BaseBleService$BleAvailableTrigger;", "", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.service.location.LocationService$subscribeOnStateChange$1 */
/* compiled from: LocationService.kt */
final class LocationService$subscribeOnStateChange$1<T> implements Consumer<Pair<? extends BaseBleService.BleAvailableTrigger, ? extends Boolean>> {
    final /* synthetic */ LocationService this$0;

    LocationService$subscribeOnStateChange$1(LocationService locationService) {
        this.this$0 = locationService;
    }

    public final void accept(Pair<? extends BaseBleService.BleAvailableTrigger, Boolean> pair) {
        int i = LocationService.WhenMappings.$EnumSwitchMapping$0[((BaseBleService.BleAvailableTrigger) pair.getFirst()).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        this.this$0.stopScanTempory();
                    } else if (i == 5) {
                        if (!this.this$0.getBeaconManager().isBound(this.this$0)) {
                            this.this$0.getBeaconManager().bind(this.this$0);
                        }
                        this.this$0.getBeaconHelper().startMonitoring();
                        this.this$0.openGate();
                    }
                } else if (pair.getSecond().booleanValue()) {
                    if (!this.this$0.getBeaconManager().isBound(this.this$0)) {
                        this.this$0.getBeaconManager().bind(this.this$0);
                    }
                    this.this$0.getBeaconHelper().startMonitoring();
                    LocationService locationService = this.this$0;
                    locationService.updatePushInfo(locationService.createNotificationForServiceDefault());
                }
            } else if (!pair.getSecond().booleanValue()) {
                this.this$0.stopScanTempory();
                LocationService locationService2 = this.this$0;
                locationService2.updatePushInfo(locationService2.createNotificationForService(true, "Поиск остановлен, включите геолокацию", "restart"));
            }
        } else if (!pair.getSecond().booleanValue()) {
            this.this$0.stopScanTempory();
            LocationService locationService3 = this.this$0;
            locationService3.updatePushInfo(locationService3.createNotificationForService(true, "Поиск остановлен, включите Bluetooth", "restart"));
        }
    }
}
