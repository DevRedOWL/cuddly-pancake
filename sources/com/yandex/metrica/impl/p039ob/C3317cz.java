package com.yandex.metrica.impl.p039ob;

import android.location.Location;

/* renamed from: com.yandex.metrica.impl.ob.cz */
public final class C3317cz extends Location {

    /* renamed from: a */
    private final String f3007a;

    private C3317cz(Location location, String str) {
        super(location);
        this.f3007a = str;
    }

    /* renamed from: a */
    public String mo39879a() {
        return this.f3007a;
    }

    /* renamed from: a */
    public static C3317cz m2912a(Location location) {
        Location location2 = new Location(location);
        String provider = location2.getProvider();
        location2.setProvider("");
        return new C3317cz(location2, provider);
    }

    /* renamed from: b */
    public static C3317cz m2913b(Location location) {
        return new C3317cz(new Location(location), "");
    }
}
