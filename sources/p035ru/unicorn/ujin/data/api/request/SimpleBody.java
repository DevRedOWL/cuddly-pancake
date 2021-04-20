package p035ru.unicorn.ujin.data.api.request;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/request/SimpleBody;", "", "auth", "Lru/unicorn/ujin/data/api/request/AuthBody;", "(Lru/unicorn/ujin/data/api/request/AuthBody;)V", "getAuth", "()Lru/unicorn/ujin/data/api/request/AuthBody;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.request.SimpleBody */
/* compiled from: SimpleBody.kt */
public final class SimpleBody {
    private final AuthBody auth;

    public static /* synthetic */ SimpleBody copy$default(SimpleBody simpleBody, AuthBody authBody, int i, Object obj) {
        if ((i & 1) != 0) {
            authBody = simpleBody.auth;
        }
        return simpleBody.copy(authBody);
    }

    public final AuthBody component1() {
        return this.auth;
    }

    public final SimpleBody copy(AuthBody authBody) {
        Intrinsics.checkNotNullParameter(authBody, "auth");
        return new SimpleBody(authBody);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof SimpleBody) && Intrinsics.areEqual((Object) this.auth, (Object) ((SimpleBody) obj).auth);
        }
        return true;
    }

    public int hashCode() {
        AuthBody authBody = this.auth;
        if (authBody != null) {
            return authBody.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "SimpleBody(auth=" + this.auth + ")";
    }

    public SimpleBody(AuthBody authBody) {
        Intrinsics.checkNotNullParameter(authBody, "auth");
        this.auth = authBody;
    }

    public final AuthBody getAuth() {
        return this.auth;
    }
}
