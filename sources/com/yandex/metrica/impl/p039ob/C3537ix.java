package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ix */
public class C3537ix {

    /* renamed from: a */
    private final C3391en f3405a;

    /* renamed from: b */
    private final C3555jf f3406b;

    /* renamed from: c */
    private final C3540iz f3407c;

    /* renamed from: d */
    private long f3408d;

    /* renamed from: e */
    private long f3409e;

    /* renamed from: f */
    private AtomicLong f3410f;

    /* renamed from: g */
    private boolean f3411g;

    /* renamed from: h */
    private volatile C3538a f3412h;

    /* renamed from: i */
    private long f3413i;

    /* renamed from: j */
    private long f3414j;

    /* renamed from: k */
    private C4227wg f3415k;

    C3537ix(C3391en enVar, C3555jf jfVar, C3540iz izVar) {
        this(enVar, jfVar, izVar, new C4227wg());
    }

    C3537ix(C3391en enVar, C3555jf jfVar, C3540iz izVar, C4227wg wgVar) {
        this.f3405a = enVar;
        this.f3406b = jfVar;
        this.f3407c = izVar;
        this.f3415k = wgVar;
        m3519i();
    }

    /* renamed from: i */
    private void m3519i() {
        this.f3409e = this.f3407c.mo40257b(this.f3415k.mo41770c());
        this.f3408d = this.f3407c.mo40254a(-1);
        this.f3410f = new AtomicLong(this.f3407c.mo40258c(0));
        this.f3411g = this.f3407c.mo40256a(true);
        this.f3413i = this.f3407c.mo40259d(0);
        this.f3414j = this.f3407c.mo40260e(this.f3413i - this.f3409e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3557jh mo40237a() {
        return this.f3407c.mo40255a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo40241b() {
        return this.f3407c.mo40253a(this.f3405a.mo40025i().mo41345S());
    }

    /* renamed from: c */
    public long mo40243c() {
        return this.f3408d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo40245d() {
        return Math.max(this.f3413i - TimeUnit.MILLISECONDS.toSeconds(this.f3409e), this.f3414j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo40239a(long j) {
        boolean z = this.f3408d >= 0;
        boolean j2 = m3520j();
        boolean z2 = !mo40240a(j, this.f3415k.mo41770c());
        if (!z || !j2 || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private boolean m3520j() {
        C3538a k = m3521k();
        if (k != null) {
            return k.mo40251a(this.f3405a.mo40025i());
        }
        return false;
    }

    /* renamed from: d */
    private long m3518d(long j) {
        return TimeUnit.MILLISECONDS.toSeconds(j - this.f3409e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo40240a(long j, long j2) {
        long j3 = this.f3413i;
        boolean z = TimeUnit.MILLISECONDS.toSeconds(j2) < j3;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j) - j3;
        long d = m3518d(j);
        if (z || seconds >= ((long) mo40241b()) || d >= C3545ja.f3444c) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void mo40246e() {
        this.f3406b.mo40292a();
        this.f3412h = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo40242b(long j) {
        C3555jf jfVar = this.f3406b;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
        this.f3413i = seconds;
        jfVar.mo40293b(seconds).mo40303h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public long mo40244c(long j) {
        C3555jf jfVar = this.f3406b;
        long d = m3518d(j);
        this.f3414j = d;
        jfVar.mo40294c(d);
        return this.f3414j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public long mo40247f() {
        return this.f3414j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public long mo40248g() {
        long andIncrement = this.f3410f.getAndIncrement();
        this.f3406b.mo40290a(this.f3410f.get()).mo40303h();
        return andIncrement;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo40249h() {
        return this.f3411g && mo40243c() > 0;
    }

    /* renamed from: a */
    public void mo40238a(boolean z) {
        if (this.f3411g != z) {
            this.f3411g = z;
            this.f3406b.mo40291a(this.f3411g).mo40303h();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:3|4|(3:6|7|(1:9))|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0033 */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.yandex.metrica.impl.p039ob.C3537ix.C3538a m3521k() {
        /*
            r4 = this;
            com.yandex.metrica.impl.ob.ix$a r0 = r4.f3412h
            if (r0 != 0) goto L_0x0038
            monitor-enter(r4)
            com.yandex.metrica.impl.ob.ix$a r0 = r4.f3412h     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0033
            com.yandex.metrica.impl.ob.en r0 = r4.f3405a     // Catch:{ all -> 0x0033 }
            com.yandex.metrica.impl.ob.kz r0 = r0.mo40026j()     // Catch:{ all -> 0x0033 }
            long r1 = r4.mo40243c()     // Catch:{ all -> 0x0033 }
            com.yandex.metrica.impl.ob.jh r3 = r4.mo40237a()     // Catch:{ all -> 0x0033 }
            android.content.ContentValues r0 = r0.mo40409b((long) r1, (com.yandex.metrica.impl.p039ob.C3557jh) r3)     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = "report_request_parameters"
            java.lang.String r0 = r0.getAsString(r1)     // Catch:{ all -> 0x0033 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0033 }
            if (r1 != 0) goto L_0x0033
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0033 }
            r1.<init>(r0)     // Catch:{ all -> 0x0033 }
            com.yandex.metrica.impl.ob.ix$a r0 = new com.yandex.metrica.impl.ob.ix$a     // Catch:{ all -> 0x0033 }
            r0.<init>(r1)     // Catch:{ all -> 0x0033 }
            r4.f3412h = r0     // Catch:{ all -> 0x0033 }
        L_0x0033:
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            goto L_0x0038
        L_0x0035:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            throw r0
        L_0x0038:
            com.yandex.metrica.impl.ob.ix$a r0 = r4.f3412h
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3537ix.m3521k():com.yandex.metrica.impl.ob.ix$a");
    }

    public String toString() {
        return "Session{mId=" + this.f3408d + ", mInitTime=" + this.f3409e + ", mCurrentReportId=" + this.f3410f + ", mSessionRequestParams=" + this.f3412h + ", mSleepStartSeconds=" + this.f3413i + '}';
    }

    /* renamed from: com.yandex.metrica.impl.ob.ix$a */
    static class C3538a {

        /* renamed from: a */
        private final String f3416a;

        /* renamed from: b */
        private final String f3417b;

        /* renamed from: c */
        private final String f3418c;

        /* renamed from: d */
        private final String f3419d;

        /* renamed from: e */
        private final String f3420e;

        /* renamed from: f */
        private final int f3421f;

        /* renamed from: g */
        private final int f3422g;

        C3538a(JSONObject jSONObject) {
            this.f3416a = jSONObject.optString("analyticsSdkVersionName", (String) null);
            this.f3417b = jSONObject.optString("kitBuildNumber", (String) null);
            this.f3418c = jSONObject.optString("appVer", (String) null);
            this.f3419d = jSONObject.optString("appBuild", (String) null);
            this.f3420e = jSONObject.optString("osVer", (String) null);
            this.f3421f = jSONObject.optInt("osApiLev", -1);
            this.f3422g = jSONObject.optInt("attribution_id", 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo40251a(C4051st stVar) {
            return TextUtils.equals(stVar.mo41296i(), this.f3416a) && TextUtils.equals(stVar.mo41298j(), this.f3417b) && TextUtils.equals(stVar.mo41307q(), this.f3418c) && TextUtils.equals(stVar.mo41306p(), this.f3419d) && TextUtils.equals(stVar.mo41304n(), this.f3420e) && this.f3421f == stVar.mo41305o() && this.f3422g == stVar.mo41348V();
        }

        public String toString() {
            return "SessionRequestParams{mKitVersionName='" + this.f3416a + '\'' + ", mKitBuildNumber='" + this.f3417b + '\'' + ", mAppVersion='" + this.f3418c + '\'' + ", mAppBuild='" + this.f3419d + '\'' + ", mOsVersion='" + this.f3420e + '\'' + ", mApiLevel=" + this.f3421f + '}';
        }
    }
}
