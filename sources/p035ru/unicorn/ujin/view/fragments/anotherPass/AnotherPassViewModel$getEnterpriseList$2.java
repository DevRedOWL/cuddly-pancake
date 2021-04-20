package p035ru.unicorn.ujin.view.fragments.anotherPass;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany;
import p035ru.unicorn.ujin.view.fragments.anotherPass.response.enterprise.EnterpriseListResponse;
import p046io.reactivex.functions.Predicate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/fragments/anotherPass/response/enterprise/EnterpriseListResponse;", "test"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel$getEnterpriseList$2 */
/* compiled from: AnotherPassViewModel.kt */
final class AnotherPassViewModel$getEnterpriseList$2<T> implements Predicate<Resource<EnterpriseListResponse>> {
    public static final AnotherPassViewModel$getEnterpriseList$2 INSTANCE = new AnotherPassViewModel$getEnterpriseList$2();

    AnotherPassViewModel$getEnterpriseList$2() {
    }

    public final boolean test(Resource<EnterpriseListResponse> resource) {
        ArrayList<RentCompany> enterprises;
        Intrinsics.checkNotNullParameter(resource, "data");
        if (!(resource.getData() == null || (enterprises = resource.getData().getEnterprises()) == null)) {
            Collection collection = enterprises;
            if (!(collection == null || collection.isEmpty())) {
                return true;
            }
        }
        return false;
    }
}
