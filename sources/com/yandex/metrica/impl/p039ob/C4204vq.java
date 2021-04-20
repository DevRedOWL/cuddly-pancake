package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.view.fragments.providerService.ProviderServiceFragment;

/* renamed from: com.yandex.metrica.impl.ob.vq */
public class C4204vq {

    /* renamed from: com.yandex.metrica.impl.ob.vq$a */
    public static class C4205a extends JSONObject {
        public C4205a() {
        }

        public C4205a(String str) throws JSONException {
            super(str);
        }

        /* renamed from: a */
        public String mo41700a(String str) {
            if (super.has(str)) {
                try {
                    return super.getString(str);
                } catch (Throwable unused) {
                }
            }
            return "";
        }

        /* renamed from: b */
        public String mo41701b(String str) {
            return super.has(str) ? mo41700a(str) : "";
        }

        /* renamed from: a */
        public Object mo41699a(String str, Object obj) {
            try {
                return super.get(str);
            } catch (Throwable unused) {
                return obj;
            }
        }

        /* renamed from: c */
        public boolean mo41702c(String str) {
            try {
                return NULL != super.get(str);
            } catch (Throwable unused) {
                return false;
            }
        }

        /* renamed from: d */
        public Long mo41703d(String str) {
            try {
                return Long.valueOf(getLong(str));
            } catch (Throwable unused) {
                return null;
            }
        }

        /* renamed from: e */
        public Boolean mo41704e(String str) {
            try {
                return Boolean.valueOf(getBoolean(str));
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* renamed from: a */
    public static Object m5881a(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                ArrayList arrayList = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    arrayList.add(m5881a(Array.get(obj, i)));
                }
                return new JSONArray(arrayList);
            } else if (obj instanceof Collection) {
                Collection<Object> collection = (Collection) obj;
                ArrayList arrayList2 = new ArrayList(collection.size());
                for (Object a : collection) {
                    arrayList2.add(m5881a(a));
                }
                return new JSONArray(arrayList2);
            } else if (!(obj instanceof Map)) {
                return obj;
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    String obj2 = entry.getKey().toString();
                    if (obj2 != null) {
                        linkedHashMap.put(obj2, m5881a(entry.getValue()));
                    }
                }
                return new JSONObject(linkedHashMap);
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m5883a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return "";
        }
        return m5894b((Map) map);
    }

    /* renamed from: b */
    public static String m5894b(Map map) {
        if (C3306cx.m2862a(map)) {
            return null;
        }
        if (C3306cx.m2857a(19)) {
            return new JSONObject(map).toString();
        }
        return m5881a((Object) map).toString();
    }

    /* renamed from: a */
    public static String m5882a(List<String> list) {
        if (C3306cx.m2861a((Collection) list)) {
            return null;
        }
        if (C3306cx.m2857a(19)) {
            return new JSONArray(list).toString();
        }
        return m5881a((Object) list).toString();
    }

    /* renamed from: a */
    public static HashMap<String, String> m5884a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return m5885a(new JSONObject(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static HashMap<String, String> m5895b(String str) throws JSONException {
        return m5885a(new JSONObject(str));
    }

    /* renamed from: c */
    public static List<String> m5897c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    arrayList.add(jSONArray.getString(i));
                    i++;
                } catch (Throwable unused) {
                }
            }
            return arrayList;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public static HashMap<String, String> m5885a(JSONObject jSONObject) {
        if (JSONObject.NULL.equals(jSONObject)) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null) {
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static JSONObject m5890a(JSONObject jSONObject, C3317cz czVar) throws JSONException {
        jSONObject.put("lat", czVar.getLatitude());
        jSONObject.put("lon", czVar.getLongitude());
        jSONObject.putOpt("timestamp", Long.valueOf(czVar.getTime()));
        jSONObject.putOpt("precision", czVar.hasAccuracy() ? Float.valueOf(czVar.getAccuracy()) : null);
        jSONObject.putOpt("direction", czVar.hasBearing() ? Float.valueOf(czVar.getBearing()) : null);
        jSONObject.putOpt("speed", czVar.hasSpeed() ? Float.valueOf(czVar.getSpeed()) : null);
        jSONObject.putOpt("altitude", czVar.hasAltitude() ? Double.valueOf(czVar.getAltitude()) : null);
        jSONObject.putOpt("provider", C3303cu.m2828c(czVar.getProvider(), (String) null));
        jSONObject.putOpt("original_provider", czVar.mo39879a());
        return jSONObject;
    }

    /* renamed from: a */
    public static Long m5880a(JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Long.valueOf(jSONObject.getLong(str));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public static Integer m5893b(JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Integer.valueOf(jSONObject.getInt(str));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public static Boolean m5896c(JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Boolean.valueOf(jSONObject.getBoolean(str));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m5891a(JSONObject jSONObject, String str, boolean z) {
        Boolean c = m5896c(jSONObject, str);
        return c == null ? z : c.booleanValue();
    }

    /* renamed from: d */
    public static Float m5898d(JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Float.valueOf((float) jSONObject.getDouble(str));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static byte[] m5892a(JSONObject jSONObject, String str, byte[] bArr) {
        String optString = jSONObject.optString(str, (String) null);
        if (optString == null) {
            return bArr;
        }
        try {
            return C3303cu.m2832e(optString);
        } catch (Throwable unused) {
            return bArr;
        }
    }

    /* renamed from: a */
    public static List<String> m5886a(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static JSONArray m5887a(C4155uu[] uuVarArr) {
        JSONArray jSONArray = new JSONArray();
        if (uuVarArr != null) {
            for (C4155uu a : uuVarArr) {
                try {
                    jSONArray.put(m5889a(a));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONObject m5889a(C4155uu uuVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cell_id", uuVar.mo41624e());
        jSONObject.put("signal_strength", uuVar.mo41619a());
        jSONObject.put("lac", uuVar.mo41623d());
        jSONObject.put("country_code", uuVar.mo41621b());
        jSONObject.put("operator_id", uuVar.mo41622c());
        jSONObject.put("operator_name", uuVar.mo41625f());
        jSONObject.put("is_connected", uuVar.mo41627h());
        jSONObject.put("cell_type", uuVar.mo41628i());
        jSONObject.put("pci", uuVar.mo41629j());
        jSONObject.put("last_visible_time_offset", uuVar.mo41630k());
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m5888a() throws JSONException {
        return new JSONObject().put("stat_sending", new JSONObject().put(ProviderServiceFragment.PRODUCT_STATE_DISABLED, true));
    }
}
