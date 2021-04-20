package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.tn */
public class C4089tn {

    /* renamed from: a */
    private final JSONObject f4922a = new JSONObject();

    /* renamed from: a */
    public void mo41452a(String str) {
        m5464a("uuid", str);
    }

    /* renamed from: b */
    public void mo41453b(String str) {
        m5464a("device_id", str);
    }

    /* renamed from: c */
    public void mo41454c(String str) {
        m5464a("google_aid", str);
    }

    /* renamed from: d */
    public void mo41455d(String str) {
        m5464a("android_id", str);
    }

    /* renamed from: a */
    private void m5464a(String str, String str2) {
        if (!(TextUtils.isEmpty(str) || TextUtils.isEmpty(str2))) {
            try {
                this.f4922a.put(str, str2);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public String mo41451a() throws JSONException {
        return this.f4922a.toString();
    }
}
