package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.location.LocationManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.k */
public class C3592k {

    /* renamed from: a */
    private final LocationManager f3528a;

    public C3592k(Context context) {
        this((LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION));
    }

    C3592k(LocationManager locationManager) {
        this.f3528a = locationManager;
    }

    /* renamed from: a */
    public List<String> mo40342a() {
        ArrayList arrayList = new ArrayList();
        LocationManager locationManager = this.f3528a;
        return locationManager != null ? locationManager.getProviders(true) : arrayList;
    }
}
