package com.yandex.metrica.impl.p039ob;

import android.location.Location;
import android.text.TextUtils;
import com.github.mikephil.charting.utils.Utils;
import com.yandex.metrica.impl.p039ob.C3774oh;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.oy */
class C3805oy {
    /* renamed from: a */
    public static String m4446a(C3795os osVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("collection_mode", osVar.f3999a.toString());
            jSONObject.put("lat", osVar.mo40800c().getLatitude());
            jSONObject.put("lon", osVar.mo40800c().getLongitude());
            jSONObject.putOpt("timestamp", Long.valueOf(osVar.mo40800c().getTime()));
            jSONObject.putOpt("receive_timestamp", Long.valueOf(osVar.mo40799b()));
            jSONObject.put("receive_elapsed_realtime_seconds", osVar.mo40801d());
            jSONObject.putOpt("precision", osVar.mo40800c().hasAccuracy() ? Float.valueOf(osVar.mo40800c().getAccuracy()) : null);
            jSONObject.putOpt("direction", osVar.mo40800c().hasBearing() ? Float.valueOf(osVar.mo40800c().getBearing()) : null);
            jSONObject.putOpt("speed", osVar.mo40800c().hasSpeed() ? Float.valueOf(osVar.mo40800c().getSpeed()) : null);
            jSONObject.putOpt("altitude", osVar.mo40800c().hasAltitude() ? Double.valueOf(osVar.mo40800c().getAltitude()) : null);
            jSONObject.putOpt("provider", C3303cu.m2828c(osVar.mo40800c().getProvider(), (String) null));
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static C3795os m4444a(long j, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                long optLong = jSONObject.optLong("receive_timestamp", 0);
                long optLong2 = jSONObject.optLong("receive_elapsed_realtime_seconds", 0);
                C3774oh.C3775a a = C3774oh.C3775a.m4334a(jSONObject.optString("collection_mode"));
                Location location = new Location(jSONObject.optString("provider", (String) null));
                location.setLongitude(jSONObject.optDouble("lon", Utils.DOUBLE_EPSILON));
                location.setLatitude(jSONObject.optDouble("lat", Utils.DOUBLE_EPSILON));
                location.setTime(jSONObject.optLong("timestamp", 0));
                location.setAccuracy((float) jSONObject.optDouble("precision", Utils.DOUBLE_EPSILON));
                location.setBearing((float) jSONObject.optDouble("direction", Utils.DOUBLE_EPSILON));
                location.setSpeed((float) jSONObject.optDouble("speed", Utils.DOUBLE_EPSILON));
                location.setAltitude(jSONObject.optDouble("altitude", Utils.DOUBLE_EPSILON));
                return new C3795os(a, optLong, optLong2, location, Long.valueOf(j));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public static C3784on m4447b(long j, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            C3784on onVar = new C3784on();
            try {
                onVar.mo40765a(Long.valueOf(j));
                JSONObject jSONObject = new JSONObject(str);
                onVar.mo40764a(jSONObject.optLong("timestamp", 0));
                onVar.mo40768b(jSONObject.optLong("elapsed_realtime_seconds", 0));
                onVar.mo40769b(jSONObject.optJSONArray("cell_info"));
                onVar.mo40766a(jSONObject.optJSONArray("wifi_info"));
            } catch (Throwable unused) {
            }
            return onVar;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m4445a(C3784on onVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timestamp", onVar.mo40767b());
            jSONObject.put("elapsed_realtime_seconds", onVar.mo40772e());
            jSONObject.putOpt("wifi_info", onVar.mo40770c());
            jSONObject.putOpt("cell_info", onVar.mo40771d());
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
