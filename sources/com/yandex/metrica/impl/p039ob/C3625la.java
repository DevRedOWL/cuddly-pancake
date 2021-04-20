package com.yandex.metrica.impl.p039ob;

import android.util.SparseArray;
import com.yandex.metrica.impl.p039ob.C3635lj;
import com.yandex.metrica.impl.p039ob.C3644lq;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.la */
public class C3625la {

    /* renamed from: a */
    private final C3626lb f3620a;

    /* renamed from: b */
    private final C3629le f3621b;

    /* renamed from: c */
    private final C3635lj.C3637a f3622c;

    public C3625la(C3626lb lbVar, C3629le leVar) {
        this(lbVar, leVar, new C3635lj.C3637a());
    }

    public C3625la(C3626lb lbVar, C3629le leVar, C3635lj.C3637a aVar) {
        this.f3620a = lbVar;
        this.f3621b = leVar;
        this.f3622c = aVar;
    }

    /* renamed from: a */
    public C3635lj mo40419a() {
        return this.f3622c.mo40469a("main", this.f3620a.mo40424c(), this.f3620a.mo40425d(), this.f3620a.mo40422a(), new C3639ll("main", this.f3621b.mo40447a()));
    }

    /* renamed from: b */
    public C3635lj mo40420b() {
        HashMap hashMap = new HashMap();
        hashMap.put("preferences", C3644lq.C3650d.f3692a);
        hashMap.put("binary_data", C3644lq.C3648b.f3691a);
        hashMap.put("startup", C3644lq.C3654h.f3692a);
        hashMap.put("l_dat", C3644lq.C3645a.f3686a);
        hashMap.put("lbs_dat", C3644lq.C3645a.f3686a);
        return this.f3622c.mo40469a("metrica.db", this.f3620a.mo40428g(), this.f3620a.mo40429h(), this.f3620a.mo40423b(), new C3639ll("metrica.db", hashMap));
    }

    /* renamed from: c */
    public C3635lj mo40421c() {
        HashMap hashMap = new HashMap();
        hashMap.put("preferences", C3644lq.C3650d.f3692a);
        return this.f3622c.mo40469a("client storage", this.f3620a.mo40426e(), this.f3620a.mo40427f(), new SparseArray(), new C3639ll("metrica.db", hashMap));
    }
}
