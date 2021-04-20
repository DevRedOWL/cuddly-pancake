package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.yandex.metrica.impl.ob.bj */
public class C3198bj {

    /* renamed from: a */
    private final Context f2699a;

    /* renamed from: b */
    private final String f2700b;

    /* renamed from: c */
    private final C3202bk f2701c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C3688lw f2702d;

    /* renamed from: e */
    private final C3128ah f2703e;

    public C3198bj(Context context, C3202bk bkVar, C3688lw lwVar) {
        this(context, new C3128ah(), bkVar, lwVar);
    }

    C3198bj(Context context, C3128ah ahVar, C3202bk bkVar, C3688lw lwVar) {
        this.f2699a = context;
        this.f2703e = ahVar;
        this.f2700b = ahVar.mo39470c(context).getAbsolutePath();
        this.f2701c = bkVar;
        this.f2702d = lwVar;
    }

    /* renamed from: a */
    public synchronized void mo39633a() {
        if (C3137am.m2017a() && !this.f2702d.mo40550m()) {
            m2316a(this.f2699a.getFilesDir().getAbsolutePath() + "/" + "YandexMetricaNativeCrashes", new C4234wm<Boolean>() {
                /* renamed from: a */
                public void mo39609a(Boolean bool) {
                    C3198bj.this.f2702d.mo40551n();
                }
            });
        }
        m2316a(this.f2700b, new C4234wm<Boolean>() {
            /* renamed from: a */
            public void mo39609a(Boolean bool) {
            }
        });
    }

    /* renamed from: a */
    private void m2316a(String str, C4234wm<Boolean> wmVar) {
        for (String str2 : m2317a(str)) {
            mo39634a(str + "/" + str2, wmVar, false);
        }
    }

    /* renamed from: a */
    private String[] m2317a(String str) {
        File a = this.f2703e.mo39468a(str);
        if (!a.mkdir() && !a.exists()) {
            return new String[0];
        }
        String[] list = a.list(new FilenameFilter() {
            public boolean accept(File file, String str) {
                return str.endsWith(".dmp");
            }
        });
        return list != null ? list : new String[0];
    }

    /* renamed from: a */
    public void mo39634a(String str, C4234wm<Boolean> wmVar, boolean z) {
        try {
            String b = C3137am.m2020b(C3137am.m2011a(str));
            if (b != null) {
                if (z) {
                    this.f2701c.mo39638a(b);
                } else {
                    this.f2701c.mo39639b(b);
                }
            }
            wmVar.mo39609a(true);
        } catch (Throwable th) {
            this.f2703e.mo39468a(str).delete();
            throw th;
        }
        this.f2703e.mo39468a(str).delete();
    }
}
