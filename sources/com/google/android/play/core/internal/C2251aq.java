package com.google.android.play.core.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.play.core.tasks.C2415i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.play.core.internal.aq */
public final class C2251aq<T extends IInterface> {

    /* renamed from: a */
    private static final Map<String, Handler> f1918a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f1919b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2241ag f1920c;

    /* renamed from: d */
    private final String f1921d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final List<C2242ah> f1922e = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f1923f;

    /* renamed from: g */
    private final Intent f1924g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C2247am<T> f1925h;

    /* renamed from: i */
    private final WeakReference<C2246al> f1926i;

    /* renamed from: j */
    private final IBinder.DeathRecipient f1927j = new C2243ai(this);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public ServiceConnection f1928k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public T f1929l;

    public C2251aq(Context context, C2241ag agVar, String str, Intent intent, C2247am<T> amVar) {
        this.f1919b = context;
        this.f1920c = agVar;
        this.f1921d = str;
        this.f1924g = intent;
        this.f1925h = amVar;
        this.f1926i = new WeakReference<>((Object) null);
    }

    /* renamed from: d */
    static /* synthetic */ void m1148d(C2251aq aqVar, C2242ah ahVar) {
        if (aqVar.f1929l == null && !aqVar.f1923f) {
            aqVar.f1920c.mo33811d("Initiate binding to the service.", new Object[0]);
            aqVar.f1922e.add(ahVar);
            aqVar.f1928k = new C2250ap(aqVar);
            aqVar.f1923f = true;
            if (!aqVar.f1919b.bindService(aqVar.f1924g, aqVar.f1928k, 1)) {
                aqVar.f1920c.mo33811d("Failed to bind to the service.", new Object[0]);
                aqVar.f1923f = false;
                for (C2242ah b : aqVar.f1922e) {
                    C2415i<?> b2 = b.mo33813b();
                    if (b2 != null) {
                        b2.mo34075d(new C2252ar());
                    }
                }
                aqVar.f1922e.clear();
            }
        } else if (aqVar.f1923f) {
            aqVar.f1920c.mo33811d("Waiting to bind to the service.", new Object[0]);
            aqVar.f1922e.add(ahVar);
        } else {
            ahVar.run();
        }
    }

    /* renamed from: j */
    static /* synthetic */ void m1154j(C2251aq aqVar) {
        aqVar.f1920c.mo33811d("linkToDeath", new Object[0]);
        try {
            aqVar.f1929l.asBinder().linkToDeath(aqVar.f1927j, 0);
        } catch (RemoteException e) {
            aqVar.f1920c.mo33810c(e, "linkToDeath failed", new Object[0]);
        }
    }

    /* renamed from: m */
    static /* synthetic */ void m1157m(C2251aq aqVar) {
        aqVar.f1920c.mo33811d("unlinkToDeath", new Object[0]);
        aqVar.f1929l.asBinder().unlinkToDeath(aqVar.f1927j, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final void m1161r(C2242ah ahVar) {
        Handler handler;
        synchronized (f1918a) {
            if (!f1918a.containsKey(this.f1921d)) {
                HandlerThread handlerThread = new HandlerThread(this.f1921d, 10);
                handlerThread.start();
                f1918a.put(this.f1921d, new Handler(handlerThread.getLooper()));
            }
            handler = f1918a.get(this.f1921d);
        }
        handler.post(ahVar);
    }

    /* renamed from: a */
    public final void mo33819a(C2242ah ahVar) {
        m1161r(new C2244aj(this, ahVar.mo33813b(), ahVar));
    }

    /* renamed from: b */
    public final void mo33820b() {
        m1161r(new C2245ak(this));
    }

    /* renamed from: c */
    public final T mo33821c() {
        return this.f1929l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ void mo33822n() {
        this.f1920c.mo33811d("reportBinderDeath", new Object[0]);
        C2246al alVar = (C2246al) this.f1926i.get();
        if (alVar == null) {
            this.f1920c.mo33811d("%s : Binder has died.", this.f1921d);
            for (C2242ah b : this.f1922e) {
                C2415i<?> b2 = b.mo33813b();
                if (b2 != null) {
                    b2.mo34075d(Build.VERSION.SDK_INT < 15 ? new RemoteException() : new RemoteException(String.valueOf(this.f1921d).concat(" : Binder has died.")));
                }
            }
            this.f1922e.clear();
            return;
        }
        this.f1920c.mo33811d("calling onBinderDied", new Object[0]);
        alVar.mo33816a();
    }
}
