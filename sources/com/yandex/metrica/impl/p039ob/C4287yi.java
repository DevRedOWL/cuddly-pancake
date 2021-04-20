package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.yi */
public final class C4287yi {

    /* renamed from: a */
    private final Class<? extends C4289yk> f5347a;

    /* renamed from: b */
    private final boolean f5348b;

    /* renamed from: c */
    private final String f5349c;

    private C4287yi(C4289yk<?> ykVar, boolean z, String str) {
        this.f5347a = ykVar.getClass();
        this.f5348b = z;
        this.f5349c = str;
    }

    /* renamed from: a */
    public final boolean mo41869a() {
        return this.f5348b;
    }

    /* renamed from: b */
    public final String mo41870b() {
        return this.f5349c;
    }

    /* renamed from: a */
    public static final C4287yi m6197a(C4289yk<?> ykVar) {
        return new C4287yi(ykVar, true, "");
    }

    /* renamed from: a */
    public static final C4287yi m6198a(C4289yk<?> ykVar, String str) {
        return new C4287yi(ykVar, false, str);
    }
}
