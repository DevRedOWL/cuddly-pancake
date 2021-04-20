package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.yandex.metrica.impl.p039ob.C3213bt;
import com.yandex.metrica.impl.p039ob.C3292cq;
import com.yandex.metrica.impl.p039ob.C3822pj;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.rs */
public class C3949rs {

    /* renamed from: a */
    private static final Map<C3292cq.C3294a.C3295a, C3213bt.C3220a> f4546a = Collections.unmodifiableMap(new HashMap<C3292cq.C3294a.C3295a, C3213bt.C3220a>() {
        {
            put(C3292cq.C3294a.C3295a.CELL, C3213bt.C3220a.CELL);
            put(C3292cq.C3294a.C3295a.WIFI, C3213bt.C3220a.WIFI);
        }
    });
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f4547b;

    /* renamed from: c */
    private final C3700mf<C3954a> f4548c;

    /* renamed from: d */
    private final C4257xh f4549d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C4081tj f4550e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C3299cs f4551f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C4201vn f4552g;

    /* renamed from: h */
    private C3954a f4553h;

    /* renamed from: i */
    private boolean f4554i;

    /* renamed from: com.yandex.metrica.impl.ob.rs$a */
    public static class C3954a {

        /* renamed from: a */
        private final List<C3955a> f4561a;

        /* renamed from: b */
        private final LinkedHashMap<String, Object> f4562b = new LinkedHashMap<>();

        /* renamed from: com.yandex.metrica.impl.ob.rs$a$a */
        public static class C3955a {

            /* renamed from: a */
            public final String f4563a;

            /* renamed from: b */
            public final String f4564b;

            /* renamed from: c */
            public final String f4565c;

            /* renamed from: d */
            public final C4237wp<String, String> f4566d;

            /* renamed from: e */
            public final long f4567e;

            /* renamed from: f */
            public final List<C3213bt.C3220a> f4568f;

            public C3955a(String str, String str2, String str3, C4237wp<String, String> wpVar, long j, List<C3213bt.C3220a> list) {
                this.f4563a = str;
                this.f4564b = str2;
                this.f4565c = str3;
                this.f4567e = j;
                this.f4568f = list;
                this.f4566d = wpVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                return this.f4563a.equals(((C3955a) obj).f4563a);
            }

