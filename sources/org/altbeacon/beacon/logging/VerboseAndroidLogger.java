package org.altbeacon.beacon.logging;

import android.util.Log;

final class VerboseAndroidLogger extends AbstractAndroidLogger {
    VerboseAndroidLogger() {
    }

    /* renamed from: v */
    public void mo55738v(String str, String str2, Object... objArr) {
        Log.v(str, formatString(str2, objArr));
    }

    /* renamed from: v */
    public void mo55739v(Throwable th, String str, String str2, Object... objArr) {
        Log.v(str, formatString(str2, objArr), th);
    }

    /* renamed from: d */
    public void mo55732d(String str, String str2, Object... objArr) {
        Log.d(str, formatString(str2, objArr));
    }

    /* renamed from: d */
    public void mo55733d(Throwable th, String str, String str2, Object... objArr) {
        Log.d(str, formatString(str2, objArr), th);
    }

    /* renamed from: i */
    public void mo55736i(String str, String str2, Object... objArr) {
        Log.i(str, formatString(str2, objArr));
    }

    /* renamed from: i */
    public void mo55737i(Throwable th, String str, String str2, Object... objArr) {
        Log.i(str, formatString(str2, objArr), th);
    }

    /* renamed from: w */
    public void mo55740w(String str, String str2, Object... objArr) {
        Log.w(str, formatString(str2, objArr));
    }

    /* renamed from: w */
    public void mo55741w(Throwable th, String str, String str2, Object... objArr) {
        Log.w(str, formatString(str2, objArr), th);
    }

    /* renamed from: e */
    public void mo55734e(String str, String str2, Object... objArr) {
        Log.e(str, formatString(str2, objArr));
    }

    /* renamed from: e */
    public void mo55735e(Throwable th, String str, String str2, Object... objArr) {
        Log.e(str, formatString(str2, objArr), th);
    }
}
