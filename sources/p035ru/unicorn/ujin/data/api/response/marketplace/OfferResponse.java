package p035ru.unicorn.ujin.data.api.response.marketplace;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.ServiceData;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/marketplace/OfferResponse;", "", "data", "Lru/unicorn/ujin/data/api/response/marketplace/OfferResponseData;", "service", "Lru/unicorn/ujin/data/realm/ServiceData;", "(Lru/unicorn/ujin/data/api/response/marketplace/OfferResponseData;Lru/unicorn/ujin/data/realm/ServiceData;)V", "getData", "()Lru/unicorn/ujin/data/api/response/marketplace/OfferResponseData;", "getService", "()Lru/unicorn/ujin/data/realm/ServiceData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.marketplace.OfferResponse */
/* compiled from: OfferResponse.kt */
public final class OfferResponse {
    private final OfferResponseData data;
    private final ServiceData service;

    public static /* synthetic */ OfferResponse copy$default(OfferResponse offerResponse, OfferResponseData offerResponseData, ServiceData serviceData, int i, Object obj) {
        if ((i & 1) != 0) {
            offerResponseData = offerResponse.data;
        }
        if ((i & 2) != 0) {
            serviceData = offerResponse.service;
        }
        return offerResponse.copy(offerResponseData, serviceData);
    }

    public final OfferResponseData component1() {
        return this.data;
    }

    public final ServiceData component2() {
        return this.service;
    }

    public final OfferResponse copy(OfferResponseData offerResponseData, ServiceData serviceData) {
        Intrinsics.checkNotNullParameter(offerResponseData, "data");
        Intrinsics.checkNotNullParameter(serviceData, NotificationCompat.CATEGORY_SERVICE);
        return new OfferResponse(offerResponseData, serviceData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferResponse)) {
            return false;
        }
        OfferResponse offerResponse = (OfferResponse) obj;
        return Intrinsics.areEqual((Object) this.data, (Object) offerResponse.data) && Intrinsics.areEqual((Object) this.service, (Object) offerResponse.service);
    }

    public int hashCode() {
        OfferResponseData offerResponseData = this.data;
        int i = 0;
        int hashCode = (offerResponseData != null ? offerResponseData.hashCode() : 0) * 31;
        ServiceData serviceData = this.service;
        if (serviceData != null) {
            i = serviceData.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "OfferResponse(data=" + this.data + ", service=" + this.service + ")";
    }

    public OfferResponse(OfferResponseData offerResponseData, ServiceData serviceData) {
        Intrinsics.checkNotNullParameter(offerResponseData, "data");
        Intrinsics.checkNotNullParameter(serviceData, NotificationCompat.CATEGORY_SERVICE);
        this.data = offerResponseData;
        this.service = serviceData;
    }

    public final OfferResponseData getData() {
        return this.data;
    }

    public final ServiceData getService() {
        return this.service;
    }
}
