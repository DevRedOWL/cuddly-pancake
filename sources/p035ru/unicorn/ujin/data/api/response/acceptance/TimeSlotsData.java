package p035ru.unicorn.ujin.data.api.response.acceptance;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.TimeSlot;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/acceptance/TimeSlotsData;", "", "window", "Lio/realm/RealmList;", "Lru/unicorn/ujin/data/realm/TimeSlot;", "(Lio/realm/RealmList;)V", "getWindow", "()Lio/realm/RealmList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.acceptance.TimeSlotsData */
/* compiled from: AcceptanceTimeSlotsResponse.kt */
public final class TimeSlotsData {
    private final RealmList<TimeSlot> window;

    public static /* synthetic */ TimeSlotsData copy$default(TimeSlotsData timeSlotsData, RealmList<TimeSlot> realmList, int i, Object obj) {
        if ((i & 1) != 0) {
            realmList = timeSlotsData.window;
        }
        return timeSlotsData.copy(realmList);
    }

    public final RealmList<TimeSlot> component1() {
        return this.window;
    }

    public final TimeSlotsData copy(RealmList<TimeSlot> realmList) {
        Intrinsics.checkNotNullParameter(realmList, "window");
        return new TimeSlotsData(realmList);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof TimeSlotsData) && Intrinsics.areEqual((Object) this.window, (Object) ((TimeSlotsData) obj).window);
        }
        return true;
    }

    public int hashCode() {
        RealmList<TimeSlot> realmList = this.window;
        if (realmList != null) {
            return realmList.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "TimeSlotsData(window=" + this.window + ")";
    }

    public TimeSlotsData(RealmList<TimeSlot> realmList) {
        Intrinsics.checkNotNullParameter(realmList, "window");
        this.window = realmList;
    }

    public final RealmList<TimeSlot> getWindow() {
        return this.window;
    }
}
