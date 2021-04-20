package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.ah */
public class C3128ah {
    /* renamed from: a */
    public File mo39466a(Context context) {
        if (C3137am.m2017a()) {
            return context.getNoBackupFilesDir();
        }
        return context.getFilesDir();
    }

    /* renamed from: b */
    public File mo39469b(Context context) {
        return new File(mo39466a(context), "appmetrica_crashes");
    }

    /* renamed from: c */
    public File mo39470c(Context context) {
        return new File(mo39466a(context), "YandexMetricaNativeCrashes");
    }

    /* renamed from: a */
    public File mo39468a(String str) {
        return new File(str);
    }

    /* renamed from: a */
    public File mo39467a(File file, String str) {
        return new File(file, str);
    }
}
