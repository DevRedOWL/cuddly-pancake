package p035ru.unicorn.ujin.data.api.response.marketplace;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.ServiceData;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/marketplace/OfferListResponse;", "", "data", "Lru/unicorn/ujin/data/api/response/marketplace/OfferListResponseData;", "service", "Lru/unicorn/ujin/data/realm/ServiceData;", "(Lru/unicorn/ujin/data/api/response/marketplace/OfferListResponseData;Lru/unicorn/ujin/data/realm/ServiceData;)V", "getData", "()Lru/unicorn/ujin/data/api/response/marketplace/OfferListResponseData;", "getService", "()Lru/unicorn/ujin/data/realm/ServiceData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.marketplace.OfferListResponse */
/* compiled from: OfferListResponse.kt */
public final class OfferListResponse {
    private final OfferListResponseData data;
    private final ServiceData service;

    public static /* synthetic */ OfferListResponse copy$default(OfferListResponse offerListResponse, OfferListResponseData offerListResponseData, ServiceData serviceData, int i, Object obj) {
        if ((i & 1) != 0) {
            offerListResponseData = offerListResponse.data;
        }
        if ((i & 2) != 0) {
            serviceData = offerListResponse.service;
        }
        return offerListResponse.copy(offerListResponseData, serviceData);
    }

    public final OfferListResponseData component1() {
        return this.data;
    }

    public final ServiceData component2() {
        return this.service;
    }

    public final OfferListResponse copy(OfferListResponseData offerListResponseData, ServiceData serviceData) {
        Intrinsics.checkNotNullParameter(offerListResponseData, "data");
        Intrinsics.checkNotNullParameter(serviceData, NotificationCompat.CATEGORY_SERVICE);
        return new OfferListResponse(offerListResponseData, serviceData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferListResponse)) {
            return false;
        }
        OfferListResponse offerListResponse = (OfferListResponse) obj;
        return Intrinsics.areEqual((Object) this.data, (Object) offerListResponse.data) && Intrinsics.areEqual((Object) this.service, (Object) offerListResponse.service);
    }

    public int hashCode() {
        OfferListResponseData offerListResponseData = this.data;
        int i = 0;
        int hashCode = (offerListResponseData != null ? offerListResponseData.hashCode() : 0) * 31;
        ServiceData serviceData = this.service;
        if (serviceData != null) {
            i = serviceData.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "OfferListResponse(data=" + this.data + ", service=" + this.service + ")";
    }

    public OfferListResponse(OfferListResponseData offerListResponseData, ServiceData serviceData) {
        Intrinsics.checkNotNullParameter(offerListResponseData, "data");
        Intrinsics.checkNotNullParameter(serviceData, NotificationCompat.CATEGORY_SERVICE);
        this.data = offerListResponseData;
        this.service = serviceData;
    }

    public final OfferListResponseData getData() {
        return this.data;
    }

    public final ServiceData getService() {
        return this.service;
    }
}
