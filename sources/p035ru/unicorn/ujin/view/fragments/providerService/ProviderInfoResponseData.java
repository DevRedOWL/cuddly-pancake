package p035ru.unicorn.ujin.view.fragments.providerService;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/providerService/ProviderInfoResponseData;", "", "unavailable", "Lru/unicorn/ujin/view/fragments/providerService/Unavailable;", "available", "Lru/unicorn/ujin/view/fragments/providerService/Available;", "(Lru/unicorn/ujin/view/fragments/providerService/Unavailable;Lru/unicorn/ujin/view/fragments/providerService/Available;)V", "getAvailable", "()Lru/unicorn/ujin/view/fragments/providerService/Available;", "getUnavailable", "()Lru/unicorn/ujin/view/fragments/providerService/Unavailable;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.providerService.ProviderInfoResponseData */
/* compiled from: ProviderInfoResponse.kt */
public final class ProviderInfoResponseData {
    private final Available available;
    private final Unavailable unavailable;

    public static /* synthetic */ ProviderInfoResponseData copy$default(ProviderInfoResponseData providerInfoResponseData, Unavailable unavailable2, Available available2, int i, Object obj) {
        if ((i & 1) != 0) {
            unavailable2 = providerInfoResponseData.unavailable;
        }
        if ((i & 2) != 0) {
            available2 = providerInfoResponseData.available;
        }
        return providerInfoResponseData.copy(unavailable2, available2);
    }

    public final Unavailable component1() {
        return this.unavailable;
    }

    public final Available component2() {
        return this.available;
    }

    public final ProviderInfoResponseData copy(Unavailable unavailable2, Available available2) {
        return new ProviderInfoResponseData(unavailable2, available2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProviderInfoResponseData)) {
            return false;
        }
        ProviderInfoResponseData providerInfoResponseData = (ProviderInfoResponseData) obj;
        return Intrinsics.areEqual((Object) this.unavailable, (Object) providerInfoResponseData.unavailable) && Intrinsics.areEqual((Object) this.available, (Object) providerInfoResponseData.available);
    }

    public int hashCode() {
        Unavailable unavailable2 = this.unavailable;
        int i = 0;
        int hashCode = (unavailable2 != null ? unavailable2.hashCode() : 0) * 31;
        Available available2 = this.available;
        if (available2 != null) {
            i = available2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ProviderInfoResponseData(unavailable=" + this.unavailable + ", available=" + this.available + ")";
    }

    public ProviderInfoResponseData(Unavailable unavailable2, Available available2) {
        this.unavailable = unavailable2;
        this.available = available2;
    }

    public final Unavailable getUnavailable() {
        return this.unavailable;
    }

    public final Available getAvailable() {
        return this.available;
    }
}
