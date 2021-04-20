package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.location.Location;
import android.os.Parcel;
import com.yandex.metrica.impl.p039ob.C3744np;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.oo */
public class C3785oo implements C3807p {

    /* renamed from: a */
    public static final long f3957a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    private static volatile C3785oo f3958b;

    /* renamed from: c */
    private static final Object f3959c = new Object();

    /* renamed from: d */
    private final Context f3960d;

    /* renamed from: e */
    private C4258xi f3961e;

    /* renamed from: f */
    private final WeakHashMap<Object, Object> f3962f;

    /* renamed from: g */
    private boolean f3963g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C3774oh f3964h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C4143uk f3965i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C3796ot f3966j;

    /* renamed from: k */
    private C3789a f3967k;

    /* renamed from: l */
    private Runnable f3968l;

    /* renamed from: m */
    private C3633lh f3969m;

    /* renamed from: n */
    private C3632lg f3970n;

    /* renamed from: o */
    private final C3832pr f3971o;

    /* renamed from: p */
    private final C3838px f3972p;

    /* renamed from: q */
    private boolean f3973q;

    /* renamed from: r */
    private final Object f3974r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final Object f3975s;

    /* renamed from: com.yandex.metrica.impl.ob.oo$a */
    static class C3789a {
        C3789a() {
        }

        /* renamed from: a */
        public C3796ot mo40782a(Context context, C4258xi xiVar, C4143uk ukVar, C3774oh ohVar, C3633lh lhVar, C3632lg lgVar, C3832pr prVar) {
            return new C3796ot(context, ukVar, xiVar, ohVar, lhVar, lgVar, prVar);
        }
    }

    /* renamed from: a */
    public static C3785oo m4363a(Context context) {
        if (f3958b == null) {
            synchronized (f3959c) {
                if (f3958b == null) {
                    f3958b = new C3785oo(context.getApplicationContext());
                }
            }
        }
        return f3958b;
    }

    private C3785oo(Context context) {
        this(context, C3136al.m1993a().mo39495j().mo41833e(), new C3789a(), C3628ld.m3815a(context).mo40445g(), C3628ld.m3815a(context).mo40446h(), C3744np.C3746a.m4268a(C4143uk.class).mo40705a(context).mo40624a());
    }

    /* renamed from: c */
    private void m4368c() {
        this.f3961e.mo41808a((Runnable) new Runnable() {
            public void run() {
                try {
                    if (C3785oo.this.f3966j != null) {
                        C3785oo.this.f3966j.mo40803a();
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* renamed from: a */
    public void mo40775a(Object obj) {
        synchronized (this.f3974r) {
            this.f3962f.put(obj, (Object) null);
            m4370d();
        }
    }

    /* renamed from: b */
    public void mo40778b(Object obj) {
        synchronized (this.f3974r) {
            this.f3962f.remove(obj);
            m4370d();
        }
    }

    /* renamed from: d */
    private void m4370d() {
        if (this.f3973q) {
            if (!this.f3963g || this.f3962f.isEmpty()) {
                m4372e();
                this.f3973q = false;
            }
        } else if (this.f3963g && !this.f3962f.isEmpty()) {
            m4373f();
            this.f3973q = true;
        }
    }

    /* renamed from: e */
    private void m4372e() {
        C3796ot otVar = this.f3966j;
        if (otVar != null) {
            otVar.mo40809f();
        }
        m4375h();
    }

    /* renamed from: f */
    private void m4373f() {
        if (this.f3966j == null) {
            synchronized (this.f3975s) {
                this.f3966j = this.f3967k.mo40782a(this.f3960d, this.f3961e, this.f3965i, this.f3964h, this.f3969m, this.f3970n, this.f3971o);
            }
        }
        this.f3966j.mo40808e();
        m4374g();
        m4368c();
    }

    /* renamed from: a */
    public Location mo40773a() {
        C3796ot otVar = this.f3966j;
        if (otVar == null) {
            return null;
        }
        return otVar.mo40805b();
    }

    /* renamed from: b */
    public Location mo40777b() {
        C3796ot otVar = this.f3966j;
        if (otVar == null) {
            return null;
        }
        return otVar.mo40806c();
    }

    /* renamed from: g */
    private void m4374g() {
        if (this.f3968l == null) {
            this.f3968l = new Runnable() {
                public void run() {
                    C3796ot a = C3785oo.this.f3966j;
                    if (a != null) {
                        a.mo40807d();
                    }
                    C3785oo.this.m4376i();
                }
            };
            m4376i();
        }
    }

    /* renamed from: h */
    private void m4375h() {
        Runnable runnable = this.f3968l;
        if (runnable != null) {
            this.f3961e.mo41812b(runnable);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m4376i() {
        this.f3961e.mo41809a(this.f3968l, f3957a);
    }

    /* renamed from: a */
    public static byte[] m4365a(Location location) {
        if (location != null) {
            Parcel obtain = Parcel.obtain();
            try {
                obtain.writeValue(location);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                return marshall;
            } catch (Throwable unused) {
                obtain.recycle();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Location m4362a(byte[] bArr) {
        if (bArr != null) {
            Parcel obtain = Parcel.obtain();
            try {
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                Location location = (Location) obtain.readValue(Location.class.getClassLoader());
                obtain.recycle();
                return location;
            } catch (Throwable unused) {
                obtain.recycle();
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo40776a(boolean z) {
        synchronized (this.f3974r) {
            if (this.f3963g != z) {
                this.f3963g = z;
                this.f3972p.mo40871a(z);
                this.f3971o.mo40852a(this.f3972p.mo40869a());
                m4370d();
            }
        }
    }

    /* renamed from: a */
    public void mo40774a(C4143uk ukVar, C3774oh ohVar) {
        synchronized (this.f3974r) {
            this.f3965i = ukVar;
            this.f3964h = ohVar;
            this.f3972p.mo40870a(ukVar);
            this.f3971o.mo40852a(this.f3972p.mo40869a());
        }
        this.f3961e.mo41808a((Runnable) new Runnable() {
            public void run() {
                synchronized (C3785oo.this.f3975s) {
                    if (C3785oo.this.f3966j != null) {
                        C3785oo.this.f3966j.mo40804a(C3785oo.this.f3965i, C3785oo.this.f3964h);
                    }
                }
            }
        });
    }

    C3785oo(Context context, C4258xi xiVar, C3789a aVar, C3633lh lhVar, C3632lg lgVar, C4143uk ukVar) {
        this.f3963g = false;
        this.f3972p = new C3838px();
        this.f3973q = false;
        this.f3974r = new Object();
        this.f3975s = new Object();
        this.f3960d = context;
        this.f3961e = xiVar;
        this.f3962f = new WeakHashMap<>();
        this.f3967k = aVar;
        this.f3969m = lhVar;
        this.f3970n = lgVar;
        this.f3965i = ukVar;
        this.f3971o = new C3832pr(this.f3972p.mo40869a());
    }
}
