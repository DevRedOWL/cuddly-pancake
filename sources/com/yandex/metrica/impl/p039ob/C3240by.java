package com.yandex.metrica.impl.p039ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.yandex.metrica.impl.p039ob.C3223bv;
import com.yandex.metrica.impl.p039ob.C3512i;
import com.yandex.metrica.impl.p039ob.C3884rh;
import com.yandex.metrica.impl.p039ob.C4204vq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardFragment;

/* renamed from: com.yandex.metrica.impl.ob.by */
class C3240by extends C3209bp<C4064sz> {

    /* renamed from: j */
    C3884rh.C3889c f2800j;

    /* renamed from: k */
    C3621kz f2801k;

    /* renamed from: l */
    List<Long> f2802l;

    /* renamed from: m */
    int f2803m;

    /* renamed from: n */
    int f2804n;

    /* renamed from: o */
    private final C3391en f2805o;

    /* renamed from: p */
    private final Map<String, String> f2806p;

    /* renamed from: q */
    private C4049sr f2807q;

    /* renamed from: r */
    private C3244c f2808r;

    /* renamed from: s */
    private final C4280yb<byte[]> f2809s;

    /* renamed from: t */
    private final C4216vz f2810t;

    /* renamed from: u */
    private C4051st f2811u;

    /* renamed from: v */
    private final C3688lw f2812v;

    /* renamed from: w */
    private int f2813w;

    public C3240by(C3391en enVar) {
        this(enVar, enVar.mo40026j(), new C3688lw(C3628ld.m3815a(enVar.mo40027k()).mo40439b(enVar.mo39985b())));
    }

    C3240by(C3391en enVar, C3621kz kzVar, C3688lw lwVar) {
        this(enVar, kzVar, new C4064sz(), lwVar);
    }

