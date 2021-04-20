package com.google.android.play.core.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.play.core.internal.br */
public abstract class C2279br implements Closeable {
    /* renamed from: a */
    public abstract long mo33662a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract InputStream mo33663b(long j, long j2) throws IOException;

    /* renamed from: c */
    public final synchronized InputStream mo33863c() throws IOException {
        return mo33663b(0, mo33662a());
    }
}
