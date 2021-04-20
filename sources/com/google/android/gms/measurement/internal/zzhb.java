package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.google.android.gcm.GCMConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzml;
import com.google.android.gms.internal.measurement.zzmy;
import com.google.android.gms.internal.measurement.zznj;
import com.google.android.gms.internal.measurement.zznw;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
public final class zzhb extends zzg {
    protected zzhy zza;
    final zzo zzb;
    private zzgw zzc;
    private final Set<zzgz> zzd = new CopyOnWriteArraySet();
    private boolean zze;
    private final AtomicReference<String> zzf = new AtomicReference<>();
    private final Object zzg = new Object();
    private zzac zzh = new zzac((Boolean) null, (Boolean) null);
    private int zzi = 100;
    private final AtomicLong zzj = new AtomicLong(0);
    private long zzk = -1;
    private int zzl = 100;
    private boolean zzm = true;
    private final zzky zzn = new zzhq(this);

    protected zzhb(zzfu zzfu) {
        super(zzfu);
        this.zzb = new zzo(zzfu);
    }

    /* access modifiers changed from: protected */
    public final boolean zzy() {
        return false;
    }

    public final void zzaa() {
        if (zzm().getApplicationContext() instanceof Application) {
            ((Application) zzm().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
        }
    }

    public final Boolean zzab() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) zzp().zza(atomicReference, 15000, "boolean test flag value", new zzhc(this, atomicReference));
    }

    public final String zzac() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) zzp().zza(atomicReference, 15000, "String test flag value", new zzhm(this, atomicReference));
    }

    public final Long zzad() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) zzp().zza(atomicReference, 15000, "long test flag value", new zzht(this, atomicReference));
    }

    public final Integer zzae() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) zzp().zza(atomicReference, 15000, "int test flag value", new zzhs(this, atomicReference));
    }

    public final Double zzaf() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) zzp().zza(atomicReference, 15000, "double test flag value", new zzhv(this, atomicReference));
    }

    public final void zza(Boolean bool) {
        zzv();
        zzp().zza((Runnable) new zzhu(this, bool));
    }

    public final void zza(Bundle bundle, int i, long j) {
        if (zzml.zzb() && zzs().zza(zzas.zzcg)) {
            zzv();
            String zza2 = zzac.zza(bundle);
            if (zza2 != null) {
                zzq().zzj().zza("Ignoring invalid consent setting", zza2);
                zzq().zzj().zza("Valid consent values are 'granted', 'denied'");
            }
            zza(zzac.zzb(bundle), i, j);
        }
    }

    public final void zza(zzac zzac, int i, long j) {
        boolean z;
        boolean z2;
        zzac zzac2;
        boolean z3;
        zzac zzac3 = zzac;
        int i2 = i;
        if (zzml.zzb() && zzs().zza(zzas.zzcg)) {
            zzv();
            if ((!zzs().zza(zzas.zzch) || i2 != 20) && zzac.zzb() == null && zzac.zzd() == null) {
                zzq().zzj().zza("Discarding empty consent settings");
                return;
            }
            synchronized (this.zzg) {
                z = true;
                z2 = false;
                if (zzac.zza(i2, this.zzi)) {
                    boolean zza2 = zzac.zza(this.zzh);
                    if (zzac.zze() && !this.zzh.zze()) {
                        z2 = true;
                    }
                    zzac zzc2 = zzac.zzc(this.zzh);
                    this.zzh = zzc2;
                    this.zzi = i2;
                    boolean z4 = zza2;
                    zzac2 = zzc2;
                    z3 = z2;
                    z2 = z4;
                } else {
                    zzac2 = zzac3;
                    z3 = false;
                    z = false;
                }
            }
            if (!z) {
                zzq().zzu().zza("Ignoring lower-priority consent settings, proposed settings", zzac2);
                return;
            }
            long andIncrement = this.zzj.getAndIncrement();
            if (z2) {
                zza((String) null);
                zzp().zzb((Runnable) new zzhx(this, zzac2, j, i, andIncrement, z3));
            } else if (!zzs().zza(zzas.zzch) || !(i2 == 40 || i2 == 20)) {
                zzp().zza((Runnable) new zzhz(this, zzac2, i, andIncrement, z3));
            } else {
                zzp().zzb((Runnable) new zzhw(this, zzac2, i, andIncrement, z3));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzac zzac) {
        zzc();
        boolean z = (zzac.zze() && zzac.zzc()) || zzg().zzai();
        if (z != this.zzy.zzac()) {
            this.zzy.zzb(z);
            Boolean zzv = zzr().zzv();
            if (!z || zzv == null || zzv.booleanValue()) {
                zza(Boolean.valueOf(z), false);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void zza(Boolean bool, boolean z) {
        zzc();
        zzv();
        zzq().zzv().zza("Setting app measurement enabled (FE)", bool);
        zzr().zza(bool);
        if (zzml.zzb() && zzs().zza(zzas.zzcg) && z) {
            zzr().zzb(bool);
        }
        if (!zzml.zzb() || !zzs().zza(zzas.zzcg) || this.zzy.zzac() || !bool.booleanValue()) {
            zzal();
        }
    }

    /* access modifiers changed from: private */
    public final void zza(zzac zzac, int i, long j, boolean z, boolean z2) {
        zzc();
        zzv();
        if (j <= this.zzk && zzac.zza(this.zzl, i)) {
            zzq().zzu().zza("Dropped out-of-date consent setting, proposed settings", zzac);
        } else if (zzr().zza(zzac, i)) {
            this.zzk = j;
            this.zzl = i;
            zzg().zza(z);
            if (z2) {
                zzg().zza((AtomicReference<String>) new AtomicReference());
            }
        } else {
            zzq().zzu().zza("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: private */
    public final void zzal() {
        zzc();
        String zza2 = zzr().zzn.zza();
        if (zza2 != null) {
            if ("unset".equals(zza2)) {
                zza(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "_npa", (Object) null, zzl().currentTimeMillis());
            } else {
                zza(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "_npa", (Object) Long.valueOf("true".equals(zza2) ? 1 : 0), zzl().currentTimeMillis());
            }
        }
        if (!this.zzy.zzaa() || !this.zzm) {
            zzq().zzv().zza("Updating Scion state (FE)");
            zzg().zzab();
            return;
        }
        zzq().zzv().zza("Recording app launch after enabling measurement for the first time (FE)");
        zzah();
        if (zznj.zzb() && zzs().zza(zzas.zzbp)) {
            zzj().zza.zza();
        }
        if (zzmy.zzb() && zzs().zza(zzas.zzbs)) {
            if (!(this.zzy.zze().zza.zzb().zzi.zza() > 0)) {
                zzfl zze2 = this.zzy.zze();
                zze2.zza(zze2.zza.zzm().getPackageName());
            }
        }
        if (zzs().zza(zzas.zzcc)) {
            zzp().zza((Runnable) new zzhe(this));
        }
    }

    public final void zza(String str, String str2, Bundle bundle) {
        zza(str, str2, bundle, true, true, zzl().currentTimeMillis());
    }

    /* access modifiers changed from: package-private */
    public final void zzb(String str, String str2, Bundle bundle) {
        zzc();
        zza(str, str2, zzl().currentTimeMillis(), bundle);
    }

    /* access modifiers changed from: package-private */
    public final void zza(String str, String str2, long j, Bundle bundle) {
        zzc();
        zza(str, str2, j, bundle, true, this.zzc == null || zzkv.zzd(str2), false, (String) null);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x043a  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x04af  */
    /* JADX WARNING: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(java.lang.String r20, java.lang.String r21, long r22, android.os.Bundle r24, boolean r25, boolean r26, boolean r27, java.lang.String r28) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r15 = r21
            r13 = r22
            r12 = r24
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r20)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r24)
            r19.zzc()
            r19.zzv()
            com.google.android.gms.measurement.internal.zzfu r0 = r7.zzy
            boolean r0 = r0.zzaa()
            if (r0 != 0) goto L_0x002c
            com.google.android.gms.measurement.internal.zzeq r0 = r19.zzq()
            com.google.android.gms.measurement.internal.zzes r0 = r0.zzv()
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.zza(r1)
            return
        L_0x002c:
            com.google.android.gms.measurement.internal.zzen r0 = r19.zzf()
            java.util.List r0 = r0.zzag()
            if (r0 == 0) goto L_0x004a
            boolean r0 = r0.contains(r15)
            if (r0 != 0) goto L_0x004a
            com.google.android.gms.measurement.internal.zzeq r0 = r19.zzq()
            com.google.android.gms.measurement.internal.zzes r0 = r0.zzv()
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            r0.zza(r1, r15, r8)
            return
        L_0x004a:
            boolean r0 = r7.zze
            r11 = 0
            r10 = 0
            r9 = 1
            if (r0 != 0) goto L_0x00a2
            r7.zze = r9
            com.google.android.gms.measurement.internal.zzfu r0 = r7.zzy     // Catch:{ ClassNotFoundException -> 0x0095 }
            boolean r0 = r0.zzs()     // Catch:{ ClassNotFoundException -> 0x0095 }
            java.lang.String r1 = "com.google.android.gms.tagmanager.TagManagerService"
            if (r0 != 0) goto L_0x006a
            android.content.Context r0 = r19.zzm()     // Catch:{ ClassNotFoundException -> 0x0095 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0095 }
            java.lang.Class r0 = java.lang.Class.forName(r1, r9, r0)     // Catch:{ ClassNotFoundException -> 0x0095 }
            goto L_0x006e
        L_0x006a:
            java.lang.Class r0 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0095 }
        L_0x006e:
            java.lang.String r1 = "initialize"
            java.lang.Class[] r2 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x0086 }
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r10] = r3     // Catch:{ Exception -> 0x0086 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch:{ Exception -> 0x0086 }
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0086 }
            android.content.Context r2 = r19.zzm()     // Catch:{ Exception -> 0x0086 }
            r1[r10] = r2     // Catch:{ Exception -> 0x0086 }
            r0.invoke(r11, r1)     // Catch:{ Exception -> 0x0086 }
            goto L_0x00a2
        L_0x0086:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzeq r1 = r19.zzq()     // Catch:{ ClassNotFoundException -> 0x0095 }
            com.google.android.gms.measurement.internal.zzes r1 = r1.zzh()     // Catch:{ ClassNotFoundException -> 0x0095 }
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.zza(r2, r0)     // Catch:{ ClassNotFoundException -> 0x0095 }
            goto L_0x00a2
        L_0x0095:
            com.google.android.gms.measurement.internal.zzeq r0 = r19.zzq()
            com.google.android.gms.measurement.internal.zzes r0 = r0.zzu()
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            r0.zza(r1)
        L_0x00a2:
            com.google.android.gms.measurement.internal.zzab r0 = r19.zzs()
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.zzas.zzbd
            boolean r0 = r0.zza((com.google.android.gms.measurement.internal.zzej<java.lang.Boolean>) r1)
            if (r0 == 0) goto L_0x00d3
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00d3
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x00d3
            java.lang.String r4 = r12.getString(r0)
            com.google.android.gms.common.util.Clock r0 = r19.zzl()
            long r5 = r0.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_lgclid"
            r1 = r19
            r1.zza((java.lang.String) r2, (java.lang.String) r3, (java.lang.Object) r4, (long) r5)
        L_0x00d3:
            boolean r0 = com.google.android.gms.internal.measurement.zznw.zzb()
            if (r0 == 0) goto L_0x00fe
            com.google.android.gms.measurement.internal.zzab r0 = r19.zzs()
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.zzas.zzby
            boolean r0 = r0.zza((com.google.android.gms.measurement.internal.zzej<java.lang.Boolean>) r1)
            if (r0 == 0) goto L_0x00fe
            if (r25 == 0) goto L_0x00fe
            boolean r0 = com.google.android.gms.measurement.internal.zzkv.zzf(r21)
            if (r0 == 0) goto L_0x00fe
            com.google.android.gms.measurement.internal.zzkv r0 = r19.zzo()
            com.google.android.gms.measurement.internal.zzfc r1 = r19.zzr()
            com.google.android.gms.measurement.internal.zzfh r1 = r1.zzx
            android.os.Bundle r1 = r1.zza()
            r0.zza((android.os.Bundle) r12, (android.os.Bundle) r1)
        L_0x00fe:
            r0 = 40
            if (r27 == 0) goto L_0x0191
            java.lang.String r1 = "_iap"
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x0191
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzy
            com.google.android.gms.measurement.internal.zzkv r1 = r1.zzh()
            boolean r2 = com.google.android.gms.internal.measurement.zzlo.zzb()
            if (r2 == 0) goto L_0x0124
            com.google.android.gms.measurement.internal.zzab r2 = r19.zzs()
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.zzas.zzck
            boolean r2 = r2.zza((com.google.android.gms.measurement.internal.zzej<java.lang.Boolean>) r3)
            if (r2 == 0) goto L_0x0124
            r2 = 1
            goto L_0x0125
        L_0x0124:
            r2 = 0
        L_0x0125:
            java.lang.String r3 = "event"
            boolean r4 = r1.zza((java.lang.String) r3, (java.lang.String) r15)
            r5 = 13
            r6 = 2
            if (r4 != 0) goto L_0x0131
            goto L_0x0151
        L_0x0131:
            if (r2 == 0) goto L_0x013e
            java.lang.String[] r2 = com.google.android.gms.measurement.internal.zzgv.zza
            java.lang.String[] r4 = com.google.android.gms.measurement.internal.zzgv.zzb
            boolean r2 = r1.zza((java.lang.String) r3, (java.lang.String[]) r2, (java.lang.String[]) r4, (java.lang.String) r15)
            if (r2 != 0) goto L_0x0149
            goto L_0x0146
        L_0x013e:
            java.lang.String[] r2 = com.google.android.gms.measurement.internal.zzgv.zza
            boolean r2 = r1.zza((java.lang.String) r3, (java.lang.String[]) r2, (java.lang.String) r15)
            if (r2 != 0) goto L_0x0149
        L_0x0146:
            r6 = 13
            goto L_0x0151
        L_0x0149:
            boolean r1 = r1.zza((java.lang.String) r3, (int) r0, (java.lang.String) r15)
            if (r1 != 0) goto L_0x0150
            goto L_0x0151
        L_0x0150:
            r6 = 0
        L_0x0151:
            if (r6 == 0) goto L_0x0191
            com.google.android.gms.measurement.internal.zzeq r1 = r19.zzq()
            com.google.android.gms.measurement.internal.zzes r1 = r1.zzg()
            com.google.android.gms.measurement.internal.zzeo r2 = r19.zzn()
            java.lang.String r2 = r2.zza((java.lang.String) r15)
            java.lang.String r3 = "Invalid public event name. Event will not be logged (FE)"
            r1.zza(r3, r2)
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzy
            r1.zzh()
            java.lang.String r0 = com.google.android.gms.measurement.internal.zzkv.zza((java.lang.String) r15, (int) r0, (boolean) r9)
            if (r15 == 0) goto L_0x0177
            int r10 = r21.length()
        L_0x0177:
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzy
            com.google.android.gms.measurement.internal.zzkv r1 = r1.zzh()
            com.google.android.gms.measurement.internal.zzky r2 = r7.zzn
            java.lang.String r3 = "_ev"
            r20 = r1
            r21 = r2
            r22 = r6
            r23 = r3
            r24 = r0
            r25 = r10
            r20.zza((com.google.android.gms.measurement.internal.zzky) r21, (int) r22, (java.lang.String) r23, (java.lang.String) r24, (int) r25)
            return
        L_0x0191:
            com.google.android.gms.measurement.internal.zzii r1 = r19.zzh()
            com.google.android.gms.measurement.internal.zzij r1 = r1.zza((boolean) r10)
            java.lang.String r2 = "_sc"
            if (r1 == 0) goto L_0x01a5
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L_0x01a5
            r1.zzd = r9
        L_0x01a5:
            if (r25 == 0) goto L_0x01ab
            if (r27 == 0) goto L_0x01ab
            r3 = 1
            goto L_0x01ac
        L_0x01ab:
            r3 = 0
        L_0x01ac:
            com.google.android.gms.measurement.internal.zzii.zza((com.google.android.gms.measurement.internal.zzij) r1, (android.os.Bundle) r12, (boolean) r3)
            java.lang.String r1 = "am"
            boolean r16 = r1.equals(r8)
            boolean r1 = com.google.android.gms.measurement.internal.zzkv.zzd(r21)
            if (r25 == 0) goto L_0x01ee
            com.google.android.gms.measurement.internal.zzgw r3 = r7.zzc
            if (r3 == 0) goto L_0x01ee
            if (r1 != 0) goto L_0x01ee
            if (r16 != 0) goto L_0x01ee
            com.google.android.gms.measurement.internal.zzeq r0 = r19.zzq()
            com.google.android.gms.measurement.internal.zzes r0 = r0.zzv()
            com.google.android.gms.measurement.internal.zzeo r1 = r19.zzn()
            java.lang.String r1 = r1.zza((java.lang.String) r15)
            com.google.android.gms.measurement.internal.zzeo r2 = r19.zzn()
            java.lang.String r2 = r2.zza((android.os.Bundle) r12)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r0.zza(r3, r1, r2)
            com.google.android.gms.measurement.internal.zzgw r1 = r7.zzc
            r2 = r20
            r3 = r21
            r4 = r24
            r5 = r22
            r1.interceptEvent(r2, r3, r4, r5)
            return
        L_0x01ee:
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzy
            boolean r1 = r1.zzaf()
            if (r1 != 0) goto L_0x01f7
            return
        L_0x01f7:
            com.google.android.gms.measurement.internal.zzkv r1 = r19.zzo()
            boolean r3 = com.google.android.gms.internal.measurement.zzlo.zzb()
            if (r3 == 0) goto L_0x020f
            com.google.android.gms.measurement.internal.zzab r3 = r19.zzs()
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.zzas.zzck
            boolean r3 = r3.zza((com.google.android.gms.measurement.internal.zzej<java.lang.Boolean>) r4)
            if (r3 == 0) goto L_0x020f
            r3 = 1
            goto L_0x0210
        L_0x020f:
            r3 = 0
        L_0x0210:
            int r1 = r1.zza((java.lang.String) r15, (boolean) r3)
            if (r1 == 0) goto L_0x0254
            com.google.android.gms.measurement.internal.zzeq r2 = r19.zzq()
            com.google.android.gms.measurement.internal.zzes r2 = r2.zzg()
            com.google.android.gms.measurement.internal.zzeo r3 = r19.zzn()
            java.lang.String r3 = r3.zza((java.lang.String) r15)
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            r2.zza(r4, r3)
            r19.zzo()
            java.lang.String r0 = com.google.android.gms.measurement.internal.zzkv.zza((java.lang.String) r15, (int) r0, (boolean) r9)
            if (r15 == 0) goto L_0x0238
            int r10 = r21.length()
        L_0x0238:
            com.google.android.gms.measurement.internal.zzfu r2 = r7.zzy
            com.google.android.gms.measurement.internal.zzkv r2 = r2.zzh()
            com.google.android.gms.measurement.internal.zzky r3 = r7.zzn
            java.lang.String r4 = "_ev"
            r20 = r2
            r21 = r3
            r22 = r28
            r23 = r1
            r24 = r4
            r25 = r0
            r26 = r10
            r20.zza((com.google.android.gms.measurement.internal.zzky) r21, (java.lang.String) r22, (int) r23, (java.lang.String) r24, (java.lang.String) r25, (int) r26)
            return
        L_0x0254:
            java.lang.String r0 = "_sn"
            java.lang.String r5 = "_o"
            java.lang.String r1 = "_si"
            java.lang.String[] r3 = new java.lang.String[]{r5, r0, r2, r1}
            java.util.List r3 = com.google.android.gms.common.util.CollectionUtils.listOf((T[]) r3)
            com.google.android.gms.measurement.internal.zzkv r4 = r19.zzo()
            r6 = 1
            r9 = r4
            r4 = 0
            r10 = r28
            r17 = r11
            r11 = r21
            r12 = r24
            r13 = r3
            r14 = r27
            r3 = r15
            r15 = r6
            android.os.Bundle r9 = r9.zza((java.lang.String) r10, (java.lang.String) r11, (android.os.Bundle) r12, (java.util.List<java.lang.String>) r13, (boolean) r14, (boolean) r15)
            if (r9 == 0) goto L_0x02a2
            boolean r6 = r9.containsKey(r2)
            if (r6 == 0) goto L_0x02a2
            boolean r6 = r9.containsKey(r1)
            if (r6 != 0) goto L_0x0289
            goto L_0x02a2
        L_0x0289:
            java.lang.String r0 = r9.getString(r0)
            java.lang.String r2 = r9.getString(r2)
            long r10 = r9.getLong(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            com.google.android.gms.measurement.internal.zzij r6 = new com.google.android.gms.measurement.internal.zzij
            long r10 = r1.longValue()
            r6.<init>(r0, r2, r10)
        L_0x02a2:
            com.google.android.gms.measurement.internal.zzab r0 = r19.zzs()
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.zzas.zzas
            boolean r0 = r0.zza((com.google.android.gms.measurement.internal.zzej<java.lang.Boolean>) r1)
            java.lang.String r10 = "_ae"
            r11 = 0
            if (r0 == 0) goto L_0x02d7
            com.google.android.gms.measurement.internal.zzii r0 = r19.zzh()
            com.google.android.gms.measurement.internal.zzij r0 = r0.zza((boolean) r4)
            if (r0 == 0) goto L_0x02d7
            boolean r0 = r10.equals(r3)
            if (r0 == 0) goto L_0x02d7
            com.google.android.gms.measurement.internal.zzjx r0 = r19.zzj()
            com.google.android.gms.measurement.internal.zzkd r0 = r0.zzb
            long r0 = r0.zzb()
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x02d7
            com.google.android.gms.measurement.internal.zzkv r2 = r19.zzo()
            r2.zza((android.os.Bundle) r9, (long) r0)
        L_0x02d7:
            boolean r0 = com.google.android.gms.internal.measurement.zzms.zzb()
            if (r0 == 0) goto L_0x035b
            com.google.android.gms.measurement.internal.zzab r0 = r19.zzs()
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.zzas.zzbo
            boolean r0 = r0.zza((com.google.android.gms.measurement.internal.zzej<java.lang.Boolean>) r1)
            if (r0 == 0) goto L_0x035b
            java.lang.String r0 = "auto"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x033c
            java.lang.String r0 = "_ssr"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x033c
            com.google.android.gms.measurement.internal.zzkv r0 = r19.zzo()
            java.lang.String r1 = "_ffr"
            java.lang.String r1 = r9.getString(r1)
            boolean r2 = com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(r1)
            if (r2 == 0) goto L_0x030c
            r1 = r17
            goto L_0x0310
        L_0x030c:
            java.lang.String r1 = r1.trim()
        L_0x0310:
            com.google.android.gms.measurement.internal.zzfc r2 = r0.zzr()
            com.google.android.gms.measurement.internal.zzfi r2 = r2.zzu
            java.lang.String r2 = r2.zza()
            boolean r2 = com.google.android.gms.measurement.internal.zzkv.zzc((java.lang.String) r1, (java.lang.String) r2)
            if (r2 == 0) goto L_0x032f
            com.google.android.gms.measurement.internal.zzeq r0 = r0.zzq()
            com.google.android.gms.measurement.internal.zzes r0 = r0.zzv()
            java.lang.String r1 = "Not logging duplicate session_start_with_rollout event"
            r0.zza(r1)
            r0 = 0
            goto L_0x0339
        L_0x032f:
            com.google.android.gms.measurement.internal.zzfc r0 = r0.zzr()
            com.google.android.gms.measurement.internal.zzfi r0 = r0.zzu
            r0.zza(r1)
            r0 = 1
        L_0x0339:
            if (r0 != 0) goto L_0x035b
            return
        L_0x033c:
            boolean r0 = r10.equals(r3)
            if (r0 == 0) goto L_0x035b
            com.google.android.gms.measurement.internal.zzkv r0 = r19.zzo()
            com.google.android.gms.measurement.internal.zzfc r0 = r0.zzr()
            com.google.android.gms.measurement.internal.zzfi r0 = r0.zzu
            java.lang.String r0 = r0.zza()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x035b
            java.lang.String r1 = "_ffr"
            r9.putString(r1, r0)
        L_0x035b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r9)
            com.google.android.gms.measurement.internal.zzkv r1 = r19.zzo()
            java.security.SecureRandom r1 = r1.zzg()
            r1.nextLong()
            com.google.android.gms.measurement.internal.zzfc r1 = r19.zzr()
            com.google.android.gms.measurement.internal.zzfg r1 = r1.zzp
            long r1 = r1.zza()
            int r6 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x03dd
            com.google.android.gms.measurement.internal.zzfc r1 = r19.zzr()
            r13 = r22
            boolean r1 = r1.zza((long) r13)
            if (r1 == 0) goto L_0x03df
            com.google.android.gms.measurement.internal.zzfc r1 = r19.zzr()
            com.google.android.gms.measurement.internal.zzfe r1 = r1.zzr
            boolean r1 = r1.zza()
            if (r1 == 0) goto L_0x03df
            com.google.android.gms.measurement.internal.zzeq r1 = r19.zzq()
            com.google.android.gms.measurement.internal.zzes r1 = r1.zzw()
            java.lang.String r2 = "Current session is expired, remove the session number, ID, and engagement time"
            r1.zza(r2)
            r6 = 0
            com.google.android.gms.common.util.Clock r1 = r19.zzl()
            long r17 = r1.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r15 = "_sid"
            r1 = r19
            r3 = r15
            r15 = 0
            r4 = r6
            r15 = r5
            r5 = r17
            r1.zza((java.lang.String) r2, (java.lang.String) r3, (java.lang.Object) r4, (long) r5)
            r4 = 0
            com.google.android.gms.common.util.Clock r1 = r19.zzl()
            long r5 = r1.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sno"
            r1 = r19
            r1.zza((java.lang.String) r2, (java.lang.String) r3, (java.lang.Object) r4, (long) r5)
            com.google.android.gms.common.util.Clock r1 = r19.zzl()
            long r5 = r1.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_se"
            r1 = r19
            r1.zza((java.lang.String) r2, (java.lang.String) r3, (java.lang.Object) r4, (long) r5)
            goto L_0x03e0
        L_0x03dd:
            r13 = r22
        L_0x03df:
            r15 = r5
        L_0x03e0:
            java.lang.String r1 = "extend_session"
            long r1 = r9.getLong(r1, r11)
            r3 = 1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0406
            com.google.android.gms.measurement.internal.zzeq r1 = r19.zzq()
            com.google.android.gms.measurement.internal.zzes r1 = r1.zzw()
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzy
            com.google.android.gms.measurement.internal.zzjx r1 = r1.zzd()
            com.google.android.gms.measurement.internal.zzkf r1 = r1.zza
            r11 = 1
            r1.zza(r13, r11)
            goto L_0x0407
        L_0x0406:
            r11 = 1
        L_0x0407:
            java.util.Set r1 = r9.keySet()
            int r2 = r9.size()
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.util.Arrays.sort(r1)
            int r2 = r1.length
            r3 = 0
        L_0x041c:
            if (r3 >= r2) goto L_0x0433
            r4 = r1[r3]
            r19.zzo()
            java.lang.Object r5 = r9.get(r4)
            android.os.Bundle[] r5 = com.google.android.gms.measurement.internal.zzkv.zzb((java.lang.Object) r5)
            if (r5 == 0) goto L_0x0430
            r9.putParcelableArray(r4, r5)
        L_0x0430:
            int r3 = r3 + 1
            goto L_0x041c
        L_0x0433:
            r9 = 0
        L_0x0434:
            int r1 = r0.size()
            if (r9 >= r1) goto L_0x049c
            java.lang.Object r1 = r0.get(r9)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r9 == 0) goto L_0x0444
            r2 = 1
            goto L_0x0445
        L_0x0444:
            r2 = 0
        L_0x0445:
            if (r2 == 0) goto L_0x044a
            java.lang.String r2 = "_ep"
            goto L_0x044c
        L_0x044a:
            r2 = r21
        L_0x044c:
            r1.putString(r15, r8)
            if (r26 == 0) goto L_0x0459
            com.google.android.gms.measurement.internal.zzkv r3 = r19.zzo()
            android.os.Bundle r1 = r3.zza((android.os.Bundle) r1)
        L_0x0459:
            r12 = r1
            com.google.android.gms.measurement.internal.zzaq r5 = new com.google.android.gms.measurement.internal.zzaq
            com.google.android.gms.measurement.internal.zzap r3 = new com.google.android.gms.measurement.internal.zzap
            r3.<init>(r12)
            r1 = r5
            r4 = r20
            r11 = r5
            r5 = r22
            r1.<init>(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.zzir r1 = r19.zzg()
            r5 = r28
            r1.zza((com.google.android.gms.measurement.internal.zzaq) r11, (java.lang.String) r5)
            if (r16 != 0) goto L_0x0498
            java.util.Set<com.google.android.gms.measurement.internal.zzgz> r1 = r7.zzd
            java.util.Iterator r11 = r1.iterator()
        L_0x047b:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0498
            java.lang.Object r1 = r11.next()
            com.google.android.gms.measurement.internal.zzgz r1 = (com.google.android.gms.measurement.internal.zzgz) r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r12)
            r2 = r20
            r3 = r21
            r5 = r22
            r1.onEvent(r2, r3, r4, r5)
            r5 = r28
            goto L_0x047b
        L_0x0498:
            int r9 = r9 + 1
            r11 = 1
            goto L_0x0434
        L_0x049c:
            com.google.android.gms.measurement.internal.zzii r0 = r19.zzh()
            r1 = 0
            com.google.android.gms.measurement.internal.zzij r0 = r0.zza((boolean) r1)
            if (r0 == 0) goto L_0x04bf
            r1 = r21
            boolean r0 = r10.equals(r1)
            if (r0 == 0) goto L_0x04bf
            com.google.android.gms.measurement.internal.zzjx r0 = r19.zzj()
            com.google.android.gms.common.util.Clock r1 = r19.zzl()
            long r1 = r1.elapsedRealtime()
            r3 = 1
            r0.zza(r3, r3, r1)
        L_0x04bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhb.zza(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    public final void zza(String str, String str2, Bundle bundle, String str3) {
        zza();
        zzb(str, str2, zzl().currentTimeMillis(), bundle, false, true, false, str3);
    }

    public final void zza(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        String str3 = str == null ? GCMConstants.EXTRA_APPLICATION_PENDING_INTENT : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (zzs().zza(zzas.zzbu)) {
            String str4 = str2;
            if (zzkv.zzc(str2, FirebaseAnalytics.Event.SCREEN_VIEW)) {
                zzh().zza(bundle2, j);
                return;
            }
        } else {
            String str5 = str2;
        }
        long j2 = j;
        zzb(str3, str2, j, bundle2, z2, !z2 || this.zzc == null || zzkv.zzd(str2), !z, (String) null);
    }

    private final void zzb(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        zzp().zza((Runnable) new zzhj(this, str, str2, j, zzkv.zzb(bundle), z, z2, z3, str3));
    }

    public final void zza(String str, String str2, Object obj, boolean z) {
        zza(str, str2, obj, true, zzl().currentTimeMillis());
    }

    public final void zza(String str, String str2, Object obj, boolean z, long j) {
        int i;
        int i2;
        if (str == null) {
            str = GCMConstants.EXTRA_APPLICATION_PENDING_INTENT;
        }
        String str3 = str;
        if (z) {
            i = zzo().zzb(str2);
        } else {
            zzkv zzo = zzo();
            if (zzo.zza("user property", str2)) {
                if (!zzo.zza("user property", zzgx.zza, str2)) {
                    i = 15;
                } else if (zzo.zza("user property", 24, str2)) {
                    i = 0;
                }
            }
            i = 6;
        }
        if (i != 0) {
            zzo();
            this.zzy.zzh().zza(this.zzn, i, "_ev", zzkv.zza(str2, 24, true), str2 != null ? str2.length() : 0);
        } else if (obj != null) {
            int zzb2 = zzo().zzb(str2, obj);
            if (zzb2 != 0) {
                zzo();
                String zza2 = zzkv.zza(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i2 = String.valueOf(obj).length();
                } else {
                    i2 = 0;
                }
                this.zzy.zzh().zza(this.zzn, zzb2, "_ev", zza2, i2);
                return;
            }
            Object zzc2 = zzo().zzc(str2, obj);
            if (zzc2 != null) {
                zza(str3, str2, j, zzc2);
            }
        } else {
            zza(str3, str2, j, (Object) null);
        }
    }

    private final void zza(String str, String str2, long j, Object obj) {
        zzp().zza((Runnable) new zzhi(this, str, str2, obj, j));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)
            r8.zzc()
            r8.zzv()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L_0x0063
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x0053
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0053
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L_0x0035
            r4 = r2
            goto L_0x0037
        L_0x0035:
            r4 = 0
        L_0x0037:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.zzfc r0 = r8.zzr()
            com.google.android.gms.measurement.internal.zzfi r0 = r0.zzn
            r4 = r10
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x004e
            java.lang.String r11 = "true"
        L_0x004e:
            r0.zza(r11)
            r6 = r10
            goto L_0x0061
        L_0x0053:
            if (r11 != 0) goto L_0x0063
            com.google.android.gms.measurement.internal.zzfc r10 = r8.zzr()
            com.google.android.gms.measurement.internal.zzfi r10 = r10.zzn
            java.lang.String r0 = "unset"
            r10.zza(r0)
            r6 = r11
        L_0x0061:
            r3 = r1
            goto L_0x0065
        L_0x0063:
            r3 = r10
            r6 = r11
        L_0x0065:
            com.google.android.gms.measurement.internal.zzfu r10 = r8.zzy
            boolean r10 = r10.zzaa()
            if (r10 != 0) goto L_0x007b
            com.google.android.gms.measurement.internal.zzeq r9 = r8.zzq()
            com.google.android.gms.measurement.internal.zzes r9 = r9.zzw()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.zza(r10)
            return
        L_0x007b:
            com.google.android.gms.measurement.internal.zzfu r10 = r8.zzy
            boolean r10 = r10.zzaf()
            if (r10 != 0) goto L_0x0084
            return
        L_0x0084:
            com.google.android.gms.measurement.internal.zzku r10 = new com.google.android.gms.measurement.internal.zzku
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.zzir r9 = r8.zzg()
            r9.zza((com.google.android.gms.measurement.internal.zzku) r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhb.zza(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final List<zzku> zza(boolean z) {
        zzv();
        zzq().zzw().zza("Getting user properties (FE)");
        if (zzp().zzf()) {
            zzq().zze().zza("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        } else if (zzw.zza()) {
            zzq().zze().zza("Cannot get all user properties from main thread");
            return Collections.emptyList();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.zzy.zzp().zza(atomicReference, 5000, "get user properties", new zzhl(this, atomicReference, z));
            List<zzku> list = (List) atomicReference.get();
            if (list != null) {
                return list;
            }
            zzq().zze().zza("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyList();
        }
    }

    public final String zzag() {
        return this.zzf.get();
    }

    /* access modifiers changed from: package-private */
    public final void zza(String str) {
        this.zzf.set(str);
    }

    /* access modifiers changed from: package-private */
    public final void zza(long j, boolean z) {
        zzc();
        zzv();
        zzq().zzv().zza("Resetting analytics data (FE)");
        zzjx zzj2 = zzj();
        zzj2.zzc();
        zzj2.zzb.zza();
        boolean zzaa = this.zzy.zzaa();
        zzfc zzr = zzr();
        zzr.zzh.zza(j);
        if (!TextUtils.isEmpty(zzr.zzr().zzu.zza())) {
            zzr.zzu.zza((String) null);
        }
        if (zznj.zzb() && zzr.zzs().zza(zzas.zzbp)) {
            zzr.zzp.zza(0);
        }
        if (!zzr.zzs().zzf()) {
            zzr.zzb(!zzaa);
        }
        zzr.zzv.zza((String) null);
        zzr.zzw.zza(0);
        zzr.zzx.zza((Bundle) null);
        if (z) {
            zzg().zzac();
        }
        if (zznj.zzb() && zzs().zza(zzas.zzbp)) {
            zzj().zza.zza();
        }
        this.zzm = !zzaa;
    }

    public final void zzah() {
        zzc();
        zzv();
        if (this.zzy.zzaf()) {
            if (zzs().zza(zzas.zzbc)) {
                Boolean zzf2 = zzs().zzf("google_analytics_deferred_deep_link_enabled");
                if (zzf2 != null && zzf2.booleanValue()) {
                    zzq().zzv().zza("Deferred Deep Link feature enabled.");
                    zzp().zza((Runnable) new zzhd(this));
                }
            }
            zzg().zzad();
            this.zzm = false;
            String zzy = zzr().zzy();
            if (!TextUtils.isEmpty(zzy)) {
                zzk().zzab();
                if (!zzy.equals(Build.VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", zzy);
                    zza("auto", "_ou", bundle);
                }
            }
        }
    }

    public final void zza(zzgw zzgw) {
        zzgw zzgw2;
        zzc();
        zzv();
        if (!(zzgw == null || zzgw == (zzgw2 = this.zzc))) {
            Preconditions.checkState(zzgw2 == null, "EventInterceptor already set.");
        }
        this.zzc = zzgw;
    }

    public final void zza(zzgz zzgz) {
        zzv();
        Preconditions.checkNotNull(zzgz);
        if (!this.zzd.add(zzgz)) {
            zzq().zzh().zza("OnEventListener already registered");
        }
    }

    public final void zzb(zzgz zzgz) {
        zzv();
        Preconditions.checkNotNull(zzgz);
        if (!this.zzd.remove(zzgz)) {
            zzq().zzh().zza("OnEventListener had not been registered");
        }
    }

    public final void zza(Bundle bundle) {
        zza(bundle, zzl().currentTimeMillis());
    }

    public final void zza(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            zzq().zzh().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzgs.zza(bundle2, "app_id", String.class, null);
        zzgs.zza(bundle2, "origin", String.class, null);
        zzgs.zza(bundle2, "name", String.class, null);
        zzgs.zza(bundle2, "value", Object.class, null);
        zzgs.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzgs.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzgs.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzgs.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzgs.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzgs.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzgs.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzgs.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzgs.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (zzo().zzb(string) != 0) {
            zzq().zze().zza("Invalid conditional user property name", zzn().zzc(string));
        } else if (zzo().zzb(string, obj) != 0) {
            zzq().zze().zza("Invalid conditional user property value", zzn().zzc(string), obj);
        } else {
            Object zzc2 = zzo().zzc(string, obj);
            if (zzc2 == null) {
                zzq().zze().zza("Unable to normalize conditional user property value", zzn().zzc(string), obj);
                return;
            }
            zzgs.zza(bundle2, zzc2);
            long j2 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
            if (TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME)) || (j2 <= 15552000000L && j2 >= 1)) {
                long j3 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
                if (j3 > 15552000000L || j3 < 1) {
                    zzq().zze().zza("Invalid conditional user property time to live", zzn().zzc(string), Long.valueOf(j3));
                } else {
                    zzp().zza((Runnable) new zzhn(this, bundle2));
                }
            } else {
                zzq().zze().zza("Invalid conditional user property timeout", zzn().zzc(string), Long.valueOf(j2));
            }
        }
    }

    public final void zzc(String str, String str2, Bundle bundle) {
        long currentTimeMillis = zzl().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, currentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        zzp().zza((Runnable) new zzhp(this, bundle2));
    }

    /* access modifiers changed from: private */
    public final void zzc(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzc();
        zzv();
        Preconditions.checkNotNull(bundle);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        if (!this.zzy.zzaa()) {
            zzq().zzw().zza("Conditional property not set since app measurement is disabled");
            return;
        }
        try {
            zzg().zza(new zzz(bundle2.getString("app_id"), bundle2.getString("origin"), new zzku(bundle2.getString("name"), bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP), bundle2.get("value"), bundle2.getString("origin")), bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), false, bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), zzo().zza(bundle2.getString("app_id"), bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME), bundle2.getBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS), bundle2.getString("origin"), 0, true, false, zzlo.zzb() && zzs().zza(zzas.zzck)), bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), zzo().zza(bundle2.getString("app_id"), bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME), bundle2.getBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS), bundle2.getString("origin"), 0, true, false, zzlo.zzb() && zzs().zza(zzas.zzck)), bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzo().zza(bundle2.getString("app_id"), bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle2.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), bundle2.getString("origin"), 0, true, false, zzlo.zzb() && zzs().zza(zzas.zzck))));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* access modifiers changed from: private */
    public final void zzd(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzc();
        zzv();
        Preconditions.checkNotNull(bundle);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        if (!this.zzy.zzaa()) {
            zzq().zzw().zza("Conditional property not cleared since app measurement is disabled");
            return;
        }
        zzku zzku = new zzku(bundle2.getString("name"), 0, (Object) null, (String) null);
        try {
            zzg().zza(new zzz(bundle2.getString("app_id"), bundle2.getString("origin"), zzku, bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), bundle2.getBoolean("active"), bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), (zzaq) null, bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), (zzaq) null, bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzo().zza(bundle2.getString("app_id"), bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle2.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), bundle2.getString("origin"), bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), true, false, zzlo.zzb() && zzs().zza(zzas.zzck))));
        } catch (IllegalArgumentException unused) {
        }
    }

    public final ArrayList<Bundle> zza(String str, String str2) {
        if (zzp().zzf()) {
            zzq().zze().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        } else if (zzw.zza()) {
            zzq().zze().zza("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.zzy.zzp().zza(atomicReference, 5000, "get conditional user properties", new zzho(this, atomicReference, (String) null, str, str2));
            List list = (List) atomicReference.get();
            if (list != null) {
                return zzkv.zzb((List<zzz>) list);
            }
            zzq().zze().zza("Timed out waiting for get conditional user properties", (Object) null);
            return new ArrayList<>();
        }
    }

    public final Map<String, Object> zza(String str, String str2, boolean z) {
        if (zzp().zzf()) {
            zzq().zze().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (zzw.zza()) {
            zzq().zze().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.zzy.zzp().zza(atomicReference, 5000, "get user properties", new zzhr(this, atomicReference, (String) null, str, str2, z));
            List<zzku> list = (List) atomicReference.get();
            if (list == null) {
                zzq().zze().zza("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                return Collections.emptyMap();
            }
            ArrayMap arrayMap = new ArrayMap(list.size());
            for (zzku zzku : list) {
                arrayMap.put(zzku.zza, zzku.zza());
            }
            return arrayMap;
        }
    }

    public final String zzai() {
        zzij zzaa = this.zzy.zzu().zzaa();
        if (zzaa != null) {
            return zzaa.zza;
        }
        return null;
    }

    public final String zzaj() {
        zzij zzaa = this.zzy.zzu().zzaa();
        if (zzaa != null) {
            return zzaa.zzb;
        }
        return null;
    }

    public final String zzak() {
        if (this.zzy.zzn() != null) {
            return this.zzy.zzn();
        }
        try {
            return zzig.zza(zzm(), "google_app_id");
        } catch (IllegalStateException e) {
            this.zzy.zzq().zze().zza("getGoogleAppId failed with exception", e);
            return null;
        }
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

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Bundle bundle) {
        if (zznw.zzb() && zzs().zza(zzas.zzby)) {
            if (bundle == null) {
                zzr().zzx.zza(new Bundle());
                return;
            }
            Bundle zza2 = zzr().zzx.zza();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    zzo();
                    if (zzkv.zza(obj)) {
                        zzo().zza(this.zzn, 27, (String) null, (String) null, 0);
                    }
                    zzq().zzj().zza("Invalid default event parameter type. Name, value", str, obj);
                } else if (zzkv.zzd(str)) {
                    zzq().zzj().zza("Invalid default event parameter name. Name", str);
                } else if (obj == null) {
                    zza2.remove(str);
                } else if (zzo().zza("param", str, 100, obj)) {
                    zzo().zza(zza2, str, obj);
                }
            }
            zzo();
            if (zzkv.zza(zza2, zzs().zzd())) {
                zzo().zza(this.zzn, 26, (String) null, (String) null, 0);
                zzq().zzj().zza("Too many default event parameters set. Discarding beyond event parameter limit");
            }
            zzr().zzx.zza(zza2);
            zzg().zza(zza2);
        }
    }
}
