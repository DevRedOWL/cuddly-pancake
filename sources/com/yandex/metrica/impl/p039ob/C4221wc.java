package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.yandex.metrica.impl.ob.wc */
public class C4221wc {
    /* renamed from: a */
    public static String m5995a(Context context, String str) throws UnsupportedEncodingException {
        return Base64.encodeToString(m6000b(context, C3137am.m2020b(str).getBytes("UTF-8")), 0);
    }

    /* renamed from: b */
    public static String m5999b(Context context, String str) throws UnsupportedEncodingException {
        return m5996a(context, str.getBytes("UTF-8"));
    }

    /* renamed from: a */
    public static String m5996a(Context context, byte[] bArr) throws UnsupportedEncodingException {
        byte[] b = m6000b(context, Base64.decode(bArr, 0));
        if (b != null) {
            return C3137am.m2027c(new String(b, "UTF-8"));
        }
        return null;
    }

    /* renamed from: b */
    private static byte[] m6000b(Context context, byte[] bArr) {
        try {
            byte[] a = m5997a(context);
            byte[] bArr2 = new byte[bArr.length];
            for (int i = 0; i < bArr.length; i++) {
                bArr2[i] = (byte) (bArr[i] ^ a[i % a.length]);
            }
            return bArr2;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static byte[] m5997a(Context context) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        return m5998a(context.getPackageName());
    }

    /* renamed from: a */
    public static byte[] m5998a(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest instance = MessageDigest.getInstance("MD5");
        instance.reset();
        instance.update(str.getBytes("UTF-8"));
        return instance.digest();
    }
}
