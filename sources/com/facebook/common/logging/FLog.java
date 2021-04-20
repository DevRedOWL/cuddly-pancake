package com.facebook.common.logging;

import java.util.Locale;

public class FLog {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    private static LoggingDelegate sHandler = FLogDefaultLoggingDelegate.getInstance();

    public static void setLoggingDelegate(LoggingDelegate loggingDelegate) {
        if (loggingDelegate != null) {
            sHandler = loggingDelegate;
            return;
        }
        throw new IllegalArgumentException();
    }

    public static boolean isLoggable(int i) {
        return sHandler.isLoggable(i);
    }

    public static void setMinimumLoggingLevel(int i) {
        sHandler.setMinimumLoggingLevel(i);
    }

    public static int getMinimumLoggingLevel() {
        return sHandler.getMinimumLoggingLevel();
    }

    /* renamed from: v */
    public static void m650v(String str, String str2) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo17568v(str, str2);
        }
    }

    /* renamed from: v */
    public static void m651v(String str, String str2, Object obj) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo17568v(str, formatString(str2, obj));
        }
    }

    /* renamed from: v */
    public static void m652v(String str, String str2, Object obj, Object obj2) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo17568v(str, formatString(str2, obj, obj2));
        }
    }

    /* renamed from: v */
    public static void m653v(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo17568v(str, formatString(str2, obj, obj2, obj3));
        }
    }

    /* renamed from: v */
    public static void m654v(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo17568v(str, formatString(str2, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: v */
    public static void m642v(Class<?> cls, String str) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo17568v(getTag(cls), str);
        }
    }

    /* renamed from: v */
    public static void m643v(Class<?> cls, String str, Object obj) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo17568v(getTag(cls), formatString(str, obj));
        }
    }

    /* renamed from: v */
    public static void m644v(Class<?> cls, String str, Object obj, Object obj2) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo17568v(getTag(cls), formatString(str, obj, obj2));
        }
    }

    /* renamed from: v */
    public static void m645v(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        if (isLoggable(2)) {
            m642v(cls, formatString(str, obj, obj2, obj3));
        }
    }

    /* renamed from: v */
    public static void m646v(Class<?> cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo17568v(getTag(cls), formatString(str, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: v */
    public static void m656v(String str, String str2, Object... objArr) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo17568v(str, formatString(str2, objArr));
        }
    }

    /* renamed from: v */
    public static void m657v(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo17569v(str, formatString(str2, objArr), th);
        }
    }

    /* renamed from: v */
    public static void m648v(Class<?> cls, String str, Object... objArr) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo17568v(getTag(cls), formatString(str, objArr));
        }
    }

    /* renamed from: v */
    public static void m649v(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo17569v(getTag(cls), formatString(str, objArr), th);
        }
    }

    /* renamed from: v */
    public static void m655v(String str, String str2, Throwable th) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo17569v(str, str2, th);
        }
    }

    /* renamed from: v */
    public static void m647v(Class<?> cls, String str, Throwable th) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo17569v(getTag(cls), str, th);
        }
    }

    /* renamed from: d */
    public static void m610d(String str, String str2) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo17557d(str, str2);
        }
    }

    /* renamed from: d */
    public static void m611d(String str, String str2, Object obj) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo17557d(str, formatString(str2, obj));
        }
    }

    /* renamed from: d */
    public static void m612d(String str, String str2, Object obj, Object obj2) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo17557d(str, formatString(str2, obj, obj2));
        }
    }

    /* renamed from: d */
    public static void m613d(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo17557d(str, formatString(str2, obj, obj2, obj3));
        }
    }

    /* renamed from: d */
    public static void m614d(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo17557d(str, formatString(str2, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: d */
    public static void m602d(Class<?> cls, String str) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo17557d(getTag(cls), str);
        }
    }

    /* renamed from: d */
    public static void m603d(Class<?> cls, String str, Object obj) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo17557d(getTag(cls), formatString(str, obj));
        }
    }

    /* renamed from: d */
    public static void m604d(Class<?> cls, String str, Object obj, Object obj2) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo17557d(getTag(cls), formatString(str, obj, obj2));
        }
    }

    /* renamed from: d */
    public static void m605d(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo17557d(getTag(cls), formatString(str, obj, obj2, obj3));
        }
    }

    /* renamed from: d */
    public static void m606d(Class<?> cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo17557d(getTag(cls), formatString(str, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: d */
    public static void m616d(String str, String str2, Object... objArr) {
        if (sHandler.isLoggable(3)) {
            m610d(str, formatString(str2, objArr));
        }
    }

    /* renamed from: d */
    public static void m617d(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.isLoggable(3)) {
            m615d(str, formatString(str2, objArr), th);
        }
    }

    /* renamed from: d */
    public static void m608d(Class<?> cls, String str, Object... objArr) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo17557d(getTag(cls), formatString(str, objArr));
        }
    }

    /* renamed from: d */
    public static void m609d(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo17558d(getTag(cls), formatString(str, objArr), th);
        }
    }

    /* renamed from: d */
    public static void m615d(String str, String str2, Throwable th) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo17558d(str, str2, th);
        }
    }

    /* renamed from: d */
    public static void m607d(Class<?> cls, String str, Throwable th) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo17558d(getTag(cls), str, th);
        }
    }

    /* renamed from: i */
    public static void m634i(String str, String str2) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo17562i(str, str2);
        }
    }

    /* renamed from: i */
    public static void m635i(String str, String str2, Object obj) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo17562i(str, formatString(str2, obj));
        }
    }

    /* renamed from: i */
    public static void m636i(String str, String str2, Object obj, Object obj2) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo17562i(str, formatString(str2, obj, obj2));
        }
    }

    /* renamed from: i */
    public static void m637i(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo17562i(str, formatString(str2, obj, obj2, obj3));
        }
    }

    /* renamed from: i */
    public static void m638i(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo17562i(str, formatString(str2, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: i */
    public static void m626i(Class<?> cls, String str) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo17562i(getTag(cls), str);
        }
    }

    /* renamed from: i */
    public static void m627i(Class<?> cls, String str, Object obj) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo17562i(getTag(cls), formatString(str, obj));
        }
    }

    /* renamed from: i */
    public static void m628i(Class<?> cls, String str, Object obj, Object obj2) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo17562i(getTag(cls), formatString(str, obj, obj2));
        }
    }

    /* renamed from: i */
    public static void m629i(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo17562i(getTag(cls), formatString(str, obj, obj2, obj3));
        }
    }

    /* renamed from: i */
    public static void m630i(Class<?> cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo17562i(getTag(cls), formatString(str, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: i */
    public static void m640i(String str, String str2, Object... objArr) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo17562i(str, formatString(str2, objArr));
        }
    }

    /* renamed from: i */
    public static void m641i(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo17563i(str, formatString(str2, objArr), th);
        }
    }

    /* renamed from: i */
    public static void m632i(Class<?> cls, String str, Object... objArr) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo17562i(getTag(cls), formatString(str, objArr));
        }
    }

    /* renamed from: i */
    public static void m633i(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (isLoggable(4)) {
            sHandler.mo17563i(getTag(cls), formatString(str, objArr), th);
        }
    }

    /* renamed from: i */
    public static void m639i(String str, String str2, Throwable th) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo17563i(str, str2, th);
        }
    }

    /* renamed from: i */
    public static void m631i(Class<?> cls, String str, Throwable th) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo17563i(getTag(cls), str, th);
        }
    }

    /* renamed from: w */
    public static void m662w(String str, String str2) {
        if (sHandler.isLoggable(5)) {
            sHandler.mo17570w(str, str2);
        }
    }

    /* renamed from: w */
    public static void m658w(Class<?> cls, String str) {
        if (sHandler.isLoggable(5)) {
            sHandler.mo17570w(getTag(cls), str);
        }
    }

    /* renamed from: w */
    public static void m664w(String str, String str2, Object... objArr) {
        if (sHandler.isLoggable(5)) {
            sHandler.mo17570w(str, formatString(str2, objArr));
        }
    }

    /* renamed from: w */
    public static void m665w(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.isLoggable(5)) {
            sHandler.mo17571w(str, formatString(str2, objArr), th);
        }
    }

    /* renamed from: w */
    public static void m660w(Class<?> cls, String str, Object... objArr) {
        if (sHandler.isLoggable(5)) {
            sHandler.mo17570w(getTag(cls), formatString(str, objArr));
        }
    }

    /* renamed from: w */
    public static void m661w(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (isLoggable(5)) {
            m659w(cls, formatString(str, objArr), th);
        }
    }

    /* renamed from: w */
    public static void m663w(String str, String str2, Throwable th) {
        if (sHandler.isLoggable(5)) {
            sHandler.mo17571w(str, str2, th);
        }
    }

    /* renamed from: w */
    public static void m659w(Class<?> cls, String str, Throwable th) {
        if (sHandler.isLoggable(5)) {
            sHandler.mo17571w(getTag(cls), str, th);
        }
    }

    /* renamed from: e */
    public static void m622e(String str, String str2) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo17559e(str, str2);
        }
    }

    /* renamed from: e */
    public static void m618e(Class<?> cls, String str) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo17559e(getTag(cls), str);
        }
    }

    /* renamed from: e */
    public static void m624e(String str, String str2, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo17559e(str, formatString(str2, objArr));
        }
    }

    /* renamed from: e */
    public static void m625e(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo17560e(str, formatString(str2, objArr), th);
        }
    }

    /* renamed from: e */
    public static void m620e(Class<?> cls, String str, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo17559e(getTag(cls), formatString(str, objArr));
        }
    }

    /* renamed from: e */
    public static void m621e(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo17560e(getTag(cls), formatString(str, objArr), th);
        }
    }

    /* renamed from: e */
    public static void m623e(String str, String str2, Throwable th) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo17560e(str, str2, th);
        }
    }

    /* renamed from: e */
    public static void m619e(Class<?> cls, String str, Throwable th) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo17560e(getTag(cls), str, th);
        }
    }

    public static void wtf(String str, String str2) {
        if (sHandler.isLoggable(6)) {
            sHandler.wtf(str, str2);
        }
    }

    public static void wtf(Class<?> cls, String str) {
        if (sHandler.isLoggable(6)) {
            sHandler.wtf(getTag(cls), str);
        }
    }

    public static void wtf(String str, String str2, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.wtf(str, formatString(str2, objArr));
        }
    }

    public static void wtf(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.wtf(str, formatString(str2, objArr), th);
        }
    }

    public static void wtf(Class<?> cls, String str, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.wtf(getTag(cls), formatString(str, objArr));
        }
    }

    public static void wtf(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.wtf(getTag(cls), formatString(str, objArr), th);
        }
    }

    public static void wtf(String str, String str2, Throwable th) {
        if (sHandler.isLoggable(6)) {
            sHandler.wtf(str, str2, th);
        }
    }

    public static void wtf(Class<?> cls, String str, Throwable th) {
        if (sHandler.isLoggable(6)) {
            sHandler.wtf(getTag(cls), str, th);
        }
    }

    private static String formatString(String str, Object... objArr) {
        return String.format((Locale) null, str, objArr);
    }

    private static String getTag(Class<?> cls) {
        return cls.getSimpleName();
    }
}
