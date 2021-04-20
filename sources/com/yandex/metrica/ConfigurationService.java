package com.yandex.metrica;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.yandex.metrica.impl.p039ob.C3136al;
import com.yandex.metrica.impl.p039ob.C3306cx;
import com.yandex.metrica.impl.p039ob.C3329de;
import com.yandex.metrica.impl.p039ob.C3330df;
import com.yandex.metrica.impl.p039ob.C3567jn;
import com.yandex.metrica.impl.p039ob.C3576jr;
import com.yandex.metrica.impl.p039ob.C3584jv;
import com.yandex.metrica.impl.p039ob.C3590jy;
import com.yandex.metrica.impl.p039ob.C3591jz;
import com.yandex.metrica.impl.p039ob.C3593ka;
import java.util.HashMap;
import java.util.Map;

public class ConfigurationService extends Service {

    /* renamed from: a */
    private Map<String, C3590jy> f2358a = new HashMap();

    /* renamed from: b */
    private C3576jr f2359b;

    /* renamed from: c */
    private String f2360c;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        C3136al.m1994a(getApplicationContext());
        this.f2360c = String.format("[ConfigurationService:%s]", new Object[]{getPackageName()});
        this.f2359b = new C3576jr();
        Context applicationContext = getApplicationContext();
        C3584jv jvVar = new C3584jv(applicationContext, this.f2359b.mo40322a(), new C3567jn(applicationContext));
        this.f2358a.put("com.yandex.metrica.configuration.ACTION_INIT", new C3593ka(getApplicationContext(), jvVar, C3306cx.m2857a(21) ? new C3329de(applicationContext, new C3330df(applicationContext)) : null));
        this.f2358a.put("com.yandex.metrica.configuration.ACTION_SCHEDULED_START", new C3591jz(getApplicationContext(), jvVar));
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        Bundle bundle = null;
        C3590jy jyVar = this.f2358a.get(intent == null ? null : intent.getAction());
        if (jyVar == null) {
            return 2;
        }
        C3576jr jrVar = this.f2359b;
        if (intent != null) {
            bundle = intent.getExtras();
        }
        jrVar.mo40323a(jyVar, bundle);
        return 2;
    }
}
