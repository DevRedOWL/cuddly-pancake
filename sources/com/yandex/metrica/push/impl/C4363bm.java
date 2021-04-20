package com.yandex.metrica.push.impl;

import android.content.Context;
import java.util.Locale;

/* renamed from: com.yandex.metrica.push.impl.bm */
class C4363bm extends C4368br {

    /* renamed from: a */
    private static final String f5477a = String.format(Locale.US, "Expected two identifiers: %s and %s in application block of AndroidManifest.xml. See more at https://tech.yandex.com/appmetrica/doc/mobile-sdk-dg/push/android-initialize-docpage", new Object[]{"ymp_firebase_default_app_id", "ymp_gcm_default_sender_id"});

    C4363bm(Context context) {
        super(context, f5477a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo41991a() {
        return C4380cb.m6472b(mo42002f(), "ymp_firebase_default_api_key");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo41992b() {
        return C4380cb.m6472b(mo42002f(), "ymp_firebase_default_app_id");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo41993c() {
        return mo41999a(mo42002f(), "ymp_gcm_default_sender_id");
    }
}
