package org.linphone.mediastream;

public final class Log {
    private static Log logger;

    /* renamed from: d */
    private native void m6900d(String str);

    /* renamed from: e */
    private native void m6902e(String str);

    /* renamed from: i */
    private native void m6904i(String str);

    /* renamed from: w */
    private native void m6906w(String str);

    private static Log instance() {
        if (logger == null) {
            logger = new Log();
        }
        return logger;
    }

    private Log() {
    }

    @Deprecated
    public Log(String str, boolean z) {
    }

    /* renamed from: d */
    public static void m6901d(Object... objArr) {
        instance().m6900d(toString(objArr));
    }

    /* renamed from: i */
    public static void m6905i(Object... objArr) {
        instance().m6904i(toString(objArr));
    }

    /* renamed from: w */
    public static void m6907w(Object... objArr) {
        instance().m6906w(toString(objArr));
    }

    /* renamed from: e */
    public static void m6903e(Object... objArr) {
        instance().m6902e(toString(objArr));
    }

    private static String toString(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        for (Object append : objArr) {
            sb.append(append);
        }
        return sb.toString();
    }
}
