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
import org.mobileid.time_key.util.TimeKeyParams;
import p008c.p009a.p024e.p027c.C0972a;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo51343d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo51344k = 3, mo51345mv = {1, 4, 0}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
@DebugMetadata(mo52052c = "org.mobileid.Api$enableIfNotTimeKeys$1", mo52053f = "Api.kt", mo52054i = {0}, mo52055l = {361}, mo52056m = "invokeSuspend", mo52057n = {"$this$launch"}, mo52058s = {"L$0"})
public final class Api$enableIfNotTimeKeys$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ TimeKeyParams $timeKeyParams;
    public Object L$0;
    public int label;

    /* renamed from: p$ */
    public CoroutineScope f6366p$;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Api$enableIfNotTimeKeys$1(TimeKeyParams timeKeyParams, Context context, Continuation continuation) {
        super(2, continuation);
        this.$timeKeyParams = timeKeyParams;
        this.$context = context;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "completion");
        Api$enableIfNotTimeKeys$1 api$enableIfNotTimeKeys$1 = new Api$enableIfNotTimeKeys$1(this.$timeKeyParams, this.$context, continuation);
        api$enableIfNotTimeKeys$1.f6366p$ = (CoroutineScope) obj;
        return api$enableIfNotTimeKeys$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((Api$enableIfNotTimeKeys$1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = this.f6366p$;
            C0972a access$getPushManager$p = Api.INSTANCE.getPushManager();
            this.L$0 = coroutineScope;
            this.label = 1;
            if (access$getPushManager$p.mo13034a(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.$timeKeyParams.save$aclib_api2_6826_release(this.$context);
        return Unit.INSTANCE;
    }
}
