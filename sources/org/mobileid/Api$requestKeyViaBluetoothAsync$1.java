package org.mobileid;

import android.content.Context;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p008c.p009a.p017d.p019b.C0933e;
import p008c.p009a.p017d.p023e.C0952a;
import p008c.p009a.p017d.p023e.C0955c;
import p008c.p009a.p017d.p023e.C0957e;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo51343d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo51344k = 3, mo51345mv = {1, 4, 0}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
@DebugMetadata(mo52052c = "org.mobileid.Api$requestKeyViaBluetoothAsync$1", mo52053f = "Api.kt", mo52054i = {0}, mo52055l = {216}, mo52056m = "invokeSuspend", mo52057n = {"$this$launch"}, mo52058s = {"L$0"})
public final class Api$requestKeyViaBluetoothAsync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Function1 $onResult;
    public final /* synthetic */ boolean $vibrate;
    public Object L$0;
    public int label;

    /* renamed from: p$ */
    public CoroutineScope f6368p$;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Api$requestKeyViaBluetoothAsync$1(boolean z, Function1 function1, Context context, Continuation continuation) {
        super(2, continuation);
        this.$vibrate = z;
        this.$onResult = function1;
        this.$context = context;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "completion");
        Api$requestKeyViaBluetoothAsync$1 api$requestKeyViaBluetoothAsync$1 = new Api$requestKeyViaBluetoothAsync$1(this.$vibrate, this.$onResult, this.$context, continuation);
        api$requestKeyViaBluetoothAsync$1.f6368p$ = (CoroutineScope) obj;
        return api$requestKeyViaBluetoothAsync$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((Api$requestKeyViaBluetoothAsync$1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = this.f6368p$;
            C0933e access$getBluetoothRequester$p = Api.INSTANCE.getBluetoothRequester();
            boolean z = this.$vibrate;
            this.L$0 = coroutineScope;
            this.label = 1;
            obj = access$getBluetoothRequester$p.mo13003a(z, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C0955c cVar = (C0955c) obj;
        if (cVar instanceof C0952a) {
            function1 = this.$onResult;
        } else {
            if (cVar instanceof C0957e) {
                C0957e eVar = (C0957e) cVar;
                Api.INSTANCE.addKeyAndApplyToServices(this.$context, eVar.f1024b, eVar.f1025c);
                function1 = this.$onResult;
            }
            return Unit.INSTANCE;
        }
        function1.invoke(cVar.f1023a);
        return Unit.INSTANCE;
    }
}
