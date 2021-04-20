package com.yandex.metrica.impl.p039ob;

import android.util.Base64;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.p039ob.C3869r;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.kv */
public class C3615kv {

    /* renamed from: a */
    private final byte[] f3573a;

    /* renamed from: b */
    private final String f3574b;

    /* renamed from: c */
    private final int f3575c;

    /* renamed from: d */
    private final HashMap<C3869r.C3870a, Integer> f3576d;

    /* renamed from: e */
    private final String f3577e;

    /* renamed from: f */
    private final Integer f3578f;

    /* renamed from: g */
    private final String f3579g;

    /* renamed from: h */
    private final String f3580h;

    /* renamed from: i */
    private final CounterConfiguration.C3075a f3581i;

    public C3615kv(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("event");
        this.f3573a = Base64.decode(jSONObject2.getString("jvm_crash"), 0);
        this.f3574b = jSONObject2.getString("name");
        this.f3575c = jSONObject2.getInt("bytes_truncated");
        String optString = jSONObject2.optString("trimmed_fields");
        this.f3576d = new HashMap<>();
        if (optString != null) {
            try {
                HashMap<String, String> a = C4204vq.m5884a(optString);
                if (a != null) {
                    for (Map.Entry next : a.entrySet()) {
                        this.f3576d.put(C3869r.C3870a.valueOf((String) next.getKey()), Integer.valueOf(Integer.parseInt((String) next.getValue())));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("process_configuration");
        this.f3577e = jSONObject3.getString("package_name");
        this.f3578f = Integer.valueOf(jSONObject3.getInt("pid"));
        this.f3579g = jSONObject3.getString("psid");
        JSONObject jSONObject4 = jSONObject.getJSONObject("reporter_configuration");
        this.f3580h = jSONObject4.getString("api_key");
        this.f3581i = m3730a(jSONObject4);
    }

    public C3615kv(C4217w wVar, C3369ed edVar, HashMap<C3869r.C3870a, Integer> hashMap) {
        this.f3573a = wVar.mo41735f();
        this.f3574b = wVar.mo41731d();
        this.f3575c = wVar.mo41744o();
        if (hashMap != null) {
            this.f3576d = hashMap;
        } else {
            this.f3576d = new HashMap<>();
        }
        C3370ee g = edVar.mo39946g();
        this.f3577e = g.mo39962h();
        this.f3578f = g.mo39959e();
        this.f3579g = g.mo39960f();
        CounterConfiguration h = edVar.mo39947h();
        this.f3580h = h.mo39242e();
        this.f3581i = h.mo39257q();
    }

    /* renamed from: a */
    public byte[] mo40370a() {
        return this.f3573a;
    }

    /* renamed from: b */
    public String mo40371b() {
        return this.f3574b;
    }

    /* renamed from: c */
    public int mo40372c() {
        return this.f3575c;
    }

    /* renamed from: d */
    public HashMap<C3869r.C3870a, Integer> mo40373d() {
        return this.f3576d;
    }

    /* renamed from: e */
    public Integer mo40374e() {
        return this.f3578f;
    }

    /* renamed from: f */
    public String mo40375f() {
        return this.f3579g;
    }

    /* renamed from: g */
    public String mo40376g() {
        return this.f3577e;
    }

    /* renamed from: h */
    public String mo40377h() {
        return this.f3580h;
    }

    /* renamed from: i */
    public CounterConfiguration.C3075a mo40378i() {
        return this.f3581i;
    }

    /* renamed from: j */
    public String mo40379j() throws JSONException {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f3576d.entrySet()) {
            hashMap.put(((C3869r.C3870a) next.getKey()).name(), next.getValue());
        }
        return new JSONObject().put("process_configuration", new JSONObject().put("pid", this.f3578f).put("psid", this.f3579g).put("package_name", this.f3577e)).put("reporter_configuration", new JSONObject().put("api_key", this.f3580h).put("reporter_type", this.f3581i.mo39264a())).put("event", new JSONObject().put("jvm_crash", Base64.encodeToString(this.f3573a, 0)).put("name", this.f3574b).put("bytes_truncated", this.f3575c).put("trimmed_fields", C4204vq.m5894b((Map) hashMap))).toString();
    }

    @Deprecated
    /* renamed from: a */
    private CounterConfiguration.C3075a m3730a(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("reporter_type")) {
            return CounterConfiguration.C3075a.m1741a(jSONObject.getString("reporter_type"));
        }
        if (jSONObject.getBoolean("is_commutation")) {
            return CounterConfiguration.C3075a.COMMUTATION;
        }
        return CounterConfiguration.C3075a.MAIN;
    }
}
