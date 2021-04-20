package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3929rr;
import com.yandex.metrica.impl.p039ob.C4107tt;

/* renamed from: com.yandex.metrica.impl.ob.ni */
public class C3737ni implements C3718mv<C4107tt.C4108a.C4109a, C3929rr.C3930a.C3933b.C3934a.C3935a> {
    /* renamed from: a */
    public C3929rr.C3930a.C3933b.C3934a.C3935a mo40225b(C4107tt.C4108a.C4109a aVar) {
        C3929rr.C3930a.C3933b.C3934a.C3935a aVar2 = new C3929rr.C3930a.C3933b.C3934a.C3935a();
        aVar2.f4482b = aVar.f4963a;
        if (aVar.f4964b != null) {
            aVar2.f4483c = aVar.f4964b;
        }
        if (aVar.f4965c != null) {
            aVar2.f4484d = aVar.f4965c;
        }
        return aVar2;
    }

    /* renamed from: a */
    public C4107tt.C4108a.C4109a mo40224a(C3929rr.C3930a.C3933b.C3934a.C3935a aVar) {
        int i = aVar.f4482b;
        byte[] bArr = null;
        byte[] bArr2 = C3306cx.m2863a(aVar.f4483c) ? null : aVar.f4483c;
        if (!C3306cx.m2863a(aVar.f4484d)) {
            bArr = aVar.f4484d;
        }
        return new C4107tt.C4108a.C4109a(i, bArr2, bArr);
    }
}
