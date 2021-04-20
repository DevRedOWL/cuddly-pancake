package com.yandex.metrica.impl.p039ob;

import android.location.Location;
import com.yandex.metrica.impl.p039ob.C3774oh;

/* renamed from: com.yandex.metrica.impl.ob.os */
public class C3795os {

    /* renamed from: a */
    public C3774oh.C3775a f3999a;

    /* renamed from: b */
    private Long f4000b;

    /* renamed from: c */
    private long f4001c;

    /* renamed from: d */
    private long f4002d;

    /* renamed from: e */
    private Location f4003e;

    public C3795os(C3774oh.C3775a aVar, long j, long j2, Location location) {
        this(aVar, j, j2, location, (Long) null);
    }

    public C3795os(C3774oh.C3775a aVar, long j, long j2, Location location, Long l) {
        this.f3999a = aVar;
        this.f4000b = l;
        this.f4001c = j;
        this.f4002d = j2;
        this.f4003e = location;
    }

    public String toString() {
        return "LocationWrapper{collectionMode=" + this.f3999a + ", mIncrementalId=" + this.f4000b + ", mReceiveTimestamp=" + this.f4001c + ", mReceiveElapsedRealtime=" + this.f4002d + ", mLocation=" + this.f4003e + '}';
    }

    /* renamed from: a */
    public Long mo40798a() {
        return this.f4000b;
    }

    /* renamed from: b */
    public long mo40799b() {
        return this.f4001c;
    }

    /* renamed from: c */
    public Location mo40800c() {
        return this.f4003e;
    }

    /* renamed from: d */
    public long mo40801d() {
        return this.f4002d;
    }
}
