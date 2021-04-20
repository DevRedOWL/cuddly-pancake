package p035ru.unicorn.ujin.data.api.response;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/VisitFlatResponse;", "", "error", "", "data", "Lru/unicorn/ujin/data/api/response/VisitFlatResponseData;", "message", "", "(ILru/unicorn/ujin/data/api/response/VisitFlatResponseData;Ljava/lang/String;)V", "getData", "()Lru/unicorn/ujin/data/api/response/VisitFlatResponseData;", "getError", "()I", "getMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.VisitFlatResponse */
/* compiled from: VisitFlatResponse.kt */
public final class VisitFlatResponse {
    private final VisitFlatResponseData data;
    private final int error;
    private final String message;

    public static /* synthetic */ VisitFlatResponse copy$default(VisitFlatResponse visitFlatResponse, int i, VisitFlatResponseData visitFlatResponseData, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = visitFlatResponse.error;
        }
        if ((i2 & 2) != 0) {
            visitFlatResponseData = visitFlatResponse.data;
        }
        if ((i2 & 4) != 0) {
            str = visitFlatResponse.message;
        }
        return visitFlatResponse.copy(i, visitFlatResponseData, str);
    }

    public final int component1() {
        return this.error;
    }

    public final VisitFlatResponseData component2() {
        return this.data;
    }

    public final String component3() {
        return this.message;
    }

    public final VisitFlatResponse copy(int i, VisitFlatResponseData visitFlatResponseData, String str) {
        Intrinsics.checkNotNullParameter(str, "message");
        return new VisitFlatResponse(i, visitFlatResponseData, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisitFlatResponse)) {
            return false;
        }
        VisitFlatResponse visitFlatResponse = (VisitFlatResponse) obj;
        return this.error == visitFlatResponse.error && Intrinsics.areEqual((Object) this.data, (Object) visitFlatResponse.data) && Intrinsics.areEqual((Object) this.message, (Object) visitFlatResponse.message);
    }

    public int hashCode() {
        int hashCode = Integer.valueOf(this.error).hashCode() * 31;
        VisitFlatResponseData visitFlatResponseData = this.data;
        int i = 0;
        int hashCode2 = (hashCode + (visitFlatResponseData != null ? visitFlatResponseData.hashCode() : 0)) * 31;
        String str = this.message;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "VisitFlatResponse(error=" + this.error + ", data=" + this.data + ", message=" + this.message + ")";
    }

    public VisitFlatResponse(int i, VisitFlatResponseData visitFlatResponseData, String str) {
        Intrinsics.checkNotNullParameter(str, "message");
        this.error = i;
        this.data = visitFlatResponseData;
        this.message = str;
    }

    public final int getError() {
        return this.error;
    }

    public final VisitFlatResponseData getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }
}
