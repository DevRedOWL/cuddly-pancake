package p035ru.unicorn.ujin.data.api.response;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/ReserveTimeResponse;", "", "error", "", "message", "", "(ILjava/lang/String;)V", "getError", "()I", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.ReserveTimeResponse */
/* compiled from: ReserveTimeResponse.kt */
public final class ReserveTimeResponse {
    private final int error;
    private final String message;

    public static /* synthetic */ ReserveTimeResponse copy$default(ReserveTimeResponse reserveTimeResponse, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = reserveTimeResponse.error;
        }
        if ((i2 & 2) != 0) {
            str = reserveTimeResponse.message;
        }
        return reserveTimeResponse.copy(i, str);
    }

    public final int component1() {
        return this.error;
    }

    public final String component2() {
        return this.message;
    }

    public final ReserveTimeResponse copy(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "message");
        return new ReserveTimeResponse(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReserveTimeResponse)) {
            return false;
        }
        ReserveTimeResponse reserveTimeResponse = (ReserveTimeResponse) obj;
        return this.error == reserveTimeResponse.error && Intrinsics.areEqual((Object) this.message, (Object) reserveTimeResponse.message);
    }

    public int hashCode() {
        int hashCode = Integer.valueOf(this.error).hashCode() * 31;
        String str = this.message;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ReserveTimeResponse(error=" + this.error + ", message=" + this.message + ")";
    }

    public ReserveTimeResponse(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "message");
        this.error = i;
        this.message = str;
    }

    public final int getError() {
        return this.error;
    }

    public final String getMessage() {
        return this.message;
    }
}
