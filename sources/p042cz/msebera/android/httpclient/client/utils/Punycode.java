package p042cz.msebera.android.httpclient.client.utils;

/* renamed from: cz.msebera.android.httpclient.client.utils.Punycode */
public class Punycode {
    private static final Idn impl;

    static {
        Idn idn;
        try {
            idn = new JdkIdn();
        } catch (Exception unused) {
            idn = new Rfc3492Idn();
        }
        impl = idn;
    }

    public static String toUnicode(String str) {
        return impl.toUnicode(str);
    }
}
