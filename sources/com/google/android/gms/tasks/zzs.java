package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@17.2.0 */
final class zzs implements OnTokenCanceledListener {
    private final /* synthetic */ TaskCompletionSource zza;

    zzs(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void onCanceled() {
        this.zza.zza.zza();
    }
}
