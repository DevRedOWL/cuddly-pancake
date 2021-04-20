package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import com.yandex.metrica.impl.p039ob.C3579jt;
import com.yandex.metrica.impl.p039ob.C3744np;

/* renamed from: com.yandex.metrica.impl.ob.jv */
public class C3584jv {

    /* renamed from: a */
    private final Context f3514a;

    /* renamed from: b */
    private final C3579jt f3515b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3582ju f3516c;

    /* renamed from: d */
    private final C3586a f3517d;

    /* renamed from: e */
    private final C3575jq f3518e;

    /* renamed from: com.yandex.metrica.impl.ob.jv$a */
    public static class C3586a {
        /* renamed from: a */
        public C3769oc mo40338a(Context context) {
            return C3744np.C3746a.m4268a(C4143uk.class).mo40705a(context).mo40624a().f5103q;
        }
    }

    public C3584jv(Context context, C4257xh xhVar, C3574jp jpVar) {
        this(context, xhVar, jpVar, new C3582ju(context));
    }

    /* renamed from: a */
    public void mo40336a() {
        m3669a(this.f3517d.mo40338a(this.f3514a));
    }

    /* renamed from: a */
    private void m3669a(C3769oc ocVar) {
        if (ocVar != null) {
            boolean z = ocVar.f3916k;
            boolean z2 = ocVar.f3903c;
            Long a = this.f3518e.mo40321a(ocVar.f3904d);
            if (!z || a == null || a.longValue() <= 0) {
                m3670b();
            } else {
                this.f3515b.mo40329a(a.longValue(), z2);
            }
        }
    }

    /* renamed from: b */
    private void m3670b() {
        this.f3515b.mo40327a();
    }

    /* renamed from: a */
    public void mo40337a(final C3587jw jwVar) {
        C3769oc a = this.f3517d.mo40338a(this.f3514a);
        if (a != null) {
            long j = a.f3901a;
            if (j > 0) {
                this.f3516c.mo40333a(this.f3514a.getPackageName());
                this.f3515b.mo40328a(j, (C3579jt.C3581a) new C3579jt.C3581a() {
                    /* renamed from: a */
                    public void mo40331a() {
                        C3584jv.this.f3516c.mo40332a();
                        C3584jv.this.m3671b(jwVar);
                    }
                });
            } else {
                m3671b(jwVar);
            }
        } else {
            m3671b(jwVar);
        }
        m3669a(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m3671b(C3587jw jwVar) {
        if (jwVar != null) {
            jwVar.mo39216a();
        }
    }

    private C3584jv(Context context, C4257xh xhVar, C3574jp jpVar, C3582ju juVar) {
        this(context, new C3579jt(xhVar, jpVar), juVar, new C3586a(), new C3575jq(context));
    }

    C3584jv(Context context, C3579jt jtVar, C3582ju juVar, C3586a aVar, C3575jq jqVar) {
        this.f3514a = context;
        this.f3515b = jtVar;
        this.f3516c = juVar;
        this.f3517d = aVar;
        this.f3518e = jqVar;
    }
}
