package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.xx */
public class C4273xx {

    /* renamed from: a */
    private final C4272xw f5335a;

    /* renamed from: b */
    private final C4271xv f5336b;

    public C4273xx(C4216vz vzVar, String str) {
        this(new C4272xw(30, 50, 4000, str, vzVar), new C4271xv(4500, str, vzVar));
    }

    C4273xx(C4272xw xwVar, C4271xv xvVar) {
        this.f5335a = xwVar;
        this.f5336b = xvVar;
    }

    /* renamed from: a */
    public boolean mo41849a(C4214vx vxVar, String str, String str2) {
        if (vxVar == null) {
            return false;
        }
        String a = this.f5335a.mo41845a().mo41840a(str);
        String a2 = this.f5335a.mo41847b().mo41840a(str2);
        if (vxVar.containsKey(a)) {
            String str3 = (String) vxVar.get(a);
            if (a2 == null || !a2.equals(str3)) {
                return mo41850a(vxVar, a, a2, str3);
            }
            return false;
        } else if (a2 != null) {
            return mo41850a(vxVar, a, a2, (String) null);
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized boolean mo41850a(C4214vx vxVar, String str, String str2, String str3) {
        if (vxVar.size() >= this.f5335a.mo41848c().mo41842a()) {
            if (this.f5335a.mo41848c().mo41842a() != vxVar.size() || !vxVar.containsKey(str)) {
                this.f5335a.mo41846a(str);
                return false;
            }
        }
        if (!this.f5336b.mo41844a(vxVar, str, str2)) {
            vxVar.put(str, str2);
            return true;
        }
        this.f5336b.mo41843a(str);
        return false;
    }
}
