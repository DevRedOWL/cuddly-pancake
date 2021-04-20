package com.yandex.metrica.impl.p039ob;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.tf */
public class C4077tf {
    /* renamed from: a */
    public List<C4079th> mo41438a(List<C4079th> list) {
        ArrayList arrayList = new ArrayList();
        for (C4079th next : list) {
            ArrayList arrayList2 = new ArrayList(next.f4912b.size());
            for (String next2 : next.f4912b) {
                if (C3266ci.m2615b(next2)) {
                    arrayList2.add(next2);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new C4079th(next.f4911a, arrayList2));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public JSONObject mo41439b(List<C4079th> list) {
        JSONObject jSONObject = new JSONObject();
        for (C4079th next : list) {
            try {
                jSONObject.put(next.f4911a, new JSONObject().put("classes", new JSONArray(next.f4912b)));
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }
}
