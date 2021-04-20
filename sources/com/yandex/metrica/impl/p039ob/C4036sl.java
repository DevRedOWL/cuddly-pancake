package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import java.lang.reflect.Proxy;

/* renamed from: com.yandex.metrica.impl.ob.sl */
public class C4036sl {

    /* renamed from: a */
    private final Context f4755a;

    public C4036sl(Context context) {
        this.f4755a = context.getApplicationContext();
    }

    /* renamed from: a */
    public void mo41275a(final C4035sk skVar) {
        try {
            Class<?> cls = Class.forName("com.android.installreferrer.api.InstallReferrerClient");
            Object invoke = cls.getDeclaredMethod("newBuilder", new Class[]{Context.class}).invoke(cls, new Object[]{this.f4755a});
            Class<?> cls2 = Class.forName("com.android.installreferrer.api.InstallReferrerStateListener");
            final Object invoke2 = invoke.getClass().getDeclaredMethod("build", new Class[0]).invoke(invoke, new Object[0]);
            Object newProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new C4029sh(invoke2, new C4035sk() {
                /* renamed from: a */
                public void mo39734a(C4034sj sjVar) {
                    skVar.mo39734a(sjVar);
                    mo41276a();
                }

                /* renamed from: a */
                public void mo39735a(Throwable th) {
                    skVar.mo39735a(th);
                    mo41276a();
                }

                /* renamed from: a */
                public void mo41276a() {
                    Object obj = invoke2;
                    if (obj != null) {
                        try {
                            obj.getClass().getDeclaredMethod("endConnection", new Class[0]).invoke(invoke2, new Object[0]);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }));
            invoke2.getClass().getDeclaredMethod("startConnection", new Class[]{cls2}).invoke(invoke2, new Object[]{newProxyInstance});
        } catch (Throwable th) {
            skVar.mo39735a(th);
        }
    }
}
