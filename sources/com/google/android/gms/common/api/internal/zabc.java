package com.google.android.gms.common.api.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
final /* synthetic */ class zabc implements Executor {
    private final Handler zaa;

    private zabc(Handler handler) {
        this.zaa = handler;
    }

    static Executor zaa(Handler handler) {
        return new zabc(handler);
    }

    public final void execute(Runnable runnable) {
        this.zaa.post(runnable);
    }
}
