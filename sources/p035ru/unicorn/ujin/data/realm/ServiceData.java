package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/ServiceData;", "", "requestId", "", "error", "Lru/unicorn/ujin/data/realm/ErrorData;", "(Ljava/lang/String;Lru/unicorn/ujin/data/realm/ErrorData;)V", "getError", "()Lru/unicorn/ujin/data/realm/ErrorData;", "getRequestId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.ServiceData */
/* compiled from: ServiceData.kt */
public final class ServiceData {
    private final ErrorData error;
    @SerializedName("request_id")
    private final String requestId;

    public static /* synthetic */ ServiceData copy$default(ServiceData serviceData, String str, ErrorData errorData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serviceData.requestId;
        }
        if ((i & 2) != 0) {
            errorData = serviceData.error;
        }
        return serviceData.copy(str, errorData);
    }

    public final String component1() {
        return this.requestId;
    }

    public final ErrorData component2() {
        return this.error;
    }

    public final ServiceData copy(String str, ErrorData errorData) {
        return new ServiceData(str, errorData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceData)) {
            return false;
        }
        ServiceData serviceData = (ServiceData) obj;
        return Intrinsics.areEqual((Object) this.requestId, (Object) serviceData.requestId) && Intrinsics.areEqual((Object) this.error, (Object) serviceData.error);
    }

    public int hashCode() {
        String str = this.requestId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ErrorData errorData = this.error;
        if (errorData != null) {
            i = errorData.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ServiceData(requestId=" + this.requestId + ", error=" + this.error + ")";
    }

    public ServiceData(String str, ErrorData errorData) {
        this.requestId = str;
        this.error = errorData;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final ErrorData getError() {
        return this.error;
    }
}
