package com.yandex.metrica.impl.p039ob;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.metrica.C3089b;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: com.yandex.metrica.impl.ob.bt */
public final class C3213bt {

    /* renamed from: a */
    private static final C4281yc f2742a = new C4281yc();

    /* renamed from: b */
    private static final C4213vw<Integer, C3220a> f2743b = new C4213vw<Integer, C3220a>(C3220a.UNDEFINED) {
        {
            mo41713a(1, C3220a.WIFI);
            mo41713a(0, C3220a.CELL);
            if (C3306cx.m2857a(13)) {
                mo41713a(7, C3220a.BLUETOOTH);
                mo41713a(9, C3220a.ETHERNET);
            }
            mo41713a(4, C3220a.MOBILE_DUN);
            mo41713a(5, C3220a.MOBILE_HIPRI);
            mo41713a(2, C3220a.MOBILE_MMS);
            mo41713a(3, C3220a.MOBILE_SUPL);
            mo41713a(6, C3220a.WIMAX);
            if (C3306cx.m2857a(21)) {
                mo41713a(17, C3220a.VPN);
            }
        }
    };

    /* renamed from: c */
    private static final C4213vw<Integer, C3220a> f2744c = new C4213vw<Integer, C3220a>(C3220a.UNDEFINED) {
        {
            mo41713a(1, C3220a.WIFI);
            mo41713a(0, C3220a.CELL);
            mo41713a(3, C3220a.ETHERNET);
            mo41713a(2, C3220a.BLUETOOTH);
            mo41713a(4, C3220a.VPN);
            if (C3306cx.m2857a(27)) {
                mo41713a(6, C3220a.LOWPAN);
            }
            if (C3306cx.m2857a(26)) {
                mo41713a(5, C3220a.WIFI_AWARE);
            }
        }
    };

    /* renamed from: d */
    private static final C4213vw<C3220a, Integer> f2745d = new C4213vw<C3220a, Integer>(2) {
        {
            mo41713a(C3220a.CELL, 0);
            mo41713a(C3220a.WIFI, 1);
            mo41713a(C3220a.BLUETOOTH, 3);
            mo41713a(C3220a.ETHERNET, 4);
            mo41713a(C3220a.MOBILE_DUN, 5);
            mo41713a(C3220a.MOBILE_HIPRI, 6);
            mo41713a(C3220a.MOBILE_MMS, 7);
            mo41713a(C3220a.MOBILE_SUPL, 8);
            mo41713a(C3220a.VPN, 9);
            mo41713a(C3220a.WIMAX, 10);
            mo41713a(C3220a.LOWPAN, 11);
            mo41713a(C3220a.WIFI_AWARE, 12);
        }
    };

    /* renamed from: com.yandex.metrica.impl.ob.bt$a */
    public enum C3220a {
        WIFI,
        CELL,
        ETHERNET,
        BLUETOOTH,
        VPN,
        LOWPAN,
        WIFI_AWARE,
        MOBILE_DUN,
        MOBILE_HIPRI,
        MOBILE_MMS,
        MOBILE_SUPL,
        WIMAX,
        OFFLINE,
        UNDEFINED
    }

    /* renamed from: com.yandex.metrica.impl.ob.bt$b */
    public static final class C3221b {

        /* renamed from: a */
        private static final String[] f2761a = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};

        /* renamed from: a */
        public static boolean m2408a() {
            try {
                return new File("/system/app/Superuser.apk").exists();
            } catch (Throwable unused) {
                return false;
            }
        }

