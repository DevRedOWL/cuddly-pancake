package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.sj */
public final class C4034sj {

    /* renamed from: a */
    public final String f4752a;

    /* renamed from: b */
    public final long f4753b;

    /* renamed from: c */
    public final long f4754c;

    /* renamed from: a */
    public static C4034sj m5220a(byte[] bArr) throws C3318d {
        if (C3306cx.m2863a(bArr)) {
            return null;
        }
        return new C4034sj(bArr);
    }

    private C4034sj(byte[] bArr) throws C3318d {
        C3905rj a = C3905rj.m4841a(bArr);
        this.f4752a = a.f4371b;
        this.f4753b = a.f4373d;
        this.f4754c = a.f4372c;
    }

    public C4034sj(String str, long j, long j2) {
        this.f4752a = str;
        this.f4753b = j;
        this.f4754c = j2;
    }

    /* renamed from: a */
    public byte[] mo41271a() {
        C3905rj rjVar = new C3905rj();
        rjVar.f4371b = this.f4752a;
        rjVar.f4373d = this.f4753b;
        rjVar.f4372c = this.f4754c;
        return C3365e.m3064a((C3365e) rjVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4034sj sjVar = (C4034sj) obj;
        if (this.f4753b == sjVar.f4753b && this.f4754c == sjVar.f4754c) {
            return this.f4752a.equals(sjVar.f4752a);
        }
        return false;
    }

    public int hashCode() {
        long j = this.f4753b;
        long j2 = this.f4754c;
        return (((this.f4752a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "ReferrerInfo{installReferrer='" + this.f4752a + '\'' + ", referrerClickTimestampSeconds=" + this.f4753b + ", installBeginTimestampSeconds=" + this.f4754c + '}';
    }
}
