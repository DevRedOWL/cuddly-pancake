package p035ru.unicorn.ujin.data.api.response.marketplace;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.ServiceData;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/marketplace/CompanyListResponse;", "", "data", "Lru/unicorn/ujin/data/api/response/marketplace/CompanyListResponseData;", "service", "Lru/unicorn/ujin/data/realm/ServiceData;", "(Lru/unicorn/ujin/data/api/response/marketplace/CompanyListResponseData;Lru/unicorn/ujin/data/realm/ServiceData;)V", "getData", "()Lru/unicorn/ujin/data/api/response/marketplace/CompanyListResponseData;", "getService", "()Lru/unicorn/ujin/data/realm/ServiceData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.marketplace.CompanyListResponse */
/* compiled from: CompanyListResponse.kt */
public final class CompanyListResponse {
    private final CompanyListResponseData data;
    private final ServiceData service;

    public static /* synthetic */ CompanyListResponse copy$default(CompanyListResponse companyListResponse, CompanyListResponseData companyListResponseData, ServiceData serviceData, int i, Object obj) {
        if ((i & 1) != 0) {
            companyListResponseData = companyListResponse.data;
        }
        if ((i & 2) != 0) {
            serviceData = companyListResponse.service;
        }
        return companyListResponse.copy(companyListResponseData, serviceData);
    }

    public final CompanyListResponseData component1() {
        return this.data;
    }

    public final ServiceData component2() {
        return this.service;
    }

    public final CompanyListResponse copy(CompanyListResponseData companyListResponseData, ServiceData serviceData) {
        Intrinsics.checkNotNullParameter(serviceData, NotificationCompat.CATEGORY_SERVICE);
        return new CompanyListResponse(companyListResponseData, serviceData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompanyListResponse)) {
            return false;
        }
        CompanyListResponse companyListResponse = (CompanyListResponse) obj;
        return Intrinsics.areEqual((Object) this.data, (Object) companyListResponse.data) && Intrinsics.areEqual((Object) this.service, (Object) companyListResponse.service);
    }

    public int hashCode() {
        CompanyListResponseData companyListResponseData = this.data;
        int i = 0;
        int hashCode = (companyListResponseData != null ? companyListResponseData.hashCode() : 0) * 31;
        ServiceData serviceData = this.service;
        if (serviceData != null) {
            i = serviceData.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "CompanyListResponse(data=" + this.data + ", service=" + this.service + ")";
    }

    public CompanyListResponse(CompanyListResponseData companyListResponseData, ServiceData serviceData) {
        Intrinsics.checkNotNullParameter(serviceData, NotificationCompat.CATEGORY_SERVICE);
        this.data = companyListResponseData;
        this.service = serviceData;
    }

    public final CompanyListResponseData getData() {
        return this.data;
    }

    public final ServiceData getService() {
        return this.service;
    }
}
