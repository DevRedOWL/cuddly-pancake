package p035ru.unicorn.ujin.view.fragments.parking.events;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.fragments.parking.response.Zone;
import p035ru.unicorn.ujin.view.fragments.parking.response.ZoneInfo;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\t\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\t\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\t¢\u0006\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR%\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R%\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R%\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0016"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/events/GuestZoneSlotsEvent;", "", "success", "", "message", "", "zoneList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/fragments/parking/response/ZoneInfo;", "Lkotlin/collections/ArrayList;", "ownZoneList", "Lru/unicorn/ujin/view/fragments/parking/response/Zone;", "rentedZoneList", "(ZLjava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getMessage", "()Ljava/lang/String;", "getOwnZoneList", "()Ljava/util/ArrayList;", "getRentedZoneList", "getSuccess", "()Z", "getZoneList", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.events.GuestZoneSlotsEvent */
/* compiled from: GuestZoneSlotsEvent.kt */
public final class GuestZoneSlotsEvent {
    private final String message;
    private final ArrayList<Zone> ownZoneList;
    private final ArrayList<Zone> rentedZoneList;
    private final boolean success;
    private final ArrayList<ZoneInfo> zoneList;

    public GuestZoneSlotsEvent(boolean z, String str, ArrayList<ZoneInfo> arrayList, ArrayList<Zone> arrayList2, ArrayList<Zone> arrayList3) {
        Intrinsics.checkNotNullParameter(str, "message");
        this.success = z;
        this.message = str;
        this.zoneList = arrayList;
        this.ownZoneList = arrayList2;
        this.rentedZoneList = arrayList3;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final String getMessage() {
        return this.message;
    }

    public final ArrayList<ZoneInfo> getZoneList() {
        return this.zoneList;
    }

    public final ArrayList<Zone> getOwnZoneList() {
        return this.ownZoneList;
    }

    public final ArrayList<Zone> getRentedZoneList() {
        return this.rentedZoneList;
    }
}
