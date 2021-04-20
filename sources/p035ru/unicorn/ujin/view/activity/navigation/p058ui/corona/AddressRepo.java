package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.reactivestreams.Publisher;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.repository.BaseRemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdressOut;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p046io.reactivex.Flowable;
import p046io.reactivex.schedulers.Schedulers;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\t2\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\tJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\tJ\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\tR\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/corona/AddressRepo;", "Lru/unicorn/ujin/data/repository/BaseRemoteRepository;", "()V", "localRep", "Lru/unicorn/ujin/view/activity/navigation/repository/LocalRepository;", "kotlin.jvm.PlatformType", "getLocalRep", "()Lru/unicorn/ujin/view/activity/navigation/repository/LocalRepository;", "createAddress", "Lio/reactivex/Flowable;", "Lru/unicorn/ujin/data/realm/Resource;", "", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/ProfileAdress;", "adress", "", "getListAdressAny", "listAddressLocal", "listAdressRemote", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.AddressRepo */
/* compiled from: AddressRepo.kt */
public final class AddressRepo extends BaseRemoteRepository {
    private final LocalRepository localRep = LocalRepository.getInstance();

    public final LocalRepository getLocalRep() {
        return this.localRep;
    }

    public final Flowable<Resource<List<ProfileAdress>>> getListAdressAny() {
        Flowable<R> map = listAddressLocal().map(AddressRepo$getListAdressAny$local$1.INSTANCE);
        Flowable<Resource<List<ProfileAdress>>> doOnNext = listAdressRemote().filter(AddressRepo$getListAdressAny$remote$1.INSTANCE).doOnNext(new AddressRepo$getListAdressAny$remote$2(this));
        Intrinsics.checkNotNullExpressionValue(doOnNext, "listAdressRemote()\n     …ress::class.java, true) }");
        Flowable<R> startWith = map.mergeWith((Publisher<? extends R>) doOnNext).startWith(Resource.loading());
        Intrinsics.checkNotNullExpressionValue(startWith, "local\n                .m…tWith(Resource.loading())");
        return startWith;
    }

    public final Flowable<List<ProfileAdress>> listAddressLocal() {
        Flowable<List<U>> flowable = this.localRep.getData(ProfileAdress.class).flatMapIterable(AddressRepo$listAddressLocal$1.INSTANCE).map(AddressRepo$listAddressLocal$2.INSTANCE).cast(ProfileAdress.class).toList().toFlowable();
        Intrinsics.checkNotNullExpressionValue(flowable, "localRep.getData(Profile…   .toList().toFlowable()");
        return flowable;
    }

    public final Flowable<Resource<List<ProfileAdress>>> listAdressRemote() {
        Flowable<R> subscribeOn = getApi().getListAdress(getToken()).map(AddressRepo$listAdressRemote$1.INSTANCE).onErrorReturn(AddressRepo$listAdressRemote$2.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getListAdress(getTok…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<List<ProfileAdress>>> createAddress(String str) {
        Intrinsics.checkNotNullParameter(str, "adress");
        Flowable<R> subscribeOn = getApi().createAdress(getToken(), new ProfileAdressOut(str)).map(AddressRepo$createAddress$1.INSTANCE).onErrorReturn(AddressRepo$createAddress$2.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.createAdress(getToke…scribeOn(Schedulers.io())");
        return subscribeOn;
    }
}
