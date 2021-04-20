package p008c.p009a.p017d.p023e;

import android.net.Uri;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.util.UUID;
import p008c.p009a.p014b.C0878g;
import p008c.p009a.p031f.C0985a;
import p008c.p009a.p031f.C0986b;
import p008c.p009a.p031f.C0988c;

/* renamed from: c.a.d.e.b */
public class C0953b {

    /* renamed from: c */
    public static final C0986b.C0987a f1017c = new C0986b.C0987a(-2084658916, -1523279691, 227976017, 1331110099, 2137325827, -1050070171, 1349831955, -1612217311);

    /* renamed from: a */
    public final UUID f1018a;

    /* renamed from: b */
    public final UUID f1019b;

    /* renamed from: c.a.d.e.b$a */
    public static class C0954a {

        /* renamed from: a */
        public final String f1020a;

        /* renamed from: b */
        public final String f1021b;

        /* renamed from: c */
        public final String f1022c;

        public C0954a(String str, String str2, String str3) {
            this.f1020a = str;
            this.f1021b = str2;
            this.f1022c = str3;
        }
    }

    public C0953b(UUID uuid, UUID uuid2) {
        this.f1018a = uuid;
        this.f1019b = uuid2;
    }

    /* renamed from: a */
    public static C0954a m543a(C0954a aVar, Uri uri, String str) {
        String queryParameter = uri.getQueryParameter("id");
        if (queryParameter == null) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            if (decode.length == 32) {
                int a = C0878g.m455a(decode, 0);
                int a2 = C0878g.m455a(decode, 4);
                int a3 = C0878g.m455a(decode, 8);
                int a4 = C0878g.m455a(decode, 12);
                int a5 = C0878g.m455a(decode, 16);
                int a6 = C0878g.m455a(decode, 20);
                int a7 = C0878g.m455a(decode, 24);
                int a8 = C0878g.m455a(decode, 28);
                ByteBuffer order = ByteBuffer.allocate(32).order(ByteOrder.LITTLE_ENDIAN);
                order.putInt(a).putInt(a2).putInt(a3).putInt(a4).putInt(a5).putInt(a6).putInt(a7).putInt(a8);
                order.position(0);
                IntBuffer asIntBuffer = order.asIntBuffer();
                int[] iArr = new int[asIntBuffer.capacity()];
                asIntBuffer.get(iArr);
                byte[] decode2 = Base64.decode(queryParameter, 8);
                LongBuffer asLongBuffer = ByteBuffer.wrap(decode2).order(ByteOrder.LITTLE_ENDIAN).asLongBuffer();
                ByteBuffer order2 = ByteBuffer.allocate(decode2.length).order(ByteOrder.LITTLE_ENDIAN);
                for (int i = 0; i < asLongBuffer.capacity(); i++) {
                    order2.putLong(C0986b.m579a(asLongBuffer.get(i), iArr, C0986b.f1126c));
                }
                byte[] array = order2.array();
                if ((C0985a.Dallas.mo13041a(array, 2, 11) & 255) != (array[1] & 255)) {
                    return null;
                }
                byte b = array[2];
                if (b == 1) {
                    return new C0954a(C0988c.m583a(array, 3, 8), aVar.f1021b, aVar.f1022c);
                }
                if (b != 2) {
                    return b != 3 ? aVar : new C0954a(aVar.f1020a, aVar.f1021b, C0988c.m583a(array, 3, 9));
                }
                return new C0954a(aVar.f1020a, C0988c.m583a(array, 3, 9), aVar.f1022c);
            }
            throw new IllegalArgumentException("DemandId length must be 32!");
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static C0953b m544a(Uri uri) {
        String uri2 = uri.toString();
        try {
            byte[] decode = Base64.decode(uri2.substring(uri2.indexOf("id=") + 3, uri2.length()), 8);
            if (decode.length < 33 || decode[0] != 0) {
                return null;
            }
            UUID c = C0878g.m468c(decode, 1);
            UUID c2 = C0878g.m468c(decode, 17);
            if (c == null || c2 == null) {
                return null;
            }
            return new C0953b(c, c2);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m545a() {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[32]);
        wrap.put(m546a(UUID.randomUUID()));
        wrap.put(m546a(UUID.randomUUID()));
        return wrap.array();
    }

    /* renamed from: a */
    public static byte[] m546a(UUID uuid) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }
}
