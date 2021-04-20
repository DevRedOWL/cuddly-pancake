package com.yandex.metrica.push.impl;

import android.os.Bundle;

/* renamed from: com.yandex.metrica.push.impl.c */
public class C4378c {

    /* renamed from: a */
    public final String f5495a;

    /* renamed from: b */
    public final String f5496b;

    /* renamed from: c */
    public final int f5497c;

    public C4378c(C4399n nVar) {
        this.f5495a = nVar.f5556a;
        this.f5496b = nVar.f5560e;
        this.f5497c = nVar.f5562g;
    }

    /* renamed from: a */
    public Bundle mo42019a() {
        Bundle bundle = new Bundle();
        bundle.putString("push_id", this.f5495a);
        bundle.putString("action_id", this.f5496b);
        bundle.putInt("notification_id", this.f5497c);
        return bundle;
    }
}
