package p035ru.unicorn.ujin.view.fragments.profile;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, mo51343d2 = {"<anonymous>", "", "resource", "Lru/unicorn/ujin/view/activity/navigation/entity/schema/Schemas;", "onChanged", "ru/unicorn/ujin/view/fragments/profile/ApartmentListFragment$applyAndGoToApartment$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.ApartmentListFragment$applyAndGoToApartment$$inlined$let$lambda$1 */
/* compiled from: ApartmentListFragment.kt */
final class C6058xb6a4ac98<T> implements Observer<Schemas> {
    final /* synthetic */ ApartmentListFragment this$0;

    C6058xb6a4ac98(ApartmentListFragment apartmentListFragment) {
        this.this$0 = apartmentListFragment;
    }

    public final void onChanged(Schemas schemas) {
        Intrinsics.checkNotNullParameter(schemas, "resource");
        this.this$0.onGetSchema(schemas);
    }
}
