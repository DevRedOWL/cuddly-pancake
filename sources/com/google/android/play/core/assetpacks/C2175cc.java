package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C2241ag;

/* renamed from: com.google.android.play.core.assetpacks.cc */
final class C2175cc {

    /* renamed from: a */
    private static final C2241ag f1715a = new C2241ag("ExtractorTaskFinder");

    /* renamed from: b */
    private final C2171bz f1716b;

    /* renamed from: c */
    private final C2138at f1717c;

    /* renamed from: d */
    private final C2147bb f1718d;

    C2175cc(C2171bz bzVar, C2138at atVar, C2147bb bbVar) {
        this.f1716b = bzVar;
        this.f1717c = atVar;
        this.f1718d = bbVar;
    }

    /* renamed from: b */
    private final boolean m990b(C2168bw bwVar, C2169bx bxVar) {
        C2138at atVar = this.f1717c;
        C2167bv bvVar = bwVar.f1693c;
        return new C2198cz(atVar, bvVar.f1686a, bwVar.f1692b, bvVar.f1687b, bxVar.f1694a).mo33761l();
    }

    /* renamed from: c */
    private static boolean m991c(C2169bx bxVar) {
        int i = bxVar.f1699f;
        return i == 1 || i == 2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.google.android.play.core.assetpacks.cq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.google.android.play.core.assetpacks.cq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: com.google.android.play.core.assetpacks.cn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: com.google.android.play.core.assetpacks.cn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: com.google.android.play.core.assetpacks.dc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: com.google.android.play.core.assetpacks.dc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: com.google.android.play.core.assetpacks.cw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: com.google.android.play.core.assetpacks.cw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: com.google.android.play.core.assetpacks.cw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: com.google.android.play.core.assetpacks.dc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: com.google.android.play.core.assetpacks.cn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: com.google.android.play.core.assetpacks.cq} */
    /* JADX WARNING: type inference failed for: r0v11, types: [com.google.android.play.core.assetpacks.cb] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        f1715a.mo33808a("Found final move task for session %s with pack %s.", java.lang.Integer.valueOf(r4.f1691a), r4.f1693c.f1686a);
        r11 = r4.f1691a;
        r8 = r4.f1693c;
        r10 = new com.google.android.play.core.assetpacks.C2189cq(r11, r8.f1686a, r4.f1692b, r8.f1687b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0367, code lost:
        if (r0 != null) goto L_0x0369;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.play.core.assetpacks.C2174cb mo33717a() {
        /*
            r33 = this;
            r1 = r33
            com.google.android.play.core.assetpacks.bz r0 = r1.f1716b     // Catch:{ all -> 0x037c }
            r0.mo33701a()     // Catch:{ all -> 0x037c }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x037c }
            r2.<init>()     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bz r0 = r1.f1716b     // Catch:{ all -> 0x037c }
            java.util.Map r0 = r0.mo33703c()     // Catch:{ all -> 0x037c }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x037c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x037c }
        L_0x001a:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x037c }
            if (r3 == 0) goto L_0x0034
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bw r3 = (com.google.android.play.core.assetpacks.C2168bw) r3     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bv r4 = r3.f1693c     // Catch:{ all -> 0x037c }
            int r4 = r4.f1688c     // Catch:{ all -> 0x037c }
            boolean r4 = com.google.android.play.core.assetpacks.C2183ck.m1020h(r4)     // Catch:{ all -> 0x037c }
            if (r4 == 0) goto L_0x001a
            r2.add(r3)     // Catch:{ all -> 0x037c }
            goto L_0x001a
        L_0x0034:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x037c }
            if (r0 != 0) goto L_0x036f
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x037c }
        L_0x003e:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x037c }
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x00ac
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bw r4 = (com.google.android.play.core.assetpacks.C2168bw) r4     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.at r8 = r1.f1717c     // Catch:{ IOException -> 0x008d }
            com.google.android.play.core.assetpacks.bv r9 = r4.f1693c     // Catch:{ IOException -> 0x008d }
            java.lang.String r10 = r9.f1686a     // Catch:{ IOException -> 0x008d }
            int r11 = r4.f1692b     // Catch:{ IOException -> 0x008d }
            long r12 = r9.f1687b     // Catch:{ IOException -> 0x008d }
            int r8 = r8.mo33643k(r10, r11, r12)     // Catch:{ IOException -> 0x008d }
            com.google.android.play.core.assetpacks.bv r9 = r4.f1693c     // Catch:{ IOException -> 0x008d }
            java.util.List<com.google.android.play.core.assetpacks.bx> r9 = r9.f1690e     // Catch:{ IOException -> 0x008d }
            int r9 = r9.size()     // Catch:{ IOException -> 0x008d }
            if (r8 != r9) goto L_0x003e
            com.google.android.play.core.internal.ag r0 = f1715a     // Catch:{ all -> 0x037c }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x037c }
            int r9 = r4.f1691a     // Catch:{ all -> 0x037c }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x037c }
            r8[r7] = r9     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bv r9 = r4.f1693c     // Catch:{ all -> 0x037c }
            java.lang.String r9 = r9.f1686a     // Catch:{ all -> 0x037c }
            r8[r6] = r9     // Catch:{ all -> 0x037c }
            java.lang.String r9 = "Found final move task for session %s with pack %s."
            r0.mo33808a(r9, r8)     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.cq r0 = new com.google.android.play.core.assetpacks.cq     // Catch:{ all -> 0x037c }
            int r11 = r4.f1691a     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bv r8 = r4.f1693c     // Catch:{ all -> 0x037c }
            java.lang.String r12 = r8.f1686a     // Catch:{ all -> 0x037c }
            int r13 = r4.f1692b     // Catch:{ all -> 0x037c }
            long r14 = r8.f1687b     // Catch:{ all -> 0x037c }
            r10 = r0
            r10.<init>(r11, r12, r13, r14)     // Catch:{ all -> 0x037c }
            goto L_0x00ad
        L_0x008d:
            r0 = move-exception
            com.google.android.play.core.assetpacks.bj r2 = new com.google.android.play.core.assetpacks.bj     // Catch:{ all -> 0x037c }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x037c }
            int r5 = r4.f1691a     // Catch:{ all -> 0x037c }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x037c }
            r3[r7] = r5     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bv r5 = r4.f1693c     // Catch:{ all -> 0x037c }
            java.lang.String r5 = r5.f1686a     // Catch:{ all -> 0x037c }
            r3[r6] = r5     // Catch:{ all -> 0x037c }
            java.lang.String r5 = "Failed to check number of completed merges for session %s, pack %s"
            java.lang.String r3 = java.lang.String.format(r5, r3)     // Catch:{ all -> 0x037c }
            int r4 = r4.f1691a     // Catch:{ all -> 0x037c }
            r2.<init>(r3, r0, r4)     // Catch:{ all -> 0x037c }
            throw r2     // Catch:{ all -> 0x037c }
        L_0x00ac:
            r0 = 0
        L_0x00ad:
            if (r0 != 0) goto L_0x0369
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x037c }
        L_0x00b3:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x037c }
            r8 = 3
            if (r4 == 0) goto L_0x0137
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bw r4 = (com.google.android.play.core.assetpacks.C2168bw) r4     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bv r9 = r4.f1693c     // Catch:{ all -> 0x037c }
            int r9 = r9.f1688c     // Catch:{ all -> 0x037c }
            boolean r9 = com.google.android.play.core.assetpacks.C2183ck.m1020h(r9)     // Catch:{ all -> 0x037c }
            if (r9 == 0) goto L_0x00b3
            com.google.android.play.core.assetpacks.bv r9 = r4.f1693c     // Catch:{ all -> 0x037c }
            java.util.List<com.google.android.play.core.assetpacks.bx> r9 = r9.f1690e     // Catch:{ all -> 0x037c }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x037c }
        L_0x00d2:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x037c }
            if (r10 == 0) goto L_0x00b3
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bx r10 = (com.google.android.play.core.assetpacks.C2169bx) r10     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.at r11 = r1.f1717c     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bv r12 = r4.f1693c     // Catch:{ all -> 0x037c }
            java.lang.String r13 = r12.f1686a     // Catch:{ all -> 0x037c }
            int r14 = r4.f1692b     // Catch:{ all -> 0x037c }
            long r5 = r12.f1687b     // Catch:{ all -> 0x037c }
            java.lang.String r15 = r10.f1694a     // Catch:{ all -> 0x037c }
            r12 = r13
            r13 = r14
            r16 = r15
            r14 = r5
            java.io.File r5 = r11.mo33641i(r12, r13, r14, r16)     // Catch:{ all -> 0x037c }
            boolean r5 = r5.exists()     // Catch:{ all -> 0x037c }
            if (r5 == 0) goto L_0x0134
            com.google.android.play.core.internal.ag r0 = f1715a     // Catch:{ all -> 0x037c }
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ all -> 0x037c }
            int r6 = r4.f1691a     // Catch:{ all -> 0x037c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x037c }
            r5[r7] = r6     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bv r6 = r4.f1693c     // Catch:{ all -> 0x037c }
            java.lang.String r6 = r6.f1686a     // Catch:{ all -> 0x037c }
            r9 = 1
            r5[r9] = r6     // Catch:{ all -> 0x037c }
            java.lang.String r6 = r10.f1694a     // Catch:{ all -> 0x037c }
            r9 = 2
            r5[r9] = r6     // Catch:{ all -> 0x037c }
            java.lang.String r6 = "Found merge task for session %s with pack %s and slice %s."
            r0.mo33808a(r6, r5)     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.cn r0 = new com.google.android.play.core.assetpacks.cn     // Catch:{ all -> 0x037c }
            int r5 = r4.f1691a     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bv r6 = r4.f1693c     // Catch:{ all -> 0x037c }
            java.lang.String r9 = r6.f1686a     // Catch:{ all -> 0x037c }
            int r4 = r4.f1692b     // Catch:{ all -> 0x037c }
            long r11 = r6.f1687b     // Catch:{ all -> 0x037c }
            java.lang.String r6 = r10.f1694a     // Catch:{ all -> 0x037c }
            r19 = r0
            r20 = r5
            r21 = r9
            r22 = r4
            r23 = r11
            r25 = r6
            r19.<init>(r20, r21, r22, r23, r25)     // Catch:{ all -> 0x037c }
            goto L_0x0138
        L_0x0134:
            r5 = 2
            r6 = 1
            goto L_0x00d2
        L_0x0137:
            r0 = 0
        L_0x0138:
            if (r0 != 0) goto L_0x0369
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x037c }
        L_0x013e:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x037c }
            if (r4 == 0) goto L_0x01c5
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bw r4 = (com.google.android.play.core.assetpacks.C2168bw) r4     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bv r5 = r4.f1693c     // Catch:{ all -> 0x037c }
            int r5 = r5.f1688c     // Catch:{ all -> 0x037c }
            boolean r5 = com.google.android.play.core.assetpacks.C2183ck.m1020h(r5)     // Catch:{ all -> 0x037c }
            if (r5 == 0) goto L_0x013e
            com.google.android.play.core.assetpacks.bv r5 = r4.f1693c     // Catch:{ all -> 0x037c }
            java.util.List<com.google.android.play.core.assetpacks.bx> r5 = r5.f1690e     // Catch:{ all -> 0x037c }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x037c }
        L_0x015c:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x037c }
            if (r6 == 0) goto L_0x013e
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bx r6 = (com.google.android.play.core.assetpacks.C2169bx) r6     // Catch:{ all -> 0x037c }
            boolean r9 = r1.m990b(r4, r6)     // Catch:{ all -> 0x037c }
            if (r9 == 0) goto L_0x015c
            com.google.android.play.core.assetpacks.at r10 = r1.f1717c     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bv r9 = r4.f1693c     // Catch:{ all -> 0x037c }
            java.lang.String r11 = r9.f1686a     // Catch:{ all -> 0x037c }
            int r12 = r4.f1692b     // Catch:{ all -> 0x037c }
            long r13 = r9.f1687b     // Catch:{ all -> 0x037c }
            java.lang.String r15 = r6.f1694a     // Catch:{ all -> 0x037c }
            java.io.File r9 = r10.mo33640h(r11, r12, r13, r15)     // Catch:{ all -> 0x037c }
            boolean r9 = r9.exists()     // Catch:{ all -> 0x037c }
            if (r9 == 0) goto L_0x015c
            com.google.android.play.core.internal.ag r0 = f1715a     // Catch:{ all -> 0x037c }
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ all -> 0x037c }
            int r9 = r4.f1691a     // Catch:{ all -> 0x037c }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x037c }
            r5[r7] = r9     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bv r9 = r4.f1693c     // Catch:{ all -> 0x037c }
            java.lang.String r9 = r9.f1686a     // Catch:{ all -> 0x037c }
            r10 = 1
            r5[r10] = r9     // Catch:{ all -> 0x037c }
            java.lang.String r9 = r6.f1694a     // Catch:{ all -> 0x037c }
            r10 = 2
            r5[r10] = r9     // Catch:{ all -> 0x037c }
            java.lang.String r9 = "Found verify task for session %s with pack %s and slice %s."
            r0.mo33808a(r9, r5)     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.dc r0 = new com.google.android.play.core.assetpacks.dc     // Catch:{ all -> 0x037c }
            int r5 = r4.f1691a     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bv r9 = r4.f1693c     // Catch:{ all -> 0x037c }
            java.lang.String r10 = r9.f1686a     // Catch:{ all -> 0x037c }
            int r4 = r4.f1692b     // Catch:{ all -> 0x037c }
            long r11 = r9.f1687b     // Catch:{ all -> 0x037c }
            java.lang.String r9 = r6.f1694a     // Catch:{ all -> 0x037c }
            java.lang.String r13 = r6.f1695b     // Catch:{ all -> 0x037c }
            long r14 = r6.f1696c     // Catch:{ all -> 0x037c }
            r19 = r0
            r20 = r5
            r21 = r10
            r22 = r4
            r23 = r11
            r25 = r9
            r26 = r13
            r19.<init>(r20, r21, r22, r23, r25, r26)     // Catch:{ all -> 0x037c }
            goto L_0x01c6
        L_0x01c5:
            r0 = 0
        L_0x01c6:
            if (r0 != 0) goto L_0x0369
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x037c }
        L_0x01cc:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x037c }
            r5 = 4
            if (r0 == 0) goto L_0x02b3
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x037c }
            r6 = r0
            com.google.android.play.core.assetpacks.bw r6 = (com.google.android.play.core.assetpacks.C2168bw) r6     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bv r0 = r6.f1693c     // Catch:{ all -> 0x037c }
            int r0 = r0.f1688c     // Catch:{ all -> 0x037c }
            boolean r0 = com.google.android.play.core.assetpacks.C2183ck.m1020h(r0)     // Catch:{ all -> 0x037c }
            if (r0 == 0) goto L_0x01cc
            com.google.android.play.core.assetpacks.bv r0 = r6.f1693c     // Catch:{ all -> 0x037c }
            java.util.List<com.google.android.play.core.assetpacks.bx> r0 = r0.f1690e     // Catch:{ all -> 0x037c }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x037c }
        L_0x01ec:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x037c }
            if (r0 == 0) goto L_0x01cc
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x037c }
            r10 = r0
            com.google.android.play.core.assetpacks.bx r10 = (com.google.android.play.core.assetpacks.C2169bx) r10     // Catch:{ all -> 0x037c }
            boolean r0 = m991c(r10)     // Catch:{ all -> 0x037c }
            if (r0 != 0) goto L_0x01ec
            com.google.android.play.core.assetpacks.cz r0 = new com.google.android.play.core.assetpacks.cz     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.at r11 = r1.f1717c     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bv r12 = r6.f1693c     // Catch:{ all -> 0x037c }
            java.lang.String r13 = r12.f1686a     // Catch:{ all -> 0x037c }
            int r14 = r6.f1692b     // Catch:{ all -> 0x037c }
            r16 = r4
            long r3 = r12.f1687b     // Catch:{ all -> 0x037c }
            java.lang.String r12 = r10.f1694a     // Catch:{ all -> 0x037c }
            r19 = r0
            r20 = r11
            r21 = r13
            r22 = r14
            r23 = r3
            r25 = r12
            r19.<init>(r20, r21, r22, r23, r25)     // Catch:{ all -> 0x037c }
            int r0 = r0.mo33760k()     // Catch:{ IOException -> 0x0223 }
            goto L_0x0232
        L_0x0223:
            r0 = move-exception
            r3 = r0
            com.google.android.play.core.internal.ag r0 = f1715a     // Catch:{ all -> 0x037c }
            r4 = 1
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ all -> 0x037c }
            r11[r7] = r3     // Catch:{ all -> 0x037c }
            java.lang.String r3 = "Slice checkpoint corrupt, restarting extraction. %s"
            r0.mo33809b(r3, r11)     // Catch:{ all -> 0x037c }
            r0 = 0
        L_0x0232:
            r3 = -1
            if (r0 == r3) goto L_0x02af
            java.util.List<com.google.android.play.core.assetpacks.bu> r3 = r10.f1697d     // Catch:{ all -> 0x037c }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bu r3 = (com.google.android.play.core.assetpacks.C2166bu) r3     // Catch:{ all -> 0x037c }
            boolean r3 = r3.f1685a     // Catch:{ all -> 0x037c }
            if (r3 == 0) goto L_0x02af
            com.google.android.play.core.internal.ag r3 = f1715a     // Catch:{ all -> 0x037c }
            r4 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x037c }
            int r9 = r10.f1698e     // Catch:{ all -> 0x037c }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x037c }
            r4[r7] = r9     // Catch:{ all -> 0x037c }
            int r9 = r6.f1691a     // Catch:{ all -> 0x037c }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x037c }
            r11 = 1
            r4[r11] = r9     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bv r9 = r6.f1693c     // Catch:{ all -> 0x037c }
            java.lang.String r9 = r9.f1686a     // Catch:{ all -> 0x037c }
            r11 = 2
            r4[r11] = r9     // Catch:{ all -> 0x037c }
            java.lang.String r9 = r10.f1694a     // Catch:{ all -> 0x037c }
            r4[r8] = r9     // Catch:{ all -> 0x037c }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x037c }
            r4[r5] = r9     // Catch:{ all -> 0x037c }
            java.lang.String r9 = "Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s."
            r3.mo33808a(r9, r4)     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bb r3 = r1.f1718d     // Catch:{ all -> 0x037c }
            int r4 = r6.f1691a     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bv r9 = r6.f1693c     // Catch:{ all -> 0x037c }
            java.lang.String r9 = r9.f1686a     // Catch:{ all -> 0x037c }
            java.lang.String r11 = r10.f1694a     // Catch:{ all -> 0x037c }
            java.io.InputStream r32 = r3.mo33679a(r4, r9, r11, r0)     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bh r3 = new com.google.android.play.core.assetpacks.bh     // Catch:{ all -> 0x037c }
            int r4 = r6.f1691a     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bv r9 = r6.f1693c     // Catch:{ all -> 0x037c }
            java.lang.String r11 = r9.f1686a     // Catch:{ all -> 0x037c }
            int r12 = r6.f1692b     // Catch:{ all -> 0x037c }
            long r13 = r9.f1687b     // Catch:{ all -> 0x037c }
            java.lang.String r9 = r10.f1694a     // Catch:{ all -> 0x037c }
            int r15 = r10.f1698e     // Catch:{ all -> 0x037c }
            java.util.List<com.google.android.play.core.assetpacks.bu> r10 = r10.f1697d     // Catch:{ all -> 0x037c }
            int r28 = r10.size()     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bv r6 = r6.f1693c     // Catch:{ all -> 0x037c }
            long r7 = r6.f1689d     // Catch:{ all -> 0x037c }
            int r6 = r6.f1688c     // Catch:{ all -> 0x037c }
            r19 = r3
            r20 = r4
            r21 = r11
            r22 = r12
            r23 = r13
            r25 = r9
            r26 = r15
            r27 = r0
            r29 = r7
            r31 = r6
            r19.<init>(r20, r21, r22, r23, r25, r26, r27, r28, r29, r31, r32)     // Catch:{ all -> 0x037c }
            goto L_0x02b4
        L_0x02af:
            r4 = r16
            goto L_0x01ec
        L_0x02b3:
            r3 = 0
        L_0x02b4:
            if (r3 != 0) goto L_0x0376
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x037c }
        L_0x02ba:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x037c }
            if (r2 == 0) goto L_0x0366
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bw r2 = (com.google.android.play.core.assetpacks.C2168bw) r2     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bv r3 = r2.f1693c     // Catch:{ all -> 0x037c }
            int r3 = r3.f1688c     // Catch:{ all -> 0x037c }
            boolean r3 = com.google.android.play.core.assetpacks.C2183ck.m1020h(r3)     // Catch:{ all -> 0x037c }
            if (r3 == 0) goto L_0x02ba
            com.google.android.play.core.assetpacks.bv r3 = r2.f1693c     // Catch:{ all -> 0x037c }
            java.util.List<com.google.android.play.core.assetpacks.bx> r3 = r3.f1690e     // Catch:{ all -> 0x037c }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x037c }
        L_0x02d8:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x037c }
            if (r4 == 0) goto L_0x02ba
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bx r4 = (com.google.android.play.core.assetpacks.C2169bx) r4     // Catch:{ all -> 0x037c }
            boolean r6 = m991c(r4)     // Catch:{ all -> 0x037c }
            if (r6 == 0) goto L_0x02d8
            java.util.List<com.google.android.play.core.assetpacks.bu> r6 = r4.f1697d     // Catch:{ all -> 0x037c }
            r7 = 0
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bu r6 = (com.google.android.play.core.assetpacks.C2166bu) r6     // Catch:{ all -> 0x037c }
            boolean r6 = r6.f1685a     // Catch:{ all -> 0x037c }
            if (r6 == 0) goto L_0x02d8
            boolean r6 = r1.m990b(r2, r4)     // Catch:{ all -> 0x037c }
            if (r6 != 0) goto L_0x02d8
            com.google.android.play.core.internal.ag r0 = f1715a     // Catch:{ all -> 0x037c }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x037c }
            int r5 = r4.f1699f     // Catch:{ all -> 0x037c }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x037c }
            r6 = 0
            r3[r6] = r5     // Catch:{ all -> 0x037c }
            int r5 = r2.f1691a     // Catch:{ all -> 0x037c }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x037c }
            r6 = 1
            r3[r6] = r5     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bv r5 = r2.f1693c     // Catch:{ all -> 0x037c }
            java.lang.String r5 = r5.f1686a     // Catch:{ all -> 0x037c }
            r7 = 2
            r3[r7] = r5     // Catch:{ all -> 0x037c }
            java.lang.String r5 = r4.f1694a     // Catch:{ all -> 0x037c }
            r8 = 3
            r3[r8] = r5     // Catch:{ all -> 0x037c }
            java.lang.String r5 = "Found patch slice task using patch format %s for session %s, pack %s, slice %s."
            r0.mo33808a(r5, r3)     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bb r0 = r1.f1718d     // Catch:{ all -> 0x037c }
            int r3 = r2.f1691a     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bv r5 = r2.f1693c     // Catch:{ all -> 0x037c }
            java.lang.String r5 = r5.f1686a     // Catch:{ all -> 0x037c }
            java.lang.String r6 = r4.f1694a     // Catch:{ all -> 0x037c }
            r9 = 0
            java.io.InputStream r23 = r0.mo33679a(r3, r5, r6, r9)     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.cw r0 = new com.google.android.play.core.assetpacks.cw     // Catch:{ all -> 0x037c }
            int r11 = r2.f1691a     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bv r3 = r2.f1693c     // Catch:{ all -> 0x037c }
            java.lang.String r12 = r3.f1686a     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.at r3 = r1.f1717c     // Catch:{ all -> 0x037c }
            int r13 = r3.mo33652t(r12)     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.at r3 = r1.f1717c     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bv r5 = r2.f1693c     // Catch:{ all -> 0x037c }
            java.lang.String r5 = r5.f1686a     // Catch:{ all -> 0x037c }
            long r14 = r3.mo33653u(r5)     // Catch:{ all -> 0x037c }
            int r3 = r2.f1692b     // Catch:{ all -> 0x037c }
            com.google.android.play.core.assetpacks.bv r2 = r2.f1693c     // Catch:{ all -> 0x037c }
            long r5 = r2.f1687b     // Catch:{ all -> 0x037c }
            int r2 = r4.f1699f     // Catch:{ all -> 0x037c }
            java.lang.String r7 = r4.f1694a     // Catch:{ all -> 0x037c }
            long r8 = r4.f1696c     // Catch:{ all -> 0x037c }
            r10 = r0
            r16 = r3
            r17 = r5
            r19 = r2
            r20 = r7
            r21 = r8
            r10.<init>(r11, r12, r13, r14, r16, r17, r19, r20, r21, r23)     // Catch:{ all -> 0x037c }
            goto L_0x0367
        L_0x0366:
            r0 = 0
        L_0x0367:
            if (r0 == 0) goto L_0x036f
        L_0x0369:
            com.google.android.play.core.assetpacks.bz r2 = r1.f1716b
            r2.mo33702b()
            return r0
        L_0x036f:
            com.google.android.play.core.assetpacks.bz r0 = r1.f1716b
            r0.mo33702b()
            r2 = 0
            return r2
        L_0x0376:
            com.google.android.play.core.assetpacks.bz r0 = r1.f1716b
            r0.mo33702b()
            return r3
        L_0x037c:
            r0 = move-exception
            com.google.android.play.core.assetpacks.bz r2 = r1.f1716b
            r2.mo33702b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C2175cc.mo33717a():com.google.android.play.core.assetpacks.cb");
    }
}
