package p035ru.unicorn.ujin.view.fragments.employee;

import android.view.View;
import androidx.appcompat.widget.SearchView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.employee.EmployeeListFragment$initCenterLayout$1 */
/* compiled from: EmployeeListFragment.kt */
final class EmployeeListFragment$initCenterLayout$1 implements View.OnClickListener {
    final /* synthetic */ View $searchLayout;
    final /* synthetic */ EmployeeListFragment this$0;

    EmployeeListFragment$initCenterLayout$1(EmployeeListFragment employeeListFragment, View view) {
        this.this$0 = employeeListFragment;
        this.$searchLayout = view;
    }

    public final void onClick(View view) {
        View view2 = this.$searchLayout;
        Intrinsics.checkNotNullExpressionValue(view2, "searchLayout");
        SearchView searchView = (SearchView) view2.findViewById(C5619R.C5622id.searchView);
        searchView.setVisibility(8);
        searchView.setQuery("", false);
        searchView.clearFocus();
        this.this$0.getBaseActivity().resetToolbar();
        this.this$0.initDefaultToolbar();
    }
}
