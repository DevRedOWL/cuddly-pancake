package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import com.yandex.metrica.C3091d;
import com.yandex.metrica.C3093f;

/* renamed from: com.yandex.metrica.impl.ob.rw */
public class C3965rw extends C3969rx<C4027sf> implements C3091d {
    public C3965rw(C4257xh xhVar, Context context, String str) {
        this(xhVar, context, str, new C4027sf(), new C3998sa(), new C4024sc());
    }

    public C3965rw(C4257xh xhVar, Context context, String str, C4027sf sfVar, C3998sa saVar, C4024sc scVar) {
        super(xhVar, context, str, sfVar, saVar, scVar);
    }

    /* renamed from: a */
    public void mo41138a(final C3093f fVar) {
        this.f4601b.mo41808a((Runnable) new Runnable() {
            public void run() {
                C3965rw rwVar = C3965rw.this;
                rwVar.mo41145b(rwVar.f4602c.mo41250a(fVar));
            }
        });
    }

    public void sendEventsBuffer() {
        ((C4027sf) this.f4600a).sendEventsBuffer();
        this.f4601b.mo41808a((Runnable) new Runnable() {
            public void run() {
                C3965rw.this.mo41142a().sendEventsBuffer();
            }
        });
    }

    /* renamed from: a */
    public void mo39350a(final String str, final String str2) {
        ((C4027sf) this.f4600a).mo39350a(str, str2);
        this.f4601b.mo41808a((Runnable) new Runnable() {
            public void run() {
                C3965rw.this.mo41142a().mo39350a(str, str2);
            }
        });
    }
}
