package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.yandex.metrica.impl.p039ob.C3196bi;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.s */
public class C3994s extends C3196bi {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3687lv f4660a;

    public C3994s(C3687lv lvVar) {
        this.f4660a = lvVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public SparseArray<C3196bi.C3197a> mo39628a() {
        return new SparseArray<C3196bi.C3197a>() {
            {
                put(47, new C3996a(C3994s.this.f4660a));
                C3994s sVar = C3994s.this;
                put(66, new C3997b(sVar.f4660a));
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo39627a(C3849qg qgVar) {
        return (int) this.f4660a.mo40496c(-1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo39630a(C3849qg qgVar, int i) {
        this.f4660a.mo40506f((long) i);
        qgVar.mo40931c().mo40902j();
    }

    /* renamed from: com.yandex.metrica.impl.ob.s$a */
    static class C3996a implements C3196bi.C3197a {

        /* renamed from: a */
        private C3687lv f4662a;

        /* renamed from: a */
        private boolean m5140a(long j, long j2, long j3) {
            return j != j3 && j2 == j3;
        }

        public C3996a(C3687lv lvVar) {
            this.f4662a = lvVar;
        }

        /* renamed from: a */
        public void mo39632a(Context context) {
            C3847qe qeVar = new C3847qe(context);
            if (C3306cx.m2862a((Map) qeVar.mo40909c())) {
                return;
            }
            if (this.f4662a.mo40492a((String) null) == null || this.f4662a.mo40494b((String) null) == null) {
                m5139a(qeVar);
                m5142b(qeVar);
                m5143c(qeVar);
                m5144d(qeVar);
                m5145e(qeVar);
                m5146f(qeVar);
                m5147g(qeVar);
                m5148h(qeVar);
                this.f4662a.mo40567q();
                qeVar.mo40906b().mo40902j();
            }
        }

        /* renamed from: a */
        private boolean m5141a(String str, String str2) {
            return !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2);
        }

        /* renamed from: a */
        private void m5139a(C3847qe qeVar) {
            String b = qeVar.mo40907b((String) null);
            if (m5141a(b, this.f4662a.mo40494b((String) null))) {
                this.f4662a.mo40510h(b);
            }
        }

        /* renamed from: b */
        private void m5142b(C3847qe qeVar) {
            String a = qeVar.mo40887a();
            if (m5141a(a, this.f4662a.mo40491a())) {
                this.f4662a.mo40515m(a);
            }
        }

        /* renamed from: c */
        private void m5143c(C3847qe qeVar) {
            String a = qeVar.mo40904a((String) null);
            if (m5141a(a, this.f4662a.mo40492a((String) null))) {
                this.f4662a.mo40509g(a);
            }
        }

        /* renamed from: d */
        private void m5144d(C3847qe qeVar) {
            String c = qeVar.mo40908c((String) null);
            if (m5141a(c, this.f4662a.mo40500d((String) null))) {
                this.f4662a.mo40512j(c);
            }
        }

        /* renamed from: e */
        private void m5145e(C3847qe qeVar) {
            String d = qeVar.mo40910d((String) null);
            if (m5141a(d, this.f4662a.mo40503e((String) null))) {
                this.f4662a.mo40513k(d);
            }
        }

        /* renamed from: f */
        private void m5146f(C3847qe qeVar) {
            String e = qeVar.mo40911e((String) null);
            if (m5141a(e, this.f4662a.mo40507f((String) null))) {
                this.f4662a.mo40514l(e);
            }
        }

        /* renamed from: g */
        private void m5147g(C3847qe qeVar) {
            long a = qeVar.mo40903a(-1);
            if (m5140a(a, this.f4662a.mo40489a(-1), -1)) {
                this.f4662a.mo40499d(a);
            }
        }

        /* renamed from: h */
        private void m5148h(C3847qe qeVar) {
            long b = qeVar.mo40905b(-1);
            if (m5140a(b, this.f4662a.mo40493b(-1), -1)) {
                this.f4662a.mo40502e(b);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.s$b */
    private class C3997b implements C3196bi.C3197a {

        /* renamed from: b */
        private final C3687lv f4664b;

        public C3997b(C3687lv lvVar) {
            this.f4664b = lvVar;
        }

        /* renamed from: a */
        public void mo39632a(Context context) {
            this.f4664b.mo40568r(new C3853qk("COOKIE_BROWSERS").mo40947b());
            this.f4664b.mo40568r(new C3853qk("BIND_ID_URL").mo40947b());
            C3137am.m2012a(context, "b_meta.dat");
            C3137am.m2012a(context, "browsers.dat");
        }
    }
}
