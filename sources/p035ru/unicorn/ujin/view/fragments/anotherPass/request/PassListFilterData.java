package p035ru.unicorn.ujin.view.fragments.anotherPass.request;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/request/PassListFilterData;", "", "archived", "", "(Ljava/lang/String;)V", "getArchived", "()Ljava/lang/String;", "setArchived", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.request.PassListFilterData */
/* compiled from: PassListRequestBody.kt */
public final class PassListFilterData {
    private String archived;

    public static /* synthetic */ PassListFilterData copy$default(PassListFilterData passListFilterData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = passListFilterData.archived;
        }
        return passListFilterData.copy(str);
    }

    public final String component1() {
        return this.archived;
    }

    public final PassListFilterData copy(String str) {
        Intrinsics.checkNotNullParameter(str, "archived");
        return new PassListFilterData(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof PassListFilterData) && Intrinsics.areEqual((Object) this.archived, (Object) ((PassListFilterData) obj).archived);
        }
        return true;
    }

    public int hashCode() {
        String str = this.archived;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "PassListFilterData(archived=" + this.archived + ")";
    }

    public PassListFilterData(String str) {
        Intrinsics.checkNotNullParameter(str, "archived");
        this.archived = str;
    }

    public final String getArchived() {
        return this.archived;
    }

    public final void setArchived(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.archived = str;
    }
}
