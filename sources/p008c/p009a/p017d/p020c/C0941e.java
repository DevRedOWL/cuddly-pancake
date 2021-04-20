package p008c.p009a.p017d.p020c;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p008c.p009a.p014b.C0871f;
import p008c.p009a.p014b.C0878g;
import p008c.p009a.p017d.p019b.C0911a;

/* renamed from: c.a.d.c.e */
public final class C0941e implements C0871f.C0877c {

    /* renamed from: a */
    public final /* synthetic */ Ref.ObjectRef f991a;

    public C0941e(Ref.ObjectRef objectRef) {
        this.f991a = objectRef;
    }

    /* renamed from: a */
    public final void mo12949a(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "parsed");
        this.f991a.element = C0878g.m470d(bArr) ? C0911a.C0912a.ACCEPTED : C0878g.m473g(bArr) ? C0911a.C0912a.GRANTED : null;
    }
}
