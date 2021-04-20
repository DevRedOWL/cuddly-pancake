package p035ru.unicorn.ujin.view.fragments.searchFilter;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/view/fragments/searchFilter/SearchFilterViewModel;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.searchFilter.SearchFilterFragment$searchFilterViewModel$2 */
/* compiled from: SearchFilterFragment.kt */
final class SearchFilterFragment$searchFilterViewModel$2 extends Lambda implements Function0<SearchFilterViewModel> {
    final /* synthetic */ SearchFilterFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SearchFilterFragment$searchFilterViewModel$2(SearchFilterFragment searchFilterFragment) {
        super(0);
        this.this$0 = searchFilterFragment;
    }

    public final SearchFilterViewModel invoke() {
        ViewModel viewModel = ViewModelProviders.m10of((Fragment) this.this$0).get(SearchFilterViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProviders.of(th…terViewModel::class.java)");
        return (SearchFilterViewModel) viewModel;
    }
}
