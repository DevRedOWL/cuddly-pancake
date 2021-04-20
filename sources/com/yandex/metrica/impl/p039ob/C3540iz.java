package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.iz */
public class C3540iz {

    /* renamed from: a */
    private final C3557jh f3425a;

    /* renamed from: b */
    private final Long f3426b;

    /* renamed from: c */
    private final Long f3427c;

    /* renamed from: d */
    private final Integer f3428d;

    /* renamed from: e */
    private final Long f3429e;

    /* renamed from: f */
    private final Boolean f3430f;

    /* renamed from: g */
    private final Long f3431g;

    /* renamed from: h */
    private final Long f3432h;

    private C3540iz(C3542a aVar) {
        this.f3425a = aVar.f3434b;
        this.f3428d = aVar.f3437e;
        this.f3426b = aVar.f3435c;
        this.f3427c = aVar.f3436d;
        this.f3429e = aVar.f3438f;
        this.f3430f = aVar.f3439g;
        this.f3431g = aVar.f3440h;
        this.f3432h = aVar.f3433a;
    }

    /* renamed from: a */
    public static final C3542a m3536a(C3546jb jbVar) {
        return new C3542a(jbVar);
    }

    /* renamed from: a */
    public C3557jh mo40255a() {
        return this.f3425a;
    }

    /* renamed from: a */
    public long mo40254a(long j) {
        Long l = this.f3426b;
        return l == null ? j : l.longValue();
    }

    /* renamed from: b */
    public long mo40257b(long j) {
        Long l = this.f3427c;
        return l == null ? j : l.longValue();
    }

    /* renamed from: a */
    public int mo40253a(int i) {
        Integer num = this.f3428d;
        return num == null ? i : num.intValue();
    }

    /* renamed from: c */
    public long mo40258c(long j) {
        Long l = this.f3429e;
        return l == null ? j : l.longValue();
    }

    /* renamed from: a */
    public boolean mo40256a(boolean z) {
        Boolean bool = this.f3430f;
        return bool == null ? z : bool.booleanValue();
    }

    /* renamed from: d */
    public long mo40259d(long j) {
        Long l = this.f3431g;
        return l == null ? j : l.longValue();
    }

    /* renamed from: e */
    public long mo40260e(long j) {
        Long l = this.f3432h;
        return l == null ? j : l.longValue();
    }

    /* renamed from: com.yandex.metrica.impl.ob.iz$a */
    static final class C3542a {

        /* renamed from: a */
        public Long f3433a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C3557jh f3434b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Long f3435c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Long f3436d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Integer f3437e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public Long f3438f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public Boolean f3439g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public Long f3440h;

        private C3542a(C3546jb jbVar) {
            this.f3434b = jbVar.mo40270a();
            this.f3437e = jbVar.mo40271b();
        }

        /* renamed from: a */
        public C3542a mo40262a(Long l) {
            this.f3435c = l;
            return this;
        }

        /* renamed from: b */
        public C3542a mo40264b(Long l) {
            this.f3436d = l;
            return this;
        }

        /* renamed from: c */
        public C3542a mo40265c(Long l) {
            this.f3438f = l;
            return this;
        }

        /* renamed from: a */
        public C3542a mo40261a(Boolean bool) {
            this.f3439g = bool;
            return this;
        }

        /* renamed from: d */
        public C3542a mo40266d(Long l) {
            this.f3440h = l;
            return this;
        }

        /* renamed from: e */
        public C3542a mo40267e(Long l) {
            this.f3433a = l;
            return this;
        }

        /* renamed from: a */
        public C3540iz mo40263a() {
            return new C3540iz(this);
        }
    }
}
