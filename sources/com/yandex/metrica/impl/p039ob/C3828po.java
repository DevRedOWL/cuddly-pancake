package com.yandex.metrica.impl.p039ob;

import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.po */
public class C3828po implements C3830pp {

    /* renamed from: a */
    private final C3830pp f4076a;

    /* renamed from: b */
    private final C3830pp f4077b;

    C3828po(C3830pp ppVar, C3830pp ppVar2) {
        this.f4076a = ppVar;
        this.f4077b = ppVar2;
    }

    /* renamed from: a */
    public boolean mo40843a(String str) {
        return this.f4077b.mo40843a(str) && this.f4076a.mo40843a(str);
    }

    /* renamed from: a */
    public C3829a mo40845a() {
        return new C3829a(this.f4076a, this.f4077b);
    }

    /* renamed from: b */
    public static C3829a m4497b() {
        return new C3829a(new C3831pq(false), new C3839py((List<C3835pu>) null));
    }

    /* renamed from: com.yandex.metrica.impl.ob.po$a */
    public static class C3829a {

        /* renamed from: a */
        private C3830pp f4078a;

        /* renamed from: b */
        private C3830pp f4079b;

        private C3829a() {
        }

        public C3829a(C3830pp ppVar, C3830pp ppVar2) {
            this.f4078a = ppVar;
            this.f4079b = ppVar2;
        }

        /* renamed from: a */
        public C3829a mo40847a(C4143uk ukVar) {
            this.f4079b = new C3839py(ukVar.f5080A);
            return this;
        }

        /* renamed from: a */
        public C3829a mo40848a(boolean z) {
            this.f4078a = new C3831pq(z);
            return this;
        }

        /* renamed from: a */
        public C3828po mo40849a() {
            return new C3828po(this.f4078a, this.f4079b);
        }
    }

    public String toString() {
        return "AskForPermissionsStrategy{mLocationFlagStrategy=" + this.f4076a + ", mStartupStateStrategy=" + this.f4077b + '}';
    }
}
