package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/data/realm/Resource;", "", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/ProfileAdress;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.AddressRepo$getListAdressAny$remote$2 */
/* compiled from: AddressRepo.kt */
final class AddressRepo$getListAdressAny$remote$2<T> implements Consumer<Resource<List<? extends ProfileAdress>>> {
    final /* synthetic */ AddressRepo this$0;

    AddressRepo$getListAdressAny$remote$2(AddressRepo addressRepo) {
        this.this$0 = addressRepo;
    }

    public final void accept(Resource<List<ProfileAdress>> resource) {
        LocalRepository localRep = this.this$0.getLocalRep();
        Intrinsics.checkNotNullExpressionValue(resource, "data");
        localRep.saveDataAsList(resource.getData(), ProfileAdress.class, true);
    }
}
