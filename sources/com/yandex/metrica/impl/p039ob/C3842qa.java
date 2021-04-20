package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.qa */
public class C3842qa {

    /* renamed from: a */
    private Context f4095a;

    public C3842qa(Context context) {
        this.f4095a = context;
    }

    /* renamed from: a */
    public void mo40874a() {
        SharedPreferences a = C3854ql.m4639a(this.f4095a, "_bidoptpreferences");
        if (a.getAll().size() > 0) {
            m4537b(a);
            m4534a(a);
            a.edit().clear().apply();
        }
    }

    /* renamed from: a */
    private void m4534a(SharedPreferences sharedPreferences) {
        Map<String, ?> all = sharedPreferences.getAll();
        if (all.size() > 0) {
            for (String next : m4533a(all, C3851qi.f4169e.mo40945a())) {
                String string = sharedPreferences.getString(new C3853qk(C3851qi.f4169e.mo40945a(), next).mo40947b(), (String) null);
                C3851qi qiVar = new C3851qi(this.f4095a, next);
                if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(qiVar.mo40935b((String) null))) {
                    qiVar.mo40942i(string).mo40902j();
                }
            }
        }
    }

    /* renamed from: a */
    private List<String> m4533a(Map<String, ?> map, String str) {
        ArrayList arrayList = new ArrayList();
        for (String next : map.keySet()) {
            if (next.startsWith(str)) {
                arrayList.add(next.replace(str, ""));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private void m4537b(SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString(C3851qi.f4168d.mo40945a(), (String) null);
        C3851qi qiVar = new C3851qi(this.f4095a);
        if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(qiVar.mo40934a((String) null))) {
            qiVar.mo40943j(string).mo40902j();
            sharedPreferences.edit().remove(C3851qi.f4168d.mo40945a()).apply();
        }
    }

    /* renamed from: b */
    public void mo40875b() {
        C3630lf e = C3628ld.m3815a(this.f4095a).mo40443e();
        SharedPreferences a = C3854ql.m4639a(this.f4095a, "_startupserviceinfopreferences");
        m4538b(e, a);
        m4539c(e, a);
        m4536a(e, this.f4095a.getPackageName());
        m4535a(e, a);
    }

    /* renamed from: a */
    private void m4535a(C3630lf lfVar, SharedPreferences sharedPreferences) {
        for (String a : m4533a(sharedPreferences.getAll(), C3851qi.f4169e.mo40945a())) {
            m4536a(lfVar, a);
        }
    }

    /* renamed from: a */
    private void m4536a(C3630lf lfVar, String str) {
        C3691lz lzVar = new C3691lz(lfVar, str);
        C3851qi qiVar = new C3851qi(this.f4095a, str);
        String b = qiVar.mo40935b((String) null);
        if (!TextUtils.isEmpty(b)) {
            lzVar.mo40601a(b);
        }
        String a = qiVar.mo40887a();
        if (!TextUtils.isEmpty(a)) {
            lzVar.mo40612h(a);
        }
        String d = qiVar.mo40938d((String) null);
        if (!TextUtils.isEmpty(d)) {
            lzVar.mo40611g(d);
        }
        String f = qiVar.mo40940f((String) null);
        if (!TextUtils.isEmpty(f)) {
            lzVar.mo40609e(f);
        }
        String g = qiVar.mo40941g((String) null);
        if (!TextUtils.isEmpty(g)) {
            lzVar.mo40608d(g);
        }
        String c = qiVar.mo40937c((String) null);
        if (!TextUtils.isEmpty(c)) {
            lzVar.mo40610f(c);
        }
        long a2 = qiVar.mo40933a(-1);
        if (a2 != -1) {
            lzVar.mo40600a(a2);
        }
        String e = qiVar.mo40939e((String) null);
        if (!TextUtils.isEmpty(e)) {
            lzVar.mo40607c(e);
        }
        lzVar.mo40567q();
        qiVar.mo40936b();
    }

    /* renamed from: b */
    private void m4538b(C3630lf lfVar, SharedPreferences sharedPreferences) {
        C3691lz lzVar = new C3691lz(lfVar, (String) null);
        String string = sharedPreferences.getString(C3851qi.f4168d.mo40945a(), (String) null);
        if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(lzVar.mo40604a().f5088b)) {
            lzVar.mo40605b(string).mo40567q();
            sharedPreferences.edit().remove(C3851qi.f4168d.mo40945a()).apply();
        }
    }

    /* renamed from: c */
    private void m4539c(C3630lf lfVar, SharedPreferences sharedPreferences) {
        C3691lz lzVar = new C3691lz(lfVar, this.f4095a.getPackageName());
        boolean z = sharedPreferences.getBoolean(C3851qi.f4170f.mo40945a(), false);
        if (z) {
            lzVar.mo40603a(z).mo40567q();
        }
    }
}
