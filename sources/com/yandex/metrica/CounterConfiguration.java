package com.yandex.metrica;

import android.content.ContentValues;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.yandex.metrica.impl.p039ob.C3306cx;
import com.yandex.metrica.impl.p039ob.C3785oo;
import com.yandex.metrica.impl.p039ob.C4248x;

@Deprecated
public class CounterConfiguration implements Parcelable {
    public static final Parcelable.Creator<CounterConfiguration> CREATOR = new Parcelable.Creator<CounterConfiguration>() {
        /* renamed from: a */
        public CounterConfiguration createFromParcel(Parcel parcel) {
            return new CounterConfiguration((ContentValues) parcel.readBundle(C4248x.class.getClassLoader()).getParcelable("com.yandex.metrica.CounterConfiguration.data"));
        }

        /* renamed from: a */
        public CounterConfiguration[] newArray(int i) {
            return new CounterConfiguration[i];
        }
    };

    /* renamed from: a */
    private final ContentValues f2361a;

    public int describeContents() {
        return 0;
    }

    /* renamed from: com.yandex.metrica.CounterConfiguration$a */
    public enum C3075a {
        MAIN("main"),
        MANUAL("manual"),
        APPMETRICA("appmetrica"),
        COMMUTATION("commutation"),
        SELF_DIAGNOSTIC_MAIN("self_diagnostic_main"),
        SELF_DIAGNOSTIC_MANUAL("self_diagnostic_manual");
        

        /* renamed from: g */
        private final String f2369g;

        private C3075a(String str) {
            this.f2369g = str;
        }

        /* renamed from: a */
        public String mo39264a() {
            return this.f2369g;
        }

        /* renamed from: a */
        public static C3075a m1741a(String str) {
            for (C3075a aVar : values()) {
                if (aVar.f2369g.equals(str)) {
                    return aVar;
                }
            }
            return MAIN;
        }
    }

    public synchronized String toString() {
        return "CounterConfiguration{mParamsMapping=" + this.f2361a + '}';
    }

    public CounterConfiguration(CounterConfiguration counterConfiguration) {
        synchronized (counterConfiguration) {
            this.f2361a = new ContentValues(counterConfiguration.f2361a);
            m1702r();
        }
    }

    public CounterConfiguration() {
        this.f2361a = new ContentValues();
    }

    public CounterConfiguration(String str) {
        this();
        synchronized (this) {
            mo39231b(str);
        }
    }

    public CounterConfiguration(C4297j jVar) {
        this();
        synchronized (this) {
            m1698f(jVar.apiKey);
            m1685a(jVar.sessionTimeout);
            m1683a(jVar);
            m1686b(jVar);
            m1690c(jVar);
            m1693d(jVar);
            m1688b(jVar.f5363f);
            m1692c(jVar.f5364g);
            m1695e(jVar);
            m1697f(jVar);
            m1699g(jVar);
            m1700h(jVar);
            m1701i(jVar);
            m1687b(jVar.statisticsSending);
            m1694d(jVar.maxReportsInDatabaseCount);
            m1691c(jVar.nativeCrashReporting);
            mo39225a(C3075a.MAIN);
        }
    }

    public CounterConfiguration(C3093f fVar) {
        this();
        synchronized (this) {
            m1698f(fVar.apiKey);
            m1685a(fVar.sessionTimeout);
            m1688b(fVar.f2424a);
            m1692c(fVar.f2425b);
            m1684a(fVar.logs);
            m1687b(fVar.statisticsSending);
            m1694d(fVar.maxReportsInDatabaseCount);
            m1696e(fVar.apiKey);
        }
    }

    /* renamed from: e */
    private void m1696e(String str) {
        if ("20799a27-fa80-4b36-b2db-0f8141f24180".equals(str)) {
            mo39225a(C3075a.APPMETRICA);
        } else {
            mo39225a(C3075a.MANUAL);
        }
    }

    /* renamed from: f */
    private void m1698f(String str) {
        if (C3306cx.m2858a((Object) str)) {
            mo39231b(str);
        }
    }

    /* renamed from: a */
    private void m1685a(Integer num) {
        if (C3306cx.m2858a((Object) num)) {
            mo39234c(num.intValue());
        }
    }

