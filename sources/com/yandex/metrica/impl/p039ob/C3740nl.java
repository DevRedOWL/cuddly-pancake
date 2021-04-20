package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3929rr;
import com.yandex.metrica.impl.p039ob.C4107tt;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.nl */
public class C3740nl implements C3718mv<C4107tt.C4112b, C3929rr.C3930a.C3933b.C3938b> {

    /* renamed from: a */
    private static final Map<Integer, C4107tt.C4112b.C4113a> f3858a;

    /* renamed from: b */
    private static final Map<C4107tt.C4112b.C4113a, Integer> f3859b;

    /* renamed from: c */
    private static final Map<Integer, C4107tt.C4112b.C4114b> f3860c;

    /* renamed from: d */
    private static final Map<C4107tt.C4112b.C4114b, Integer> f3861d;

    /* renamed from: e */
    private static final Map<Integer, C4107tt.C4112b.C4115c> f3862e;

    /* renamed from: f */
    private static final Map<C4107tt.C4112b.C4115c, Integer> f3863f;

    /* renamed from: g */
    private static final Map<Integer, C4107tt.C4112b.C4116d> f3864g;

    /* renamed from: h */
    private static final Map<C4107tt.C4112b.C4116d, Integer> f3865h;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(1, C4107tt.C4112b.C4113a.ALL_MATCHES);
        hashMap.put(2, C4107tt.C4112b.C4113a.FIRST_MATCH);
        hashMap.put(3, C4107tt.C4112b.C4113a.MATCH_LOST);
        f3858a = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(C4107tt.C4112b.C4113a.ALL_MATCHES, 1);
        hashMap2.put(C4107tt.C4112b.C4113a.FIRST_MATCH, 2);
        hashMap2.put(C4107tt.C4112b.C4113a.MATCH_LOST, 3);
        f3859b = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(1, C4107tt.C4112b.C4114b.AGGRESSIVE);
        hashMap3.put(2, C4107tt.C4112b.C4114b.STICKY);
        f3860c = Collections.unmodifiableMap(hashMap3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(C4107tt.C4112b.C4114b.AGGRESSIVE, 1);
        hashMap4.put(C4107tt.C4112b.C4114b.STICKY, 2);
        f3861d = Collections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(1, C4107tt.C4112b.C4115c.ONE_AD);
        hashMap5.put(2, C4107tt.C4112b.C4115c.FEW_AD);
        hashMap5.put(3, C4107tt.C4112b.C4115c.MAX_AD);
        f3862e = Collections.unmodifiableMap(hashMap5);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(C4107tt.C4112b.C4115c.ONE_AD, 1);
        hashMap6.put(C4107tt.C4112b.C4115c.FEW_AD, 2);
        hashMap6.put(C4107tt.C4112b.C4115c.MAX_AD, 3);
        f3863f = Collections.unmodifiableMap(hashMap6);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(1, C4107tt.C4112b.C4116d.LOW_POWER);
        hashMap7.put(2, C4107tt.C4112b.C4116d.BALANCED);
        hashMap7.put(3, C4107tt.C4112b.C4116d.LOW_LATENCY);
        f3864g = Collections.unmodifiableMap(hashMap7);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(C4107tt.C4112b.C4116d.LOW_POWER, 1);
        hashMap8.put(C4107tt.C4112b.C4116d.BALANCED, 2);
        hashMap8.put(C4107tt.C4112b.C4116d.LOW_LATENCY, 3);
        f3865h = Collections.unmodifiableMap(hashMap8);
    }

    /* renamed from: a */
    public C3929rr.C3930a.C3933b.C3938b mo40225b(C4107tt.C4112b bVar) {
        C3929rr.C3930a.C3933b.C3938b bVar2 = new C3929rr.C3930a.C3933b.C3938b();
        bVar2.f4490b = f3859b.get(bVar.f4971a).intValue();
        bVar2.f4491c = f3861d.get(bVar.f4972b).intValue();
        bVar2.f4492d = f3863f.get(bVar.f4973c).intValue();
        bVar2.f4493e = f3865h.get(bVar.f4974d).intValue();
        bVar2.f4494f = bVar.f4975e;
        return bVar2;
    }

    /* renamed from: a */
    public C4107tt.C4112b mo40224a(C3929rr.C3930a.C3933b.C3938b bVar) {
        return new C4107tt.C4112b(f3858a.get(Integer.valueOf(bVar.f4490b)), f3860c.get(Integer.valueOf(bVar.f4491c)), f3862e.get(Integer.valueOf(bVar.f4492d)), f3864g.get(Integer.valueOf(bVar.f4493e)), bVar.f4494f);
    }
}
