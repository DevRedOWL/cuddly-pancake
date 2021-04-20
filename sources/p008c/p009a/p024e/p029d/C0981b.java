package p008c.p009a.p024e.p029d;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c.a.e.d.b */
public final class C0981b implements C0980a {

    /* renamed from: c.a.e.d.b$a */
    public static final class C0982a<TResult> implements OnCompleteListener<InstanceIdResult> {

        /* renamed from: a */
        public final /* synthetic */ Continuation f1113a;

        public C0982a(Continuation continuation) {
            this.f1113a = continuation;
        }

        public final void onComplete(Task<InstanceIdResult> task) {
            String token;
            Intrinsics.checkNotNullParameter(task, "task");
            if (!task.isSuccessful()) {
                this.f1113a.resumeWith(Result.m6940constructorimpl(ResultKt.createFailure(new IllegalStateException("Cannot get Instance Id"))));
                return;
            }
            InstanceIdResult result = task.getResult();
            if (result == null || (token = result.getToken()) == null) {
                this.f1113a.resumeWith(Result.m6940constructorimpl(ResultKt.createFailure(new IllegalStateException("Cannot get Instance Id"))));
            } else {
                this.f1113a.resumeWith(Result.m6940constructorimpl(token));
            }
        }
    }

    /* renamed from: a */
    public Object mo13038a(Continuation<? super String> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        FirebaseInstanceId instance = FirebaseInstanceId.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "FirebaseInstanceId.getInstance()");
        instance.getInstanceId().addOnCompleteListener(new C0982a(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
