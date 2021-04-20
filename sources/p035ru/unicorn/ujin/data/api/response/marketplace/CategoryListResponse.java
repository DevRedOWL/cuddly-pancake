package p035ru.unicorn.ujin.data.api.response.marketplace;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.ServiceData;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\tHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/marketplace/CategoryListResponse;", "", "data", "Lru/unicorn/ujin/data/api/response/marketplace/CategoryListResponseData;", "service", "Lru/unicorn/ujin/data/realm/ServiceData;", "message", "", "error", "", "(Lru/unicorn/ujin/data/api/response/marketplace/CategoryListResponseData;Lru/unicorn/ujin/data/realm/ServiceData;Ljava/lang/String;I)V", "getData", "()Lru/unicorn/ujin/data/api/response/marketplace/CategoryListResponseData;", "getError", "()I", "getMessage", "()Ljava/lang/String;", "getService", "()Lru/unicorn/ujin/data/realm/ServiceData;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.marketplace.CategoryListResponse */
/* compiled from: CategoryListResponse.kt */
public final class CategoryListResponse {
    private final CategoryListResponseData data;
    private final int error;
    private final String message;
    private final ServiceData service;

    public static /* synthetic */ CategoryListResponse copy$default(CategoryListResponse categoryListResponse, CategoryListResponseData categoryListResponseData, ServiceData serviceData, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            categoryListResponseData = categoryListResponse.data;
        }
        if ((i2 & 2) != 0) {
            serviceData = categoryListResponse.service;
        }
        if ((i2 & 4) != 0) {
            str = categoryListResponse.message;
        }
        if ((i2 & 8) != 0) {
            i = categoryListResponse.error;
        }
        return categoryListResponse.copy(categoryListResponseData, serviceData, str, i);
    }

    public final CategoryListResponseData component1() {
        return this.data;
    }

    public final ServiceData component2() {
        return this.service;
    }

    public final String component3() {
        return this.message;
    }

    public final int component4() {
        return this.error;
    }

    public final CategoryListResponse copy(CategoryListResponseData categoryListResponseData, ServiceData serviceData, String str, int i) {
        Intrinsics.checkNotNullParameter(serviceData, NotificationCompat.CATEGORY_SERVICE);
        return new CategoryListResponse(categoryListResponseData, serviceData, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryListResponse)) {
            return false;
        }
        CategoryListResponse categoryListResponse = (CategoryListResponse) obj;
        return Intrinsics.areEqual((Object) this.data, (Object) categoryListResponse.data) && Intrinsics.areEqual((Object) this.service, (Object) categoryListResponse.service) && Intrinsics.areEqual((Object) this.message, (Object) categoryListResponse.message) && this.error == categoryListResponse.error;
    }

    public int hashCode() {
        CategoryListResponseData categoryListResponseData = this.data;
        int i = 0;
        int hashCode = (categoryListResponseData != null ? categoryListResponseData.hashCode() : 0) * 31;
        ServiceData serviceData = this.service;
        int hashCode2 = (hashCode + (serviceData != null ? serviceData.hashCode() : 0)) * 31;
        String str = this.message;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode2 + i) * 31) + Integer.valueOf(this.error).hashCode();
    }

    public String toString() {
        return "CategoryListResponse(data=" + this.data + ", service=" + this.service + ", message=" + this.message + ", error=" + this.error + ")";
    }

    public CategoryListResponse(CategoryListResponseData categoryListResponseData, ServiceData serviceData, String str, int i) {
        Intrinsics.checkNotNullParameter(serviceData, NotificationCompat.CATEGORY_SERVICE);
        this.data = categoryListResponseData;
        this.service = serviceData;
        this.message = str;
        this.error = i;
    }

    public final CategoryListResponseData getData() {
        return this.data;
    }

    public final ServiceData getService() {
        return this.service;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getError() {
        return this.error;
    }
}
