package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.ek */
public class C3379ek {

    /* renamed from: a */
    private final String f3140a;

    /* renamed from: b */
    private final String f3141b;

    public C3379ek(String str, String str2) {
        this.f3140a = str;
        this.f3141b = str2;
    }

    /* renamed from: a */
    public String mo39993a() {
        return this.f3141b;
    }

    /* renamed from: b */
    public String mo39994b() {
        return this.f3140a;
    }

    public String toString() {
        return this.f3140a + "_" + this.f3141b;
    }

    /* renamed from: c */
    public String mo39995c() {
        return this.f3140a + "_" + C3306cx.m2866b(this.f3141b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3379ek ekVar = (C3379ek) obj;
        String str = this.f3140a;
        if (str == null ? ekVar.f3140a != null : !str.equals(ekVar.f3140a)) {
            return false;
        }
        String str2 = this.f3141b;
        String str3 = ekVar.f3141b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f3140a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f3141b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
