package com.yandex.metrica.impl.p039ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.ri */
public final class C3904ri extends C3365e {

    /* renamed from: b */
    public byte[] f4368b;

    /* renamed from: c */
    public long f4369c;

    /* renamed from: d */
    public long f4370d;

    public C3904ri() {
        mo41028d();
    }

    /* renamed from: d */
    public C3904ri mo41028d() {
        this.f4368b = C3442g.f3280h;
        this.f4369c = 0;
        this.f4370d = 0;
        this.f3093a = -1;
        return this;
    }

    /* renamed from: a */
    public void mo39942a(C3157b bVar) throws IOException {
        bVar.mo39556a(1, this.f4368b);
        long j = this.f4369c;
        if (j != 0) {
            bVar.mo39552a(2, j);
        }
        long j2 = this.f4370d;
        if (j2 != 0) {
            bVar.mo39552a(3, j2);
        }
        super.mo39942a(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo39944c() {
        int c = super.mo39944c() + C3157b.m2108b(1, this.f4368b);
        long j = this.f4369c;
        if (j != 0) {
            c += C3157b.m2115d(2, j);
        }
        long j2 = this.f4370d;
        return j2 != 0 ? c + C3157b.m2115d(3, j2) : c;
    }

    /* renamed from: b */
    public C3904ri mo39941a(C3115a aVar) throws IOException {
        while (true) {
            int a = aVar.mo39416a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f4368b = aVar.mo39433j();
            } else if (a == 16) {
                this.f4369c = aVar.mo39424e();
            } else if (a == 24) {
                this.f4370d = aVar.mo39424e();
            } else if (!C3442g.m3331a(aVar, a)) {
                return this;
            }
        }
    }
}
