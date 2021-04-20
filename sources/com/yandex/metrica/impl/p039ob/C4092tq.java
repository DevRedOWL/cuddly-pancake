package com.yandex.metrica.impl.p039ob;

import java.net.Socket;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.tq */
class C4092tq {

    /* renamed from: a */
    private Socket f4926a;

    /* renamed from: b */
    private C4093tr f4927b;

    /* renamed from: c */
    private Map<String, C4091tp> f4928c;

    C4092tq(Socket socket, C4093tr trVar, Map<String, C4091tp> map) {
        this.f4926a = socket;
        this.f4927b = trVar;
        this.f4928c = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo41458a() {
        /*
            r6 = this;
            r0 = 0
            java.net.Socket r1 = r6.f4926a     // Catch:{ all -> 0x0047 }
            r2 = 1000(0x3e8, float:1.401E-42)
            r1.setSoTimeout(r2)     // Catch:{ all -> 0x0047 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0047 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0047 }
            java.net.Socket r3 = r6.f4926a     // Catch:{ all -> 0x0047 }
            java.io.InputStream r3 = r3.getInputStream()     // Catch:{ all -> 0x0047 }
            r2.<init>(r3)     // Catch:{ all -> 0x0047 }
            r1.<init>(r2)     // Catch:{ all -> 0x0047 }
            java.lang.String r0 = r6.m5475a(r1)     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x0041
            android.net.Uri r2 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x0045 }
            java.lang.String r3 = r2.getPath()     // Catch:{ all -> 0x0045 }
            java.util.Map<java.lang.String, com.yandex.metrica.impl.ob.tp> r4 = r6.f4928c     // Catch:{ all -> 0x0045 }
            java.lang.Object r3 = r4.get(r3)     // Catch:{ all -> 0x0045 }
            com.yandex.metrica.impl.ob.tp r3 = (com.yandex.metrica.impl.p039ob.C4091tp) r3     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x003a
            java.net.Socket r0 = r6.f4926a     // Catch:{ all -> 0x0045 }
            com.yandex.metrica.impl.ob.to r0 = r3.mo41457a(r0, r2)     // Catch:{ all -> 0x0045 }
            r0.mo41449a()     // Catch:{ all -> 0x0045 }
            goto L_0x0041
        L_0x003a:
            com.yandex.metrica.impl.ob.tr r2 = r6.f4927b     // Catch:{ all -> 0x0045 }
            java.lang.String r3 = "request_to_unknown_path"
            r2.mo41461a((java.lang.String) r3, (java.lang.String) r0)     // Catch:{ all -> 0x0045 }
        L_0x0041:
            r1.close()     // Catch:{ all -> 0x0055 }
            goto L_0x0055
        L_0x0045:
            r0 = move-exception
            goto L_0x004b
        L_0x0047:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x004b:
            com.yandex.metrica.impl.ob.tr r2 = r6.f4927b     // Catch:{ all -> 0x0056 }
            java.lang.String r3 = "LocalHttpServer exception"
            r2.mo41462a((java.lang.String) r3, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0056 }
            if (r1 == 0) goto L_0x0055
            goto L_0x0041
        L_0x0055:
            return
        L_0x0056:
            r0 = move-exception
            if (r1 == 0) goto L_0x005c
            r1.close()     // Catch:{ all -> 0x005c }
        L_0x005c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C4092tq.mo41458a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r0 = r3.indexOf(47) + 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m5475a(java.io.BufferedReader r3) throws java.io.IOException {
        /*
            r2 = this;
            java.lang.String r3 = r3.readLine()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0027
            java.lang.String r0 = "GET /"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x0027
            r0 = 47
            int r0 = r3.indexOf(r0)
            int r0 = r0 + 1
            r1 = 32
            int r1 = r3.indexOf(r1, r0)
            if (r1 <= 0) goto L_0x0027
            java.lang.String r3 = r3.substring(r0, r1)
            return r3
        L_0x0027:
            com.yandex.metrica.impl.ob.tr r0 = r2.f4927b
            java.lang.String r1 = "invalid_route"
            r0.mo41461a((java.lang.String) r1, (java.lang.String) r3)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C4092tq.m5475a(java.io.BufferedReader):java.lang.String");
    }
}
