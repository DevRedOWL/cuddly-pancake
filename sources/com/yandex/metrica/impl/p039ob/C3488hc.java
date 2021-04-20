package com.yandex.metrica.impl.p039ob;

import android.net.Uri;
import android.text.TextUtils;
import org.apache.commons.lang3.concurrent.AbstractCircuitBreaker;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.hc */
public class C3488hc extends C3489hd {
    public C3488hc(C3391en enVar) {
        super(enVar);
    }

    /* renamed from: a */
    public boolean mo40170a(C4217w wVar) {
        String e = wVar.mo41734e();
        if (TextUtils.isEmpty(e)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(e);
            if (!AbstractCircuitBreaker.PROPERTY_NAME.equals(jSONObject.optString("type")) || !m3410a(jSONObject.optString("link"))) {
                return false;
            }
            m3411b();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    private void m3411b() {
        mo40176a().mo40031o();
        mo40176a().mo40042z().mo40213a();
    }

    /* renamed from: a */
    private boolean m3410a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String queryParameter = Uri.parse(str).getQueryParameter("referrer");
                if (!TextUtils.isEmpty(queryParameter)) {
                    for (String str2 : queryParameter.split("&")) {
                        int indexOf = str2.indexOf("=");
                        if (indexOf >= 0 && "reattribution".equals(Uri.decode(str2.substring(0, indexOf))) && "1".equals(Uri.decode(str2.substring(indexOf + 1)))) {
                            return true;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
