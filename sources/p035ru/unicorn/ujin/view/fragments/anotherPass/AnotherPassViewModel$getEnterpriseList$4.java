package p035ru.unicorn.ujin.view.fragments.anotherPass;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany;
import p046io.reactivex.functions.Predicate;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/RentCompany;", "test"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel$getEnterpriseList$4 */
/* compiled from: AnotherPassViewModel.kt */
final class AnotherPassViewModel$getEnterpriseList$4<T> implements Predicate<RentCompany> {
    public static final AnotherPassViewModel$getEnterpriseList$4 INSTANCE = new AnotherPassViewModel$getEnterpriseList$4();

    AnotherPassViewModel$getEnterpriseList$4() {
    }

    public final boolean test(RentCompany rentCompany) {
        Intrinsics.checkNotNullParameter(rentCompany, "data");
        if (!rentCompany.isVerified()) {
            return false;
        }
        RealmList<String> employeePermissions = rentCompany.getEmployeePermissions();
        return employeePermissions != null ? employeePermissions.contains("issue-a-pass-guest") : false;
    }
}
