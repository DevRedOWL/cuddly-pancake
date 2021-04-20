package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.yandex.metrica.impl.ob.ql */
public class C3854ql {
    /* renamed from: a */
    public static SharedPreferences m4639a(Context context, String str) {
        return context.getSharedPreferences(context.getPackageName() + str, 0);
    }

    /* renamed from: a */
    public static void m4640a(SharedPreferences sharedPreferences, String str, int i) {
        if (sharedPreferences != null && sharedPreferences.contains(str)) {
            try {
                sharedPreferences.edit().remove(str).putLong(str, (long) sharedPreferences.getInt(str, i)).apply();
            } catch (ClassCastException unused) {
            }
        }
    }
}
