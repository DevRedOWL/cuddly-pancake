package com.yandex.metrica.impl.p039ob;

import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.mp */
public class C3711mp {

    /* renamed from: a */
    private final C3712a f3825a;

    /* renamed from: b */
    private final C4200vm f3826b;

    /* renamed from: com.yandex.metrica.impl.ob.mp$a */
    public static class C3712a {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C4239wr mo40639a(byte[] bArr, byte[] bArr2) {
            return new C4239wr("AES/CBC/PKCS5Padding", bArr, bArr2);
        }
    }

    public C3711mp() {
        this(new C3712a(), new C4200vm());
    }

    public C3711mp(C3712a aVar, C4200vm vmVar) {
        this.f3825a = aVar;
        this.f3826b = vmVar;
    }

    /* renamed from: a */
    public byte[] mo40638a(byte[] bArr, String str) {
        try {
            C4239wr a = this.f3825a.mo40639a(str.getBytes(), Arrays.copyOfRange(bArr, 0, 16));
            if (C3306cx.m2863a(bArr)) {
                return null;
            }
            return this.f3826b.mo41696b(a.mo41783a(bArr, 16, bArr.length - 16));
        } catch (Throwable unused) {
            return null;
        }
    }
}
