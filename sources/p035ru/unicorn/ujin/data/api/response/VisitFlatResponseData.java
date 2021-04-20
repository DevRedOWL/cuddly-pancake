package p035ru.unicorn.ujin.data.api.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/VisitFlatResponseData;", "", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.VisitFlatResponseData */
/* compiled from: VisitFlatResponse.kt */
public final class VisitFlatResponseData {
    @SerializedName("text_message")
    private final String message;

    public static /* synthetic */ VisitFlatResponseData copy$default(VisitFlatResponseData visitFlatResponseData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = visitFlatResponseData.message;
        }
        return visitFlatResponseData.copy(str);
    }

    public final String component1() {
        return this.message;
    }

    public final VisitFlatResponseData copy(String str) {
        return new VisitFlatResponseData(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof VisitFlatResponseData) && Intrinsics.areEqual((Object) this.message, (Object) ((VisitFlatResponseData) obj).message);
        }
        return true;
    }

    public int hashCode() {
        String str = this.message;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "VisitFlatResponseData(message=" + this.message + ")";
    }

    public VisitFlatResponseData(String str) {
        this.message = str;
    }

    public final String getMessage() {
        return this.message;
    }
}
