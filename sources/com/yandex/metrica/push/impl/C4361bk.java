package com.yandex.metrica.push.impl;

import android.content.Context;
import java.util.Locale;

/* renamed from: com.yandex.metrica.push.impl.bk */
class C4361bk extends C4368br {

    /* renamed from: a */
    private static final String f5476a = String.format(Locale.US, "Expected two identifiers: %s and %s in application block of AndroidManifest.xml. See more at https://tech.yandex.com/appmetrica/doc/mobile-sdk-dg/push/android-initialize-docpage", new Object[]{"ymp_firebase_app_id", "ymp_gcm_sender_id"});

    C4361bk(Context context) {
        super(context, f5476a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo41991a() {
        return C4380cb.m6472b(mo42002f(), "ymp_firebase_api_key");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo41992b() {
        return C4380cb.m6472b(mo42002f(), "ymp_firebase_app_id");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo41993c() {
        return mo41999a(mo42002f(), "ymp_gcm_sender_id");
    }
}
