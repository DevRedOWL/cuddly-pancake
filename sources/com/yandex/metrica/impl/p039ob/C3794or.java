package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.or */
class C3794or {

    /* renamed from: a */
    static final long f3993a = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: b */
    private Context f3994b;

    /* renamed from: c */
    private Looper f3995c;

    /* renamed from: d */
    private LocationManager f3996d;

    /* renamed from: e */
    private LocationListener f3997e;

    /* renamed from: f */
    private C3832pr f3998f;

    public C3794or(Context context, Looper looper, LocationManager locationManager, LocationListener locationListener, C3832pr prVar) {
        this.f3994b = context;
        this.f3995c = looper;
        this.f3996d = locationManager;
        this.f3997e = locationListener;
        this.f3998f = prVar;
    }

    /* renamed from: a */
    public void mo40796a() {
        if (this.f3998f.mo40855b(this.f3994b)) {
            m4404a("passive", 0.0f, f3993a, this.f3997e, this.f3995c);
        }
    }

    /* renamed from: b */
    public void mo40797b() {
        LocationManager locationManager = this.f3996d;
        if (locationManager != null) {
            try {
                locationManager.removeUpdates(this.f3997e);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private void m4404a(String str, float f, long j, LocationListener locationListener, Looper looper) {
        LocationManager locationManager = this.f3996d;
        if (locationManager != null) {
            try {
                locationManager.requestLocationUpdates(str, j, f, locationListener, looper);
            } catch (Throwable unused) {
            }
        }
    }
}
