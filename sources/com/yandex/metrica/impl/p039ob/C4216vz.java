package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p039ob.C3884rh;

/* renamed from: com.yandex.metrica.impl.ob.vz */
public class C4216vz extends C4207vs {

    /* renamed from: a */
    private static final int[] f5253a = {3, 6, 4};

    /* renamed from: b */
    private static final C4216vz f5254b = new C4216vz();

    /* renamed from: f */
    public String mo41692f() {
        return "AppMetrica";
    }

    public C4216vz(String str) {
        super(str);
    }

    public C4216vz() {
        this("");
    }

    /* renamed from: h */
    public static C4216vz m5935h() {
        return f5254b;
    }

    /* renamed from: a */
    public void mo41721a(C4217w wVar, String str) {
        if (C3125af.m1954b(wVar.mo41736g())) {
            StringBuilder sb = new StringBuilder(str);
            sb.append(": ");
            sb.append(wVar.mo41731d());
            if (C3125af.m1958c(wVar.mo41736g()) && !TextUtils.isEmpty(wVar.mo41734e())) {
                sb.append(" with value ");
                sb.append(wVar.mo41734e());
            }
            mo41680a(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo41719a(C3884rh.C3889c.C3895e.C3896a aVar, String str) {
        if (m5933a(aVar)) {
            mo41680a(str + ": " + m5934b(aVar));
        }
    }

    /* renamed from: a */
    private boolean m5933a(C3884rh.C3889c.C3895e.C3896a aVar) {
        for (int i : f5253a) {
            if (aVar.f4325d == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private String m5934b(C3884rh.C3889c.C3895e.C3896a aVar) {
        if (aVar.f4325d == 3 && TextUtils.isEmpty(aVar.f4326e)) {
            return "Native crash of app";
        }
        if (aVar.f4325d != 4) {
            return aVar.f4326e;
        }
        StringBuilder sb = new StringBuilder(aVar.f4326e);
        if (aVar.f4327f != null) {
            String str = new String(aVar.f4327f);
            if (!TextUtils.isEmpty(str)) {
                sb.append(" with value ");
                sb.append(str);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo41720a(C3884rh.C3889c.C3895e eVar, String str) {
        for (C3884rh.C3889c.C3895e.C3896a a : eVar.f4321d) {
            mo41719a(a, str);
        }
    }
}
