package com.yandex.metrica.push.impl;

import android.content.Context;
import android.graphics.Bitmap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.MapPoint;

/* renamed from: com.yandex.metrica.push.impl.p */
public class C4403p {

    /* renamed from: A */
    private final String f5589A;

    /* renamed from: B */
    private Bitmap f5590B;

    /* renamed from: C */
    private final Integer f5591C;

    /* renamed from: D */
    private final String f5592D;

    /* renamed from: E */
    private Bitmap f5593E;

    /* renamed from: F */
    private final boolean f5594F;

    /* renamed from: G */
    private final C4404a[] f5595G;

    /* renamed from: H */
    private final String f5596H;

    /* renamed from: I */
    private final Boolean f5597I;

    /* renamed from: J */
    private final Long f5598J;

    /* renamed from: K */
    private final Context f5599K;

    /* renamed from: L */
    private final C4370bt f5600L;

    /* renamed from: a */
    private final String f5601a;

    /* renamed from: b */
    private final Integer f5602b;

    /* renamed from: c */
    private final String f5603c;

    /* renamed from: d */
    private final Boolean f5604d;

    /* renamed from: e */
    private final Integer f5605e;

    /* renamed from: f */
    private final String f5606f;

    /* renamed from: g */
    private final String f5607g;

    /* renamed from: h */
    private final String f5608h;

    /* renamed from: i */
    private final String f5609i;

    /* renamed from: j */
    private final String f5610j;

    /* renamed from: k */
    private final Integer f5611k;

    /* renamed from: l */
    private final String f5612l;

    /* renamed from: m */
    private final Boolean f5613m;

    /* renamed from: n */
    private final C4406b f5614n;

    /* renamed from: o */
    private final Integer f5615o;

    /* renamed from: p */
    private final Boolean f5616p;

    /* renamed from: q */
    private final Boolean f5617q;

    /* renamed from: r */
    private final Integer f5618r;

    /* renamed from: s */
    private final long f5619s;

    /* renamed from: t */
    private final Boolean f5620t;

    /* renamed from: u */
    private final String f5621u;

    /* renamed from: v */
    private final long[] f5622v;

    /* renamed from: w */
    private final Integer f5623w;

    /* renamed from: x */
    private final String f5624x;

    /* renamed from: y */
    private final Integer f5625y;

    /* renamed from: z */
    private final Integer f5626z;

    /* renamed from: com.yandex.metrica.push.impl.p$b */
    public static class C4406b {

        /* renamed from: a */
        private final Integer f5641a;

        /* renamed from: b */
        private final Integer f5642b;

        /* renamed from: c */
        private final Integer f5643c;

        public C4406b(JSONObject jSONObject) {
            this.f5641a = C4372bv.m6431c(jSONObject, "a");
            this.f5642b = C4372bv.m6431c(jSONObject, "b");
            this.f5643c = C4372bv.m6431c(jSONObject, "c");
        }

        /* renamed from: a */
        public Integer mo42168a() {
            return this.f5641a;
        }

        /* renamed from: b */
        public Integer mo42169b() {
            return this.f5642b;
        }

        /* renamed from: c */
        public Integer mo42170c() {
            return this.f5643c;
        }

        /* renamed from: d */
        public boolean mo42171d() {
            return (this.f5641a == null || this.f5642b == null || this.f5643c == null) ? false : true;
        }
    }

    /* renamed from: com.yandex.metrica.push.impl.p$a */
    public static class C4404a {

        /* renamed from: a */
        private final String f5627a;

        /* renamed from: b */
        private final String f5628b;

        /* renamed from: c */
        private final String f5629c;

        /* renamed from: d */
        private final Integer f5630d;

        /* renamed from: e */
        private final Boolean f5631e;

        /* renamed from: f */
        private final Boolean f5632f;

        /* renamed from: g */
        private final Boolean f5633g;

        /* renamed from: h */
        private final C4405a f5634h;

        /* renamed from: com.yandex.metrica.push.impl.p$a$a */
        public enum C4405a {
            OPEN_URI(0),
            OPEN_APP_URI(1),
            DO_NOTHING(2),
            UNKNOWN(-1);
            

            /* renamed from: e */
            private final int f5640e;

            private C4405a(int i) {
                this.f5640e = i;
            }

            /* renamed from: a */
            public static C4405a m6656a(int i) {
                for (C4405a aVar : values()) {
                    if (aVar.f5640e == i) {
                        return aVar;
                    }
                }
                return UNKNOWN;
            }
        }

