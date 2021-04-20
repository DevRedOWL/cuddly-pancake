package com.yandex.metrica;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.location.Location;
import com.yandex.metrica.impl.p039ob.C3320db;
import com.yandex.metrica.impl.p039ob.C3999sb;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;

public final class YandexMetrica {

    /* renamed from: a */
    private static final C3999sb f2398a = new C3999sb(C3320db.m2945a());

    public static int getLibraryApiLevel() {
        return 85;
    }

    public static String getLibraryVersion() {
        return "3.8.0";
    }

    private YandexMetrica() {
    }

    public static void activate(Context context, YandexMetricaConfig yandexMetricaConfig) {
        f2398a.mo41206a(context, yandexMetricaConfig);
    }

    public static void sendEventsBuffer() {
        f2398a.mo41225e();
    }

    public static void resumeSession(Activity activity) {
        f2398a.mo41203a(activity);
    }

    public static void pauseSession(Activity activity) {
        f2398a.mo41219b(activity);
    }

    public static void enableActivityAutoTracking(Application application) {
        f2398a.mo41204a(application);
    }

    public static void reportEvent(String str) {
        f2398a.mo41213a(str);
    }

    public static void reportError(String str, Throwable th) {
        f2398a.mo41215a(str, th);
    }

    public static void reportUnhandledException(Throwable th) {
        f2398a.mo41217a(th);
    }

    public static void reportNativeCrash(String str) {
        f2398a.mo41221b(str);
    }

    public static void reportEvent(String str, String str2) {
        f2398a.mo41214a(str, str2);
    }

    public static void reportEvent(String str, Map<String, Object> map) {
        f2398a.mo41216a(str, map);
    }

    public static void reportAppOpen(Activity activity) {
        f2398a.mo41222c(activity);
    }

    public static void reportAppOpen(String str) {
        f2398a.mo41223c(str);
    }

    @Deprecated
    public static void reportReferralUrl(String str) {
        f2398a.mo41224d(str);
    }

    public static void setLocation(Location location) {
        f2398a.mo41208a(location);
    }

    public static void setLocationTracking(boolean z) {
        f2398a.mo41218a(z);
    }

    public static void setLocationTracking(Context context, boolean z) {
        f2398a.mo41207a(context, z);
    }

    public static void setStatisticsSending(Context context, boolean z) {
        f2398a.mo41220b(context, z);
    }

    public static void activateReporter(Context context, ReporterConfig reporterConfig) {
        f2398a.mo41205a(context, reporterConfig);
    }

    public static IReporter getReporter(Context context, String str) {
        return f2398a.mo41202a(context, str);
    }

    public static void registerReferrerBroadcastReceivers(BroadcastReceiver... broadcastReceiverArr) {
        MetricaEventHandler.m1748a(broadcastReceiverArr);
    }

    public static void requestDeferredDeeplinkParameters(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        f2398a.mo41210a(deferredDeeplinkParametersListener);
    }

    public static void requestAppMetricaDeviceID(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        f2398a.mo41209a(appMetricaDeviceIDListener);
    }

    public static void setUserProfileID(String str) {
        f2398a.mo41226e(str);
    }

    public static void reportUserProfile(UserProfile userProfile) {
        f2398a.mo41212a(userProfile);
    }

    public static void reportRevenue(Revenue revenue) {
        f2398a.mo41211a(revenue);
    }
}
