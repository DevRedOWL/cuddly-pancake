package p035ru.unicorn.ujin.data.realm;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/LinksData;", "", "first", "", "last", "prev", "next", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFirst", "()Ljava/lang/String;", "getLast", "getNext", "getPrev", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.LinksData */
/* compiled from: LinksData.kt */
public final class LinksData {
    private final String first;
    private final String last;
    private final String next;
    private final String prev;

    public static /* synthetic */ LinksData copy$default(LinksData linksData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linksData.first;
        }
        if ((i & 2) != 0) {
            str2 = linksData.last;
        }
        if ((i & 4) != 0) {
            str3 = linksData.prev;
        }
        if ((i & 8) != 0) {
            str4 = linksData.next;
        }
        return linksData.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.first;
    }

    public final String component2() {
        return this.last;
    }

    public final String component3() {
        return this.prev;
    }

    public final String component4() {
        return this.next;
    }

    public final LinksData copy(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "first");
        Intrinsics.checkNotNullParameter(str2, "last");
        Intrinsics.checkNotNullParameter(str3, "prev");
        Intrinsics.checkNotNullParameter(str4, "next");
        return new LinksData(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinksData)) {
            return false;
        }
        LinksData linksData = (LinksData) obj;
        return Intrinsics.areEqual((Object) this.first, (Object) linksData.first) && Intrinsics.areEqual((Object) this.last, (Object) linksData.last) && Intrinsics.areEqual((Object) this.prev, (Object) linksData.prev) && Intrinsics.areEqual((Object) this.next, (Object) linksData.next);
    }

    public int hashCode() {
        String str = this.first;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.last;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.prev;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.next;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "LinksData(first=" + this.first + ", last=" + this.last + ", prev=" + this.prev + ", next=" + this.next + ")";
    }

    public LinksData(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "first");
        Intrinsics.checkNotNullParameter(str2, "last");
        Intrinsics.checkNotNullParameter(str3, "prev");
        Intrinsics.checkNotNullParameter(str4, "next");
        this.first = str;
        this.last = str2;
        this.prev = str3;
        this.next = str4;
    }

    public final String getFirst() {
        return this.first;
    }

    public final String getLast() {
        return this.last;
    }

    public final String getPrev() {
        return this.prev;
    }

    public final String getNext() {
        return this.next;
    }
}
