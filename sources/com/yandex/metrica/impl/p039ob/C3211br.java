package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.br */
public class C3211br implements Runnable {

    /* renamed from: a */
    private final C3821pi f2736a;

    /* renamed from: b */
    private final C3208bo f2737b;

    /* renamed from: c */
    private final C4259xj f2738c;

    /* renamed from: d */
    private final String f2739d;

    /* renamed from: e */
    private final C3210bq f2740e;

    public C3211br(C3821pi piVar, C3208bo boVar, C4259xj xjVar, String str) {
        this(piVar, boVar, xjVar, new C3210bq(), str);
    }

    public C3211br(C3821pi piVar, C3208bo boVar, C4259xj xjVar, C3210bq bqVar, String str) {
        this.f2736a = piVar;
        this.f2737b = boVar;
        this.f2738c = xjVar;
        this.f2740e = bqVar;
        this.f2739d = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r3.mo40841b() == false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r4 = this;
            com.yandex.metrica.impl.ob.xj r0 = r4.f2738c
            boolean r0 = r0.mo41813c()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0041
            com.yandex.metrica.impl.ob.pi r0 = r4.f2736a
            boolean r0 = r0.mo40839a()
            if (r0 == 0) goto L_0x0041
            com.yandex.metrica.impl.ob.bo r0 = r4.f2737b
            boolean r0 = r0.mo39664a()
            com.yandex.metrica.impl.ob.bo r3 = r4.f2737b
            com.yandex.metrica.impl.ob.pj r3 = r3.mo39668c()
            if (r0 == 0) goto L_0x0027
            boolean r3 = r3.mo40841b()
            if (r3 != 0) goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            com.yandex.metrica.impl.ob.xj r3 = r4.f2738c
            boolean r3 = r3.mo41813c()
            if (r3 == 0) goto L_0x0042
            if (r0 == 0) goto L_0x0042
            boolean r0 = r4.m2387a()
            if (r0 != 0) goto L_0x0026
            com.yandex.metrica.impl.ob.bo r0 = r4.f2737b
            boolean r0 = r0.mo39685t()
            if (r0 == 0) goto L_0x0026
            r0 = 1
            goto L_0x0027
        L_0x0041:
            r1 = 0
        L_0x0042:
            if (r1 != 0) goto L_0x0047
            r4.m2388b()
        L_0x0047:
            com.yandex.metrica.impl.ob.bo r0 = r4.f2737b
            r0.mo39671f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3211br.run():void");
    }

    /* renamed from: a */
    private boolean m2387a() {
        this.f2740e.mo39695a(this.f2737b);
        boolean b = this.f2737b.mo39666b();
        this.f2737b.mo39662a(b);
        return b;
    }

    /* renamed from: b */
    private void m2388b() {
        this.f2737b.mo39672g();
    }
}
