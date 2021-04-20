package kotlin.p049io;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010H\u0002J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0002J\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020!H\u0002J\u0010\u0010#\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, mo51343d2 = {"Lkotlin/io/LineReader;", "", "()V", "BUFFER_SIZE", "", "byteBuf", "Ljava/nio/ByteBuffer;", "bytes", "", "charBuf", "Ljava/nio/CharBuffer;", "chars", "", "decoder", "Ljava/nio/charset/CharsetDecoder;", "directEOL", "", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "compactBytes", "decode", "endOfInput", "decodeEndOfInput", "nBytes", "nChars", "readLine", "", "inputStream", "Ljava/io/InputStream;", "charset", "Ljava/nio/charset/Charset;", "resetAll", "", "trimStringBuilder", "updateCharset", "kotlin-stdlib"}, mo51344k = 1, mo51345mv = {1, 4, 0})
/* renamed from: kotlin.io.LineReader */
/* compiled from: Console.kt */
public final class LineReader {
    private static final int BUFFER_SIZE = 32;
    public static final LineReader INSTANCE = new LineReader();
    private static final ByteBuffer byteBuf;
    private static final byte[] bytes = new byte[32];
    private static final CharBuffer charBuf;
    private static final char[] chars = new char[32];
    /* access modifiers changed from: private */
    public static CharsetDecoder decoder;
    private static boolean directEOL;

    /* renamed from: sb */
    private static final StringBuilder f6173sb = new StringBuilder();

    static {
        ByteBuffer wrap = ByteBuffer.wrap(bytes);
        Intrinsics.checkNotNullExpressionValue(wrap, "ByteBuffer.wrap(bytes)");
        byteBuf = wrap;
        CharBuffer wrap2 = CharBuffer.wrap(chars);
        Intrinsics.checkNotNullExpressionValue(wrap2, "CharBuffer.wrap(chars)");
        charBuf = wrap2;
    }

    private LineReader() {
    }

