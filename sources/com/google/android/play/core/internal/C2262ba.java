package com.google.android.play.core.internal;

import android.util.Log;
import com.google.android.play.core.splitinstall.C2380k;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p042cz.msebera.android.httpclient.cookie.ClientCookie;

/* renamed from: com.google.android.play.core.internal.ba */
final class C2262ba implements C2257aw {

    /* renamed from: a */
    private final /* synthetic */ int f1946a = 0;

    C2262ba() {
    }

    C2262ba(byte[] bArr) {
    }

    C2262ba(char[] cArr) {
    }

    C2262ba(float[] fArr) {
    }

    C2262ba(int[] iArr) {
    }

    C2262ba(short[] sArr) {
    }

    C2262ba(boolean[] zArr) {
    }

    C2262ba(byte[][] bArr) {
    }

    /* renamed from: c */
    static void m1188c(ClassLoader classLoader, Set<File> set) {
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (File next : set) {
                String valueOf = String.valueOf(next.getParentFile().getAbsolutePath());
                Log.d("Splitcompat", valueOf.length() != 0 ? "Adding native library parent directory: ".concat(valueOf) : new String("Adding native library parent directory: "));
                hashSet.add(next.getParentFile());
            }
            C2268bg e = C2269bh.m1215e(m1190e(classLoader), "nativeLibraryDirectories", File.class);
            hashSet.removeAll(Arrays.asList((File[]) e.mo33837a()));
            synchronized (C2380k.class) {
                int size = hashSet.size();
                StringBuilder sb = new StringBuilder(30);
                sb.append("Adding directories ");
                sb.append(size);
                Log.d("Splitcompat", sb.toString());
                e.mo33841e(hashSet);
            }
        }
    }

    /* renamed from: d */
    static boolean m1189d(ClassLoader classLoader, File file, File file2, boolean z, C2260az azVar, String str, C2259ay ayVar) {
        ArrayList arrayList = new ArrayList();
        Object e = m1190e(classLoader);
        C2268bg e2 = C2269bh.m1215e(e, "dexElements", Object.class);
        List<Object> asList = Arrays.asList((Object[]) e2.mo33837a());
        ArrayList arrayList2 = new ArrayList();
        for (Object d : asList) {
            arrayList2.add(C2269bh.m1214d(d, str, File.class).mo33837a());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (z || ayVar.mo33832a(e, file2, file)) {
            e2.mo33840d(Arrays.asList(azVar.mo33833a(e, new ArrayList(Collections.singleton(file2)), file, arrayList)));
            if (arrayList.isEmpty()) {
                return true;
            }
            C2267bf bfVar = new C2267bf("DexPathList.makeDexElement failed");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                IOException iOException = (IOException) arrayList.get(i);
                Log.e("SplitCompat", "DexPathList.makeDexElement failed", iOException);
                C2287bz.m1273a(bfVar, iOException);
            }
            C2269bh.m1215e(e, "dexElementsSuppressedExceptions", IOException.class).mo33840d(arrayList);
            throw bfVar;
        }
        String valueOf = String.valueOf(file2.getPath());
        Log.w("SplitCompat", valueOf.length() != 0 ? "Should be optimized ".concat(valueOf) : new String("Should be optimized "));
        return false;
    }

    /* renamed from: e */
    static Object m1190e(ClassLoader classLoader) {
        return C2269bh.m1214d(classLoader, "pathList", Object.class).mo33837a();
    }

    /* renamed from: f */
    static C2260az m1191f() {
        return new C2263bb((byte[]) null);
    }

    /* renamed from: g */
    static C2259ay m1192g() {
        return new C2266be((byte[]) null);
    }

    /* renamed from: h */
    public static void m1193h(ClassLoader classLoader, Set<File> set, C2264bc bcVar) {
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (File parentFile : set) {
                hashSet.add(parentFile.getParentFile());
            }
            Object e = m1190e(classLoader);
            C2268bg<List> d = C2269bh.m1214d(e, "nativeLibraryDirectories", List.class);
            synchronized (C2380k.class) {
                ArrayList arrayList = new ArrayList(d.mo33837a());
                hashSet.removeAll(arrayList);
                arrayList.addAll(hashSet);
                d.mo33838b(arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            Object[] a = bcVar.mo33836a(e, new ArrayList(hashSet), arrayList2);
            if (!arrayList2.isEmpty()) {
                C2267bf bfVar = new C2267bf("Error in makePathElements");
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    C2287bz.m1273a(bfVar, (IOException) arrayList2.get(i));
                }
                throw bfVar;
            }
            synchronized (C2380k.class) {
                C2269bh.m1215e(e, "nativeLibraryPathElements", Object.class).mo33841e(Arrays.asList(a));
            }
        }
    }

    /* renamed from: i */
    static C2260az m1194i() {
        return new C2263bb();
    }

    /* renamed from: j */
    static C2264bc m1195j() {
        return new C2265bd((byte[]) null);
    }

    /* renamed from: k */
    public static boolean m1196k(ClassLoader classLoader, File file, File file2, boolean z) {
        return m1189d(classLoader, file, file2, z, m1194i(), "zip", m1192g());
    }

    /* renamed from: l */
    static void m1197l(ClassLoader classLoader, Set<File> set) {
        m1193h(classLoader, set, new C2265bd());
    }

    /* renamed from: m */
    static boolean m1198m(ClassLoader classLoader, File file, File file2, boolean z) {
        return m1189d(classLoader, file, file2, z, m1194i(), ClientCookie.PATH_ATTR, new C2266be());
    }

    /* renamed from: a */
    public final void mo33830a(ClassLoader classLoader, Set set) {
        switch (this.f1946a) {
            case 0:
                m1188c(classLoader, set);
                return;
            case 1:
                m1188c(classLoader, set);
                return;
            case 2:
            case 3:
            case 4:
                m1193h(classLoader, set, m1195j());
                return;
            case 5:
                m1197l(classLoader, set);
                return;
            case 6:
                m1197l(classLoader, set);
                return;
            default:
                m1197l(classLoader, set);
                return;
        }
    }

    /* renamed from: b */
    public final boolean mo33831b(ClassLoader classLoader, File file, File file2, boolean z) {
        C2260az f;
        C2259ay g;
        String str;
        switch (this.f1946a) {
            case 0:
            case 1:
                f = m1191f();
                g = m1192g();
                str = "zip";
                break;
            case 2:
                return m1196k(classLoader, file, file2, z);
            case 3:
                return m1196k(classLoader, file, file2, z);
            case 4:
                return m1196k(classLoader, file, file2, z);
            case 5:
                return m1198m(classLoader, file, file2, z);
            case 6:
                return m1198m(classLoader, file, file2, z);
            default:
                f = m1194i();
                g = new C2266be((char[]) null);
                str = ClientCookie.PATH_ATTR;
                break;
        }
        return m1189d(classLoader, file, file2, z, f, str, g);
    }
}
