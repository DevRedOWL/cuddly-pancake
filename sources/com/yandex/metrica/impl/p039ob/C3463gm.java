package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3125af;
import java.util.ArrayList;

/* renamed from: com.yandex.metrica.impl.ob.gm */
public class C3463gm extends C3470gr<C3473gt> {

    /* renamed from: a */
    private final C3509hx f3318a;

    public C3463gm(C3376ei eiVar) {
        this.f3318a = new C3509hx(eiVar);
    }

    /* renamed from: a */
    public C3466go<C3473gt> mo40158a(int i) {
        ArrayList arrayList = new ArrayList();
        int i2 = C34641.f3319a[C3125af.C3126a.m1967a(i).ordinal()];
        if (i2 == 1) {
            arrayList.add(this.f3318a.mo40183a());
        } else if (i2 == 2) {
            arrayList.add(this.f3318a.mo40184b());
        } else if (i2 == 3) {
            arrayList.add(this.f3318a.mo40185c());
        } else if (i2 == 4) {
            arrayList.add(this.f3318a.mo40186d());
        }
        return new C3465gn(arrayList);
    }

    /* renamed from: com.yandex.metrica.impl.ob.gm$1 */
    static /* synthetic */ class C34641 {

        /* renamed from: a */
        static final /* synthetic */ int[] f3319a = new int[C3125af.C3126a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.yandex.metrica.impl.ob.af$a[] r0 = com.yandex.metrica.impl.p039ob.C3125af.C3126a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3319a = r0
                int[] r0 = f3319a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.yandex.metrica.impl.ob.af$a r1 = com.yandex.metrica.impl.p039ob.C3125af.C3126a.EVENT_TYPE_REFERRER_RECEIVED_FROM_BROADCAST     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f3319a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.yandex.metrica.impl.ob.af$a r1 = com.yandex.metrica.impl.p039ob.C3125af.C3126a.EVENT_TYPE_STARTUP     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f3319a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.yandex.metrica.impl.ob.af$a r1 = com.yandex.metrica.impl.p039ob.C3125af.C3126a.EVENT_TYPE_REFERRER_OBTAINED_FROM_SERVICES     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f3319a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.yandex.metrica.impl.ob.af$a r1 = com.yandex.metrica.impl.p039ob.C3125af.C3126a.EVENT_TYPE_UPDATE_PRE_ACTIVATION_CONFIG     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3463gm.C34641.<clinit>():void");
        }
    }
}
