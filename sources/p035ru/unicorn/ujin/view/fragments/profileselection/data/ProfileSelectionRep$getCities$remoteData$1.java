package p035ru.unicorn.ujin.view.fragments.profileselection.data;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "cityList", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/fragments/profileselection/data/CityList;", "test"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.data.ProfileSelectionRep$getCities$remoteData$1 */
/* compiled from: ProfileSelectionRep.kt */
final class ProfileSelectionRep$getCities$remoteData$1<T> implements Predicate<Resource<CityList>> {
    public static final ProfileSelectionRep$getCities$remoteData$1 INSTANCE = new ProfileSelectionRep$getCities$remoteData$1();

    ProfileSelectionRep$getCities$remoteData$1() {
    }

    public final boolean test(Resource<CityList> resource) {
        Intrinsics.checkNotNullParameter(resource, "cityList");
        Collection cities = resource.getData().getCities();
        return !(cities == null || cities.isEmpty());
    }
}
