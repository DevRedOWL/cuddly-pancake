package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p039ob.C3884rh;

/* renamed from: com.yandex.metrica.impl.ob.pa */
public class C3809pa {

    /* renamed from: a */
    private final C3773og f4044a;

    /* renamed from: b */
    private final C3806oz f4045b;

    public C3809pa(C3773og ogVar, C3806oz ozVar) {
        this.f4044a = ogVar;
        this.f4045b = ozVar;
    }

    /* renamed from: a */
    public C3884rh.C3886b.C3887a mo40829a(long j, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            C3784on b = this.f4044a.mo40749b(j, str);
            if (b != null) {
                return this.f4045b.mo40822a(b);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
