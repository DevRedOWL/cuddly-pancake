package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.CounterConfiguration;

/* renamed from: com.yandex.metrica.impl.ob.fn */
public class C3427fn {

    /* renamed from: a */
    private final String f3251a;

    /* renamed from: b */
    private final String f3252b;

    /* renamed from: c */
    private final Integer f3253c;

    /* renamed from: d */
    private final String f3254d;

    /* renamed from: e */
    private final CounterConfiguration.C3075a f3255e;

    public C3427fn(String str, String str2, Integer num, String str3, CounterConfiguration.C3075a aVar) {
        this.f3251a = str;
        this.f3252b = str2;
        this.f3253c = num;
        this.f3254d = str3;
        this.f3255e = aVar;
    }

    /* renamed from: a */
    public String mo40110a() {
        return this.f3251a;
    }

    /* renamed from: b */
    public String mo40111b() {
        return this.f3252b;
    }

    /* renamed from: c */
    public Integer mo40112c() {
        return this.f3253c;
    }

    /* renamed from: d */
    public String mo40113d() {
        return this.f3254d;
    }

    /* renamed from: e */
    public CounterConfiguration.C3075a mo40114e() {
        return this.f3255e;
    }

    /* renamed from: a */
    public static C3427fn m3288a(C3369ed edVar) {
        return new C3427fn(edVar.mo39947h().mo39242e(), edVar.mo39946g().mo39962h(), edVar.mo39946g().mo39959e(), edVar.mo39946g().mo39960f(), edVar.mo39947h().mo39257q());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3427fn fnVar = (C3427fn) obj;
        String str = this.f3251a;
        if (str == null ? fnVar.f3251a != null : !str.equals(fnVar.f3251a)) {
            return false;
        }
        if (!this.f3252b.equals(fnVar.f3252b)) {
            return false;
        }
        Integer num = this.f3253c;
        if (num == null ? fnVar.f3253c != null : !num.equals(fnVar.f3253c)) {
            return false;
        }
        String str2 = this.f3254d;
        if (str2 == null ? fnVar.f3254d != null : !str2.equals(fnVar.f3254d)) {
            return false;
        }
        if (this.f3255e == fnVar.f3255e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f3251a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f3252b.hashCode()) * 31;
        Integer num = this.f3253c;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f3254d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f3255e.hashCode();
    }

    public String toString() {
        return "ClientDescription{mApiKey='" + this.f3251a + '\'' + ", mPackageName='" + this.f3252b + '\'' + ", mProcessID=" + this.f3253c + ", mProcessSessionID='" + this.f3254d + '\'' + ", mReporterType=" + this.f3255e + '}';
    }
}
