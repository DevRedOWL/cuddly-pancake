package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import com.yandex.metrica.IMetricaService;

/* renamed from: com.yandex.metrica.impl.ob.cn */
public final class C3289cn {

    /* renamed from: a */
    private static final C4281yc f2912a = new C4281yc();

    /* renamed from: c */
    private static Uri m2655c(Context context) {
        return new Uri.Builder().scheme("metrica").authority(context.getPackageName()).build();
    }

    /* renamed from: a */
    public static Intent m2652a(Context context) {
        Intent intent = new Intent(IMetricaService.class.getName(), m2655c(context));
        m2653a(intent);
        return intent;
    }

    /* renamed from: b */
    public static Intent m2654b(Context context) {
        Intent putExtras = m2652a(context).putExtras(m2656d(context));
        putExtras.setData(putExtras.getData().buildUpon().path("client").appendQueryParameter("pid", String.valueOf(Process.myPid())).appendQueryParameter("psid", C3370ee.f3101a).build());
        return putExtras.setPackage(context.getApplicationContext().getPackageName());
    }

    /* renamed from: a */
    public static void m2653a(Intent intent) {
        if (C3306cx.m2869b(11)) {
            intent.addFlags(32);
        }
    }

    /* renamed from: d */
    private static Bundle m2656d(Context context) {
        try {
            Bundle bundle = f2912a.mo41864b(context, context.getPackageName(), 128).metaData;
            return bundle == null ? new Bundle() : bundle;
        } catch (Throwable unused) {
            return new Bundle();
        }
    }
}
