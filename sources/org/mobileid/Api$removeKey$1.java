package org.mobileid;

import android.content.Context;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.mobileid.requester.background_requester.RequesterForegroundService;
import p008c.p009a.p010a.C0837c;
import p008c.p009a.p010a.p011d.C0840a;
import p008c.p009a.p017d.p020c.C0943g;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo51343d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo51344k = 3, mo51345mv = {1, 4, 0}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
@DebugMetadata(mo52052c = "org.mobileid.Api$removeKey$1", mo52053f = "Api.kt", mo52054i = {0}, mo52055l = {123}, mo52056m = "invokeSuspend", mo52057n = {"$this$launch"}, mo52058s = {"L$0"})
public final class Api$removeKey$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $keyId;
    public Object L$0;
    public int label;

    /* renamed from: p$ */
    public CoroutineScope f6367p$;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Api$removeKey$1(String str, Context context, Continuation continuation) {
        super(2, continuation);
        this.$keyId = str;
        this.$context = context;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "completion");
        Api$removeKey$1 api$removeKey$1 = new Api$removeKey$1(this.$keyId, this.$context, continuation);
        api$removeKey$1.f6367p$ = (CoroutineScope) obj;
        return api$removeKey$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((Api$removeKey$1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = this.f6367p$;
            C0840a access$getKeyRemover$p = Api.INSTANCE.getKeyRemover();
            String str = this.$keyId;
            this.L$0 = coroutineScope;
            this.label = 1;
            if (access$getKeyRemover$p.mo12923a(str, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C0943g gVar = C0943g.f995b;
        Context context = this.$context;
        gVar.mo13009a(context, C0837c.f761k.mo12907a(context, false), Api.INSTANCE.getRequesterListenersAdapter(this.$context));
        RequesterForegroundService.f6379d.mo60097a(this.$context);
        return Unit.INSTANCE;
    }
}
