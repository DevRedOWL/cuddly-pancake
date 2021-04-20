package p035ru.unicorn.ujin.viewModel.events.market;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.marketplace.Promotion;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, mo51343d2 = {"Lru/unicorn/ujin/viewModel/events/market/PromotionListEvent;", "", "success", "", "message", "", "totalCount", "", "promotionList", "", "Lru/unicorn/ujin/data/realm/marketplace/Promotion;", "(ZLjava/lang/String;ILjava/util/List;)V", "getMessage", "()Ljava/lang/String;", "getPromotionList", "()Ljava/util/List;", "getSuccess", "()Z", "getTotalCount", "()I", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.viewModel.events.market.PromotionListEvent */
/* compiled from: PromotionListEvent.kt */
public final class PromotionListEvent {
    private final String message;
    private final List<Promotion> promotionList;
    private final boolean success;
    private final int totalCount;

    public PromotionListEvent(boolean z, String str, int i, List<Promotion> list) {
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(list, "promotionList");
        this.success = z;
        this.message = str;
        this.totalCount = i;
        this.promotionList = list;
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<Promotion> getPromotionList() {
        return this.promotionList;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }
}
