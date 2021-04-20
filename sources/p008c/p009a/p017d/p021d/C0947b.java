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
import org.mobileid.requester.web_service.Response;
import org.mobileid.requester.web_service.simple_key.RequestSimpleKeyBody;
import org.mobileid.requester.web_service.simple_key.SimpleKeyResponse;
import org.mobileid.requester.web_service.simple_key.SimpleKeyWebService;
import p008c.p009a.p017d.p023e.C0952a;
import p008c.p009a.p017d.p023e.C0957e;

@DebugMetadata(mo52052c = "org.mobileid.requester.qr_requester.QrRequesterImpl$requestKeyViaMobileQr$1", mo52053f = "QrRequesterImpl.kt", mo52054i = {0}, mo52055l = {58}, mo52056m = "invokeSuspend", mo52057n = {"$this$launch"}, mo52058s = {"L$0"})
/* renamed from: c.a.d.d.b */
public final class C0947b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public CoroutineScope f999a;

    /* renamed from: b */
    public Object f1000b;

    /* renamed from: c */
    public int f1001c;

    /* renamed from: d */
    public final /* synthetic */ C0949d f1002d;

    /* renamed from: e */
    public final /* synthetic */ String f1003e;

    /* renamed from: f */
    public final /* synthetic */ Continuation f1004f;

    /* renamed from: g */
    public final /* synthetic */ String f1005g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0947b(C0949d dVar, String str, Continuation continuation, String str2, Continuation continuation2) {
        super(2, continuation2);
        this.f1002d = dVar;
        this.f1003e = str;
        this.f1004f = continuation;
        this.f1005g = str2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "completion");
        C0947b bVar = new C0947b(this.f1002d, this.f1003e, this.f1004f, this.f1005g, continuation);
        bVar.f999a = (CoroutineScope) obj;
        return bVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C0947b) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Continuation continuation;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f1001c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = this.f999a;
            SimpleKeyWebService simpleKeyWebService = this.f1002d.f1014c;
            RequestSimpleKeyBody requestSimpleKeyBody = new RequestSimpleKeyBody(this.f1003e);
            this.f1000b = coroutineScope;
            this.f1001c = 1;
            obj = simpleKeyWebService.getKey(requestSimpleKeyBody, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            CoroutineScope coroutineScope2 = (CoroutineScope) this.f1000b;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception unused) {
                this.f1004f.resumeWith(Result.m6940constructorimpl(new C0952a(Api.RequestKeyResult.UNKNOWN)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        SimpleKeyResponse simpleKeyResponse = (SimpleKeyResponse) ((Response) obj).getResult();
        String mobileId = simpleKeyResponse != null ? simpleKeyResponse.getMobileId() : null;
        if (mobileId == null) {
            continuation = this.f1004f;
            obj2 = Result.m6940constructorimpl(new C0952a(Api.RequestKeyResult.REJECTED));
        } else {
            Continuation continuation2 = this.f1004f;
            obj2 = Result.m6940constructorimpl(new C0957e(Api.RequestKeyResult.SUCCESS, this.f1005g, mobileId));
            continuation = continuation2;
        }
        continuation.resumeWith(obj2);
        return Unit.INSTANCE;
    }
}
