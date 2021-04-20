package p035ru.unicorn.ujin.view.fragments.parking.response;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/response/DetailedInfo;", "", "title", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.response.DetailedInfo */
/* compiled from: MySlotsResponse.kt */
public final class DetailedInfo {
    private final String title;
    private final String value;

    public static /* synthetic */ DetailedInfo copy$default(DetailedInfo detailedInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = detailedInfo.title;
        }
        if ((i & 2) != 0) {
            str2 = detailedInfo.value;
        }
        return detailedInfo.copy(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.value;
    }

    public final DetailedInfo copy(String str, String str2) {
        return new DetailedInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetailedInfo)) {
            return false;
        }
        DetailedInfo detailedInfo = (DetailedInfo) obj;
        return Intrinsics.areEqual((Object) this.title, (Object) detailedInfo.title) && Intrinsics.areEqual((Object) this.value, (Object) detailedInfo.value);
    }

    public int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.value;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "DetailedInfo(title=" + this.title + ", value=" + this.value + ")";
    }

    public DetailedInfo(String str, String str2) {
        this.title = str;
        this.value = str2;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getValue() {
        return this.value;
    }
}
