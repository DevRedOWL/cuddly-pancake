package com.yandex.metrica.impl.p039ob;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.xg */
public class C4256xg implements C4258xi {

    /* renamed from: a */
    private final Looper f5306a;

    /* renamed from: b */
    private final Handler f5307b;

    /* renamed from: c */
    private final C4260xk f5308c;

    public C4256xg(String str) {
        this(m6093a(str));
    }

    /* renamed from: a */
    public Handler mo41806a() {
        return this.f5307b;
    }

    /* renamed from: b */
    public Looper mo41811b() {
        return this.f5306a;
    }

    /* renamed from: a */
    public void mo41808a(Runnable runnable) {
        this.f5307b.post(runnable);
    }

    /* renamed from: a */
    public <T> Future<T> mo41807a(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        mo41808a((Runnable) futureTask);
        return futureTask;
    }

    /* renamed from: a */
    public void mo41809a(Runnable runnable, long j) {
        mo41810a(runnable, j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public void mo41810a(Runnable runnable, long j, TimeUnit timeUnit) {
        this.f5307b.postDelayed(runnable, timeUnit.toMillis(j));
    }

    /* renamed from: b */
    public void mo41812b(Runnable runnable) {
        this.f5307b.removeCallbacks(runnable);
    }

    /* renamed from: c */
    public boolean mo41813c() {
        return this.f5308c.mo41813c();
    }

    /* renamed from: a */
    private static C4260xk m6093a(String str) {
        C4260xk a = new C4262xm(str).mo41815a();
        a.start();
        return a;
    }

    C4256xg(C4260xk xkVar) {
        this(xkVar, xkVar.getLooper(), new Handler(xkVar.getLooper()));
    }

    public C4256xg(C4260xk xkVar, Looper looper, Handler handler) {
        this.f5308c = xkVar;
        this.f5306a = looper;
        this.f5307b = handler;
    }
}
