package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JQ\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/MetaData;", "", "currentPage", "", "from", "lastPage", "path", "", "perPage", "to", "total", "(IIILjava/lang/String;III)V", "getCurrentPage", "()I", "getFrom", "getLastPage", "getPath", "()Ljava/lang/String;", "getPerPage", "getTo", "getTotal", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.MetaData */
/* compiled from: MetaData.kt */
public final class MetaData {
    @SerializedName("current_page")
    private final int currentPage;
    private final int from;
    @SerializedName("last_page")
    private final int lastPage;
    private final String path;
    @SerializedName("per_page")
    private final int perPage;

    /* renamed from: to */
    private final int f6659to;
    private final int total;

    public static /* synthetic */ MetaData copy$default(MetaData metaData, int i, int i2, int i3, String str, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = metaData.currentPage;
        }
        if ((i7 & 2) != 0) {
            i2 = metaData.from;
        }
        int i8 = i2;
        if ((i7 & 4) != 0) {
            i3 = metaData.lastPage;
        }
        int i9 = i3;
        if ((i7 & 8) != 0) {
            str = metaData.path;
        }
        String str2 = str;
        if ((i7 & 16) != 0) {
            i4 = metaData.perPage;
        }
        int i10 = i4;
        if ((i7 & 32) != 0) {
            i5 = metaData.f6659to;
        }
        int i11 = i5;
        if ((i7 & 64) != 0) {
            i6 = metaData.total;
        }
        return metaData.copy(i, i8, i9, str2, i10, i11, i6);
    }

    public final int component1() {
        return this.currentPage;
    }

    public final int component2() {
        return this.from;
    }

    public final int component3() {
        return this.lastPage;
    }

    public final String component4() {
        return this.path;
    }

    public final int component5() {
        return this.perPage;
    }

    public final int component6() {
        return this.f6659to;
    }

    public final int component7() {
        return this.total;
    }

    public final MetaData copy(int i, int i2, int i3, String str, int i4, int i5, int i6) {
        return new MetaData(i, i2, i3, str, i4, i5, i6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetaData)) {
            return false;
        }
        MetaData metaData = (MetaData) obj;
        return this.currentPage == metaData.currentPage && this.from == metaData.from && this.lastPage == metaData.lastPage && Intrinsics.areEqual((Object) this.path, (Object) metaData.path) && this.perPage == metaData.perPage && this.f6659to == metaData.f6659to && this.total == metaData.total;
    }

    public int hashCode() {
        int hashCode = ((((Integer.valueOf(this.currentPage).hashCode() * 31) + Integer.valueOf(this.from).hashCode()) * 31) + Integer.valueOf(this.lastPage).hashCode()) * 31;
        String str = this.path;
        return ((((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + Integer.valueOf(this.perPage).hashCode()) * 31) + Integer.valueOf(this.f6659to).hashCode()) * 31) + Integer.valueOf(this.total).hashCode();
    }

    public String toString() {
        return "MetaData(currentPage=" + this.currentPage + ", from=" + this.from + ", lastPage=" + this.lastPage + ", path=" + this.path + ", perPage=" + this.perPage + ", to=" + this.f6659to + ", total=" + this.total + ")";
    }

    public MetaData(int i, int i2, int i3, String str, int i4, int i5, int i6) {
        this.currentPage = i;
        this.from = i2;
        this.lastPage = i3;
        this.path = str;
        this.perPage = i4;
        this.f6659to = i5;
        this.total = i6;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final int getFrom() {
        return this.from;
    }

    public final int getLastPage() {
        return this.lastPage;
    }

    public final String getPath() {
        return this.path;
    }

    public final int getPerPage() {
        return this.perPage;
    }

    public final int getTo() {
        return this.f6659to;
    }

    public final int getTotal() {
        return this.total;
    }
}
