package com.google.android.play.core.internal;

/* renamed from: com.google.android.play.core.internal.cb */
public final class C2290cb<T> implements C2293ce<T> {

    /* renamed from: a */
    private C2293ce<T> f1963a;

    /* renamed from: b */
    public static <T> void m1277b(C2293ce<T> ceVar, C2293ce<T> ceVar2) {
        C2269bh.m1220j(ceVar2);
        C2290cb cbVar = (C2290cb) ceVar;
        if (cbVar.f1963a == null) {
            cbVar.f1963a = ceVar2;
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final T mo33525a() {
        C2293ce<T> ceVar = this.f1963a;
        if (ceVar != null) {
            return ceVar.mo33525a();
        }
        throw new IllegalStateException();
    }
}
