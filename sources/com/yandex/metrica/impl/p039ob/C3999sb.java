package com.yandex.metrica.impl.p039ob;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.location.Location;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.C3093f;
import com.yandex.metrica.C3095g;
import com.yandex.metrica.C4297j;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IReporter;
import com.yandex.metrica.ReporterConfig;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.profile.UserProfile;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.sb */
public final class C3999sb extends C3960ru<C3969rx<C4026se>> {

    /* renamed from: b */
    private final C4025sd f4665b;

    /* renamed from: c */
    private final C4024sc f4666c;

    public C3999sb(C4257xh xhVar) {
        this(new C3998sa(), xhVar, new C3984ry<C3969rx<C4026se>>(xhVar) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public C3969rx<C4026se> mo41162a(C4257xh xhVar, Context context, String str) {
                return new C3969rx<>(xhVar, context, str, new C4026se());
            }
        }, new C4025sd(), new C4024sc());
    }

    private C3999sb(C3998sa saVar, C4257xh xhVar, C3984ry<C3969rx<C4026se>> ryVar, C4025sd sdVar, C4024sc scVar) {
        this(saVar, xhVar, ryVar, sdVar, scVar, new C3958rt(saVar), new C3095g(saVar));
    }

    C3999sb(C3998sa saVar, C4257xh xhVar, C3984ry<C3969rx<C4026se>> ryVar, C4025sd sdVar, C4024sc scVar, C3958rt rtVar, C3095g gVar) {
        super(saVar, xhVar, ryVar, rtVar, gVar);
        this.f4666c = scVar;
        this.f4665b = sdVar;
    }

    /* renamed from: a */
    public void mo41206a(final Context context, YandexMetricaConfig yandexMetricaConfig) {
        this.f4665b.mo41255a(context, yandexMetricaConfig);
        final C4297j a = this.f4666c.mo41251a(C4297j.m6215a(yandexMetricaConfig));
        this.f4583a.mo39362a(context, (YandexMetricaConfig) a);
        mo41131a().mo41808a((Runnable) new Runnable() {
            public void run() {
                C3999sb.this.mo41133c().mo41196b(context, C4297j.m6215a(a));
            }
        });
        mo41133c().mo41195b();
    }

    /* renamed from: e */
    public void mo41225e() {
        mo41134d().mo41129a();
        this.f4665b.sendEventsBuffer();
        this.f4583a.mo39359a();
        mo41131a().mo41808a((Runnable) new Runnable() {
            public void run() {
                C3999sb.this.mo41133c().mo41200e().sendEventsBuffer();
            }
        });
    }

    /* renamed from: a */
    public void mo41203a(final Activity activity) {
        mo41134d().mo41129a();
        this.f4665b.resumeSession();
        this.f4583a.mo39360a(activity);
        mo41131a().mo41808a((Runnable) new Runnable() {
            public void run() {
                C3999sb.this.mo41133c().mo41200e().mo39535b(activity);
            }
        });
    }

    /* renamed from: b */
    public void mo41219b(final Activity activity) {
        mo41134d().mo41129a();
        this.f4665b.pauseSession();
        this.f4583a.mo39376b(activity);
        mo41131a().mo41808a((Runnable) new Runnable() {
            public void run() {
                C3999sb.this.mo41133c().mo41200e().mo39536c(activity);
            }
        });
    }

    /* renamed from: a */
    public void mo41204a(final Application application) {
        mo41134d().mo41129a();
        this.f4665b.mo41253a(application);
        this.f4583a.mo39361a(application);
        mo41131a().mo41808a((Runnable) new Runnable() {
            public void run() {
                C3999sb.this.mo41133c().mo41200e().mo39533a(application, C3999sb.this.mo41131a());
            }
        });
    }

    /* renamed from: a */
    public void mo41213a(final String str) {
        mo41134d().mo41129a();
        this.f4665b.reportEvent(str);
        this.f4583a.mo39370a(str);
        mo41131a().mo41808a((Runnable) new Runnable() {
            public void run() {
                C3999sb.this.mo41133c().mo41200e().reportEvent(str);
            }
        });
    }

    /* renamed from: a */
    public void mo41214a(final String str, final String str2) {
        mo41134d().mo41129a();
        this.f4665b.reportEvent(str, str2);
        this.f4583a.mo39371a(str, str2);
        mo41131a().mo41808a((Runnable) new Runnable() {
            public void run() {
                C3999sb.this.mo41133c().mo41200e().reportEvent(str, str2);
            }
        });
    }

    /* renamed from: a */
    public void mo41216a(final String str, Map<String, Object> map) {
        final List<Map.Entry<String, Object>> list;
        mo41134d().mo41129a();
        this.f4665b.reportEvent(str, map);
        this.f4583a.mo39373a(str, map);
        if (map == null) {
            list = null;
        } else {
            list = m5164a(map);
        }
        mo41131a().mo41808a((Runnable) new Runnable() {
            public void run() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                List<Map.Entry> list = list;
                if (list != null) {
                    for (Map.Entry entry : list) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                C3999sb.this.mo41133c().mo41200e().reportEvent(str, (Map<String, Object>) linkedHashMap);
            }
        });
    }

    /* renamed from: a */
    public void mo41215a(final String str, final Throwable th) {
        mo41134d().mo41129a();
        this.f4665b.reportError(str, th);
        this.f4583a.mo39372a(str, th);
        mo41131a().mo41808a((Runnable) new Runnable() {
            public void run() {
                C3999sb.this.mo41133c().mo41200e().reportError(str, th);
            }
        });
    }

    /* renamed from: a */
    public void mo41217a(final Throwable th) {
        mo41134d().mo41129a();
        this.f4665b.reportUnhandledException(th);
        this.f4583a.mo39374a(th);
        mo41131a().mo41808a((Runnable) new Runnable() {
            public void run() {
                C3999sb.this.mo41133c().mo41200e().reportUnhandledException(th);
            }
        });
    }

    /* renamed from: b */
    public void mo41221b(final String str) {
        mo41134d().mo41129a();
        this.f4665b.mo41261a(str);
        this.f4583a.mo39380c(str);
        mo41131a().mo41808a((Runnable) new Runnable() {
            public void run() {
                C3999sb.this.mo41133c().mo41200e().mo40664c(str);
            }
        });
    }

    /* renamed from: c */
    public void mo41222c(final Activity activity) {
        mo41134d().mo41129a();
        this.f4665b.mo41252a(activity);
        this.f4583a.mo39379c(activity);
        mo41131a().mo41808a((Runnable) new Runnable() {
            public void run() {
                C3999sb.this.mo41133c().mo41200e().mo39532a(activity);
            }
        });
    }

    /* renamed from: c */
    public void mo41223c(final String str) {
        mo41134d().mo41129a();
        this.f4665b.mo41264b(str);
        this.f4583a.mo39381d(str);
        mo41131a().mo41808a((Runnable) new Runnable() {
            public void run() {
                C3999sb.this.mo41133c().mo41200e().mo39538e(str);
            }
        });
    }

    @Deprecated
    /* renamed from: d */
    public void mo41224d(final String str) {
        mo41134d().mo41129a();
        this.f4665b.mo41265c(str);
        mo41131a().mo41808a((Runnable) new Runnable() {
            public void run() {
                C3999sb.this.mo41133c().mo41200e().mo39539f(str);
            }
        });
    }

    /* renamed from: a */
    public void mo41208a(final Location location) {
        this.f4665b.mo41258a(location);
        this.f4583a.mo39365a(location);
        mo41131a().mo41808a((Runnable) new Runnable() {
            public void run() {
                C3999sb.this.mo41133c().mo41193a(location);
            }
        });
    }

    /* renamed from: a */
    public void mo41218a(final boolean z) {
        this.f4665b.mo41262a(z);
        this.f4583a.mo39375a(z);
        mo41131a().mo41808a((Runnable) new Runnable() {
            public void run() {
                C3999sb.this.mo41133c().mo41194a(z);
            }
        });
    }

    /* renamed from: a */
    public void mo41207a(final Context context, final boolean z) {
        this.f4665b.mo41257a(context, z);
        this.f4583a.mo39364a(context, z);
        mo41131a().mo41808a((Runnable) new Runnable() {
            public void run() {
                C3999sb.this.mo41133c().mo41192a(context, z);
            }
        });
    }

    /* renamed from: b */
    public void mo41220b(final Context context, final boolean z) {
        this.f4665b.mo41263b(context, z);
        this.f4583a.mo39377b(context, z);
        mo41131a().mo41808a((Runnable) new Runnable() {
            public void run() {
                C3999sb.this.mo41133c().mo41197b(context, z);
            }
        });
    }

    /* renamed from: e */
    public void mo41226e(final String str) {
        mo41134d().mo41129a();
        this.f4665b.setUserProfileID(str);
        this.f4583a.mo39378b(str);
        mo41131a().mo41808a((Runnable) new Runnable() {
            public void run() {
                C3999sb.this.mo41133c().mo41200e().setUserProfileID(str);
            }
        });
    }

    /* renamed from: a */
    public void mo41212a(final UserProfile userProfile) {
        mo41134d().mo41129a();
        this.f4665b.reportUserProfile(userProfile);
        this.f4583a.mo39369a(userProfile);
        mo41131a().mo41808a((Runnable) new Runnable() {
            public void run() {
                C3999sb.this.mo41133c().mo41200e().reportUserProfile(userProfile);
            }
        });
    }

    /* renamed from: a */
    public void mo41211a(final Revenue revenue) {
        mo41134d().mo41129a();
        this.f4665b.reportRevenue(revenue);
        this.f4583a.mo39368a(revenue);
        mo41131a().mo41808a((Runnable) new Runnable() {
            public void run() {
                C3999sb.this.mo41133c().mo41200e().reportRevenue(revenue);
            }
        });
    }

    /* renamed from: a */
    public void mo41210a(final DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        mo41134d().mo41129a();
        this.f4665b.mo41260a(deferredDeeplinkParametersListener);
        this.f4583a.mo39367a(deferredDeeplinkParametersListener);
        mo41131a().mo41808a((Runnable) new Runnable() {
            public void run() {
                C3999sb.this.mo41133c().mo41201f().mo39882a(deferredDeeplinkParametersListener);
            }
        });
    }

    /* renamed from: a */
    public void mo41209a(final AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        mo41134d().mo41129a();
        this.f4665b.mo41259a(appMetricaDeviceIDListener);
        this.f4583a.mo39366a(appMetricaDeviceIDListener);
        mo41131a().mo41808a((Runnable) new Runnable() {
            public void run() {
                C3999sb.this.mo41133c().mo41201f().mo39881a(appMetricaDeviceIDListener);
            }
        });
    }

    /* renamed from: a */
    public IReporter mo41202a(Context context, String str) {
        this.f4665b.mo41256a(context, str);
        return mo41132b().mo41161a(context, str);
    }

    /* renamed from: a */
    public void mo41205a(Context context, ReporterConfig reporterConfig) {
        this.f4665b.mo41254a(context, reporterConfig);
        C3093f a = this.f4666c.mo41250a(C3093f.m1791a(reporterConfig));
        this.f4583a.mo39363a(context, a);
        mo41132b().mo41160a(context, (ReporterConfig) a);
    }

    /* renamed from: a */
    private <K, V> List<Map.Entry<K, V>> m5164a(Map<K, V> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<K, V> simpleEntry : map.entrySet()) {
            arrayList.add(new AbstractMap.SimpleEntry(simpleEntry));
        }
        return arrayList;
    }
}
