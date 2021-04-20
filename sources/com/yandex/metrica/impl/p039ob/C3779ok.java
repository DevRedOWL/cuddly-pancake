package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.location.LocationManager;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.ok */
public class C3779ok {

    /* renamed from: a */
    static final Set<String> f3933a = new HashSet(Arrays.asList(new String[]{"gps"}));

    /* renamed from: b */
    private Context f3934b;

    /* renamed from: c */
    private LocationManager f3935c;

    /* renamed from: d */
    private C3832pr f3936d;

    public C3779ok(Context context, LocationManager locationManager, C3832pr prVar) {
        this.f3934b = context;
        this.f3935c = locationManager;
        this.f3936d = prVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0024 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.location.Location mo40754a() {
        /*
            r12 = this;
            android.location.LocationManager r0 = r12.f3935c
            r1 = 0
            if (r0 == 0) goto L_0x0060
            com.yandex.metrica.impl.ob.pr r0 = r12.f3936d
            android.content.Context r2 = r12.f3934b
            boolean r0 = r0.mo40853a((android.content.Context) r2)
            com.yandex.metrica.impl.ob.pr r2 = r12.f3936d
            android.content.Context r3 = r12.f3934b
            boolean r2 = r2.mo40855b(r3)
            android.location.LocationManager r3 = r12.f3935c     // Catch:{ all -> 0x001c }
            java.util.List r3 = r3.getAllProviders()     // Catch:{ all -> 0x001c }
            goto L_0x001d
        L_0x001c:
            r3 = r1
        L_0x001d:
            if (r3 == 0) goto L_0x0060
            java.util.Iterator r3 = r3.iterator()
            r10 = r1
        L_0x0024:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x005f
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.util.Set<java.lang.String> r5 = f3933a
            boolean r5 = r5.contains(r4)
            if (r5 != 0) goto L_0x0024
            if (r0 == 0) goto L_0x004d
            java.lang.String r5 = "passive"
            boolean r5 = r5.equals(r4)     // Catch:{ all -> 0x004b }
            if (r5 == 0) goto L_0x0044
            if (r2 == 0) goto L_0x004d
        L_0x0044:
            android.location.LocationManager r5 = r12.f3935c     // Catch:{ all -> 0x004b }
            android.location.Location r4 = r5.getLastKnownLocation(r4)     // Catch:{ all -> 0x004b }
            goto L_0x004e
        L_0x004b:
            r11 = r1
            goto L_0x004f
        L_0x004d:
            r4 = r1
        L_0x004e:
            r11 = r4
        L_0x004f:
            if (r11 == 0) goto L_0x0024
            long r6 = com.yandex.metrica.impl.p039ob.C3776oi.f3923a
            r8 = 200(0xc8, double:9.9E-322)
            r4 = r11
            r5 = r10
            boolean r4 = com.yandex.metrica.impl.p039ob.C3776oi.m4337a(r4, r5, r6, r8)
            if (r4 == 0) goto L_0x0024
            r10 = r11
            goto L_0x0024
        L_0x005f:
            r1 = r10
        L_0x0060:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3779ok.mo40754a():android.location.Location");
    }
}
