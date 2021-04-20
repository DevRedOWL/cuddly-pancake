package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p039ob.C3884rh;

/* renamed from: com.yandex.metrica.impl.ob.pc */
public class C3812pc {

    /* renamed from: a */
    private final C3773og f4047a;

    /* renamed from: b */
    private final C3810pb f4048b;

    public C3812pc(C3773og ogVar, C3810pb pbVar) {
        this.f4047a = ogVar;
        this.f4048b = pbVar;
    }

    /* renamed from: a */
    public C3884rh.C3886b.C3888b mo40831a(long j, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            C3795os a = this.f4047a.mo40745a(j, str);
            if (a != null) {
                return this.f4048b.mo40830a(a);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
