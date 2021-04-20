package com.yandex.metrica.push.impl;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.push.impl.bw */
public class C4373bw {

    /* renamed from: a */
    private String f5488a;

    /* renamed from: a */
    public String mo42010a() {
        String str;
        String str2 = this.f5488a;
        if (str2 != null) {
            return str2;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            str = m6433b();
        } else {
            str = m6434d();
        }
        this.f5488a = str;
        return this.f5488a;
    }

    /* renamed from: d */
    private String m6434d() {
        try {
            if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {
                return m6433b();
            }
            FutureTask futureTask = new FutureTask(new Callable<String>() {
                /* renamed from: a */
                public String call() {
                    return C4373bw.m6433b();
                }
            });
            new Handler(Looper.getMainLooper()).post(futureTask);
            return (String) futureTask.get(5, TimeUnit.SECONDS);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    static String m6433b() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            return (String) cls.getMethod("getProcessName", new Class[0]).invoke(cls.getMethod("currentActivityThread", new Class[0]).invoke((Object) null, new Object[0]), new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public boolean mo42011c() {
        try {
            return !C4380cb.m6473b(mo42010a()) && !mo42010a().contains(":");
        } catch (Exception unused) {
            return false;
        }
    }
}
