package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import com.yandex.metrica.impl.p039ob.C3913rm;
import com.yandex.metrica.impl.p039ob.C3919ro;
import com.yandex.metrica.impl.p039ob.C3922rp;
import com.yandex.metrica.impl.p039ob.C3926rq;
import com.yandex.metrica.impl.p039ob.C3929rr;

/* renamed from: com.yandex.metrica.impl.ob.no */
public class C3743no {

    /* renamed from: a */
    private C4238wq f3866a;

    public C3743no(Context context) {
        this(new C4238wq(context));
    }

    C3743no(C4238wq wqVar) {
        this.f3866a = wqVar;
    }

    /* renamed from: a */
    public C3699me<C3929rr.C3930a> mo40700a() {
        return new C3697mc(new C3704mj(), new C4239wr("AES/CBC/PKCS5Padding", this.f3866a.mo41780a(), this.f3866a.mo41781b()));
    }

    /* renamed from: b */
    public C3699me<C3919ro.C3920a> mo40701b() {
        return new C3697mc(new C3698md(), new C4239wr("AES/CBC/PKCS5Padding", this.f3866a.mo41780a(), this.f3866a.mo41781b()));
    }

    /* renamed from: c */
    public C3699me<C3913rm.C3914a> mo40702c() {
        return new C3697mc(new C3695ma(), new C4239wr("AES/CBC/PKCS5Padding", this.f3866a.mo41780a(), this.f3866a.mo41781b()));
    }

    /* renamed from: d */
    public C3699me<C3926rq.C3927a> mo40703d() {
        return new C3697mc(new C3703mi(), new C4239wr("AES/CBC/PKCS5Padding", this.f3866a.mo41780a(), this.f3866a.mo41781b()));
    }

    /* renamed from: e */
    public C3699me<C3922rp.C3923a> mo40704e() {
        return new C3697mc(new C3702mh(), new C4239wr("AES/CBC/PKCS5Padding", this.f3866a.mo41780a(), this.f3866a.mo41781b()));
    }
}
