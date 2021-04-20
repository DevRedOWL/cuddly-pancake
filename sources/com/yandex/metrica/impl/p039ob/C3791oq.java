package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;

/* renamed from: com.yandex.metrica.impl.ob.oq */
public class C3791oq {

    /* renamed from: a */
    private C3794or f3987a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3797ou f3988b;

    /* renamed from: c */
    private C3779ok f3989c;

    /* renamed from: d */
    private LocationListener f3990d;

    /* renamed from: e */
    private boolean f3991e;

    /* renamed from: com.yandex.metrica.impl.ob.oq$a */
    static class C3793a {
        C3793a() {
        }

        /* renamed from: a */
        public C3794or mo40795a(Context context, Looper looper, LocationManager locationManager, LocationListener locationListener, C3832pr prVar) {
            return new C3794or(context, looper, locationManager, locationListener, prVar);
        }
    }

    public C3791oq(Context context, Looper looper, LocationManager locationManager, C3774oh ohVar, C3802ow owVar, C3770od odVar, C3832pr prVar) {
        this(context, looper, locationManager, new C3793a(), new C3797ou(context, ohVar, owVar, odVar), new C3779ok(context, locationManager, prVar), prVar);
    }

    /* renamed from: a */
    public void mo40785a() {
        Location a = this.f3989c.mo40754a();
        if (a != null) {
            this.f3988b.mo40811a(a);
        }
    }

    /* renamed from: b */
    public Location mo40787b() {
        return this.f3988b.mo40810a();
    }

    /* renamed from: c */
    public Location mo40788c() {
        return this.f3989c.mo40754a();
    }

    /* renamed from: d */
    public void mo40789d() {
        this.f3991e = true;
        this.f3987a.mo40796a();
    }

    /* renamed from: e */
    public void mo40790e() {
        this.f3991e = false;
        this.f3987a.mo40797b();
    }

    /* renamed from: a */
    public void mo40786a(C3774oh ohVar) {
        this.f3988b.mo40812a(ohVar);
        m4396f();
    }

    /* renamed from: f */
    private void m4396f() {
        if (this.f3991e) {
            mo40790e();
            mo40789d();
            mo40785a();
        }
    }

    C3791oq(Context context, Looper looper, LocationManager locationManager, C3793a aVar, C3797ou ouVar, C3779ok okVar, C3832pr prVar) {
        this.f3991e = false;
        this.f3990d = new LocationListener() {
            public void onProviderDisabled(String str) {
            }

            public void onProviderEnabled(String str) {
            }

            public void onStatusChanged(String str, int i, Bundle bundle) {
            }

            public void onLocationChanged(Location location) {
                if (location != null) {
                    C3791oq.this.f3988b.mo40811a(location);
                }
            }
        };
        this.f3989c = okVar;
        this.f3987a = aVar.mo40795a(context, looper, locationManager, this.f3990d, prVar);
        this.f3988b = ouVar;
    }
}
