package p046io.realm.internal;

import javax.annotation.Nullable;
import p046io.realm.OrderedCollectionChangeSet;

/* renamed from: io.realm.internal.StatefulCollectionChangeSet */
public class StatefulCollectionChangeSet implements OrderedCollectionChangeSet {
    private final OrderedCollectionChangeSet changeset;
    private final Throwable error;
    private final boolean remoteDataSynchronized;
    private final OrderedCollectionChangeSet.State state;

    public StatefulCollectionChangeSet(OsCollectionChangeSet osCollectionChangeSet) {
        this.changeset = osCollectionChangeSet;
        boolean isFirstAsyncCallback = osCollectionChangeSet.isFirstAsyncCallback();
        this.remoteDataSynchronized = osCollectionChangeSet.isRemoteDataLoaded();
        this.error = osCollectionChangeSet.getError();
        if (this.error != null) {
            this.state = OrderedCollectionChangeSet.State.ERROR;
        } else {
            this.state = isFirstAsyncCallback ? OrderedCollectionChangeSet.State.INITIAL : OrderedCollectionChangeSet.State.UPDATE;
        }
    }

    public OrderedCollectionChangeSet.State getState() {
        return this.state;
    }

    public int[] getDeletions() {
        return this.changeset.getDeletions();
    }

    public int[] getInsertions() {
        return this.changeset.getInsertions();
    }

    public int[] getChanges() {
        return this.changeset.getChanges();
    }

    public OrderedCollectionChangeSet.Range[] getDeletionRanges() {
        return this.changeset.getDeletionRanges();
    }

    public OrderedCollectionChangeSet.Range[] getInsertionRanges() {
        return this.changeset.getInsertionRanges();
    }

    public OrderedCollectionChangeSet.Range[] getChangeRanges() {
        return this.changeset.getChangeRanges();
    }

    @Nullable
    public Throwable getError() {
        return this.error;
    }

    public boolean isCompleteResult() {
        return this.remoteDataSynchronized;
    }
}
