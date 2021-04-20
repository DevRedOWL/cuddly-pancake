package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/data/realm/Resource;", "", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/ProfileAdress;", "kotlin.jvm.PlatformType", "data", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.AddressRepo$getListAdressAny$local$1 */
/* compiled from: AddressRepo.kt */
final class AddressRepo$getListAdressAny$local$1<T, R> implements Function<List<? extends ProfileAdress>, Resource<List<? extends ProfileAdress>>> {
    public static final AddressRepo$getListAdressAny$local$1 INSTANCE = new AddressRepo$getListAdressAny$local$1();

    AddressRepo$getListAdressAny$local$1() {
    }

    public final Resource<List<ProfileAdress>> apply(List<? extends ProfileAdress> list) {
        Intrinsics.checkNotNullParameter(list, "data");
        return Resource.success(0, "", list);
    }
}
