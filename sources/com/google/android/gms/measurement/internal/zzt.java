package com.google.android.gms.measurement.internal;

import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.zzcd;
import com.google.android.gms.internal.measurement.zzhy;
import com.google.android.gms.internal.measurement.zzmx;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
final class zzt {
    private String zza;
    private boolean zzb;
    private zzcd.zzi zzc;
    /* access modifiers changed from: private */
    public BitSet zzd;
    private BitSet zze;
    private Map<Integer, Long> zzf;
    private Map<Integer, List<Long>> zzg;
    private final /* synthetic */ zzr zzh;

    private zzt(zzr zzr, String str) {
        this.zzh = zzr;
        this.zza = str;
        this.zzb = true;
        this.zzd = new BitSet();
        this.zze = new BitSet();
        this.zzf = new ArrayMap();
        this.zzg = new ArrayMap();
    }

    private zzt(zzr zzr, String str, zzcd.zzi zzi, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.zzh = zzr;
        this.zza = str;
        this.zzd = bitSet;
        this.zze = bitSet2;
        this.zzf = map;
        this.zzg = new ArrayMap();
        if (map2 != null) {
            for (Integer next : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(next));
                this.zzg.put(next, arrayList);
            }
        }
        this.zzb = false;
        this.zzc = zzi;
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzu zzu) {
        int zza2 = zzu.zza();
        if (zzu.zzc != null) {
            this.zze.set(zza2, zzu.zzc.booleanValue());
        }
        if (zzu.zzd != null) {
            this.zzd.set(zza2, zzu.zzd.booleanValue());
        }
        if (zzu.zze != null) {
            Long l = this.zzf.get(Integer.valueOf(zza2));
            long longValue = zzu.zze.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.zzf.put(Integer.valueOf(zza2), Long.valueOf(longValue));
            }
        }
        if (zzu.zzf != null) {
            List list = this.zzg.get(Integer.valueOf(zza2));
            if (list == null) {
                list = new ArrayList();
                this.zzg.put(Integer.valueOf(zza2), list);
            }
            if (zzu.zzb()) {
                list.clear();
            }
            if (zzmx.zzb() && this.zzh.zzs().zzd(this.zza, zzas.zzbb) && zzu.zzc()) {
                list.clear();
            }
            if (!zzmx.zzb() || !this.zzh.zzs().zzd(this.zza, zzas.zzbb)) {
                list.add(Long.valueOf(zzu.zzf.longValue() / 1000));
                return;
            }
            long longValue2 = zzu.zzf.longValue() / 1000;
            if (!list.contains(Long.valueOf(longValue2))) {
                list.add(Long.valueOf(longValue2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final zzcd.zza zza(int i) {
        ArrayList arrayList;
        List list;
        zzcd.zza.C6489zza zzh2 = zzcd.zza.zzh();
        zzh2.zza(i);
        zzh2.zza(this.zzb);
        zzcd.zzi zzi = this.zzc;
        if (zzi != null) {
            zzh2.zza(zzi);
        }
        zzcd.zzi.zza zza2 = zzcd.zzi.zzi().zzb((Iterable<? extends Long>) zzkr.zza(this.zzd)).zza((Iterable<? extends Long>) zzkr.zza(this.zze));
        Map<Integer, Long> map = this.zzf;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer intValue : this.zzf.keySet()) {
                int intValue2 = intValue.intValue();
                arrayList2.add((zzcd.zzb) ((zzhy) zzcd.zzb.zze().zza(intValue2).zza(this.zzf.get(Integer.valueOf(intValue2)).longValue()).zzy()));
            }
            arrayList = arrayList2;
        }
        zza2.zzc(arrayList);
        Map<Integer, List<Long>> map2 = this.zzg;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer next : this.zzg.keySet()) {
                zzcd.zzj.zza zza3 = zzcd.zzj.zze().zza(next.intValue());
                List list2 = this.zzg.get(next);
                if (list2 != null) {
                    Collections.sort(list2);
                    zza3.zza((Iterable<? extends Long>) list2);
                }
                arrayList3.add((zzcd.zzj) ((zzhy) zza3.zzy()));
            }
            list = arrayList3;
        }
        zza2.zzd(list);
        zzh2.zza(zza2);
        return (zzcd.zza) ((zzhy) zzh2.zzy());
    }

    /* synthetic */ zzt(zzr zzr, String str, zzcd.zzi zzi, BitSet bitSet, BitSet bitSet2, Map map, Map map2, zzq zzq) {
        this(zzr, str, zzi, bitSet, bitSet2, map, map2);
    }

    /* synthetic */ zzt(zzr zzr, String str, zzq zzq) {
        this(zzr, str);
    }
}
