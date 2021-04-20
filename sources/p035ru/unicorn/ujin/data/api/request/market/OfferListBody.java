package p035ru.unicorn.ujin.data.api.request.market;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.api.request.AuthBody;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/request/market/OfferListBody;", "", "data", "Lru/unicorn/ujin/data/api/request/market/OfferListDataBody;", "auth", "Lru/unicorn/ujin/data/api/request/AuthBody;", "(Lru/unicorn/ujin/data/api/request/market/OfferListDataBody;Lru/unicorn/ujin/data/api/request/AuthBody;)V", "getAuth", "()Lru/unicorn/ujin/data/api/request/AuthBody;", "getData", "()Lru/unicorn/ujin/data/api/request/market/OfferListDataBody;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.request.market.OfferListBody */
/* compiled from: OfferListBody.kt */
public final class OfferListBody {
    private final AuthBody auth;
    private final OfferListDataBody data;

    public static /* synthetic */ OfferListBody copy$default(OfferListBody offerListBody, OfferListDataBody offerListDataBody, AuthBody authBody, int i, Object obj) {
        if ((i & 1) != 0) {
            offerListDataBody = offerListBody.data;
        }
        if ((i & 2) != 0) {
            authBody = offerListBody.auth;
        }
        return offerListBody.copy(offerListDataBody, authBody);
    }

    public final OfferListDataBody component1() {
        return this.data;
    }

    public final AuthBody component2() {
        return this.auth;
    }

    public final OfferListBody copy(OfferListDataBody offerListDataBody, AuthBody authBody) {
        Intrinsics.checkNotNullParameter(offerListDataBody, "data");
        Intrinsics.checkNotNullParameter(authBody, "auth");
        return new OfferListBody(offerListDataBody, authBody);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferListBody)) {
            return false;
        }
        OfferListBody offerListBody = (OfferListBody) obj;
        return Intrinsics.areEqual((Object) this.data, (Object) offerListBody.data) && Intrinsics.areEqual((Object) this.auth, (Object) offerListBody.auth);
    }

    public int hashCode() {
        OfferListDataBody offerListDataBody = this.data;
        int i = 0;
        int hashCode = (offerListDataBody != null ? offerListDataBody.hashCode() : 0) * 31;
        AuthBody authBody = this.auth;
        if (authBody != null) {
            i = authBody.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "OfferListBody(data=" + this.data + ", auth=" + this.auth + ")";
    }

    public OfferListBody(OfferListDataBody offerListDataBody, AuthBody authBody) {
        Intrinsics.checkNotNullParameter(offerListDataBody, "data");
        Intrinsics.checkNotNullParameter(authBody, "auth");
        this.data = offerListDataBody;
        this.auth = authBody;
    }

    public final OfferListDataBody getData() {
        return this.data;
    }

    public final AuthBody getAuth() {
        return this.auth;
    }
}
