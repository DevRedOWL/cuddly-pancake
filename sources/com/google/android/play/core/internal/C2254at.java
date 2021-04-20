package com.google.android.play.core.internal;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.play.core.splitcompat.C2332c;
import com.google.android.play.core.splitcompat.C2345p;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.android.play.core.splitinstall.C2373d;
import com.google.android.play.core.splitinstall.C2375f;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.internal.at */
public final class C2254at implements C2375f {

    /* renamed from: a */
    private final Context f1933a;

    /* renamed from: b */
    private final C2332c f1934b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2256av f1935c;

    /* renamed from: d */
    private final Executor f1936d;

    /* renamed from: e */
    private final C2345p f1937e;

    public C2254at(Context context, Executor executor, C2256av avVar, C2332c cVar, C2345p pVar) {
        this.f1933a = context;
        this.f1934b = cVar;
        this.f1935c = avVar;
        this.f1936d = executor;
        this.f1937e = pVar;
    }

    /* renamed from: c */
    static /* synthetic */ void m1167c(C2254at atVar, C2373d dVar) {
        try {
            if (!SplitCompat.m1398a(C2345p.m1447c(atVar.f1933a))) {
                Log.e("SplitCompat", "Emulating splits failed.");
                dVar.mo34026c(-12);
                return;
            }
            Log.i("SplitCompat", "Splits installed.");
            dVar.mo34024a();
        } catch (Exception e) {
            Log.e("SplitCompat", "Error emulating splits.", e);
            dVar.mo34026c(-12);
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m1168d(C2254at atVar, List list, C2373d dVar) {
        Integer e = atVar.m1169e(list);
        if (e != null) {
            if (e.intValue() == 0) {
                dVar.mo34025b();
            } else {
                dVar.mo34026c(e.intValue());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:87:0x0128 A[Catch:{ all -> 0x001b, all -> 0x0121, Exception -> 0x012c }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Integer m1169e(java.util.List<android.content.Intent> r15) {
        /*
            r14 = this;
            java.lang.String r0 = "SplitCompat"
            r1 = -13
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x012c }
            com.google.android.play.core.splitcompat.c r3 = r14.f1934b     // Catch:{ Exception -> 0x012c }
            java.io.File r3 = r3.mo33951f()     // Catch:{ Exception -> 0x012c }
            java.lang.String r4 = "rw"
            r2.<init>(r3, r4)     // Catch:{ Exception -> 0x012c }
            java.nio.channels.FileChannel r2 = r2.getChannel()     // Catch:{ Exception -> 0x012c }
            r3 = 0
            java.nio.channels.FileLock r4 = r2.tryLock()     // Catch:{ OverlappingFileLockException -> 0x001e }
            goto L_0x001f
        L_0x001b:
            r15 = move-exception
            goto L_0x011b
        L_0x001e:
            r4 = r3
        L_0x001f:
            if (r4 == 0) goto L_0x0126
            r3 = 0
            r5 = -11
            java.lang.String r6 = "Copying splits."
            android.util.Log.i(r0, r6)     // Catch:{ Exception -> 0x010d }
            java.util.Iterator r15 = r15.iterator()     // Catch:{ Exception -> 0x010d }
        L_0x002d:
            boolean r6 = r15.hasNext()     // Catch:{ Exception -> 0x010d }
            if (r6 == 0) goto L_0x00b1
            java.lang.Object r6 = r15.next()     // Catch:{ Exception -> 0x010d }
            android.content.Intent r6 = (android.content.Intent) r6     // Catch:{ Exception -> 0x010d }
            java.lang.String r7 = "split_id"
            java.lang.String r7 = r6.getStringExtra(r7)     // Catch:{ Exception -> 0x010d }
            android.content.Context r8 = r14.f1933a     // Catch:{ Exception -> 0x010d }
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch:{ Exception -> 0x010d }
            android.net.Uri r6 = r6.getData()     // Catch:{ Exception -> 0x010d }
            java.lang.String r9 = "r"
            android.content.res.AssetFileDescriptor r6 = r8.openAssetFileDescriptor(r6, r9)     // Catch:{ Exception -> 0x010d }
            com.google.android.play.core.splitcompat.c r8 = r14.f1934b     // Catch:{ Exception -> 0x010d }
            java.io.File r8 = r8.mo33947b(r7)     // Catch:{ Exception -> 0x010d }
            boolean r9 = r8.exists()     // Catch:{ Exception -> 0x010d }
            if (r9 == 0) goto L_0x0068
            long r9 = r8.length()     // Catch:{ Exception -> 0x010d }
            long r11 = r6.getLength()     // Catch:{ Exception -> 0x010d }
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x0068
            goto L_0x006e
        L_0x0068:
            boolean r9 = r8.exists()     // Catch:{ Exception -> 0x010d }
            if (r9 != 0) goto L_0x002d
        L_0x006e:
            com.google.android.play.core.splitcompat.c r9 = r14.f1934b     // Catch:{ Exception -> 0x010d }
            java.io.File r7 = r9.mo33948c(r7)     // Catch:{ Exception -> 0x010d }
            boolean r7 = r7.exists()     // Catch:{ Exception -> 0x010d }
            if (r7 != 0) goto L_0x002d
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x010d }
            java.io.FileInputStream r6 = r6.createInputStream()     // Catch:{ Exception -> 0x010d }
            r7.<init>(r6)     // Catch:{ Exception -> 0x010d }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ all -> 0x00a7 }
            r6.<init>(r8)     // Catch:{ all -> 0x00a7 }
            r8 = 4096(0x1000, float:5.74E-42)
            byte[] r8 = new byte[r8]     // Catch:{ all -> 0x009d }
        L_0x008c:
            int r9 = r7.read(r8)     // Catch:{ all -> 0x009d }
            if (r9 <= 0) goto L_0x0096
            r6.write(r8, r3, r9)     // Catch:{ all -> 0x009d }
            goto L_0x008c
        L_0x0096:
            r6.close()     // Catch:{ all -> 0x00a7 }
            r7.close()     // Catch:{ Exception -> 0x010d }
            goto L_0x002d
        L_0x009d:
            r15 = move-exception
            r6.close()     // Catch:{ all -> 0x00a2 }
            goto L_0x00a6
        L_0x00a2:
            r3 = move-exception
            com.google.android.play.core.internal.C2287bz.m1273a(r15, r3)     // Catch:{ all -> 0x00a7 }
        L_0x00a6:
            throw r15     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r15 = move-exception
            r7.close()     // Catch:{ all -> 0x00ac }
            goto L_0x00b0
        L_0x00ac:
            r3 = move-exception
            com.google.android.play.core.internal.C2287bz.m1273a(r15, r3)     // Catch:{ Exception -> 0x010d }
        L_0x00b0:
            throw r15     // Catch:{ Exception -> 0x010d }
        L_0x00b1:
            java.lang.String r15 = "Splits copied."
            android.util.Log.i(r0, r15)     // Catch:{ Exception -> 0x010d }
            com.google.android.play.core.splitcompat.c r15 = r14.f1934b     // Catch:{ IOException -> 0x0109 }
            java.io.File r15 = r15.mo33952g()     // Catch:{ IOException -> 0x0109 }
            java.io.File[] r15 = r15.listFiles()     // Catch:{ IOException -> 0x0109 }
            com.google.android.play.core.internal.av r6 = r14.f1935c     // Catch:{ Exception -> 0x0102 }
            boolean r6 = r6.mo33827a(r15)     // Catch:{ Exception -> 0x0102 }
            if (r6 == 0) goto L_0x00fc
            com.google.android.play.core.internal.av r6 = r14.f1935c     // Catch:{ Exception -> 0x0102 }
            boolean r15 = r6.mo33828b(r15)     // Catch:{ Exception -> 0x0102 }
            if (r15 == 0) goto L_0x00fc
            com.google.android.play.core.splitcompat.c r15 = r14.f1934b     // Catch:{ IOException -> 0x00f5 }
            java.io.File r15 = r15.mo33952g()     // Catch:{ IOException -> 0x00f5 }
            java.io.File[] r15 = r15.listFiles()     // Catch:{ IOException -> 0x00f5 }
            java.util.Arrays.sort(r15)     // Catch:{ IOException -> 0x00f5 }
            int r5 = r15.length     // Catch:{ IOException -> 0x00f5 }
        L_0x00de:
            int r5 = r5 + -1
            if (r5 < 0) goto L_0x00ee
            r6 = r15[r5]     // Catch:{ IOException -> 0x00f5 }
            com.google.android.play.core.splitcompat.c r7 = r14.f1934b     // Catch:{ IOException -> 0x00f5 }
            java.io.File r7 = r7.mo33949d(r6)     // Catch:{ IOException -> 0x00f5 }
            r6.renameTo(r7)     // Catch:{ IOException -> 0x00f5 }
            goto L_0x00de
        L_0x00ee:
            java.lang.String r15 = "Splits verified."
            android.util.Log.i(r0, r15)     // Catch:{ all -> 0x001b }
            r5 = 0
            goto L_0x0113
        L_0x00f5:
            r15 = move-exception
            java.lang.String r3 = "Cannot write verified split."
        L_0x00f8:
            android.util.Log.e(r0, r3, r15)     // Catch:{ all -> 0x001b }
            goto L_0x0111
        L_0x00fc:
            java.lang.String r15 = "Split verification failed."
            android.util.Log.e(r0, r15)     // Catch:{ all -> 0x001b }
            goto L_0x0113
        L_0x0102:
            r15 = move-exception
            java.lang.String r3 = "Error verifying splits."
            android.util.Log.e(r0, r3, r15)     // Catch:{ all -> 0x001b }
            goto L_0x0113
        L_0x0109:
            r15 = move-exception
            java.lang.String r3 = "Cannot access directory for unverified splits."
            goto L_0x00f8
        L_0x010d:
            r15 = move-exception
            java.lang.String r3 = "Error copying splits."
            goto L_0x00f8
        L_0x0111:
            r5 = -13
        L_0x0113:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x001b }
            r4.release()     // Catch:{ all -> 0x001b }
            goto L_0x0126
        L_0x011b:
            if (r2 == 0) goto L_0x0125
            r2.close()     // Catch:{ all -> 0x0121 }
            goto L_0x0125
        L_0x0121:
            r2 = move-exception
            com.google.android.play.core.internal.C2287bz.m1273a(r15, r2)     // Catch:{ Exception -> 0x012c }
        L_0x0125:
            throw r15     // Catch:{ Exception -> 0x012c }
        L_0x0126:
            if (r2 == 0) goto L_0x012b
            r2.close()     // Catch:{ Exception -> 0x012c }
        L_0x012b:
            return r3
        L_0x012c:
            r15 = move-exception
            java.lang.String r2 = "Error locking files."
            android.util.Log.e(r0, r2, r15)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r1)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.internal.C2254at.m1169e(java.util.List):java.lang.Integer");
    }

    /* renamed from: a */
    public final void mo33824a(List<Intent> list, C2373d dVar) {
        if (SplitCompat.m1399b()) {
            this.f1936d.execute(new C2253as(this, list, dVar));
            return;
        }
        throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
    }
}
