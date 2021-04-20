package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import androidx.work.WorkRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzae;
import com.google.android.gms.internal.measurement.zzca;
import com.google.android.gms.internal.measurement.zzcd;
import com.google.android.gms.internal.measurement.zzhy;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzml;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.internal.measurement.zznw;
import com.google.firebase.messaging.Constants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
public class zzkl implements zzgt {
    private static volatile zzkl zza;
    private final zzky zzaa;
    private zzfo zzb;
    private zzex zzc;
    private zzaf zzd;
    private zzfa zze;
    private zzkh zzf;
    private zzr zzg;
    private final zzkr zzh;
    private zzih zzi;
    private zzjr zzj;
    /* access modifiers changed from: private */
    public final zzfu zzk;
    private boolean zzl;
    private boolean zzm;
    private long zzn;
    private List<Runnable> zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private FileLock zzu;
    private FileChannel zzv;
    private List<Long> zzw;
    private List<Long> zzx;
    private long zzy;
    private final Map<String, zzac> zzz;

    /* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    private class zza implements zzah {
        zzcd.zzg zza;
        List<Long> zzb;
        List<zzcd.zzc> zzc;
        private long zzd;

        private zza() {
        }

        public final void zza(zzcd.zzg zzg) {
            Preconditions.checkNotNull(zzg);
            this.zza = zzg;
        }

        public final boolean zza(long j, zzcd.zzc zzc2) {
            Preconditions.checkNotNull(zzc2);
            if (this.zzc == null) {
                this.zzc = new ArrayList();
            }
            if (this.zzb == null) {
                this.zzb = new ArrayList();
            }
            if (this.zzc.size() > 0 && zza(this.zzc.get(0)) != zza(zzc2)) {
                return false;
            }
            long zzbp = this.zzd + ((long) zzc2.zzbp());
            if (zzbp >= ((long) Math.max(0, zzas.zzh.zza(null).intValue()))) {
                return false;
            }
            this.zzd = zzbp;
            this.zzc.add(zzc2);
            this.zzb.add(Long.valueOf(j));
            if (this.zzc.size() >= Math.max(1, zzas.zzi.zza(null).intValue())) {
                return false;
            }
            return true;
        }

        private static long zza(zzcd.zzc zzc2) {
            return ((zzc2.zze() / 1000) / 60) / 60;
        }

        /* synthetic */ zza(zzkl zzkl, zzkk zzkk) {
            this();
        }
    }

    public static zzkl zza(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zza == null) {
            synchronized (zzkl.class) {
                if (zza == null) {
                    zza = new zzkl(new zzks(context));
                }
            }
        }
        return zza;
    }

    private zzkl(zzks zzks) {
        this(zzks, (zzfu) null);
    }

    private zzkl(zzks zzks, zzfu zzfu) {
        this.zzl = false;
        this.zzaa = new zzko(this);
        Preconditions.checkNotNull(zzks);
        this.zzk = zzfu.zza(zzks.zza, (zzae) null, (Long) null);
        this.zzy = -1;
        zzkr zzkr = new zzkr(this);
        zzkr.zzak();
        this.zzh = zzkr;
        zzex zzex = new zzex(this);
        zzex.zzak();
        this.zzc = zzex;
        zzfo zzfo = new zzfo(this);
        zzfo.zzak();
        this.zzb = zzfo;
        this.zzz = new HashMap();
        this.zzk.zzp().zza((Runnable) new zzkk(this, zzks));
    }

    /* access modifiers changed from: private */
    public final void zza(zzks zzks) {
        this.zzk.zzp().zzc();
        zzaf zzaf = new zzaf(this);
        zzaf.zzak();
        this.zzd = zzaf;
        this.zzk.zza().zza((zzad) this.zzb);
        zzjr zzjr = new zzjr(this);
        zzjr.zzak();
        this.zzj = zzjr;
        zzr zzr2 = new zzr(this);
        zzr2.zzak();
        this.zzg = zzr2;
        zzih zzih = new zzih(this);
        zzih.zzak();
        this.zzi = zzih;
        zzkh zzkh = new zzkh(this);
        zzkh.zzak();
        this.zzf = zzkh;
        this.zze = new zzfa(this);
        if (this.zzp != this.zzq) {
            this.zzk.zzq().zze().zza("Not all upload components initialized", Integer.valueOf(this.zzp), Integer.valueOf(this.zzq));
        }
        this.zzl = true;
    }

    /* access modifiers changed from: protected */
    public final void zza() {
        this.zzk.zzp().zzc();
        zze().zzu();
        if (this.zzk.zzb().zzc.zza() == 0) {
            this.zzk.zzb().zzc.zza(this.zzk.zzl().currentTimeMillis());
        }
        zzab();
    }

    public final zzw zzt() {
        return this.zzk.zzt();
    }

    public final zzab zzb() {
        return this.zzk.zza();
    }

    public final zzeq zzq() {
        return this.zzk.zzq();
    }

    public final zzfr zzp() {
        return this.zzk.zzp();
    }

    public final zzfo zzc() {
        zzb((zzki) this.zzb);
        return this.zzb;
    }

    public final zzex zzd() {
        zzb((zzki) this.zzc);
        return this.zzc;
    }

    public final zzaf zze() {
        zzb((zzki) this.zzd);
        return this.zzd;
    }

    private final zzfa zzv() {
        zzfa zzfa = this.zze;
        if (zzfa != null) {
            return zzfa;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private final zzkh zzw() {
        zzb((zzki) this.zzf);
        return this.zzf;
    }

    public final zzr zzf() {
        zzb((zzki) this.zzg);
        return this.zzg;
    }

    public final zzih zzg() {
        zzb((zzki) this.zzi);
        return this.zzi;
    }

    public final zzkr zzh() {
        zzb((zzki) this.zzh);
        return this.zzh;
    }

    public final zzjr zzi() {
        return this.zzj;
    }

    public final zzeo zzj() {
        return this.zzk.zzi();
    }

    public final Context zzm() {
        return this.zzk.zzm();
    }

    public final Clock zzl() {
        return this.zzk.zzl();
    }

    public final zzkv zzk() {
        return this.zzk.zzh();
    }

    private final void zzx() {
        this.zzk.zzp().zzc();
    }

    /* access modifiers changed from: package-private */
    public final void zzn() {
        if (!this.zzl) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    private static void zzb(zzki zzki) {
        if (zzki == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!zzki.zzai()) {
            String valueOf = String.valueOf(zzki.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(String str, zzac zzac) {
        if (zzml.zzb() && this.zzk.zza().zza(zzas.zzci)) {
            zzx();
            zzn();
            this.zzz.put(str, zzac);
            zzaf zze2 = zze();
            if (zzml.zzb() && zze2.zzs().zza(zzas.zzci)) {
                Preconditions.checkNotNull(str);
                Preconditions.checkNotNull(zzac);
                zze2.zzc();
                zze2.zzaj();
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("consent_state", zzac.zza());
                try {
                    if (zze2.mo29305c_().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                        zze2.zzq().zze().zza("Failed to insert/update consent setting (got -1). appId", zzeq.zza(str));
                    }
                } catch (SQLiteException e) {
                    zze2.zzq().zze().zza("Error storing consent setting. appId, error", zzeq.zza(str), e);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final zzac zza(String str) {
        zzac zzac = zzac.zza;
        if (zzml.zzb() && this.zzk.zza().zza(zzas.zzci)) {
            zzx();
            zzn();
            zzac = this.zzz.get(str);
            if (zzac == null) {
                zzac = zze().zzj(str);
                if (zzac == null) {
                    zzac = zzac.zza;
                }
                zza(str, zzac);
            }
        }
        return zzac;
    }

    private final long zzy() {
        long currentTimeMillis = this.zzk.zzl().currentTimeMillis();
        zzfc zzb2 = this.zzk.zzb();
        zzb2.zzab();
        zzb2.zzc();
        long zza2 = zzb2.zzg.zza();
        if (zza2 == 0) {
            zza2 = 1 + ((long) zzb2.zzo().zzg().nextInt(86400000));
            zzb2.zzg.zza(zza2);
        }
        return ((((currentTimeMillis + zza2) / 1000) / 60) / 60) / 24;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.measurement.internal.zzaq r36, java.lang.String r37) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            r3 = r37
            com.google.android.gms.measurement.internal.zzaf r2 = r35.zze()
            com.google.android.gms.measurement.internal.zzf r2 = r2.zzb(r3)
            if (r2 == 0) goto L_0x0112
            java.lang.String r4 = r2.zzl()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x001c
            goto L_0x0112
        L_0x001c:
            java.lang.Boolean r4 = r0.zzb((com.google.android.gms.measurement.internal.zzf) r2)
            if (r4 != 0) goto L_0x0040
            java.lang.String r4 = r1.zza
            java.lang.String r5 = "_ui"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x005a
            com.google.android.gms.measurement.internal.zzfu r4 = r0.zzk
            com.google.android.gms.measurement.internal.zzeq r4 = r4.zzq()
            com.google.android.gms.measurement.internal.zzes r4 = r4.zzh()
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r37)
            java.lang.String r6 = "Could not find package. appId"
            r4.zza(r6, r5)
            goto L_0x005a
        L_0x0040:
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x005a
            com.google.android.gms.measurement.internal.zzfu r1 = r0.zzk
            com.google.android.gms.measurement.internal.zzeq r1 = r1.zzq()
            com.google.android.gms.measurement.internal.zzes r1 = r1.zze()
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r37)
            java.lang.String r3 = "App version does not match; dropping event. appId"
            r1.zza(r3, r2)
            return
        L_0x005a:
            com.google.android.gms.measurement.internal.zzn r15 = new com.google.android.gms.measurement.internal.zzn
            java.lang.String r4 = r2.zze()
            java.lang.String r5 = r2.zzl()
            long r6 = r2.zzm()
            java.lang.String r8 = r2.zzn()
            long r9 = r2.zzo()
            long r11 = r2.zzp()
            boolean r14 = r2.zzr()
            r16 = 0
            java.lang.String r17 = r2.zzi()
            long r18 = r2.zzae()
            r20 = 0
            r22 = 0
            boolean r23 = r2.zzaf()
            boolean r24 = r2.zzag()
            r25 = 0
            java.lang.String r26 = r2.zzf()
            java.lang.Boolean r27 = r2.zzah()
            long r28 = r2.zzq()
            java.util.List r30 = r2.zzai()
            boolean r31 = com.google.android.gms.internal.measurement.zznv.zzb()
            if (r31 == 0) goto L_0x00bf
            com.google.android.gms.measurement.internal.zzfu r13 = r0.zzk
            com.google.android.gms.measurement.internal.zzab r13 = r13.zza()
            java.lang.String r1 = r2.zzc()
            r32 = r14
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.zzas.zzbi
            boolean r1 = r13.zze(r1, r14)
            if (r1 == 0) goto L_0x00c1
            java.lang.String r1 = r2.zzg()
            goto L_0x00c2
        L_0x00bf:
            r32 = r14
        L_0x00c1:
            r1 = 0
        L_0x00c2:
            boolean r2 = com.google.android.gms.internal.measurement.zzml.zzb()
            if (r2 == 0) goto L_0x00df
            com.google.android.gms.measurement.internal.zzfu r2 = r0.zzk
            com.google.android.gms.measurement.internal.zzab r2 = r2.zza()
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.zzas.zzci
            boolean r2 = r2.zza((com.google.android.gms.measurement.internal.zzej<java.lang.Boolean>) r13)
            if (r2 == 0) goto L_0x00df
            com.google.android.gms.measurement.internal.zzac r2 = r0.zza((java.lang.String) r3)
            java.lang.String r2 = r2.zza()
            goto L_0x00e1
        L_0x00df:
            java.lang.String r2 = ""
        L_0x00e1:
            r33 = r2
            r2 = r15
            r3 = r37
            r13 = 0
            r14 = r32
            r34 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r19 = r20
            r21 = r22
            r22 = r23
            r23 = r24
            r24 = r25
            r25 = r26
            r26 = r27
            r27 = r28
            r29 = r30
            r30 = r1
            r31 = r33
            r2.<init>((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (long) r6, (java.lang.String) r8, (long) r9, (long) r11, (java.lang.String) r13, (boolean) r14, (boolean) r15, (java.lang.String) r16, (long) r17, (long) r19, (int) r21, (boolean) r22, (boolean) r23, (boolean) r24, (java.lang.String) r25, (java.lang.Boolean) r26, (long) r27, (java.util.List<java.lang.String>) r29, (java.lang.String) r30, (java.lang.String) r31)
            r1 = r36
            r2 = r34
            r0.zzb((com.google.android.gms.measurement.internal.zzaq) r1, (com.google.android.gms.measurement.internal.zzn) r2)
            return
        L_0x0112:
            com.google.android.gms.measurement.internal.zzfu r1 = r0.zzk
            com.google.android.gms.measurement.internal.zzeq r1 = r1.zzq()
            com.google.android.gms.measurement.internal.zzes r1 = r1.zzv()
            java.lang.String r2 = "No app data available; dropping event"
            r1.zza(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkl.zza(com.google.android.gms.measurement.internal.zzaq, java.lang.String):void");
    }

    private final void zzb(zzaq zzaq, zzn zzn2) {
        if (zznw.zzb() && this.zzk.zza().zza(zzas.zzbz)) {
            zzeu zza2 = zzeu.zza(zzaq);
            this.zzk.zzh().zza(zza2.zzb, zze().zzi(zzn2.zza));
            this.zzk.zzh().zza(zza2, this.zzk.zza().zza(zzn2.zza));
            zzaq = zza2.zza();
        }
        if (this.zzk.zza().zza(zzas.zzbd) && Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(zzaq.zza) && "referrer API v2".equals(zzaq.zzb.zzd("_cis"))) {
            String zzd2 = zzaq.zzb.zzd("gclid");
            if (!TextUtils.isEmpty(zzd2)) {
                zza(new zzku("_lgclid", zzaq.zzd, zzd2, "auto"), zzn2);
            }
        }
        zza(zzaq, zzn2);
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzaq zzaq, zzn zzn2) {
        List<zzz> list;
        List<zzz> list2;
        List<zzz> list3;
        zzaq zzaq2 = zzaq;
        zzn zzn3 = zzn2;
        Preconditions.checkNotNull(zzn2);
        Preconditions.checkNotEmpty(zzn3.zza);
        zzx();
        zzn();
        String str = zzn3.zza;
        long j = zzaq2.zzd;
        zzh();
        if (zzkr.zza(zzaq, zzn2)) {
            if (!zzn3.zzh) {
                zzc(zzn3);
                return;
            }
            if (zzn3.zzu != null) {
                if (zzn3.zzu.contains(zzaq2.zza)) {
                    Bundle zzb2 = zzaq2.zzb.zzb();
                    zzb2.putLong("ga_safelisted", 1);
                    zzaq2 = new zzaq(zzaq2.zza, new zzap(zzb2), zzaq2.zzc, zzaq2.zzd);
                } else {
                    this.zzk.zzq().zzv().zza("Dropping non-safelisted event. appId, event name, origin", str, zzaq2.zza, zzaq2.zzc);
                    return;
                }
            }
            zze().zze();
            try {
                zzaf zze2 = zze();
                Preconditions.checkNotEmpty(str);
                zze2.zzc();
                zze2.zzaj();
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i < 0) {
                    zze2.zzq().zzh().zza("Invalid time querying timed out conditional properties", zzeq.zza(str), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = zze2.zza("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j)});
                }
                for (zzz next : list) {
                    if (next != null) {
                        this.zzk.zzq().zzw().zza("User property timed out", next.zza, this.zzk.zzi().zzc(next.zzc.zza), next.zzc.zza());
                        if (next.zzg != null) {
                            zzc(new zzaq(next.zzg, j), zzn3);
                        }
                        zze().zze(str, next.zzc.zza);
                    }
                }
                zzaf zze3 = zze();
                Preconditions.checkNotEmpty(str);
                zze3.zzc();
                zze3.zzaj();
                if (i < 0) {
                    zze3.zzq().zzh().zza("Invalid time querying expired conditional properties", zzeq.zza(str), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = zze3.zza("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (zzz next2 : list2) {
                    if (next2 != null) {
                        this.zzk.zzq().zzw().zza("User property expired", next2.zza, this.zzk.zzi().zzc(next2.zzc.zza), next2.zzc.zza());
                        zze().zzb(str, next2.zzc.zza);
                        if (next2.zzk != null) {
                            arrayList.add(next2.zzk);
                        }
                        zze().zze(str, next2.zzc.zza);
                    }
                }
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    zzc(new zzaq((zzaq) obj, j), zzn3);
                }
                zzaf zze4 = zze();
                String str2 = zzaq2.zza;
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotEmpty(str2);
                zze4.zzc();
                zze4.zzaj();
                if (i < 0) {
                    zze4.zzq().zzh().zza("Invalid time querying triggered conditional properties", zzeq.zza(str), zze4.zzn().zza(str2), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = zze4.zza("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j)});
                }
                ArrayList arrayList3 = new ArrayList(list3.size());
                for (zzz next3 : list3) {
                    if (next3 != null) {
                        zzku zzku = next3.zzc;
                        zzkw zzkw = r4;
                        zzkw zzkw2 = new zzkw(next3.zza, next3.zzb, zzku.zza, j, zzku.zza());
                        if (zze().zza(zzkw)) {
                            this.zzk.zzq().zzw().zza("User property triggered", next3.zza, this.zzk.zzi().zzc(zzkw.zzc), zzkw.zze);
                        } else {
                            this.zzk.zzq().zze().zza("Too many active user properties, ignoring", zzeq.zza(next3.zza), this.zzk.zzi().zzc(zzkw.zzc), zzkw.zze);
                        }
                        if (next3.zzi != null) {
                            arrayList3.add(next3.zzi);
                        }
                        next3.zzc = new zzku(zzkw);
                        next3.zze = true;
                        zze().zza(next3);
                    }
                }
                zzc(zzaq2, zzn3);
                ArrayList arrayList4 = arrayList3;
                int size2 = arrayList4.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList4.get(i3);
                    i3++;
                    zzc(new zzaq((zzaq) obj2, j), zzn3);
                }
                zze().mo29304b_();
            } finally {
                zze().zzg();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0352 A[Catch:{ SQLiteException -> 0x0283, all -> 0x09be }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x096f A[Catch:{ SQLiteException -> 0x0283, all -> 0x09be }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x016a A[Catch:{ SQLiteException -> 0x0283, all -> 0x09be }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0172 A[Catch:{ SQLiteException -> 0x0283, all -> 0x09be }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02b9 A[Catch:{ SQLiteException -> 0x0283, all -> 0x09be }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02f3 A[Catch:{ SQLiteException -> 0x0283, all -> 0x09be }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzc(com.google.android.gms.measurement.internal.zzaq r27, com.google.android.gms.measurement.internal.zzn r28) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            r3 = r28
            java.lang.String r4 = "_sno"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r28)
            java.lang.String r5 = r3.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r5)
            long r5 = java.lang.System.nanoTime()
            r26.zzx()
            r26.zzn()
            java.lang.String r15 = r3.zza
            r26.zzh()
            boolean r7 = com.google.android.gms.measurement.internal.zzkr.zza((com.google.android.gms.measurement.internal.zzaq) r27, (com.google.android.gms.measurement.internal.zzn) r28)
            if (r7 != 0) goto L_0x0026
            return
        L_0x0026:
            boolean r7 = r3.zzh
            if (r7 != 0) goto L_0x002e
            r1.zzc(r3)
            return
        L_0x002e:
            com.google.android.gms.measurement.internal.zzfo r7 = r26.zzc()
            java.lang.String r8 = r2.zza
            boolean r7 = r7.zzb(r15, r8)
            java.lang.String r14 = "_err"
            r13 = 0
            if (r7 == 0) goto L_0x00df
            com.google.android.gms.measurement.internal.zzfu r3 = r1.zzk
            com.google.android.gms.measurement.internal.zzeq r3 = r3.zzq()
            com.google.android.gms.measurement.internal.zzes r3 = r3.zzh()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r15)
            com.google.android.gms.measurement.internal.zzfu r5 = r1.zzk
            com.google.android.gms.measurement.internal.zzeo r5 = r5.zzi()
            java.lang.String r6 = r2.zza
            java.lang.String r5 = r5.zza((java.lang.String) r6)
            java.lang.String r6 = "Dropping blacklisted event. appId"
            r3.zza(r6, r4, r5)
            com.google.android.gms.measurement.internal.zzfo r3 = r26.zzc()
            boolean r3 = r3.zzg(r15)
            if (r3 != 0) goto L_0x0073
            com.google.android.gms.measurement.internal.zzfo r3 = r26.zzc()
            boolean r3 = r3.zzh(r15)
            if (r3 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r3 = 0
            goto L_0x0074
        L_0x0073:
            r3 = 1
        L_0x0074:
            if (r3 != 0) goto L_0x0094
            java.lang.String r4 = r2.zza
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x0094
            com.google.android.gms.measurement.internal.zzfu r4 = r1.zzk
            com.google.android.gms.measurement.internal.zzkv r7 = r4.zzh()
            com.google.android.gms.measurement.internal.zzky r8 = r1.zzaa
            r10 = 11
            java.lang.String r12 = r2.zza
            r2 = 0
            java.lang.String r11 = "_ev"
            r9 = r15
            r4 = r13
            r13 = r2
            r7.zza((com.google.android.gms.measurement.internal.zzky) r8, (java.lang.String) r9, (int) r10, (java.lang.String) r11, (java.lang.String) r12, (int) r13)
            goto L_0x0095
        L_0x0094:
            r4 = r13
        L_0x0095:
            if (r3 == 0) goto L_0x00de
            com.google.android.gms.measurement.internal.zzaf r2 = r26.zze()
            com.google.android.gms.measurement.internal.zzf r2 = r2.zzb(r15)
            if (r2 == 0) goto L_0x00de
            long r5 = r2.zzu()
            long r7 = r2.zzt()
            long r5 = java.lang.Math.max(r5, r7)
            com.google.android.gms.measurement.internal.zzfu r3 = r1.zzk
            com.google.android.gms.common.util.Clock r3 = r3.zzl()
            long r7 = r3.currentTimeMillis()
            long r7 = r7 - r5
            long r5 = java.lang.Math.abs(r7)
            com.google.android.gms.measurement.internal.zzej<java.lang.Long> r3 = com.google.android.gms.measurement.internal.zzas.zzy
            java.lang.Object r3 = r3.zza(r4)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x00de
            com.google.android.gms.measurement.internal.zzfu r3 = r1.zzk
            com.google.android.gms.measurement.internal.zzeq r3 = r3.zzq()
            com.google.android.gms.measurement.internal.zzes r3 = r3.zzv()
            java.lang.String r4 = "Fetching config for blacklisted app"
            r3.zza(r4)
            r1.zza((com.google.android.gms.measurement.internal.zzf) r2)
        L_0x00de:
            return
        L_0x00df:
            boolean r7 = com.google.android.gms.internal.measurement.zzmg.zzb()
            if (r7 == 0) goto L_0x010e
            com.google.android.gms.measurement.internal.zzfu r7 = r1.zzk
            com.google.android.gms.measurement.internal.zzab r7 = r7.zza()
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.zzas.zzbv
            boolean r7 = r7.zza((com.google.android.gms.measurement.internal.zzej<java.lang.Boolean>) r8)
            if (r7 == 0) goto L_0x010e
            com.google.android.gms.measurement.internal.zzeu r2 = com.google.android.gms.measurement.internal.zzeu.zza(r27)
            com.google.android.gms.measurement.internal.zzfu r7 = r1.zzk
            com.google.android.gms.measurement.internal.zzkv r7 = r7.zzh()
            com.google.android.gms.measurement.internal.zzfu r8 = r1.zzk
            com.google.android.gms.measurement.internal.zzab r8 = r8.zza()
            int r8 = r8.zza((java.lang.String) r15)
            r7.zza((com.google.android.gms.measurement.internal.zzeu) r2, (int) r8)
            com.google.android.gms.measurement.internal.zzaq r2 = r2.zza()
        L_0x010e:
            com.google.android.gms.measurement.internal.zzfu r7 = r1.zzk
            com.google.android.gms.measurement.internal.zzeq r7 = r7.zzq()
            r8 = 2
            boolean r7 = r7.zza((int) r8)
            if (r7 == 0) goto L_0x0134
            com.google.android.gms.measurement.internal.zzfu r7 = r1.zzk
            com.google.android.gms.measurement.internal.zzeq r7 = r7.zzq()
            com.google.android.gms.measurement.internal.zzes r7 = r7.zzw()
            com.google.android.gms.measurement.internal.zzfu r9 = r1.zzk
            com.google.android.gms.measurement.internal.zzeo r9 = r9.zzi()
            java.lang.String r9 = r9.zza((com.google.android.gms.measurement.internal.zzaq) r2)
            java.lang.String r10 = "Logging event"
            r7.zza(r10, r9)
        L_0x0134:
            com.google.android.gms.measurement.internal.zzaf r7 = r26.zze()
            r7.zze()
            r1.zzc(r3)     // Catch:{ all -> 0x09be }
            java.lang.String r7 = "ecommerce_purchase"
            java.lang.String r9 = r2.zza     // Catch:{ all -> 0x09be }
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x09be }
            java.lang.String r9 = "refund"
            if (r7 != 0) goto L_0x015f
            java.lang.String r7 = "purchase"
            java.lang.String r10 = r2.zza     // Catch:{ all -> 0x09be }
            boolean r7 = r7.equals(r10)     // Catch:{ all -> 0x09be }
            if (r7 != 0) goto L_0x015f
            java.lang.String r7 = r2.zza     // Catch:{ all -> 0x09be }
            boolean r7 = r9.equals(r7)     // Catch:{ all -> 0x09be }
            if (r7 == 0) goto L_0x015d
            goto L_0x015f
        L_0x015d:
            r7 = 0
            goto L_0x0160
        L_0x015f:
            r7 = 1
        L_0x0160:
            java.lang.String r10 = "_iap"
            java.lang.String r11 = r2.zza     // Catch:{ all -> 0x09be }
            boolean r10 = r10.equals(r11)     // Catch:{ all -> 0x09be }
            if (r10 != 0) goto L_0x016f
            if (r7 == 0) goto L_0x016d
            goto L_0x016f
        L_0x016d:
            r10 = 0
            goto L_0x0170
        L_0x016f:
            r10 = 1
        L_0x0170:
            if (r10 == 0) goto L_0x0302
            com.google.android.gms.measurement.internal.zzap r10 = r2.zzb     // Catch:{ all -> 0x09be }
            java.lang.String r11 = "currency"
            java.lang.String r10 = r10.zzd(r11)     // Catch:{ all -> 0x09be }
            java.lang.String r11 = "value"
            if (r7 == 0) goto L_0x01da
            com.google.android.gms.measurement.internal.zzap r7 = r2.zzb     // Catch:{ all -> 0x09be }
            java.lang.Double r7 = r7.zzc(r11)     // Catch:{ all -> 0x09be }
            double r17 = r7.doubleValue()     // Catch:{ all -> 0x09be }
            r19 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r17 = r17 * r19
            r21 = 0
            int r7 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r7 != 0) goto L_0x01a2
            com.google.android.gms.measurement.internal.zzap r7 = r2.zzb     // Catch:{ all -> 0x09be }
            java.lang.Long r7 = r7.zzb(r11)     // Catch:{ all -> 0x09be }
            long r12 = r7.longValue()     // Catch:{ all -> 0x09be }
            double r11 = (double) r12     // Catch:{ all -> 0x09be }
            double r17 = r11 * r19
        L_0x01a2:
            r11 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r7 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r7 > 0) goto L_0x01bc
            r11 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r7 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r7 < 0) goto L_0x01bc
            long r11 = java.lang.Math.round(r17)     // Catch:{ all -> 0x09be }
            java.lang.String r7 = r2.zza     // Catch:{ all -> 0x09be }
            boolean r7 = r9.equals(r7)     // Catch:{ all -> 0x09be }
            if (r7 == 0) goto L_0x01e4
            long r11 = -r11
            goto L_0x01e4
        L_0x01bc:
            com.google.android.gms.measurement.internal.zzfu r7 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzeq r7 = r7.zzq()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzes r7 = r7.zzh()     // Catch:{ all -> 0x09be }
            java.lang.String r8 = "Data lost. Currency value is too big. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r15)     // Catch:{ all -> 0x09be }
            java.lang.Double r10 = java.lang.Double.valueOf(r17)     // Catch:{ all -> 0x09be }
            r7.zza(r8, r9, r10)     // Catch:{ all -> 0x09be }
            r23 = r5
            r5 = 0
            r16 = 0
            goto L_0x02f1
        L_0x01da:
            com.google.android.gms.measurement.internal.zzap r7 = r2.zzb     // Catch:{ all -> 0x09be }
            java.lang.Long r7 = r7.zzb(r11)     // Catch:{ all -> 0x09be }
            long r11 = r7.longValue()     // Catch:{ all -> 0x09be }
        L_0x01e4:
            boolean r7 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x09be }
            if (r7 != 0) goto L_0x02ec
            java.util.Locale r7 = java.util.Locale.US     // Catch:{ all -> 0x09be }
            java.lang.String r7 = r10.toUpperCase(r7)     // Catch:{ all -> 0x09be }
            java.lang.String r9 = "[A-Z]{3}"
            boolean r9 = r7.matches(r9)     // Catch:{ all -> 0x09be }
            if (r9 == 0) goto L_0x02ec
            java.lang.String r9 = "_ltv_"
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x09be }
            int r10 = r7.length()     // Catch:{ all -> 0x09be }
            if (r10 == 0) goto L_0x0209
            java.lang.String r7 = r9.concat(r7)     // Catch:{ all -> 0x09be }
            goto L_0x020e
        L_0x0209:
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x09be }
            r7.<init>(r9)     // Catch:{ all -> 0x09be }
        L_0x020e:
            r10 = r7
            com.google.android.gms.measurement.internal.zzaf r7 = r26.zze()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzkw r7 = r7.zzc(r15, r10)     // Catch:{ all -> 0x09be }
            if (r7 == 0) goto L_0x024a
            java.lang.Object r9 = r7.zze     // Catch:{ all -> 0x09be }
            boolean r9 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x09be }
            if (r9 != 0) goto L_0x0220
            goto L_0x024a
        L_0x0220:
            java.lang.Object r7 = r7.zze     // Catch:{ all -> 0x09be }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x09be }
            long r7 = r7.longValue()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzkw r17 = new com.google.android.gms.measurement.internal.zzkw     // Catch:{ all -> 0x09be }
            java.lang.String r9 = r2.zzc     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzfu r13 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.common.util.Clock r13 = r13.zzl()     // Catch:{ all -> 0x09be }
            long r18 = r13.currentTimeMillis()     // Catch:{ all -> 0x09be }
            long r7 = r7 + r11
            java.lang.Long r13 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x09be }
            r7 = r17
            r8 = r15
            r23 = r5
            r5 = 0
            r6 = 1
            r11 = r18
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x09be }
            r6 = r17
            goto L_0x02af
        L_0x024a:
            r23 = r5
            r5 = 0
            r6 = 1
            com.google.android.gms.measurement.internal.zzaf r7 = r26.zze()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzfu r9 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzab r9 = r9.zza()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzej<java.lang.Integer> r13 = com.google.android.gms.measurement.internal.zzas.zzad     // Catch:{ all -> 0x09be }
            int r9 = r9.zzb(r15, r13)     // Catch:{ all -> 0x09be }
            int r9 = r9 - r6
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r15)     // Catch:{ all -> 0x09be }
            r7.zzc()     // Catch:{ all -> 0x09be }
            r7.zzaj()     // Catch:{ all -> 0x09be }
            android.database.sqlite.SQLiteDatabase r13 = r7.mo29305c_()     // Catch:{ SQLiteException -> 0x0283 }
            java.lang.String r8 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r6 = 3
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0283 }
            r6[r5] = r15     // Catch:{ SQLiteException -> 0x0283 }
            r16 = 1
            r6[r16] = r15     // Catch:{ SQLiteException -> 0x0283 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x0283 }
            r16 = 2
            r6[r16] = r9     // Catch:{ SQLiteException -> 0x0283 }
            r13.execSQL(r8, r6)     // Catch:{ SQLiteException -> 0x0283 }
            goto L_0x0296
        L_0x0283:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.zzeq r7 = r7.zzq()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzes r7 = r7.zze()     // Catch:{ all -> 0x09be }
            java.lang.String r8 = "Error pruning currencies. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r15)     // Catch:{ all -> 0x09be }
            r7.zza(r8, r9, r6)     // Catch:{ all -> 0x09be }
        L_0x0296:
            com.google.android.gms.measurement.internal.zzkw r6 = new com.google.android.gms.measurement.internal.zzkw     // Catch:{ all -> 0x09be }
            java.lang.String r9 = r2.zzc     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzfu r7 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.common.util.Clock r7 = r7.zzl()     // Catch:{ all -> 0x09be }
            long r16 = r7.currentTimeMillis()     // Catch:{ all -> 0x09be }
            java.lang.Long r13 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x09be }
            r7 = r6
            r8 = r15
            r11 = r16
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x09be }
        L_0x02af:
            com.google.android.gms.measurement.internal.zzaf r7 = r26.zze()     // Catch:{ all -> 0x09be }
            boolean r7 = r7.zza((com.google.android.gms.measurement.internal.zzkw) r6)     // Catch:{ all -> 0x09be }
            if (r7 != 0) goto L_0x02ef
            com.google.android.gms.measurement.internal.zzfu r7 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzeq r7 = r7.zzq()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzes r7 = r7.zze()     // Catch:{ all -> 0x09be }
            java.lang.String r8 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r15)     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzfu r10 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzeo r10 = r10.zzi()     // Catch:{ all -> 0x09be }
            java.lang.String r11 = r6.zzc     // Catch:{ all -> 0x09be }
            java.lang.String r10 = r10.zzc(r11)     // Catch:{ all -> 0x09be }
            java.lang.Object r6 = r6.zze     // Catch:{ all -> 0x09be }
            r7.zza(r8, r9, r10, r6)     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzfu r6 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzkv r7 = r6.zzh()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzky r8 = r1.zzaa     // Catch:{ all -> 0x09be }
            r10 = 9
            r11 = 0
            r12 = 0
            r13 = 0
            r9 = r15
            r7.zza((com.google.android.gms.measurement.internal.zzky) r8, (java.lang.String) r9, (int) r10, (java.lang.String) r11, (java.lang.String) r12, (int) r13)     // Catch:{ all -> 0x09be }
            goto L_0x02ef
        L_0x02ec:
            r23 = r5
            r5 = 0
        L_0x02ef:
            r16 = 1
        L_0x02f1:
            if (r16 != 0) goto L_0x0305
            com.google.android.gms.measurement.internal.zzaf r2 = r26.zze()     // Catch:{ all -> 0x09be }
            r2.mo29304b_()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzaf r2 = r26.zze()
            r2.zzg()
            return
        L_0x0302:
            r23 = r5
            r5 = 0
        L_0x0305:
            java.lang.String r6 = r2.zza     // Catch:{ all -> 0x09be }
            boolean r6 = com.google.android.gms.measurement.internal.zzkv.zza((java.lang.String) r6)     // Catch:{ all -> 0x09be }
            java.lang.String r7 = r2.zza     // Catch:{ all -> 0x09be }
            boolean r18 = r14.equals(r7)     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzfu r7 = r1.zzk     // Catch:{ all -> 0x09be }
            r7.zzh()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzap r7 = r2.zzb     // Catch:{ all -> 0x09be }
            long r7 = com.google.android.gms.measurement.internal.zzkv.zza((com.google.android.gms.measurement.internal.zzap) r7)     // Catch:{ all -> 0x09be }
            r19 = 1
            long r11 = r7 + r19
            com.google.android.gms.measurement.internal.zzaf r7 = r26.zze()     // Catch:{ all -> 0x09be }
            long r8 = r26.zzy()     // Catch:{ all -> 0x09be }
            r13 = 1
            r16 = 0
            r17 = 0
            r10 = r15
            r14 = r6
            r27 = r15
            r15 = r16
            r16 = r18
            com.google.android.gms.measurement.internal.zzae r7 = r7.zza(r8, r10, r11, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x09be }
            long r8 = r7.zzb     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzej<java.lang.Integer> r10 = com.google.android.gms.measurement.internal.zzas.zzj     // Catch:{ all -> 0x09be }
            r14 = 0
            java.lang.Object r10 = r10.zza(r14)     // Catch:{ all -> 0x09be }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x09be }
            int r10 = r10.intValue()     // Catch:{ all -> 0x09be }
            long r10 = (long) r10     // Catch:{ all -> 0x09be }
            long r8 = r8 - r10
            r10 = 1000(0x3e8, double:4.94E-321)
            r12 = 0
            int r15 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r15 <= 0) goto L_0x037f
            long r8 = r8 % r10
            int r2 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r2 != 0) goto L_0x0370
            com.google.android.gms.measurement.internal.zzfu r2 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzeq r2 = r2.zzq()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzes r2 = r2.zze()     // Catch:{ all -> 0x09be }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r27)     // Catch:{ all -> 0x09be }
            long r5 = r7.zzb     // Catch:{ all -> 0x09be }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x09be }
            r2.zza(r3, r4, r5)     // Catch:{ all -> 0x09be }
        L_0x0370:
            com.google.android.gms.measurement.internal.zzaf r2 = r26.zze()     // Catch:{ all -> 0x09be }
            r2.mo29304b_()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzaf r2 = r26.zze()
            r2.zzg()
            return
        L_0x037f:
            if (r6 == 0) goto L_0x03d6
            long r8 = r7.zza     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzej<java.lang.Integer> r15 = com.google.android.gms.measurement.internal.zzas.zzl     // Catch:{ all -> 0x09be }
            java.lang.Object r15 = r15.zza(r14)     // Catch:{ all -> 0x09be }
            java.lang.Integer r15 = (java.lang.Integer) r15     // Catch:{ all -> 0x09be }
            int r15 = r15.intValue()     // Catch:{ all -> 0x09be }
            long r14 = (long) r15     // Catch:{ all -> 0x09be }
            long r8 = r8 - r14
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x03d6
            long r8 = r8 % r10
            int r3 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r3 != 0) goto L_0x03b3
            com.google.android.gms.measurement.internal.zzfu r3 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzeq r3 = r3.zzq()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzes r3 = r3.zze()     // Catch:{ all -> 0x09be }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r27)     // Catch:{ all -> 0x09be }
            long r6 = r7.zza     // Catch:{ all -> 0x09be }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x09be }
            r3.zza(r4, r5, r6)     // Catch:{ all -> 0x09be }
        L_0x03b3:
            com.google.android.gms.measurement.internal.zzfu r3 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzkv r7 = r3.zzh()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzky r8 = r1.zzaa     // Catch:{ all -> 0x09be }
            r10 = 16
            java.lang.String r11 = "_ev"
            java.lang.String r12 = r2.zza     // Catch:{ all -> 0x09be }
            r13 = 0
            r9 = r27
            r7.zza((com.google.android.gms.measurement.internal.zzky) r8, (java.lang.String) r9, (int) r10, (java.lang.String) r11, (java.lang.String) r12, (int) r13)     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzaf r2 = r26.zze()     // Catch:{ all -> 0x09be }
            r2.mo29304b_()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzaf r2 = r26.zze()
            r2.zzg()
            return
        L_0x03d6:
            if (r18 == 0) goto L_0x0425
            long r8 = r7.zzd     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzfu r10 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzab r10 = r10.zza()     // Catch:{ all -> 0x09be }
            java.lang.String r11 = r3.zza     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzej<java.lang.Integer> r14 = com.google.android.gms.measurement.internal.zzas.zzk     // Catch:{ all -> 0x09be }
            int r10 = r10.zzb(r11, r14)     // Catch:{ all -> 0x09be }
            r11 = 1000000(0xf4240, float:1.401298E-39)
            int r10 = java.lang.Math.min(r11, r10)     // Catch:{ all -> 0x09be }
            int r10 = java.lang.Math.max(r5, r10)     // Catch:{ all -> 0x09be }
            long r10 = (long) r10     // Catch:{ all -> 0x09be }
            long r8 = r8 - r10
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x0425
            int r2 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r2 != 0) goto L_0x0416
            com.google.android.gms.measurement.internal.zzfu r2 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzeq r2 = r2.zzq()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzes r2 = r2.zze()     // Catch:{ all -> 0x09be }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r27)     // Catch:{ all -> 0x09be }
            long r5 = r7.zzd     // Catch:{ all -> 0x09be }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x09be }
            r2.zza(r3, r4, r5)     // Catch:{ all -> 0x09be }
        L_0x0416:
            com.google.android.gms.measurement.internal.zzaf r2 = r26.zze()     // Catch:{ all -> 0x09be }
            r2.mo29304b_()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzaf r2 = r26.zze()
            r2.zzg()
            return
        L_0x0425:
            com.google.android.gms.measurement.internal.zzap r7 = r2.zzb     // Catch:{ all -> 0x09be }
            android.os.Bundle r14 = r7.zzb()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzfu r7 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzkv r7 = r7.zzh()     // Catch:{ all -> 0x09be }
            java.lang.String r8 = "_o"
            java.lang.String r9 = r2.zzc     // Catch:{ all -> 0x09be }
            r7.zza((android.os.Bundle) r14, (java.lang.String) r8, (java.lang.Object) r9)     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzfu r7 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzkv r7 = r7.zzh()     // Catch:{ all -> 0x09be }
            r15 = r27
            boolean r7 = r7.zze(r15)     // Catch:{ all -> 0x09be }
            java.lang.String r11 = "_r"
            if (r7 == 0) goto L_0x0464
            com.google.android.gms.measurement.internal.zzfu r7 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzkv r7 = r7.zzh()     // Catch:{ all -> 0x09be }
            java.lang.String r8 = "_dbg"
            java.lang.Long r9 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x09be }
            r7.zza((android.os.Bundle) r14, (java.lang.String) r8, (java.lang.Object) r9)     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzfu r7 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzkv r7 = r7.zzh()     // Catch:{ all -> 0x09be }
            java.lang.Long r8 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x09be }
            r7.zza((android.os.Bundle) r14, (java.lang.String) r11, (java.lang.Object) r8)     // Catch:{ all -> 0x09be }
        L_0x0464:
            java.lang.String r7 = "_s"
            java.lang.String r8 = r2.zza     // Catch:{ all -> 0x09be }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x09be }
            if (r7 == 0) goto L_0x048b
            com.google.android.gms.measurement.internal.zzaf r7 = r26.zze()     // Catch:{ all -> 0x09be }
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzkw r7 = r7.zzc(r8, r4)     // Catch:{ all -> 0x09be }
            if (r7 == 0) goto L_0x048b
            java.lang.Object r8 = r7.zze     // Catch:{ all -> 0x09be }
            boolean r8 = r8 instanceof java.lang.Long     // Catch:{ all -> 0x09be }
            if (r8 == 0) goto L_0x048b
            com.google.android.gms.measurement.internal.zzfu r8 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzkv r8 = r8.zzh()     // Catch:{ all -> 0x09be }
            java.lang.Object r7 = r7.zze     // Catch:{ all -> 0x09be }
            r8.zza((android.os.Bundle) r14, (java.lang.String) r4, (java.lang.Object) r7)     // Catch:{ all -> 0x09be }
        L_0x048b:
            com.google.android.gms.measurement.internal.zzaf r4 = r26.zze()     // Catch:{ all -> 0x09be }
            long r7 = r4.zzc(r15)     // Catch:{ all -> 0x09be }
            int r4 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x04ae
            com.google.android.gms.measurement.internal.zzfu r4 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzeq r4 = r4.zzq()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzes r4 = r4.zzh()     // Catch:{ all -> 0x09be }
            java.lang.String r9 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r15)     // Catch:{ all -> 0x09be }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x09be }
            r4.zza(r9, r10, r7)     // Catch:{ all -> 0x09be }
        L_0x04ae:
            com.google.android.gms.measurement.internal.zzan r4 = new com.google.android.gms.measurement.internal.zzan     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzfu r8 = r1.zzk     // Catch:{ all -> 0x09be }
            java.lang.String r9 = r2.zzc     // Catch:{ all -> 0x09be }
            java.lang.String r10 = r2.zza     // Catch:{ all -> 0x09be }
            long r12 = r2.zzd     // Catch:{ all -> 0x09be }
            r18 = 0
            r7 = r4
            r2 = r10
            r10 = r15
            r5 = r11
            r11 = r2
            r16 = r14
            r2 = r15
            r25 = 0
            r14 = r18
            r7.<init>((com.google.android.gms.measurement.internal.zzfu) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (long) r12, (long) r14, (android.os.Bundle) r16)     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzaf r7 = r26.zze()     // Catch:{ all -> 0x09be }
            java.lang.String r8 = r4.zzb     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzam r7 = r7.zza((java.lang.String) r2, (java.lang.String) r8)     // Catch:{ all -> 0x09be }
            if (r7 != 0) goto L_0x054e
            com.google.android.gms.measurement.internal.zzaf r7 = r26.zze()     // Catch:{ all -> 0x09be }
            long r7 = r7.zzh(r2)     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzfu r9 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzab r9 = r9.zza()     // Catch:{ all -> 0x09be }
            int r9 = r9.zzb(r2)     // Catch:{ all -> 0x09be }
            long r9 = (long) r9     // Catch:{ all -> 0x09be }
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x0534
            if (r6 == 0) goto L_0x0534
            com.google.android.gms.measurement.internal.zzfu r3 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzeq r3 = r3.zzq()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzes r3 = r3.zze()     // Catch:{ all -> 0x09be }
            java.lang.String r5 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r2)     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzfu r7 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzeo r7 = r7.zzi()     // Catch:{ all -> 0x09be }
            java.lang.String r4 = r4.zzb     // Catch:{ all -> 0x09be }
            java.lang.String r4 = r7.zza((java.lang.String) r4)     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzfu r7 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzab r7 = r7.zza()     // Catch:{ all -> 0x09be }
            int r7 = r7.zzb(r2)     // Catch:{ all -> 0x09be }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x09be }
            r3.zza(r5, r6, r4, r7)     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzfu r3 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzkv r7 = r3.zzh()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzky r8 = r1.zzaa     // Catch:{ all -> 0x09be }
            r10 = 8
            r11 = 0
            r12 = 0
            r13 = 0
            r9 = r2
            r7.zza((com.google.android.gms.measurement.internal.zzky) r8, (java.lang.String) r9, (int) r10, (java.lang.String) r11, (java.lang.String) r12, (int) r13)     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzaf r2 = r26.zze()
            r2.zzg()
            return
        L_0x0534:
            com.google.android.gms.measurement.internal.zzam r6 = new com.google.android.gms.measurement.internal.zzam     // Catch:{ all -> 0x09be }
            java.lang.String r9 = r4.zzb     // Catch:{ all -> 0x09be }
            r10 = 0
            r12 = 0
            long r14 = r4.zzc     // Catch:{ all -> 0x09be }
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r7 = r6
            r8 = r2
            r7.<init>(r8, r9, r10, r12, r14, r16, r18, r19, r20, r21)     // Catch:{ all -> 0x09be }
            goto L_0x055c
        L_0x054e:
            com.google.android.gms.measurement.internal.zzfu r2 = r1.zzk     // Catch:{ all -> 0x09be }
            long r8 = r7.zzf     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzan r4 = r4.zza(r2, r8)     // Catch:{ all -> 0x09be }
            long r8 = r4.zzc     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzam r6 = r7.zza(r8)     // Catch:{ all -> 0x09be }
        L_0x055c:
            com.google.android.gms.measurement.internal.zzaf r2 = r26.zze()     // Catch:{ all -> 0x09be }
            r2.zza((com.google.android.gms.measurement.internal.zzam) r6)     // Catch:{ all -> 0x09be }
            r26.zzx()     // Catch:{ all -> 0x09be }
            r26.zzn()     // Catch:{ all -> 0x09be }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch:{ all -> 0x09be }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r28)     // Catch:{ all -> 0x09be }
            java.lang.String r2 = r4.zza     // Catch:{ all -> 0x09be }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)     // Catch:{ all -> 0x09be }
            java.lang.String r2 = r4.zza     // Catch:{ all -> 0x09be }
            java.lang.String r6 = r3.zza     // Catch:{ all -> 0x09be }
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x09be }
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2)     // Catch:{ all -> 0x09be }
            com.google.android.gms.internal.measurement.zzcd$zzg$zza r2 = com.google.android.gms.internal.measurement.zzcd.zzg.zzbh()     // Catch:{ all -> 0x09be }
            r6 = 1
            com.google.android.gms.internal.measurement.zzcd$zzg$zza r2 = r2.zza((int) r6)     // Catch:{ all -> 0x09be }
            java.lang.String r7 = "android"
            com.google.android.gms.internal.measurement.zzcd$zzg$zza r2 = r2.zza((java.lang.String) r7)     // Catch:{ all -> 0x09be }
            java.lang.String r7 = r3.zza     // Catch:{ all -> 0x09be }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09be }
            if (r7 != 0) goto L_0x059b
            java.lang.String r7 = r3.zza     // Catch:{ all -> 0x09be }
            r2.zzf((java.lang.String) r7)     // Catch:{ all -> 0x09be }
        L_0x059b:
            java.lang.String r7 = r3.zzd     // Catch:{ all -> 0x09be }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09be }
            if (r7 != 0) goto L_0x05a8
            java.lang.String r7 = r3.zzd     // Catch:{ all -> 0x09be }
            r2.zze((java.lang.String) r7)     // Catch:{ all -> 0x09be }
        L_0x05a8:
            java.lang.String r7 = r3.zzc     // Catch:{ all -> 0x09be }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09be }
            if (r7 != 0) goto L_0x05b5
            java.lang.String r7 = r3.zzc     // Catch:{ all -> 0x09be }
            r2.zzg((java.lang.String) r7)     // Catch:{ all -> 0x09be }
        L_0x05b5:
            long r7 = r3.zzj     // Catch:{ all -> 0x09be }
            r9 = -2147483648(0xffffffff80000000, double:NaN)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x05c4
            long r7 = r3.zzj     // Catch:{ all -> 0x09be }
            int r8 = (int) r7     // Catch:{ all -> 0x09be }
            r2.zzh((int) r8)     // Catch:{ all -> 0x09be }
        L_0x05c4:
            long r7 = r3.zze     // Catch:{ all -> 0x09be }
            r2.zzf((long) r7)     // Catch:{ all -> 0x09be }
            java.lang.String r7 = r3.zzb     // Catch:{ all -> 0x09be }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09be }
            if (r7 != 0) goto L_0x05d6
            java.lang.String r7 = r3.zzb     // Catch:{ all -> 0x09be }
            r2.zzk((java.lang.String) r7)     // Catch:{ all -> 0x09be }
        L_0x05d6:
            boolean r7 = com.google.android.gms.internal.measurement.zzml.zzb()     // Catch:{ all -> 0x09be }
            if (r7 == 0) goto L_0x0601
            com.google.android.gms.measurement.internal.zzfu r7 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzab r7 = r7.zza()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.zzas.zzci     // Catch:{ all -> 0x09be }
            boolean r7 = r7.zza((com.google.android.gms.measurement.internal.zzej<java.lang.Boolean>) r8)     // Catch:{ all -> 0x09be }
            if (r7 == 0) goto L_0x0601
            java.lang.String r7 = r3.zza     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzac r7 = r1.zza((java.lang.String) r7)     // Catch:{ all -> 0x09be }
            java.lang.String r8 = r3.zzw     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzac r8 = com.google.android.gms.measurement.internal.zzac.zza((java.lang.String) r8)     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzac r7 = r7.zzb((com.google.android.gms.measurement.internal.zzac) r8)     // Catch:{ all -> 0x09be }
            java.lang.String r7 = r7.zza()     // Catch:{ all -> 0x09be }
            r2.zzq(r7)     // Catch:{ all -> 0x09be }
        L_0x0601:
            boolean r7 = com.google.android.gms.internal.measurement.zznv.zzb()     // Catch:{ all -> 0x09be }
            if (r7 == 0) goto L_0x0650
            com.google.android.gms.measurement.internal.zzfu r7 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzab r7 = r7.zza()     // Catch:{ all -> 0x09be }
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.zzas.zzbi     // Catch:{ all -> 0x09be }
            boolean r7 = r7.zze(r8, r9)     // Catch:{ all -> 0x09be }
            if (r7 == 0) goto L_0x0650
            java.lang.String r7 = r2.zzo()     // Catch:{ all -> 0x09be }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09be }
            if (r7 == 0) goto L_0x062e
            java.lang.String r7 = r3.zzv     // Catch:{ all -> 0x09be }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09be }
            if (r7 != 0) goto L_0x062e
            java.lang.String r7 = r3.zzv     // Catch:{ all -> 0x09be }
            r2.zzp(r7)     // Catch:{ all -> 0x09be }
        L_0x062e:
            java.lang.String r7 = r2.zzo()     // Catch:{ all -> 0x09be }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09be }
            if (r7 == 0) goto L_0x0667
            java.lang.String r7 = r2.zzs()     // Catch:{ all -> 0x09be }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09be }
            if (r7 == 0) goto L_0x0667
            java.lang.String r7 = r3.zzr     // Catch:{ all -> 0x09be }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09be }
            if (r7 != 0) goto L_0x0667
            java.lang.String r7 = r3.zzr     // Catch:{ all -> 0x09be }
            r2.zzo(r7)     // Catch:{ all -> 0x09be }
            goto L_0x0667
        L_0x0650:
            java.lang.String r7 = r2.zzo()     // Catch:{ all -> 0x09be }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09be }
            if (r7 == 0) goto L_0x0667
            java.lang.String r7 = r3.zzr     // Catch:{ all -> 0x09be }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09be }
            if (r7 != 0) goto L_0x0667
            java.lang.String r7 = r3.zzr     // Catch:{ all -> 0x09be }
            r2.zzo(r7)     // Catch:{ all -> 0x09be }
        L_0x0667:
            long r7 = r3.zzf     // Catch:{ all -> 0x09be }
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0674
            long r7 = r3.zzf     // Catch:{ all -> 0x09be }
            r2.zzh((long) r7)     // Catch:{ all -> 0x09be }
        L_0x0674:
            long r7 = r3.zzt     // Catch:{ all -> 0x09be }
            r2.zzk((long) r7)     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzkr r7 = r26.zzh()     // Catch:{ all -> 0x09be }
            java.util.List r7 = r7.zze()     // Catch:{ all -> 0x09be }
            if (r7 == 0) goto L_0x0686
            r2.zzd((java.lang.Iterable<? extends java.lang.Integer>) r7)     // Catch:{ all -> 0x09be }
        L_0x0686:
            java.lang.String r7 = r3.zza     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzac r7 = r1.zza((java.lang.String) r7)     // Catch:{ all -> 0x09be }
            java.lang.String r8 = r3.zzw     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzac r8 = com.google.android.gms.measurement.internal.zzac.zza((java.lang.String) r8)     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzac r7 = r7.zzb((com.google.android.gms.measurement.internal.zzac) r8)     // Catch:{ all -> 0x09be }
            boolean r8 = com.google.android.gms.internal.measurement.zzml.zzb()     // Catch:{ all -> 0x09be }
            if (r8 == 0) goto L_0x06b0
            com.google.android.gms.measurement.internal.zzfu r8 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzab r8 = r8.zza()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.zzas.zzci     // Catch:{ all -> 0x09be }
            boolean r8 = r8.zza((com.google.android.gms.measurement.internal.zzej<java.lang.Boolean>) r11)     // Catch:{ all -> 0x09be }
            if (r8 == 0) goto L_0x06b0
            boolean r8 = r7.zzc()     // Catch:{ all -> 0x09be }
            if (r8 == 0) goto L_0x0758
        L_0x06b0:
            com.google.android.gms.measurement.internal.zzjr r8 = r1.zzj     // Catch:{ all -> 0x09be }
            java.lang.String r11 = r3.zza     // Catch:{ all -> 0x09be }
            android.util.Pair r8 = r8.zza(r11, r7)     // Catch:{ all -> 0x09be }
            if (r8 == 0) goto L_0x06e0
            java.lang.Object r11 = r8.first     // Catch:{ all -> 0x09be }
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11     // Catch:{ all -> 0x09be }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x09be }
            if (r11 != 0) goto L_0x06e0
            boolean r11 = r3.zzo     // Catch:{ all -> 0x09be }
            if (r11 == 0) goto L_0x0758
            java.lang.Object r11 = r8.first     // Catch:{ all -> 0x09be }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x09be }
            r2.zzh((java.lang.String) r11)     // Catch:{ all -> 0x09be }
            java.lang.Object r11 = r8.second     // Catch:{ all -> 0x09be }
            if (r11 == 0) goto L_0x0758
            java.lang.Object r8 = r8.second     // Catch:{ all -> 0x09be }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x09be }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x09be }
            r2.zza((boolean) r8)     // Catch:{ all -> 0x09be }
            goto L_0x0758
        L_0x06e0:
            com.google.android.gms.measurement.internal.zzfu r8 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzak r8 = r8.zzw()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzfu r11 = r1.zzk     // Catch:{ all -> 0x09be }
            android.content.Context r11 = r11.zzm()     // Catch:{ all -> 0x09be }
            boolean r8 = r8.zza(r11)     // Catch:{ all -> 0x09be }
            if (r8 != 0) goto L_0x0758
            boolean r8 = r3.zzp     // Catch:{ all -> 0x09be }
            if (r8 == 0) goto L_0x0758
            boolean r8 = com.google.android.gms.internal.measurement.zzoz.zzb()     // Catch:{ all -> 0x09be }
            if (r8 == 0) goto L_0x070c
            com.google.android.gms.measurement.internal.zzfu r8 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzab r8 = r8.zza()     // Catch:{ all -> 0x09be }
            java.lang.String r11 = r3.zza     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.zzas.zzcf     // Catch:{ all -> 0x09be }
            boolean r8 = r8.zze(r11, r12)     // Catch:{ all -> 0x09be }
            if (r8 != 0) goto L_0x0758
        L_0x070c:
            com.google.android.gms.measurement.internal.zzfu r8 = r1.zzk     // Catch:{ all -> 0x09be }
            android.content.Context r8 = r8.zzm()     // Catch:{ all -> 0x09be }
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch:{ all -> 0x09be }
            java.lang.String r11 = "android_id"
            java.lang.String r8 = android.provider.Settings.Secure.getString(r8, r11)     // Catch:{ all -> 0x09be }
            if (r8 != 0) goto L_0x0738
            com.google.android.gms.measurement.internal.zzfu r8 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzeq r8 = r8.zzq()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzes r8 = r8.zzh()     // Catch:{ all -> 0x09be }
            java.lang.String r11 = "null secure ID. appId"
            java.lang.String r12 = r2.zzj()     // Catch:{ all -> 0x09be }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r12)     // Catch:{ all -> 0x09be }
            r8.zza(r11, r12)     // Catch:{ all -> 0x09be }
            java.lang.String r8 = "null"
            goto L_0x0755
        L_0x0738:
            boolean r11 = r8.isEmpty()     // Catch:{ all -> 0x09be }
            if (r11 == 0) goto L_0x0755
            com.google.android.gms.measurement.internal.zzfu r11 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzeq r11 = r11.zzq()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzes r11 = r11.zzh()     // Catch:{ all -> 0x09be }
            java.lang.String r12 = "empty secure ID. appId"
            java.lang.String r13 = r2.zzj()     // Catch:{ all -> 0x09be }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r13)     // Catch:{ all -> 0x09be }
            r11.zza(r12, r13)     // Catch:{ all -> 0x09be }
        L_0x0755:
            r2.zzm(r8)     // Catch:{ all -> 0x09be }
        L_0x0758:
            com.google.android.gms.measurement.internal.zzfu r8 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzak r8 = r8.zzw()     // Catch:{ all -> 0x09be }
            r8.zzab()     // Catch:{ all -> 0x09be }
            java.lang.String r8 = android.os.Build.MODEL     // Catch:{ all -> 0x09be }
            com.google.android.gms.internal.measurement.zzcd$zzg$zza r8 = r2.zzc((java.lang.String) r8)     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzfu r11 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzak r11 = r11.zzw()     // Catch:{ all -> 0x09be }
            r11.zzab()     // Catch:{ all -> 0x09be }
            java.lang.String r11 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x09be }
            com.google.android.gms.internal.measurement.zzcd$zzg$zza r8 = r8.zzb((java.lang.String) r11)     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzfu r11 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzak r11 = r11.zzw()     // Catch:{ all -> 0x09be }
            long r11 = r11.zze()     // Catch:{ all -> 0x09be }
            int r12 = (int) r11     // Catch:{ all -> 0x09be }
            com.google.android.gms.internal.measurement.zzcd$zzg$zza r8 = r8.zzf((int) r12)     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzfu r11 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzak r11 = r11.zzw()     // Catch:{ all -> 0x09be }
            java.lang.String r11 = r11.zzf()     // Catch:{ all -> 0x09be }
            r8.zzd((java.lang.String) r11)     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzfu r8 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzab r8 = r8.zza()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.zzas.zzbx     // Catch:{ all -> 0x09be }
            boolean r8 = r8.zza((com.google.android.gms.measurement.internal.zzej<java.lang.Boolean>) r11)     // Catch:{ all -> 0x09be }
            if (r8 != 0) goto L_0x07a5
            long r11 = r3.zzl     // Catch:{ all -> 0x09be }
            r2.zzj((long) r11)     // Catch:{ all -> 0x09be }
        L_0x07a5:
            com.google.android.gms.measurement.internal.zzfu r8 = r1.zzk     // Catch:{ all -> 0x09be }
            boolean r8 = r8.zzaa()     // Catch:{ all -> 0x09be }
            if (r8 == 0) goto L_0x07d3
            boolean r8 = com.google.android.gms.internal.measurement.zzml.zzb()     // Catch:{ all -> 0x09be }
            if (r8 == 0) goto L_0x07c5
            com.google.android.gms.measurement.internal.zzfu r8 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzab r8 = r8.zza()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.zzas.zzci     // Catch:{ all -> 0x09be }
            boolean r8 = r8.zza((com.google.android.gms.measurement.internal.zzej<java.lang.Boolean>) r11)     // Catch:{ all -> 0x09be }
            if (r8 == 0) goto L_0x07c5
            r2.zzj()     // Catch:{ all -> 0x09be }
            goto L_0x07c8
        L_0x07c5:
            r2.zzj()     // Catch:{ all -> 0x09be }
        L_0x07c8:
            boolean r8 = android.text.TextUtils.isEmpty(r25)     // Catch:{ all -> 0x09be }
            if (r8 != 0) goto L_0x07d3
            r8 = r25
            r2.zzn(r8)     // Catch:{ all -> 0x09be }
        L_0x07d3:
            com.google.android.gms.measurement.internal.zzaf r8 = r26.zze()     // Catch:{ all -> 0x09be }
            java.lang.String r11 = r3.zza     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzf r8 = r8.zzb(r11)     // Catch:{ all -> 0x09be }
            if (r8 != 0) goto L_0x0880
            com.google.android.gms.measurement.internal.zzf r8 = new com.google.android.gms.measurement.internal.zzf     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzfu r11 = r1.zzk     // Catch:{ all -> 0x09be }
            java.lang.String r12 = r3.zza     // Catch:{ all -> 0x09be }
            r8.<init>(r11, r12)     // Catch:{ all -> 0x09be }
            boolean r11 = com.google.android.gms.internal.measurement.zzml.zzb()     // Catch:{ all -> 0x09be }
            if (r11 == 0) goto L_0x0804
            com.google.android.gms.measurement.internal.zzfu r11 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzab r11 = r11.zza()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.zzas.zzci     // Catch:{ all -> 0x09be }
            boolean r11 = r11.zza((com.google.android.gms.measurement.internal.zzej<java.lang.Boolean>) r12)     // Catch:{ all -> 0x09be }
            if (r11 == 0) goto L_0x0804
            java.lang.String r11 = r1.zza((com.google.android.gms.measurement.internal.zzac) r7)     // Catch:{ all -> 0x09be }
            r8.zza((java.lang.String) r11)     // Catch:{ all -> 0x09be }
            goto L_0x080b
        L_0x0804:
            java.lang.String r11 = r26.zzz()     // Catch:{ all -> 0x09be }
            r8.zza((java.lang.String) r11)     // Catch:{ all -> 0x09be }
        L_0x080b:
            java.lang.String r11 = r3.zzk     // Catch:{ all -> 0x09be }
            r8.zzf((java.lang.String) r11)     // Catch:{ all -> 0x09be }
            java.lang.String r11 = r3.zzb     // Catch:{ all -> 0x09be }
            r8.zzb((java.lang.String) r11)     // Catch:{ all -> 0x09be }
            boolean r11 = com.google.android.gms.internal.measurement.zzml.zzb()     // Catch:{ all -> 0x09be }
            if (r11 == 0) goto L_0x082f
            com.google.android.gms.measurement.internal.zzfu r11 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzab r11 = r11.zza()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.zzas.zzci     // Catch:{ all -> 0x09be }
            boolean r11 = r11.zza((com.google.android.gms.measurement.internal.zzej<java.lang.Boolean>) r12)     // Catch:{ all -> 0x09be }
            if (r11 == 0) goto L_0x082f
            boolean r11 = r7.zzc()     // Catch:{ all -> 0x09be }
            if (r11 == 0) goto L_0x083a
        L_0x082f:
            com.google.android.gms.measurement.internal.zzjr r11 = r1.zzj     // Catch:{ all -> 0x09be }
            java.lang.String r12 = r3.zza     // Catch:{ all -> 0x09be }
            java.lang.String r11 = r11.zza(r12)     // Catch:{ all -> 0x09be }
            r8.zze((java.lang.String) r11)     // Catch:{ all -> 0x09be }
        L_0x083a:
            r8.zzg((long) r9)     // Catch:{ all -> 0x09be }
            r8.zza((long) r9)     // Catch:{ all -> 0x09be }
            r8.zzb((long) r9)     // Catch:{ all -> 0x09be }
            java.lang.String r11 = r3.zzc     // Catch:{ all -> 0x09be }
            r8.zzg((java.lang.String) r11)     // Catch:{ all -> 0x09be }
            long r11 = r3.zzj     // Catch:{ all -> 0x09be }
            r8.zzc((long) r11)     // Catch:{ all -> 0x09be }
            java.lang.String r11 = r3.zzd     // Catch:{ all -> 0x09be }
            r8.zzh((java.lang.String) r11)     // Catch:{ all -> 0x09be }
            long r11 = r3.zze     // Catch:{ all -> 0x09be }
            r8.zzd((long) r11)     // Catch:{ all -> 0x09be }
            long r11 = r3.zzf     // Catch:{ all -> 0x09be }
            r8.zze((long) r11)     // Catch:{ all -> 0x09be }
            boolean r11 = r3.zzh     // Catch:{ all -> 0x09be }
            r8.zza((boolean) r11)     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzfu r11 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzab r11 = r11.zza()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.zzas.zzbx     // Catch:{ all -> 0x09be }
            boolean r11 = r11.zza((com.google.android.gms.measurement.internal.zzej<java.lang.Boolean>) r12)     // Catch:{ all -> 0x09be }
            if (r11 != 0) goto L_0x0874
            long r11 = r3.zzl     // Catch:{ all -> 0x09be }
            r8.zzp(r11)     // Catch:{ all -> 0x09be }
        L_0x0874:
            long r11 = r3.zzt     // Catch:{ all -> 0x09be }
            r8.zzf((long) r11)     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzaf r11 = r26.zze()     // Catch:{ all -> 0x09be }
            r11.zza((com.google.android.gms.measurement.internal.zzf) r8)     // Catch:{ all -> 0x09be }
        L_0x0880:
            boolean r11 = com.google.android.gms.internal.measurement.zzml.zzb()     // Catch:{ all -> 0x09be }
            if (r11 == 0) goto L_0x089a
            com.google.android.gms.measurement.internal.zzfu r11 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzab r11 = r11.zza()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.zzas.zzci     // Catch:{ all -> 0x09be }
            boolean r11 = r11.zza((com.google.android.gms.measurement.internal.zzej<java.lang.Boolean>) r12)     // Catch:{ all -> 0x09be }
            if (r11 == 0) goto L_0x089a
            boolean r7 = r7.zze()     // Catch:{ all -> 0x09be }
            if (r7 == 0) goto L_0x08ab
        L_0x089a:
            java.lang.String r7 = r8.zzd()     // Catch:{ all -> 0x09be }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09be }
            if (r7 != 0) goto L_0x08ab
            java.lang.String r7 = r8.zzd()     // Catch:{ all -> 0x09be }
            r2.zzi((java.lang.String) r7)     // Catch:{ all -> 0x09be }
        L_0x08ab:
            java.lang.String r7 = r8.zzi()     // Catch:{ all -> 0x09be }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09be }
            if (r7 != 0) goto L_0x08bc
            java.lang.String r7 = r8.zzi()     // Catch:{ all -> 0x09be }
            r2.zzl((java.lang.String) r7)     // Catch:{ all -> 0x09be }
        L_0x08bc:
            com.google.android.gms.measurement.internal.zzaf r7 = r26.zze()     // Catch:{ all -> 0x09be }
            java.lang.String r3 = r3.zza     // Catch:{ all -> 0x09be }
            java.util.List r3 = r7.zza((java.lang.String) r3)     // Catch:{ all -> 0x09be }
            r7 = 0
        L_0x08c7:
            int r8 = r3.size()     // Catch:{ all -> 0x09be }
            if (r7 >= r8) goto L_0x08fe
            com.google.android.gms.internal.measurement.zzcd$zzk$zza r8 = com.google.android.gms.internal.measurement.zzcd.zzk.zzj()     // Catch:{ all -> 0x09be }
            java.lang.Object r11 = r3.get(r7)     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzkw r11 = (com.google.android.gms.measurement.internal.zzkw) r11     // Catch:{ all -> 0x09be }
            java.lang.String r11 = r11.zzc     // Catch:{ all -> 0x09be }
            com.google.android.gms.internal.measurement.zzcd$zzk$zza r8 = r8.zza((java.lang.String) r11)     // Catch:{ all -> 0x09be }
            java.lang.Object r11 = r3.get(r7)     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzkw r11 = (com.google.android.gms.measurement.internal.zzkw) r11     // Catch:{ all -> 0x09be }
            long r11 = r11.zzd     // Catch:{ all -> 0x09be }
            com.google.android.gms.internal.measurement.zzcd$zzk$zza r8 = r8.zza((long) r11)     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzkr r11 = r26.zzh()     // Catch:{ all -> 0x09be }
            java.lang.Object r12 = r3.get(r7)     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzkw r12 = (com.google.android.gms.measurement.internal.zzkw) r12     // Catch:{ all -> 0x09be }
            java.lang.Object r12 = r12.zze     // Catch:{ all -> 0x09be }
            r11.zza((com.google.android.gms.internal.measurement.zzcd.zzk.zza) r8, (java.lang.Object) r12)     // Catch:{ all -> 0x09be }
            r2.zza((com.google.android.gms.internal.measurement.zzcd.zzk.zza) r8)     // Catch:{ all -> 0x09be }
            int r7 = r7 + 1
            goto L_0x08c7
        L_0x08fe:
            com.google.android.gms.measurement.internal.zzaf r3 = r26.zze()     // Catch:{ IOException -> 0x0972 }
            com.google.android.gms.internal.measurement.zzjj r7 = r2.zzy()     // Catch:{ IOException -> 0x0972 }
            com.google.android.gms.internal.measurement.zzhy r7 = (com.google.android.gms.internal.measurement.zzhy) r7     // Catch:{ IOException -> 0x0972 }
            com.google.android.gms.internal.measurement.zzcd$zzg r7 = (com.google.android.gms.internal.measurement.zzcd.zzg) r7     // Catch:{ IOException -> 0x0972 }
            long r2 = r3.zza((com.google.android.gms.internal.measurement.zzcd.zzg) r7)     // Catch:{ IOException -> 0x0972 }
            com.google.android.gms.measurement.internal.zzaf r7 = r26.zze()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzap r8 = r4.zze     // Catch:{ all -> 0x09be }
            if (r8 == 0) goto L_0x0968
            com.google.android.gms.measurement.internal.zzap r8 = r4.zze     // Catch:{ all -> 0x09be }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x09be }
        L_0x091c:
            boolean r11 = r8.hasNext()     // Catch:{ all -> 0x09be }
            if (r11 == 0) goto L_0x092f
            java.lang.Object r11 = r8.next()     // Catch:{ all -> 0x09be }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x09be }
            boolean r11 = r5.equals(r11)     // Catch:{ all -> 0x09be }
            if (r11 == 0) goto L_0x091c
            goto L_0x0969
        L_0x092f:
            com.google.android.gms.measurement.internal.zzfo r5 = r26.zzc()     // Catch:{ all -> 0x09be }
            java.lang.String r8 = r4.zza     // Catch:{ all -> 0x09be }
            java.lang.String r11 = r4.zzb     // Catch:{ all -> 0x09be }
            boolean r5 = r5.zzc(r8, r11)     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzaf r11 = r26.zze()     // Catch:{ all -> 0x09be }
            long r12 = r26.zzy()     // Catch:{ all -> 0x09be }
            java.lang.String r14 = r4.zza     // Catch:{ all -> 0x09be }
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            com.google.android.gms.measurement.internal.zzae r8 = r11.zza(r12, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x09be }
            if (r5 == 0) goto L_0x0968
            long r11 = r8.zze     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzfu r5 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzab r5 = r5.zza()     // Catch:{ all -> 0x09be }
            java.lang.String r8 = r4.zza     // Catch:{ all -> 0x09be }
            int r5 = r5.zzc(r8)     // Catch:{ all -> 0x09be }
            long r13 = (long) r5     // Catch:{ all -> 0x09be }
            int r5 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x0968
            goto L_0x0969
        L_0x0968:
            r6 = 0
        L_0x0969:
            boolean r2 = r7.zza((com.google.android.gms.measurement.internal.zzan) r4, (long) r2, (boolean) r6)     // Catch:{ all -> 0x09be }
            if (r2 == 0) goto L_0x098b
            r1.zzn = r9     // Catch:{ all -> 0x09be }
            goto L_0x098b
        L_0x0972:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.zzfu r4 = r1.zzk     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzeq r4 = r4.zzq()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzes r4 = r4.zze()     // Catch:{ all -> 0x09be }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.zzj()     // Catch:{ all -> 0x09be }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r2)     // Catch:{ all -> 0x09be }
            r4.zza(r5, r2, r3)     // Catch:{ all -> 0x09be }
        L_0x098b:
            com.google.android.gms.measurement.internal.zzaf r2 = r26.zze()     // Catch:{ all -> 0x09be }
            r2.mo29304b_()     // Catch:{ all -> 0x09be }
            com.google.android.gms.measurement.internal.zzaf r2 = r26.zze()
            r2.zzg()
            r26.zzab()
            com.google.android.gms.measurement.internal.zzfu r2 = r1.zzk
            com.google.android.gms.measurement.internal.zzeq r2 = r2.zzq()
            com.google.android.gms.measurement.internal.zzes r2 = r2.zzw()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r23
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.zza(r4, r3)
            return
        L_0x09be:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.zzaf r3 = r26.zze()
            r3.zzg()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkl.zzc(com.google.android.gms.measurement.internal.zzaq, com.google.android.gms.measurement.internal.zzn):void");
    }

    private final String zza(zzac zzac) {
        if (!zzml.zzb() || !this.zzk.zza().zza(zzas.zzci) || zzac.zze()) {
            return zzz();
        }
        return null;
    }

    @Deprecated
    private final String zzz() {
        byte[] bArr = new byte[16];
        this.zzk.zzh().zzg().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:136|137) */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r1.zzk.zzq().zze().zza("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.zzeq.zza(r5), r0);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:136:0x0374 */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x022e A[Catch:{ all -> 0x03b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02c4 A[Catch:{ all -> 0x03b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02d5 A[Catch:{ all -> 0x03b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02f9 A[Catch:{ MalformedURLException -> 0x0374 }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02fb A[Catch:{ MalformedURLException -> 0x0374 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0303 A[Catch:{ MalformedURLException -> 0x0374 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0313 A[Catch:{ MalformedURLException -> 0x0374 }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x032b A[Catch:{ MalformedURLException -> 0x0374 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0227 A[Catch:{ all -> 0x03b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0228 A[Catch:{ all -> 0x03b0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzo() {
        /*
            r17 = this;
            r1 = r17
            r17.zzx()
            r17.zzn()
            r0 = 1
            r1.zzt = r0
            r2 = 0
            com.google.android.gms.measurement.internal.zzfu r3 = r1.zzk     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzir r3 = r3.zzv()     // Catch:{ all -> 0x03b0 }
            java.lang.Boolean r3 = r3.zzaf()     // Catch:{ all -> 0x03b0 }
            if (r3 != 0) goto L_0x002d
            com.google.android.gms.measurement.internal.zzfu r0 = r1.zzk     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzeq r0 = r0.zzq()     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzes r0 = r0.zzh()     // Catch:{ all -> 0x03b0 }
            java.lang.String r3 = "Upload data called on the client side before use of service was decided"
            r0.zza(r3)     // Catch:{ all -> 0x03b0 }
            r1.zzt = r2
            r17.zzac()
            return
        L_0x002d:
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x03b0 }
            if (r3 == 0) goto L_0x0048
            com.google.android.gms.measurement.internal.zzfu r0 = r1.zzk     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzeq r0 = r0.zzq()     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzes r0 = r0.zze()     // Catch:{ all -> 0x03b0 }
            java.lang.String r3 = "Upload called in the client side when service should be used"
            r0.zza(r3)     // Catch:{ all -> 0x03b0 }
            r1.zzt = r2
            r17.zzac()
            return
        L_0x0048:
            long r3 = r1.zzn     // Catch:{ all -> 0x03b0 }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0059
            r17.zzab()     // Catch:{ all -> 0x03b0 }
            r1.zzt = r2
            r17.zzac()
            return
        L_0x0059:
            r17.zzx()     // Catch:{ all -> 0x03b0 }
            java.util.List<java.lang.Long> r3 = r1.zzw     // Catch:{ all -> 0x03b0 }
            if (r3 == 0) goto L_0x0062
            r3 = 1
            goto L_0x0063
        L_0x0062:
            r3 = 0
        L_0x0063:
            if (r3 == 0) goto L_0x007a
            com.google.android.gms.measurement.internal.zzfu r0 = r1.zzk     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzeq r0 = r0.zzq()     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzes r0 = r0.zzw()     // Catch:{ all -> 0x03b0 }
            java.lang.String r3 = "Uploading requested multiple times"
            r0.zza(r3)     // Catch:{ all -> 0x03b0 }
            r1.zzt = r2
            r17.zzac()
            return
        L_0x007a:
            com.google.android.gms.measurement.internal.zzex r3 = r17.zzd()     // Catch:{ all -> 0x03b0 }
            boolean r3 = r3.zze()     // Catch:{ all -> 0x03b0 }
            if (r3 != 0) goto L_0x009c
            com.google.android.gms.measurement.internal.zzfu r0 = r1.zzk     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzeq r0 = r0.zzq()     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzes r0 = r0.zzw()     // Catch:{ all -> 0x03b0 }
            java.lang.String r3 = "Network not connected, ignoring upload request"
            r0.zza(r3)     // Catch:{ all -> 0x03b0 }
            r17.zzab()     // Catch:{ all -> 0x03b0 }
            r1.zzt = r2
            r17.zzac()
            return
        L_0x009c:
            com.google.android.gms.measurement.internal.zzfu r3 = r1.zzk     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.common.util.Clock r3 = r3.zzl()     // Catch:{ all -> 0x03b0 }
            long r3 = r3.currentTimeMillis()     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzfu r7 = r1.zzk     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzab r7 = r7.zza()     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzej<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.zzas.zzap     // Catch:{ all -> 0x03b0 }
            r9 = 0
            int r7 = r7.zzb(r9, r8)     // Catch:{ all -> 0x03b0 }
            long r10 = com.google.android.gms.measurement.internal.zzab.zzv()     // Catch:{ all -> 0x03b0 }
            long r10 = r3 - r10
            r8 = 0
        L_0x00ba:
            if (r8 >= r7) goto L_0x00c5
            boolean r12 = r1.zza((java.lang.String) r9, (long) r10)     // Catch:{ all -> 0x03b0 }
            if (r12 == 0) goto L_0x00c5
            int r8 = r8 + 1
            goto L_0x00ba
        L_0x00c5:
            com.google.android.gms.measurement.internal.zzfu r7 = r1.zzk     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzfc r7 = r7.zzb()     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzfg r7 = r7.zzc     // Catch:{ all -> 0x03b0 }
            long r7 = r7.zza()     // Catch:{ all -> 0x03b0 }
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x00ee
            com.google.android.gms.measurement.internal.zzfu r5 = r1.zzk     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzeq r5 = r5.zzq()     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzes r5 = r5.zzv()     // Catch:{ all -> 0x03b0 }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r7 = r3 - r7
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x03b0 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x03b0 }
            r5.zza(r6, r7)     // Catch:{ all -> 0x03b0 }
        L_0x00ee:
            com.google.android.gms.measurement.internal.zzaf r5 = r17.zze()     // Catch:{ all -> 0x03b0 }
            java.lang.String r5 = r5.mo29306d_()     // Catch:{ all -> 0x03b0 }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x03b0 }
            r7 = -1
            if (r6 != 0) goto L_0x0388
            long r10 = r1.zzy     // Catch:{ all -> 0x03b0 }
            int r6 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x010e
            com.google.android.gms.measurement.internal.zzaf r6 = r17.zze()     // Catch:{ all -> 0x03b0 }
            long r6 = r6.zzz()     // Catch:{ all -> 0x03b0 }
            r1.zzy = r6     // Catch:{ all -> 0x03b0 }
        L_0x010e:
            com.google.android.gms.measurement.internal.zzfu r6 = r1.zzk     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzab r6 = r6.zza()     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzej<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.zzas.zzf     // Catch:{ all -> 0x03b0 }
            int r6 = r6.zzb(r5, r7)     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzfu r7 = r1.zzk     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzab r7 = r7.zza()     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzej<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.zzas.zzg     // Catch:{ all -> 0x03b0 }
            int r7 = r7.zzb(r5, r8)     // Catch:{ all -> 0x03b0 }
            int r7 = java.lang.Math.max(r2, r7)     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzaf r8 = r17.zze()     // Catch:{ all -> 0x03b0 }
            java.util.List r6 = r8.zza((java.lang.String) r5, (int) r6, (int) r7)     // Catch:{ all -> 0x03b0 }
            boolean r7 = r6.isEmpty()     // Catch:{ all -> 0x03b0 }
            if (r7 != 0) goto L_0x03aa
            boolean r7 = com.google.android.gms.internal.measurement.zzml.zzb()     // Catch:{ all -> 0x03b0 }
            if (r7 == 0) goto L_0x0156
            com.google.android.gms.measurement.internal.zzfu r7 = r1.zzk     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzab r7 = r7.zza()     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.zzas.zzci     // Catch:{ all -> 0x03b0 }
            boolean r7 = r7.zza((com.google.android.gms.measurement.internal.zzej<java.lang.Boolean>) r8)     // Catch:{ all -> 0x03b0 }
            if (r7 == 0) goto L_0x0156
            com.google.android.gms.measurement.internal.zzac r7 = r1.zza((java.lang.String) r5)     // Catch:{ all -> 0x03b0 }
            boolean r7 = r7.zzc()     // Catch:{ all -> 0x03b0 }
            if (r7 == 0) goto L_0x01a9
        L_0x0156:
            java.util.Iterator r7 = r6.iterator()     // Catch:{ all -> 0x03b0 }
        L_0x015a:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x03b0 }
            if (r8 == 0) goto L_0x0179
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x03b0 }
            android.util.Pair r8 = (android.util.Pair) r8     // Catch:{ all -> 0x03b0 }
            java.lang.Object r8 = r8.first     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.internal.measurement.zzcd$zzg r8 = (com.google.android.gms.internal.measurement.zzcd.zzg) r8     // Catch:{ all -> 0x03b0 }
            java.lang.String r10 = r8.zzad()     // Catch:{ all -> 0x03b0 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x03b0 }
            if (r10 != 0) goto L_0x015a
            java.lang.String r7 = r8.zzad()     // Catch:{ all -> 0x03b0 }
            goto L_0x017a
        L_0x0179:
            r7 = r9
        L_0x017a:
            if (r7 == 0) goto L_0x01a9
            r8 = 0
        L_0x017d:
            int r10 = r6.size()     // Catch:{ all -> 0x03b0 }
            if (r8 >= r10) goto L_0x01a9
            java.lang.Object r10 = r6.get(r8)     // Catch:{ all -> 0x03b0 }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x03b0 }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.internal.measurement.zzcd$zzg r10 = (com.google.android.gms.internal.measurement.zzcd.zzg) r10     // Catch:{ all -> 0x03b0 }
            java.lang.String r11 = r10.zzad()     // Catch:{ all -> 0x03b0 }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x03b0 }
            if (r11 != 0) goto L_0x01a6
            java.lang.String r10 = r10.zzad()     // Catch:{ all -> 0x03b0 }
            boolean r10 = r10.equals(r7)     // Catch:{ all -> 0x03b0 }
            if (r10 != 0) goto L_0x01a6
            java.util.List r6 = r6.subList(r2, r8)     // Catch:{ all -> 0x03b0 }
            goto L_0x01a9
        L_0x01a6:
            int r8 = r8 + 1
            goto L_0x017d
        L_0x01a9:
            com.google.android.gms.internal.measurement.zzcd$zzf$zza r7 = com.google.android.gms.internal.measurement.zzcd.zzf.zzb()     // Catch:{ all -> 0x03b0 }
            int r8 = r6.size()     // Catch:{ all -> 0x03b0 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x03b0 }
            int r11 = r6.size()     // Catch:{ all -> 0x03b0 }
            r10.<init>(r11)     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzfu r11 = r1.zzk     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzab r11 = r11.zza()     // Catch:{ all -> 0x03b0 }
            boolean r11 = r11.zzh(r5)     // Catch:{ all -> 0x03b0 }
            if (r11 == 0) goto L_0x01e6
            boolean r11 = com.google.android.gms.internal.measurement.zzml.zzb()     // Catch:{ all -> 0x03b0 }
            if (r11 == 0) goto L_0x01e4
            com.google.android.gms.measurement.internal.zzfu r11 = r1.zzk     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzab r11 = r11.zza()     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.zzas.zzci     // Catch:{ all -> 0x03b0 }
            boolean r11 = r11.zza((com.google.android.gms.measurement.internal.zzej<java.lang.Boolean>) r12)     // Catch:{ all -> 0x03b0 }
            if (r11 == 0) goto L_0x01e4
            com.google.android.gms.measurement.internal.zzac r11 = r1.zza((java.lang.String) r5)     // Catch:{ all -> 0x03b0 }
            boolean r11 = r11.zzc()     // Catch:{ all -> 0x03b0 }
            if (r11 == 0) goto L_0x01e6
        L_0x01e4:
            r11 = 1
            goto L_0x01e7
        L_0x01e6:
            r11 = 0
        L_0x01e7:
            boolean r12 = com.google.android.gms.internal.measurement.zzml.zzb()     // Catch:{ all -> 0x03b0 }
            if (r12 == 0) goto L_0x0208
            com.google.android.gms.measurement.internal.zzfu r12 = r1.zzk     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzab r12 = r12.zza()     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.zzas.zzci     // Catch:{ all -> 0x03b0 }
            boolean r12 = r12.zza((com.google.android.gms.measurement.internal.zzej<java.lang.Boolean>) r13)     // Catch:{ all -> 0x03b0 }
            if (r12 == 0) goto L_0x0208
            com.google.android.gms.measurement.internal.zzac r12 = r1.zza((java.lang.String) r5)     // Catch:{ all -> 0x03b0 }
            boolean r12 = r12.zzc()     // Catch:{ all -> 0x03b0 }
            if (r12 == 0) goto L_0x0206
            goto L_0x0208
        L_0x0206:
            r12 = 0
            goto L_0x0209
        L_0x0208:
            r12 = 1
        L_0x0209:
            boolean r13 = com.google.android.gms.internal.measurement.zzml.zzb()     // Catch:{ all -> 0x03b0 }
            if (r13 == 0) goto L_0x022a
            com.google.android.gms.measurement.internal.zzfu r13 = r1.zzk     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzab r13 = r13.zza()     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.zzas.zzci     // Catch:{ all -> 0x03b0 }
            boolean r13 = r13.zza((com.google.android.gms.measurement.internal.zzej<java.lang.Boolean>) r14)     // Catch:{ all -> 0x03b0 }
            if (r13 == 0) goto L_0x022a
            com.google.android.gms.measurement.internal.zzac r13 = r1.zza((java.lang.String) r5)     // Catch:{ all -> 0x03b0 }
            boolean r13 = r13.zze()     // Catch:{ all -> 0x03b0 }
            if (r13 == 0) goto L_0x0228
            goto L_0x022a
        L_0x0228:
            r13 = 0
            goto L_0x022b
        L_0x022a:
            r13 = 1
        L_0x022b:
            r14 = 0
        L_0x022c:
            if (r14 >= r8) goto L_0x02b5
            java.lang.Object r15 = r6.get(r14)     // Catch:{ all -> 0x03b0 }
            android.util.Pair r15 = (android.util.Pair) r15     // Catch:{ all -> 0x03b0 }
            java.lang.Object r15 = r15.first     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.internal.measurement.zzcd$zzg r15 = (com.google.android.gms.internal.measurement.zzcd.zzg) r15     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.internal.measurement.zzhy$zzb r15 = r15.zzbo()     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.internal.measurement.zzhy$zzb r15 = (com.google.android.gms.internal.measurement.zzhy.zzb) r15     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.internal.measurement.zzcd$zzg$zza r15 = (com.google.android.gms.internal.measurement.zzcd.zzg.zza) r15     // Catch:{ all -> 0x03b0 }
            java.lang.Object r16 = r6.get(r14)     // Catch:{ all -> 0x03b0 }
            r0 = r16
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x03b0 }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x03b0 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x03b0 }
            r10.add(r0)     // Catch:{ all -> 0x03b0 }
            r16 = r10
            r9 = 33025(0x8101, double:1.63165E-319)
            com.google.android.gms.internal.measurement.zzcd$zzg$zza r9 = r15.zzg((long) r9)     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.internal.measurement.zzcd$zzg$zza r9 = r9.zza((long) r3)     // Catch:{ all -> 0x03b0 }
            r9.zzb((boolean) r2)     // Catch:{ all -> 0x03b0 }
            if (r11 != 0) goto L_0x0264
            r15.zzr()     // Catch:{ all -> 0x03b0 }
        L_0x0264:
            boolean r9 = com.google.android.gms.internal.measurement.zzml.zzb()     // Catch:{ all -> 0x03b0 }
            if (r9 == 0) goto L_0x0285
            com.google.android.gms.measurement.internal.zzfu r9 = r1.zzk     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzab r9 = r9.zza()     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r10 = com.google.android.gms.measurement.internal.zzas.zzci     // Catch:{ all -> 0x03b0 }
            boolean r9 = r9.zza((com.google.android.gms.measurement.internal.zzej<java.lang.Boolean>) r10)     // Catch:{ all -> 0x03b0 }
            if (r9 == 0) goto L_0x0285
            if (r12 != 0) goto L_0x0280
            r15.zzk()     // Catch:{ all -> 0x03b0 }
            r15.zzl()     // Catch:{ all -> 0x03b0 }
        L_0x0280:
            if (r13 != 0) goto L_0x0285
            r15.zzm()     // Catch:{ all -> 0x03b0 }
        L_0x0285:
            com.google.android.gms.measurement.internal.zzfu r9 = r1.zzk     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzab r9 = r9.zza()     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r10 = com.google.android.gms.measurement.internal.zzas.zzaw     // Catch:{ all -> 0x03b0 }
            boolean r9 = r9.zze(r5, r10)     // Catch:{ all -> 0x03b0 }
            if (r9 == 0) goto L_0x02aa
            com.google.android.gms.internal.measurement.zzjj r9 = r15.zzy()     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.internal.measurement.zzhy r9 = (com.google.android.gms.internal.measurement.zzhy) r9     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.internal.measurement.zzcd$zzg r9 = (com.google.android.gms.internal.measurement.zzcd.zzg) r9     // Catch:{ all -> 0x03b0 }
            byte[] r9 = r9.zzbk()     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzkr r10 = r17.zzh()     // Catch:{ all -> 0x03b0 }
            long r9 = r10.zza((byte[]) r9)     // Catch:{ all -> 0x03b0 }
            r15.zzl((long) r9)     // Catch:{ all -> 0x03b0 }
        L_0x02aa:
            r7.zza((com.google.android.gms.internal.measurement.zzcd.zzg.zza) r15)     // Catch:{ all -> 0x03b0 }
            int r14 = r14 + 1
            r10 = r16
            r0 = 1
            r9 = 0
            goto L_0x022c
        L_0x02b5:
            r16 = r10
            com.google.android.gms.measurement.internal.zzfu r6 = r1.zzk     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzeq r6 = r6.zzq()     // Catch:{ all -> 0x03b0 }
            r9 = 2
            boolean r6 = r6.zza((int) r9)     // Catch:{ all -> 0x03b0 }
            if (r6 == 0) goto L_0x02d5
            com.google.android.gms.measurement.internal.zzkr r6 = r17.zzh()     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.internal.measurement.zzjj r9 = r7.zzy()     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.internal.measurement.zzhy r9 = (com.google.android.gms.internal.measurement.zzhy) r9     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.internal.measurement.zzcd$zzf r9 = (com.google.android.gms.internal.measurement.zzcd.zzf) r9     // Catch:{ all -> 0x03b0 }
            java.lang.String r9 = r6.zza((com.google.android.gms.internal.measurement.zzcd.zzf) r9)     // Catch:{ all -> 0x03b0 }
            goto L_0x02d6
        L_0x02d5:
            r9 = 0
        L_0x02d6:
            r17.zzh()     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.internal.measurement.zzjj r6 = r7.zzy()     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.internal.measurement.zzhy r6 = (com.google.android.gms.internal.measurement.zzhy) r6     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.internal.measurement.zzcd$zzf r6 = (com.google.android.gms.internal.measurement.zzcd.zzf) r6     // Catch:{ all -> 0x03b0 }
            byte[] r14 = r6.zzbk()     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzej<java.lang.String> r6 = com.google.android.gms.measurement.internal.zzas.zzp     // Catch:{ all -> 0x03b0 }
            r0 = 0
            java.lang.Object r0 = r6.zza(r0)     // Catch:{ all -> 0x03b0 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x03b0 }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0374 }
            r13.<init>(r0)     // Catch:{ MalformedURLException -> 0x0374 }
            boolean r6 = r16.isEmpty()     // Catch:{ MalformedURLException -> 0x0374 }
            if (r6 != 0) goto L_0x02fb
            r6 = 1
            goto L_0x02fc
        L_0x02fb:
            r6 = 0
        L_0x02fc:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r6)     // Catch:{ MalformedURLException -> 0x0374 }
            java.util.List<java.lang.Long> r6 = r1.zzw     // Catch:{ MalformedURLException -> 0x0374 }
            if (r6 == 0) goto L_0x0313
            com.google.android.gms.measurement.internal.zzfu r6 = r1.zzk     // Catch:{ MalformedURLException -> 0x0374 }
            com.google.android.gms.measurement.internal.zzeq r6 = r6.zzq()     // Catch:{ MalformedURLException -> 0x0374 }
            com.google.android.gms.measurement.internal.zzes r6 = r6.zze()     // Catch:{ MalformedURLException -> 0x0374 }
            java.lang.String r10 = "Set uploading progress before finishing the previous upload"
            r6.zza(r10)     // Catch:{ MalformedURLException -> 0x0374 }
            goto L_0x031c
        L_0x0313:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x0374 }
            r10 = r16
            r6.<init>(r10)     // Catch:{ MalformedURLException -> 0x0374 }
            r1.zzw = r6     // Catch:{ MalformedURLException -> 0x0374 }
        L_0x031c:
            com.google.android.gms.measurement.internal.zzfu r6 = r1.zzk     // Catch:{ MalformedURLException -> 0x0374 }
            com.google.android.gms.measurement.internal.zzfc r6 = r6.zzb()     // Catch:{ MalformedURLException -> 0x0374 }
            com.google.android.gms.measurement.internal.zzfg r6 = r6.zzd     // Catch:{ MalformedURLException -> 0x0374 }
            r6.zza(r3)     // Catch:{ MalformedURLException -> 0x0374 }
            java.lang.String r3 = "?"
            if (r8 <= 0) goto L_0x0333
            com.google.android.gms.internal.measurement.zzcd$zzg r3 = r7.zza((int) r2)     // Catch:{ MalformedURLException -> 0x0374 }
            java.lang.String r3 = r3.zzx()     // Catch:{ MalformedURLException -> 0x0374 }
        L_0x0333:
            com.google.android.gms.measurement.internal.zzfu r4 = r1.zzk     // Catch:{ MalformedURLException -> 0x0374 }
            com.google.android.gms.measurement.internal.zzeq r4 = r4.zzq()     // Catch:{ MalformedURLException -> 0x0374 }
            com.google.android.gms.measurement.internal.zzes r4 = r4.zzw()     // Catch:{ MalformedURLException -> 0x0374 }
            java.lang.String r6 = "Uploading data. app, uncompressed size, data"
            int r7 = r14.length     // Catch:{ MalformedURLException -> 0x0374 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ MalformedURLException -> 0x0374 }
            r4.zza(r6, r3, r7, r9)     // Catch:{ MalformedURLException -> 0x0374 }
            r3 = 1
            r1.zzs = r3     // Catch:{ MalformedURLException -> 0x0374 }
            com.google.android.gms.measurement.internal.zzex r11 = r17.zzd()     // Catch:{ MalformedURLException -> 0x0374 }
            com.google.android.gms.measurement.internal.zzkn r3 = new com.google.android.gms.measurement.internal.zzkn     // Catch:{ MalformedURLException -> 0x0374 }
            r3.<init>(r1, r5)     // Catch:{ MalformedURLException -> 0x0374 }
            r11.zzc()     // Catch:{ MalformedURLException -> 0x0374 }
            r11.zzaj()     // Catch:{ MalformedURLException -> 0x0374 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r13)     // Catch:{ MalformedURLException -> 0x0374 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r14)     // Catch:{ MalformedURLException -> 0x0374 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch:{ MalformedURLException -> 0x0374 }
            com.google.android.gms.measurement.internal.zzfr r4 = r11.zzp()     // Catch:{ MalformedURLException -> 0x0374 }
            com.google.android.gms.measurement.internal.zzfb r6 = new com.google.android.gms.measurement.internal.zzfb     // Catch:{ MalformedURLException -> 0x0374 }
            r15 = 0
            r10 = r6
            r12 = r5
            r16 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x0374 }
            r4.zzc((java.lang.Runnable) r6)     // Catch:{ MalformedURLException -> 0x0374 }
            goto L_0x03aa
        L_0x0374:
            com.google.android.gms.measurement.internal.zzfu r3 = r1.zzk     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzeq r3 = r3.zzq()     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzes r3 = r3.zze()     // Catch:{ all -> 0x03b0 }
            java.lang.String r4 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r5)     // Catch:{ all -> 0x03b0 }
            r3.zza(r4, r5, r0)     // Catch:{ all -> 0x03b0 }
            goto L_0x03aa
        L_0x0388:
            r1.zzy = r7     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzaf r0 = r17.zze()     // Catch:{ all -> 0x03b0 }
            long r5 = com.google.android.gms.measurement.internal.zzab.zzv()     // Catch:{ all -> 0x03b0 }
            long r3 = r3 - r5
            java.lang.String r0 = r0.zza((long) r3)     // Catch:{ all -> 0x03b0 }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x03b0 }
            if (r3 != 0) goto L_0x03aa
            com.google.android.gms.measurement.internal.zzaf r3 = r17.zze()     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.measurement.internal.zzf r0 = r3.zzb(r0)     // Catch:{ all -> 0x03b0 }
            if (r0 == 0) goto L_0x03aa
            r1.zza((com.google.android.gms.measurement.internal.zzf) r0)     // Catch:{ all -> 0x03b0 }
        L_0x03aa:
            r1.zzt = r2
            r17.zzac()
            return
        L_0x03b0:
            r0 = move-exception
            r1.zzt = r2
            r17.zzac()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkl.zzo():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0248, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0249, code lost:
        r6 = r4;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        r6 = null;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:613:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0042 A[ExcHandler: all (th java.lang.Throwable), PHI: r4 
      PHI: (r4v119 android.database.Cursor) = (r4v113 android.database.Cursor), (r4v113 android.database.Cursor), (r4v113 android.database.Cursor), (r4v125 android.database.Cursor), (r4v125 android.database.Cursor), (r4v125 android.database.Cursor), (r4v125 android.database.Cursor), (r4v1 android.database.Cursor), (r4v1 android.database.Cursor) binds: [B:47:0x00d8, B:53:0x00e5, B:54:?, B:24:0x007b, B:30:0x0088, B:32:0x008c, B:33:?, B:9:0x0033, B:10:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:9:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x026a A[SYNTHETIC, Splitter:B:128:0x026a] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0271 A[Catch:{ IOException -> 0x0227, all -> 0x0ff3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x027f A[Catch:{ IOException -> 0x0227, all -> 0x0ff3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0455 A[Catch:{ IOException -> 0x0227, all -> 0x0ff3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0457 A[Catch:{ IOException -> 0x0227, all -> 0x0ff3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x045a A[Catch:{ IOException -> 0x0227, all -> 0x0ff3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x045b A[Catch:{ IOException -> 0x0227, all -> 0x0ff3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0644 A[Catch:{ IOException -> 0x0227, all -> 0x0ff3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x071f A[Catch:{ IOException -> 0x0227, all -> 0x0ff3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x089c A[Catch:{ IOException -> 0x0227, all -> 0x0ff3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x08b2 A[Catch:{ IOException -> 0x0227, all -> 0x0ff3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x08cc A[Catch:{ IOException -> 0x0227, all -> 0x0ff3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:477:0x0c51 A[Catch:{ IOException -> 0x0227, all -> 0x0ff3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:478:0x0c64 A[Catch:{ IOException -> 0x0227, all -> 0x0ff3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x0c67 A[Catch:{ IOException -> 0x0227, all -> 0x0ff3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:481:0x0c8e A[SYNTHETIC, Splitter:B:481:0x0c8e] */
    /* JADX WARNING: Removed duplicated region for block: B:604:0x0fd6  */
    /* JADX WARNING: Removed duplicated region for block: B:612:0x0fed A[SYNTHETIC, Splitter:B:612:0x0fed] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zza(java.lang.String r44, long r45) {
        /*
            r43 = this;
            r1 = r43
            java.lang.String r2 = ""
            com.google.android.gms.measurement.internal.zzaf r3 = r43.zze()
            r3.zze()
            com.google.android.gms.measurement.internal.zzkl$zza r3 = new com.google.android.gms.measurement.internal.zzkl$zza     // Catch:{ all -> 0x0ff3 }
            r4 = 0
            r3.<init>(r1, r4)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzaf r5 = r43.zze()     // Catch:{ all -> 0x0ff3 }
            long r6 = r1.zzy     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch:{ all -> 0x0ff3 }
            r5.zzc()     // Catch:{ all -> 0x0ff3 }
            r5.zzaj()     // Catch:{ all -> 0x0ff3 }
            r9 = -1
            r11 = 2
            r12 = 0
            r13 = 1
            android.database.sqlite.SQLiteDatabase r15 = r5.mo29305c_()     // Catch:{ SQLiteException -> 0x0253, all -> 0x024d }
            boolean r14 = android.text.TextUtils.isEmpty(r4)     // Catch:{ SQLiteException -> 0x0253, all -> 0x024d }
            if (r14 == 0) goto L_0x009c
            int r14 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r14 == 0) goto L_0x004d
            java.lang.String[] r8 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0047, all -> 0x0042 }
            java.lang.String r16 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x0047, all -> 0x0042 }
            r8[r12] = r16     // Catch:{ SQLiteException -> 0x0047, all -> 0x0042 }
            java.lang.String r16 = java.lang.String.valueOf(r45)     // Catch:{ SQLiteException -> 0x0047, all -> 0x0042 }
            r8[r13] = r16     // Catch:{ SQLiteException -> 0x0047, all -> 0x0042 }
            goto L_0x0055
        L_0x0042:
            r0 = move-exception
            r8 = r4
        L_0x0044:
            r4 = r1
            goto L_0x0250
        L_0x0047:
            r0 = move-exception
            r6 = r4
            r8 = r6
        L_0x004a:
            r4 = r0
            goto L_0x0257
        L_0x004d:
            java.lang.String[] r8 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0253, all -> 0x024d }
            java.lang.String r16 = java.lang.String.valueOf(r45)     // Catch:{ SQLiteException -> 0x0253, all -> 0x024d }
            r8[r12] = r16     // Catch:{ SQLiteException -> 0x0253, all -> 0x024d }
        L_0x0055:
            if (r14 == 0) goto L_0x005a
            java.lang.String r14 = "rowid <= ? and "
            goto L_0x005b
        L_0x005a:
            r14 = r2
        L_0x005b:
            int r4 = r14.length()     // Catch:{ SQLiteException -> 0x0253, all -> 0x024d }
            int r4 = r4 + 148
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0253, all -> 0x024d }
            r11.<init>(r4)     // Catch:{ SQLiteException -> 0x0253, all -> 0x024d }
            java.lang.String r4 = "select app_id, metadata_fingerprint from raw_events where "
            r11.append(r4)     // Catch:{ SQLiteException -> 0x0253, all -> 0x024d }
            r11.append(r14)     // Catch:{ SQLiteException -> 0x0253, all -> 0x024d }
            java.lang.String r4 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r11.append(r4)     // Catch:{ SQLiteException -> 0x0253, all -> 0x024d }
            java.lang.String r4 = r11.toString()     // Catch:{ SQLiteException -> 0x0253, all -> 0x024d }
            android.database.Cursor r4 = r15.rawQuery(r4, r8)     // Catch:{ SQLiteException -> 0x0253, all -> 0x024d }
            boolean r8 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0248, all -> 0x0042 }
            if (r8 != 0) goto L_0x0088
            if (r4 == 0) goto L_0x026d
            r4.close()     // Catch:{ all -> 0x0ff3 }
            goto L_0x026d
        L_0x0088:
            java.lang.String r8 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x0248, all -> 0x0042 }
            java.lang.String r11 = r4.getString(r13)     // Catch:{ SQLiteException -> 0x0099, all -> 0x0042 }
            r4.close()     // Catch:{ SQLiteException -> 0x0099, all -> 0x0042 }
            r42 = r8
            r8 = r4
            r4 = r42
            goto L_0x00ee
        L_0x0099:
            r0 = move-exception
            r6 = r4
            goto L_0x004a
        L_0x009c:
            int r4 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x00ad
            r8 = 2
            java.lang.String[] r11 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x0253, all -> 0x024d }
            r8 = 0
            r11[r12] = r8     // Catch:{ SQLiteException -> 0x0253, all -> 0x024d }
            java.lang.String r8 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x0253, all -> 0x024d }
            r11[r13] = r8     // Catch:{ SQLiteException -> 0x0253, all -> 0x024d }
            goto L_0x00b2
        L_0x00ad:
            r8 = 0
            java.lang.String[] r11 = new java.lang.String[]{r8}     // Catch:{ SQLiteException -> 0x0253, all -> 0x024d }
        L_0x00b2:
            if (r4 == 0) goto L_0x00b7
            java.lang.String r4 = " and rowid <= ?"
            goto L_0x00b8
        L_0x00b7:
            r4 = r2
        L_0x00b8:
            int r8 = r4.length()     // Catch:{ SQLiteException -> 0x0253, all -> 0x024d }
            int r8 = r8 + 84
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0253, all -> 0x024d }
            r14.<init>(r8)     // Catch:{ SQLiteException -> 0x0253, all -> 0x024d }
            java.lang.String r8 = "select metadata_fingerprint from raw_events where app_id = ?"
            r14.append(r8)     // Catch:{ SQLiteException -> 0x0253, all -> 0x024d }
            r14.append(r4)     // Catch:{ SQLiteException -> 0x0253, all -> 0x024d }
            java.lang.String r4 = " order by rowid limit 1;"
            r14.append(r4)     // Catch:{ SQLiteException -> 0x0253, all -> 0x024d }
            java.lang.String r4 = r14.toString()     // Catch:{ SQLiteException -> 0x0253, all -> 0x024d }
            android.database.Cursor r4 = r15.rawQuery(r4, r11)     // Catch:{ SQLiteException -> 0x0253, all -> 0x024d }
            boolean r8 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0248, all -> 0x0042 }
            if (r8 != 0) goto L_0x00e5
            if (r4 == 0) goto L_0x026d
            r4.close()     // Catch:{ all -> 0x0ff3 }
            goto L_0x026d
        L_0x00e5:
            java.lang.String r11 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x0248, all -> 0x0042 }
            r4.close()     // Catch:{ SQLiteException -> 0x0248, all -> 0x0042 }
            r8 = r4
            r4 = 0
        L_0x00ee:
            java.lang.String r16 = "raw_events_metadata"
            java.lang.String r14 = "metadata"
            java.lang.String[] r17 = new java.lang.String[]{r14}     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            java.lang.String r18 = "app_id = ? and metadata_fingerprint = ?"
            r14 = 2
            java.lang.String[] r9 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            r9[r12] = r4     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            r9[r13] = r11     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            r19 = 0
            r20 = 0
            java.lang.String r21 = "rowid"
            java.lang.String r22 = "2"
            r14 = r15
            r10 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r9
            android.database.Cursor r8 = r14.query(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            boolean r9 = r8.moveToFirst()     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            if (r9 != 0) goto L_0x0133
            com.google.android.gms.measurement.internal.zzeq r6 = r5.zzq()     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            com.google.android.gms.measurement.internal.zzes r6 = r6.zze()     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            java.lang.String r7 = "Raw event metadata record is missing. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r4)     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            r6.zza(r7, r9)     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            if (r8 == 0) goto L_0x026d
            r8.close()     // Catch:{ all -> 0x0ff3 }
            goto L_0x026d
        L_0x0133:
            byte[] r9 = r8.getBlob(r12)     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            com.google.android.gms.internal.measurement.zzcd$zzg$zza r14 = com.google.android.gms.internal.measurement.zzcd.zzg.zzbh()     // Catch:{ IOException -> 0x0227 }
            com.google.android.gms.internal.measurement.zzji r9 = com.google.android.gms.measurement.internal.zzkr.zza(r14, (byte[]) r9)     // Catch:{ IOException -> 0x0227 }
            com.google.android.gms.internal.measurement.zzcd$zzg$zza r9 = (com.google.android.gms.internal.measurement.zzcd.zzg.zza) r9     // Catch:{ IOException -> 0x0227 }
            com.google.android.gms.internal.measurement.zzjj r9 = r9.zzy()     // Catch:{ IOException -> 0x0227 }
            com.google.android.gms.internal.measurement.zzhy r9 = (com.google.android.gms.internal.measurement.zzhy) r9     // Catch:{ IOException -> 0x0227 }
            com.google.android.gms.internal.measurement.zzcd$zzg r9 = (com.google.android.gms.internal.measurement.zzcd.zzg) r9     // Catch:{ IOException -> 0x0227 }
            boolean r14 = r8.moveToNext()     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            if (r14 == 0) goto L_0x0160
            com.google.android.gms.measurement.internal.zzeq r14 = r5.zzq()     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            com.google.android.gms.measurement.internal.zzes r14 = r14.zzh()     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            java.lang.String r15 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r4)     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            r14.zza(r15, r13)     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
        L_0x0160:
            r8.close()     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            r3.zza(r9)     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            r13 = -1
            int r9 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x0182
            java.lang.String r9 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            r13 = 3
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            r14[r12] = r4     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            r13 = 1
            r14[r13] = r11     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            r7 = 2
            r14[r7] = r6     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            r17 = r9
            r18 = r14
            goto L_0x0190
        L_0x0182:
            java.lang.String r6 = "app_id = ? and metadata_fingerprint = ?"
            r7 = 2
            java.lang.String[] r9 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            r9[r12] = r4     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            r7 = 1
            r9[r7] = r11     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            r17 = r6
            r18 = r9
        L_0x0190:
            java.lang.String r15 = "raw_events"
            java.lang.String r6 = "rowid"
            java.lang.String r7 = "name"
            java.lang.String r9 = "timestamp"
            java.lang.String r11 = "data"
            java.lang.String[] r16 = new java.lang.String[]{r6, r7, r9, r11}     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            r19 = 0
            r20 = 0
            java.lang.String r21 = "rowid"
            r22 = 0
            r14 = r10
            android.database.Cursor r6 = r14.query(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            boolean r7 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x0225, all -> 0x0221 }
            if (r7 != 0) goto L_0x01c9
            com.google.android.gms.measurement.internal.zzeq r7 = r5.zzq()     // Catch:{ SQLiteException -> 0x0225, all -> 0x0221 }
            com.google.android.gms.measurement.internal.zzes r7 = r7.zzh()     // Catch:{ SQLiteException -> 0x0225, all -> 0x0221 }
            java.lang.String r8 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r4)     // Catch:{ SQLiteException -> 0x0225, all -> 0x0221 }
            r7.zza(r8, r9)     // Catch:{ SQLiteException -> 0x0225, all -> 0x0221 }
            if (r6 == 0) goto L_0x026d
            r6.close()     // Catch:{ all -> 0x0ff3 }
            goto L_0x026d
        L_0x01c9:
            long r7 = r6.getLong(r12)     // Catch:{ SQLiteException -> 0x0225, all -> 0x0221 }
            r9 = 3
            byte[] r10 = r6.getBlob(r9)     // Catch:{ SQLiteException -> 0x0225, all -> 0x0221 }
            com.google.android.gms.internal.measurement.zzcd$zzc$zza r9 = com.google.android.gms.internal.measurement.zzcd.zzc.zzj()     // Catch:{ IOException -> 0x0202 }
            com.google.android.gms.internal.measurement.zzji r9 = com.google.android.gms.measurement.internal.zzkr.zza(r9, (byte[]) r10)     // Catch:{ IOException -> 0x0202 }
            com.google.android.gms.internal.measurement.zzcd$zzc$zza r9 = (com.google.android.gms.internal.measurement.zzcd.zzc.zza) r9     // Catch:{ IOException -> 0x0202 }
            r10 = 1
            java.lang.String r11 = r6.getString(r10)     // Catch:{ SQLiteException -> 0x0225, all -> 0x0221 }
            com.google.android.gms.internal.measurement.zzcd$zzc$zza r10 = r9.zza((java.lang.String) r11)     // Catch:{ SQLiteException -> 0x0225, all -> 0x0221 }
            r11 = 2
            long r13 = r6.getLong(r11)     // Catch:{ SQLiteException -> 0x0225, all -> 0x0221 }
            r10.zza((long) r13)     // Catch:{ SQLiteException -> 0x0225, all -> 0x0221 }
            com.google.android.gms.internal.measurement.zzjj r9 = r9.zzy()     // Catch:{ SQLiteException -> 0x0225, all -> 0x0221 }
            com.google.android.gms.internal.measurement.zzhy r9 = (com.google.android.gms.internal.measurement.zzhy) r9     // Catch:{ SQLiteException -> 0x0225, all -> 0x0221 }
            com.google.android.gms.internal.measurement.zzcd$zzc r9 = (com.google.android.gms.internal.measurement.zzcd.zzc) r9     // Catch:{ SQLiteException -> 0x0225, all -> 0x0221 }
            boolean r7 = r3.zza(r7, r9)     // Catch:{ SQLiteException -> 0x0225, all -> 0x0221 }
            if (r7 != 0) goto L_0x0215
            if (r6 == 0) goto L_0x026d
            r6.close()     // Catch:{ all -> 0x0ff3 }
            goto L_0x026d
        L_0x0202:
            r0 = move-exception
            r7 = r0
            com.google.android.gms.measurement.internal.zzeq r8 = r5.zzq()     // Catch:{ SQLiteException -> 0x0225, all -> 0x0221 }
            com.google.android.gms.measurement.internal.zzes r8 = r8.zze()     // Catch:{ SQLiteException -> 0x0225, all -> 0x0221 }
            java.lang.String r9 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r4)     // Catch:{ SQLiteException -> 0x0225, all -> 0x0221 }
            r8.zza(r9, r10, r7)     // Catch:{ SQLiteException -> 0x0225, all -> 0x0221 }
        L_0x0215:
            boolean r7 = r6.moveToNext()     // Catch:{ SQLiteException -> 0x0225, all -> 0x0221 }
            if (r7 != 0) goto L_0x01c9
            if (r6 == 0) goto L_0x026d
            r6.close()     // Catch:{ all -> 0x0ff3 }
            goto L_0x026d
        L_0x0221:
            r0 = move-exception
            r4 = r1
            r8 = r6
            goto L_0x0250
        L_0x0225:
            r0 = move-exception
            goto L_0x0245
        L_0x0227:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.zzeq r7 = r5.zzq()     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            com.google.android.gms.measurement.internal.zzes r7 = r7.zze()     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            java.lang.String r9 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r4)     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            r7.zza(r9, r10, r6)     // Catch:{ SQLiteException -> 0x0243, all -> 0x0240 }
            if (r8 == 0) goto L_0x026d
            r8.close()     // Catch:{ all -> 0x0ff3 }
            goto L_0x026d
        L_0x0240:
            r0 = move-exception
            goto L_0x0044
        L_0x0243:
            r0 = move-exception
            r6 = r8
        L_0x0245:
            r8 = r4
            goto L_0x004a
        L_0x0248:
            r0 = move-exception
            r6 = r4
            r8 = 0
            goto L_0x004a
        L_0x024d:
            r0 = move-exception
            r4 = r1
            r8 = 0
        L_0x0250:
            r1 = r0
            goto L_0x0feb
        L_0x0253:
            r0 = move-exception
            r4 = r0
            r6 = 0
            r8 = 0
        L_0x0257:
            com.google.android.gms.measurement.internal.zzeq r5 = r5.zzq()     // Catch:{ all -> 0x0fe7 }
            com.google.android.gms.measurement.internal.zzes r5 = r5.zze()     // Catch:{ all -> 0x0fe7 }
            java.lang.String r7 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r8)     // Catch:{ all -> 0x0fe7 }
            r5.zza(r7, r8, r4)     // Catch:{ all -> 0x0fe7 }
            if (r6 == 0) goto L_0x026d
            r6.close()     // Catch:{ all -> 0x0ff3 }
        L_0x026d:
            java.util.List<com.google.android.gms.internal.measurement.zzcd$zzc> r4 = r3.zzc     // Catch:{ all -> 0x0ff3 }
            if (r4 == 0) goto L_0x027c
            java.util.List<com.google.android.gms.internal.measurement.zzcd$zzc> r4 = r3.zzc     // Catch:{ all -> 0x0ff3 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0ff3 }
            if (r4 == 0) goto L_0x027a
            goto L_0x027c
        L_0x027a:
            r4 = 0
            goto L_0x027d
        L_0x027c:
            r4 = 1
        L_0x027d:
            if (r4 != 0) goto L_0x0fd6
            com.google.android.gms.internal.measurement.zzcd$zzg r4 = r3.zza     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzhy$zzb r4 = r4.zzbo()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzhy$zzb r4 = (com.google.android.gms.internal.measurement.zzhy.zzb) r4     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzg$zza r4 = (com.google.android.gms.internal.measurement.zzcd.zzg.zza) r4     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzg$zza r4 = r4.zzc()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzfu r5 = r1.zzk     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzab r5 = r5.zza()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzg r6 = r3.zza     // Catch:{ all -> 0x0ff3 }
            java.lang.String r6 = r6.zzx()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.zzas.zzat     // Catch:{ all -> 0x0ff3 }
            boolean r5 = r5.zze(r6, r7)     // Catch:{ all -> 0x0ff3 }
            r8 = 0
            r9 = 0
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = -1
            r17 = 0
            r18 = 0
        L_0x02aa:
            java.util.List<com.google.android.gms.internal.measurement.zzcd$zzc> r6 = r3.zzc     // Catch:{ all -> 0x0ff3 }
            int r6 = r6.size()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r7 = "_et"
            java.lang.String r11 = "_e"
            r20 = r13
            r21 = r14
            if (r8 >= r6) goto L_0x0924
            java.util.List<com.google.android.gms.internal.measurement.zzcd$zzc> r6 = r3.zzc     // Catch:{ all -> 0x0ff3 }
            java.lang.Object r6 = r6.get(r8)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzc r6 = (com.google.android.gms.internal.measurement.zzcd.zzc) r6     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzhy$zzb r6 = r6.zzbo()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzhy$zzb r6 = (com.google.android.gms.internal.measurement.zzhy.zzb) r6     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzc$zza r6 = (com.google.android.gms.internal.measurement.zzcd.zzc.zza) r6     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzfo r13 = r43.zzc()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzg r14 = r3.zza     // Catch:{ all -> 0x0ff3 }
            java.lang.String r14 = r14.zzx()     // Catch:{ all -> 0x0ff3 }
            r22 = r2
            java.lang.String r2 = r6.zzd()     // Catch:{ all -> 0x0ff3 }
            boolean r2 = r13.zzb(r14, r2)     // Catch:{ all -> 0x0ff3 }
            java.lang.String r13 = "_err"
            if (r2 == 0) goto L_0x0364
            com.google.android.gms.measurement.internal.zzfu r2 = r1.zzk     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzeq r2 = r2.zzq()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzes r2 = r2.zzh()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r7 = "Dropping blacklisted raw event. appId"
            com.google.android.gms.internal.measurement.zzcd$zzg r11 = r3.zza     // Catch:{ all -> 0x0ff3 }
            java.lang.String r11 = r11.zzx()     // Catch:{ all -> 0x0ff3 }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r11)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzfu r14 = r1.zzk     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzeo r14 = r14.zzi()     // Catch:{ all -> 0x0ff3 }
            r25 = r8
            java.lang.String r8 = r6.zzd()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r8 = r14.zza((java.lang.String) r8)     // Catch:{ all -> 0x0ff3 }
            r2.zza(r7, r11, r8)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzfo r2 = r43.zzc()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzg r7 = r3.zza     // Catch:{ all -> 0x0ff3 }
            java.lang.String r7 = r7.zzx()     // Catch:{ all -> 0x0ff3 }
            boolean r2 = r2.zzg(r7)     // Catch:{ all -> 0x0ff3 }
            if (r2 != 0) goto L_0x032e
            com.google.android.gms.measurement.internal.zzfo r2 = r43.zzc()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzg r7 = r3.zza     // Catch:{ all -> 0x0ff3 }
            java.lang.String r7 = r7.zzx()     // Catch:{ all -> 0x0ff3 }
            boolean r2 = r2.zzh(r7)     // Catch:{ all -> 0x0ff3 }
            if (r2 == 0) goto L_0x032c
            goto L_0x032e
        L_0x032c:
            r2 = 0
            goto L_0x032f
        L_0x032e:
            r2 = 1
        L_0x032f:
            if (r2 != 0) goto L_0x0358
            java.lang.String r2 = r6.zzd()     // Catch:{ all -> 0x0ff3 }
            boolean r2 = r13.equals(r2)     // Catch:{ all -> 0x0ff3 }
            if (r2 != 0) goto L_0x0358
            com.google.android.gms.measurement.internal.zzfu r2 = r1.zzk     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzkv r26 = r2.zzh()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzky r2 = r1.zzaa     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzg r7 = r3.zza     // Catch:{ all -> 0x0ff3 }
            java.lang.String r28 = r7.zzx()     // Catch:{ all -> 0x0ff3 }
            r29 = 11
            java.lang.String r30 = "_ev"
            java.lang.String r31 = r6.zzd()     // Catch:{ all -> 0x0ff3 }
            r32 = 0
            r27 = r2
            r26.zza((com.google.android.gms.measurement.internal.zzky) r27, (java.lang.String) r28, (int) r29, (java.lang.String) r30, (java.lang.String) r31, (int) r32)     // Catch:{ all -> 0x0ff3 }
        L_0x0358:
            r11 = r4
            r28 = r5
            r13 = r9
            r2 = r21
            r7 = r25
            r4 = -1
            r10 = 3
            goto L_0x0917
        L_0x0364:
            r25 = r8
            boolean r2 = com.google.android.gms.internal.measurement.zzlo.zzb()     // Catch:{ all -> 0x0ff3 }
            if (r2 == 0) goto L_0x03f8
            com.google.android.gms.measurement.internal.zzfu r2 = r1.zzk     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzab r2 = r2.zza()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzg r8 = r3.zza     // Catch:{ all -> 0x0ff3 }
            java.lang.String r8 = r8.zzx()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.zzas.zzcl     // Catch:{ all -> 0x0ff3 }
            boolean r2 = r2.zze(r8, r14)     // Catch:{ all -> 0x0ff3 }
            if (r2 == 0) goto L_0x03f8
            java.lang.String r2 = r6.zzd()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r8 = "_ai"
            java.lang.String r8 = com.google.android.gms.measurement.internal.zzgv.zza(r8)     // Catch:{ all -> 0x0ff3 }
            boolean r2 = r2.equals(r8)     // Catch:{ all -> 0x0ff3 }
            if (r2 == 0) goto L_0x03f8
            java.lang.String r2 = "_ai"
            r6.zza((java.lang.String) r2)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzfu r2 = r1.zzk     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzeq r2 = r2.zzq()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzes r2 = r2.zzw()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r8 = "Renaming ad_impression to _ai"
            r2.zza(r8)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzfu r2 = r1.zzk     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzeq r2 = r2.zzq()     // Catch:{ all -> 0x0ff3 }
            r8 = 5
            boolean r2 = r2.zza((int) r8)     // Catch:{ all -> 0x0ff3 }
            if (r2 == 0) goto L_0x03f8
            r2 = 0
        L_0x03b2:
            int r8 = r6.zzb()     // Catch:{ all -> 0x0ff3 }
            if (r2 >= r8) goto L_0x03f8
            java.lang.String r8 = "ad_platform"
            com.google.android.gms.internal.measurement.zzcd$zze r14 = r6.zza((int) r2)     // Catch:{ all -> 0x0ff3 }
            java.lang.String r14 = r14.zzb()     // Catch:{ all -> 0x0ff3 }
            boolean r8 = r8.equals(r14)     // Catch:{ all -> 0x0ff3 }
            if (r8 == 0) goto L_0x03f5
            com.google.android.gms.internal.measurement.zzcd$zze r8 = r6.zza((int) r2)     // Catch:{ all -> 0x0ff3 }
            java.lang.String r8 = r8.zzd()     // Catch:{ all -> 0x0ff3 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0ff3 }
            if (r8 != 0) goto L_0x03f5
            java.lang.String r8 = "admob"
            com.google.android.gms.internal.measurement.zzcd$zze r14 = r6.zza((int) r2)     // Catch:{ all -> 0x0ff3 }
            java.lang.String r14 = r14.zzd()     // Catch:{ all -> 0x0ff3 }
            boolean r8 = r8.equalsIgnoreCase(r14)     // Catch:{ all -> 0x0ff3 }
            if (r8 == 0) goto L_0x03f5
            com.google.android.gms.measurement.internal.zzfu r8 = r1.zzk     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzeq r8 = r8.zzq()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzes r8 = r8.zzj()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r14 = "AdMob ad impression logged from app. Potentially duplicative."
            r8.zza(r14)     // Catch:{ all -> 0x0ff3 }
        L_0x03f5:
            int r2 = r2 + 1
            goto L_0x03b2
        L_0x03f8:
            com.google.android.gms.measurement.internal.zzfo r2 = r43.zzc()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzg r8 = r3.zza     // Catch:{ all -> 0x0ff3 }
            java.lang.String r8 = r8.zzx()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r14 = r6.zzd()     // Catch:{ all -> 0x0ff3 }
            boolean r2 = r2.zzc(r8, r14)     // Catch:{ all -> 0x0ff3 }
            java.lang.String r8 = "_c"
            if (r2 != 0) goto L_0x0464
            r43.zzh()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r14 = r6.zzd()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14)     // Catch:{ all -> 0x0ff3 }
            r26 = r9
            int r9 = r14.hashCode()     // Catch:{ all -> 0x0ff3 }
            r10 = 94660(0x171c4, float:1.32647E-40)
            if (r9 == r10) goto L_0x0442
            r10 = 95025(0x17331, float:1.33158E-40)
            if (r9 == r10) goto L_0x0438
            r10 = 95027(0x17333, float:1.33161E-40)
            if (r9 == r10) goto L_0x042e
            goto L_0x044c
        L_0x042e:
            java.lang.String r9 = "_ui"
            boolean r9 = r14.equals(r9)     // Catch:{ all -> 0x0ff3 }
            if (r9 == 0) goto L_0x044c
            r9 = 1
            goto L_0x044d
        L_0x0438:
            java.lang.String r9 = "_ug"
            boolean r9 = r14.equals(r9)     // Catch:{ all -> 0x0ff3 }
            if (r9 == 0) goto L_0x044c
            r9 = 2
            goto L_0x044d
        L_0x0442:
            java.lang.String r9 = "_in"
            boolean r9 = r14.equals(r9)     // Catch:{ all -> 0x0ff3 }
            if (r9 == 0) goto L_0x044c
            r9 = 0
            goto L_0x044d
        L_0x044c:
            r9 = -1
        L_0x044d:
            if (r9 == 0) goto L_0x0457
            r10 = 1
            if (r9 == r10) goto L_0x0457
            r10 = 2
            if (r9 == r10) goto L_0x0457
            r9 = 0
            goto L_0x0458
        L_0x0457:
            r9 = 1
        L_0x0458:
            if (r9 == 0) goto L_0x045b
            goto L_0x0466
        L_0x045b:
            r28 = r5
            r30 = r11
            r29 = r15
            r11 = r4
            goto L_0x0642
        L_0x0464:
            r26 = r9
        L_0x0466:
            r28 = r5
            r9 = 0
            r10 = 0
            r14 = 0
        L_0x046b:
            int r5 = r6.zzb()     // Catch:{ all -> 0x0ff3 }
            r29 = r15
            java.lang.String r15 = "_r"
            if (r9 >= r5) goto L_0x04d9
            com.google.android.gms.internal.measurement.zzcd$zze r5 = r6.zza((int) r9)     // Catch:{ all -> 0x0ff3 }
            java.lang.String r5 = r5.zzb()     // Catch:{ all -> 0x0ff3 }
            boolean r5 = r8.equals(r5)     // Catch:{ all -> 0x0ff3 }
            if (r5 == 0) goto L_0x04a4
            com.google.android.gms.internal.measurement.zzcd$zze r5 = r6.zza((int) r9)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzhy$zzb r5 = r5.zzbo()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzhy$zzb r5 = (com.google.android.gms.internal.measurement.zzhy.zzb) r5     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zze$zza r5 = (com.google.android.gms.internal.measurement.zzcd.zze.zza) r5     // Catch:{ all -> 0x0ff3 }
            r30 = r11
            r10 = 1
            com.google.android.gms.internal.measurement.zzcd$zze$zza r5 = r5.zza((long) r10)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzjj r5 = r5.zzy()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzhy r5 = (com.google.android.gms.internal.measurement.zzhy) r5     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zze r5 = (com.google.android.gms.internal.measurement.zzcd.zze) r5     // Catch:{ all -> 0x0ff3 }
            r6.zza((int) r9, (com.google.android.gms.internal.measurement.zzcd.zze) r5)     // Catch:{ all -> 0x0ff3 }
            r10 = 1
            goto L_0x04d2
        L_0x04a4:
            r30 = r11
            com.google.android.gms.internal.measurement.zzcd$zze r5 = r6.zza((int) r9)     // Catch:{ all -> 0x0ff3 }
            java.lang.String r5 = r5.zzb()     // Catch:{ all -> 0x0ff3 }
            boolean r5 = r15.equals(r5)     // Catch:{ all -> 0x0ff3 }
            if (r5 == 0) goto L_0x04d2
            com.google.android.gms.internal.measurement.zzcd$zze r5 = r6.zza((int) r9)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzhy$zzb r5 = r5.zzbo()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzhy$zzb r5 = (com.google.android.gms.internal.measurement.zzhy.zzb) r5     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zze$zza r5 = (com.google.android.gms.internal.measurement.zzcd.zze.zza) r5     // Catch:{ all -> 0x0ff3 }
            r14 = 1
            com.google.android.gms.internal.measurement.zzcd$zze$zza r5 = r5.zza((long) r14)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzjj r5 = r5.zzy()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzhy r5 = (com.google.android.gms.internal.measurement.zzhy) r5     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zze r5 = (com.google.android.gms.internal.measurement.zzcd.zze) r5     // Catch:{ all -> 0x0ff3 }
            r6.zza((int) r9, (com.google.android.gms.internal.measurement.zzcd.zze) r5)     // Catch:{ all -> 0x0ff3 }
            r14 = 1
        L_0x04d2:
            int r9 = r9 + 1
            r15 = r29
            r11 = r30
            goto L_0x046b
        L_0x04d9:
            r30 = r11
            if (r10 != 0) goto L_0x050d
            if (r2 == 0) goto L_0x050d
            com.google.android.gms.measurement.internal.zzfu r5 = r1.zzk     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzeq r5 = r5.zzq()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzes r5 = r5.zzw()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r9 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.zzfu r10 = r1.zzk     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzeo r10 = r10.zzi()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r11 = r6.zzd()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r10 = r10.zza((java.lang.String) r11)     // Catch:{ all -> 0x0ff3 }
            r5.zza(r9, r10)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zze$zza r5 = com.google.android.gms.internal.measurement.zzcd.zze.zzm()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zze$zza r5 = r5.zza((java.lang.String) r8)     // Catch:{ all -> 0x0ff3 }
            r9 = 1
            com.google.android.gms.internal.measurement.zzcd$zze$zza r5 = r5.zza((long) r9)     // Catch:{ all -> 0x0ff3 }
            r6.zza((com.google.android.gms.internal.measurement.zzcd.zze.zza) r5)     // Catch:{ all -> 0x0ff3 }
        L_0x050d:
            if (r14 != 0) goto L_0x053d
            com.google.android.gms.measurement.internal.zzfu r5 = r1.zzk     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzeq r5 = r5.zzq()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzes r5 = r5.zzw()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r9 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.zzfu r10 = r1.zzk     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzeo r10 = r10.zzi()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r11 = r6.zzd()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r10 = r10.zza((java.lang.String) r11)     // Catch:{ all -> 0x0ff3 }
            r5.zza(r9, r10)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zze$zza r5 = com.google.android.gms.internal.measurement.zzcd.zze.zzm()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zze$zza r5 = r5.zza((java.lang.String) r15)     // Catch:{ all -> 0x0ff3 }
            r9 = 1
            com.google.android.gms.internal.measurement.zzcd$zze$zza r5 = r5.zza((long) r9)     // Catch:{ all -> 0x0ff3 }
            r6.zza((com.google.android.gms.internal.measurement.zzcd.zze.zza) r5)     // Catch:{ all -> 0x0ff3 }
        L_0x053d:
            com.google.android.gms.measurement.internal.zzaf r31 = r43.zze()     // Catch:{ all -> 0x0ff3 }
            long r32 = r43.zzy()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzg r5 = r3.zza     // Catch:{ all -> 0x0ff3 }
            java.lang.String r34 = r5.zzx()     // Catch:{ all -> 0x0ff3 }
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 1
            com.google.android.gms.measurement.internal.zzae r5 = r31.zza(r32, r34, r35, r36, r37, r38, r39)     // Catch:{ all -> 0x0ff3 }
            long r9 = r5.zze     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzfu r5 = r1.zzk     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzab r5 = r5.zza()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzg r11 = r3.zza     // Catch:{ all -> 0x0ff3 }
            java.lang.String r11 = r11.zzx()     // Catch:{ all -> 0x0ff3 }
            int r5 = r5.zzc(r11)     // Catch:{ all -> 0x0ff3 }
            r11 = r4
            long r4 = (long) r5     // Catch:{ all -> 0x0ff3 }
            int r14 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r14 <= 0) goto L_0x0575
            zza((com.google.android.gms.internal.measurement.zzcd.zzc.zza) r6, (java.lang.String) r15)     // Catch:{ all -> 0x0ff3 }
            goto L_0x0577
        L_0x0575:
            r20 = 1
        L_0x0577:
            java.lang.String r4 = r6.zzd()     // Catch:{ all -> 0x0ff3 }
            boolean r4 = com.google.android.gms.measurement.internal.zzkv.zza((java.lang.String) r4)     // Catch:{ all -> 0x0ff3 }
            if (r4 == 0) goto L_0x0642
            if (r2 == 0) goto L_0x0642
            com.google.android.gms.measurement.internal.zzaf r31 = r43.zze()     // Catch:{ all -> 0x0ff3 }
            long r32 = r43.zzy()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzg r4 = r3.zza     // Catch:{ all -> 0x0ff3 }
            java.lang.String r34 = r4.zzx()     // Catch:{ all -> 0x0ff3 }
            r35 = 0
            r36 = 0
            r37 = 1
            r38 = 0
            r39 = 0
            com.google.android.gms.measurement.internal.zzae r4 = r31.zza(r32, r34, r35, r36, r37, r38, r39)     // Catch:{ all -> 0x0ff3 }
            long r4 = r4.zzc     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzfu r9 = r1.zzk     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzab r9 = r9.zza()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzg r10 = r3.zza     // Catch:{ all -> 0x0ff3 }
            java.lang.String r10 = r10.zzx()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzej<java.lang.Integer> r14 = com.google.android.gms.measurement.internal.zzas.zzm     // Catch:{ all -> 0x0ff3 }
            int r9 = r9.zzb(r10, r14)     // Catch:{ all -> 0x0ff3 }
            long r9 = (long) r9     // Catch:{ all -> 0x0ff3 }
            int r14 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r14 <= 0) goto L_0x0642
            com.google.android.gms.measurement.internal.zzfu r4 = r1.zzk     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzeq r4 = r4.zzq()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzes r4 = r4.zzh()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r5 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.zzcd$zzg r9 = r3.zza     // Catch:{ all -> 0x0ff3 }
            java.lang.String r9 = r9.zzx()     // Catch:{ all -> 0x0ff3 }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r9)     // Catch:{ all -> 0x0ff3 }
            r4.zza(r5, r9)     // Catch:{ all -> 0x0ff3 }
            r4 = 0
            r5 = 0
            r9 = 0
            r10 = -1
        L_0x05d5:
            int r14 = r6.zzb()     // Catch:{ all -> 0x0ff3 }
            if (r4 >= r14) goto L_0x0601
            com.google.android.gms.internal.measurement.zzcd$zze r14 = r6.zza((int) r4)     // Catch:{ all -> 0x0ff3 }
            java.lang.String r15 = r14.zzb()     // Catch:{ all -> 0x0ff3 }
            boolean r15 = r8.equals(r15)     // Catch:{ all -> 0x0ff3 }
            if (r15 == 0) goto L_0x05f3
            com.google.android.gms.internal.measurement.zzhy$zzb r9 = r14.zzbo()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzhy$zzb r9 = (com.google.android.gms.internal.measurement.zzhy.zzb) r9     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zze$zza r9 = (com.google.android.gms.internal.measurement.zzcd.zze.zza) r9     // Catch:{ all -> 0x0ff3 }
            r10 = r4
            goto L_0x05fe
        L_0x05f3:
            java.lang.String r14 = r14.zzb()     // Catch:{ all -> 0x0ff3 }
            boolean r14 = r13.equals(r14)     // Catch:{ all -> 0x0ff3 }
            if (r14 == 0) goto L_0x05fe
            r5 = 1
        L_0x05fe:
            int r4 = r4 + 1
            goto L_0x05d5
        L_0x0601:
            if (r5 == 0) goto L_0x0609
            if (r9 == 0) goto L_0x0609
            r6.zzb((int) r10)     // Catch:{ all -> 0x0ff3 }
            goto L_0x0642
        L_0x0609:
            if (r9 == 0) goto L_0x0629
            java.lang.Object r4 = r9.clone()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzhy$zzb r4 = (com.google.android.gms.internal.measurement.zzhy.zzb) r4     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zze$zza r4 = (com.google.android.gms.internal.measurement.zzcd.zze.zza) r4     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zze$zza r4 = r4.zza((java.lang.String) r13)     // Catch:{ all -> 0x0ff3 }
            r13 = 10
            com.google.android.gms.internal.measurement.zzcd$zze$zza r4 = r4.zza((long) r13)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzjj r4 = r4.zzy()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzhy r4 = (com.google.android.gms.internal.measurement.zzhy) r4     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zze r4 = (com.google.android.gms.internal.measurement.zzcd.zze) r4     // Catch:{ all -> 0x0ff3 }
            r6.zza((int) r10, (com.google.android.gms.internal.measurement.zzcd.zze) r4)     // Catch:{ all -> 0x0ff3 }
            goto L_0x0642
        L_0x0629:
            com.google.android.gms.measurement.internal.zzfu r4 = r1.zzk     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzeq r4 = r4.zzq()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzes r4 = r4.zze()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r5 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.zzcd$zzg r9 = r3.zza     // Catch:{ all -> 0x0ff3 }
            java.lang.String r9 = r9.zzx()     // Catch:{ all -> 0x0ff3 }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r9)     // Catch:{ all -> 0x0ff3 }
            r4.zza(r5, r9)     // Catch:{ all -> 0x0ff3 }
        L_0x0642:
            if (r2 == 0) goto L_0x0709
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0ff3 }
            java.util.List r4 = r6.zza()     // Catch:{ all -> 0x0ff3 }
            r2.<init>(r4)     // Catch:{ all -> 0x0ff3 }
            r4 = 0
            r5 = -1
            r9 = -1
        L_0x0650:
            int r10 = r2.size()     // Catch:{ all -> 0x0ff3 }
            if (r4 >= r10) goto L_0x0680
            java.lang.String r10 = "value"
            java.lang.Object r13 = r2.get(r4)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zze r13 = (com.google.android.gms.internal.measurement.zzcd.zze) r13     // Catch:{ all -> 0x0ff3 }
            java.lang.String r13 = r13.zzb()     // Catch:{ all -> 0x0ff3 }
            boolean r10 = r10.equals(r13)     // Catch:{ all -> 0x0ff3 }
            if (r10 == 0) goto L_0x066a
            r5 = r4
            goto L_0x067d
        L_0x066a:
            java.lang.String r10 = "currency"
            java.lang.Object r13 = r2.get(r4)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zze r13 = (com.google.android.gms.internal.measurement.zzcd.zze) r13     // Catch:{ all -> 0x0ff3 }
            java.lang.String r13 = r13.zzb()     // Catch:{ all -> 0x0ff3 }
            boolean r10 = r10.equals(r13)     // Catch:{ all -> 0x0ff3 }
            if (r10 == 0) goto L_0x067d
            r9 = r4
        L_0x067d:
            int r4 = r4 + 1
            goto L_0x0650
        L_0x0680:
            r4 = -1
            if (r5 == r4) goto L_0x070a
            java.lang.Object r4 = r2.get(r5)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zze r4 = (com.google.android.gms.internal.measurement.zzcd.zze) r4     // Catch:{ all -> 0x0ff3 }
            boolean r4 = r4.zze()     // Catch:{ all -> 0x0ff3 }
            if (r4 != 0) goto L_0x06b8
            java.lang.Object r4 = r2.get(r5)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zze r4 = (com.google.android.gms.internal.measurement.zzcd.zze) r4     // Catch:{ all -> 0x0ff3 }
            boolean r4 = r4.zzi()     // Catch:{ all -> 0x0ff3 }
            if (r4 != 0) goto L_0x06b8
            com.google.android.gms.measurement.internal.zzfu r2 = r1.zzk     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzeq r2 = r2.zzq()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzes r2 = r2.zzj()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r4 = "Value must be specified with a numeric type."
            r2.zza(r4)     // Catch:{ all -> 0x0ff3 }
            r6.zzb((int) r5)     // Catch:{ all -> 0x0ff3 }
            zza((com.google.android.gms.internal.measurement.zzcd.zzc.zza) r6, (java.lang.String) r8)     // Catch:{ all -> 0x0ff3 }
            r2 = 18
            java.lang.String r4 = "value"
            zza((com.google.android.gms.internal.measurement.zzcd.zzc.zza) r6, (int) r2, (java.lang.String) r4)     // Catch:{ all -> 0x0ff3 }
            goto L_0x0709
        L_0x06b8:
            r4 = -1
            if (r9 != r4) goto L_0x06be
            r2 = 1
            r10 = 3
            goto L_0x06ea
        L_0x06be:
            java.lang.Object r2 = r2.get(r9)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zze r2 = (com.google.android.gms.internal.measurement.zzcd.zze) r2     // Catch:{ all -> 0x0ff3 }
            java.lang.String r2 = r2.zzd()     // Catch:{ all -> 0x0ff3 }
            int r9 = r2.length()     // Catch:{ all -> 0x0ff3 }
            r10 = 3
            if (r9 == r10) goto L_0x06d1
        L_0x06cf:
            r2 = 1
            goto L_0x06ea
        L_0x06d1:
            r9 = 0
        L_0x06d2:
            int r13 = r2.length()     // Catch:{ all -> 0x0ff3 }
            if (r9 >= r13) goto L_0x06e9
            int r13 = r2.codePointAt(r9)     // Catch:{ all -> 0x0ff3 }
            boolean r14 = java.lang.Character.isLetter(r13)     // Catch:{ all -> 0x0ff3 }
            if (r14 != 0) goto L_0x06e3
            goto L_0x06cf
        L_0x06e3:
            int r13 = java.lang.Character.charCount(r13)     // Catch:{ all -> 0x0ff3 }
            int r9 = r9 + r13
            goto L_0x06d2
        L_0x06e9:
            r2 = 0
        L_0x06ea:
            if (r2 == 0) goto L_0x070b
            com.google.android.gms.measurement.internal.zzfu r2 = r1.zzk     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzeq r2 = r2.zzq()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzes r2 = r2.zzj()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r9 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.zza(r9)     // Catch:{ all -> 0x0ff3 }
            r6.zzb((int) r5)     // Catch:{ all -> 0x0ff3 }
            zza((com.google.android.gms.internal.measurement.zzcd.zzc.zza) r6, (java.lang.String) r8)     // Catch:{ all -> 0x0ff3 }
            r2 = 19
            java.lang.String r5 = "currency"
            zza((com.google.android.gms.internal.measurement.zzcd.zzc.zza) r6, (int) r2, (java.lang.String) r5)     // Catch:{ all -> 0x0ff3 }
            goto L_0x070b
        L_0x0709:
            r4 = -1
        L_0x070a:
            r10 = 3
        L_0x070b:
            com.google.android.gms.measurement.internal.zzfu r2 = r1.zzk     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzab r2 = r2.zza()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzg r5 = r3.zza     // Catch:{ all -> 0x0ff3 }
            java.lang.String r5 = r5.zzx()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.zzas.zzas     // Catch:{ all -> 0x0ff3 }
            boolean r2 = r2.zze(r5, r8)     // Catch:{ all -> 0x0ff3 }
            if (r2 == 0) goto L_0x089c
            java.lang.String r2 = r6.zzd()     // Catch:{ all -> 0x0ff3 }
            r5 = r30
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0ff3 }
            if (r2 == 0) goto L_0x0776
            r43.zzh()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzjj r2 = r6.zzy()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzhy r2 = (com.google.android.gms.internal.measurement.zzhy) r2     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzc r2 = (com.google.android.gms.internal.measurement.zzcd.zzc) r2     // Catch:{ all -> 0x0ff3 }
            java.lang.String r8 = "_fr"
            com.google.android.gms.internal.measurement.zzcd$zze r2 = com.google.android.gms.measurement.internal.zzkr.zza((com.google.android.gms.internal.measurement.zzcd.zzc) r2, (java.lang.String) r8)     // Catch:{ all -> 0x0ff3 }
            if (r2 != 0) goto L_0x0772
            if (r18 == 0) goto L_0x076c
            long r8 = r18.zzf()     // Catch:{ all -> 0x0ff3 }
            long r13 = r6.zzf()     // Catch:{ all -> 0x0ff3 }
            long r8 = r8 - r13
            long r8 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x0ff3 }
            r13 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r2 > 0) goto L_0x076c
            java.lang.Object r2 = r18.clone()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzhy$zzb r2 = (com.google.android.gms.internal.measurement.zzhy.zzb) r2     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzc$zza r2 = (com.google.android.gms.internal.measurement.zzcd.zzc.zza) r2     // Catch:{ all -> 0x0ff3 }
            boolean r8 = r1.zza((com.google.android.gms.internal.measurement.zzcd.zzc.zza) r6, (com.google.android.gms.internal.measurement.zzcd.zzc.zza) r2)     // Catch:{ all -> 0x0ff3 }
            if (r8 == 0) goto L_0x076c
            r11.zza((int) r12, (com.google.android.gms.internal.measurement.zzcd.zzc.zza) r2)     // Catch:{ all -> 0x0ff3 }
            r8 = r29
        L_0x0766:
            r17 = 0
            r18 = 0
            goto L_0x08a0
        L_0x076c:
            r17 = r6
            r8 = r21
            goto L_0x08a0
        L_0x0772:
            r8 = r29
            goto L_0x08a0
        L_0x0776:
            java.lang.String r2 = "_vs"
            java.lang.String r8 = r6.zzd()     // Catch:{ all -> 0x0ff3 }
            boolean r2 = r2.equals(r8)     // Catch:{ all -> 0x0ff3 }
            if (r2 == 0) goto L_0x07c4
            r43.zzh()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzjj r2 = r6.zzy()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzhy r2 = (com.google.android.gms.internal.measurement.zzhy) r2     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzc r2 = (com.google.android.gms.internal.measurement.zzcd.zzc) r2     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zze r2 = com.google.android.gms.measurement.internal.zzkr.zza((com.google.android.gms.internal.measurement.zzcd.zzc) r2, (java.lang.String) r7)     // Catch:{ all -> 0x0ff3 }
            if (r2 != 0) goto L_0x0772
            if (r17 == 0) goto L_0x07bc
            long r8 = r17.zzf()     // Catch:{ all -> 0x0ff3 }
            long r13 = r6.zzf()     // Catch:{ all -> 0x0ff3 }
            long r8 = r8 - r13
            long r8 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x0ff3 }
            r13 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r2 > 0) goto L_0x07bc
            java.lang.Object r2 = r17.clone()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzhy$zzb r2 = (com.google.android.gms.internal.measurement.zzhy.zzb) r2     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzc$zza r2 = (com.google.android.gms.internal.measurement.zzcd.zzc.zza) r2     // Catch:{ all -> 0x0ff3 }
            boolean r8 = r1.zza((com.google.android.gms.internal.measurement.zzcd.zzc.zza) r2, (com.google.android.gms.internal.measurement.zzcd.zzc.zza) r6)     // Catch:{ all -> 0x0ff3 }
            if (r8 == 0) goto L_0x07bc
            r8 = r29
            r11.zza((int) r8, (com.google.android.gms.internal.measurement.zzcd.zzc.zza) r2)     // Catch:{ all -> 0x0ff3 }
            goto L_0x0766
        L_0x07bc:
            r8 = r29
            r18 = r6
            r12 = r21
            goto L_0x08a0
        L_0x07c4:
            r8 = r29
            com.google.android.gms.measurement.internal.zzfu r2 = r1.zzk     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzab r2 = r2.zza()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzg r9 = r3.zza     // Catch:{ all -> 0x0ff3 }
            java.lang.String r9 = r9.zzx()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.zzas.zzbl     // Catch:{ all -> 0x0ff3 }
            boolean r2 = r2.zze(r9, r13)     // Catch:{ all -> 0x0ff3 }
            if (r2 == 0) goto L_0x08a0
            java.lang.String r2 = "_ab"
            java.lang.String r9 = r6.zzd()     // Catch:{ all -> 0x0ff3 }
            boolean r2 = r2.equals(r9)     // Catch:{ all -> 0x0ff3 }
            if (r2 == 0) goto L_0x08a0
            r43.zzh()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzjj r2 = r6.zzy()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzhy r2 = (com.google.android.gms.internal.measurement.zzhy) r2     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzc r2 = (com.google.android.gms.internal.measurement.zzcd.zzc) r2     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zze r2 = com.google.android.gms.measurement.internal.zzkr.zza((com.google.android.gms.internal.measurement.zzcd.zzc) r2, (java.lang.String) r7)     // Catch:{ all -> 0x0ff3 }
            if (r2 != 0) goto L_0x08a0
            if (r17 == 0) goto L_0x08a0
            long r13 = r17.zzf()     // Catch:{ all -> 0x0ff3 }
            long r23 = r6.zzf()     // Catch:{ all -> 0x0ff3 }
            long r13 = r13 - r23
            long r13 = java.lang.Math.abs(r13)     // Catch:{ all -> 0x0ff3 }
            r23 = 4000(0xfa0, double:1.9763E-320)
            int r2 = (r13 > r23 ? 1 : (r13 == r23 ? 0 : -1))
            if (r2 > 0) goto L_0x08a0
            java.lang.Object r2 = r17.clone()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzhy$zzb r2 = (com.google.android.gms.internal.measurement.zzhy.zzb) r2     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzc$zza r2 = (com.google.android.gms.internal.measurement.zzcd.zzc.zza) r2     // Catch:{ all -> 0x0ff3 }
            r1.zzb((com.google.android.gms.internal.measurement.zzcd.zzc.zza) r2, (com.google.android.gms.internal.measurement.zzcd.zzc.zza) r6)     // Catch:{ all -> 0x0ff3 }
            java.lang.String r9 = r2.zzd()     // Catch:{ all -> 0x0ff3 }
            boolean r9 = r5.equals(r9)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.common.internal.Preconditions.checkArgument(r9)     // Catch:{ all -> 0x0ff3 }
            r43.zzh()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzjj r9 = r2.zzy()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzhy r9 = (com.google.android.gms.internal.measurement.zzhy) r9     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzc r9 = (com.google.android.gms.internal.measurement.zzcd.zzc) r9     // Catch:{ all -> 0x0ff3 }
            java.lang.String r13 = "_sn"
            com.google.android.gms.internal.measurement.zzcd$zze r9 = com.google.android.gms.measurement.internal.zzkr.zza((com.google.android.gms.internal.measurement.zzcd.zzc) r9, (java.lang.String) r13)     // Catch:{ all -> 0x0ff3 }
            r43.zzh()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzjj r13 = r2.zzy()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzhy r13 = (com.google.android.gms.internal.measurement.zzhy) r13     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzc r13 = (com.google.android.gms.internal.measurement.zzcd.zzc) r13     // Catch:{ all -> 0x0ff3 }
            java.lang.String r14 = "_sc"
            com.google.android.gms.internal.measurement.zzcd$zze r13 = com.google.android.gms.measurement.internal.zzkr.zza((com.google.android.gms.internal.measurement.zzcd.zzc) r13, (java.lang.String) r14)     // Catch:{ all -> 0x0ff3 }
            r43.zzh()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzjj r14 = r2.zzy()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzhy r14 = (com.google.android.gms.internal.measurement.zzhy) r14     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzc r14 = (com.google.android.gms.internal.measurement.zzcd.zzc) r14     // Catch:{ all -> 0x0ff3 }
            java.lang.String r15 = "_si"
            com.google.android.gms.internal.measurement.zzcd$zze r14 = com.google.android.gms.measurement.internal.zzkr.zza((com.google.android.gms.internal.measurement.zzcd.zzc) r14, (java.lang.String) r15)     // Catch:{ all -> 0x0ff3 }
            if (r9 == 0) goto L_0x085d
            java.lang.String r9 = r9.zzd()     // Catch:{ all -> 0x0ff3 }
            goto L_0x085f
        L_0x085d:
            r9 = r22
        L_0x085f:
            boolean r15 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0ff3 }
            if (r15 != 0) goto L_0x086d
            r43.zzh()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r15 = "_sn"
            com.google.android.gms.measurement.internal.zzkr.zza((com.google.android.gms.internal.measurement.zzcd.zzc.zza) r6, (java.lang.String) r15, (java.lang.Object) r9)     // Catch:{ all -> 0x0ff3 }
        L_0x086d:
            if (r13 == 0) goto L_0x0874
            java.lang.String r9 = r13.zzd()     // Catch:{ all -> 0x0ff3 }
            goto L_0x0876
        L_0x0874:
            r9 = r22
        L_0x0876:
            boolean r13 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0ff3 }
            if (r13 != 0) goto L_0x0884
            r43.zzh()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r13 = "_sc"
            com.google.android.gms.measurement.internal.zzkr.zza((com.google.android.gms.internal.measurement.zzcd.zzc.zza) r6, (java.lang.String) r13, (java.lang.Object) r9)     // Catch:{ all -> 0x0ff3 }
        L_0x0884:
            if (r14 == 0) goto L_0x0896
            r43.zzh()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r9 = "_si"
            long r13 = r14.zzf()     // Catch:{ all -> 0x0ff3 }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzkr.zza((com.google.android.gms.internal.measurement.zzcd.zzc.zza) r6, (java.lang.String) r9, (java.lang.Object) r13)     // Catch:{ all -> 0x0ff3 }
        L_0x0896:
            r11.zza((int) r8, (com.google.android.gms.internal.measurement.zzcd.zzc.zza) r2)     // Catch:{ all -> 0x0ff3 }
            r17 = 0
            goto L_0x08a0
        L_0x089c:
            r8 = r29
            r5 = r30
        L_0x08a0:
            if (r28 != 0) goto L_0x0900
            java.lang.String r2 = r6.zzd()     // Catch:{ all -> 0x0ff3 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0ff3 }
            if (r2 == 0) goto L_0x0900
            int r2 = r6.zzb()     // Catch:{ all -> 0x0ff3 }
            if (r2 != 0) goto L_0x08cc
            com.google.android.gms.measurement.internal.zzfu r2 = r1.zzk     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzeq r2 = r2.zzq()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzes r2 = r2.zzh()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r5 = "Engagement event does not contain any parameters. appId"
            com.google.android.gms.internal.measurement.zzcd$zzg r7 = r3.zza     // Catch:{ all -> 0x0ff3 }
            java.lang.String r7 = r7.zzx()     // Catch:{ all -> 0x0ff3 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r7)     // Catch:{ all -> 0x0ff3 }
            r2.zza(r5, r7)     // Catch:{ all -> 0x0ff3 }
            goto L_0x0900
        L_0x08cc:
            r43.zzh()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzjj r2 = r6.zzy()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzhy r2 = (com.google.android.gms.internal.measurement.zzhy) r2     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzc r2 = (com.google.android.gms.internal.measurement.zzcd.zzc) r2     // Catch:{ all -> 0x0ff3 }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzkr.zzb(r2, r7)     // Catch:{ all -> 0x0ff3 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x0ff3 }
            if (r2 != 0) goto L_0x08f9
            com.google.android.gms.measurement.internal.zzfu r2 = r1.zzk     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzeq r2 = r2.zzq()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzes r2 = r2.zzh()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r5 = "Engagement event does not include duration. appId"
            com.google.android.gms.internal.measurement.zzcd$zzg r7 = r3.zza     // Catch:{ all -> 0x0ff3 }
            java.lang.String r7 = r7.zzx()     // Catch:{ all -> 0x0ff3 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r7)     // Catch:{ all -> 0x0ff3 }
            r2.zza(r5, r7)     // Catch:{ all -> 0x0ff3 }
            goto L_0x0900
        L_0x08f9:
            long r13 = r2.longValue()     // Catch:{ all -> 0x0ff3 }
            long r13 = r26 + r13
            goto L_0x0902
        L_0x0900:
            r13 = r26
        L_0x0902:
            java.util.List<com.google.android.gms.internal.measurement.zzcd$zzc> r2 = r3.zzc     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzjj r5 = r6.zzy()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzhy r5 = (com.google.android.gms.internal.measurement.zzhy) r5     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzc r5 = (com.google.android.gms.internal.measurement.zzcd.zzc) r5     // Catch:{ all -> 0x0ff3 }
            r7 = r25
            r2.set(r7, r5)     // Catch:{ all -> 0x0ff3 }
            int r2 = r21 + 1
            r11.zza((com.google.android.gms.internal.measurement.zzcd.zzc.zza) r6)     // Catch:{ all -> 0x0ff3 }
            r15 = r8
        L_0x0917:
            int r8 = r7 + 1
            r4 = r11
            r9 = r13
            r13 = r20
            r5 = r28
            r14 = r2
            r2 = r22
            goto L_0x02aa
        L_0x0924:
            r28 = r5
            r26 = r9
            r5 = r11
            r11 = r4
            if (r28 == 0) goto L_0x0981
            r4 = r21
            r9 = r26
            r2 = 0
        L_0x0931:
            if (r2 >= r4) goto L_0x0983
            com.google.android.gms.internal.measurement.zzcd$zzc r6 = r11.zzb((int) r2)     // Catch:{ all -> 0x0ff3 }
            java.lang.String r8 = r6.zzc()     // Catch:{ all -> 0x0ff3 }
            boolean r8 = r5.equals(r8)     // Catch:{ all -> 0x0ff3 }
            if (r8 == 0) goto L_0x0954
            r43.zzh()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r8 = "_fr"
            com.google.android.gms.internal.measurement.zzcd$zze r8 = com.google.android.gms.measurement.internal.zzkr.zza((com.google.android.gms.internal.measurement.zzcd.zzc) r6, (java.lang.String) r8)     // Catch:{ all -> 0x0ff3 }
            if (r8 == 0) goto L_0x0954
            r11.zzc((int) r2)     // Catch:{ all -> 0x0ff3 }
            int r4 = r4 + -1
            int r2 = r2 + -1
            goto L_0x097e
        L_0x0954:
            r43.zzh()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zze r6 = com.google.android.gms.measurement.internal.zzkr.zza((com.google.android.gms.internal.measurement.zzcd.zzc) r6, (java.lang.String) r7)     // Catch:{ all -> 0x0ff3 }
            if (r6 == 0) goto L_0x097e
            boolean r8 = r6.zze()     // Catch:{ all -> 0x0ff3 }
            if (r8 == 0) goto L_0x096c
            long r12 = r6.zzf()     // Catch:{ all -> 0x0ff3 }
            java.lang.Long r6 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0ff3 }
            goto L_0x096d
        L_0x096c:
            r6 = 0
        L_0x096d:
            if (r6 == 0) goto L_0x097e
            long r12 = r6.longValue()     // Catch:{ all -> 0x0ff3 }
            r14 = 0
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 <= 0) goto L_0x097e
            long r12 = r6.longValue()     // Catch:{ all -> 0x0ff3 }
            long r9 = r9 + r12
        L_0x097e:
            r6 = 1
            int r2 = r2 + r6
            goto L_0x0931
        L_0x0981:
            r9 = r26
        L_0x0983:
            r2 = 0
            r1.zza((com.google.android.gms.internal.measurement.zzcd.zzg.zza) r11, (long) r9, (boolean) r2)     // Catch:{ all -> 0x0ff3 }
            java.util.List r2 = r11.zza()     // Catch:{ all -> 0x0ff3 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0ff3 }
        L_0x098f:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0ff3 }
            if (r4 == 0) goto L_0x09a9
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzc r4 = (com.google.android.gms.internal.measurement.zzcd.zzc) r4     // Catch:{ all -> 0x0ff3 }
            java.lang.String r5 = "_s"
            java.lang.String r4 = r4.zzc()     // Catch:{ all -> 0x0ff3 }
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x0ff3 }
            if (r4 == 0) goto L_0x098f
            r2 = 1
            goto L_0x09aa
        L_0x09a9:
            r2 = 0
        L_0x09aa:
            if (r2 == 0) goto L_0x09b9
            com.google.android.gms.measurement.internal.zzaf r2 = r43.zze()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r4 = r11.zzj()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r5 = "_se"
            r2.zzb((java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x0ff3 }
        L_0x09b9:
            java.lang.String r2 = "_sid"
            int r2 = com.google.android.gms.measurement.internal.zzkr.zza((com.google.android.gms.internal.measurement.zzcd.zzg.zza) r11, (java.lang.String) r2)     // Catch:{ all -> 0x0ff3 }
            if (r2 < 0) goto L_0x09c3
            r2 = 1
            goto L_0x09c4
        L_0x09c3:
            r2 = 0
        L_0x09c4:
            if (r2 == 0) goto L_0x09cb
            r2 = 1
            r1.zza((com.google.android.gms.internal.measurement.zzcd.zzg.zza) r11, (long) r9, (boolean) r2)     // Catch:{ all -> 0x0ff3 }
            goto L_0x09ef
        L_0x09cb:
            java.lang.String r2 = "_se"
            int r2 = com.google.android.gms.measurement.internal.zzkr.zza((com.google.android.gms.internal.measurement.zzcd.zzg.zza) r11, (java.lang.String) r2)     // Catch:{ all -> 0x0ff3 }
            if (r2 < 0) goto L_0x09ef
            r11.zze((int) r2)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzfu r2 = r1.zzk     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzeq r2 = r2.zzq()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzes r2 = r2.zze()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r4 = "Session engagement user property is in the bundle without session ID. appId"
            com.google.android.gms.internal.measurement.zzcd$zzg r5 = r3.zza     // Catch:{ all -> 0x0ff3 }
            java.lang.String r5 = r5.zzx()     // Catch:{ all -> 0x0ff3 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r5)     // Catch:{ all -> 0x0ff3 }
            r2.zza(r4, r5)     // Catch:{ all -> 0x0ff3 }
        L_0x09ef:
            com.google.android.gms.measurement.internal.zzkr r2 = r43.zzh()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzeq r4 = r2.zzq()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzes r4 = r4.zzw()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r5 = "Checking account type status for ad personalization signals"
            r4.zza(r5)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzfo r4 = r2.zzj()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r5 = r11.zzj()     // Catch:{ all -> 0x0ff3 }
            boolean r4 = r4.zze(r5)     // Catch:{ all -> 0x0ff3 }
            if (r4 == 0) goto L_0x0a82
            com.google.android.gms.measurement.internal.zzaf r4 = r2.zzi()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r5 = r11.zzj()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzf r4 = r4.zzb(r5)     // Catch:{ all -> 0x0ff3 }
            if (r4 == 0) goto L_0x0a82
            boolean r4 = r4.zzaf()     // Catch:{ all -> 0x0ff3 }
            if (r4 == 0) goto L_0x0a82
            com.google.android.gms.measurement.internal.zzak r4 = r2.zzk()     // Catch:{ all -> 0x0ff3 }
            boolean r4 = r4.zzi()     // Catch:{ all -> 0x0ff3 }
            if (r4 == 0) goto L_0x0a82
            com.google.android.gms.measurement.internal.zzeq r4 = r2.zzq()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzes r4 = r4.zzv()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r5 = "Turning off ad personalization due to account type"
            r4.zza(r5)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzk$zza r4 = com.google.android.gms.internal.measurement.zzcd.zzk.zzj()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r5 = "_npa"
            com.google.android.gms.internal.measurement.zzcd$zzk$zza r4 = r4.zza((java.lang.String) r5)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzak r2 = r2.zzk()     // Catch:{ all -> 0x0ff3 }
            long r5 = r2.zzg()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzk$zza r2 = r4.zza((long) r5)     // Catch:{ all -> 0x0ff3 }
            r4 = 1
            com.google.android.gms.internal.measurement.zzcd$zzk$zza r2 = r2.zzb((long) r4)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzjj r2 = r2.zzy()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzhy r2 = (com.google.android.gms.internal.measurement.zzhy) r2     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzk r2 = (com.google.android.gms.internal.measurement.zzcd.zzk) r2     // Catch:{ all -> 0x0ff3 }
            r4 = 0
        L_0x0a5e:
            int r5 = r11.zze()     // Catch:{ all -> 0x0ff3 }
            if (r4 >= r5) goto L_0x0a7c
            java.lang.String r5 = "_npa"
            com.google.android.gms.internal.measurement.zzcd$zzk r6 = r11.zzd((int) r4)     // Catch:{ all -> 0x0ff3 }
            java.lang.String r6 = r6.zzc()     // Catch:{ all -> 0x0ff3 }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x0ff3 }
            if (r5 == 0) goto L_0x0a79
            r11.zza((int) r4, (com.google.android.gms.internal.measurement.zzcd.zzk) r2)     // Catch:{ all -> 0x0ff3 }
            r4 = 1
            goto L_0x0a7d
        L_0x0a79:
            int r4 = r4 + 1
            goto L_0x0a5e
        L_0x0a7c:
            r4 = 0
        L_0x0a7d:
            if (r4 != 0) goto L_0x0a82
            r11.zza((com.google.android.gms.internal.measurement.zzcd.zzk) r2)     // Catch:{ all -> 0x0ff3 }
        L_0x0a82:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            com.google.android.gms.internal.measurement.zzcd$zzg$zza r2 = r11.zzb((long) r4)     // Catch:{ all -> 0x0ff3 }
            r4 = -9223372036854775808
            r2.zzc((long) r4)     // Catch:{ all -> 0x0ff3 }
            r2 = 0
        L_0x0a91:
            int r4 = r11.zzb()     // Catch:{ all -> 0x0ff3 }
            if (r2 >= r4) goto L_0x0ac4
            com.google.android.gms.internal.measurement.zzcd$zzc r4 = r11.zzb((int) r2)     // Catch:{ all -> 0x0ff3 }
            long r5 = r4.zze()     // Catch:{ all -> 0x0ff3 }
            long r7 = r11.zzf()     // Catch:{ all -> 0x0ff3 }
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0aae
            long r5 = r4.zze()     // Catch:{ all -> 0x0ff3 }
            r11.zzb((long) r5)     // Catch:{ all -> 0x0ff3 }
        L_0x0aae:
            long r5 = r4.zze()     // Catch:{ all -> 0x0ff3 }
            long r7 = r11.zzg()     // Catch:{ all -> 0x0ff3 }
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0ac1
            long r4 = r4.zze()     // Catch:{ all -> 0x0ff3 }
            r11.zzc((long) r4)     // Catch:{ all -> 0x0ff3 }
        L_0x0ac1:
            int r2 = r2 + 1
            goto L_0x0a91
        L_0x0ac4:
            boolean r2 = com.google.android.gms.internal.measurement.zzoz.zzb()     // Catch:{ all -> 0x0ff3 }
            if (r2 == 0) goto L_0x0adf
            com.google.android.gms.measurement.internal.zzfu r2 = r1.zzk     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzab r2 = r2.zza()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r4 = r11.zzj()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.zzas.zzcf     // Catch:{ all -> 0x0ff3 }
            boolean r2 = r2.zze(r4, r5)     // Catch:{ all -> 0x0ff3 }
            if (r2 == 0) goto L_0x0adf
            r11.zzq()     // Catch:{ all -> 0x0ff3 }
        L_0x0adf:
            com.google.android.gms.internal.measurement.zzcd$zzg$zza r2 = r11.zzp()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzr r4 = r43.zzf()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r5 = r11.zzj()     // Catch:{ all -> 0x0ff3 }
            java.util.List r6 = r11.zza()     // Catch:{ all -> 0x0ff3 }
            java.util.List r7 = r11.zzd()     // Catch:{ all -> 0x0ff3 }
            long r8 = r11.zzf()     // Catch:{ all -> 0x0ff3 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0ff3 }
            long r9 = r11.zzg()     // Catch:{ all -> 0x0ff3 }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0ff3 }
            java.util.List r4 = r4.zza(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0ff3 }
            r2.zzc((java.lang.Iterable<? extends com.google.android.gms.internal.measurement.zzcd.zza>) r4)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzfu r2 = r1.zzk     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzab r2 = r2.zza()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzg r4 = r3.zza     // Catch:{ all -> 0x0ff3 }
            java.lang.String r4 = r4.zzx()     // Catch:{ all -> 0x0ff3 }
            boolean r2 = r2.zzi(r4)     // Catch:{ all -> 0x0ff3 }
            if (r2 == 0) goto L_0x0e47
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0fd2 }
            r2.<init>()     // Catch:{ all -> 0x0fd2 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0fd2 }
            r4.<init>()     // Catch:{ all -> 0x0fd2 }
            com.google.android.gms.measurement.internal.zzfu r5 = r1.zzk     // Catch:{ all -> 0x0fd2 }
            com.google.android.gms.measurement.internal.zzkv r5 = r5.zzh()     // Catch:{ all -> 0x0fd2 }
            java.security.SecureRandom r5 = r5.zzg()     // Catch:{ all -> 0x0fd2 }
            r6 = 0
        L_0x0b31:
            int r7 = r11.zzb()     // Catch:{ all -> 0x0fd2 }
            if (r6 >= r7) goto L_0x0e13
            com.google.android.gms.internal.measurement.zzcd$zzc r7 = r11.zzb((int) r6)     // Catch:{ all -> 0x0fd2 }
            com.google.android.gms.internal.measurement.zzhy$zzb r7 = r7.zzbo()     // Catch:{ all -> 0x0fd2 }
            com.google.android.gms.internal.measurement.zzhy$zzb r7 = (com.google.android.gms.internal.measurement.zzhy.zzb) r7     // Catch:{ all -> 0x0fd2 }
            com.google.android.gms.internal.measurement.zzcd$zzc$zza r7 = (com.google.android.gms.internal.measurement.zzcd.zzc.zza) r7     // Catch:{ all -> 0x0fd2 }
            java.lang.String r8 = r7.zzd()     // Catch:{ all -> 0x0fd2 }
            java.lang.String r9 = "_ep"
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0fd2 }
            if (r8 == 0) goto L_0x0bc3
            r43.zzh()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzjj r8 = r7.zzy()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzhy r8 = (com.google.android.gms.internal.measurement.zzhy) r8     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzc r8 = (com.google.android.gms.internal.measurement.zzcd.zzc) r8     // Catch:{ all -> 0x0ff3 }
            java.lang.String r9 = "_en"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzkr.zzb(r8, r9)     // Catch:{ all -> 0x0ff3 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0ff3 }
            java.lang.Object r9 = r2.get(r8)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzam r9 = (com.google.android.gms.measurement.internal.zzam) r9     // Catch:{ all -> 0x0ff3 }
            if (r9 != 0) goto L_0x0b7b
            com.google.android.gms.measurement.internal.zzaf r9 = r43.zze()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzg r10 = r3.zza     // Catch:{ all -> 0x0ff3 }
            java.lang.String r10 = r10.zzx()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzam r9 = r9.zza((java.lang.String) r10, (java.lang.String) r8)     // Catch:{ all -> 0x0ff3 }
            r2.put(r8, r9)     // Catch:{ all -> 0x0ff3 }
        L_0x0b7b:
            java.lang.Long r8 = r9.zzi     // Catch:{ all -> 0x0ff3 }
            if (r8 != 0) goto L_0x0bba
            java.lang.Long r8 = r9.zzj     // Catch:{ all -> 0x0ff3 }
            long r12 = r8.longValue()     // Catch:{ all -> 0x0ff3 }
            r14 = 1
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 <= 0) goto L_0x0b95
            r43.zzh()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r8 = "_sr"
            java.lang.Long r10 = r9.zzj     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzkr.zza((com.google.android.gms.internal.measurement.zzcd.zzc.zza) r7, (java.lang.String) r8, (java.lang.Object) r10)     // Catch:{ all -> 0x0ff3 }
        L_0x0b95:
            java.lang.Boolean r8 = r9.zzk     // Catch:{ all -> 0x0ff3 }
            if (r8 == 0) goto L_0x0baf
            java.lang.Boolean r8 = r9.zzk     // Catch:{ all -> 0x0ff3 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0ff3 }
            if (r8 == 0) goto L_0x0baf
            r43.zzh()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r8 = "_efs"
            r9 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzkr.zza((com.google.android.gms.internal.measurement.zzcd.zzc.zza) r7, (java.lang.String) r8, (java.lang.Object) r12)     // Catch:{ all -> 0x0ff3 }
        L_0x0baf:
            com.google.android.gms.internal.measurement.zzjj r8 = r7.zzy()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzhy r8 = (com.google.android.gms.internal.measurement.zzhy) r8     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzc r8 = (com.google.android.gms.internal.measurement.zzcd.zzc) r8     // Catch:{ all -> 0x0ff3 }
            r4.add(r8)     // Catch:{ all -> 0x0ff3 }
        L_0x0bba:
            r11.zza((int) r6, (com.google.android.gms.internal.measurement.zzcd.zzc.zza) r7)     // Catch:{ all -> 0x0ff3 }
        L_0x0bbd:
            r44 = r5
            r1 = r6
            r5 = r2
            goto L_0x0e0a
        L_0x0bc3:
            com.google.android.gms.measurement.internal.zzfo r8 = r43.zzc()     // Catch:{ all -> 0x0fd2 }
            com.google.android.gms.internal.measurement.zzcd$zzg r9 = r3.zza     // Catch:{ all -> 0x0fd2 }
            java.lang.String r9 = r9.zzx()     // Catch:{ all -> 0x0fd2 }
            long r8 = r8.zzf(r9)     // Catch:{ all -> 0x0fd2 }
            com.google.android.gms.measurement.internal.zzfu r10 = r1.zzk     // Catch:{ all -> 0x0fd2 }
            r10.zzh()     // Catch:{ all -> 0x0fd2 }
            long r12 = r7.zzf()     // Catch:{ all -> 0x0fd2 }
            long r12 = com.google.android.gms.measurement.internal.zzkv.zza((long) r12, (long) r8)     // Catch:{ all -> 0x0fd2 }
            com.google.android.gms.internal.measurement.zzjj r10 = r7.zzy()     // Catch:{ all -> 0x0fd2 }
            com.google.android.gms.internal.measurement.zzhy r10 = (com.google.android.gms.internal.measurement.zzhy) r10     // Catch:{ all -> 0x0fd2 }
            com.google.android.gms.internal.measurement.zzcd$zzc r10 = (com.google.android.gms.internal.measurement.zzcd.zzc) r10     // Catch:{ all -> 0x0fd2 }
            java.lang.String r14 = "_dbg"
            r17 = 1
            java.lang.Long r15 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x0fd2 }
            boolean r17 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x0fd2 }
            if (r17 != 0) goto L_0x0c4e
            if (r15 != 0) goto L_0x0bf7
            goto L_0x0c4e
        L_0x0bf7:
            java.util.List r10 = r10.zza()     // Catch:{ all -> 0x0ff3 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0ff3 }
        L_0x0bff:
            boolean r17 = r10.hasNext()     // Catch:{ all -> 0x0ff3 }
            if (r17 == 0) goto L_0x0c4e
            java.lang.Object r17 = r10.next()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zze r17 = (com.google.android.gms.internal.measurement.zzcd.zze) r17     // Catch:{ all -> 0x0ff3 }
            r44 = r10
            java.lang.String r10 = r17.zzb()     // Catch:{ all -> 0x0ff3 }
            boolean r10 = r14.equals(r10)     // Catch:{ all -> 0x0ff3 }
            if (r10 == 0) goto L_0x0c4b
            boolean r10 = r15 instanceof java.lang.Long     // Catch:{ all -> 0x0ff3 }
            if (r10 == 0) goto L_0x0c29
            long r18 = r17.zzf()     // Catch:{ all -> 0x0ff3 }
            java.lang.Long r10 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x0ff3 }
            boolean r10 = r15.equals(r10)     // Catch:{ all -> 0x0ff3 }
            if (r10 != 0) goto L_0x0c49
        L_0x0c29:
            boolean r10 = r15 instanceof java.lang.String     // Catch:{ all -> 0x0ff3 }
            if (r10 == 0) goto L_0x0c37
            java.lang.String r10 = r17.zzd()     // Catch:{ all -> 0x0ff3 }
            boolean r10 = r15.equals(r10)     // Catch:{ all -> 0x0ff3 }
            if (r10 != 0) goto L_0x0c49
        L_0x0c37:
            boolean r10 = r15 instanceof java.lang.Double     // Catch:{ all -> 0x0ff3 }
            if (r10 == 0) goto L_0x0c4e
            double r17 = r17.zzj()     // Catch:{ all -> 0x0ff3 }
            java.lang.Double r10 = java.lang.Double.valueOf(r17)     // Catch:{ all -> 0x0ff3 }
            boolean r10 = r15.equals(r10)     // Catch:{ all -> 0x0ff3 }
            if (r10 == 0) goto L_0x0c4e
        L_0x0c49:
            r10 = 1
            goto L_0x0c4f
        L_0x0c4b:
            r10 = r44
            goto L_0x0bff
        L_0x0c4e:
            r10 = 0
        L_0x0c4f:
            if (r10 != 0) goto L_0x0c64
            com.google.android.gms.measurement.internal.zzfo r10 = r43.zzc()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzg r14 = r3.zza     // Catch:{ all -> 0x0ff3 }
            java.lang.String r14 = r14.zzx()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r15 = r7.zzd()     // Catch:{ all -> 0x0ff3 }
            int r10 = r10.zzd(r14, r15)     // Catch:{ all -> 0x0ff3 }
            goto L_0x0c65
        L_0x0c64:
            r10 = 1
        L_0x0c65:
            if (r10 > 0) goto L_0x0c8e
            com.google.android.gms.measurement.internal.zzfu r8 = r1.zzk     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzeq r8 = r8.zzq()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzes r8 = r8.zzh()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r9 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r7.zzd()     // Catch:{ all -> 0x0ff3 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0ff3 }
            r8.zza(r9, r12, r10)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzjj r8 = r7.zzy()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzhy r8 = (com.google.android.gms.internal.measurement.zzhy) r8     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzc r8 = (com.google.android.gms.internal.measurement.zzcd.zzc) r8     // Catch:{ all -> 0x0ff3 }
            r4.add(r8)     // Catch:{ all -> 0x0ff3 }
            r11.zza((int) r6, (com.google.android.gms.internal.measurement.zzcd.zzc.zza) r7)     // Catch:{ all -> 0x0ff3 }
            goto L_0x0bbd
        L_0x0c8e:
            java.lang.String r14 = r7.zzd()     // Catch:{ all -> 0x0fd2 }
            java.lang.Object r14 = r2.get(r14)     // Catch:{ all -> 0x0fd2 }
            com.google.android.gms.measurement.internal.zzam r14 = (com.google.android.gms.measurement.internal.zzam) r14     // Catch:{ all -> 0x0fd2 }
            if (r14 != 0) goto L_0x0cf0
            com.google.android.gms.measurement.internal.zzaf r14 = r43.zze()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzg r15 = r3.zza     // Catch:{ all -> 0x0ff3 }
            java.lang.String r15 = r15.zzx()     // Catch:{ all -> 0x0ff3 }
            r17 = r8
            java.lang.String r8 = r7.zzd()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzam r14 = r14.zza((java.lang.String) r15, (java.lang.String) r8)     // Catch:{ all -> 0x0ff3 }
            if (r14 != 0) goto L_0x0cf2
            com.google.android.gms.measurement.internal.zzfu r8 = r1.zzk     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzeq r8 = r8.zzq()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzes r8 = r8.zzh()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r9 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.zzcd$zzg r14 = r3.zza     // Catch:{ all -> 0x0ff3 }
            java.lang.String r14 = r14.zzx()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r15 = r7.zzd()     // Catch:{ all -> 0x0ff3 }
            r8.zza(r9, r14, r15)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzam r8 = new com.google.android.gms.measurement.internal.zzam     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzg r9 = r3.zza     // Catch:{ all -> 0x0ff3 }
            java.lang.String r26 = r9.zzx()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r27 = r7.zzd()     // Catch:{ all -> 0x0ff3 }
            r28 = 1
            r30 = 1
            r32 = 1
            long r34 = r7.zzf()     // Catch:{ all -> 0x0ff3 }
            r36 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r25 = r8
            r25.<init>(r26, r27, r28, r30, r32, r34, r36, r38, r39, r40, r41)     // Catch:{ all -> 0x0ff3 }
            r14 = r8
            goto L_0x0cf2
        L_0x0cf0:
            r17 = r8
        L_0x0cf2:
            r43.zzh()     // Catch:{ all -> 0x0fd2 }
            com.google.android.gms.internal.measurement.zzjj r8 = r7.zzy()     // Catch:{ all -> 0x0fd2 }
            com.google.android.gms.internal.measurement.zzhy r8 = (com.google.android.gms.internal.measurement.zzhy) r8     // Catch:{ all -> 0x0fd2 }
            com.google.android.gms.internal.measurement.zzcd$zzc r8 = (com.google.android.gms.internal.measurement.zzcd.zzc) r8     // Catch:{ all -> 0x0fd2 }
            java.lang.String r9 = "_eid"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzkr.zzb(r8, r9)     // Catch:{ all -> 0x0fd2 }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ all -> 0x0fd2 }
            if (r8 == 0) goto L_0x0d09
            r9 = 1
            goto L_0x0d0a
        L_0x0d09:
            r9 = 0
        L_0x0d0a:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x0fd2 }
            r15 = 1
            if (r10 != r15) goto L_0x0d3f
            com.google.android.gms.internal.measurement.zzjj r8 = r7.zzy()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzhy r8 = (com.google.android.gms.internal.measurement.zzhy) r8     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzc r8 = (com.google.android.gms.internal.measurement.zzcd.zzc) r8     // Catch:{ all -> 0x0ff3 }
            r4.add(r8)     // Catch:{ all -> 0x0ff3 }
            boolean r8 = r9.booleanValue()     // Catch:{ all -> 0x0ff3 }
            if (r8 == 0) goto L_0x0d3a
            java.lang.Long r8 = r14.zzi     // Catch:{ all -> 0x0ff3 }
            if (r8 != 0) goto L_0x0d2e
            java.lang.Long r8 = r14.zzj     // Catch:{ all -> 0x0ff3 }
            if (r8 != 0) goto L_0x0d2e
            java.lang.Boolean r8 = r14.zzk     // Catch:{ all -> 0x0ff3 }
            if (r8 == 0) goto L_0x0d3a
        L_0x0d2e:
            r8 = 0
            com.google.android.gms.measurement.internal.zzam r9 = r14.zza(r8, r8, r8)     // Catch:{ all -> 0x0ff3 }
            java.lang.String r8 = r7.zzd()     // Catch:{ all -> 0x0ff3 }
            r2.put(r8, r9)     // Catch:{ all -> 0x0ff3 }
        L_0x0d3a:
            r11.zza((int) r6, (com.google.android.gms.internal.measurement.zzcd.zzc.zza) r7)     // Catch:{ all -> 0x0ff3 }
            goto L_0x0bbd
        L_0x0d3f:
            int r15 = r5.nextInt(r10)     // Catch:{ all -> 0x0fd2 }
            if (r15 != 0) goto L_0x0d81
            r43.zzh()     // Catch:{ all -> 0x0ff3 }
            java.lang.String r8 = "_sr"
            r44 = r5
            r15 = r6
            long r5 = (long) r10     // Catch:{ all -> 0x0ff3 }
            java.lang.Long r10 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzkr.zza((com.google.android.gms.internal.measurement.zzcd.zzc.zza) r7, (java.lang.String) r8, (java.lang.Object) r10)     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzjj r8 = r7.zzy()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzhy r8 = (com.google.android.gms.internal.measurement.zzhy) r8     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.internal.measurement.zzcd$zzc r8 = (com.google.android.gms.internal.measurement.zzcd.zzc) r8     // Catch:{ all -> 0x0ff3 }
            r4.add(r8)     // Catch:{ all -> 0x0ff3 }
            boolean r8 = r9.booleanValue()     // Catch:{ all -> 0x0ff3 }
            if (r8 == 0) goto L_0x0d6f
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0ff3 }
            r6 = 0
            com.google.android.gms.measurement.internal.zzam r14 = r14.zza(r6, r5, r6)     // Catch:{ all -> 0x0ff3 }
        L_0x0d6f:
            java.lang.String r5 = r7.zzd()     // Catch:{ all -> 0x0ff3 }
            long r8 = r7.zzf()     // Catch:{ all -> 0x0ff3 }
            com.google.android.gms.measurement.internal.zzam r6 = r14.zza(r8, r12)     // Catch:{ all -> 0x0ff3 }
            r2.put(r5, r6)     // Catch:{ all -> 0x0ff3 }
            r5 = r2
            goto L_0x0e06
        L_0x0d81:
            r44 = r5
            r15 = r6
            java.lang.Long r5 = r14.zzh     // Catch:{ all -> 0x0fd2 }
            if (r5 == 0) goto L_0x0d91
            java.lang.Long r5 = r14.zzh     // Catch:{ all -> 0x0ff3 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0ff3 }
            r19 = r2
            goto L_0x0da2
        L_0x0d91:
            com.google.android.gms.measurement.internal.zzfu r5 = r1.zzk     // Catch:{ all -> 0x0fd2 }
            r5.zzh()     // Catch:{ all -> 0x0fd2 }
            long r5 = r7.zzg()     // Catch:{ all -> 0x0fd2 }
            r19 = r2
            r1 = r17
            long r5 = com.google.android.gms.measurement.internal.zzkv.zza((long) r5, (long) r1)     // Catch:{ all -> 0x0fd2 }
        L_0x0da2:
            int r1 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x0df2
            r43.zzh()     // Catch:{ all -> 0x0fd2 }
            java.lang.String r1 = "_efs"
            r5 = 1
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0fd2 }
            com.google.android.gms.measurement.internal.zzkr.zza((com.google.android.gms.internal.measurement.zzcd.zzc.zza) r7, (java.lang.String) r1, (java.lang.Object) r2)     // Catch:{ all -> 0x0fd2 }
            r43.zzh()     // Catch:{ all -> 0x0fd2 }
            java.lang.String r1 = "_sr"
            long r5 = (long) r10     // Catch:{ all -> 0x0fd2 }
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0fd2 }
            com.google.android.gms.measurement.internal.zzkr.zza((com.google.android.gms.internal.measurement.zzcd.zzc.zza) r7, (java.lang.String) r1, (java.lang.Object) r2)     // Catch:{ all -> 0x0fd2 }
            com.google.android.gms.internal.measurement.zzjj r1 = r7.zzy()     // Catch:{ all -> 0x0fd2 }
            com.google.android.gms.internal.measurement.zzhy r1 = (com.google.android.gms.internal.measurement.zzhy) r1     // Catch:{ all -> 0x0fd2 }
            com.google.android.gms.internal.measurement.zzcd$zzc r1 = (com.google.android.gms.internal.measurement.zzcd.zzc) r1     // Catch:{ all -> 0x0fd2 }
            r4.add(r1)     // Catch:{ all -> 0x0fd2 }
            boolean r1 = r9.booleanValue()     // Catch:{ all -> 0x0fd2 }
            if (r1 == 0) goto L_0x0de0
            java.lang.Long r1 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0fd2 }
            r2 = 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0fd2 }
            r2 = 0
            com.google.android.gms.measurement.internal.zzam r14 = r14.zza(r2, r1, r5)     // Catch:{ all -> 0x0fd2 }
        L_0x0de0:
            java.lang.String r1 = r7.zzd()     // Catch:{ all -> 0x0fd2 }
            long r5 = r7.zzf()     // Catch:{ all -> 0x0fd2 }
            com.google.android.gms.measurement.internal.zzam r2 = r14.zza(r5, r12)     // Catch:{ all -> 0x0fd2 }
            r5 = r19
            r5.put(r1, r2)     // Catch:{ all -> 0x0fd2 }
            goto L_0x0e06
        L_0x0df2:
            r5 = r19
            boolean r1 = r9.booleanValue()     // Catch:{ all -> 0x0fd2 }
            if (r1 == 0) goto L_0x0e06
            java.lang.String r1 = r7.zzd()     // Catch:{ all -> 0x0fd2 }
            r2 = 0
            com.google.android.gms.measurement.internal.zzam r6 = r14.zza(r8, r2, r2)     // Catch:{ all -> 0x0fd2 }
            r5.put(r1, r6)     // Catch:{ all -> 0x0fd2 }
        L_0x0e06:
            r1 = r15
            r11.zza((int) r1, (com.google.android.gms.internal.measurement.zzcd.zzc.zza) r7)     // Catch:{ all -> 0x0fd2 }
        L_0x0e0a:
            int r6 = r1 + 1
            r1 = r43
            r2 = r5
            r5 = r44
            goto L_0x0b31
        L_0x0e13:
            r5 = r2
            int r1 = r4.size()     // Catch:{ all -> 0x0fd2 }
            int r2 = r11.zzb()     // Catch:{ all -> 0x0fd2 }
            if (r1 >= r2) goto L_0x0e25
            com.google.android.gms.internal.measurement.zzcd$zzg$zza r1 = r11.zzc()     // Catch:{ all -> 0x0fd2 }
            r1.zza((java.lang.Iterable<? extends com.google.android.gms.internal.measurement.zzcd.zzc>) r4)     // Catch:{ all -> 0x0fd2 }
        L_0x0e25:
            java.util.Set r1 = r5.entrySet()     // Catch:{ all -> 0x0fd2 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0fd2 }
        L_0x0e2d:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0fd2 }
            if (r2 == 0) goto L_0x0e47
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0fd2 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0fd2 }
            com.google.android.gms.measurement.internal.zzaf r4 = r43.zze()     // Catch:{ all -> 0x0fd2 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0fd2 }
            com.google.android.gms.measurement.internal.zzam r2 = (com.google.android.gms.measurement.internal.zzam) r2     // Catch:{ all -> 0x0fd2 }
            r4.zza((com.google.android.gms.measurement.internal.zzam) r2)     // Catch:{ all -> 0x0fd2 }
            goto L_0x0e2d
        L_0x0e47:
            com.google.android.gms.internal.measurement.zzcd$zzg r1 = r3.zza     // Catch:{ all -> 0x0fd2 }
            java.lang.String r1 = r1.zzx()     // Catch:{ all -> 0x0fd2 }
            com.google.android.gms.measurement.internal.zzaf r2 = r43.zze()     // Catch:{ all -> 0x0fd2 }
            com.google.android.gms.measurement.internal.zzf r2 = r2.zzb(r1)     // Catch:{ all -> 0x0fd2 }
            if (r2 != 0) goto L_0x0e73
            r4 = r43
            com.google.android.gms.measurement.internal.zzfu r2 = r4.zzk     // Catch:{ all -> 0x0ff1 }
            com.google.android.gms.measurement.internal.zzeq r2 = r2.zzq()     // Catch:{ all -> 0x0ff1 }
            com.google.android.gms.measurement.internal.zzes r2 = r2.zze()     // Catch:{ all -> 0x0ff1 }
            java.lang.String r5 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.zzcd$zzg r6 = r3.zza     // Catch:{ all -> 0x0ff1 }
            java.lang.String r6 = r6.zzx()     // Catch:{ all -> 0x0ff1 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r6)     // Catch:{ all -> 0x0ff1 }
            r2.zza(r5, r6)     // Catch:{ all -> 0x0ff1 }
            goto L_0x0ed0
        L_0x0e73:
            r4 = r43
            int r5 = r11.zzb()     // Catch:{ all -> 0x0ff1 }
            if (r5 <= 0) goto L_0x0ed0
            long r5 = r2.zzk()     // Catch:{ all -> 0x0ff1 }
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0e89
            r11.zze((long) r5)     // Catch:{ all -> 0x0ff1 }
            goto L_0x0e8c
        L_0x0e89:
            r11.zzi()     // Catch:{ all -> 0x0ff1 }
        L_0x0e8c:
            long r7 = r2.zzj()     // Catch:{ all -> 0x0ff1 }
            r9 = 0
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 != 0) goto L_0x0e97
            goto L_0x0e98
        L_0x0e97:
            r5 = r7
        L_0x0e98:
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x0ea0
            r11.zzd((long) r5)     // Catch:{ all -> 0x0ff1 }
            goto L_0x0ea3
        L_0x0ea0:
            r11.zzh()     // Catch:{ all -> 0x0ff1 }
        L_0x0ea3:
            r2.zzv()     // Catch:{ all -> 0x0ff1 }
            long r5 = r2.zzs()     // Catch:{ all -> 0x0ff1 }
            int r6 = (int) r5     // Catch:{ all -> 0x0ff1 }
            r11.zzg((int) r6)     // Catch:{ all -> 0x0ff1 }
            long r5 = r11.zzf()     // Catch:{ all -> 0x0ff1 }
            r2.zza((long) r5)     // Catch:{ all -> 0x0ff1 }
            long r5 = r11.zzg()     // Catch:{ all -> 0x0ff1 }
            r2.zzb((long) r5)     // Catch:{ all -> 0x0ff1 }
            java.lang.String r5 = r2.zzad()     // Catch:{ all -> 0x0ff1 }
            if (r5 == 0) goto L_0x0ec6
            r11.zzj((java.lang.String) r5)     // Catch:{ all -> 0x0ff1 }
            goto L_0x0ec9
        L_0x0ec6:
            r11.zzn()     // Catch:{ all -> 0x0ff1 }
        L_0x0ec9:
            com.google.android.gms.measurement.internal.zzaf r5 = r43.zze()     // Catch:{ all -> 0x0ff1 }
            r5.zza((com.google.android.gms.measurement.internal.zzf) r2)     // Catch:{ all -> 0x0ff1 }
        L_0x0ed0:
            int r2 = r11.zzb()     // Catch:{ all -> 0x0ff1 }
            if (r2 <= 0) goto L_0x0f31
            com.google.android.gms.measurement.internal.zzfo r2 = r43.zzc()     // Catch:{ all -> 0x0ff1 }
            com.google.android.gms.internal.measurement.zzcd$zzg r5 = r3.zza     // Catch:{ all -> 0x0ff1 }
            java.lang.String r5 = r5.zzx()     // Catch:{ all -> 0x0ff1 }
            com.google.android.gms.internal.measurement.zzca$zzb r2 = r2.zza((java.lang.String) r5)     // Catch:{ all -> 0x0ff1 }
            if (r2 == 0) goto L_0x0ef5
            boolean r5 = r2.zza()     // Catch:{ all -> 0x0ff1 }
            if (r5 != 0) goto L_0x0eed
            goto L_0x0ef5
        L_0x0eed:
            long r5 = r2.zzb()     // Catch:{ all -> 0x0ff1 }
            r11.zzi((long) r5)     // Catch:{ all -> 0x0ff1 }
            goto L_0x0f20
        L_0x0ef5:
            com.google.android.gms.internal.measurement.zzcd$zzg r2 = r3.zza     // Catch:{ all -> 0x0ff1 }
            java.lang.String r2 = r2.zzam()     // Catch:{ all -> 0x0ff1 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0ff1 }
            if (r2 == 0) goto L_0x0f07
            r5 = -1
            r11.zzi((long) r5)     // Catch:{ all -> 0x0ff1 }
            goto L_0x0f20
        L_0x0f07:
            com.google.android.gms.measurement.internal.zzfu r2 = r4.zzk     // Catch:{ all -> 0x0ff1 }
            com.google.android.gms.measurement.internal.zzeq r2 = r2.zzq()     // Catch:{ all -> 0x0ff1 }
            com.google.android.gms.measurement.internal.zzes r2 = r2.zzh()     // Catch:{ all -> 0x0ff1 }
            java.lang.String r5 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.zzcd$zzg r6 = r3.zza     // Catch:{ all -> 0x0ff1 }
            java.lang.String r6 = r6.zzx()     // Catch:{ all -> 0x0ff1 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r6)     // Catch:{ all -> 0x0ff1 }
            r2.zza(r5, r6)     // Catch:{ all -> 0x0ff1 }
        L_0x0f20:
            com.google.android.gms.measurement.internal.zzaf r2 = r43.zze()     // Catch:{ all -> 0x0ff1 }
            com.google.android.gms.internal.measurement.zzjj r5 = r11.zzy()     // Catch:{ all -> 0x0ff1 }
            com.google.android.gms.internal.measurement.zzhy r5 = (com.google.android.gms.internal.measurement.zzhy) r5     // Catch:{ all -> 0x0ff1 }
            com.google.android.gms.internal.measurement.zzcd$zzg r5 = (com.google.android.gms.internal.measurement.zzcd.zzg) r5     // Catch:{ all -> 0x0ff1 }
            r12 = r20
            r2.zza((com.google.android.gms.internal.measurement.zzcd.zzg) r5, (boolean) r12)     // Catch:{ all -> 0x0ff1 }
        L_0x0f31:
            com.google.android.gms.measurement.internal.zzaf r2 = r43.zze()     // Catch:{ all -> 0x0ff1 }
            java.util.List<java.lang.Long> r3 = r3.zzb     // Catch:{ all -> 0x0ff1 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch:{ all -> 0x0ff1 }
            r2.zzc()     // Catch:{ all -> 0x0ff1 }
            r2.zzaj()     // Catch:{ all -> 0x0ff1 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ff1 }
            java.lang.String r6 = "rowid in ("
            r5.<init>(r6)     // Catch:{ all -> 0x0ff1 }
            r6 = 0
        L_0x0f48:
            int r7 = r3.size()     // Catch:{ all -> 0x0ff1 }
            if (r6 >= r7) goto L_0x0f65
            if (r6 == 0) goto L_0x0f55
            java.lang.String r7 = ","
            r5.append(r7)     // Catch:{ all -> 0x0ff1 }
        L_0x0f55:
            java.lang.Object r7 = r3.get(r6)     // Catch:{ all -> 0x0ff1 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0ff1 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0ff1 }
            r5.append(r7)     // Catch:{ all -> 0x0ff1 }
            int r6 = r6 + 1
            goto L_0x0f48
        L_0x0f65:
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0ff1 }
            android.database.sqlite.SQLiteDatabase r6 = r2.mo29305c_()     // Catch:{ all -> 0x0ff1 }
            java.lang.String r7 = "raw_events"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0ff1 }
            r8 = 0
            int r5 = r6.delete(r7, r5, r8)     // Catch:{ all -> 0x0ff1 }
            int r6 = r3.size()     // Catch:{ all -> 0x0ff1 }
            if (r5 == r6) goto L_0x0f98
            com.google.android.gms.measurement.internal.zzeq r2 = r2.zzq()     // Catch:{ all -> 0x0ff1 }
            com.google.android.gms.measurement.internal.zzes r2 = r2.zze()     // Catch:{ all -> 0x0ff1 }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0ff1 }
            int r3 = r3.size()     // Catch:{ all -> 0x0ff1 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0ff1 }
            r2.zza(r6, r5, r3)     // Catch:{ all -> 0x0ff1 }
        L_0x0f98:
            com.google.android.gms.measurement.internal.zzaf r2 = r43.zze()     // Catch:{ all -> 0x0ff1 }
            android.database.sqlite.SQLiteDatabase r3 = r2.mo29305c_()     // Catch:{ all -> 0x0ff1 }
            java.lang.String r5 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0faf }
            r7 = 0
            r6[r7] = r1     // Catch:{ SQLiteException -> 0x0faf }
            r7 = 1
            r6[r7] = r1     // Catch:{ SQLiteException -> 0x0faf }
            r3.execSQL(r5, r6)     // Catch:{ SQLiteException -> 0x0faf }
            goto L_0x0fc2
        L_0x0faf:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.zzeq r2 = r2.zzq()     // Catch:{ all -> 0x0ff1 }
            com.google.android.gms.measurement.internal.zzes r2 = r2.zze()     // Catch:{ all -> 0x0ff1 }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r1)     // Catch:{ all -> 0x0ff1 }
            r2.zza(r5, r1, r3)     // Catch:{ all -> 0x0ff1 }
        L_0x0fc2:
            com.google.android.gms.measurement.internal.zzaf r1 = r43.zze()     // Catch:{ all -> 0x0ff1 }
            r1.mo29304b_()     // Catch:{ all -> 0x0ff1 }
            com.google.android.gms.measurement.internal.zzaf r1 = r43.zze()
            r1.zzg()
            r1 = 1
            return r1
        L_0x0fd2:
            r0 = move-exception
            r4 = r43
            goto L_0x0ff5
        L_0x0fd6:
            r4 = r1
            com.google.android.gms.measurement.internal.zzaf r1 = r43.zze()     // Catch:{ all -> 0x0ff1 }
            r1.mo29304b_()     // Catch:{ all -> 0x0ff1 }
            com.google.android.gms.measurement.internal.zzaf r1 = r43.zze()
            r1.zzg()
            r1 = 0
            return r1
        L_0x0fe7:
            r0 = move-exception
            r4 = r1
            r1 = r0
            r8 = r6
        L_0x0feb:
            if (r8 == 0) goto L_0x0ff0
            r8.close()     // Catch:{ all -> 0x0ff1 }
        L_0x0ff0:
            throw r1     // Catch:{ all -> 0x0ff1 }
        L_0x0ff1:
            r0 = move-exception
            goto L_0x0ff5
        L_0x0ff3:
            r0 = move-exception
            r4 = r1
        L_0x0ff5:
            r1 = r0
            com.google.android.gms.measurement.internal.zzaf r2 = r43.zze()
            r2.zzg()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkl.zza(java.lang.String, long):boolean");
    }

    private final void zza(zzcd.zzg.zza zza2, long j, boolean z) {
        zzkw zzkw;
        String str = z ? "_se" : "_lte";
        zzkw zzc2 = zze().zzc(zza2.zzj(), str);
        if (zzc2 == null || zzc2.zze == null) {
            zzkw = new zzkw(zza2.zzj(), "auto", str, this.zzk.zzl().currentTimeMillis(), Long.valueOf(j));
        } else {
            zzkw = new zzkw(zza2.zzj(), "auto", str, this.zzk.zzl().currentTimeMillis(), Long.valueOf(((Long) zzc2.zze).longValue() + j));
        }
        zzcd.zzk zzk2 = (zzcd.zzk) ((zzhy) zzcd.zzk.zzj().zza(str).zza(this.zzk.zzl().currentTimeMillis()).zzb(((Long) zzkw.zze).longValue()).zzy());
        boolean z2 = false;
        int zza3 = zzkr.zza(zza2, str);
        if (zza3 >= 0) {
            zza2.zza(zza3, zzk2);
            z2 = true;
        }
        if (!z2) {
            zza2.zza(zzk2);
        }
        if (j > 0) {
            zze().zza(zzkw);
            this.zzk.zzq().zzw().zza("Updated engagement user property. scope, value", z ? "session-scoped" : "lifetime", zzkw.zze);
        }
    }

    private final boolean zza(zzcd.zzc.zza zza2, zzcd.zzc.zza zza3) {
        String str;
        Preconditions.checkArgument("_e".equals(zza2.zzd()));
        zzh();
        zzcd.zze zza4 = zzkr.zza((zzcd.zzc) ((zzhy) zza2.zzy()), "_sc");
        String str2 = null;
        if (zza4 == null) {
            str = null;
        } else {
            str = zza4.zzd();
        }
        zzh();
        zzcd.zze zza5 = zzkr.zza((zzcd.zzc) ((zzhy) zza3.zzy()), "_pc");
        if (zza5 != null) {
            str2 = zza5.zzd();
        }
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        zzb(zza2, zza3);
        return true;
    }

    private final void zzb(zzcd.zzc.zza zza2, zzcd.zzc.zza zza3) {
        Preconditions.checkArgument("_e".equals(zza2.zzd()));
        zzh();
        zzcd.zze zza4 = zzkr.zza((zzcd.zzc) ((zzhy) zza2.zzy()), "_et");
        if (zza4.zze() && zza4.zzf() > 0) {
            long zzf2 = zza4.zzf();
            zzh();
            zzcd.zze zza5 = zzkr.zza((zzcd.zzc) ((zzhy) zza3.zzy()), "_et");
            if (zza5 != null && zza5.zzf() > 0) {
                zzf2 += zza5.zzf();
            }
            zzh();
            zzkr.zza(zza3, "_et", (Object) Long.valueOf(zzf2));
            zzh();
            zzkr.zza(zza2, "_fr", (Object) 1L);
        }
    }

    private static void zza(zzcd.zzc.zza zza2, String str) {
        List<zzcd.zze> zza3 = zza2.zza();
        for (int i = 0; i < zza3.size(); i++) {
            if (str.equals(zza3.get(i).zzb())) {
                zza2.zzb(i);
                return;
            }
        }
    }

    private static void zza(zzcd.zzc.zza zza2, int i, String str) {
        List<zzcd.zze> zza3 = zza2.zza();
        int i2 = 0;
        while (i2 < zza3.size()) {
            if (!"_err".equals(zza3.get(i2).zzb())) {
                i2++;
            } else {
                return;
            }
        }
        zza2.zza((zzcd.zze) ((zzhy) zzcd.zze.zzm().zza("_err").zza(Long.valueOf((long) i).longValue()).zzy())).zza((zzcd.zze) ((zzhy) zzcd.zze.zzm().zza("_ev").zzb(str).zzy()));
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final void zza(int i, Throwable th, byte[] bArr, String str) {
        zzaf zze2;
        zzx();
        zzn();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.zzs = false;
                zzac();
                throw th2;
            }
        }
        List<Long> list = this.zzw;
        this.zzw = null;
        boolean z = true;
        if ((i == 200 || i == 204) && th == null) {
            try {
                this.zzk.zzb().zzc.zza(this.zzk.zzl().currentTimeMillis());
                this.zzk.zzb().zzd.zza(0);
                zzab();
                this.zzk.zzq().zzw().zza("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                zze().zze();
                try {
                    for (Long next : list) {
                        try {
                            zze2 = zze();
                            long longValue = next.longValue();
                            zze2.zzc();
                            zze2.zzaj();
                            if (zze2.mo29305c_().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            zze2.zzq().zze().zza("Failed to delete a bundle in a queue table", e);
                            throw e;
                        } catch (SQLiteException e2) {
                            if (this.zzx == null || !this.zzx.contains(next)) {
                                throw e2;
                            }
                        }
                    }
                    zze().mo29304b_();
                    zze().zzg();
                    this.zzx = null;
                    if (!zzd().zze() || !zzaa()) {
                        this.zzy = -1;
                        zzab();
                    } else {
                        zzo();
                    }
                    this.zzn = 0;
                } catch (Throwable th3) {
                    zze().zzg();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                this.zzk.zzq().zze().zza("Database error while trying to delete uploaded bundles", e3);
                this.zzn = this.zzk.zzl().elapsedRealtime();
                this.zzk.zzq().zzw().zza("Disable upload, time", Long.valueOf(this.zzn));
            }
        } else {
            this.zzk.zzq().zzw().zza("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.zzk.zzb().zzd.zza(this.zzk.zzl().currentTimeMillis());
            if (i != 503) {
                if (i != 429) {
                    z = false;
                }
            }
            if (z) {
                this.zzk.zzb().zze.zza(this.zzk.zzl().currentTimeMillis());
            }
            zze().zza(list);
            zzab();
        }
        this.zzs = false;
        zzac();
    }

    private final boolean zzaa() {
        zzx();
        zzn();
        return zze().zzx() || !TextUtils.isEmpty(zze().mo29306d_());
    }

    private final void zza(zzf zzf2) {
        ArrayMap arrayMap;
        zzx();
        if (!zznv.zzb() || !this.zzk.zza().zze(zzf2.zzc(), zzas.zzbi)) {
            if (TextUtils.isEmpty(zzf2.zze()) && TextUtils.isEmpty(zzf2.zzf())) {
                zza(zzf2.zzc(), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
                return;
            }
        } else if (TextUtils.isEmpty(zzf2.zze()) && TextUtils.isEmpty(zzf2.zzg()) && TextUtils.isEmpty(zzf2.zzf())) {
            zza(zzf2.zzc(), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
            return;
        }
        String zza2 = this.zzk.zza().zza(zzf2);
        try {
            URL url = new URL(zza2);
            this.zzk.zzq().zzw().zza("Fetching remote configuration", zzf2.zzc());
            zzca.zzb zza3 = zzc().zza(zzf2.zzc());
            String zzb2 = zzc().zzb(zzf2.zzc());
            if (zza3 == null || TextUtils.isEmpty(zzb2)) {
                arrayMap = null;
            } else {
                ArrayMap arrayMap2 = new ArrayMap();
                arrayMap2.put("If-Modified-Since", zzb2);
                arrayMap = arrayMap2;
            }
            this.zzr = true;
            zzex zzd2 = zzd();
            String zzc2 = zzf2.zzc();
            zzkm zzkm = new zzkm(this);
            zzd2.zzc();
            zzd2.zzaj();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(zzkm);
            zzd2.zzp().zzc((Runnable) new zzfb(zzd2, zzc2, url, (byte[]) null, arrayMap, zzkm));
        } catch (MalformedURLException unused) {
            this.zzk.zzq().zze().zza("Failed to parse config URL. Not fetching. appId", zzeq.zza(zzf2.zzc()), zza2);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013a A[Catch:{ all -> 0x018d, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014a A[Catch:{ all -> 0x018d, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0172 A[Catch:{ all -> 0x018d, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0176 A[Catch:{ all -> 0x018d, all -> 0x0196 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            r6 = this;
            r6.zzx()
            r6.zzn()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r7)
            r0 = 0
            if (r10 != 0) goto L_0x000e
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x0196 }
        L_0x000e:
            com.google.android.gms.measurement.internal.zzfu r1 = r6.zzk     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzeq r1 = r1.zzq()     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzes r1 = r1.zzw()     // Catch:{ all -> 0x0196 }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r10.length     // Catch:{ all -> 0x0196 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0196 }
            r1.zza(r2, r3)     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzaf r1 = r6.zze()     // Catch:{ all -> 0x0196 }
            r1.zze()     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzaf r1 = r6.zze()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzf r1 = r1.zzb(r7)     // Catch:{ all -> 0x018d }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 304(0x130, float:4.26E-43)
            r4 = 1
            if (r8 == r2) goto L_0x003e
            r2 = 204(0xcc, float:2.86E-43)
            if (r8 == r2) goto L_0x003e
            if (r8 != r3) goto L_0x0042
        L_0x003e:
            if (r9 != 0) goto L_0x0042
            r2 = 1
            goto L_0x0043
        L_0x0042:
            r2 = 0
        L_0x0043:
            if (r1 != 0) goto L_0x005a
            com.google.android.gms.measurement.internal.zzfu r8 = r6.zzk     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzeq r8 = r8.zzq()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzes r8 = r8.zzh()     // Catch:{ all -> 0x018d }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r7)     // Catch:{ all -> 0x018d }
            r8.zza(r9, r7)     // Catch:{ all -> 0x018d }
            goto L_0x0179
        L_0x005a:
            r5 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto L_0x00ca
            if (r8 != r5) goto L_0x0061
            goto L_0x00ca
        L_0x0061:
            com.google.android.gms.measurement.internal.zzfu r10 = r6.zzk     // Catch:{ all -> 0x018d }
            com.google.android.gms.common.util.Clock r10 = r10.zzl()     // Catch:{ all -> 0x018d }
            long r10 = r10.currentTimeMillis()     // Catch:{ all -> 0x018d }
            r1.zzi((long) r10)     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzaf r10 = r6.zze()     // Catch:{ all -> 0x018d }
            r10.zza((com.google.android.gms.measurement.internal.zzf) r1)     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzfu r10 = r6.zzk     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzeq r10 = r10.zzq()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzes r10 = r10.zzw()     // Catch:{ all -> 0x018d }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x018d }
            r10.zza(r11, r1, r9)     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzfo r9 = r6.zzc()     // Catch:{ all -> 0x018d }
            r9.zzc(r7)     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzfu r7 = r6.zzk     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzfc r7 = r7.zzb()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzfg r7 = r7.zzd     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzfu r9 = r6.zzk     // Catch:{ all -> 0x018d }
            com.google.android.gms.common.util.Clock r9 = r9.zzl()     // Catch:{ all -> 0x018d }
            long r9 = r9.currentTimeMillis()     // Catch:{ all -> 0x018d }
            r7.zza(r9)     // Catch:{ all -> 0x018d }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00ae
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r4 = 0
        L_0x00ae:
            if (r4 == 0) goto L_0x00c5
            com.google.android.gms.measurement.internal.zzfu r7 = r6.zzk     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzfc r7 = r7.zzb()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzfg r7 = r7.zze     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzfu r8 = r6.zzk     // Catch:{ all -> 0x018d }
            com.google.android.gms.common.util.Clock r8 = r8.zzl()     // Catch:{ all -> 0x018d }
            long r8 = r8.currentTimeMillis()     // Catch:{ all -> 0x018d }
            r7.zza(r8)     // Catch:{ all -> 0x018d }
        L_0x00c5:
            r6.zzab()     // Catch:{ all -> 0x018d }
            goto L_0x0179
        L_0x00ca:
            r9 = 0
            if (r11 == 0) goto L_0x00d6
            java.lang.String r2 = "Last-Modified"
            java.lang.Object r11 = r11.get(r2)     // Catch:{ all -> 0x018d }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x018d }
            goto L_0x00d7
        L_0x00d6:
            r11 = r9
        L_0x00d7:
            if (r11 == 0) goto L_0x00e6
            int r2 = r11.size()     // Catch:{ all -> 0x018d }
            if (r2 <= 0) goto L_0x00e6
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x018d }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x018d }
            goto L_0x00e7
        L_0x00e6:
            r11 = r9
        L_0x00e7:
            if (r8 == r5) goto L_0x0103
            if (r8 != r3) goto L_0x00ec
            goto L_0x0103
        L_0x00ec:
            com.google.android.gms.measurement.internal.zzfo r9 = r6.zzc()     // Catch:{ all -> 0x018d }
            boolean r9 = r9.zza(r7, r10, r11)     // Catch:{ all -> 0x018d }
            if (r9 != 0) goto L_0x0124
            com.google.android.gms.measurement.internal.zzaf r7 = r6.zze()     // Catch:{ all -> 0x0196 }
            r7.zzg()     // Catch:{ all -> 0x0196 }
            r6.zzr = r0
            r6.zzac()
            return
        L_0x0103:
            com.google.android.gms.measurement.internal.zzfo r11 = r6.zzc()     // Catch:{ all -> 0x018d }
            com.google.android.gms.internal.measurement.zzca$zzb r11 = r11.zza((java.lang.String) r7)     // Catch:{ all -> 0x018d }
            if (r11 != 0) goto L_0x0124
            com.google.android.gms.measurement.internal.zzfo r11 = r6.zzc()     // Catch:{ all -> 0x018d }
            boolean r9 = r11.zza(r7, r9, r9)     // Catch:{ all -> 0x018d }
            if (r9 != 0) goto L_0x0124
            com.google.android.gms.measurement.internal.zzaf r7 = r6.zze()     // Catch:{ all -> 0x0196 }
            r7.zzg()     // Catch:{ all -> 0x0196 }
            r6.zzr = r0
            r6.zzac()
            return
        L_0x0124:
            com.google.android.gms.measurement.internal.zzfu r9 = r6.zzk     // Catch:{ all -> 0x018d }
            com.google.android.gms.common.util.Clock r9 = r9.zzl()     // Catch:{ all -> 0x018d }
            long r2 = r9.currentTimeMillis()     // Catch:{ all -> 0x018d }
            r1.zzh((long) r2)     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzaf r9 = r6.zze()     // Catch:{ all -> 0x018d }
            r9.zza((com.google.android.gms.measurement.internal.zzf) r1)     // Catch:{ all -> 0x018d }
            if (r8 != r5) goto L_0x014a
            com.google.android.gms.measurement.internal.zzfu r8 = r6.zzk     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzeq r8 = r8.zzq()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzes r8 = r8.zzj()     // Catch:{ all -> 0x018d }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.zza(r9, r7)     // Catch:{ all -> 0x018d }
            goto L_0x0162
        L_0x014a:
            com.google.android.gms.measurement.internal.zzfu r7 = r6.zzk     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzeq r7 = r7.zzq()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzes r7 = r7.zzw()     // Catch:{ all -> 0x018d }
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x018d }
            int r10 = r10.length     // Catch:{ all -> 0x018d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x018d }
            r7.zza(r9, r8, r10)     // Catch:{ all -> 0x018d }
        L_0x0162:
            com.google.android.gms.measurement.internal.zzex r7 = r6.zzd()     // Catch:{ all -> 0x018d }
            boolean r7 = r7.zze()     // Catch:{ all -> 0x018d }
            if (r7 == 0) goto L_0x0176
            boolean r7 = r6.zzaa()     // Catch:{ all -> 0x018d }
            if (r7 == 0) goto L_0x0176
            r6.zzo()     // Catch:{ all -> 0x018d }
            goto L_0x0179
        L_0x0176:
            r6.zzab()     // Catch:{ all -> 0x018d }
        L_0x0179:
            com.google.android.gms.measurement.internal.zzaf r7 = r6.zze()     // Catch:{ all -> 0x018d }
            r7.mo29304b_()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzaf r7 = r6.zze()     // Catch:{ all -> 0x0196 }
            r7.zzg()     // Catch:{ all -> 0x0196 }
            r6.zzr = r0
            r6.zzac()
            return
        L_0x018d:
            r7 = move-exception
            com.google.android.gms.measurement.internal.zzaf r8 = r6.zze()     // Catch:{ all -> 0x0196 }
            r8.zzg()     // Catch:{ all -> 0x0196 }
            throw r7     // Catch:{ all -> 0x0196 }
        L_0x0196:
            r7 = move-exception
            r6.zzr = r0
            r6.zzac()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkl.zza(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzab() {
        /*
            r21 = this;
            r0 = r21
            r21.zzx()
            r21.zzn()
            long r1 = r0.zzn
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004d
            com.google.android.gms.measurement.internal.zzfu r1 = r0.zzk
            com.google.android.gms.common.util.Clock r1 = r1.zzl()
            long r1 = r1.elapsedRealtime()
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r7 = r0.zzn
            long r1 = r1 - r7
            long r1 = java.lang.Math.abs(r1)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004b
            com.google.android.gms.measurement.internal.zzfu r1 = r0.zzk
            com.google.android.gms.measurement.internal.zzeq r1 = r1.zzq()
            com.google.android.gms.measurement.internal.zzes r1 = r1.zzw()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r1.zza(r3, r2)
            com.google.android.gms.measurement.internal.zzfa r1 = r21.zzv()
            r1.zzb()
            com.google.android.gms.measurement.internal.zzkh r1 = r21.zzw()
            r1.zze()
            return
        L_0x004b:
            r0.zzn = r3
        L_0x004d:
            com.google.android.gms.measurement.internal.zzfu r1 = r0.zzk
            boolean r1 = r1.zzaf()
            if (r1 == 0) goto L_0x0256
            boolean r1 = r21.zzaa()
            if (r1 != 0) goto L_0x005d
            goto L_0x0256
        L_0x005d:
            com.google.android.gms.measurement.internal.zzfu r1 = r0.zzk
            com.google.android.gms.common.util.Clock r1 = r1.zzl()
            long r1 = r1.currentTimeMillis()
            com.google.android.gms.measurement.internal.zzej<java.lang.Long> r5 = com.google.android.gms.measurement.internal.zzas.zzz
            r6 = 0
            java.lang.Object r5 = r5.zza(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.zzaf r5 = r21.zze()
            boolean r5 = r5.zzy()
            if (r5 != 0) goto L_0x008f
            com.google.android.gms.measurement.internal.zzaf r5 = r21.zze()
            boolean r5 = r5.mo29307e_()
            if (r5 == 0) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            r5 = 0
            goto L_0x0090
        L_0x008f:
            r5 = 1
        L_0x0090:
            if (r5 == 0) goto L_0x00cc
            com.google.android.gms.measurement.internal.zzfu r10 = r0.zzk
            com.google.android.gms.measurement.internal.zzab r10 = r10.zza()
            java.lang.String r10 = r10.zzw()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x00bb
            java.lang.String r11 = ".none."
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00bb
            com.google.android.gms.measurement.internal.zzej<java.lang.Long> r10 = com.google.android.gms.measurement.internal.zzas.zzu
            java.lang.Object r10 = r10.zza(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            goto L_0x00dc
        L_0x00bb:
            com.google.android.gms.measurement.internal.zzej<java.lang.Long> r10 = com.google.android.gms.measurement.internal.zzas.zzt
            java.lang.Object r10 = r10.zza(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            goto L_0x00dc
        L_0x00cc:
            com.google.android.gms.measurement.internal.zzej<java.lang.Long> r10 = com.google.android.gms.measurement.internal.zzas.zzs
            java.lang.Object r10 = r10.zza(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
        L_0x00dc:
            com.google.android.gms.measurement.internal.zzfu r12 = r0.zzk
            com.google.android.gms.measurement.internal.zzfc r12 = r12.zzb()
            com.google.android.gms.measurement.internal.zzfg r12 = r12.zzc
            long r12 = r12.zza()
            com.google.android.gms.measurement.internal.zzfu r14 = r0.zzk
            com.google.android.gms.measurement.internal.zzfc r14 = r14.zzb()
            com.google.android.gms.measurement.internal.zzfg r14 = r14.zzd
            long r14 = r14.zza()
            com.google.android.gms.measurement.internal.zzaf r16 = r21.zze()
            r17 = r10
            long r9 = r16.zzv()
            com.google.android.gms.measurement.internal.zzaf r11 = r21.zze()
            r19 = r7
            long r6 = r11.zzw()
            long r6 = java.lang.Math.max(r9, r6)
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x0113
        L_0x0110:
            r8 = r3
            goto L_0x0189
        L_0x0113:
            long r6 = r6 - r1
            long r6 = java.lang.Math.abs(r6)
            long r6 = r1 - r6
            long r12 = r12 - r1
            long r8 = java.lang.Math.abs(r12)
            long r8 = r1 - r8
            long r14 = r14 - r1
            long r10 = java.lang.Math.abs(r14)
            long r1 = r1 - r10
            long r8 = java.lang.Math.max(r8, r1)
            long r10 = r6 + r19
            if (r5 == 0) goto L_0x0139
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0139
            long r10 = java.lang.Math.min(r6, r8)
            long r10 = r10 + r17
        L_0x0139:
            com.google.android.gms.measurement.internal.zzkr r5 = r21.zzh()
            r12 = r17
            boolean r5 = r5.zza((long) r8, (long) r12)
            if (r5 != 0) goto L_0x0147
            long r8 = r8 + r12
            goto L_0x0148
        L_0x0147:
            r8 = r10
        L_0x0148:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0189
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0189
            r5 = 0
        L_0x0151:
            r6 = 20
            com.google.android.gms.measurement.internal.zzej<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.zzas.zzab
            r10 = 0
            java.lang.Object r7 = r7.zza(r10)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r11 = 0
            int r7 = java.lang.Math.max(r11, r7)
            int r6 = java.lang.Math.min(r6, r7)
            if (r5 >= r6) goto L_0x0110
            r6 = 1
            long r6 = r6 << r5
            com.google.android.gms.measurement.internal.zzej<java.lang.Long> r12 = com.google.android.gms.measurement.internal.zzas.zzaa
            java.lang.Object r12 = r12.zza(r10)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            long r12 = java.lang.Math.max(r3, r12)
            long r12 = r12 * r6
            long r8 = r8 + r12
            int r6 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0186
            goto L_0x0189
        L_0x0186:
            int r5 = r5 + 1
            goto L_0x0151
        L_0x0189:
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x01ab
            com.google.android.gms.measurement.internal.zzfu r1 = r0.zzk
            com.google.android.gms.measurement.internal.zzeq r1 = r1.zzq()
            com.google.android.gms.measurement.internal.zzes r1 = r1.zzw()
            java.lang.String r2 = "Next upload time is 0"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzfa r1 = r21.zzv()
            r1.zzb()
            com.google.android.gms.measurement.internal.zzkh r1 = r21.zzw()
            r1.zze()
            return
        L_0x01ab:
            com.google.android.gms.measurement.internal.zzex r1 = r21.zzd()
            boolean r1 = r1.zze()
            if (r1 != 0) goto L_0x01d3
            com.google.android.gms.measurement.internal.zzfu r1 = r0.zzk
            com.google.android.gms.measurement.internal.zzeq r1 = r1.zzq()
            com.google.android.gms.measurement.internal.zzes r1 = r1.zzw()
            java.lang.String r2 = "No network"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzfa r1 = r21.zzv()
            r1.zza()
            com.google.android.gms.measurement.internal.zzkh r1 = r21.zzw()
            r1.zze()
            return
        L_0x01d3:
            com.google.android.gms.measurement.internal.zzfu r1 = r0.zzk
            com.google.android.gms.measurement.internal.zzfc r1 = r1.zzb()
            com.google.android.gms.measurement.internal.zzfg r1 = r1.zze
            long r1 = r1.zza()
            com.google.android.gms.measurement.internal.zzej<java.lang.Long> r5 = com.google.android.gms.measurement.internal.zzas.zzq
            r6 = 0
            java.lang.Object r5 = r5.zza(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.zzkr r7 = r21.zzh()
            boolean r7 = r7.zza((long) r1, (long) r5)
            if (r7 != 0) goto L_0x01ff
            long r1 = r1 + r5
            long r8 = java.lang.Math.max(r8, r1)
        L_0x01ff:
            com.google.android.gms.measurement.internal.zzfa r1 = r21.zzv()
            r1.zzb()
            com.google.android.gms.measurement.internal.zzfu r1 = r0.zzk
            com.google.android.gms.common.util.Clock r1 = r1.zzl()
            long r1 = r1.currentTimeMillis()
            long r8 = r8 - r1
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x023b
            com.google.android.gms.measurement.internal.zzej<java.lang.Long> r1 = com.google.android.gms.measurement.internal.zzas.zzv
            r2 = 0
            java.lang.Object r1 = r1.zza(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r8 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.zzfu r1 = r0.zzk
            com.google.android.gms.measurement.internal.zzfc r1 = r1.zzb()
            com.google.android.gms.measurement.internal.zzfg r1 = r1.zzc
            com.google.android.gms.measurement.internal.zzfu r2 = r0.zzk
            com.google.android.gms.common.util.Clock r2 = r2.zzl()
            long r2 = r2.currentTimeMillis()
            r1.zza(r2)
        L_0x023b:
            com.google.android.gms.measurement.internal.zzfu r1 = r0.zzk
            com.google.android.gms.measurement.internal.zzeq r1 = r1.zzq()
            com.google.android.gms.measurement.internal.zzes r1 = r1.zzw()
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.zza(r3, r2)
            com.google.android.gms.measurement.internal.zzkh r1 = r21.zzw()
            r1.zza(r8)
            return
        L_0x0256:
            com.google.android.gms.measurement.internal.zzfu r1 = r0.zzk
            com.google.android.gms.measurement.internal.zzeq r1 = r1.zzq()
            com.google.android.gms.measurement.internal.zzes r1 = r1.zzw()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzfa r1 = r21.zzv()
            r1.zzb()
            com.google.android.gms.measurement.internal.zzkh r1 = r21.zzw()
            r1.zze()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkl.zzab():void");
    }

    /* access modifiers changed from: package-private */
    public final void zza(Runnable runnable) {
        zzx();
        if (this.zzo == null) {
            this.zzo = new ArrayList();
        }
        this.zzo.add(runnable);
    }

    private final void zzac() {
        zzx();
        if (this.zzr || this.zzs || this.zzt) {
            this.zzk.zzq().zzw().zza("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzr), Boolean.valueOf(this.zzs), Boolean.valueOf(this.zzt));
            return;
        }
        this.zzk.zzq().zzw().zza("Stopping uploading service(s)");
        List<Runnable> list = this.zzo;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            this.zzo.clear();
        }
    }

    private final Boolean zzb(zzf zzf2) {
        try {
            if (zzf2.zzm() != -2147483648L) {
                if (zzf2.zzm() == ((long) Wrappers.packageManager(this.zzk.zzm()).getPackageInfo(zzf2.zzc(), 0).versionCode)) {
                    return true;
                }
            } else {
                String str = Wrappers.packageManager(this.zzk.zzm()).getPackageInfo(zzf2.zzc(), 0).versionName;
                if (zzf2.zzl() != null && zzf2.zzl().equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzr() {
        zzx();
        zzn();
        if (!this.zzm) {
            this.zzm = true;
            if (zzad()) {
                int zza2 = zza(this.zzv);
                int zzae = this.zzk.zzx().zzae();
                zzx();
                if (zza2 > zzae) {
                    this.zzk.zzq().zze().zza("Panic: can't downgrade version. Previous, current version", Integer.valueOf(zza2), Integer.valueOf(zzae));
                } else if (zza2 >= zzae) {
                } else {
                    if (zza(zzae, this.zzv)) {
                        this.zzk.zzq().zzw().zza("Storage version upgraded. Previous, current version", Integer.valueOf(zza2), Integer.valueOf(zzae));
                    } else {
                        this.zzk.zzq().zze().zza("Storage version upgrade failed. Previous, current version", Integer.valueOf(zza2), Integer.valueOf(zzae));
                    }
                }
            }
        }
    }

    private final boolean zzad() {
        FileLock fileLock;
        zzx();
        if (!this.zzk.zza().zza(zzas.zzbh) || (fileLock = this.zzu) == null || !fileLock.isValid()) {
            try {
                this.zzv = new RandomAccessFile(new File(this.zzk.zzm().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.zzu = this.zzv.tryLock();
                if (this.zzu != null) {
                    this.zzk.zzq().zzw().zza("Storage concurrent access okay");
                    return true;
                }
                this.zzk.zzq().zze().zza("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e) {
                this.zzk.zzq().zze().zza("Failed to acquire storage lock", e);
                return false;
            } catch (IOException e2) {
                this.zzk.zzq().zze().zza("Failed to access storage lock file", e2);
                return false;
            } catch (OverlappingFileLockException e3) {
                this.zzk.zzq().zzh().zza("Storage lock already acquired", e3);
                return false;
            }
        } else {
            this.zzk.zzq().zzw().zza("Storage concurrent access okay");
            return true;
        }
    }

    private final int zza(FileChannel fileChannel) {
        zzx();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.zzk.zzq().zze().zza("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    this.zzk.zzq().zzh().zza("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            return allocate.getInt();
        } catch (IOException e) {
            this.zzk.zzq().zze().zza("Failed to read from channel", e);
            return 0;
        }
    }

    private final boolean zza(int i, FileChannel fileChannel) {
        zzx();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.zzk.zzq().zze().zza("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            if (this.zzk.zza().zza(zzas.zzbr) && Build.VERSION.SDK_INT <= 19) {
                fileChannel.position(0);
            }
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.zzk.zzq().zze().zza("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e) {
            this.zzk.zzq().zze().zza("Failed to write to channel", e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzn zzn2) {
        if (this.zzw != null) {
            this.zzx = new ArrayList();
            this.zzx.addAll(this.zzw);
        }
        zzaf zze2 = zze();
        String str = zzn2.zza;
        Preconditions.checkNotEmpty(str);
        zze2.zzc();
        zze2.zzaj();
        try {
            SQLiteDatabase c_ = zze2.mo29305c_();
            String[] strArr = {str};
            int delete = c_.delete("apps", "app_id=?", strArr) + 0 + c_.delete("events", "app_id=?", strArr) + c_.delete("user_attributes", "app_id=?", strArr) + c_.delete("conditional_properties", "app_id=?", strArr) + c_.delete("raw_events", "app_id=?", strArr) + c_.delete("raw_events_metadata", "app_id=?", strArr) + c_.delete("queue", "app_id=?", strArr) + c_.delete("audience_filter_values", "app_id=?", strArr) + c_.delete("main_event_params", "app_id=?", strArr) + c_.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                zze2.zzq().zzw().zza("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            zze2.zzq().zze().zza("Error resetting analytics data. appId, error", zzeq.zza(str), e);
        }
        if (zzn2.zzh) {
            zzb(zzn2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzku zzku, zzn zzn2) {
        zzx();
        zzn();
        if (zze(zzn2)) {
            if (!zzn2.zzh) {
                zzc(zzn2);
                return;
            }
            int zzb2 = this.zzk.zzh().zzb(zzku.zza);
            if (zzb2 != 0) {
                this.zzk.zzh();
                this.zzk.zzh().zza(this.zzaa, zzn2.zza, zzb2, "_ev", zzkv.zza(zzku.zza, 24, true), zzku.zza != null ? zzku.zza.length() : 0);
                return;
            }
            int zzb3 = this.zzk.zzh().zzb(zzku.zza, zzku.zza());
            if (zzb3 != 0) {
                this.zzk.zzh();
                String zza2 = zzkv.zza(zzku.zza, 24, true);
                Object zza3 = zzku.zza();
                this.zzk.zzh().zza(this.zzaa, zzn2.zza, zzb3, "_ev", zza2, (zza3 == null || (!(zza3 instanceof String) && !(zza3 instanceof CharSequence))) ? 0 : String.valueOf(zza3).length());
                return;
            }
            Object zzc2 = this.zzk.zzh().zzc(zzku.zza, zzku.zza());
            if (zzc2 != null) {
                if ("_sid".equals(zzku.zza)) {
                    long j = zzku.zzb;
                    String str = zzku.zze;
                    long j2 = 0;
                    zzkw zzc3 = zze().zzc(zzn2.zza, "_sno");
                    if (zzc3 == null || !(zzc3.zze instanceof Long)) {
                        if (zzc3 != null) {
                            this.zzk.zzq().zzh().zza("Retrieved last session number from database does not contain a valid (long) value", zzc3.zze);
                        }
                        zzam zza4 = zze().zza(zzn2.zza, "_s");
                        if (zza4 != null) {
                            j2 = zza4.zzc;
                            this.zzk.zzq().zzw().zza("Backfill the session number. Last used session number", Long.valueOf(j2));
                        }
                    } else {
                        j2 = ((Long) zzc3.zze).longValue();
                    }
                    zza(new zzku("_sno", j, Long.valueOf(j2 + 1), str), zzn2);
                }
                zzkw zzkw = new zzkw(zzn2.zza, zzku.zze, zzku.zza, zzku.zzb, zzc2);
                this.zzk.zzq().zzw().zza("Setting user property", this.zzk.zzi().zzc(zzkw.zzc), zzc2);
                zze().zze();
                try {
                    zzc(zzn2);
                    boolean zza5 = zze().zza(zzkw);
                    zze().mo29304b_();
                    if (!zza5) {
                        this.zzk.zzq().zze().zza("Too many unique user properties are set. Ignoring user property", this.zzk.zzi().zzc(zzkw.zzc), zzkw.zze);
                        this.zzk.zzh().zza(this.zzaa, zzn2.zza, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    zze().zzg();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzku zzku, zzn zzn2) {
        zzx();
        zzn();
        if (zze(zzn2)) {
            if (!zzn2.zzh) {
                zzc(zzn2);
            } else if (!"_npa".equals(zzku.zza) || zzn2.zzs == null) {
                this.zzk.zzq().zzv().zza("Removing user property", this.zzk.zzi().zzc(zzku.zza));
                zze().zze();
                try {
                    zzc(zzn2);
                    zze().zzb(zzn2.zza, zzku.zza);
                    zze().mo29304b_();
                    this.zzk.zzq().zzv().zza("User property removed", this.zzk.zzi().zzc(zzku.zza));
                } finally {
                    zze().zzg();
                }
            } else {
                this.zzk.zzq().zzv().zza("Falling back to manifest metadata value for ad personalization");
                zza(new zzku("_npa", this.zzk.zzl().currentTimeMillis(), Long.valueOf(zzn2.zzs.booleanValue() ? 1 : 0), "auto"), zzn2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzki zzki) {
        this.zzp++;
    }

    /* access modifiers changed from: package-private */
    public final void zzs() {
        this.zzq++;
    }

    /* access modifiers changed from: package-private */
    public final zzfu zzu() {
        return this.zzk;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x048c A[Catch:{ NameNotFoundException -> 0x0322, all -> 0x04b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0119 A[Catch:{ NameNotFoundException -> 0x0322, all -> 0x04b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01d5 A[Catch:{ NameNotFoundException -> 0x0322, all -> 0x04b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0209 A[Catch:{ NameNotFoundException -> 0x0322, all -> 0x04b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x020b A[Catch:{ NameNotFoundException -> 0x0322, all -> 0x04b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x020f A[Catch:{ NameNotFoundException -> 0x0322, all -> 0x04b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0232 A[Catch:{ NameNotFoundException -> 0x0322, all -> 0x04b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0239 A[Catch:{ NameNotFoundException -> 0x0322, all -> 0x04b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0246 A[Catch:{ NameNotFoundException -> 0x0322, all -> 0x04b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0259 A[Catch:{ NameNotFoundException -> 0x0322, all -> 0x04b7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzb(com.google.android.gms.measurement.internal.zzn r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            java.lang.String r3 = "_sys"
            java.lang.String r4 = "_pfo"
            java.lang.String r5 = "_uwa"
            java.lang.String r0 = "app_id=?"
            r21.zzx()
            r21.zzn()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r22)
            java.lang.String r6 = r2.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6)
            boolean r6 = r21.zze(r22)
            if (r6 != 0) goto L_0x0021
            return
        L_0x0021:
            com.google.android.gms.measurement.internal.zzaf r6 = r21.zze()
            java.lang.String r7 = r2.zza
            com.google.android.gms.measurement.internal.zzf r6 = r6.zzb(r7)
            r7 = 0
            if (r6 == 0) goto L_0x0054
            java.lang.String r9 = r6.zze()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto L_0x0054
            java.lang.String r9 = r2.zzb
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x0054
            r6.zzh((long) r7)
            com.google.android.gms.measurement.internal.zzaf r9 = r21.zze()
            r9.zza((com.google.android.gms.measurement.internal.zzf) r6)
            com.google.android.gms.measurement.internal.zzfo r6 = r21.zzc()
            java.lang.String r9 = r2.zza
            r6.zzd(r9)
        L_0x0054:
            boolean r6 = r2.zzh
            if (r6 != 0) goto L_0x005c
            r21.zzc(r22)
            return
        L_0x005c:
            long r9 = r2.zzm
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x006c
            com.google.android.gms.measurement.internal.zzfu r6 = r1.zzk
            com.google.android.gms.common.util.Clock r6 = r6.zzl()
            long r9 = r6.currentTimeMillis()
        L_0x006c:
            com.google.android.gms.measurement.internal.zzfu r6 = r1.zzk
            com.google.android.gms.measurement.internal.zzak r6 = r6.zzw()
            r6.zzh()
            int r6 = r2.zzn
            r15 = 0
            r13 = 1
            if (r6 == 0) goto L_0x0097
            if (r6 == r13) goto L_0x0097
            com.google.android.gms.measurement.internal.zzfu r11 = r1.zzk
            com.google.android.gms.measurement.internal.zzeq r11 = r11.zzq()
            com.google.android.gms.measurement.internal.zzes r11 = r11.zzh()
            java.lang.String r12 = r2.zza
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r12)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r14 = "Incorrect app type, assuming installed app. appId, appType"
            r11.zza(r14, r12, r6)
            r6 = 0
        L_0x0097:
            com.google.android.gms.measurement.internal.zzaf r11 = r21.zze()
            r11.zze()
            com.google.android.gms.measurement.internal.zzaf r11 = r21.zze()     // Catch:{ all -> 0x04b7 }
            java.lang.String r12 = r2.zza     // Catch:{ all -> 0x04b7 }
            java.lang.String r14 = "_npa"
            com.google.android.gms.measurement.internal.zzkw r14 = r11.zzc(r12, r14)     // Catch:{ all -> 0x04b7 }
            if (r14 == 0) goto L_0x00bb
            java.lang.String r11 = "auto"
            java.lang.String r12 = r14.zzb     // Catch:{ all -> 0x04b7 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x04b7 }
            if (r11 == 0) goto L_0x00b7
            goto L_0x00bb
        L_0x00b7:
            r17 = r3
            r3 = 1
            goto L_0x010d
        L_0x00bb:
            java.lang.Boolean r11 = r2.zzs     // Catch:{ all -> 0x04b7 }
            if (r11 == 0) goto L_0x00f8
            com.google.android.gms.measurement.internal.zzku r12 = new com.google.android.gms.measurement.internal.zzku     // Catch:{ all -> 0x04b7 }
            java.lang.String r18 = "_npa"
            java.lang.Boolean r11 = r2.zzs     // Catch:{ all -> 0x04b7 }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x04b7 }
            if (r11 == 0) goto L_0x00ce
            r19 = 1
            goto L_0x00d0
        L_0x00ce:
            r19 = r7
        L_0x00d0:
            java.lang.Long r19 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x04b7 }
            java.lang.String r20 = "auto"
            r7 = 1
            r11 = r12
            r7 = r12
            r12 = r18
            r17 = r3
            r8 = r14
            r3 = 1
            r13 = r9
            r15 = r19
            r16 = r20
            r11.<init>(r12, r13, r15, r16)     // Catch:{ all -> 0x04b7 }
            if (r8 == 0) goto L_0x00f4
            java.lang.Object r8 = r8.zze     // Catch:{ all -> 0x04b7 }
            java.lang.Long r11 = r7.zzc     // Catch:{ all -> 0x04b7 }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x04b7 }
            if (r8 != 0) goto L_0x010d
        L_0x00f4:
            r1.zza((com.google.android.gms.measurement.internal.zzku) r7, (com.google.android.gms.measurement.internal.zzn) r2)     // Catch:{ all -> 0x04b7 }
            goto L_0x010d
        L_0x00f8:
            r17 = r3
            r8 = r14
            r3 = 1
            if (r8 == 0) goto L_0x010d
            com.google.android.gms.measurement.internal.zzku r7 = new com.google.android.gms.measurement.internal.zzku     // Catch:{ all -> 0x04b7 }
            java.lang.String r12 = "_npa"
            r15 = 0
            java.lang.String r16 = "auto"
            r11 = r7
            r13 = r9
            r11.<init>(r12, r13, r15, r16)     // Catch:{ all -> 0x04b7 }
            r1.zzb((com.google.android.gms.measurement.internal.zzku) r7, (com.google.android.gms.measurement.internal.zzn) r2)     // Catch:{ all -> 0x04b7 }
        L_0x010d:
            com.google.android.gms.measurement.internal.zzaf r7 = r21.zze()     // Catch:{ all -> 0x04b7 }
            java.lang.String r8 = r2.zza     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.measurement.internal.zzf r7 = r7.zzb(r8)     // Catch:{ all -> 0x04b7 }
            if (r7 == 0) goto L_0x01d2
            com.google.android.gms.measurement.internal.zzfu r11 = r1.zzk     // Catch:{ all -> 0x04b7 }
            r11.zzh()     // Catch:{ all -> 0x04b7 }
            java.lang.String r11 = r2.zzb     // Catch:{ all -> 0x04b7 }
            java.lang.String r12 = r7.zze()     // Catch:{ all -> 0x04b7 }
            java.lang.String r13 = r2.zzr     // Catch:{ all -> 0x04b7 }
            java.lang.String r14 = r7.zzf()     // Catch:{ all -> 0x04b7 }
            boolean r11 = com.google.android.gms.measurement.internal.zzkv.zza((java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14)     // Catch:{ all -> 0x04b7 }
            if (r11 == 0) goto L_0x01d2
            com.google.android.gms.measurement.internal.zzfu r11 = r1.zzk     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.measurement.internal.zzeq r11 = r11.zzq()     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.measurement.internal.zzes r11 = r11.zzh()     // Catch:{ all -> 0x04b7 }
            java.lang.String r12 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r13 = r7.zzc()     // Catch:{ all -> 0x04b7 }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r13)     // Catch:{ all -> 0x04b7 }
            r11.zza(r12, r13)     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.measurement.internal.zzaf r11 = r21.zze()     // Catch:{ all -> 0x04b7 }
            java.lang.String r7 = r7.zzc()     // Catch:{ all -> 0x04b7 }
            r11.zzaj()     // Catch:{ all -> 0x04b7 }
            r11.zzc()     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r7)     // Catch:{ all -> 0x04b7 }
            android.database.sqlite.SQLiteDatabase r12 = r11.mo29305c_()     // Catch:{ SQLiteException -> 0x01bd }
            java.lang.String[] r13 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x01bd }
            r15 = 0
            r13[r15] = r7     // Catch:{ SQLiteException -> 0x01bb }
            java.lang.String r14 = "events"
            int r14 = r12.delete(r14, r0, r13)     // Catch:{ SQLiteException -> 0x01bb }
            int r14 = r14 + r15
            java.lang.String r8 = "user_attributes"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01bb }
            int r14 = r14 + r8
            java.lang.String r8 = "conditional_properties"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01bb }
            int r14 = r14 + r8
            java.lang.String r8 = "apps"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01bb }
            int r14 = r14 + r8
            java.lang.String r8 = "raw_events"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01bb }
            int r14 = r14 + r8
            java.lang.String r8 = "raw_events_metadata"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01bb }
            int r14 = r14 + r8
            java.lang.String r8 = "event_filters"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01bb }
            int r14 = r14 + r8
            java.lang.String r8 = "property_filters"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01bb }
            int r14 = r14 + r8
            java.lang.String r8 = "audience_filter_values"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01bb }
            int r14 = r14 + r8
            java.lang.String r8 = "consent_settings"
            int r0 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01bb }
            int r14 = r14 + r0
            if (r14 <= 0) goto L_0x01d0
            com.google.android.gms.measurement.internal.zzeq r0 = r11.zzq()     // Catch:{ SQLiteException -> 0x01bb }
            com.google.android.gms.measurement.internal.zzes r0 = r0.zzw()     // Catch:{ SQLiteException -> 0x01bb }
            java.lang.String r8 = "Deleted application data. app, records"
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLiteException -> 0x01bb }
            r0.zza(r8, r7, r12)     // Catch:{ SQLiteException -> 0x01bb }
            goto L_0x01d0
        L_0x01bb:
            r0 = move-exception
            goto L_0x01bf
        L_0x01bd:
            r0 = move-exception
            r15 = 0
        L_0x01bf:
            com.google.android.gms.measurement.internal.zzeq r8 = r11.zzq()     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.measurement.internal.zzes r8 = r8.zze()     // Catch:{ all -> 0x04b7 }
            java.lang.String r11 = "Error deleting application data. appId, error"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r7)     // Catch:{ all -> 0x04b7 }
            r8.zza(r11, r7, r0)     // Catch:{ all -> 0x04b7 }
        L_0x01d0:
            r7 = 0
            goto L_0x01d3
        L_0x01d2:
            r15 = 0
        L_0x01d3:
            if (r7 == 0) goto L_0x0232
            long r11 = r7.zzm()     // Catch:{ all -> 0x04b7 }
            r13 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x01ed
            long r11 = r7.zzm()     // Catch:{ all -> 0x04b7 }
            r8 = r4
            long r3 = r2.zzj     // Catch:{ all -> 0x04b7 }
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x01ee
            r0 = 1
            goto L_0x01ef
        L_0x01ed:
            r8 = r4
        L_0x01ee:
            r0 = 0
        L_0x01ef:
            long r3 = r7.zzm()     // Catch:{ all -> 0x04b7 }
            int r11 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x020b
            java.lang.String r3 = r7.zzl()     // Catch:{ all -> 0x04b7 }
            if (r3 == 0) goto L_0x020b
            java.lang.String r3 = r7.zzl()     // Catch:{ all -> 0x04b7 }
            java.lang.String r4 = r2.zzc     // Catch:{ all -> 0x04b7 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x04b7 }
            if (r3 != 0) goto L_0x020b
            r3 = 1
            goto L_0x020c
        L_0x020b:
            r3 = 0
        L_0x020c:
            r0 = r0 | r3
            if (r0 == 0) goto L_0x0233
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04b7 }
            r0.<init>()     // Catch:{ all -> 0x04b7 }
            java.lang.String r3 = "_pv"
            java.lang.String r4 = r7.zzl()     // Catch:{ all -> 0x04b7 }
            r0.putString(r3, r4)     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.measurement.internal.zzaq r3 = new com.google.android.gms.measurement.internal.zzaq     // Catch:{ all -> 0x04b7 }
            java.lang.String r12 = "_au"
            com.google.android.gms.measurement.internal.zzap r13 = new com.google.android.gms.measurement.internal.zzap     // Catch:{ all -> 0x04b7 }
            r13.<init>(r0)     // Catch:{ all -> 0x04b7 }
            java.lang.String r14 = "auto"
            r11 = r3
            r4 = 0
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x04b7 }
            r1.zza((com.google.android.gms.measurement.internal.zzaq) r3, (com.google.android.gms.measurement.internal.zzn) r2)     // Catch:{ all -> 0x04b7 }
            goto L_0x0234
        L_0x0232:
            r8 = r4
        L_0x0233:
            r4 = 0
        L_0x0234:
            r21.zzc(r22)     // Catch:{ all -> 0x04b7 }
            if (r6 != 0) goto L_0x0246
            com.google.android.gms.measurement.internal.zzaf r0 = r21.zze()     // Catch:{ all -> 0x04b7 }
            java.lang.String r3 = r2.zza     // Catch:{ all -> 0x04b7 }
            java.lang.String r7 = "_f"
            com.google.android.gms.measurement.internal.zzam r0 = r0.zza((java.lang.String) r3, (java.lang.String) r7)     // Catch:{ all -> 0x04b7 }
            goto L_0x0257
        L_0x0246:
            r3 = 1
            if (r6 != r3) goto L_0x0256
            com.google.android.gms.measurement.internal.zzaf r0 = r21.zze()     // Catch:{ all -> 0x04b7 }
            java.lang.String r3 = r2.zza     // Catch:{ all -> 0x04b7 }
            java.lang.String r7 = "_v"
            com.google.android.gms.measurement.internal.zzam r0 = r0.zza((java.lang.String) r3, (java.lang.String) r7)     // Catch:{ all -> 0x04b7 }
            goto L_0x0257
        L_0x0256:
            r0 = 0
        L_0x0257:
            if (r0 != 0) goto L_0x048c
            r11 = 3600000(0x36ee80, double:1.7786363E-317)
            long r13 = r9 / r11
            r15 = 1
            long r13 = r13 + r15
            long r13 = r13 * r11
            java.lang.String r0 = "_dac"
            java.lang.String r3 = "_r"
            java.lang.String r7 = "_c"
            java.lang.String r15 = "_et"
            if (r6 != 0) goto L_0x03ef
            com.google.android.gms.measurement.internal.zzku r6 = new com.google.android.gms.measurement.internal.zzku     // Catch:{ all -> 0x04b7 }
            java.lang.String r12 = "_fot"
            java.lang.Long r16 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x04b7 }
            java.lang.String r20 = "auto"
            r11 = r6
            r13 = r9
            r4 = r15
            r15 = r16
            r16 = r20
            r11.<init>(r12, r13, r15, r16)     // Catch:{ all -> 0x04b7 }
            r1.zza((com.google.android.gms.measurement.internal.zzku) r6, (com.google.android.gms.measurement.internal.zzn) r2)     // Catch:{ all -> 0x04b7 }
            r21.zzx()     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.measurement.internal.zzfu r6 = r1.zzk     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.measurement.internal.zzfl r6 = r6.zze()     // Catch:{ all -> 0x04b7 }
            java.lang.String r11 = r2.zza     // Catch:{ all -> 0x04b7 }
            r6.zza(r11)     // Catch:{ all -> 0x04b7 }
            r21.zzx()     // Catch:{ all -> 0x04b7 }
            r21.zzn()     // Catch:{ all -> 0x04b7 }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x04b7 }
            r6.<init>()     // Catch:{ all -> 0x04b7 }
            r11 = 1
            r6.putLong(r7, r11)     // Catch:{ all -> 0x04b7 }
            r6.putLong(r3, r11)     // Catch:{ all -> 0x04b7 }
            r11 = 0
            r6.putLong(r5, r11)     // Catch:{ all -> 0x04b7 }
            r6.putLong(r8, r11)     // Catch:{ all -> 0x04b7 }
            r3 = r17
            r6.putLong(r3, r11)     // Catch:{ all -> 0x04b7 }
            java.lang.String r7 = "_sysu"
            r6.putLong(r7, r11)     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.measurement.internal.zzfu r7 = r1.zzk     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.measurement.internal.zzab r7 = r7.zza()     // Catch:{ all -> 0x04b7 }
            java.lang.String r11 = r2.zza     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.zzas.zzas     // Catch:{ all -> 0x04b7 }
            boolean r7 = r7.zze(r11, r12)     // Catch:{ all -> 0x04b7 }
            r11 = 1
            if (r7 == 0) goto L_0x02cc
            r6.putLong(r4, r11)     // Catch:{ all -> 0x04b7 }
        L_0x02cc:
            boolean r7 = r2.zzq     // Catch:{ all -> 0x04b7 }
            if (r7 == 0) goto L_0x02d3
            r6.putLong(r0, r11)     // Catch:{ all -> 0x04b7 }
        L_0x02d3:
            com.google.android.gms.measurement.internal.zzaf r0 = r21.zze()     // Catch:{ all -> 0x04b7 }
            java.lang.String r7 = r2.zza     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r7)     // Catch:{ all -> 0x04b7 }
            r0.zzc()     // Catch:{ all -> 0x04b7 }
            r0.zzaj()     // Catch:{ all -> 0x04b7 }
            java.lang.String r11 = "first_open_count"
            long r13 = r0.zzh(r7, r11)     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.measurement.internal.zzfu r0 = r1.zzk     // Catch:{ all -> 0x04b7 }
            android.content.Context r0 = r0.zzm()     // Catch:{ all -> 0x04b7 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x04b7 }
            if (r0 != 0) goto L_0x0310
            com.google.android.gms.measurement.internal.zzfu r0 = r1.zzk     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.measurement.internal.zzeq r0 = r0.zzq()     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.measurement.internal.zzes r0 = r0.zze()     // Catch:{ all -> 0x04b7 }
            java.lang.String r3 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.String r5 = r2.zza     // Catch:{ all -> 0x04b7 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r5)     // Catch:{ all -> 0x04b7 }
            r0.zza(r3, r5)     // Catch:{ all -> 0x04b7 }
            r17 = r8
            r7 = r13
        L_0x030c:
            r11 = 0
            goto L_0x03d2
        L_0x0310:
            com.google.android.gms.measurement.internal.zzfu r0 = r1.zzk     // Catch:{ NameNotFoundException -> 0x0322 }
            android.content.Context r0 = r0.zzm()     // Catch:{ NameNotFoundException -> 0x0322 }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch:{ NameNotFoundException -> 0x0322 }
            java.lang.String r7 = r2.zza     // Catch:{ NameNotFoundException -> 0x0322 }
            r11 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r7, r11)     // Catch:{ NameNotFoundException -> 0x0322 }
            goto L_0x0339
        L_0x0322:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfu r7 = r1.zzk     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.measurement.internal.zzeq r7 = r7.zzq()     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.measurement.internal.zzes r7 = r7.zze()     // Catch:{ all -> 0x04b7 }
            java.lang.String r11 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.String r12 = r2.zza     // Catch:{ all -> 0x04b7 }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r12)     // Catch:{ all -> 0x04b7 }
            r7.zza(r11, r12, r0)     // Catch:{ all -> 0x04b7 }
            r0 = 0
        L_0x0339:
            if (r0 == 0) goto L_0x038a
            long r11 = r0.firstInstallTime     // Catch:{ all -> 0x04b7 }
            r15 = 0
            int r7 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r7 == 0) goto L_0x038a
            long r11 = r0.firstInstallTime     // Catch:{ all -> 0x04b7 }
            r17 = r8
            long r7 = r0.lastUpdateTime     // Catch:{ all -> 0x04b7 }
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x036e
            com.google.android.gms.measurement.internal.zzfu r0 = r1.zzk     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.measurement.internal.zzab r0 = r0.zza()     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.zzas.zzbm     // Catch:{ all -> 0x04b7 }
            boolean r0 = r0.zza((com.google.android.gms.measurement.internal.zzej<java.lang.Boolean>) r7)     // Catch:{ all -> 0x04b7 }
            if (r0 == 0) goto L_0x0367
            r7 = 0
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x036c
            r7 = 1
            r6.putLong(r5, r7)     // Catch:{ all -> 0x04b7 }
            goto L_0x036c
        L_0x0367:
            r7 = 1
            r6.putLong(r5, r7)     // Catch:{ all -> 0x04b7 }
        L_0x036c:
            r0 = 0
            goto L_0x036f
        L_0x036e:
            r0 = 1
        L_0x036f:
            com.google.android.gms.measurement.internal.zzku r5 = new com.google.android.gms.measurement.internal.zzku     // Catch:{ all -> 0x04b7 }
            java.lang.String r12 = "_fi"
            if (r0 == 0) goto L_0x0378
            r7 = 1
            goto L_0x037a
        L_0x0378:
            r7 = 0
        L_0x037a:
            java.lang.Long r15 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x04b7 }
            java.lang.String r16 = "auto"
            r11 = r5
            r7 = r13
            r13 = r9
            r11.<init>(r12, r13, r15, r16)     // Catch:{ all -> 0x04b7 }
            r1.zza((com.google.android.gms.measurement.internal.zzku) r5, (com.google.android.gms.measurement.internal.zzn) r2)     // Catch:{ all -> 0x04b7 }
            goto L_0x038d
        L_0x038a:
            r17 = r8
            r7 = r13
        L_0x038d:
            com.google.android.gms.measurement.internal.zzfu r0 = r1.zzk     // Catch:{ NameNotFoundException -> 0x039f }
            android.content.Context r0 = r0.zzm()     // Catch:{ NameNotFoundException -> 0x039f }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch:{ NameNotFoundException -> 0x039f }
            java.lang.String r5 = r2.zza     // Catch:{ NameNotFoundException -> 0x039f }
            r11 = 0
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r5, r11)     // Catch:{ NameNotFoundException -> 0x039f }
            goto L_0x03b6
        L_0x039f:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfu r5 = r1.zzk     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.measurement.internal.zzeq r5 = r5.zzq()     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.measurement.internal.zzes r5 = r5.zze()     // Catch:{ all -> 0x04b7 }
            java.lang.String r11 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.String r12 = r2.zza     // Catch:{ all -> 0x04b7 }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzeq.zza((java.lang.String) r12)     // Catch:{ all -> 0x04b7 }
            r5.zza(r11, r12, r0)     // Catch:{ all -> 0x04b7 }
            r0 = 0
        L_0x03b6:
            if (r0 == 0) goto L_0x030c
            int r5 = r0.flags     // Catch:{ all -> 0x04b7 }
            r11 = 1
            r5 = r5 & r11
            if (r5 == 0) goto L_0x03c3
            r11 = 1
            r6.putLong(r3, r11)     // Catch:{ all -> 0x04b7 }
        L_0x03c3:
            int r0 = r0.flags     // Catch:{ all -> 0x04b7 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x030c
            java.lang.String r0 = "_sysu"
            r11 = 1
            r6.putLong(r0, r11)     // Catch:{ all -> 0x04b7 }
            goto L_0x030c
        L_0x03d2:
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x03db
            r3 = r17
            r6.putLong(r3, r7)     // Catch:{ all -> 0x04b7 }
        L_0x03db:
            com.google.android.gms.measurement.internal.zzaq r0 = new com.google.android.gms.measurement.internal.zzaq     // Catch:{ all -> 0x04b7 }
            java.lang.String r12 = "_f"
            com.google.android.gms.measurement.internal.zzap r13 = new com.google.android.gms.measurement.internal.zzap     // Catch:{ all -> 0x04b7 }
            r13.<init>(r6)     // Catch:{ all -> 0x04b7 }
            java.lang.String r14 = "auto"
            r11 = r0
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x04b7 }
            r1.zzb((com.google.android.gms.measurement.internal.zzaq) r0, (com.google.android.gms.measurement.internal.zzn) r2)     // Catch:{ all -> 0x04b7 }
            goto L_0x0447
        L_0x03ef:
            r4 = r15
            r5 = 1
            if (r6 != r5) goto L_0x0447
            com.google.android.gms.measurement.internal.zzku r5 = new com.google.android.gms.measurement.internal.zzku     // Catch:{ all -> 0x04b7 }
            java.lang.String r12 = "_fvt"
            java.lang.Long r15 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x04b7 }
            java.lang.String r16 = "auto"
            r11 = r5
            r13 = r9
            r11.<init>(r12, r13, r15, r16)     // Catch:{ all -> 0x04b7 }
            r1.zza((com.google.android.gms.measurement.internal.zzku) r5, (com.google.android.gms.measurement.internal.zzn) r2)     // Catch:{ all -> 0x04b7 }
            r21.zzx()     // Catch:{ all -> 0x04b7 }
            r21.zzn()     // Catch:{ all -> 0x04b7 }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x04b7 }
            r5.<init>()     // Catch:{ all -> 0x04b7 }
            r11 = 1
            r5.putLong(r7, r11)     // Catch:{ all -> 0x04b7 }
            r5.putLong(r3, r11)     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.measurement.internal.zzfu r3 = r1.zzk     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.measurement.internal.zzab r3 = r3.zza()     // Catch:{ all -> 0x04b7 }
            java.lang.String r6 = r2.zza     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.zzas.zzas     // Catch:{ all -> 0x04b7 }
            boolean r3 = r3.zze(r6, r7)     // Catch:{ all -> 0x04b7 }
            r6 = 1
            if (r3 == 0) goto L_0x042d
            r5.putLong(r4, r6)     // Catch:{ all -> 0x04b7 }
        L_0x042d:
            boolean r3 = r2.zzq     // Catch:{ all -> 0x04b7 }
            if (r3 == 0) goto L_0x0434
            r5.putLong(r0, r6)     // Catch:{ all -> 0x04b7 }
        L_0x0434:
            com.google.android.gms.measurement.internal.zzaq r0 = new com.google.android.gms.measurement.internal.zzaq     // Catch:{ all -> 0x04b7 }
            java.lang.String r12 = "_v"
            com.google.android.gms.measurement.internal.zzap r13 = new com.google.android.gms.measurement.internal.zzap     // Catch:{ all -> 0x04b7 }
            r13.<init>(r5)     // Catch:{ all -> 0x04b7 }
            java.lang.String r14 = "auto"
            r11 = r0
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x04b7 }
            r1.zzb((com.google.android.gms.measurement.internal.zzaq) r0, (com.google.android.gms.measurement.internal.zzn) r2)     // Catch:{ all -> 0x04b7 }
        L_0x0447:
            com.google.android.gms.measurement.internal.zzfu r0 = r1.zzk     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.measurement.internal.zzab r0 = r0.zza()     // Catch:{ all -> 0x04b7 }
            java.lang.String r3 = r2.zza     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.zzas.zzat     // Catch:{ all -> 0x04b7 }
            boolean r0 = r0.zze(r3, r5)     // Catch:{ all -> 0x04b7 }
            if (r0 != 0) goto L_0x04a8
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04b7 }
            r0.<init>()     // Catch:{ all -> 0x04b7 }
            r5 = 1
            r0.putLong(r4, r5)     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.measurement.internal.zzfu r3 = r1.zzk     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.measurement.internal.zzab r3 = r3.zza()     // Catch:{ all -> 0x04b7 }
            java.lang.String r4 = r2.zza     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.zzas.zzas     // Catch:{ all -> 0x04b7 }
            boolean r3 = r3.zze(r4, r5)     // Catch:{ all -> 0x04b7 }
            if (r3 == 0) goto L_0x0478
            java.lang.String r3 = "_fr"
            r4 = 1
            r0.putLong(r3, r4)     // Catch:{ all -> 0x04b7 }
        L_0x0478:
            com.google.android.gms.measurement.internal.zzaq r3 = new com.google.android.gms.measurement.internal.zzaq     // Catch:{ all -> 0x04b7 }
            java.lang.String r12 = "_e"
            com.google.android.gms.measurement.internal.zzap r13 = new com.google.android.gms.measurement.internal.zzap     // Catch:{ all -> 0x04b7 }
            r13.<init>(r0)     // Catch:{ all -> 0x04b7 }
            java.lang.String r14 = "auto"
            r11 = r3
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x04b7 }
            r1.zzb((com.google.android.gms.measurement.internal.zzaq) r3, (com.google.android.gms.measurement.internal.zzn) r2)     // Catch:{ all -> 0x04b7 }
            goto L_0x04a8
        L_0x048c:
            boolean r0 = r2.zzi     // Catch:{ all -> 0x04b7 }
            if (r0 == 0) goto L_0x04a8
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04b7 }
            r0.<init>()     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.measurement.internal.zzaq r3 = new com.google.android.gms.measurement.internal.zzaq     // Catch:{ all -> 0x04b7 }
            java.lang.String r12 = "_cd"
            com.google.android.gms.measurement.internal.zzap r13 = new com.google.android.gms.measurement.internal.zzap     // Catch:{ all -> 0x04b7 }
            r13.<init>(r0)     // Catch:{ all -> 0x04b7 }
            java.lang.String r14 = "auto"
            r11 = r3
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x04b7 }
            r1.zzb((com.google.android.gms.measurement.internal.zzaq) r3, (com.google.android.gms.measurement.internal.zzn) r2)     // Catch:{ all -> 0x04b7 }
        L_0x04a8:
            com.google.android.gms.measurement.internal.zzaf r0 = r21.zze()     // Catch:{ all -> 0x04b7 }
            r0.mo29304b_()     // Catch:{ all -> 0x04b7 }
            com.google.android.gms.measurement.internal.zzaf r0 = r21.zze()
            r0.zzg()
            return
        L_0x04b7:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzaf r2 = r21.zze()
            r2.zzg()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkl.zzb(com.google.android.gms.measurement.internal.zzn):void");
    }

    private final zzn zzb(String str) {
        String str2 = str;
        zzf zzb2 = zze().zzb(str2);
        if (zzb2 == null || TextUtils.isEmpty(zzb2.zzl())) {
            this.zzk.zzq().zzv().zza("No app data available; dropping", str2);
            return null;
        }
        Boolean zzb3 = zzb(zzb2);
        if (zzb3 == null || zzb3.booleanValue()) {
            return new zzn(str, zzb2.zze(), zzb2.zzl(), zzb2.zzm(), zzb2.zzn(), zzb2.zzo(), zzb2.zzp(), (String) null, zzb2.zzr(), false, zzb2.zzi(), zzb2.zzae(), 0, 0, zzb2.zzaf(), zzb2.zzag(), false, zzb2.zzf(), zzb2.zzah(), zzb2.zzq(), zzb2.zzai(), (!zznv.zzb() || !this.zzk.zza().zze(str2, zzas.zzbi)) ? null : zzb2.zzg(), (!zzml.zzb() || !this.zzk.zza().zza(zzas.zzci)) ? "" : zza(str).zza());
        }
        this.zzk.zzq().zze().zza("App version does not match; dropping. appId", zzeq.zza(str));
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzz zzz2) {
        zzn zzb2 = zzb(zzz2.zza);
        if (zzb2 != null) {
            zza(zzz2, zzb2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzz zzz2, zzn zzn2) {
        Preconditions.checkNotNull(zzz2);
        Preconditions.checkNotEmpty(zzz2.zza);
        Preconditions.checkNotNull(zzz2.zzb);
        Preconditions.checkNotNull(zzz2.zzc);
        Preconditions.checkNotEmpty(zzz2.zzc.zza);
        zzx();
        zzn();
        if (zze(zzn2)) {
            if (!zzn2.zzh) {
                zzc(zzn2);
                return;
            }
            zzz zzz3 = new zzz(zzz2);
            boolean z = false;
            zzz3.zze = false;
            zze().zze();
            try {
                zzz zzd2 = zze().zzd(zzz3.zza, zzz3.zzc.zza);
                if (zzd2 != null && !zzd2.zzb.equals(zzz3.zzb)) {
                    this.zzk.zzq().zzh().zza("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzk.zzi().zzc(zzz3.zzc.zza), zzz3.zzb, zzd2.zzb);
                }
                if (zzd2 != null && zzd2.zze) {
                    zzz3.zzb = zzd2.zzb;
                    zzz3.zzd = zzd2.zzd;
                    zzz3.zzh = zzd2.zzh;
                    zzz3.zzf = zzd2.zzf;
                    zzz3.zzi = zzd2.zzi;
                    zzz3.zze = zzd2.zze;
                    zzz3.zzc = new zzku(zzz3.zzc.zza, zzd2.zzc.zzb, zzz3.zzc.zza(), zzd2.zzc.zze);
                } else if (TextUtils.isEmpty(zzz3.zzf)) {
                    zzz3.zzc = new zzku(zzz3.zzc.zza, zzz3.zzd, zzz3.zzc.zza(), zzz3.zzc.zze);
                    zzz3.zze = true;
                    z = true;
                }
                if (zzz3.zze) {
                    zzku zzku = zzz3.zzc;
                    zzkw zzkw = new zzkw(zzz3.zza, zzz3.zzb, zzku.zza, zzku.zzb, zzku.zza());
                    if (zze().zza(zzkw)) {
                        this.zzk.zzq().zzv().zza("User property updated immediately", zzz3.zza, this.zzk.zzi().zzc(zzkw.zzc), zzkw.zze);
                    } else {
                        this.zzk.zzq().zze().zza("(2)Too many active user properties, ignoring", zzeq.zza(zzz3.zza), this.zzk.zzi().zzc(zzkw.zzc), zzkw.zze);
                    }
                    if (z && zzz3.zzi != null) {
                        zzc(new zzaq(zzz3.zzi, zzz3.zzd), zzn2);
                    }
                }
                if (zze().zza(zzz3)) {
                    this.zzk.zzq().zzv().zza("Conditional property added", zzz3.zza, this.zzk.zzi().zzc(zzz3.zzc.zza), zzz3.zzc.zza());
                } else {
                    this.zzk.zzq().zze().zza("Too many conditional properties, ignoring", zzeq.zza(zzz3.zza), this.zzk.zzi().zzc(zzz3.zzc.zza), zzz3.zzc.zza());
                }
                zze().mo29304b_();
            } finally {
                zze().zzg();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzz zzz2) {
        zzn zzb2 = zzb(zzz2.zza);
        if (zzb2 != null) {
            zzb(zzz2, zzb2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzz zzz2, zzn zzn2) {
        Preconditions.checkNotNull(zzz2);
        Preconditions.checkNotEmpty(zzz2.zza);
        Preconditions.checkNotNull(zzz2.zzc);
        Preconditions.checkNotEmpty(zzz2.zzc.zza);
        zzx();
        zzn();
        if (zze(zzn2)) {
            if (!zzn2.zzh) {
                zzc(zzn2);
                return;
            }
            zze().zze();
            try {
                zzc(zzn2);
                zzz zzd2 = zze().zzd(zzz2.zza, zzz2.zzc.zza);
                if (zzd2 != null) {
                    this.zzk.zzq().zzv().zza("Removing conditional user property", zzz2.zza, this.zzk.zzi().zzc(zzz2.zzc.zza));
                    zze().zze(zzz2.zza, zzz2.zzc.zza);
                    if (zzd2.zze) {
                        zze().zzb(zzz2.zza, zzz2.zzc.zza);
                    }
                    if (zzz2.zzk != null) {
                        Bundle bundle = null;
                        if (zzz2.zzk.zzb != null) {
                            bundle = zzz2.zzk.zzb.zzb();
                        }
                        zzc(this.zzk.zzh().zza(zzz2.zza, zzz2.zzk.zza, bundle, zzd2.zzb, zzz2.zzk.zzd, true, false, zzlo.zzb() && this.zzk.zza().zza(zzas.zzcl)), zzn2);
                    }
                } else {
                    this.zzk.zzq().zzh().zza("Conditional user property doesn't exist", zzeq.zza(zzz2.zza), this.zzk.zzi().zzc(zzz2.zzc.zza));
                }
                zze().mo29304b_();
            } finally {
                zze().zzg();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0206  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.measurement.internal.zzf zza(com.google.android.gms.measurement.internal.zzn r9, com.google.android.gms.measurement.internal.zzf r10, java.lang.String r11) {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.zzac r0 = com.google.android.gms.measurement.internal.zzac.zza
            boolean r1 = com.google.android.gms.internal.measurement.zzml.zzb()
            if (r1 == 0) goto L_0x0026
            com.google.android.gms.measurement.internal.zzfu r1 = r8.zzk
            com.google.android.gms.measurement.internal.zzab r1 = r1.zza()
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.zzas.zzci
            boolean r1 = r1.zza((com.google.android.gms.measurement.internal.zzej<java.lang.Boolean>) r2)
            if (r1 == 0) goto L_0x0026
            java.lang.String r0 = r9.zza
            com.google.android.gms.measurement.internal.zzac r0 = r8.zza((java.lang.String) r0)
            java.lang.String r1 = r9.zzw
            com.google.android.gms.measurement.internal.zzac r1 = com.google.android.gms.measurement.internal.zzac.zza((java.lang.String) r1)
            com.google.android.gms.measurement.internal.zzac r0 = r0.zzb((com.google.android.gms.measurement.internal.zzac) r1)
        L_0x0026:
            r1 = 1
            if (r10 != 0) goto L_0x006a
            com.google.android.gms.measurement.internal.zzf r10 = new com.google.android.gms.measurement.internal.zzf
            com.google.android.gms.measurement.internal.zzfu r2 = r8.zzk
            java.lang.String r3 = r9.zza
            r10.<init>(r2, r3)
            boolean r2 = com.google.android.gms.internal.measurement.zzml.zzb()
            if (r2 == 0) goto L_0x005d
            com.google.android.gms.measurement.internal.zzfu r2 = r8.zzk
            com.google.android.gms.measurement.internal.zzab r2 = r2.zza()
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.zzas.zzci
            boolean r2 = r2.zza((com.google.android.gms.measurement.internal.zzej<java.lang.Boolean>) r3)
            if (r2 == 0) goto L_0x005d
            boolean r2 = r0.zze()
            if (r2 == 0) goto L_0x0053
            java.lang.String r2 = r8.zza((com.google.android.gms.measurement.internal.zzac) r0)
            r10.zza((java.lang.String) r2)
        L_0x0053:
            boolean r0 = r0.zzc()
            if (r0 == 0) goto L_0x0067
            r10.zze((java.lang.String) r11)
            goto L_0x0067
        L_0x005d:
            java.lang.String r0 = r8.zzz()
            r10.zza((java.lang.String) r0)
            r10.zze((java.lang.String) r11)
        L_0x0067:
            r11 = 1
            goto L_0x00e8
        L_0x006a:
            boolean r2 = com.google.android.gms.internal.measurement.zzml.zzb()
            if (r2 == 0) goto L_0x0084
            com.google.android.gms.measurement.internal.zzfu r2 = r8.zzk
            com.google.android.gms.measurement.internal.zzab r2 = r2.zza()
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.zzas.zzci
            boolean r2 = r2.zza((com.google.android.gms.measurement.internal.zzej<java.lang.Boolean>) r3)
            if (r2 == 0) goto L_0x0084
            boolean r2 = r0.zzc()
            if (r2 == 0) goto L_0x00bb
        L_0x0084:
            java.lang.String r2 = r10.zzh()
            boolean r2 = r11.equals(r2)
            if (r2 != 0) goto L_0x00bb
            r10.zze((java.lang.String) r11)
            boolean r11 = com.google.android.gms.internal.measurement.zzml.zzb()
            if (r11 == 0) goto L_0x00b3
            com.google.android.gms.measurement.internal.zzfu r11 = r8.zzk
            com.google.android.gms.measurement.internal.zzab r11 = r11.zza()
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.zzas.zzci
            boolean r11 = r11.zza((com.google.android.gms.measurement.internal.zzej<java.lang.Boolean>) r2)
            if (r11 == 0) goto L_0x00b3
            boolean r11 = r0.zze()
            if (r11 == 0) goto L_0x0067
            java.lang.String r11 = r8.zza((com.google.android.gms.measurement.internal.zzac) r0)
            r10.zza((java.lang.String) r11)
            goto L_0x0067
        L_0x00b3:
            java.lang.String r11 = r8.zzz()
            r10.zza((java.lang.String) r11)
            goto L_0x0067
        L_0x00bb:
            boolean r11 = com.google.android.gms.internal.measurement.zzml.zzb()
            if (r11 == 0) goto L_0x00e7
            com.google.android.gms.measurement.internal.zzfu r11 = r8.zzk
            com.google.android.gms.measurement.internal.zzab r11 = r11.zza()
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.zzas.zzci
            boolean r11 = r11.zza((com.google.android.gms.measurement.internal.zzej<java.lang.Boolean>) r2)
            if (r11 == 0) goto L_0x00e7
            java.lang.String r11 = r10.zzd()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x00e7
            boolean r11 = r0.zze()
            if (r11 == 0) goto L_0x00e7
            java.lang.String r11 = r8.zza((com.google.android.gms.measurement.internal.zzac) r0)
            r10.zza((java.lang.String) r11)
            goto L_0x0067
        L_0x00e7:
            r11 = 0
        L_0x00e8:
            java.lang.String r0 = r9.zzb
            java.lang.String r2 = r10.zze()
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 != 0) goto L_0x00fa
            java.lang.String r11 = r9.zzb
            r10.zzb((java.lang.String) r11)
            r11 = 1
        L_0x00fa:
            java.lang.String r0 = r9.zzr
            java.lang.String r2 = r10.zzf()
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 != 0) goto L_0x010c
            java.lang.String r11 = r9.zzr
            r10.zzc((java.lang.String) r11)
            r11 = 1
        L_0x010c:
            boolean r0 = com.google.android.gms.internal.measurement.zznv.zzb()
            if (r0 == 0) goto L_0x0136
            com.google.android.gms.measurement.internal.zzfu r0 = r8.zzk
            com.google.android.gms.measurement.internal.zzab r0 = r0.zza()
            java.lang.String r2 = r10.zzc()
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.zzas.zzbi
            boolean r0 = r0.zze(r2, r3)
            if (r0 == 0) goto L_0x0136
            java.lang.String r0 = r9.zzv
            java.lang.String r2 = r10.zzg()
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 != 0) goto L_0x0136
            java.lang.String r11 = r9.zzv
            r10.zzd((java.lang.String) r11)
            r11 = 1
        L_0x0136:
            java.lang.String r0 = r9.zzk
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0150
            java.lang.String r0 = r9.zzk
            java.lang.String r2 = r10.zzi()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0150
            java.lang.String r11 = r9.zzk
            r10.zzf((java.lang.String) r11)
            r11 = 1
        L_0x0150:
            long r2 = r9.zze
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0168
            long r2 = r9.zze
            long r6 = r10.zzo()
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0168
            long r2 = r9.zze
            r10.zzd((long) r2)
            r11 = 1
        L_0x0168:
            java.lang.String r0 = r9.zzc
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0182
            java.lang.String r0 = r9.zzc
            java.lang.String r2 = r10.zzl()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0182
            java.lang.String r11 = r9.zzc
            r10.zzg((java.lang.String) r11)
            r11 = 1
        L_0x0182:
            long r2 = r9.zzj
            long r6 = r10.zzm()
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0192
            long r2 = r9.zzj
            r10.zzc((long) r2)
            r11 = 1
        L_0x0192:
            java.lang.String r0 = r9.zzd
            if (r0 == 0) goto L_0x01a8
            java.lang.String r0 = r9.zzd
            java.lang.String r2 = r10.zzn()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01a8
            java.lang.String r11 = r9.zzd
            r10.zzh((java.lang.String) r11)
            r11 = 1
        L_0x01a8:
            long r2 = r9.zzf
            long r6 = r10.zzp()
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x01b8
            long r2 = r9.zzf
            r10.zze((long) r2)
            r11 = 1
        L_0x01b8:
            boolean r0 = r9.zzh
            boolean r2 = r10.zzr()
            if (r0 == r2) goto L_0x01c6
            boolean r11 = r9.zzh
            r10.zza((boolean) r11)
            r11 = 1
        L_0x01c6:
            java.lang.String r0 = r9.zzg
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01e0
            java.lang.String r0 = r9.zzg
            java.lang.String r2 = r10.zzac()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01e0
            java.lang.String r11 = r9.zzg
            r10.zzi((java.lang.String) r11)
            r11 = 1
        L_0x01e0:
            com.google.android.gms.measurement.internal.zzfu r0 = r8.zzk
            com.google.android.gms.measurement.internal.zzab r0 = r0.zza()
            com.google.android.gms.measurement.internal.zzej<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.zzas.zzbx
            boolean r0 = r0.zza((com.google.android.gms.measurement.internal.zzej<java.lang.Boolean>) r2)
            if (r0 != 0) goto L_0x01fe
            long r2 = r9.zzl
            long r6 = r10.zzae()
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x01fe
            long r2 = r9.zzl
            r10.zzp(r2)
            r11 = 1
        L_0x01fe:
            boolean r0 = r9.zzo
            boolean r2 = r10.zzaf()
            if (r0 == r2) goto L_0x020c
            boolean r11 = r9.zzo
            r10.zzb((boolean) r11)
            r11 = 1
        L_0x020c:
            boolean r0 = r9.zzp
            boolean r2 = r10.zzag()
            if (r0 == r2) goto L_0x021a
            boolean r11 = r9.zzp
            r10.zzc((boolean) r11)
            r11 = 1
        L_0x021a:
            java.lang.Boolean r0 = r9.zzs
            java.lang.Boolean r2 = r10.zzah()
            if (r0 == r2) goto L_0x0228
            java.lang.Boolean r11 = r9.zzs
            r10.zza((java.lang.Boolean) r11)
            r11 = 1
        L_0x0228:
            long r2 = r9.zzt
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x023e
            long r2 = r9.zzt
            long r4 = r10.zzq()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x023e
            long r2 = r9.zzt
            r10.zzf((long) r2)
            r11 = 1
        L_0x023e:
            if (r11 == 0) goto L_0x0247
            com.google.android.gms.measurement.internal.zzaf r9 = r8.zze()
            r9.zza((com.google.android.gms.measurement.internal.zzf) r10)
        L_0x0247:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkl.zza(com.google.android.gms.measurement.internal.zzn, com.google.android.gms.measurement.internal.zzf, java.lang.String):com.google.android.gms.measurement.internal.zzf");
    }

    /* access modifiers changed from: package-private */
    public final zzf zzc(zzn zzn2) {
        String str;
        zzx();
        zzn();
        Preconditions.checkNotNull(zzn2);
        Preconditions.checkNotEmpty(zzn2.zza);
        zzf zzb2 = zze().zzb(zzn2.zza);
        zzac zzac = zzac.zza;
        if (zzml.zzb() && this.zzk.zza().zza(zzas.zzci)) {
            zzac = zza(zzn2.zza).zzb(zzac.zza(zzn2.zzw));
        }
        if (!zzml.zzb() || !this.zzk.zza().zza(zzas.zzci) || zzac.zzc()) {
            str = this.zzj.zza(zzn2.zza);
        } else {
            str = "";
        }
        if (!zzne.zzb() || !this.zzk.zza().zza(zzas.zzbn)) {
            return zza(zzn2, zzb2, str);
        }
        if (zzb2 == null) {
            zzb2 = new zzf(this.zzk, zzn2.zza);
            if (!zzml.zzb() || !this.zzk.zza().zza(zzas.zzci)) {
                zzb2.zza(zzz());
                zzb2.zze(str);
            } else {
                if (zzac.zze()) {
                    zzb2.zza(zza(zzac));
                }
                if (zzac.zzc()) {
                    zzb2.zze(str);
                }
            }
        } else if ((!zzml.zzb() || !this.zzk.zza().zza(zzas.zzci) || zzac.zzc()) && !str.equals(zzb2.zzh())) {
            zzb2.zze(str);
            if (!zzml.zzb() || !this.zzk.zza().zza(zzas.zzci)) {
                zzb2.zza(zzz());
            } else {
                zzb2.zza(zza(zzac));
            }
        } else if (zzml.zzb() && this.zzk.zza().zza(zzas.zzci) && TextUtils.isEmpty(zzb2.zzd()) && zzac.zze()) {
            zzb2.zza(zza(zzac));
        }
        zzb2.zzb(zzn2.zzb);
        zzb2.zzc(zzn2.zzr);
        if (zznv.zzb() && this.zzk.zza().zze(zzb2.zzc(), zzas.zzbi)) {
            zzb2.zzd(zzn2.zzv);
        }
        if (!TextUtils.isEmpty(zzn2.zzk)) {
            zzb2.zzf(zzn2.zzk);
        }
        if (zzn2.zze != 0) {
            zzb2.zzd(zzn2.zze);
        }
        if (!TextUtils.isEmpty(zzn2.zzc)) {
            zzb2.zzg(zzn2.zzc);
        }
        zzb2.zzc(zzn2.zzj);
        if (zzn2.zzd != null) {
            zzb2.zzh(zzn2.zzd);
        }
        zzb2.zze(zzn2.zzf);
        zzb2.zza(zzn2.zzh);
        if (!TextUtils.isEmpty(zzn2.zzg)) {
            zzb2.zzi(zzn2.zzg);
        }
        if (!this.zzk.zza().zza(zzas.zzbx)) {
            zzb2.zzp(zzn2.zzl);
        }
        zzb2.zzb(zzn2.zzo);
        zzb2.zzc(zzn2.zzp);
        zzb2.zza(zzn2.zzs);
        zzb2.zzf(zzn2.zzt);
        if (zzb2.zza()) {
            zze().zza(zzb2);
        }
        return zzb2;
    }

    /* access modifiers changed from: package-private */
    public final String zzd(zzn zzn2) {
        try {
            return (String) this.zzk.zzp().zza(new zzkp(this, zzn2)).get(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.zzk.zzq().zze().zza("Failed to get app instance id. appId", zzeq.zza(zzn2.zza), e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(boolean z) {
        zzab();
    }

    private final boolean zze(zzn zzn2) {
        return (!zznv.zzb() || !this.zzk.zza().zze(zzn2.zza, zzas.zzbi)) ? !TextUtils.isEmpty(zzn2.zzb) || !TextUtils.isEmpty(zzn2.zzr) : !TextUtils.isEmpty(zzn2.zzb) || !TextUtils.isEmpty(zzn2.zzv) || !TextUtils.isEmpty(zzn2.zzr);
    }
}
