package com.yandex.metrica.push.impl;

import android.content.Context;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.push.impl.o */
public class C4402o {

    /* renamed from: a */
    private final String f5580a;

    /* renamed from: b */
    private final boolean f5581b;

    /* renamed from: c */
    private final String f5582c;

    /* renamed from: d */
    private final C4403p f5583d;

    /* renamed from: e */
    private final Bundle f5584e;

    /* renamed from: f */
    private final long f5585f;

    /* renamed from: g */
    private final boolean f5586g;

    /* renamed from: h */
    private final C4397m f5587h;

    /* renamed from: i */
    private final String f5588i;

    public C4402o(Context context, Bundle bundle) {
        this.f5584e = bundle;
        String string = bundle.getString("yamp");
        boolean z = false;
        this.f5586g = string != null;
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject(string);
        } catch (Exception unused) {
            C4376by.m6446b("Ignore parse push message exception", new Object[0]);
        }
        this.f5580a = C4372bv.m6429a(jSONObject, "a");
        this.f5581b = jSONObject != null ? jSONObject.optBoolean("b", false) : z;
        this.f5582c = C4372bv.m6429a(jSONObject, "c");
        this.f5583d = m6603a(context, jSONObject);
        C4403p pVar = this.f5583d;
        this.f5585f = pVar == null ? System.currentTimeMillis() : pVar.mo42152s().longValue();
        this.f5587h = m6602a(jSONObject);
        this.f5588i = C4372bv.m6429a(jSONObject, "e");
    }

    /* renamed from: a */
    private static C4403p m6603a(Context context, JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("d")) {
            try {
                return new C4403p(context, jSONObject.getJSONObject("d"));
            } catch (JSONException e) {
                C4376by.m6445a(e, "Error parsing push notification", new Object[0]);
                C4379ca.m6456c().mo42016a("Error parsing push notification", (Throwable) e);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static C4397m m6602a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("f")) {
            try {
                return new C4397m(jSONObject.getJSONObject("f"));
            } catch (JSONException e) {
                C4371bu.m6424a(e, "Error parsing filters", new Object[0]);
                C4379ca.m6456c().mo42016a("Error parsing filters", (Throwable) e);
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo42120a() {
        return this.f5586g;
    }

    /* renamed from: b */
    public String mo42121b() {
        return this.f5580a;
    }

    /* renamed from: c */
    public boolean mo42122c() {
        return this.f5581b;
    }

    /* renamed from: d */
    public String mo42123d() {
        return this.f5582c;
    }

    /* renamed from: e */
    public C4403p mo42124e() {
        return this.f5583d;
    }

    /* renamed from: f */
    public long mo42125f() {
        return this.f5585f;
    }

    /* renamed from: g */
    public C4397m mo42126g() {
        return this.f5587h;
    }

    /* renamed from: h */
    public String mo42127h() {
        return this.f5588i;
    }
}
