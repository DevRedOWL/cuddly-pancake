package p035ru.unicorn.ujin.ble;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.MainApplication;
import p035ru.unicorn.ujin.ble.data.BleData;
import p035ru.unicorn.ujin.ble.data.BleDataKt;
import p035ru.unicorn.ujin.ble.data.BleKeyData;
import p035ru.unicorn.ujin.ble.data.BleReader;
import p035ru.unicorn.ujin.ble.data.PASS_TYPE;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.repository.BaseRemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p046io.reactivex.Flowable;
import p046io.reactivex.Maybe;
import p046io.reactivex.Single;
import p046io.reactivex.schedulers.Schedulers;
import p046io.realm.RealmModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004J\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0005\u0018\u00010\u0004J\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\fJ\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\nJ\u0014\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00150\u0004¨\u0006\u0017"}, mo51343d2 = {"Lru/unicorn/ujin/ble/BleRepo;", "Lru/unicorn/ujin/data/repository/BaseRemoteRepository;", "()V", "loadAllBle", "Lio/reactivex/Flowable;", "", "Lru/unicorn/ujin/ble/data/BleReader;", "loadAssignBleKey", "Lru/unicorn/ujin/ble/data/BleKeyData;", "loadBleByInterfaceType", "Lio/reactivex/Single;", "type", "", "loadBleBySn", "Lio/reactivex/Maybe;", "sn", "", "loadBleKey", "deviceClass", "loadGateReader", "loadMyPassDevice", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/ble/data/BleData;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.ble.BleRepo */
/* compiled from: BleRepo.kt */
public final class BleRepo extends BaseRemoteRepository {
    public final Flowable<Resource<BleData>> loadMyPassDevice() {
        SharedPreferences sharedPreferences;
        Context context = MainApplication.mContext;
        String str = null;
        if (!(context == null || (sharedPreferences = context.getSharedPreferences(context.getString(R.string.app_name_app), 0)) == null)) {
            str = sharedPreferences.getString(getToken(), (String) null);
        }
        Flowable<R> subscribeOn = getApi().getMyPassDevice(BleDataKt.UNIVERSAL_TYPE, getToken(), str).map(BleRepo$loadMyPassDevice$1.INSTANCE).doOnNext(BleRepo$loadMyPassDevice$2.INSTANCE).onErrorReturn(BleRepo$loadMyPassDevice$3.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getMyPassDevice(UNIV…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<List<BleReader>> loadAllBle() {
        Flowable<List<U>> onErrorReturn = LocalRepository.getInstance().getData(BleReader.class).flatMapIterable(BleRepo$loadAllBle$1.INSTANCE).cast(BleReader.class).toList().toFlowable().onErrorReturn(BleRepo$loadAllBle$2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(onErrorReturn, "LocalRepository\n        …eturn { mutableListOf() }");
        return onErrorReturn;
    }

    public final Maybe<BleReader> loadBleBySn(long j) {
        Flowable<? extends RealmModel> elementById;
        Maybe<? extends RealmModel> firstElement;
        Maybe<? extends RealmModel> filter;
        LocalRepository instance = LocalRepository.getInstance();
        if (instance == null || (elementById = instance.getElementById((Class<? extends RealmModel>) BleReader.class, Long.valueOf(j), "serialNumber")) == null || (firstElement = elementById.firstElement()) == null || (filter = firstElement.filter(BleRepo$loadBleBySn$1.INSTANCE)) == null) {
            return null;
        }
        return filter.cast(BleReader.class);
    }

    public final Single<List<BleReader>> loadBleByInterfaceType(String str) {
        Intrinsics.checkNotNullParameter(str, "type");
        Single<List<U>> onErrorReturn = loadAllBle().flatMapIterable(BleRepo$loadBleByInterfaceType$1.INSTANCE).filter(new BleRepo$loadBleByInterfaceType$2(str)).toList().onErrorReturn(BleRepo$loadBleByInterfaceType$3.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(onErrorReturn, "loadAllBle()\n           …eturn { mutableListOf() }");
        return onErrorReturn;
    }

    public final Single<List<BleReader>> loadGateReader() {
        Single<List<U>> onErrorReturn = loadBleByInterfaceType(PASS_TYPE.BLE.getType()).toFlowable().flatMapIterable(BleRepo$loadGateReader$1.INSTANCE).filter(BleRepo$loadGateReader$2.INSTANCE).toList().onErrorReturn(BleRepo$loadGateReader$3.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(onErrorReturn, "loadBleByInterfaceType(P…eturn { mutableListOf() }");
        return onErrorReturn;
    }

    public final Maybe<BleKeyData> loadBleKey(String str) {
        Maybe<? extends RealmModel> firstElement;
        Maybe<? extends RealmModel> filter;
        Intrinsics.checkNotNullParameter(str, "deviceClass");
        Flowable<? extends RealmModel> elementById = LocalRepository.getInstance().getElementById((Class<? extends RealmModel>) BleKeyData.class, str, "deviceClass");
        if (elementById == null || (firstElement = elementById.firstElement()) == null || (filter = firstElement.filter(BleRepo$loadBleKey$1.INSTANCE)) == null) {
            return null;
        }
        return filter.cast(BleKeyData.class);
    }

    public final Flowable<List<BleKeyData>> loadAssignBleKey() {
        Flowable<U> flatMapIterable;
        Flowable<U> cast;
        Single<List<U>> list;
        Single<List<U>> onErrorReturn;
        Flowable<List<? extends RealmModel>> allElementByQuery = LocalRepository.getInstance().getAllElementByQuery(BleKeyData.class, 1L, "keyAssign");
        if (allElementByQuery == null || (flatMapIterable = allElementByQuery.flatMapIterable(BleRepo$loadAssignBleKey$1.INSTANCE)) == null || (cast = flatMapIterable.cast(BleKeyData.class)) == null || (list = cast.toList()) == null || (onErrorReturn = list.onErrorReturn(BleRepo$loadAssignBleKey$2.INSTANCE)) == null) {
            return null;
        }
        return onErrorReturn.toFlowable();
    }
}
