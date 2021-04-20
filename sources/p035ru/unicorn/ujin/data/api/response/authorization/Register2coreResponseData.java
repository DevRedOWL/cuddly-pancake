package p035ru.unicorn.ujin.data.api.response.authorization;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/authorization/Register2coreResponseData;", "", "token", "", "registered", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getRegistered", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getToken", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lru/unicorn/ujin/data/api/response/authorization/Register2coreResponseData;", "equals", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.authorization.Register2coreResponseData */
/* compiled from: Register2CoreResponse.kt */
public final class Register2coreResponseData {
    private final Boolean registered;
    private final String token;

    public static /* synthetic */ Register2coreResponseData copy$default(Register2coreResponseData register2coreResponseData, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = register2coreResponseData.token;
        }
        if ((i & 2) != 0) {
            bool = register2coreResponseData.registered;
        }
        return register2coreResponseData.copy(str, bool);
    }

    public final String component1() {
        return this.token;
    }

    public final Boolean component2() {
        return this.registered;
    }

    public final Register2coreResponseData copy(String str, Boolean bool) {
        return new Register2coreResponseData(str, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Register2coreResponseData)) {
            return false;
        }
        Register2coreResponseData register2coreResponseData = (Register2coreResponseData) obj;
        return Intrinsics.areEqual((Object) this.token, (Object) register2coreResponseData.token) && Intrinsics.areEqual((Object) this.registered, (Object) register2coreResponseData.registered);
    }

    public int hashCode() {
        String str = this.token;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Boolean bool = this.registered;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "Register2coreResponseData(token=" + this.token + ", registered=" + this.registered + ")";
    }

    public Register2coreResponseData(String str, Boolean bool) {
        this.token = str;
        this.registered = bool;
    }

    public final String getToken() {
        return this.token;
    }

    public final Boolean getRegistered() {
        return this.registered;
    }
}
