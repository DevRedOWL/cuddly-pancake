package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintListener;
import java.util.LinkedHashSet;
import java.util.Set;

public abstract class ConstraintTracker<T> {
    private static final String TAG = Logger.tagWithPrefix("ConstraintTracker");
    protected final Context mAppContext;
    private T mCurrentState;
    private final Set<ConstraintListener<T>> mListeners = new LinkedHashSet();
    private final Object mLock = new Object();

    public abstract T getInitialState();

    public abstract void startTracking();

    public abstract void stopTracking();

    ConstraintTracker(Context context) {
        this.mAppContext = context.getApplicationContext();
    }

    public void addListener(ConstraintListener<T> constraintListener) {
        synchronized (this.mLock) {
            if (this.mListeners.add(constraintListener)) {
                if (this.mListeners.size() == 1) {
                    this.mCurrentState = getInitialState();
                    Logger.get().debug(TAG, String.format("%s: initial state = %s", new Object[]{getClass().getSimpleName(), this.mCurrentState}), new Throwable[0]);
                    startTracking();
                }
                constraintListener.onConstraintChanged(this.mCurrentState);
            }
        }
    }

    public void removeListener(ConstraintListener<T> constraintListener) {
        synchronized (this.mLock) {
            if (this.mListeners.remove(constraintListener) && this.mListeners.isEmpty()) {
                stopTracking();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setState(T r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            T r1 = r3.mCurrentState     // Catch:{ all -> 0x0037 }
            if (r1 == r4) goto L_0x0035
            T r1 = r3.mCurrentState     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0014
            T r1 = r3.mCurrentState     // Catch:{ all -> 0x0037 }
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0014
            goto L_0x0035
        L_0x0014:
            r3.mCurrentState = r4     // Catch:{ all -> 0x0037 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0037 }
            java.util.Set<androidx.work.impl.constraints.ConstraintListener<T>> r1 = r3.mListeners     // Catch:{ all -> 0x0037 }
            r4.<init>(r1)     // Catch:{ all -> 0x0037 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0037 }
        L_0x0021:
            boolean r1 = r4.hasNext()     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0033
            java.lang.Object r1 = r4.next()     // Catch:{ all -> 0x0037 }
            androidx.work.impl.constraints.ConstraintListener r1 = (androidx.work.impl.constraints.ConstraintListener) r1     // Catch:{ all -> 0x0037 }
            T r2 = r3.mCurrentState     // Catch:{ all -> 0x0037 }
            r1.onConstraintChanged(r2)     // Catch:{ all -> 0x0037 }
            goto L_0x0021
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return
        L_0x0037:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.constraints.trackers.ConstraintTracker.setState(java.lang.Object):void");
    }
}
