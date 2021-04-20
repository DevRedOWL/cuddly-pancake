package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3391en;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.cc */
public class C3249cc<C extends C3391en> extends C3304cv<C> {

    /* renamed from: d */
    private Runnable f2836d = new Runnable() {
        public void run() {
            C3249cc.this.mo39862e();
        }
    };

    /* renamed from: e */
    private final C4257xh f2837e;

    public C3249cc(C c, C4151uq uqVar, C3203bl blVar, C4257xh xhVar) {
        super(c, uqVar, blVar);
        this.f2837e = xhVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39760a() {
        this.f2837e.mo41812b(this.f2836d);
    }

    /* renamed from: b */
    public void mo39761b() {
        synchronized (this.f2977a) {
            if (!this.f2979c) {
                mo39760a();
                mo39763d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo39762c() {
        super.mo39762c();
        C4051st i = ((C3391en) mo39864g()).mo40025i();
        if (i.mo41350X() && C3306cx.m2860a(i.mo41366c())) {
            try {
                this.f2978b.mo39641a((C3208bo) C3240by.m2491J().mo39744a((C3391en) mo39864g()));
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo39763d() {
        if (((C3391en) mo39864g()).mo40025i().mo41346T() > 0) {
            this.f2837e.mo41809a(this.f2836d, TimeUnit.SECONDS.toMillis((long) ((C3391en) mo39864g()).mo40025i().mo41346T()));
        }
    }
}
