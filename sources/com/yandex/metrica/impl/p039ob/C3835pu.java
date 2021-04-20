package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.pu */
public class C3835pu {

    /* renamed from: a */
    public final String f4082a;

    /* renamed from: b */
    public final boolean f4083b;

    public C3835pu(String str, boolean z) {
        this.f4082a = str;
        this.f4083b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3835pu puVar = (C3835pu) obj;
        if (this.f4083b != puVar.f4083b) {
            return false;
        }
        return this.f4082a.equals(puVar.f4082a);
    }

    public int hashCode() {
        return (this.f4082a.hashCode() * 31) + (this.f4083b ? 1 : 0);
    }

    public String toString() {
        return "PermissionState{name='" + this.f4082a + '\'' + ", granted=" + this.f4083b + '}';
    }
}
