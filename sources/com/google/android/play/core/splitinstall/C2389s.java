package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.internal.C2241ag;
import com.google.android.play.core.listener.C2318b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.google.android.play.core.splitinstall.s */
public final class C2389s extends C2318b<SplitInstallSessionState> {

    /* renamed from: c */
    private static C2389s f2130c;

    /* renamed from: d */
    private final Handler f2131d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    private final C2374e f2132e;

    /* renamed from: f */
    private final Set<SplitInstallStateUpdatedListener> f2133f = new LinkedHashSet();

    public C2389s(Context context, C2374e eVar) {
        super(new C2241ag("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.f2132e = eVar;
    }

    /* renamed from: b */
    public static synchronized C2389s m1548b(Context context) {
        C2389s sVar;
        synchronized (C2389s.class) {
            if (f2130c == null) {
                f2130c = new C2389s(context, C2381l.f2114a);
            }
            sVar = f2130c;
        }
        return sVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33522a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra != null) {
            SplitInstallSessionState d = SplitInstallSessionState.m1454d(bundleExtra);
            this.f1980a.mo33808a("ListenerRegistryBroadcastReceiver.onReceive: %s", d);
            C2375f a = this.f2132e.mo34027a();
            if (d.status() != 3 || a == null) {
                mo34038k(d);
            } else {
                a.mo33824a(d.mo33998c(), new C2387q(this, d, intent, context));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo34036c(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.f2133f.add(splitInstallStateUpdatedListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo34037d(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.f2133f.remove(splitInstallStateUpdatedListener);
    }

    /* renamed from: k */
    public final synchronized void mo34038k(SplitInstallSessionState splitInstallSessionState) {
        Iterator it = new LinkedHashSet(this.f2133f).iterator();
        while (it.hasNext()) {
            ((SplitInstallStateUpdatedListener) it.next()).onStateUpdate(splitInstallSessionState);
        }
        super.mo33921i(splitInstallSessionState);
    }
}
