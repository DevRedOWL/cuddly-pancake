package com.yandex.metrica.impl.p039ob;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.x */
public class C4248x extends ResultReceiver {

    /* renamed from: a */
    private final C4249a f5297a;

    /* renamed from: com.yandex.metrica.impl.ob.x$a */
    public interface C4249a {
        /* renamed from: a */
        void mo39880a(int i, Bundle bundle);
    }

    public C4248x(Handler handler, C4249a aVar) {
        super(handler);
        this.f5297a = aVar;
    }

    /* access modifiers changed from: protected */
    public void onReceiveResult(int i, Bundle bundle) {
        C4249a aVar = this.f5297a;
        if (bundle == null) {
            bundle = new Bundle();
        }
        aVar.mo39880a(i, bundle);
    }

    /* renamed from: a */
    public static void m6079a(ResultReceiver resultReceiver, C4143uk ukVar) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            m6077a(bundle, ukVar);
            resultReceiver.send(1, bundle);
        }
    }

    /* renamed from: a */
    public static void m6078a(ResultReceiver resultReceiver, C4134ue ueVar, C4143uk ukVar) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            ueVar.mo41539a(bundle);
            if (ukVar != null) {
                m6077a(bundle, ukVar);
            }
            resultReceiver.send(2, bundle);
        }
    }

    /* renamed from: a */
    private static void m6077a(Bundle bundle, C4143uk ukVar) {
        bundle.putString("Uuid", ukVar.f5087a);
        bundle.putString("DeviceId", ukVar.f5088b);
        bundle.putString("DeviceIdHash", ukVar.f5090d);
        bundle.putString("AdUrlGet", ukVar.f5092f);
        bundle.putString("AdUrlReport", ukVar.f5093g);
        bundle.putLong("ServerTimeOffset", C4229wi.m6030c());
        Map a = C4225we.m6009a(ukVar.f5099m);
        if (a.isEmpty()) {
            a = new HashMap();
        }
        bundle.putString("Clids", C4204vq.m5883a((Map<String, String>) a));
        bundle.putString("RequestClids", ukVar.f5100n);
    }
}
