package com.yandex.metrica.push.impl;

import android.text.TextUtils;
import com.google.firebase.FirebaseOptions;

/* renamed from: com.yandex.metrica.push.impl.bq */
class C4367bq {

    /* renamed from: a */
    private final String f5480a;

    /* renamed from: b */
    private final String f5481b;

    /* renamed from: c */
    private final String f5482c;

    C4367bq(String str, String str2, String str3) {
        this.f5480a = str;
        this.f5481b = str2;
        this.f5482c = str3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo41995a() {
        return this.f5482c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public FirebaseOptions mo41996b() {
        FirebaseOptions.Builder builder = new FirebaseOptions.Builder();
        builder.setApplicationId(this.f5481b);
        builder.setGcmSenderId(this.f5482c);
        if (!TextUtils.isEmpty(this.f5480a)) {
            builder.setApiKey(this.f5480a);
        }
        return builder.build();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo41997c() {
        return TextUtils.isEmpty(this.f5481b) && TextUtils.isEmpty(this.f5482c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo41998d() {
        return !TextUtils.isEmpty(this.f5481b) && !TextUtils.isEmpty(this.f5482c);
    }
}
