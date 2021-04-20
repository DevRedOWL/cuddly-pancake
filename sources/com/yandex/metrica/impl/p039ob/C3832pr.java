package com.yandex.metrica.impl.p039ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.pr */
public class C3832pr {

    /* renamed from: a */
    private C3830pp f4081a;

    public C3832pr(C3830pp ppVar) {
        this.f4081a = ppVar;
    }

    /* renamed from: a */
    public boolean mo40854a(Context context, String str) {
        if (!mo40851a().mo40843a(str)) {
            return false;
        }
        try {
            if (context.checkCallingOrSelfPermission(str) == 0) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo40853a(Context context) {
        return mo40854a(context, "android.permission.ACCESS_COARSE_LOCATION");
    }

    /* renamed from: b */
    public boolean mo40855b(Context context) {
        return mo40854a(context, "android.permission.ACCESS_FINE_LOCATION");
    }

    /* renamed from: c */
    public boolean mo40856c(Context context) {
        return mo40853a(context) || mo40855b(context);
    }

    /* renamed from: d */
    public boolean mo40857d(Context context) {
        return mo40854a(context, "android.permission.READ_PHONE_STATE");
    }

    /* renamed from: e */
    public boolean mo40858e(Context context) {
        return mo40854a(context, "android.permission.ACCESS_WIFI_STATE");
    }

    /* renamed from: f */
    public boolean mo40859f(Context context) {
        return mo40854a(context, "android.permission.CHANGE_WIFI_STATE");
    }

    /* renamed from: g */
    public boolean mo40860g(Context context) {
        return mo40854a(context, "android.permission.BLUETOOTH");
    }

    /* renamed from: h */
    public boolean mo40861h(Context context) {
        return mo40854a(context, "android.permission.BLUETOOTH_ADMIN");
    }

    /* renamed from: i */
    public boolean mo40862i(Context context) {
        return mo40860g(context) && mo40861h(context);
    }

    /* renamed from: a */
    public void mo40852a(C3830pp ppVar) {
        this.f4081a = ppVar;
    }

    /* renamed from: a */
    public C3830pp mo40851a() {
        return this.f4081a;
    }
}
