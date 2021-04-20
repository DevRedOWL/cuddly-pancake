package p035ru.unicorn.ujin.view.fragments.profileselection.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "Lru/unicorn/ujin/view/fragments/profileselection/data/CityDTO;", "kotlin.jvm.PlatformType", "cityList", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/fragments/profileselection/data/CityList;", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.data.ProfileSelectionRep$getCities$remoteData$2 */
/* compiled from: ProfileSelectionRep.kt */
final class ProfileSelectionRep$getCities$remoteData$2<T, R> implements Function<Resource<CityList>, List<CityDTO>> {
    public static final ProfileSelectionRep$getCities$remoteData$2 INSTANCE = new ProfileSelectionRep$getCities$remoteData$2();

    ProfileSelectionRep$getCities$remoteData$2() {
    }

    public final List<CityDTO> apply(Resource<CityList> resource) {
        Intrinsics.checkNotNullParameter(resource, "cityList");
        return resource.getData().getCities();
    }
}
