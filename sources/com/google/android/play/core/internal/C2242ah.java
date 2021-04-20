package com.google.android.play.core.internal;

import com.google.android.play.core.tasks.C2415i;

/* renamed from: com.google.android.play.core.internal.ah */
public abstract class C2242ah implements Runnable {

    /* renamed from: a */
    private final C2415i<?> f1909a;

    C2242ah() {
        this.f1909a = null;
    }

    public C2242ah(C2415i<?> iVar) {
        this.f1909a = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo33529a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C2415i<?> mo33813b() {
        return this.f1909a;
    }

    public final void run() {
        try {
            mo33529a();
        } catch (Exception e) {
            C2415i<?> iVar = this.f1909a;
            if (iVar != null) {
                iVar.mo34075d(e);
            }
        }
    }
}
