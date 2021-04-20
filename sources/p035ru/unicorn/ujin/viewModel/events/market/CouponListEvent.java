package p035ru.unicorn.ujin.viewModel.events.market;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.marketplace.Coupon;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, mo51343d2 = {"Lru/unicorn/ujin/viewModel/events/market/CouponListEvent;", "", "success", "", "message", "", "couponList", "", "Lru/unicorn/ujin/data/realm/marketplace/Coupon;", "(ZLjava/lang/String;Ljava/util/List;)V", "getCouponList", "()Ljava/util/List;", "getMessage", "()Ljava/lang/String;", "getSuccess", "()Z", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.viewModel.events.market.CouponListEvent */
/* compiled from: CouponListEvent.kt */
public final class CouponListEvent {
    private final List<Coupon> couponList;
    private final String message;
    private final boolean success;

    public CouponListEvent(boolean z, String str, List<? extends Coupon> list) {
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(list, "couponList");
        this.success = z;
        this.message = str;
        this.couponList = list;
    }

    public final List<Coupon> getCouponList() {
        return this.couponList;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getSuccess() {
        return this.success;
    }
}