        public C4404a(Context context, JSONObject jSONObject) {
            this.f5627a = jSONObject.optString("a");
            this.f5628b = jSONObject.optString("b");
            this.f5629c = jSONObject.optString("c");
            this.f5630d = C4380cb.m6468a(context, jSONObject.optString("d"));
            this.f5631e = C4372bv.m6430b(jSONObject, "e");
            this.f5632f = C4372bv.m6430b(jSONObject, "f");
            this.f5633g = C4372bv.m6430b(jSONObject, "g");
            Integer c = C4372bv.m6431c(jSONObject, "h");
            this.f5634h = c != null ? C4405a.m6656a(c.intValue()) : null;
        }

        /* renamed from: a */
        public String mo42160a() {
            return this.f5627a;
        }

        /* renamed from: b */
        public String mo42161b() {
            return this.f5628b;
        }

        /* renamed from: c */
        public String mo42162c() {
            return this.f5629c;
        }

        /* renamed from: d */
        public Integer mo42163d() {
            return this.f5630d;
        }

        /* renamed from: e */
        public Boolean mo42164e() {
            return this.f5631e;
        }

        /* renamed from: f */
        public Boolean mo42165f() {
            return this.f5632f;
        }

        /* renamed from: g */
        public Boolean mo42166g() {
            return this.f5633g;
        }

        /* renamed from: h */
        public C4405a mo42167h() {
            return this.f5634h;
        }
    }

    public C4403p(Context context, JSONObject jSONObject) {
        this(context, jSONObject, new C4370bt(context));
    }

    C4403p(Context context, JSONObject jSONObject, C4370bt btVar) {
        this.f5599K = context;
        this.f5600L = btVar;
        this.f5601a = jSONObject.optString("ag");
        this.f5602b = C4372bv.m6431c(jSONObject, "a");
        this.f5603c = jSONObject.optString("b");
        this.f5604d = C4372bv.m6430b(jSONObject, "c");
        this.f5605e = C4372bv.m6431c(jSONObject, "d");
        this.f5606f = jSONObject.optString("e");
        this.f5607g = jSONObject.optString("f");
        this.f5608h = jSONObject.optString("g");
        this.f5609i = jSONObject.optString("h");
        this.f5610j = jSONObject.optString("i");
        this.f5611k = C4372bv.m6431c(jSONObject, "j");
        this.f5612l = jSONObject.optString("k");
        this.f5613m = C4372bv.m6430b(jSONObject, "l");
        this.f5614n = m6613a(jSONObject);
        this.f5615o = C4372bv.m6431c(jSONObject, "n");
        this.f5616p = C4372bv.m6430b(jSONObject, "o");
        this.f5617q = C4372bv.m6430b(jSONObject, "p");
        this.f5618r = C4372bv.m6431c(jSONObject, "q");
        this.f5619s = jSONObject.optLong("r", System.currentTimeMillis());
        this.f5620t = C4372bv.m6430b(jSONObject, "s");
        this.f5621u = jSONObject.optString("t");
        this.f5622v = m6614a(jSONObject, "u");
        this.f5623w = C4372bv.m6431c(jSONObject, "v");
        this.f5625y = C4380cb.m6468a(context, jSONObject.optString(MapPoint.JsonFields.f6911x));
        this.f5589A = jSONObject.optString(MapPoint.JsonFields.f6912y);
        this.f5592D = jSONObject.optString("aa");
        this.f5594F = jSONObject.optInt("ab", 0) == 1;
        this.f5624x = jSONObject.optString("w");
        this.f5595G = m6615a(context, jSONObject);
        this.f5596H = jSONObject.optString("ac");
        this.f5597I = C4372bv.m6430b(jSONObject, "ad");
        this.f5626z = C4380cb.m6468a(context, jSONObject.optString("ae"));
        this.f5591C = C4380cb.m6468a(context, jSONObject.optString("af"));
        this.f5598J = C4372bv.m6432d(jSONObject, "ah");
    }

