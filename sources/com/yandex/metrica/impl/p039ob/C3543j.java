package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3623l;

/* renamed from: com.yandex.metrica.impl.ob.j */
public class C3543j {
    /* renamed from: a */
    public C3623l.C3624a mo40268a(int i) {
        if (C3306cx.m2857a(28)) {
            return m3559b(i);
        }
        return null;
    }

    /* renamed from: b */
    private C3623l.C3624a m3559b(int i) {
        if (i == 10) {
            return C3623l.C3624a.ACTIVE;
        }
        if (i == 20) {
            return C3623l.C3624a.WORKING_SET;
        }
        if (i == 30) {
            return C3623l.C3624a.FREQUENT;
        }
        if (i != 40) {
            return null;
        }
        return C3623l.C3624a.RARE;
    }

    /* renamed from: com.yandex.metrica.impl.ob.j$1 */
    static /* synthetic */ class C35441 {

        /* renamed from: a */
        static final /* synthetic */ int[] f3441a = new int[C3623l.C3624a.values().length];

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
                f3441a = r0
                int[] r0 = f3441a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.yandex.metrica.impl.ob.l$a r1 = com.yandex.metrica.impl.p039ob.C3623l.C3624a.ACTIVE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f3441a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.yandex.metrica.impl.ob.l$a r1 = com.yandex.metrica.impl.p039ob.C3623l.C3624a.WORKING_SET     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f3441a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.yandex.metrica.impl.ob.l$a r1 = com.yandex.metrica.impl.p039ob.C3623l.C3624a.FREQUENT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f3441a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.yandex.metrica.impl.ob.l$a r1 = com.yandex.metrica.impl.p039ob.C3623l.C3624a.RARE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3543j.C35441.<clinit>():void");
        }
    }

    /* renamed from: a */
    public String mo40269a(C3623l.C3624a aVar) {
        if (aVar == null) {
            return null;
        }
        int i = C35441.f3441a[aVar.ordinal()];
        if (i == 1) {
            return "ACTIVE";
        }
        if (i == 2) {
            return "WORKING_SET";
        }
        if (i == 3) {
            return "FREQUENT";
        }
        if (i != 4) {
            return null;
        }
        return "RARE";
    }
}
