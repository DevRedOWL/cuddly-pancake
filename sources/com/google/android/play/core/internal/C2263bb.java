package com.google.android.play.core.internal;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.play.core.internal.bb */
final class C2263bb implements C2260az {

    /* renamed from: a */
    private final /* synthetic */ int f1947a = 0;

    C2263bb() {
    }

    C2263bb(byte[] bArr) {
    }

    /* renamed from: a */
    public final Object[] mo33833a(Object obj, ArrayList arrayList, File file, ArrayList arrayList2) {
        Object b;
        if (this.f1947a != 0) {
            b = C2269bh.m1212b(obj, "makeDexElements", Object[].class, ArrayList.class, arrayList, File.class, file, ArrayList.class, arrayList2);
        } else {
            b = C2269bh.m1212b(obj, "makePathElements", Object[].class, List.class, arrayList, File.class, file, List.class, arrayList2);
        }
        return (Object[]) b;
    }
}
