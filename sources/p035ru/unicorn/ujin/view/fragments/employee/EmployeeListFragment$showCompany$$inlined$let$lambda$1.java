package p035ru.unicorn.ujin.view.fragments.employee;

import android.view.View;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/view/fragments/employee/EmployeeListFragment$showCompany$1$1$1", "ru/unicorn/ujin/view/fragments/employee/EmployeeListFragment$$special$$inlined$apply$lambda$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.employee.EmployeeListFragment$showCompany$$inlined$let$lambda$1 */
/* compiled from: EmployeeListFragment.kt */
final class EmployeeListFragment$showCompany$$inlined$let$lambda$1 implements View.OnClickListener {
    final /* synthetic */ boolean $isAbleToManage$inlined;
    final /* synthetic */ UserProfile $myUserProfile$inlined;
    final /* synthetic */ RentCompany $rentCompany$inlined;
    final /* synthetic */ EmployeeListFragment this$0;

    EmployeeListFragment$showCompany$$inlined$let$lambda$1(UserProfile userProfile, boolean z, EmployeeListFragment employeeListFragment, RentCompany rentCompany) {
        this.$myUserProfile$inlined = userProfile;
        this.$isAbleToManage$inlined = z;
        this.this$0 = employeeListFragment;
        this.$rentCompany$inlined = rentCompany;
    }

    public final void onClick(View view) {
        this.this$0.onAddEmployee();
    }
}
