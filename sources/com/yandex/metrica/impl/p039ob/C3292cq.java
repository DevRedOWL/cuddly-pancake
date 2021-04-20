package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;
import android.util.Pair;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.metrica.impl.p039ob.C3929rr;
import com.yandex.metrica.impl.p039ob.C4120tv;
import com.yandex.metrica.impl.p039ob.C4204vq;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.view.activity.UrlCarouselViewActivity;

/* renamed from: com.yandex.metrica.impl.ob.cq */
public class C3292cq {

    /* renamed from: a */
    private static final Map<String, C3294a.C3295a> f2922a = Collections.unmodifiableMap(new HashMap<String, C3294a.C3295a>() {
        {
            put("wifi", C3294a.C3295a.WIFI);
            put("cell", C3294a.C3295a.CELL);
        }
    });

    /* renamed from: b */
    private final C3290co f2923b;

    /* renamed from: com.yandex.metrica.impl.ob.cq$b */
    public static class C3296b {

        /* renamed from: A */
        private C4107tt f2933A;

        /* renamed from: B */
        private List<C3835pu> f2934B = new ArrayList();

        /* renamed from: C */
        private boolean f2935C;

        /* renamed from: D */
        private C4125ty f2936D;

        /* renamed from: a */
        private C4120tv.C4121a f2937a = new C4120tv.C4121a();

        /* renamed from: b */
        private C3297a f2938b;

        /* renamed from: c */
        private boolean f2939c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f2940d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f2941e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f2942f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public boolean f2943g;

        /* renamed from: h */
        private List<String> f2944h;

        /* renamed from: i */
        private String f2945i = "";

        /* renamed from: j */
        private List<String> f2946j;

        /* renamed from: k */
        private String f2947k = "";

        /* renamed from: l */
        private List<String> f2948l;

        /* renamed from: m */
        private String f2949m;

        /* renamed from: n */
        private String f2950n;

        /* renamed from: o */
        private String f2951o;

        /* renamed from: p */
        private String f2952p;

        /* renamed from: q */
        private C4129ub f2953q = null;

        /* renamed from: r */
        private C4126tz f2954r = null;

        /* renamed from: s */
        private C3774oh f2955s;

        /* renamed from: t */
        private C3769oc f2956t;

        /* renamed from: u */
        private Long f2957u;

        /* renamed from: v */
        private List<C3294a> f2958v;

        /* renamed from: w */
        private String f2959w;

        /* renamed from: x */
        private List<String> f2960x;

        /* renamed from: y */
        private C4147um f2961y;

        /* renamed from: z */
        private C4128ua f2962z;

        /* renamed from: com.yandex.metrica.impl.ob.cq$b$a */
        public enum C3297a {
            BAD,
            OK
        }

        /* renamed from: a */
        public C4120tv mo39823a() {
            return this.f2937a.mo41508a();
        }

