package com.yandex.metrica.impl.p039ob;

import android.util.Log;

/* renamed from: com.yandex.metrica.impl.ob.vh */
public abstract class C4195vh {

    /* renamed from: a */
    private volatile boolean f5239a = false;

    /* renamed from: e */
    private static String m5842e(String str) {
        return str == null ? "" : str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract String mo41689d(String str, Object[] objArr);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract String mo41692f();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract String mo41693g();

    /* renamed from: a */
    public void mo41677a() {
        this.f5239a = true;
    }

    /* renamed from: b */
    public void mo41683b() {
        this.f5239a = false;
    }

    /* renamed from: c */
    public boolean mo41688c() {
        return this.f5239a;
    }

    public C4195vh(boolean z) {
        this.f5239a = z;
    }

    /* renamed from: a */
    public void mo41680a(String str) {
        mo41678a(4, str);
    }

    /* renamed from: b */
    public void mo41684b(String str) {
        mo41678a(5, str);
    }

    /* renamed from: c */
    public void mo41686c(String str) {
        mo41678a(6, str);
    }

    /* renamed from: a */
    public void mo41681a(String str, Object... objArr) {
        mo41679a(4, str, objArr);
    }

    /* renamed from: b */
    public void mo41685b(String str, Object... objArr) {
        mo41679a(5, str, objArr);
    }

    /* renamed from: c */
    public void mo41687c(String str, Object... objArr) {
        Log.println(5, mo41692f(), m5843e(str, objArr));
    }

    /* renamed from: a */
    public void mo41682a(Throwable th, String str, Object... objArr) {
        String f = mo41692f();
        Log.println(6, f, m5843e(str, objArr) + "\n" + Log.getStackTraceString(th));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41678a(int i, String str) {
        if (mo41690d()) {
            Log.println(i, mo41692f(), m5841d(str));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41679a(int i, String str, Object... objArr) {
        if (mo41690d()) {
            Log.println(i, mo41692f(), m5843e(str, objArr));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo41690d() {
        return this.f5239a;
    }

    /* renamed from: d */
    private String m5841d(String str) {
        return mo41693g() + m5842e(str);
    }

    /* renamed from: e */
    private String m5843e(String str, Object[] objArr) {
        try {
            return mo41693g() + mo41689d(m5842e(str), objArr);
        } catch (Throwable unused) {
            return mo41691e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo41691e() {
        return mo41693g();
    }
}
