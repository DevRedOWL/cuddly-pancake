package com.yandex.metrica.impl.p039ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.tb */
public class C4067tb {

    /* renamed from: a */
    private C3700mf<C4076te> f4868a;

    /* renamed from: b */
    private C4076te f4869b;

    /* renamed from: c */
    private C4227wg f4870c;

    /* renamed from: d */
    private C4078tg f4871d;

    /* renamed from: e */
    private C4068a f4872e;

    /* renamed from: com.yandex.metrica.impl.ob.tb$a */
    interface C4068a {
        /* renamed from: a */
        void mo41424a();
    }

    public C4067tb(Context context, C3700mf<C4076te> mfVar, C4068a aVar) {
        this(mfVar, aVar, new C4227wg(), new C4078tg(context, mfVar));
    }

    C4067tb(C3700mf<C4076te> mfVar, C4068a aVar, C4227wg wgVar, C4078tg tgVar) {
        this.f4868a = mfVar;
        this.f4869b = this.f4868a.mo40624a();
        this.f4870c = wgVar;
        this.f4871d = tgVar;
        this.f4872e = aVar;
    }

    /* renamed from: a */
    public void mo41423a(C4076te teVar) {
        this.f4868a.mo40625a(teVar);
        this.f4869b = teVar;
        this.f4871d.mo41440a();
        this.f4872e.mo41424a();
    }

    /* renamed from: a */
    public void mo41422a() {
        C4076te teVar = new C4076te(this.f4869b.f4903a, this.f4869b.f4904b, this.f4870c.mo41768a(), true, true);
        this.f4868a.mo40625a(teVar);
        this.f4869b = teVar;
        this.f4872e.mo41424a();
    }
}