            public int hashCode() {
                return this.f4563a.hashCode();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.rs$a$b */
        public static class C3956b {

            /* renamed from: a */
            byte[] f4569a;

            /* renamed from: b */
            byte[] f4570b;
            /* access modifiers changed from: private */

            /* renamed from: c */
            public final C3955a f4571c;

            /* renamed from: d */
            private C3957a f4572d;

            /* renamed from: e */
            private C3213bt.C3220a f4573e;

            /* renamed from: f */
            private Integer f4574f;

            /* renamed from: g */
            private Map<String, List<String>> f4575g;

            /* renamed from: h */
            private Throwable f4576h;

            /* renamed from: com.yandex.metrica.impl.ob.rs$a$b$a */
            public enum C3957a {
                OFFLINE,
                INCOMPATIBLE_NETWORK_TYPE,
                COMPLETE,
                ERROR
            }

            public C3956b(C3955a aVar) {
                this.f4571c = aVar;
            }

            /* renamed from: a */
            public C3955a mo41114a() {
                return this.f4571c;
            }

            /* renamed from: b */
            public C3957a mo41121b() {
                return this.f4572d;
            }

            /* renamed from: a */
            public void mo41116a(C3957a aVar) {
                this.f4572d = aVar;
            }

            /* renamed from: c */
            public C3213bt.C3220a mo41123c() {
                return this.f4573e;
            }

            /* renamed from: a */
            public void mo41115a(C3213bt.C3220a aVar) {
                this.f4573e = aVar;
            }

            /* renamed from: d */
            public Integer mo41124d() {
                return this.f4574f;
            }

            /* renamed from: a */
            public void mo41117a(Integer num) {
                this.f4574f = num;
            }

            /* renamed from: e */
            public byte[] mo41125e() {
                return this.f4569a;
            }

            /* renamed from: a */
            public void mo41120a(byte[] bArr) {
                this.f4569a = bArr;
            }

            /* renamed from: f */
            public Map<String, List<String>> mo41126f() {
                return this.f4575g;
            }

            /* renamed from: a */
            public void mo41119a(Map<String, List<String>> map) {
                this.f4575g = map;
            }

            /* renamed from: g */
            public Throwable mo41127g() {
                return this.f4576h;
            }

            /* renamed from: a */
            public void mo41118a(Throwable th) {
                this.f4576h = th;
            }

            /* renamed from: h */
            public byte[] mo41128h() {
                return this.f4570b;
            }

            /* renamed from: b */
            public void mo41122b(byte[] bArr) {
                this.f4570b = bArr;
            }
        }

        public C3954a(List<C3955a> list, List<String> list2) {
            this.f4561a = list;
            if (!C3306cx.m2861a((Collection) list2)) {
                for (String put : list2) {
                    this.f4562b.put(put, new Object());
                }
            }
        }

        /* renamed from: a */
        public boolean mo41109a(C3955a aVar) {
            if (this.f4562b.get(aVar.f4563a) != null || this.f4561a.contains(aVar)) {
                return false;
            }
            this.f4561a.add(aVar);
            return true;
        }

        /* renamed from: a */
        public Set<String> mo41108a() {
            HashSet hashSet = new HashSet();
            int i = 0;
            for (String add : this.f4562b.keySet()) {
                hashSet.add(add);
                i++;
                if (i > 1000) {
                    break;
                }
            }
            return hashSet;
        }

        /* renamed from: b */
        public List<C3955a> mo41110b() {
            return this.f4561a;
        }

        /* renamed from: b */
        public void mo41111b(C3955a aVar) {
            this.f4562b.put(aVar.f4563a, new Object());
            this.f4561a.remove(aVar);
        }
    }

    public C3949rs(Context context, C3700mf<C3954a> mfVar, C3299cs csVar, C4081tj tjVar, C4257xh xhVar) {
        this(context, mfVar, csVar, tjVar, xhVar, new C4198vk());
    }

    public C3949rs(Context context, C3700mf<C3954a> mfVar, C3299cs csVar, C4081tj tjVar, C4257xh xhVar, C4201vn vnVar) {
        this.f4554i = false;
        this.f4547b = context;
        this.f4548c = mfVar;
        this.f4551f = csVar;
        this.f4550e = tjVar;
        this.f4553h = this.f4548c.mo40624a();
        this.f4549d = xhVar;
        this.f4552g = vnVar;
    }

