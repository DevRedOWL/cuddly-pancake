package p042cz.msebera.android.httpclient.client.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: cz.msebera.android.httpclient.client.utils.JdkIdn */
public class JdkIdn implements Idn {
    private final Method toUnicode;

    public JdkIdn() throws ClassNotFoundException {
        try {
            this.toUnicode = Class.forName("java.net.IDN").getMethod("toUnicode", new Class[]{String.class});
        } catch (SecurityException e) {
            throw new IllegalStateException(e.getMessage(), e);
        } catch (NoSuchMethodException e2) {
            throw new IllegalStateException(e2.getMessage(), e2);
        }
    }

    public String toUnicode(String str) {
        try {
            return (String) this.toUnicode.invoke((Object) null, new Object[]{str});
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e.getMessage(), e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            throw new RuntimeException(cause.getMessage(), cause);
        }
    }
}
