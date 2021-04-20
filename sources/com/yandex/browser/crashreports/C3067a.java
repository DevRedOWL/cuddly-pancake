package com.yandex.browser.crashreports;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.yandex.browser.crashreports.a */
public class C3067a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final long f2339a = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: b */
    private final C3069a f2340b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Handler f2341c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private final Thread f2342d = new C3070b();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AtomicBoolean f2343e = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Runnable f2344f = new Runnable() {
        public void run() {
            C3067a.this.f2343e.set(true);
        }
    };

    /* renamed from: com.yandex.browser.crashreports.a$a */
    public interface C3069a {
        /* renamed from: a */
        void mo39207a();
    }

    public C3067a(C3069a aVar) {
        this.f2340b = aVar;
    }

    /* renamed from: a */
    public void mo39204a() {
        try {
            this.f2342d.setName("CR-WatchDog");
        } catch (SecurityException unused) {
        }
        this.f2342d.start();
    }

    /* renamed from: b */
    public void mo39205b() {
        this.f2340b.mo39207a();
    }

    /* renamed from: com.yandex.browser.crashreports.a$b */
    private class C3070b extends Thread {
        public C3070b() {
        }

        public void run() {
            boolean z = false;
            int i = 0;
            while (!isInterrupted()) {
                if (!z) {
                    C3067a.this.f2343e.set(false);
                    C3067a.this.f2341c.post(C3067a.this.f2344f);
                    i = 0;
                }
                try {
                    Thread.sleep(C3067a.f2339a);
                    if (!C3067a.this.f2343e.get()) {
                        i++;
                        if (i == 4 && !Debug.isDebuggerConnected()) {
                            C3067a.this.mo39205b();
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
