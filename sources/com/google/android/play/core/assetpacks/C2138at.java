package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.play.core.internal.C2241ag;
import com.google.android.play.core.internal.C2287bz;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.play.core.assetpacks.at */
final class C2138at {

    /* renamed from: a */
    private static final C2241ag f1560a = new C2241ag("AssetPackStorage");

    /* renamed from: b */
    private static final long f1561b = TimeUnit.DAYS.toMillis(14);

    /* renamed from: c */
    private static final long f1562c = TimeUnit.DAYS.toMillis(28);

    /* renamed from: d */
    private final Context f1563d;

    /* renamed from: e */
    private final C2194cv f1564e;

    C2138at(Context context, C2194cv cvVar) {
        this.f1563d = context;
        this.f1564e = cvVar;
    }

    /* renamed from: D */
    private final File m888D(String str, int i) {
        return new File(m889E(str), String.valueOf(i));
    }

    /* renamed from: E */
    private final File m889E(String str) {
        return new File(m899O(), str);
    }

    /* renamed from: F */
    private final File m890F(String str, int i, long j) {
        return new File(mo33642j(str, i, j), "merge.tmp");
    }

    /* renamed from: G */
    private static void m891G(File file) {
        if (file.listFiles() != null && file.listFiles().length > 1) {
            long J = m894J(file);
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals(String.valueOf(J)) && !file2.getName().equals("stale.tmp")) {
                    m900P(file2);
                }
            }
        }
    }

    /* renamed from: H */
    private static long m892H(File file) {
        return m893I(file, true);
    }

    /* renamed from: I */
    private static long m893I(File file, boolean z) {
        if (!file.exists()) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        if (z && file.listFiles().length > 1) {
            f1560a.mo33812e("Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e) {
            f1560a.mo33810c(e, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    /* renamed from: J */
    private static long m894J(File file) {
        return m893I(file, false);
    }

    /* renamed from: K */
    private static List<String> m895K(PackageInfo packageInfo, String str) {
        ArrayList arrayList = new ArrayList();
        if (packageInfo.splitNames == null) {
            return arrayList;
        }
        int i = (-Arrays.binarySearch(packageInfo.splitNames, str)) - 1;
        while (i < packageInfo.splitNames.length && packageInfo.splitNames[i].startsWith(str)) {
            arrayList.add(packageInfo.applicationInfo.splitSourceDirs[i]);
            i++;
        }
        return arrayList;
    }

    /* renamed from: L */
    private final List<File> m896L() {
        ArrayList arrayList = new ArrayList();
        try {
            if (m899O().exists()) {
                if (m899O().listFiles() != null) {
                    for (File file : m899O().listFiles()) {
                        if (!file.getCanonicalPath().equals(m898N().getCanonicalPath())) {
                            arrayList.add(file);
                        }
                    }
                    return arrayList;
                }
            }
            return arrayList;
        } catch (IOException e) {
            f1560a.mo33809b("Could not process directory while scanning installed packs. %s", e);
        }
    }

    /* renamed from: M */
    private final File m897M(String str, int i, long j) {
        return new File(new File(new File(m898N(), str), String.valueOf(i)), String.valueOf(j));
    }

    /* renamed from: N */
    private final File m898N() {
        return new File(m899O(), "_tmp");
    }

    /* renamed from: O */
    private final File m899O() {
        return new File(this.f1563d.getFilesDir(), "assetpacks");
    }

    /* renamed from: P */
    private static boolean m900P(File file) {
        boolean z;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z = true;
            for (File P : listFiles) {
                z &= m900P(P);
            }
        } else {
            z = true;
        }
        return file.delete() && true == z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo33630A(List<String> list) {
        int a = this.f1564e.mo33740a();
        for (File next : m896L()) {
            if (!list.contains(next.getName()) && m892H(next) != ((long) a)) {
                m900P(next);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo33631B(String str, int i, long j) {
        if (m897M(str, i, j).exists()) {
            m900P(m897M(str, i, j));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final void mo33632C(String str, int i, long j) {
        if (mo33638f(str, i, j).exists()) {
            m900P(mo33638f(str, i, j));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo33633a(String str) {
        try {
            return mo33637e(str) != null;
        } catch (IOException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Map<String, AssetPackLocation> mo33634b() {
        HashMap hashMap = new HashMap();
        try {
            for (File next : m896L()) {
                AssetPackLocation d = mo33636d(next.getName());
                if (d != null) {
                    hashMap.put(next.getName(), d);
                }
            }
        } catch (IOException e) {
            f1560a.mo33809b("Could not process directory while scanning installed packs: %s", e);
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Map<String, Long> mo33635c() {
        HashMap hashMap = new HashMap();
        for (String next : mo33634b().keySet()) {
            hashMap.put(next, Long.valueOf(mo33653u(next)));
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final AssetPackLocation mo33636d(String str) throws IOException {
        String e = mo33637e(str);
        if (e == null) {
            return null;
        }
        File file = new File(e, "assets");
        if (file.isDirectory()) {
            return AssetPackLocation.m814b(e, file.getCanonicalPath());
        }
        f1560a.mo33809b("Failed to find assets directory: %s", file);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final String mo33637e(String str) throws IOException {
        int length;
        File file = new File(m899O(), str);
        if (!file.exists()) {
            f1560a.mo33808a("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.f1564e.mo33740a()));
        if (!file2.exists()) {
            f1560a.mo33808a("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.f1564e.mo33740a()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            f1560a.mo33808a("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.f1564e.mo33740a()));
            return null;
        } else if (length <= 1) {
            return listFiles[0].getCanonicalPath();
        } else {
            f1560a.mo33809b("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.f1564e.mo33740a()));
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final File mo33638f(String str, int i, long j) {
        return new File(m888D(str, i), String.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final File mo33639g(String str, int i, long j) {
        return new File(mo33638f(str, i, j), "_metadata");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final File mo33640h(String str, int i, long j, String str2) {
        return new File(new File(new File(m897M(str, i, j), "_slices"), "_unverified"), str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final File mo33641i(String str, int i, long j, String str2) {
        return new File(new File(new File(m897M(str, i, j), "_slices"), "_verified"), str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final File mo33642j(String str, int i, long j) {
        return new File(m897M(str, i, j), "_packs");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final int mo33643k(String str, int i, long j) throws IOException {
        File F = m890F(str, i, j);
        if (!F.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(F);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") != null) {
                try {
                    return Integer.parseInt(properties.getProperty("numberOfMerges"));
                } catch (NumberFormatException e) {
                    throw new C2155bj("Merge checkpoint file corrupt.", (Exception) e);
                }
            } else {
                throw new C2155bj("Merge checkpoint file corrupt.");
            }
        } catch (Throwable th) {
            C2287bz.m1273a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo33644l(String str, int i, long j, int i2) throws IOException {
        File F = m890F(str, i, j);
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i2));
        F.getParentFile().mkdirs();
        F.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(F);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final File mo33645m(String str, int i, long j, String str2) {
        return new File(mo33647o(str, i, j, str2), "checkpoint.dat");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final File mo33646n(String str, int i, long j, String str2) {
        return new File(mo33647o(str, i, j, str2), "checkpoint_ext.dat");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final File mo33647o(String str, int i, long j, String str2) {
        return new File(mo33648p(str, i, j), str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final File mo33648p(String str, int i, long j) {
        return new File(new File(m897M(str, i, j), "_slices"), "_metadata");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final boolean mo33649q(String str) {
        if (!m889E(str).exists()) {
            return true;
        }
        return m900P(m889E(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo33650r(String str, int i, long j) {
        File E = m889E(str);
        if (E.exists()) {
            for (File file : E.listFiles()) {
                if (!file.getName().equals(String.valueOf(i)) && !file.getName().equals("stale.tmp")) {
                    m900P(file);
                } else if (file.getName().equals(String.valueOf(i))) {
                    for (File file2 : file.listFiles()) {
                        if (!file2.getName().equals(String.valueOf(j))) {
                            m900P(file2);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo33651s() {
        for (File next : m896L()) {
            if (next.listFiles() != null) {
                m891G(next);
                long J = m894J(next);
                if (((long) this.f1564e.mo33740a()) != J) {
                    try {
                        new File(new File(next, String.valueOf(J)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        f1560a.mo33809b("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File G : next.listFiles()) {
                    m891G(G);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final int mo33652t(String str) {
        return (int) m892H(m889E(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final long mo33653u(String str) {
        return m892H(m888D(str, mo33652t(str)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo33654v() {
        for (File next : m896L()) {
            if (next.listFiles() != null) {
                for (File file : next.listFiles()) {
                    File file2 = new File(file, "stale.tmp");
                    if (file2.exists() && System.currentTimeMillis() - file2.lastModified() > f1562c) {
                        m900P(file);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo33655w() {
        if (m898N().exists()) {
            for (File file : m898N().listFiles()) {
                if (System.currentTimeMillis() - file.lastModified() > f1561b) {
                    m900P(file);
                } else {
                    m891G(file);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo33656x() {
        m900P(m899O());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0073  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.play.core.assetpacks.AssetLocation mo33657y(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            android.content.Context r2 = r8.f1563d     // Catch:{ NameNotFoundException -> 0x0013 }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0013 }
            android.content.Context r3 = r8.f1563d     // Catch:{ NameNotFoundException -> 0x0013 }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ NameNotFoundException -> 0x0013 }
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r0)     // Catch:{ NameNotFoundException -> 0x0013 }
            goto L_0x001d
        L_0x0013:
            com.google.android.play.core.internal.ag r2 = f1560a
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r4 = "Could not find PackageInfo."
            r2.mo33809b(r4, r3)
            r2 = r1
        L_0x001d:
            r3 = 1
            if (r2 != 0) goto L_0x0022
            r4 = r1
            goto L_0x0087
        L_0x0022:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 21
            if (r5 >= r6) goto L_0x0035
            android.content.pm.ApplicationInfo r2 = r2.applicationInfo
            java.lang.String r2 = r2.sourceDir
            r4.add(r2)
            goto L_0x0087
        L_0x0035:
            java.lang.String[] r5 = r2.splitNames
            if (r5 == 0) goto L_0x005b
            android.content.pm.ApplicationInfo r5 = r2.applicationInfo
            java.lang.String[] r5 = r5.splitSourceDirs
            if (r5 != 0) goto L_0x0040
            goto L_0x005b
        L_0x0040:
            java.lang.String[] r5 = r2.splitNames
            int r5 = java.util.Arrays.binarySearch(r5, r9)
            if (r5 >= 0) goto L_0x0054
            com.google.android.play.core.internal.ag r5 = f1560a
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r0] = r9
            java.lang.String r7 = "Asset Pack '%s' is not installed."
            r5.mo33808a(r7, r6)
            goto L_0x0066
        L_0x0054:
            android.content.pm.ApplicationInfo r6 = r2.applicationInfo
            java.lang.String[] r6 = r6.splitSourceDirs
            r5 = r6[r5]
            goto L_0x0067
        L_0x005b:
            com.google.android.play.core.internal.ag r5 = f1560a
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r0] = r9
            java.lang.String r7 = "No splits present for package %s."
            r5.mo33808a(r7, r6)
        L_0x0066:
            r5 = r1
        L_0x0067:
            if (r5 != 0) goto L_0x0073
            android.content.pm.ApplicationInfo r5 = r2.applicationInfo
            java.lang.String r5 = r5.sourceDir
            r4.add(r5)
            java.lang.String r5 = "config."
            goto L_0x0080
        L_0x0073:
            r4.add(r5)
            java.lang.String r5 = java.lang.String.valueOf(r9)
            java.lang.String r6 = ".config."
            java.lang.String r5 = r5.concat(r6)
        L_0x0080:
            java.util.List r2 = m895K(r2, r5)
            r4.addAll(r2)
        L_0x0087:
            if (r4 != 0) goto L_0x008a
            goto L_0x00cd
        L_0x008a:
            java.io.File r2 = new java.io.File
            java.lang.String r5 = "assets"
            r2.<init>(r5, r10)
            java.lang.String r2 = r2.getPath()
            java.util.Iterator r5 = r4.iterator()
        L_0x0099:
            boolean r6 = r5.hasNext()
            r7 = 2
            if (r6 == 0) goto L_0x00bd
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            com.google.android.play.core.assetpacks.AssetLocation r6 = com.google.android.play.core.assetpacks.C2183ck.m1014b(r6, r2)     // Catch:{ IOException -> 0x00ae }
            if (r6 == 0) goto L_0x0099
            r1 = r6
            goto L_0x00cd
        L_0x00ae:
            r9 = move-exception
            com.google.android.play.core.internal.ag r2 = f1560a
            java.lang.Object[] r4 = new java.lang.Object[r7]
            r4[r0] = r6
            r4[r3] = r10
            java.lang.String r10 = "Failed to parse APK file '%s' looking for asset '%s'."
            r2.mo33810c(r9, r10, r4)
            goto L_0x00cd
        L_0x00bd:
            com.google.android.play.core.internal.ag r2 = f1560a
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r0] = r10
            r5[r3] = r9
            r5[r7] = r4
            java.lang.String r9 = "The asset %s is not present in Asset Pack %s. Searched in APKs: %s"
            r2.mo33808a(r9, r5)
        L_0x00cd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C2138at.mo33657y(java.lang.String, java.lang.String):com.google.android.play.core.assetpacks.AssetLocation");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final AssetLocation mo33658z(String str, String str2, AssetPackLocation assetPackLocation) {
        File file = new File(assetPackLocation.assetsPath(), str2);
        if (file.exists()) {
            return AssetLocation.m812a(file.getPath(), 0, file.length());
        }
        f1560a.mo33808a("The asset %s is not present in Asset Pack %s. Searched in folder: %s", str2, str, assetPackLocation.assetsPath());
        return null;
    }
}
