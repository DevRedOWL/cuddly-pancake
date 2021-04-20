package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.MetricaService;
import com.yandex.metrica.impl.p038ac.C3098a;
import com.yandex.metrica.impl.p039ob.C3187bf;
import com.yandex.metrica.impl.p039ob.C3373eg;
import com.yandex.metrica.impl.p039ob.C3744np;
import com.yandex.metrica.impl.p039ob.C4056su;
import com.yandex.metrica.impl.p039ob.C4094ts;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.be */
public class C3175be implements C3164bc {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C4143uk f2659a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f2660b;

    /* renamed from: c */
    private final MetricaService.C3082c f2661c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C4094ts.C4106a f2662d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C4094ts f2663e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C3143aq f2664f;

    /* renamed from: g */
    private final C4257xh f2665g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C3428fo f2666h;

    /* renamed from: i */
    private final C3436fu f2667i;

    /* renamed from: j */
    private final C3187bf f2668j;

    /* renamed from: k */
    private C3804ox f2669k;

    /* renamed from: l */
    private final C3690ly f2670l;

    /* renamed from: m */
    private C3614ku f2671m;

    public C3175be(Context context, MetricaService.C3082c cVar) {
        this(context, cVar, new C3436fu(context));
    }

    private C3175be(Context context, MetricaService.C3082c cVar, C3436fu fuVar) {
        this(context, cVar, fuVar, new C3428fo(context, fuVar), new C3187bf(), new C4094ts.C4106a(), new C3690ly(C3628ld.m3815a(context).mo40441c()), new C3128ah());
    }

    C3175be(Context context, MetricaService.C3082c cVar, C3436fu fuVar, C3428fo foVar, C3187bf bfVar, C4094ts.C4106a aVar, C3690ly lyVar, C3128ah ahVar) {
        this.f2660b = context;
        this.f2661c = cVar;
        this.f2666h = foVar;
        this.f2667i = fuVar;
        this.f2668j = bfVar;
        this.f2662d = aVar;
        this.f2670l = lyVar;
        this.f2665g = C3136al.m1993a().mo39495j().mo41831c();
        this.f2671m = new C3614ku(ahVar.mo39469b(this.f2660b), new C4234wm<File>() {
            /* renamed from: a */
            public void mo39609a(File file) {
                C3175be.this.mo39606a(file);
            }
        });
    }

    /* renamed from: a */
    public void mo39596a() {
        new C3272cm(this.f2660b).mo39629a(this.f2660b);
        C4222wd.m6001a().mo41758a(this.f2660b);
        this.f2669k = new C3804ox(C3785oo.m4363a(this.f2660b), C3136al.m1993a().mo39496k(), C3307cy.m2873a(this.f2660b), this.f2670l);
        m2217c();
        C3350dr.m3043a().mo39930a(this, C3367eb.class, C3358dv.m3057a(new C3357du<C3367eb>() {
            /* renamed from: a */
            public void mo39399a(C3367eb ebVar) {
                C3175be.this.m2216b(ebVar.f3096b);
            }
        }).mo39938a(new C3355ds<C3367eb>() {
            /* renamed from: a */
            public boolean mo39612a(C3367eb ebVar) {
                return !C3175be.this.f2660b.getPackageName().equals(ebVar.f3095a);
            }
        }).mo39939a());
        this.f2659a = C3744np.C3746a.m4268a(C4143uk.class).mo40705a(this.f2660b).mo40624a();
        this.f2664f = new C3143aq(this.f2670l, this.f2660b, this.f2659a.f5082C);
        C3098a.m1836a().mo39393a(this.f2660b, this.f2659a);
        m2227f();
        C3136al.m1993a().mo39490e().mo41103a();
        C3136al.m1993a().mo39494i().mo40171a();
        this.f2671m.mo40368a();
    }

