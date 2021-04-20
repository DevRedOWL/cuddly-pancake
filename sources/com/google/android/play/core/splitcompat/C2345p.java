package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.play.core.splitcompat.p */
public final class C2345p {

    /* renamed from: a */
    private static ThreadPoolExecutor f2039a;

    /* renamed from: a */
    public static Executor m1445a() {
        if (f2039a == null) {
            f2039a = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C2331b());
            f2039a.allowCoreThreadTimeOut(true);
        }
        return f2039a;
    }

    /* renamed from: b */
    public static String m1446b(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(bArr);
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* renamed from: c */
    public static Context m1447c(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }
}
