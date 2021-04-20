package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzml;
import com.google.android.gms.internal.measurement.zzw;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.lang3.time.DateUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
public final class zzir extends zzg {
    /* access modifiers changed from: private */
    public final zzjl zza;
    /* access modifiers changed from: private */
    public zzei zzb;
    private volatile Boolean zzc;
    private final zzai zzd;
    private final zzke zze;
    private final List<Runnable> zzf = new ArrayList();
    private final zzai zzg;

    protected zzir(zzfu zzfu) {
        super(zzfu);
        this.zze = new zzke(zzfu.zzl());
        this.zza = new zzjl(this);
        this.zzd = new zziq(this, zzfu);
        this.zzg = new zzja(this, zzfu);
    }

    /* access modifiers changed from: protected */
    public final boolean zzy() {
        return false;
    }

    public final boolean zzaa() {
        zzc();
        zzv();
        return this.zzb != null;
    }

    /* access modifiers changed from: protected */
    public final void zzab() {
        zzc();
        zzv();
        zza((Runnable) new zzjc(this, zzb(true)));
    }

    /* access modifiers changed from: protected */
    public final void zza(boolean z) {
        if (zzml.zzb() && zzs().zza(zzas.zzcg)) {
            zzc();
            zzv();
            if (z) {
                zzi().zzaa();
            }
            if (zzai()) {
                zza((Runnable) new zzjf(this, zzb(false)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzei zzei, AbstractSafeParcelable abstractSafeParcelable, zzn zzn) {
        int i;
        zzc();
        zzv();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List<AbstractSafeParcelable> zza2 = zzi().zza(100);
            if (zza2 != null) {
                arrayList.addAll(zza2);
                i = zza2.size();
            } else {
                i = 0;
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) obj;
                if (abstractSafeParcelable2 instanceof zzaq) {
                    try {
                        zzei.zza((zzaq) abstractSafeParcelable2, zzn);
                    } catch (RemoteException e) {
                        zzq().zze().zza("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzku) {
                    try {
                        zzei.zza((zzku) abstractSafeParcelable2, zzn);
                    } catch (RemoteException e2) {
                        zzq().zze().zza("Failed to send user property to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzz) {
                    try {
                        zzei.zza((zzz) abstractSafeParcelable2, zzn);
                    } catch (RemoteException e3) {
                        zzq().zze().zza("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    zzq().zze().zza("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* access modifiers changed from: protected */
    public final void zza(zzaq zzaq, String str) {
        Preconditions.checkNotNull(zzaq);
        zzc();
        zzv();
        zza((Runnable) new zzje(this, true, zzi().zza(zzaq), zzaq, zzb(true), str));
    }

    /* access modifiers changed from: protected */
    public final void zza(zzz zzz) {
        Preconditions.checkNotNull(zzz);
        zzc();
        zzv();
        zza((Runnable) new zzjh(this, true, zzi().zza(zzz), new zzz(zzz), zzb(true), zzz));
    }

    /* access modifiers changed from: protected */
    public final void zza(AtomicReference<List<zzz>> atomicReference, String str, String str2, String str3) {
        zzc();
        zzv();
        zza((Runnable) new zzjg(this, atomicReference, str, str2, str3, zzb(false)));
    }

    /* access modifiers changed from: protected */
    public final void zza(zzw zzw, String str, String str2) {
        zzc();
        zzv();
        zza((Runnable) new zzjj(this, str, str2, zzb(false), zzw));
    }

    /* access modifiers changed from: protected */
    public final void zza(AtomicReference<List<zzku>> atomicReference, String str, String str2, String str3, boolean z) {
        zzc();
        zzv();
        zza((Runnable) new zzji(this, atomicReference, str, str2, str3, z, zzb(false)));
    }

    /* access modifiers changed from: protected */
    public final void zza(zzw zzw, String str, String str2, boolean z) {
        zzc();
        zzv();
        zza((Runnable) new zzit(this, str, str2, z, zzb(false), zzw));
    }

    /* access modifiers changed from: protected */
    public final void zza(zzku zzku) {
        zzc();
        zzv();
        zza((Runnable) new zzis(this, zzi().zza(zzku), zzku, zzb(true)));
    }

    /* access modifiers changed from: protected */
    public final void zza(AtomicReference<List<zzku>> atomicReference, boolean z) {
        zzc();
        zzv();
        zza((Runnable) new zziv(this, atomicReference, zzb(false), z));
    }

    /* access modifiers changed from: protected */
    public final void zzac() {
        zzc();
        zzv();
        zzn zzb2 = zzb(false);
        zzi().zzaa();
        zza((Runnable) new zziu(this, zzb2));
    }

    public final void zza(AtomicReference<String> atomicReference) {
        zzc();
        zzv();
        zza((Runnable) new zzix(this, atomicReference, zzb(false)));
    }

    public final void zza(zzw zzw) {
        zzc();
        zzv();
        zza((Runnable) new zziw(this, zzb(false), zzw));
    }

    /* access modifiers changed from: protected */
    public final void zzad() {
        zzc();
        zzv();
        zzn zzb2 = zzb(true);
        zzi().zzab();
        zza((Runnable) new zziz(this, zzb2));
    }

    /* access modifiers changed from: protected */
    public final void zza(zzij zzij) {
        zzc();
        zzv();
        zza((Runnable) new zziy(this, zzij));
    }

    public final void zza(Bundle bundle) {
        zzc();
        zzv();
        zza((Runnable) new zzjb(this, bundle, zzb(false)));
    }

    /* access modifiers changed from: private */
    public final void zzaj() {
        zzc();
        this.zze.zza();
        this.zzd.zza(zzas.zzai.zza(null).longValue());
    }

    /* access modifiers changed from: package-private */
    public final void zzae() {
        zzc();
        zzv();
        if (!zzaa()) {
            if (zzak()) {
                this.zza.zzb();
            } else if (!zzs().zzy()) {
                List<ResolveInfo> queryIntentServices = zzm().getPackageManager().queryIntentServices(new Intent().setClassName(zzm(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices != null && queryIntentServices.size() > 0) {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    intent.setComponent(new ComponentName(zzm(), "com.google.android.gms.measurement.AppMeasurementService"));
                    this.zza.zza(intent);
                    return;
                }
                zzq().zze().zza("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final Boolean zzaf() {
        return this.zzc;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzak() {
        /*
            r5 = this;
            r5.zzc()
            r5.zzv()
            java.lang.Boolean r0 = r5.zzc
            if (r0 != 0) goto L_0x0100
            r5.zzc()
            r5.zzv()
            com.google.android.gms.measurement.internal.zzfc r0 = r5.zzr()
            java.lang.Boolean r0 = r0.zzi()
            r1 = 1
            if (r0 == 0) goto L_0x0023
            boolean r2 = r0.booleanValue()
            if (r2 == 0) goto L_0x0023
            goto L_0x00fa
        L_0x0023:
            com.google.android.gms.measurement.internal.zzen r2 = r5.zzf()
            int r2 = r2.zzaf()
            r3 = 0
            if (r2 != r1) goto L_0x0031
        L_0x002e:
            r0 = 1
            goto L_0x00d7
        L_0x0031:
            com.google.android.gms.measurement.internal.zzeq r2 = r5.zzq()
            com.google.android.gms.measurement.internal.zzes r2 = r2.zzw()
            java.lang.String r4 = "Checking service availability"
            r2.zza(r4)
            com.google.android.gms.measurement.internal.zzkv r2 = r5.zzo()
            r4 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r2 = r2.zza((int) r4)
            if (r2 == 0) goto L_0x00c8
            if (r2 == r1) goto L_0x00b9
            r4 = 2
            if (r2 == r4) goto L_0x0099
            r0 = 3
            if (r2 == r0) goto L_0x008b
            r0 = 9
            if (r2 == r0) goto L_0x007d
            r0 = 18
            if (r2 == r0) goto L_0x006f
            com.google.android.gms.measurement.internal.zzeq r0 = r5.zzq()
            com.google.android.gms.measurement.internal.zzes r0 = r0.zzh()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = "Unexpected service status"
            r0.zza(r2, r1)
        L_0x006c:
            r0 = 0
        L_0x006d:
            r1 = 0
            goto L_0x00d7
        L_0x006f:
            com.google.android.gms.measurement.internal.zzeq r0 = r5.zzq()
            com.google.android.gms.measurement.internal.zzes r0 = r0.zzh()
            java.lang.String r2 = "Service updating"
            r0.zza(r2)
            goto L_0x002e
        L_0x007d:
            com.google.android.gms.measurement.internal.zzeq r0 = r5.zzq()
            com.google.android.gms.measurement.internal.zzes r0 = r0.zzh()
            java.lang.String r1 = "Service invalid"
            r0.zza(r1)
            goto L_0x006c
        L_0x008b:
            com.google.android.gms.measurement.internal.zzeq r0 = r5.zzq()
            com.google.android.gms.measurement.internal.zzes r0 = r0.zzh()
            java.lang.String r1 = "Service disabled"
            r0.zza(r1)
            goto L_0x006c
        L_0x0099:
            com.google.android.gms.measurement.internal.zzeq r2 = r5.zzq()
            com.google.android.gms.measurement.internal.zzes r2 = r2.zzv()
            java.lang.String r4 = "Service container out of date"
            r2.zza(r4)
            com.google.android.gms.measurement.internal.zzkv r2 = r5.zzo()
            int r2 = r2.zzi()
            r4 = 17443(0x4423, float:2.4443E-41)
            if (r2 >= r4) goto L_0x00b3
            goto L_0x00c6
        L_0x00b3:
            if (r0 != 0) goto L_0x00b6
            goto L_0x00b7
        L_0x00b6:
            r1 = 0
        L_0x00b7:
            r0 = 0
            goto L_0x00d7
        L_0x00b9:
            com.google.android.gms.measurement.internal.zzeq r0 = r5.zzq()
            com.google.android.gms.measurement.internal.zzes r0 = r0.zzw()
            java.lang.String r2 = "Service missing"
            r0.zza(r2)
        L_0x00c6:
            r0 = 1
            goto L_0x006d
        L_0x00c8:
            com.google.android.gms.measurement.internal.zzeq r0 = r5.zzq()
            com.google.android.gms.measurement.internal.zzes r0 = r0.zzw()
            java.lang.String r2 = "Service available"
            r0.zza(r2)
            goto L_0x002e
        L_0x00d7:
            if (r1 != 0) goto L_0x00f1
            com.google.android.gms.measurement.internal.zzab r2 = r5.zzs()
            boolean r2 = r2.zzy()
            if (r2 == 0) goto L_0x00f1
            com.google.android.gms.measurement.internal.zzeq r0 = r5.zzq()
            com.google.android.gms.measurement.internal.zzes r0 = r0.zze()
            java.lang.String r2 = "No way to upload. Consider using the full version of Analytics"
            r0.zza(r2)
            r0 = 0
        L_0x00f1:
            if (r0 == 0) goto L_0x00fa
            com.google.android.gms.measurement.internal.zzfc r0 = r5.zzr()
            r0.zza((boolean) r1)
        L_0x00fa:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5.zzc = r0
        L_0x0100:
            java.lang.Boolean r0 = r5.zzc
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzir.zzak():boolean");
    }

    /* access modifiers changed from: protected */
    public final void zza(zzei zzei) {
        zzc();
        Preconditions.checkNotNull(zzei);
        this.zzb = zzei;
        zzaj();
        zzam();
    }

    public final void zzag() {
        zzc();
        zzv();
        this.zza.zza();
        try {
            ConnectionTracker.getInstance().unbindService(zzm(), this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.zzb = null;
    }

    /* access modifiers changed from: private */
    public final void zza(ComponentName componentName) {
        zzc();
        if (this.zzb != null) {
            this.zzb = null;
            zzq().zzw().zza("Disconnected from device MeasurementService", componentName);
            zzc();
            zzae();
        }
    }

    /* access modifiers changed from: private */
    public final void zzal() {
        zzc();
        if (zzaa()) {
            zzq().zzw().zza("Inactivity, disconnecting from the service");
            zzag();
        }
    }

    private final void zza(Runnable runnable) throws IllegalStateException {
        zzc();
        if (zzaa()) {
            runnable.run();
        } else if (((long) this.zzf.size()) >= 1000) {
            zzq().zze().zza("Discarding data. Max runnable queue size reached");
        } else {
            this.zzf.add(runnable);
            this.zzg.zza(DateUtils.MILLIS_PER_MINUTE);
            zzae();
        }
    }

    /* access modifiers changed from: private */
    public final void zzam() {
        zzc();
        zzq().zzw().zza("Processing queued up service tasks", Integer.valueOf(this.zzf.size()));
        for (Runnable run : this.zzf) {
            try {
                run.run();
            } catch (Exception e) {
                zzq().zze().zza("Task exception while flushing queue", e);
            }
        }
        this.zzf.clear();
        this.zzg.zzc();
    }

    private final zzn zzb(boolean z) {
        return zzf().zza(z ? zzq().zzx() : null);
    }

    public final void zza(zzw zzw, zzaq zzaq, String str) {
        zzc();
        zzv();
        if (zzo().zza((int) GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) != 0) {
            zzq().zzh().zza("Not bundling data. Service unavailable or out of date");
            zzo().zza(zzw, new byte[0]);
            return;
        }
        zza((Runnable) new zzjd(this, zzaq, str, zzw));
    }

    /* access modifiers changed from: package-private */
    public final boolean zzah() {
        zzc();
        zzv();
        if (zzak() && zzo().zzi() < 200900) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzai() {
        zzc();
        zzv();
        if (!zzs().zza(zzas.zzci)) {
            return false;
        }
        if (zzak() && zzo().zzi() < zzas.zzcj.zza(null).intValue()) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ void zza() {
        super.zza();
    }

    public final /* bridge */ /* synthetic */ void zzb() {
        super.zzb();
    }

    public final /* bridge */ /* synthetic */ void zzc() {
        super.zzc();
    }

    public final /* bridge */ /* synthetic */ zza zzd() {
        return super.zzd();
    }

    public final /* bridge */ /* synthetic */ zzhb zze() {
        return super.zze();
    }

    public final /* bridge */ /* synthetic */ zzen zzf() {
        return super.zzf();
    }

    public final /* bridge */ /* synthetic */ zzir zzg() {
        return super.zzg();
    }

    public final /* bridge */ /* synthetic */ zzii zzh() {
        return super.zzh();
    }

    public final /* bridge */ /* synthetic */ zzem zzi() {
        return super.zzi();
    }

    public final /* bridge */ /* synthetic */ zzjx zzj() {
        return super.zzj();
    }

    public final /* bridge */ /* synthetic */ zzak zzk() {
        return super.zzk();
    }

    public final /* bridge */ /* synthetic */ Clock zzl() {
        return super.zzl();
    }

    public final /* bridge */ /* synthetic */ Context zzm() {
        return super.zzm();
    }

    public final /* bridge */ /* synthetic */ zzeo zzn() {
        return super.zzn();
    }

    public final /* bridge */ /* synthetic */ zzkv zzo() {
        return super.zzo();
    }

    public final /* bridge */ /* synthetic */ zzfr zzp() {
        return super.zzp();
    }

    public final /* bridge */ /* synthetic */ zzeq zzq() {
        return super.zzq();
    }

    public final /* bridge */ /* synthetic */ zzfc zzr() {
        return super.zzr();
    }

    public final /* bridge */ /* synthetic */ zzab zzs() {
        return super.zzs();
    }

    public final /* bridge */ /* synthetic */ zzw zzt() {
        return super.zzt();
    }
}
