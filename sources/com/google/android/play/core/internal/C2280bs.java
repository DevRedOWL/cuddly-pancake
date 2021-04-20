package com.google.android.play.core.internal;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.play.core.internal.bs */
public final class C2280bs extends C2279br {

    /* renamed from: a */
    private final C2279br f1955a;

    /* renamed from: b */
    private final long f1956b;

    /* renamed from: c */
    private final long f1957c;

    public C2280bs(C2279br brVar, long j, long j2) {
        this.f1955a = brVar;
        long d = m1265d(j);
        this.f1956b = d;
        this.f1957c = m1265d(d + j2);
    }

    /* renamed from: d */
    private final long m1265d(long j) {
        if (j < 0) {
            return 0;
        }
        return j > this.f1955a.mo33662a() ? this.f1955a.mo33662a() : j;
    }

    /* renamed from: a */
    public final long mo33662a() {
        return this.f1957c - this.f1956b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final InputStream mo33663b(long j, long j2) throws IOException {
        long d = m1265d(this.f1956b);
        return this.f1955a.mo33663b(d, m1265d(j2 + d) - d);
    }

    public final void close() throws IOException {
    }
}
