package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3884rh;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* renamed from: com.yandex.metrica.impl.ob.oz */
public class C3806oz {
    /* renamed from: a */
    public C3884rh.C3886b.C3887a mo40822a(C3784on onVar) {
        C3884rh.C3886b.C3887a aVar = new C3884rh.C3886b.C3887a();
        aVar.f4261b = onVar.mo40763a() == null ? aVar.f4261b : onVar.mo40763a().longValue();
        aVar.f4262c = TimeUnit.MILLISECONDS.toSeconds(onVar.mo40767b());
        aVar.f4265f = TimeUnit.MILLISECONDS.toSeconds(onVar.mo40772e());
        JSONArray d = onVar.mo40771d();
        if (d != null) {
            aVar.f4263d = C3223bv.m2429b(d);
        }
        JSONArray c = onVar.mo40770c();
        if (c != null) {
            aVar.f4264e = C3223bv.m2426a(c);
        }
        return aVar;
    }
}
