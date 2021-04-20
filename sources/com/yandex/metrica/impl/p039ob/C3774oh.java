package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.oh */
public class C3774oh {

    /* renamed from: e */
    public final long f3910e;

    /* renamed from: f */
    public final float f3911f;

    /* renamed from: g */
    public final int f3912g;

    /* renamed from: h */
    public final int f3913h;

    /* renamed from: i */
    public final long f3914i;

    /* renamed from: j */
    public final int f3915j;

    /* renamed from: k */
    public final boolean f3916k;

    /* renamed from: l */
    public final long f3917l;

    /* renamed from: m */
    public final boolean f3918m;

    /* renamed from: com.yandex.metrica.impl.ob.oh$a */
    public enum C3775a {
        FOREGROUND("fg"),
        BACKGROUND("bg");
        

        /* renamed from: c */
        private final String f3922c;

        private C3775a(String str) {
            this.f3922c = str;
        }

        public String toString() {
            return this.f3922c;
        }

        /* renamed from: a */
        public static C3775a m4334a(String str) {
            C3775a aVar = FOREGROUND;
            for (C3775a aVar2 : values()) {
                if (aVar2.f3922c.equals(str)) {
                    aVar = aVar2;
                }
            }
            return aVar;
        }
    }

    public C3774oh(long j, float f, int i, int i2, long j2, int i3, boolean z, long j3, boolean z2) {
        this.f3910e = j;
        this.f3911f = f;
        this.f3912g = i;
        this.f3913h = i2;
        this.f3914i = j2;
        this.f3915j = i3;
        this.f3916k = z;
        this.f3917l = j3;
        this.f3918m = z2;
    }

    /* renamed from: a */
    public C3775a mo40739a() {
        return C3775a.FOREGROUND;
    }

    public String toString() {
        return "ForegroundCollectionConfig{updateTimeInterval=" + this.f3910e + ", updateDistanceInterval=" + this.f3911f + ", recordsCountToForceFlush=" + this.f3912g + ", maxBatchSize=" + this.f3913h + ", maxAgeToForceFlush=" + this.f3914i + ", maxRecordsToStoreLocally=" + this.f3915j + ", collectionEnabled=" + this.f3916k + ", lbsUpdateTimeInterval=" + this.f3917l + ", lbsCollectionEnabled=" + this.f3918m + '}';
    }
}
