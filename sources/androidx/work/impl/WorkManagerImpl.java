package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.work.C0660R;
import androidx.work.Configuration;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger;
import androidx.work.OneTimeWorkRequest;
import androidx.work.Operation;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkContinuation;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.greedy.GreedyScheduler;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.CancelWorkRunnable;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.LiveDataUtils;
import androidx.work.impl.utils.Preferences;
import androidx.work.impl.utils.PruneWorkRunnable;
import androidx.work.impl.utils.StartWorkRunnable;
import androidx.work.impl.utils.StatusRunnable;
import androidx.work.impl.utils.StopWorkRunnable;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class WorkManagerImpl extends WorkManager {
    public static final int MAX_PRE_JOB_SCHEDULER_API_LEVEL = 22;
    public static final int MIN_JOB_SCHEDULER_API_LEVEL = 23;
    private static WorkManagerImpl sDefaultInstance;
    private static WorkManagerImpl sDelegatedInstance;
    private static final Object sLock = new Object();
    private Configuration mConfiguration;
    private Context mContext;
    private boolean mForceStopRunnableCompleted;
    private final WorkManagerLiveDataTracker mLiveDataTracker;
    private Preferences mPreferences;
    private Processor mProcessor;
    private BroadcastReceiver.PendingResult mRescheduleReceiverResult;
    private List<Scheduler> mSchedulers;
    private WorkDatabase mWorkDatabase;
    private TaskExecutor mWorkTaskExecutor;

    public static void setDelegate(WorkManagerImpl workManagerImpl) {
        synchronized (sLock) {
            sDelegatedInstance = workManagerImpl;
        }
    }

    public static WorkManagerImpl getInstance() {
        synchronized (sLock) {
            if (sDelegatedInstance != null) {
                WorkManagerImpl workManagerImpl = sDelegatedInstance;
                return workManagerImpl;
            }
            WorkManagerImpl workManagerImpl2 = sDefaultInstance;
            return workManagerImpl2;
        }
    }

    public static void initialize(Context context, Configuration configuration) {
        synchronized (sLock) {
            if (sDelegatedInstance != null) {
                if (sDefaultInstance != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class levelJavadoc for more information.");
                }
            }
            if (sDelegatedInstance == null) {
                Context applicationContext = context.getApplicationContext();
                if (sDefaultInstance == null) {
                    sDefaultInstance = new WorkManagerImpl(applicationContext, configuration, new WorkManagerTaskExecutor());
                }
                sDelegatedInstance = sDefaultInstance;
            }
        }
    }

    public WorkManagerImpl(Context context, Configuration configuration, TaskExecutor taskExecutor) {
        this(context, configuration, taskExecutor, context.getResources().getBoolean(C0660R.bool.workmanager_test_configuration));
    }

    public WorkManagerImpl(Context context, Configuration configuration, TaskExecutor taskExecutor, boolean z) {
        this.mLiveDataTracker = new WorkManagerLiveDataTracker();
        Context applicationContext = context.getApplicationContext();
        WorkDatabase create = WorkDatabase.create(applicationContext, z);
        Logger.setLogger(new Logger.LogcatLogger(configuration.getMinimumLoggingLevel()));
        Context context2 = context;
        Configuration configuration2 = configuration;
        TaskExecutor taskExecutor2 = taskExecutor;
        WorkDatabase workDatabase = create;
        List<Scheduler> createSchedulers = createSchedulers(applicationContext);
        internalInit(context2, configuration2, taskExecutor2, workDatabase, createSchedulers, new Processor(context2, configuration2, taskExecutor2, workDatabase, createSchedulers));
    }

    public WorkManagerImpl(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, List<Scheduler> list, Processor processor) {
        this.mLiveDataTracker = new WorkManagerLiveDataTracker();
        internalInit(context, configuration, taskExecutor, workDatabase, list, processor);
    }

    public Context getApplicationContext() {
        return this.mContext;
    }

    public WorkDatabase getWorkDatabase() {
        return this.mWorkDatabase;
    }

    public Configuration getConfiguration() {
        return this.mConfiguration;
    }

    public List<Scheduler> getSchedulers() {
        return this.mSchedulers;
    }

    public Processor getProcessor() {
        return this.mProcessor;
    }

    public TaskExecutor getWorkTaskExecutor() {
        return this.mWorkTaskExecutor;
    }

    public Preferences getPreferences() {
        return this.mPreferences;
    }

    public Operation enqueue(List<? extends WorkRequest> list) {
        if (!list.isEmpty()) {
            return new WorkContinuationImpl(this, list).enqueue();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public WorkContinuation beginWith(List<OneTimeWorkRequest> list) {
        if (!list.isEmpty()) {
            return new WorkContinuationImpl(this, list);
        }
        throw new IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
    }

    public WorkContinuation beginUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, List<OneTimeWorkRequest> list) {
        if (!list.isEmpty()) {
            return new WorkContinuationImpl(this, str, existingWorkPolicy, list);
        }
        throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
    }

    public Operation enqueueUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, List<OneTimeWorkRequest> list) {
        return new WorkContinuationImpl(this, str, existingWorkPolicy, list).enqueue();
    }

    public Operation enqueueUniquePeriodicWork(String str, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, PeriodicWorkRequest periodicWorkRequest) {
        return createWorkContinuationForUniquePeriodicWork(str, existingPeriodicWorkPolicy, periodicWorkRequest).enqueue();
    }

    private WorkContinuationImpl createWorkContinuationForUniquePeriodicWork(String str, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, PeriodicWorkRequest periodicWorkRequest) {
        ExistingWorkPolicy existingWorkPolicy;
        if (existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.KEEP) {
            existingWorkPolicy = ExistingWorkPolicy.KEEP;
        } else {
            existingWorkPolicy = ExistingWorkPolicy.REPLACE;
        }
        return new WorkContinuationImpl(this, str, existingWorkPolicy, Collections.singletonList(periodicWorkRequest));
    }

    public Operation cancelWorkById(UUID uuid) {
        CancelWorkRunnable forId = CancelWorkRunnable.forId(uuid, this);
        this.mWorkTaskExecutor.executeOnBackgroundThread(forId);
        return forId.getOperation();
    }

    public Operation cancelAllWorkByTag(String str) {
        CancelWorkRunnable forTag = CancelWorkRunnable.forTag(str, this);
        this.mWorkTaskExecutor.executeOnBackgroundThread(forTag);
        return forTag.getOperation();
    }

    public Operation cancelUniqueWork(String str) {
        CancelWorkRunnable forName = CancelWorkRunnable.forName(str, this, true);
        this.mWorkTaskExecutor.executeOnBackgroundThread(forName);
        return forName.getOperation();
    }

    public Operation cancelAllWork() {
        CancelWorkRunnable forAll = CancelWorkRunnable.forAll(this);
        this.mWorkTaskExecutor.executeOnBackgroundThread(forAll);
        return forAll.getOperation();
    }

    public LiveData<Long> getLastCancelAllTimeMillisLiveData() {
        return this.mPreferences.getLastCancelAllTimeMillisLiveData();
    }

    public ListenableFuture<Long> getLastCancelAllTimeMillis() {
        final SettableFuture create = SettableFuture.create();
        final Preferences preferences = this.mPreferences;
        this.mWorkTaskExecutor.executeOnBackgroundThread(new Runnable() {
            public void run() {
                try {
                    create.set(Long.valueOf(preferences.getLastCancelAllTimeMillis()));
                } catch (Throwable th) {
                    create.setException(th);
                }
            }
        });
        return create;
    }

    public Operation pruneWork() {
        PruneWorkRunnable pruneWorkRunnable = new PruneWorkRunnable(this);
        this.mWorkTaskExecutor.executeOnBackgroundThread(pruneWorkRunnable);
        return pruneWorkRunnable.getOperation();
    }

    public LiveData<WorkInfo> getWorkInfoByIdLiveData(UUID uuid) {
        return this.mLiveDataTracker.track(LiveDataUtils.dedupedMappedLiveDataFor(this.mWorkDatabase.workSpecDao().getWorkStatusPojoLiveDataForIds(Collections.singletonList(uuid.toString())), new Function<List<WorkSpec.WorkInfoPojo>, WorkInfo>() {
            public WorkInfo apply(List<WorkSpec.WorkInfoPojo> list) {
                if (list == null || list.size() <= 0) {
                    return null;
                }
                return list.get(0).toWorkInfo();
            }
        }, this.mWorkTaskExecutor));
    }

    public ListenableFuture<WorkInfo> getWorkInfoById(UUID uuid) {
        StatusRunnable<WorkInfo> forUUID = StatusRunnable.forUUID(this, uuid);
        this.mWorkTaskExecutor.getBackgroundExecutor().execute(forUUID);
        return forUUID.getFuture();
    }

    public LiveData<List<WorkInfo>> getWorkInfosByTagLiveData(String str) {
        return this.mLiveDataTracker.track(LiveDataUtils.dedupedMappedLiveDataFor(this.mWorkDatabase.workSpecDao().getWorkStatusPojoLiveDataForTag(str), WorkSpec.WORK_INFO_MAPPER, this.mWorkTaskExecutor));
    }

    public ListenableFuture<List<WorkInfo>> getWorkInfosByTag(String str) {
        StatusRunnable<List<WorkInfo>> forTag = StatusRunnable.forTag(this, str);
        this.mWorkTaskExecutor.getBackgroundExecutor().execute(forTag);
        return forTag.getFuture();
    }

    public LiveData<List<WorkInfo>> getWorkInfosForUniqueWorkLiveData(String str) {
        return this.mLiveDataTracker.track(LiveDataUtils.dedupedMappedLiveDataFor(this.mWorkDatabase.workSpecDao().getWorkStatusPojoLiveDataForName(str), WorkSpec.WORK_INFO_MAPPER, this.mWorkTaskExecutor));
    }

    public ListenableFuture<List<WorkInfo>> getWorkInfosForUniqueWork(String str) {
        StatusRunnable<List<WorkInfo>> forUniqueWork = StatusRunnable.forUniqueWork(this, str);
        this.mWorkTaskExecutor.getBackgroundExecutor().execute(forUniqueWork);
        return forUniqueWork.getFuture();
    }

    /* access modifiers changed from: package-private */
    public LiveData<List<WorkInfo>> getWorkInfosById(List<String> list) {
        return this.mLiveDataTracker.track(LiveDataUtils.dedupedMappedLiveDataFor(this.mWorkDatabase.workSpecDao().getWorkStatusPojoLiveDataForIds(list), WorkSpec.WORK_INFO_MAPPER, this.mWorkTaskExecutor));
    }

    public void startWork(String str) {
        startWork(str, (WorkerParameters.RuntimeExtras) null);
    }

    public void startWork(String str, WorkerParameters.RuntimeExtras runtimeExtras) {
        this.mWorkTaskExecutor.executeOnBackgroundThread(new StartWorkRunnable(this, str, runtimeExtras));
    }

    public void stopWork(String str) {
        this.mWorkTaskExecutor.executeOnBackgroundThread(new StopWorkRunnable(this, str));
    }

    public void rescheduleEligibleWork() {
        if (Build.VERSION.SDK_INT >= 23) {
            SystemJobScheduler.jobSchedulerCancelAll(getApplicationContext());
        }
        getWorkDatabase().workSpecDao().resetScheduledState();
        Schedulers.schedule(getConfiguration(), getWorkDatabase(), getSchedulers());
    }

    public void onForceStopRunnableCompleted() {
        synchronized (sLock) {
            this.mForceStopRunnableCompleted = true;
            if (this.mRescheduleReceiverResult != null) {
                this.mRescheduleReceiverResult.finish();
                this.mRescheduleReceiverResult = null;
            }
        }
    }

    public void setReschedulePendingResult(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (sLock) {
            this.mRescheduleReceiverResult = pendingResult;
            if (this.mForceStopRunnableCompleted) {
                this.mRescheduleReceiverResult.finish();
                this.mRescheduleReceiverResult = null;
            }
        }
    }

    private void internalInit(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, List<Scheduler> list, Processor processor) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.mConfiguration = configuration;
        this.mWorkTaskExecutor = taskExecutor;
        this.mWorkDatabase = workDatabase;
        this.mSchedulers = list;
        this.mProcessor = processor;
        this.mPreferences = new Preferences(this.mContext);
        this.mForceStopRunnableCompleted = false;
        this.mWorkTaskExecutor.executeOnBackgroundThread(new ForceStopRunnable(applicationContext, this));
    }

    public List<Scheduler> createSchedulers(Context context) {
        return Arrays.asList(new Scheduler[]{Schedulers.createBestAvailableBackgroundScheduler(context, this), new GreedyScheduler(context, this)});
    }
}
