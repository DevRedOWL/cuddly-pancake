package com.yandex.metrica.impl.p039ob;

import android.location.Location;

/* renamed from: com.yandex.metrica.impl.ob.op */
class C3790op {

    /* renamed from: a */
    private String f3979a;

    /* renamed from: b */
    private C3774oh f3980b;

    /* renamed from: c */
    private C3771oe f3981c;

    /* renamed from: d */
    private Location f3982d;

    /* renamed from: e */
    private long f3983e;

    /* renamed from: f */
    private C3305cw f3984f;

    /* renamed from: g */
    private C3802ow f3985g;

    /* renamed from: h */
    private C3770od f3986h;

    public C3790op(String str, C3774oh ohVar, C3771oe oeVar, C3802ow owVar, C3770od odVar) {
        this(str, ohVar, oeVar, (Location) null, 0, new C3305cw(), owVar, odVar);
    }

    C3790op(String str, C3774oh ohVar, C3771oe oeVar, Location location, long j, C3305cw cwVar, C3802ow owVar, C3770od odVar) {
        this.f3979a = str;
        this.f3980b = ohVar;
        this.f3981c = oeVar;
        this.f3982d = location;
        this.f3983e = j;
        this.f3984f = cwVar;
        this.f3985g = owVar;
        this.f3986h = odVar;
    }

    /* renamed from: a */
    public void mo40783a(Location location) {
        if (m4389d(location)) {
            m4386b(location);
            m4387c(location);
            m4385b();
            m4384a();
        }
    }

    /* renamed from: a */
    private void m4384a() {
        this.f3986h.mo40741a();
    }

    /* renamed from: b */
    private void m4385b() {
        this.f3985g.mo40816a();
    }

    /* renamed from: b */
    private void m4386b(Location location) {
        this.f3982d = location;
        this.f3983e = System.currentTimeMillis();
    }

    /* renamed from: c */
    private void m4387c(Location location) {
        this.f3981c.mo40743a(this.f3979a, location, this.f3980b);
    }

    /* renamed from: d */
    private boolean m4389d(Location location) {
        if (!(location == null || this.f3980b == null)) {
            if (this.f3982d == null) {
                return true;
            }
            boolean c = m4388c();
            boolean e = m4390e(location);
            boolean f = m4391f(location);
            if ((c || e) && f) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private boolean m4388c() {
        return this.f3984f.mo39866b(this.f3983e, this.f3980b.f3910e, "isSavedLocationOutdated");
    }

    /* renamed from: e */
    private boolean m4390e(Location location) {
        return m4392g(location) > this.f3980b.f3911f;
    }

    /* renamed from: f */
    private boolean m4391f(Location location) {
        return this.f3982d == null || location.getTime() - this.f3982d.getTime() >= 0;
    }

    /* renamed from: g */
    private float m4392g(Location location) {
        return location.distanceTo(this.f3982d);
    }

    /* renamed from: a */
    public void mo40784a(C3774oh ohVar) {
        this.f3980b = ohVar;
    }
}
