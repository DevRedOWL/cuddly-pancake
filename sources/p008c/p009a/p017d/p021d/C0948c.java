package p008c.p009a.p017d.p021d;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.mobileid.Api;
import p008c.p009a.p017d.p023e.C0952a;
import p008c.p009a.p017d.p023e.C0958f;
import p008c.p009a.p024e.p026b.C0962a;

@DebugMetadata(mo52052c = "org.mobileid.requester.qr_requester.QrRequesterImpl$requestTimeKeyViaMobileQr$1", mo52053f = "QrRequesterImpl.kt", mo52054i = {0}, mo52055l = {46}, mo52056m = "invokeSuspend", mo52057n = {"$this$launch"}, mo52058s = {"L$0"})
/* renamed from: c.a.d.d.c */
public final class C0948c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public CoroutineScope f1006a;

    /* renamed from: b */
    public Object f1007b;

    /* renamed from: c */
    public int f1008c;

    /* renamed from: d */
    public final /* synthetic */ C0949d f1009d;

    /* renamed from: e */
    public final /* synthetic */ String f1010e;

    /* renamed from: f */
    public final /* synthetic */ Continuation f1011f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0948c(C0949d dVar, String str, Continuation continuation, Continuation continuation2) {
        super(2, continuation2);
        this.f1009d = dVar;
        this.f1010e = str;
        this.f1011f = continuation;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "completion");
        C0948c cVar = new C0948c(this.f1009d, this.f1010e, this.f1011f, continuation);
        cVar.f1006a = (CoroutineScope) obj;
        return cVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C0948c) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Continuation continuation;
        Object aVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f1008c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = this.f1006a;
            C0962a aVar2 = this.f1009d.f1013b;
            String str = this.f1010e;
            this.f1007b = coroutineScope;
            this.f1008c = 1;
            obj = aVar2.mo13022a(str, (Continuation<? super Boolean>) this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            CoroutineScope coroutineScope2 = (CoroutineScope) this.f1007b;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception unused) {
                this.f1011f.resumeWith(Result.m6940constructorimpl(new C0952a(Api.RequestKeyResult.UNKNOWN)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Boolean) obj).booleanValue()) {
            continuation = this.f1011f;
            aVar = new C0958f(Api.RequestKeyResult.SUCCESS);
        } else {
            continuation = this.f1011f;
            aVar = new C0952a(Api.RequestKeyResult.REJECTED);
        }
        continuation.resumeWith(Result.m6940constructorimpl(aVar));
        return Unit.INSTANCE;
    }
}
