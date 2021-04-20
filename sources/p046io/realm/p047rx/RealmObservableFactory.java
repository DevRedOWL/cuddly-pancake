package p046io.realm.p047rx;

import java.util.IdentityHashMap;
import java.util.Map;
import p046io.reactivex.BackpressureStrategy;
import p046io.reactivex.Flowable;
import p046io.reactivex.FlowableEmitter;
import p046io.reactivex.FlowableOnSubscribe;
import p046io.reactivex.Observable;
import p046io.reactivex.ObservableEmitter;
import p046io.reactivex.ObservableOnSubscribe;
import p046io.reactivex.Single;
import p046io.reactivex.disposables.Disposables;
import p046io.realm.DynamicRealm;
import p046io.realm.DynamicRealmObject;
import p046io.realm.ObjectChangeSet;
import p046io.realm.OrderedCollectionChangeSet;
import p046io.realm.OrderedRealmCollectionChangeListener;
import p046io.realm.Realm;
import p046io.realm.RealmChangeListener;
import p046io.realm.RealmConfiguration;
import p046io.realm.RealmList;
import p046io.realm.RealmModel;
import p046io.realm.RealmObject;
import p046io.realm.RealmObjectChangeListener;
import p046io.realm.RealmQuery;
import p046io.realm.RealmResults;

/* renamed from: io.realm.rx.RealmObservableFactory */
public class RealmObservableFactory implements RxObservableFactory {
    private static final BackpressureStrategy BACK_PRESSURE_STRATEGY = BackpressureStrategy.LATEST;
    /* access modifiers changed from: private */
    public ThreadLocal<StrongReferenceCounter<RealmList>> listRefs = new ThreadLocal<StrongReferenceCounter<RealmList>>() {
        /* access modifiers changed from: protected */
        public StrongReferenceCounter<RealmList> initialValue() {
            return new StrongReferenceCounter<>();
        }
    };
    /* access modifiers changed from: private */
    public ThreadLocal<StrongReferenceCounter<RealmModel>> objectRefs = new ThreadLocal<StrongReferenceCounter<RealmModel>>() {
        /* access modifiers changed from: protected */
        public StrongReferenceCounter<RealmModel> initialValue() {
            return new StrongReferenceCounter<>();
        }
    };
    /* access modifiers changed from: private */
    public ThreadLocal<StrongReferenceCounter<RealmResults>> resultsRefs = new ThreadLocal<StrongReferenceCounter<RealmResults>>() {
        /* access modifiers changed from: protected */
        public StrongReferenceCounter<RealmResults> initialValue() {
            return new StrongReferenceCounter<>();
        }
    };

    public int hashCode() {
        return 37;
    }

    public Flowable<Realm> from(Realm realm) {
        final RealmConfiguration configuration = realm.getConfiguration();
        return Flowable.create(new FlowableOnSubscribe<Realm>() {
            public void subscribe(final FlowableEmitter<Realm> flowableEmitter) throws Exception {
                final Realm instance = Realm.getInstance(configuration);
                final C48681 r1 = new RealmChangeListener<Realm>() {
                    public void onChange(Realm realm) {
                        if (!flowableEmitter.isCancelled()) {
                            flowableEmitter.onNext(realm);
                        }
                    }
                };
                instance.addChangeListener(r1);
                flowableEmitter.setDisposable(Disposables.fromRunnable(new Runnable() {
                    public void run() {
                        instance.removeChangeListener(r1);
                        instance.close();
                    }
                }));
                flowableEmitter.onNext(instance);
            }
        }, BACK_PRESSURE_STRATEGY);
    }

    public Flowable<DynamicRealm> from(DynamicRealm dynamicRealm) {
        final RealmConfiguration configuration = dynamicRealm.getConfiguration();
        return Flowable.create(new FlowableOnSubscribe<DynamicRealm>() {
            public void subscribe(final FlowableEmitter<DynamicRealm> flowableEmitter) throws Exception {
                final DynamicRealm instance = DynamicRealm.getInstance(configuration);
                final C48711 r1 = new RealmChangeListener<DynamicRealm>() {
                    public void onChange(DynamicRealm dynamicRealm) {
                        if (!flowableEmitter.isCancelled()) {
                            flowableEmitter.onNext(dynamicRealm);
                        }
                    }
                };
                instance.addChangeListener(r1);
                flowableEmitter.setDisposable(Disposables.fromRunnable(new Runnable() {
                    public void run() {
                        instance.removeChangeListener(r1);
                        instance.close();
                    }
                }));
                flowableEmitter.onNext(instance);
            }
        }, BACK_PRESSURE_STRATEGY);
    }

