package com.yandex.metrica.push.impl;

import android.app.NotificationChannel;
import android.content.Context;
import com.yandex.metrica.C4300p;
import com.yandex.metrica.push.PushService;

/* renamed from: com.yandex.metrica.push.impl.f */
public final class C4389f {

    /* renamed from: a */
    private static volatile C4389f f5509a;

    /* renamed from: b */
    private static final Object f5510b = new Object();

    /* renamed from: c */
    private final Context f5511c;

    /* renamed from: d */
    private final Object f5512d = new Object();

    /* renamed from: e */
    private boolean f5513e = false;

    /* renamed from: f */
    private C4394j f5514f;

    /* renamed from: g */
    private String f5515g;

    /* renamed from: h */
    private C4396l f5516h;

    /* renamed from: a */
    public static C4389f m6484a(Context context) {
        if (f5509a == null) {
            synchronized (f5510b) {
                if (f5509a == null) {
                    f5509a = new C4389f(context.getApplicationContext());
                }
            }
        }
        return f5509a;
    }

    private C4389f(Context context) {
        this.f5511c = context;
        C4379ca.m6456c().mo42020a((C4377bz) new C4375bx(this.f5511c, "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"));
        this.f5516h = new C4390g(this.f5511c, this);
    }

    /* renamed from: a */
    public void mo42025a(String str) {
        this.f5515g = str;
        mo42031f().mo42043f().mo41966a(m6486n().mo41984a(str, m6485m().mo42217a()));
    }

    /* renamed from: b */
    public void mo42027b(String str) {
        this.f5515g = str;
        mo42031f().mo42043f().mo41969b(m6486n().mo41984a(str, m6485m().mo42217a()));
    }

    /* renamed from: b */
    public C4394j mo42026b() {
        return this.f5514f;
    }

    /* renamed from: c */
    public String mo42028c() {
        return this.f5515g;
    }

    /* renamed from: d */
    public C4392i mo42029d() {
        return mo42031f().mo42046i();
    }

    /* renamed from: e */
    public C4391h mo42030e() {
        return mo42031f().mo42045h();
    }

    /* renamed from: f */
    public C4396l mo42031f() {
        return this.f5516h;
    }

    /* renamed from: g */
    public boolean mo42032g() {
        boolean z;
        synchronized (this.f5512d) {
            z = this.f5513e;
        }
        return z;
    }

    /* renamed from: h */
    public C4412v mo42033h() {
        return mo42031f().mo42049l();
    }

    /* renamed from: i */
    public NotificationChannel mo42034i() {
        return mo42033h().mo42214a();
    }

    /* renamed from: m */
    private C4416x m6485m() {
        return mo42031f().mo42047j();
    }

    /* renamed from: n */
    private C4357bg m6486n() {
        return mo42031f().mo42048k();
    }

    /* renamed from: j */
    public C4385d mo42035j() {
        return mo42031f().mo42052o();
    }

    /* renamed from: k */
    public C4335as mo42036k() {
        return mo42031f().mo42051n();
    }

    /* renamed from: l */
    public C4343b mo42037l() {
        return mo42031f().mo42053p();
    }

    /* renamed from: a */
    public void mo42024a() {
        if (mo42031f().mo42050m().mo42011c()) {
            synchronized (this.f5512d) {
                if (!this.f5513e) {
                    C4376by.m6444a("Initializing AppMetrica Push SDK", new Object[0]);
                    C4379ca.m6456c().mo42014a();
                    C4379ca.m6456c().mo42018b();
                    if (C4300p.iifa()) {
                        this.f5514f = new C4395k(this.f5511c).mo41994a();
                        PushService.m6271a(this.f5511c);
                        mo42033h().mo42216c();
                        this.f5515g = mo42030e().mo42067b();
                        this.f5513e = true;
                    } else {
                        throw new IllegalStateException("YandexMetrica isn't initialized. Use YandexMetrica#activate(android.content.Context, String) method to activate. See more at https://tech.yandex.com/appmetrica/doc/mobile-sdk-dg/push/android-initialize-docpage");
                    }
                } else {
                    C4376by.m6446b("AppMetrica Push SDK has already been initialized.", new Object[0]);
                }
            }
            return;
        }
        C4376by.m6444a("Ignore AppMetrica Push SDK initialization from non main process", new Object[0]);
    }
}