    public static final /* synthetic */ CharsetDecoder access$getDecoder$p(LineReader lineReader) {
        CharsetDecoder charsetDecoder = decoder;
        if (charsetDecoder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder");
        }
        return charsetDecoder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (f6173sb.length() != 0) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (r11 == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        if (r0 != 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        if (r2 != 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r11 = decodeEndOfInput(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if ((!kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0.charset(), (java.lang.Object) r12)) != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String readLine(java.io.InputStream r11, java.nio.charset.Charset r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = "inputStream"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)     // Catch:{ all -> 0x00de }
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)     // Catch:{ all -> 0x00de }
            java.nio.charset.CharsetDecoder r0 = decoder     // Catch:{ all -> 0x00de }
            r1 = 1
            if (r0 == 0) goto L_0x0024
            java.nio.charset.CharsetDecoder r0 = decoder     // Catch:{ all -> 0x00de }
            if (r0 != 0) goto L_0x0019
            java.lang.String r2 = "decoder"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)     // Catch:{ all -> 0x00de }
        L_0x0019:
            java.nio.charset.Charset r0 = r0.charset()     // Catch:{ all -> 0x00de }
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r12)     // Catch:{ all -> 0x00de }
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0027
        L_0x0024:
            r10.updateCharset(r12)     // Catch:{ all -> 0x00de }
        L_0x0027:
            r12 = 0
            r0 = 0
            r2 = 0
        L_0x002a:
            int r3 = r11.read()     // Catch:{ all -> 0x00de }
            r4 = 32
            r5 = 10
            r6 = -1
            if (r3 != r6) goto L_0x0050
            java.lang.StringBuilder r11 = f6173sb     // Catch:{ all -> 0x00de }
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11     // Catch:{ all -> 0x00de }
            int r11 = r11.length()     // Catch:{ all -> 0x00de }
            if (r11 != 0) goto L_0x0041
            r11 = 1
            goto L_0x0042
        L_0x0041:
            r11 = 0
        L_0x0042:
            if (r11 == 0) goto L_0x004b
            if (r0 != 0) goto L_0x004b
            if (r2 != 0) goto L_0x004b
            r11 = 0
            monitor-exit(r10)
            return r11
        L_0x004b:
            int r11 = r10.decodeEndOfInput(r0, r2)     // Catch:{ all -> 0x00de }
            goto L_0x0080
        L_0x0050:
            byte[] r6 = bytes     // Catch:{ all -> 0x00de }
            int r7 = r0 + 1
            byte r8 = (byte) r3     // Catch:{ all -> 0x00de }
            r6[r0] = r8     // Catch:{ all -> 0x00de }
            if (r3 == r5) goto L_0x0062
            if (r7 == r4) goto L_0x0062
            boolean r0 = directEOL     // Catch:{ all -> 0x00de }
            if (r0 != 0) goto L_0x0060
            goto L_0x0062
        L_0x0060:
            r0 = r7
            goto L_0x002a
        L_0x0062:
            java.nio.ByteBuffer r0 = byteBuf     // Catch:{ all -> 0x00de }
            r0.limit(r7)     // Catch:{ all -> 0x00de }
            java.nio.CharBuffer r0 = charBuf     // Catch:{ all -> 0x00de }
            r0.position(r2)     // Catch:{ all -> 0x00de }
            int r0 = r10.decode(r12)     // Catch:{ all -> 0x00de }
            if (r0 <= 0) goto L_0x00d5
            char[] r2 = chars     // Catch:{ all -> 0x00de }
            int r3 = r0 + -1
            char r2 = r2[r3]     // Catch:{ all -> 0x00de }
            if (r2 != r5) goto L_0x00d5
            java.nio.ByteBuffer r11 = byteBuf     // Catch:{ all -> 0x00de }
            r11.position(r12)     // Catch:{ all -> 0x00de }
            r11 = r0
        L_0x0080:
            if (r11 <= 0) goto L_0x009a
            char[] r0 = chars     // Catch:{ all -> 0x00de }
            int r2 = r11 + -1
            char r0 = r0[r2]     // Catch:{ all -> 0x00de }
            if (r0 != r5) goto L_0x009a
            int r11 = r11 + -1
            if (r11 <= 0) goto L_0x009a
            char[] r0 = chars     // Catch:{ all -> 0x00de }
            int r2 = r11 + -1
            char r0 = r0[r2]     // Catch:{ all -> 0x00de }
            r2 = 13
            if (r0 != r2) goto L_0x009a
            int r11 = r11 + -1
        L_0x009a:
            java.lang.StringBuilder r0 = f6173sb     // Catch:{ all -> 0x00de }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ all -> 0x00de }
            int r0 = r0.length()     // Catch:{ all -> 0x00de }
            if (r0 != 0) goto L_0x00a5
            goto L_0x00a6
        L_0x00a5:
            r1 = 0
        L_0x00a6:
            if (r1 == 0) goto L_0x00b1
            char[] r0 = chars     // Catch:{ all -> 0x00de }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x00de }
            r1.<init>(r0, r12, r11)     // Catch:{ all -> 0x00de }
            monitor-exit(r10)
            return r1
        L_0x00b1:
            java.lang.StringBuilder r0 = f6173sb     // Catch:{ all -> 0x00de }
            char[] r1 = chars     // Catch:{ all -> 0x00de }
            r0.append(r1, r12, r11)     // Catch:{ all -> 0x00de }
            java.lang.StringBuilder r11 = f6173sb     // Catch:{ all -> 0x00de }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00de }
            java.lang.String r0 = "sb.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)     // Catch:{ all -> 0x00de }
            java.lang.StringBuilder r0 = f6173sb     // Catch:{ all -> 0x00de }
            int r0 = r0.length()     // Catch:{ all -> 0x00de }
            if (r0 <= r4) goto L_0x00ce
            r10.trimStringBuilder()     // Catch:{ all -> 0x00de }
        L_0x00ce:
            java.lang.StringBuilder r0 = f6173sb     // Catch:{ all -> 0x00de }
            r0.setLength(r12)     // Catch:{ all -> 0x00de }
            monitor-exit(r10)
            return r11
        L_0x00d5:
            int r2 = r10.compactBytes()     // Catch:{ all -> 0x00de }
            r9 = r2
            r2 = r0
            r0 = r9
            goto L_0x002a
        L_0x00de:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p049io.LineReader.readLine(java.io.InputStream, java.nio.charset.Charset):java.lang.String");
    }

    private final int decode(boolean z) {
        while (true) {
            CharsetDecoder charsetDecoder = decoder;
            if (charsetDecoder == null) {
                Intrinsics.throwUninitializedPropertyAccessException("decoder");
            }
            CoderResult decode = charsetDecoder.decode(byteBuf, charBuf, z);
            Intrinsics.checkNotNullExpressionValue(decode, "decoder.decode(byteBuf, charBuf, endOfInput)");
            if (decode.isError()) {
                resetAll();
                decode.throwException();
            }
            int position = charBuf.position();
            if (!decode.isOverflow()) {
                return position;
            }
            int i = position - 1;
            f6173sb.append(chars, 0, i);
            charBuf.position(0);
            charBuf.limit(32);
            charBuf.put(chars[i]);
        }
    }

    private final int compactBytes() {
        ByteBuffer byteBuffer = byteBuf;
        byteBuffer.compact();
        int position = byteBuffer.position();
        byteBuffer.position(0);
        return position;
    }

    private final int decodeEndOfInput(int i, int i2) {
        byteBuf.limit(i);
        charBuf.position(i2);
        int decode = decode(true);
        CharsetDecoder charsetDecoder = decoder;
        if (charsetDecoder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder");
        }
        charsetDecoder.reset();
        byteBuf.position(0);
        return decode;
    }

    private final void updateCharset(Charset charset) {
        CharsetDecoder newDecoder = charset.newDecoder();
        Intrinsics.checkNotNullExpressionValue(newDecoder, "charset.newDecoder()");
        decoder = newDecoder;
        byteBuf.clear();
        charBuf.clear();
        byteBuf.put((byte) 10);
        byteBuf.flip();
        CharsetDecoder charsetDecoder = decoder;
        if (charsetDecoder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder");
        }
        charsetDecoder.decode(byteBuf, charBuf, false);
        boolean z = true;
        if (!(charBuf.position() == 1 && charBuf.get(0) == 10)) {
            z = false;
        }
        directEOL = z;
        resetAll();
    }

    private final void resetAll() {
        CharsetDecoder charsetDecoder = decoder;
        if (charsetDecoder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder");
        }
        charsetDecoder.reset();
        byteBuf.position(0);
        f6173sb.setLength(0);
    }

    private final void trimStringBuilder() {
        f6173sb.setLength(32);
        f6173sb.trimToSize();
    }
}
