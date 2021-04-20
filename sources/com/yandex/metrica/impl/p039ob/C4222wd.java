package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.wd */
public class C4222wd {

    /* renamed from: a */
    private volatile long f5268a;

    /* renamed from: b */
    private C3690ly f5269b;

    /* renamed from: c */
    private C4228wh f5270c;

    /* renamed from: com.yandex.metrica.impl.ob.wd$a */
    private static class C4224a {

        /* renamed from: a */
        static C4222wd f5271a = new C4222wd();
    }

    /* renamed from: a */
    public static C4222wd m6001a() {
        return C4224a.f5271a;
    }

    private C4222wd() {
    }

    /* renamed from: b */
    public synchronized long mo41760b() {
        return this.f5268a;
    }

    /* renamed from: a */
    public synchronized void mo41758a(Context context) {
        mo41759a(new C3690ly(C3628ld.m3815a(context).mo40441c()), (C4228wh) new C4227wg());
    }

    /* renamed from: a */
    public synchronized void mo41757a(long j, Long l) {
        this.f5268a = (j - this.f5270c.mo41768a()) / 1000;
        if (this.f5269b.mo40584c(true)) {
            boolean z = false;
            if (l != null) {
                long abs = Math.abs(j - this.f5270c.mo41768a());
                C3690ly lyVar = this.f5269b;
                if (abs > TimeUnit.SECONDS.toMillis(l.longValue())) {
                    z = true;
                }
                lyVar.mo40587d(z);
            } else {
                this.f5269b.mo40587d(false);
            }
        }
        this.f5269b.mo40572a(this.f5268a);
        this.f5269b.mo40567q();
    }

    /* renamed from: c */
    public synchronized void mo41761c() {
        this.f5269b.mo40587d(false);
        this.f5269b.mo40567q();
    }

    /* renamed from: d */
    public synchronized boolean mo41762d() {
        return this.f5269b.mo40584c(true);
    }

    /* renamed from: a */
    public void mo41759a(C3690ly lyVar, C4228wh whVar) {
        this.f5269b = lyVar;
        this.f5268a = this.f5269b.mo40581c(0);
        this.f5270c = whVar;
    }
}
