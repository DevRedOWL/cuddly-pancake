package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.ua */
public class C4128ua {

    /* renamed from: a */
    public final long f5043a;

    /* renamed from: b */
    public final long f5044b;

    /* renamed from: c */
    public final long f5045c;

    /* renamed from: d */
    public final long f5046d;

    public C4128ua(long j, long j2, long j3, long j4) {
        this.f5043a = j;
        this.f5044b = j2;
        this.f5045c = j3;
        this.f5046d = j4;
    }

    public String toString() {
        return "SdkFingerprintingConfig{minCollectingInterval=" + this.f5043a + ", minFirstCollectingDelay=" + this.f5044b + ", minCollectingDelayAfterLaunch=" + this.f5045c + ", minRequestRetryInterval=" + this.f5046d + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4128ua uaVar = (C4128ua) obj;
        if (this.f5043a == uaVar.f5043a && this.f5044b == uaVar.f5044b && this.f5045c == uaVar.f5045c && this.f5046d == uaVar.f5046d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f5043a;
        long j2 = this.f5044b;
        long j3 = this.f5045c;
        long j4 = this.f5046d;
        return (((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)));
    }
}
