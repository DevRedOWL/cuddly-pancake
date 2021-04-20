package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.IdGenerator;
import java.util.List;

public class SystemJobScheduler implements Scheduler {
    private static final String TAG = Logger.tagWithPrefix("SystemJobScheduler");
    private final IdGenerator mIdGenerator;
    private final JobScheduler mJobScheduler;
    private final SystemJobInfoConverter mSystemJobInfoConverter;
    private final WorkManagerImpl mWorkManager;

    public SystemJobScheduler(Context context, WorkManagerImpl workManagerImpl) {
        this(context, workManagerImpl, (JobScheduler) context.getSystemService("jobscheduler"), new SystemJobInfoConverter(context));
    }

    public SystemJobScheduler(Context context, WorkManagerImpl workManagerImpl, JobScheduler jobScheduler, SystemJobInfoConverter systemJobInfoConverter) {
        this.mWorkManager = workManagerImpl;
        this.mJobScheduler = jobScheduler;
        this.mIdGenerator = new IdGenerator(context);
        this.mSystemJobInfoConverter = systemJobInfoConverter;
    }

    public void schedule(WorkSpec... workSpecArr) {
        WorkDatabase workDatabase = this.mWorkManager.getWorkDatabase();
        int length = workSpecArr.length;
        int i = 0;
        while (i < length) {
            WorkSpec workSpec = workSpecArr[i];
            workDatabase.beginTransaction();
            try {
                WorkSpec workSpec2 = workDatabase.workSpecDao().getWorkSpec(workSpec.f138id);
                if (workSpec2 == null) {
                    Logger logger = Logger.get();
                    String str = TAG;
                    logger.warning(str, "Skipping scheduling " + workSpec.f138id + " because it's no longer in the DB", new Throwable[0]);
                } else if (workSpec2.state != WorkInfo.State.ENQUEUED) {
                    Logger logger2 = Logger.get();
                    String str2 = TAG;
                    logger2.warning(str2, "Skipping scheduling " + workSpec.f138id + " because it is no longer enqueued", new Throwable[0]);
                } else {
                    SystemIdInfo systemIdInfo = workDatabase.systemIdInfoDao().getSystemIdInfo(workSpec.f138id);
                    if (systemIdInfo == null || getPendingJobInfo(this.mJobScheduler, workSpec.f138id) == null) {
                        int nextJobSchedulerIdWithRange = systemIdInfo != null ? systemIdInfo.systemId : this.mIdGenerator.nextJobSchedulerIdWithRange(this.mWorkManager.getConfiguration().getMinJobSchedulerId(), this.mWorkManager.getConfiguration().getMaxJobSchedulerId());
                        if (systemIdInfo == null) {
                            this.mWorkManager.getWorkDatabase().systemIdInfoDao().insertSystemIdInfo(new SystemIdInfo(workSpec.f138id, nextJobSchedulerIdWithRange));
                        }
                        scheduleInternal(workSpec, nextJobSchedulerIdWithRange);
                        if (Build.VERSION.SDK_INT == 23) {
                            scheduleInternal(workSpec, this.mIdGenerator.nextJobSchedulerIdWithRange(this.mWorkManager.getConfiguration().getMinJobSchedulerId(), this.mWorkManager.getConfiguration().getMaxJobSchedulerId()));
                        }
                        workDatabase.setTransactionSuccessful();
                    } else {
                        Logger.get().debug(TAG, String.format("Skipping scheduling %s because JobScheduler is aware of it already.", new Object[]{workSpec.f138id}), new Throwable[0]);
                    }
                }
                i++;
            } finally {
                workDatabase.endTransaction();
            }
        }
    }

    public void scheduleInternal(WorkSpec workSpec, int i) {
        JobInfo convert = this.mSystemJobInfoConverter.convert(workSpec, i);
        Logger.get().debug(TAG, String.format("Scheduling work ID %s Job ID %s", new Object[]{workSpec.f138id, Integer.valueOf(i)}), new Throwable[0]);
        this.mJobScheduler.schedule(convert);
    }

    public void cancel(String str) {
        List<JobInfo> allPendingJobs = this.mJobScheduler.getAllPendingJobs();
        if (allPendingJobs != null) {
            for (JobInfo next : allPendingJobs) {
                if (str.equals(next.getExtras().getString("EXTRA_WORK_SPEC_ID"))) {
                    this.mWorkManager.getWorkDatabase().systemIdInfoDao().removeSystemIdInfo(str);
                    this.mJobScheduler.cancel(next.getId());
                    if (Build.VERSION.SDK_INT != 23) {
                        return;
                    }
                }
            }
        }
    }

    public static void jobSchedulerCancelAll(Context context) {
        List<JobInfo> allPendingJobs;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (allPendingJobs = jobScheduler.getAllPendingJobs()) != null) {
            for (JobInfo next : allPendingJobs) {
                if (next.getExtras().containsKey("EXTRA_WORK_SPEC_ID")) {
                    jobScheduler.cancel(next.getId());
                }
            }
        }
    }

    private static JobInfo getPendingJobInfo(JobScheduler jobScheduler, String str) {
        List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
        if (allPendingJobs == null) {
            return null;
        }
        for (JobInfo next : allPendingJobs) {
            PersistableBundle extras = next.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID") && str.equals(extras.getString("EXTRA_WORK_SPEC_ID"))) {
                return next;
            }
        }
        return null;
    }
}
