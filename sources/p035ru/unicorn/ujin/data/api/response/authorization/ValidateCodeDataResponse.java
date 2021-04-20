package p035ru.unicorn.ujin.data.api.response.authorization;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/authorization/ValidateCodeDataResponse;", "", "token", "", "success", "", "(Ljava/lang/String;Z)V", "getSuccess", "()Z", "getToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.authorization.ValidateCodeDataResponse */
/* compiled from: ValidateCodeResponse.kt */
public final class ValidateCodeDataResponse {
    private final boolean success;
    private final String token;

    public static /* synthetic */ ValidateCodeDataResponse copy$default(ValidateCodeDataResponse validateCodeDataResponse, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validateCodeDataResponse.token;
        }
        if ((i & 2) != 0) {
            z = validateCodeDataResponse.success;
        }
        return validateCodeDataResponse.copy(str, z);
    }

    public final String component1() {
        return this.token;
    }

    public final boolean component2() {
        return this.success;
    }

    public final ValidateCodeDataResponse copy(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "token");
        return new ValidateCodeDataResponse(str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidateCodeDataResponse)) {
            return false;
        }
        ValidateCodeDataResponse validateCodeDataResponse = (ValidateCodeDataResponse) obj;
        return Intrinsics.areEqual((Object) this.token, (Object) validateCodeDataResponse.token) && this.success == validateCodeDataResponse.success;
    }

    public int hashCode() {
        String str = this.token;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.success;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "ValidateCodeDataResponse(token=" + this.token + ", success=" + this.success + ")";
    }

    public ValidateCodeDataResponse(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "token");
        this.token = str;
        this.success = z;
    }

    public final String getToken() {
        return this.token;
    }

    public final boolean getSuccess() {
        return this.success;
    }
}
