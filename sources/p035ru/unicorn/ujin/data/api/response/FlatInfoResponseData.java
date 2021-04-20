package p035ru.unicorn.ujin.data.api.response;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Flat;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/FlatInfoResponseData;", "", "token", "", "flat", "Lru/unicorn/ujin/data/realm/Flat;", "ending", "root", "(Ljava/lang/String;Lru/unicorn/ujin/data/realm/Flat;Ljava/lang/String;Ljava/lang/String;)V", "getEnding", "()Ljava/lang/String;", "getFlat", "()Lru/unicorn/ujin/data/realm/Flat;", "getRoot", "getToken", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.FlatInfoResponseData */
/* compiled from: FlatInfoResponse.kt */
public final class FlatInfoResponseData {
    private final String ending;
    private final Flat flat;
    private final String root;
    private final String token;

    public static /* synthetic */ FlatInfoResponseData copy$default(FlatInfoResponseData flatInfoResponseData, String str, Flat flat2, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flatInfoResponseData.token;
        }
        if ((i & 2) != 0) {
            flat2 = flatInfoResponseData.flat;
        }
        if ((i & 4) != 0) {
            str2 = flatInfoResponseData.ending;
        }
        if ((i & 8) != 0) {
            str3 = flatInfoResponseData.root;
        }
        return flatInfoResponseData.copy(str, flat2, str2, str3);
    }

    public final String component1() {
        return this.token;
    }

    public final Flat component2() {
        return this.flat;
    }

    public final String component3() {
        return this.ending;
    }

    public final String component4() {
        return this.root;
    }

    public final FlatInfoResponseData copy(String str, Flat flat2, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(flat2, "flat");
        Intrinsics.checkNotNullParameter(str2, "ending");
        Intrinsics.checkNotNullParameter(str3, "root");
        return new FlatInfoResponseData(str, flat2, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlatInfoResponseData)) {
            return false;
        }
        FlatInfoResponseData flatInfoResponseData = (FlatInfoResponseData) obj;
        return Intrinsics.areEqual((Object) this.token, (Object) flatInfoResponseData.token) && Intrinsics.areEqual((Object) this.flat, (Object) flatInfoResponseData.flat) && Intrinsics.areEqual((Object) this.ending, (Object) flatInfoResponseData.ending) && Intrinsics.areEqual((Object) this.root, (Object) flatInfoResponseData.root);
    }

    public int hashCode() {
        String str = this.token;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Flat flat2 = this.flat;
        int hashCode2 = (hashCode + (flat2 != null ? flat2.hashCode() : 0)) * 31;
        String str2 = this.ending;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.root;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "FlatInfoResponseData(token=" + this.token + ", flat=" + this.flat + ", ending=" + this.ending + ", root=" + this.root + ")";
    }

    public FlatInfoResponseData(String str, Flat flat2, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(flat2, "flat");
        Intrinsics.checkNotNullParameter(str2, "ending");
        Intrinsics.checkNotNullParameter(str3, "root");
        this.token = str;
        this.flat = flat2;
        this.ending = str2;
        this.root = str3;
    }

    public final String getToken() {
        return this.token;
    }

    public final Flat getFlat() {
        return this.flat;
    }

    public final String getEnding() {
        return this.ending;
    }

    public final String getRoot() {
        return this.root;
    }
}
