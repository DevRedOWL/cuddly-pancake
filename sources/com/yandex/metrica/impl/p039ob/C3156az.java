package com.yandex.metrica.impl.p039ob;

import android.location.Location;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.metrica.PreloadInfo;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.az */
public class C3156az {
    /* renamed from: a */
    public String mo39543a(YandexMetricaConfig yandexMetricaConfig) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apikey", yandexMetricaConfig.apiKey);
            jSONObject.put("app_version", yandexMetricaConfig.appVersion);
            jSONObject.put("session_timeout", yandexMetricaConfig.sessionTimeout);
            jSONObject.put(FirebaseAnalytics.Param.LOCATION, m2094a(yandexMetricaConfig.location));
            jSONObject.put("preload_info", m2095a(yandexMetricaConfig.preloadInfo));
            jSONObject.put("collect_apps", yandexMetricaConfig.installedAppCollecting);
            jSONObject.put("logs", yandexMetricaConfig.logs);
            jSONObject.put("crash_enabled", yandexMetricaConfig.crashReporting);
            jSONObject.put("crash_native_enabled", yandexMetricaConfig.nativeCrashReporting);
            jSONObject.put("location_enabled", yandexMetricaConfig.locationTracking);
            jSONObject.put("max_reports_in_db_count", yandexMetricaConfig.maxReportsInDatabaseCount);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public YandexMetricaConfig mo39542a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                YandexMetricaConfig.Builder newConfigBuilder = YandexMetricaConfig.newConfigBuilder(jSONObject.getString("apikey"));
                if (jSONObject.has("app_version")) {
                    newConfigBuilder.withAppVersion(jSONObject.optString("app_version"));
                }
                if (jSONObject.has("session_timeout")) {
                    newConfigBuilder.withSessionTimeout(jSONObject.getInt("session_timeout"));
                }
                newConfigBuilder.withLocation(m2097c(jSONObject.optString(FirebaseAnalytics.Param.LOCATION)));
                newConfigBuilder.withPreloadInfo(m2096b(jSONObject.optString("preload_info")));
                if (jSONObject.has("collect_apps")) {
                    newConfigBuilder.withInstalledAppCollecting(jSONObject.optBoolean("collect_apps"));
                }
                if (jSONObject.has("logs") && jSONObject.optBoolean("logs")) {
                    newConfigBuilder.withLogs();
                }
                if (jSONObject.has("crash_enabled")) {
                    newConfigBuilder.withCrashReporting(jSONObject.optBoolean("crash_enabled"));
                }
                if (jSONObject.has("crash_native_enabled")) {
                    newConfigBuilder.withNativeCrashReporting(jSONObject.optBoolean("crash_native_enabled"));
                }
                if (jSONObject.has("location_enabled")) {
                    newConfigBuilder.withLocationTracking(jSONObject.optBoolean("location_enabled"));
                }
                if (jSONObject.has("max_reports_in_db_count")) {
                    newConfigBuilder.withMaxReportsInDatabaseCount(jSONObject.optInt("max_reports_in_db_count"));
                }
                return newConfigBuilder.build();
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private String m2095a(PreloadInfo preloadInfo) {
        if (preloadInfo == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("trackid", preloadInfo.getTrackingId());
            jSONObject.put("params", C4204vq.m5894b((Map) preloadInfo.getAdditionalParams()));
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private PreloadInfo m2096b(String str) throws JSONException {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("trackid")) {
            str2 = jSONObject.optString("trackid");
        }
        PreloadInfo.Builder newBuilder = PreloadInfo.newBuilder(str2);
        HashMap<String, String> a = C4204vq.m5884a(jSONObject.optString("params"));
        if (a != null && a.size() > 0) {
            for (Map.Entry next : a.entrySet()) {
                newBuilder.setAdditionalParams((String) next.getKey(), (String) next.getValue());
            }
        }
        return newBuilder.build();
    }

    /* renamed from: a */
    private String m2094a(Location location) {
        if (location == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("provider", location.getProvider());
            jSONObject.put("time", location.getTime());
            jSONObject.put("accuracy", (double) location.getAccuracy());
            jSONObject.put("alt", location.getAltitude());
            jSONObject.put("lng", location.getLongitude());
            jSONObject.put("lat", location.getLatitude());
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private Location m2097c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Location location = new Location(jSONObject.has("provider") ? jSONObject.optString("provider") : null);
            location.setLongitude(jSONObject.getDouble("lng"));
            location.setLatitude(jSONObject.getDouble("lat"));
            location.setTime(jSONObject.optLong("time"));
            location.setAccuracy((float) jSONObject.optDouble("accuracy"));
            location.setAltitude((double) ((float) jSONObject.optDouble("alt")));
            return location;
        } catch (Throwable unused) {
            return null;
        }
    }
}
