package com.yandex.metrica.push.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.push.impl.bv */
public abstract class C4372bv {
    /* renamed from: a */
    public static String m6429a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optString(str, (String) null);
    }

    /* renamed from: b */
    public static Boolean m6430b(JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Boolean.valueOf(jSONObject.getBoolean(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public static Integer m6431c(JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Integer.valueOf(jSONObject.getInt(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: d */
    public static Long m6432d(JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Long.valueOf(jSONObject.getLong(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
