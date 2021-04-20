package p035ru.unicorn.ujin.data.api.response.authorization;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.profile.User;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/authorization/RegisterStep2ResponseData;", "", "token", "", "user", "Lru/unicorn/ujin/data/realm/profile/User;", "(Ljava/lang/String;Lru/unicorn/ujin/data/realm/profile/User;)V", "getToken", "()Ljava/lang/String;", "getUser", "()Lru/unicorn/ujin/data/realm/profile/User;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.authorization.RegisterStep2ResponseData */
/* compiled from: RegisterStep2Response.kt */
public final class RegisterStep2ResponseData {
    private final String token;
    private final User user;

    public static /* synthetic */ RegisterStep2ResponseData copy$default(RegisterStep2ResponseData registerStep2ResponseData, String str, User user2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = registerStep2ResponseData.token;
        }
        if ((i & 2) != 0) {
            user2 = registerStep2ResponseData.user;
        }
        return registerStep2ResponseData.copy(str, user2);
    }

    public final String component1() {
        return this.token;
    }

    public final User component2() {
        return this.user;
    }

    public final RegisterStep2ResponseData copy(String str, User user2) {
        return new RegisterStep2ResponseData(str, user2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterStep2ResponseData)) {
            return false;
        }
        RegisterStep2ResponseData registerStep2ResponseData = (RegisterStep2ResponseData) obj;
        return Intrinsics.areEqual((Object) this.token, (Object) registerStep2ResponseData.token) && Intrinsics.areEqual((Object) this.user, (Object) registerStep2ResponseData.user);
    }

    public int hashCode() {
        String str = this.token;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        User user2 = this.user;
        if (user2 != null) {
            i = user2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "RegisterStep2ResponseData(token=" + this.token + ", user=" + this.user + ")";
    }

    public RegisterStep2ResponseData(String str, User user2) {
        this.token = str;
        this.user = user2;
    }

    public final String getToken() {
        return this.token;
    }

    public final User getUser() {
        return this.user;
    }
}
