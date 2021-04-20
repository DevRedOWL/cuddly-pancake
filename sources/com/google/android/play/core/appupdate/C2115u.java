package com.google.android.play.core.appupdate;

import android.content.Context;
import com.google.android.play.core.splitcompat.C2345p;

/* renamed from: com.google.android.play.core.appupdate.u */
public final /* synthetic */ class C2115u {

    /* renamed from: a */
    private static C2117w f1486a;

    /* renamed from: a */
    static synchronized C2117w m808a(Context context) {
        C2117w wVar;
        synchronized (C2115u.class) {
            if (f1486a == null) {
                C2116v vVar = new C2116v((byte[]) null);
                vVar.mo33561b(new C2100f(C2345p.m1447c(context)));
                f1486a = vVar.mo33560a();
            }
            wVar = f1486a;
        }
        return wVar;
    }
}
