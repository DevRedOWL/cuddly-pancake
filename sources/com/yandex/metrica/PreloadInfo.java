package com.yandex.metrica;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PreloadInfo {

    /* renamed from: a */
    private String f2378a;

    /* renamed from: b */
    private Map<String, String> f2379b;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f2380a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Map<String, String> f2381b;

        private Builder(String str) {
            this.f2380a = str;
            this.f2381b = new HashMap();
        }

        public Builder setAdditionalParams(String str, String str2) {
            if (!(str == null || str2 == null)) {
                this.f2381b.put(str, str2);
            }
            return this;
        }

        public PreloadInfo build() {
            return new PreloadInfo(this);
        }
    }

    private PreloadInfo(Builder builder) {
        this.f2378a = builder.f2380a;
        this.f2379b = Collections.unmodifiableMap(builder.f2381b);
    }

    public static Builder newBuilder(String str) {
        return new Builder(str);
    }

    public String getTrackingId() {
        return this.f2378a;
    }

    public Map<String, String> getAdditionalParams() {
        return this.f2379b;
    }
}
