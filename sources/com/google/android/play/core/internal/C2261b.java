package com.google.android.play.core.internal;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.google.android.play.core.internal.b */
final class C2261b implements C2288c {

    /* renamed from: a */
    private final ByteBuffer f1945a;

    public C2261b(ByteBuffer byteBuffer) {
        this.f1945a = byteBuffer.slice();
    }

    /* renamed from: a */
    public final long mo33834a() {
        return (long) this.f1945a.capacity();
    }

    /* renamed from: b */
    public final void mo33835b(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        ByteBuffer slice;
        synchronized (this.f1945a) {
            int i2 = (int) j;
            this.f1945a.position(i2);
            this.f1945a.limit(i2 + i);
            slice = this.f1945a.slice();
        }
        for (MessageDigest update : messageDigestArr) {
            slice.position(0);
            update.update(slice);
        }
    }
}
