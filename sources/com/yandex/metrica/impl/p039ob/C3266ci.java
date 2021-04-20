package com.yandex.metrica.impl.p039ob;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.ci */
public class C3266ci {

    /* renamed from: a */
    private static final Pattern f2883a = Pattern.compile(".*at com\\.yandex\\.metrica\\.push\\.*");

    /* renamed from: b */
    private static final Pattern f2884b = Pattern.compile(".*at com\\.yandex\\.metrica\\.(?!push)");

    /* renamed from: a */
    static void m2612a() {
        Log.i("AppMetrica", "Initializing of Metrica, " + C3303cu.m2824b("release") + " type, Version " + "3.8.0" + ", API Level " + 85 + ", Dated " + "08.10.2019" + ".");
    }

    /* renamed from: b */
    public static String m2614b() {
        return C3267a.f2885a;
    }

    /* renamed from: a */
    public static String m2611a(String str) {
        return str + "/" + "3.8.0" + "." + "66508" + " (" + m2617c() + "; Android " + Build.VERSION.RELEASE + ")";
    }

    /* renamed from: c */
    public static String m2617c() {
        if (Build.MODEL.startsWith(Build.MANUFACTURER)) {
            return C3303cu.m2824b(Build.MODEL);
        }
        return C3303cu.m2824b(Build.MANUFACTURER) + " " + Build.MODEL;
    }

    /* renamed from: a */
    static boolean m2613a(Throwable th) {
        String a = C3306cx.m2846a(th);
        return !TextUtils.isEmpty(a) && f2884b.matcher(a).find();
    }

    /* renamed from: b */
    static boolean m2616b(Throwable th) {
        String a = C3306cx.m2846a(th);
        return !TextUtils.isEmpty(a) && f2883a.matcher(a).find();
    }

    /* renamed from: com.yandex.metrica.impl.ob.ci$a */
    static class C3267a {

        /* renamed from: a */
        static final String f2885a = new C3267a().mo39809a();

        C3267a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo39809a() {
            if (mo39810a("com.unity3d.player.UnityPlayer")) {
                return "unity";
            }
            if (mo39810a("mono.MonoPackageManager")) {
                return "xamarin";
            }
            if (mo39810a("org.apache.cordova.CordovaPlugin")) {
                return "cordova";
            }
            return mo39810a("com.facebook.react.ReactRootView") ? "react" : "native";
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo39810a(String str) {
            return C3266ci.m2615b(str);
        }
    }

    /* renamed from: b */
    public static boolean m2615b(String str) {
        try {
            return Class.forName(str) != null;
        } catch (Throwable unused) {
            return false;
        }
    }
}
