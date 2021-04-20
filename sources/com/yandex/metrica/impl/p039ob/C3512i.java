package com.yandex.metrica.impl.p039ob;

import android.util.Pair;

/* renamed from: com.yandex.metrica.impl.ob.i */
public class C3512i {

    /* renamed from: a */
    private C4214vx f3365a;

    /* renamed from: b */
    private long f3366b;

    /* renamed from: c */
    private boolean f3367c;

    /* renamed from: d */
    private final C4273xx f3368d;

    /* renamed from: com.yandex.metrica.impl.ob.i$a */
    public static final class C3513a {

        /* renamed from: a */
        public final String f3369a;

        /* renamed from: b */
        public final long f3370b;

        public C3513a(String str, long j) {
            this.f3369a = str;
            this.f3370b = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C3513a aVar = (C3513a) obj;
            if (this.f3370b != aVar.f3370b) {
                return false;
            }
            String str = this.f3369a;
            String str2 = aVar.f3369a;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
                return true;
            } else if (str2 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f3369a;
            int hashCode = str != null ? str.hashCode() : 0;
            long j = this.f3370b;
            return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        }
    }

    public C3512i(String str, long j, C4216vz vzVar) {
        this(str, j, new C4273xx(vzVar, "App Environment"));
    }

    C3512i(String str, long j, C4273xx xxVar) {
        this.f3366b = j;
        try {
            this.f3365a = new C4214vx(str);
        } catch (Throwable unused) {
            this.f3365a = new C4214vx();
            this.f3366b = 0;
        }
        this.f3368d = xxVar;
    }

    /* renamed from: a */
    public synchronized void mo40188a() {
        this.f3365a = new C4214vx();
        this.f3366b = 0;
    }

    /* renamed from: a */
    public synchronized void mo40189a(Pair<String, String> pair) {
        if (this.f3368d.mo41849a(this.f3365a, (String) pair.first, (String) pair.second)) {
            this.f3367c = true;
        }
    }

    /* renamed from: b */
    public synchronized C3513a mo40190b() {
        if (this.f3367c) {
            this.f3366b++;
            this.f3367c = false;
        }
        return new C3513a(this.f3365a.toString(), this.f3366b);
    }

    public synchronized String toString() {
        return "Map size " + this.f3365a.size() + ". Is changed " + this.f3367c + ". Current revision " + this.f3366b;
    }
}
