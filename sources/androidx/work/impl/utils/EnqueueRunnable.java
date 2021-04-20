package androidx.work.impl.utils;

import android.text.TextUtils;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.Operation;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.List;

public class EnqueueRunnable implements Runnable {
    private static final String TAG = Logger.tagWithPrefix("EnqueueRunnable");
    private final OperationImpl mOperation = new OperationImpl();
    private final WorkContinuationImpl mWorkContinuation;

    public EnqueueRunnable(WorkContinuationImpl workContinuationImpl) {
        this.mWorkContinuation = workContinuationImpl;
    }

    public void run() {
        try {
            if (!this.mWorkContinuation.hasCycles()) {
                if (addToDatabase()) {
                    PackageManagerHelper.setComponentEnabled(this.mWorkContinuation.getWorkManagerImpl().getApplicationContext(), RescheduleReceiver.class, true);
                    scheduleWorkInBackground();
                }
                this.mOperation.setState(Operation.SUCCESS);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", new Object[]{this.mWorkContinuation}));
        } catch (Throwable th) {
            this.mOperation.setState(new Operation.State.FAILURE(th));
        }
    }

    public Operation getOperation() {
        return this.mOperation;
    }

    public boolean addToDatabase() {
        WorkDatabase workDatabase = this.mWorkContinuation.getWorkManagerImpl().getWorkDatabase();
        workDatabase.beginTransaction();
        try {
            boolean processContinuation = processContinuation(this.mWorkContinuation);
            workDatabase.setTransactionSuccessful();
            return processContinuation;
        } finally {
            workDatabase.endTransaction();
        }
    }

    public void scheduleWorkInBackground() {
        WorkManagerImpl workManagerImpl = this.mWorkContinuation.getWorkManagerImpl();
        Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
    }

    private static boolean processContinuation(WorkContinuationImpl workContinuationImpl) {
        List<WorkContinuationImpl> parents = workContinuationImpl.getParents();
        boolean z = false;
        if (parents != null) {
            boolean z2 = false;
            for (WorkContinuationImpl next : parents) {
                if (!next.isEnqueued()) {
                    z2 |= processContinuation(next);
                } else {
                    Logger.get().warning(TAG, String.format("Already enqueued work ids (%s).", new Object[]{TextUtils.join(", ", next.getIds())}), new Throwable[0]);
                }
            }
            z = z2;
        }
        return enqueueContinuation(workContinuationImpl) | z;
    }

    private static boolean enqueueContinuation(WorkContinuationImpl workContinuationImpl) {
        boolean enqueueWorkWithPrerequisites = enqueueWorkWithPrerequisites(workContinuationImpl.getWorkManagerImpl(), workContinuationImpl.getWork(), (String[]) WorkContinuationImpl.prerequisitesFor(workContinuationImpl).toArray(new String[0]), workContinuationImpl.getName(), workContinuationImpl.getExistingWorkPolicy());
        workContinuationImpl.markEnqueued();
        return enqueueWorkWithPrerequisites;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x019c A[LOOP:6: B:102:0x0196->B:104:0x019c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01c5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x016f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean enqueueWorkWithPrerequisites(androidx.work.impl.WorkManagerImpl r16, java.util.List<? extends androidx.work.WorkRequest> r17, java.lang.String[] r18, java.lang.String r19, androidx.work.ExistingWorkPolicy r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            long r3 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r5 = r16.getWorkDatabase()
            r6 = 0
            r7 = 1
            if (r0 == 0) goto L_0x0017
            int r8 = r0.length
            if (r8 <= 0) goto L_0x0017
            r8 = 1
            goto L_0x0018
        L_0x0017:
            r8 = 0
        L_0x0018:
            if (r8 == 0) goto L_0x005b
            int r9 = r0.length
            r10 = 0
            r11 = 1
            r12 = 0
            r13 = 0
        L_0x001f:
            if (r10 >= r9) goto L_0x005e
            r14 = r0[r10]
            androidx.work.impl.model.WorkSpecDao r15 = r5.workSpecDao()
            androidx.work.impl.model.WorkSpec r15 = r15.getWorkSpec(r14)
            if (r15 != 0) goto L_0x0043
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = TAG
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r2[r6] = r14
            java.lang.String r3 = "Prerequisite %s doesn't exist; not enqueuing"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r6]
            r0.error(r1, r2, r3)
            return r6
        L_0x0043:
            androidx.work.WorkInfo$State r14 = r15.state
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.SUCCEEDED
            if (r14 != r15) goto L_0x004b
            r15 = 1
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            r11 = r11 & r15
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.FAILED
            if (r14 != r15) goto L_0x0053
            r12 = 1
            goto L_0x0058
        L_0x0053:
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.CANCELLED
            if (r14 != r15) goto L_0x0058
            r13 = 1
        L_0x0058:
            int r10 = r10 + 1
            goto L_0x001f
        L_0x005b:
            r11 = 1
            r12 = 0
            r13 = 0
        L_0x005e:
            boolean r9 = android.text.TextUtils.isEmpty(r19)
            r9 = r9 ^ r7
            if (r9 == 0) goto L_0x0069
            if (r8 != 0) goto L_0x0069
            r10 = 1
            goto L_0x006a
        L_0x0069:
            r10 = 0
        L_0x006a:
            if (r10 == 0) goto L_0x0113
            androidx.work.impl.model.WorkSpecDao r10 = r5.workSpecDao()
            java.util.List r10 = r10.getWorkSpecIdAndStatesForName(r1)
            boolean r14 = r10.isEmpty()
            if (r14 != 0) goto L_0x0113
            androidx.work.ExistingWorkPolicy r14 = androidx.work.ExistingWorkPolicy.APPEND
            if (r2 != r14) goto L_0x00cd
            androidx.work.impl.model.DependencyDao r2 = r5.dependencyDao()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x008b:
            boolean r14 = r10.hasNext()
            if (r14 == 0) goto L_0x00c0
            java.lang.Object r14 = r10.next()
            androidx.work.impl.model.WorkSpec$IdAndState r14 = (androidx.work.impl.model.WorkSpec.IdAndState) r14
            java.lang.String r15 = r14.f139id
            boolean r15 = r2.hasDependents(r15)
            if (r15 != 0) goto L_0x00be
            androidx.work.WorkInfo$State r15 = r14.state
            androidx.work.WorkInfo$State r7 = androidx.work.WorkInfo.State.SUCCEEDED
            if (r15 != r7) goto L_0x00a7
            r7 = 1
            goto L_0x00a8
        L_0x00a7:
            r7 = 0
        L_0x00a8:
            r7 = r7 & r11
            androidx.work.WorkInfo$State r11 = r14.state
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.FAILED
            if (r11 != r15) goto L_0x00b1
            r12 = 1
            goto L_0x00b8
        L_0x00b1:
            androidx.work.WorkInfo$State r11 = r14.state
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.CANCELLED
            if (r11 != r15) goto L_0x00b8
            r13 = 1
        L_0x00b8:
            java.lang.String r11 = r14.f139id
            r8.add(r11)
            r11 = r7
        L_0x00be:
            r7 = 1
            goto L_0x008b
        L_0x00c0:
            java.lang.Object[] r0 = r8.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            int r2 = r0.length
            if (r2 <= 0) goto L_0x00cb
            r8 = 1
            goto L_0x0113
        L_0x00cb:
            r8 = 0
            goto L_0x0113
        L_0x00cd:
            androidx.work.ExistingWorkPolicy r7 = androidx.work.ExistingWorkPolicy.KEEP
            if (r2 != r7) goto L_0x00ee
            java.util.Iterator r2 = r10.iterator()
        L_0x00d5:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x00ee
            java.lang.Object r7 = r2.next()
            androidx.work.impl.model.WorkSpec$IdAndState r7 = (androidx.work.impl.model.WorkSpec.IdAndState) r7
            androidx.work.WorkInfo$State r14 = r7.state
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.ENQUEUED
            if (r14 == r15) goto L_0x00ed
            androidx.work.WorkInfo$State r7 = r7.state
            androidx.work.WorkInfo$State r14 = androidx.work.WorkInfo.State.RUNNING
            if (r7 != r14) goto L_0x00d5
        L_0x00ed:
            return r6
        L_0x00ee:
            r2 = r16
            androidx.work.impl.utils.CancelWorkRunnable r2 = androidx.work.impl.utils.CancelWorkRunnable.forName(r1, r2, r6)
            r2.run()
            androidx.work.impl.model.WorkSpecDao r2 = r5.workSpecDao()
            java.util.Iterator r7 = r10.iterator()
        L_0x00ff:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x0111
            java.lang.Object r10 = r7.next()
            androidx.work.impl.model.WorkSpec$IdAndState r10 = (androidx.work.impl.model.WorkSpec.IdAndState) r10
            java.lang.String r10 = r10.f139id
            r2.delete(r10)
            goto L_0x00ff
        L_0x0111:
            r2 = 1
            goto L_0x0114
        L_0x0113:
            r2 = 0
        L_0x0114:
            java.util.Iterator r7 = r17.iterator()
        L_0x0118:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x01cc
            java.lang.Object r10 = r7.next()
            androidx.work.WorkRequest r10 = (androidx.work.WorkRequest) r10
            androidx.work.impl.model.WorkSpec r14 = r10.getWorkSpec()
            if (r8 == 0) goto L_0x013f
            if (r11 != 0) goto L_0x013f
            if (r12 == 0) goto L_0x0133
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.FAILED
            r14.state = r15
            goto L_0x0147
        L_0x0133:
            if (r13 == 0) goto L_0x013a
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.CANCELLED
            r14.state = r15
            goto L_0x0147
        L_0x013a:
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.BLOCKED
            r14.state = r15
            goto L_0x0147
        L_0x013f:
            boolean r15 = r14.isPeriodic()
            if (r15 != 0) goto L_0x014a
            r14.periodStartTime = r3
        L_0x0147:
            r16 = r7
            goto L_0x0150
        L_0x014a:
            r16 = r7
            r6 = 0
            r14.periodStartTime = r6
        L_0x0150:
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 23
            if (r6 < r7) goto L_0x015f
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 25
            if (r6 > r7) goto L_0x015f
            tryDelegateConstrainedWorkSpec(r14)
        L_0x015f:
            androidx.work.WorkInfo$State r6 = r14.state
            androidx.work.WorkInfo$State r7 = androidx.work.WorkInfo.State.ENQUEUED
            if (r6 != r7) goto L_0x0166
            r2 = 1
        L_0x0166:
            androidx.work.impl.model.WorkSpecDao r6 = r5.workSpecDao()
            r6.insertWorkSpec(r14)
            if (r8 == 0) goto L_0x018c
            int r6 = r0.length
            r7 = 0
        L_0x0171:
            if (r7 >= r6) goto L_0x018c
            r14 = r0[r7]
            androidx.work.impl.model.Dependency r15 = new androidx.work.impl.model.Dependency
            r18 = r0
            java.lang.String r0 = r10.getStringId()
            r15.<init>(r0, r14)
            androidx.work.impl.model.DependencyDao r0 = r5.dependencyDao()
            r0.insertDependency(r15)
            int r7 = r7 + 1
            r0 = r18
            goto L_0x0171
        L_0x018c:
            r18 = r0
            java.util.Set r0 = r10.getTags()
            java.util.Iterator r0 = r0.iterator()
        L_0x0196:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x01b3
            java.lang.Object r6 = r0.next()
            java.lang.String r6 = (java.lang.String) r6
            androidx.work.impl.model.WorkTagDao r7 = r5.workTagDao()
            androidx.work.impl.model.WorkTag r14 = new androidx.work.impl.model.WorkTag
            java.lang.String r15 = r10.getStringId()
            r14.<init>(r6, r15)
            r7.insert(r14)
            goto L_0x0196
        L_0x01b3:
            if (r9 == 0) goto L_0x01c5
            androidx.work.impl.model.WorkNameDao r0 = r5.workNameDao()
            androidx.work.impl.model.WorkName r6 = new androidx.work.impl.model.WorkName
            java.lang.String r7 = r10.getStringId()
            r6.<init>(r1, r7)
            r0.insert(r6)
        L_0x01c5:
            r7 = r16
            r0 = r18
            r6 = 0
            goto L_0x0118
        L_0x01cc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.EnqueueRunnable.enqueueWorkWithPrerequisites(androidx.work.impl.WorkManagerImpl, java.util.List, java.lang.String[], java.lang.String, androidx.work.ExistingWorkPolicy):boolean");
    }

    private static void tryDelegateConstrainedWorkSpec(WorkSpec workSpec) {
        Constraints constraints = workSpec.constraints;
        if (constraints.requiresBatteryNotLow() || constraints.requiresStorageNotLow()) {
            String str = workSpec.workerClassName;
            Data.Builder builder = new Data.Builder();
            builder.putAll(workSpec.input).putString(ConstraintTrackingWorker.ARGUMENT_CLASS_NAME, str);
            workSpec.workerClassName = ConstraintTrackingWorker.class.getName();
            workSpec.input = builder.build();
        }
    }
}
