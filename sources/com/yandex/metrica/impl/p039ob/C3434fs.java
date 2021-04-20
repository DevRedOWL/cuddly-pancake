package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.os.ResultReceiver;

/* renamed from: com.yandex.metrica.impl.ob.fs */
public class C3434fs implements C3430fp, C4140uh {

    /* renamed from: a */
    private final Context f3267a;

    /* renamed from: b */
    private C3376ei f3268b;

    /* renamed from: c */
    private final ResultReceiver f3269c;

    /* renamed from: a */
    public void mo39982a(C4134ue ueVar, C4143uk ukVar) {
    }

    public C3434fs(Context context, C3376ei eiVar, C3373eg egVar) {
        this.f3267a = context;
        this.f3268b = eiVar;
        this.f3269c = egVar.f3106c;
        this.f3268b.mo39981a(this);
    }

    /* renamed from: a */
    public void mo40102a(C4217w wVar, C3373eg egVar) {
        this.f3268b.mo39979a(egVar.f3105b);
        this.f3268b.mo39984a(wVar, this);
    }

    /* renamed from: a */
    public void mo39983a(C4143uk ukVar) {
        C4248x.m6079a(this.f3269c, ukVar);
    }

    /* renamed from: a */
    public void mo40101a() {
        this.f3268b.mo39986b(this);
    }

    /* renamed from: b */
    public C3376ei mo40125b() {
        return this.f3268b;
    }
}
