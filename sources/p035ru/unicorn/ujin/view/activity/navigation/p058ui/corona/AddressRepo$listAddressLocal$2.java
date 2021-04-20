package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p046io.reactivex.functions.Function;
import p046io.realm.RealmModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "Lio/realm/RealmModel;", "kotlin.jvm.PlatformType", "data", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.AddressRepo$listAddressLocal$2 */
/* compiled from: AddressRepo.kt */
final class AddressRepo$listAddressLocal$2<T, R> implements Function<RealmModel, RealmModel> {
    public static final AddressRepo$listAddressLocal$2 INSTANCE = new AddressRepo$listAddressLocal$2();

    AddressRepo$listAddressLocal$2() {
    }

    public final RealmModel apply(RealmModel realmModel) {
        Intrinsics.checkNotNullParameter(realmModel, "data");
        return realmModel;
    }
}
