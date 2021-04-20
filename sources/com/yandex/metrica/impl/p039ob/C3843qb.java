package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.qb */
public class C3843qb {

    /* renamed from: a */
    public static final Map<String, String> f4096a = Collections.unmodifiableMap(new HashMap<String, String>() {
        {
            put("20799a27-fa80-4b36-b2db-0f8141f24180", "13");
            put("01528cc0-dd34-494d-9218-24af1317e1ee", "17233");
            put("4e610cd2-753f-4bfc-9b05-772ce8905c5e", "21952");
            put("67bb016b-be40-4c08-a190-96a3f3b503d3", "22675");
            put("e4250327-8d3c-4d35-b9e8-3c1720a64b91", "22678");
            put("6c5f504e-8928-47b5-bfb5-73af8d8bf4b4", "30404");
            put("7d962ba4-a392-449a-a02d-6c5be5613928", "30407");
        }
    });

    /* renamed from: b */
    private C3845qc f4097b;

    public C3843qb(C3845qc qcVar) {
        this.f4097b = qcVar;
    }

    /* renamed from: a */
    public void mo40876a() {
        if (mo40883f()) {
            mo40884g();
            mo40885h();
        }
    }

    /* renamed from: b */
    public void mo40878b() {
        String d = mo40881d();
        if (m4542c(d)) {
            mo40877a(d);
        }
    }

    /* renamed from: c */
    private boolean m4542c(String str) {
        return !TextUtils.isEmpty(str) && "DONE".equals(this.f4097b.mo40897g().get(C3845qc.m4554f(str)));
    }

    /* renamed from: c */
    public void mo40880c() {
        mo40877a(mo40882e());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo40877a(String str) {
        if (str != null) {
            mo40879b(str);
            mo40884g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo40881d() {
        return f4096a.get(this.f4097b.mo40901i());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo40882e() {
        Map<String, ?> g = this.f4097b.mo40897g();
        for (String f : f4096a.values()) {
            g.remove(C3845qc.m4554f(f));
        }
        LinkedList linkedList = new LinkedList();
        for (String g2 : g.keySet()) {
            try {
                linkedList.add(Integer.valueOf(Integer.parseInt(C3845qc.m4555g(g2))));
            } catch (Throwable unused) {
            }
        }
        if (linkedList.size() == 1) {
            return ((Integer) linkedList.getFirst()).toString();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo40883f() {
        return this.f4097b.mo40886a((String) null) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo40884g() {
        this.f4097b.mo40887a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo40879b(String str) {
        this.f4097b.mo40893d(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo40885h() {
        this.f4097b.mo40889b();
    }
}
