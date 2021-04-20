package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.location.Location;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.impl.interact.DeviceInfo;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: com.yandex.metrica.impl.ob.da */
public final class C3319da {

    /* renamed from: a */
    static C3986rz f3008a = new C3986rz(C3320db.m2945a());

    @Deprecated
    /* renamed from: a */
    public static void m2930a(IIdentifierCallback iIdentifierCallback, List<String> list) {
        f3008a.mo41172a(iIdentifierCallback, list);
    }

    /* renamed from: a */
    public static void m2928a(Context context, IIdentifierCallback iIdentifierCallback, List<String> list) {
        f3008a.mo41170a(context, iIdentifierCallback, list);
    }

    /* renamed from: a */
    public static boolean m2931a() {
        return f3008a.mo41173a();
    }

    /* renamed from: b */
    public static Future<String> m2933b() {
        return f3008a.mo41175b();
    }

    /* renamed from: a */
    public static DeviceInfo m2924a(Context context) {
        return f3008a.mo41166a(context);
    }

    /* renamed from: b */
    public static String m2932b(Context context) {
        return f3008a.mo41174b(context);
    }

    /* renamed from: c */
    public static Integer m2935c(Context context) {
        return f3008a.mo41177c(context);
    }

    @Deprecated
    /* renamed from: c */
    public static String m2936c() {
        return f3008a.mo41179d();
    }

    /* renamed from: d */
    public static String m2937d(Context context) {
        return f3008a.mo41180d(context);
    }

    /* renamed from: e */
    public static String m2939e(Context context) {
        return f3008a.mo41181e(context);
    }

    /* renamed from: f */
    public static String m2941f(Context context) {
        return f3008a.mo41183f(context);
    }

    /* renamed from: a */
    public static void m2927a(int i, String str, String str2, Map<String, String> map) {
        f3008a.mo41169a(i, str, str2, map);
    }

    /* renamed from: d */
    public static Future<Boolean> m2938d() {
        return f3008a.mo41178c();
    }

    /* renamed from: e */
    public static void m2940e() {
        f3008a.mo41182e();
    }

    /* renamed from: a */
    public static String m2926a(String str) {
        return f3008a.mo41168a(str);
    }

    /* renamed from: a */
    public static String m2925a(int i) {
        return f3008a.mo41167a(i);
    }

    /* renamed from: a */
    public static YandexMetricaConfig m2922a(YandexMetricaConfig yandexMetricaConfig, String str) {
        return f3008a.mo41164a(yandexMetricaConfig, str);
    }

    /* renamed from: a */
    public static YandexMetricaConfig m2923a(YandexMetricaConfig yandexMetricaConfig, List<String> list) {
        return f3008a.mo41165a(yandexMetricaConfig, list);
    }

    /* renamed from: a */
    public static void m2929a(Context context, Object obj) {
        f3008a.mo41171a(context, obj);
    }

    /* renamed from: b */
    public static void m2934b(Context context, Object obj) {
        f3008a.mo41176b(context, obj);
    }

    /* renamed from: g */
    public static Location m2942g(Context context) {
        return f3008a.mo41184g(context);
    }
}
