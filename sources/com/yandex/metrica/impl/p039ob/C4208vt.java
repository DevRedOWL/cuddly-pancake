package com.yandex.metrica.impl.p039ob;

import java.util.Random;

/* renamed from: com.yandex.metrica.impl.ob.vt */
public class C4208vt {

    /* renamed from: a */
    private final Random f5245a;

    public C4208vt() {
        this(new Random());
    }

    public C4208vt(Random random) {
        this.f5245a = random;
    }

    /* renamed from: a */
    public long mo41705a(long j, long j2) {
        if (j < j2) {
            long nextLong = this.f5245a.nextLong();
            if (nextLong == Long.MIN_VALUE) {
                nextLong = 0;
            } else if (nextLong < 0) {
                nextLong = -nextLong;
            }
            return j + (nextLong % (j2 - j));
        }
        throw new IllegalArgumentException("min should be less than max");
    }
}
