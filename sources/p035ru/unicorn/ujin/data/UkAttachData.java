package p035ru.unicorn.ujin.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo51343d2 = {"Lru/unicorn/ujin/data/UkAttachData;", "", "request", "Lru/unicorn/ujin/data/UkAttachRequest;", "(Lru/unicorn/ujin/data/UkAttachRequest;)V", "getRequest", "()Lru/unicorn/ujin/data/UkAttachRequest;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.UkAttachData */
/* compiled from: UkAttachData.kt */
public final class UkAttachData {
    private final UkAttachRequest request;

    public static /* synthetic */ UkAttachData copy$default(UkAttachData ukAttachData, UkAttachRequest ukAttachRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            ukAttachRequest = ukAttachData.request;
        }
        return ukAttachData.copy(ukAttachRequest);
    }

    public final UkAttachRequest component1() {
        return this.request;
    }

    public final UkAttachData copy(UkAttachRequest ukAttachRequest) {
        return new UkAttachData(ukAttachRequest);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof UkAttachData) && Intrinsics.areEqual((Object) this.request, (Object) ((UkAttachData) obj).request);
        }
        return true;
    }

    public int hashCode() {
        UkAttachRequest ukAttachRequest = this.request;
        if (ukAttachRequest != null) {
            return ukAttachRequest.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "UkAttachData(request=" + this.request + ")";
    }

    public UkAttachData(UkAttachRequest ukAttachRequest) {
        this.request = ukAttachRequest;
    }

    public final UkAttachRequest getRequest() {
        return this.request;
    }
}
