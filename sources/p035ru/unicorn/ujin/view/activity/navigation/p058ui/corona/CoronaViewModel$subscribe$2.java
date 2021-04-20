package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/ProfileAdress;", "kotlin.jvm.PlatformType", "data", "Lru/unicorn/ujin/data/realm/Resource;", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.CoronaViewModel$subscribe$2 */
/* compiled from: CoronaViewModel.kt */
final class CoronaViewModel$subscribe$2<T, R> implements Function<Resource<List<? extends ProfileAdress>>, List<? extends ProfileAdress>> {
    public static final CoronaViewModel$subscribe$2 INSTANCE = new CoronaViewModel$subscribe$2();

    CoronaViewModel$subscribe$2() {
    }

    public final List<ProfileAdress> apply(Resource<List<ProfileAdress>> resource) {
        Intrinsics.checkNotNullParameter(resource, "data");
        return resource.getData();
    }
}
