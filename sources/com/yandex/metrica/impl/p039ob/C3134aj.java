package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.aj */
public enum C3134aj {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);
    

    /* renamed from: d */
    public final int f2564d;

    private C3134aj(int i) {
        this.f2564d = i;
    }

    /* renamed from: a */
    public static C3134aj m1988a(Integer num) {
        if (num != null) {
            for (C3134aj ajVar : values()) {
                if (ajVar.f2564d == num.intValue()) {
                    return ajVar;
                }
            }
        }
        return UNKNOWN;
    }
}
