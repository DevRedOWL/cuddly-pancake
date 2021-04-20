package p035ru.unicorn.ujin.viewModel.events.market;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.marketplace.Category;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006\u0016"}, mo51343d2 = {"Lru/unicorn/ujin/viewModel/events/market/CategoriesEvent;", "", "success", "", "message", "", "categoryList", "", "Lru/unicorn/ujin/data/realm/marketplace/Category;", "lastPage", "", "totalCount", "(ZLjava/lang/String;Ljava/util/List;II)V", "getCategoryList", "()Ljava/util/List;", "getLastPage", "()I", "getMessage", "()Ljava/lang/String;", "getSuccess", "()Z", "getTotalCount", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.viewModel.events.market.CategoriesEvent */
/* compiled from: CategoriesEvent.kt */
public final class CategoriesEvent {
    private final List<Category> categoryList;
    private final int lastPage;
    private final String message;
    private final boolean success;
    private final int totalCount;

    public CategoriesEvent(boolean z, String str, List<Category> list, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(list, "categoryList");
        this.success = z;
        this.message = str;
        this.categoryList = list;
        this.lastPage = i;
        this.totalCount = i2;
    }

    public final List<Category> getCategoryList() {
        return this.categoryList;
    }

    public final int getLastPage() {
        return this.lastPage;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }
}
