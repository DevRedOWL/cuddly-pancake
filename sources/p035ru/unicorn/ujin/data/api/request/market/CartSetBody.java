package p035ru.unicorn.ujin.data.api.request.market;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.api.request.AuthBody;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/request/market/CartSetBody;", "", "data", "Lru/unicorn/ujin/data/api/request/market/CartSetDataBody;", "auth", "Lru/unicorn/ujin/data/api/request/AuthBody;", "(Lru/unicorn/ujin/data/api/request/market/CartSetDataBody;Lru/unicorn/ujin/data/api/request/AuthBody;)V", "getAuth", "()Lru/unicorn/ujin/data/api/request/AuthBody;", "getData", "()Lru/unicorn/ujin/data/api/request/market/CartSetDataBody;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.request.market.CartSetBody */
/* compiled from: CartSetBody.kt */
public final class CartSetBody {
    private final AuthBody auth;
    private final CartSetDataBody data;

    public static /* synthetic */ CartSetBody copy$default(CartSetBody cartSetBody, CartSetDataBody cartSetDataBody, AuthBody authBody, int i, Object obj) {
        if ((i & 1) != 0) {
            cartSetDataBody = cartSetBody.data;
        }
        if ((i & 2) != 0) {
            authBody = cartSetBody.auth;
        }
        return cartSetBody.copy(cartSetDataBody, authBody);
    }

    public final CartSetDataBody component1() {
        return this.data;
    }

    public final AuthBody component2() {
        return this.auth;
    }

    public final CartSetBody copy(CartSetDataBody cartSetDataBody, AuthBody authBody) {
        Intrinsics.checkNotNullParameter(cartSetDataBody, "data");
        Intrinsics.checkNotNullParameter(authBody, "auth");
        return new CartSetBody(cartSetDataBody, authBody);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartSetBody)) {
            return false;
        }
        CartSetBody cartSetBody = (CartSetBody) obj;
        return Intrinsics.areEqual((Object) this.data, (Object) cartSetBody.data) && Intrinsics.areEqual((Object) this.auth, (Object) cartSetBody.auth);
    }

    public int hashCode() {
        CartSetDataBody cartSetDataBody = this.data;
        int i = 0;
        int hashCode = (cartSetDataBody != null ? cartSetDataBody.hashCode() : 0) * 31;
        AuthBody authBody = this.auth;
        if (authBody != null) {
            i = authBody.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "CartSetBody(data=" + this.data + ", auth=" + this.auth + ")";
    }

    public CartSetBody(CartSetDataBody cartSetDataBody, AuthBody authBody) {
        Intrinsics.checkNotNullParameter(cartSetDataBody, "data");
        Intrinsics.checkNotNullParameter(authBody, "auth");
        this.data = cartSetDataBody;
        this.auth = authBody;
    }

    public final CartSetDataBody getData() {
        return this.data;
    }

    public final AuthBody getAuth() {
        return this.auth;
    }
}
