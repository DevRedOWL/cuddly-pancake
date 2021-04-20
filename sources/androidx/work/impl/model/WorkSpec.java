package androidx.work.impl.model;

import android.os.Build;
import androidx.arch.core.util.Function;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class WorkSpec {
    public static final long SCHEDULE_NOT_REQUESTED_YET = -1;
    private static final String TAG = Logger.tagWithPrefix("WorkSpec");
    public static final Function<List<WorkInfoPojo>, List<WorkInfo>> WORK_INFO_MAPPER = new Function<List<WorkInfoPojo>, List<WorkInfo>>() {
        public List<WorkInfo> apply(List<WorkInfoPojo> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (WorkInfoPojo workInfo : list) {
                arrayList.add(workInfo.toWorkInfo());
            }
            return arrayList;
        }
    };
    public long backoffDelayDuration = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
    public BackoffPolicy backoffPolicy = BackoffPolicy.EXPONENTIAL;
    public Constraints constraints = Constraints.NONE;
    public long flexDuration;

    /* renamed from: id */
    public String f138id;
    public long initialDelay;
    public Data input = Data.EMPTY;
    public String inputMergerClassName;
    public long intervalDuration;
    public long minimumRetentionDuration;
    public Data output = Data.EMPTY;
    public long periodStartTime;
    public int runAttemptCount;
    public long scheduleRequestedAt = -1;
    public WorkInfo.State state = WorkInfo.State.ENQUEUED;
    public String workerClassName;

    public WorkSpec(String str, String str2) {
        this.f138id = str;
        this.workerClassName = str2;
    }

    public WorkSpec(WorkSpec workSpec) {
        this.f138id = workSpec.f138id;
        this.workerClassName = workSpec.workerClassName;
        this.state = workSpec.state;
        this.inputMergerClassName = workSpec.inputMergerClassName;
        this.input = new Data(workSpec.input);
        this.output = new Data(workSpec.output);
        this.initialDelay = workSpec.initialDelay;
        this.intervalDuration = workSpec.intervalDuration;
        this.flexDuration = workSpec.flexDuration;
        this.constraints = new Constraints(workSpec.constraints);
        this.runAttemptCount = workSpec.runAttemptCount;
        this.backoffPolicy = workSpec.backoffPolicy;
        this.backoffDelayDuration = workSpec.backoffDelayDuration;
        this.periodStartTime = workSpec.periodStartTime;
        this.minimumRetentionDuration = workSpec.minimumRetentionDuration;
        this.scheduleRequestedAt = workSpec.scheduleRequestedAt;
    }

    public void setBackoffDelayDuration(long j) {
        if (j > WorkRequest.MAX_BACKOFF_MILLIS) {
            Logger.get().warning(TAG, "Backoff delay duration exceeds maximum value", new Throwable[0]);
            j = 18000000;
        }
        if (j < 10000) {
            Logger.get().warning(TAG, "Backoff delay duration less than minimum value", new Throwable[0]);
            j = 10000;
        }
        this.backoffDelayDuration = j;
    }

    public boolean isPeriodic() {
        return this.intervalDuration != 0;
    }

    public boolean isBackedOff() {
        return this.state == WorkInfo.State.ENQUEUED && this.runAttemptCount > 0;
    }

    public void setPeriodic(long j) {
        if (j < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(TAG, String.format("Interval duration lesser than minimum allowed value; Changed to %s", new Object[]{Long.valueOf(PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS)}), new Throwable[0]);
            j = 900000;
        }
        setPeriodic(j, j);
    }

    public void setPeriodic(long j, long j2) {
        if (j < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(TAG, String.format("Interval duration lesser than minimum allowed value; Changed to %s", new Object[]{Long.valueOf(PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS)}), new Throwable[0]);
            j = 900000;
        }
        if (j2 < 300000) {
            Logger.get().warning(TAG, String.format("Flex duration lesser than minimum allowed value; Changed to %s", new Object[]{300000L}), new Throwable[0]);
            j2 = 300000;
        }
        if (j2 > j) {
            Logger.get().warning(TAG, String.format("Flex duration greater than interval duration; Changed to %s", new Object[]{Long.valueOf(j)}), new Throwable[0]);
            j2 = j;
        }
        this.intervalDuration = j;
        this.flexDuration = j2;
    }

    public long calculateNextRunTime() {
        long j;
        boolean z = false;
        if (isBackedOff()) {
            if (this.backoffPolicy == BackoffPolicy.LINEAR) {
                z = true;
            }
            if (z) {
                j = this.backoffDelayDuration * ((long) this.runAttemptCount);
            } else {
                j = (long) Math.scalb((float) this.backoffDelayDuration, this.runAttemptCount - 1);
            }
            return this.periodStartTime + Math.min(WorkRequest.MAX_BACKOFF_MILLIS, j);
        } else if (!isPeriodic()) {
            return this.periodStartTime + this.initialDelay;
        } else {
            if (Build.VERSION.SDK_INT > 22) {
                return (this.periodStartTime + this.intervalDuration) - this.flexDuration;
            }
            if (this.flexDuration != this.intervalDuration) {
                z = true;
            }
            if (!z) {
                return this.periodStartTime + this.intervalDuration;
            }
            long j2 = this.periodStartTime == 0 ? -1 * this.flexDuration : 0;
            long j3 = this.periodStartTime;
            if (j3 == 0) {
                j3 = System.currentTimeMillis();
            }
            return j3 + this.intervalDuration + j2;
        }
    }

    public boolean hasConstraints() {
        return !Constraints.NONE.equals(this.constraints);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkSpec workSpec = (WorkSpec) obj;
        if (this.initialDelay != workSpec.initialDelay || this.intervalDuration != workSpec.intervalDuration || this.flexDuration != workSpec.flexDuration || this.runAttemptCount != workSpec.runAttemptCount || this.backoffDelayDuration != workSpec.backoffDelayDuration || this.periodStartTime != workSpec.periodStartTime || this.minimumRetentionDuration != workSpec.minimumRetentionDuration || this.scheduleRequestedAt != workSpec.scheduleRequestedAt || !this.f138id.equals(workSpec.f138id) || this.state != workSpec.state || !this.workerClassName.equals(workSpec.workerClassName)) {
            return false;
        }
        String str = this.inputMergerClassName;
        if (str == null ? workSpec.inputMergerClassName != null : !str.equals(workSpec.inputMergerClassName)) {
            return false;
        }
        if (this.input.equals(workSpec.input) && this.output.equals(workSpec.output) && this.constraints.equals(workSpec.constraints) && this.backoffPolicy == workSpec.backoffPolicy) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f138id.hashCode() * 31) + this.state.hashCode()) * 31) + this.workerClassName.hashCode()) * 31;
        String str = this.inputMergerClassName;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j = this.initialDelay;
        long j2 = this.intervalDuration;
        long j3 = this.flexDuration;
        long j4 = this.backoffDelayDuration;
        long j5 = this.periodStartTime;
        long j6 = this.minimumRetentionDuration;
        long j7 = this.scheduleRequestedAt;
        return ((((((((((((((((((((((((hashCode + hashCode2) * 31) + this.input.hashCode()) * 31) + this.output.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.constraints.hashCode()) * 31) + this.runAttemptCount) * 31) + this.backoffPolicy.hashCode()) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)));
    }

    public String toString() {
        return "{WorkSpec: " + this.f138id + "}";
    }

    public static class IdAndState {

        /* renamed from: id */
        public String f139id;
        public WorkInfo.State state;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            IdAndState idAndState = (IdAndState) obj;
            if (this.state != idAndState.state) {
                return false;
            }
            return this.f139id.equals(idAndState.f139id);
        }

        public int hashCode() {
            return (this.f139id.hashCode() * 31) + this.state.hashCode();
        }
    }

    public static class WorkInfoPojo {

        /* renamed from: id */
        public String f140id;
        public Data output;
        public WorkInfo.State state;
        public List<String> tags;

        public WorkInfo toWorkInfo() {
            return new WorkInfo(UUID.fromString(this.f140id), this.state, this.output, this.tags);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            WorkInfoPojo workInfoPojo = (WorkInfoPojo) obj;
            String str = this.f140id;
            if (str == null ? workInfoPojo.f140id != null : !str.equals(workInfoPojo.f140id)) {
                return false;
            }
            if (this.state != workInfoPojo.state) {
                return false;
            }
            Data data = this.output;
            if (data == null ? workInfoPojo.output != null : !data.equals(workInfoPojo.output)) {
                return false;
            }
            List<String> list = this.tags;
            List<String> list2 = workInfoPojo.tags;
            if (list != null) {
                return list.equals(list2);
            }
            if (list2 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f140id;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            WorkInfo.State state2 = this.state;
            int hashCode2 = (hashCode + (state2 != null ? state2.hashCode() : 0)) * 31;
            Data data = this.output;
            int hashCode3 = (hashCode2 + (data != null ? data.hashCode() : 0)) * 31;
            List<String> list = this.tags;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode3 + i;
        }
    }
}
