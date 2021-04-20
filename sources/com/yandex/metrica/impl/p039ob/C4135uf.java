package com.yandex.metrica.impl.p039ob;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.IParamsCallback;
import com.yandex.metrica.impl.p039ob.C4248x;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.yandex.metrica.impl.ob.uf */
public class C4135uf implements C4139ug {

    /* renamed from: a */
    static final Map<C4134ue, IParamsCallback.Reason> f5062a = Collections.unmodifiableMap(new HashMap<C4134ue, IParamsCallback.Reason>() {
        {
            put(C4134ue.UNKNOWN, IParamsCallback.Reason.UNKNOWN);
            put(C4134ue.NETWORK, IParamsCallback.Reason.NETWORK);
            put(C4134ue.PARSE, IParamsCallback.Reason.INVALID_RESPONSE);
        }
    });

    /* renamed from: b */
    private final List<String> f5063b;

    /* renamed from: c */
    private final C3251cd f5064c;

    /* renamed from: d */
    private final C4141ui f5065d;

    /* renamed from: e */
    private final Handler f5066e;

    /* renamed from: f */
    private C4216vz f5067f;

    /* renamed from: g */
    private final C4248x.C4249a f5068g;

    /* renamed from: h */
    private final Object f5069h;

    /* renamed from: i */
    private final Map<C4124tx, List<String>> f5070i;

    /* renamed from: j */
    private Map<String, String> f5071j;

    public C4135uf(C3251cd cdVar, C3687lv lvVar, Handler handler) {
        this(cdVar, new C4141ui(lvVar), handler);
    }

