package com.facebook.common.logging;

public interface LoggingDelegate {
    /* renamed from: d */
    void mo17557d(String str, String str2);

    /* renamed from: d */
    void mo17558d(String str, String str2, Throwable th);

    /* renamed from: e */
    void mo17559e(String str, String str2);

    /* renamed from: e */
    void mo17560e(String str, String str2, Throwable th);

    int getMinimumLoggingLevel();

    /* renamed from: i */
    void mo17562i(String str, String str2);

    /* renamed from: i */
    void mo17563i(String str, String str2, Throwable th);

    boolean isLoggable(int i);

    void log(int i, String str, String str2);

    void setMinimumLoggingLevel(int i);

    /* renamed from: v */
    void mo17568v(String str, String str2);

    /* renamed from: v */
    void mo17569v(String str, String str2, Throwable th);

    /* renamed from: w */
    void mo17570w(String str, String str2);

    /* renamed from: w */
    void mo17571w(String str, String str2, Throwable th);

    void wtf(String str, String str2);

    void wtf(String str, String str2, Throwable th);
}
