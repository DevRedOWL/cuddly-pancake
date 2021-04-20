package p035ru.unicorn.ujin.view.fragments.profileselection.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p046io.reactivex.functions.Predicate;
import p046io.realm.RealmModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "data", "", "Lio/realm/RealmModel;", "kotlin.jvm.PlatformType", "", "test"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.data.ProfileSelectionRep$getCities$localData$1 */
/* compiled from: ProfileSelectionRep.kt */
final class ProfileSelectionRep$getCities$localData$1<T> implements Predicate<List<? extends RealmModel>> {
    public static final ProfileSelectionRep$getCities$localData$1 INSTANCE = new ProfileSelectionRep$getCities$localData$1();

    ProfileSelectionRep$getCities$localData$1() {
    }

    public final boolean test(List<? extends RealmModel> list) {
        Intrinsics.checkNotNullParameter(list, "data");
        return !list.isEmpty();
    }
}
