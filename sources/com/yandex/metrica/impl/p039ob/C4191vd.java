package com.yandex.metrica.impl.p039ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.vd */
public class C4191vd extends C4154ut {

    /* renamed from: a */
    private int f5234a;

    /* renamed from: b */
    private C4154ut f5235b;

    public C4191vd(Context context, C4257xh xhVar) {
        this(context.getApplicationContext(), new C4281yc(), xhVar);
    }

    C4191vd(Context context, C4281yc ycVar, C4257xh xhVar) {
        if (ycVar.mo41866b(context, "android.hardware.telephony")) {
            this.f5235b = new C4170ux(context, xhVar);
        } else {
            this.f5235b = new C4175uy();
        }
    }

    /* renamed from: a */
    public synchronized void mo41644a() {
        this.f5234a++;
        if (this.f5234a == 1) {
            this.f5235b.mo41644a();
        }
    }

    /* renamed from: b */
    public synchronized void mo41645b() {
        this.f5234a--;
        if (this.f5234a == 0) {
            this.f5235b.mo41645b();
        }
    }

    /* renamed from: a */
    public synchronized void mo41617a(C4194vg vgVar) {
        this.f5235b.mo41617a(vgVar);
    }

    /* renamed from: a */
    public synchronized void mo41616a(C4161uv uvVar) {
        this.f5235b.mo41616a(uvVar);
    }

    /* renamed from: a */
    public void mo41618a(boolean z) {
        this.f5235b.mo41618a(z);
    }

    /* renamed from: a */
    public void mo41615a(C4143uk ukVar) {
        this.f5235b.mo41615a(ukVar);
    }
}
