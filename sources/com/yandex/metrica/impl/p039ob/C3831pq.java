package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.pq */
class C3831pq implements C3830pp {

    /* renamed from: a */
    private final boolean f4080a;

    C3831pq(boolean z) {
        this.f4080a = z;
    }

    /* renamed from: a */
    public boolean mo40843a(String str) {
        if ("android.permission.ACCESS_FINE_LOCATION".equals(str) || "android.permission.ACCESS_COARSE_LOCATION".equals(str)) {
            return this.f4080a;
        }
        return true;
    }

    public String toString() {
        return "LocationFlagStrategy{mEnabled=" + this.f4080a + '}';
    }
}
