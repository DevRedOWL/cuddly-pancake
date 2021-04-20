package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzm;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
final class zzfs<V> extends FutureTask<V> implements Comparable<zzfs<V>> {
    final boolean zza;
    private final long zzb = zzfr.zzj.getAndIncrement();
    private final String zzc;
    private final /* synthetic */ zzfr zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfs(zzfr zzfr, Callable<V> callable, boolean z, String str) {
        super(zzm.zza().zza(callable));
        this.zzd = zzfr;
        Preconditions.checkNotNull(str);
        this.zzc = str;
        this.zza = z;
        if (this.zzb == Long.MAX_VALUE) {
            zzfr.zzq().zze().zza("Tasks index overflow");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfs(zzfr zzfr, Runnable runnable, boolean z, String str) {
        super(zzm.zza().zza(runnable), (Object) null);
        this.zzd = zzfr;
        Preconditions.checkNotNull(str);
        this.zzc = str;
        this.zza = z;
        if (this.zzb == Long.MAX_VALUE) {
            zzfr.zzq().zze().zza("Tasks index overflow");
        }
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.zzd.zzq().zze().zza(this.zzc, th);
        if (th instanceof zzfq) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        zzfs zzfs = (zzfs) obj;
        boolean z = this.zza;
        if (z != zzfs.zza) {
            return z ? -1 : 1;
        }
        long j = this.zzb;
        long j2 = zzfs.zzb;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.zzd.zzq().zzf().zza("Two tasks share the same index. index", Long.valueOf(this.zzb));
        return 0;
    }
}
