package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import com.yandex.metrica.impl.p039ob.C3129ai;
import java.util.Collection;

/* renamed from: com.yandex.metrica.impl.ob.dc */
public class C3325dc {

    /* renamed from: a */
    private final Context f3030a;

    /* renamed from: b */
    private final C3838px f3031b;

    /* renamed from: c */
    private final C3832pr f3032c;

    /* renamed from: d */
    private final C3690ly f3033d;

    /* renamed from: e */
    private final C3129ai.C3132b f3034e;

    public C3325dc(Context context) {
        this(context, new C3838px());
    }

    private C3325dc(Context context, C3838px pxVar) {
        this(context, pxVar, new C3832pr(pxVar.mo40869a()), new C3690ly(C3628ld.m3815a(context).mo40441c()), new C3129ai.C3132b());
    }

    /* renamed from: a */
    public boolean mo39893a(C4143uk ukVar, C4107tt ttVar) {
        if (!this.f3034e.mo39478a(ukVar.f5084E, ukVar.f5083D, ttVar.f4957d)) {
            return false;
        }
        m2978a(ukVar);
        if (this.f3032c.mo40856c(this.f3030a) && this.f3032c.mo40862i(this.f3030a)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo39894b(C4143uk ukVar, C4107tt ttVar) {
        m2978a(ukVar);
        return ukVar.f5101o.f4999f && !C3306cx.m2861a((Collection) ttVar.f4955b);
    }

    /* renamed from: a */
    private void m2978a(C4143uk ukVar) {
        this.f3031b.mo40871a(this.f3033d.mo40596g());
        this.f3031b.mo40870a(ukVar);
        this.f3032c.mo40852a(this.f3031b.mo40869a());
    }

    public C3325dc(Context context, C3838px pxVar, C3832pr prVar, C3690ly lyVar, C3129ai.C3132b bVar) {
        this.f3030a = context;
        this.f3031b = pxVar;
        this.f3032c = prVar;
        this.f3033d = lyVar;
        this.f3034e = bVar;
    }
}
