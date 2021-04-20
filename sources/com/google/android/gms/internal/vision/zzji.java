package com.google.android.gms.internal.vision;

import com.github.mikephil.charting.utils.Utils;

public enum zzji {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(Utils.DOUBLE_EPSILON)),
    BOOLEAN(false),
    STRING(""),
    BYTE_STRING(zzeo.zzrx),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzyd;

    private zzji(Object obj) {
        this.zzyd = obj;
    }
}
