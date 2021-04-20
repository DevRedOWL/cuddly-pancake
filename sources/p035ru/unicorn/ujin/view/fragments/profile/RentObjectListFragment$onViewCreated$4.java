package p035ru.unicorn.ujin.view.fragments.profile;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.api.response.profile.RentObjectListResponse;
import p035ru.unicorn.ujin.data.realm.Resource;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/profile/RentObjectListResponse;", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.RentObjectListFragment$onViewCreated$4 */
/* compiled from: RentObjectListFragment.kt */
final class RentObjectListFragment$onViewCreated$4<T> implements Observer<Resource<RentObjectListResponse>> {
    final /* synthetic */ RentObjectListFragment this$0;

    RentObjectListFragment$onViewCreated$4(RentObjectListFragment rentObjectListFragment) {
        this.this$0 = rentObjectListFragment;
    }

    public final void onChanged(Resource<RentObjectListResponse> resource) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        this.this$0.showData(resource);
    }
}