    public <E> Flowable<RealmResults<E>> from(Realm realm, final RealmResults<E> realmResults) {
        final RealmConfiguration configuration = realm.getConfiguration();
        return Flowable.create(new FlowableOnSubscribe<RealmResults<E>>() {
            public void subscribe(final FlowableEmitter<RealmResults<E>> flowableEmitter) throws Exception {
                final Realm instance = Realm.getInstance(configuration);
                ((StrongReferenceCounter) RealmObservableFactory.this.resultsRefs.get()).acquireReference(realmResults);
                final C48741 r1 = new RealmChangeListener<RealmResults<E>>() {
                    public void onChange(RealmResults<E> realmResults) {
                        if (!flowableEmitter.isCancelled()) {
                            flowableEmitter.onNext(realmResults);
                        }
                    }
                };
                realmResults.addChangeListener(r1);
                flowableEmitter.setDisposable(Disposables.fromRunnable(new Runnable() {
                    public void run() {
                        realmResults.removeChangeListener(r1);
                        instance.close();
                        ((StrongReferenceCounter) RealmObservableFactory.this.resultsRefs.get()).releaseReference(realmResults);
                    }
                }));
                flowableEmitter.onNext(realmResults);
            }
        }, BACK_PRESSURE_STRATEGY);
    }

    public <E> Observable<CollectionChange<RealmResults<E>>> changesetsFrom(Realm realm, final RealmResults<E> realmResults) {
        final RealmConfiguration configuration = realm.getConfiguration();
        return Observable.create(new ObservableOnSubscribe<CollectionChange<RealmResults<E>>>() {
            public void subscribe(final ObservableEmitter<CollectionChange<RealmResults<E>>> observableEmitter) throws Exception {
                final Realm instance = Realm.getInstance(configuration);
                ((StrongReferenceCounter) RealmObservableFactory.this.resultsRefs.get()).acquireReference(realmResults);
                final C48771 r1 = new OrderedRealmCollectionChangeListener<RealmResults<E>>() {
                    public void onChange(RealmResults<E> realmResults, OrderedCollectionChangeSet orderedCollectionChangeSet) {
                        if (!observableEmitter.isDisposed()) {
                            observableEmitter.onNext(new CollectionChange(realmResults, orderedCollectionChangeSet));
                        }
                    }
                };
                realmResults.addChangeListener(r1);
                observableEmitter.setDisposable(Disposables.fromRunnable(new Runnable() {
                    public void run() {
                        realmResults.removeChangeListener(r1);
                        instance.close();
                        ((StrongReferenceCounter) RealmObservableFactory.this.resultsRefs.get()).releaseReference(realmResults);
                    }
                }));
                observableEmitter.onNext(new CollectionChange(realmResults, (OrderedCollectionChangeSet) null));
            }
        });
    }

    public <E> Flowable<RealmResults<E>> from(DynamicRealm dynamicRealm, final RealmResults<E> realmResults) {
        final RealmConfiguration configuration = dynamicRealm.getConfiguration();
        return Flowable.create(new FlowableOnSubscribe<RealmResults<E>>() {
            public void subscribe(final FlowableEmitter<RealmResults<E>> flowableEmitter) throws Exception {
                final DynamicRealm instance = DynamicRealm.getInstance(configuration);
                ((StrongReferenceCounter) RealmObservableFactory.this.resultsRefs.get()).acquireReference(realmResults);
                final C48801 r1 = new RealmChangeListener<RealmResults<E>>() {
                    public void onChange(RealmResults<E> realmResults) {
                        if (!flowableEmitter.isCancelled()) {
                            flowableEmitter.onNext(realmResults);
                        }
                    }
                };
                realmResults.addChangeListener(r1);
                flowableEmitter.setDisposable(Disposables.fromRunnable(new Runnable() {
                    public void run() {
                        realmResults.removeChangeListener(r1);
                        instance.close();
                        ((StrongReferenceCounter) RealmObservableFactory.this.resultsRefs.get()).releaseReference(realmResults);
                    }
                }));
                flowableEmitter.onNext(realmResults);
            }
        }, BACK_PRESSURE_STRATEGY);
    }

