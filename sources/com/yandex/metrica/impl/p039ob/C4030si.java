package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.text.TextUtils;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.si */
public class C4030si {

    /* renamed from: a */
    private static final EnumSet<C4033b> f4737a = EnumSet.of(C4033b.HAS_FROM_PLAY_SERVICES, C4033b.HAS_FROM_RECEIVER_ONLY, C4033b.RECEIVER);

    /* renamed from: b */
    private static final EnumSet<C4033b> f4738b = EnumSet.of(C4033b.HAS_FROM_PLAY_SERVICES, C4033b.HAS_FROM_RECEIVER_ONLY);

    /* renamed from: c */
    private final Set<C4032a> f4739c;

    /* renamed from: d */
    private C4034sj f4740d;

    /* renamed from: e */
    private C4034sj f4741e;

    /* renamed from: f */
    private boolean f4742f;

    /* renamed from: g */
    private final C3690ly f4743g;

    /* renamed from: h */
    private C4033b f4744h;

    /* renamed from: com.yandex.metrica.impl.ob.si$a */
    public interface C4032a {
        /* renamed from: a */
        boolean mo39990a(C4034sj sjVar);
    }

    /* renamed from: com.yandex.metrica.impl.ob.si$b */
    private enum C4033b {
        EMPTY,
        RECEIVER,
        WAIT_FOR_RECEIVER_ONLY,
        HAS_FROM_PLAY_SERVICES,
        HAS_FROM_RECEIVER_ONLY
    }

    public C4030si(Context context) {
        this(new C3690ly(C3628ld.m3815a(context).mo40441c()));
    }

    C4030si(C3690ly lyVar) {
        this.f4739c = new HashSet();
        this.f4744h = C4033b.EMPTY;
        this.f4743g = lyVar;
        this.f4742f = this.f4743g.mo40588d();
        if (!this.f4742f) {
            String b = this.f4743g.mo40579b();
            if (!TextUtils.isEmpty(b)) {
                this.f4740d = new C4034sj(b, 0, 0);
            }
            this.f4741e = this.f4743g.mo40583c();
            this.f4744h = C4033b.values()[this.f4743g.mo40585d(0)];
        }
    }

    /* renamed from: a */
    public synchronized void mo41269a(C4034sj sjVar) {
        if (!f4738b.contains(this.f4744h)) {
            this.f4741e = sjVar;
            this.f4743g.mo40573a(sjVar).mo40567q();
            m5211a(m5212b(sjVar));
        }
    }

    /* renamed from: a */
    public synchronized void mo41270a(String str) {
        if (!f4737a.contains(this.f4744h) && !TextUtils.isEmpty(str)) {
            this.f4740d = new C4034sj(str, 0, 0);
            this.f4743g.mo40574a(str).mo40567q();
            m5211a(m5210a());
        }
    }

    /* renamed from: a */
    public synchronized void mo41268a(C4032a aVar) {
        if (!this.f4742f) {
            this.f4739c.add(aVar);
            m5213b();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.si$1 */
    static /* synthetic */ class C40311 {

        /* renamed from: a */
        static final /* synthetic */ int[] f4745a = new int[C4033b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.yandex.metrica.impl.ob.si$b[] r0 = com.yandex.metrica.impl.p039ob.C4030si.C4033b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4745a = r0
                int[] r0 = f4745a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.yandex.metrica.impl.ob.si$b r1 = com.yandex.metrica.impl.p039ob.C4030si.C4033b.EMPTY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f4745a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.yandex.metrica.impl.ob.si$b r1 = com.yandex.metrica.impl.p039ob.C4030si.C4033b.RECEIVER     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f4745a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.yandex.metrica.impl.ob.si$b r1 = com.yandex.metrica.impl.p039ob.C4030si.C4033b.WAIT_FOR_RECEIVER_ONLY     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f4745a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.yandex.metrica.impl.ob.si$b r1 = com.yandex.metrica.impl.p039ob.C4030si.C4033b.HAS_FROM_PLAY_SERVICES     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f4745a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.yandex.metrica.impl.ob.si$b r1 = com.yandex.metrica.impl.p039ob.C4030si.C4033b.HAS_FROM_RECEIVER_ONLY     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C4030si.C40311.<clinit>():void");
        }
    }

    /* renamed from: b */
    private C4033b m5212b(C4034sj sjVar) {
        int i = C40311.f4745a[this.f4744h.ordinal()];
        if (i == 1) {
            return sjVar == null ? C4033b.WAIT_FOR_RECEIVER_ONLY : C4033b.HAS_FROM_PLAY_SERVICES;
        }
        if (i != 2) {
            return this.f4744h;
        }
        return sjVar == null ? C4033b.HAS_FROM_RECEIVER_ONLY : C4033b.HAS_FROM_PLAY_SERVICES;
    }

    /* renamed from: a */
    private C4033b m5210a() {
        int i = C40311.f4745a[this.f4744h.ordinal()];
        if (i == 1) {
            return C4033b.RECEIVER;
        }
        if (i != 3) {
            return this.f4744h;
        }
        return C4033b.HAS_FROM_RECEIVER_ONLY;
    }

    /* renamed from: a */
    private void m5211a(C4033b bVar) {
        if (bVar != this.f4744h) {
            this.f4744h = bVar;
            this.f4743g.mo40590e(this.f4744h.ordinal()).mo40567q();
            m5213b();
        }
    }

    /* renamed from: b */
    private void m5213b() {
        int i = C40311.f4745a[this.f4744h.ordinal()];
        if (i == 4) {
            m5215c(this.f4741e);
        } else if (i == 5) {
            m5215c(this.f4740d);
        }
    }

    /* renamed from: c */
    private synchronized void m5215c(C4034sj sjVar) {
        if (sjVar != null) {
            if (!this.f4739c.isEmpty() && !this.f4742f) {
                boolean z = false;
                for (C4032a a : this.f4739c) {
                    if (a.mo39990a(sjVar)) {
                        z = true;
                    }
                }
                if (z) {
                    m5214c();
                    this.f4739c.clear();
                }
            }
        }
    }

    /* renamed from: c */
    private void m5214c() {
        this.f4742f = true;
        this.f4743g.mo40589e().mo40594f().mo40567q();
    }
}
