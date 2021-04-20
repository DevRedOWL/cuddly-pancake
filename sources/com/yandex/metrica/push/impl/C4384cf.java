package com.yandex.metrica.push.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.yandex.metrica.push.impl.cf */
public class C4384cf implements C4381cc {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r6v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v8, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: type inference failed for: r6v13 */
    /* JADX WARNING: type inference failed for: r6v15 */
    /* JADX WARNING: type inference failed for: r6v18 */
    /* JADX WARNING: type inference failed for: r6v21 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo42021a(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x0040, OutOfMemoryError -> 0x0033, all -> 0x002f }
            r2.<init>(r6)     // Catch:{ Exception -> 0x0040, OutOfMemoryError -> 0x0033, all -> 0x002f }
            java.net.URLConnection r6 = r2.openConnection()     // Catch:{ Exception -> 0x0040, OutOfMemoryError -> 0x0033, all -> 0x002f }
            java.io.InputStream r6 = r6.getInputStream()     // Catch:{ Exception -> 0x0040, OutOfMemoryError -> 0x0033, all -> 0x002f }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x002c, OutOfMemoryError -> 0x0029, all -> 0x0026 }
            r2.<init>()     // Catch:{ Exception -> 0x002c, OutOfMemoryError -> 0x0029, all -> 0x0026 }
            m6478a(r6, r2)     // Catch:{ Exception -> 0x0024, OutOfMemoryError -> 0x0022 }
            byte[] r1 = r2.toByteArray()     // Catch:{ Exception -> 0x0024, OutOfMemoryError -> 0x0022 }
        L_0x001b:
            com.yandex.metrica.push.impl.C4380cb.m6469a((java.io.Closeable) r6)
            com.yandex.metrica.push.impl.C4380cb.m6469a((java.io.Closeable) r2)
            goto L_0x004d
        L_0x0022:
            r3 = move-exception
            goto L_0x0036
        L_0x0024:
            r3 = move-exception
            goto L_0x0043
        L_0x0026:
            r0 = move-exception
            r2 = r1
            goto L_0x004f
        L_0x0029:
            r3 = move-exception
            r2 = r1
            goto L_0x0036
        L_0x002c:
            r3 = move-exception
            r2 = r1
            goto L_0x0043
        L_0x002f:
            r0 = move-exception
            r6 = r1
            r2 = r6
            goto L_0x004f
        L_0x0033:
            r3 = move-exception
            r6 = r1
            r2 = r6
        L_0x0036:
            java.lang.String r4 = r3.getMessage()     // Catch:{ all -> 0x004e }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x004e }
            com.yandex.metrica.push.impl.C4376by.m6445a(r3, r4, r0)     // Catch:{ all -> 0x004e }
            goto L_0x001b
        L_0x0040:
            r3 = move-exception
            r6 = r1
            r2 = r6
        L_0x0043:
            java.lang.String r4 = r3.getMessage()     // Catch:{ all -> 0x004e }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x004e }
            com.yandex.metrica.push.impl.C4376by.m6445a(r3, r4, r0)     // Catch:{ all -> 0x004e }
            goto L_0x001b
        L_0x004d:
            return r1
        L_0x004e:
            r0 = move-exception
        L_0x004f:
            com.yandex.metrica.push.impl.C4380cb.m6469a((java.io.Closeable) r6)
            com.yandex.metrica.push.impl.C4380cb.m6469a((java.io.Closeable) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.push.impl.C4384cf.mo42021a(java.lang.String):byte[]");
    }

    /* renamed from: a */
    private static void m6478a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }
}
