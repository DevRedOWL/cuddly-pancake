package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.jb */
public final class C3546jb {

    /* renamed from: a */
    private final C3557jh f3445a;

    /* renamed from: b */
    private final Integer f3446b;

    private C3546jb(C3548a aVar) {
        this.f3445a = aVar.f3447a;
        this.f3446b = aVar.f3448b;
    }

    /* renamed from: a */
    public static final C3548a m3562a(C3557jh jhVar) {
        return new C3548a(jhVar);
    }

    /* renamed from: a */
    public C3557jh mo40270a() {
        return this.f3445a;
    }

    /* renamed from: b */
    public Integer mo40271b() {
        return this.f3446b;
    }

    /* renamed from: com.yandex.metrica.impl.ob.jb$a */
    static final class C3548a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C3557jh f3447a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Integer f3448b;

        private C3548a(C3557jh jhVar) {
            this.f3447a = jhVar;
        }

        /* renamed from: a */
        public C3548a mo40272a(int i) {
            this.f3448b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: a */
        public C3546jb mo40273a() {
            return new C3546jb(this);
        }
    }
}
