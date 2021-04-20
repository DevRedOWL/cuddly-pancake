package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
final class zzt extends zzs {
    private final Callable<String> zzb;

    private zzt(Callable<String> callable) {
        super(false, (String) null, (Throwable) null);
        this.zzb = callable;
    }

    /* access modifiers changed from: package-private */
    public final String zzb() {
        try {
            return this.zzb.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
