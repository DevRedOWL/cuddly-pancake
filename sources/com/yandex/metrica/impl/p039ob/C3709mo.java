package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3623l;
import com.yandex.metrica.impl.p039ob.C3913rm;

/* renamed from: com.yandex.metrica.impl.ob.mo */
public class C3709mo implements C3713mq<C3623l, C3913rm.C3914a.C3915a> {
    /* renamed from: a */
    public C3913rm.C3914a.C3915a mo40225b(C3623l lVar) {
        C3913rm.C3914a.C3915a aVar = new C3913rm.C3914a.C3915a();
        if (lVar.f3613a != null) {
            int i = C37101.f3824a[lVar.f3613a.ordinal()];
            if (i == 1) {
                aVar.f4398b = 1;
            } else if (i == 2) {
                aVar.f4398b = 2;
            } else if (i == 3) {
                aVar.f4398b = 3;
            } else if (i == 4) {
                aVar.f4398b = 4;
            }
        }
        if (lVar.f3614b != null) {
            if (lVar.f3614b.booleanValue()) {
                aVar.f4399c = 1;
            } else {
                aVar.f4399c = 0;
            }
        }
        return aVar;
    }

    /* renamed from: com.yandex.metrica.impl.ob.mo$1 */
    static /* synthetic */ class C37101 {

        /* renamed from: a */
        static final /* synthetic */ int[] f3824a = new int[C3623l.C3624a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.yandex.metrica.impl.ob.l$a[] r0 = com.yandex.metrica.impl.p039ob.C3623l.C3624a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3824a = r0
                int[] r0 = f3824a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.yandex.metrica.impl.ob.l$a r1 = com.yandex.metrica.impl.p039ob.C3623l.C3624a.ACTIVE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f3824a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.yandex.metrica.impl.ob.l$a r1 = com.yandex.metrica.impl.p039ob.C3623l.C3624a.WORKING_SET     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f3824a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.yandex.metrica.impl.ob.l$a r1 = com.yandex.metrica.impl.p039ob.C3623l.C3624a.FREQUENT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f3824a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.yandex.metrica.impl.ob.l$a r1 = com.yandex.metrica.impl.p039ob.C3623l.C3624a.RARE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3709mo.C37101.<clinit>():void");
        }
    }

    /* renamed from: a */
    public C3623l mo40224a(C3913rm.C3914a.C3915a aVar) {
        C3623l.C3624a aVar2;
        int i = aVar.f4398b;
        boolean z = null;
        if (i == 1) {
            aVar2 = C3623l.C3624a.ACTIVE;
        } else if (i == 2) {
            aVar2 = C3623l.C3624a.WORKING_SET;
        } else if (i != 3) {
            aVar2 = i != 4 ? null : C3623l.C3624a.RARE;
        } else {
            aVar2 = C3623l.C3624a.FREQUENT;
        }
        int i2 = aVar.f4399c;
        if (i2 == 0) {
            z = false;
        } else if (i2 == 1) {
            z = true;
        }
        return new C3623l(aVar2, z);
    }
}
