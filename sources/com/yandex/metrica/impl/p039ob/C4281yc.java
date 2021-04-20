package com.yandex.metrica.impl.p039ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.yc */
public class C4281yc {
    /* renamed from: a */
    public PackageInfo mo41859a(Context context, String str) {
        return mo41860a(context, str, 0);
    }

    /* renamed from: a */
    public PackageInfo mo41860a(Context context, String str, int i) {
        try {
            return context.getPackageManager().getPackageInfo(str, i);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public List<ResolveInfo> mo41862a(Context context, Intent intent, int i) {
        try {
            return context.getPackageManager().queryIntentActivities(intent, i);
        } catch (Throwable unused) {
            return new ArrayList();
        }
    }

    /* renamed from: a */
    public List<PackageInfo> mo41861a(Context context, int i) {
        try {
            return context.getPackageManager().getInstalledPackages(i);
        } catch (Throwable unused) {
            return new ArrayList();
        }
    }

    /* renamed from: b */
    public List<ResolveInfo> mo41865b(Context context, Intent intent, int i) {
        try {
            return context.getPackageManager().queryIntentServices(intent, i);
        } catch (Throwable unused) {
            return new ArrayList();
        }
    }

    /* renamed from: c */
    public ResolveInfo mo41867c(Context context, Intent intent, int i) {
        try {
            return context.getPackageManager().resolveService(intent, i);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public ApplicationInfo mo41864b(Context context, String str, int i) {
        try {
            return context.getPackageManager().getApplicationInfo(str, i);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo41863a(Context context, ComponentName componentName, int i, int i2) {
        try {
            context.getPackageManager().setComponentEnabledSetting(componentName, i, i2);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public boolean mo41866b(Context context, String str) {
        try {
            return context.getPackageManager().hasSystemFeature(str);
        } catch (Throwable unused) {
            return false;
        }
    }
}
