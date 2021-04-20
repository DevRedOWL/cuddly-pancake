package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.metrica.C3097i;
import java.util.Map;
import org.json.JSONObject;
import p035ru.unicorn.ujin.view.activity.BaseActivity;

/* renamed from: com.yandex.metrica.impl.ob.wj */
public class C4230wj {

    /* renamed from: com.yandex.metrica.impl.ob.wj$a */
    public enum C4231a {
        LOGIN(FirebaseAnalytics.Event.LOGIN),
        LOGOUT(BaseActivity.PROFILE_LOGOUT),
        SWITCH("switch"),
        UPDATE("update");
        

        /* renamed from: e */
        private String f5278e;

        private C4231a(String str) {
            this.f5278e = str;
        }

        public String toString() {
            return this.f5278e;
        }
    }

    /* renamed from: a */
    public static C3097i m6032a(String str) {
        C3097i iVar = new C3097i();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                iVar.mo39383a(jSONObject.optString("UserInfo.UserId", (String) null));
                iVar.mo39386b(jSONObject.optString("UserInfo.Type", (String) null));
                iVar.mo39384a((Map<String, String>) C4204vq.m5885a(jSONObject.optJSONObject("UserInfo.Options")));
            } catch (Throwable unused) {
            }
        }
        return iVar;
    }

    /* renamed from: a */
    public static String m6033a(C4231a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("action", aVar.toString());
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
