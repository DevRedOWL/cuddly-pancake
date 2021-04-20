package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.play.core.splitinstall.q */
final class C2387q implements C2373d {

    /* renamed from: a */
    final /* synthetic */ SplitInstallSessionState f2122a;

    /* renamed from: b */
    final /* synthetic */ Intent f2123b;

    /* renamed from: c */
    final /* synthetic */ Context f2124c;

    /* renamed from: d */
    final /* synthetic */ C2389s f2125d;

    C2387q(C2389s sVar, SplitInstallSessionState splitInstallSessionState, Intent intent, Context context) {
        this.f2125d = sVar;
        this.f2122a = splitInstallSessionState;
        this.f2123b = intent;
        this.f2124c = context;
    }

    /* renamed from: a */
    public final void mo34024a() {
        this.f2125d.f2131d.post(new C2388r(this.f2125d, this.f2122a, 5, 0));
    }

    /* renamed from: b */
    public final void mo34025b() {
        if (!this.f2123b.getBooleanExtra("triggered_from_app_after_verification", false)) {
            this.f2123b.putExtra("triggered_from_app_after_verification", true);
            this.f2124c.sendBroadcast(this.f2123b);
            return;
        }
        this.f2125d.f1980a.mo33809b("Splits copied and verified more than once.", new Object[0]);
    }

    /* renamed from: c */
    public final void mo34026c(int i) {
        this.f2125d.f2131d.post(new C2388r(this.f2125d, this.f2122a, 6, i));
    }
}
