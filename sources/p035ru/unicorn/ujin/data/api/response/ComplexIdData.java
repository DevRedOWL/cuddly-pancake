package p035ru.unicorn.ujin.data.api.response;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/ComplexIdData;", "", "uid", "", "id", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getUid", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.ComplexIdData */
/* compiled from: ComplexInfoResponse.kt */
public final class ComplexIdData {

    /* renamed from: id */
    private final String f6613id;
    private final String uid;

    public static /* synthetic */ ComplexIdData copy$default(ComplexIdData complexIdData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = complexIdData.uid;
        }
        if ((i & 2) != 0) {
            str2 = complexIdData.f6613id;
        }
        return complexIdData.copy(str, str2);
    }

    public final String component1() {
        return this.uid;
    }

    public final String component2() {
        return this.f6613id;
    }

    public final ComplexIdData copy(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "uid");
        Intrinsics.checkNotNullParameter(str2, "id");
        return new ComplexIdData(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComplexIdData)) {
            return false;
        }
        ComplexIdData complexIdData = (ComplexIdData) obj;
        return Intrinsics.areEqual((Object) this.uid, (Object) complexIdData.uid) && Intrinsics.areEqual((Object) this.f6613id, (Object) complexIdData.f6613id);
    }

    public int hashCode() {
        String str = this.uid;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f6613id;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ComplexIdData(uid=" + this.uid + ", id=" + this.f6613id + ")";
    }

    public ComplexIdData(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "uid");
        Intrinsics.checkNotNullParameter(str2, "id");
        this.uid = str;
        this.f6613id = str2;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getId() {
        return this.f6613id;
    }
}
