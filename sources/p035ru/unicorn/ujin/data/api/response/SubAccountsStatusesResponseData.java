package p035ru.unicorn.ujin.data.api.response;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J#\u0010\n\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R&\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/SubAccountsStatusesResponseData;", "", "statusList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/data/api/response/SubAccountStatus;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getStatusList", "()Ljava/util/ArrayList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.SubAccountsStatusesResponseData */
/* compiled from: SubAccountsStatusesResponseData.kt */
public final class SubAccountsStatusesResponseData {
    @SerializedName("statuses")
    private final ArrayList<SubAccountStatus> statusList;

    public static /* synthetic */ SubAccountsStatusesResponseData copy$default(SubAccountsStatusesResponseData subAccountsStatusesResponseData, ArrayList<SubAccountStatus> arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = subAccountsStatusesResponseData.statusList;
        }
        return subAccountsStatusesResponseData.copy(arrayList);
    }

    public final ArrayList<SubAccountStatus> component1() {
        return this.statusList;
    }

    public final SubAccountsStatusesResponseData copy(ArrayList<SubAccountStatus> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "statusList");
        return new SubAccountsStatusesResponseData(arrayList);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof SubAccountsStatusesResponseData) && Intrinsics.areEqual((Object) this.statusList, (Object) ((SubAccountsStatusesResponseData) obj).statusList);
        }
        return true;
    }

    public int hashCode() {
        ArrayList<SubAccountStatus> arrayList = this.statusList;
        if (arrayList != null) {
            return arrayList.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "SubAccountsStatusesResponseData(statusList=" + this.statusList + ")";
    }

    public SubAccountsStatusesResponseData(ArrayList<SubAccountStatus> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "statusList");
        this.statusList = arrayList;
    }

    public final ArrayList<SubAccountStatus> getStatusList() {
        return this.statusList;
    }
}
