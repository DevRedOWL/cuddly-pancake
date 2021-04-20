package com.yandex.metrica.impl.p039ob;

import android.net.Uri;
import com.loopj.android.http.AsyncHttpClient;
import com.yandex.metrica.impl.p039ob.C3452gh;
import java.util.Collection;

/* renamed from: com.yandex.metrica.impl.ob.gg */
public class C3451gg extends C3212bs<C4060sv> {

    /* renamed from: j */
    private final C3458gj f3288j;

    /* renamed from: k */
    private final C4217w f3289k;

    /* renamed from: l */
    private final C3459gk f3290l;

    /* renamed from: m */
    private final C3452gh.C3454a f3291m;

    /* renamed from: n */
    private final C4228wh f3292n;

    /* renamed from: o */
    private C4200vm f3293o;

    /* renamed from: p */
    private final String f3294p;

    /* renamed from: q */
    private final C3688lw f3295q;

    /* renamed from: r */
    private C3455gi f3296r;

    public C3451gg(C3458gj gjVar, C4217w wVar, C3459gk gkVar, C3688lw lwVar) {
        this(gjVar, wVar, gkVar, lwVar, new C3452gh.C3454a(), new C4227wg(), new C4200vm(), new C4060sv());
    }

    public C3451gg(C3458gj gjVar, C4217w wVar, C3459gk gkVar, C3688lw lwVar, C3452gh.C3454a aVar, C4228wh whVar, C4200vm vmVar, C4060sv svVar) {
        super(new C3117ab(), svVar);
        this.f3288j = gjVar;
        this.f3289k = wVar;
        this.f3290l = gkVar;
        this.f3295q = lwVar;
        this.f3291m = aVar;
        this.f3292n = whVar;
        this.f3293o = vmVar;
        this.f3294p = getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    /* renamed from: a */
    public boolean mo39664a() {
        this.f3296r = this.f3288j.mo40134d();
        if (!(this.f3296r.mo41291f() && !C3306cx.m2861a((Collection) this.f3296r.mo40139a()))) {
            return false;
        }
        mo39660a(this.f3296r.mo40139a());
        byte[] a = this.f3291m.mo40138a(this.f3289k, this.f3296r, this.f3290l, this.f3295q).mo40137a();
        byte[] bArr = null;
        try {
            bArr = this.f3293o.mo41695a(a);
        } catch (Throwable unused) {
        }
        if (!C3306cx.m2863a(bArr)) {
            mo39658a("Content-Encoding", AsyncHttpClient.ENCODING_GZIP);
            a = bArr;
        }
        mo39663a(a);
        return true;
    }

    /* renamed from: d */
    public void mo39669d() {
        super.mo39669d();
        mo39653a(this.f3292n.mo41768a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo39654a(Uri.Builder builder) {
        ((C4060sv) this.f2727i).mo41410a(builder, this.f3296r);
    }

    /* renamed from: t */
    public boolean mo39685t() {
        return super.mo39685t() & (400 != mo39676k());
    }

    /* renamed from: n */
    public String mo39679n() {
        return this.f3294p;
    }
}
