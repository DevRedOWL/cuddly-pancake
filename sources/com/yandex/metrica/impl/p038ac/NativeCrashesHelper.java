package com.yandex.metrica.impl.p038ac;

import android.content.Context;
import com.yandex.metrica.impl.p039ob.C3128ah;

/* renamed from: com.yandex.metrica.impl.ac.NativeCrashesHelper */
public class NativeCrashesHelper {

    /* renamed from: a */
    private String f2435a;

    /* renamed from: b */
    private final Context f2436b;

    /* renamed from: c */
    private boolean f2437c;

    /* renamed from: d */
    private boolean f2438d;

    /* renamed from: e */
    private final C3128ah f2439e;

    private static native void cancelSetUpNativeUncaughtExceptionHandler();

    private static native void logsEnabled(boolean z);

    private static native void setUpNativeUncaughtExceptionHandler(String str);

    public NativeCrashesHelper(Context context) {
        this(context, new C3128ah());
    }

    NativeCrashesHelper(Context context, C3128ah ahVar) {
        this.f2436b = context;
        this.f2439e = ahVar;
    }

    /* renamed from: a */
    public synchronized void mo39390a(boolean z) {
        if (z) {
            m1831c();
        } else {
            m1833e();
        }
    }

    /* renamed from: b */
    private void m1829b() {
        if (!this.f2438d && mo39391a()) {
            m1830b(false);
            this.f2435a = this.f2439e.mo39466a(this.f2436b).getAbsolutePath() + "/" + "YandexMetricaNativeCrashes";
        }
        this.f2438d = true;
    }

    /* renamed from: c */
    private void m1831c() {
        try {
            m1829b();
            if (m1832d()) {
                setUpNativeUncaughtExceptionHandler(this.f2435a);
                this.f2437c = true;
            }
        } catch (Throwable unused) {
            this.f2437c = false;
        }
    }

    /* renamed from: d */
    private boolean m1832d() {
        return this.f2435a != null;
    }

    /* renamed from: e */
    private void m1833e() {
        try {
            if (m1832d() && this.f2437c) {
                cancelSetUpNativeUncaughtExceptionHandler();
            }
        } catch (Throwable unused) {
        }
        this.f2437c = false;
    }

    /* renamed from: b */
    private boolean m1830b(boolean z) {
        try {
            logsEnabled(z);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo39391a() {
        try {
            System.loadLibrary("YandexMetricaNativeModule");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
