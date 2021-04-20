package com.google.android.play.core.internal;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* renamed from: com.google.android.play.core.internal.d */
final class C2294d implements C2288c {

    /* renamed from: a */
    private final FileChannel f1967a;

    /* renamed from: b */
    private final long f1968b;

    /* renamed from: c */
    private final long f1969c;

    public C2294d(FileChannel fileChannel, long j, long j2) {
        this.f1967a = fileChannel;
        this.f1968b = j;
        this.f1969c = j2;
    }

    /* renamed from: a */
    public final long mo33834a() {
        return this.f1969c;
    }

    /* renamed from: b */
    public final void mo33835b(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = this.f1967a.map(FileChannel.MapMode.READ_ONLY, this.f1968b + j, (long) i);
        map.load();
        for (MessageDigest update : messageDigestArr) {
            map.position(0);
            update.update(map);
        }
    }
}
