package com.yandex.metrica.impl.p039ob;

import java.util.HashSet;

/* renamed from: com.yandex.metrica.impl.ob.cs */
public class C3299cs {

    /* renamed from: a */
    private final C3300a f2970a;

    /* renamed from: b */
    private Boolean f2971b;

    /* renamed from: c */
    private final HashSet<String> f2972c = new HashSet<>();

    /* renamed from: d */
    private final HashSet<String> f2973d = new HashSet<>();

    /* renamed from: com.yandex.metrica.impl.ob.cs$a */
    public interface C3300a {
        /* renamed from: a */
        Boolean mo39859a();

        /* renamed from: a */
        void mo39860a(boolean z);
    }

    /* renamed from: com.yandex.metrica.impl.ob.cs$b */
    public static class C3301b implements C3300a {

        /* renamed from: a */
        private final C3690ly f2974a;

        public C3301b(C3690ly lyVar) {
            this.f2974a = lyVar;
        }

        /* renamed from: a */
        public void mo39860a(boolean z) {
            this.f2974a.mo40592e(z).mo40567q();
        }

        /* renamed from: a */
        public Boolean mo39859a() {
            return this.f2974a.mo40598h();
        }
    }

    public C3299cs(C3300a aVar) {
        this.f2970a = aVar;
        this.f2971b = this.f2970a.mo39859a();
    }

    /* renamed from: a */
    public synchronized void mo39853a(Boolean bool) {
        if (C3306cx.m2858a((Object) bool) || this.f2971b == null) {
            this.f2971b = Boolean.valueOf(C4196vi.m5863c(bool));
            this.f2970a.mo39860a(this.f2971b.booleanValue());
        }
    }

    /* renamed from: a */
    public synchronized void mo39854a(String str, Boolean bool) {
        if (C3306cx.m2858a((Object) bool) || (!this.f2973d.contains(str) && !this.f2972c.contains(str))) {
            if (C4232wk.m6040a(bool, true)) {
                this.f2973d.add(str);
                this.f2972c.remove(str);
            } else {
                this.f2972c.add(str);
                this.f2973d.remove(str);
            }
        }
    }

    /* renamed from: a */
    public synchronized boolean mo39855a() {
        boolean z;
        if (this.f2971b == null) {
            z = this.f2973d.isEmpty() && this.f2972c.isEmpty();
        } else {
            z = this.f2971b.booleanValue();
        }
        return z;
    }

    /* renamed from: b */
    public synchronized boolean mo39856b() {
        return this.f2971b == null ? this.f2973d.isEmpty() : this.f2971b.booleanValue();
    }

    /* renamed from: c */
    public synchronized boolean mo39857c() {
        return m2807e();
    }

    /* renamed from: d */
    public synchronized boolean mo39858d() {
        return m2807e();
    }

    /* renamed from: e */
    private boolean m2807e() {
        Boolean bool = this.f2971b;
        if (bool == null) {
            return !this.f2972c.isEmpty() || this.f2973d.isEmpty();
        }
        return bool.booleanValue();
    }
}
