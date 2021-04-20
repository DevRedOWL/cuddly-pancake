package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.um */
public class C4147um {

    /* renamed from: a */
    public final long f5152a;

    public C4147um(long j) {
        this.f5152a = j;
    }

    public String toString() {
        return "StatSending{disabledReportingInterval=" + this.f5152a + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.f5152a == ((C4147um) obj).f5152a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f5152a;
        return (int) (j ^ (j >>> 32));
    }
}
