package com.yandex.metrica.impl.p039ob;

import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.yandex.metrica.impl.ob.dr */
public class C3350dr {

    /* renamed from: a */
    private final C4261xl f3073a = C4262xm.m6112a("YMM-BD", new Runnable() {
        public void run() {
            while (C3350dr.this.f3074b) {
                try {
                    ((C3352a) C3350dr.this.f3075c.take()).mo39933a();
                } catch (InterruptedException unused) {
                }
            }
        }
    });
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile boolean f3074b = true;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final BlockingQueue<C3352a> f3075c = new LinkedBlockingQueue();

    /* renamed from: d */
    private ConcurrentHashMap<Class, CopyOnWriteArrayList<C3358dv<? extends C3356dt>>> f3076d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private WeakHashMap<Object, CopyOnWriteArrayList<C3354c>> f3077e = new WeakHashMap<>();

    /* renamed from: f */
    private ConcurrentHashMap<Class, C3356dt> f3078f = new ConcurrentHashMap<>();

    /* renamed from: com.yandex.metrica.impl.ob.dr$b */
    private static final class C3353b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C3350dr f3082a = new C3350dr();
    }

    /* renamed from: com.yandex.metrica.impl.ob.dr$c */
    private static class C3354c {

        /* renamed from: a */
        final CopyOnWriteArrayList<C3358dv<? extends C3356dt>> f3083a;

        /* renamed from: b */
        final C3358dv<? extends C3356dt> f3084b;

        private C3354c(CopyOnWriteArrayList<C3358dv<? extends C3356dt>> copyOnWriteArrayList, C3358dv<? extends C3356dt> dvVar) {
            this.f3083a = copyOnWriteArrayList;
            this.f3084b = dvVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo39934a() {
            this.f3083a.remove(this.f3084b);
        }

        /* access modifiers changed from: protected */
        public void finalize() throws Throwable {
            super.finalize();
            mo39934a();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.dr$a */
    private static class C3352a {

        /* renamed from: a */
        private final C3356dt f3080a;

        /* renamed from: b */
        private final C3358dv<? extends C3356dt> f3081b;

        private C3352a(C3356dt dtVar, C3358dv<? extends C3356dt> dvVar) {
            this.f3080a = dtVar;
            this.f3081b = dvVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo39933a() {
            try {
                if (!this.f3081b.mo39937b(this.f3080a)) {
                    this.f3081b.mo39936a(this.f3080a);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static final C3350dr m3043a() {
        return C3353b.f3082a;
    }

    C3350dr() {
        this.f3073a.start();
    }

    /* renamed from: a */
    public synchronized void mo39926a(C3356dt dtVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3076d.get(dtVar.getClass());
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                mo39927a(dtVar, (C3358dv) it.next());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39927a(C3356dt dtVar, C3358dv<? extends C3356dt> dvVar) {
        this.f3075c.add(new C3352a(dtVar, dvVar));
    }

    /* renamed from: b */
    public synchronized void mo39931b(C3356dt dtVar) {
        mo39926a(dtVar);
        this.f3078f.put(dtVar.getClass(), dtVar);
    }

    /* renamed from: a */
    public synchronized void mo39928a(Class<? extends C3356dt> cls) {
        this.f3078f.remove(cls);
    }

    /* renamed from: a */
    public synchronized void mo39930a(Object obj, Class cls, C3358dv<? extends C3356dt> dvVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3076d.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f3076d.put(cls, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(dvVar);
        CopyOnWriteArrayList copyOnWriteArrayList2 = this.f3077e.get(obj);
        if (copyOnWriteArrayList2 == null) {
            copyOnWriteArrayList2 = new CopyOnWriteArrayList();
            this.f3077e.put(obj, copyOnWriteArrayList2);
        }
        copyOnWriteArrayList2.add(new C3354c(copyOnWriteArrayList, dvVar));
        C3356dt dtVar = this.f3078f.get(cls);
        if (dtVar != null) {
            mo39927a(dtVar, dvVar);
        }
    }

    /* renamed from: a */
    public synchronized void mo39929a(Object obj) {
        List<C3354c> remove = this.f3077e.remove(obj);
        if (remove != null) {
            for (C3354c a : remove) {
                a.mo39934a();
            }
        }
    }
}
