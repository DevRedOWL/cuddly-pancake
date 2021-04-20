package com.yandex.metrica.impl.p039ob;

import android.os.Bundle;
import android.text.TextUtils;
import com.yandex.metrica.IParamsCallback;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ui */
public class C4141ui {

    /* renamed from: a */
    private final Map<String, String> f5075a = new HashMap();

    /* renamed from: b */
    private List<String> f5076b;

    /* renamed from: c */
    private Map<String, String> f5077c;

    /* renamed from: d */
    private long f5078d;

    /* renamed from: e */
    private final C3687lv f5079e;

    public C4141ui(C3687lv lvVar) {
        this.f5079e = lvVar;
        Map<String, String> map = null;
        m5604a("yandex_mobile_metrica_device_id", this.f5079e.mo40494b((String) null));
        m5604a("appmetrica_device_id_hash", this.f5079e.mo40498c((String) null));
        m5604a("yandex_mobile_metrica_uuid", this.f5079e.mo40492a((String) null));
        m5604a("yandex_mobile_metrica_get_ad_url", this.f5079e.mo40500d((String) null));
        m5604a("yandex_mobile_metrica_report_ad_url", this.f5079e.mo40503e((String) null));
        m5608b(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, this.f5079e.mo40507f((String) null));
        this.f5076b = this.f5079e.mo40495b();
        String p = this.f5079e.mo40518p((String) null);
        this.f5077c = p != null ? C4225we.m6009a(p) : map;
        this.f5078d = this.f5079e.mo40489a(0);
        m5614g();
    }

    /* renamed from: a */
    public void mo41553a(Map<String, String> map) {
        HashMap hashMap;
        if (!C3306cx.m2859a((Object) map, (Object) this.f5077c)) {
            if (map == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(map);
            }
            this.f5077c = hashMap;
            this.f5075a.remove(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS);
            m5614g();
        }
    }

    /* renamed from: a */
    public boolean mo41554a() {
        String str = this.f5075a.get(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS);
        if (str != null && str.isEmpty()) {
            return C3306cx.m2862a((Map) this.f5077c);
        }
        return true;
    }

