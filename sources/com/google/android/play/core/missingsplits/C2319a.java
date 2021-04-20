package com.google.android.play.core.missingsplits;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.drew.metadata.exif.makernotes.SanyoMakernoteDirectory;
import com.google.android.play.core.internal.C2241ag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.play.core.missingsplits.a */
final class C2319a {

    /* renamed from: a */
    private static final C2241ag f1987a = new C2241ag("MissingSplitsAppComponentsHelper");

    /* renamed from: b */
    private final Context f1988b;

    /* renamed from: c */
    private final PackageManager f1989c;

    C2319a(Context context, PackageManager packageManager) {
        this.f1988b = context;
        this.f1989c = packageManager;
    }

    /* renamed from: d */
    private final void m1379d(List<ComponentInfo> list, int i) {
        for (ComponentInfo next : list) {
            this.f1989c.setComponentEnabledSetting(new ComponentName(next.packageName, next.name), i, 1);
        }
    }

    /* renamed from: e */
    private final List<ComponentInfo> m1380e() {
        try {
            ArrayList arrayList = new ArrayList();
            PackageInfo packageInfo = this.f1989c.getPackageInfo(this.f1988b.getPackageName(), SanyoMakernoteDirectory.TAG_SEQUENTIAL_SHOT);
            if (packageInfo.providers != null) {
                Collections.addAll(arrayList, packageInfo.providers);
            }
            if (packageInfo.receivers != null) {
                Collections.addAll(arrayList, packageInfo.receivers);
            }
            if (packageInfo.services != null) {
                Collections.addAll(arrayList, packageInfo.services);
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            f1987a.mo33812e("Failed to resolve own package : %s", e);
            return Collections.emptyList();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo33929a() {
        for (ComponentInfo next : m1380e()) {
            if (this.f1989c.getComponentEnabledSetting(new ComponentName(next.packageName, next.name)) != 2) {
                f1987a.mo33808a("Not all non-activity components are disabled", new Object[0]);
                return false;
            }
        }
        f1987a.mo33808a("All non-activity components are disabled", new Object[0]);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo33930b() {
        f1987a.mo33811d("Disabling all non-activity components", new Object[0]);
        m1379d(m1380e(), 2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo33931c() {
        f1987a.mo33811d("Resetting enabled state of all non-activity components", new Object[0]);
        m1379d(m1380e(), 0);
    }
}
