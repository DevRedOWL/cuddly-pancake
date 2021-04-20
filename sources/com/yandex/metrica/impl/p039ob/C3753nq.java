package com.yandex.metrica.impl.p039ob;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.nq */
public class C3753nq {

    /* renamed from: a */
    public final String f3879a;

    /* renamed from: b */
    public final String f3880b;

    public C3753nq(String str, String str2) {
        this.f3879a = str;
        this.f3880b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3753nq nqVar = (C3753nq) obj;
        String str = this.f3879a;
        if (str == null ? nqVar.f3879a != null : !str.equals(nqVar.f3879a)) {
            return false;
        }
        String str2 = this.f3880b;
        String str3 = nqVar.f3880b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f3879a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f3880b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "AppMetricaDeviceIdentifiers{deviceID='" + this.f3879a + '\'' + ", deviceIDHash='" + this.f3880b + '\'' + '}';
    }
}
