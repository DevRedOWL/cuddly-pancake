package com.yandex.metrica.push.impl;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.yandex.metrica.IReporter;
import com.yandex.metrica.YandexMetrica;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.push.impl.bx */
public class C4375bx implements C4377bz {

    /* renamed from: a */
    private final Context f5490a;

    /* renamed from: b */
    private final String f5491b;

    /* renamed from: c */
    private volatile IReporter f5492c;

    /* renamed from: d */
    private final Object f5493d = new Object();

    public C4375bx(Context context, String str) {
        this.f5490a = context;
        this.f5491b = str;
    }

    /* renamed from: a */
    public void mo42014a() {
        m6438c().resumeSession();
    }

    /* renamed from: b */
    public void mo42018b() {
        m6438c().pauseSession();
    }

    /* renamed from: a */
    public void mo42015a(String str) {
        mo42017a(str, (Map<String, Object>) null);
    }

    /* renamed from: a */
    public void mo42017a(String str, Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("version_code", "23");
        map.put(NotificationCompat.CATEGORY_TRANSPORT, "firebase");
        m6438c().reportEvent(str, map);
    }

    /* renamed from: c */
    private IReporter m6438c() {
        if (this.f5492c == null) {
            synchronized (this.f5493d) {
                if (this.f5492c == null) {
                    this.f5492c = YandexMetrica.getReporter(this.f5490a, this.f5491b);
                }
            }
        }
        return this.f5492c;
    }

    /* renamed from: a */
    public void mo42016a(String str, Throwable th) {
        m6438c().reportError("version_code = 23;" + "transport = firebase;" + str, th);
    }
}
