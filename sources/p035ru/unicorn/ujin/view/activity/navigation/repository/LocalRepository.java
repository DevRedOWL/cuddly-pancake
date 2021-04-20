package p035ru.unicorn.ujin.view.activity.navigation.repository;

import android.location.Location;
import android.util.Log;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.altbeacon.beacon.Identifier;
import p035ru.unicorn.ujin.data.TokenData;
import p035ru.unicorn.ujin.data.realm.BeaconAction;
import p035ru.unicorn.ujin.data.realm.Point;
import p035ru.unicorn.ujin.data.realm.PushAction;
import p035ru.unicorn.ujin.data.realm.SipParametrs;
import p035ru.unicorn.ujin.data.realm.Wifi;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.data.service.location.FavoriteBeacon;
import p035ru.unicorn.ujin.data.service.location.LocationHelper;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware;
import p035ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.create.BaseLocalRepository;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.device.Devices;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.Rooms;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.section.MoreIconsInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.Options;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.OptionsList;
import p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device;
import p046io.reactivex.BackpressureStrategy;
import p046io.reactivex.Completable;
import p046io.reactivex.Flowable;
import p046io.reactivex.FlowableEmitter;
import p046io.reactivex.FlowableOnSubscribe;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.functions.Function;
import p046io.reactivex.functions.Predicate;
import p046io.reactivex.schedulers.Schedulers;
import p046io.realm.ImportFlag;
import p046io.realm.Realm;
import p046io.realm.RealmModel;
import p046io.realm.RealmObject;
import p046io.realm.RealmQuery;
import p046io.realm.RealmResults;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository */
public class LocalRepository extends BaseLocalRepository {
    private static LocalRepository INSTANCE;

    static /* synthetic */ List lambda$getFavoriteBeacon$45(List list) throws Exception {
        return list;
    }

    static /* synthetic */ List lambda$getHardwareWithLocalScenarioControl$38(List list) throws Exception {
        return list;
    }

    static /* synthetic */ Iterable lambda$null$19(List list) throws Exception {
        return list;
    }

    static /* synthetic */ Iterable lambda$null$40(List list) throws Exception {
        return list;
    }

    static /* synthetic */ Iterable lambda$null$46(List list) throws Exception {
        return list;
    }

    public void close() {
    }

