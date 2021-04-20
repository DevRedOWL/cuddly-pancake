package p035ru.unicorn.ujin.data.service.location;

import android.location.Location;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p035ru.unicorn.ujin.data.realm.Point;
import p035ru.unicorn.ujin.data.realm.Points;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.UpdatePointsSession;
import p035ru.unicorn.ujin.data.repository.BaseRemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p046io.reactivex.Flowable;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.schedulers.Schedulers;

/* renamed from: ru.unicorn.ujin.data.service.location.LocationRepository */
public class LocationRepository extends BaseRemoteRepository {
    private static final String BASE_URL = "https://api-product.mysmartflat.ru/api/";

    static /* synthetic */ Iterable lambda$loadPoint$8(List list) throws Exception {
        return list;
    }

    public Flowable<Resource<UpdatePointsSession>> sendLocation(Location location, String str, Double d, Double d2) {
        return getApi().sendGeo(getAppName(), getToken(), str, d.doubleValue(), d2.doubleValue()).onErrorReturn($$Lambda$LocationRepository$EaCTtDu6jYGqLIKsaskdttJG1A.INSTANCE).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<Points>> reloadPoints() {
        return getApi().getAlertPoints(getAppName(), getToken()).map($$Lambda$LocationRepository$q115WkJlKvU3Pc2TfBTGtStno44.INSTANCE).onErrorReturn($$Lambda$LocationRepository$6schXk2GrhGFO_e8cAGhmPdlDDg.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).startWith(Resource.loading());
    }

    public Flowable<Resource<UpdatePointsSession>> updatePoints(Point point, String str) {
        return getApi().updatePoints(getAppName(), point, getToken(), str).onErrorReturn($$Lambda$LocationRepository$WuQtT8kZ4oxLNCkM3yJW0H5IIqQ.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread());
    }

    public Flowable<Void> sendActionCommand(String str) {
        return getApi().sendGeoAction(getAppName(), createQueryMap(str)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread());
    }

    private Map<String, String> createQueryMap(String str) {
        HashMap hashMap = new HashMap();
        for (String str2 : str.split("&")) {
            int indexOf = str2.indexOf("=");
            hashMap.put(str2.substring(0, indexOf), str2.substring(indexOf + 1));
        }
        return hashMap;
    }

    public Flowable<Resource<Void>> sendActionWithId(Integer num) {
        return getApi().sendActionId(getAppName(), getToken(), num.intValue()).retry(3).onErrorReturnItem(Resource.error("Ошибка отправки команды")).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread());
    }

    public Flowable<Resource<Points>> loadPoint() {
        return LocalRepository.getInstance().getData(Point.class).filter($$Lambda$LocationRepository$b4PXLZEYzvHLInADfp9Qp9LQ.INSTANCE).flatMapIterable($$Lambda$LocationRepository$RgeldVWRyWqEDI7kfq86hH4vIWw.INSTANCE).cast(Point.class).toList().map($$Lambda$LocationRepository$ug2SWWPKPtfRn21_BaWWAmZfeWA.INSTANCE).toFlowable().concatWith(getApi().getAlertPoints(getAppName(), getToken()).map($$Lambda$LocationRepository$JZnek83xu5zl7tVgnDrOwoK5bc0.INSTANCE).onErrorReturn($$Lambda$LocationRepository$9LEgRzx7hAYSfyBTWg6C_tI1F8.INSTANCE).doOnNext($$Lambda$LocationRepository$hZAxX7zBDSlDztJUBtdyOCKieoQ.INSTANCE).subscribeOn(Schedulers.m6765io()));
    }

    static /* synthetic */ void lambda$loadPoint$6(Resource resource) throws Exception {
        if (resource.getStatus().equals(Resource.Status.SUCCESS) && resource.getData() != null) {
            LocalRepository.getInstance().saveDataAsList(((Points) resource.getData()).getPoints(), Point.class, true);
        }
    }

    static /* synthetic */ boolean lambda$loadPoint$7(List list) throws Exception {
        return list != null && !list.isEmpty();
    }
}
