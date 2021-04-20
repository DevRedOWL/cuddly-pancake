package p008c.p009a.p017d.p020c;

import java.nio.charset.Charset;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p008c.p009a.p031f.C0988c;

/* renamed from: c.a.d.c.a */
public final class C0936a {

    /* renamed from: a */
    public static final Charset f975a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final byte[] f976b;

    /* renamed from: c */
    public static final byte[] f977c;

    /* renamed from: d */
    public static final byte[] f978d;

    /* renamed from: e */
    public static final byte[] f979e;

    /* renamed from: f */
    public static final C0936a f980f = new C0936a();

    /* renamed from: c.a.d.c.a$a */
    public enum C0937a {
        UNKNOWN,
        SELECT_APP_TYPE,
        SELECT_COMMAND,
        SELECT_DATA
    }

    static {
        byte[] a = C0988c.m584a("00a40400");
        Intrinsics.checkNotNullExpressionValue(a, "Hex.toByteArray(\"00a40400\")");
        f976b = a;
        byte[] a2 = C0988c.m584a("00c200000cfc");
        Intrinsics.checkNotNullExpressionValue(a2, "Hex.toByteArray(\"00c200000cfc\")");
        f977c = a2;
        byte[] a3 = C0988c.m584a("00c20000");
        Intrinsics.checkNotNullExpressionValue(a3, "Hex.toByteArray(\"00c20000\")");
        f978d = a3;
        byte[] a4 = C0988c.m584a("9000");
        Intrinsics.checkNotNullExpressionValue(a4, "Hex.toByteArray(\"9000\")");
        f979e = a4;
    }

    /* renamed from: a */
    public final byte[] mo13004a(byte[] bArr) {
        byte[] bArr2;
        if (bArr == null || (bArr2 = ArraysKt.plus(bArr, f979e)) == null) {
            bArr2 = f979e;
        }
        "APDU Reply: " + C0988c.m582a(bArr2);
        return bArr2;
    }

    /* renamed from: a */
    public final byte[] mo13005a(byte[] bArr, byte[] bArr2) {
        Intrinsics.checkNotNullParameter(bArr, "requestCommand");
        Intrinsics.checkNotNullParameter(bArr2, "replyPayload");
        byte[] bArr3 = new byte[(bArr2.length + 2 + 1)];
        bArr3[0] = bArr[2];
        bArr3[1] = bArr[3];
        bArr3[2] = (byte) bArr2.length;
        System.arraycopy(bArr2, 0, bArr3, 3, bArr2.length);
        return bArr3;
    }

    /* renamed from: b */
    public final byte[] mo13006b(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "requestCommand");
        return mo13007c(bArr) > 0 ? ArraysKt.sliceArray(bArr, RangesKt.until(5, mo13007c(bArr) + 5)) : new byte[0];
    }

    /* renamed from: c */
    public final int mo13007c(byte[] bArr) {
        if (bArr.length > 5) {
            return bArr[4];
        }
        return 0;
    }
}