    C4135uf(C3251cd cdVar, C4141ui uiVar, Handler handler) {
        this.f5063b = Arrays.asList(new String[]{"yandex_mobile_metrica_uuid", "yandex_mobile_metrica_device_id", "appmetrica_device_id_hash", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url", IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS});
        this.f5069h = new Object();
        this.f5070i = new WeakHashMap();
        this.f5064c = cdVar;
        this.f5065d = uiVar;
        this.f5066e = handler;
        this.f5068g = new C4248x.C4249a() {
            /* renamed from: a */
            public void mo39880a(int i, Bundle bundle) {
            }
        };
    }

    /* renamed from: a */
    public String mo41540a() {
        return this.f5065d.mo41560e();
    }

    /* renamed from: b */
    public String mo41548b() {
        return this.f5065d.mo41561f();
    }

    /* renamed from: a */
    public void mo41543a(IIdentifierCallback iIdentifierCallback, List<String> list, Map<String, String> map) {
        m5580a((C4124tx) new C4117tu(iIdentifierCallback), list, map);
    }

    /* renamed from: a */
    private void m5580a(final C4124tx txVar, List<String> list, Map<String, String> map) {
        synchronized (this.f5069h) {
            this.f5065d.mo41553a(map);
            m5585b(txVar, list);
            if (!this.f5065d.mo41558c()) {
                if (this.f5065d.mo41555a(list)) {
                    m5576a(txVar);
                }
            }
            m5581a(list, (C4248x.C4249a) new C4248x.C4249a() {
                /* renamed from: a */
                public void mo39880a(int i, Bundle bundle) {
                    C4135uf.this.mo41542a(i, bundle, txVar);
                }
            }, map);
        }
    }

    /* renamed from: a */
    public void mo41541a(int i, Bundle bundle) {
        mo41542a(i, bundle, (C4124tx) null);
    }

    /* renamed from: a */
    public void mo41542a(int i, Bundle bundle, C4124tx txVar) {
        synchronized (this.f5069h) {
            m5575a(bundle, i);
            m5587d();
            if (txVar != null) {
                m5577a(txVar, bundle);
            }
        }
    }

    /* renamed from: a */
    public void mo41544a(C4216vz vzVar) {
        this.f5067f = vzVar;
    }

    /* renamed from: b */
    private void m5586b(Map<String, String> map) {
        m5582a(this.f5063b, map);
    }

    /* renamed from: a */
    private void m5582a(List<String> list, Map<String, String> map) {
        m5581a(list, this.f5068g, map);
    }

    /* renamed from: a */
    private void m5581a(List<String> list, C4248x.C4249a aVar, Map<String, String> map) {
        this.f5064c.mo39782a(list, (ResultReceiver) new C4248x(this.f5066e, aVar), map);
    }

    /* renamed from: a */
    private void m5575a(Bundle bundle, int i) {
        this.f5065d.mo41551a(bundle);
        if (i == 1) {
            this.f5065d.mo41550a(C4229wi.m6029b());
        }
        m5587d();
    }

    /* renamed from: c */
    public void mo41549c() {
        synchronized (this.f5069h) {
            if (!this.f5065d.mo41557b() || this.f5065d.mo41558c()) {
                m5586b(this.f5071j);
            }
        }
    }

    /* renamed from: a */
    public void mo41546a(List<String> list) {
        synchronized (this.f5069h) {
            List<String> d = this.f5065d.mo41559d();
            if (C3306cx.m2861a((Collection) list)) {
                if (!C3306cx.m2861a((Collection) d)) {
                    this.f5065d.mo41556b((List<String>) null);
                    this.f5064c.mo39781a((List<String>) null);
                }
            } else if (!C3306cx.m2859a((Object) list, (Object) d)) {
                this.f5065d.mo41556b(list);
                this.f5064c.mo39781a(list);
            } else {
                this.f5064c.mo39781a(d);
            }
        }
    }

    /* renamed from: a */
    public void mo41547a(Map<String, String> map) {
        synchronized (this.f5069h) {
            Map<String, String> c = C4225we.m6012c(map);
            this.f5071j = c;
            this.f5064c.mo39783a(c);
            this.f5065d.mo41553a(c);
        }
    }

    /* renamed from: a */
    public void mo41545a(String str) {
        synchronized (this.f5069h) {
            this.f5064c.mo39787b(str);
        }
    }

    /* renamed from: a */
    private void m5576a(C4124tx txVar) {
        m5577a(txVar, new Bundle());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.yandex.metrica.IParamsCallback$Reason} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5577a(com.yandex.metrica.impl.p039ob.C4124tx r6, android.os.Bundle r7) {
        /*
            r5 = this;
            java.util.Map<com.yandex.metrica.impl.ob.tx, java.util.List<java.lang.String>> r0 = r5.f5070i
            boolean r0 = r0.containsKey(r6)
            if (r0 == 0) goto L_0x0054
            java.util.Map<com.yandex.metrica.impl.ob.tx, java.util.List<java.lang.String>> r0 = r5.f5070i
            java.lang.Object r0 = r0.get(r6)
            java.util.List r0 = (java.util.List) r0
            com.yandex.metrica.impl.ob.ui r1 = r5.f5065d
            boolean r1 = r1.mo41555a((java.util.List<java.lang.String>) r0)
            if (r1 == 0) goto L_0x001c
            r5.m5578a((com.yandex.metrica.impl.p039ob.C4124tx) r6, (java.util.List<java.lang.String>) r0)
            goto L_0x0051
        L_0x001c:
            com.yandex.metrica.impl.ob.ue r7 = com.yandex.metrica.impl.p039ob.C4134ue.m5572b(r7)
            r1 = 0
            if (r7 != 0) goto L_0x0041
            com.yandex.metrica.impl.ob.ui r2 = r5.f5065d
            boolean r2 = r2.mo41554a()
            if (r2 != 0) goto L_0x003f
            com.yandex.metrica.impl.ob.vz r1 = r5.f5067f
            if (r1 == 0) goto L_0x003c
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.util.Map<java.lang.String, java.lang.String> r4 = r5.f5071j
            r2[r3] = r4
            java.lang.String r3 = "Clids error. Passed clids: %s, and clids from server are empty."
            r1.mo41685b(r3, r2)
        L_0x003c:
            com.yandex.metrica.IParamsCallback$Reason r1 = com.yandex.metrica.IParamsCallback.Reason.INCONSISTENT_CLIDS
            goto L_0x0041
        L_0x003f:
            com.yandex.metrica.impl.ob.ue r7 = com.yandex.metrica.impl.p039ob.C4134ue.UNKNOWN
        L_0x0041:
            if (r1 != 0) goto L_0x004e
            java.util.Map<com.yandex.metrica.impl.ob.ue, com.yandex.metrica.IParamsCallback$Reason> r1 = f5062a
            com.yandex.metrica.IParamsCallback$Reason r2 = com.yandex.metrica.IParamsCallback.Reason.UNKNOWN
            java.lang.Object r7 = com.yandex.metrica.impl.p039ob.C3306cx.m2843a(r1, r7, r2)
            r1 = r7
            com.yandex.metrica.IParamsCallback$Reason r1 = (com.yandex.metrica.IParamsCallback.Reason) r1
        L_0x004e:
            r5.m5579a((com.yandex.metrica.impl.p039ob.C4124tx) r6, (java.util.List<java.lang.String>) r0, (com.yandex.metrica.IParamsCallback.Reason) r1)
        L_0x0051:
            r5.m5584b((com.yandex.metrica.impl.p039ob.C4124tx) r6)
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C4135uf.m5577a(com.yandex.metrica.impl.ob.tx, android.os.Bundle):void");
    }

    /* renamed from: a */
    private void m5578a(C4124tx txVar, List<String> list) {
        txVar.mo41503a(m5583b(list));
    }

    /* renamed from: a */
    private void m5579a(C4124tx txVar, List<String> list, IParamsCallback.Reason reason) {
        txVar.mo41502a(reason, m5583b(list));
    }

    /* renamed from: d */
    private void m5587d() {
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry next : this.f5070i.entrySet()) {
            if (this.f5065d.mo41555a((List<String>) (List) next.getValue())) {
                weakHashMap.put(next.getKey(), next.getValue());
            }
        }
        for (Map.Entry key : weakHashMap.entrySet()) {
            C4124tx txVar = (C4124tx) key.getKey();
            if (txVar != null) {
                m5576a(txVar);
            }
        }
        weakHashMap.clear();
    }

    /* renamed from: b */
    private Map<String, String> m5583b(List<String> list) {
        if (list == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        this.f5065d.mo41552a(list, (Map<String, String>) hashMap);
        return hashMap;
    }

    /* renamed from: b */
    private void m5585b(C4124tx txVar, List<String> list) {
        if (this.f5070i.isEmpty()) {
            this.f5064c.mo39789c();
        }
        this.f5070i.put(txVar, list);
    }

    /* renamed from: b */
    private void m5584b(C4124tx txVar) {
        this.f5070i.remove(txVar);
        if (this.f5070i.isEmpty()) {
            this.f5064c.mo39790d();
        }
    }
}
