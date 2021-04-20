package org.mobileid.time_key.push.worker;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import org.koin.core.Koin;
import org.koin.core.KoinComponent;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p008c.p009a.p024e.p026b.C0962a;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u000b\u001a\u00020\u00068B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, mo51343d2 = {"Lorg/mobileid/time_key/push/worker/OnMessageDeletedWorker;", "Lorg/koin/core/KoinComponent;", "Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker$Result;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lorg/mobileid/time_key/manager/TimeKeyManager;", "timeKeyManager$delegate", "Lkotlin/Lazy;", "getTimeKeyManager", "()Lorg/mobileid/time_key/manager/TimeKeyManager;", "timeKeyManager", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
public final class OnMessageDeletedWorker extends CoroutineWorker implements KoinComponent {

    /* renamed from: a */
    public final Lazy f6424a = LazyKt.lazy(new C5506a(getKoin().getRootScope(), (Qualifier) null, (Function0) null));

    /* renamed from: org.mobileid.time_key.push.worker.OnMessageDeletedWorker$a */
    public static final class C5506a extends Lambda implements Function0<C0962a> {

        /* renamed from: a */
        public final /* synthetic */ Scope f6425a;

        /* renamed from: b */
        public final /* synthetic */ Qualifier f6426b = null;

        /* renamed from: c */
        public final /* synthetic */ Function0 f6427c = null;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5506a(Scope scope, Qualifier qualifier, Function0 function0) {
            super(0);
            this.f6425a = scope;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, c.a.e.b.a] */
        public final C0962a invoke() {
            return this.f6425a.get((KClass<?>) Reflection.getOrCreateKotlinClass(C0962a.class), this.f6426b, (Function0<DefinitionParameters>) this.f6427c);
        }
    }

    @DebugMetadata(mo52052c = "org.mobileid.time_key.push.worker.OnMessageDeletedWorker", mo52053f = "OnMessageDeletedWorker.kt", mo52054i = {0}, mo52055l = {16}, mo52056m = "doWork", mo52057n = {"this"}, mo52058s = {"L$0"})
    /* renamed from: org.mobileid.time_key.push.worker.OnMessageDeletedWorker$b */
    public static final class C5507b extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f6428a;

        /* renamed from: b */
        public int f6429b;

        /* renamed from: c */
        public final /* synthetic */ OnMessageDeletedWorker f6430c;

        /* renamed from: d */
        public Object f6431d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5507b(OnMessageDeletedWorker onMessageDeletedWorker, Continuation continuation) {
            super(continuation);
            this.f6430c = onMessageDeletedWorker;
        }

        public final Object invokeSuspend(Object obj) {
            this.f6428a = obj;
            this.f6429b |= Integer.MIN_VALUE;
            return this.f6430c.doWork(this);
        }
    }

    @DebugMetadata(mo52052c = "org.mobileid.time_key.push.worker.OnMessageDeletedWorker$doWork$2", mo52053f = "OnMessageDeletedWorker.kt", mo52054i = {0, 0}, mo52055l = {18}, mo52056m = "invokeSuspend", mo52057n = {"$this$withContext", "job"}, mo52058s = {"L$0", "L$1"})
    /* renamed from: org.mobileid.time_key.push.worker.OnMessageDeletedWorker$c */
    public static final class C5508c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ListenableWorker.Result>, Object> {

        /* renamed from: a */
        public CoroutineScope f6432a;

        /* renamed from: b */
        public Object f6433b;

        /* renamed from: c */
        public Object f6434c;

        /* renamed from: d */
        public int f6435d;

        /* renamed from: e */
        public final /* synthetic */ OnMessageDeletedWorker f6436e;

        @DebugMetadata(mo52052c = "org.mobileid.time_key.push.worker.OnMessageDeletedWorker$doWork$2$job$1", mo52053f = "OnMessageDeletedWorker.kt", mo52054i = {0}, mo52055l = {17}, mo52056m = "invokeSuspend", mo52057n = {"$this$async"}, mo52058s = {"L$0"})
        /* renamed from: org.mobileid.time_key.push.worker.OnMessageDeletedWorker$c$a */
        public static final class C5509a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public CoroutineScope f6437a;

            /* renamed from: b */
            public Object f6438b;

            /* renamed from: c */
            public int f6439c;

            /* renamed from: d */
            public final /* synthetic */ C5508c f6440d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5509a(C5508c cVar, Continuation continuation) {
                super(2, continuation);
                this.f6440d = cVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                Intrinsics.checkNotNullParameter(continuation, "completion");
                C5509a aVar = new C5509a(this.f6440d, continuation);
                aVar.f6437a = (CoroutineScope) obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C5509a) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f6439c;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f6438b = this.f6437a;
                    this.f6439c = 1;
                    if (((C0962a) this.f6440d.f6436e.f6424a.getValue()).mo13025a(true, (Continuation<? super Unit>) this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 1) {
                    CoroutineScope coroutineScope = (CoroutineScope) this.f6438b;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5508c(OnMessageDeletedWorker onMessageDeletedWorker, Continuation continuation) {
            super(2, continuation);
            this.f6436e = onMessageDeletedWorker;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "completion");
            C5508c cVar = new C5508c(this.f6436e, continuation);
            cVar.f6432a = (CoroutineScope) obj;
            return cVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C5508c) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f6435d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = this.f6432a;
                Deferred async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C5509a(this, (Continuation) null), 3, (Object) null);
                this.f6433b = coroutineScope;
                this.f6434c = async$default;
                this.f6435d = 1;
                if (async$default.await(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                Deferred deferred = (Deferred) this.f6434c;
                CoroutineScope coroutineScope2 = (CoroutineScope) this.f6433b;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return ListenableWorker.Result.success();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnMessageDeletedWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "params");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doWork(kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof org.mobileid.time_key.push.worker.OnMessageDeletedWorker.C5507b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            org.mobileid.time_key.push.worker.OnMessageDeletedWorker$b r0 = (org.mobileid.time_key.push.worker.OnMessageDeletedWorker.C5507b) r0
            int r1 = r0.f6429b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f6429b = r1
            goto L_0x0018
        L_0x0013:
            org.mobileid.time_key.push.worker.OnMessageDeletedWorker$b r0 = new org.mobileid.time_key.push.worker.OnMessageDeletedWorker$b
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f6428a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f6429b
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.f6431d
            org.mobileid.time_key.push.worker.OnMessageDeletedWorker r0 = (org.mobileid.time_key.push.worker.OnMessageDeletedWorker) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x004d
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.CoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.getIO()
            org.mobileid.time_key.push.worker.OnMessageDeletedWorker$c r2 = new org.mobileid.time_key.push.worker.OnMessageDeletedWorker$c
            r4 = 0
            r2.<init>(r5, r4)
            r0.f6431d = r5
            r0.f6429b = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r2, r0)
            if (r6 != r1) goto L_0x004d
            return r1
        L_0x004d:
            java.lang.String r0 = "withContext(Dispatchers.…   Result.success()\n    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mobileid.time_key.push.worker.OnMessageDeletedWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }
}
