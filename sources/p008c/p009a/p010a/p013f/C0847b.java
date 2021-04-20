package p008c.p009a.p010a.p013f;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import p008c.p009a.p024e.p026b.C0962a;

/* renamed from: c.a.a.f.b */
public final class C0847b implements C0846a {

    /* renamed from: a */
    public final C0962a f781a;

    public C0847b(C0962a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "timeKeyManager");
        this.f781a = aVar;
    }

    /* renamed from: a */
    public Object mo12927a(boolean z, Continuation<? super Unit> continuation) {
        Object a = this.f781a.mo13025a(z, continuation);
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }
}
