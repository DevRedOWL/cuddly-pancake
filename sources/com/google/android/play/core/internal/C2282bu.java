package com.google.android.play.core.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.play.core.internal.bu */
final class C2282bu extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f1958a;

    public C2282bu(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f1958a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            C2282bu buVar = (C2282bu) obj;
            return this.f1958a == buVar.f1958a && get() == buVar.get();
        }
    }

    public final int hashCode() {
        return this.f1958a;
    }
}
