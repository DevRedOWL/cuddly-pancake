package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import com.google.android.play.core.internal.C2269bh;
import java.io.File;
import java.util.Set;

/* renamed from: com.google.android.play.core.splitcompat.a */
public final class C2330a {

    /* renamed from: a */
    private final C2332c f2014a;

    public C2330a(C2332c cVar) {
        this.f2014a = cVar;
    }

    /* renamed from: c */
    public static final int m1406c(AssetManager assetManager, File file) {
        int intValue = ((Integer) C2269bh.m1211a(assetManager, "addAssetPath", Integer.class, String.class, file.getPath())).intValue();
        StringBuilder sb = new StringBuilder(39);
        sb.append("addAssetPath completed with ");
        sb.append(intValue);
        Log.d("SplitCompat", sb.toString());
        return intValue;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0028 A[Catch:{ Exception -> 0x0045 }, LOOP:0: B:14:0x0022->B:16:0x0028, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003d A[SYNTHETIC, Splitter:B:19:0x003d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo33943a(android.content.Context r5, java.util.Set<java.lang.String> r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.getThreadPolicy()     // Catch:{ Exception -> 0x0010 }
            android.os.StrictMode.allowThreadDiskReads()     // Catch:{ Exception -> 0x000c }
            android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ Exception -> 0x000c }
            goto L_0x0019
        L_0x000c:
            r1 = move-exception
            goto L_0x0012
        L_0x000e:
            r5 = move-exception
            goto L_0x005b
        L_0x0010:
            r1 = move-exception
            r0 = 0
        L_0x0012:
            java.lang.String r2 = "SplitCompat"
            java.lang.String r3 = "Unable to set up strict mode."
            android.util.Log.i(r2, r3, r1)     // Catch:{ all -> 0x000e }
        L_0x0019:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ Exception -> 0x0045 }
            r1.<init>()     // Catch:{ Exception -> 0x0045 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x0045 }
        L_0x0022:
            boolean r2 = r6.hasNext()     // Catch:{ Exception -> 0x0045 }
            if (r2 == 0) goto L_0x0038
            java.lang.Object r2 = r6.next()     // Catch:{ Exception -> 0x0045 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0045 }
            com.google.android.play.core.splitcompat.c r3 = r4.f2014a     // Catch:{ Exception -> 0x0045 }
            java.io.File r2 = r3.mo33948c(r2)     // Catch:{ Exception -> 0x0045 }
            r1.add(r2)     // Catch:{ Exception -> 0x0045 }
            goto L_0x0022
        L_0x0038:
            r4.mo33944b(r5, r1)     // Catch:{ Exception -> 0x0045 }
            if (r0 == 0) goto L_0x0040
            android.os.StrictMode.setThreadPolicy(r0)     // Catch:{ all -> 0x000e }
        L_0x0040:
            r5 = 1
        L_0x0041:
            monitor-exit(r4)
            return r5
        L_0x0043:
            r5 = move-exception
            goto L_0x0054
        L_0x0045:
            r5 = move-exception
            java.lang.String r6 = "SplitCompat"
            java.lang.String r1 = "Error installing additional splits"
            android.util.Log.e(r6, r1, r5)     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0052
            android.os.StrictMode.setThreadPolicy(r0)     // Catch:{ all -> 0x000e }
        L_0x0052:
            r5 = 0
            goto L_0x0041
        L_0x0054:
            if (r0 != 0) goto L_0x0057
            goto L_0x005a
        L_0x0057:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch:{ all -> 0x000e }
        L_0x005a:
            throw r5     // Catch:{ all -> 0x000e }
        L_0x005b:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitcompat.C2330a.mo33943a(android.content.Context, java.util.Set):boolean");
    }

    /* renamed from: b */
    public final synchronized void mo33944b(Context context, Set<File> set) {
        AssetManager assets = context.getAssets();
        for (File c : set) {
            m1406c(assets, c);
        }
    }
}
