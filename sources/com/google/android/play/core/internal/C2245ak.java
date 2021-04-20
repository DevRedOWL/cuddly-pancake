package com.google.android.play.core.internal;

/* renamed from: com.google.android.play.core.internal.ak */
final class C2245ak extends C2242ah {

    /* renamed from: a */
    final /* synthetic */ C2251aq f1913a;

    C2245ak(C2251aq aqVar) {
        this.f1913a = aqVar;
    }

    /* renamed from: a */
    public final void mo33529a() {
        if (this.f1913a.f1929l != null) {
            this.f1913a.f1920c.mo33811d("Unbind from service.", new Object[0]);
            this.f1913a.f1919b.unbindService(this.f1913a.f1928k);
            this.f1913a.f1923f = false;
            this.f1913a.f1929l = null;
            this.f1913a.f1928k = null;
        }
    }
}
