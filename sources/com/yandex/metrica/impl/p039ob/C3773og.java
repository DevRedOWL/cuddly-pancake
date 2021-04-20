package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import java.io.UnsupportedEncodingException;

/* renamed from: com.yandex.metrica.impl.ob.og */
public class C3773og {

    /* renamed from: a */
    private Context f3909a;

    public C3773og(Context context) {
        this.f3909a = context;
    }

    /* renamed from: a */
    public String mo40747a(C3795os osVar) {
        String a = C3805oy.m4446a(osVar);
        if (a != null) {
            return mo40748a(a);
        }
        return null;
    }

    /* renamed from: a */
    public C3795os mo40745a(long j, String str) {
        String b = mo40750b(str);
        if (b == null) {
            return null;
        }
        return C3805oy.m4444a(j, b);
    }

    /* renamed from: a */
    public String mo40746a(C3784on onVar) {
        String a = C3805oy.m4445a(onVar);
        if (a == null) {
            return null;
        }
        return mo40748a(a);
    }

    /* renamed from: b */
    public C3784on mo40749b(long j, String str) {
        String b = mo40750b(str);
        if (b == null) {
            return null;
        }
        return C3805oy.m4447b(j, b);
    }

    /* renamed from: a */
    public String mo40748a(String str) {
        try {
            return C4221wc.m5995a(this.f3909a, str);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public String mo40750b(String str) {
        try {
            return C4221wc.m5999b(this.f3909a, str);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
