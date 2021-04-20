package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import com.yandex.metrica.ReporterConfig;
import com.yandex.metrica.impl.p039ob.C3969rx;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.ry */
public abstract class C3984ry<T extends C3969rx> {

    /* renamed from: a */
    private HashMap<String, T> f4634a = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3998sa f4635b = new C3998sa();

    /* renamed from: c */
    private final C4257xh f4636c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo41162a(C4257xh xhVar, Context context, String str);

    protected C3984ry(C4257xh xhVar) {
        this.f4636c = xhVar;
    }

    /* renamed from: b */
    private T m5100b(final Context context, String str) {
        if (this.f4635b.mo41201f() == null) {
            this.f4636c.mo41808a((Runnable) new Runnable() {
                public void run() {
                    C3984ry.this.f4635b.mo41190a(context);
                }
            });
        }
        T a = mo41162a(this.f4636c, context, str);
        this.f4634a.put(str, a);
        return a;
    }

    /* renamed from: a */
    public T mo41161a(Context context, String str) {
        T t = (C3969rx) this.f4634a.get(str);
        if (t == null) {
            synchronized (this.f4634a) {
                t = (C3969rx) this.f4634a.get(str);
                if (t == null) {
                    T b = m5100b(context, str);
                    b.mo41144a(str);
                    t = b;
                }
            }
        }
        return t;
    }

    /* renamed from: a */
    public T mo41160a(Context context, ReporterConfig reporterConfig) {
        T t = (C3969rx) this.f4634a.get(reporterConfig.apiKey);
        if (t == null) {
            synchronized (this.f4634a) {
                t = (C3969rx) this.f4634a.get(reporterConfig.apiKey);
                if (t == null) {
                    T b = m5100b(context, reporterConfig.apiKey);
                    b.mo41143a(reporterConfig);
                    t = b;
                }
            }
        }
        return t;
    }
}
