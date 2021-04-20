package com.yandex.metrica.impl.p039ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.mk */
public class C3705mk<T> implements C3706ml<T> {

    /* renamed from: a */
    private final C3706ml<T> f3819a;

    /* renamed from: b */
    private final C4239wr f3820b;

    public C3705mk(C3706ml<T> mlVar, C4239wr wrVar) {
        this.f3819a = mlVar;
        this.f3820b = wrVar;
    }

    /* renamed from: a */
    public byte[] mo40621a(T t) {
        try {
            return this.f3820b.mo41782a(this.f3819a.mo40621a(t));
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    /* renamed from: b */
    public T mo40229b(byte[] bArr) throws IOException {
        try {
            return this.f3819a.mo40229b(this.f3820b.mo41784b(bArr));
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* renamed from: c */
    public T mo40230c() {
        return this.f3819a.mo40230c();
    }
}
