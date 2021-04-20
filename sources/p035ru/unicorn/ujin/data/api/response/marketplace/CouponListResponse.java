package p035ru.unicorn.ujin.data.api.response.marketplace;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/marketplace/CouponListResponse;", "", "error", "", "message", "", "data", "Lru/unicorn/ujin/data/api/response/marketplace/CouponListResponseData;", "(ILjava/lang/String;Lru/unicorn/ujin/data/api/response/marketplace/CouponListResponseData;)V", "getData", "()Lru/unicorn/ujin/data/api/response/marketplace/CouponListResponseData;", "getError", "()I", "getMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.marketplace.CouponListResponse */
/* compiled from: CouponListResponse.kt */
public final class CouponListResponse {
    private final CouponListResponseData data;
    private final int error;
    private final String message;

    public static /* synthetic */ CouponListResponse copy$default(CouponListResponse couponListResponse, int i, String str, CouponListResponseData couponListResponseData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = couponListResponse.error;
        }
        if ((i2 & 2) != 0) {
            str = couponListResponse.message;
        }
        if ((i2 & 4) != 0) {
            couponListResponseData = couponListResponse.data;
        }
        return couponListResponse.copy(i, str, couponListResponseData);
    }

    public final int component1() {
        return this.error;
    }

    public final String component2() {
        return this.message;
    }

    public final CouponListResponseData component3() {
        return this.data;
    }

    public final CouponListResponse copy(int i, String str, CouponListResponseData couponListResponseData) {
        Intrinsics.checkNotNullParameter(str, "message");
        return new CouponListResponse(i, str, couponListResponseData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CouponListResponse)) {
            return false;
        }
        CouponListResponse couponListResponse = (CouponListResponse) obj;
        return this.error == couponListResponse.error && Intrinsics.areEqual((Object) this.message, (Object) couponListResponse.message) && Intrinsics.areEqual((Object) this.data, (Object) couponListResponse.data);
    }

    public int hashCode() {
        int hashCode = Integer.valueOf(this.error).hashCode() * 31;
        String str = this.message;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        CouponListResponseData couponListResponseData = this.data;
        if (couponListResponseData != null) {
            i = couponListResponseData.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "CouponListResponse(error=" + this.error + ", message=" + this.message + ", data=" + this.data + ")";
    }

    public CouponListResponse(int i, String str, CouponListResponseData couponListResponseData) {
        Intrinsics.checkNotNullParameter(str, "message");
        this.error = i;
        this.message = str;
        this.data = couponListResponseData;
    }

    public final int getError() {
        return this.error;
    }

    public final String getMessage() {
        return this.message;
    }

    public final CouponListResponseData getData() {
        return this.data;
    }
}
