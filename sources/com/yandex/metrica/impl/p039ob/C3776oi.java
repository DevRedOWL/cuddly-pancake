package com.yandex.metrica.impl.p039ob;

import android.location.Location;
import com.yandex.metrica.impl.p039ob.C3807p;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.oi */
class C3776oi extends C3772of {

    /* renamed from: a */
    public static final long f3923a = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: b */
    public static final long f3924b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c */
    private C3807p.C3808a<Location> f3925c;

    /* renamed from: d */
    private C3777a f3926d;

    /* renamed from: e */
    private long f3927e;

    /* renamed from: com.yandex.metrica.impl.ob.oi$a */
    public static class C3777a {

        /* renamed from: a */
        public final long f3928a;

        /* renamed from: b */
        public final long f3929b;

        /* renamed from: c */
        public final long f3930c;

        public C3777a(long j, long j2, long j3) {
            this.f3928a = j;
            this.f3929b = j2;
            this.f3930c = j3;
        }
    }

    public C3776oi(C3771oe oeVar) {
        this(oeVar, new C3777a(f3923a, 200, 50), f3924b);
    }

    /* renamed from: b */
    public void mo40744b(String str, Location location, C3774oh ohVar) {
        if (location != null) {
            m4335a(location);
        }
    }

    /* renamed from: a */
    private void m4335a(Location location) {
        C3807p.C3808a<Location> aVar = this.f3925c;
        if (aVar == null || aVar.mo40825a(this.f3927e) || m4336a(location, this.f3925c.mo40823a())) {
            Location location2 = new Location(location);
            C3807p.C3808a<Location> aVar2 = new C3807p.C3808a<>();
            aVar2.mo40824a(location2);
            this.f3925c = aVar2;
        }
    }

    /* renamed from: a */
    public Location mo40752a() {
        C3807p.C3808a<Location> aVar = this.f3925c;
        if (aVar == null) {
            return null;
        }
        return aVar.mo40828d();
    }

    /* renamed from: a */
    private boolean m4336a(Location location, Location location2) {
        return m4337a(location, location2, this.f3926d.f3928a, this.f3926d.f3929b);
    }

    /* renamed from: a */
    public static boolean m4337a(Location location, Location location2, long j, long j2) {
        if (location2 == null) {
            return true;
        }
        if (location == null) {
            return false;
        }
        long time = location.getTime() - location2.getTime();
        boolean z = time > j;
        boolean z2 = time < (-j);
        boolean z3 = time > 0;
        if (z) {
            return true;
        }
        if (z2) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z4 = accuracy > 0;
        boolean z5 = accuracy < 0;
        boolean z6 = ((long) accuracy) > j2;
        boolean a = m4338a(location.getProvider(), location2.getProvider());
        if (z5) {
            return true;
        }
        if (!z3 || z4) {
            return z3 && !z6 && a;
        }
        return true;
    }

    /* renamed from: a */
    static boolean m4338a(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    C3776oi(C3771oe oeVar, C3777a aVar, long j) {
        super(oeVar);
        this.f3926d = aVar;
        this.f3927e = j;
    }
}