    public <E> Observable<CollectionChange<RealmResults<E>>> changesetsFrom(DynamicRealm dynamicRealm, final RealmResults<E> realmResults) {
        final RealmConfiguration configuration = dynamicRealm.getConfiguration();
        return Observable.create(new ObservableOnSubscribe<CollectionChange<RealmResults<E>>>() {
            public void subscribe(final ObservableEmitter<CollectionChange<RealmResults<E>>> observableEmitter) throws Exception {
                final DynamicRealm instance = DynamicRealm.getInstance(configuration);
                ((StrongReferenceCounter) RealmObservableFactory.this.resultsRefs.get()).acquireReference(realmResults);
                final C48831 r1 = new OrderedRealmCollectionChangeListener<RealmResults<E>>() {
                    public void onChange(RealmResults<E> realmResults, OrderedCollectionChangeSet orderedCollectionChangeSet) {
                        if (!observableEmitter.isDisposed()) {
                            observableEmitter.onNext(new CollectionChange(realmResults, orderedCollectionChangeSet));
                        }
                    }
                };
                realmResults.addChangeListener(r1);
                observableEmitter.setDisposable(Disposables.fromRunnable(new Runnable() {
                    public void run() {
                        realmResults.removeChangeListener(r1);
                        instance.close();
                        ((StrongReferenceCounter) RealmObservableFactory.this.resultsRefs.get()).releaseReference(realmResults);
                    }
                }));
                observableEmitter.onNext(new CollectionChange(realmResults, (OrderedCollectionChangeSet) null));
            }
        });
    }

    public <E> Flowable<RealmList<E>> from(Realm realm, final RealmList<E> realmList) {
        final RealmConfiguration configuration = realm.getConfiguration();
        return Flowable.create(new FlowableOnSubscribe<RealmList<E>>() {
            public void subscribe(final FlowableEmitter<RealmList<E>> flowableEmitter) throws Exception {
                final Realm instance = Realm.getInstance(configuration);
                ((StrongReferenceCounter) RealmObservableFactory.this.listRefs.get()).acquireReference(realmList);
                final C48421 r1 = new RealmChangeListener<RealmList<E>>() {
                    public void onChange(RealmList<E> realmList) {
                        if (!flowableEmitter.isCancelled()) {
                            flowableEmitter.onNext(realmList);
                        }
                    }
                };
                realmList.addChangeListener(r1);
                flowableEmitter.setDisposable(Disposables.fromRunnable(new Runnable() {
                    public void run() {
                        realmList.removeChangeListener(r1);
                        instance.close();
                        ((StrongReferenceCounter) RealmObservableFactory.this.listRefs.get()).releaseReference(realmList);
                    }
                }));
                flowableEmitter.onNext(realmList);
            }
        }, BACK_PRESSURE_STRATEGY);
    }

    public <E> Observable<CollectionChange<RealmList<E>>> changesetsFrom(Realm realm, final RealmList<E> realmList) {
        final RealmConfiguration configuration = realm.getConfiguration();
        return Observable.create(new ObservableOnSubscribe<CollectionChange<RealmList<E>>>() {
            public void subscribe(final ObservableEmitter<CollectionChange<RealmList<E>>> observableEmitter) throws Exception {
                final Realm instance = Realm.getInstance(configuration);
                ((StrongReferenceCounter) RealmObservableFactory.this.listRefs.get()).acquireReference(realmList);
                final C48451 r1 = new OrderedRealmCollectionChangeListener<RealmList<E>>() {
                    public void onChange(RealmList<E> realmList, OrderedCollectionChangeSet orderedCollectionChangeSet) {
                        if (!observableEmitter.isDisposed()) {
                            observableEmitter.onNext(new CollectionChange(realmList, orderedCollectionChangeSet));
                        }
                    }
                };
                realmList.addChangeListener(r1);
                observableEmitter.setDisposable(Disposables.fromRunnable(new Runnable() {
                    public void run() {
                        realmList.removeChangeListener(r1);
                        instance.close();
                        ((StrongReferenceCounter) RealmObservableFactory.this.listRefs.get()).releaseReference(realmList);
                    }
                }));
                observableEmitter.onNext(new CollectionChange(realmList, (OrderedCollectionChangeSet) null));
            }
        });
    }