    /* renamed from: a */
    private void m1683a(C4297j jVar) {
        if (C3306cx.m2858a((Object) jVar.location)) {
            mo39223a(jVar.location);
        }
    }

    /* renamed from: b */
    private void m1686b(C4297j jVar) {
        if (C3306cx.m2858a((Object) jVar.locationTracking)) {
            mo39227a(jVar.locationTracking.booleanValue());
        }
    }

    /* renamed from: c */
    private void m1690c(C4297j jVar) {
        if (C3306cx.m2858a((Object) jVar.installedAppCollecting)) {
            mo39232b(jVar.installedAppCollecting.booleanValue());
        }
    }

    /* renamed from: d */
    private void m1693d(C4297j jVar) {
        if (C3306cx.m2858a((Object) jVar.f5358a)) {
            mo39226a(jVar.f5358a);
        }
    }

    /* renamed from: b */
    private void m1688b(Integer num) {
        if (C3306cx.m2858a((Object) num)) {
            mo39222a(num.intValue());
        }
    }

    /* renamed from: c */
    private void m1692c(Integer num) {
        if (C3306cx.m2858a((Object) num)) {
            mo39229b(num.intValue());
        }
    }

    /* renamed from: a */
    private void m1684a(Boolean bool) {
        if (C3306cx.m2858a((Object) bool)) {
            mo39236c(bool.booleanValue());
        }
    }

    /* renamed from: e */
    private void m1695e(C4297j jVar) {
        if (!TextUtils.isEmpty(jVar.appVersion)) {
            mo39239d(jVar.appVersion);
        }
    }

    /* renamed from: f */
    private void m1697f(C4297j jVar) {
        if (C3306cx.m2858a((Object) jVar.f5362e)) {
            mo39238d(jVar.f5362e.intValue());
        }
    }

    /* renamed from: g */
    private void m1699g(C4297j jVar) {
        if (C3306cx.m2858a((Object) jVar.f5367j)) {
            mo39240d(jVar.f5367j.booleanValue());
        }
    }

    /* renamed from: h */
    private void m1700h(C4297j jVar) {
        if (C3306cx.m2858a((Object) jVar.f5368k)) {
            mo39243e(jVar.f5368k.booleanValue());
        }
    }

    /* renamed from: i */
    private void m1701i(C4297j jVar) {
        if (C3306cx.m2858a((Object) jVar.firstActivationAsUpdate)) {
            mo39245f(jVar.firstActivationAsUpdate.booleanValue());
        }
    }

    /* renamed from: b */
    private void m1687b(Boolean bool) {
        if (C3306cx.m2858a((Object) bool)) {
            mo39247g(bool.booleanValue());
        }
    }

    /* renamed from: d */
    private void m1694d(Integer num) {
        if (C3306cx.m2858a((Object) num)) {
            this.f2361a.put("MAX_REPORTS_IN_DB_COUNT", num);
        }
    }

    /* renamed from: c */
    private void m1691c(Boolean bool) {
        if (C3306cx.m2858a((Object) bool)) {
            this.f2361a.put("CFG_NATIVE_CRASHES_ENABLED", bool);
        }
    }

    /* renamed from: a */
    public synchronized void mo39222a(int i) {
        this.f2361a.put("CFG_DISPATCH_PERIOD", Integer.valueOf(i));
    }

    /* renamed from: a */
    public Integer mo39221a() {
        return this.f2361a.getAsInteger("CFG_DISPATCH_PERIOD");
    }

    /* renamed from: b */
    public synchronized void mo39229b(int i) {
        ContentValues contentValues = this.f2361a;
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        contentValues.put("CFG_MAX_REPORTS_COUNT", Integer.valueOf(i));
    }

    /* renamed from: b */
    public Integer mo39228b() {
        return this.f2361a.getAsInteger("CFG_MAX_REPORTS_COUNT");
    }

    /* renamed from: c */
    public synchronized void mo39234c(int i) {
        this.f2361a.put("CFG_SESSION_TIMEOUT", Integer.valueOf(i));
    }

