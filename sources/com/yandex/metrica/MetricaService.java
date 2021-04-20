package com.yandex.metrica;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.yandex.metrica.IMetricaService;
import com.yandex.metrica.impl.p039ob.C3136al;
import com.yandex.metrica.impl.p039ob.C3164bc;
import com.yandex.metrica.impl.p039ob.C3165bd;
import com.yandex.metrica.impl.p039ob.C3175be;
import com.yandex.metrica.impl.p039ob.C3213bt;
import com.yandex.metrica.impl.p039ob.C3271cl;
import com.yandex.metrica.impl.p039ob.C3350dr;
import com.yandex.metrica.impl.p039ob.C3356dt;
import com.yandex.metrica.impl.p039ob.C3364dz;
import com.yandex.metrica.impl.p039ob.C4216vz;

public class MetricaService extends Service {

    /* renamed from: a */
    private C3082c f2373a = new C3082c() {
        /* renamed from: a */
        public void mo39312a(int i) {
            MetricaService.this.stopSelfResult(i);
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3164bc f2374b;

    /* renamed from: c */
    private final IMetricaService.C3076a f2375c = new IMetricaService.C3076a() {
        @Deprecated
        /* renamed from: a */
        public void mo39271a(String str, int i, String str2, Bundle bundle) throws RemoteException {
            MetricaService.this.f2374b.mo39595a(str, i, str2, bundle);
        }

        /* renamed from: a */
        public void mo39270a(Bundle bundle) throws RemoteException {
            MetricaService.this.f2374b.mo39594a(bundle);
        }
    };

    /* renamed from: com.yandex.metrica.MetricaService$c */
    public interface C3082c {
        /* renamed from: a */
        void mo39312a(int i);
    }

    /* renamed from: com.yandex.metrica.MetricaService$b */
    static class C3081b extends Binder {
        C3081b() {
        }
    }

    /* renamed from: com.yandex.metrica.MetricaService$a */
    static class C3080a extends Binder {
        C3080a() {
        }
    }

    public void onCreate() {
        super.onCreate();
        C3136al.m1994a(getApplicationContext());
        m1752a(getResources().getConfiguration());
        C4216vz.m5909a(getApplicationContext());
        this.f2374b = new C3165bd(new C3175be(getApplicationContext(), this.f2373a));
        this.f2374b.mo39596a();
        C3136al.m1993a().mo39485a(new C3271cl(this.f2374b));
    }

    public void onStart(Intent intent, int i) {
        this.f2374b.mo39598a(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        this.f2374b.mo39599a(intent, i, i2);
        return 2;
    }

    public IBinder onBind(Intent intent) {
        IBinder iBinder;
        String action = intent.getAction();
        if ("com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER".equals(action)) {
            iBinder = new C3081b();
        } else if ("com.yandex.metrica.ACTION_C_BG_L".equals(action)) {
            iBinder = new C3080a();
        } else {
            iBinder = this.f2375c;
        }
        this.f2374b.mo39597a(intent);
        return iBinder;
    }

    public void onRebind(Intent intent) {
        super.onRebind(intent);
        this.f2374b.mo39601b(intent);
    }

    public void onDestroy() {
        this.f2374b.mo39600b();
        super.onDestroy();
    }

    public boolean onUnbind(Intent intent) {
        this.f2374b.mo39602c(intent);
        String action = intent.getAction();
        if ("com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER".equals(action)) {
            return false;
        }
        if (!"com.yandex.metrica.ACTION_C_BG_L".equals(action) && m1753a(intent)) {
            return false;
        }
        return true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1752a(configuration);
    }

    /* renamed from: a */
    private void m1752a(Configuration configuration) {
        C3350dr.m3043a().mo39931b((C3356dt) new C3364dz(C3213bt.m2393a(configuration.locale)));
    }

    /* renamed from: a */
    private boolean m1753a(Intent intent) {
        return intent == null || intent.getData() == null;
    }
}
