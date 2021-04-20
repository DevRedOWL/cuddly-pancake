package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.metrica.C4297j;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.impl.interact.CellularNetworkInfo;
import com.yandex.metrica.impl.interact.DeviceInfo;
import com.yandex.metrica.impl.p038ac.C3098a;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: com.yandex.metrica.impl.ob.rz */
public class C3986rz {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3998sa f4639a;

    /* renamed from: b */
    private final C4257xh f4640b;

    /* renamed from: c */
    private final C3958rt f4641c;

    /* renamed from: d */
    private final C4289yk<Context> f4642d;

    /* renamed from: e */
    private final C4289yk<String> f4643e;

    /* renamed from: f */
    private final C3993a f4644f;

    /* renamed from: a */
    public void mo41171a(Context context, Object obj) {
    }

    /* renamed from: b */
    public void mo41176b(Context context, Object obj) {
    }

    /* renamed from: com.yandex.metrica.impl.ob.rz$a */
    static class C3993a {
        C3993a() {
        }

        /* renamed from: a */
        public C3779ok mo41188a(Context context, LocationManager locationManager) {
            return new C3779ok(context, locationManager, new C3832pr(new C3826pm()));
        }
    }

    public C3986rz(C4257xh xhVar) {
        this(xhVar, new C3998sa());
    }

    public C3986rz(C4257xh xhVar, C3998sa saVar) {
        this(xhVar, saVar, new C3958rt(saVar), new C4285yg(new C4284yf("Context")), new C4285yg(new C4284yf("Event name")), new C3993a());
    }

    public C3986rz(C4257xh xhVar, C3998sa saVar, C3958rt rtVar, C4289yk<Context> ykVar, C4289yk<String> ykVar2, C3993a aVar) {
        this.f4639a = saVar;
        this.f4640b = xhVar;
        this.f4641c = rtVar;
        this.f4642d = ykVar;
        this.f4643e = ykVar2;
        this.f4644f = aVar;
    }

    @Deprecated
    /* renamed from: a */
    public void mo41172a(final IIdentifierCallback iIdentifierCallback, final List<String> list) {
        this.f4640b.mo41808a((Runnable) new C4220wb() {
            /* renamed from: a */
            public void mo39603a() throws Exception {
                if (C3986rz.this.f4639a.mo41199d()) {
                    C3986rz.this.f4639a.mo41189a().mo39883a(iIdentifierCallback, (List<String>) list);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo41170a(final Context context, final IIdentifierCallback iIdentifierCallback, final List<String> list) {
        this.f4642d.mo40671a(context);
        this.f4640b.mo41808a((Runnable) new C4220wb() {
            /* renamed from: a */
            public void mo39603a() throws Exception {
                C3986rz.this.f4639a.mo41190a(context).mo39883a(iIdentifierCallback, (List<String>) list);
            }
        });
    }

    /* renamed from: a */
    public boolean mo41173a() {
        return this.f4639a.mo41198c();
    }

    /* renamed from: b */
    public Future<String> mo41175b() {
        return this.f4640b.mo41807a(new C4219wa<String>() {
            /* renamed from: a */
            public String mo41186b() {
                return C3098a.m1843b().mo39396c();
            }
        });
    }

    /* renamed from: c */
    public Future<Boolean> mo41178c() {
        return this.f4640b.mo41807a(new C4219wa<Boolean>() {
            /* renamed from: a */
            public Boolean mo41186b() {
                return C3098a.m1843b().mo39397d();
            }
        });
    }

    /* renamed from: a */
    public DeviceInfo mo41166a(Context context) {
        this.f4642d.mo40671a(context);
        return DeviceInfo.getInstance(context);
    }

    /* renamed from: b */
    public String mo41174b(Context context) {
        this.f4642d.mo40671a(context);
        return new CellularNetworkInfo(context).getCelluralInfo();
    }

    /* renamed from: c */
    public Integer mo41177c(Context context) {
        this.f4642d.mo40671a(context);
        return C3213bt.m2398c(context);
    }

    @Deprecated
    /* renamed from: d */
    public String mo41179d() {
        if (this.f4639a.mo41199d()) {
            return this.f4639a.mo41189a().mo39891j();
        }
        return null;
    }

    /* renamed from: d */
    public String mo41180d(Context context) {
        this.f4642d.mo40671a(context);
        return this.f4639a.mo41190a(context).mo39891j();
    }

    /* renamed from: e */
    public String mo41181e(Context context) {
        this.f4642d.mo40671a(context);
        return this.f4639a.mo41190a(context).mo39890i();
    }

    /* renamed from: f */
    public String mo41183f(Context context) {
        this.f4642d.mo40671a(context);
        return context.getPackageName();
    }

    /* renamed from: a */
    public void mo41169a(int i, String str, String str2, Map<String, String> map) {
        this.f4641c.mo41129a();
        this.f4643e.mo40671a(str);
        final int i2 = i;
        final String str3 = str;
        final String str4 = str2;
        final Map<String, String> map2 = map;
        this.f4640b.mo41808a((Runnable) new C4220wb() {
            /* renamed from: a */
            public void mo39603a() throws Exception {
                C3986rz.this.f4639a.mo41200e().mo40655a(i2, str3, str4, map2);
            }
        });
    }

    /* renamed from: e */
    public void mo41182e() {
        this.f4641c.mo41129a();
        this.f4640b.mo41808a((Runnable) new C4220wb() {
            /* renamed from: a */
            public void mo39603a() throws Exception {
                C3986rz.this.f4639a.mo41200e().sendEventsBuffer();
            }
        });
    }

    /* renamed from: a */
    public String mo41168a(String str) {
        return C3266ci.m2611a(str);
    }

    /* renamed from: a */
    public String mo41167a(int i) {
        return C3236bw.m2473a(i);
    }

    /* renamed from: a */
    public YandexMetricaConfig mo41164a(YandexMetricaConfig yandexMetricaConfig, String str) {
        return C4297j.m6217b(yandexMetricaConfig).mo41893a((List<String>) Collections.singletonList(str)).mo41900b();
    }

    /* renamed from: a */
    public YandexMetricaConfig mo41165a(YandexMetricaConfig yandexMetricaConfig, List<String> list) {
        return C4297j.m6217b(yandexMetricaConfig).mo41893a(list).mo41900b();
    }

    /* renamed from: g */
    public Location mo41184g(Context context) {
        LocationManager locationManager;
        this.f4642d.mo40671a(context);
        try {
            locationManager = (LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION);
        } catch (Throwable unused) {
            locationManager = null;
        }
        return this.f4644f.mo41188a(context, locationManager).mo40754a();
    }
}
