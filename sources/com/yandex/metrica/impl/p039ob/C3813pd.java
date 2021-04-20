package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Collection;

/* renamed from: com.yandex.metrica.impl.ob.pd */
public class C3813pd extends C3209bp<C4062sx> {

    /* renamed from: j */
    private Context f4049j;

    /* renamed from: k */
    private C3817ph f4050k;

    /* renamed from: l */
    private final C3299cs f4051l;

    /* renamed from: m */
    private C3774oh f4052m;

    /* renamed from: n */
    private C3690ly f4053n;

    /* renamed from: o */
    private final C3815pf f4054o;

    /* renamed from: p */
    private long f4055p;

    /* renamed from: q */
    private C3814pe f4056q;

    public C3813pd(Context context, C3817ph phVar, C3299cs csVar) {
        this(context, phVar, csVar, new C3690ly(C3628ld.m3815a(context).mo40441c()), new C4062sx(), new C3815pf(context));
    }

    /* renamed from: a */
    public boolean mo39664a() {
        if (!this.f4051l.mo39858d() && !TextUtils.isEmpty(this.f4050k.mo41308r()) && !TextUtils.isEmpty(this.f4050k.mo41310t()) && !C3306cx.m2861a((Collection) mo39684s())) {
            return m4462H();
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo39666b() {
        boolean b = super.mo39666b();
        m4464J();
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo39654a(Uri.Builder builder) {
        ((C4062sx) this.f2727i).mo41413a(builder, this.f4050k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo39692E() {
        m4461G();
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo39693F() {
        m4461G();
    }

    /* renamed from: G */
    private void m4461G() {
        this.f4054o.mo40834a(this.f4056q);
    }

    /* renamed from: t */
    public boolean mo39685t() {
        return super.mo39685t() & (400 != mo39676k());
    }

    /* renamed from: H */
    private boolean m4462H() {
        this.f4056q = this.f4054o.mo40833a(this.f4052m.f3913h);
        if (!this.f4056q.mo40832a()) {
            return mo39694c(C3365e.m3064a((C3365e) this.f4056q.f4059c));
        }
        return false;
    }

    /* renamed from: I */
    private void m4463I() {
        this.f4055p = this.f4053n.mo40577b(-1) + 1;
        ((C4062sx) this.f2727i).mo41411a(this.f4055p);
    }

    /* renamed from: J */
    private void m4464J() {
        this.f4053n.mo40582c(this.f4055p).mo40567q();
    }

    C3813pd(Context context, C3817ph phVar, C3299cs csVar, C3690ly lyVar, C4062sx sxVar, C3815pf pfVar) {
        super(sxVar);
        this.f4049j = context;
        this.f4050k = phVar;
        this.f4051l = csVar;
        this.f4052m = this.f4050k.mo40836a();
        this.f4053n = lyVar;
        this.f4054o = pfVar;
        m4463I();
        mo39660a(this.f4050k.mo40837b());
    }
}