    public static LocalRepository getInstance() {
        if (INSTANCE == null) {
            synchronized (LocalRepository.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LocalRepository();
                }
                INSTANCE = new LocalRepository();
            }
        }
        return INSTANCE;
    }

    private LocalRepository() {
    }

    public Flowable<String> getUserId() {
        return Flowable.just(Realm.getDefaultInstance().where(User.class).findFirst()).map($$Lambda$LocalRepository$TxLDubUZIO9j8XEWPQhy3Ea0aBo.INSTANCE);
    }

    public Flowable<String> getToken() {
        Realm.getDefaultInstance();
        return Flowable.just(Realm.getDefaultInstance().where(User.class).findFirst()).map($$Lambda$NJ_iXlrTw44u6U0CVDT39bHlPhk.INSTANCE);
    }

    public String getTokenString() {
        User user = (User) Realm.getDefaultInstance().where(User.class).findFirst();
        if (user == null) {
            return "";
        }
        return user.getToken();
    }

    public Flowable<Boolean> deleteUser() {
        Realm defaultInstance = Realm.getDefaultInstance();
        defaultInstance.beginTransaction();
        defaultInstance.where(User.class).findAll().deleteAllFromRealm();
        defaultInstance.where(UserProfile.class).findAll().deleteAllFromRealm();
        defaultInstance.commitTransaction();
        return Flowable.just(true);
    }

    public void deleteSipConfig() {
        Realm defaultInstance = Realm.getDefaultInstance();
        defaultInstance.beginTransaction();
        defaultInstance.where(SipParametrs.class).findAll().deleteAllFromRealm();
        defaultInstance.commitTransaction();
        defaultInstance.close();
    }

    public Flowable<Boolean> clearUserData() {
        deleteUser();
        deleteSipConfig();
        return Flowable.just(true);
    }

    public Flowable<SipParametrs> getSipParams(String str) {
        Realm defaultInstance = Realm.getDefaultInstance();
        return defaultInstance.asFlowable().map(new Function(str) {
            private final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return LocalRepository.lambda$getSipParams$1(Realm.this, this.f$1, (Realm) obj);
            }
        }).onErrorResumeNext(Flowable.empty());
    }

    static /* synthetic */ SipParametrs lambda$getSipParams$1(Realm realm, String str, Realm realm2) throws Exception {
        return (SipParametrs) realm.where(SipParametrs.class).equalTo("sipUser", Integer.valueOf(str)).findFirst();
    }

    public Flowable<User> getUser() {
        return Flowable.just(Realm.getDefaultInstance().where(User.class).findFirst());
    }

    public Flowable<List<Hardware>> getHardwareLocaly() {
        Realm defaultInstance = Realm.getDefaultInstance();
        return defaultInstance.where(Hardware.class).findAll().asFlowable().map(new Function() {
            public final Object apply(Object obj) {
                return Realm.this.copyFromRealm((RealmResults) obj);
            }
        }).subscribeOn(AndroidSchedulers.mainThread());
    }

    public Flowable<List<Scenario>> getScenario() {
        Realm defaultInstance = Realm.getDefaultInstance();
        return defaultInstance.where(Scenario.class).findAll().asFlowable().map(new Function() {
            public final Object apply(Object obj) {
                return Realm.this.copyFromRealm((RealmResults) obj);
            }
        }).filter($$Lambda$LocalRepository$_ZkKREC9KC5oQPErJGAjGuC0vs.INSTANCE);
    }

    static /* synthetic */ boolean lambda$getScenario$4(List list) throws Exception {
        return list != null && !list.isEmpty();
    }

    public Flowable<Hardware> getHardwareFlowable(String str) {
        Realm defaultInstance = Realm.getDefaultInstance();
        return defaultInstance.asFlowable().map(new Function(str) {
            private final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final Object apply(Object obj) {
                return LocalRepository.lambda$getHardwareFlowable$5(this.f$0, (Realm) obj);
            }
        }).map(new Function() {
            public final Object apply(Object obj) {
                return LocalRepository.lambda$getHardwareFlowable$6(Realm.this, (Hardware) obj);
            }
        }).subscribeOn(AndroidSchedulers.mainThread());
    }

    static /* synthetic */ Hardware lambda$getHardwareFlowable$5(String str, Realm realm) throws Exception {
        return (Hardware) realm.where(Hardware.class).equalTo("id", str).findFirst();
    }

    static /* synthetic */ Hardware lambda$getHardwareFlowable$6(Realm realm, Hardware hardware) throws Exception {
        return (Hardware) realm.copyFromRealm(hardware);
    }

    public Flowable<Hardware> getHardwareBySerialNumber(String str) {
        Realm defaultInstance = Realm.getDefaultInstance();
        return defaultInstance.asFlowable().map($$Lambda$LocalRepository$UgesgSeATYeb33yLT4tfBH6Hlg.INSTANCE).map(new Function() {
            public final Object apply(Object obj) {
                return LocalRepository.lambda$getHardwareBySerialNumber$8(Realm.this, (Hardware) obj);
            }
        }).filter($$Lambda$LocalRepository$lCvT6awZ1S0ooSg4kA5qHBkqu9k.INSTANCE).subscribeOn(AndroidSchedulers.mainThread());
    }

    static /* synthetic */ Hardware lambda$getHardwareBySerialNumber$7(Realm realm) throws Exception {
        return (Hardware) realm.where(Hardware.class).equalTo("stateText", "Штатный режим").findFirst();
    }

    static /* synthetic */ Hardware lambda$getHardwareBySerialNumber$8(Realm realm, Hardware hardware) throws Exception {
        return (Hardware) realm.copyFromRealm(hardware);
    }

    static /* synthetic */ boolean lambda$getHardwareBySerialNumber$9(Hardware hardware) throws Exception {
        return !hardware.getSignals().isEmpty();
    }

    /* access modifiers changed from: package-private */
    public void closeDB() {
        Realm defaultInstance = Realm.getDefaultInstance();
        if (defaultInstance != null && !defaultInstance.isClosed()) {
            defaultInstance.close();
        }
    }

    public void saveDevice(List<Device> list) {
        Realm defaultInstance = Realm.getDefaultInstance();
        defaultInstance.executeTransaction(new Realm.Transaction(list) {
            private final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            public final void execute(Realm realm) {
                Realm.this.copyToRealmOrUpdate(this.f$1, new ImportFlag[0]);
            }
        });
    }

    public Flowable<List<Device>> getDevice() {
        Realm defaultInstance = Realm.getDefaultInstance();
        return defaultInstance.where(Device.class).findAllAsync().asFlowable().filter($$Lambda$LocalRepository$v7OHAMNYCPUZFK9Q6QEnFRCl0E.INSTANCE).map(new Function() {
            public final Object apply(Object obj) {
                return Realm.this.copyFromRealm((RealmResults) obj);
            }
        }).map($$Lambda$PQem5aKuo6GN2Uvh4lZWGG5oPA.INSTANCE);
    }

    static /* synthetic */ boolean lambda$getDevice$11(RealmResults realmResults) throws Exception {
        return !realmResults.isEmpty();
    }

    public Flowable<List<Hardware>> getHardwareLocalyByName(String str) {
        Realm defaultInstance = Realm.getDefaultInstance();
        return defaultInstance.where(Hardware.class).equalTo("deviceClassTitle", str).findAllAsync().asFlowable().filter($$Lambda$LocalRepository$pt1LL4eQxTXVn7BVpBaQHAVyO0.INSTANCE).map(new Function() {
            public final Object apply(Object obj) {
                return Realm.this.copyFromRealm((RealmResults) obj);
            }
        }).map($$Lambda$PQem5aKuo6GN2Uvh4lZWGG5oPA.INSTANCE);
    }

    static /* synthetic */ boolean lambda$getHardwareLocalyByName$13(RealmResults realmResults) throws Exception {
        return !realmResults.isEmpty();
    }

    public Flowable<List<Hardware>> getHardwareFlowable() {
        return Flowable.create($$Lambda$LocalRepository$_a4SBRRa1gDAylgbFtC3SgF6tnc.INSTANCE, BackpressureStrategy.BUFFER);
    }

    static /* synthetic */ void lambda$getHardwareFlowable$15(FlowableEmitter flowableEmitter) throws Exception {
        Realm defaultInstance = Realm.getDefaultInstance();
        try {
            if (!flowableEmitter.isCancelled()) {
                defaultInstance = Realm.getDefaultInstance();
                flowableEmitter.onNext(defaultInstance.copyFromRealm(defaultInstance.where(Hardware.class).findAll()));
                flowableEmitter.onComplete();
                defaultInstance.close();
            }
            if (defaultInstance.isClosed()) {
                return;
            }
        } catch (Exception e) {
            flowableEmitter.onError(e);
            if (defaultInstance.isClosed()) {
                return;
            }
        } catch (Throwable th) {
            if (!defaultInstance.isClosed()) {
                defaultInstance.close();
            }
            throw th;
        }
        defaultInstance.close();
    }

    public Flowable<List<Hardware>> getHardware() {
        return Flowable.create($$Lambda$LocalRepository$WS6WadgB4Pxe0t0RZz1FB7aqQDs.INSTANCE, BackpressureStrategy.BUFFER);
    }

    static /* synthetic */ void lambda$getHardware$16(FlowableEmitter flowableEmitter) throws Exception {
        Realm defaultInstance = Realm.getDefaultInstance();
        try {
            if (!flowableEmitter.isCancelled()) {
                flowableEmitter.onNext(defaultInstance.copyFromRealm(defaultInstance.where(Hardware.class).findAll()));
                flowableEmitter.onComplete();
            }
        } catch (Exception e) {
            flowableEmitter.onError(e);
        } catch (Throwable th) {
            defaultInstance.close();
            throw th;
        }
        defaultInstance.close();
    }

    public Flowable<List<Hardware>> getHardwareByRoomId(String str, String str2) {
        Realm defaultInstance = Realm.getDefaultInstance();
        return defaultInstance.where(Hardware.class).findAllAsync().asFlowable().filter($$Lambda$LocalRepository$zxBeTHx_T0ap2R84kvEgNnsAVI4.INSTANCE).map(new Function() {
            public final Object apply(Object obj) {
                return Realm.this.copyFromRealm((RealmResults) obj);
            }
        }).flatMap(new Function(str2, str) {
            private final /* synthetic */ String f$0;
            private final /* synthetic */ String f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return Flowable.fromArray((List) obj).flatMapIterable($$Lambda$LocalRepository$LsfJa4vZxNeqg7PSvGNTnVkAM.INSTANCE).filter(new Predicate(this.f$0) {
                    private final /* synthetic */ String f$0;

                    {
                        this.f$0 = r1;
                    }

                    public final boolean test(Object obj) {
                        return LocalRepository.lambda$null$20(this.f$0, (Hardware) obj);
                    }
                }).filter(new Predicate(this.f$1) {
                    private final /* synthetic */ String f$0;

                    {
                        this.f$0 = r1;
                    }

                    public final boolean test(Object obj) {
                        return LocalRepository.lambda$null$21(this.f$0, (Hardware) obj);
                    }
                }).toList().toFlowable();
            }
        });
    }

    static /* synthetic */ boolean lambda$getHardwareByRoomId$17(RealmResults realmResults) throws Exception {
        return !realmResults.isEmpty();
    }

    static /* synthetic */ boolean lambda$null$20(String str, Hardware hardware) throws Exception {
        if (str.contains(Hardware.ALL) || str.contains(Hardware.LABEL_FILTER_ALL)) {
            return !hardware.getDeviceClassTitle().equals("");
        }
        return hardware.getDeviceClassTitle().equals(str);
    }

    static /* synthetic */ boolean lambda$null$21(String str, Hardware hardware) throws Exception {
        if (str.contains(Rooms.ALL_ROOM)) {
            return !hardware.getDeviceClassTitle().toLowerCase().equals("");
        }
        return hardware.getRoomInfo().getTitle().toLowerCase().equals(str);
    }

    public Flowable<List<Rooms>> getRoomByTitle(String str) {
        Realm defaultInstance = Realm.getDefaultInstance();
        return defaultInstance.where(Rooms.class).equalTo("title", str).findAllAsync().asFlowable().map(new Function() {
            public final Object apply(Object obj) {
                return Realm.this.copyFromRealm((RealmResults) obj);
            }
        }).subscribeOn(AndroidSchedulers.mainThread());
    }

    public Flowable<List<MoreIconsInfo>> getIcons() {
        return Flowable.create($$Lambda$LocalRepository$EUkIogwKnATfkTRpl9UoXrFqjYo.INSTANCE, BackpressureStrategy.BUFFER);
    }

    static /* synthetic */ void lambda$getIcons$24(FlowableEmitter flowableEmitter) throws Exception {
        Realm defaultInstance = Realm.getDefaultInstance();
        try {
            if (!flowableEmitter.isCancelled()) {
                flowableEmitter.onNext(defaultInstance.copyFromRealm(defaultInstance.where(MoreIconsInfo.class).findAll()));
                flowableEmitter.onComplete();
            }
        } catch (Exception e) {
            flowableEmitter.onError(e);
        } catch (Throwable th) {
            defaultInstance.close();
            throw th;
        }
        defaultInstance.close();
    }

    public Flowable<List<Rooms>> getRooms() {
        return Flowable.create($$Lambda$LocalRepository$U_YwXUUJ3PPXJjzhkmq8b2v4Flg.INSTANCE, BackpressureStrategy.BUFFER);
    }

    static /* synthetic */ void lambda$getRooms$25(FlowableEmitter flowableEmitter) throws Exception {
        try {
            if (!flowableEmitter.isCancelled()) {
                Log.d("TAG", "TREAD " + Thread.currentThread().getName());
                Realm defaultInstance = Realm.getDefaultInstance();
                flowableEmitter.onNext(defaultInstance.copyFromRealm(defaultInstance.where(Rooms.class).findAll()));
                flowableEmitter.onComplete();
                defaultInstance.close();
            }
        } catch (Exception e) {
            flowableEmitter.onError(e);
        }
    }

    public Flowable<List<Options>> getScenarioOptionsById(int i) {
        return Flowable.create(new FlowableOnSubscribe(i) {
            private final /* synthetic */ int f$0;

            {
                this.f$0 = r1;
            }

            public final void subscribe(FlowableEmitter flowableEmitter) {
                LocalRepository.lambda$getScenarioOptionsById$26(this.f$0, flowableEmitter);
            }
        }, BackpressureStrategy.BUFFER);
    }

    static /* synthetic */ void lambda$getScenarioOptionsById$26(int i, FlowableEmitter flowableEmitter) throws Exception {
        try {
            if (!flowableEmitter.isCancelled()) {
                Log.d("TAG", "TREAD " + Thread.currentThread().getName());
                Realm defaultInstance = Realm.getDefaultInstance();
                List<E> copyFromRealm = defaultInstance.copyFromRealm(defaultInstance.where(OptionsList.class).equalTo("scenarioId", Integer.valueOf(i)).findAll());
                if (copyFromRealm.size() > 0) {
                    flowableEmitter.onNext(((OptionsList) copyFromRealm.get(0)).getList());
                } else {
                    flowableEmitter.onNext(Collections.emptyList());
                }
                flowableEmitter.onComplete();
                defaultInstance.close();
            }
        } catch (Exception e) {
            flowableEmitter.onError(e);
        }
    }

    public Flowable<Intellect> getIntellect() {
        Realm defaultInstance = Realm.getDefaultInstance();
        Intellect intellect = (Intellect) defaultInstance.where(Intellect.class).findFirst();
        if (intellect != null) {
            return Flowable.just(defaultInstance.copyFromRealm(intellect));
        }
        return Flowable.just(new Intellect(1, 1));
    }

    public Flowable<Schemas> getSchema() {
        Realm defaultInstance = Realm.getDefaultInstance();
        Schemas schemas = (Schemas) defaultInstance.where(Schemas.class).findFirst();
        defaultInstance.where(Schemas.class).findAll();
        if (schemas != null) {
            return Flowable.just(defaultInstance.copyFromRealm(schemas));
        }
        return Flowable.just(new Schemas());
    }

    public List<Devices> getDeviceTokenById(Long l) {
        Realm defaultInstance = Realm.getDefaultInstance();
        RealmResults<E> findAll = defaultInstance.where(Devices.class).equalTo("serialNumber", l.toString()).findAll();
        if (findAll == null || findAll.isEmpty()) {
            return null;
        }
        return defaultInstance.copyFromRealm(findAll);
    }

    public void saveDataOrUpdate(RealmObject realmObject) {
        Completable.fromCallable(new Callable() {
            public final Object call() {
                return LocalRepository.lambda$saveDataOrUpdate$28(RealmObject.this);
            }
        }).subscribeOn(Schedulers.m6765io()).subscribe();
    }

    /* JADX INFO: finally extract failed */
    static /* synthetic */ Object lambda$saveDataOrUpdate$28(RealmObject realmObject) throws Exception {
        Realm defaultInstance = Realm.getDefaultInstance();
        try {
            defaultInstance.executeTransaction(new Realm.Transaction(realmObject) {
                private final /* synthetic */ RealmObject f$1;

                {
                    this.f$1 = r2;
                }

                public final void execute(Realm realm) {
                    Realm.this.copyToRealmOrUpdate(this.f$1, new ImportFlag[0]);
                }
            });
            defaultInstance.close();
            return Completable.complete();
        } catch (Throwable th) {
            defaultInstance.close();
            throw th;
        }
    }

    public void saveListOrUpdate(List<RealmObject> list, Class<? extends RealmModel> cls) {
        Completable.fromCallable(new Callable(cls, list) {
            private final /* synthetic */ Class f$0;
            private final /* synthetic */ List f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final Object call() {
                return LocalRepository.lambda$saveListOrUpdate$30(this.f$0, this.f$1);
            }
        }).subscribeOn(Schedulers.m6765io()).subscribe();
    }

    /* JADX INFO: finally extract failed */
    static /* synthetic */ Object lambda$saveListOrUpdate$30(Class cls, List list) throws Exception {
        Realm defaultInstance = Realm.getDefaultInstance();
        try {
            defaultInstance.executeTransaction(new Realm.Transaction(cls, list) {
                private final /* synthetic */ Class f$1;
                private final /* synthetic */ List f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void execute(Realm realm) {
                    LocalRepository.lambda$null$29(Realm.this, this.f$1, this.f$2, realm);
                }
            });
            defaultInstance.close();
            return Completable.complete();
        } catch (Throwable th) {
            defaultInstance.close();
            throw th;
        }
    }

    static /* synthetic */ void lambda$null$29(Realm realm, Class cls, List list, Realm realm2) {
        realm.delete(cls);
        realm.copyToRealmOrUpdate(list, new ImportFlag[0]);
    }

    public void saveData(RealmObject realmObject, Class<? extends RealmModel> cls, boolean z) {
        Completable.fromCallable(new Callable(z, cls, realmObject) {
            private final /* synthetic */ boolean f$0;
            private final /* synthetic */ Class f$1;
            private final /* synthetic */ RealmObject f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final Object call() {
                return LocalRepository.lambda$saveData$32(this.f$0, this.f$1, this.f$2);
            }
        }).subscribeOn(Schedulers.m6765io()).subscribe();
    }

    static /* synthetic */ Object lambda$saveData$32(boolean z, Class cls, RealmObject realmObject) throws Exception {
        Realm defaultInstance = Realm.getDefaultInstance();
        if (z) {
            try {
                defaultInstance.beginTransaction();
                defaultInstance.delete(cls);
                defaultInstance.commitTransaction();
            } catch (Exception e) {
                e.printStackTrace();
                for (StackTraceElement println : Thread.currentThread().getStackTrace()) {
                    System.out.println(println);
                }
            } catch (Throwable th) {
                defaultInstance.close();
                throw th;
            }
        }
        defaultInstance.executeTransaction(new Realm.Transaction(realmObject) {
            private final /* synthetic */ RealmObject f$1;

            {
                this.f$1 = r2;
            }

            public final void execute(Realm realm) {
                LocalRepository.lambda$null$31(Realm.this, this.f$1, realm);
            }
        });
        defaultInstance.close();
        return Completable.complete();
    }

    static /* synthetic */ void lambda$null$31(Realm realm, RealmObject realmObject, Realm realm2) {
        RealmObject realmObject2 = (RealmObject) realm.copyToRealm(realmObject, new ImportFlag[0]);
    }

    public void removeData(Class<? extends RealmModel> cls) {
        Completable.fromCallable(new Callable(cls) {
            private final /* synthetic */ Class f$0;

            {
                this.f$0 = r1;
            }

            public final Object call() {
                return LocalRepository.lambda$removeData$33(this.f$0);
            }
        }).subscribeOn(Schedulers.m6765io()).subscribe();
    }

    static /* synthetic */ Object lambda$removeData$33(Class cls) throws Exception {
        Realm defaultInstance = Realm.getDefaultInstance();
        try {
            defaultInstance.beginTransaction();
            defaultInstance.delete(cls);
            defaultInstance.commitTransaction();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            defaultInstance.close();
            throw th;
        }
        defaultInstance.close();
        return Completable.complete();
    }

    public void saveDataAsList(List<? extends RealmObject> list, Class<? extends RealmModel> cls, boolean z) {
        Completable.fromCallable(new Callable(cls, z, list) {
            private final /* synthetic */ Class f$0;
            private final /* synthetic */ boolean f$1;
            private final /* synthetic */ List f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final Object call() {
                return LocalRepository.lambda$saveDataAsList$35(this.f$0, this.f$1, this.f$2);
            }
        }).subscribeOn(Schedulers.m6765io()).subscribe();
    }

    static /* synthetic */ Object lambda$saveDataAsList$35(Class cls, boolean z, List list) throws Exception {
        Realm defaultInstance = Realm.getDefaultInstance();
        Log.d("TAG", "XXX saveDataAsList " + cls + z + " " + list);
        if (z && list != null) {
            Log.d("TAG", "XXX saveDataAsList delete " + cls);
            defaultInstance.beginTransaction();
            defaultInstance.delete(cls);
            defaultInstance.commitTransaction();
        }
        if (list != null) {
            defaultInstance.executeTransaction(new Realm.Transaction(list) {
                private final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void execute(Realm realm) {
                    Realm.this.copyToRealmOrUpdate(this.f$1, new ImportFlag[0]);
                }
            });
        }
        defaultInstance.close();
        return Completable.complete();
    }

    public Flowable<Boolean> hasAccount() {
        return Flowable.defer(new Callable() {
            public final Object call() {
                return Flowable.just(Long.valueOf(Realm.this.where(User.class).count())).map($$Lambda$LocalRepository$JJ9MuNr16_w1SJ7nvj7cU_YdQmE.INSTANCE);
            }
        });
    }

    static /* synthetic */ Boolean lambda$null$36(Long l) throws Exception {
        return Boolean.valueOf(l.longValue() > 0);
    }

    public Flowable<List<Hardware>> getHardwareWithLocalScenarioControl() {
        return getData(Hardware.class).map($$Lambda$LocalRepository$hY0llh6DS6LVZPP4VF3HIjZG8_4.INSTANCE).filter($$Lambda$LocalRepository$AUHtCgQ7qVHELT9dyxtid7rFHcA.INSTANCE).flatMap($$Lambda$LocalRepository$CgfDzIJcjZskviQbDKvft6QcfE.INSTANCE);
    }

    static /* synthetic */ boolean lambda$getHardwareWithLocalScenarioControl$39(List list) throws Exception {
        return !list.isEmpty();
    }

    static /* synthetic */ boolean lambda$null$41(Hardware hardware) throws Exception {
        return hardware.getToken() != null;
    }

    public Flowable saveAlarmPoints(List<Point> list) {
        Realm defaultInstance = Realm.getDefaultInstance();
        defaultInstance.executeTransactionAsync(new Realm.Transaction(list) {
            private final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            public final void execute(Realm realm) {
                LocalRepository.lambda$saveAlarmPoints$43(Realm.this, this.f$1, realm);
            }
        });
        return Flowable.empty();
    }

    static /* synthetic */ void lambda$saveAlarmPoints$43(Realm realm, List list, Realm realm2) {
        realm.where(BeaconAction.class).findAll().deleteAllFromRealm();
        realm.copyToRealmOrUpdate(list, new ImportFlag[0]);
    }

    public boolean isHomeID(String str) {
        return !getWifiById(str).isEmpty();
    }

    private RealmResults<Wifi> getWifiById(String str) {
        return Realm.getDefaultInstance().where(Wifi.class).contains("bssid", str).notEqualTo("levelIn", (Integer) 0).notEqualTo("levelOut", (Integer) 0).findAll();
    }

    public List<Location> getGeofence() {
        RealmQuery<E> where = Realm.getDefaultInstance().where(Point.class);
        Double valueOf = Double.valueOf(Utils.DOUBLE_EPSILON);
        RealmResults<E> findAll = where.notEqualTo("longitude", valueOf).notEqualTo("latitude", valueOf).isNotNull("longitude").isNotNull("latitude").findAll();
        if (findAll.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < findAll.size(); i++) {
            Double valueOf2 = Double.valueOf(findAll.get(i) != null ? ((Point) findAll.get(i)).getLongitude().doubleValue() : 0.0d);
            Double valueOf3 = Double.valueOf(findAll.get(i) != null ? ((Point) findAll.get(i)).getLatitude().doubleValue() : 0.0d);
            if (LocationHelper.hasLocation((Point) findAll.get(i))) {
                Location location = new Location("");
                location.setLongitude(valueOf2.doubleValue());
                location.setLatitude(valueOf3.doubleValue());
                arrayList.add(location);
            }
        }
        return arrayList;
    }

    public List<Point> getBeacon() {
        Realm defaultInstance = Realm.getDefaultInstance();
        RealmResults<E> findAll = defaultInstance.where(Point.class).equalTo("isBeaconEnable", (Integer) 1).findAll();
        if (findAll == null || findAll.isEmpty()) {
            return Collections.emptyList();
        }
        return defaultInstance.copyFromRealm(findAll);
    }

    public PushAction getActionByID(Identifier identifier) {
        return new PushAction();
    }

    public Flowable<List<FavoriteBeacon>> getFavoriteBeacon() {
        return getData(FavoriteBeacon.class).filter($$Lambda$LocalRepository$Z4kDYZcyzjEUGXcCUsh0vsqdec.INSTANCE).map($$Lambda$LocalRepository$muK6TaNTTxcyumZgKMjdUJfJQE.INSTANCE);
    }

    static /* synthetic */ boolean lambda$getFavoriteBeacon$44(List list) throws Exception {
        return list != null && !list.isEmpty();
    }

    public Flowable<Boolean> isFavoriteBeacon(int i) {
        return getFavoriteBeacon().flatMap(new Function(i) {
            private final /* synthetic */ int f$0;

            {
                this.f$0 = r1;
            }

            public final Object apply(Object obj) {
                return Flowable.fromArray((List) obj).flatMapIterable($$Lambda$LocalRepository$LkIhMr4qzKa0fE9WbDQoFseVNo.INSTANCE).map(new Function(this.f$0) {
                    private final /* synthetic */ int f$0;

                    {
                        this.f$0 = r1;
                    }

                    public final Object apply(Object obj) {
                        return LocalRepository.lambda$null$47(this.f$0, (FavoriteBeacon) obj);
                    }
                });
            }
        });
    }

    static /* synthetic */ Boolean lambda$null$47(int i, FavoriteBeacon favoriteBeacon) throws Exception {
        return Boolean.valueOf(favoriteBeacon.getId() == i);
    }

    public void saveUserToken(TokenData tokenData) {
        Realm.getDefaultInstance().executeTransaction(new Realm.Transaction() {
            public final void execute(Realm realm) {
                LocalRepository.lambda$saveUserToken$49(TokenData.this, realm);
            }
        });
    }

    static /* synthetic */ void lambda$saveUserToken$49(TokenData tokenData, Realm realm) {
        User user = (User) realm.where(User.class).findFirst();
        if (user != null && tokenData != null && tokenData.getToken() != null) {
            user.setToken(tokenData.getToken());
            realm.insertOrUpdate((RealmModel) user);
        }
    }

    public void delete(Class<? extends RealmModel> cls) {
        Realm.getDefaultInstance().executeTransaction(new Realm.Transaction(cls) {
            private final /* synthetic */ Class f$0;

            {
                this.f$0 = r1;
            }

            public final void execute(Realm realm) {
                realm.delete(this.f$0);
            }
        });
    }

    public void getBleReaderBySerialNumber(Class<? extends RealmModel> cls) {
        Realm.getDefaultInstance().executeTransaction(new Realm.Transaction(cls) {
            private final /* synthetic */ Class f$0;

            {
                this.f$0 = r1;
            }

            public final void execute(Realm realm) {
                realm.delete(this.f$0);
            }
        });
    }
}
