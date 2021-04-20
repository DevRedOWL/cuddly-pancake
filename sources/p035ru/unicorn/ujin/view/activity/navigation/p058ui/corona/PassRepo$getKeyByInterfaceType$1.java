package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p046io.reactivex.functions.Predicate;
import p046io.realm.RealmModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "it", "Lio/realm/RealmModel;", "test"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.PassRepo$getKeyByInterfaceType$1 */
/* compiled from: PassRepo.kt */
final class PassRepo$getKeyByInterfaceType$1<T> implements Predicate<RealmModel> {
    public static final PassRepo$getKeyByInterfaceType$1 INSTANCE = new PassRepo$getKeyByInterfaceType$1();

    PassRepo$getKeyByInterfaceType$1() {
    }

    public final boolean test(RealmModel realmModel) {
        Intrinsics.checkNotNullParameter(realmModel, "it");
        return true;
    }
}
