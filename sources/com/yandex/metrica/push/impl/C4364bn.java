package com.yandex.metrica.push.impl;

import android.content.Context;
import java.util.Locale;

/* renamed from: com.yandex.metrica.push.impl.bn */
class C4364bn extends C4368br {

    /* renamed from: a */
    private static final String f5478a = String.format(Locale.US, "Expected two identifiers: %s and %s in resources. Use gradle plugin com.google.gms.google-services in your application build.gradle and add google-services.json in your project. See more at %s", new Object[]{"google_app_id", "gcm_defaultSenderId", "https://tech.yandex.com/appmetrica/doc/mobile-sdk-dg/push/android-initialize-docpage"});

    C4364bn(Context context) {
        super(context, f5478a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo41991a() {
        return C4380cb.m6474c(mo42002f(), "google_api_key");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo41992b() {
        return C4380cb.m6474c(mo42002f(), "google_app_id");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo41993c() {
        return C4380cb.m6474c(mo42002f(), "gcm_defaultSenderId");
    }
}
