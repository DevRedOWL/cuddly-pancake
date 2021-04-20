package androidx.work.impl.utils.taskexecutor;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class WorkManagerTaskExecutor implements TaskExecutor {
    private final ExecutorService mBackgroundExecutor = Executors.newSingleThreadExecutor(this.mBackgroundThreadFactory);
    private final ThreadFactory mBackgroundThreadFactory = new ThreadFactory() {
        private int mThreadsCreated = 0;

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkManagerTaskExecutor-thread-" + this.mThreadsCreated);
            this.mThreadsCreated = this.mThreadsCreated + 1;
            WorkManagerTaskExecutor.this.mCurrentBackgroundExecutorThread = newThread;
            return newThread;
        }
    };
    volatile Thread mCurrentBackgroundExecutorThread;
    private final Executor mMainThreadExecutor = new Executor() {
        public void execute(Runnable runnable) {
            WorkManagerTaskExecutor.this.postToMainThread(runnable);
        }
    };
    private final Handler mMainThreadHandler = new Handler(Looper.getMainLooper());

    public void postToMainThread(Runnable runnable) {
        this.mMainThreadHandler.post(runnable);
    }

    public Executor getMainThreadExecutor() {
        return this.mMainThreadExecutor;
    }

    public void executeOnBackgroundThread(Runnable runnable) {
        this.mBackgroundExecutor.execute(runnable);
    }

    public Executor getBackgroundExecutor() {
        return this.mBackgroundExecutor;
    }

    public Thread getBackgroundExecutorThread() {
        return this.mCurrentBackgroundExecutorThread;
    }
}
