package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p039ob.C4204vq;

/* renamed from: com.yandex.metrica.impl.ob.jg */
public class C3556jg implements C3555jf {

    /* renamed from: a */
    protected C3688lw f3466a;

    /* renamed from: b */
    private final String f3467b;

    /* renamed from: c */
    private C4204vq.C4205a f3468c;

    public C3556jg(C3688lw lwVar, String str) {
        this.f3466a = lwVar;
        this.f3467b = str;
        C4204vq.C4205a aVar = new C4204vq.C4205a();
        try {
            String c = this.f3466a.mo40534c(this.f3467b);
            if (!TextUtils.isEmpty(c)) {
                aVar = new C4204vq.C4205a(c);
            }
        } catch (Throwable unused) {
        }
        this.f3468c = aVar;
    }

    /* renamed from: b */
    public Long mo40295b() {
        return this.f3468c.mo41703d("SESSION_ID");
    }

    /* renamed from: d */
    public C3556jg mo40297d(long j) {
        m3600a("SESSION_ID", Long.valueOf(j));
        return this;
    }

    /* renamed from: c */
    public Long mo40296c() {
        return this.f3468c.mo41703d("SESSION_INIT_TIME");
    }

    /* renamed from: e */
    public C3556jg mo40299e(long j) {
        m3600a("SESSION_INIT_TIME", Long.valueOf(j));
        return this;
    }

    /* renamed from: d */
    public Long mo40298d() {
        return this.f3468c.mo41703d("SESSION_COUNTER_ID");
    }

    /* renamed from: a */
    public C3556jg mo40290a(long j) {
        m3600a("SESSION_COUNTER_ID", Long.valueOf(j));
        return this;
    }

    /* renamed from: e */
    public Long mo40300e() {
        return this.f3468c.mo41703d("SESSION_SLEEP_START");
    }

    /* renamed from: b */
    public C3556jg mo40293b(long j) {
        m3600a("SESSION_SLEEP_START", Long.valueOf(j));
        return this;
    }

    /* renamed from: f */
    public Long mo40301f() {
        return this.f3468c.mo41703d("SESSION_LAST_EVENT_OFFSET");
    }

    /* renamed from: c */
    public C3556jg mo40294c(long j) {
        m3600a("SESSION_LAST_EVENT_OFFSET", Long.valueOf(j));
        return this;
    }

    /* renamed from: g */
    public Boolean mo40302g() {
        return this.f3468c.mo41704e("SESSION_IS_ALIVE_REPORT_NEEDED");
    }

    /* renamed from: a */
    public C3556jg mo40291a(boolean z) {
        m3600a("SESSION_IS_ALIVE_REPORT_NEEDED", Boolean.valueOf(z));
        return this;
    }

    /* renamed from: h */
    public void mo40303h() {
        this.f3466a.mo40525a(this.f3467b, this.f3468c.toString());
        this.f3466a.mo40567q();
    }

    /* renamed from: i */
    public boolean mo40304i() {
        return this.f3468c.length() > 0;
    }

    /* renamed from: a */
    private void m3600a(String str, Object obj) {
        try {
            this.f3468c.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo40292a() {
        this.f3468c = new C4204vq.C4205a();
        mo40303h();
    }
}
