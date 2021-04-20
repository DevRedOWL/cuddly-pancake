package com.yandex.metrica.push.impl;

import android.location.Location;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.MapPoint;

/* renamed from: com.yandex.metrica.push.impl.m */
public class C4397m {

    /* renamed from: a */
    private final Integer f5542a;

    /* renamed from: b */
    private final Integer f5543b;

    /* renamed from: c */
    private final String f5544c;

    /* renamed from: d */
    private final Integer f5545d;

    /* renamed from: e */
    private final C4398a f5546e;

    /* renamed from: f */
    private final Long f5547f;

    /* renamed from: g */
    private final Integer f5548g;

    /* renamed from: h */
    private final Boolean f5549h;

    /* renamed from: i */
    private final Integer f5550i;

    /* renamed from: j */
    private final Integer f5551j;

    /* renamed from: k */
    private final Integer f5552k;

    /* renamed from: l */
    private final Integer f5553l;

    public C4397m(JSONObject jSONObject) {
        this.f5542a = C4372bv.m6431c(jSONObject, "d");
        this.f5543b = C4372bv.m6431c(jSONObject, "p");
        this.f5544c = C4372bv.m6429a(jSONObject, "u");
        this.f5545d = C4372bv.m6431c(jSONObject, MapPoint.JsonFields.f6911x);
        this.f5546e = m6569a(jSONObject);
        this.f5547f = C4372bv.m6432d(jSONObject, "r");
        this.f5548g = C4372bv.m6431c(jSONObject, "a");
        this.f5549h = C4372bv.m6430b(jSONObject, "m");
        this.f5550i = C4372bv.m6431c(jSONObject, "v");
        this.f5551j = C4372bv.m6431c(jSONObject, ExifInterface.LONGITUDE_WEST);
        this.f5552k = C4372bv.m6431c(jSONObject, "s");
        this.f5553l = C4372bv.m6431c(jSONObject, "t");
    }

    /* renamed from: a */
    public Integer mo42089a() {
        return this.f5542a;
    }

    /* renamed from: b */
    public Integer mo42090b() {
        return this.f5543b;
    }

    /* renamed from: c */
    public String mo42091c() {
        return this.f5544c;
    }

    /* renamed from: d */
    public Integer mo42092d() {
        return this.f5545d;
    }

    /* renamed from: e */
    public C4398a mo42093e() {
        return this.f5546e;
    }

    /* renamed from: f */
    public Long mo42094f() {
        return this.f5547f;
    }

    /* renamed from: g */
    public Integer mo42095g() {
        return this.f5548g;
    }

    /* renamed from: h */
    public Boolean mo42096h() {
        return this.f5549h;
    }

    /* renamed from: i */
    public Integer mo42097i() {
        return this.f5550i;
    }

    /* renamed from: j */
    public Integer mo42098j() {
        return this.f5551j;
    }

    /* renamed from: k */
    public Integer mo42099k() {
        return this.f5552k;
    }

    /* renamed from: l */
    public Integer mo42100l() {
        return this.f5553l;
    }

    /* renamed from: a */
    private static C4398a m6569a(JSONObject jSONObject) {
        if (jSONObject.has("c")) {
            try {
                return new C4398a(jSONObject.getJSONObject("c"));
            } catch (JSONException e) {
                C4371bu.m6424a(e, "Error parsing coordinates", new Object[0]);
                C4379ca.m6456c().mo42016a("Error parsing coordinates", (Throwable) e);
            }
        }
        return null;
    }

    /* renamed from: com.yandex.metrica.push.impl.m$a */
    public static class C4398a {

        /* renamed from: a */
        private final Integer f5554a;

        /* renamed from: b */
        private final List<Location> f5555b;

        public C4398a(JSONObject jSONObject) {
            List<Location> list;
            this.f5554a = C4372bv.m6431c(jSONObject, "r");
            List<Location> a = m6583a(jSONObject);
            if (a == null) {
                list = null;
            } else {
                list = Collections.unmodifiableList(a);
            }
            this.f5555b = list;
        }

        /* renamed from: a */
        public Integer mo42101a() {
            return this.f5554a;
        }

        /* renamed from: b */
        public List<Location> mo42102b() {
            return this.f5555b;
        }

        /* renamed from: a */
        private static List<Location> m6583a(JSONObject jSONObject) {
            if (!jSONObject.has("p")) {
                return null;
            }
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("p");
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(m6582a(jSONArray.optJSONArray(i)));
                }
                return arrayList;
            } catch (JSONException e) {
                C4371bu.m6424a(e, "Error parsing location points", new Object[0]);
                C4379ca.m6456c().mo42016a("Error parsing location points", (Throwable) e);
                return null;
            }
        }

        /* renamed from: a */
        private static Location m6582a(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            try {
                Location location = new Location("");
                location.setLatitude(jSONArray.getDouble(0));
                location.setLongitude(jSONArray.getDouble(1));
                return location;
            } catch (JSONException e) {
                C4371bu.m6424a(e, "Error parsing location point", new Object[0]);
                C4379ca.m6456c().mo42016a("Error parsing location point", (Throwable) e);
                return null;
            }
        }
    }
}
