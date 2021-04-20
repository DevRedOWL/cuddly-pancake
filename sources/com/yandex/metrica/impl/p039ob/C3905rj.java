package com.yandex.metrica.impl.p039ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.rj */
public final class C3905rj extends C3365e {

    /* renamed from: b */
    public String f4371b;

    /* renamed from: c */
    public long f4372c;

    /* renamed from: d */
    public long f4373d;

    public C3905rj() {
        mo41030d();
    }

    /* renamed from: d */
    public C3905rj mo41030d() {
        this.f4371b = "";
        this.f4372c = 0;
        this.f4373d = 0;
        this.f3093a = -1;
        return this;
    }

    /* renamed from: a */
    public void mo39942a(C3157b bVar) throws IOException {
        if (!this.f4371b.equals("")) {
            bVar.mo39554a(1, this.f4371b);
        }
        long j = this.f4372c;
        if (j != 0) {
            bVar.mo39552a(2, j);
        }
        long j2 = this.f4373d;
        if (j2 != 0) {
            bVar.mo39552a(3, j2);
        }
        super.mo39942a(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo39944c() {
        int c = super.mo39944c();
        if (!this.f4371b.equals("")) {
            c += C3157b.m2106b(1, this.f4371b);
        }
        long j = this.f4372c;
        if (j != 0) {
            c += C3157b.m2115d(2, j);
        }
        long j2 = this.f4373d;
        return j2 != 0 ? c + C3157b.m2115d(3, j2) : c;
    }

    /* renamed from: b */
    public C3905rj mo39941a(C3115a aVar) throws IOException {
        while (true) {
            int a = aVar.mo39416a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f4371b = aVar.mo39432i();
            } else if (a == 16) {
                this.f4372c = aVar.mo39424e();
            } else if (a == 24) {
                this.f4373d = aVar.mo39424e();
            } else if (!C3442g.m3331a(aVar, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public static C3905rj m4841a(byte[] bArr) throws C3318d {
        return (C3905rj) C3365e.m3062a(new C3905rj(), bArr);
    }
}
