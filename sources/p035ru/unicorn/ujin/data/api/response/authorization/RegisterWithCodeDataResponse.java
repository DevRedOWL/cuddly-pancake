package p035ru.unicorn.ujin.data.api.response.authorization;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/authorization/RegisterWithCodeDataResponse;", "", "token", "", "regionId", "(Ljava/lang/String;Ljava/lang/String;)V", "getRegionId", "()Ljava/lang/String;", "getToken", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.authorization.RegisterWithCodeDataResponse */
/* compiled from: RegisterWithCodeResponse.kt */
public final class RegisterWithCodeDataResponse {
    @SerializedName("region_id")
    private final String regionId;
    private final String token;

    public static /* synthetic */ RegisterWithCodeDataResponse copy$default(RegisterWithCodeDataResponse registerWithCodeDataResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = registerWithCodeDataResponse.token;
        }
        if ((i & 2) != 0) {
            str2 = registerWithCodeDataResponse.regionId;
        }
        return registerWithCodeDataResponse.copy(str, str2);
    }

    public final String component1() {
        return this.token;
    }

    public final String component2() {
        return this.regionId;
    }

    public final RegisterWithCodeDataResponse copy(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, "regionId");
        return new RegisterWithCodeDataResponse(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterWithCodeDataResponse)) {
            return false;
        }
        RegisterWithCodeDataResponse registerWithCodeDataResponse = (RegisterWithCodeDataResponse) obj;
        return Intrinsics.areEqual((Object) this.token, (Object) registerWithCodeDataResponse.token) && Intrinsics.areEqual((Object) this.regionId, (Object) registerWithCodeDataResponse.regionId);
    }

    public int hashCode() {
        String str = this.token;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.regionId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "RegisterWithCodeDataResponse(token=" + this.token + ", regionId=" + this.regionId + ")";
    }

    public RegisterWithCodeDataResponse(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, "regionId");
        this.token = str;
        this.regionId = str2;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getRegionId() {
        return this.regionId;
    }
}
