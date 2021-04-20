package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3356dt;

/* renamed from: com.yandex.metrica.impl.ob.dv */
public class C3358dv<T extends C3356dt> {

    /* renamed from: a */
    private final C3357du<T> f3085a;

    /* renamed from: b */
    private final C3355ds<T> f3086b;

    private C3358dv(C3360a aVar) {
        this.f3085a = aVar.f3087a;
        this.f3086b = aVar.f3088b;
    }

    /* renamed from: a */
    public void mo39936a(C3356dt dtVar) {
        this.f3085a.mo39399a(dtVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo39937b(C3356dt dtVar) {
        C3355ds<T> dsVar = this.f3086b;
        if (dsVar == null) {
            return false;
        }
        return dsVar.mo39612a(dtVar);
    }

    /* renamed from: a */
    public static <T extends C3356dt> C3360a<T> m3057a(C3357du<T> duVar) {
        return new C3360a<>(duVar);
    }

    /* renamed from: com.yandex.metrica.impl.ob.dv$a */
    public static final class C3360a<T extends C3356dt> {

        /* renamed from: a */
        final C3357du<T> f3087a;

        /* renamed from: b */
        C3355ds<T> f3088b;

        C3360a(C3357du<T> duVar) {
            this.f3087a = duVar;
        }

        /* renamed from: a */
        public C3360a<T> mo39938a(C3355ds<T> dsVar) {
            this.f3088b = dsVar;
            return this;
        }

        /* renamed from: a */
        public C3358dv<T> mo39939a() {
            return new C3358dv<>(this);
        }
    }
}
