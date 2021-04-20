package com.yandex.metrica.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.AppMetricaPushJobIntentService;
import java.util.HashMap;
import java.util.Map;

public class CommandIntentService extends AppMetricaPushJobIntentService {

    /* renamed from: a */
    private final Map<String, C4302a> f5398a = new HashMap();

    /* renamed from: com.yandex.metrica.push.CommandIntentService$a */
    public interface C4302a {
        /* renamed from: a */
        void mo41942a(Context context, Intent intent);
    }

    /* access modifiers changed from: protected */
    public void onHandleWork(Intent intent) {
        C4302a aVar = this.f5398a.get(intent.getStringExtra("com.yandex.metrica.push.extra.COMMAND"));
        if (aVar != null) {
            aVar.mo41942a(this, intent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo41941a(String str, C4302a aVar) {
        this.f5398a.put(str, aVar);
    }

    /* renamed from: a */
    public static Bundle m6268a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("com.yandex.metrica.push.extra.COMMAND", str);
        return bundle;
    }
}
