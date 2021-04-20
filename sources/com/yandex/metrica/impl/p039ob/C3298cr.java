package com.yandex.metrica.impl.p039ob;

import android.net.Uri;
import org.mobileid.access.key.EncryptedKey;

/* renamed from: com.yandex.metrica.impl.ob.cr */
public class C3298cr extends C3212bs<C4066ta> {

    /* renamed from: j */
    private final C4146ul f2966j;

    /* renamed from: k */
    private boolean f2967k;

    /* renamed from: l */
    private C4134ue f2968l;

    /* renamed from: m */
    private final C4056su f2969m;

    /* renamed from: o */
    public boolean mo39680o() {
        return true;
    }

    public C3298cr(C4146ul ulVar, C4056su suVar) {
        this(ulVar, suVar, new C4066ta(new C4050ss()));
    }

    public C3298cr(C4146ul ulVar, C4056su suVar, C4066ta taVar) {
        super(new C3291cp(ulVar, suVar), taVar);
        this.f2967k = false;
        this.f2966j = ulVar;
        this.f2969m = suVar;
        mo39660a(this.f2969m.mo41392a());
    }

    /* renamed from: a */
    public boolean mo39664a() {
        if (this.f2726h >= 0) {
            return false;
        }
        mo39852b(false);
        mo39658a("Accept-Encoding", EncryptedKey.DEFAULT_STORAGE_ID);
        return this.f2966j.mo41607c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo39654a(Uri.Builder builder) {
        ((C4066ta) this.f2727i).mo41421a(builder, this.f2969m);
    }

    /* renamed from: b */
    public boolean mo39666b() {
        if (mo39851E()) {
            return true;
        }
        if (200 != this.f2723e) {
            return false;
        }
        boolean b = super.mo39666b();
        if (b) {
            return b;
        }
        this.f2968l = C4134ue.PARSE;
        return b;
    }

    /* renamed from: a */
    public void mo39659a(Throwable th) {
        this.f2968l = C4134ue.NETWORK;
    }

    /* renamed from: g */
    public void mo39672g() {
        super.mo39672g();
        this.f2968l = C4134ue.NETWORK;
    }

    /* renamed from: f */
    public void mo39671f() {
        if (!mo39689x() && mo39690y()) {
            if (this.f2968l == null) {
                this.f2968l = C4134ue.UNKNOWN;
            }
            this.f2966j.mo41601a(this.f2968l);
        }
    }

    /* renamed from: b */
    public synchronized void mo39852b(boolean z) {
        this.f2967k = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public synchronized boolean mo39851E() {
        return this.f2967k;
    }

    /* renamed from: n */
    public String mo39679n() {
        return "Startup task for component: " + this.f2966j.mo39985b().toString();
    }
}
