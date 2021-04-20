package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p039ob.C3929rr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.co */
public class C3290co {

    /* renamed from: a */
    private static final Map<String, Integer> f2913a;

    /* renamed from: b */
    private static final Map<String, Integer> f2914b;

    /* renamed from: c */
    private static final Map<String, Integer> f2915c;

    /* renamed from: d */
    private static final Map<String, Integer> f2916d;

    /* renamed from: e */
    private final C3736nh f2917e;

    static {
        HashMap hashMap = new HashMap(3);
        hashMap.put("all_matches", 1);
        hashMap.put("first_match", 2);
        hashMap.put("match_lost", 3);
        f2913a = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap(2);
        hashMap2.put("aggressive", 1);
        hashMap2.put("sticky", 2);
        f2914b = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap(3);
        hashMap3.put("one", 1);
        hashMap3.put("few", 2);
        hashMap3.put("max", 3);
        f2915c = Collections.unmodifiableMap(hashMap3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put("low_power", 1);
        hashMap4.put("balanced", 2);
        hashMap4.put("low_latency", 3);
        f2916d = Collections.unmodifiableMap(hashMap4);
    }

    public C3290co() {
        this(new C3736nh());
    }

    /* renamed from: a */
    public C4107tt mo39820a(JSONObject jSONObject) {
        return this.f2917e.mo40224a(m2659b(jSONObject));
    }

    /* renamed from: b */
    private C3929rr.C3930a.C3933b m2659b(JSONObject jSONObject) {
        C3929rr.C3930a.C3933b bVar = new C3929rr.C3930a.C3933b();
        JSONObject optJSONObject = jSONObject.optJSONObject("ble_collecting");
        if (optJSONObject != null) {
            bVar.f4472b = m2660c(optJSONObject.optJSONObject("scan_settings"));
            bVar.f4473c = m2658a(optJSONObject.optJSONArray("filters"));
            bVar.f4474d = C4232wk.m6037a(C4204vq.m5880a(optJSONObject, "same_beacon_min_reporting_interval"), TimeUnit.SECONDS, bVar.f4474d);
            bVar.f4475e = C4232wk.m6037a(C4204vq.m5880a(optJSONObject, "first_delay_seconds"), TimeUnit.SECONDS, bVar.f4475e);
        } else {
            bVar.f4472b = new C3929rr.C3930a.C3933b.C3938b();
        }
        return bVar;
    }

    /* renamed from: c */
    private C3929rr.C3930a.C3933b.C3938b m2660c(JSONObject jSONObject) {
        C3929rr.C3930a.C3933b.C3938b bVar = new C3929rr.C3930a.C3933b.C3938b();
        if (jSONObject != null) {
            Integer a = m2657a(jSONObject, "callback_type", f2913a);
            if (a != null) {
                bVar.f4490b = a.intValue();
            }
            Integer a2 = m2657a(jSONObject, "match_mode", f2914b);
            if (a2 != null) {
                bVar.f4491c = a2.intValue();
            }
            Integer a3 = m2657a(jSONObject, "num_of_matches", f2915c);
            if (a3 != null) {
                bVar.f4492d = a3.intValue();
            }
            Integer a4 = m2657a(jSONObject, "scan_mode", f2916d);
            if (a4 != null) {
                bVar.f4493e = a4.intValue();
            }
            bVar.f4494f = C4232wk.m6037a(C4204vq.m5880a(jSONObject, "report_delay"), TimeUnit.SECONDS, bVar.f4494f);
        }
        return bVar;
    }

    /* renamed from: a */
    private C3929rr.C3930a.C3933b.C3934a[] m2658a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                C3929rr.C3930a.C3933b.C3934a d = m2661d(jSONArray.optJSONObject(i));
                if (d != null) {
                    arrayList.add(d);
                }
            }
        }
        return (C3929rr.C3930a.C3933b.C3934a[]) arrayList.toArray(new C3929rr.C3930a.C3933b.C3934a[arrayList.size()]);
    }

    /* renamed from: d */
    private C3929rr.C3930a.C3933b.C3934a m2661d(JSONObject jSONObject) {
        C3929rr.C3930a.C3933b.C3934a aVar;
        boolean z = true;
        if (jSONObject != null) {
            aVar = new C3929rr.C3930a.C3933b.C3934a();
            String optString = jSONObject.optString("device_address", (String) null);
            if (optString != null) {
                aVar.f4477b = optString;
                z = false;
            }
            String optString2 = jSONObject.optString("device_name", (String) null);
            if (optString2 != null) {
                aVar.f4478c = optString2;
                z = false;
            }
            C3929rr.C3930a.C3933b.C3934a.C3935a e = m2662e(jSONObject.optJSONObject("manufacturer_data"));
            if (e != null) {
                aVar.f4479d = e;
                z = false;
            }
            C3929rr.C3930a.C3933b.C3934a.C3936b f = m2663f(jSONObject.optJSONObject("service_data"));
            if (f != null) {
                aVar.f4480e = f;
                z = false;
            }
            C3929rr.C3930a.C3933b.C3934a.C3937c g = m2664g(jSONObject.optJSONObject("service_uuid"));
            if (g != null) {
                aVar.f4481f = g;
                z = false;
            }
        } else {
            aVar = null;
        }
        if (z) {
            return null;
        }
        return aVar;
    }

    /* renamed from: e */
    private C3929rr.C3930a.C3933b.C3934a.C3935a m2662e(JSONObject jSONObject) {
        Integer b;
        if (jSONObject == null || (b = C4204vq.m5893b(jSONObject, "id")) == null) {
            return null;
        }
        C3929rr.C3930a.C3933b.C3934a.C3935a aVar = new C3929rr.C3930a.C3933b.C3934a.C3935a();
        aVar.f4482b = b.intValue();
        aVar.f4483c = C4204vq.m5892a(jSONObject, "data", aVar.f4483c);
        aVar.f4484d = C4204vq.m5892a(jSONObject, "data_mask", aVar.f4484d);
        return aVar;
    }

    /* renamed from: f */
    private C3929rr.C3930a.C3933b.C3934a.C3936b m2663f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("uuid", (String) null);
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        C3929rr.C3930a.C3933b.C3934a.C3936b bVar = new C3929rr.C3930a.C3933b.C3934a.C3936b();
        bVar.f4485b = optString;
        bVar.f4486c = C4204vq.m5892a(jSONObject, "data", bVar.f4486c);
        bVar.f4487d = C4204vq.m5892a(jSONObject, "data_mask", bVar.f4487d);
        return bVar;
    }

    /* renamed from: g */
    private C3929rr.C3930a.C3933b.C3934a.C3937c m2664g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("uuid", (String) null);
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        C3929rr.C3930a.C3933b.C3934a.C3937c cVar = new C3929rr.C3930a.C3933b.C3934a.C3937c();
        cVar.f4488b = optString;
        cVar.f4489c = jSONObject.optString("data_mask", cVar.f4489c);
        return cVar;
    }

    /* renamed from: a */
    private Integer m2657a(JSONObject jSONObject, String str, Map<String, Integer> map) {
        if (jSONObject.has(str)) {
            return map.get(jSONObject.optString(str));
        }
        return null;
    }

    public C3290co(C3736nh nhVar) {
        this.f2917e = nhVar;
    }
}
