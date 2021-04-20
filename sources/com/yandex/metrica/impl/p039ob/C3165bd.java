package com.yandex.metrica.impl.p039ob;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: com.yandex.metrica.impl.ob.bd */
public class C3165bd implements C3164bc {

    /* renamed from: a */
    private C4257xh f2635a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3164bc f2636b;

    public C3165bd(C3164bc bcVar) {
        this(C3136al.m1993a().mo39495j().mo41828a(), bcVar);
    }

    /* renamed from: a */
    public void mo39596a() {
        this.f2635a.mo41808a((Runnable) new C4220wb() {
            /* renamed from: a */
            public void mo39603a() {
                C3165bd.this.f2636b.mo39596a();
            }
        });
    }

    /* renamed from: a */
    public void mo39598a(final Intent intent, final int i) {
        this.f2635a.mo41808a((Runnable) new C4220wb() {
            /* renamed from: a */
            public void mo39603a() {
                C3165bd.this.f2636b.mo39598a(intent, i);
            }
        });
    }

    /* renamed from: a */
    public void mo39599a(final Intent intent, final int i, final int i2) {
        this.f2635a.mo41808a((Runnable) new C4220wb() {
            /* renamed from: a */
            public void mo39603a() {
                C3165bd.this.f2636b.mo39599a(intent, i, i2);
            }
        });
    }

    /* renamed from: a */
    public void mo39597a(final Intent intent) {
        this.f2635a.mo41808a((Runnable) new C4220wb() {
            /* renamed from: a */
            public void mo39603a() {
                C3165bd.this.f2636b.mo39597a(intent);
            }
        });
    }

    /* renamed from: b */
    public void mo39601b(final Intent intent) {
        this.f2635a.mo41808a((Runnable) new C4220wb() {
            /* renamed from: a */
            public void mo39603a() {
                C3165bd.this.f2636b.mo39601b(intent);
            }
        });
    }

    /* renamed from: c */
    public void mo39602c(final Intent intent) {
        this.f2635a.mo41808a((Runnable) new C4220wb() {
            /* renamed from: a */
            public void mo39603a() {
                C3165bd.this.f2636b.mo39602c(intent);
            }
        });
    }

    /* renamed from: b */
    public void mo39600b() {
        this.f2635a.mo41808a((Runnable) new C4220wb() {
            /* renamed from: a */
            public void mo39603a() throws Exception {
                C3165bd.this.f2636b.mo39600b();
            }
        });
    }

    /* renamed from: a */
    public void mo39595a(String str, int i, String str2, Bundle bundle) {
        final String str3 = str;
        final int i2 = i;
        final String str4 = str2;
        final Bundle bundle2 = bundle;
        this.f2635a.mo41808a((Runnable) new C4220wb() {
            /* renamed from: a */
            public void mo39603a() throws RemoteException {
                C3165bd.this.f2636b.mo39595a(str3, i2, str4, bundle2);
            }
        });
    }

    /* renamed from: a */
    public void mo39594a(final Bundle bundle) {
        this.f2635a.mo41808a((Runnable) new C4220wb() {
            /* renamed from: a */
            public void mo39603a() throws Exception {
                C3165bd.this.f2636b.mo39594a(bundle);
            }
        });
    }

    C3165bd(C4257xh xhVar, C3164bc bcVar) {
        this.f2635a = xhVar;
        this.f2636b = bcVar;
    }
}