    /* renamed from: c */
    public Integer mo39233c() {
        return this.f2361a.getAsInteger("CFG_SESSION_TIMEOUT");
    }

    /* renamed from: a */
    public final synchronized void mo39226a(String str) {
        ContentValues contentValues = this.f2361a;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        contentValues.put("CFG_DEVICE_SIZE_TYPE", str);
    }

    /* renamed from: d */
    public String mo39237d() {
        return this.f2361a.getAsString("CFG_DEVICE_SIZE_TYPE");
    }

    /* renamed from: b */
    public synchronized void mo39231b(String str) {
        this.f2361a.put("CFG_API_KEY", str);
    }

    /* renamed from: c */
    public synchronized void mo39235c(String str) {
        this.f2361a.put("CFG_UUID", str);
    }

    /* renamed from: e */
    public String mo39242e() {
        return this.f2361a.getAsString("CFG_API_KEY");
    }

    /* renamed from: a */
    public synchronized void mo39227a(boolean z) {
        this.f2361a.put("CFG_LOCATION_TRACKING", Boolean.valueOf(z));
    }

    /* renamed from: f */
    public Boolean mo39244f() {
        return this.f2361a.getAsBoolean("CFG_LOCATION_TRACKING");
    }

    /* renamed from: d */
    public final synchronized void mo39239d(String str) {
        this.f2361a.put("CFG_APP_VERSION", str);
    }

    /* renamed from: g */
    public String mo39246g() {
        return this.f2361a.getAsString("CFG_APP_VERSION");
    }

    /* renamed from: d */
    public synchronized void mo39238d(int i) {
        this.f2361a.put("CFG_APP_VERSION_CODE", String.valueOf(i));
    }

    /* renamed from: h */
    public String mo39248h() {
        return this.f2361a.getAsString("CFG_APP_VERSION_CODE");
    }

    /* renamed from: b */
    public synchronized void mo39232b(boolean z) {
        this.f2361a.put("CFG_COLLECT_INSTALLED_APPS", Boolean.valueOf(z));
    }

    /* renamed from: i */
    public Boolean mo39249i() {
        return this.f2361a.getAsBoolean("CFG_COLLECT_INSTALLED_APPS");
    }

    /* renamed from: a */
    public final synchronized void mo39223a(Location location) {
        this.f2361a.put("CFG_MANUAL_LOCATION", C3785oo.m4365a(location));
    }

    /* renamed from: c */
    public synchronized void mo39236c(boolean z) {
        this.f2361a.put("CFG_IS_LOG_ENABLED", Boolean.valueOf(z));
    }

    /* renamed from: j */
    public Boolean mo39250j() {
        return this.f2361a.getAsBoolean("CFG_IS_LOG_ENABLED");
    }

    /* renamed from: k */
    public Location mo39251k() {
        if (this.f2361a.containsKey("CFG_MANUAL_LOCATION")) {
            return C3785oo.m4362a(this.f2361a.getAsByteArray("CFG_MANUAL_LOCATION"));
        }
        return null;
    }

    /* renamed from: l */
    public Boolean mo39252l() {
        return this.f2361a.getAsBoolean("CFG_AUTO_PRELOAD_INFO_DETECTION");
    }

    /* renamed from: m */
    public Boolean mo39253m() {
        return this.f2361a.getAsBoolean("CFG_NATIVE_CRASHES_ENABLED");
    }

    /* renamed from: d */
    public synchronized void mo39240d(boolean z) {
        this.f2361a.put("CFG_AUTO_PRELOAD_INFO_DETECTION", Boolean.valueOf(z));
    }

    /* renamed from: e */
    public synchronized void mo39243e(boolean z) {
        this.f2361a.put("CFG_PERMISSIONS_COLLECTING", Boolean.valueOf(z));
    }

    /* renamed from: f */
    public final synchronized void mo39245f(boolean z) {
        this.f2361a.put("CFG_IS_FIRST_ACTIVATION_AS_UPDATE", Boolean.valueOf(z));
    }

    /* renamed from: n */
    public Boolean mo39254n() {
        return this.f2361a.getAsBoolean("CFG_IS_FIRST_ACTIVATION_AS_UPDATE");
    }

