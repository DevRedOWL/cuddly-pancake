package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import com.yandex.metrica.C3091d;
import com.yandex.metrica.impl.p039ob.C3949rs;

/* renamed from: com.yandex.metrica.impl.ob.tj */
public class C4081tj {

    /* renamed from: a */
    private final C4082tk f4913a;

    /* renamed from: b */
    private final C3091d f4914b;

    public C4081tj(Context context) {
        this(new C4082tk(), C4085tl.m5459a(context));
    }

    /* renamed from: a */
    public void mo41444a(C3949rs.C3954a.C3956b bVar) {
        this.f4914b.mo39350a("provided_request_result", this.f4913a.mo41447a(bVar));
    }

    /* renamed from: a */
    public void mo41443a(C3949rs.C3954a.C3955a aVar) {
        this.f4914b.mo39350a("provided_request_schedule", this.f4913a.mo41446a(aVar));
    }

    /* renamed from: b */
    public void mo41445b(C3949rs.C3954a.C3955a aVar) {
        this.f4914b.mo39350a("provided_request_send", this.f4913a.mo41446a(aVar));
    }

    C4081tj(C4082tk tkVar, C3091d dVar) {
        this.f4913a = tkVar;
        this.f4914b = dVar;
    }
}
