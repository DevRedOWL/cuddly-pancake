package p046io.realm.p047rx;

import javax.annotation.Nullable;
import p046io.realm.OrderedCollectionChangeSet;
import p046io.realm.OrderedRealmCollection;

/* renamed from: io.realm.rx.CollectionChange */
public class CollectionChange<E extends OrderedRealmCollection> {
    private final OrderedCollectionChangeSet changeset;
    private final E collection;

    public CollectionChange(E e, @Nullable OrderedCollectionChangeSet orderedCollectionChangeSet) {
        this.collection = e;
        this.changeset = orderedCollectionChangeSet;
    }

    public E getCollection() {
        return this.collection;
    }

    @Nullable
    public OrderedCollectionChangeSet getChangeset() {
        return this.changeset;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CollectionChange collectionChange = (CollectionChange) obj;
        if (!this.collection.equals(collectionChange.collection)) {
            return false;
        }
        OrderedCollectionChangeSet orderedCollectionChangeSet = this.changeset;
        OrderedCollectionChangeSet orderedCollectionChangeSet2 = collectionChange.changeset;
        if (orderedCollectionChangeSet != null) {
            return orderedCollectionChangeSet.equals(orderedCollectionChangeSet2);
        }
        if (orderedCollectionChangeSet2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.collection.hashCode() * 31;
        OrderedCollectionChangeSet orderedCollectionChangeSet = this.changeset;
        return hashCode + (orderedCollectionChangeSet != null ? orderedCollectionChangeSet.hashCode() : 0);
    }
}
