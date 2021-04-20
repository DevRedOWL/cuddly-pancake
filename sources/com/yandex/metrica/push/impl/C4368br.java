package com.yandex.metrica.push.impl;

import android.content.Context;
import android.text.TextUtils;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardFragment;

/* renamed from: com.yandex.metrica.push.impl.br */
abstract class C4368br {

    /* renamed from: a */
    private final Context f5483a;

    /* renamed from: b */
    private final String f5484b;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract String mo41991a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract String mo41992b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract String mo41993c();

    C4368br(Context context, String str) {
        this.f5483a = context;
        this.f5484b = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo41999a(Context context, String str) {
        String b = C4380cb.m6472b(context, str);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        String[] split = b.split(":");
        if (split.length != 2 || !CardFragment.ARG_NUMBER.equals(split[0])) {
            return null;
        }
        return split[1];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C4367bq mo42000d() {
        return new C4367bq(mo41991a(), mo41992b(), mo41993c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo42001e() {
        return this.f5484b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Context mo42002f() {
        return this.f5483a;
    }
}
