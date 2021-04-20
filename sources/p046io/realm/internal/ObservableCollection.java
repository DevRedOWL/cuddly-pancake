package p046io.realm.internal;

import javax.annotation.Nullable;
import p046io.realm.OrderedCollectionChangeSet;
import p046io.realm.OrderedRealmCollectionChangeListener;
import p046io.realm.RealmChangeListener;
import p046io.realm.internal.ObserverPairList;

/* renamed from: io.realm.internal.ObservableCollection */
interface ObservableCollection {
    void notifyChangeListeners(long j);

    /* renamed from: io.realm.internal.ObservableCollection$CollectionObserverPair */
    public static class CollectionObserverPair<T> extends ObserverPairList.ObserverPair<T, Object> {
        public CollectionObserverPair(T t, Object obj) {
            super(t, obj);
        }

        public void onChange(T t, OsCollectionChangeSet osCollectionChangeSet) {
            if (this.listener instanceof OrderedRealmCollectionChangeListener) {
                ((OrderedRealmCollectionChangeListener) this.listener).onChange(t, new StatefulCollectionChangeSet(osCollectionChangeSet));
            } else if (this.listener instanceof RealmChangeListener) {
                ((RealmChangeListener) this.listener).onChange(t);
            } else {
                throw new RuntimeException("Unsupported listener type: " + this.listener);
            }
        }
    }

    /* renamed from: io.realm.internal.ObservableCollection$RealmChangeListenerWrapper */
    public static class RealmChangeListenerWrapper<T> implements OrderedRealmCollectionChangeListener<T> {
        private final RealmChangeListener<T> listener;

        RealmChangeListenerWrapper(RealmChangeListener<T> realmChangeListener) {
            this.listener = realmChangeListener;
        }

        public void onChange(T t, @Nullable OrderedCollectionChangeSet orderedCollectionChangeSet) {
            this.listener.onChange(t);
        }

        public boolean equals(Object obj) {
            return (obj instanceof RealmChangeListenerWrapper) && this.listener == ((RealmChangeListenerWrapper) obj).listener;
        }

        public int hashCode() {
            return this.listener.hashCode();
        }
    }

    /* renamed from: io.realm.internal.ObservableCollection$Callback */
    public static class Callback implements ObserverPairList.Callback<CollectionObserverPair> {
        private final OsCollectionChangeSet changeSet;

        Callback(OsCollectionChangeSet osCollectionChangeSet) {
            this.changeSet = osCollectionChangeSet;
        }

        public void onCalled(CollectionObserverPair collectionObserverPair, Object obj) {
            collectionObserverPair.onChange(obj, this.changeSet);
        }
    }
}
