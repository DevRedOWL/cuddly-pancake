package p046io.realm.p047rx;

import p046io.reactivex.Flowable;
import p046io.reactivex.Observable;
import p046io.reactivex.Single;
import p046io.realm.DynamicRealm;
import p046io.realm.DynamicRealmObject;
import p046io.realm.Realm;
import p046io.realm.RealmList;
import p046io.realm.RealmModel;
import p046io.realm.RealmQuery;
import p046io.realm.RealmResults;

/* renamed from: io.realm.rx.RxObservableFactory */
public interface RxObservableFactory {
    Observable<ObjectChange<DynamicRealmObject>> changesetsFrom(DynamicRealm dynamicRealm, DynamicRealmObject dynamicRealmObject);

    <E> Observable<CollectionChange<RealmList<E>>> changesetsFrom(DynamicRealm dynamicRealm, RealmList<E> realmList);

    <E> Observable<CollectionChange<RealmResults<E>>> changesetsFrom(DynamicRealm dynamicRealm, RealmResults<E> realmResults);

    <E> Observable<CollectionChange<RealmList<E>>> changesetsFrom(Realm realm, RealmList<E> realmList);

    <E extends RealmModel> Observable<ObjectChange<E>> changesetsFrom(Realm realm, E e);

    <E> Observable<CollectionChange<RealmResults<E>>> changesetsFrom(Realm realm, RealmResults<E> realmResults);

    Flowable<DynamicRealm> from(DynamicRealm dynamicRealm);

    Flowable<DynamicRealmObject> from(DynamicRealm dynamicRealm, DynamicRealmObject dynamicRealmObject);

    <E> Flowable<RealmList<E>> from(DynamicRealm dynamicRealm, RealmList<E> realmList);

    <E> Flowable<RealmResults<E>> from(DynamicRealm dynamicRealm, RealmResults<E> realmResults);

    Flowable<Realm> from(Realm realm);

    <E> Flowable<RealmList<E>> from(Realm realm, RealmList<E> realmList);

    <E extends RealmModel> Flowable<E> from(Realm realm, E e);

    <E> Flowable<RealmResults<E>> from(Realm realm, RealmResults<E> realmResults);

    <E> Single<RealmQuery<E>> from(DynamicRealm dynamicRealm, RealmQuery<E> realmQuery);

    <E> Single<RealmQuery<E>> from(Realm realm, RealmQuery<E> realmQuery);
}
