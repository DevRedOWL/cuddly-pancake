package com.yandex.metrica.impl.p038ac;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import com.yandex.metrica.impl.p039ob.C3136al;
import com.yandex.metrica.impl.p039ob.C3320db;
import com.yandex.metrica.impl.p039ob.C3350dr;
import com.yandex.metrica.impl.p039ob.C3356dt;
import com.yandex.metrica.impl.p039ob.C3357du;
import com.yandex.metrica.impl.p039ob.C3358dv;
import com.yandex.metrica.impl.p039ob.C3361dw;
import com.yandex.metrica.impl.p039ob.C3367eb;
import com.yandex.metrica.impl.p039ob.C4143uk;
import com.yandex.metrica.impl.p039ob.C4257xh;
import com.yandex.metrica.impl.p039ob.C4281yc;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.yandex.metrica.impl.ac.a */
public class C3098a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile String f2440a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile Boolean f2441b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Object f2442c;

    /* renamed from: d */
    private volatile FutureTask<Pair<String, Boolean>> f2443d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C4143uk f2444e;

    /* renamed from: f */
    private final C3109f f2445f;

    /* renamed from: g */
    private Context f2446g;

    /* renamed from: h */
    private final C4281yc f2447h;

    /* renamed from: i */
    private C4257xh f2448i;

    /* renamed from: com.yandex.metrica.impl.ac.a$a */
    private static class C3102a {

        /* renamed from: a */
        static final C3098a f2453a = new C3098a(new C3103b(), C3320db.m2960k().mo41803b());
    }

    /* renamed from: com.yandex.metrica.impl.ac.a$f */
    interface C3109f {
        /* renamed from: a */
        boolean mo39405a(C4143uk ukVar);
    }

    /* renamed from: com.yandex.metrica.impl.ac.a$g */
    private static class C3110g {

        /* renamed from: a */
        static final C3098a f2460a = new C3098a(new C3111h(), C3136al.m1993a().mo39495j().mo41837i());
    }

    /* renamed from: com.yandex.metrica.impl.ac.a$i */
    private interface C3112i<T> {
        /* renamed from: b */
        T mo39404b(Future<Pair<String, Boolean>> future) throws InterruptedException, ExecutionException;
    }

    /* renamed from: com.yandex.metrica.impl.ac.a$c */
    public static class C3104c {

        /* renamed from: a */
        public final String f2454a;

        /* renamed from: b */
        public final Boolean f2455b;

        public C3104c(String str, Boolean bool) {
            this.f2454a = str;
            this.f2455b = bool;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ac.a$b */
    static class C3103b implements C3109f {
        /* renamed from: a */
        public boolean mo39405a(C4143uk ukVar) {
            return true;
        }

        C3103b() {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ac.a$h */
    static class C3111h implements C3109f {
        C3111h() {
        }

        /* renamed from: a */
        public boolean mo39405a(C4143uk ukVar) {
            return ukVar != null && (ukVar.f5101o.f5001h || !ukVar.f5107u);
        }
    }

    private C3098a(C3109f fVar, C4257xh xhVar) {
        this.f2440a = null;
        this.f2441b = null;
        this.f2442c = new Object();
        this.f2445f = fVar;
        this.f2447h = new C4281yc();
        this.f2448i = xhVar;
        C3350dr.m3043a().mo39930a(this, C3367eb.class, C3358dv.m3057a(new C3357du<C3367eb>() {
            /* renamed from: a */
            public void mo39399a(C3367eb ebVar) {
                synchronized (C3098a.this.f2442c) {
                    C4143uk unused = C3098a.this.f2444e = ebVar.f3096b;
                }
            }
        }).mo39939a());
    }

    /* renamed from: a */
    public static C3098a m1836a() {
        return C3110g.f2460a;
    }

    /* renamed from: b */
    public static C3098a m1843b() {
        return C3102a.f2453a;
    }

    /* renamed from: a */
    public void mo39392a(Context context) {
        this.f2446g = context.getApplicationContext();
    }

    /* renamed from: b */
    public void mo39394b(final Context context) {
        this.f2446g = context.getApplicationContext();
        if (this.f2443d == null) {
            synchronized (this.f2442c) {
                if (this.f2443d == null && this.f2445f.mo39405a(this.f2444e)) {
                    this.f2443d = new FutureTask<>(new Callable<Pair<String, Boolean>>() {
                        /* renamed from: a */
                        public Pair<String, Boolean> call() {
                            Context applicationContext = context.getApplicationContext();
                            if (C3098a.this.m1848d(applicationContext)) {
                                C3098a.this.m1849e(applicationContext);
                            }
                            if (!C3098a.this.mo39398e()) {
                                C3098a.this.m1851f(applicationContext);
                            }
                            return new Pair<>(C3098a.this.f2440a, C3098a.this.f2441b);
                        }
                    });
                    this.f2448i.mo41808a((Runnable) this.f2443d);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo39393a(Context context, C4143uk ukVar) {
        this.f2444e = ukVar;
        mo39394b(context);
    }

    /* renamed from: a */
    private void m1841a(String str) {
        C3350dr.m3043a().mo39931b((C3356dt) new C3361dw(str));
        this.f2440a = str;
    }

    /* renamed from: a */
    private void m1840a(Boolean bool) {
        this.f2441b = bool;
    }

    /* renamed from: a */
    private <T> T m1838a(Context context, C3112i<T> iVar) {
        mo39394b(context);
        try {
            return iVar.mo39404b(this.f2443d);
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public C3104c mo39395c(Context context) {
        if (this.f2445f.mo39405a(this.f2444e)) {
            return (C3104c) m1838a(context, new C3112i<C3104c>() {
                /* renamed from: a */
                public C3104c mo39404b(Future<Pair<String, Boolean>> future) throws InterruptedException, ExecutionException {
                    Pair pair = future.get();
                    return new C3104c((String) pair.first, (Boolean) pair.second);
                }
            });
        }
        return null;
    }

    /* renamed from: c */
    public String mo39396c() {
        m1850f();
        return this.f2440a;
    }

    /* renamed from: d */
    public Boolean mo39397d() {
        m1850f();
        return this.f2441b;
    }

    /* renamed from: f */
    private void m1850f() {
        if (this.f2446g != null && !mo39398e()) {
            mo39395c(this.f2446g);
        }
    }

    /* renamed from: e */
    public synchronized boolean mo39398e() {
        return (this.f2440a == null || this.f2441b == null) ? false : true;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m1848d(Context context) {
        try {
            return Class.forName("com.google.android.gms.common.GooglePlayServicesUtil").getMethod("isGooglePlayServicesAvailable", new Class[]{Context.class}).invoke((Object) null, new Object[]{context}).equals(0);
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m1849e(Context context) {
        try {
            Object invoke = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
            Class<?> cls = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
            String str = (String) cls.getMethod("getId", new Class[0]).invoke(invoke, new Object[0]);
            Boolean bool = (Boolean) cls.getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(invoke, new Object[0]);
            synchronized (this) {
                m1841a(str);
                m1840a(bool);
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m1851f(Context context) {
        C3108e eVar = new C3108e();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (this.f2447h.mo41867c(context, intent, 0) != null && context.bindService(intent, eVar, 1)) {
            try {
                C3105d a = C3105d.C3106a.m1867a(eVar.mo39410a());
                String a2 = a.mo39406a();
                Boolean valueOf = Boolean.valueOf(a.mo39407a(true));
                synchronized (this) {
                    m1841a(a2);
                    m1840a(valueOf);
                }
            } catch (Throwable unused) {
            }
            context.unbindService(eVar);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ac.a$d */
    private interface C3105d extends IInterface {
        /* renamed from: a */
        String mo39406a() throws RemoteException;

        /* renamed from: a */
        boolean mo39407a(boolean z) throws RemoteException;

        /* renamed from: com.yandex.metrica.impl.ac.a$d$a */
        public static abstract class C3106a extends Binder implements C3105d {
            /* renamed from: a */
            public static C3105d m1867a(IBinder iBinder) {
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof C3105d)) {
                    return new C3107a(iBinder);
                }
                return (C3105d) queryLocalInterface;
            }

            public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
                if (i == 1) {
                    parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    String a = mo39406a();
                    parcel2.writeNoException();
                    parcel2.writeString(a);
                    return true;
                } else if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean a2 = mo39407a(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(a2 ? 1 : 0);
                    return true;
                }
            }

            /* renamed from: com.yandex.metrica.impl.ac.a$d$a$a */
            private static class C3107a implements C3105d {

                /* renamed from: a */
                private IBinder f2456a;

                C3107a(IBinder iBinder) {
                    this.f2456a = iBinder;
                }

                public IBinder asBinder() {
                    return this.f2456a;
                }

                /* renamed from: a */
                public String mo39406a() throws RemoteException {
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        this.f2456a.transact(1, obtain, obtain2, 0);
                        obtain2.readException();
                        return obtain2.readString();
                    } finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                }

                /* renamed from: a */
                public boolean mo39407a(boolean z) throws RemoteException {
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        boolean z2 = true;
                        obtain.writeInt(z ? 1 : 0);
                        this.f2456a.transact(2, obtain, obtain2, 0);
                        obtain2.readException();
                        if (obtain2.readInt() == 0) {
                            z2 = false;
                        }
                        return z2;
                    } finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ac.a$e */
    private class C3108e implements ServiceConnection {

        /* renamed from: b */
        private boolean f2458b;

        /* renamed from: c */
        private final BlockingQueue<IBinder> f2459c;

        public void onServiceDisconnected(ComponentName componentName) {
        }

        private C3108e() {
            this.f2458b = false;
            this.f2459c = new LinkedBlockingQueue();
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f2459c.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        /* renamed from: a */
        public IBinder mo39410a() throws InterruptedException {
            if (!this.f2458b) {
                this.f2458b = true;
                return this.f2459c.take();
            }
            throw new IllegalStateException();
        }
    }
}
