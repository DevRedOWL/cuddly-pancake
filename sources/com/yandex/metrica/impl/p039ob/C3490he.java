package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.IReporter;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.he */
public class C3490he extends C3489hd {

    /* renamed from: a */
    private final IReporter f3346a;

    public C3490he(C3391en enVar, IReporter iReporter) {
        super(enVar);
        this.f3346a = iReporter;
    }

    /* renamed from: a */
    public boolean mo40170a(C4217w wVar) {
        C3596kd a = C3596kd.m3690a(wVar.mo41736g());
        HashMap hashMap = new HashMap();
        hashMap.put("type", a.f3534a);
        hashMap.put("delivery_method", a.f3535b);
        this.f3346a.reportEvent("crash_saved", (Map<String, Object>) hashMap);
        return false;
    }
}
