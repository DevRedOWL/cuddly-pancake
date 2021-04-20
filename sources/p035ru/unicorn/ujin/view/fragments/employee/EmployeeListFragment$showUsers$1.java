package p035ru.unicorn.ujin.view.fragments.employee;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.ChooseObjectListFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;
import p035ru.unicorn.ujin.view.fragments.employee.EmployeeListAdapter;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/employee/EmployeeListFragment$showUsers$1", "Lru/unicorn/ujin/view/fragments/employee/EmployeeListAdapter$EmployeeListAdapterListener;", "onEmployeeRemoved", "", "employee", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserProfile;", "onEmployeeSelected", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.employee.EmployeeListFragment$showUsers$1 */
/* compiled from: EmployeeListFragment.kt */
public final class EmployeeListFragment$showUsers$1 implements EmployeeListAdapter.EmployeeListAdapterListener {
    final /* synthetic */ EmployeeListFragment this$0;

    EmployeeListFragment$showUsers$1(EmployeeListFragment employeeListFragment) {
        this.this$0 = employeeListFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r3 = r3.getUserdata();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onEmployeeSelected(p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x000d
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData r3 = r3.getUserdata()
            if (r3 == 0) goto L_0x000d
            java.lang.Integer r3 = r3.getId()
            goto L_0x000e
        L_0x000d:
            r3 = 0
        L_0x000e:
            ru.unicorn.ujin.view.fragments.employee.EmployeeListFragment r0 = r2.this$0
            ru.unicorn.ujin.view.activity.navigation.ui.mycompany.MyTeamPersonDetailFragment r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.MyTeamPersonDetailFragment.start(r3)
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            r1 = 0
            r0.nextFragment(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.employee.EmployeeListFragment$showUsers$1.onEmployeeSelected(ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserProfile):void");
    }

    public void onEmployeeRemoved(UserProfile userProfile) {
        UserData userdata;
        if (!(userProfile == null || (userdata = userProfile.getUserdata()) == null)) {
            userdata.getId();
        }
        MutableLiveData<UserProfile> currentProfile = EmployeeListFragment.access$getViewModell$p(this.this$0).getCurrentProfile();
        Intrinsics.checkNotNullExpressionValue(currentProfile, "viewModell.currentProfile");
        currentProfile.setValue(userProfile);
        EmployeeListFragment.access$getViewModell$p(this.this$0).afterChangingEmployeeProperty = false;
        this.this$0.nextFragment(new ChooseObjectListFragment(), false);
    }
}
