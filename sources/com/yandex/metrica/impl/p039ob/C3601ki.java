package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.C3090c;

/* renamed from: com.yandex.metrica.impl.ob.ki */
public abstract class C3601ki {

    /* renamed from: a */
    private final C3602a f3546a;

    /* renamed from: b */
    private final C3090c f3547b;

    /* renamed from: com.yandex.metrica.impl.ob.ki$a */
    public interface C3602a {
        /* renamed from: a */
        boolean mo39892a(Throwable th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo40350b(C3605kl klVar);

    C3601ki(C3602a aVar, C3090c cVar) {
        this.f3546a = aVar;
        this.f3547b = cVar;
    }

    /* renamed from: a */
    public void mo40349a(C3605kl klVar) {
        if (this.f3546a.mo39892a(klVar.mo40351a())) {
            Throwable a = klVar.mo40351a();
            C3090c cVar = this.f3547b;
            if (cVar == null || a == null || (a = cVar.mo39349a(a)) != null) {
                mo40350b(new C3605kl(a, klVar.f3557c, klVar.f3558d, klVar.f3559e));
            }
        }
    }
}