    /* renamed from: c */
    private void m2217c() {
        this.f2668j.mo39617a((C3187bf.C3193b) new C3187bf.C3193b() {
            /* renamed from: a */
            public void mo39615a() {
                C3175be beVar = C3175be.this;
                beVar.m2219c(beVar.f2659a);
                C3175be.this.m2230h();
            }
        });
        this.f2668j.mo39618b((C3187bf.C3193b) new C3187bf.C3193b() {
            /* renamed from: a */
            public void mo39615a() {
                C3175be beVar = C3175be.this;
                beVar.m2219c(beVar.f2659a);
                C3175be.this.m2228g();
            }
        });
        this.f2668j.mo39619c((C3187bf.C3193b) new C3187bf.C3193b() {
            /* renamed from: a */
            public void mo39615a() {
                C3175be beVar = C3175be.this;
                beVar.m2219c(beVar.f2659a);
                C3175be.this.m2235j();
                C3175be beVar2 = C3175be.this;
                C4094ts unused = beVar2.f2663e = beVar2.f2662d.mo41483a(C3175be.this.f2660b);
            }
        });
        this.f2668j.mo39621d((C3187bf.C3193b) new C3187bf.C3193b() {
            /* renamed from: a */
            public void mo39615a() {
                C3175be.this.m2220d();
            }
        });
        this.f2668j.mo39622e((C3187bf.C3193b) new C3187bf.C3193b() {
            /* renamed from: a */
            public void mo39615a() {
                C3175be.this.m2223e();
            }
        });
    }

    /* renamed from: a */
    public void mo39598a(Intent intent, int i) {
        m2214b(intent, i);
    }

    /* renamed from: a */
    public void mo39599a(Intent intent, int i, int i2) {
        m2214b(intent, i2);
    }

    /* renamed from: a */
    public void mo39597a(Intent intent) {
        this.f2668j.mo39597a(intent);
    }

    /* renamed from: b */
    public void mo39601b(Intent intent) {
        this.f2668j.mo39601b(intent);
    }

