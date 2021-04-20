package org.altbeacon.beacon.logging;

public final class LogManager {
    private static Logger sLogger = Loggers.infoLogger();
    private static boolean sVerboseLoggingEnabled = false;

    public static void setLogger(Logger logger) {
        if (logger != null) {
            sLogger = logger;
            return;
        }
        throw new NullPointerException("Logger may not be null.");
    }

    public static Logger getLogger() {
        return sLogger;
    }

    public static boolean isVerboseLoggingEnabled() {
        return sVerboseLoggingEnabled;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        sVerboseLoggingEnabled = z;
    }

    /* renamed from: v */
    public static void m6840v(String str, String str2, Object... objArr) {
        sLogger.mo55738v(str, str2, objArr);
    }

    /* renamed from: v */
    public static void m6841v(Throwable th, String str, String str2, Object... objArr) {
        sLogger.mo55739v(th, str, str2, objArr);
    }

    /* renamed from: d */
    public static void m6834d(String str, String str2, Object... objArr) {
        sLogger.mo55732d(str, str2, objArr);
    }

    /* renamed from: d */
    public static void m6835d(Throwable th, String str, String str2, Object... objArr) {
        sLogger.mo55733d(th, str, str2, objArr);
    }

    /* renamed from: i */
    public static void m6838i(String str, String str2, Object... objArr) {
        sLogger.mo55736i(str, str2, objArr);
    }

    /* renamed from: i */
    public static void m6839i(Throwable th, String str, String str2, Object... objArr) {
        sLogger.mo55737i(th, str, str2, objArr);
    }

    /* renamed from: w */
    public static void m6842w(String str, String str2, Object... objArr) {
        sLogger.mo55740w(str, str2, objArr);
    }

    /* renamed from: w */
    public static void m6843w(Throwable th, String str, String str2, Object... objArr) {
        sLogger.mo55741w(th, str, str2, objArr);
    }

    /* renamed from: e */
    public static void m6836e(String str, String str2, Object... objArr) {
        sLogger.mo55734e(str, str2, objArr);
    }

    /* renamed from: e */
    public static void m6837e(Throwable th, String str, String str2, Object... objArr) {
        sLogger.mo55735e(th, str, str2, objArr);
    }

    private LogManager() {
    }
}
