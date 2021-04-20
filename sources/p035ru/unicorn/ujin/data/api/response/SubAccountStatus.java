package p035ru.unicorn.ujin.data.api.response;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/SubAccountStatus;", "", "id", "", "title", "", "slug", "(ILjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getSlug", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.SubAccountStatus */
/* compiled from: SubAccountsStatusesResponseData.kt */
public final class SubAccountStatus {

    /* renamed from: id */
    private final int f6615id;
    private final String slug;
    private final String title;

    public static /* synthetic */ SubAccountStatus copy$default(SubAccountStatus subAccountStatus, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = subAccountStatus.f6615id;
        }
        if ((i2 & 2) != 0) {
            str = subAccountStatus.title;
        }
        if ((i2 & 4) != 0) {
            str2 = subAccountStatus.slug;
        }
        return subAccountStatus.copy(i, str, str2);
    }

    public final int component1() {
        return this.f6615id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.slug;
    }

    public final SubAccountStatus copy(int i, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "slug");
        return new SubAccountStatus(i, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubAccountStatus)) {
            return false;
        }
        SubAccountStatus subAccountStatus = (SubAccountStatus) obj;
        return this.f6615id == subAccountStatus.f6615id && Intrinsics.areEqual((Object) this.title, (Object) subAccountStatus.title) && Intrinsics.areEqual((Object) this.slug, (Object) subAccountStatus.slug);
    }

    public int hashCode() {
        int hashCode = Integer.valueOf(this.f6615id).hashCode() * 31;
        String str = this.title;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.slug;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "SubAccountStatus(id=" + this.f6615id + ", title=" + this.title + ", slug=" + this.slug + ")";
    }

    public SubAccountStatus(int i, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "slug");
        this.f6615id = i;
        this.title = str;
        this.slug = str2;
    }

    public final int getId() {
        return this.f6615id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSlug() {
        return this.slug;
    }
}
