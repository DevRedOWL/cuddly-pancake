package com.yandex.metrica.push.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.yandex.metrica.push.impl.C4386e;
import java.util.Locale;

/* renamed from: com.yandex.metrica.push.impl.av */
public class C4338av implements C4386e {

    /* renamed from: a */
    private final Context f5444a;

    public C4338av(Context context) {
        this.f5444a = context;
    }

    /* renamed from: a */
    public C4386e.C4387a mo41961a(C4402o oVar) {
        int i;
        C4397m g = oVar.mo42126g();
        if (g == null) {
            return C4386e.C4387a.m6482a();
        }
        PackageInfo a = m6321a(this.f5444a);
        if (a == null) {
            i = -1;
        } else {
            i = a.versionCode;
        }
        Integer i2 = g.mo42097i();
        Integer j = g.mo42098j();
        if ((i2 == null || i >= i2.intValue()) && (j == null || i <= j.intValue())) {
            return C4386e.C4387a.m6482a();
        }
        return C4386e.C4387a.m6483a("Wrong app version code", String.format(Locale.US, "Got app version code [%d], allowed min [%d], allowed max [%d]", new Object[]{Integer.valueOf(i), i2, j}));
    }

    /* renamed from: a */
    private static PackageInfo m6321a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable th) {
            C4371bu.m6424a(th, th.getMessage(), new Object[0]);
            return null;
        }
    }
}