        /* renamed from: b */
        public static boolean m2409b() {
            String[] strArr = f2761a;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str = strArr[i];
                try {
                    if (new File(str + "su").exists()) {
                        return true;
                    }
                    i++;
                } catch (Throwable unused) {
                }
            }
            return false;
        }

        /* renamed from: c */
        public static int m2410c() {
            return (m2408a() || m2409b()) ? 1 : 0;
        }
    }

    /* renamed from: a */
    public static C3089b m2391a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Point b = m2395b(context);
        int i = b.x;
        int i2 = b.y;
        float f = displayMetrics.density;
        float f2 = (float) i;
        float f3 = (float) i2;
        float min = Math.min(f2 / f, f3 / f);
        float f4 = f * 160.0f;
        float f5 = f2 / f4;
        float f6 = f3 / f4;
        double sqrt = Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
        if (m2394a(context, sqrt)) {
            return C3089b.TV;
        }
        if (sqrt >= 7.0d || min >= 600.0f) {
            return C3089b.TABLET;
        }
        return C3089b.PHONE;
    }

    /* renamed from: a */
    private static boolean m2394a(Context context, double d) {
        return d >= 15.0d && !f2742a.mo41866b(context, "android.hardware.touchscreen");
    }

    /* renamed from: b */
    public static Point m2395b(Context context) {
        C32141 r0 = new C4236wo<WindowManager, Display>() {
            /* renamed from: a */
            public Display mo39698a(WindowManager windowManager) throws Throwable {
                return windowManager.getDefaultDisplay();
            }
        };
        return (Point) C3306cx.m2842a(new C4236wo<Display, Point>() {
            /* renamed from: a */
            public Point mo39698a(Display display) throws Throwable {
                int i;
                int i2;
                if (Build.VERSION.SDK_INT >= 17) {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    display.getRealMetrics(displayMetrics);
                    int i3 = displayMetrics.widthPixels;
                    int i4 = displayMetrics.heightPixels;
                    i2 = i3;
                    i = i4;
                } else if (Build.VERSION.SDK_INT >= 14) {
                    try {
                        Method method = Display.class.getMethod("getRawHeight", new Class[0]);
                        int intValue = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(display, new Object[0])).intValue();
                        i = ((Integer) method.invoke(display, new Object[0])).intValue();
                        i2 = intValue;
                    } catch (Throwable unused) {
                        i2 = display.getWidth();
                        i = display.getHeight();
                    }
                } else {
                    i2 = display.getWidth();
                    i = display.getHeight();
                }
                return new Point(i2, i);
            }
        }, (Display) C3306cx.m2841a(r0, (WindowManager) context.getSystemService("window"), "getting display", "WindowManager"), "getting display metrics", "Display", new Point(0, 0));
    }

    /* renamed from: c */
    public static Integer m2398c(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return null;
        }
        int intExtra = registerReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
        int intExtra2 = registerReceiver.getIntExtra("scale", -1);
        if (intExtra <= -1 || intExtra2 <= 0) {
            return null;
        }
        return Integer.valueOf(Math.round((((float) intExtra) / ((float) intExtra2)) * 100.0f));
    }

    /* renamed from: a */
    public static String m2393a(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb = new StringBuilder(language);
        if (C3306cx.m2857a(21)) {
            String script = locale.getScript();
            if (!TextUtils.isEmpty(script)) {
                sb.append('-');
                sb.append(script);
            }
        }
        if (!TextUtils.isEmpty(country)) {
            sb.append('_');
            sb.append(country);
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static C3220a m2399d(Context context) {
        return (C3220a) C3306cx.m2842a(new C4236wo<ConnectivityManager, C3220a>() {
            /* renamed from: a */
            public C3220a mo39698a(ConnectivityManager connectivityManager) throws Throwable {
                if (C3306cx.m2857a(23)) {
                    return C3213bt.m2397c(connectivityManager);
                }
                return C3213bt.m2400d(connectivityManager);
            }
        }, (ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", C3220a.UNDEFINED);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static C3220a m2397c(ConnectivityManager connectivityManager) {
        C3220a aVar = C3220a.UNDEFINED;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return C3220a.OFFLINE;
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(activeNetwork);
        if (networkInfo != null && !networkInfo.isConnected()) {
            return C3220a.OFFLINE;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            return aVar;
        }
        for (Integer next : f2744c.mo41712a()) {
            if (networkCapabilities.hasTransport(next.intValue())) {
                return f2744c.mo41711a(next);
            }
        }
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static C3220a m2400d(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return C3220a.OFFLINE;
        }
        return f2743b.mo41711a(Integer.valueOf(activeNetworkInfo.getType()));
    }

    /* renamed from: e */
    public static int m2401e(Context context) {
        return m2390a(m2399d(context));
    }

    /* renamed from: a */
    static int m2390a(C3220a aVar) {
        return f2745d.mo41711a(aVar).intValue();
    }
}
