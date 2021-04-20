package androidx.work.impl.background.systemalarm;

import androidx.work.Logger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

class WorkTimer {
    private static final String TAG = Logger.tagWithPrefix("WorkTimer");
    private final ThreadFactory mBackgroundThreadFactory = new ThreadFactory() {
        private int mThreadsCreated = 0;

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.mThreadsCreated);
            this.mThreadsCreated = this.mThreadsCreated + 1;
            return newThread;
        }
    };
    private final ScheduledExecutorService mExecutorService = Executors.newSingleThreadScheduledExecutor(this.mBackgroundThreadFactory);
    final Map<String, TimeLimitExceededListener> mListeners = new HashMap();
    final Object mLock = new Object();
    final Map<String, WorkTimerRunnable> mTimerMap = new HashMap();

    interface TimeLimitExceededListener {
        void onTimeLimitExceeded(String str);
    }

    WorkTimer() {
    }

    /* access modifiers changed from: package-private */
    public void startTimer(String str, long j, TimeLimitExceededListener timeLimitExceededListener) {
        synchronized (this.mLock) {
            Logger.get().debug(TAG, String.format("Starting timer for %s", new Object[]{str}), new Throwable[0]);
            stopTimer(str);
            WorkTimerRunnable workTimerRunnable = new WorkTimerRunnable(this, str);
            this.mTimerMap.put(str, workTimerRunnable);
            this.mListeners.put(str, timeLimitExceededListener);
            this.mExecutorService.schedule(workTimerRunnable, j, TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: package-private */
    public void stopTimer(String str) {
        synchronized (this.mLock) {
            if (this.mTimerMap.remove(str) != null) {
                Logger.get().debug(TAG, String.format("Stopping timer for %s", new Object[]{str}), new Throwable[0]);
                this.mListeners.remove(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized Map<String, WorkTimerRunnable> getTimerMap() {
        return this.mTimerMap;
    }

    /* access modifiers changed from: package-private */
    public synchronized Map<String, TimeLimitExceededListener> getListeners() {
        return this.mListeners;
    }

    static class WorkTimerRunnable implements Runnable {
        static final String TAG = "WrkTimerRunnable";
        private final String mWorkSpecId;
        private final WorkTimer mWorkTimer;

        WorkTimerRunnable(WorkTimer workTimer, String str) {
            this.mWorkTimer = workTimer;
            this.mWorkSpecId = str;
        }

        public void run() {
            synchronized (this.mWorkTimer.mLock) {
                if (this.mWorkTimer.mTimerMap.remove(this.mWorkSpecId) != null) {
                    TimeLimitExceededListener remove = this.mWorkTimer.mListeners.remove(this.mWorkSpecId);
                    if (remove != null) {
                        remove.onTimeLimitExceeded(this.mWorkSpecId);
                    }
                } else {
                    Logger.get().debug(TAG, String.format("Timer with %s is already marked as complete.", new Object[]{this.mWorkSpecId}), new Throwable[0]);
                }
            }
        }
    }
}
