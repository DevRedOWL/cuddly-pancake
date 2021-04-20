package com.yandex.metrica.push.impl;

import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.push.impl.i */
public class C4392i {

    /* renamed from: a */
    private final C4391h f5538a;

    /* renamed from: com.yandex.metrica.push.impl.i$a */
    public static class C4393a {

        /* renamed from: a */
        public final String f5539a;

        /* renamed from: b */
        public final Integer f5540b;

        /* renamed from: c */
        public final String f5541c;

        public C4393a(String str, Integer num, String str2) {
            this.f5539a = str;
            this.f5540b = num;
            this.f5541c = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                C4393a aVar = (C4393a) obj;
                if (!this.f5540b.equals(aVar.f5540b)) {
                    return false;
                }
                String str = this.f5541c;
                if (str != null) {
                    return str.equals(aVar.f5541c);
                }
                if (aVar.f5541c == null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f5540b.hashCode() * 31;
            String str = this.f5541c;
            return hashCode + (str != null ? str.hashCode() : 0);
        }
    }

    public C4392i(C4391h hVar) {
        this.f5538a = hVar;
    }

    /* renamed from: a */
    public void mo42083a(C4402o oVar) {
        if (!C4380cb.m6473b(oVar.mo42121b())) {
            String b = oVar.mo42121b();
            List<String> b2 = mo42086b();
            b2.remove(b);
            b2.add(b);
            if (b2.size() > 50) {
                b2.remove(0);
            }
            JSONArray jSONArray = new JSONArray();
            try {
                for (String put : b2) {
                    jSONArray.put(new JSONObject().put("push_id", put));
                }
            } catch (JSONException unused) {
            }
            this.f5538a.mo42057a(jSONArray.toString());
        }
        if (oVar.mo42124e() != null) {
            String E = oVar.mo42124e().mo42132E();
            long f = oVar.mo42125f();
            List<Long> a = mo42082a(E);
            a.add(Long.valueOf(f));
            if (a.size() > 50) {
                a.remove(0);
            }
            this.f5538a.mo42060a(E, new JSONArray(a).toString());
        }
    }

    /* renamed from: a */
    public void mo42084a(String str, Integer num, String str2) {
        List<C4393a> a = mo42081a();
        C4393a aVar = new C4393a(str, num, str2);
        a.remove(aVar);
        a.add(aVar);
        if (a.size() > 50) {
            a.remove(0);
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (C4393a next : a) {
                jSONArray.put(new JSONObject().put("push_id", next.f5539a).put("notification_id", next.f5540b).put("notification_tag", next.f5541c));
            }
        } catch (JSONException unused) {
        }
        this.f5538a.mo42070c(jSONArray.toString());
    }

    /* renamed from: a */
    public List<C4393a> mo42081a() {
        String d = this.f5538a.mo42075d("");
        LinkedList linkedList = new LinkedList();
        try {
            JSONArray jSONArray = new JSONArray(d);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                linkedList.add(new C4393a(jSONObject.getString("push_id"), Integer.valueOf(jSONObject.getInt("notification_id")), jSONObject.has("notification_tag") ? jSONObject.getString("notification_tag") : null));
            }
        } catch (JSONException unused) {
        }
        return linkedList;
    }

    /* renamed from: b */
    public List<String> mo42086b() {
        String b = this.f5538a.mo42068b("");
        LinkedList linkedList = new LinkedList();
        try {
            JSONArray jSONArray = new JSONArray(b);
            for (int i = 0; i < jSONArray.length(); i++) {
                linkedList.add(jSONArray.getJSONObject(i).getString("push_id"));
            }
        } catch (JSONException unused) {
        }
        return linkedList;
    }

    /* renamed from: a */
    public List<Long> mo42082a(String str) {
        String b = this.f5538a.mo42069b(str, "");
        LinkedList linkedList = new LinkedList();
        try {
            JSONArray jSONArray = new JSONArray(b);
            for (int i = 0; i < jSONArray.length(); i++) {
                linkedList.add(Long.valueOf(jSONArray.getLong(i)));
            }
        } catch (JSONException unused) {
        }
        return linkedList;
    }

    /* renamed from: b */
    public long mo42085b(String str) {
        List<Long> a = mo42082a(str);
        if (a.isEmpty()) {
            return 0;
        }
        return a.get(a.size() - 1).longValue();
    }
}
