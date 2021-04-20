package com.yandex.metrica.push.impl;

import android.content.Context;
import android.content.Intent;
import com.yandex.metrica.push.YandexMetricaPush;

/* renamed from: com.yandex.metrica.push.impl.y */
public abstract class C4421y implements C4317ad {

    /* renamed from: a */
    private final C4407q f5670a = new C4407q();

    protected C4421y() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo42227a(Context context, C4399n nVar) {
        Intent a = this.f5670a.mo42172a(context, nVar.f5557b);
        if (a != null) {
            try {
                a.putExtra(YandexMetricaPush.EXTRA_PAYLOAD, nVar.f5558c);
                if (nVar.f5565j != null) {
                    a.putExtras(nVar.f5565j);
                }
                if (nVar.f5566k) {
                    a.setPackage(context.getPackageName());
                }
                context.startActivity(a);
            } catch (Exception e) {
                C4376by.m6445a(e, "Smth wrong when starting activity for push message with pushId=%s", nVar.f5556a);
                C4379ca.m6456c().mo42016a("Error starting activity", (Throwable) e);
            }
        } else {
            C4376by.m6446b("Intent action for pushId = %s is null", nVar.f5556a);
            C4379ca.m6456c().mo42016a("Open action intent is null", (Throwable) null);
        }
    }
}
