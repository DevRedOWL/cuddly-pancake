package com.yandex.metrica.impl.p039ob;

import android.os.Build;
import android.text.TextUtils;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.vu */
public class C4209vu {

    /* renamed from: a */
    private String f5246a;

    /* renamed from: a */
    public String mo41706a() {
        String str = this.f5246a;
        if (str != null) {
            return str;
        }
        this.f5246a = Build.VERSION.SDK_INT >= 18 ? m5915c() : m5914b();
        return this.f5246a;
    }

    /* renamed from: b */
    private String m5914b() {
        try {
            FutureTask futureTask = new FutureTask(new Callable<String>() {
                /* renamed from: a */
                public String call() {
                    return C4209vu.this.m5916d();
                }
            });
            C3320db.m2960k().mo41805d().post(futureTask);
            return (String) futureTask.get(5, TimeUnit.SECONDS);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private String m5915c() {
        return m5916d();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public String m5916d() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            return (String) cls.getMethod("getProcessName", new Class[0]).invoke(cls.getMethod("currentActivityThread", new Class[0]).invoke((Object) null, new Object[0]), new Object[0]);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: a */
    public boolean mo41707a(String str) {
        try {
            if (TextUtils.isEmpty(mo41706a())) {
                return false;
            }
            String a = mo41706a();
            if (a.endsWith(":" + str)) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
