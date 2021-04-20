package p008c.p009a.p010a;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.mobileid.access.key.KeysObserver;

/* renamed from: c.a.a.b */
public final class C0836b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public CoroutineScope f757a;

    /* renamed from: b */
    public final /* synthetic */ KeysObserver f758b;

    /* renamed from: c */
    public final /* synthetic */ List f759c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0836b(KeysObserver keysObserver, Continuation continuation, List list) {
        super(2, continuation);
        this.f758b = keysObserver;
        this.f759c = list;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "completion");
        C0836b bVar = new C0836b(this.f758b, continuation, this.f759c);
        bVar.f757a = (CoroutineScope) obj;
        return bVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C0836b) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f758b.getObserver().onChanged(this.f759c);
        return Unit.INSTANCE;
    }
}
