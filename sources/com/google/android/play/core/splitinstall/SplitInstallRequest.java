package com.google.android.play.core.splitinstall;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SplitInstallRequest {

    /* renamed from: a */
    private final List<String> f2044a;

    /* renamed from: b */
    private final List<Locale> f2045b;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final List<String> f2046a = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final List<Locale> f2047b = new ArrayList();

        private Builder() {
        }

        /* synthetic */ Builder(byte[] bArr) {
        }

        public Builder addLanguage(Locale locale) {
            this.f2047b.add(locale);
            return this;
        }

        public Builder addModule(String str) {
            this.f2046a.add(str);
            return this;
        }

        public SplitInstallRequest build() {
            return new SplitInstallRequest(this);
        }
    }

    /* synthetic */ SplitInstallRequest(Builder builder) {
        this.f2044a = new ArrayList(builder.f2046a);
        this.f2045b = new ArrayList(builder.f2047b);
    }

    public static Builder newBuilder() {
        return new Builder((byte[]) null);
    }

    public List<Locale> getLanguages() {
        return this.f2045b;
    }

    public List<String> getModuleNames() {
        return this.f2044a;
    }

    public String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", new Object[]{this.f2044a, this.f2045b});
    }
}
