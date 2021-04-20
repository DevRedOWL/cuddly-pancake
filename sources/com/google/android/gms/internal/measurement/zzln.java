package com.google.android.gms.internal.measurement;

import com.github.mikephil.charting.utils.Utils;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
public enum zzln {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(Utils.DOUBLE_EPSILON)),
    BOOLEAN(false),
    STRING(""),
    BYTE_STRING(zzgp.zza),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzj;

    private zzln(Object obj) {
        this.zzj = obj;
    }
}