        /* renamed from: b */
        public C4120tv.C4121a mo39826b() {
            return this.f2937a;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m2721a(boolean z) {
            this.f2937a.mo41507a(z);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m2728b(boolean z) {
            this.f2937a.mo41509b(z);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m2735c(boolean z) {
            this.f2940d = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m2742d(boolean z) {
            this.f2941e = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo39825a(String str, boolean z) {
            this.f2934B.add(new C3835pu(str, z));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m2720a(List<String> list) {
            this.f2944h = list;
        }

        /* renamed from: c */
        public List<String> mo39827c() {
            return this.f2944h;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m2719a(String str) {
            this.f2949m = str;
        }

        /* renamed from: d */
        public String mo39828d() {
            return this.f2949m;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m2726b(String str) {
            this.f2945i = str;
        }

        /* renamed from: e */
        public String mo39829e() {
            return this.f2945i;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m2727b(List<String> list) {
            this.f2946j = list;
        }

        /* renamed from: f */
        public List<String> mo39830f() {
            return this.f2946j;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m2733c(String str) {
            this.f2947k = str;
        }

        /* renamed from: g */
        public String mo39831g() {
            return this.f2947k;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m2734c(List<String> list) {
            this.f2948l = list;
        }

        /* renamed from: h */
        public List<String> mo39832h() {
            return this.f2948l;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m2740d(String str) {
            this.f2950n = str;
        }

        /* renamed from: i */
        public String mo39833i() {
            return this.f2950n;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public void m2747e(String str) {
            this.f2951o = str;
        }

        /* renamed from: j */
        public String mo39834j() {
            return this.f2951o;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public void m2752f(String str) {
            this.f2952p = str;
        }

        /* renamed from: k */
        public String mo39835k() {
            return this.f2952p;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m2698a(C3297a aVar) {
            this.f2938b = aVar;
        }

        /* renamed from: l */
        public C3297a mo39836l() {
            return this.f2938b;
        }

        /* renamed from: m */
        public boolean mo39837m() {
            return this.f2939c;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public void m2749e(boolean z) {
            this.f2939c = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m2716a(C4129ub ubVar) {
            this.f2953q = ubVar;
        }

        /* renamed from: n */
        public C4129ub mo39838n() {
            return this.f2953q;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m2714a(C4126tz tzVar) {
            this.f2954r = tzVar;
        }

        /* renamed from: o */
        public C4126tz mo39839o() {
            return this.f2954r;
        }

        /* renamed from: p */
        public C4128ua mo39840p() {
            return this.f2962z;
        }

        /* renamed from: q */
        public List<C3835pu> mo39841q() {
            return this.f2934B;
        }

        /* renamed from: r */
        public C3774oh mo39842r() {
            return this.f2955s;
        }

        /* renamed from: s */
        public C3769oc mo39843s() {
            return this.f2956t;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public void m2753f(boolean z) {
            this.f2937a.mo41510c(z);
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public void m2757g(boolean z) {
            this.f2937a.mo41511d(z);
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public void m2759h(boolean z) {
            this.f2937a.mo41512e(z);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public void m2761i(boolean z) {
            this.f2937a.mo41513f(z);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m2718a(Long l) {
            this.f2957u = l;
        }

        /* renamed from: t */
        public Long mo39844t() {
            return this.f2957u;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m2741d(List<C3294a> list) {
            this.f2958v = list;
        }

        /* renamed from: u */
        public List<C3294a> mo39845u() {
            return this.f2958v;
        }

        /* renamed from: v */
        public String mo39846v() {
            return this.f2959w;
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public void m2756g(String str) {
            this.f2959w = str;
        }

        /* renamed from: w */
        public List<String> mo39847w() {
            return this.f2960x;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public void m2748e(List<String> list) {
            this.f2960x = list;
        }

        /* renamed from: x */
        public C4147um mo39848x() {
            return this.f2961y;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m2717a(C4147um umVar) {
            this.f2961y = umVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m2715a(C4128ua uaVar) {
            this.f2962z = uaVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m2712a(C3774oh ohVar) {
            this.f2955s = ohVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m2711a(C3769oc ocVar) {
            this.f2956t = ocVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public void m2763j(boolean z) {
            this.f2942f = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public void m2765k(boolean z) {
            this.f2943g = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public void m2767l(boolean z) {
            this.f2935C = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m2713a(C4125ty tyVar) {
            this.f2936D = tyVar;
        }

        /* renamed from: y */
        public C4125ty mo39849y() {
            return this.f2936D;
        }

        /* renamed from: z */
        public boolean mo39850z() {
            return this.f2935C;
        }

        /* renamed from: A */
        public C4107tt mo39822A() {
            return this.f2933A;
        }

        /* renamed from: a */
        public void mo39824a(C4107tt ttVar) {
            this.f2933A = ttVar;
        }
    }

    public C3292cq() {
        this(new C3290co());
    }

    /* renamed from: a */
    private String m2671a(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getJSONObject(str).getJSONArray(UrlCarouselViewActivity.URLS).getString(0);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: b */
    private List<String> m2681b(JSONObject jSONObject, String str) {
        try {
            return C4204vq.m5886a(jSONObject.getJSONObject(str).getJSONArray(UrlCarouselViewActivity.URLS));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public C3296b mo39821a(byte[] bArr) {
        C3296b bVar = new C3296b();
        try {
            C4204vq.C4205a aVar = new C4204vq.C4205a(new String(bArr, "UTF-8"));
            m2688d(bVar, aVar);
            m2691g(bVar, aVar);
            m2695k(bVar, aVar);
            m2696l(bVar, aVar);
            m2690f(bVar, aVar);
            m2672a(bVar, aVar);
            m2682b(bVar, aVar);
            m2686c(bVar, aVar);
            if (bVar.mo39823a().f4996c) {
                m2693i(bVar, aVar);
            }
            if (bVar.mo39837m()) {
                m2694j(bVar, aVar);
            }
            if (bVar.mo39850z()) {
                m2687c(bVar, (JSONObject) aVar);
            }
            bVar.m2712a(m2668a(aVar.optJSONObject("foreground_location_collection"), bVar.f2940d, bVar.f2942f));
            bVar.m2711a(m2684c(aVar.optJSONObject("background_location_collection"), bVar.f2941e, bVar.f2943g));
            m2683b(bVar, (JSONObject) aVar);
            m2689e(bVar, aVar);
            m2692h(bVar, aVar);
            bVar.mo39824a(this.f2923b.mo39820a((JSONObject) aVar));
            bVar.m2698a(C3296b.C3297a.OK);
            return bVar;
        } catch (Throwable unused) {
            C3296b bVar2 = new C3296b();
            bVar2.m2698a(C3296b.C3297a.BAD);
            return bVar2;
        }
    }

    /* renamed from: d */
    private void m2688d(C3296b bVar, C4204vq.C4205a aVar) {
        String str;
        JSONObject optJSONObject = aVar.optJSONObject("device_id");
        String str2 = "";
        if (optJSONObject != null) {
            str2 = optJSONObject.optString("hash");
            str = optJSONObject.optString("value");
        } else {
            str = str2;
        }
        bVar.m2740d(str);
        bVar.m2747e(str2);
    }

    /* renamed from: a */
    private static C3774oh m2668a(JSONObject jSONObject, boolean z, boolean z2) {
        return new C3715ms().mo40224a(m2679b(jSONObject, z, z2));
    }

    /* renamed from: b */
    private static C3929rr.C3930a.C3941e m2679b(JSONObject jSONObject, boolean z, boolean z2) {
        C3929rr.C3930a.C3941e eVar = new C3929rr.C3930a.C3941e();
        eVar.f4512b = C4232wk.m6037a(C4204vq.m5880a(jSONObject, "min_update_interval_seconds"), TimeUnit.SECONDS, eVar.f4512b);
        eVar.f4513c = C4232wk.m6034a(C4204vq.m5898d(jSONObject, "min_update_distance_meters"), eVar.f4513c);
        eVar.f4514d = C4232wk.m6035a(C4204vq.m5893b(jSONObject, "records_count_to_force_flush"), eVar.f4514d);
        eVar.f4515e = C4232wk.m6035a(C4204vq.m5893b(jSONObject, "max_records_count_in_batch"), eVar.f4515e);
        eVar.f4516f = C4232wk.m6037a(C4204vq.m5880a(jSONObject, "max_age_seconds_to_force_flush"), TimeUnit.SECONDS, eVar.f4516f);
        eVar.f4517g = C4232wk.m6035a(C4204vq.m5893b(jSONObject, "max_records_to_store_locally"), eVar.f4517g);
        eVar.f4518h = z;
        eVar.f4520j = C4232wk.m6037a(C4204vq.m5880a(jSONObject, "lbs_min_update_interval_seconds"), TimeUnit.SECONDS, eVar.f4520j);
        eVar.f4519i = z2;
        return eVar;
    }

    /* renamed from: c */
    private static C3769oc m2684c(JSONObject jSONObject, boolean z, boolean z2) {
        JSONArray jSONArray;
        C3929rr.C3930a.C3931a aVar = new C3929rr.C3930a.C3931a();
        aVar.f4464b = m2679b(jSONObject, z, z2);
        aVar.f4465c = C4232wk.m6037a(C4204vq.m5880a(jSONObject, "collection_duration_seconds"), TimeUnit.SECONDS, aVar.f4465c);
        aVar.f4466d = C4232wk.m6037a(C4204vq.m5880a(jSONObject, "collection_interval_seconds"), TimeUnit.SECONDS, aVar.f4466d);
        aVar.f4467e = C4204vq.m5891a(jSONObject, "aggressive_relaunch", aVar.f4467e);
        if (jSONObject == null) {
            jSONArray = null;
        } else {
            jSONArray = jSONObject.optJSONArray("collection_interval_ranges_seconds");
        }
        aVar.f4468f = m2678a(jSONArray, aVar.f4468f);
        return new C3708mn().mo40224a(aVar);
    }

    /* renamed from: a */
    private static C3929rr.C3930a.C3931a.C3932a[] m2678a(JSONArray jSONArray, C3929rr.C3930a.C3931a.C3932a[] aVarArr) {
        if (jSONArray != null && jSONArray.length() > 0) {
            try {
                aVarArr = new C3929rr.C3930a.C3931a.C3932a[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    aVarArr[i] = new C3929rr.C3930a.C3931a.C3932a();
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    aVarArr[i].f4470b = TimeUnit.SECONDS.toMillis(jSONObject.getLong("min"));
                    aVarArr[i].f4471c = TimeUnit.SECONDS.toMillis(jSONObject.getLong("max"));
                }
            } catch (Throwable unused) {
            }
        }
        return aVarArr;
    }

    /* renamed from: e */
    private static void m2689e(C3296b bVar, C4204vq.C4205a aVar) throws JSONException {
        if (aVar.has("requests")) {
            JSONObject jSONObject = aVar.getJSONObject("requests");
            if (jSONObject.has("list")) {
                JSONArray jSONArray = jSONObject.getJSONArray("list");
                ArrayList arrayList = new ArrayList(jSONArray.length());
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        arrayList.add(m2667a(jSONArray.getJSONObject(i)));
                    } catch (Throwable unused) {
                    }
                }
                if (!arrayList.isEmpty()) {
                    bVar.m2741d((List<C3294a>) arrayList);
                }
            }
        }
    }

    /* renamed from: a */
    private static C3294a m2667a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject("headers");
        ArrayList arrayList = new ArrayList(jSONObject2.length());
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONArray jSONArray = jSONObject2.getJSONArray(next);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(new Pair(next, jSONArray.getString(i)));
            }
        }
        return new C3294a(jSONObject.optString("id", (String) null), jSONObject.optString("url", (String) null), jSONObject.optString(FirebaseAnalytics.Param.METHOD, (String) null), arrayList, Long.valueOf(jSONObject.getLong("delay_seconds")), m2680b(jSONObject));
    }

    /* renamed from: b */
    private static List<C3294a.C3295a> m2680b(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONObject.has("accept_network_types")) {
            JSONArray jSONArray = jSONObject.getJSONArray("accept_network_types");
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(f2922a.get(jSONArray.getString(i)));
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    private static void m2690f(C3296b bVar, C4204vq.C4205a aVar) throws JSONException {
        C3929rr.C3930a.C3939c cVar = new C3929rr.C3930a.C3939c();
        C3929rr.C3930a.C3941e eVar = new C3929rr.C3930a.C3941e();
        JSONObject jSONObject = (JSONObject) aVar.mo41699a("features", new JSONObject());
        if (jSONObject.has("list")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("list");
            bVar.m2721a(m2677a(jSONObject2, "easy_collecting", cVar.f4495b));
            bVar.m2728b(m2677a(jSONObject2, "package_info", cVar.f4496c));
            bVar.m2749e(m2677a(jSONObject2, "socket", false));
            bVar.m2753f(m2677a(jSONObject2, "permissions_collecting", cVar.f4497d));
            bVar.m2757g(m2677a(jSONObject2, "features_collecting", cVar.f4498e));
            bVar.m2759h(m2677a(jSONObject2, "sdk_list", cVar.f4508o));
            bVar.m2735c(m2677a(jSONObject2, "foreground_location_collection", eVar.f4518h));
            bVar.m2763j(m2677a(jSONObject2, "foreground_lbs_collection", eVar.f4519i));
            bVar.m2742d(m2677a(jSONObject2, "background_location_collection", eVar.f4518h));
            bVar.m2765k(m2677a(jSONObject2, "background_lbs_collection", eVar.f4519i));
            bVar.m2767l(m2677a(jSONObject2, "identity_light_collecting", cVar.f4509p));
            bVar.m2761i(m2677a(jSONObject2, "ble_collecting", cVar.f4510q));
            bVar.mo39826b().mo41514g(m2677a(jSONObject2, "android_id", cVar.f4499f)).mo41515h(m2677a(jSONObject2, "google_aid", cVar.f4500g)).mo41516i(m2677a(jSONObject2, "wifi_around", cVar.f4501h)).mo41517j(m2677a(jSONObject2, "wifi_connected", cVar.f4502i)).mo41518k(m2677a(jSONObject2, "own_macs", cVar.f4503j)).mo41519l(m2677a(jSONObject2, "cells_around", cVar.f4504k)).mo41520m(m2677a(jSONObject2, "sim_info", cVar.f4505l)).mo41521n(m2677a(jSONObject2, "sim_imei", cVar.f4506m)).mo41522o(m2677a(jSONObject2, "access_point", cVar.f4507n));
        }
    }

    /* renamed from: a */
    static void m2672a(C3296b bVar, C4204vq.C4205a aVar) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = aVar.optJSONObject("locale");
        String str = "";
        if (!(optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("country")) == null || !optJSONObject.optBoolean("reliable", false))) {
            str = optJSONObject.optString("value", str);
        }
        bVar.m2756g(str);
    }

    /* renamed from: b */
    static void m2682b(C3296b bVar, C4204vq.C4205a aVar) {
        JSONArray optJSONArray;
        JSONObject optJSONObject = aVar.optJSONObject("permissions");
        if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("list")) != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                if (optJSONObject2 != null) {
                    String optString = optJSONObject2.optString("name");
                    boolean optBoolean = optJSONObject2.optBoolean(ViewProps.ENABLED);
                    if (TextUtils.isEmpty(optString)) {
                        bVar.mo39825a("", false);
                    } else {
                        bVar.mo39825a(optString, optBoolean);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    static void m2686c(C3296b bVar, C4204vq.C4205a aVar) {
        m2673a(bVar, aVar, new C3731nc());
    }

    /* renamed from: a */
    static void m2673a(C3296b bVar, C4204vq.C4205a aVar, C3731nc ncVar) {
        bVar.m2715a(ncVar.mo40224a(m2669a(aVar)));
    }

    /* renamed from: a */
    static C3929rr.C3930a.C3946i m2669a(C4204vq.C4205a aVar) {
        C3929rr.C3930a.C3946i iVar = new C3929rr.C3930a.C3946i();
        JSONObject optJSONObject = aVar.optJSONObject("sdk_list");
        if (optJSONObject == null) {
            return iVar;
        }
        iVar.f4536b = C4232wk.m6037a(C4204vq.m5880a(optJSONObject, "min_collecting_interval_seconds"), TimeUnit.SECONDS, iVar.f4536b);
        iVar.f4537c = C4232wk.m6037a(C4204vq.m5880a(optJSONObject, "min_first_collecting_delay_seconds"), TimeUnit.SECONDS, iVar.f4537c);
        iVar.f4538d = C4232wk.m6037a(C4204vq.m5880a(optJSONObject, "min_collecting_delay_after_launch_seconds"), TimeUnit.SECONDS, iVar.f4538d);
        iVar.f4539e = C4232wk.m6037a(C4204vq.m5880a(optJSONObject, "min_request_retry_interval_seconds"), TimeUnit.SECONDS, iVar.f4539e);
        return iVar;
    }

    /* renamed from: g */
    private static void m2691g(C3296b bVar, C4204vq.C4205a aVar) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3 = aVar.optJSONObject("queries");
        if (optJSONObject3 != null && (optJSONObject = optJSONObject3.optJSONObject("list")) != null && (optJSONObject2 = optJSONObject.optJSONObject("sdk_list")) != null) {
            bVar.m2719a(optJSONObject2.optString("url", (String) null));
        }
    }

    /* renamed from: h */
    private static void m2692h(C3296b bVar, C4204vq.C4205a aVar) {
        C3929rr.C3930a.C3948k kVar = new C3929rr.C3930a.C3948k();
        JSONObject optJSONObject = aVar.optJSONObject("stat_sending");
        if (optJSONObject != null) {
            kVar.f4545b = C4232wk.m6037a(C4204vq.m5880a(optJSONObject, "disabled_reporting_interval_seconds"), TimeUnit.SECONDS, kVar.f4545b);
        }
        bVar.m2717a(new C3735ng().mo40224a(kVar));
    }

    /* renamed from: a */
    private static boolean m2677a(JSONObject jSONObject, String str, boolean z) throws JSONException {
        return jSONObject.has(str) ? jSONObject.getJSONObject(str).optBoolean(ViewProps.ENABLED, z) : z;
    }

    /* renamed from: i */
    private void m2693i(C3296b bVar, C4204vq.C4205a aVar) {
        long j;
        long j2;
        JSONObject optJSONObject = aVar.optJSONObject("permissions_collecting");
        C3929rr.C3930a.C3943g gVar = new C3929rr.C3930a.C3943g();
        if (optJSONObject != null) {
            j2 = optJSONObject.optLong("check_interval_seconds", gVar.f4524b);
            j = optJSONObject.optLong("force_send_interval_seconds", gVar.f4525c);
        } else {
            j2 = gVar.f4524b;
            j = gVar.f4525c;
        }
        bVar.m2714a(new C4126tz(j2, j));
    }

    /* renamed from: j */
    private void m2694j(C3296b bVar, C4204vq.C4205a aVar) {
        JSONObject optJSONObject = aVar.optJSONObject("socket");
        if (optJSONObject != null) {
            long optLong = optJSONObject.optLong("seconds_to_live");
            long optLong2 = optJSONObject.optLong("first_delay_seconds", new C3929rr.C3930a.C3947j().f4543e);
            int optInt = optJSONObject.optInt("launch_delay_seconds", new C3929rr.C3930a.C3947j().f4544f);
            String optString = optJSONObject.optString("token");
            JSONArray optJSONArray = optJSONObject.optJSONArray("ports");
            if (optLong > 0 && m2675a(optString) && optJSONArray != null && optJSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList(optJSONArray.length());
                for (int i = 0; i < optJSONArray.length(); i++) {
                    int optInt2 = optJSONArray.optInt(i);
                    if (optInt2 != 0) {
                        arrayList.add(Integer.valueOf(optInt2));
                    }
                }
                if (!arrayList.isEmpty()) {
                    bVar.m2716a(new C4129ub(optLong, optString, arrayList, optLong2, optInt));
                }
            }
        }
    }

    /* renamed from: k */
    private void m2695k(C3296b bVar, C4204vq.C4205a aVar) throws JSONException {
        JSONObject jSONObject = (JSONObject) aVar.mo41699a("query_hosts", new JSONObject());
        if (jSONObject.has("list")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("list");
            String a = m2671a(jSONObject2, "get_ad");
            if (m2675a(a)) {
                bVar.m2726b(a);
            }
            List<String> b = m2681b(jSONObject2, "report");
            if (m2676a(b)) {
                bVar.m2727b(b);
            }
            String a2 = m2671a(jSONObject2, "report_ad");
            if (m2675a(a2)) {
                bVar.m2733c(a2);
            }
            List<String> b2 = m2681b(jSONObject2, FirebaseAnalytics.Param.LOCATION);
            if (m2676a(b2)) {
                bVar.m2734c(b2);
            }
            List<String> b3 = m2681b(jSONObject2, "startup");
            if (m2676a(b3)) {
                bVar.m2720a(b3);
            }
            List<String> b4 = m2681b(jSONObject2, "diagnostic");
            if (m2676a(b4)) {
                bVar.m2748e(b4);
            }
        }
    }

    /* renamed from: a */
    private boolean m2675a(String str) {
        return !TextUtils.isEmpty(str);
    }

    /* renamed from: a */
    private boolean m2676a(List<String> list) {
        return !C3306cx.m2861a((Collection) list);
    }

    /* renamed from: l */
    private void m2696l(C3296b bVar, C4204vq.C4205a aVar) throws JSONException {
        JSONObject optJSONObject = ((JSONObject) aVar.mo41699a("distribution_customization", new JSONObject())).optJSONObject("clids");
        if (optJSONObject != null) {
            m2674a(bVar, optJSONObject);
        }
    }

    /* renamed from: a */
    private void m2674a(C3296b bVar, JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject optJSONObject = jSONObject.optJSONObject(next);
            if (optJSONObject != null && optJSONObject.has("value")) {
                hashMap.put(next, optJSONObject.getString("value"));
            }
        }
        bVar.m2752f(C4225we.m6008a((Map<String, String>) hashMap));
    }

    /* renamed from: b */
    private void m2683b(C3296b bVar, JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("time");
        if (optJSONObject != null) {
            try {
                bVar.m2718a(Long.valueOf(optJSONObject.getLong("max_valid_difference_seconds")));
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    private void m2687c(C3296b bVar, JSONObject jSONObject) {
        bVar.m2713a(new C3716mt().mo40224a(m2685c(jSONObject.optJSONObject("identity_light_collecting"))));
    }

    /* renamed from: c */
    private C3929rr.C3930a.C3940d m2685c(JSONObject jSONObject) {
        C3929rr.C3930a.C3940d dVar = new C3929rr.C3930a.C3940d();
        if (jSONObject != null) {
            dVar.f4511b = jSONObject.optLong("min_interval_seconds", dVar.f4511b);
        }
        return dVar;
    }

    /* renamed from: a */
    public static Long m2670a(Map<String, List<String>> map) {
        if (!C3306cx.m2862a((Map) map)) {
            List list = map.get("Date");
            if (!C3306cx.m2861a((Collection) list)) {
                try {
                    return Long.valueOf(new SimpleDateFormat("E, d MMM yyyy HH:mm:ss z", Locale.US).parse((String) list.get(0)).getTime());
                } catch (Throwable unused) {
                }
            }
        }
        return null;
    }

    /* renamed from: com.yandex.metrica.impl.ob.cq$a */
    public static class C3294a {

        /* renamed from: a */
        public final String f2924a;

        /* renamed from: b */
        public final String f2925b;

        /* renamed from: c */
        public final String f2926c;

        /* renamed from: d */
        public final List<Pair<String, String>> f2927d;

        /* renamed from: e */
        public final Long f2928e;

        /* renamed from: f */
        public final List<C3295a> f2929f;

        /* renamed from: com.yandex.metrica.impl.ob.cq$a$a */
        public enum C3295a {
            WIFI,
            CELL
        }

        public C3294a(String str, String str2, String str3, List<Pair<String, String>> list, Long l, List<C3295a> list2) {
            this.f2924a = str;
            this.f2925b = str2;
            this.f2926c = str3;
            this.f2927d = Collections.unmodifiableList(list);
            this.f2928e = l;
            this.f2929f = list2;
        }
    }

    public C3292cq(C3290co coVar) {
        this.f2923b = coVar;
    }
}
