package p000;

import android.content.Context;
import android.os.Handler;
import android.os.PowerManager;
import kotlin.jvm.internal.Intrinsics;
import p008c.p009a.p010a.C0837c;
import p008c.p009a.p010a.p012e.C0843a;
import p008c.p009a.p017d.p019b.C0911a;
import p008c.p009a.p017d.p019b.C0929d;
import p008c.p009a.p017d.p023e.C0956d;
import p035ru.unicorn.ujin.view.activity.navigation.helper.SharedHelper;

/* renamed from: a */
public final class C1769a implements Runnable, C0956d {

    /* renamed from: a */
    public boolean f1371a = true;

    /* renamed from: b */
    public Handler f1372b;

    /* renamed from: c */
    public PowerManager.WakeLock f1373c;

    /* renamed from: d */
    public Context f1374d;

    /* renamed from: e */
    public C0837c f1375e;

    public C1769a(Context context, C0837c cVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cVar, SharedHelper.APP_PREFERENCES);
        this.f1374d = context;
        this.f1375e = cVar;
        "Start on background, worker [" + hashCode() + ']';
        this.f1372b = new Handler();
        mo23998a(1000);
    }

    /* renamed from: a */
    public final void mo23997a() {
        "Stop on background, worker [" + hashCode() + ']';
        this.f1371a = false;
        this.f1372b.removeCallbacks(this);
        PowerManager.WakeLock wakeLock = this.f1373c;
        if (wakeLock == null) {
            Intrinsics.throwUninitializedPropertyAccessException("wakeLock");
        }
        if (wakeLock.isHeld()) {
            PowerManager.WakeLock wakeLock2 = this.f1373c;
            if (wakeLock2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("wakeLock");
            }
            wakeLock2.release();
        }
    }

    /* renamed from: a */
    public final void mo23998a(long j) {
        this.f1372b.removeCallbacks(this);
        this.f1372b.postDelayed(this, j);
        Object systemService = this.f1374d.getSystemService("power");
        if (systemService != null) {
            PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, "acid::BackgroundRequester");
            newWakeLock.acquire(j);
            Intrinsics.checkNotNullExpressionValue(newWakeLock, "(context.getSystemServic…uire(delayMilliseconds) }");
            this.f1373c = newWakeLock;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.os.PowerManager");
    }

    public void found() {
    }

    public void result(C0911a.C0912a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "result");
    }

    public void run() {
        if (this.f1371a) {
            "Access on background... [" + hashCode() + ']';
            Context context = this.f1374d;
            C0929d.C0931b.m517a(context, this.f1375e, this, new C0843a(context));
            mo23998a(5000);
        }
    }

    public void started() {
    }
}
