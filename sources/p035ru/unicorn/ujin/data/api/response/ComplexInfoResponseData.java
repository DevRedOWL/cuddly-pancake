package p035ru.unicorn.ujin.data.api.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.ComplexInfo;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/ComplexInfoResponseData;", "", "token", "", "compexIdData", "Lru/unicorn/ujin/data/api/response/ComplexIdData;", "complex", "Lru/unicorn/ujin/data/realm/ComplexInfo;", "(Ljava/lang/String;Lru/unicorn/ujin/data/api/response/ComplexIdData;Lru/unicorn/ujin/data/realm/ComplexInfo;)V", "getCompexIdData", "()Lru/unicorn/ujin/data/api/response/ComplexIdData;", "getComplex", "()Lru/unicorn/ujin/data/realm/ComplexInfo;", "getToken", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.ComplexInfoResponseData */
/* compiled from: ComplexInfoResponse.kt */
public final class ComplexInfoResponseData {
    @SerializedName("complex")
    private final ComplexIdData compexIdData;
    @SerializedName("info")
    private final ComplexInfo complex;
    private final String token;

    public static /* synthetic */ ComplexInfoResponseData copy$default(ComplexInfoResponseData complexInfoResponseData, String str, ComplexIdData complexIdData, ComplexInfo complexInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = complexInfoResponseData.token;
        }
        if ((i & 2) != 0) {
            complexIdData = complexInfoResponseData.compexIdData;
        }
        if ((i & 4) != 0) {
            complexInfo = complexInfoResponseData.complex;
        }
        return complexInfoResponseData.copy(str, complexIdData, complexInfo);
    }

    public final String component1() {
        return this.token;
    }

    public final ComplexIdData component2() {
        return this.compexIdData;
    }

    public final ComplexInfo component3() {
        return this.complex;
    }

    public final ComplexInfoResponseData copy(String str, ComplexIdData complexIdData, ComplexInfo complexInfo) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(complexIdData, "compexIdData");
        Intrinsics.checkNotNullParameter(complexInfo, "complex");
        return new ComplexInfoResponseData(str, complexIdData, complexInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComplexInfoResponseData)) {
            return false;
        }
        ComplexInfoResponseData complexInfoResponseData = (ComplexInfoResponseData) obj;
        return Intrinsics.areEqual((Object) this.token, (Object) complexInfoResponseData.token) && Intrinsics.areEqual((Object) this.compexIdData, (Object) complexInfoResponseData.compexIdData) && Intrinsics.areEqual((Object) this.complex, (Object) complexInfoResponseData.complex);
    }

    public int hashCode() {
        String str = this.token;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ComplexIdData complexIdData = this.compexIdData;
        int hashCode2 = (hashCode + (complexIdData != null ? complexIdData.hashCode() : 0)) * 31;
        ComplexInfo complexInfo = this.complex;
        if (complexInfo != null) {
            i = complexInfo.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "ComplexInfoResponseData(token=" + this.token + ", compexIdData=" + this.compexIdData + ", complex=" + this.complex + ")";
    }

    public ComplexInfoResponseData(String str, ComplexIdData complexIdData, ComplexInfo complexInfo) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(complexIdData, "compexIdData");
        Intrinsics.checkNotNullParameter(complexInfo, "complex");
        this.token = str;
        this.compexIdData = complexIdData;
        this.complex = complexInfo;
    }

    public final String getToken() {
        return this.token;
    }

    public final ComplexIdData getCompexIdData() {
        return this.compexIdData;
    }

    public final ComplexInfo getComplex() {
        return this.complex;
    }
}
