package com.yandex.metrica;

import java.util.Map;

/* renamed from: com.yandex.metrica.i */
public class C3097i {

    /* renamed from: a */
    private String f2432a;

    /* renamed from: b */
    private String f2433b;

    /* renamed from: c */
    private Map<String, String> f2434c;

    /* renamed from: a */
    public String mo39382a() {
        return this.f2432a;
    }

    /* renamed from: a */
    public void mo39383a(String str) {
        this.f2432a = str;
    }

    /* renamed from: b */
    public String mo39385b() {
        return this.f2433b;
    }

    /* renamed from: b */
    public void mo39386b(String str) {
        this.f2433b = str;
    }

    /* renamed from: c */
    public Map<String, String> mo39387c() {
        return this.f2434c;
    }

    /* renamed from: a */
    public void mo39384a(Map<String, String> map) {
        this.f2434c = map;
    }

    public int hashCode() {
        String str = this.f2432a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f2433b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, String> map = this.f2434c;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode2 + i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3097i iVar = (C3097i) obj;
        String str = this.f2432a;
        if (str == null ? iVar.f2432a != null : !str.equals(iVar.f2432a)) {
            return false;
        }
        String str2 = this.f2433b;
        if (str2 == null ? iVar.f2433b != null : !str2.equals(iVar.f2433b)) {
            return false;
        }
        Map<String, String> map = this.f2434c;
        Map<String, String> map2 = iVar.f2434c;
        if (map != null) {
            return map.equals(map2);
        }
        if (map2 == null) {
            return true;
        }
        return false;
    }
}
