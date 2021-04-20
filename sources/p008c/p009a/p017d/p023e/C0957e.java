package p008c.p009a.p017d.p023e;

import kotlin.jvm.internal.Intrinsics;
import org.mobileid.Api;

/* renamed from: c.a.d.e.e */
public final class C0957e extends C0955c {

    /* renamed from: b */
    public final String f1024b;

    /* renamed from: c */
    public final String f1025c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0957e(Api.RequestKeyResult requestKeyResult, String str, String str2) {
        super(requestKeyResult, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(requestKeyResult, "result");
        Intrinsics.checkNotNullParameter(str, "keyPrefix");
        Intrinsics.checkNotNullParameter(str2, "mobileId");
        this.f1024b = str;
        this.f1025c = str2;
    }
}
