package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.google.android.play.core.internal.C2241ag;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.play.core.splitinstall.p */
public final class C2386p {

    /* renamed from: a */
    private static final C2241ag f2119a = new C2241ag("SplitInstallInfoProvider");

    /* renamed from: b */
    private final Context f2120b;

    /* renamed from: c */
    private final String f2121c;

    public C2386p(Context context) {
        this.f2120b = context;
        this.f2121c = context.getPackageName();
    }

    public C2386p(Context context, String str) {
        this.f2120b = context;
        this.f2121c = str;
    }

    /* renamed from: d */
    public static boolean m1538d(String str) {
        return str.startsWith("config.");
    }

    /* renamed from: e */
    public static boolean m1539e(String str) {
        return m1538d(str) || str.contains(".config.");
    }

    /* renamed from: f */
    private final Set<String> m1540f() {
        HashSet hashSet = new HashSet();
        Bundle g = m1541g();
        if (g != null) {
            String string = g.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                f2119a.mo33808a("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
                hashSet.remove("base");
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            String[] strArr = null;
            try {
                PackageInfo packageInfo = this.f2120b.getPackageManager().getPackageInfo(this.f2121c, 0);
                if (packageInfo != null) {
                    strArr = packageInfo.splitNames;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f2119a.mo33812e("App is not found in PackageManager", new Object[0]);
            }
            if (strArr != null) {
                f2119a.mo33808a("Adding splits from package manager: %s", Arrays.toString(strArr));
                Collections.addAll(hashSet, strArr);
            } else {
                f2119a.mo33808a("No splits are found or app cannot be found in package manager.", new Object[0]);
            }
            C2384n a = C2385o.m1536a();
            if (a != null) {
                hashSet.addAll(a.mo33964a());
            }
        }
        return hashSet;
    }

    /* renamed from: g */
    private final Bundle m1541g() {
        try {
            ApplicationInfo applicationInfo = this.f2120b.getPackageManager().getApplicationInfo(this.f2121c, 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                return applicationInfo.metaData;
            }
            f2119a.mo33808a("App has no applicationInfo or metaData", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            f2119a.mo33812e("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public final Set<String> mo34032a() {
        HashSet hashSet = new HashSet();
        for (String next : m1540f()) {
            if (!m1539e(next)) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    /* renamed from: b */
    public final Set<String> mo34033b() {
        C2377h c = mo34034c();
        if (c == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Set<String> f = m1540f();
        f.add("");
        Set<String> a = mo34032a();
        a.add("");
        for (Map.Entry next : c.mo34030a(a).entrySet()) {
            if (f.containsAll((Collection) next.getValue())) {
                hashSet.add((String) next.getKey());
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    public final C2377h mo34034c() {
        Bundle g = m1541g();
        if (g == null) {
            f2119a.mo33812e("No metadata found in Context.", new Object[0]);
            return null;
        }
        int i = g.getInt("com.android.vending.splits");
        if (i == 0) {
            f2119a.mo33812e("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            C2377h b = C2380k.m1527b(this.f2120b.getResources().getXml(i), new C2376g());
            if (b == null) {
                f2119a.mo33812e("Can't parse languages metadata.", new Object[0]);
            }
            return b;
        } catch (Resources.NotFoundException unused) {
            f2119a.mo33812e("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }
}
