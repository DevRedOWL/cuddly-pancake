package androidx.work.impl;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

class WorkManagerLiveDataTracker {
    final Set<LiveData> mLiveDataSet = Collections.newSetFromMap(new IdentityHashMap());

    WorkManagerLiveDataTracker() {
    }

    public <T> LiveData<T> track(LiveData<T> liveData) {
        return new TrackedLiveData(this, liveData);
    }

    /* access modifiers changed from: package-private */
    public void onActive(LiveData liveData) {
        this.mLiveDataSet.add(liveData);
    }

    /* access modifiers changed from: package-private */
    public void onInactive(LiveData liveData) {
        this.mLiveDataSet.remove(liveData);
    }

    static class TrackedLiveData<T> extends MediatorLiveData<T> {
        private final WorkManagerLiveDataTracker mContainer;

        TrackedLiveData(WorkManagerLiveDataTracker workManagerLiveDataTracker, LiveData<T> liveData) {
            this.mContainer = workManagerLiveDataTracker;
            addSource(liveData, new Observer<T>() {
                public void onChanged(T t) {
                    TrackedLiveData.this.setValue(t);
                }
            });
        }

        /* access modifiers changed from: protected */
        public void onActive() {
            super.onActive();
            this.mContainer.onActive(this);
        }

        /* access modifiers changed from: protected */
        public void onInactive() {
            super.onInactive();
            this.mContainer.onInactive(this);
        }
    }
}