    /* renamed from: a */
    private void m5604a(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.f5075a.put(str, str2);
        }
    }

    /* renamed from: b */
    private void m5608b(String str, String str2) {
        if (str2 != null) {
            this.f5075a.put(str, str2);
        }
    }

    /* renamed from: a */
    private void m5603a(String str) {
        if (TextUtils.isEmpty(this.f5075a.get("yandex_mobile_metrica_uuid")) && !TextUtils.isEmpty(str)) {
            m5604a("yandex_mobile_metrica_uuid", str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo41552a(List<String> list, Map<String, String> map) {
        for (String next : list) {
            String str = this.f5075a.get(next);
            if (str != null) {
                map.put(next, str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized boolean mo41557b() {
        return mo41555a((List<String>) Arrays.asList(new String[]{IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, "appmetrica_device_id_hash", "yandex_mobile_metrica_device_id", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url", "yandex_mobile_metrica_uuid"}));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo41555a(java.util.List<java.lang.String> r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0062 }
        L_0x0005:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x005f
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = "yandex_mobile_metrica_clids"
            boolean r1 = r1.equals(r0)     // Catch:{ all -> 0x0062 }
            r2 = 0
            if (r1 == 0) goto L_0x0034
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.f5075a     // Catch:{ all -> 0x0062 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x0032
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x0005
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.f5077c     // Catch:{ all -> 0x0062 }
            boolean r0 = com.yandex.metrica.impl.p039ob.C3306cx.m2862a((java.util.Map) r0)     // Catch:{ all -> 0x0062 }
            if (r0 != 0) goto L_0x0005
        L_0x0032:
            monitor-exit(r3)
            return r2
        L_0x0034:
            java.lang.String r1 = "yandex_mobile_metrica_get_ad_url"
            boolean r1 = r1.equals(r0)     // Catch:{ all -> 0x0062 }
            if (r1 != 0) goto L_0x0055
            java.lang.String r1 = "yandex_mobile_metrica_report_ad_url"
            boolean r1 = r1.equals(r0)     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x0045
            goto L_0x0055
        L_0x0045:
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.f5075a     // Catch:{ all -> 0x0062 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0062 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ all -> 0x0062 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x0005
            monitor-exit(r3)
            return r2
        L_0x0055:
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.f5075a     // Catch:{ all -> 0x0062 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0062 }
            if (r0 != 0) goto L_0x0005
            monitor-exit(r3)
            return r2
        L_0x005f:
            r4 = 1
            monitor-exit(r3)
            return r4
        L_0x0062:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C4141ui.mo41555a(java.util.List):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo41551a(Bundle bundle) {
        m5612e(bundle);
        m5613f(bundle);
        m5611d(bundle);
        m5606b(bundle);
        m5614g();
    }

    /* renamed from: g */
    private void m5614g() {
        this.f5079e.mo40509g(this.f5075a.get("yandex_mobile_metrica_uuid")).mo40510h(this.f5075a.get("yandex_mobile_metrica_device_id")).mo40511i(this.f5075a.get("appmetrica_device_id_hash")).mo40512j(this.f5075a.get("yandex_mobile_metrica_get_ad_url")).mo40513k(this.f5075a.get("yandex_mobile_metrica_report_ad_url")).mo40499d(this.f5078d).mo40514l(this.f5075a.get(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS)).mo40517o(C4225we.m6008a(this.f5077c)).mo40567q();
    }

    /* renamed from: b */
    private void m5606b(Bundle bundle) {
        if (m5610c(bundle)) {
            this.f5075a.put(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, bundle.getString("Clids"));
        }
    }

    /* renamed from: c */
    private boolean m5610c(Bundle bundle) {
        Map<String, String> a = C4225we.m6009a(bundle.getString("RequestClids"));
        if (C3306cx.m2862a((Map) this.f5077c)) {
            return C3306cx.m2862a((Map) a);
        }
        return this.f5077c.equals(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41550a(long j) {
        this.f5079e.mo40502e(j).mo40567q();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo41558c() {
        long b = C4229wi.m6029b() - this.f5079e.mo40493b(0);
        return b > 86400 || b < 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public List<String> mo41559d() {
        return this.f5076b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo41556b(List<String> list) {
        this.f5076b = list;
        this.f5079e.mo40490a(this.f5076b);
    }

    /* renamed from: d */
    private void m5611d(Bundle bundle) {
        m5605b(bundle.getLong("ServerTimeOffset"));
    }

    /* renamed from: e */
    private synchronized void m5612e(Bundle bundle) {
        m5603a(bundle.getString("Uuid"));
        m5604a("yandex_mobile_metrica_device_id", bundle.getString("DeviceId"));
        m5604a("appmetrica_device_id_hash", bundle.getString("DeviceIdHash"));
    }

    /* renamed from: f */
    private synchronized void m5613f(Bundle bundle) {
        String string = bundle.getString("AdUrlGet");
        if (string != null) {
            m5607b(string);
        }
        String string2 = bundle.getString("AdUrlReport");
        if (string2 != null) {
            m5609c(string2);
        }
    }

    /* renamed from: b */
    private synchronized void m5607b(String str) {
        this.f5075a.put("yandex_mobile_metrica_get_ad_url", str);
    }

    /* renamed from: c */
    private synchronized void m5609c(String str) {
        this.f5075a.put("yandex_mobile_metrica_report_ad_url", str);
    }

    /* renamed from: b */
    private synchronized void m5605b(long j) {
        this.f5078d = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo41560e() {
        return this.f5075a.get("yandex_mobile_metrica_uuid");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo41561f() {
        return this.f5075a.get("yandex_mobile_metrica_device_id");
    }
}
