package com.google.android.gms.internal.clearcut;

import com.github.mikephil.charting.utils.Utils;

public enum zzfq {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(Utils.DOUBLE_EPSILON)),
    BOOLEAN(false),
    STRING(""),
    BYTE_STRING(zzbb.zzfi),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzlj;

    private zzfq(Object obj) {
        this.zzlj = obj;
    }
}