    /* renamed from: c */
    public void mo39602c(Intent intent) {
        String str;
        this.f2668j.mo39602c(intent);
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            if (data == null) {
                str = null;
            } else {
                str = data.getEncodedAuthority();
            }
            if ("com.yandex.metrica.IMetricaService".equals(action)) {
                mo39604a(data, str);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m2216b(C4143uk ukVar) {
        this.f2659a = ukVar;
        m2233i();
        m2219c(ukVar);
        C3136al.m1993a().mo39486a(ukVar);
        this.f2664f.mo39515a(this.f2659a.f5082C);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m2220d() {
        C4094ts tsVar = this.f2663e;
        if (tsVar != null) {
            tsVar.mo41467b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m2223e() {
        C4094ts tsVar = this.f2663e;
        if (tsVar != null) {
            tsVar.mo41463a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39604a(Uri uri, String str) {
        if (uri != null && uri.getPath().equals("/client")) {
            this.f2666h.mo40120a(str, Integer.parseInt(uri.getQueryParameter("pid")), uri.getQueryParameter("psid"));
        }
        if (this.f2666h.mo40118a() <= 0) {
            m2223e();
        }
    }

    /* renamed from: b */
    public void mo39600b() {
        this.f2671m.mo40369b();
        m2228g();
        this.f2667i.mo39987c();
        C3350dr.m3043a().mo39929a((Object) this);
    }

    /* renamed from: a */
    public void mo39595a(String str, int i, String str2, Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        m2212a(new C4217w(str2, str, i), bundle);
    }

    /* renamed from: a */
    public void mo39594a(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        m2212a(C4217w.m5949b(bundle), bundle);
    }

    /* renamed from: a */
    public void mo39606a(File file) {
        this.f2665g.mo41808a((Runnable) new C3597ke(this.f2660b, file, new C4234wm<C3615kv>() {
            /* renamed from: a */
            public void mo39609a(C3615kv kvVar) {
                C3175be.this.m2211a(new C3427fn(kvVar.mo40377h(), kvVar.mo40376g(), kvVar.mo40374e(), kvVar.mo40375f(), kvVar.mo40378i()), C3125af.m1946a(kvVar.mo40371b(), kvVar.mo40370a(), kvVar.mo40372c(), kvVar.mo40373d(), C4206vr.m5906a(kvVar.mo40377h())), new C3373eg(new C4056su.C4058a(), new C3373eg.C3374a(), (ResultReceiver) null));
            }
        }));
    }

    /* renamed from: f */
    private void m2227f() {
        C4143uk ukVar = this.f2659a;
        if (ukVar != null) {
            mo39605a(ukVar);
        }
        m2219c(this.f2659a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39605a(C4143uk ukVar) {
        C4129ub ubVar = ukVar.f5104r;
        if (ubVar == null) {
            C3350dr.m3043a().mo39928a((Class<? extends C3356dt>) C3366ea.class);
        } else {
            C3350dr.m3043a().mo39931b((C3356dt) new C3366ea(ubVar));
        }
    }

    /* renamed from: b */
    private void m2214b(Intent intent, int i) {
        if (intent != null) {
            intent.getExtras().setClassLoader(CounterConfiguration.class.getClassLoader());
            m2224e(intent);
        }
        this.f2661c.mo39312a(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m2228g() {
        C3804ox oxVar = this.f2669k;
        if (oxVar != null) {
            oxVar.mo40819a((Object) this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m2230h() {
        C3804ox oxVar = this.f2669k;
        if (oxVar != null) {
            oxVar.mo40821b(this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.be$a */
    final class C3186a implements Runnable {

        /* renamed from: b */
        private final C4217w f2684b;

        /* renamed from: c */
        private final Bundle f2685c;

        /* renamed from: d */
        private final Context f2686d;

        C3186a(Context context, C4217w wVar, Bundle bundle) {
            this.f2686d = context.getApplicationContext();
            this.f2684b = wVar;
            this.f2685c = bundle;
        }

        public void run() {
            C3427fn a;
            C3175be.this.f2664f.mo39514a();
            C3369ed edVar = new C3369ed(this.f2685c);
            if (!C3175be.this.mo39607a(edVar) && (a = C3427fn.m3288a(edVar)) != null) {
                C3373eg egVar = new C3373eg(edVar);
                C3175be.this.f2666h.mo40119a(a, egVar).mo40102a(this.f2684b, egVar);
            }
        }
    }

    /* renamed from: d */
    private boolean m2222d(Intent intent) {
        return intent == null || intent.getData() == null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo39607a(C3369ed edVar) {
        return edVar == null || edVar.mo39946g() == null || !this.f2660b.getPackageName().equals(edVar.mo39946g().mo39962h()) || edVar.mo39946g().mo39961g() != 85;
    }

    /* renamed from: e */
    private void m2224e(Intent intent) {
        if (!m2222d(intent)) {
            C3369ed edVar = new C3369ed(intent.getExtras());
            if (!mo39607a(edVar)) {
                C4217w b = C4217w.m5949b(intent.getExtras());
                if (!b.mo41742m() && !b.mo41743n()) {
                    try {
                        m2211a(C3427fn.m3288a(edVar), b, new C3373eg(edVar));
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2211a(C3427fn fnVar, C4217w wVar, C3373eg egVar) {
        this.f2666h.mo40119a(fnVar, egVar).mo40102a(wVar, egVar);
        this.f2666h.mo40120a(fnVar.mo40111b(), fnVar.mo40112c().intValue(), fnVar.mo40113d());
    }

    /* renamed from: a */
    private void m2212a(C4217w wVar, Bundle bundle) {
        if (!wVar.mo41743n()) {
            this.f2665g.mo41808a((Runnable) new C3186a(this.f2660b, wVar, bundle));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m2219c(C4143uk ukVar) {
        C3804ox oxVar = this.f2669k;
        if (oxVar != null) {
            oxVar.mo40818a(ukVar, this.f2668j.mo39620c());
        }
    }

    /* renamed from: i */
    private void m2233i() {
        final C3560jk jkVar = new C3560jk(this.f2660b);
        C3136al.m1993a().mo39495j().mo41837i().mo41808a((Runnable) new Runnable() {
            public void run() {
                try {
                    jkVar.mo40308a();
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m2235j() {
        if (this.f2659a != null) {
            C3136al.m1993a().mo39491f().mo41433a(this.f2659a);
        }
    }
}
