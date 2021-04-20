package p035ru.unicorn.ujin.market.search;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "position", "", "onConfigureTab"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.search.SearchViewFragment$initTabs$2 */
/* compiled from: SearchViewFragment.kt */
final class SearchViewFragment$initTabs$2 implements TabLayoutMediator.TabConfigurationStrategy {
    final /* synthetic */ List $titles;

    SearchViewFragment$initTabs$2(List list) {
        this.$titles = list;
    }

    public final void onConfigureTab(TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        if (!this.$titles.isEmpty()) {
            tab.setText((CharSequence) this.$titles.get(i));
        }
    }
}
