package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.wz */
public enum C4247wz {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);
    

    /* renamed from: d */
    private final int f5296d;

    private C4247wz(int i) {
        this.f5296d = i;
    }

    /* renamed from: a */
    public int mo41795a() {
        return this.f5296d;
    }

    /* renamed from: a */
    public static C4247wz m6075a(int i) {
        for (C4247wz wzVar : values()) {
            if (wzVar.mo41795a() == i) {
                return wzVar;
            }
        }
        return null;
    }
}
