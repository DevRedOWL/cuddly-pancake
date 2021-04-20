package p035ru.unicorn.ujin.view.fragments.parking.events;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.fragments.parking.response.MyVehicle;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR!\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/events/MyVehiclesEvent;", "", "success", "", "message", "", "vehicleList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/fragments/parking/response/MyVehicle;", "Lkotlin/collections/ArrayList;", "(ZLjava/lang/String;Ljava/util/ArrayList;)V", "getMessage", "()Ljava/lang/String;", "getSuccess", "()Z", "getVehicleList", "()Ljava/util/ArrayList;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.events.MyVehiclesEvent */
/* compiled from: MyVehiclesEvent.kt */
public final class MyVehiclesEvent {
    private final String message;
    private final boolean success;
    private final ArrayList<MyVehicle> vehicleList;

    public MyVehiclesEvent(boolean z, String str, ArrayList<MyVehicle> arrayList) {
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(arrayList, "vehicleList");
        this.success = z;
        this.message = str;
        this.vehicleList = arrayList;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final ArrayList<MyVehicle> getVehicleList() {
        return this.vehicleList;
    }
}
