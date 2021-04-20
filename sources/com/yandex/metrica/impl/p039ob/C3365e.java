package com.yandex.metrica.impl.p039ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.e */
public abstract class C3365e {

    /* renamed from: a */
    protected volatile int f3093a = -1;

    /* renamed from: a */
    public abstract C3365e mo39941a(C3115a aVar) throws IOException;

    /* renamed from: a */
    public void mo39942a(C3157b bVar) throws IOException {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo39944c() {
        return 0;
    }

    /* renamed from: a */
    public int mo39940a() {
        if (this.f3093a < 0) {
            mo39943b();
        }
        return this.f3093a;
    }

    /* renamed from: b */
    public int mo39943b() {
        int c = mo39944c();
        this.f3093a = c;
        return c;
    }

    /* renamed from: a */
    public static final byte[] m3064a(C3365e eVar) {
        byte[] bArr = new byte[eVar.mo39943b()];
        m3063a(eVar, bArr, 0, bArr.length);
        return bArr;
    }

    /* renamed from: a */
    public static final void m3063a(C3365e eVar, byte[] bArr, int i, int i2) {
        try {
            C3157b a = C3157b.m2100a(bArr, i, i2);
            eVar.mo39942a(a);
            a.mo39562b();
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* renamed from: a */
    public static final <T extends C3365e> T m3062a(T t, byte[] bArr) throws C3318d {
        return m3065b(t, bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static final <T extends C3365e> T m3065b(T t, byte[] bArr, int i, int i2) throws C3318d {
        try {
            C3115a a = C3115a.m1879a(bArr, i, i2);
            t.mo39941a(a);
            a.mo39417a(0);
            return t;
        } catch (C3318d e) {
            throw e;
        } catch (IOException unused) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    public String toString() {
        return C3412f.m3232a(this);
    }
}
