package p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.create;

import android.util.Log;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p046io.reactivex.BackpressureStrategy;
import p046io.reactivex.Completable;
import p046io.reactivex.CompletableEmitter;
import p046io.reactivex.Flowable;
import p046io.reactivex.FlowableEmitter;
import p046io.reactivex.FlowableOnSubscribe;
import p046io.reactivex.schedulers.Schedulers;
import p046io.realm.ImportFlag;
import p046io.realm.Realm;
import p046io.realm.RealmModel;
import p046io.realm.RealmObject;
import p046io.realm.RealmResults;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.create.BaseLocalRepository */
public abstract class BaseLocalRepository {
    public Realm realm;

    static /* synthetic */ boolean lambda$getDataSimple$14(RealmResults realmResults) throws Exception {
        return realmResults != null;
    }

    static /* synthetic */ boolean lambda$getFistElementSimple$11(RealmResults realmResults) throws Exception {
        return realmResults != null;
    }

    public void saveDataOrUpdate(RealmObject realmObject) {
        saveDataOrUpdate((List<? extends RealmObject>) Collections.singletonList(realmObject));
    }

    public void saveDataOrUpdate(List<? extends RealmObject> list) {
        Completable.fromCallable(new Callable(list) {
            private final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final Object call() {
                return BaseLocalRepository.lambda$saveDataOrUpdate$1(this.f$0);
            }
        }).subscribeOn(Schedulers.m6765io()).subscribe();
    }

    static /* synthetic */ Object lambda$saveDataOrUpdate$1(List list) throws Exception {
        Realm defaultInstance = Realm.getDefaultInstance();
        try {
            defaultInstance.executeTransaction(new Realm.Transaction(list, defaultInstance) {
                private final /* synthetic */ List f$0;
                private final /* synthetic */ Realm f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void execute(Realm realm) {
                    BaseLocalRepository.lambda$null$0(this.f$0, this.f$1, realm);
                }
            });
        } catch (Exception e) {
            Log.e("TAG", "XXX SAVE Data ERROR " + e.getMessage());
        } catch (Throwable th) {
            defaultInstance.close();
            throw th;
        }
        defaultInstance.close();
        return Completable.complete();
    }

    static /* synthetic */ void lambda$null$0(List list, Realm realm2, Realm realm3) {
        if (list != null && !list.isEmpty()) {
            realm2.copyToRealmOrUpdate(list, new ImportFlag[0]);
            Log.d("TAG", "XXX SAVE Data " + list.getClass() + " size ");
        }
    }

    public void saveData(RealmObject realmObject, Class<? extends RealmModel> cls, boolean z) {
        Completable.fromCallable(new Callable(z, cls) {
            private final /* synthetic */ boolean f$1;
            private final /* synthetic */ Class f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final Object call() {
                return BaseLocalRepository.lambda$saveData$3(RealmObject.this, this.f$1, this.f$2);
            }
        }).subscribeOn(Schedulers.m6765io()).subscribe();
    }

    static /* synthetic */ Object lambda$saveData$3(RealmObject realmObject, boolean z, Class cls) throws Exception {
        if (realmObject == null) {
            return Completable.complete();
        }
        Realm defaultInstance = Realm.getDefaultInstance();
        if (z) {
            try {
                defaultInstance.beginTransaction();
                defaultInstance.delete(cls);
                defaultInstance.commitTransaction();
            } catch (Throwable th) {
                defaultInstance.close();
                throw th;
            }
        }
        Log.d("TAG", "XXX SAVE Data " + cls.getCanonicalName() + " size ");
        defaultInstance.executeTransaction(new Realm.Transaction(realmObject) {
            private final /* synthetic */ RealmObject f$1;

            {
                this.f$1 = r2;
            }

            public final void execute(Realm realm) {
                BaseLocalRepository.lambda$null$2(Realm.this, this.f$1, realm);
            }
        });
        defaultInstance.close();
        return Completable.complete();
    }

    static /* synthetic */ void lambda$null$2(Realm realm2, RealmObject realmObject, Realm realm3) {
        RealmObject realmObject2 = (RealmObject) realm2.copyToRealm(realmObject, new ImportFlag[0]);
    }

    public void saveDataAsList(List<? extends RealmObject> list, Class<? extends RealmModel> cls, boolean z) {
        Completable.fromCallable(new Callable(z, cls, list) {
            private final /* synthetic */ boolean f$0;
            private final /* synthetic */ Class f$1;
            private final /* synthetic */ List f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final Object call() {
                return BaseLocalRepository.lambda$saveDataAsList$5(this.f$0, this.f$1, this.f$2);
            }
        }).subscribeOn(Schedulers.m6765io()).subscribe();
    }

