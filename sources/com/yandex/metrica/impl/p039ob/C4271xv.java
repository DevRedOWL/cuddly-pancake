package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.xv */
public class C4271xv {

    /* renamed from: a */
    private final String f5327a;

    /* renamed from: b */
    private final int f5328b;

    /* renamed from: c */
    private final C4216vz f5329c;

    public C4271xv(int i, String str, C4216vz vzVar) {
        this.f5328b = i;
        this.f5327a = str;
        this.f5329c = vzVar;
    }

    /* renamed from: a */
    public boolean mo41844a(C4214vx vxVar, String str, String str2) {
        int a = vxVar.mo41714a();
        if (str2 != null) {
            a += str2.length();
        }
        if (vxVar.containsKey(str)) {
            String str3 = (String) vxVar.get(str);
            if (str3 != null) {
                a -= str3.length();
            }
        } else {
            a += str.length();
        }
        return a > this.f5328b;
    }

    /* renamed from: a */
    public void mo41843a(String str) {
        if (this.f5329c.mo41688c()) {
            this.f5329c.mo41685b("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", this.f5327a, Integer.valueOf(this.f5328b), str);
        }
    }
}
