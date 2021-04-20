package com.google.android.gms.internal.clearcut;

import com.github.mikephil.charting.utils.Utils;

public enum zzcq {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(Utils.DOUBLE_EPSILON)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zzbb.class, zzbb.class, zzbb.zzfi),
    ENUM(Integer.TYPE, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    
    private final Class<?> zzlh;
    private final Class<?> zzli;
    private final Object zzlj;

    private zzcq(Class<?> cls, Class<?> cls2, Object obj) {
        this.zzlh = cls;
        this.zzli = cls2;
        this.zzlj = obj;
    }

    public final Class<?> zzbq() {
        return this.zzli;
    }
}
