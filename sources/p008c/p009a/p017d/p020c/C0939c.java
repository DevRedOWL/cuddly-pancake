package p008c.p009a.p017d.p020c;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p008c.p009a.p014b.C0871f;
import p008c.p009a.p014b.C0878g;

/* renamed from: c.a.d.c.c */
public final class C0939c implements C0871f.C0877c {

    /* renamed from: a */
    public final /* synthetic */ Ref.ObjectRef f989a;

    public C0939c(Ref.ObjectRef objectRef) {
        this.f989a = objectRef;
    }

    /* renamed from: a */
    public final void mo12949a(byte[] bArr) {
        Object obj;
        Intrinsics.checkNotNullParameter(bArr, "parsed");
        Ref.ObjectRef objectRef = this.f989a;
        if (C0878g.m467b(bArr)) {
            int a = C0878g.m455a(bArr, 1);
            C0942f fVar = C0942f.f993b;
            obj = C0942f.f992a.mo12971a(C0878g.m463a(a), C0878g.C0879a.f854f);
        } else {
            obj = null;
        }
        objectRef.element = obj;
    }
}
