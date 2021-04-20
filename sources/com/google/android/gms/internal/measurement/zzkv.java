package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
final class zzkv extends zzkt<zzks, zzks> {
    zzkv() {
    }

    /* access modifiers changed from: package-private */
    public final boolean zza(zzjy zzjy) {
        return false;
    }

    private static void zza(Object obj, zzks zzks) {
        ((zzhy) obj).zzb = zzks;
    }

    /* access modifiers changed from: package-private */
    public final void zzd(Object obj) {
        ((zzhy) obj).zzb.zzc();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int zzf(Object obj) {
        return ((zzks) obj).zze();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int zze(Object obj) {
        return ((zzks) obj).zzd();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzc(Object obj, Object obj2) {
        zzks zzks = (zzks) obj;
        zzks zzks2 = (zzks) obj2;
        if (zzks2.equals(zzks.zza())) {
            return zzks;
        }
        return zzks.zza(zzks, zzks2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Object obj, zzlm zzlm) throws IOException {
        ((zzks) obj).zza(zzlm);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, zzlm zzlm) throws IOException {
        ((zzks) obj).zzb(zzlm);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Object obj, Object obj2) {
        zza(obj, (zzks) obj2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzc(Object obj) {
        zzks zzks = ((zzhy) obj).zzb;
        if (zzks != zzks.zza()) {
            return zzks;
        }
        zzks zzb = zzks.zzb();
        zza(obj, zzb);
        return zzb;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzb(Object obj) {
        return ((zzhy) obj).zzb;
    }

    /* access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ void zza(Object obj, Object obj2) {
        zza(obj, (zzks) obj2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zza(Object obj) {
        zzks zzks = (zzks) obj;
        zzks.zzc();
        return zzks;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zza() {
        return zzks.zzb();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, int i, Object obj2) {
        ((zzks) obj).zza((i << 3) | 3, (Object) (zzks) obj2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, int i, zzgp zzgp) {
        ((zzks) obj).zza((i << 3) | 2, (Object) zzgp);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Object obj, int i, long j) {
        ((zzks) obj).zza((i << 3) | 1, (Object) Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, int i, int i2) {
        ((zzks) obj).zza((i << 3) | 5, (Object) Integer.valueOf(i2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, int i, long j) {
        ((zzks) obj).zza(i << 3, (Object) Long.valueOf(j));
    }
}
