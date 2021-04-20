package com.yandex.metrica;

import android.location.Location;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.impl.p039ob.C3306cx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.yandex.metrica.j */
public class C4297j extends YandexMetricaConfig {

    /* renamed from: a */
    public final String f5358a;

    /* renamed from: b */
    public final Map<String, String> f5359b;

    /* renamed from: c */
    public final String f5360c;

    /* renamed from: d */
    public final List<String> f5361d;

    /* renamed from: e */
    public final Integer f5362e;

    /* renamed from: f */
    public final Integer f5363f;

    /* renamed from: g */
    public final Integer f5364g;

    /* renamed from: h */
    public final Map<String, String> f5365h;

    /* renamed from: i */
    public final Map<String, String> f5366i;

    /* renamed from: j */
    public final Boolean f5367j;

    /* renamed from: k */
    public final Boolean f5368k;

    /* renamed from: l */
    public final Boolean f5369l;

    /* renamed from: m */
    public final C3092e f5370m;

    /* renamed from: n */
    public final C3090c f5371n;

    public C4297j(YandexMetricaConfig yandexMetricaConfig) {
        super(yandexMetricaConfig);
        this.f5358a = null;
        this.f5359b = null;
        this.f5362e = null;
        this.f5363f = null;
        this.f5364g = null;
        this.f5360c = null;
        this.f5366i = null;
        this.f5367j = null;
        this.f5368k = null;
        this.f5361d = null;
        this.f5365h = null;
        this.f5370m = null;
        this.f5369l = null;
        this.f5371n = null;
    }

    /* renamed from: a */
    public static C4297j m6215a(YandexMetricaConfig yandexMetricaConfig) {
        if (yandexMetricaConfig instanceof C4297j) {
            return (C4297j) yandexMetricaConfig;
        }
        return new C4297j(yandexMetricaConfig);
    }

    /* renamed from: a */
    public static C4299a m6214a(String str) {
        return new C4299a(str);
    }

    /* renamed from: a */
    public static C4299a m6213a(C4297j jVar) {
        C4299a a = m6217b(jVar).mo41893a((List<String>) new ArrayList());
        if (C3306cx.m2858a((Object) jVar.f5358a)) {
            a.mo41902c(jVar.f5358a);
        }
        if (C3306cx.m2858a((Object) jVar.f5359b) && C3306cx.m2858a((Object) jVar.f5367j)) {
            a.mo41894a(jVar.f5359b, jVar.f5367j);
        }
        if (C3306cx.m2858a((Object) jVar.f5362e)) {
            a.mo41896b(jVar.f5362e.intValue());
        }
        if (C3306cx.m2858a((Object) jVar.f5363f)) {
            a.mo41904d(jVar.f5363f.intValue());
        }
        if (C3306cx.m2858a((Object) jVar.f5364g)) {
            a.mo41901c(jVar.f5364g.intValue());
        }
        if (C3306cx.m2858a((Object) jVar.f5360c)) {
            a.mo41897b(jVar.f5360c);
        }
        if (C3306cx.m2858a((Object) jVar.f5366i)) {
            for (Map.Entry next : jVar.f5366i.entrySet()) {
                a.mo41898b((String) next.getKey(), (String) next.getValue());
            }
        }
        if (C3306cx.m2858a((Object) jVar.f5368k)) {
            a.mo41910h(jVar.f5368k.booleanValue());
        }
        if (C3306cx.m2858a((Object) jVar.f5361d)) {
            a.mo41893a(jVar.f5361d);
        }
        if (C3306cx.m2858a((Object) jVar.f5365h)) {
            for (Map.Entry next2 : jVar.f5365h.entrySet()) {
                a.mo41892a((String) next2.getKey(), (String) next2.getValue());
            }
        }
        if (C3306cx.m2858a((Object) jVar.f5370m)) {
            a.mo41890a(jVar.f5370m);
        }
        if (C3306cx.m2858a((Object) jVar.f5369l)) {
            a.mo41903c(jVar.f5369l.booleanValue());
        }
        return a;
    }

