package com.yandex.metrica.impl.p039ob;

import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.p */
public interface C3807p {

    /* renamed from: com.yandex.metrica.impl.ob.p$a */
    public static class C3808a<T> {

        /* renamed from: a */
        public static final long f4039a = TimeUnit.SECONDS.toMillis(10);

        /* renamed from: b */
        private long f4040b;

        /* renamed from: c */
        private long f4041c;

        /* renamed from: d */
        private T f4042d;

        /* renamed from: e */
        private boolean f4043e;

        public C3808a() {
            this(f4039a);
        }

        public C3808a(long j) {
            this.f4041c = 0;
            this.f4042d = null;
            this.f4043e = true;
            this.f4040b = j;
        }

        /* renamed from: a */
        public T mo40823a() {
            return this.f4042d;
        }

        /* renamed from: a */
        public void mo40824a(T t) {
            this.f4042d = t;
            m4449e();
            this.f4043e = false;
        }

        /* renamed from: b */
        public final boolean mo40826b() {
            return this.f4042d == null;
        }

        /* renamed from: e */
        private void m4449e() {
            this.f4041c = System.currentTimeMillis();
        }

        /* renamed from: a */
        public final boolean mo40825a(long j) {
            long currentTimeMillis = System.currentTimeMillis() - this.f4041c;
            return currentTimeMillis > j || currentTimeMillis < 0;
        }

        /* renamed from: c */
        public final boolean mo40827c() {
            return mo40825a(this.f4040b);
        }

        /* renamed from: d */
        public T mo40828d() {
            if (mo40827c()) {
                return null;
            }
            return this.f4042d;
        }
    }
}
