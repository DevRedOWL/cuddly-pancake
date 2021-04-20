package com.yandex.metrica.impl.p039ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import com.yandex.metrica.MetricaService;

/* renamed from: com.yandex.metrica.impl.ob.vv */
public class C4211vv {

    /* renamed from: a */
    private static final C4281yc f5248a = new C4281yc();

    /* renamed from: com.yandex.metrica.impl.ob.vv$a */
    public static final class C4212a implements Runnable {

        /* renamed from: a */
        final Context f5249a;

        public C4212a(Context context) {
            this.f5249a = context;
        }

        public void run() {
            C4211vv.m5920a(this.f5249a);
        }
    }

    /* renamed from: a */
    public static void m5921a(Context context, ComponentName componentName) {
        f5248a.mo41863a(context, componentName, 1, 1);
    }

    /* renamed from: a */
    public static void m5920a(Context context) {
        m5922b(context);
    }

    /* renamed from: b */
    public static void m5922b(Context context) {
        try {
            PackageInfo a = f5248a.mo41860a(context, context.getPackageName(), 516);
            if (a.services != null) {
                for (ServiceInfo serviceInfo : a.services) {
                    if (MetricaService.class.getName().equals(serviceInfo.name) && !serviceInfo.enabled) {
                        m5921a(context, new ComponentName(context, MetricaService.class));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
