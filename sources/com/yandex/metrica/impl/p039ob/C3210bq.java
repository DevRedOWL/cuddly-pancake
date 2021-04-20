package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.bq */
public class C3210bq {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.io.BufferedOutputStream} */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo39695a(com.yandex.metrica.impl.p039ob.C3208bo r9) {
        /*
            r8 = this;
            r0 = 0
            r9.mo39669d()     // Catch:{ all -> 0x00a6 }
            com.yandex.metrica.impl.ob.pj r1 = r9.mo39668c()     // Catch:{ all -> 0x00a6 }
            java.net.HttpURLConnection r1 = r1.mo40840a()     // Catch:{ all -> 0x00a6 }
            java.util.Map r2 = r9.mo39649B()     // Catch:{ all -> 0x00a0 }
            r8.m2385a(r1, r2)     // Catch:{ all -> 0x00a0 }
            r2 = 2
            int r3 = r9.mo39674i()     // Catch:{ all -> 0x00a0 }
            if (r2 != r3) goto L_0x004a
            byte[] r2 = r9.mo39675j()     // Catch:{ all -> 0x00a0 }
            if (r2 == 0) goto L_0x004a
            int r3 = r2.length     // Catch:{ all -> 0x00a0 }
            if (r3 <= 0) goto L_0x004a
            java.lang.Long r3 = r9.mo39691z()     // Catch:{ all -> 0x00a0 }
            java.lang.Integer r4 = r9.mo39648A()     // Catch:{ all -> 0x00a0 }
            r8.m2384a(r1, r3, r4)     // Catch:{ all -> 0x00a0 }
            java.io.OutputStream r3 = r1.getOutputStream()     // Catch:{ all -> 0x00a0 }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0046 }
            int r2 = r2.length     // Catch:{ all -> 0x0046 }
            r4.<init>(r3, r2)     // Catch:{ all -> 0x0046 }
            byte[] r2 = r9.mo39675j()     // Catch:{ all -> 0x009c }
            r4.write(r2)     // Catch:{ all -> 0x009c }
            r4.flush()     // Catch:{ all -> 0x009c }
            com.yandex.metrica.impl.p039ob.C3306cx.m2855a((java.io.Closeable) r3)     // Catch:{ all -> 0x009c }
            goto L_0x004c
        L_0x0046:
            r2 = move-exception
            r4 = r0
            goto L_0x00a3
        L_0x004a:
            r3 = r0
            r4 = r3
        L_0x004c:
            int r2 = r1.getResponseCode()     // Catch:{ all -> 0x009c }
            r9.mo39652a((int) r2)     // Catch:{ all -> 0x009c }
            java.util.Map r5 = r1.getHeaderFields()     // Catch:{ all -> 0x009c }
            r9.mo39661a((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r5)     // Catch:{ all -> 0x009c }
            boolean r2 = r9.mo39667b((int) r2)     // Catch:{ all -> 0x009c }
            r5 = 8000(0x1f40, float:1.121E-41)
            if (r2 == 0) goto L_0x0083
            java.io.InputStream r2 = r1.getInputStream()     // Catch:{ all -> 0x009c }
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ all -> 0x007d }
            r6.<init>(r2, r5)     // Catch:{ all -> 0x007d }
            byte[] r0 = com.yandex.metrica.impl.p039ob.C3137am.m2025b((java.io.InputStream) r6)     // Catch:{ all -> 0x0077 }
            r9.mo39665b((byte[]) r0)     // Catch:{ all -> 0x0077 }
            com.yandex.metrica.impl.p039ob.C3306cx.m2855a((java.io.Closeable) r2)     // Catch:{ all -> 0x0077 }
            r0 = r2
            goto L_0x008c
        L_0x0077:
            r0 = move-exception
            r5 = r1
            r1 = r2
            r2 = r0
            r0 = r6
            goto L_0x00ab
        L_0x007d:
            r5 = move-exception
            r7 = r5
            r5 = r1
            r1 = r2
            r2 = r7
            goto L_0x00ab
        L_0x0083:
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ all -> 0x009c }
            java.io.InputStream r2 = r1.getErrorStream()     // Catch:{ all -> 0x009c }
            r6.<init>(r2, r5)     // Catch:{ all -> 0x009c }
        L_0x008c:
            com.yandex.metrica.impl.p039ob.C3306cx.m2855a((java.io.Closeable) r4)
            com.yandex.metrica.impl.p039ob.C3306cx.m2855a((java.io.Closeable) r6)
            com.yandex.metrica.impl.p039ob.C3306cx.m2855a((java.io.Closeable) r3)
            com.yandex.metrica.impl.p039ob.C3306cx.m2855a((java.io.Closeable) r0)
            com.yandex.metrica.impl.p039ob.C3306cx.m2856a((java.net.HttpURLConnection) r1)
            goto L_0x00bd
        L_0x009c:
            r2 = move-exception
            r5 = r1
            r1 = r0
            goto L_0x00ab
        L_0x00a0:
            r2 = move-exception
            r3 = r0
            r4 = r3
        L_0x00a3:
            r5 = r1
            r1 = r4
            goto L_0x00ab
        L_0x00a6:
            r2 = move-exception
            r1 = r0
            r3 = r1
            r4 = r3
            r5 = r4
        L_0x00ab:
            r9.mo39659a((java.lang.Throwable) r2)     // Catch:{ all -> 0x00be }
            com.yandex.metrica.impl.p039ob.C3306cx.m2855a((java.io.Closeable) r4)
            com.yandex.metrica.impl.p039ob.C3306cx.m2855a((java.io.Closeable) r0)
            com.yandex.metrica.impl.p039ob.C3306cx.m2855a((java.io.Closeable) r3)
            com.yandex.metrica.impl.p039ob.C3306cx.m2855a((java.io.Closeable) r1)
            com.yandex.metrica.impl.p039ob.C3306cx.m2856a((java.net.HttpURLConnection) r5)
        L_0x00bd:
            return
        L_0x00be:
            r9 = move-exception
            com.yandex.metrica.impl.p039ob.C3306cx.m2855a((java.io.Closeable) r4)
            com.yandex.metrica.impl.p039ob.C3306cx.m2855a((java.io.Closeable) r0)
            com.yandex.metrica.impl.p039ob.C3306cx.m2855a((java.io.Closeable) r3)
            com.yandex.metrica.impl.p039ob.C3306cx.m2855a((java.io.Closeable) r1)
            com.yandex.metrica.impl.p039ob.C3306cx.m2856a((java.net.HttpURLConnection) r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3210bq.mo39695a(com.yandex.metrica.impl.ob.bo):void");
    }

    /* renamed from: a */
    private void m2385a(HttpURLConnection httpURLConnection, Map<String, List<String>> map) {
        for (Map.Entry next : map.entrySet()) {
            httpURLConnection.setRequestProperty((String) next.getKey(), TextUtils.join(",", (Iterable) next.getValue()));
        }
    }

    /* renamed from: a */
    private HttpURLConnection m2384a(HttpURLConnection httpURLConnection, Long l, Integer num) {
        httpURLConnection.setDoOutput(true);
        if (l != null) {
            httpURLConnection.setRequestProperty("Send-Timestamp", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(l.longValue())));
        }
        if (num != null) {
            httpURLConnection.setRequestProperty("Send-Timezone", String.valueOf(num));
        }
        return httpURLConnection;
    }
}
