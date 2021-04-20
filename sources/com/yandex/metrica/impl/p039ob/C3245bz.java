package com.yandex.metrica.impl.p039ob;

import android.os.Bundle;
import com.yandex.metrica.CounterConfiguration;

/* renamed from: com.yandex.metrica.impl.ob.bz */
class C3245bz extends C3369ed {

    /* renamed from: a */
    protected C3124ae f2822a;

    /* renamed from: b */
    protected C3222bu f2823b;

    /* renamed from: c */
    private C3135ak f2824c = new C3135ak();

    protected C3245bz(C3370ee eeVar, CounterConfiguration counterConfiguration) {
        super(eeVar, counterConfiguration);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39747a(C4273xx xxVar) {
        this.f2822a = new C3124ae(xxVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Bundle mo39750b() {
        Bundle bundle = new Bundle();
        mo39947h().mo39224a(bundle);
        mo39946g().mo39955b(bundle);
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39746a(C4139ug ugVar) {
        mo39751b(ugVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo39752c() {
        this.f2824c.mo39483b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo39753d() {
        return this.f2824c.mo39482a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo39749a() {
        return this.f2824c.mo39484c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo39751b(C4139ug ugVar) {
        if (ugVar != null) {
            mo39947h().mo39235c(ugVar.mo41540a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39748a(String str, String str2) {
        this.f2822a.mo39461a(str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo39754e() {
        return this.f2822a.mo39460a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C3222bu mo39755f() {
        return this.f2823b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39745a(C3222bu buVar) {
        this.f2823b = buVar;
    }
}
