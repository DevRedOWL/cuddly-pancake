package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ck */
public class C3270ck {

    /* renamed from: a */
    private final C3271cl f2891a;

    /* renamed from: b */
    private final Context f2892b;

    /* renamed from: c */
    private final Map<String, C3268cj> f2893c = new HashMap();

    public C3270ck(Context context, C3271cl clVar) {
        this.f2892b = context;
        this.f2891a = clVar;
    }

    /* renamed from: a */
    public synchronized C3268cj mo39812a(String str, CounterConfiguration.C3075a aVar) {
        C3268cj cjVar;
        cjVar = this.f2893c.get(str);
        if (cjVar == null) {
            cjVar = new C3268cj(str, this.f2892b, aVar, this.f2891a);
            this.f2893c.put(str, cjVar);
        }
        return cjVar;
    }
}
