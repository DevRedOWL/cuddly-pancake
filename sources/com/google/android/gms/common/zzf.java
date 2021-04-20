package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
abstract class zzf extends zzd {
    private static final WeakReference<byte[]> zzb = new WeakReference<>((Object) null);
    private WeakReference<byte[]> zza = zzb;

    zzf(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: protected */
    public abstract byte[] zzd();

    /* access modifiers changed from: package-private */
    public final byte[] zza() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.zza.get();
            if (bArr == null) {
                bArr = zzd();
                this.zza = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }
}