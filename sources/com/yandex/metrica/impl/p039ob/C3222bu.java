package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;
import com.yandex.metrica.PreloadInfo;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.bu */
public class C3222bu {

    /* renamed from: a */
    private PreloadInfo f2762a;

    public C3222bu(PreloadInfo preloadInfo, C4216vz vzVar) {
        if (preloadInfo == null) {
            return;
        }
        if (!TextUtils.isEmpty(preloadInfo.getTrackingId())) {
            this.f2762a = preloadInfo;
        } else if (vzVar.mo41688c()) {
            vzVar.mo41686c("Required field \"PreloadInfo.trackingId\" is empty!\nThis preload info will be skipped.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo39701a() {
        if (this.f2762a == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("preloadInfo", mo39702b());
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    public JSONObject mo39702b() {
        if (this.f2762a == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f2762a.getTrackingId());
            if (!this.f2762a.getAdditionalParams().isEmpty()) {
                jSONObject.put("additionalParams", new JSONObject(this.f2762a.getAdditionalParams()));
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
