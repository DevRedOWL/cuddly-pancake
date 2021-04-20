package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3877rg;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.ks */
public class C3612ks implements C3713mq<Throwable, C3877rg.C3883f> {

    /* renamed from: a */
    private C3609kp f3565a = new C3609kp();

    /* renamed from: a */
    public C3877rg.C3883f mo40225b(Throwable th) {
        return m3718a(th, 1, 0);
    }

    /* renamed from: a */
    private C3877rg.C3883f m3718a(Throwable th, int i, int i2) {
        C3877rg.C3883f fVar = new C3877rg.C3883f();
        fVar.f4242b = th.getClass().getName();
        fVar.f4243c = C4232wk.m6042b(th.getMessage(), "");
        fVar.f4244d = this.f3565a.mo40225b((List<StackTraceElement>) Arrays.asList(C3306cx.m2871b(th)));
        if (th.getCause() != null && i2 < i) {
            fVar.f4245e = m3718a(th.getCause(), 30, i2 + 1);
        }
        if (!C3306cx.m2857a(19) || i2 >= i) {
            fVar.f4246f = new C3877rg.C3883f[0];
        } else {
            m3719a(fVar, th.getSuppressed(), i2);
        }
        return fVar;
    }

    /* renamed from: a */
    public Throwable mo40224a(C3877rg.C3883f fVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private void m3719a(C3877rg.C3883f fVar, Throwable[] thArr, int i) {
        int i2 = 0;
        if (thArr == null) {
            fVar.f4246f = new C3877rg.C3883f[0];
            return;
        }
        fVar.f4246f = new C3877rg.C3883f[thArr.length];
        int length = thArr.length;
        int i3 = 0;
        while (i2 < length) {
            fVar.f4246f[i3] = m3718a(thArr[i2], 1, i + 1);
            i2++;
            i3++;
        }
    }
}
