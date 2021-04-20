package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.text.TextUtils;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.WorkManagerImpl;
import java.util.HashMap;
import java.util.Map;

public class SystemJobService extends JobService implements ExecutionListener {
    private static final String TAG = Logger.tagWithPrefix("SystemJobService");
    private final Map<String, JobParameters> mJobParameters = new HashMap();
    private WorkManagerImpl mWorkManagerImpl;

    public void onCreate() {
        super.onCreate();
        this.mWorkManagerImpl = WorkManagerImpl.getInstance();
        WorkManagerImpl workManagerImpl = this.mWorkManagerImpl;
        if (workManagerImpl != null) {
            workManagerImpl.getProcessor().addExecutionListener(this);
        } else if (Application.class.equals(getApplication().getClass())) {
            Logger.get().warning(TAG, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        } else {
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        WorkManagerImpl workManagerImpl = this.mWorkManagerImpl;
        if (workManagerImpl != null) {
            workManagerImpl.getProcessor().removeExecutionListener(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0073, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0078, code lost:
        if (android.os.Build.VERSION.SDK_INT < 24) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007a, code lost:
        r2 = new androidx.work.WorkerParameters.RuntimeExtras();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0083, code lost:
        if (r9.getTriggeredContentUris() == null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0085, code lost:
        r2.triggeredContentUris = java.util.Arrays.asList(r9.getTriggeredContentUris());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0093, code lost:
        if (r9.getTriggeredContentAuthorities() == null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0095, code lost:
        r2.triggeredContentAuthorities = java.util.Arrays.asList(r9.getTriggeredContentAuthorities());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a3, code lost:
        if (android.os.Build.VERSION.SDK_INT < 28) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a5, code lost:
        r2.network = r9.getNetwork();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ab, code lost:
        r8.mWorkManagerImpl.startWork(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b0, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r9) {
        /*
            r8 = this;
            androidx.work.impl.WorkManagerImpl r0 = r8.mWorkManagerImpl
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0017
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r3 = TAG
            java.lang.Throwable[] r4 = new java.lang.Throwable[r2]
            java.lang.String r5 = "WorkManager is not initialized; requesting retry."
            r0.debug(r3, r5, r4)
            r8.jobFinished(r9, r1)
            return r2
        L_0x0017:
            android.os.PersistableBundle r0 = r9.getExtras()
            java.lang.String r3 = "EXTRA_WORK_SPEC_ID"
            java.lang.String r0 = r0.getString(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x0035
            androidx.work.Logger r9 = androidx.work.Logger.get()
            java.lang.String r0 = TAG
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]
            java.lang.String r3 = "WorkSpec id not found!"
            r9.error(r0, r3, r1)
            return r2
        L_0x0035:
            java.util.Map<java.lang.String, android.app.job.JobParameters> r3 = r8.mJobParameters
            monitor-enter(r3)
            java.util.Map<java.lang.String, android.app.job.JobParameters> r4 = r8.mJobParameters     // Catch:{ all -> 0x00b1 }
            boolean r4 = r4.containsKey(r0)     // Catch:{ all -> 0x00b1 }
            if (r4 == 0) goto L_0x0057
            androidx.work.Logger r9 = androidx.work.Logger.get()     // Catch:{ all -> 0x00b1 }
            java.lang.String r4 = TAG     // Catch:{ all -> 0x00b1 }
            java.lang.String r5 = "Job is already being executed by SystemJobService: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00b1 }
            r1[r2] = r0     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = java.lang.String.format(r5, r1)     // Catch:{ all -> 0x00b1 }
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x00b1 }
            r9.debug(r4, r0, r1)     // Catch:{ all -> 0x00b1 }
            monitor-exit(r3)     // Catch:{ all -> 0x00b1 }
            return r2
        L_0x0057:
            androidx.work.Logger r4 = androidx.work.Logger.get()     // Catch:{ all -> 0x00b1 }
            java.lang.String r5 = TAG     // Catch:{ all -> 0x00b1 }
            java.lang.String r6 = "onStartJob for %s"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ all -> 0x00b1 }
            r7[r2] = r0     // Catch:{ all -> 0x00b1 }
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch:{ all -> 0x00b1 }
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x00b1 }
            r4.debug(r5, r6, r2)     // Catch:{ all -> 0x00b1 }
            java.util.Map<java.lang.String, android.app.job.JobParameters> r2 = r8.mJobParameters     // Catch:{ all -> 0x00b1 }
            r2.put(r0, r9)     // Catch:{ all -> 0x00b1 }
            monitor-exit(r3)     // Catch:{ all -> 0x00b1 }
            r2 = 0
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r3 < r4) goto L_0x00ab
            androidx.work.WorkerParameters$RuntimeExtras r2 = new androidx.work.WorkerParameters$RuntimeExtras
            r2.<init>()
            android.net.Uri[] r3 = r9.getTriggeredContentUris()
            if (r3 == 0) goto L_0x008f
            android.net.Uri[] r3 = r9.getTriggeredContentUris()
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.triggeredContentUris = r3
        L_0x008f:
            java.lang.String[] r3 = r9.getTriggeredContentAuthorities()
            if (r3 == 0) goto L_0x009f
            java.lang.String[] r3 = r9.getTriggeredContentAuthorities()
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.triggeredContentAuthorities = r3
        L_0x009f:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 < r4) goto L_0x00ab
            android.net.Network r9 = r9.getNetwork()
            r2.network = r9
        L_0x00ab:
            androidx.work.impl.WorkManagerImpl r9 = r8.mWorkManagerImpl
            r9.startWork(r0, r2)
            return r1
        L_0x00b1:
            r9 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00b1 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public boolean onStopJob(JobParameters jobParameters) {
        if (this.mWorkManagerImpl == null) {
            Logger.get().debug(TAG, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String string = jobParameters.getExtras().getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            Logger.get().error(TAG, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        Logger.get().debug(TAG, String.format("onStopJob for %s", new Object[]{string}), new Throwable[0]);
        synchronized (this.mJobParameters) {
            this.mJobParameters.remove(string);
        }
        this.mWorkManagerImpl.stopWork(string);
        return !this.mWorkManagerImpl.getProcessor().isCancelled(string);
    }

    public void onExecuted(String str, boolean z) {
        JobParameters remove;
        Logger.get().debug(TAG, String.format("%s executed on JobScheduler", new Object[]{str}), new Throwable[0]);
        synchronized (this.mJobParameters) {
            remove = this.mJobParameters.remove(str);
        }
        if (remove != null) {
            jobFinished(remove, z);
        }
    }
}
