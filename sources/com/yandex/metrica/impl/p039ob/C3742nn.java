package com.yandex.metrica.impl.p039ob;

import android.os.ParcelUuid;
import android.text.TextUtils;
import com.yandex.metrica.impl.p039ob.C3929rr;
import com.yandex.metrica.impl.p039ob.C4107tt;

/* renamed from: com.yandex.metrica.impl.ob.nn */
public class C3742nn implements C3718mv<C4107tt.C4108a.C4111c, C3929rr.C3930a.C3933b.C3934a.C3937c> {
    /* renamed from: a */
    public C3929rr.C3930a.C3933b.C3934a.C3937c mo40225b(C4107tt.C4108a.C4111c cVar) {
        C3929rr.C3930a.C3933b.C3934a.C3937c cVar2 = new C3929rr.C3930a.C3933b.C3934a.C3937c();
        cVar2.f4488b = cVar.f4969a.toString();
        if (cVar.f4970b != null) {
            cVar2.f4489c = cVar.f4970b.toString();
        }
        return cVar2;
    }

    /* renamed from: a */
    public C4107tt.C4108a.C4111c mo40224a(C3929rr.C3930a.C3933b.C3934a.C3937c cVar) {
        return new C4107tt.C4108a.C4111c(ParcelUuid.fromString(cVar.f4488b), TextUtils.isEmpty(cVar.f4489c) ? null : ParcelUuid.fromString(cVar.f4489c));
    }
}
