package com.yandex.metrica.push.impl;

import android.content.Context;
import android.os.Bundle;
import com.yandex.metrica.push.impl.C4386e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.push.impl.ah */
public class C4321ah implements C4323aj {
    /* renamed from: a */
    public void mo41960a(Context context, Bundle bundle) {
        if (bundle != null) {
            C4402o oVar = new C4402o(context, bundle);
            if (oVar.mo42120a()) {
                C4376by.m6447c(String.format("Process push with notificationId = %s", new Object[]{oVar.mo42121b()}), new Object[0]);
                m6302a("Process push", oVar.mo42121b());
                C4389f a = C4389f.m6484a(context);
                C4396l f = a.mo42031f();
                String b = oVar.mo42121b();
                if (!C4380cb.m6473b(b) && f.mo42044g().f5411a) {
                    f.mo42043f().mo41972c(b);
                }
                C4386e.C4387a a2 = a.mo42036k().mo41961a(oVar);
                if (a2.f5503a == C4386e.C4388b.SHOW) {
                    C4340ax a3 = f.mo42038a().mo41959a(oVar);
                    if (a3 != null) {
                        a3.mo41965a(context, oVar);
                    } else {
                        C4376by.m6446b("%s with pushId = %s", "Receive push with wrong format", b);
                        m6302a("Receive push with wrong format", b);
                        if (!C4380cb.m6473b(b)) {
                            f.mo42043f().mo41968a(b, "Push data format is invalid", "Receive push with wrong format");
                        }
                    }
                } else {
                    C4371bu.m6425b("Push filtered out. Category: %s. Details: %s", a2.f5504b, a2.f5505c);
                    if (!C4380cb.m6473b(oVar.mo42121b())) {
                        f.mo42043f().mo41968a(oVar.mo42121b(), a2.f5504b, a2.f5505c);
                    }
                }
                a.mo42029d().mo42083a(oVar);
                return;
            }
            C4376by.m6446b("Receive not recognized push message", new Object[0]);
            C4379ca.m6456c().mo42016a("Receive not recognized push message", (Throwable) null);
            return;
        }
        C4376by.m6446b("Received push message with empty data bundle", new Object[0]);
        C4379ca.m6456c().mo42016a("Receive push message with empty bundle", (Throwable) null);
    }

    /* renamed from: a */
    private static void m6302a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("notification_Id", str2);
        C4379ca.m6456c().mo42017a(str, (Map<String, Object>) hashMap);
    }
}
