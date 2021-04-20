package com.yandex.metrica.impl.p039ob;

import android.location.Location;
import com.yandex.metrica.impl.p039ob.C3774oh;
import com.yandex.metrica.impl.p039ob.C3884rh;
import java.util.concurrent.TimeUnit;
import org.mobileid.access.key.NetworkKey;

/* renamed from: com.yandex.metrica.impl.ob.pb */
public class C3810pb {
    /* renamed from: a */
    public C3884rh.C3886b.C3888b mo40830a(C3795os osVar) {
        C3884rh.C3886b.C3888b bVar = new C3884rh.C3886b.C3888b();
        Location c = osVar.mo40800c();
        bVar.f4267b = osVar.mo40798a() == null ? bVar.f4267b : osVar.mo40798a().longValue();
        bVar.f4269d = TimeUnit.MILLISECONDS.toSeconds(c.getTime());
        bVar.f4277l = m4457a(osVar.f3999a);
        bVar.f4268c = TimeUnit.MILLISECONDS.toSeconds(osVar.mo40799b());
        bVar.f4278m = TimeUnit.MILLISECONDS.toSeconds(osVar.mo40801d());
        bVar.f4270e = c.getLatitude();
        bVar.f4271f = c.getLongitude();
        bVar.f4272g = Math.round(c.getAccuracy());
        bVar.f4273h = Math.round(c.getBearing());
        bVar.f4274i = Math.round(c.getSpeed());
        bVar.f4275j = (int) Math.round(c.getAltitude());
        bVar.f4276k = m4458a(c.getProvider());
        return bVar;
    }

    /* renamed from: com.yandex.metrica.impl.ob.pb$1 */
    static /* synthetic */ class C38111 {

        /* renamed from: a */
        static final /* synthetic */ int[] f4046a = new int[C3774oh.C3775a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.yandex.metrica.impl.ob.oh$a[] r0 = com.yandex.metrica.impl.p039ob.C3774oh.C3775a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4046a = r0
                int[] r0 = f4046a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.yandex.metrica.impl.ob.oh$a r1 = com.yandex.metrica.impl.p039ob.C3774oh.C3775a.FOREGROUND     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f4046a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.yandex.metrica.impl.ob.oh$a r1 = com.yandex.metrica.impl.p039ob.C3774oh.C3775a.BACKGROUND     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3810pb.C38111.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static int m4457a(C3774oh.C3775a aVar) {
        int i = C38111.f4046a[aVar.ordinal()];
        return (i == 1 || i != 2) ? 0 : 1;
    }

    /* renamed from: a */
    private static int m4458a(String str) {
        if ("gps".equals(str)) {
            return 1;
        }
        return NetworkKey.DEFAULT_STORAGE_ID.equals(str) ? 2 : 0;
    }
}
