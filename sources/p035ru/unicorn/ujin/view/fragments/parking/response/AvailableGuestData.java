package p035ru.unicorn.ujin.view.fragments.parking.response;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B!\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005¢\u0006\u0002\u0010\u0006J\u001d\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R%\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/response/AvailableGuestData;", "", "items", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/fragments/parking/response/Guest;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getItems", "()Ljava/util/ArrayList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.response.AvailableGuestData */
/* compiled from: AvailableGuestsResponse.kt */
public final class AvailableGuestData {
    private final ArrayList<Guest> items;

    public static /* synthetic */ AvailableGuestData copy$default(AvailableGuestData availableGuestData, ArrayList<Guest> arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = availableGuestData.items;
        }
        return availableGuestData.copy(arrayList);
    }

    public final ArrayList<Guest> component1() {
        return this.items;
    }

    public final AvailableGuestData copy(ArrayList<Guest> arrayList) {
        return new AvailableGuestData(arrayList);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AvailableGuestData) && Intrinsics.areEqual((Object) this.items, (Object) ((AvailableGuestData) obj).items);
        }
        return true;
    }

    public int hashCode() {
        ArrayList<Guest> arrayList = this.items;
        if (arrayList != null) {
            return arrayList.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "AvailableGuestData(items=" + this.items + ")";
    }

    public AvailableGuestData(ArrayList<Guest> arrayList) {
        this.items = arrayList;
    }

    public final ArrayList<Guest> getItems() {
        return this.items;
    }
}