    /* renamed from: b */
    public static C4299a m6217b(YandexMetricaConfig yandexMetricaConfig) {
        C4299a a = m6214a(yandexMetricaConfig.apiKey);
        if (C3306cx.m2858a((Object) yandexMetricaConfig.appVersion)) {
            a.mo41891a(yandexMetricaConfig.appVersion);
        }
        if (C3306cx.m2858a((Object) yandexMetricaConfig.sessionTimeout)) {
            a.mo41886a(yandexMetricaConfig.sessionTimeout.intValue());
        }
        if (C3306cx.m2858a((Object) yandexMetricaConfig.crashReporting)) {
            a.mo41895a(yandexMetricaConfig.crashReporting.booleanValue());
        }
        if (C3306cx.m2858a((Object) yandexMetricaConfig.nativeCrashReporting)) {
            a.mo41899b(yandexMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (C3306cx.m2858a((Object) yandexMetricaConfig.location)) {
            a.mo41887a(yandexMetricaConfig.location);
        }
        if (C3306cx.m2858a((Object) yandexMetricaConfig.locationTracking)) {
            a.mo41905d(yandexMetricaConfig.locationTracking.booleanValue());
        }
        if (C3306cx.m2858a((Object) yandexMetricaConfig.installedAppCollecting)) {
            a.mo41907e(yandexMetricaConfig.installedAppCollecting.booleanValue());
        }
        if (C3306cx.m2858a((Object) yandexMetricaConfig.logs) && yandexMetricaConfig.logs.booleanValue()) {
            a.mo41885a();
        }
        if (C3306cx.m2858a((Object) yandexMetricaConfig.preloadInfo)) {
            a.mo41888a(yandexMetricaConfig.preloadInfo);
        }
        if (C3306cx.m2858a((Object) yandexMetricaConfig.firstActivationAsUpdate)) {
            a.mo41909g(yandexMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (C3306cx.m2858a((Object) yandexMetricaConfig.statisticsSending)) {
            a.mo41908f(yandexMetricaConfig.statisticsSending.booleanValue());
        }
        if (C3306cx.m2858a((Object) yandexMetricaConfig.maxReportsInDatabaseCount)) {
            a.mo41906e(yandexMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        m6216a(yandexMetricaConfig, a);
        return a;
    }

    /* renamed from: a */
    private static void m6216a(YandexMetricaConfig yandexMetricaConfig, C4299a aVar) {
        if (yandexMetricaConfig instanceof C4297j) {
            C4297j jVar = (C4297j) yandexMetricaConfig;
            if (C3306cx.m2858a((Object) jVar.f5361d)) {
                aVar.mo41893a(jVar.f5361d);
            }
            if (C3306cx.m2858a((Object) jVar.f5371n)) {
                aVar.mo41889a(jVar.f5371n);
            }
        }
    }

    /* renamed from: com.yandex.metrica.j$a */
    public static final class C4299a {

        /* renamed from: a */
        public String f5372a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public YandexMetricaConfig.Builder f5373b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f5374c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public List<String> f5375d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Integer f5376e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public Map<String, String> f5377f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public Integer f5378g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public Integer f5379h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public LinkedHashMap<String, String> f5380i = new LinkedHashMap<>();
        /* access modifiers changed from: private */

        /* renamed from: j */
        public LinkedHashMap<String, String> f5381j = new LinkedHashMap<>();
        /* access modifiers changed from: private */

        /* renamed from: k */
        public Boolean f5382k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public Boolean f5383l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public C3092e f5384m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public Boolean f5385n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public C3090c f5386o;

        protected C4299a(String str) {
            this.f5373b = YandexMetricaConfig.newConfigBuilder(str);
        }

        /* renamed from: a */
        public C4299a mo41891a(String str) {
            this.f5373b.withAppVersion(str);
            return this;
        }

        /* renamed from: a */
        public C4299a mo41886a(int i) {
            this.f5373b.withSessionTimeout(i);
            return this;
        }

        /* renamed from: b */
        public C4299a mo41897b(String str) {
            this.f5372a = str;
            return this;
        }

        /* renamed from: a */
        public C4299a mo41895a(boolean z) {
            this.f5373b.withCrashReporting(z);
            return this;
        }

        /* renamed from: b */
        public C4299a mo41899b(boolean z) {
            this.f5373b.withNativeCrashReporting(z);
            return this;
        }

        /* renamed from: c */
        public C4299a mo41903c(boolean z) {
            this.f5385n = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: a */
        public C4299a mo41885a() {
            this.f5373b.withLogs();
            return this;
        }

        /* renamed from: a */
        public C4299a mo41887a(Location location) {
            this.f5373b.withLocation(location);
            return this;
        }

        /* renamed from: d */
        public C4299a mo41905d(boolean z) {
            this.f5373b.withLocationTracking(z);
            return this;
        }

        /* renamed from: e */
        public C4299a mo41907e(boolean z) {
            this.f5373b.withInstalledAppCollecting(z);
            return this;
        }

        /* renamed from: f */
        public C4299a mo41908f(boolean z) {
            this.f5373b.withStatisticsSending(z);
            return this;
        }

        /* renamed from: a */
        public C4299a mo41892a(String str, String str2) {
            this.f5380i.put(str, str2);
            return this;
        }

        /* renamed from: c */
        public C4299a mo41902c(String str) {
            this.f5374c = str;
            return this;
        }

        /* renamed from: a */
        public C4299a mo41893a(List<String> list) {
            this.f5375d = list;
            return this;
        }

        /* renamed from: b */
        public C4299a mo41896b(int i) {
            if (i >= 0) {
                this.f5376e = Integer.valueOf(i);
                return this;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "Invalid %1$s. %1$s should be positive.", new Object[]{"App Build Number"}));
        }

        /* renamed from: a */
        public C4299a mo41894a(Map<String, String> map, Boolean bool) {
            this.f5382k = bool;
            this.f5377f = map;
            return this;
        }

        /* renamed from: c */
        public C4299a mo41901c(int i) {
            this.f5379h = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public C4299a mo41904d(int i) {
            this.f5378g = Integer.valueOf(i);
            return this;
        }

        /* renamed from: a */
        public C4299a mo41888a(PreloadInfo preloadInfo) {
            this.f5373b.withPreloadInfo(preloadInfo);
            return this;
        }

        /* renamed from: g */
        public C4299a mo41909g(boolean z) {
            this.f5373b.handleFirstActivationAsUpdate(z);
            return this;
        }

        /* renamed from: b */
        public C4299a mo41898b(String str, String str2) {
            this.f5381j.put(str, str2);
            return this;
        }

        /* renamed from: h */
        public C4299a mo41910h(boolean z) {
            this.f5383l = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: a */
        public C4299a mo41890a(C3092e eVar) {
            this.f5384m = eVar;
            return this;
        }

        /* renamed from: e */
        public C4299a mo41906e(int i) {
            this.f5373b.withMaxReportsInDatabaseCount(i);
            return this;
        }

        /* renamed from: a */
        public C4299a mo41889a(C3090c cVar) {
            this.f5386o = cVar;
            return this;
        }

        /* renamed from: b */
        public C4297j mo41900b() {
            return new C4297j(this);
        }
    }

    private C4297j(C4299a aVar) {
        super(aVar.f5373b);
        List<String> list;
        Map<String, String> map;
        Map<String, String> map2;
        this.f5362e = aVar.f5376e;
        List c = aVar.f5375d;
        Map<String, String> map3 = null;
        if (c == null) {
            list = null;
        } else {
            list = Collections.unmodifiableList(c);
        }
        this.f5361d = list;
        this.f5358a = aVar.f5374c;
        Map e = aVar.f5377f;
        if (e == null) {
            map = null;
        } else {
            map = Collections.unmodifiableMap(e);
        }
        this.f5359b = map;
        this.f5364g = aVar.f5379h;
        this.f5363f = aVar.f5378g;
        this.f5360c = aVar.f5372a;
        if (aVar.f5380i == null) {
            map2 = null;
        } else {
            map2 = Collections.unmodifiableMap(aVar.f5380i);
        }
        this.f5365h = map2;
        this.f5366i = aVar.f5381j != null ? Collections.unmodifiableMap(aVar.f5381j) : map3;
        this.f5367j = aVar.f5382k;
        this.f5368k = aVar.f5383l;
        this.f5370m = aVar.f5384m;
        this.f5369l = aVar.f5385n;
        this.f5371n = aVar.f5386o;
    }
}
