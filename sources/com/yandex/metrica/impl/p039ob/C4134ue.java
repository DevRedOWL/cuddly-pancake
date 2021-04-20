package com.yandex.metrica.impl.p039ob;

import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.ue */
public enum C4134ue {
    UNKNOWN(0),
    NETWORK(1),
    PARSE(2);
    

    /* renamed from: d */
    private int f5061d;

    private C4134ue(int i) {
        this.f5061d = i;
    }

    /* renamed from: a */
    public int mo41538a() {
        return this.f5061d;
    }

    /* renamed from: a */
    public Bundle mo41539a(Bundle bundle) {
        bundle.putInt("startup_error_key_code", mo41538a());
        return bundle;
    }

    /* renamed from: b */
    public static C4134ue m5572b(Bundle bundle) {
        if (bundle.containsKey("startup_error_key_code")) {
            return m5571a(bundle.getInt("startup_error_key_code"));
        }
        return null;
    }

    /* renamed from: a */
    private static C4134ue m5571a(int i) {
        C4134ue ueVar = UNKNOWN;
        if (i == 1) {
            return NETWORK;
        }
        if (i != 2) {
            return ueVar;
        }
        return PARSE;
    }
}
