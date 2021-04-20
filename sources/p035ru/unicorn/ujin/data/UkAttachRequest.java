package p035ru.unicorn.ujin.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo51343d2 = {"Lru/unicorn/ujin/data/UkAttachRequest;", "", "apartment", "Lru/unicorn/ujin/data/UkAttachApartment;", "(Lru/unicorn/ujin/data/UkAttachApartment;)V", "getApartment", "()Lru/unicorn/ujin/data/UkAttachApartment;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.UkAttachRequest */
/* compiled from: UkAttachData.kt */
public final class UkAttachRequest {
    private final UkAttachApartment apartment;

    public static /* synthetic */ UkAttachRequest copy$default(UkAttachRequest ukAttachRequest, UkAttachApartment ukAttachApartment, int i, Object obj) {
        if ((i & 1) != 0) {
            ukAttachApartment = ukAttachRequest.apartment;
        }
        return ukAttachRequest.copy(ukAttachApartment);
    }

    public final UkAttachApartment component1() {
        return this.apartment;
    }

    public final UkAttachRequest copy(UkAttachApartment ukAttachApartment) {
        return new UkAttachRequest(ukAttachApartment);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof UkAttachRequest) && Intrinsics.areEqual((Object) this.apartment, (Object) ((UkAttachRequest) obj).apartment);
        }
        return true;
    }

    public int hashCode() {
        UkAttachApartment ukAttachApartment = this.apartment;
        if (ukAttachApartment != null) {
            return ukAttachApartment.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "UkAttachRequest(apartment=" + this.apartment + ")";
    }

    public UkAttachRequest(UkAttachApartment ukAttachApartment) {
        this.apartment = ukAttachApartment;
    }

    public final UkAttachApartment getApartment() {
        return this.apartment;
    }
}
