package p035ru.unicorn.ujin.view.fragments.parking.events;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.fragments.parking.response.MyVehicle;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/events/AttachVehicleEvent;", "", "success", "", "message", "", "startingFlag", "vehicle", "Lru/unicorn/ujin/view/fragments/parking/response/MyVehicle;", "(ZLjava/lang/String;ZLru/unicorn/ujin/view/fragments/parking/response/MyVehicle;)V", "getMessage", "()Ljava/lang/String;", "getStartingFlag", "()Z", "getSuccess", "getVehicle", "()Lru/unicorn/ujin/view/fragments/parking/response/MyVehicle;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.events.AttachVehicleEvent */
/* compiled from: AttachVehicleEvent.kt */
public final class AttachVehicleEvent {
    private final String message;
    private final boolean startingFlag;
    private final boolean success;
    private final MyVehicle vehicle;

    public AttachVehicleEvent(boolean z, String str, boolean z2, MyVehicle myVehicle) {
        Intrinsics.checkNotNullParameter(str, "message");
        this.success = z;
        this.message = str;
        this.startingFlag = z2;
        this.vehicle = myVehicle;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getStartingFlag() {
        return this.startingFlag;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final MyVehicle getVehicle() {
        return this.vehicle;
    }
}
