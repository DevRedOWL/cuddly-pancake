package com.google.android.play.core.internal;

import java.io.File;
import java.util.List;

/* renamed from: com.google.android.play.core.internal.bd */
final class C2265bd implements C2264bc {

    /* renamed from: a */
    private final /* synthetic */ int f1948a = 0;

    C2265bd() {
    }

    C2265bd(byte[] bArr) {
    }

    /* renamed from: a */
    public final Object[] mo33836a(Object obj, List list, List list2) {
        Object a;
        if (this.f1948a != 0) {
            a = C2269bh.m1212b(obj, "makePathElements", Object[].class, List.class, list, File.class, null, List.class, list2);
        } else {
            a = C2269bh.m1211a(obj, "makePathElements", Object[].class, List.class, list);
        }
        return (Object[]) a;
    }
}
