package com.yandex.metrica.impl.p039ob;

import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.bf */
public class C3187bf implements C3194bg {

    /* renamed from: a */
    private final C4237wp<String, Integer> f2687a = new C4237wp<>();

    /* renamed from: b */
    private final Map<C3193b, C3192a> f2688b = new LinkedHashMap();

    /* renamed from: c */
    private final Map<C3193b, C3192a> f2689c = new LinkedHashMap();

    /* renamed from: com.yandex.metrica.impl.ob.bf$a */
    interface C3192a {
        /* renamed from: a */
        boolean mo39623a(Intent intent, C3187bf bfVar);
    }

    /* renamed from: com.yandex.metrica.impl.ob.bf$b */
    interface C3193b {
        /* renamed from: a */
        void mo39615a();
    }

    /* renamed from: a */
    public void mo39596a() {
    }

    /* renamed from: a */
    public void mo39598a(Intent intent, int i) {
    }

    /* renamed from: a */
    public void mo39599a(Intent intent, int i, int i2) {
    }

    /* renamed from: b */
    public void mo39600b() {
    }

    /* renamed from: a */
    public void mo39597a(Intent intent) {
        if (intent != null) {
            m2271d(intent);
        }
    }

    /* renamed from: b */
    public void mo39601b(Intent intent) {
        if (intent != null) {
            m2271d(intent);
        }
    }

    /* renamed from: d */
    private void m2271d(Intent intent) {
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            this.f2687a.mo41775a(action, Integer.valueOf(m2278h(intent)));
        }
        m2262a(intent, this.f2688b);
    }

    /* renamed from: a */
    private void m2262a(Intent intent, Map<C3193b, C3192a> map) {
        for (Map.Entry next : map.entrySet()) {
            if (((C3192a) next.getValue()).mo39623a(intent, this)) {
                ((C3193b) next.getKey()).mo39615a();
            }
        }
    }

    /* renamed from: c */
    public void mo39602c(Intent intent) {
        if (intent != null) {
            m2272e(intent);
        }
    }

    /* renamed from: e */
    private void m2272e(Intent intent) {
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            this.f2687a.mo41777b(action, Integer.valueOf(m2278h(intent)));
        }
        m2262a(intent, this.f2689c);
    }

    /* renamed from: a */
    public void mo39617a(C3193b bVar) {
        this.f2688b.put(bVar, m2270d());
    }

    /* renamed from: b */
    public void mo39618b(C3193b bVar) {
        this.f2689c.put(bVar, m2270d());
    }

    /* renamed from: c */
    public void mo39619c(C3193b bVar) {
        this.f2688b.put(bVar, new C3192a() {
            /* renamed from: a */
            public boolean mo39623a(Intent intent, C3187bf bfVar) {
                return C3187bf.this.m2275f(intent);
            }
        });
    }

    /* renamed from: d */
    public void mo39621d(C3193b bVar) {
        this.f2688b.put(bVar, new C3192a() {
            /* renamed from: a */
            public boolean mo39623a(Intent intent, C3187bf bfVar) {
                return C3187bf.this.m2277g(intent);
            }
        });
    }

    /* renamed from: e */
    public void mo39622e(C3193b bVar) {
        this.f2689c.put(bVar, new C3192a() {
            /* renamed from: a */
            public boolean mo39623a(Intent intent, C3187bf bfVar) {
                return C3187bf.this.m2277g(intent) && C3187bf.this.m2276g();
            }
        });
    }

    /* renamed from: d */
    private C3192a m2270d() {
        return new C3192a() {
            /* renamed from: a */
            public boolean mo39623a(Intent intent, C3187bf bfVar) {
                return C3187bf.this.m2267a(intent.getAction());
            }
        };
    }

    /* renamed from: c */
    public boolean mo39620c() {
        return !C3306cx.m2861a((Collection) this.f2687a.mo41774a("com.yandex.metrica.ACTION_C_BG_L"));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m2267a(String str) {
        return "com.yandex.metrica.ACTION_C_BG_L".equals(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public boolean m2275f(Intent intent) {
        return m2277g(intent) && m2273e();
    }

    /* renamed from: b */
    private boolean m2269b(String str) {
        return "com.yandex.metrica.IMetricaService".equals(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m2277g(Intent intent) {
        if (m2269b(intent.getAction())) {
            return !m2263a(m2278h(intent));
        }
        return false;
    }

    /* renamed from: e */
    private boolean m2273e() {
        return m2274f() == 1;
    }

    /* renamed from: f */
    private int m2274f() {
        Collection<Integer> h = m2279h();
        int i = 0;
        if (!C3306cx.m2861a((Collection) h)) {
            for (Integer intValue : h) {
                if (!m2263a(intValue.intValue())) {
                    i++;
                }
            }
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m2276g() {
        return m2274f() == 0;
    }

    /* renamed from: h */
    private Collection<Integer> m2279h() {
        return this.f2687a.mo41774a("com.yandex.metrica.IMetricaService");
    }

    /* renamed from: a */
    private boolean m2263a(int i) {
        return i == Process.myPid();
    }

    /* renamed from: h */
    private int m2278h(Intent intent) {
        Uri data = intent.getData();
        if (data != null && data.getPath().equals("/client")) {
            try {
                return Integer.parseInt(data.getQueryParameter("pid"));
            } catch (Throwable unused) {
            }
        }
        return -1;
    }
}
