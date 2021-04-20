package com.yandex.metrica.impl.p039ob;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.location.Location;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.ReporterConfig;
import com.yandex.metrica.YandexMetricaConfig;

/* renamed from: com.yandex.metrica.impl.ob.sd */
public class C4025sd extends C4027sf {

    /* renamed from: g */
    private static final C4289yk<YandexMetricaConfig> f4718g = new C4285yg(new C4284yf("Config"));

    /* renamed from: h */
    private static final C4289yk<String> f4719h = new C4285yg(new C4283ye("Native crash"));

    /* renamed from: i */
    private static final C4289yk<Activity> f4720i = new C4285yg(new C4284yf("Activity"));

    /* renamed from: j */
    private static final C4289yk<Application> f4721j = new C4285yg(new C4284yf("Application"));

    /* renamed from: k */
    private static final C4289yk<Context> f4722k = new C4285yg(new C4284yf("Context"));

    /* renamed from: l */
    private static final C4289yk<DeferredDeeplinkParametersListener> f4723l = new C4285yg(new C4284yf("Deeplink listener"));

    /* renamed from: m */
    private static final C4289yk<AppMetricaDeviceIDListener> f4724m = new C4285yg(new C4284yf("DeviceID listener"));

    /* renamed from: n */
    private static final C4289yk<ReporterConfig> f4725n = new C4285yg(new C4284yf("Reporter Config"));

    /* renamed from: o */
    private static final C4289yk<String> f4726o = new C4285yg(new C4283ye("Deeplink"));
    @Deprecated

    /* renamed from: p */
    private static final C4289yk<String> f4727p = new C4285yg(new C4283ye("Referral url"));

    /* renamed from: q */
    private static final C4289yk<String> f4728q = new C4285yg(new C4290yl());

    /* renamed from: a */
    public void mo41258a(Location location) {
    }

    /* renamed from: a */
    public void mo41262a(boolean z) {
    }

    /* renamed from: a */
    public void mo41261a(String str) {
        f4719h.mo40671a(str);
    }

    /* renamed from: a */
    public void mo41253a(Application application) {
        f4721j.mo40671a(application);
    }

    /* renamed from: a */
    public void mo41252a(Activity activity) {
        f4720i.mo40671a(activity);
    }

    /* renamed from: b */
    public void mo41264b(String str) {
        f4726o.mo40671a(str);
    }

    @Deprecated
    /* renamed from: c */
    public void mo41265c(String str) {
        f4727p.mo40671a(str);
    }

    /* renamed from: a */
    public void mo41257a(Context context, boolean z) {
        f4722k.mo40671a(context);
    }

    /* renamed from: a */
    public void mo41260a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        f4723l.mo40671a(deferredDeeplinkParametersListener);
    }

    /* renamed from: a */
    public void mo41259a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        f4724m.mo40671a(appMetricaDeviceIDListener);
    }

    /* renamed from: b */
    public void mo41263b(Context context, boolean z) {
        f4722k.mo40671a(context);
    }

    /* renamed from: a */
    public void mo41256a(Context context, String str) {
        f4722k.mo40671a(context);
        f4728q.mo40671a(str);
    }

    /* renamed from: a */
    public void mo41254a(Context context, ReporterConfig reporterConfig) {
        f4722k.mo40671a(context);
        f4725n.mo40671a(reporterConfig);
    }

    /* renamed from: a */
    public void mo41255a(Context context, YandexMetricaConfig yandexMetricaConfig) {
        f4722k.mo40671a(context);
        f4718g.mo40671a(yandexMetricaConfig);
    }
}
