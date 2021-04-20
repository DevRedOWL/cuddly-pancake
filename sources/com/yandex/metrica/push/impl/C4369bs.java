package com.yandex.metrica.push.impl;

import android.os.Process;
import android.util.Log;
import java.util.Locale;

/* renamed from: com.yandex.metrica.push.impl.bs */
public abstract class C4369bs {

    /* renamed from: a */
    protected volatile boolean f5485a = false;

    /* renamed from: a */
    private static String m6413a(String str) {
        return str == null ? "" : str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract String mo42006b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract String mo42007c();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo42005a() {
        return this.f5485a;
    }

    /* renamed from: a */
    private static String m6414a(String str, Object[] objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 5;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            }
            Class<? super Object> superclass = stackTrace[i].getClass().getSuperclass();
            if (superclass == null || !superclass.equals(C4369bs.class)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                str2 = substring.substring(substring.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
            } else {
                i++;
            }
        }
        String className2 = stackTrace[i].getClassName();
        String substring2 = className2.substring(className2.lastIndexOf(46) + 1);
        str2 = substring2.substring(substring2.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
        return String.format(Locale.US, "[%d/%d] %s: %s", new Object[]{Integer.valueOf(Process.myPid()), Long.valueOf(Thread.currentThread().getId()), str2, str});
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo42003a(int i, String str, Object... objArr) {
        if (mo42005a()) {
            Log.println(i, mo42006b(), m6415b(str, objArr));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo42004a(int i, Throwable th, String str, Object... objArr) {
        if (mo42005a()) {
            String b = mo42006b();
            Log.println(i, b, m6415b(str, objArr) + "\n" + Log.getStackTraceString(th));
        }
    }

    /* renamed from: b */
    private String m6415b(String str, Object[] objArr) {
        return mo42007c() + m6414a(m6413a(str), objArr);
    }
}
