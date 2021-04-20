package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdressListIn;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/data/realm/Resource;", "", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/ProfileAdress;", "kotlin.jvm.PlatformType", "data", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/ProfileAdressListIn;", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.AddressRepo$listAdressRemote$1 */
/* compiled from: AddressRepo.kt */
final class AddressRepo$listAdressRemote$1<T, R> implements Function<Resource<ProfileAdressListIn>, Resource<List<? extends ProfileAdress>>> {
    public static final AddressRepo$listAdressRemote$1 INSTANCE = new AddressRepo$listAdressRemote$1();

    AddressRepo$listAdressRemote$1() {
    }

    public final Resource<List<ProfileAdress>> apply(Resource<ProfileAdressListIn> resource) {
        Intrinsics.checkNotNullParameter(resource, "data");
        return Resource.success(resource.getError(), resource.getMessage(), resource.getData().getApartments());
    }
}
