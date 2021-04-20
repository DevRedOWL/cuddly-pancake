package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3125af;
import java.util.LinkedList;

/* renamed from: com.yandex.metrica.impl.ob.gq */
public class C3468gq extends C3470gr<C3489hd> {

    /* renamed from: a */
    private final C3499hn f3325a;

    /* renamed from: b */
    private final C3526im f3326b;

    /* renamed from: c */
    private final C3495hj f3327c;

    public C3468gq(C3391en enVar) {
        this.f3325a = new C3499hn(enVar);
        this.f3326b = new C3526im(enVar);
        this.f3327c = new C3495hj(enVar);
    }

    /* renamed from: a */
    public C3466go<C3489hd> mo40158a(int i) {
        LinkedList linkedList = new LinkedList();
        int i2 = C34691.f3328a[C3125af.C3126a.m1967a(i).ordinal()];
        if (i2 == 1) {
            linkedList.add(this.f3326b);
            linkedList.add(this.f3325a);
        } else if (i2 == 2) {
            linkedList.add(this.f3325a);
        } else if (i2 == 3) {
            linkedList.add(this.f3327c);
        }
        return new C3465gn(linkedList);
    }

    /* renamed from: com.yandex.metrica.impl.ob.gq$1 */
    static /* synthetic */ class C34691 {

        /* renamed from: a */
        static final /* synthetic */ int[] f3328a = new int[C3125af.C3126a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.yandex.metrica.impl.ob.af$a[] r0 = com.yandex.metrica.impl.p039ob.C3125af.C3126a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3328a = r0
                int[] r0 = f3328a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.yandex.metrica.impl.ob.af$a r1 = com.yandex.metrica.impl.p039ob.C3125af.C3126a.EVENT_TYPE_START     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f3328a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.yandex.metrica.impl.ob.af$a r1 = com.yandex.metrica.impl.p039ob.C3125af.C3126a.EVENT_TYPE_INIT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f3328a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.yandex.metrica.impl.ob.af$a r1 = com.yandex.metrica.impl.p039ob.C3125af.C3126a.EVENT_TYPE_UPDATE_FOREGROUND_TIME     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3468gq.C34691.<clinit>():void");
        }
    }
}
