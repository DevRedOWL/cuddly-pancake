package com.yandex.metrica.impl.p039ob;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import com.facebook.react.uimanager.ViewProps;
import com.yandex.metrica.C3097i;
import com.yandex.metrica.impl.p039ob.C3125af;
import com.yandex.metrica.impl.p039ob.C3307cy;
import com.yandex.metrica.impl.p039ob.C3884rh;
import com.yandex.metrica.impl.p039ob.C4204vq;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.mobileid.access.key.NetworkKey;

/* renamed from: com.yandex.metrica.impl.ob.bv */
public final class C3223bv {

    /* renamed from: a */
    private static Map<C3557jh, Integer> f2763a;

    /* renamed from: b */
    private static SparseArray<C3557jh> f2764b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Map<C3134aj, Integer> f2765c;

    /* renamed from: a */
    public static void m2423a(C3884rh.C3889c.C3895e eVar) {
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(C3557jh.FOREGROUND, 0);
        hashMap.put(C3557jh.BACKGROUND, 1);
        f2763a = Collections.unmodifiableMap(hashMap);
        SparseArray<C3557jh> sparseArray = new SparseArray<>();
        sparseArray.put(0, C3557jh.FOREGROUND);
        sparseArray.put(1, C3557jh.BACKGROUND);
        f2764b = sparseArray;
        HashMap hashMap2 = new HashMap();
        hashMap2.put(C3134aj.FIRST_OCCURRENCE, 1);
        hashMap2.put(C3134aj.NON_FIRST_OCCURENCE, 0);
        hashMap2.put(C3134aj.UNKNOWN, -1);
        f2765c = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    public static C3884rh.C3889c.C3902g m2419a(ContentValues contentValues) {
        return m2420a(contentValues.getAsLong("start_time"), contentValues.getAsLong("server_time_offset"), contentValues.getAsBoolean("obtained_before_first_sync"));
    }

    /* renamed from: a */
    public static C3884rh.C3889c.C3901f m2417a(C4185vb vbVar) {
        C3884rh.C3889c.C3901f fVar = new C3884rh.C3889c.C3901f();
        if (vbVar.mo41664a() != null) {
            fVar.f4353b = vbVar.mo41664a().intValue();
        }
        if (vbVar.mo41665b() != null) {
            fVar.f4354c = vbVar.mo41665b().intValue();
        }
        if (!TextUtils.isEmpty(vbVar.mo41667d())) {
            fVar.f4355d = vbVar.mo41667d();
        }
        fVar.f4356e = vbVar.mo41666c();
        if (!TextUtils.isEmpty(vbVar.mo41668e())) {
            fVar.f4357f = vbVar.mo41668e();
        }
        return fVar;
    }

    /* renamed from: a */
    public static C3557jh m2414a(int i) {
        return f2764b.get(i);
    }

    /* renamed from: a */
    public static C3884rh.C3903d[] m2425a(String str) {
        try {
            return m2426a(new JSONArray(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static C3884rh.C3903d[] m2426a(JSONArray jSONArray) {
        C3884rh.C3903d[] dVarArr = null;
        try {
            dVarArr = new C3884rh.C3903d[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                dVarArr[i] = m2421a(jSONArray.getJSONObject(i));
            }
        } catch (Throwable unused) {
        }
        return dVarArr;
    }

    /* renamed from: a */
    public static C3884rh.C3903d m2421a(JSONObject jSONObject) throws JSONException {
        try {
            C3884rh.C3903d dVar = new C3884rh.C3903d();
            dVar.f4363b = jSONObject.getString("mac");
            dVar.f4364c = jSONObject.getInt("signal_strength");
            dVar.f4365d = jSONObject.getString("ssid");
            dVar.f4366e = jSONObject.optBoolean("is_connected");
            dVar.f4367f = jSONObject.optLong("last_visible_offset_seconds", 0);
            return dVar;
        } catch (Throwable unused) {
            C3884rh.C3903d dVar2 = new C3884rh.C3903d();
            dVar2.f4363b = jSONObject.getString("mac");
            return dVar2;
        }
    }

    /* renamed from: b */
    static C3884rh.C3889c.C3895e.C3896a.C3898b.C3899a m2428b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            C3884rh.C3889c.C3895e.C3896a.C3898b.C3899a aVar = new C3884rh.C3889c.C3895e.C3896a.C3898b.C3899a();
            aVar.f4347b = jSONObject.optString("ssid");
            int optInt = jSONObject.optInt("state", -1);
            if (!(optInt == 0 || optInt == 1 || optInt == 2)) {
                if (optInt == 3) {
                    aVar.f4348c = 2;
                } else if (optInt != 4) {
                }
                return aVar;
            }
            aVar.f4348c = 1;
            return aVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static C3884rh.C3889c.C3902g m2418a(long j) {
        C3884rh.C3889c.C3902g gVar = new C3884rh.C3889c.C3902g();
        gVar.f4358b = j;
        gVar.f4359c = C4229wi.m6027a(j);
        return gVar;
    }

    /* renamed from: a */
    public static C3884rh.C3889c.C3902g m2420a(Long l, Long l2, Boolean bool) {
        C3884rh.C3889c.C3902g a = m2418a(l.longValue());
        if (l2 != null) {
            a.f4360d = l2.longValue();
        }
        if (bool != null) {
            a.f4361e = bool.booleanValue();
        }
        return a;
    }

    /* renamed from: a */
    public static C3884rh.C3889c.C3895e.C3900b m2416a(String str, int i, C3884rh.C3889c.C3902g gVar) {
        C3884rh.C3889c.C3895e.C3900b bVar = new C3884rh.C3889c.C3895e.C3900b();
        bVar.f4349b = gVar;
        bVar.f4350c = str;
        bVar.f4351d = i;
        return bVar;
    }

    /* renamed from: a */
    static int m2413a(C3557jh jhVar) {
        return f2763a.get(jhVar).intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        return new com.yandex.metrica.impl.p039ob.C3884rh.C3885a[]{m2427b(new org.json.JSONObject(r3))};
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0011 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.yandex.metrica.impl.p039ob.C3884rh.C3885a[] m2430c(java.lang.String r3) {
        /*
            r0 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0011 }
            if (r1 != 0) goto L_0x0021
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ all -> 0x0011 }
            r1.<init>(r3)     // Catch:{ all -> 0x0011 }
            com.yandex.metrica.impl.ob.rh$a[] r0 = m2429b((org.json.JSONArray) r1)     // Catch:{ all -> 0x0011 }
            goto L_0x0021
        L_0x0011:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0021 }
            r1.<init>(r3)     // Catch:{ all -> 0x0021 }
            r3 = 1
            com.yandex.metrica.impl.ob.rh$a[] r3 = new com.yandex.metrica.impl.p039ob.C3884rh.C3885a[r3]     // Catch:{ all -> 0x0021 }
            r2 = 0
            com.yandex.metrica.impl.ob.rh$a r1 = m2427b((org.json.JSONObject) r1)     // Catch:{ all -> 0x0021 }
            r3[r2] = r1     // Catch:{ all -> 0x0021 }
            r0 = r3
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3223bv.m2430c(java.lang.String):com.yandex.metrica.impl.ob.rh$a[]");
    }

    /* renamed from: b */
    public static C3884rh.C3885a[] m2429b(JSONArray jSONArray) {
        C3884rh.C3885a[] aVarArr = null;
        try {
            aVarArr = new C3884rh.C3885a[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    aVarArr[i] = m2427b(jSONObject);
                }
            }
        } catch (Throwable unused) {
        }
        return aVarArr;
    }

    /* renamed from: b */
    static C3884rh.C3885a m2427b(JSONObject jSONObject) {
        int optInt;
        C3884rh.C3885a aVar = new C3884rh.C3885a();
        if (jSONObject.has("signal_strength") && (optInt = jSONObject.optInt("signal_strength", aVar.f4249c)) != -1) {
            aVar.f4249c = optInt;
        }
        if (jSONObject.has("cell_id")) {
            aVar.f4248b = jSONObject.optInt("cell_id", aVar.f4248b);
        }
        if (jSONObject.has("lac")) {
            aVar.f4250d = jSONObject.optInt("lac", aVar.f4250d);
        }
        if (jSONObject.has("country_code")) {
            aVar.f4251e = jSONObject.optInt("country_code", aVar.f4251e);
        }
        if (jSONObject.has("operator_id")) {
            aVar.f4252f = jSONObject.optInt("operator_id", aVar.f4252f);
        }
        if (jSONObject.has("operator_name")) {
            aVar.f4253g = jSONObject.optString("operator_name", aVar.f4253g);
        }
        if (jSONObject.has("is_connected")) {
            aVar.f4254h = jSONObject.optBoolean("is_connected", aVar.f4254h);
        }
        aVar.f4255i = jSONObject.optInt("cell_type", 0);
        if (jSONObject.has("pci")) {
            aVar.f4256j = jSONObject.optInt("pci", aVar.f4256j);
        }
        if (jSONObject.has("last_visible_time_offset")) {
            aVar.f4257k = jSONObject.optLong("last_visible_time_offset", aVar.f4257k);
        }
        return aVar;
    }

    /* renamed from: d */
    public static C3884rh.C3889c.C3891b m2431d(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                C4204vq.C4205a aVar = new C4204vq.C4205a(str);
                if (aVar.mo41702c("lon") && aVar.mo41702c("lat")) {
                    C3884rh.C3889c.C3891b bVar = new C3884rh.C3889c.C3891b();
                    try {
                        bVar.f4290c = aVar.getDouble("lon");
                        bVar.f4289b = aVar.getDouble("lat");
                        bVar.f4295h = aVar.optInt("altitude");
                        bVar.f4293f = aVar.optInt("direction");
                        bVar.f4292e = aVar.optInt("precision");
                        bVar.f4294g = aVar.optInt("speed");
                        bVar.f4291d = aVar.optLong("timestamp") / 1000;
                        if (aVar.mo41702c("provider")) {
                            String a = aVar.mo41700a("provider");
                            if ("gps".equals(a)) {
                                bVar.f4296i = 1;
                            } else if (NetworkKey.DEFAULT_STORAGE_ID.equals(a)) {
                                bVar.f4296i = 2;
                            }
                        }
                        if (!aVar.mo41702c("original_provider")) {
                            return bVar;
                        }
                        bVar.f4297j = aVar.mo41700a("original_provider");
                        return bVar;
                    } catch (Throwable unused) {
                        return bVar;
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return null;
    }

    /* renamed from: e */
    static int m2432e(String str) {
        try {
            return new C3608ko().mo40357a(Boolean.valueOf(new C4204vq.C4205a(str).getBoolean(ViewProps.ENABLED))).intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static C3884rh.C3889c.C3895e.C3896a.C3898b m2415a(int i, String str, String str2, String str3, String str4) {
        C3884rh.C3889c.C3895e.C3896a.C3898b bVar = new C3884rh.C3889c.C3895e.C3896a.C3898b();
        bVar.f4344d = i;
        if (str != null) {
            bVar.f4345e = str;
        }
        C3884rh.C3885a[] c = m2430c(str3);
        if (c != null) {
            bVar.f4342b = c;
        }
        bVar.f4343c = m2425a(str2);
        if (!TextUtils.isEmpty(str4)) {
            bVar.f4346f = m2428b(str4);
        }
        return bVar;
    }

    /* renamed from: f */
    public static C3884rh.C3889c.C3895e.C3896a.C3897a m2433f(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            C3097i a = C4230wj.m6032a(str);
            C3884rh.C3889c.C3895e.C3896a.C3897a aVar = new C3884rh.C3889c.C3895e.C3896a.C3897a();
            aVar.f4339b = a.mo39382a();
            if (!TextUtils.isEmpty(a.mo39385b())) {
                aVar.f4340c = a.mo39385b();
            }
            if (!C3306cx.m2862a((Map) a.mo39387c())) {
                aVar.f4341d = C4204vq.m5894b((Map) a.mo39387c());
            }
            return aVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static C3884rh.C3889c.C3892c[] m2424a(Context context) {
        List<C3307cy.C3316a> b = C3307cy.m2873a(context).mo39871b();
        if (C3306cx.m2861a((Collection) b)) {
            return null;
        }
        C3884rh.C3889c.C3892c[] cVarArr = new C3884rh.C3889c.C3892c[b.size()];
        for (int i = 0; i < b.size(); i++) {
            C3884rh.C3889c.C3892c cVar = new C3884rh.C3889c.C3892c();
            C3307cy.C3316a aVar = b.get(i);
            cVar.f4299b = aVar.f3005a;
            cVar.f4300c = aVar.f3006b;
            cVarArr[i] = cVar;
        }
        return cVarArr;
    }

    /* renamed from: com.yandex.metrica.impl.ob.bv$c */
    static class C3227c {

        /* renamed from: u */
        private static final Map<C3125af.C3126a, Class<?>> f2767u;

        /* renamed from: v */
        private static final Map<C3125af.C3126a, Integer> f2768v;

        /* renamed from: a */
        protected String f2769a;

        /* renamed from: b */
        protected String f2770b;

        /* renamed from: c */
        protected int f2771c;

        /* renamed from: d */
        protected int f2772d;

        /* renamed from: e */
        protected int f2773e;

        /* renamed from: f */
        protected long f2774f;

        /* renamed from: g */
        protected String f2775g;

        /* renamed from: h */
        protected String f2776h;

        /* renamed from: i */
        protected String f2777i;

        /* renamed from: j */
        protected Integer f2778j;

        /* renamed from: k */
        protected Integer f2779k;

        /* renamed from: l */
        protected String f2780l;

        /* renamed from: m */
        protected String f2781m;

        /* renamed from: n */
        protected int f2782n;

        /* renamed from: o */
        protected int f2783o;

        /* renamed from: p */
        protected String f2784p;

        /* renamed from: q */
        protected String f2785q;

        /* renamed from: r */
        protected String f2786r;

        /* renamed from: s */
        protected C4247wz f2787s;

        /* renamed from: t */
        protected C3134aj f2788t;

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public int mo39723f() {
            return 0;
        }

        static {
            HashMap hashMap = new HashMap();
            hashMap.put(C3125af.C3126a.EVENT_TYPE_REGULAR, C3229e.class);
            hashMap.put(C3125af.C3126a.EVENT_TYPE_SEND_REFERRER, C3235k.class);
            hashMap.put(C3125af.C3126a.EVENT_TYPE_ALIVE, C3231g.class);
            hashMap.put(C3125af.C3126a.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH, C3234j.class);
            hashMap.put(C3125af.C3126a.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH, C3234j.class);
            hashMap.put(C3125af.C3126a.EVENT_TYPE_EXCEPTION_USER, C3229e.class);
            hashMap.put(C3125af.C3126a.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, C3230f.class);
            hashMap.put(C3125af.C3126a.EVENT_TYPE_IDENTITY, C3233i.class);
            hashMap.put(C3125af.C3126a.EVENT_TYPE_STATBOX, C3229e.class);
            hashMap.put(C3125af.C3126a.EVENT_TYPE_SET_USER_INFO, C3229e.class);
            hashMap.put(C3125af.C3126a.EVENT_TYPE_REPORT_USER_INFO, C3229e.class);
            hashMap.put(C3125af.C3126a.EVENT_TYPE_EXCEPTION_UNHANDLED, C3229e.class);
            hashMap.put(C3125af.C3126a.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, C3230f.class);
            hashMap.put(C3125af.C3126a.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT, C3230f.class);
            hashMap.put(C3125af.C3126a.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, C3230f.class);
            hashMap.put(C3125af.C3126a.EVENT_TYPE_ANR, C3230f.class);
            hashMap.put(C3125af.C3126a.EVENT_TYPE_START, C3231g.class);
            hashMap.put(C3125af.C3126a.EVENT_TYPE_CUSTOM_EVENT, C3228d.class);
            hashMap.put(C3125af.C3126a.EVENT_TYPE_APP_OPEN, C3229e.class);
            hashMap.put(C3125af.C3126a.EVENT_TYPE_PERMISSIONS, C3225a.class);
            hashMap.put(C3125af.C3126a.EVENT_TYPE_APP_FEATURES, C3225a.class);
            hashMap.put(C3125af.C3126a.EVENT_TYPE_SEND_USER_PROFILE, C3226b.class);
            hashMap.put(C3125af.C3126a.EVENT_TYPE_SEND_REVENUE_EVENT, C3226b.class);
            f2767u = Collections.unmodifiableMap(hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put(C3125af.C3126a.EVENT_TYPE_INIT, 1);
            hashMap2.put(C3125af.C3126a.EVENT_TYPE_REGULAR, 4);
            hashMap2.put(C3125af.C3126a.EVENT_TYPE_SEND_REFERRER, 5);
            hashMap2.put(C3125af.C3126a.EVENT_TYPE_ALIVE, 7);
            hashMap2.put(C3125af.C3126a.EVENT_TYPE_EXCEPTION_UNHANDLED, 3);
            hashMap2.put(C3125af.C3126a.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, 26);
            hashMap2.put(C3125af.C3126a.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT, 26);
            hashMap2.put(C3125af.C3126a.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, 26);
            hashMap2.put(C3125af.C3126a.EVENT_TYPE_ANR, 25);
            hashMap2.put(C3125af.C3126a.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH, 3);
            hashMap2.put(C3125af.C3126a.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH, 3);
            hashMap2.put(C3125af.C3126a.EVENT_TYPE_EXCEPTION_USER, 6);
            hashMap2.put(C3125af.C3126a.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, 27);
            hashMap2.put(C3125af.C3126a.EVENT_TYPE_IDENTITY, 8);
            hashMap2.put(C3125af.C3126a.EVENT_TYPE_IDENTITY_LIGHT, 28);
            hashMap2.put(C3125af.C3126a.EVENT_TYPE_STATBOX, 11);
            hashMap2.put(C3125af.C3126a.EVENT_TYPE_SET_USER_INFO, 12);
            hashMap2.put(C3125af.C3126a.EVENT_TYPE_REPORT_USER_INFO, 12);
            hashMap2.put(C3125af.C3126a.EVENT_TYPE_FIRST_ACTIVATION, 13);
            hashMap2.put(C3125af.C3126a.EVENT_TYPE_START, 2);
            hashMap2.put(C3125af.C3126a.EVENT_TYPE_APP_OPEN, 16);
            hashMap2.put(C3125af.C3126a.EVENT_TYPE_APP_UPDATE, 17);
            hashMap2.put(C3125af.C3126a.EVENT_TYPE_PERMISSIONS, 18);
            hashMap2.put(C3125af.C3126a.EVENT_TYPE_APP_FEATURES, 19);
            hashMap2.put(C3125af.C3126a.EVENT_TYPE_SEND_USER_PROFILE, 20);
            hashMap2.put(C3125af.C3126a.EVENT_TYPE_SEND_REVENUE_EVENT, 21);
            hashMap2.put(C3125af.C3126a.EVENT_TYPE_CLEANUP, 29);
            f2768v = Collections.unmodifiableMap(hashMap2);
        }

        /* renamed from: a */
        static C3227c m2436a(int i, boolean z) {
            C3227c cVar;
            C3125af.C3126a a = C3125af.C3126a.m1967a(i);
            Class<?> a2 = m2437a(a, z);
            Integer num = f2768v.get(a);
            try {
                cVar = (C3227c) a2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused) {
                cVar = new C3227c();
            }
            return cVar.mo39709a(num);
        }

        /* renamed from: a */
        private static Class<?> m2437a(C3125af.C3126a aVar, boolean z) {
            int i = C32241.f2766a[aVar.ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                return f2767u.get(aVar);
            }
            if (z) {
                return C3229e.class;
            }
            return C3232h.class;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C3227c mo39710a(String str) {
            this.f2769a = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C3227c mo39713b(String str) {
            this.f2770b = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C3227c mo39705a(int i) {
            this.f2771c = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C3227c mo39711b(int i) {
            this.f2772d = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C3227c mo39714c(int i) {
            this.f2773e = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C3227c mo39706a(long j) {
            this.f2774f = j;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C3227c mo39715c(String str) {
            this.f2775g = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C3227c mo39718d(String str) {
            this.f2777i = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C3227c mo39721e(String str) {
            this.f2776h = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C3227c mo39709a(Integer num) {
            this.f2778j = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C3227c mo39724f(String str) {
            this.f2785q = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C3227c mo39712b(Integer num) {
            this.f2779k = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C3227c mo39725g(String str) {
            this.f2780l = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C3227c mo39726h(String str) {
            this.f2781m = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C3227c mo39717d(int i) {
            this.f2782n = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C3227c mo39720e(int i) {
            this.f2783o = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C3227c mo39727i(String str) {
            this.f2784p = str;
            return this;
        }

        /* renamed from: j */
        public C3227c mo39728j(String str) {
            this.f2786r = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C3227c mo39708a(C4247wz wzVar) {
            this.f2787s = wzVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C3227c mo39707a(C3134aj ajVar) {
            this.f2788t = ajVar;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo39703a() {
            return this.f2769a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public byte[] mo39704b() {
            String str = this.f2770b;
            return str == null ? new byte[0] : C3303cu.m2829c(str);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Integer mo39716c() {
            return this.f2778j;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public String mo39719d() {
            return this.f2780l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C3884rh.C3889c.C3895e.C3896a mo39722e() {
            C3884rh.C3889c.C3895e.C3896a aVar = new C3884rh.C3889c.C3895e.C3896a();
            C3884rh.C3889c.C3895e.C3896a.C3898b a = C3223bv.m2415a(this.f2783o, this.f2784p, this.f2777i, this.f2776h, this.f2785q);
            C3884rh.C3889c.C3891b d = C3223bv.m2431d(this.f2775g);
            C3884rh.C3889c.C3895e.C3896a.C3897a f = C3223bv.m2433f(this.f2781m);
            if (a != null) {
                aVar.f4329h = a;
            }
            if (d != null) {
                aVar.f4328g = d;
            }
            if (mo39703a() != null) {
                aVar.f4326e = mo39703a();
            }
            if (mo39704b() != null) {
                aVar.f4327f = mo39704b();
            }
            if (mo39719d() != null) {
                aVar.f4330i = mo39719d();
            }
            if (f != null) {
                aVar.f4331j = f;
            }
            aVar.f4325d = mo39716c().intValue();
            aVar.f4323b = (long) this.f2771c;
            aVar.f4337p = (long) this.f2772d;
            aVar.f4338q = (long) this.f2773e;
            aVar.f4324c = this.f2774f;
            aVar.f4332k = this.f2782n;
            aVar.f4333l = mo39723f();
            aVar.f4334m = C3223bv.m2432e(this.f2775g);
            String str = this.f2786r;
            aVar.f4335n = str == null ? new byte[0] : str.getBytes();
            Integer num = (Integer) C3223bv.f2765c.get(this.f2788t);
            if (num != null) {
                aVar.f4336o = num.intValue();
            }
            return aVar;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.bv$1 */
    static /* synthetic */ class C32241 {

        /* renamed from: a */
        static final /* synthetic */ int[] f2766a = new int[C3125af.C3126a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.yandex.metrica.impl.ob.af$a[] r0 = com.yandex.metrica.impl.p039ob.C3125af.C3126a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2766a = r0
                int[] r0 = f2766a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.yandex.metrica.impl.ob.af$a r1 = com.yandex.metrica.impl.p039ob.C3125af.C3126a.EVENT_TYPE_INIT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f2766a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.yandex.metrica.impl.ob.af$a r1 = com.yandex.metrica.impl.p039ob.C3125af.C3126a.EVENT_TYPE_FIRST_ACTIVATION     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f2766a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.yandex.metrica.impl.ob.af$a r1 = com.yandex.metrica.impl.p039ob.C3125af.C3126a.EVENT_TYPE_APP_UPDATE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3223bv.C32241.<clinit>():void");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.bv$g */
    static class C3231g extends C3227c {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo39703a() {
            return "";
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public byte[] mo39704b() {
            return new byte[0];
        }

        C3231g() {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.bv$e */
    static class C3229e extends C3227c {

        /* renamed from: u */
        private C4246wy f2789u;

        C3229e() {
            this(new C4246wy(C3136al.m1993a().mo39487b()));
        }

        C3229e(C4246wy wyVar) {
            this.f2789u = wyVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public byte[] mo39704b() {
            return this.f2789u.mo41794a(this.f2787s).mo41787a(super.mo39704b());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.bv$f */
    static class C3230f extends C3227c {

        /* renamed from: u */
        private C4246wy f2790u;

        C3230f() {
            this(new C4246wy(C3136al.m1993a().mo39487b()));
        }

        C3230f(C4246wy wyVar) {
            this.f2790u = wyVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public byte[] mo39704b() {
            return this.f2790u.mo41794a(this.f2787s).mo41787a(Base64.decode(super.mo39704b(), 0));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.bv$k */
    static class C3235k extends C3227c {
        C3235k() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public byte[] mo39704b() {
            try {
                C4034sj a = C4034sj.m5220a(Base64.decode(this.f2770b, 0));
                C3904ri riVar = new C3904ri();
                riVar.f4368b = a.f4752a == null ? new byte[0] : a.f4752a.getBytes();
                riVar.f4370d = a.f4753b;
                riVar.f4369c = a.f4754c;
                return C3365e.m3064a((C3365e) riVar);
            } catch (C3318d unused) {
                return new byte[0];
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.bv$b */
    static class C3226b extends C3227c {
        C3226b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public byte[] mo39704b() {
            return Base64.decode(this.f2770b, 0);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.bv$d */
    static class C3228d extends C3229e {
        C3228d() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Integer mo39716c() {
            return this.f2779k;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.bv$a */
    static class C3225a extends C3229e {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo39703a() {
            return "";
        }

        C3225a() {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.bv$h */
    static class C3232h extends C3227c {
        /* access modifiers changed from: protected */
        /* renamed from: b */
        public byte[] mo39704b() {
            return new byte[0];
        }

        C3232h() {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.bv$j */
    static class C3234j extends C3227c {
        C3234j() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public byte[] mo39704b() {
            return C3303cu.m2829c(C3137am.m2027c(this.f2770b));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.bv$i */
    static class C3233i extends C3229e {
        C3233i() {
        }

        /* renamed from: f */
        public int mo39723f() {
            return this.f2787s == C4247wz.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER ? 1 : 0;
        }
    }
}
