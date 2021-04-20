package p046io.reactivex.internal.schedulers;

import p046io.reactivex.Scheduler;

/* renamed from: io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport */
public interface SchedulerMultiWorkerSupport {

    /* renamed from: io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport$WorkerCallback */
    public interface WorkerCallback {
        void onWorker(int i, Scheduler.Worker worker);
    }

    void createWorkers(int i, WorkerCallback workerCallback);
}