    public <E> Flowable<RealmList<E>> from(DynamicRealm dynamicRealm, final RealmList<E> realmList) {
        final RealmConfiguration configuration = dynamicRealm.getConfiguration();
        return Flowable.create(new FlowableOnSubscribe<RealmList<E>>() {
            public void subscribe(final FlowableEmitter<RealmList<E>> flowableEmitter) throws Exception {
                final DynamicRealm instance = DynamicRealm.getInstance(configuration);
                ((StrongReferenceCounter) RealmObservableFactory.this.listRefs.get()).acquireReference(realmList);
                final C48481 r1 = new RealmChangeListener<RealmList<E>>() {
                    public void onChange(RealmList<E> realmList) {
                        if (!flowableEmitter.isCancelled()) {
                            flowableEmitter.onNext(realmList);
                        }
                    }
                };
                realmList.addChangeListener(r1);
                flowableEmitter.setDisposable(Disposables.fromRunnable(new Runnable() {
                    public void run() {
                        realmList.removeChangeListener(r1);
                        instance.close();
                        ((StrongReferenceCounter) RealmObservableFactory.this.listRefs.get()).releaseReference(realmList);
                    }
                }));
                flowableEmitter.onNext(realmList);
            }
        }, BACK_PRESSURE_STRATEGY);
    }

    public <E> Observable<CollectionChange<RealmList<E>>> changesetsFrom(DynamicRealm dynamicRealm, final RealmList<E> realmList) {
        final RealmConfiguration configuration = dynamicRealm.getConfiguration();
        return Observable.create(new ObservableOnSubscribe<CollectionChange<RealmList<E>>>() {
            public void subscribe(final ObservableEmitter<CollectionChange<RealmList<E>>> observableEmitter) throws Exception {
                final DynamicRealm instance = DynamicRealm.getInstance(configuration);
                ((StrongReferenceCounter) RealmObservableFactory.this.listRefs.get()).acquireReference(realmList);
                final C48511 r1 = new OrderedRealmCollectionChangeListener<RealmList<E>>() {
                    public void onChange(RealmList<E> realmList, OrderedCollectionChangeSet orderedCollectionChangeSet) {
                        if (!observableEmitter.isDisposed()) {
                            observableEmitter.onNext(new CollectionChange(realmList, orderedCollectionChangeSet));
                        }
                    }
                };
                realmList.addChangeListener(r1);
                observableEmitter.setDisposable(Disposables.fromRunnable(new Runnable() {
                    public void run() {
                        realmList.removeChangeListener(r1);
                        instance.close();
                        ((StrongReferenceCounter) RealmObservableFactory.this.listRefs.get()).releaseReference(realmList);
                    }
                }));
                observableEmitter.onNext(new CollectionChange(realmList, (OrderedCollectionChangeSet) null));
            }
        });
    }

    public <E extends RealmModel> Flowable<E> from(Realm realm, final E e) {
        final RealmConfiguration configuration = realm.getConfiguration();
        return Flowable.create(new FlowableOnSubscribe<E>() {
            public void subscribe(final FlowableEmitter<E> flowableEmitter) throws Exception {
                final Realm instance = Realm.getInstance(configuration);
                ((StrongReferenceCounter) RealmObservableFactory.this.objectRefs.get()).acquireReference(e);
                final C48541 r1 = new RealmChangeListener<E>() {
                    public void onChange(E e) {
                        if (!flowableEmitter.isCancelled()) {
                            flowableEmitter.onNext(e);
                        }
                    }
                };
                RealmObject.addChangeListener(e, r1);
                flowableEmitter.setDisposable(Disposables.fromRunnable(new Runnable() {
                    public void run() {
                        RealmObject.removeChangeListener(e, r1);
                        instance.close();
                        ((StrongReferenceCounter) RealmObservableFactory.this.objectRefs.get()).releaseReference(e);
                    }
                }));
                flowableEmitter.onNext(e);
            }
        }, BACK_PRESSURE_STRATEGY);
    }

    public <E extends RealmModel> Observable<ObjectChange<E>> changesetsFrom(Realm realm, final E e) {
        final RealmConfiguration configuration = realm.getConfiguration();
        return Observable.create(new ObservableOnSubscribe<ObjectChange<E>>() {
            public void subscribe(final ObservableEmitter<ObjectChange<E>> observableEmitter) throws Exception {
                final Realm instance = Realm.getInstance(configuration);
                ((StrongReferenceCounter) RealmObservableFactory.this.objectRefs.get()).acquireReference(e);
                final C48571 r1 = new RealmObjectChangeListener<E>() {
                    public void onChange(E e, ObjectChangeSet objectChangeSet) {
                        if (!observableEmitter.isDisposed()) {
                            observableEmitter.onNext(new ObjectChange(e, objectChangeSet));
                        }
                    }
                };
                RealmObject.addChangeListener(e, r1);
                observableEmitter.setDisposable(Disposables.fromRunnable(new Runnable() {
                    public void run() {
                        RealmObject.removeChangeListener(e, r1);
                        instance.close();
                        ((StrongReferenceCounter) RealmObservableFactory.this.objectRefs.get()).releaseReference(e);
                    }
                }));
                observableEmitter.onNext(new ObjectChange(e, (ObjectChangeSet) null));
            }
        });
    }

