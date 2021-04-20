package com.yandex.metrica.impl.p039ob;

import androidx.core.app.NotificationCompat;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ab */
public class C3117ab implements C3207bn {

    /* renamed from: a */
    private final C3118a f2484a;

    /* renamed from: com.yandex.metrica.impl.ob.ab$a */
    static class C3118a {
        C3118a() {
        }

        /* renamed from: com.yandex.metrica.impl.ob.ab$a$a */
        static class C3119a {

            /* renamed from: a */
            final String f2485a;

            public C3119a(String str) {
                this.f2485a = str;
            }
        }

        /* renamed from: a */
        public C3119a mo39455a(byte[] bArr) {
            try {
                if (!C3306cx.m2863a(bArr)) {
                    return new C3119a(new JSONObject(new String(bArr, "UTF-8")).optString(NotificationCompat.CATEGORY_STATUS));
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public C3117ab() {
        this(new C3118a());
    }

    C3117ab(C3118a aVar) {
        this.f2484a = aVar;
    }

    /* renamed from: a */
    public boolean mo39454a(int i, byte[] bArr, Map<String, List<String>> map) {
        C3118a.C3119a a;
        if (200 != i || (a = this.f2484a.mo39455a(bArr)) == null) {
            return false;
        }
        return "accepted".equals(a.f2485a);
    }
}
