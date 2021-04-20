package com.yandex.metrica.impl.p039ob;

import android.util.Pair;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.impl.p039ob.C3906rk;

/* renamed from: com.yandex.metrica.impl.ob.cg */
class C3263cg {

    /* renamed from: a */
    private final Revenue f2875a;

    /* renamed from: b */
    private final C4280yb<String> f2876b = new C4274xy(30720, "revenue payload", this.f2879e);

    /* renamed from: c */
    private final C4280yb<String> f2877c = new C4279ya(new C4274xy(184320, "receipt data", this.f2879e), "<truncated data was not sent, see METRIKALIB-4568>");

    /* renamed from: d */
    private final C4280yb<String> f2878d = new C4279ya(new C4275xz(1000, "receipt signature", this.f2879e), "<truncated data was not sent, see METRIKALIB-4568>");

    /* renamed from: e */
    private final C4216vz f2879e;

    C3263cg(Revenue revenue, C4216vz vzVar) {
        this.f2879e = vzVar;
        this.f2875a = revenue;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Pair<byte[], Integer> mo39808a() {
        C3906rk rkVar = new C3906rk();
        rkVar.f4376d = this.f2875a.currency.getCurrencyCode().getBytes();
        if (C3306cx.m2858a((Object) this.f2875a.price)) {
            rkVar.f4375c = this.f2875a.price.doubleValue();
        }
        if (C3306cx.m2858a((Object) this.f2875a.priceMicros)) {
            rkVar.f4380h = this.f2875a.priceMicros.longValue();
        }
        rkVar.f4377e = C3303cu.m2831d(new C4275xz(200, "revenue productID", this.f2879e).mo41840a(this.f2875a.productID));
        rkVar.f4374b = C4232wk.m6035a(this.f2875a.quantity, 1);
        rkVar.f4378f = C3303cu.m2831d(this.f2876b.mo41840a(this.f2875a.payload));
        int i = 0;
        if (C3306cx.m2858a((Object) this.f2875a.receipt)) {
            C3906rk.C3907a aVar = new C3906rk.C3907a();
            String a = this.f2877c.mo41840a(this.f2875a.receipt.data);
            if (C4270xu.m6146a(this.f2875a.receipt.data, a)) {
                i = this.f2875a.receipt.data.length() + 0;
            }
            aVar.f4381b = C3303cu.m2831d(a);
            aVar.f4382c = C3303cu.m2831d(this.f2878d.mo41840a(this.f2875a.receipt.signature));
            rkVar.f4379g = aVar;
        }
        return new Pair<>(C3365e.m3064a((C3365e) rkVar), Integer.valueOf(i));
    }
}
