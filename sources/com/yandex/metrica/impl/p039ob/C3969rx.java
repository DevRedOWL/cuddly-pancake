package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import com.yandex.metrica.C3091d;
import com.yandex.metrica.C3093f;
import com.yandex.metrica.IReporter;
import com.yandex.metrica.ReporterConfig;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.impl.p039ob.C4026se;
import com.yandex.metrica.profile.UserProfile;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.rx */
public class C3969rx<B extends C4026se> implements IReporter {

    /* renamed from: a */
    final B f4600a;

    /* renamed from: b */
    final C4257xh f4601b;

    /* renamed from: c */
    final C4024sc f4602c;

    /* renamed from: d */
    private final C3998sa f4603d;

    /* renamed from: e */
    private final Context f4604e;

    /* renamed from: f */
    private final C3093f f4605f;

    C3969rx(C4257xh xhVar, Context context, String str, B b) {
        this(xhVar, context, str, b, new C3998sa(), new C4024sc());
    }

    C3969rx(C4257xh xhVar, Context context, String str, B b, C3998sa saVar, C4024sc scVar) {
        this.f4601b = xhVar;
        this.f4604e = context;
        this.f4605f = C3093f.m1790a(str).mo39356b();
        this.f4600a = b;
        this.f4603d = saVar;
        this.f4602c = scVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C3091d mo41142a() {
        return this.f4603d.mo41190a(this.f4604e).mo39887b(this.f4605f);
    }

    /* renamed from: a */
    public void mo41144a(final String str) {
        this.f4601b.mo41808a((Runnable) new Runnable() {
            public void run() {
                C3969rx.this.mo41145b(C3093f.m1790a(str).mo39356b());
            }
        });
    }

    /* renamed from: a */
    public void mo41143a(final ReporterConfig reporterConfig) {
        this.f4601b.mo41808a((Runnable) new Runnable() {
            public void run() {
                C3969rx rxVar = C3969rx.this;
                rxVar.mo41145b(rxVar.f4602c.mo41250a(C3093f.m1791a(reporterConfig)));
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo41145b(C3093f fVar) {
        this.f4603d.mo41190a(this.f4604e).mo39884a(fVar);
    }

    public void reportEvent(final String str) {
        this.f4600a.reportEvent(str);
        this.f4601b.mo41808a((Runnable) new Runnable() {
            public void run() {
                C3969rx.this.mo41142a().reportEvent(str);
            }
        });
    }

    public void reportEvent(final String str, final String str2) {
        this.f4600a.reportEvent(str, str2);
        this.f4601b.mo41808a((Runnable) new Runnable() {
            public void run() {
                C3969rx.this.mo41142a().reportEvent(str, str2);
            }
        });
    }

    public void reportEvent(final String str, Map<String, Object> map) {
        final ArrayList arrayList;
        this.f4600a.reportEvent(str, map);
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(map.entrySet());
        }
        this.f4601b.mo41808a((Runnable) new Runnable() {
            public void run() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                List<Map.Entry> list = arrayList;
                if (list != null) {
                    for (Map.Entry entry : list) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                C3969rx.this.mo41142a().reportEvent(str, (Map<String, Object>) linkedHashMap);
            }
        });
    }

    public void reportError(final String str, final Throwable th) {
        this.f4600a.reportError(str, th);
        this.f4601b.mo41808a((Runnable) new Runnable() {
            public void run() {
                C3969rx.this.mo41142a().reportError(str, th);
            }
        });
    }

    public void reportUnhandledException(final Throwable th) {
        this.f4600a.reportUnhandledException(th);
        this.f4601b.mo41808a((Runnable) new Runnable() {
            public void run() {
                C3969rx.this.mo41142a().reportUnhandledException(th);
            }
        });
    }

    public void resumeSession() {
        this.f4600a.resumeSession();
        this.f4601b.mo41808a((Runnable) new Runnable() {
            public void run() {
                C3969rx.this.mo41142a().resumeSession();
            }
        });
    }

    public void pauseSession() {
        this.f4600a.pauseSession();
        this.f4601b.mo41808a((Runnable) new Runnable() {
            public void run() {
                C3969rx.this.mo41142a().pauseSession();
            }
        });
    }

    public void setUserProfileID(final String str) {
        this.f4600a.setUserProfileID(str);
        this.f4601b.mo41808a((Runnable) new Runnable() {
            public void run() {
                C3969rx.this.mo41142a().setUserProfileID(str);
            }
        });
    }

    public void reportUserProfile(final UserProfile userProfile) {
        this.f4600a.reportUserProfile(userProfile);
        this.f4601b.mo41808a((Runnable) new Runnable() {
            public void run() {
                C3969rx.this.mo41142a().reportUserProfile(userProfile);
            }
        });
    }

    public void reportRevenue(final Revenue revenue) {
        this.f4600a.reportRevenue(revenue);
        this.f4601b.mo41808a((Runnable) new Runnable() {
            public void run() {
                C3969rx.this.mo41142a().reportRevenue(revenue);
            }
        });
    }

    public void setStatisticsSending(final boolean z) {
        this.f4600a.setStatisticsSending(z);
        this.f4601b.mo41808a((Runnable) new Runnable() {
            public void run() {
                C3969rx.this.mo41142a().setStatisticsSending(z);
            }
        });
    }

    public void sendEventsBuffer() {
        this.f4600a.sendEventsBuffer();
        this.f4601b.mo41808a((Runnable) new Runnable() {
            public void run() {
                C3969rx.this.mo41142a().sendEventsBuffer();
            }
        });
    }
}
