package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.os.ResultReceiver;
import com.yandex.metrica.CounterConfiguration;

/* renamed from: com.yandex.metrica.impl.ob.cj */
public class C3268cj {

    /* renamed from: a */
    private final String f2886a;

    /* renamed from: b */
    private final Context f2887b;

    /* renamed from: c */
    private final CounterConfiguration.C3075a f2888c;

    /* renamed from: d */
    private final C3271cl f2889d;

    public C3268cj(String str, Context context, CounterConfiguration.C3075a aVar, C3271cl clVar) {
        this.f2886a = str;
        this.f2887b = context;
        int i = C32691.f2890a[aVar.ordinal()];
        if (i == 1) {
            this.f2888c = CounterConfiguration.C3075a.SELF_DIAGNOSTIC_MAIN;
        } else if (i != 2) {
            this.f2888c = null;
        } else {
            this.f2888c = CounterConfiguration.C3075a.SELF_DIAGNOSTIC_MANUAL;
        }
        this.f2889d = clVar;
    }

    /* renamed from: com.yandex.metrica.impl.ob.cj$1 */
    static /* synthetic */ class C32691 {

        /* renamed from: a */
        static final /* synthetic */ int[] f2890a = new int[CounterConfiguration.C3075a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.yandex.metrica.CounterConfiguration$a[] r0 = com.yandex.metrica.CounterConfiguration.C3075a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2890a = r0
                int[] r0 = f2890a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.yandex.metrica.CounterConfiguration$a r1 = com.yandex.metrica.CounterConfiguration.C3075a.MAIN     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f2890a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.yandex.metrica.CounterConfiguration$a r1 = com.yandex.metrica.CounterConfiguration.C3075a.MANUAL     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3268cj.C32691.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo39811a(C4217w wVar) {
        if (this.f2888c != null) {
            try {
                CounterConfiguration counterConfiguration = new CounterConfiguration(this.f2886a);
                counterConfiguration.mo39225a(this.f2888c);
                this.f2889d.mo39813a(wVar.mo41722a(new C3245bz(new C3370ee(this.f2887b, (ResultReceiver) null), counterConfiguration).mo39750b()));
            } catch (Throwable unused) {
            }
        }
    }
}
