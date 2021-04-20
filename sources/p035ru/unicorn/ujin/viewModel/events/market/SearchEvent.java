package p035ru.unicorn.ujin.viewModel.events.market;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.marketplace.SearchItem;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, mo51343d2 = {"Lru/unicorn/ujin/viewModel/events/market/SearchEvent;", "", "success", "", "message", "", "resultList", "", "Lru/unicorn/ujin/data/realm/marketplace/SearchItem;", "totalCount", "", "(ZLjava/lang/String;Ljava/util/List;I)V", "getMessage", "()Ljava/lang/String;", "getResultList", "()Ljava/util/List;", "getSuccess", "()Z", "getTotalCount", "()I", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.viewModel.events.market.SearchEvent */
/* compiled from: SearchEvent.kt */
public final class SearchEvent {
    private final String message;
    private final List<SearchItem> resultList;
    private final boolean success;
    private final int totalCount;

    public SearchEvent(boolean z, String str, List<? extends SearchItem> list, int i) {
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(list, "resultList");
        this.success = z;
        this.message = str;
        this.resultList = list;
        this.totalCount = i;
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<SearchItem> getResultList() {
        return this.resultList;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }
}
