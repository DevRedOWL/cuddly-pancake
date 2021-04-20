package p035ru.unicorn.ujin.viewModel.events.market;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.marketplace.Offer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, mo51343d2 = {"Lru/unicorn/ujin/viewModel/events/market/OfferListEvent;", "", "success", "", "message", "", "offerList", "", "Lru/unicorn/ujin/data/realm/marketplace/Offer;", "lastPage", "", "(ZLjava/lang/String;Ljava/util/List;I)V", "getLastPage", "()I", "getMessage", "()Ljava/lang/String;", "getOfferList", "()Ljava/util/List;", "getSuccess", "()Z", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.viewModel.events.market.OfferListEvent */
/* compiled from: OfferListEvent.kt */
public final class OfferListEvent {
    private final int lastPage;
    private final String message;
    private final List<Offer> offerList;
    private final boolean success;

    public OfferListEvent(boolean z, String str, List<Offer> list, int i) {
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(list, "offerList");
        this.success = z;
        this.message = str;
        this.offerList = list;
        this.lastPage = i;
    }

    public final int getLastPage() {
        return this.lastPage;
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<Offer> getOfferList() {
        return this.offerList;
    }

    public final boolean getSuccess() {
        return this.success;
    }
}
