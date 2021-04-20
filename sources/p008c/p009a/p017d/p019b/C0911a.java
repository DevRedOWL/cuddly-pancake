package p008c.p009a.p017d.p019b;

import java.util.BitSet;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c.a.d.b.a */
public class C0911a {

    /* renamed from: d */
    public static final C0913b f900d = new C0913b();

    /* renamed from: a */
    public final C0914c f901a;

    /* renamed from: b */
    public int f902b;

    /* renamed from: c */
    public C0912a f903c;

    /* renamed from: c.a.d.b.a$a */
    public enum C0912a {
        UNKNOWN,
        UNIDENTIFIED,
        EMPTY,
        ACCEPTED,
        GRANTED,
        DENIED
    }

    /* renamed from: c.a.d.b.a$b */
    public static final class C0913b {
    }

    /* renamed from: c.a.d.b.a$c */
    public static final class C0914c {

        /* renamed from: a */
        public final BitSet f911a = new BitSet();
    }

    public C0911a(C0914c cVar, int i, C0912a aVar) {
        Intrinsics.checkNotNullParameter(cVar, "features");
        Intrinsics.checkNotNullParameter(aVar, "state");
        this.f901a = cVar;
        this.f902b = i;
        this.f903c = aVar;
    }
}
