package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.android.play.core.internal.C2254at;
import com.google.android.play.core.internal.C2256av;
import com.google.android.play.core.internal.C2258ax;
import com.google.android.play.core.internal.C2267bf;
import com.google.android.play.core.splitinstall.C2381l;
import com.google.android.play.core.splitinstall.C2385o;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public class SplitCompat {

    /* renamed from: a */
    private static final AtomicReference<SplitCompat> f2010a = new AtomicReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2332c f2011b;

    /* renamed from: c */
    private final Set<String> f2012c = new HashSet();

    /* renamed from: d */
    private final C2330a f2013d;

    private SplitCompat(Context context) {
        try {
            this.f2011b = new C2332c(context);
            this.f2013d = new C2330a(this.f2011b);
        } catch (PackageManager.NameNotFoundException e) {
            throw new C2267bf((Throwable) e);
        }
    }

    /* renamed from: a */
    public static boolean m1398a(Context context) {
        return m1404g(context, true);
    }

    /* renamed from: b */
    public static boolean m1399b() {
        return f2010a.get() != null;
    }

    /* renamed from: e */
    private static boolean m1402e() {
        return Build.VERSION.SDK_INT < 21;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final Set<String> m1403f() {
        HashSet hashSet;
        synchronized (this.f2012c) {
            hashSet = new HashSet(this.f2012c);
        }
        return hashSet;
    }

    /* renamed from: g */
    private static boolean m1404g(Context context, boolean z) {
        if (m1402e()) {
            return false;
        }
        boolean compareAndSet = f2010a.compareAndSet((Object) null, new SplitCompat(context));
        SplitCompat splitCompat = f2010a.get();
        if (compareAndSet) {
            C2381l.f2114a.mo34031b(new C2254at(context, C2345p.m1445a(), new C2256av(context, splitCompat.f2011b, new C2258ax(), (byte[]) null), splitCompat.f2011b, new C2345p()));
            C2385o.m1537b(new C2341l(splitCompat));
            C2345p.m1445a().execute(new C2342m(context));
        }
        try {
            splitCompat.m1405h(context, z);
            return true;
        } catch (Exception e) {
            Log.e("SplitCompat", "Error installing additional splits", e);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a4 A[SYNTHETIC, Splitter:B:79:0x01a4] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m1405h(android.content.Context r9, boolean r10) throws java.io.IOException {
        /*
            r8 = this;
            monitor-enter(r8)
            if (r10 == 0) goto L_0x0009
            com.google.android.play.core.splitcompat.c r0 = r8.f2011b     // Catch:{ all -> 0x0244 }
            r0.mo33946a()     // Catch:{ all -> 0x0244 }
            goto L_0x0015
        L_0x0009:
            java.util.concurrent.Executor r0 = com.google.android.play.core.splitcompat.C2345p.m1445a()     // Catch:{ all -> 0x0244 }
            com.google.android.play.core.splitcompat.n r1 = new com.google.android.play.core.splitcompat.n     // Catch:{ all -> 0x0244 }
            r1.<init>(r8)     // Catch:{ all -> 0x0244 }
            r0.execute(r1)     // Catch:{ all -> 0x0244 }
        L_0x0015:
            java.lang.String r0 = r9.getPackageName()     // Catch:{ all -> 0x0244 }
            r1 = 0
            android.content.pm.PackageManager r2 = r9.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0232 }
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r0, r1)     // Catch:{ NameNotFoundException -> 0x0232 }
            java.lang.String[] r3 = r2.splitNames     // Catch:{ NameNotFoundException -> 0x0232 }
            if (r3 != 0) goto L_0x002c
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ NameNotFoundException -> 0x0232 }
            r2.<init>()     // Catch:{ NameNotFoundException -> 0x0232 }
            goto L_0x0032
        L_0x002c:
            java.lang.String[] r2 = r2.splitNames     // Catch:{ NameNotFoundException -> 0x0232 }
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch:{ NameNotFoundException -> 0x0232 }
        L_0x0032:
            com.google.android.play.core.splitcompat.c r0 = r8.f2011b     // Catch:{ all -> 0x0244 }
            java.util.Set r0 = r0.mo33954i()     // Catch:{ all -> 0x0244 }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x0244 }
            r3.<init>()     // Catch:{ all -> 0x0244 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x0244 }
        L_0x0041:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0244 }
            if (r5 == 0) goto L_0x0066
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0244 }
            com.google.android.play.core.splitcompat.q r5 = (com.google.android.play.core.splitcompat.C2346q) r5     // Catch:{ all -> 0x0244 }
            java.lang.String r5 = r5.mo33969b()     // Catch:{ all -> 0x0244 }
            boolean r6 = r2.contains(r5)     // Catch:{ all -> 0x0244 }
            if (r6 == 0) goto L_0x0041
            if (r10 == 0) goto L_0x005f
            com.google.android.play.core.splitcompat.c r6 = r8.f2011b     // Catch:{ all -> 0x0244 }
            r6.mo33959n(r5)     // Catch:{ all -> 0x0244 }
            goto L_0x0062
        L_0x005f:
            r3.add(r5)     // Catch:{ all -> 0x0244 }
        L_0x0062:
            r4.remove()     // Catch:{ all -> 0x0244 }
            goto L_0x0041
        L_0x0066:
            boolean r4 = r3.isEmpty()     // Catch:{ all -> 0x0244 }
            if (r4 != 0) goto L_0x0078
            java.util.concurrent.Executor r4 = com.google.android.play.core.splitcompat.C2345p.m1445a()     // Catch:{ all -> 0x0244 }
            com.google.android.play.core.splitcompat.o r5 = new com.google.android.play.core.splitcompat.o     // Catch:{ all -> 0x0244 }
            r5.<init>(r8, r3)     // Catch:{ all -> 0x0244 }
            r4.execute(r5)     // Catch:{ all -> 0x0244 }
        L_0x0078:
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x0244 }
            r3.<init>()     // Catch:{ all -> 0x0244 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x0244 }
        L_0x0081:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0244 }
            if (r5 == 0) goto L_0x009b
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0244 }
            com.google.android.play.core.splitcompat.q r5 = (com.google.android.play.core.splitcompat.C2346q) r5     // Catch:{ all -> 0x0244 }
            java.lang.String r5 = r5.mo33969b()     // Catch:{ all -> 0x0244 }
            boolean r6 = com.google.android.play.core.splitinstall.C2386p.m1539e(r5)     // Catch:{ all -> 0x0244 }
            if (r6 != 0) goto L_0x0081
            r3.add(r5)     // Catch:{ all -> 0x0244 }
            goto L_0x0081
        L_0x009b:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0244 }
        L_0x009f:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0244 }
            if (r4 == 0) goto L_0x00b5
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0244 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0244 }
            boolean r5 = com.google.android.play.core.splitinstall.C2386p.m1539e(r4)     // Catch:{ all -> 0x0244 }
            if (r5 != 0) goto L_0x009f
            r3.add(r4)     // Catch:{ all -> 0x0244 }
            goto L_0x009f
        L_0x00b5:
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x0244 }
            int r4 = r0.size()     // Catch:{ all -> 0x0244 }
            r2.<init>(r4)     // Catch:{ all -> 0x0244 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0244 }
        L_0x00c2:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0244 }
            if (r4 == 0) goto L_0x00f8
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0244 }
            com.google.android.play.core.splitcompat.q r4 = (com.google.android.play.core.splitcompat.C2346q) r4     // Catch:{ all -> 0x0244 }
            java.lang.String r5 = r4.mo33969b()     // Catch:{ all -> 0x0244 }
            boolean r5 = com.google.android.play.core.splitinstall.C2386p.m1538d(r5)     // Catch:{ all -> 0x0244 }
            if (r5 != 0) goto L_0x00f4
            java.lang.String r5 = r4.mo33969b()     // Catch:{ all -> 0x0244 }
            boolean r6 = com.google.android.play.core.splitinstall.C2386p.m1538d(r5)     // Catch:{ all -> 0x0244 }
            if (r6 == 0) goto L_0x00e5
            java.lang.String r5 = ""
            goto L_0x00ee
        L_0x00e5:
            java.lang.String r6 = "\\.config\\."
            r7 = 2
            java.lang.String[] r5 = r5.split(r6, r7)     // Catch:{ all -> 0x0244 }
            r5 = r5[r1]     // Catch:{ all -> 0x0244 }
        L_0x00ee:
            boolean r5 = r3.contains(r5)     // Catch:{ all -> 0x0244 }
            if (r5 == 0) goto L_0x00c2
        L_0x00f4:
            r2.add(r4)     // Catch:{ all -> 0x0244 }
            goto L_0x00c2
        L_0x00f8:
            com.google.android.play.core.splitcompat.k r0 = new com.google.android.play.core.splitcompat.k     // Catch:{ all -> 0x0244 }
            com.google.android.play.core.splitcompat.c r1 = r8.f2011b     // Catch:{ all -> 0x0244 }
            r0.<init>(r1)     // Catch:{ all -> 0x0244 }
            com.google.android.play.core.internal.aw r1 = com.google.android.play.core.internal.C2258ax.m1180a()     // Catch:{ all -> 0x0244 }
            java.lang.ClassLoader r3 = r9.getClassLoader()     // Catch:{ all -> 0x0244 }
            if (r10 == 0) goto L_0x0111
            java.util.Set r0 = r0.mo33962a()     // Catch:{ all -> 0x0244 }
            r1.mo33830a(r3, r0)     // Catch:{ all -> 0x0244 }
            goto L_0x012f
        L_0x0111:
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x0244 }
        L_0x0115:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0244 }
            if (r5 == 0) goto L_0x012f
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0244 }
            com.google.android.play.core.splitcompat.q r5 = (com.google.android.play.core.splitcompat.C2346q) r5     // Catch:{ all -> 0x0244 }
            java.util.Set r5 = r0.mo33963b(r5)     // Catch:{ all -> 0x0244 }
            if (r5 != 0) goto L_0x012b
            r4.remove()     // Catch:{ all -> 0x0244 }
            goto L_0x0115
        L_0x012b:
            r1.mo33830a(r3, r5)     // Catch:{ all -> 0x0244 }
            goto L_0x0115
        L_0x012f:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0244 }
            r0.<init>()     // Catch:{ all -> 0x0244 }
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x0244 }
        L_0x0138:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0244 }
            if (r5 == 0) goto L_0x01ad
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0244 }
            com.google.android.play.core.splitcompat.q r5 = (com.google.android.play.core.splitcompat.C2346q) r5     // Catch:{ all -> 0x0244 }
            java.util.zip.ZipFile r6 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x01a0 }
            java.io.File r7 = r5.mo33968a()     // Catch:{ IOException -> 0x01a0 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x01a0 }
            java.lang.String r7 = "classes.dex"
            java.util.zip.ZipEntry r7 = r6.getEntry(r7)     // Catch:{ IOException -> 0x019e }
            r6.close()     // Catch:{ IOException -> 0x019e }
            if (r7 == 0) goto L_0x0196
            com.google.android.play.core.splitcompat.c r6 = r8.f2011b     // Catch:{ all -> 0x0244 }
            java.lang.String r7 = r5.mo33969b()     // Catch:{ all -> 0x0244 }
            java.io.File r6 = r6.mo33953h(r7)     // Catch:{ all -> 0x0244 }
            java.io.File r7 = r5.mo33968a()     // Catch:{ all -> 0x0244 }
            boolean r6 = r1.mo33831b(r3, r6, r7, r10)     // Catch:{ all -> 0x0244 }
            if (r6 == 0) goto L_0x016d
            goto L_0x0196
        L_0x016d:
            java.io.File r5 = r5.mo33968a()     // Catch:{ all -> 0x0244 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0244 }
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0244 }
            int r6 = r6.length()     // Catch:{ all -> 0x0244 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0244 }
            int r6 = r6 + 24
            r7.<init>(r6)     // Catch:{ all -> 0x0244 }
            java.lang.String r6 = "split was not installed "
            r7.append(r6)     // Catch:{ all -> 0x0244 }
            r7.append(r5)     // Catch:{ all -> 0x0244 }
            java.lang.String r5 = "SplitCompat"
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x0244 }
            android.util.Log.w(r5, r6)     // Catch:{ all -> 0x0244 }
            goto L_0x0138
        L_0x0196:
            java.io.File r5 = r5.mo33968a()     // Catch:{ all -> 0x0244 }
            r0.add(r5)     // Catch:{ all -> 0x0244 }
            goto L_0x0138
        L_0x019e:
            r9 = move-exception
            goto L_0x01a2
        L_0x01a0:
            r9 = move-exception
            r6 = 0
        L_0x01a2:
            if (r6 == 0) goto L_0x01ac
            r6.close()     // Catch:{ IOException -> 0x01a8 }
            goto L_0x01ac
        L_0x01a8:
            r10 = move-exception
            com.google.android.play.core.internal.C2287bz.m1273a(r9, r10)     // Catch:{ all -> 0x0244 }
        L_0x01ac:
            throw r9     // Catch:{ all -> 0x0244 }
        L_0x01ad:
            com.google.android.play.core.splitcompat.a r10 = r8.f2013d     // Catch:{ all -> 0x0244 }
            r10.mo33944b(r9, r0)     // Catch:{ all -> 0x0244 }
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ all -> 0x0244 }
            r9.<init>()     // Catch:{ all -> 0x0244 }
            java.util.Iterator r10 = r2.iterator()     // Catch:{ all -> 0x0244 }
        L_0x01bb:
            boolean r1 = r10.hasNext()     // Catch:{ all -> 0x0244 }
            if (r1 == 0) goto L_0x0224
            java.lang.Object r1 = r10.next()     // Catch:{ all -> 0x0244 }
            com.google.android.play.core.splitcompat.q r1 = (com.google.android.play.core.splitcompat.C2346q) r1     // Catch:{ all -> 0x0244 }
            java.io.File r2 = r1.mo33968a()     // Catch:{ all -> 0x0244 }
            boolean r2 = r0.contains(r2)     // Catch:{ all -> 0x0244 }
            if (r2 == 0) goto L_0x01fe
            java.lang.String r2 = r1.mo33969b()     // Catch:{ all -> 0x0244 }
            int r3 = r2.length()     // Catch:{ all -> 0x0244 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0244 }
            int r3 = r3 + 30
            r4.<init>(r3)     // Catch:{ all -> 0x0244 }
            java.lang.String r3 = "Split '"
            r4.append(r3)     // Catch:{ all -> 0x0244 }
            r4.append(r2)     // Catch:{ all -> 0x0244 }
            java.lang.String r2 = "' installation emulated"
            r4.append(r2)     // Catch:{ all -> 0x0244 }
            java.lang.String r2 = "SplitCompat"
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0244 }
            android.util.Log.d(r2, r3)     // Catch:{ all -> 0x0244 }
            java.lang.String r1 = r1.mo33969b()     // Catch:{ all -> 0x0244 }
            r9.add(r1)     // Catch:{ all -> 0x0244 }
            goto L_0x01bb
        L_0x01fe:
            java.lang.String r1 = r1.mo33969b()     // Catch:{ all -> 0x0244 }
            int r2 = r1.length()     // Catch:{ all -> 0x0244 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0244 }
            int r2 = r2 + 35
            r3.<init>(r2)     // Catch:{ all -> 0x0244 }
            java.lang.String r2 = "Split '"
            r3.append(r2)     // Catch:{ all -> 0x0244 }
            r3.append(r1)     // Catch:{ all -> 0x0244 }
            java.lang.String r1 = "' installation not emulated."
            r3.append(r1)     // Catch:{ all -> 0x0244 }
            java.lang.String r1 = "SplitCompat"
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0244 }
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x0244 }
            goto L_0x01bb
        L_0x0224:
            java.util.Set<java.lang.String> r10 = r8.f2012c     // Catch:{ all -> 0x0244 }
            monitor-enter(r10)     // Catch:{ all -> 0x0244 }
            java.util.Set<java.lang.String> r0 = r8.f2012c     // Catch:{ all -> 0x022f }
            r0.addAll(r9)     // Catch:{ all -> 0x022f }
            monitor-exit(r10)     // Catch:{ all -> 0x022f }
            monitor-exit(r8)
            return
        L_0x022f:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x022f }
            throw r9     // Catch:{ all -> 0x0244 }
        L_0x0232:
            r9 = move-exception
            java.io.IOException r10 = new java.io.IOException     // Catch:{ all -> 0x0244 }
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0244 }
            r2[r1] = r0     // Catch:{ all -> 0x0244 }
            java.lang.String r0 = "Cannot load data for application '%s'"
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x0244 }
            r10.<init>(r0, r9)     // Catch:{ all -> 0x0244 }
            throw r10     // Catch:{ all -> 0x0244 }
        L_0x0244:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitcompat.SplitCompat.m1405h(android.content.Context, boolean):void");
    }

    public static boolean install(Context context) {
        return m1404g(context, false);
    }

    public static boolean installActivity(Context context) {
        if (m1402e()) {
            return false;
        }
        SplitCompat splitCompat = f2010a.get();
        if (splitCompat != null) {
            return splitCompat.f2013d.mo33943a(context, splitCompat.m1403f());
        }
        if (context.getApplicationContext() != null) {
            install(context.getApplicationContext());
        }
        return install(context);
    }
}
