package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.Pass;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/Pass;", "kotlin.jvm.PlatformType", "accept", "ru/unicorn/ujin/view/activity/navigation/ui/corona/CoronaViewModel$getCurrentPass$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.CoronaViewModel$getCurrentPass$$inlined$let$lambda$1 */
/* compiled from: CoronaViewModel.kt */
final class CoronaViewModel$getCurrentPass$$inlined$let$lambda$1<T> implements Consumer<Resource<Pass>> {
    final /* synthetic */ CoronaViewModel this$0;

    CoronaViewModel$getCurrentPass$$inlined$let$lambda$1(CoronaViewModel coronaViewModel) {
        this.this$0 = coronaViewModel;
    }

    public final void accept(Resource<Pass> resource) {
        this.this$0.getPassDetailMutable().setValue(resource);
        Intrinsics.checkNotNullExpressionValue(resource, "data");
        if (resource.getStatus() == Resource.Status.SUCCESS) {
            PassRepo access$getPassRepo$p = this.this$0.passRepo;
            Pass data = resource.getData();
            Intrinsics.checkNotNullExpressionValue(data, "data.data");
            access$getPassRepo$p.setPassDetail(data);
        }
    }
}