package com.yandex.metrica.impl.p039ob;

import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ae */
public class C3124ae {

    /* renamed from: a */
    private C4214vx f2493a = new C4214vx();

    /* renamed from: b */
    private C4273xx f2494b;

    C3124ae(C4273xx xxVar) {
        this.f2494b = xxVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39461a(String str, String str2) {
        this.f2494b.mo41849a(this.f2493a, str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo39460a() {
        if (this.f2493a.isEmpty()) {
            return null;
        }
        return new JSONObject(this.f2493a).toString();
    }
}
