package com.google.android.play.core.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.play.core.internal.bv */
final class C2283bv {

    /* renamed from: a */
    private final ConcurrentHashMap<C2282bu, List<Throwable>> f1959a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f1960b = new ReferenceQueue<>();

    C2283bv() {
    }

    /* renamed from: a */
    public final List<Throwable> mo33868a(Throwable th) {
        while (true) {
            Reference<? extends Throwable> poll = this.f1960b.poll();
            if (poll == null) {
                break;
            }
            this.f1959a.remove(poll);
        }
        List<Throwable> list = this.f1959a.get(new C2282bu(th, (ReferenceQueue<Throwable>) null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f1959a.putIfAbsent(new C2282bu(th, this.f1960b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