    C3240by(C3391en enVar, C3621kz kzVar, C4064sz szVar, C3688lw lwVar) {
        super(szVar);
        this.f2806p = new LinkedHashMap();
        this.f2803m = 0;
        this.f2804n = -1;
        this.f2805o = enVar;
        this.f2801k = kzVar;
        this.f2810t = enVar.mo40028l();
        this.f2809s = new C4267xr(245760, "event value in ReportTask", this.f2810t);
        this.f2812v = lwVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo39654a(Uri.Builder builder) {
        ((C4064sz) this.f2727i).mo41413a(builder, this.f2811u);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39742a(ContentValues contentValues) {
        this.f2806p.clear();
        for (Map.Entry next : contentValues.valueSet()) {
            this.f2806p.put(next.getKey(), next.getValue().toString());
        }
        String asString = contentValues.getAsString("report_request_parameters");
        if (!TextUtils.isEmpty(asString)) {
            try {
                this.f2807q = new C4049sr(new C4204vq.C4205a(asString));
                ((C4064sz) this.f2727i).mo41418a(this.f2807q);
            } catch (Throwable unused) {
                m2492K();
            }
        } else {
            m2492K();
        }
    }

    /* renamed from: K */
    private void m2492K() {
        this.f2807q = new C4049sr();
        ((C4064sz) this.f2727i).mo41418a(this.f2807q);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C3884rh.C3889c mo39741a(C3244c cVar, C3884rh.C3889c.C3892c[] cVarArr, List<String> list) {
        C3884rh.C3889c cVar2 = new C3884rh.C3889c();
        C3884rh.C3889c.C3893d dVar = new C3884rh.C3889c.C3893d();
        dVar.f4301b = C4232wk.m6039a(this.f2807q.f4792b, this.f2811u.mo41310t());
        dVar.f4302c = C4232wk.m6039a(this.f2807q.f4791a, this.f2811u.mo41308r());
        this.f2803m += C3157b.m2105b(4, (C3365e) dVar);
        cVar2.f4280c = dVar;
        mo39743a(cVar2);
        cVar2.f4279b = (C3884rh.C3889c.C3895e[]) cVar.f2819a.toArray(new C3884rh.C3889c.C3895e[cVar.f2819a.size()]);
        cVar2.f4281d = m2497a(cVar.f2821c);
        cVar2.f4282e = cVarArr;
        cVar2.f4285h = (String[]) list.toArray(new String[list.size()]);
        this.f2803m += C3157b.m2125h(8);
        return cVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39743a(final C3884rh.C3889c cVar) {
        C3136al.m1993a().mo39496k().mo41617a((C4194vg) new C4194vg() {
            /* renamed from: a */
            public void mo39414a(C4193vf vfVar) {
                m2519b(vfVar, cVar);
                m2518a(vfVar, cVar);
            }

            /* renamed from: a */
            private void m2518a(C4193vf vfVar, C3884rh.C3889c cVar) {
                List<C4185vb> a = vfVar.mo41674a();
                if (!C3306cx.m2861a((Collection) a)) {
                    cVar.f4284g = new C3884rh.C3889c.C3901f[a.size()];
                    for (int i = 0; i < a.size(); i++) {
                        cVar.f4284g[i] = C3223bv.m2417a(a.get(i));
                        C3240by.this.f2803m += C3157b.m2109b((C3365e) cVar.f4284g[i]);
                        C3240by.this.f2803m += C3157b.m2125h(10);
                    }
                }
            }

            /* renamed from: b */
            private void m2519b(C4193vf vfVar, C3884rh.C3889c cVar) {
                List<String> c = vfVar.mo41676c();
                if (!C3306cx.m2861a((Collection) c)) {
                    cVar.f4283f = new String[c.size()];
                    for (int i = 0; i < c.size(); i++) {
                        String str = c.get(i);
                        if (!TextUtils.isEmpty(str)) {
                            cVar.f4283f[i] = str;
                            C3240by.this.f2803m += C3157b.m2110b(cVar.f4283f[i]);
                            C3240by.this.f2803m += C3157b.m2125h(9);
                        }
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public boolean mo39664a() {
        List<ContentValues> d = this.f2805o.mo40026j().mo40413d();
        if (d.isEmpty()) {
            return false;
        }
        mo39742a(d.get(0));
        this.f2811u = this.f2805o.mo40025i();
        List<String> Y = this.f2811u.mo41351Y();
        if (Y.isEmpty()) {
            return false;
        }
        mo39660a(this.f2811u.mo41361b());
        if (!this.f2811u.mo41338L() || C3306cx.m2861a((Collection) mo39684s())) {
            return false;
        }
        this.f2802l = null;
        C3884rh.C3889c.C3892c[] G = mo39736G();
        this.f2808r = mo39737H();
        if (this.f2808r.f2819a.isEmpty()) {
            return false;
        }
        this.f2813w = this.f2812v.mo40549l() + 1;
        ((C4064sz) this.f2727i).mo41416a(this.f2813w);
        this.f2800j = mo39741a(this.f2808r, G, Y);
        this.f2802l = this.f2808r.f2820b;
        mo39694c(C3365e.m3064a((C3365e) this.f2800j));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public C3884rh.C3889c.C3892c[] mo39736G() {
        C3884rh.C3889c.C3892c[] a = C3223bv.m2424a(this.f2805o.mo40027k());
        if (a != null) {
            int length = a.length;
            for (int i = 0; i < length; i++) {
                this.f2803m += C3157b.m2109b((C3365e) a[i]);
            }
        }
        return a;
    }

    /* renamed from: a */
    private C3884rh.C3889c.C3890a[] m2497a(JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length <= 0) {
            return null;
        }
        C3884rh.C3889c.C3890a[] aVarArr = new C3884rh.C3889c.C3890a[length];
        Iterator<String> keys = jSONObject.keys();
        int i = 0;
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                C3884rh.C3889c.C3890a aVar = new C3884rh.C3889c.C3890a();
                aVar.f4287b = next;
                aVar.f4288c = jSONObject.getString(next);
                aVarArr[i] = aVar;
            } catch (Throwable unused) {
            }
            i++;
        }
        return aVarArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo39693F() {
        m2499b(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo39692E() {
        m2499b(false);
    }

    /* renamed from: b */
    private void m2499b(boolean z) {
        m2493L();
        C3884rh.C3889c.C3895e[] eVarArr = this.f2800j.f4279b;
        for (int i = 0; i < eVarArr.length; i++) {
            C3884rh.C3889c.C3895e eVar = eVarArr[i];
            this.f2801k.mo40402a(this.f2802l.get(i).longValue(), C3223bv.m2414a(eVar.f4320c.f4351d).mo40305a(), eVar.f4321d.length, z);
            C3223bv.m2423a(eVar);
        }
        this.f2801k.mo40397a(this.f2805o.mo40020d().mo40275a());
    }

    /* renamed from: L */
    private void m2493L() {
        this.f2812v.mo40539e(this.f2813w);
    }

    /* renamed from: t */
    public boolean mo39685t() {
        return super.mo39685t() & (400 != mo39676k());
    }

    /* renamed from: f */
    public void mo39671f() {
        if (mo39689x()) {
            m2494M();
        }
        this.f2808r = null;
    }

    /* renamed from: M */
    private void m2494M() {
        if (this.f2810t.mo41688c()) {
            for (int i = 0; i < this.f2808r.f2819a.size(); i++) {
                this.f2810t.mo41720a(this.f2808r.f2819a.get(i), "Event sent");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0093 */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0099 A[EDGE_INSN: B:30:0x0099->B:25:0x0099 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0014 A[SYNTHETIC] */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.metrica.impl.p039ob.C3240by.C3244c mo39737H() {
        /*
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r3 = 0
            android.database.Cursor r4 = r12.mo39738I()     // Catch:{ all -> 0x0098 }
        L_0x0014:
            boolean r5 = r4.moveToNext()     // Catch:{ all -> 0x0099 }
            if (r5 == 0) goto L_0x0099
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0099 }
            r5.<init>()     // Catch:{ all -> 0x0099 }
            com.yandex.metrica.impl.p039ob.C4199vl.m5870a((android.database.Cursor) r4, (android.content.ContentValues) r5)     // Catch:{ all -> 0x0099 }
            java.lang.String r6 = "id"
            java.lang.Long r6 = r5.getAsLong(r6)     // Catch:{ all -> 0x0099 }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0099 }
            java.lang.String r8 = "type"
            java.lang.Integer r8 = r5.getAsInteger(r8)     // Catch:{ all -> 0x0099 }
            com.yandex.metrica.impl.ob.jh r8 = com.yandex.metrica.impl.p039ob.C3557jh.m3616a(r8)     // Catch:{ all -> 0x0099 }
            com.yandex.metrica.impl.ob.rh$c$g r5 = com.yandex.metrica.impl.p039ob.C3223bv.m2419a((android.content.ContentValues) r5)     // Catch:{ all -> 0x0099 }
            int r8 = com.yandex.metrica.impl.p039ob.C3223bv.m2413a((com.yandex.metrica.impl.p039ob.C3557jh) r8)     // Catch:{ all -> 0x0099 }
            com.yandex.metrica.impl.ob.st r9 = r12.f2811u     // Catch:{ all -> 0x0099 }
            java.lang.String r9 = r9.mo41277A()     // Catch:{ all -> 0x0099 }
            com.yandex.metrica.impl.ob.rh$c$e$b r5 = com.yandex.metrica.impl.p039ob.C3223bv.m2416a((java.lang.String) r9, (int) r8, (com.yandex.metrica.impl.p039ob.C3884rh.C3889c.C3902g) r5)     // Catch:{ all -> 0x0099 }
            int r8 = r12.f2803m     // Catch:{ all -> 0x0099 }
            r9 = 1
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r9 = com.yandex.metrica.impl.p039ob.C3157b.m2115d((int) r9, (long) r10)     // Catch:{ all -> 0x0099 }
            int r8 = r8 + r9
            r12.f2803m = r8     // Catch:{ all -> 0x0099 }
            int r8 = r12.f2803m     // Catch:{ all -> 0x0099 }
            r9 = 2
            int r9 = com.yandex.metrica.impl.p039ob.C3157b.m2105b((int) r9, (com.yandex.metrica.impl.p039ob.C3365e) r5)     // Catch:{ all -> 0x0099 }
            int r8 = r8 + r9
            r12.f2803m = r8     // Catch:{ all -> 0x0099 }
            int r8 = r12.f2803m     // Catch:{ all -> 0x0099 }
            r9 = 250880(0x3d400, float:3.51558E-40)
            if (r8 < r9) goto L_0x0069
            goto L_0x0097
        L_0x0069:
            com.yandex.metrica.impl.ob.by$b r5 = r12.mo39740a((long) r6, (com.yandex.metrica.impl.p039ob.C3884rh.C3889c.C3895e.C3900b) r5)     // Catch:{ all -> 0x0099 }
            if (r5 == 0) goto L_0x0014
            if (r3 != 0) goto L_0x0074
            com.yandex.metrica.impl.ob.i$a r3 = r5.f2817b     // Catch:{ all -> 0x0099 }
            goto L_0x007d
        L_0x0074:
            com.yandex.metrica.impl.ob.i$a r8 = r5.f2817b     // Catch:{ all -> 0x0099 }
            boolean r8 = r3.equals(r8)     // Catch:{ all -> 0x0099 }
            if (r8 != 0) goto L_0x007d
            goto L_0x0097
        L_0x007d:
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0099 }
            r1.add(r6)     // Catch:{ all -> 0x0099 }
            com.yandex.metrica.impl.ob.rh$c$e r6 = r5.f2816a     // Catch:{ all -> 0x0099 }
            r0.add(r6)     // Catch:{ all -> 0x0099 }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ all -> 0x0093 }
            com.yandex.metrica.impl.ob.i$a r7 = r5.f2817b     // Catch:{ all -> 0x0093 }
            java.lang.String r7 = r7.f3369a     // Catch:{ all -> 0x0093 }
            r6.<init>(r7)     // Catch:{ all -> 0x0093 }
            r2 = r6
        L_0x0093:
            boolean r5 = r5.f2818c     // Catch:{ all -> 0x0099 }
            if (r5 == 0) goto L_0x0014
        L_0x0097:
            goto L_0x0099
        L_0x0098:
            r4 = r3
        L_0x0099:
            com.yandex.metrica.impl.p039ob.C3306cx.m2852a((android.database.Cursor) r4)
            com.yandex.metrica.impl.ob.by$c r3 = new com.yandex.metrica.impl.ob.by$c
            r3.<init>(r0, r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3240by.mo39737H():com.yandex.metrica.impl.ob.by$c");
    }

    /* renamed from: b */
    private C3512i.C3513a m2498b(ContentValues contentValues) {
        return new C3512i.C3513a(contentValues.getAsString("app_environment"), contentValues.getAsLong("app_environment_revision").longValue());
    }

    /* renamed from: a */
    private int m2495a(C3512i.C3513a aVar) {
        try {
            C3884rh.C3889c.C3890a[] a = m2497a(new JSONObject(aVar.f3369a));
            if (a == null) {
                return 0;
            }
            int i = 0;
            for (C3884rh.C3889c.C3890a b : a) {
                i += C3157b.m2105b(7, (C3365e) b);
            }
            return i;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3243b mo39740a(long j, C3884rh.C3889c.C3895e.C3900b bVar) {
        C3512i.C3513a aVar;
        Cursor cursor;
        C3884rh.C3889c.C3895e eVar = new C3884rh.C3889c.C3895e();
        eVar.f4319b = j;
        eVar.f4320c = bVar;
        boolean z = false;
        try {
            cursor = mo39739a(j, C3223bv.m2414a(bVar.f4351d));
            try {
                ArrayList arrayList = new ArrayList();
                aVar = null;
                while (true) {
                    try {
                        if (!cursor.moveToNext()) {
                            break;
                        }
                        ContentValues contentValues = new ContentValues();
                        C4199vl.m5870a(cursor, contentValues);
                        C3884rh.C3889c.C3895e.C3896a d = m2501d(contentValues);
                        if (d != null) {
                            C3512i.C3513a b = m2498b(contentValues);
                            if (aVar != null) {
                                if (!aVar.equals(b)) {
                                    z = true;
                                    break;
                                }
                            } else {
                                try {
                                    if (this.f2804n < 0) {
                                        this.f2804n = m2495a(b);
                                        this.f2803m += this.f2804n;
                                    }
                                    aVar = b;
                                } catch (Throwable unused) {
                                    aVar = b;
                                }
                            }
                            m2496a(d);
                            this.f2803m += C3157b.m2105b(3, (C3365e) d);
                            if (this.f2803m >= 250880) {
                                break;
                            }
                            arrayList.add(d);
                        }
                    } catch (Throwable unused2) {
                    }
                }
                if (arrayList.size() > 0) {
                    eVar.f4321d = (C3884rh.C3889c.C3895e.C3896a[]) arrayList.toArray(new C3884rh.C3889c.C3895e.C3896a[arrayList.size()]);
                    C3306cx.m2852a(cursor);
                    return new C3243b(eVar, aVar, z);
                }
                C3306cx.m2852a(cursor);
                return null;
            } catch (Throwable unused3) {
                aVar = null;
            }
        } catch (Throwable unused4) {
            cursor = null;
            aVar = null;
        }
    }

    /* renamed from: a */
    private void m2496a(C3884rh.C3889c.C3895e.C3896a aVar) {
        byte[] a = this.f2809s.mo41840a(aVar.f4327f);
        if (!aVar.f4327f.equals(a)) {
            aVar.f4327f = a;
            aVar.f4332k += aVar.f4327f.length - a.length;
        }
    }

    /* renamed from: c */
    private C3223bv.C3227c m2500c(ContentValues contentValues) {
        return C3223bv.C3227c.m2436a(contentValues.getAsInteger("type").intValue(), this.f2811u.mo41339M()).mo39712b(contentValues.getAsInteger("custom_type")).mo39710a(contentValues.getAsString("name")).mo39713b(contentValues.getAsString("value")).mo39706a(contentValues.getAsLong("time").longValue()).mo39705a(contentValues.getAsInteger(CardFragment.ARG_NUMBER).intValue()).mo39711b(contentValues.getAsInteger("global_number").intValue()).mo39714c(contentValues.getAsInteger("number_of_type").intValue()).mo39721e(contentValues.getAsString("cell_info")).mo39715c(contentValues.getAsString("location_info")).mo39718d(contentValues.getAsString("wifi_network_info")).mo39725g(contentValues.getAsString("error_environment")).mo39726h(contentValues.getAsString("user_info")).mo39717d(contentValues.getAsInteger("truncated").intValue()).mo39720e(contentValues.getAsInteger("connection_type").intValue()).mo39727i(contentValues.getAsString("cellular_connection_type")).mo39724f(contentValues.getAsString("wifi_access_point")).mo39728j(contentValues.getAsString("profile_id")).mo39708a(C4247wz.m6075a(contentValues.getAsInteger("encrypting_mode").intValue())).mo39707a(C3134aj.m1988a(contentValues.getAsInteger("first_occurrence_status")));
    }

    /* renamed from: d */
    private C3884rh.C3889c.C3895e.C3896a m2501d(ContentValues contentValues) {
        C3223bv.C3227c c = m2500c(contentValues);
        if (c.mo39716c() != null) {
            return c.mo39722e();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public Cursor mo39738I() {
        return this.f2801k.mo40400a(this.f2806p);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Cursor mo39739a(long j, C3557jh jhVar) {
        return this.f2801k.mo40399a(j, jhVar);
    }

    /* renamed from: C */
    public void mo39650C() {
        this.f2805o.mo40015C().mo40731c();
    }

    /* renamed from: D */
    public void mo39651D() {
        this.f2805o.mo40026j().mo40411c();
        this.f2805o.mo40015C().mo40730b();
        if (mo39689x()) {
            this.f2805o.mo40015C().mo40729a();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.by$c */
    static final class C3244c {

        /* renamed from: a */
        final List<C3884rh.C3889c.C3895e> f2819a;

        /* renamed from: b */
        final List<Long> f2820b;

        /* renamed from: c */
        final JSONObject f2821c;

        C3244c(List<C3884rh.C3889c.C3895e> list, List<Long> list2, JSONObject jSONObject) {
            this.f2819a = list;
            this.f2820b = list2;
            this.f2821c = jSONObject;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.by$b */
    static final class C3243b {

        /* renamed from: a */
        final C3884rh.C3889c.C3895e f2816a;

        /* renamed from: b */
        final C3512i.C3513a f2817b;

        /* renamed from: c */
        final boolean f2818c;

        C3243b(C3884rh.C3889c.C3895e eVar, C3512i.C3513a aVar, boolean z) {
            this.f2816a = eVar;
            this.f2817b = aVar;
            this.f2818c = z;
        }
    }

    /* renamed from: J */
    public static C3242a m2491J() {
        return new C3242a();
    }

    /* renamed from: com.yandex.metrica.impl.ob.by$a */
    static class C3242a {
        C3242a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C3240by mo39744a(C3391en enVar) {
            return new C3240by(enVar);
        }
    }
}
