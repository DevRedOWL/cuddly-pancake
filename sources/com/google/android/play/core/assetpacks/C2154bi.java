package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C2241ag;
import com.google.android.play.core.internal.C2289ca;
import java.io.File;

/* renamed from: com.google.android.play.core.assetpacks.bi */
final class C2154bi {

    /* renamed from: a */
    private static final C2241ag f1635a = new C2241ag("ExtractChunkTaskHandler");

    /* renamed from: b */
    private final byte[] f1636b = new byte[8192];

    /* renamed from: c */
    private final C2138at f1637c;

    /* renamed from: d */
    private final C2289ca<C2220s> f1638d;

    /* renamed from: e */
    private final C2289ca<C2135aq> f1639e;

    /* renamed from: f */
    private final C2159bn f1640f;

    C2154bi(C2138at atVar, C2289ca<C2220s> caVar, C2289ca<C2135aq> caVar2, C2159bn bnVar) {
        this.f1637c = atVar;
        this.f1638d = caVar;
        this.f1639e = caVar2;
        this.f1640f = bnVar;
    }

    /* renamed from: b */
    private final File m953b(C2153bh bhVar) {
        File h = this.f1637c.mo33640h(bhVar.f1714k, bhVar.f1626a, bhVar.f1627b, bhVar.f1628c);
        if (!h.exists()) {
            h.mkdirs();
        }
        return h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x017d A[Catch:{ all -> 0x032d, all -> 0x0333, IOException -> 0x0339 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01a2 A[Catch:{ all -> 0x032d, all -> 0x0333, IOException -> 0x0339 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01d6 A[Catch:{ all -> 0x032d, all -> 0x0333, IOException -> 0x0339 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0291 A[SYNTHETIC, Splitter:B:93:0x0291] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33691a(com.google.android.play.core.assetpacks.C2153bh r23) {
        /*
            r22 = this;
            r1 = r22
            r2 = r23
            com.google.android.play.core.assetpacks.cz r0 = new com.google.android.play.core.assetpacks.cz
            com.google.android.play.core.assetpacks.at r4 = r1.f1637c
            java.lang.String r5 = r2.f1714k
            int r6 = r2.f1626a
            long r7 = r2.f1627b
            java.lang.String r9 = r2.f1628c
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r9)
            com.google.android.play.core.assetpacks.at r10 = r1.f1637c
            java.lang.String r11 = r2.f1714k
            int r12 = r2.f1626a
            long r13 = r2.f1627b
            java.lang.String r15 = r2.f1628c
            java.io.File r3 = r10.mo33647o(r11, r12, r13, r15)
            boolean r4 = r3.exists()
            if (r4 != 0) goto L_0x002b
            r3.mkdirs()
        L_0x002b:
            r11 = 3
            r12 = 2
            r13 = 1
            r14 = 0
            java.io.InputStream r3 = r2.f1634i     // Catch:{ IOException -> 0x0339 }
            int r4 = r2.f1629d     // Catch:{ IOException -> 0x0339 }
            if (r4 == r13) goto L_0x0037
            r15 = r3
            goto L_0x003f
        L_0x0037:
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0339 }
            r5 = 8192(0x2000, float:1.14794E-41)
            r4.<init>(r3, r5)     // Catch:{ IOException -> 0x0339 }
            r15 = r4
        L_0x003f:
            int r3 = r2.f1630e     // Catch:{ all -> 0x032d }
            r16 = 0
            if (r3 <= 0) goto L_0x017a
            com.google.android.play.core.assetpacks.cy r3 = r0.mo33754e()     // Catch:{ all -> 0x032d }
            int r4 = r3.mo33746e()     // Catch:{ all -> 0x032d }
            int r5 = r2.f1630e     // Catch:{ all -> 0x032d }
            int r6 = r5 + -1
            if (r4 != r6) goto L_0x015a
            int r4 = r3.mo33742a()     // Catch:{ all -> 0x032d }
            if (r4 == r13) goto L_0x00d8
            if (r4 == r12) goto L_0x009b
            if (r4 != r11) goto L_0x0081
            com.google.android.play.core.internal.ag r4 = f1635a     // Catch:{ all -> 0x032d }
            java.lang.String r5 = "Resuming central directory from last chunk."
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch:{ all -> 0x032d }
            r4.mo33808a(r5, r6)     // Catch:{ all -> 0x032d }
            long r3 = r3.mo33744c()     // Catch:{ all -> 0x032d }
            r0.mo33755f(r15, r3)     // Catch:{ all -> 0x032d }
            boolean r3 = r23.mo33690a()     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x0077
        L_0x0073:
            r4 = r16
            goto L_0x017b
        L_0x0077:
            com.google.android.play.core.assetpacks.bj r0 = new com.google.android.play.core.assetpacks.bj     // Catch:{ all -> 0x032d }
            java.lang.String r3 = "Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB."
            int r4 = r2.f1713j     // Catch:{ all -> 0x032d }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032d }
            throw r0     // Catch:{ all -> 0x032d }
        L_0x0081:
            com.google.android.play.core.assetpacks.bj r0 = new com.google.android.play.core.assetpacks.bj     // Catch:{ all -> 0x032d }
            java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch:{ all -> 0x032d }
            int r3 = r3.mo33742a()     // Catch:{ all -> 0x032d }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x032d }
            r4[r14] = r3     // Catch:{ all -> 0x032d }
            java.lang.String r3 = "Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s."
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x032d }
            int r4 = r2.f1713j     // Catch:{ all -> 0x032d }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032d }
            throw r0     // Catch:{ all -> 0x032d }
        L_0x009b:
            com.google.android.play.core.internal.ag r3 = f1635a     // Catch:{ all -> 0x032d }
            java.lang.String r4 = "Resuming zip entry from last chunk during local file header."
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ all -> 0x032d }
            r3.mo33808a(r4, r5)     // Catch:{ all -> 0x032d }
            com.google.android.play.core.assetpacks.at r3 = r1.f1637c     // Catch:{ all -> 0x032d }
            java.lang.String r4 = r2.f1714k     // Catch:{ all -> 0x032d }
            int r5 = r2.f1626a     // Catch:{ all -> 0x032d }
            long r6 = r2.f1627b     // Catch:{ all -> 0x032d }
            java.lang.String r8 = r2.f1628c     // Catch:{ all -> 0x032d }
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r21 = r8
            java.io.File r3 = r16.mo33646n(r17, r18, r19, r21)     // Catch:{ all -> 0x032d }
            boolean r4 = r3.exists()     // Catch:{ all -> 0x032d }
            if (r4 == 0) goto L_0x00ce
            java.io.SequenceInputStream r4 = new java.io.SequenceInputStream     // Catch:{ all -> 0x032d }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x032d }
            r5.<init>(r3)     // Catch:{ all -> 0x032d }
            r4.<init>(r5, r15)     // Catch:{ all -> 0x032d }
            goto L_0x017b
        L_0x00ce:
            com.google.android.play.core.assetpacks.bj r0 = new com.google.android.play.core.assetpacks.bj     // Catch:{ all -> 0x032d }
            java.lang.String r3 = "Checkpoint extension file not found."
            int r4 = r2.f1713j     // Catch:{ all -> 0x032d }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032d }
            throw r0     // Catch:{ all -> 0x032d }
        L_0x00d8:
            com.google.android.play.core.internal.ag r4 = f1635a     // Catch:{ all -> 0x032d }
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch:{ all -> 0x032d }
            java.lang.String r6 = r3.mo33743b()     // Catch:{ all -> 0x032d }
            r5[r14] = r6     // Catch:{ all -> 0x032d }
            java.lang.String r6 = "Resuming zip entry from last chunk during file %s."
            r4.mo33808a(r6, r5)     // Catch:{ all -> 0x032d }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x032d }
            java.lang.String r5 = r3.mo33743b()     // Catch:{ all -> 0x032d }
            r4.<init>(r5)     // Catch:{ all -> 0x032d }
            boolean r5 = r4.exists()     // Catch:{ all -> 0x032d }
            if (r5 == 0) goto L_0x0150
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ all -> 0x032d }
            java.lang.String r6 = "rw"
            r5.<init>(r4, r6)     // Catch:{ all -> 0x032d }
            long r6 = r3.mo33744c()     // Catch:{ all -> 0x032d }
            r5.seek(r6)     // Catch:{ all -> 0x032d }
            long r6 = r3.mo33745d()     // Catch:{ all -> 0x032d }
        L_0x0108:
            r8 = 8192(0x2000, double:4.0474E-320)
            long r8 = java.lang.Math.min(r6, r8)     // Catch:{ all -> 0x032d }
            int r3 = (int) r8     // Catch:{ all -> 0x032d }
            byte[] r8 = r1.f1636b     // Catch:{ all -> 0x032d }
            int r8 = r15.read(r8, r14, r3)     // Catch:{ all -> 0x032d }
            int r8 = java.lang.Math.max(r8, r14)     // Catch:{ all -> 0x032d }
            if (r8 <= 0) goto L_0x0120
            byte[] r9 = r1.f1636b     // Catch:{ all -> 0x032d }
            r5.write(r9, r14, r8)     // Catch:{ all -> 0x032d }
        L_0x0120:
            long r10 = (long) r8     // Catch:{ all -> 0x032d }
            long r9 = r6 - r10
            r6 = 0
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 <= 0) goto L_0x012f
            if (r8 > 0) goto L_0x012c
            goto L_0x012f
        L_0x012c:
            r6 = r9
            r11 = 3
            goto L_0x0108
        L_0x012f:
            long r6 = r5.length()     // Catch:{ all -> 0x032d }
            r5.close()     // Catch:{ all -> 0x032d }
            if (r8 == r3) goto L_0x017a
            com.google.android.play.core.internal.ag r3 = f1635a     // Catch:{ all -> 0x032d }
            java.lang.String r5 = "Chunk has ended while resuming the previous chunks file content."
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ all -> 0x032d }
            r3.mo33808a(r5, r8)     // Catch:{ all -> 0x032d }
            java.lang.String r4 = r4.getCanonicalPath()     // Catch:{ all -> 0x032d }
            int r11 = r2.f1630e     // Catch:{ all -> 0x032d }
            r3 = r0
            r5 = r6
            r7 = r9
            r9 = r11
            r3.mo33750a(r4, r5, r7, r9)     // Catch:{ all -> 0x032d }
            goto L_0x0073
        L_0x0150:
            com.google.android.play.core.assetpacks.bj r0 = new com.google.android.play.core.assetpacks.bj     // Catch:{ all -> 0x032d }
            java.lang.String r3 = "Partial file specified in checkpoint does not exist. Corrupt directory."
            int r4 = r2.f1713j     // Catch:{ all -> 0x032d }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032d }
            throw r0     // Catch:{ all -> 0x032d }
        L_0x015a:
            com.google.android.play.core.assetpacks.bj r0 = new com.google.android.play.core.assetpacks.bj     // Catch:{ all -> 0x032d }
            java.lang.String r4 = "Trying to resume with chunk number %s when previously processed chunk was number %s."
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch:{ all -> 0x032d }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x032d }
            r6[r14] = r5     // Catch:{ all -> 0x032d }
            int r3 = r3.mo33746e()     // Catch:{ all -> 0x032d }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x032d }
            r6[r13] = r3     // Catch:{ all -> 0x032d }
            java.lang.String r3 = java.lang.String.format(r4, r6)     // Catch:{ all -> 0x032d }
            int r4 = r2.f1713j     // Catch:{ all -> 0x032d }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032d }
            throw r0     // Catch:{ all -> 0x032d }
        L_0x017a:
            r4 = r15
        L_0x017b:
            if (r4 == 0) goto L_0x0288
            com.google.android.play.core.assetpacks.bc r3 = new com.google.android.play.core.assetpacks.bc     // Catch:{ all -> 0x032d }
            r3.<init>(r4)     // Catch:{ all -> 0x032d }
            java.io.File r5 = r22.m953b(r23)     // Catch:{ all -> 0x032d }
        L_0x0186:
            com.google.android.play.core.assetpacks.de r6 = r3.mo33680a()     // Catch:{ all -> 0x032d }
            boolean r7 = r6.mo33772g()     // Catch:{ all -> 0x032d }
            if (r7 != 0) goto L_0x01dd
            boolean r7 = r3.mo33682c()     // Catch:{ all -> 0x032d }
            if (r7 != 0) goto L_0x01dd
            boolean r7 = r6.mo33767c()     // Catch:{ all -> 0x032d }
            if (r7 == 0) goto L_0x01d6
            boolean r7 = r6.mo33766b()     // Catch:{ all -> 0x032d }
            if (r7 != 0) goto L_0x01d6
            byte[] r7 = r6.mo33775i()     // Catch:{ all -> 0x032d }
            r0.mo33756g(r7)     // Catch:{ all -> 0x032d }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x032d }
            java.lang.String r8 = r6.mo33768d()     // Catch:{ all -> 0x032d }
            r7.<init>(r5, r8)     // Catch:{ all -> 0x032d }
            java.io.File r8 = r7.getParentFile()     // Catch:{ all -> 0x032d }
            r8.mkdirs()     // Catch:{ all -> 0x032d }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ all -> 0x032d }
            r8.<init>(r7)     // Catch:{ all -> 0x032d }
            byte[] r7 = r1.f1636b     // Catch:{ all -> 0x032d }
            int r7 = r3.read(r7)     // Catch:{ all -> 0x032d }
        L_0x01c4:
            if (r7 <= 0) goto L_0x01d2
            byte[] r9 = r1.f1636b     // Catch:{ all -> 0x032d }
            r8.write(r9, r14, r7)     // Catch:{ all -> 0x032d }
            byte[] r7 = r1.f1636b     // Catch:{ all -> 0x032d }
            int r7 = r3.read(r7)     // Catch:{ all -> 0x032d }
            goto L_0x01c4
        L_0x01d2:
            r8.close()     // Catch:{ all -> 0x032d }
            goto L_0x01dd
        L_0x01d6:
            byte[] r7 = r6.mo33775i()     // Catch:{ all -> 0x032d }
            r0.mo33757h(r7, r3)     // Catch:{ all -> 0x032d }
        L_0x01dd:
            boolean r7 = r3.mo33681b()     // Catch:{ all -> 0x032d }
            if (r7 != 0) goto L_0x01e9
            boolean r7 = r3.mo33682c()     // Catch:{ all -> 0x032d }
            if (r7 == 0) goto L_0x0186
        L_0x01e9:
            boolean r5 = r3.mo33682c()     // Catch:{ all -> 0x032d }
            if (r5 == 0) goto L_0x01ff
            com.google.android.play.core.internal.ag r5 = f1635a     // Catch:{ all -> 0x032d }
            java.lang.String r7 = "Writing central directory metadata."
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ all -> 0x032d }
            r5.mo33808a(r7, r8)     // Catch:{ all -> 0x032d }
            byte[] r5 = r6.mo33775i()     // Catch:{ all -> 0x032d }
            r0.mo33757h(r5, r4)     // Catch:{ all -> 0x032d }
        L_0x01ff:
            boolean r4 = r23.mo33690a()     // Catch:{ all -> 0x032d }
            if (r4 != 0) goto L_0x0288
            boolean r4 = r6.mo33772g()     // Catch:{ all -> 0x032d }
            if (r4 == 0) goto L_0x021e
            com.google.android.play.core.internal.ag r3 = f1635a     // Catch:{ all -> 0x032d }
            java.lang.String r4 = "Writing slice checkpoint for partial local file header."
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ all -> 0x032d }
            r3.mo33808a(r4, r5)     // Catch:{ all -> 0x032d }
            byte[] r3 = r6.mo33775i()     // Catch:{ all -> 0x032d }
            int r4 = r2.f1630e     // Catch:{ all -> 0x032d }
            r0.mo33751b(r3, r4)     // Catch:{ all -> 0x032d }
            goto L_0x0288
        L_0x021e:
            boolean r4 = r3.mo33682c()     // Catch:{ all -> 0x032d }
            if (r4 == 0) goto L_0x0233
            com.google.android.play.core.internal.ag r3 = f1635a     // Catch:{ all -> 0x032d }
            java.lang.String r4 = "Writing slice checkpoint for central directory."
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ all -> 0x032d }
            r3.mo33808a(r4, r5)     // Catch:{ all -> 0x032d }
            int r3 = r2.f1630e     // Catch:{ all -> 0x032d }
            r0.mo33752c(r3)     // Catch:{ all -> 0x032d }
            goto L_0x0288
        L_0x0233:
            int r4 = r6.mo33771f()     // Catch:{ all -> 0x032d }
            if (r4 != 0) goto L_0x0269
            com.google.android.play.core.internal.ag r4 = f1635a     // Catch:{ all -> 0x032d }
            java.lang.String r5 = "Writing slice checkpoint for partial file."
            java.lang.Object[] r7 = new java.lang.Object[r14]     // Catch:{ all -> 0x032d }
            r4.mo33808a(r5, r7)     // Catch:{ all -> 0x032d }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x032d }
            java.io.File r5 = r22.m953b(r23)     // Catch:{ all -> 0x032d }
            java.lang.String r7 = r6.mo33768d()     // Catch:{ all -> 0x032d }
            r4.<init>(r5, r7)     // Catch:{ all -> 0x032d }
            long r5 = r6.mo33769e()     // Catch:{ all -> 0x032d }
            long r7 = r3.mo33683d()     // Catch:{ all -> 0x032d }
            long r5 = r5 - r7
            long r7 = r4.length()     // Catch:{ all -> 0x032d }
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x0261
            goto L_0x027a
        L_0x0261:
            com.google.android.play.core.assetpacks.bj r0 = new com.google.android.play.core.assetpacks.bj     // Catch:{ all -> 0x032d }
            java.lang.String r3 = "Partial file is of unexpected size."
            r0.<init>(r3)     // Catch:{ all -> 0x032d }
            throw r0     // Catch:{ all -> 0x032d }
        L_0x0269:
            com.google.android.play.core.internal.ag r4 = f1635a     // Catch:{ all -> 0x032d }
            java.lang.String r5 = "Writing slice checkpoint for partial unextractable file."
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch:{ all -> 0x032d }
            r4.mo33808a(r5, r6)     // Catch:{ all -> 0x032d }
            java.io.File r4 = r0.mo33759j()     // Catch:{ all -> 0x032d }
            long r5 = r4.length()     // Catch:{ all -> 0x032d }
        L_0x027a:
            java.lang.String r4 = r4.getCanonicalPath()     // Catch:{ all -> 0x032d }
            long r7 = r3.mo33683d()     // Catch:{ all -> 0x032d }
            int r9 = r2.f1630e     // Catch:{ all -> 0x032d }
            r3 = r0
            r3.mo33750a(r4, r5, r7, r9)     // Catch:{ all -> 0x032d }
        L_0x0288:
            r15.close()     // Catch:{ IOException -> 0x0339 }
            boolean r3 = r23.mo33690a()
            if (r3 == 0) goto L_0x02b1
            int r3 = r2.f1630e     // Catch:{ IOException -> 0x0297 }
            r0.mo33753d(r3)     // Catch:{ IOException -> 0x0297 }
            goto L_0x02b1
        L_0x0297:
            r0 = move-exception
            com.google.android.play.core.internal.ag r3 = f1635a
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.String r5 = r0.getMessage()
            r4[r14] = r5
            java.lang.String r5 = "Writing extraction finished checkpoint failed with %s."
            r3.mo33809b(r5, r4)
            com.google.android.play.core.assetpacks.bj r3 = new com.google.android.play.core.assetpacks.bj
            int r2 = r2.f1713j
            java.lang.String r4 = "Writing extraction finished checkpoint failed."
            r3.<init>(r4, r0, r2)
            throw r3
        L_0x02b1:
            com.google.android.play.core.internal.ag r0 = f1635a
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r2.f1630e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r14] = r4
            java.lang.String r4 = r2.f1628c
            r3[r13] = r4
            java.lang.String r4 = r2.f1714k
            r3[r12] = r4
            int r4 = r2.f1713j
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 3
            r3[r5] = r4
            java.lang.String r4 = "Extraction finished for chunk %s of slice %s of pack %s of session %s."
            r0.mo33811d(r4, r3)
            com.google.android.play.core.internal.ca<com.google.android.play.core.assetpacks.s> r0 = r1.f1638d
            java.lang.Object r0 = r0.mo33869a()
            com.google.android.play.core.assetpacks.s r0 = (com.google.android.play.core.assetpacks.C2220s) r0
            int r3 = r2.f1713j
            java.lang.String r4 = r2.f1714k
            java.lang.String r5 = r2.f1628c
            int r6 = r2.f1630e
            r0.mo33617e(r3, r4, r5, r6)
            java.io.InputStream r0 = r2.f1634i     // Catch:{ IOException -> 0x02ed }
            r0.close()     // Catch:{ IOException -> 0x02ed }
            goto L_0x0307
        L_0x02ed:
            com.google.android.play.core.internal.ag r0 = f1635a
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r3 = r2.f1630e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r14] = r3
            java.lang.String r3 = r2.f1628c
            r4[r13] = r3
            java.lang.String r3 = r2.f1714k
            r4[r12] = r3
            java.lang.String r3 = "Could not close file for chunk %s of slice %s of pack %s."
            r0.mo33812e(r3, r4)
        L_0x0307:
            int r0 = r2.f1633h
            r3 = 3
            if (r0 != r3) goto L_0x032c
            com.google.android.play.core.internal.ca<com.google.android.play.core.assetpacks.aq> r0 = r1.f1639e
            java.lang.Object r0 = r0.mo33869a()
            com.google.android.play.core.assetpacks.aq r0 = (com.google.android.play.core.assetpacks.C2135aq) r0
            java.lang.String r3 = r2.f1714k
            long r7 = r2.f1632g
            r4 = 3
            r5 = 0
            com.google.android.play.core.assetpacks.bn r6 = r1.f1640f
            double r9 = r6.mo33698c(r3, r2)
            r11 = 1
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r7
            com.google.android.play.core.assetpacks.AssetPackState r2 = com.google.android.play.core.assetpacks.AssetPackState.m815b(r2, r3, r4, r5, r7, r9, r11)
            r0.mo33626b(r2)
        L_0x032c:
            return
        L_0x032d:
            r0 = move-exception
            r3 = r0
            r15.close()     // Catch:{ all -> 0x0333 }
            goto L_0x0338
        L_0x0333:
            r0 = move-exception
            r4 = r0
            com.google.android.play.core.internal.C2287bz.m1273a(r3, r4)     // Catch:{ IOException -> 0x0339 }
        L_0x0338:
            throw r3     // Catch:{ IOException -> 0x0339 }
        L_0x0339:
            r0 = move-exception
            com.google.android.play.core.internal.ag r3 = f1635a
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.String r5 = r0.getMessage()
            r4[r14] = r5
            java.lang.String r5 = "IOException during extraction %s."
            r3.mo33809b(r5, r4)
            com.google.android.play.core.assetpacks.bj r3 = new com.google.android.play.core.assetpacks.bj
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r5 = r2.f1630e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r14] = r5
            java.lang.String r5 = r2.f1628c
            r4[r13] = r5
            java.lang.String r5 = r2.f1714k
            r4[r12] = r5
            int r5 = r2.f1713j
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 3
            r4[r6] = r5
            java.lang.String r5 = "Error extracting chunk %s of slice %s of pack %s of session %s."
            java.lang.String r4 = java.lang.String.format(r5, r4)
            int r2 = r2.f1713j
            r3.<init>(r4, r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C2154bi.mo33691a(com.google.android.play.core.assetpacks.bh):void");
    }
}
