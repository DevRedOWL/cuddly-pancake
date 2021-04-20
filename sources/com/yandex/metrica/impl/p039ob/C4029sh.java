package com.yandex.metrica.impl.p039ob;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: com.yandex.metrica.impl.ob.sh */
public class C4029sh implements InvocationHandler {

    /* renamed from: a */
    private Object f4735a;

    /* renamed from: b */
    private final C4035sk f4736b;

    C4029sh(Object obj, C4035sk skVar) {
        this.f4735a = obj;
        this.f4736b = skVar;
    }

    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!"onInstallReferrerSetupFinished".equals(method.getName())) {
            C4035sk skVar = this.f4736b;
            skVar.mo39735a((Throwable) new IllegalArgumentException("Unexpected method called " + method.getName()));
            return null;
        } else if (objArr.length != 1) {
            this.f4736b.mo39735a((Throwable) new IllegalArgumentException("Args size is not equal to one."));
            return null;
        } else if (objArr[0].equals(0)) {
            try {
                Object invoke = this.f4735a.getClass().getMethod("getInstallReferrer", new Class[0]).invoke(this.f4735a, new Object[0]);
                this.f4736b.mo39734a(new C4034sj((String) invoke.getClass().getMethod("getInstallReferrer", new Class[0]).invoke(invoke, new Object[0]), ((Long) invoke.getClass().getMethod("getReferrerClickTimestampSeconds", new Class[0]).invoke(invoke, new Object[0])).longValue(), ((Long) invoke.getClass().getMethod("getInstallBeginTimestampSeconds", new Class[0]).invoke(invoke, new Object[0])).longValue()));
                return null;
            } catch (Throwable th) {
                this.f4736b.mo39735a(th);
                return null;
            }
        } else {
            C4035sk skVar2 = this.f4736b;
            skVar2.mo39735a((Throwable) new IllegalStateException("Referrer check failed with error " + objArr[0]));
            return null;
        }
    }
}
