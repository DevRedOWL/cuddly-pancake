package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3774oh;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.oc */
public class C3769oc extends C3774oh {

    /* renamed from: a */
    public final long f3901a;

    /* renamed from: b */
    public final long f3902b;

    /* renamed from: c */
    public final boolean f3903c;

    /* renamed from: d */
    public final List<C3778oj> f3904d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3769oc(long j, float f, int i, int i2, long j2, int i3, boolean z, long j3, long j4, long j5, boolean z2, boolean z3, List<C3778oj> list) {
        super(j, f, i, i2, j2, i3, z, j5, z2);
        this.f3901a = j3;
        this.f3902b = j4;
        this.f3903c = z3;
        this.f3904d = list;
    }

    /* renamed from: a */
    public C3774oh.C3775a mo40739a() {
        return C3774oh.C3775a.BACKGROUND;
    }

    public String toString() {
        return "BackgroundCollectionConfig{collectionDuration=" + this.f3901a + ", collectionInterval=" + this.f3902b + ", aggressiveRelaunch=" + this.f3903c + ", collectionIntervalRanges=" + this.f3904d + ", updateTimeInterval=" + this.f3910e + ", updateDistanceInterval=" + this.f3911f + ", recordsCountToForceFlush=" + this.f3912g + ", maxBatchSize=" + this.f3913h + ", maxAgeToForceFlush=" + this.f3914i + ", maxRecordsToStoreLocally=" + this.f3915j + ", collectionEnabled=" + this.f3916k + ", lbsUpdateTimeInterval=" + this.f3917l + ", lbsCollectionEnabled=" + this.f3918m + '}';
    }
}
