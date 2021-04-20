package com.yandex.metrica.push.impl;

import android.text.TextUtils;
import com.yandex.metrica.push.impl.C4386e;

/* renamed from: com.yandex.metrica.push.impl.at */
class C4336at implements C4386e {

    /* renamed from: a */
    private final C4392i f5443a;

    public C4336at(C4392i iVar) {
        this.f5443a = iVar;
    }

    /* renamed from: a */
    public C4386e.C4387a mo41961a(C4402o oVar) {
        String b = oVar.mo42121b();
        if (TextUtils.isEmpty(b)) {
            return C4386e.C4387a.m6483a("PushId is empty", (String) null);
        }
        if (!this.f5443a.mo42086b().contains(b)) {
            return C4386e.C4387a.m6482a();
        }
        return C4386e.C4387a.m6483a("Duplicate pushId", String.format("Push with the same push id [%s] has already been received", new Object[]{b}));
    }
}