    /* renamed from: o */
    public Integer mo39255o() {
        return this.f2361a.getAsInteger("MAX_REPORTS_IN_DB_COUNT");
    }

    /* renamed from: p */
    public Boolean mo39256p() {
        return this.f2361a.getAsBoolean("CFG_STATISTICS_SENDING");
    }

    /* renamed from: g */
    public final synchronized void mo39247g(boolean z) {
        this.f2361a.put("CFG_STATISTICS_SENDING", Boolean.valueOf(z));
    }

    public synchronized void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.CounterConfiguration.data", this.f2361a);
        parcel.writeBundle(bundle);
    }

    /* renamed from: a */
    public synchronized void mo39225a(C3075a aVar) {
        this.f2361a.put("CFG_REPORTER_TYPE", aVar.mo39264a());
    }

    /* renamed from: q */
    public C3075a mo39257q() {
        return C3075a.m1741a(this.f2361a.getAsString("CFG_REPORTER_TYPE"));
    }

    /* renamed from: a */
    public synchronized void mo39224a(Bundle bundle) {
        bundle.putParcelable("COUNTER_CFG_OBJ", this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo39230b(android.os.Bundle r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto L_0x0005
            monitor-exit(r2)
            return
        L_0x0005:
            java.lang.String r0 = "CFG_DISPATCH_PERIOD"
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "CFG_DISPATCH_PERIOD"
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x0059 }
            r2.mo39222a((int) r0)     // Catch:{ all -> 0x0059 }
        L_0x0016:
            java.lang.String r0 = "CFG_SESSION_TIMEOUT"
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = "CFG_SESSION_TIMEOUT"
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x0059 }
            r2.mo39234c((int) r0)     // Catch:{ all -> 0x0059 }
        L_0x0027:
            java.lang.String r0 = "CFG_MAX_REPORTS_COUNT"
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = "CFG_MAX_REPORTS_COUNT"
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x0059 }
            r2.mo39229b((int) r0)     // Catch:{ all -> 0x0059 }
        L_0x0038:
            java.lang.String r0 = "CFG_API_KEY"
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = "-1"
            java.lang.String r1 = "CFG_API_KEY"
            java.lang.String r1 = r3.getString(r1)     // Catch:{ all -> 0x0059 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0059 }
            if (r0 != 0) goto L_0x0057
            java.lang.String r0 = "CFG_API_KEY"
            java.lang.String r3 = r3.getString(r0)     // Catch:{ all -> 0x0059 }
            r2.mo39231b((java.lang.String) r3)     // Catch:{ all -> 0x0059 }
        L_0x0057:
            monitor-exit(r2)
            return
        L_0x0059:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.CounterConfiguration.mo39230b(android.os.Bundle):void");
    }

    /* renamed from: c */
    public static CounterConfiguration m1689c(Bundle bundle) {
        CounterConfiguration counterConfiguration = null;
        if (bundle != null) {
            try {
                counterConfiguration = (CounterConfiguration) bundle.getParcelable("COUNTER_CFG_OBJ");
            } catch (Throwable unused) {
                return null;
            }
        }
        if (counterConfiguration == null) {
            counterConfiguration = new CounterConfiguration();
        }
        counterConfiguration.mo39230b(bundle);
        return counterConfiguration;
    }

    CounterConfiguration(ContentValues contentValues) {
        this.f2361a = contentValues;
        m1702r();
    }

    /* renamed from: r */
    private void m1702r() {
        if (!this.f2361a.containsKey("CFG_REPORTER_TYPE")) {
            if (this.f2361a.containsKey("CFG_MAIN_REPORTER")) {
                if (this.f2361a.getAsBoolean("CFG_MAIN_REPORTER").booleanValue()) {
                    mo39225a(C3075a.MAIN);
                } else {
                    m1696e(mo39242e());
                }
            } else if (this.f2361a.containsKey("CFG_COMMUTATION_REPORTER") && this.f2361a.getAsBoolean("CFG_COMMUTATION_REPORTER").booleanValue()) {
                mo39225a(C3075a.COMMUTATION);
            }
        }
    }
}