    static /* synthetic */ Object lambda$saveDataAsList$5(boolean z, Class cls, List list) throws Exception {
        Realm defaultInstance = Realm.getDefaultInstance();
        if (z) {
            defaultInstance.beginTransaction();
            defaultInstance.delete(cls);
            defaultInstance.commitTransaction();
        }
        if (list != null) {
            Log.d("TAG", "XXX SAVE Data " + cls + " size " + list.size());
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
                return Flowable.just(Long.valueOf(Realm.this.where(User.class).count())).map($$Lambda$BaseLocalRepository$K7VxGUKwL9kTSFFilqNVwuiISI.INSTANCE);
            }
        });
    }

    static /* synthetic */ Boolean lambda$null$6(Long l) throws Exception {
        return Boolean.valueOf(l.longValue() > 0);
    }

    public void close() {
        Realm realm2 = this.realm;
        if (realm2 != null && !realm2.isClosed()) {
            this.realm.close();
        }
    }

    public <T extends RealmModel> T getFirstOrNull(Class<? extends RealmModel> cls) {
        Realm defaultInstance = Realm.getDefaultInstance();
        RealmModel realmModel = (RealmModel) defaultInstance.where(cls).findFirst();
        if (realmModel != null) {
            return defaultInstance.copyFromRealm(realmModel);
        }
        return null;
    }

    public Flowable<? extends RealmModel> getFistElement(Class<? extends RealmModel> cls) {
        return Flowable.create(new FlowableOnSubscribe(cls) {
            private final /* synthetic */ Class f$0;

            {
                this.f$0 = r1;
            }

            public final void subscribe(FlowableEmitter flowableEmitter) {
                BaseLocalRepository.lambda$getFistElement$8(this.f$0, flowableEmitter);
            }
        }, BackpressureStrategy.BUFFER);
    }

    static /* synthetic */ void lambda$getFistElement$8(Class cls, FlowableEmitter flowableEmitter) throws Exception {
        Realm defaultInstance = Realm.getDefaultInstance();
        try {
            if (!flowableEmitter.isCancelled()) {
                defaultInstance = Realm.getDefaultInstance();
                RealmResults findAll = defaultInstance.where(cls).findAll();
                if (findAll != null && !findAll.isEmpty()) {
                    Log.d("TAG", "XXX getFistElement  " + cls);
                    flowableEmitter.onNext(defaultInstance.copyFromRealm((RealmModel) findAll.get(0)));
                }
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

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Class<? extends io.realm.RealmModel>, java.lang.Class] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        if (r0 != null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        throw r1;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p046io.reactivex.Flowable<? extends p046io.realm.RealmModel> getFistElementSimple(java.lang.Class<? extends p046io.realm.RealmModel> r4) {
        /*
            r3 = this;
            io.realm.Realm r0 = p046io.realm.Realm.getDefaultInstance()     // Catch:{ Exception -> 0x0055 }
            io.realm.RealmQuery r1 = r0.where(r4)     // Catch:{ all -> 0x0047 }
            boolean r2 = r0.isAutoRefresh()     // Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x002a
            io.realm.RealmResults r1 = r1.findAllAsync()     // Catch:{ all -> 0x0047 }
            io.reactivex.Flowable r1 = r1.asFlowable()     // Catch:{ all -> 0x0047 }
            ru.unicorn.ujin.view.activity.navigation.ui.addhardware.create.-$$Lambda$BaseLocalRepository$Hucr1__poVzIkh8UZkFpMQ3JQuk r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.create.$$Lambda$BaseLocalRepository$Hucr1__poVzIkh8UZkFpMQ3JQuk.INSTANCE     // Catch:{ all -> 0x0047 }
            io.reactivex.Flowable r1 = r1.filter(r2)     // Catch:{ all -> 0x0047 }
            ru.unicorn.ujin.view.activity.navigation.ui.addhardware.create.-$$Lambda$BaseLocalRepository$rAg-5oJ6ZMVcFybnglzmNqv_3Nk r2 = new ru.unicorn.ujin.view.activity.navigation.ui.addhardware.create.-$$Lambda$BaseLocalRepository$rAg-5oJ6ZMVcFybnglzmNqv_3Nk     // Catch:{ all -> 0x0047 }
            r2.<init>()     // Catch:{ all -> 0x0047 }
            io.reactivex.Flowable r1 = r1.map(r2)     // Catch:{ all -> 0x0047 }
            io.reactivex.Flowable r4 = r1.cast(r4)     // Catch:{ all -> 0x0047 }
            goto L_0x0041
        L_0x002a:
            io.realm.RealmResults r4 = r1.findAllAsync()     // Catch:{ all -> 0x0047 }
            io.reactivex.Flowable r4 = p046io.reactivex.Flowable.just(r4)     // Catch:{ all -> 0x0047 }
            ru.unicorn.ujin.view.activity.navigation.ui.addhardware.create.-$$Lambda$BaseLocalRepository$ZipbvH9HAwA9ODNff4qDApoYykA r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.create.$$Lambda$BaseLocalRepository$ZipbvH9HAwA9ODNff4qDApoYykA.INSTANCE     // Catch:{ all -> 0x0047 }
            io.reactivex.Flowable r4 = r4.filter(r1)     // Catch:{ all -> 0x0047 }
            ru.unicorn.ujin.view.activity.navigation.ui.addhardware.create.-$$Lambda$BaseLocalRepository$PGO-08P9ZMyFuYCAY0tF3GbaGFc r1 = new ru.unicorn.ujin.view.activity.navigation.ui.addhardware.create.-$$Lambda$BaseLocalRepository$PGO-08P9ZMyFuYCAY0tF3GbaGFc     // Catch:{ all -> 0x0047 }
            r1.<init>()     // Catch:{ all -> 0x0047 }
            io.reactivex.Flowable r4 = r4.map(r1)     // Catch:{ all -> 0x0047 }
        L_0x0041:
            if (r0 == 0) goto L_0x0046
            r0.close()     // Catch:{ Exception -> 0x0055 }
        L_0x0046:
            return r4
        L_0x0047:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r1 = move-exception
            if (r0 == 0) goto L_0x0054
            r0.close()     // Catch:{ all -> 0x0050 }
            goto L_0x0054
        L_0x0050:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch:{ Exception -> 0x0055 }
        L_0x0054:
            throw r1     // Catch:{ Exception -> 0x0055 }
        L_0x0055:
            r4 = move-exception
            r4.printStackTrace()
            io.reactivex.Flowable r4 = p046io.reactivex.Flowable.empty()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.create.BaseLocalRepository.getFistElementSimple(java.lang.Class):io.reactivex.Flowable");
    }

    static /* synthetic */ boolean lambda$getFistElementSimple$9(RealmResults realmResults) throws Exception {
        return realmResults != null && !realmResults.isEmpty();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Class<? extends io.realm.RealmModel>, java.lang.Class] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (r0 != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        throw r1;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p046io.reactivex.Flowable<java.util.List<? extends p046io.realm.RealmModel>> getDataSimple(java.lang.Class<? extends p046io.realm.RealmModel> r3) {
        /*
            r2 = this;
            io.realm.Realm r0 = p046io.realm.Realm.getDefaultInstance()     // Catch:{ Exception -> 0x004e }
            io.realm.RealmQuery r3 = r0.where(r3)     // Catch:{ all -> 0x0040 }
            boolean r1 = r0.isAutoRefresh()     // Catch:{ all -> 0x0040 }
            if (r1 == 0) goto L_0x001d
            io.realm.RealmResults r3 = r3.findAllAsync()     // Catch:{ all -> 0x0040 }
            io.reactivex.Flowable r3 = r3.asFlowable()     // Catch:{ all -> 0x0040 }
            ru.unicorn.ujin.view.activity.navigation.ui.addhardware.create.-$$Lambda$BaseLocalRepository$EMsAfIXEIZbLzFu7zG_RadFCMes r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.create.$$Lambda$BaseLocalRepository$EMsAfIXEIZbLzFu7zG_RadFCMes.INSTANCE     // Catch:{ all -> 0x0040 }
            io.reactivex.Flowable r3 = r3.doOnNext(r1)     // Catch:{ all -> 0x0040 }
            goto L_0x003a
        L_0x001d:
            io.realm.RealmResults r3 = r3.findAllAsync()     // Catch:{ all -> 0x0040 }
            io.reactivex.Flowable r3 = p046io.reactivex.Flowable.just(r3)     // Catch:{ all -> 0x0040 }
            ru.unicorn.ujin.view.activity.navigation.ui.addhardware.create.-$$Lambda$BaseLocalRepository$VA8rh67bgkP2UL-kvjN16os2gUw r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.create.$$Lambda$BaseLocalRepository$VA8rh67bgkP2ULkvjN16os2gUw.INSTANCE     // Catch:{ all -> 0x0040 }
            io.reactivex.Flowable r3 = r3.filter(r1)     // Catch:{ all -> 0x0040 }
            ru.unicorn.ujin.view.activity.navigation.ui.addhardware.create.-$$Lambda$BaseLocalRepository$z3H55bjP3fciPHH6IS3ai2XjJr0 r1 = new ru.unicorn.ujin.view.activity.navigation.ui.addhardware.create.-$$Lambda$BaseLocalRepository$z3H55bjP3fciPHH6IS3ai2XjJr0     // Catch:{ all -> 0x0040 }
            r1.<init>()     // Catch:{ all -> 0x0040 }
            io.reactivex.Flowable r3 = r3.map(r1)     // Catch:{ all -> 0x0040 }
            ru.unicorn.ujin.view.activity.navigation.ui.addhardware.create.-$$Lambda$BaseLocalRepository$6BeI-exTObuNVYzdxLznP4AuUUU r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.create.$$Lambda$BaseLocalRepository$6BeIexTObuNVYzdxLznP4AuUUU.INSTANCE     // Catch:{ all -> 0x0040 }
            io.reactivex.Flowable r3 = r3.doOnNext(r1)     // Catch:{ all -> 0x0040 }
        L_0x003a:
            if (r0 == 0) goto L_0x003f
            r0.close()     // Catch:{ Exception -> 0x004e }
        L_0x003f:
            return r3
        L_0x0040:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r1 = move-exception
            if (r0 == 0) goto L_0x004d
            r0.close()     // Catch:{ all -> 0x0049 }
            goto L_0x004d
        L_0x0049:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch:{ Exception -> 0x004e }
        L_0x004d:
            throw r1     // Catch:{ Exception -> 0x004e }
        L_0x004e:
            r3 = move-exception
            r3.printStackTrace()
            io.reactivex.Flowable r3 = p046io.reactivex.Flowable.empty()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.create.BaseLocalRepository.getDataSimple(java.lang.Class):io.reactivex.Flowable");
    }

    public Flowable<? extends RealmModel> getElementById(Class<? extends RealmModel> cls, String str, String str2) {
        return Flowable.create(new FlowableOnSubscribe(cls, str2, str) {
            private final /* synthetic */ Class f$0;
            private final /* synthetic */ String f$1;
            private final /* synthetic */ String f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void subscribe(FlowableEmitter flowableEmitter) {
                BaseLocalRepository.lambda$getElementById$17(this.f$0, this.f$1, this.f$2, flowableEmitter);
            }
        }, BackpressureStrategy.BUFFER);
    }

    static /* synthetic */ void lambda$getElementById$17(Class cls, String str, String str2, FlowableEmitter flowableEmitter) throws Exception {
        Realm defaultInstance = Realm.getDefaultInstance();
        Log.d("TAG", "XXX getElementById ");
        try {
            if (!flowableEmitter.isCancelled()) {
                defaultInstance = Realm.getDefaultInstance();
                RealmModel realmModel = (RealmModel) defaultInstance.where(cls).equalTo(str, str2).findFirst();
                if (realmModel != null) {
                    RealmModel copyFromRealm = defaultInstance.copyFromRealm(realmModel);
                    flowableEmitter.onNext(copyFromRealm);
                    Log.d("TAG", "XXX getElementById " + copyFromRealm.toString());
                } else {
                    Log.d("TAG", "XXX getElementById is null ");
                }
                flowableEmitter.onComplete();
                defaultInstance.close();
            }
            if (defaultInstance.isClosed()) {
                return;
            }
        } catch (Exception e) {
            flowableEmitter.onError(e);
            Log.d("TAG", "XXX getElementById error " + e.getMessage());
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

    public Flowable<? extends RealmModel> getElementById(Class<? extends RealmModel> cls, Long l, String str) {
        return Flowable.create(new FlowableOnSubscribe(cls, str, l) {
            private final /* synthetic */ Class f$0;
            private final /* synthetic */ String f$1;
            private final /* synthetic */ Long f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void subscribe(FlowableEmitter flowableEmitter) {
                BaseLocalRepository.lambda$getElementById$18(this.f$0, this.f$1, this.f$2, flowableEmitter);
            }
        }, BackpressureStrategy.BUFFER);
    }

    static /* synthetic */ void lambda$getElementById$18(Class cls, String str, Long l, FlowableEmitter flowableEmitter) throws Exception {
        Realm defaultInstance = Realm.getDefaultInstance();
        Log.d("TAG", "XXX getElementById " + flowableEmitter.isCancelled());
        try {
            if (!flowableEmitter.isCancelled()) {
                defaultInstance = Realm.getDefaultInstance();
                RealmModel realmModel = (RealmModel) defaultInstance.where(cls).equalTo(str, l).findFirst();
                if (realmModel != null) {
                    flowableEmitter.onNext(defaultInstance.copyFromRealm(realmModel));
                }
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

    public Flowable<List<? extends RealmModel>> getAllElementByQuery(Class<? extends RealmModel> cls, Long l, String str) {
        return Flowable.create(new FlowableOnSubscribe(cls, str, l) {
            private final /* synthetic */ Class f$0;
            private final /* synthetic */ String f$1;
            private final /* synthetic */ Long f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void subscribe(FlowableEmitter flowableEmitter) {
                BaseLocalRepository.lambda$getAllElementByQuery$19(this.f$0, this.f$1, this.f$2, flowableEmitter);
            }
        }, BackpressureStrategy.BUFFER);
    }

    static /* synthetic */ void lambda$getAllElementByQuery$19(Class cls, String str, Long l, FlowableEmitter flowableEmitter) throws Exception {
        Realm defaultInstance = Realm.getDefaultInstance();
        Log.d("TAG", "XXX getElementById");
        try {
            if (!flowableEmitter.isCancelled()) {
                defaultInstance = Realm.getDefaultInstance();
                RealmResults findAll = defaultInstance.where(cls).equalTo(str, l).findAll();
                if (findAll != null) {
                    flowableEmitter.onNext(defaultInstance.copyFromRealm(findAll));
                }
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

    public Flowable<List<? extends RealmModel>> getDataSortedByField(Class<? extends RealmModel> cls, String str) {
        return Flowable.create(new FlowableOnSubscribe(str, cls) {
            private final /* synthetic */ String f$0;
            private final /* synthetic */ Class f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void subscribe(FlowableEmitter flowableEmitter) {
                BaseLocalRepository.lambda$getDataSortedByField$20(this.f$0, this.f$1, flowableEmitter);
            }
        }, BackpressureStrategy.BUFFER);
    }

    static /* synthetic */ void lambda$getDataSortedByField$20(String str, Class cls, FlowableEmitter flowableEmitter) throws Exception {
        RealmResults realmResults;
        Realm defaultInstance = Realm.getDefaultInstance();
        try {
            if (!flowableEmitter.isCancelled()) {
                defaultInstance = Realm.getDefaultInstance();
                if (str.isEmpty()) {
                    realmResults = defaultInstance.where(cls).findAll();
                } else {
                    realmResults = defaultInstance.where(cls).sort(str).findAll();
                }
                Log.d("TAG", "XXX getData " + cls.getCanonicalName() + " size " + realmResults.size());
                flowableEmitter.onNext(defaultInstance.copyFromRealm(realmResults));
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

    public Flowable<List<? extends RealmModel>> getData(Class<? extends RealmModel> cls) {
        return getDataSortedByField(cls, "");
    }

    public void deleteItemById(Class<? extends RealmModel> cls, String str, int i) {
        Completable.fromCallable(new Callable(cls, str, i) {
            private final /* synthetic */ Class f$0;
            private final /* synthetic */ String f$1;
            private final /* synthetic */ int f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final Object call() {
                return BaseLocalRepository.lambda$deleteItemById$21(this.f$0, this.f$1, this.f$2);
            }
        }).subscribeOn(Schedulers.m6765io()).subscribe();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0059, code lost:
        if (r1.isClosed() != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005b, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0062, code lost:
        return p046io.reactivex.Completable.complete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x004c, code lost:
        if (r1.isClosed() == false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object lambda$deleteItemById$21(java.lang.Class r5, java.lang.String r6, int r7) throws java.lang.Exception {
        /*
            java.lang.String r0 = " "
            io.realm.Realm r1 = p046io.realm.Realm.getDefaultInstance()
            io.realm.RealmQuery r5 = r1.where(r5)     // Catch:{ Exception -> 0x0051 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0051 }
            io.realm.RealmQuery r5 = r5.equalTo((java.lang.String) r6, (java.lang.Integer) r2)     // Catch:{ Exception -> 0x0051 }
            io.realm.RealmResults r5 = r5.findAll()     // Catch:{ Exception -> 0x0051 }
            java.lang.String r2 = "TAG"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0051 }
            r3.<init>()     // Catch:{ Exception -> 0x0051 }
            java.lang.String r4 = "XXX deleteItemById "
            r3.append(r4)     // Catch:{ Exception -> 0x0051 }
            r3.append(r6)     // Catch:{ Exception -> 0x0051 }
            r3.append(r0)     // Catch:{ Exception -> 0x0051 }
            r3.append(r7)     // Catch:{ Exception -> 0x0051 }
            r3.append(r0)     // Catch:{ Exception -> 0x0051 }
            java.lang.String r6 = r5.toString()     // Catch:{ Exception -> 0x0051 }
            r3.append(r6)     // Catch:{ Exception -> 0x0051 }
            java.lang.String r6 = r3.toString()     // Catch:{ Exception -> 0x0051 }
            android.util.Log.d(r2, r6)     // Catch:{ Exception -> 0x0051 }
            r1.beginTransaction()     // Catch:{ Exception -> 0x0051 }
            r5.deleteAllFromRealm()     // Catch:{ Exception -> 0x0051 }
            r1.commitTransaction()     // Catch:{ Exception -> 0x0051 }
            r1.close()     // Catch:{ Exception -> 0x0051 }
            boolean r5 = r1.isClosed()
            if (r5 != 0) goto L_0x005e
            goto L_0x005b
        L_0x004f:
            r5 = move-exception
            goto L_0x0063
        L_0x0051:
            r5 = move-exception
            r5.printStackTrace()     // Catch:{ all -> 0x004f }
            boolean r5 = r1.isClosed()
            if (r5 != 0) goto L_0x005e
        L_0x005b:
            r1.close()
        L_0x005e:
            io.reactivex.Completable r5 = p046io.reactivex.Completable.complete()
            return r5
        L_0x0063:
            boolean r6 = r1.isClosed()
            if (r6 != 0) goto L_0x006c
            r1.close()
        L_0x006c:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.create.BaseLocalRepository.lambda$deleteItemById$21(java.lang.Class, java.lang.String, int):java.lang.Object");
    }

    public void clearData(Class<? extends RealmModel> cls) {
        Completable.fromCallable(new Callable(cls) {
            private final /* synthetic */ Class f$0;

            {
                this.f$0 = r1;
            }

            public final Object call() {
                return BaseLocalRepository.lambda$clearData$22(this.f$0);
            }
        }).subscribeOn(Schedulers.m6765io()).subscribe();
    }

    /* JADX INFO: finally extract failed */
    static /* synthetic */ Object lambda$clearData$22(Class cls) throws Exception {
        Realm defaultInstance = Realm.getDefaultInstance();
        try {
            defaultInstance.beginTransaction();
            defaultInstance.where(cls).findAll().deleteAllFromRealm();
            defaultInstance.commitTransaction();
            defaultInstance.close();
            return Completable.complete();
        } catch (Throwable th) {
            defaultInstance.close();
            throw th;
        }
    }

    public Completable deleteAll() {
        return Completable.create($$Lambda$BaseLocalRepository$c4sJ4GE2cwG16MVLCqKMJGFW7NA.INSTANCE);
    }

    static /* synthetic */ void lambda$deleteAll$23(CompletableEmitter completableEmitter) throws Exception {
        Realm defaultInstance = Realm.getDefaultInstance();
        try {
            if (!completableEmitter.isDisposed()) {
                defaultInstance = Realm.getDefaultInstance();
                defaultInstance.beginTransaction();
                defaultInstance.deleteAll();
                defaultInstance.commitTransaction();
                completableEmitter.onComplete();
                defaultInstance.close();
            }
            if (defaultInstance.isClosed()) {
                return;
            }
        } catch (Exception e) {
            completableEmitter.onError(e);
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

    public void deleteById(Class<? extends RealmModel> cls, String str, int i) {
        Realm defaultInstance = Realm.getDefaultInstance();
        try {
            RealmResults<E> findAll = defaultInstance.where(cls).equalTo(str, Integer.valueOf(i)).findAll();
            defaultInstance.beginTransaction();
            findAll.deleteAllFromRealm();
            defaultInstance.commitTransaction();
            defaultInstance.close();
            if (defaultInstance.isClosed()) {
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
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
}
