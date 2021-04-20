package com.google.android.play.core.assetpacks;

/* renamed from: com.google.android.play.core.assetpacks.cy */
final class C2197cy {

    /* renamed from: a */
    private final int f1797a;

    /* renamed from: b */
    private final String f1798b;

    /* renamed from: c */
    private final long f1799c;

    /* renamed from: d */
    private final long f1800d;

    /* renamed from: e */
    private final int f1801e;

    C2197cy() {
    }

    C2197cy(int i, String str, long j, long j2, int i2) {
        this();
        this.f1797a = i;
        this.f1798b = str;
        this.f1799c = j;
        this.f1800d = j2;
        this.f1801e = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo33742a() {
        return this.f1797a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo33743b() {
        return this.f1798b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public long mo33744c() {
        return this.f1799c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo33745d() {
        return this.f1800d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo33746e() {
        return this.f1801e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r7.f1798b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.android.play.core.assetpacks.C2197cy
            r2 = 0
            if (r1 == 0) goto L_0x0046
            com.google.android.play.core.assetpacks.cy r8 = (com.google.android.play.core.assetpacks.C2197cy) r8
            int r1 = r7.f1797a
            int r3 = r8.mo33742a()
            if (r1 != r3) goto L_0x0046
            java.lang.String r1 = r7.f1798b
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = r8.mo33743b()
            if (r1 != 0) goto L_0x0046
            goto L_0x0029
        L_0x001e:
            java.lang.String r3 = r8.mo33743b()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0029
            goto L_0x0046
        L_0x0029:
            long r3 = r7.f1799c
            long r5 = r8.mo33744c()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0046
            long r3 = r7.f1800d
            long r5 = r8.mo33745d()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0046
            int r1 = r7.f1801e
            int r8 = r8.mo33746e()
            if (r1 != r8) goto L_0x0046
            return r0
        L_0x0046:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C2197cy.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = (this.f1797a ^ 1000003) * 1000003;
        String str = this.f1798b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f1799c;
        long j2 = this.f1800d;
        return ((((((i ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f1801e;
    }

    public String toString() {
        int i = this.f1797a;
        String str = this.f1798b;
        long j = this.f1799c;
        long j2 = this.f1800d;
        int i2 = this.f1801e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(i);
        sb.append(", filePath=");
        sb.append(str);
        sb.append(", fileOffset=");
        sb.append(j);
        sb.append(", remainingBytes=");
        sb.append(j2);
        sb.append(", previousChunk=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
