package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C4063sy;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.bp */
public abstract class C3209bp<T extends C4063sy> extends C3212bs<T> {

    /* renamed from: j */
    private final C4251xb f2733j;

    /* renamed from: k */
    private final C4200vm f2734k;

    /* renamed from: l */
    private final C4228wh f2735l;

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract void mo39692E();

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public abstract void mo39693F();

    public C3209bp(T t) {
        this(new C3117ab(), new C4242wu(), new C4200vm(), new C4227wg(), t);
    }

    public C3209bp(C3207bn bnVar, C4251xb xbVar, C4200vm vmVar, C4228wh whVar, T t) {
        super(bnVar, t);
        this.f2733j = xbVar;
        this.f2734k = vmVar;
        this.f2735l = whVar;
        t.mo41415a(this.f2733j);
    }

    /* renamed from: d */
    public void mo39669d() {
        super.mo39669d();
        mo39653a(this.f2735l.mo41768a());
    }

    /* renamed from: b */
    public boolean mo39666b() {
        boolean b = super.mo39666b();
        if (b) {
            mo39692E();
        } else if (mo39681p()) {
            mo39693F();
        }
        return b;
    }

    /* renamed from: c */
    public boolean mo39694c(byte[] bArr) {
        byte[] a;
        try {
            byte[] a2 = this.f2734k.mo41695a(bArr);
            if (a2 == null || (a = this.f2733j.mo41791a(a2)) == null) {
                return false;
            }
            mo39663a(a);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void mo39663a(byte[] bArr) {
        super.mo39663a(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo39681p() {
        return mo39676k() == 400;
    }
}
