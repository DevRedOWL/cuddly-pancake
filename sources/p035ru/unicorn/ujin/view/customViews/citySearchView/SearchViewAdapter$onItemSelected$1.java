package p035ru.unicorn.ujin.view.customViews.citySearchView;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "it", "Lru/unicorn/ujin/view/customViews/citySearchView/SelectableItem;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.citySearchView.SearchViewAdapter$onItemSelected$1 */
/* compiled from: SearchViewAdapter.kt */
final class SearchViewAdapter$onItemSelected$1 extends Lambda implements Function1<SelectableItem, Unit> {
    public static final SearchViewAdapter$onItemSelected$1 INSTANCE = new SearchViewAdapter$onItemSelected$1();

    SearchViewAdapter$onItemSelected$1() {
        super(1);
    }

    public final void invoke(SelectableItem selectableItem) {
        Intrinsics.checkNotNullParameter(selectableItem, "it");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SelectableItem) obj);
        return Unit.INSTANCE;
    }
}
