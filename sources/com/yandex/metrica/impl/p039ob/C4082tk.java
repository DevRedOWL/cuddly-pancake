package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.yandex.metrica.impl.p039ob.C3213bt;
import com.yandex.metrica.impl.p039ob.C3949rs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.data.service.FCM;

/* renamed from: com.yandex.metrica.impl.ob.tk */
public class C4082tk {

    /* renamed from: a */
    private static final Map<C3949rs.C3954a.C3956b.C3957a, String> f4915a = Collections.unmodifiableMap(new HashMap<C3949rs.C3954a.C3956b.C3957a, String>() {
        {
            put(C3949rs.C3954a.C3956b.C3957a.COMPLETE, "complete");
            put(C3949rs.C3954a.C3956b.C3957a.ERROR, "error");
            put(C3949rs.C3954a.C3956b.C3957a.OFFLINE, "offline");
            put(C3949rs.C3954a.C3956b.C3957a.INCOMPATIBLE_NETWORK_TYPE, "incompatible_network_type");
        }
    });

    /* renamed from: b */
    private static final Map<C3213bt.C3220a, String> f4916b = Collections.unmodifiableMap(new HashMap<C3213bt.C3220a, String>() {
        {
            put(C3213bt.C3220a.WIFI, "wifi");
            put(C3213bt.C3220a.CELL, "cell");
            put(C3213bt.C3220a.OFFLINE, "offline");
            put(C3213bt.C3220a.UNDEFINED, "undefined");
        }
    });

    /* renamed from: a */
    public String mo41447a(C3949rs.C3954a.C3956b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("id", bVar.mo41114a().f4563a);
            jSONObject.putOpt("url", bVar.mo41114a().f4564b);
            jSONObject.putOpt(NotificationCompat.CATEGORY_STATUS, f4915a.get(bVar.mo41121b()));
            jSONObject.putOpt("code", bVar.mo41124d());
            if (!C3306cx.m2863a(bVar.mo41125e())) {
                jSONObject.putOpt(FCM.BODY, m5455a(bVar.mo41125e()));
            } else if (!C3306cx.m2863a(bVar.mo41128h())) {
                jSONObject.putOpt(FCM.BODY, m5455a(bVar.mo41128h()));
            }
            jSONObject.putOpt("headers", m5456a(bVar.mo41126f()));
            jSONObject.putOpt("error", m5454a(bVar.mo41127g()));
            jSONObject.putOpt("network_type", f4916b.get(bVar.mo41123c()));
            return jSONObject.toString();
        } catch (Throwable th) {
            return th.toString();
        }
    }

    /* renamed from: a */
    public String mo41446a(C3949rs.C3954a.C3955a aVar) {
        try {
            return new JSONObject().put("id", aVar.f4563a).toString();
        } catch (Throwable th) {
            return th.toString();
        }
    }

    /* renamed from: a */
    private JSONObject m5456a(Map<String, List<String>> map) throws JSONException {
        if (C3306cx.m2862a((Map) map)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            if (!C3306cx.m2861a((Collection) next.getValue())) {
                List<String> a = C3306cx.m2849a((List) next.getValue(), 10);
                ArrayList arrayList = new ArrayList();
                for (String str2 : a) {
                    if (!TextUtils.isEmpty(str2)) {
                        arrayList.add(C3306cx.m2845a(str2, 100));
                    }
                }
                jSONObject.putOpt(str, TextUtils.join(",", arrayList));
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private String m5455a(byte[] bArr) {
        return Base64.encodeToString(bArr, 0);
    }

    /* renamed from: a */
    private String m5454a(Throwable th) {
        if (th == null) {
            return null;
        }
        return th.toString() + "\n" + Log.getStackTraceString(th);
    }
}
