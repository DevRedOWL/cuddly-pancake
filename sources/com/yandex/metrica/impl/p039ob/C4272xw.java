package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.xw */
public class C4272xw {

    /* renamed from: a */
    private final C4275xz f5330a;

    /* renamed from: b */
    private final C4275xz f5331b;

    /* renamed from: c */
    private final C4268xs f5332c;

    /* renamed from: d */
    private final C4216vz f5333d;

    /* renamed from: e */
    private final String f5334e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4272xw(int r7, int r8, int r9, java.lang.String r10, com.yandex.metrica.impl.p039ob.C4216vz r11) {
        /*
            r6 = this;
            com.yandex.metrica.impl.ob.xs r1 = new com.yandex.metrica.impl.ob.xs
            r1.<init>(r7)
            com.yandex.metrica.impl.ob.xz r2 = new com.yandex.metrica.impl.ob.xz
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r10)
            java.lang.String r0 = "map key"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r2.<init>(r8, r7, r11)
            com.yandex.metrica.impl.ob.xz r3 = new com.yandex.metrica.impl.ob.xz
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r10)
            java.lang.String r8 = "map value"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r3.<init>(r9, r7, r11)
            r0 = r6
            r4 = r10
            r5 = r11
            r0.<init>((com.yandex.metrica.impl.p039ob.C4268xs) r1, (com.yandex.metrica.impl.p039ob.C4275xz) r2, (com.yandex.metrica.impl.p039ob.C4275xz) r3, (java.lang.String) r4, (com.yandex.metrica.impl.p039ob.C4216vz) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C4272xw.<init>(int, int, int, java.lang.String, com.yandex.metrica.impl.ob.vz):void");
    }

    C4272xw(C4268xs xsVar, C4275xz xzVar, C4275xz xzVar2, String str, C4216vz vzVar) {
        this.f5332c = xsVar;
        this.f5330a = xzVar;
        this.f5331b = xzVar2;
        this.f5334e = str;
        this.f5333d = vzVar;
    }

    /* renamed from: a */
    public C4275xz mo41845a() {
        return this.f5330a;
    }

    /* renamed from: b */
    public C4275xz mo41847b() {
        return this.f5331b;
    }

    /* renamed from: c */
    public C4268xs mo41848c() {
        return this.f5332c;
    }

    /* renamed from: a */
    public void mo41846a(String str) {
        if (this.f5333d.mo41688c()) {
            this.f5333d.mo41685b("The %s has reached the limit of %d items. Item with key %s will be ignored", this.f5334e, Integer.valueOf(this.f5332c.mo41842a()), str);
        }
    }
}
