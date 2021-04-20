package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3402et;

/* renamed from: com.yandex.metrica.impl.ob.gl */
public class C3461gl<T, C extends C3402et> {

    /* renamed from: a */
    private final C3470gr<T> f3316a;

    /* renamed from: b */
    private final C f3317b;

    /* renamed from: com.yandex.metrica.impl.ob.gl$a */
    protected interface C3462a<T> {
        /* renamed from: a */
        boolean mo40157a(T t, C4217w wVar);
    }

    protected C3461gl(C3470gr<T> grVar, C c) {
        this.f3316a = grVar;
        this.f3317b = c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo40156a(C4217w wVar, C3462a<T> aVar) {
        for (Object a : mo40155a(wVar).mo40159a()) {
            if (aVar.mo40157a(a, wVar)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C3466go<T> mo40155a(C4217w wVar) {
        return this.f3316a.mo40158a(wVar.mo41736g());
    }
}
