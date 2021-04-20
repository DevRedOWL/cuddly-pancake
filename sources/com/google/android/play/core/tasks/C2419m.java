package com.google.android.play.core.tasks;

import com.google.android.play.core.internal.C2258ax;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.tasks.m */
final class C2419m<ResultT> extends Task<ResultT> {

    /* renamed from: a */
    private final Object f2220a = new Object();

    /* renamed from: b */
    private final C2414h<ResultT> f2221b = new C2414h<>();

    /* renamed from: c */
    private boolean f2222c;

    /* renamed from: d */
    private ResultT f2223d;

    /* renamed from: e */
    private Exception f2224e;

    C2419m() {
    }

    /* renamed from: e */
    private final void m1620e() {
        C2258ax.m1182c(this.f2222c, "Task is not yet complete");
    }

    /* renamed from: f */
    private final void m1621f() {
        C2258ax.m1182c(!this.f2222c, "Task is already complete");
    }

    /* renamed from: g */
    private final void m1622g() {
        synchronized (this.f2220a) {
            if (this.f2222c) {
                this.f2221b.mo34071b(this);
            }
        }
    }

    /* renamed from: a */
    public final void mo34079a(ResultT resultt) {
        synchronized (this.f2220a) {
            m1621f();
            this.f2222c = true;
            this.f2223d = resultt;
        }
        this.f2221b.mo34071b(this);
    }

    public final Task<ResultT> addOnCompleteListener(OnCompleteListener<ResultT> onCompleteListener) {
        this.f2221b.mo34070a(new C2408b(TaskExecutors.MAIN_THREAD, onCompleteListener));
        m1622g();
        return this;
    }

    public final Task<ResultT> addOnCompleteListener(Executor executor, OnCompleteListener<ResultT> onCompleteListener) {
        this.f2221b.mo34070a(new C2408b(executor, onCompleteListener));
        m1622g();
        return this;
    }

    public final Task<ResultT> addOnFailureListener(OnFailureListener onFailureListener) {
        addOnFailureListener(TaskExecutors.MAIN_THREAD, onFailureListener);
        return this;
    }

    public final Task<ResultT> addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        this.f2221b.mo34070a(new C2410d(executor, onFailureListener));
        m1622g();
        return this;
    }

    public final Task<ResultT> addOnSuccessListener(OnSuccessListener<? super ResultT> onSuccessListener) {
        addOnSuccessListener(TaskExecutors.MAIN_THREAD, onSuccessListener);
        return this;
    }

    public final Task<ResultT> addOnSuccessListener(Executor executor, OnSuccessListener<? super ResultT> onSuccessListener) {
        this.f2221b.mo34070a(new C2412f(executor, onSuccessListener));
        m1622g();
        return this;
    }

    /* renamed from: b */
    public final boolean mo34080b(ResultT resultt) {
        synchronized (this.f2220a) {
            if (this.f2222c) {
                return false;
            }
            this.f2222c = true;
            this.f2223d = resultt;
            this.f2221b.mo34071b(this);
            return true;
        }
    }

    /* renamed from: c */
    public final void mo34081c(Exception exc) {
        synchronized (this.f2220a) {
            m1621f();
            this.f2222c = true;
            this.f2224e = exc;
        }
        this.f2221b.mo34071b(this);
    }

    /* renamed from: d */
    public final boolean mo34082d(Exception exc) {
        synchronized (this.f2220a) {
            if (this.f2222c) {
                return false;
            }
            this.f2222c = true;
            this.f2224e = exc;
            this.f2221b.mo34071b(this);
            return true;
        }
    }

    public final Exception getException() {
        Exception exc;
        synchronized (this.f2220a) {
            exc = this.f2224e;
        }
        return exc;
    }

    public final ResultT getResult() {
        ResultT resultt;
        synchronized (this.f2220a) {
            m1620e();
            Exception exc = this.f2224e;
            if (exc == null) {
                resultt = this.f2223d;
            } else {
                throw new RuntimeExecutionException(exc);
            }
        }
        return resultt;
    }

    public final <X extends Throwable> ResultT getResult(Class<X> cls) throws Throwable {
        ResultT resultt;
        synchronized (this.f2220a) {
            m1620e();
            if (!cls.isInstance(this.f2224e)) {
                Exception exc = this.f2224e;
                if (exc == null) {
                    resultt = this.f2223d;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } else {
                throw ((Throwable) cls.cast(this.f2224e));
            }
        }
        return resultt;
    }

    public final boolean isComplete() {
        boolean z;
        synchronized (this.f2220a) {
            z = this.f2222c;
        }
        return z;
    }

    public final boolean isSuccessful() {
        boolean z;
        synchronized (this.f2220a) {
            z = false;
            if (this.f2222c && this.f2224e == null) {
                z = true;
            }
        }
        return z;
    }
}
