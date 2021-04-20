package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3929rr;
import com.yandex.metrica.impl.p039ob.C4107tt;

/* renamed from: com.yandex.metrica.impl.ob.nm */
public class C3741nm implements C3718mv<C4107tt.C4108a.C4110b, C3929rr.C3930a.C3933b.C3934a.C3936b> {
    /* renamed from: a */
    public C3929rr.C3930a.C3933b.C3934a.C3936b mo40225b(C4107tt.C4108a.C4110b bVar) {
        C3929rr.C3930a.C3933b.C3934a.C3936b bVar2 = new C3929rr.C3930a.C3933b.C3934a.C3936b();
        bVar2.f4485b = bVar.f4966a.toString();
        if (bVar.f4967b != null) {
            bVar2.f4486c = bVar.f4967b;
        }
        if (bVar.f4968c != null) {
            bVar2.f4487d = bVar.f4968c;
        }
        return bVar2;
    }

    /* renamed from: a */
    public C4107tt.C4108a.C4110b mo40224a(C3929rr.C3930a.C3933b.C3934a.C3936b bVar) {
        String str = bVar.f4485b;
        byte[] bArr = null;
        byte[] bArr2 = C3306cx.m2863a(bVar.f4486c) ? null : bVar.f4486c;
        if (!C3306cx.m2863a(bVar.f4487d)) {
            bArr = bVar.f4487d;
        }
        return new C4107tt.C4108a.C4110b(str, bArr2, bArr);
    }
}