    /* renamed from: a */
    public synchronized void mo41103a() {
        this.f4549d.mo41808a((Runnable) new Runnable() {
            public void run() {
                C3949rs.this.m5053b();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m5053b() {
        if (!this.f4554i) {
            this.f4553h = this.f4548c.mo40624a();
            m5056c();
            this.f4554i = true;
        }
    }

    /* renamed from: c */
    private void m5056c() {
        for (C3954a.C3955a b : this.f4553h.mo41110b()) {
            m5054b(b);
        }
    }

    /* renamed from: a */
    public synchronized void mo41104a(final C4143uk ukVar) {
        final List<C3292cq.C3294a> list = ukVar.f5109w;
        this.f4549d.mo41808a((Runnable) new Runnable() {
            public void run() {
                C3949rs.this.m5049a((List<C3292cq.C3294a>) list, ukVar.f5106t);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5049a(List<C3292cq.C3294a> list, long j) {
        if (!C3306cx.m2861a((Collection) list)) {
            for (C3292cq.C3294a next : list) {
                if (!(next.f2924a == null || next.f2925b == null || next.f2926c == null || next.f2928e == null || next.f2928e.longValue() < 0 || C3306cx.m2861a((Collection) next.f2929f))) {
                    m5050a(new C3954a.C3955a(next.f2924a, next.f2925b, next.f2926c, m5044a(next.f2927d), TimeUnit.SECONDS.toMillis(next.f2928e.longValue() + j), m5052b(next.f2929f)));
                }
            }
        }
    }

    /* renamed from: a */
    private C4237wp<String, String> m5044a(List<Pair<String, String>> list) {
        C4237wp<String, String> wpVar = new C4237wp<>();
        for (Pair next : list) {
            wpVar.mo41775a(next.first, next.second);
        }
        return wpVar;
    }

    /* renamed from: a */
    private boolean m5050a(C3954a.C3955a aVar) {
        boolean a = this.f4553h.mo41109a(aVar);
        if (a) {
            m5054b(aVar);
            this.f4550e.mo41443a(aVar);
        }
        m5058d();
        return a;
    }

    /* renamed from: b */
    private void m5054b(final C3954a.C3955a aVar) {
        this.f4549d.mo41809a(new Runnable() {
            public void run() {
                if (!C3949rs.this.f4551f.mo39857c()) {
                    C3949rs.this.f4550e.mo41445b(aVar);
                    C3954a.C3956b bVar = new C3954a.C3956b(aVar);
                    C3213bt.C3220a a = C3949rs.this.f4552g.mo41694a(C3949rs.this.f4547b);
                    bVar.mo41115a(a);
                    if (a == C3213bt.C3220a.OFFLINE) {
                        bVar.mo41116a(C3954a.C3956b.C3957a.OFFLINE);
                    } else if (!aVar.f4568f.contains(a)) {
                        bVar.mo41116a(C3954a.C3956b.C3957a.INCOMPATIBLE_NETWORK_TYPE);
                    } else {
                        bVar.mo41116a(C3954a.C3956b.C3957a.ERROR);
                        try {
                            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(aVar.f4564b).openConnection();
                            for (Map.Entry entry : aVar.f4566d.mo41778b()) {
                                httpURLConnection.setRequestProperty((String) entry.getKey(), TextUtils.join(",", (Iterable) entry.getValue()));
                            }
                            httpURLConnection.setInstanceFollowRedirects(true);
                            httpURLConnection.setRequestMethod(aVar.f4565c);
                            httpURLConnection.setConnectTimeout(C3822pj.C3823a.f4072a);
                            httpURLConnection.setReadTimeout(C3822pj.C3823a.f4072a);
                            httpURLConnection.connect();
                            int responseCode = httpURLConnection.getResponseCode();
                            bVar.mo41116a(C3954a.C3956b.C3957a.COMPLETE);
                            bVar.mo41117a(Integer.valueOf(responseCode));
                            C3137am.m2016a(httpURLConnection, bVar, "[ProvidedRequestService]", 102400);
                            bVar.mo41119a((Map<String, List<String>>) httpURLConnection.getHeaderFields());
                        } catch (Throwable th) {
                            bVar.mo41118a(th);
                        }
                    }
                    C3949rs.this.m5045a(bVar);
                }
            }
        }, Math.max(C3481h.f3335a, Math.max(aVar.f4567e - System.currentTimeMillis(), 0)));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m5045a(C3954a.C3956b bVar) {
        this.f4553h.mo41111b(bVar.f4571c);
        m5058d();
        this.f4550e.mo41444a(bVar);
    }

    /* renamed from: d */
    private void m5058d() {
        this.f4548c.mo40625a(this.f4553h);
    }

    /* renamed from: b */
    private List<C3213bt.C3220a> m5052b(List<C3292cq.C3294a.C3295a> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C3292cq.C3294a.C3295a aVar : list) {
            arrayList.add(f4546a.get(aVar));
        }
        return arrayList;
    }
}
