package com.yandex.metrica.impl.p039ob;

import java.util.concurrent.Callable;

/* renamed from: com.yandex.metrica.impl.ob.wa */
public abstract class C4219wa<T> implements Callable<T> {
    /* renamed from: b */
    public abstract T mo41186b() throws Exception;

    public T call() {
        try {
            return mo41186b();
        } catch (Throwable unused) {
            return null;
        }
    }
}
