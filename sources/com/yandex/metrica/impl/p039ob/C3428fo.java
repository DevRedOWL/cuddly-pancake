package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.fo */
public class C3428fo {

    /* renamed from: a */
    private final Object f3256a;

    /* renamed from: b */
    private final C3436fu f3257b;

    /* renamed from: c */
    private final HashMap<C3427fn, C3430fp> f3258c;

    /* renamed from: d */
    private final C4237wp<C3429a, C3427fn> f3259d;

    /* renamed from: e */
    private final Context f3260e;

    /* renamed from: f */
    private volatile int f3261f;

    /* renamed from: g */
    private final C3432fr f3262g;

    public C3428fo(Context context, C3436fu fuVar) {
        this(context, fuVar, new C3432fr());
    }

    C3428fo(Context context, C3436fu fuVar, C3432fr frVar) {
        this.f3256a = new Object();
        this.f3258c = new HashMap<>();
        this.f3259d = new C4237wp<>();
        this.f3261f = 0;
        this.f3260e = context.getApplicationContext();
        this.f3257b = fuVar;
        this.f3262g = frVar;
    }

    /* renamed from: a */
    public C3430fp mo40119a(C3427fn fnVar, C3373eg egVar) {
        C3430fp fpVar;
        synchronized (this.f3256a) {
            fpVar = this.f3258c.get(fnVar);
            if (fpVar == null) {
                fpVar = this.f3262g.mo40124a(fnVar).mo40123a(this.f3260e, this.f3257b, fnVar, egVar);
                this.f3258c.put(fnVar, fpVar);
                this.f3259d.mo41775a(new C3429a(fnVar), fnVar);
                this.f3261f++;
            }
        }
        return fpVar;
    }

    /* renamed from: a */
    public void mo40120a(String str, int i, String str2) {
        m3294a(str, Integer.valueOf(i), str2);
    }

    /* renamed from: a */
    private void m3294a(String str, Integer num, String str2) {
        synchronized (this.f3256a) {
            Collection<C3427fn> b = this.f3259d.mo41776b(new C3429a(str, num, str2));
            if (!C3306cx.m2861a((Collection) b)) {
                this.f3261f -= b.size();
                ArrayList arrayList = new ArrayList(b.size());
                for (C3427fn remove : b) {
                    arrayList.add(this.f3258c.remove(remove));
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C3430fp) it.next()).mo40101a();
                }
            }
        }
    }

    /* renamed from: a */
    public int mo40118a() {
        return this.f3261f;
    }

    /* renamed from: com.yandex.metrica.impl.ob.fo$a */
    private static final class C3429a {

        /* renamed from: a */
        private final String f3263a;

        /* renamed from: b */
        private final Integer f3264b;

        /* renamed from: c */
        private final String f3265c;

        C3429a(String str, Integer num, String str2) {
            this.f3263a = str;
            this.f3264b = num;
            this.f3265c = str2;
        }

        C3429a(C3427fn fnVar) {
            this(fnVar.mo40111b(), fnVar.mo40112c(), fnVar.mo40113d());
        }

        public int hashCode() {
            int hashCode = this.f3263a.hashCode() * 31;
            Integer num = this.f3264b;
            int i = 0;
            int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
            String str = this.f3265c;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode2 + i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C3429a aVar = (C3429a) obj;
            if (!this.f3263a.equals(aVar.f3263a)) {
                return false;
            }
            Integer num = this.f3264b;
            if (num == null ? aVar.f3264b != null : !num.equals(aVar.f3264b)) {
                return false;
            }
            String str = this.f3265c;
            String str2 = aVar.f3265c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
            return false;
        }
    }
}
