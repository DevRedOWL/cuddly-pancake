package com.yandex.metrica;

import com.yandex.metrica.impl.p039ob.C3306cx;
import com.yandex.metrica.impl.p039ob.C4285yg;
import com.yandex.metrica.impl.p039ob.C4289yk;
import com.yandex.metrica.impl.p039ob.C4290yl;

public class ReporterConfig {
    public final String apiKey;
    public final Boolean logs;
    public final Integer maxReportsInDatabaseCount;
    public final Integer sessionTimeout;
    public final Boolean statisticsSending;

    ReporterConfig(Builder builder) {
        this.apiKey = builder.f2383b;
        this.sessionTimeout = builder.f2384c;
        this.logs = builder.f2385d;
        this.statisticsSending = builder.f2386e;
        this.maxReportsInDatabaseCount = builder.f2387f;
    }

    ReporterConfig(ReporterConfig reporterConfig) {
        this.apiKey = reporterConfig.apiKey;
        this.sessionTimeout = reporterConfig.sessionTimeout;
        this.logs = reporterConfig.logs;
        this.statisticsSending = reporterConfig.statisticsSending;
        this.maxReportsInDatabaseCount = reporterConfig.maxReportsInDatabaseCount;
    }

    public static Builder createBuilderFromConfig(ReporterConfig reporterConfig) {
        Builder newConfigBuilder = newConfigBuilder(reporterConfig.apiKey);
        if (C3306cx.m2858a((Object) reporterConfig.sessionTimeout)) {
            newConfigBuilder.withSessionTimeout(reporterConfig.sessionTimeout.intValue());
        }
        if (C3306cx.m2858a((Object) reporterConfig.logs) && reporterConfig.logs.booleanValue()) {
            newConfigBuilder.withLogs();
        }
        if (C3306cx.m2858a((Object) reporterConfig.statisticsSending)) {
            newConfigBuilder.withStatisticsSending(reporterConfig.statisticsSending.booleanValue());
        }
        if (C3306cx.m2858a((Object) reporterConfig.maxReportsInDatabaseCount)) {
            newConfigBuilder.withMaxReportsInDatabaseCount(reporterConfig.maxReportsInDatabaseCount.intValue());
        }
        return newConfigBuilder;
    }

    public static Builder newConfigBuilder(String str) {
        return new Builder(str);
    }

    public static class Builder {

        /* renamed from: a */
        private static final C4289yk<String> f2382a = new C4285yg(new C4290yl());
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f2383b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Integer f2384c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Boolean f2385d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Boolean f2386e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public Integer f2387f;

        Builder(String str) {
            f2382a.mo40671a(str);
            this.f2383b = str;
        }

        public Builder withSessionTimeout(int i) {
            this.f2384c = Integer.valueOf(i);
            return this;
        }

        public Builder withLogs() {
            this.f2385d = true;
            return this;
        }

        public Builder withStatisticsSending(boolean z) {
            this.f2386e = Boolean.valueOf(z);
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int i) {
            this.f2387f = Integer.valueOf(i);
            return this;
        }

        public ReporterConfig build() {
            return new ReporterConfig(this);
        }
    }
}
