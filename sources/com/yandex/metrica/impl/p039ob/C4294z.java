package com.yandex.metrica.impl.p039ob;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.z */
public class C4294z implements Application.ActivityLifecycleCallbacks {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3152ax f5352a;

    /* renamed from: b */
    private final C4257xh f5353b;

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public C4294z(C3152ax axVar, C4257xh xhVar) {
        this.f5352a = axVar;
        this.f5353b = xhVar;
    }

    public void onActivityResumed(final Activity activity) {
        this.f5353b.mo41808a((Runnable) new Runnable() {
            public void run() {
                C4294z.this.f5352a.mo39535b(activity);
            }
        });
    }

    public void onActivityPaused(final Activity activity) {
        this.f5353b.mo41808a((Runnable) new Runnable() {
            public void run() {
                C4294z.this.f5352a.mo39536c(activity);
            }
        });
    }
}
