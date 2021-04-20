package p035ru.unicorn.ujin.view.customViews.citySearchView;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "item", "Lru/unicorn/ujin/view/customViews/citySearchView/SelectableItem;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.citySearchView.SearchViewActivity$setUpRecyclerView$1 */
/* compiled from: SearchViewActivity.kt */
final class SearchViewActivity$setUpRecyclerView$1 extends Lambda implements Function1<SelectableItem, Unit> {
    final /* synthetic */ SearchViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SearchViewActivity$setUpRecyclerView$1(SearchViewActivity searchViewActivity) {
        super(1);
        this.this$0 = searchViewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SelectableItem) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(SelectableItem selectableItem) {
        Intrinsics.checkNotNullParameter(selectableItem, "item");
        this.this$0.sendResult(selectableItem);
    }
}
