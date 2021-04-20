package p035ru.unicorn.ujin.view.fragments.employee;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "rentCompany", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/RentCompany;", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.employee.EmployeeListFragment$onViewCreated$1 */
/* compiled from: EmployeeListFragment.kt */
final class EmployeeListFragment$onViewCreated$1<T> implements Observer<RentCompany> {
    final /* synthetic */ EmployeeListFragment this$0;

    EmployeeListFragment$onViewCreated$1(EmployeeListFragment employeeListFragment) {
        this.this$0 = employeeListFragment;
    }

    public final void onChanged(RentCompany rentCompany) {
        this.this$0.showCompany(rentCompany);
    }
}
