package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.location.Location;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ou */
class C3797ou {

    /* renamed from: a */
    private C3800c f4008a;

    /* renamed from: b */
    private C3798a f4009b;

    /* renamed from: c */
    private C3799b f4010c;

    /* renamed from: d */
    private Context f4011d;

    /* renamed from: e */
    private C3774oh f4012e;

    /* renamed from: f */
    private C3801ov f4013f;

    /* renamed from: g */
    private C3802ow f4014g;

    /* renamed from: h */
    private C3770od f4015h;

    /* renamed from: i */
    private C3776oi f4016i;

    /* renamed from: j */
    private Map<String, C3790op> f4017j;

    /* renamed from: com.yandex.metrica.impl.ob.ou$b */
    public static class C3799b {
        /* renamed from: a */
        public C3790op mo40814a(String str, C3774oh ohVar, C3801ov ovVar, C3802ow owVar, C3770od odVar) {
            return new C3790op(str, ohVar, ovVar, owVar, odVar);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ou$c */
    public static class C3800c {
        /* renamed from: a */
        public C3801ov mo40815a(Context context, C3771oe oeVar) {
            return new C3801ov(context, oeVar);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ou$a */
    public static class C3798a {
        /* renamed from: a */
        public C3776oi mo40813a(C3771oe oeVar) {
            return new C3776oi(oeVar);
        }
    }

    public C3797ou(Context context, C3774oh ohVar, C3802ow owVar, C3770od odVar) {
        this(context, ohVar, new C3800c(), new C3798a(), new C3799b(), owVar, odVar);
    }

    /* renamed from: a */
    public void mo40811a(Location location) {
        String provider = location.getProvider();
        C3790op opVar = this.f4017j.get(provider);
        if (opVar == null) {
            opVar = m4418a(provider);
            this.f4017j.put(provider, opVar);
        } else {
            opVar.mo40784a(this.f4012e);
        }
        opVar.mo40783a(location);
    }

    /* renamed from: a */
    public Location mo40810a() {
        C3776oi oiVar = this.f4016i;
        if (oiVar == null) {
            return null;
        }
        return oiVar.mo40752a();
    }

    /* renamed from: a */
    private C3790op m4418a(String str) {
        if (this.f4013f == null) {
            this.f4013f = this.f4008a.mo40815a(this.f4011d, (C3771oe) null);
        }
        if (this.f4016i == null) {
            this.f4016i = this.f4009b.mo40813a(this.f4013f);
        }
        return this.f4010c.mo40814a(str, this.f4012e, this.f4013f, this.f4014g, this.f4015h);
    }

    /* renamed from: a */
    public void mo40812a(C3774oh ohVar) {
        this.f4012e = ohVar;
    }

    C3797ou(Context context, C3774oh ohVar, C3800c cVar, C3798a aVar, C3799b bVar, C3802ow owVar, C3770od odVar) {
        this.f4017j = new HashMap();
        this.f4011d = context;
        this.f4012e = ohVar;
        this.f4008a = cVar;
        this.f4009b = aVar;
        this.f4010c = bVar;
        this.f4014g = owVar;
        this.f4015h = odVar;
    }
}
