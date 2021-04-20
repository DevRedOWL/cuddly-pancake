package com.google.android.play.core.listener;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.internal.C2241ag;
import com.google.android.play.core.internal.C2258ax;
import com.google.android.play.core.splitcompat.C2345p;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.play.core.listener.b */
public abstract class C2318b<StateT> {

    /* renamed from: a */
    protected final C2241ag f1980a;

    /* renamed from: b */
    protected final Set<StateUpdatedListener<StateT>> f1981b = new HashSet();

    /* renamed from: c */
    private final IntentFilter f1982c;

    /* renamed from: d */
    private final Context f1983d;

    /* renamed from: e */
    private C2317a f1984e = null;

    /* renamed from: f */
    private volatile boolean f1985f = false;

    protected C2318b(C2241ag agVar, IntentFilter intentFilter, Context context) {
        this.f1980a = agVar;
        this.f1982c = intentFilter;
        this.f1983d = C2345p.m1447c(context);
    }

    /* renamed from: b */
    private final void m1369b() {
        C2317a aVar;
        if ((this.f1985f || !this.f1981b.isEmpty()) && this.f1984e == null) {
            this.f1984e = new C2317a(this);
            this.f1983d.registerReceiver(this.f1984e, this.f1982c);
        }
        if (!this.f1985f && this.f1981b.isEmpty() && (aVar = this.f1984e) != null) {
            this.f1983d.unregisterReceiver(aVar);
            this.f1984e = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo33522a(Context context, Intent intent);

    /* renamed from: e */
    public final synchronized void mo33917e(boolean z) {
        this.f1985f = z;
        m1369b();
    }

    /* renamed from: f */
    public final synchronized void mo33918f(StateUpdatedListener<StateT> stateUpdatedListener) {
        this.f1980a.mo33811d("registerListener", new Object[0]);
        C2258ax.m1183d(stateUpdatedListener, "Registered Play Core listener should not be null.");
        this.f1981b.add(stateUpdatedListener);
        m1369b();
    }

    /* renamed from: g */
    public final synchronized void mo33919g(StateUpdatedListener<StateT> stateUpdatedListener) {
        this.f1980a.mo33811d("unregisterListener", new Object[0]);
        C2258ax.m1183d(stateUpdatedListener, "Unregistered Play Core listener should not be null.");
        this.f1981b.remove(stateUpdatedListener);
        m1369b();
    }

    /* renamed from: h */
    public final synchronized void mo33920h() {
        this.f1980a.mo33811d("clearListeners", new Object[0]);
        this.f1981b.clear();
        m1369b();
    }

    /* renamed from: i */
    public final synchronized void mo33921i(StateT statet) {
        Iterator it = new HashSet(this.f1981b).iterator();
        while (it.hasNext()) {
            ((StateUpdatedListener) it.next()).onStateUpdate(statet);
        }
    }

    /* renamed from: j */
    public final synchronized boolean mo33922j() {
        return this.f1984e != null;
    }
}
