package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p046io.reactivex.functions.Function;
import p046io.realm.RealmModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010!\n\u0002\u0010 \n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00012*\u0010\u0005\u001a&\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00070\u0006H\n¢\u0006\u0002\b\b"}, mo51343d2 = {"<anonymous>", "", "Lio/realm/RealmModel;", "kotlin.jvm.PlatformType", "", "data", "", "", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.PassRepo$loadAllAvailableSystem$2 */
/* compiled from: PassRepo.kt */
final class PassRepo$loadAllAvailableSystem$2<T, R> implements Function<List<? extends RealmModel>, Iterable<? extends RealmModel>> {
    public static final PassRepo$loadAllAvailableSystem$2 INSTANCE = new PassRepo$loadAllAvailableSystem$2();

    PassRepo$loadAllAvailableSystem$2() {
    }

    public final Iterable<RealmModel> apply(List<? extends RealmModel> list) {
        Intrinsics.checkNotNullParameter(list, "data");
        return list;
    }
}
