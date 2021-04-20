package com.yandex.metrica.push.impl;

import com.yandex.metrica.push.impl.C4386e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.yandex.metrica.push.impl.ar */
public class C4333ar implements C4386e {

    /* renamed from: a */
    private final List<C4386e> f5439a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private final List<Object> f5440b = new ArrayList();

    /* renamed from: a */
    public C4386e.C4387a mo41961a(C4402o oVar) {
        for (C4386e a : this.f5439a) {
            C4386e.C4387a a2 = a.mo41961a(oVar);
            int i = C43341.f5441a[a2.f5503a.ordinal()];
            if (i != 1 && i == 2) {
                return m6314a(a2);
            }
        }
        return m6314a(C4386e.C4387a.m6482a());
    }

    /* renamed from: com.yandex.metrica.push.impl.ar$1 */
    static /* synthetic */ class C43341 {

        /* renamed from: a */
        static final /* synthetic */ int[] f5441a = new int[C4386e.C4388b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.yandex.metrica.push.impl.e$b[] r0 = com.yandex.metrica.push.impl.C4386e.C4388b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5441a = r0
                int[] r0 = f5441a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.yandex.metrica.push.impl.e$b r1 = com.yandex.metrica.push.impl.C4386e.C4388b.SHOW     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f5441a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.yandex.metrica.push.impl.e$b r1 = com.yandex.metrica.push.impl.C4386e.C4388b.SILENCE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.push.impl.C4333ar.C43341.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo41963a(C4386e eVar) {
        this.f5439a.add(eVar);
    }

    /* renamed from: a */
    private C4386e.C4387a m6314a(C4386e.C4387a aVar) {
        Iterator<Object> it = this.f5440b.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return aVar;
    }
}
