package com.google.android.play.core.tasks;

import com.google.android.play.core.internal.C2258ax;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class Tasks {
    private Tasks() {
    }

    /* renamed from: a */
    public static <ResultT> Task<ResultT> m1599a(ResultT resultt) {
        C2419m mVar = new C2419m();
        mVar.mo34079a(resultt);
        return mVar;
    }

    public static <ResultT> ResultT await(Task<ResultT> task) throws ExecutionException, InterruptedException {
        C2258ax.m1183d(task, "Task must not be null");
        if (task.isComplete()) {
            return m1601c(task);
        }
        C2420n nVar = new C2420n((byte[]) null);
        m1602d(task, nVar);
        nVar.mo34083a();
        return m1601c(task);
    }

    public static <ResultT> ResultT await(Task<ResultT> task, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C2258ax.m1183d(task, "Task must not be null");
        C2258ax.m1183d(timeUnit, "TimeUnit must not be null");
        if (task.isComplete()) {
            return m1601c(task);
        }
        C2420n nVar = new C2420n((byte[]) null);
        m1602d(task, nVar);
        if (nVar.mo34084b(j, timeUnit)) {
            return m1601c(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* renamed from: b */
    public static <ResultT> Task<ResultT> m1600b(Exception exc) {
        C2419m mVar = new C2419m();
        mVar.mo34081c(exc);
        return mVar;
    }

    /* renamed from: c */
    private static <ResultT> ResultT m1601c(Task<ResultT> task) throws ExecutionException {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    /* renamed from: d */
    private static void m1602d(Task<?> task, C2420n nVar) {
        task.addOnSuccessListener(TaskExecutors.f2199a, nVar);
        task.addOnFailureListener(TaskExecutors.f2199a, nVar);
    }
}
