package com.yandex.metrica;

import android.content.Context;
import android.location.Location;
import com.yandex.metrica.impl.interact.DeviceInfo;
import com.yandex.metrica.impl.p039ob.C3319da;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.p */
public final class C4300p {

    /* renamed from: a */
    private static final List<String> f5387a = Arrays.asList(new String[]{"yandex_mobile_metrica_uuid", "yandex_mobile_metrica_device_id", "appmetrica_device_id_hash", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url"});

    @Deprecated
    /* renamed from: a */
    public static void m6261a(IIdentifierCallback iIdentifierCallback) {
        m6262a(iIdentifierCallback, f5387a);
    }

    @Deprecated
    /* renamed from: a */
    public static void m6262a(IIdentifierCallback iIdentifierCallback, List<String> list) {
        C3319da.m2930a(iIdentifierCallback, (List<String>) new ArrayList(list));
    }

    /* renamed from: a */
    public static void m6259a(Context context, IIdentifierCallback iIdentifierCallback, List<String> list) {
        C3319da.m2928a(context, iIdentifierCallback, new ArrayList(list));
    }

    /* renamed from: a */
    public static void m6260a(Context context, IIdentifierCallback iIdentifierCallback, String... strArr) {
        m6259a(context, iIdentifierCallback, (List<String>) Arrays.asList(strArr));
    }

    /* renamed from: a */
    public static void m6258a(Context context, IIdentifierCallback iIdentifierCallback) {
        m6259a(context, iIdentifierCallback, f5387a);
    }

    /* renamed from: u */
    public static String m6263u(String str) {
        return C3319da.m2926a(str);
    }

    public static Boolean plat() {
        try {
            return C3319da.m2938d().get();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean iifa() {
        return C3319da.m2931a();
    }

    public static String pgai() {
        try {
            return C3319da.m2933b().get();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static DeviceInfo gdi(Context context) {
        return C3319da.m2924a(context);
    }

    public static String gcni(Context context) {
        return C3319da.m2932b(context);
    }

    @Deprecated
    public static String guid() {
        return C3319da.m2936c();
    }

    public static String guid(Context context) {
        return C3319da.m2937d(context);
    }

    public static String gdid(Context context) {
        return C3319da.m2939e(context);
    }

    public static String mpn(Context context) {
        return C3319da.m2941f(context);
    }

    public static void rce(int i, String str, String str2, Map<String, String> map) {
        C3319da.m2927a(i, str, str2, map);
    }

    public static String gmsvn(int i) {
        return C3319da.m2925a(i);
    }

    public static void seb() {
        C3319da.m2940e();
    }

    @Deprecated
    public static YandexMetricaConfig cpcwh(YandexMetricaConfig yandexMetricaConfig, String str) {
        return C3319da.m2922a(yandexMetricaConfig, str);
    }

    @Deprecated
    public static void rolu(Context context, Object obj) {
        C3319da.m2929a(context, obj);
    }

    @Deprecated
    public static void urolu(Context context, Object obj) {
        C3319da.m2934b(context, obj);
    }

    @Deprecated
    public static Location glkl(Context context) {
        return C3319da.m2942g(context);
    }

    @Deprecated
    public static Integer gbc(Context context) {
        return C3319da.m2935c(context.getApplicationContext());
    }
}
