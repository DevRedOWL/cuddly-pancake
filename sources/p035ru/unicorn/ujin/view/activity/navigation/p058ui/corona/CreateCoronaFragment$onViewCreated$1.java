package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.Pass;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/Pass;", "kotlin.jvm.PlatformType", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.CreateCoronaFragment$onViewCreated$1 */
/* compiled from: CreateCoronaFragment.kt */
final class CreateCoronaFragment$onViewCreated$1<T> implements Observer<Resource<Pass>> {
    final /* synthetic */ CreateCoronaFragment this$0;

    CreateCoronaFragment$onViewCreated$1(CreateCoronaFragment createCoronaFragment) {
        this.this$0 = createCoronaFragment;
    }

    public final void onChanged(Resource<Pass> resource) {
        CreateCoronaFragment createCoronaFragment = this.this$0;
        Intrinsics.checkNotNullExpressionValue(resource, "data");
        createCoronaFragment.showCreationResult(resource);
    }
}
