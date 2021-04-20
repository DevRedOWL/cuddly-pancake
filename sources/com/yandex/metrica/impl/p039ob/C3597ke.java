package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.ke */
public class C3597ke implements Runnable {

    /* renamed from: a */
    private final Context f3536a;

    /* renamed from: b */
    private final File f3537b;

    /* renamed from: c */
    private final C4234wm<C3615kv> f3538c;

    public C3597ke(Context context, File file, C4234wm<C3615kv> wmVar) {
        this.f3536a = context;
        this.f3537b = file;
        this.f3538c = wmVar;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0013 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r2 = this;
            java.io.File r0 = r2.f3537b
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0018
            android.content.Context r0 = r2.f3536a     // Catch:{ all -> 0x0013 }
            java.io.File r1 = r2.f3537b     // Catch:{ all -> 0x0013 }
            java.lang.String r0 = com.yandex.metrica.impl.p039ob.C3137am.m2009a((android.content.Context) r0, (java.io.File) r1)     // Catch:{ all -> 0x0013 }
            r2.mo40346a(r0)     // Catch:{ all -> 0x0013 }
        L_0x0013:
            java.io.File r0 = r2.f3537b     // Catch:{ all -> 0x0018 }
            r0.delete()     // Catch:{ all -> 0x0018 }
        L_0x0018:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3597ke.run():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo40346a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f3538c.mo39609a(new C3615kv(str));
            } catch (Throwable unused) {
            }
        }
    }
}
