package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3365e;

/* renamed from: com.yandex.metrica.impl.ob.mg */
public class C3701mg<T, P extends C3365e> implements C3700mf<T> {

    /* renamed from: a */
    private final String f3815a;

    /* renamed from: b */
    private final C3617kx f3816b;

    /* renamed from: c */
    private final C3699me<P> f3817c;

    /* renamed from: d */
    private final C3713mq<T, P> f3818d;

    public C3701mg(String str, C3617kx kxVar, C3699me<P> meVar, C3713mq<T, P> mqVar) {
        this.f3815a = str;
        this.f3816b = kxVar;
        this.f3817c = meVar;
        this.f3818d = mqVar;
    }

    /* renamed from: a */
    public void mo40625a(T t) {
        this.f3816b.mo40394a(this.f3815a, this.f3817c.mo40621a(this.f3818d.mo40225b(t)));
    }

    /* renamed from: a */
    public T mo40624a() {
        try {
            byte[] a = this.f3816b.mo40395a(this.f3815a);
            if (C3306cx.m2863a(a)) {
                return this.f3818d.mo40224a(this.f3817c.mo40230c());
            }
            return this.f3818d.mo40224a(this.f3817c.mo40229b(a));
        } catch (Throwable unused) {
            return this.f3818d.mo40224a(this.f3817c.mo40230c());
        }
    }
}
