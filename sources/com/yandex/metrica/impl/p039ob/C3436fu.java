package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.fu */
public class C3436fu implements C3398ep {

    /* renamed from: a */
    private final HashMap<String, C3415fc> f3270a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<String, C3376ei> f3271b = new HashMap<>();

    /* renamed from: c */
    private final Context f3272c;

    public C3436fu(Context context) {
        this.f3272c = context.getApplicationContext();
    }

    /* renamed from: a */
    public synchronized C3415fc mo40126a(C3379ek ekVar) {
        return this.f3270a.get(ekVar.toString());
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.yandex.metrica.impl.ob.eq<com.yandex.metrica.impl.ob.fc>, com.yandex.metrica.impl.ob.eq] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.yandex.metrica.impl.p039ob.C3415fc mo40127a(com.yandex.metrica.impl.p039ob.C3379ek r2, com.yandex.metrica.impl.p039ob.C3373eg r3, com.yandex.metrica.impl.p039ob.C3399eq<com.yandex.metrica.impl.p039ob.C3415fc> r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, com.yandex.metrica.impl.ob.fc> r0 = r1.f3270a     // Catch:{ all -> 0x000b }
            com.yandex.metrica.impl.ob.ev r2 = r1.m3309a(r2, r3, r4, r0)     // Catch:{ all -> 0x000b }
            com.yandex.metrica.impl.ob.fc r2 = (com.yandex.metrica.impl.p039ob.C3415fc) r2     // Catch:{ all -> 0x000b }
            monitor-exit(r1)
            return r2
        L_0x000b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3436fu.mo40127a(com.yandex.metrica.impl.ob.ek, com.yandex.metrica.impl.ob.eg, com.yandex.metrica.impl.ob.eq):com.yandex.metrica.impl.ob.fc");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.yandex.metrica.impl.ob.eq, com.yandex.metrica.impl.ob.eq<com.yandex.metrica.impl.ob.ei>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.yandex.metrica.impl.p039ob.C3376ei mo40128b(com.yandex.metrica.impl.p039ob.C3379ek r2, com.yandex.metrica.impl.p039ob.C3373eg r3, com.yandex.metrica.impl.p039ob.C3399eq<com.yandex.metrica.impl.p039ob.C3376ei> r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, com.yandex.metrica.impl.ob.ei> r0 = r1.f3271b     // Catch:{ all -> 0x000b }
            com.yandex.metrica.impl.ob.ev r2 = r1.m3309a(r2, r3, r4, r0)     // Catch:{ all -> 0x000b }
            com.yandex.metrica.impl.ob.ei r2 = (com.yandex.metrica.impl.p039ob.C3376ei) r2     // Catch:{ all -> 0x000b }
            monitor-exit(r1)
            return r2
        L_0x000b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3436fu.mo40128b(com.yandex.metrica.impl.ob.ek, com.yandex.metrica.impl.ob.eg, com.yandex.metrica.impl.ob.eq):com.yandex.metrica.impl.ob.ei");
    }

    /* renamed from: a */
    private <T extends C3404ev> T m3309a(C3379ek ekVar, C3373eg egVar, C3399eq<T> eqVar, Map<String, T> map) {
        T t = (C3404ev) map.get(ekVar.toString());
        if (t == null) {
            T b = eqVar.mo39992b(this.f3272c, ekVar, egVar);
            map.put(ekVar.toString(), b);
            return b;
        }
        t.mo39980a(egVar);
        return t;
    }

    /* renamed from: c */
    public synchronized void mo39987c() {
        for (C3415fc c : this.f3270a.values()) {
            c.mo39987c();
        }
        for (C3376ei c2 : this.f3271b.values()) {
            c2.mo39987c();
        }
        this.f3270a.clear();
        this.f3271b.clear();
    }
}
