package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.vr */
public abstract class C4206vr {

    /* renamed from: a */
    private static Map<String, C4216vz> f5241a = new HashMap();

    /* renamed from: b */
    private static Map<String, C4203vp> f5242b = new HashMap();

    /* renamed from: a */
    public static C4216vz m5906a(String str) {
        if (TextUtils.isEmpty(str)) {
            return m5905a();
        }
        if (!f5241a.containsKey(str)) {
            f5241a.put(str, new C4216vz(str));
        }
        return f5241a.get(str);
    }

    /* renamed from: b */
    public static C4203vp m5908b(String str) {
        if (TextUtils.isEmpty(str)) {
            return m5907b();
        }
        if (!f5242b.containsKey(str)) {
            f5242b.put(str, new C4203vp(str));
        }
        return f5242b.get(str);
    }

    /* renamed from: a */
    public static C4216vz m5905a() {
        return C4216vz.m5935h();
    }

    /* renamed from: b */
    public static C4203vp m5907b() {
        return C4203vp.m5877h();
    }
}
