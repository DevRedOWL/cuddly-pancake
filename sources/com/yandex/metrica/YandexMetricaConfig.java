package com.yandex.metrica;

import android.location.Location;
import com.yandex.metrica.impl.p039ob.C3156az;
import com.yandex.metrica.impl.p039ob.C3306cx;
import com.yandex.metrica.impl.p039ob.C4285yg;
import com.yandex.metrica.impl.p039ob.C4289yk;
import com.yandex.metrica.impl.p039ob.C4290yl;

public class YandexMetricaConfig {
    public final String apiKey;
    public final String appVersion;
    public final Boolean crashReporting;
    public final Boolean firstActivationAsUpdate;
    public final Boolean installedAppCollecting;
    public final Location location;
    public final Boolean locationTracking;
    public final Boolean logs;
    public final Integer maxReportsInDatabaseCount;
    public final Boolean nativeCrashReporting;
    public final PreloadInfo preloadInfo;
    public final Integer sessionTimeout;
    public final Boolean statisticsSending;

    public static Builder newConfigBuilder(String str) {
        return new Builder(str);
    }

    public static YandexMetricaConfig fromJson(String str) {
        return new C3156az().mo39542a(str);
    }

    public static class Builder {

        /* renamed from: a */
        private static final C4289yk<String> f2399a = new C4285yg(new C4290yl());
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f2400b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f2401c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Integer f2402d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Boolean f2403e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public Boolean f2404f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public Location f2405g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public Boolean f2406h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public Boolean f2407i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public Boolean f2408j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public PreloadInfo f2409k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public Boolean f2410l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public Boolean f2411m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public Integer f2412n;

        protected Builder(String str) {
            f2399a.mo40671a(str);
            this.f2400b = str;
        }

        public Builder withAppVersion(String str) {
            this.f2401c = str;
            return this;
        }

        public Builder withSessionTimeout(int i) {
            this.f2402d = Integer.valueOf(i);
            return this;
        }

        public Builder withCrashReporting(boolean z) {
            this.f2403e = Boolean.valueOf(z);
            return this;
        }

        public Builder withNativeCrashReporting(boolean z) {
            this.f2404f = Boolean.valueOf(z);
            return this;
        }

        public Builder withLogs() {
            this.f2408j = true;
            return this;
        }

        public Builder withLocation(Location location) {
            this.f2405g = location;
            return this;
        }

        public Builder withLocationTracking(boolean z) {
            this.f2406h = Boolean.valueOf(z);
            return this;
        }

        public Builder withInstalledAppCollecting(boolean z) {
            this.f2407i = Boolean.valueOf(z);
            return this;
        }

        public Builder withPreloadInfo(PreloadInfo preloadInfo) {
            this.f2409k = preloadInfo;
            return this;
        }

        public Builder handleFirstActivationAsUpdate(boolean z) {
            this.f2410l = Boolean.valueOf(z);
            return this;
        }

        public Builder withStatisticsSending(boolean z) {
            this.f2411m = Boolean.valueOf(z);
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int i) {
            this.f2412n = Integer.valueOf(i);
            return this;
        }

        public YandexMetricaConfig build() {
            return new YandexMetricaConfig(this);
        }
    }

    protected YandexMetricaConfig(Builder builder) {
        this.apiKey = builder.f2400b;
        this.appVersion = builder.f2401c;
        this.sessionTimeout = builder.f2402d;
        this.crashReporting = builder.f2403e;
        this.nativeCrashReporting = builder.f2404f;
        this.location = builder.f2405g;
        this.locationTracking = builder.f2406h;
        this.installedAppCollecting = builder.f2407i;
        this.logs = builder.f2408j;
        this.preloadInfo = builder.f2409k;
        this.firstActivationAsUpdate = builder.f2410l;
        this.statisticsSending = builder.f2411m;
        this.maxReportsInDatabaseCount = builder.f2412n;
    }

    protected YandexMetricaConfig(YandexMetricaConfig yandexMetricaConfig) {
        this.apiKey = yandexMetricaConfig.apiKey;
        this.appVersion = yandexMetricaConfig.appVersion;
        this.sessionTimeout = yandexMetricaConfig.sessionTimeout;
        this.crashReporting = yandexMetricaConfig.crashReporting;
        this.nativeCrashReporting = yandexMetricaConfig.nativeCrashReporting;
        this.location = yandexMetricaConfig.location;
        this.locationTracking = yandexMetricaConfig.locationTracking;
        this.installedAppCollecting = yandexMetricaConfig.installedAppCollecting;
        this.logs = yandexMetricaConfig.logs;
        this.preloadInfo = yandexMetricaConfig.preloadInfo;
        this.firstActivationAsUpdate = yandexMetricaConfig.firstActivationAsUpdate;
        this.statisticsSending = yandexMetricaConfig.statisticsSending;
        this.maxReportsInDatabaseCount = yandexMetricaConfig.maxReportsInDatabaseCount;
    }

    public static Builder createBuilderFromConfig(YandexMetricaConfig yandexMetricaConfig) {
        Builder newConfigBuilder = newConfigBuilder(yandexMetricaConfig.apiKey);
        if (C3306cx.m2858a((Object) yandexMetricaConfig.appVersion)) {
            newConfigBuilder.withAppVersion(yandexMetricaConfig.appVersion);
        }
        if (C3306cx.m2858a((Object) yandexMetricaConfig.sessionTimeout)) {
            newConfigBuilder.withSessionTimeout(yandexMetricaConfig.sessionTimeout.intValue());
        }
        if (C3306cx.m2858a((Object) yandexMetricaConfig.crashReporting)) {
            newConfigBuilder.withCrashReporting(yandexMetricaConfig.crashReporting.booleanValue());
        }
        if (C3306cx.m2858a((Object) yandexMetricaConfig.nativeCrashReporting)) {
            newConfigBuilder.withNativeCrashReporting(yandexMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (C3306cx.m2858a((Object) yandexMetricaConfig.location)) {
            newConfigBuilder.withLocation(yandexMetricaConfig.location);
        }
        if (C3306cx.m2858a((Object) yandexMetricaConfig.locationTracking)) {
            newConfigBuilder.withLocationTracking(yandexMetricaConfig.locationTracking.booleanValue());
        }
        if (C3306cx.m2858a((Object) yandexMetricaConfig.installedAppCollecting)) {
            newConfigBuilder.withInstalledAppCollecting(yandexMetricaConfig.installedAppCollecting.booleanValue());
        }
        if (C3306cx.m2858a((Object) yandexMetricaConfig.logs) && yandexMetricaConfig.logs.booleanValue()) {
            newConfigBuilder.withLogs();
        }
        if (C3306cx.m2858a((Object) yandexMetricaConfig.preloadInfo)) {
            newConfigBuilder.withPreloadInfo(yandexMetricaConfig.preloadInfo);
        }
        if (C3306cx.m2858a((Object) yandexMetricaConfig.firstActivationAsUpdate)) {
            newConfigBuilder.handleFirstActivationAsUpdate(yandexMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (C3306cx.m2858a((Object) yandexMetricaConfig.statisticsSending)) {
            newConfigBuilder.withStatisticsSending(yandexMetricaConfig.statisticsSending.booleanValue());
        }
        if (C3306cx.m2858a((Object) yandexMetricaConfig.maxReportsInDatabaseCount)) {
            newConfigBuilder.withMaxReportsInDatabaseCount(yandexMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        return newConfigBuilder;
    }

    public String toJson() {
        return new C3156az().mo39543a(this);
    }
}
