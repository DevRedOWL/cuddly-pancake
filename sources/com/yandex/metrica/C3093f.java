package com.yandex.metrica;

import com.yandex.metrica.ReporterConfig;
import com.yandex.metrica.impl.p039ob.C3306cx;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.f */
public class C3093f extends ReporterConfig {

    /* renamed from: a */
    public final Integer f2424a;

    /* renamed from: b */
    public final Integer f2425b;

    /* renamed from: c */
    public final Map<String, String> f2426c;

    C3093f(C3094a aVar) {
        super(aVar.f2427a);
        this.f2425b = aVar.f2428b;
        this.f2424a = aVar.f2429c;
        this.f2426c = aVar.f2430d == null ? null : Collections.unmodifiableMap(aVar.f2430d);
    }

    private C3093f(ReporterConfig reporterConfig) {
        super(reporterConfig);
        if (reporterConfig instanceof C3093f) {
            C3093f fVar = (C3093f) reporterConfig;
            this.f2424a = fVar.f2424a;
            this.f2425b = fVar.f2425b;
            this.f2426c = fVar.f2426c;
            return;
        }
        this.f2424a = null;
        this.f2425b = null;
        this.f2426c = null;
    }

    /* renamed from: a */
    public static C3093f m1791a(ReporterConfig reporterConfig) {
        return new C3093f(reporterConfig);
    }

    /* renamed from: a */
    public static C3094a m1789a(C3093f fVar) {
        C3094a a = m1790a(fVar.apiKey);
        if (C3306cx.m2858a((Object) fVar.sessionTimeout)) {
            a.mo39352a(fVar.sessionTimeout.intValue());
        }
        if (C3306cx.m2858a((Object) fVar.logs) && fVar.logs.booleanValue()) {
            a.mo39351a();
        }
        if (C3306cx.m2858a((Object) fVar.statisticsSending)) {
            a.mo39354a(fVar.statisticsSending.booleanValue());
        }
        if (C3306cx.m2858a((Object) fVar.maxReportsInDatabaseCount)) {
            a.mo39358d(fVar.maxReportsInDatabaseCount.intValue());
        }
        if (C3306cx.m2858a((Object) fVar.f2424a)) {
            a.mo39357c(fVar.f2424a.intValue());
        }
        if (C3306cx.m2858a((Object) fVar.f2425b)) {
            a.mo39355b(fVar.f2425b.intValue());
        }
        if (C3306cx.m2858a((Object) fVar.f2426c)) {
            for (Map.Entry next : fVar.f2426c.entrySet()) {
                a.mo39353a((String) next.getKey(), (String) next.getValue());
            }
        }
        return a;
    }

    /* renamed from: a */
    public static C3094a m1790a(String str) {
        return new C3094a(str);
    }

    /* renamed from: com.yandex.metrica.f$a */
    public static class C3094a {

        /* renamed from: a */
        ReporterConfig.Builder f2427a;

        /* renamed from: b */
        Integer f2428b;

        /* renamed from: c */
        Integer f2429c;

        /* renamed from: d */
        LinkedHashMap<String, String> f2430d = new LinkedHashMap<>();

        public C3094a(String str) {
            this.f2427a = ReporterConfig.newConfigBuilder(str);
        }

        /* renamed from: a */
        public C3094a mo39352a(int i) {
            this.f2427a.withSessionTimeout(i);
            return this;
        }

        /* renamed from: a */
        public C3094a mo39351a() {
            this.f2427a.withLogs();
            return this;
        }

        /* renamed from: b */
        public C3094a mo39355b(int i) {
            this.f2428b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: c */
        public C3094a mo39357c(int i) {
            this.f2429c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: a */
        public C3094a mo39353a(String str, String str2) {
            this.f2430d.put(str, str2);
            return this;
        }

        /* renamed from: a */
        public C3094a mo39354a(boolean z) {
            this.f2427a.withStatisticsSending(z);
            return this;
        }

        /* renamed from: d */
        public C3094a mo39358d(int i) {
            this.f2427a.withMaxReportsInDatabaseCount(i);
            return this;
        }

        /* renamed from: b */
        public C3093f mo39356b() {
            return new C3093f(this);
        }
    }
}
