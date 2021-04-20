package com.yandex.metrica.push.impl;

import com.facebook.react.uimanager.ViewProps;
import com.yandex.metrica.push.impl.C4413w;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.push.impl.bg */
public class C4357bg {
    /* renamed from: a */
    public String mo41984a(String str, C4413w wVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("notifications_status", m6369a(wVar));
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: a */
    private static JSONObject m6369a(C4413w wVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ViewProps.ENABLED, wVar.f5654c);
            jSONObject.put("changed", wVar.f5655d ? Boolean.TRUE : null);
            if (wVar.f5652a.size() != 0) {
                JSONObject jSONObject2 = new JSONObject();
                for (C4413w.C4415b next : wVar.f5652a) {
                    jSONObject2.put(next.f5659a, m6368a(next));
                }
                jSONObject.put("groups", jSONObject2);
            }
            if (wVar.f5653b.size() != 0) {
                JSONObject jSONObject3 = new JSONObject();
                for (C4413w.C4414a next2 : wVar.f5653b) {
                    jSONObject3.put(next2.f5656a, m6367a(next2));
                }
                jSONObject.put("channels", jSONObject3);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static JSONObject m6368a(C4413w.C4415b bVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ViewProps.ENABLED, bVar.f5661c);
        jSONObject.put("changed", bVar.f5662d ? Boolean.TRUE : null);
        JSONObject jSONObject2 = new JSONObject();
        for (C4413w.C4414a next : bVar.f5660b) {
            jSONObject2.put(next.f5656a, m6367a(next));
        }
        jSONObject.put("channels", jSONObject2);
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m6367a(C4413w.C4414a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ViewProps.ENABLED, aVar.f5657b);
        jSONObject.put("changed", aVar.f5658c ? Boolean.TRUE : null);
        return jSONObject;
    }
}
