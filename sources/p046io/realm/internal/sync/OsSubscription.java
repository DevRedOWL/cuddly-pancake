package p046io.realm.internal.sync;

import javax.annotation.Nullable;
import p046io.realm.RealmChangeListener;
import p046io.realm.internal.NativeObject;
import p046io.realm.internal.ObserverPairList;
import p046io.realm.internal.OsResults;

/* renamed from: io.realm.internal.sync.OsSubscription */
public class OsSubscription implements NativeObject {
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private final long nativePtr;
    protected final ObserverPairList<SubscriptionObserverPair> observerPairs = new ObserverPairList<>();

    private static native long nativeCreateOrUpdate(long j, String str, long j2, boolean z);

    private static native Object nativeGetError(long j);

    private static native long nativeGetFinalizerPtr();

    private static native int nativeGetState(long j);

    private native void nativeStartListening(long j);

    private native void nativeStopListening(long j);

    /* renamed from: io.realm.internal.sync.OsSubscription$SubscriptionState */
    public enum SubscriptionState {
        ERROR(-1),
        CREATING(2),
        PENDING(0),
        COMPLETE(1),
        INVALIDATED(3);
        
        private final int val;

        private SubscriptionState(int i) {
            this.val = i;
        }

        public static SubscriptionState fromInternalValue(int i) {
            for (SubscriptionState subscriptionState : values()) {
                if (subscriptionState.val == i) {
                    return subscriptionState;
                }
            }
            throw new IllegalArgumentException("Unknown value: " + i);
        }
    }

    /* renamed from: io.realm.internal.sync.OsSubscription$SubscriptionObserverPair */
    private static class SubscriptionObserverPair extends ObserverPairList.ObserverPair<OsSubscription, RealmChangeListener<OsSubscription>> {
        public SubscriptionObserverPair(OsSubscription osSubscription, RealmChangeListener<OsSubscription> realmChangeListener) {
            super(osSubscription, realmChangeListener);
        }

        public void onChange(OsSubscription osSubscription) {
            ((RealmChangeListener) this.listener).onChange(osSubscription);
        }
    }

    /* renamed from: io.realm.internal.sync.OsSubscription$Callback */
    private static class Callback implements ObserverPairList.Callback<SubscriptionObserverPair> {
        private Callback() {
        }

        public void onCalled(SubscriptionObserverPair subscriptionObserverPair, Object obj) {
            subscriptionObserverPair.onChange((OsSubscription) obj);
        }
    }

    public OsSubscription(OsResults osResults, SubscriptionAction subscriptionAction) {
        this.nativePtr = nativeCreateOrUpdate(osResults.getNativePtr(), subscriptionAction.getName(), subscriptionAction.getTimeToLiveMs(), subscriptionAction.isUpdate());
    }

    public long getNativePtr() {
        return this.nativePtr;
    }

    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    public SubscriptionState getState() {
        return SubscriptionState.fromInternalValue(nativeGetState(this.nativePtr));
    }

    @Nullable
    public Throwable getError() {
        return (Throwable) nativeGetError(this.nativePtr);
    }

    public void addChangeListener(RealmChangeListener<OsSubscription> realmChangeListener) {
        if (this.observerPairs.isEmpty()) {
            nativeStartListening(this.nativePtr);
        }
        this.observerPairs.add(new SubscriptionObserverPair(this, realmChangeListener));
    }

    public void removeChangeListener(RealmChangeListener<OsSubscription> realmChangeListener) {
        this.observerPairs.remove(this, realmChangeListener);
        if (this.observerPairs.isEmpty()) {
            nativeStopListening(this.nativePtr);
        }
    }

    private void notifyChangeListeners() {
        this.observerPairs.foreach(new Callback());
    }
}
