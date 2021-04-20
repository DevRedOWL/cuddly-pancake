package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.gk */
public class C3459gk {

    /* renamed from: a */
    private Long f3310a;

    /* renamed from: b */
    private int f3311b;

    /* renamed from: c */
    private C4228wh f3312c;

    /* renamed from: com.yandex.metrica.impl.ob.gk$a */
    public static class C3460a {

        /* renamed from: a */
        public final long f3313a;

        /* renamed from: b */
        public final long f3314b;

        /* renamed from: c */
        public final int f3315c;

        public C3460a(long j, long j2, int i) {
            this.f3313a = j;
            this.f3315c = i;
            this.f3314b = j2;
        }
    }

    public C3459gk() {
        this(new C4227wg());
    }

    public C3459gk(C4228wh whVar) {
        this.f3312c = whVar;
    }

    /* renamed from: a */
    public C3460a mo40154a() {
        if (this.f3310a == null) {
            this.f3310a = Long.valueOf(this.f3312c.mo41769b());
        }
        C3460a aVar = new C3460a(this.f3310a.longValue(), this.f3310a.longValue(), this.f3311b);
        this.f3311b++;
        return aVar;
    }
}
