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
import p008c.p009a.p014b.C0878g;
import p008c.p009a.p024e.p026b.C0962a;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0001\u0012B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u000b\u001a\u00020\u00068B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, mo51343d2 = {"Lorg/mobileid/time_key/push/worker/RemoveKeyWorker;", "Lorg/koin/core/KoinComponent;", "Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker$Result;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lorg/mobileid/time_key/manager/TimeKeyManager;", "timeKeyManager$delegate", "Lkotlin/Lazy;", "getTimeKeyManager", "()Lorg/mobileid/time_key/manager/TimeKeyManager;", "timeKeyManager", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
public final class RemoveKeyWorker extends CoroutineWorker implements KoinComponent {

    /* renamed from: a */
    public final Lazy f6441a = LazyKt.lazy(new C5510a(getKoin().getRootScope(), (Qualifier) null, (Function0) null));

    /* renamed from: org.mobileid.time_key.push.worker.RemoveKeyWorker$a */
    public static final class C5510a extends Lambda implements Function0<C0962a> {

        /* renamed from: a */
        public final /* synthetic */ Scope f6442a;

        /* renamed from: b */
        public final /* synthetic */ Qualifier f6443b = null;

        /* renamed from: c */
        public final /* synthetic */ Function0 f6444c = null;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5510a(Scope scope, Qualifier qualifier, Function0 function0) {
            super(0);
            this.f6442a = scope;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, c.a.e.b.a] */
        public final C0962a invoke() {
            return this.f6442a.get((KClass<?>) Reflection.getOrCreateKotlinClass(C0962a.class), this.f6443b, (Function0<DefinitionParameters>) this.f6444c);
        }
    }

    @DebugMetadata(mo52052c = "org.mobileid.time_key.push.worker.RemoveKeyWorker", mo52053f = "RemoveKeyWorker.kt", mo52054i = {0}, mo52055l = {16}, mo52056m = "doWork", mo52057n = {"this"}, mo52058s = {"L$0"})
    /* renamed from: org.mobileid.time_key.push.worker.RemoveKeyWorker$b */
    public static final class C5511b extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f6445a;

        /* renamed from: b */
        public int f6446b;

        /* renamed from: c */
        public final /* synthetic */ RemoveKeyWorker f6447c;

        /* renamed from: d */
        public Object f6448d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5511b(RemoveKeyWorker removeKeyWorker, Continuation continuation) {
            super(continuation);
            this.f6447c = removeKeyWorker;
        }

        public final Object invokeSuspend(Object obj) {
            this.f6445a = obj;
            this.f6446b |= Integer.MIN_VALUE;
            return this.f6447c.doWork(this);
        }
    }

    @DebugMetadata(mo52052c = "org.mobileid.time_key.push.worker.RemoveKeyWorker$doWork$2", mo52053f = "RemoveKeyWorker.kt", mo52054i = {0, 0, 0}, mo52055l = {19}, mo52056m = "invokeSuspend", mo52057n = {"$this$withContext", "timeKeyId", "job"}, mo52058s = {"L$0", "L$1", "L$2"})
    /* renamed from: org.mobileid.time_key.push.worker.RemoveKeyWorker$c */
    public static final class C5512c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ListenableWorker.Result>, Object> {

        /* renamed from: a */
        public CoroutineScope f6449a;

        /* renamed from: b */
        public Object f6450b;

        /* renamed from: c */
        public Object f6451c;

        /* renamed from: d */
        public Object f6452d;

        /* renamed from: e */
        public int f6453e;

        /* renamed from: f */
        public final /* synthetic */ RemoveKeyWorker f6454f;

        @DebugMetadata(mo52052c = "org.mobileid.time_key.push.worker.RemoveKeyWorker$doWork$2$job$1", mo52053f = "RemoveKeyWorker.kt", mo52054i = {0}, mo52055l = {18}, mo52056m = "invokeSuspend", mo52057n = {"$this$async"}, mo52058s = {"L$0"})
        /* renamed from: org.mobileid.time_key.push.worker.RemoveKeyWorker$c$a */
        public static final class C5513a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public CoroutineScope f6455a;

            /* renamed from: b */
            public Object f6456b;

            /* renamed from: c */
            public int f6457c;

            /* renamed from: d */
            public final /* synthetic */ C5512c f6458d;

            /* renamed from: e */
            public final /* synthetic */ String f6459e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5513a(C5512c cVar, String str, Continuation continuation) {
                super(2, continuation);
                this.f6458d = cVar;
                this.f6459e = str;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                Intrinsics.checkNotNullParameter(continuation, "completion");
                C5513a aVar = new C5513a(this.f6458d, this.f6459e, continuation);
                aVar.f6455a = (CoroutineScope) obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C5513a) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f6457c;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = this.f6455a;
                    String str = this.f6459e;
                    this.f6456b = coroutineScope;
                    this.f6457c = 1;
                    if (C0878g.m457a((C0962a) this.f6458d.f6454f.f6441a.getValue(), str, false, this, 2, (Object) null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 1) {
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.f6456b;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5512c(RemoveKeyWorker removeKeyWorker, Continuation continuation) {
            super(2, continuation);
            this.f6454f = removeKeyWorker;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "completion");
            C5512c cVar = new C5512c(this.f6454f, continuation);
            cVar.f6449a = (CoroutineScope) obj;
            return cVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C5512c) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f6453e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = this.f6449a;
                String string = this.f6454f.getInputData().getString("TIME_KEY_ID");
                if (string == null) {
                    return ListenableWorker.Result.failure();
                }
                Intrinsics.checkNotNullExpressionValue(string, "inputData.getString(TIME…hContext Result.failure()");
                Deferred async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C5513a(this, string, (Continuation) null), 3, (Object) null);
                this.f6450b = coroutineScope;
                this.f6451c = string;
                this.f6452d = async$default;
                this.f6453e = 1;
                if (async$default.await(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                Deferred deferred = (Deferred) this.f6452d;
                String str = (String) this.f6451c;
                CoroutineScope coroutineScope2 = (CoroutineScope) this.f6450b;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return ListenableWorker.Result.success();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RemoveKeyWorker(Context context, WorkerParameters workerParameters) {
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
            boolean r0 = r6 instanceof org.mobileid.time_key.push.worker.RemoveKeyWorker.C5511b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            org.mobileid.time_key.push.worker.RemoveKeyWorker$b r0 = (org.mobileid.time_key.push.worker.RemoveKeyWorker.C5511b) r0
            int r1 = r0.f6446b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f6446b = r1
            goto L_0x0018
        L_0x0013:
            org.mobileid.time_key.push.worker.RemoveKeyWorker$b r0 = new org.mobileid.time_key.push.worker.RemoveKeyWorker$b
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f6445a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f6446b
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.f6448d
            org.mobileid.time_key.push.worker.RemoveKeyWorker r0 = (org.mobileid.time_key.push.worker.RemoveKeyWorker) r0
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
            org.mobileid.time_key.push.worker.RemoveKeyWorker$c r2 = new org.mobileid.time_key.push.worker.RemoveKeyWorker$c
            r4 = 0
            r2.<init>(r5, r4)
            r0.f6448d = r5
            r0.f6446b = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r2, r0)
            if (r6 != r1) goto L_0x004d
            return r1
        L_0x004d:
            java.lang.String r0 = "withContext(Dispatchers.…   Result.success()\n    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mobileid.time_key.push.worker.RemoveKeyWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }
}
