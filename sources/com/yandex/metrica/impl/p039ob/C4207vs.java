package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import java.util.Locale;

/* renamed from: com.yandex.metrica.impl.ob.vs */
public abstract class C4207vs extends C4195vh {

    /* renamed from: a */
    private static String f5243a = "";

    /* renamed from: b */
    private final String f5244b;

    public C4207vs(String str) {
        super(false);
        this.f5244b = String.format("[%s] ", new Object[]{C3306cx.m2866b(str)});
    }

    /* renamed from: g */
    public String mo41693g() {
        String b = C3303cu.m2825b(f5243a, "");
        String b2 = C3303cu.m2825b(this.f5244b, "");
        return b + b2;
    }

    /* renamed from: a */
    public static void m5909a(Context context) {
        f5243a = String.format("[%s] : ", new Object[]{context.getPackageName()});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo41689d(String str, Object[] objArr) {
        return String.format(Locale.US, str, objArr);
    }
}
