package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.jh */
public enum C3557jh {
    FOREGROUND(0),
    BACKGROUND(1);
    

    /* renamed from: c */
    private final int f3472c;

    private C3557jh(int i) {
        this.f3472c = i;
    }

    /* renamed from: a */
    public int mo40305a() {
        return this.f3472c;
    }

    /* renamed from: a */
    public static C3557jh m3616a(Integer num) {
        C3557jh jhVar = FOREGROUND;
        if (num == null) {
            return jhVar;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return FOREGROUND;
        }
        if (intValue != 1) {
            return jhVar;
        }
        return BACKGROUND;
    }
}
