package com.yandex.metrica.impl.p039ob;

import com.google.android.gcm.GCMRegistrar;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.nr */
public class C3754nr {

    /* renamed from: a */
    private final C3753nq f3881a;

    /* renamed from: b */
    private final C3756nt f3882b;

    /* renamed from: c */
    private final long f3883c;

    /* renamed from: d */
    private final boolean f3884d;

    /* renamed from: e */
    private final long f3885e;

    public C3754nr(JSONObject jSONObject, long j) throws JSONException {
        this.f3881a = new C3753nq(jSONObject.optString("device_id", (String) null), jSONObject.optString("device_id_hash", (String) null));
        if (jSONObject.has("device_snapshot_key")) {
            this.f3882b = new C3756nt(jSONObject.optString("device_snapshot_key", (String) null));
        } else {
            this.f3882b = null;
        }
        this.f3883c = jSONObject.optLong("last_elections_time", -1);
        this.f3884d = m4277d();
        this.f3885e = j;
    }

    public C3754nr(C3753nq nqVar, C3756nt ntVar, long j) {
        this.f3881a = nqVar;
        this.f3882b = ntVar;
        this.f3883c = j;
        this.f3884d = m4277d();
        this.f3885e = -1;
    }

    /* renamed from: a */
    public String mo40711a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("device_id", this.f3881a.f3879a);
        jSONObject.put("device_id_hash", this.f3881a.f3880b);
        C3756nt ntVar = this.f3882b;
        if (ntVar != null) {
            jSONObject.put("device_snapshot_key", ntVar.mo40722b());
        }
        jSONObject.put("last_elections_time", this.f3883c);
        return jSONObject.toString();
    }

    /* renamed from: b */
    public C3753nq mo40712b() {
        return this.f3881a;
    }

    /* renamed from: c */
    public C3756nt mo40713c() {
        return this.f3882b;
    }

    /* renamed from: d */
    private boolean m4277d() {
        if (this.f3883c <= -1 || System.currentTimeMillis() - this.f3883c >= GCMRegistrar.DEFAULT_ON_SERVER_LIFESPAN_MS) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "Credentials{mIdentifiers=" + this.f3881a + ", mDeviceSnapshot=" + this.f3882b + ", mLastElectionsTime=" + this.f3883c + ", mFresh=" + this.f3884d + ", mLastModified=" + this.f3885e + '}';
    }
}
