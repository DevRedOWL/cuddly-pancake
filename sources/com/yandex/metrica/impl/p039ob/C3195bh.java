package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import java.lang.Thread;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.yandex.metrica.impl.ob.bh */
class C3195bh implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public static final AtomicBoolean f2694a = new AtomicBoolean();

    /* renamed from: b */
    private final CopyOnWriteArrayList<C3601ki> f2695b;

    /* renamed from: c */
    private final Thread.UncaughtExceptionHandler f2696c;

    /* renamed from: d */
    private final C3346dq f2697d;

    /* renamed from: e */
    private final C3127ag f2698e;

    public C3195bh(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Context context) {
        this(uncaughtExceptionHandler, new C3127ag(context));
    }

    C3195bh(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C3127ag agVar) {
        this.f2697d = new C3346dq();
        this.f2695b = new CopyOnWriteArrayList<>();
        this.f2696c = uncaughtExceptionHandler;
        this.f2698e = agVar;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        try {
            f2694a.set(true);
            mo39625a(new C3605kl(th, new C3599kg(new C3344do().mo39917a(thread), this.f2697d.mo39921a(thread)), this.f2698e.mo39464a(), this.f2698e.mo39465b()));
        } finally {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f2696c;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39625a(C3605kl klVar) {
        Iterator<C3601ki> it = this.f2695b.iterator();
        while (it.hasNext()) {
            it.next().mo40349a(klVar);
        }
    }

    /* renamed from: a */
    public void mo39624a(C3601ki kiVar) {
        this.f2695b.add(kiVar);
    }
}
