package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress;
import p046io.reactivex.functions.Predicate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "data", "", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/ProfileAdress;", "test"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.CoronaViewModel$subscribe$3 */
/* compiled from: CoronaViewModel.kt */
final class CoronaViewModel$subscribe$3<T> implements Predicate<List<? extends ProfileAdress>> {
    public static final CoronaViewModel$subscribe$3 INSTANCE = new CoronaViewModel$subscribe$3();

    CoronaViewModel$subscribe$3() {
    }

    public final boolean test(List<? extends ProfileAdress> list) {
        Intrinsics.checkNotNullParameter(list, "data");
        return !list.isEmpty();
    }
}
