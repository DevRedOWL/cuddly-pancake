package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p039ob.C3929rr;
import com.yandex.metrica.impl.p039ob.C4107tt;

/* renamed from: com.yandex.metrica.impl.ob.nj */
public class C3738nj implements C3718mv<C4107tt.C4108a, C3929rr.C3930a.C3933b.C3934a> {

    /* renamed from: a */
    private final C3737ni f3854a;

    /* renamed from: b */
    private final C3741nm f3855b;

    /* renamed from: c */
    private final C3742nn f3856c;

    public C3738nj() {
        this(new C3737ni(), new C3741nm(), new C3742nn());
    }

    /* renamed from: a */
    public C3929rr.C3930a.C3933b.C3934a mo40225b(C4107tt.C4108a aVar) {
        C3929rr.C3930a.C3933b.C3934a aVar2 = new C3929rr.C3930a.C3933b.C3934a();
        if (!TextUtils.isEmpty(aVar.f4958a)) {
            aVar2.f4477b = aVar.f4958a;
        }
        if (!TextUtils.isEmpty(aVar.f4959b)) {
            aVar2.f4478c = aVar.f4959b;
        }
        if (aVar.f4960c != null) {
            aVar2.f4479d = this.f3854a.mo40225b(aVar.f4960c);
        }
        if (aVar.f4961d != null) {
            aVar2.f4480e = this.f3855b.mo40225b(aVar.f4961d);
        }
        if (aVar.f4962e != null) {
            aVar2.f4481f = this.f3856c.mo40225b(aVar.f4962e);
        }
        return aVar2;
    }

    /* renamed from: a */
    public C4107tt.C4108a mo40224a(C3929rr.C3930a.C3933b.C3934a aVar) {
        C4107tt.C4108a.C4109a aVar2;
        C4107tt.C4108a.C4110b bVar;
        C4107tt.C4108a.C4111c cVar;
        String str = TextUtils.isEmpty(aVar.f4477b) ? null : aVar.f4477b;
        String str2 = TextUtils.isEmpty(aVar.f4478c) ? null : aVar.f4478c;
        if (aVar.f4479d == null) {
            aVar2 = null;
        } else {
            aVar2 = this.f3854a.mo40224a(aVar.f4479d);
        }
        if (aVar.f4480e == null) {
            bVar = null;
        } else {
            bVar = this.f3855b.mo40224a(aVar.f4480e);
        }
        if (aVar.f4481f == null) {
            cVar = null;
        } else {
            cVar = this.f3856c.mo40224a(aVar.f4481f);
        }
        return new C4107tt.C4108a(str, str2, aVar2, bVar, cVar);
    }

    C3738nj(C3737ni niVar, C3741nm nmVar, C3742nn nnVar) {
        this.f3854a = niVar;
        this.f3855b = nmVar;
        this.f3856c = nnVar;
    }
}
