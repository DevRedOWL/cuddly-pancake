package p035ru.unicorn.ujin.data.api.response.marketplace;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.ServiceData;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/marketplace/CompanyResponse;", "", "data", "Lru/unicorn/ujin/data/api/response/marketplace/CompanyResponseData;", "service", "Lru/unicorn/ujin/data/realm/ServiceData;", "(Lru/unicorn/ujin/data/api/response/marketplace/CompanyResponseData;Lru/unicorn/ujin/data/realm/ServiceData;)V", "getData", "()Lru/unicorn/ujin/data/api/response/marketplace/CompanyResponseData;", "getService", "()Lru/unicorn/ujin/data/realm/ServiceData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.marketplace.CompanyResponse */
/* compiled from: CompanyResponse.kt */
public final class CompanyResponse {
    private final CompanyResponseData data;
    private final ServiceData service;

    public static /* synthetic */ CompanyResponse copy$default(CompanyResponse companyResponse, CompanyResponseData companyResponseData, ServiceData serviceData, int i, Object obj) {
        if ((i & 1) != 0) {
            companyResponseData = companyResponse.data;
        }
        if ((i & 2) != 0) {
            serviceData = companyResponse.service;
        }
        return companyResponse.copy(companyResponseData, serviceData);
    }

    public final CompanyResponseData component1() {
        return this.data;
    }

    public final ServiceData component2() {
        return this.service;
    }

    public final CompanyResponse copy(CompanyResponseData companyResponseData, ServiceData serviceData) {
        Intrinsics.checkNotNullParameter(serviceData, NotificationCompat.CATEGORY_SERVICE);
        return new CompanyResponse(companyResponseData, serviceData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompanyResponse)) {
            return false;
        }
        CompanyResponse companyResponse = (CompanyResponse) obj;
        return Intrinsics.areEqual((Object) this.data, (Object) companyResponse.data) && Intrinsics.areEqual((Object) this.service, (Object) companyResponse.service);
    }

    public int hashCode() {
        CompanyResponseData companyResponseData = this.data;
        int i = 0;
        int hashCode = (companyResponseData != null ? companyResponseData.hashCode() : 0) * 31;
        ServiceData serviceData = this.service;
        if (serviceData != null) {
            i = serviceData.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "CompanyResponse(data=" + this.data + ", service=" + this.service + ")";
    }

    public CompanyResponse(CompanyResponseData companyResponseData, ServiceData serviceData) {
        Intrinsics.checkNotNullParameter(serviceData, NotificationCompat.CATEGORY_SERVICE);
        this.data = companyResponseData;
        this.service = serviceData;
    }

    public final CompanyResponseData getData() {
        return this.data;
    }

    public final ServiceData getService() {
        return this.service;
    }
}