    /* renamed from: a */
    private static C4406b m6613a(JSONObject jSONObject) {
        if (!jSONObject.has("m")) {
            return null;
        }
        try {
            return new C4406b(jSONObject.getJSONObject("m"));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static C4404a[] m6615a(Context context, JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("z");
            C4404a[] aVarArr = new C4404a[jSONArray.length()];
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    aVarArr[i] = new C4404a(context, jSONArray.getJSONObject(i));
                    i++;
                } catch (JSONException unused) {
                    return aVarArr;
                }
            }
            return aVarArr;
        } catch (JSONException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    private static long[] m6614a(JSONObject jSONObject, String str) {
        if (!jSONObject.has(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            long[] jArr = new long[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                jArr[i] = jSONArray.getLong(i);
            }
            return jArr;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public String mo42134a() {
        return this.f5601a;
    }

    /* renamed from: b */
    public Integer mo42135b() {
        return this.f5602b;
    }

    /* renamed from: c */
    public String mo42136c() {
        return this.f5603c;
    }

    /* renamed from: d */
    public Boolean mo42137d() {
        return this.f5604d;
    }

    /* renamed from: e */
    public Integer mo42138e() {
        return this.f5605e;
    }

    /* renamed from: f */
    public String mo42139f() {
        return this.f5606f;
    }

    /* renamed from: g */
    public String mo42140g() {
        return this.f5607g;
    }

    /* renamed from: h */
    public String mo42141h() {
        return this.f5608h;
    }

    /* renamed from: i */
    public String mo42142i() {
        return this.f5609i;
    }

    /* renamed from: j */
    public String mo42143j() {
        return this.f5610j;
    }

    /* renamed from: k */
    public Integer mo42144k() {
        return this.f5611k;
    }

    /* renamed from: l */
    public Boolean mo42145l() {
        return this.f5613m;
    }

    /* renamed from: m */
    public String mo42146m() {
        return this.f5612l;
    }

    /* renamed from: n */
    public C4406b mo42147n() {
        return this.f5614n;
    }

    /* renamed from: o */
    public Integer mo42148o() {
        return this.f5615o;
    }

    /* renamed from: p */
    public Boolean mo42149p() {
        return this.f5616p;
    }

    /* renamed from: q */
    public Boolean mo42150q() {
        return this.f5617q;
    }

    /* renamed from: r */
    public Integer mo42151r() {
        return this.f5618r;
    }

    /* renamed from: s */
    public Long mo42152s() {
        return Long.valueOf(this.f5619s);
    }

    /* renamed from: t */
    public Boolean mo42153t() {
        return this.f5620t;
    }

    /* renamed from: u */
    public String mo42154u() {
        return this.f5621u;
    }

    /* renamed from: v */
    public long[] mo42155v() {
        return this.f5622v;
    }

    /* renamed from: w */
    public Integer mo42156w() {
        return this.f5623w;
    }

    /* renamed from: x */
    public Integer mo42157x() {
        return this.f5625y;
    }

    /* renamed from: y */
    public Long mo42158y() {
        return this.f5598J;
    }

    /* renamed from: z */
    public Bitmap mo42159z() {
        if (this.f5590B == null) {
            this.f5590B = m6612a(this.f5599K, this.f5600L, this.f5626z, this.f5589A, C4380cb.m6470a(11) ? this.f5599K.getResources().getDimension(17104901) : 64.0f, C4380cb.m6470a(11) ? this.f5599K.getResources().getDimension(17104902) : 64.0f);
        }
        return this.f5590B;
    }

    /* renamed from: A */
    public Bitmap mo42128A() {
        if (this.f5593E == null) {
            this.f5593E = m6612a(this.f5599K, this.f5600L, this.f5591C, this.f5592D, -1.0f, -1.0f);
        }
        return this.f5593E;
    }

    /* renamed from: B */
    public boolean mo42129B() {
        return this.f5594F;
    }

    /* renamed from: C */
    public String mo42130C() {
        return this.f5624x;
    }

    /* renamed from: D */
    public C4404a[] mo42131D() {
        return this.f5595G;
    }

    /* renamed from: E */
    public String mo42132E() {
        return this.f5596H;
    }

    /* renamed from: F */
    public Boolean mo42133F() {
        return this.f5597I;
    }

    /* renamed from: a */
    private static Bitmap m6612a(Context context, C4370bt btVar, Integer num, String str, float f, float f2) {
        Bitmap bitmap;
        if (num != null) {
            C4376by.m6447c("Get bitmap from resources with id: %d", num);
            bitmap = C4380cb.m6464a(context, num.intValue(), f, f2);
        } else {
            bitmap = null;
        }
        if (bitmap != null || C4380cb.m6473b(str)) {
            return bitmap;
        }
        C4376by.m6447c("Download bitmap for url: %s", str);
        return btVar.mo42008a(context, str, f, f2);
    }
}
