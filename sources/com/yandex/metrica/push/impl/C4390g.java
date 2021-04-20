package com.yandex.metrica.push.impl;

import android.content.Context;
import com.yandex.metrica.push.impl.C4312a;

/* renamed from: com.yandex.metrica.push.impl.g */
public class C4390g implements C4396l {

    /* renamed from: a */
    private final Object f5517a = new Object();

    /* renamed from: b */
    private volatile C4322ai f5518b;

    /* renamed from: c */
    private volatile C4323aj f5519c;

    /* renamed from: d */
    private volatile C4422z f5520d;

    /* renamed from: e */
    private volatile C4410t f5521e;

    /* renamed from: f */
    private volatile C4318ae f5522f;

    /* renamed from: g */
    private volatile C4358bh f5523g;

    /* renamed from: h */
    private volatile C4312a f5524h;

    /* renamed from: i */
    private volatile C4391h f5525i;

    /* renamed from: j */
    private volatile C4392i f5526j;

    /* renamed from: k */
    private volatile C4416x f5527k;

    /* renamed from: l */
    private volatile C4357bg f5528l;

    /* renamed from: m */
    private volatile C4412v f5529m;

    /* renamed from: n */
    private volatile C4373bw f5530n;

    /* renamed from: o */
    private volatile C4335as f5531o;

    /* renamed from: p */
    private C4385d f5532p;

    /* renamed from: q */
    private C4343b f5533q;

    /* renamed from: r */
    private final Context f5534r;

    /* renamed from: s */
    private final C4389f f5535s;

    public C4390g(Context context, C4389f fVar) {
        this.f5534r = context;
        this.f5535s = fVar;
    }

    /* renamed from: a */
    public C4322ai mo42038a() {
        if (this.f5518b == null) {
            synchronized (this.f5517a) {
                if (this.f5518b == null) {
                    this.f5518b = new C4320ag();
                }
            }
        }
        return this.f5518b;
    }

    /* renamed from: b */
    public C4323aj mo42039b() {
        if (this.f5519c == null) {
            synchronized (this.f5517a) {
                if (this.f5519c == null) {
                    this.f5519c = new C4321ah();
                }
            }
        }
        return this.f5519c;
    }

    /* renamed from: c */
    public C4422z mo42040c() {
        if (this.f5520d == null) {
            synchronized (this.f5517a) {
                if (this.f5520d == null) {
                    this.f5520d = new C4408r();
                }
            }
        }
        return this.f5520d;
    }

    /* renamed from: d */
    public C4410t mo42041d() {
        if (this.f5521e == null) {
            synchronized (this.f5517a) {
                if (this.f5521e == null) {
                    this.f5521e = new C4409s();
                }
            }
        }
        return this.f5521e;
    }

    /* renamed from: e */
    public C4318ae mo42042e() {
        if (this.f5522f == null) {
            synchronized (this.f5517a) {
                if (this.f5522f == null) {
                    this.f5522f = new C4316ac();
                    this.f5522f.mo41956a(new C4315ab());
                    this.f5522f.mo41957b(new C4319af());
                    this.f5522f.mo41958c(new C4314aa());
                }
            }
        }
        return this.f5522f;
    }

    /* renamed from: f */
    public C4358bh mo42043f() {
        if (this.f5523g == null) {
            synchronized (this.f5517a) {
                if (this.f5523g == null) {
                    this.f5523g = new C4355be();
                }
            }
        }
        return this.f5523g;
    }

    /* renamed from: g */
    public C4312a mo42044g() {
        if (this.f5524h == null) {
            synchronized (this.f5517a) {
                if (this.f5524h == null) {
                    this.f5524h = new C4312a.C4313a().mo41953a();
                }
            }
        }
        return this.f5524h;
    }

    /* renamed from: h */
    public C4391h mo42045h() {
        if (this.f5525i == null) {
            synchronized (this.f5517a) {
                if (this.f5525i == null) {
                    this.f5525i = new C4391h(this.f5534r);
                }
            }
        }
        return this.f5525i;
    }

    /* renamed from: i */
    public C4392i mo42046i() {
        if (this.f5526j == null) {
            C4391h h = mo42045h();
            synchronized (this.f5517a) {
                if (this.f5526j == null) {
                    this.f5526j = new C4392i(h);
                }
            }
        }
        return this.f5526j;
    }

    /* renamed from: j */
    public C4416x mo42047j() {
        if (this.f5527k == null) {
            synchronized (this.f5517a) {
                if (this.f5527k == null) {
                    this.f5527k = new C4416x(this.f5534r);
                }
            }
        }
        return this.f5527k;
    }

    /* renamed from: k */
    public C4357bg mo42048k() {
        if (this.f5528l == null) {
            synchronized (this.f5517a) {
                if (this.f5528l == null) {
                    this.f5528l = new C4357bg();
                }
            }
        }
        return this.f5528l;
    }

    /* renamed from: l */
    public C4412v mo42049l() {
        if (this.f5529m == null) {
            synchronized (this.f5517a) {
                if (this.f5529m == null) {
                    this.f5529m = new C4412v(this.f5534r);
                }
            }
        }
        return this.f5529m;
    }

    /* renamed from: m */
    public C4373bw mo42050m() {
        if (this.f5530n == null) {
            synchronized (this.f5517a) {
                if (this.f5530n == null) {
                    this.f5530n = new C4373bw();
                }
            }
        }
        return this.f5530n;
    }

    /* renamed from: n */
    public C4335as mo42051n() {
        if (this.f5531o == null) {
            synchronized (this.f5517a) {
                if (this.f5531o == null) {
                    this.f5531o = new C4335as(this.f5534r, this.f5535s);
                }
            }
        }
        return this.f5531o;
    }

    /* renamed from: o */
    public C4385d mo42052o() {
        return this.f5532p;
    }

    /* renamed from: p */
    public C4343b mo42053p() {
        return this.f5533q;
    }
}
