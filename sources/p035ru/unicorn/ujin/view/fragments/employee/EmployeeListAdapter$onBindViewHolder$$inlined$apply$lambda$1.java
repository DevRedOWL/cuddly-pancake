package p035ru.unicorn.ujin.view.fragments.employee;

import android.view.View;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/view/fragments/employee/EmployeeListAdapter$onBindViewHolder$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.employee.EmployeeListAdapter$onBindViewHolder$$inlined$apply$lambda$1 */
/* compiled from: EmployeeListAdapter.kt */
final class EmployeeListAdapter$onBindViewHolder$$inlined$apply$lambda$1 implements View.OnClickListener {
    final /* synthetic */ UserProfile $employee$inlined;
    final /* synthetic */ EmployeeListAdapter this$0;

    EmployeeListAdapter$onBindViewHolder$$inlined$apply$lambda$1(EmployeeListAdapter employeeListAdapter, UserProfile userProfile) {
        this.this$0 = employeeListAdapter;
        this.$employee$inlined = userProfile;
    }

    public final void onClick(View view) {
        this.this$0.listener.onEmployeeRemoved(this.$employee$inlined);
    }
}