    public Flowable<DynamicRealmObject> from(DynamicRealm dynamicRealm, final DynamicRealmObject dynamicRealmObject) {
        final RealmConfiguration configuration = dynamicRealm.getConfiguration();
        return Flowable.create(new FlowableOnSubscribe<DynamicRealmObject>() {
            public void subscribe(final FlowableEmitter<DynamicRealmObject> flowableEmitter) throws Exception {
                final DynamicRealm instance = DynamicRealm.getInstance(configuration);
                ((StrongReferenceCounter) RealmObservableFactory.this.objectRefs.get()).acquireReference(dynamicRealmObject);
                final C48601 r1 = new RealmChangeListener<DynamicRealmObject>() {
                    public void onChange(DynamicRealmObject dynamicRealmObject) {
                        if (!flowableEmitter.isCancelled()) {
                            flowableEmitter.onNext(dynamicRealmObject);
                        }
                    }
                };
                RealmObject.addChangeListener(dynamicRealmObject, r1);
                flowableEmitter.setDisposable(Disposables.fromRunnable(new Runnable() {
                    public void run() {
                        RealmObject.removeChangeListener(dynamicRealmObject, r1);
                        instance.close();
                        ((StrongReferenceCounter) RealmObservableFactory.this.objectRefs.get()).releaseReference(dynamicRealmObject);
                    }
                }));
                flowableEmitter.onNext(dynamicRealmObject);
            }
        }, BACK_PRESSURE_STRATEGY);
    }

    public Observable<ObjectChange<DynamicRealmObject>> changesetsFrom(DynamicRealm dynamicRealm, final DynamicRealmObject dynamicRealmObject) {
        final RealmConfiguration configuration = dynamicRealm.getConfiguration();
        return Observable.create(new ObservableOnSubscribe<ObjectChange<DynamicRealmObject>>() {
            public void subscribe(final ObservableEmitter<ObjectChange<DynamicRealmObject>> observableEmitter) throws Exception {
                final DynamicRealm instance = DynamicRealm.getInstance(configuration);
                ((StrongReferenceCounter) RealmObservableFactory.this.objectRefs.get()).acquireReference(dynamicRealmObject);
                final C48631 r1 = new RealmObjectChangeListener<DynamicRealmObject>() {
                    public void onChange(DynamicRealmObject dynamicRealmObject, ObjectChangeSet objectChangeSet) {
                        if (!observableEmitter.isDisposed()) {
                            observableEmitter.onNext(new ObjectChange(dynamicRealmObject, objectChangeSet));
                        }
                    }
                };
                dynamicRealmObject.addChangeListener(r1);
                observableEmitter.setDisposable(Disposables.fromRunnable(new Runnable() {
                    public void run() {
                        dynamicRealmObject.removeChangeListener(r1);
                        instance.close();
                        ((StrongReferenceCounter) RealmObservableFactory.this.objectRefs.get()).releaseReference(dynamicRealmObject);
                    }
                }));
                observableEmitter.onNext(new ObjectChange(dynamicRealmObject, (ObjectChangeSet) null));
            }
        });
    }

    public <E> Single<RealmQuery<E>> from(Realm realm, RealmQuery<E> realmQuery) {
        throw new RuntimeException("RealmQuery not supported yet.");
    }

    public <E> Single<RealmQuery<E>> from(DynamicRealm dynamicRealm, RealmQuery<E> realmQuery) {
        throw new RuntimeException("RealmQuery not supported yet.");
    }

    public boolean equals(Object obj) {
        return obj instanceof RealmObservableFactory;
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$StrongReferenceCounter */
    private static class StrongReferenceCounter<K> {
        private final Map<K, Integer> references;

        private StrongReferenceCounter() {
            this.references = new IdentityHashMap();
        }

        public void acquireReference(K k) {
            Integer num = this.references.get(k);
            if (num == null) {
                this.references.put(k, 1);
            } else {
                this.references.put(k, Integer.valueOf(num.intValue() + 1));
            }
        }

        public void releaseReference(K k) {
            Integer num = this.references.get(k);
            if (num == null) {
                throw new IllegalStateException("Object does not have any references: " + k);
            } else if (num.intValue() > 1) {
                this.references.put(k, Integer.valueOf(num.intValue() - 1));
            } else if (num.intValue() == 1) {
                this.references.remove(k);
            } else {
                throw new IllegalStateException("Invalid reference count: " + num);
            }
        }
    }
}
