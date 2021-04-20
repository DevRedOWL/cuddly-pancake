package com.yandex.metrica.impl.p039ob;

import android.bluetooth.le.ScanSettings;
import com.yandex.metrica.impl.p039ob.C4107tt;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.dk */
public class C3339dk {

    /* renamed from: a */
    private static final Map<C4107tt.C4112b.C4116d, Integer> f3061a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(C4107tt.C4112b.C4116d.LOW_POWER, 0);
        hashMap.put(C4107tt.C4112b.C4116d.BALANCED, 1);
        hashMap.put(C4107tt.C4112b.C4116d.LOW_LATENCY, 2);
        f3061a = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public ScanSettings mo39909a(C4107tt.C4112b bVar) {
        ScanSettings.Builder builder = new ScanSettings.Builder();
        builder.setScanMode(m3021a(bVar.f4974d));
        builder.setReportDelay(bVar.f4975e);
        if (C3306cx.m2857a(23)) {
            builder.setCallbackType(m3018a(bVar.f4971a));
            builder.setMatchMode(m3019a(bVar.f4972b));
            builder.setNumOfMatches(m3020a(bVar.f4973c));
        }
        return builder.build();
    }

    /* renamed from: a */
    private int m3021a(C4107tt.C4112b.C4116d dVar) {
        Integer num = f3061a.get(dVar);
        if (num == null) {
            return 2;
        }
        return num.intValue();
    }

    /* renamed from: a */
    private int m3018a(C4107tt.C4112b.C4113a aVar) {
        int i = C33401.f3062a[aVar.ordinal()];
        if (i != 1) {
            return i != 2 ? 1 : 2;
        }
        return 4;
    }

    /* renamed from: a */
    private int m3019a(C4107tt.C4112b.C4114b bVar) {
        return C4107tt.C4112b.C4114b.AGGRESSIVE.equals(bVar) ? 1 : 2;
    }

    /* renamed from: com.yandex.metrica.impl.ob.dk$1 */
    static /* synthetic */ class C33401 {

        /* renamed from: a */
        static final /* synthetic */ int[] f3062a = new int[C4107tt.C4112b.C4113a.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f3063b = new int[C4107tt.C4112b.C4115c.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|(2:5|6)|7|9|10|11|12|14) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0032 */
        static {
            /*
                com.yandex.metrica.impl.ob.tt$b$c[] r0 = com.yandex.metrica.impl.p039ob.C4107tt.C4112b.C4115c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3063b = r0
                r0 = 1
                int[] r1 = f3063b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.yandex.metrica.impl.ob.tt$b$c r2 = com.yandex.metrica.impl.p039ob.C4107tt.C4112b.C4115c.ONE_AD     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f3063b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.yandex.metrica.impl.ob.tt$b$c r3 = com.yandex.metrica.impl.p039ob.C4107tt.C4112b.C4115c.FEW_AD     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                com.yandex.metrica.impl.ob.tt$b$a[] r2 = com.yandex.metrica.impl.p039ob.C4107tt.C4112b.C4113a.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f3062a = r2
                int[] r2 = f3062a     // Catch:{ NoSuchFieldError -> 0x0032 }
                com.yandex.metrica.impl.ob.tt$b$a r3 = com.yandex.metrica.impl.p039ob.C4107tt.C4112b.C4113a.MATCH_LOST     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f3062a     // Catch:{ NoSuchFieldError -> 0x003c }
                com.yandex.metrica.impl.ob.tt$b$a r2 = com.yandex.metrica.impl.p039ob.C4107tt.C4112b.C4113a.FIRST_MATCH     // Catch:{ NoSuchFieldError -> 0x003c }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3339dk.C33401.<clinit>():void");
        }
    }

    /* renamed from: a */
    private int m3020a(C4107tt.C4112b.C4115c cVar) {
        int i = C33401.f3063b[cVar.ordinal()];
        if (i != 1) {
            return i != 2 ? 3 : 2;
        }
        return 1;
    }
}
