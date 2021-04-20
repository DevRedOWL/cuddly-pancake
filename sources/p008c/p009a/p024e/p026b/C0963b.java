package p008c.p009a.p024e.p026b;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.CoroutineScope;
import org.mobileid.access.key.Key;
import org.mobileid.access.key.TimeKey;
import org.mobileid.time_key.key_watcher.KeyWatcherBroadcastReceiver;
import org.mobileid.time_key.util.TimeKeyParams;
import org.mobileid.time_key.web_service.TimeKeyWebService;
import p008c.p009a.p010a.C0837c;
import p008c.p009a.p014b.C0878g;
import p008c.p009a.p024e.p025a.C0959a;
import p008c.p009a.p024e.p025a.C0960b;
import p008c.p009a.p024e.p027c.C0972a;

/* renamed from: c.a.e.b.b */
public final class C0963b implements C0962a {

    /* renamed from: a */
    public final Context f1030a;

    /* renamed from: b */
    public final TimeKeyWebService f1031b;

    /* renamed from: c */
    public final C0972a f1032c;

    @DebugMetadata(mo52052c = "org.mobileid.time_key.manager.TimeKeyManagerImpl", mo52053f = "TimeKeyManagerImpl.kt", mo52054i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, mo52055l = {81}, mo52056m = "activateNotSavedKeysWithStatus", mo52057n = {"this", "keysMap", "status", "savedKeyIds", "notify", "keysWithStatus", "timeKeyWithStatus", "keysToActivate", "$this$forEach$iv", "element$iv", "it"}, mo52058s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$4", "L$5", "L$6", "L$7", "L$9", "L$10"})
    /* renamed from: c.a.e.b.b$a */
    public static final class C0964a extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1033a;

        /* renamed from: b */
        public int f1034b;

        /* renamed from: c */
        public final /* synthetic */ C0963b f1035c;

        /* renamed from: d */
        public Object f1036d;

        /* renamed from: e */
        public Object f1037e;

        /* renamed from: f */
        public Object f1038f;

        /* renamed from: g */
        public Object f1039g;

        /* renamed from: h */
        public Object f1040h;

        /* renamed from: i */
        public Object f1041i;

        /* renamed from: j */
        public Object f1042j;

        /* renamed from: k */
        public Object f1043k;

        /* renamed from: l */
        public Object f1044l;

        /* renamed from: m */
        public Object f1045m;

        /* renamed from: n */
        public Object f1046n;

        /* renamed from: o */
        public boolean f1047o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0964a(C0963b bVar, Continuation continuation) {
            super(continuation);
            this.f1035c = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f1033a = obj;
            this.f1034b |= Integer.MIN_VALUE;
            return this.f1035c.mo13028a((Map<String, ? extends Map<String, String>>) null, (String) null, (List<String>) null, false, this);
        }
    }

    @DebugMetadata(mo52052c = "org.mobileid.time_key.manager.TimeKeyManagerImpl", mo52053f = "TimeKeyManagerImpl.kt", mo52054i = {0, 0, 0, 1, 1, 1, 1, 1}, mo52055l = {111, 114}, mo52056m = "confirmActivation", mo52057n = {"this", "timeKey", "token", "this", "timeKey", "token", "response", "timeKeyParams"}, mo52058s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4"})
    /* renamed from: c.a.e.b.b$b */
    public static final class C0965b extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1048a;

        /* renamed from: b */
        public int f1049b;

        /* renamed from: c */
        public final /* synthetic */ C0963b f1050c;

        /* renamed from: d */
        public Object f1051d;

        /* renamed from: e */
        public Object f1052e;

        /* renamed from: f */
        public Object f1053f;

        /* renamed from: g */
        public Object f1054g;

        /* renamed from: h */
        public Object f1055h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0965b(C0963b bVar, Continuation continuation) {
            super(continuation);
            this.f1050c = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f1048a = obj;
            this.f1049b |= Integer.MIN_VALUE;
            return this.f1050c.mo13033b((TimeKey) null, (Continuation<? super Unit>) this);
        }
    }

    @DebugMetadata(mo52052c = "org.mobileid.time_key.manager.TimeKeyManagerImpl$confirmActivation$2", mo52053f = "TimeKeyManagerImpl.kt", mo52054i = {}, mo52055l = {}, mo52056m = "invokeSuspend", mo52057n = {}, mo52058s = {})
    /* renamed from: c.a.e.b.b$c */
    public static final class C0966c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public CoroutineScope f1056a;

        /* renamed from: b */
        public final /* synthetic */ C0963b f1057b;

        /* renamed from: c */
        public final /* synthetic */ TimeKeyParams f1058c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0966c(C0963b bVar, TimeKeyParams timeKeyParams, Continuation continuation) {
            super(2, continuation);
            this.f1057b = bVar;
            this.f1058c = timeKeyParams;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "completion");
            C0966c cVar = new C0966c(this.f1057b, this.f1058c, continuation);
            cVar.f1056a = (CoroutineScope) obj;
            return cVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C0966c) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C0878g.m459a(this.f1057b.f1030a, this.f1058c.getNotificationChannelId(), this.f1058c.getNotificationTitle(), this.f1058c.getReceivedKeyNotification(), this.f1058c.getIconId());
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo52052c = "org.mobileid.time_key.manager.TimeKeyManagerImpl", mo52053f = "TimeKeyManagerImpl.kt", mo52054i = {0, 0, 0, 1, 1, 1, 1, 1}, mo52055l = {43, 46}, mo52056m = "deactivateKey", mo52057n = {"this", "timeKeyId", "token", "this", "timeKeyId", "token", "response", "timeKeyParams"}, mo52058s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4"})
    /* renamed from: c.a.e.b.b$d */
    public static final class C0967d extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1059a;

        /* renamed from: b */
        public int f1060b;

        /* renamed from: c */
        public final /* synthetic */ C0963b f1061c;

        /* renamed from: d */
        public Object f1062d;

        /* renamed from: e */
        public Object f1063e;

        /* renamed from: f */
        public Object f1064f;

        /* renamed from: g */
        public Object f1065g;

        /* renamed from: h */
        public Object f1066h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0967d(C0963b bVar, Continuation continuation) {
            super(continuation);
            this.f1061c = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f1059a = obj;
            this.f1060b |= Integer.MIN_VALUE;
            return this.f1061c.mo13031b((String) null, (Continuation<? super Unit>) this);
        }
    }

    @DebugMetadata(mo52052c = "org.mobileid.time_key.manager.TimeKeyManagerImpl$deactivateKey$2", mo52053f = "TimeKeyManagerImpl.kt", mo52054i = {}, mo52055l = {}, mo52056m = "invokeSuspend", mo52057n = {}, mo52058s = {})
    /* renamed from: c.a.e.b.b$e */
    public static final class C0968e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public CoroutineScope f1067a;

        /* renamed from: b */
        public final /* synthetic */ C0963b f1068b;

        /* renamed from: c */
        public final /* synthetic */ TimeKeyParams f1069c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0968e(C0963b bVar, TimeKeyParams timeKeyParams, Continuation continuation) {
            super(2, continuation);
            this.f1068b = bVar;
            this.f1069c = timeKeyParams;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "completion");
            C0968e eVar = new C0968e(this.f1068b, this.f1069c, continuation);
            eVar.f1067a = (CoroutineScope) obj;
            return eVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C0968e) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C0878g.m459a(this.f1068b.f1030a, this.f1069c.getNotificationChannelId(), this.f1069c.getNotificationTitle(), this.f1069c.getKeyRemovedNotification(), this.f1069c.getIconId());
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo52052c = "org.mobileid.time_key.manager.TimeKeyManagerImpl", mo52053f = "TimeKeyManagerImpl.kt", mo52054i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, mo52055l = {72}, mo52056m = "removeSavedKeysWithStatus", mo52057n = {"this", "keysMap", "status", "savedKeyIds", "notify", "keysWithStatus", "timeKeyWithStatus", "keysToRemove", "$this$forEach$iv", "element$iv", "it"}, mo52058s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$4", "L$5", "L$6", "L$7", "L$9", "L$10"})
    /* renamed from: c.a.e.b.b$f */
    public static final class C0969f extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1070a;

        /* renamed from: b */
        public int f1071b;

        /* renamed from: c */
        public final /* synthetic */ C0963b f1072c;

        /* renamed from: d */
        public Object f1073d;

        /* renamed from: e */
        public Object f1074e;

        /* renamed from: f */
        public Object f1075f;

        /* renamed from: g */
        public Object f1076g;

        /* renamed from: h */
        public Object f1077h;

        /* renamed from: i */
        public Object f1078i;

        /* renamed from: j */
        public Object f1079j;

        /* renamed from: k */
        public Object f1080k;

        /* renamed from: l */
        public Object f1081l;

        /* renamed from: m */
        public Object f1082m;

        /* renamed from: n */
        public Object f1083n;

        /* renamed from: o */
        public boolean f1084o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0969f(C0963b bVar, Continuation continuation) {
            super(continuation);
            this.f1072c = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f1070a = obj;
            this.f1071b |= Integer.MIN_VALUE;
            return this.f1072c.mo13032b((Map<String, ? extends Map<String, String>>) null, (String) null, (List<String>) null, false, this);
        }
    }

    @DebugMetadata(mo52052c = "org.mobileid.time_key.manager.TimeKeyManagerImpl", mo52053f = "TimeKeyManagerImpl.kt", mo52054i = {0, 0, 1, 1, 1}, mo52055l = {22, 24}, mo52056m = "requestKey", mo52057n = {"this", "timeKeyId", "this", "timeKeyId", "token"}, mo52058s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    /* renamed from: c.a.e.b.b$g */
    public static final class C0970g extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1085a;

        /* renamed from: b */
        public int f1086b;

        /* renamed from: c */
        public final /* synthetic */ C0963b f1087c;

        /* renamed from: d */
        public Object f1088d;

        /* renamed from: e */
        public Object f1089e;

        /* renamed from: f */
        public Object f1090f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0970g(C0963b bVar, Continuation continuation) {
            super(continuation);
            this.f1087c = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f1085a = obj;
            this.f1086b |= Integer.MIN_VALUE;
            return this.f1087c.mo13022a((String) null, (Continuation<? super Boolean>) this);
        }
    }

    @DebugMetadata(mo52052c = "org.mobileid.time_key.manager.TimeKeyManagerImpl", mo52053f = "TimeKeyManagerImpl.kt", mo52054i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3}, mo52055l = {53, 58, 59, 60}, mo52056m = "synchronize", mo52057n = {"this", "notify", "token", "this", "notify", "token", "response", "keysMap", "savedTimeKeyIds", "this", "notify", "token", "response", "keysMap", "savedTimeKeyIds", "this", "notify", "token", "response", "keysMap", "savedTimeKeyIds"}, mo52058s = {"L$0", "Z$0", "L$1", "L$0", "Z$0", "L$1", "L$2", "L$3", "L$4", "L$0", "Z$0", "L$1", "L$2", "L$3", "L$4", "L$0", "Z$0", "L$1", "L$2", "L$3", "L$4"})
    /* renamed from: c.a.e.b.b$h */
    public static final class C0971h extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1091a;

        /* renamed from: b */
        public int f1092b;

        /* renamed from: c */
        public final /* synthetic */ C0963b f1093c;

        /* renamed from: d */
        public Object f1094d;

        /* renamed from: e */
        public Object f1095e;

        /* renamed from: f */
        public Object f1096f;

        /* renamed from: g */
        public Object f1097g;

        /* renamed from: h */
        public Object f1098h;

        /* renamed from: i */
        public boolean f1099i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0971h(C0963b bVar, Continuation continuation) {
            super(continuation);
            this.f1093c = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f1091a = obj;
            this.f1092b |= Integer.MIN_VALUE;
            return this.f1093c.mo13025a(false, (Continuation<? super Unit>) this);
        }
    }

    public C0963b(Context context, TimeKeyWebService timeKeyWebService, C0972a aVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(timeKeyWebService, "webService");
        Intrinsics.checkNotNullParameter(aVar, "pushManager");
        this.f1030a = context;
        this.f1031b = timeKeyWebService;
        this.f1032c = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo13022a(java.lang.String r18, kotlin.coroutines.Continuation<? super java.lang.Boolean> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof p008c.p009a.p024e.p026b.C0963b.C0970g
            if (r2 == 0) goto L_0x0017
            r2 = r1
            c.a.e.b.b$g r2 = (p008c.p009a.p024e.p026b.C0963b.C0970g) r2
            int r3 = r2.f1086b
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f1086b = r3
            goto L_0x001c
        L_0x0017:
            c.a.e.b.b$g r2 = new c.a.e.b.b$g
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f1085a
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f1086b
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x0051
            if (r4 == r7) goto L_0x0045
            if (r4 != r6) goto L_0x003d
            java.lang.Object r3 = r2.f1090f
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r2.f1089e
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.f1088d
            c.a.e.b.b r2 = (p008c.p009a.p024e.p026b.C0963b) r2
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x00a1
        L_0x003d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0045:
            java.lang.Object r4 = r2.f1089e
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r8 = r2.f1088d
            c.a.e.b.b r8 = (p008c.p009a.p024e.p026b.C0963b) r8
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0066
        L_0x0051:
            kotlin.ResultKt.throwOnFailure(r1)
            c.a.e.c.a r1 = r0.f1032c
            r2.f1088d = r0
            r4 = r18
            r2.f1089e = r4
            r2.f1086b = r7
            java.lang.Object r1 = r1.mo13034a(r2)
            if (r1 != r3) goto L_0x0065
            return r3
        L_0x0065:
            r8 = r0
        L_0x0066:
            c.a.e.c.a r1 = r8.f1032c
            java.lang.String r1 = r1.mo13035a()
            if (r1 == 0) goto L_0x00b7
            org.mobileid.time_key.web_service.TimeKeyWebService r15 = r8.f1031b
            org.mobileid.time_key.web_service.ActionOnKeyBody r14 = new org.mobileid.time_key.web_service.ActionOnKeyBody
            java.util.Locale r9 = java.util.Locale.getDefault()
            java.lang.String r10 = "Locale.getDefault()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)
            if (r4 == 0) goto L_0x00af
            java.lang.String r10 = r4.toUpperCase(r9)
            java.lang.String r9 = "(this as java.lang.String).toUpperCase(locale)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r9)
            r12 = 0
            r13 = 4
            r16 = 0
            r9 = r14
            r11 = r1
            r7 = r14
            r14 = r16
            r9.<init>(r10, r11, r12, r13, r14)
            r2.f1088d = r8
            r2.f1089e = r4
            r2.f1090f = r1
            r2.f1086b = r6
            java.lang.Object r1 = r15.activateKey(r7, r2)
            if (r1 != r3) goto L_0x00a1
            return r3
        L_0x00a1:
            org.mobileid.requester.web_service.Response r1 = (org.mobileid.requester.web_service.Response) r1
            java.lang.Object r1 = r1.getResult()
            if (r1 == 0) goto L_0x00aa
            r5 = 1
        L_0x00aa:
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            return r1
        L_0x00af:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r1.<init>(r2)
            throw r1
        L_0x00b7:
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p008c.p009a.p024e.p026b.C0963b.mo13022a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo13028a(java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, java.lang.String>> r11, java.lang.String r12, java.util.List<java.lang.String> r13, boolean r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof p008c.p009a.p024e.p026b.C0963b.C0964a
            if (r0 == 0) goto L_0x0013
            r0 = r15
            c.a.e.b.b$a r0 = (p008c.p009a.p024e.p026b.C0963b.C0964a) r0
            int r1 = r0.f1034b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f1034b = r1
            goto L_0x0018
        L_0x0013:
            c.a.e.b.b$a r0 = new c.a.e.b.b$a
            r0.<init>(r10, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f1033a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1034b
            r3 = 1
            if (r2 == 0) goto L_0x005c
            if (r2 != r3) goto L_0x0054
            java.lang.Object r11 = r0.f1046n
            org.mobileid.access.key.TimeKey r11 = (org.mobileid.access.key.TimeKey) r11
            java.lang.Object r11 = r0.f1044l
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r12 = r0.f1043k
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.lang.Object r13 = r0.f1042j
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r14 = r0.f1041i
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r2 = r0.f1040h
            java.util.Map r2 = (java.util.Map) r2
            boolean r4 = r0.f1047o
            java.lang.Object r5 = r0.f1039g
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r0.f1038f
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.f1037e
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r8 = r0.f1036d
            c.a.e.b.b r8 = (p008c.p009a.p024e.p026b.C0963b) r8
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x00e2
        L_0x0054:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x005c:
            kotlin.ResultKt.throwOnFailure(r15)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Set r15 = r11.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L_0x006c:
            boolean r4 = r15.hasNext()
            if (r4 == 0) goto L_0x00a1
            java.lang.Object r4 = r15.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getValue()
            java.util.Map r5 = (java.util.Map) r5
            java.lang.String r6 = "status"
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r12)
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x006c
            java.lang.Object r5 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            r2.put(r5, r4)
            goto L_0x006c
        L_0x00a1:
            java.util.List r15 = r10.mo13029a((java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, java.lang.String>>) r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = r15
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x00b1:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00d5
            java.lang.Object r6 = r5.next()
            r7 = r6
            org.mobileid.access.key.TimeKey r7 = (org.mobileid.access.key.TimeKey) r7
            java.lang.String r7 = r7.getId()
            boolean r7 = r13.contains(r7)
            r7 = r7 ^ r3
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r7)
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x00b1
            r4.add(r6)
            goto L_0x00b1
        L_0x00d5:
            java.util.Iterator r5 = r4.iterator()
            r8 = r10
            r7 = r11
            r6 = r12
            r12 = r4
            r11 = r5
            r5 = r13
            r13 = r12
            r4 = r14
            r14 = r15
        L_0x00e2:
            boolean r15 = r11.hasNext()
            if (r15 == 0) goto L_0x0110
            java.lang.Object r15 = r11.next()
            r9 = r15
            org.mobileid.access.key.TimeKey r9 = (org.mobileid.access.key.TimeKey) r9
            r0.f1036d = r8
            r0.f1037e = r7
            r0.f1038f = r6
            r0.f1039g = r5
            r0.f1047o = r4
            r0.f1040h = r2
            r0.f1041i = r14
            r0.f1042j = r13
            r0.f1043k = r12
            r0.f1044l = r11
            r0.f1045m = r15
            r0.f1046n = r9
            r0.f1034b = r3
            java.lang.Object r15 = r8.mo13024a((org.mobileid.access.key.TimeKey) r9, (kotlin.coroutines.Continuation<? super kotlin.Unit>) r0)
            if (r15 != r1) goto L_0x00e2
            return r1
        L_0x0110:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p008c.p009a.p024e.p026b.C0963b.mo13028a(java.util.Map, java.lang.String, java.util.List, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: a */
    public final List<TimeKey> mo13029a(Map<String, ? extends Map<String, String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            Map map2 = (Map) next.getValue();
            Object obj = map2.get("encrypted_mobile_id");
            if (obj != null) {
                String str = (String) obj;
                Object obj2 = map2.get("fromDate");
                if (obj2 != null) {
                    long roundToLong = MathKt.roundToLong(((Double) obj2).doubleValue());
                    Object obj3 = map2.get("tillDate");
                    if (obj3 != null) {
                        arrayList.add(new TimeKey((String) next.getKey(), str, TimeKey.DEFAULT_NAME, roundToLong, MathKt.roundToLong(((Double) obj3).doubleValue()), 0, 32, (DefaultConstructorMarker) null));
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Double");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Double");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo13027a(String str) {
        Intrinsics.checkNotNullParameter(str, "timeKeyId");
        mo13030a(str, true);
        TimeKeyParams a = TimeKeyParams.Companion.mo60138a(this.f1030a);
        C0878g.m459a(this.f1030a, a.getNotificationChannelId(), a.getNotificationTitle(), a.getEndNotification(), a.getIconId());
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo13031b(java.lang.String r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof p008c.p009a.p024e.p026b.C0963b.C0967d
            if (r0 == 0) goto L_0x0013
            r0 = r15
            c.a.e.b.b$d r0 = (p008c.p009a.p024e.p026b.C0963b.C0967d) r0
            int r1 = r0.f1060b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f1060b = r1
            goto L_0x0018
        L_0x0013:
            c.a.e.b.b$d r0 = new c.a.e.b.b$d
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f1059a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1060b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0059
            if (r2 == r4) goto L_0x0049
            if (r2 != r3) goto L_0x0041
            java.lang.Object r14 = r0.f1066h
            org.mobileid.time_key.util.TimeKeyParams r14 = (org.mobileid.time_key.util.TimeKeyParams) r14
            java.lang.Object r14 = r0.f1065g
            org.mobileid.requester.web_service.Response r14 = (org.mobileid.requester.web_service.Response) r14
            java.lang.Object r14 = r0.f1064f
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r14 = r0.f1063e
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r14 = r0.f1062d
            c.a.e.b.b r14 = (p008c.p009a.p024e.p026b.C0963b) r14
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x00c0
        L_0x0041:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0049:
            java.lang.Object r14 = r0.f1064f
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r2 = r0.f1063e
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r0.f1062d
            c.a.e.b.b r5 = (p008c.p009a.p024e.p026b.C0963b) r5
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0085
        L_0x0059:
            kotlin.ResultKt.throwOnFailure(r15)
            c.a.e.c.a r15 = r13.f1032c
            java.lang.String r15 = r15.mo13035a()
            if (r15 == 0) goto L_0x00c3
            org.mobileid.time_key.web_service.TimeKeyWebService r2 = r13.f1031b
            org.mobileid.time_key.web_service.ActionOnKeyBody r11 = new org.mobileid.time_key.web_service.ActionOnKeyBody
            r8 = 0
            r9 = 4
            r10 = 0
            r5 = r11
            r6 = r14
            r7 = r15
            r5.<init>(r6, r7, r8, r9, r10)
            r0.f1062d = r13
            r0.f1063e = r14
            r0.f1064f = r15
            r0.f1060b = r4
            java.lang.Object r2 = r2.deactivateKey(r11, r0)
            if (r2 != r1) goto L_0x0080
            return r1
        L_0x0080:
            r5 = r13
            r12 = r2
            r2 = r14
            r14 = r15
            r15 = r12
        L_0x0085:
            org.mobileid.requester.web_service.Response r15 = (org.mobileid.requester.web_service.Response) r15
            java.lang.Object r6 = r15.getResult()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            r4 = r4 ^ r6
            if (r4 == 0) goto L_0x009b
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        L_0x009b:
            org.mobileid.time_key.util.TimeKeyParams$a r4 = org.mobileid.time_key.util.TimeKeyParams.Companion
            android.content.Context r6 = r5.f1030a
            org.mobileid.time_key.util.TimeKeyParams r4 = r4.mo60138a(r6)
            kotlinx.coroutines.MainCoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.getMain()
            c.a.e.b.b$e r7 = new c.a.e.b.b$e
            r8 = 0
            r7.<init>(r5, r4, r8)
            r0.f1062d = r5
            r0.f1063e = r2
            r0.f1064f = r14
            r0.f1065g = r15
            r0.f1066h = r4
            r0.f1060b = r3
            java.lang.Object r14 = kotlinx.coroutines.BuildersKt.withContext(r6, r7, r0)
            if (r14 != r1) goto L_0x00c0
            return r1
        L_0x00c0:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        L_0x00c3:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p008c.p009a.p024e.p026b.C0963b.mo13031b(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo13032b(java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, java.lang.String>> r17, java.lang.String r18, java.util.List<java.lang.String> r19, boolean r20, kotlin.coroutines.Continuation<? super kotlin.Unit> r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r21
            boolean r2 = r1 instanceof p008c.p009a.p024e.p026b.C0963b.C0969f
            if (r2 == 0) goto L_0x0017
            r2 = r1
            c.a.e.b.b$f r2 = (p008c.p009a.p024e.p026b.C0963b.C0969f) r2
            int r3 = r2.f1071b
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f1071b = r3
            goto L_0x001c
        L_0x0017:
            c.a.e.b.b$f r2 = new c.a.e.b.b$f
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f1070a
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f1071b
            r5 = 1
            if (r4 == 0) goto L_0x0060
            if (r4 != r5) goto L_0x0058
            java.lang.Object r4 = r2.f1083n
            org.mobileid.access.key.TimeKey r4 = (org.mobileid.access.key.TimeKey) r4
            java.lang.Object r4 = r2.f1081l
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r6 = r2.f1080k
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.Object r7 = r2.f1079j
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r2.f1078i
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r2.f1077h
            java.util.Map r9 = (java.util.Map) r9
            boolean r10 = r2.f1084o
            java.lang.Object r11 = r2.f1076g
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r2.f1075f
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r2.f1074e
            java.util.Map r13 = (java.util.Map) r13
            java.lang.Object r14 = r2.f1073d
            c.a.e.b.b r14 = (p008c.p009a.p024e.p026b.C0963b) r14
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x00eb
        L_0x0058:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0060:
            kotlin.ResultKt.throwOnFailure(r1)
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            java.util.Set r1 = r17.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0070:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00a7
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r6 = r4.getValue()
            java.util.Map r6 = (java.util.Map) r6
            java.lang.String r7 = "status"
            java.lang.Object r6 = r6.get(r7)
            java.lang.String r6 = (java.lang.String) r6
            r7 = r18
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0070
            java.lang.Object r6 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            r9.put(r6, r4)
            goto L_0x0070
        L_0x00a7:
            r7 = r18
            java.util.List r8 = r0.mo13029a((java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, java.lang.String>>) r9)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r1 = r8
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x00b9:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00de
            java.lang.Object r4 = r1.next()
            r10 = r4
            org.mobileid.access.key.TimeKey r10 = (org.mobileid.access.key.TimeKey) r10
            java.lang.String r10 = r10.getId()
            r11 = r19
            boolean r10 = r11.contains(r10)
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r10)
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00b9
            r6.add(r4)
            goto L_0x00b9
        L_0x00de:
            r11 = r19
            java.util.Iterator r4 = r6.iterator()
            r13 = r17
            r10 = r20
            r14 = r0
            r12 = r7
            r7 = r6
        L_0x00eb:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0120
            java.lang.Object r1 = r4.next()
            r15 = r1
            org.mobileid.access.key.TimeKey r15 = (org.mobileid.access.key.TimeKey) r15
            java.lang.String r5 = r15.getId()
            r2.f1073d = r14
            r2.f1074e = r13
            r2.f1075f = r12
            r2.f1076g = r11
            r2.f1084o = r10
            r2.f1077h = r9
            r2.f1078i = r8
            r2.f1079j = r7
            r2.f1080k = r6
            r2.f1081l = r4
            r2.f1082m = r1
            r2.f1083n = r15
            r1 = 1
            r2.f1071b = r1
            java.lang.Object r5 = r14.mo13023a(r5, r10, r2)
            if (r5 != r3) goto L_0x011e
            return r3
        L_0x011e:
            r5 = 1
            goto L_0x00eb
        L_0x0120:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p008c.p009a.p024e.p026b.C0963b.mo13032b(java.util.Map, java.lang.String, java.util.List, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo13033b(org.mobileid.access.key.TimeKey r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof p008c.p009a.p024e.p026b.C0963b.C0965b
            if (r0 == 0) goto L_0x0013
            r0 = r15
            c.a.e.b.b$b r0 = (p008c.p009a.p024e.p026b.C0963b.C0965b) r0
            int r1 = r0.f1049b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f1049b = r1
            goto L_0x0018
        L_0x0013:
            c.a.e.b.b$b r0 = new c.a.e.b.b$b
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f1048a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1049b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0059
            if (r2 == r4) goto L_0x0049
            if (r2 != r3) goto L_0x0041
            java.lang.Object r14 = r0.f1055h
            org.mobileid.time_key.util.TimeKeyParams r14 = (org.mobileid.time_key.util.TimeKeyParams) r14
            java.lang.Object r14 = r0.f1054g
            org.mobileid.requester.web_service.Response r14 = (org.mobileid.requester.web_service.Response) r14
            java.lang.Object r14 = r0.f1053f
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r14 = r0.f1052e
            org.mobileid.access.key.TimeKey r14 = (org.mobileid.access.key.TimeKey) r14
            java.lang.Object r14 = r0.f1051d
            c.a.e.b.b r14 = (p008c.p009a.p024e.p026b.C0963b) r14
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x00c3
        L_0x0041:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0049:
            java.lang.Object r14 = r0.f1053f
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r2 = r0.f1052e
            org.mobileid.access.key.TimeKey r2 = (org.mobileid.access.key.TimeKey) r2
            java.lang.Object r5 = r0.f1051d
            c.a.e.b.b r5 = (p008c.p009a.p024e.p026b.C0963b) r5
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0088
        L_0x0059:
            kotlin.ResultKt.throwOnFailure(r15)
            c.a.e.c.a r15 = r13.f1032c
            java.lang.String r15 = r15.mo13035a()
            if (r15 == 0) goto L_0x00c6
            org.mobileid.time_key.web_service.TimeKeyWebService r2 = r13.f1031b
            org.mobileid.time_key.web_service.ActionOnKeyBody r11 = new org.mobileid.time_key.web_service.ActionOnKeyBody
            java.lang.String r6 = r14.getId()
            r8 = 0
            r9 = 4
            r10 = 0
            r5 = r11
            r7 = r15
            r5.<init>(r6, r7, r8, r9, r10)
            r0.f1051d = r13
            r0.f1052e = r14
            r0.f1053f = r15
            r0.f1049b = r4
            java.lang.Object r2 = r2.confirmActivation(r11, r0)
            if (r2 != r1) goto L_0x0083
            return r1
        L_0x0083:
            r5 = r13
            r12 = r2
            r2 = r14
            r14 = r15
            r15 = r12
        L_0x0088:
            org.mobileid.requester.web_service.Response r15 = (org.mobileid.requester.web_service.Response) r15
            java.lang.Object r6 = r15.getResult()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            r4 = r4 ^ r6
            if (r4 == 0) goto L_0x009e
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        L_0x009e:
            org.mobileid.time_key.util.TimeKeyParams$a r4 = org.mobileid.time_key.util.TimeKeyParams.Companion
            android.content.Context r6 = r5.f1030a
            org.mobileid.time_key.util.TimeKeyParams r4 = r4.mo60138a(r6)
            kotlinx.coroutines.MainCoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.getMain()
            c.a.e.b.b$c r7 = new c.a.e.b.b$c
            r8 = 0
            r7.<init>(r5, r4, r8)
            r0.f1051d = r5
            r0.f1052e = r2
            r0.f1053f = r14
            r0.f1054g = r15
            r0.f1055h = r4
            r0.f1049b = r3
            java.lang.Object r14 = kotlinx.coroutines.BuildersKt.withContext(r6, r7, r0)
            if (r14 != r1) goto L_0x00c3
            return r1
        L_0x00c3:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        L_0x00c6:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p008c.p009a.p024e.p026b.C0963b.mo13033b(org.mobileid.access.key.TimeKey, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: a */
    public Object mo13024a(TimeKey timeKey, Continuation<? super Unit> continuation) {
        C0837c.f761k.mo12913a(this.f1030a, (Key) timeKey);
        C0959a aVar = new C0959a(this.f1030a);
        C0960b bVar = aVar.f1026a;
        String id = timeKey.getId();
        if (bVar != null) {
            Intrinsics.checkNotNullParameter(id, "timeKeyId");
            SharedPreferences sharedPreferences = bVar.f1029a.getSharedPreferences("FREE_WATCHER_ID_STORAGE", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "keyWatcherIdStorage");
            int i = sharedPreferences.getInt("FREE_KEY_WATCHER_ID", 0);
            sharedPreferences.edit().putInt("FREE_KEY_WATCHER_ID", i + 1).apply();
            int i2 = sharedPreferences.getInt("FREE_KEY_WATCHER_ID", 0);
            sharedPreferences.edit().putInt("FREE_KEY_WATCHER_ID", i2 + 1).apply();
            SharedPreferences sharedPreferences2 = bVar.f1029a.getSharedPreferences("KEY_START_STORAGE", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "context.keyStartStorage()");
            sharedPreferences2.edit().putInt(id, i).apply();
            SharedPreferences sharedPreferences3 = bVar.f1029a.getSharedPreferences("KEY_END_STORAGE", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences3, "context.keyEndStorage()");
            sharedPreferences3.edit().putInt(id, i2).apply();
            aVar.mo13021a(timeKey, new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
            Object b = mo13033b(timeKey, continuation);
            return b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b : Unit.INSTANCE;
        }
        throw null;
    }

    /* renamed from: a */
    public void mo13026a() {
        C0837c.C0838a aVar = C0837c.f761k;
        Context context = this.f1030a;
        Intrinsics.checkNotNullParameter(context, "context");
        C0837c.C0838a.m368a(aVar, context, (List) null, 2);
        TimeKeyParams a = TimeKeyParams.Companion.mo60138a(this.f1030a);
        C0878g.m459a(this.f1030a, a.getNotificationChannelId(), a.getNotificationTitle(), a.getStartNotification(), a.getIconId());
    }

    /* renamed from: a */
    public Object mo13023a(String str, boolean z, Continuation<? super Unit> continuation) {
        C0837c.C0838a aVar = C0837c.f761k;
        Context context = this.f1030a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "keyId");
        if (!(aVar.mo12909a(context, str) != null)) {
            return Unit.INSTANCE;
        }
        mo13030a(str, z);
        Object b = mo13031b(str, continuation);
        return b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b : Unit.INSTANCE;
    }

    /* renamed from: a */
    public final void mo13030a(String str, boolean z) {
        C0837c.f761k.mo12912a(this.f1030a, str, z);
        Context context = this.f1030a;
        Intrinsics.checkNotNullParameter(context, "context");
        C0960b bVar = new C0960b(context);
        Intrinsics.checkNotNullParameter(str, "timeKeyId");
        AlarmManager a = C0878g.m456a(context);
        if (a != null) {
            Intent putExtra = new Intent(context, KeyWatcherBroadcastReceiver.class).putExtra("ACTION", "CANCEL");
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(context, KeyWatch….putExtra(ACTION, CANCEL)");
            Intrinsics.checkNotNullParameter(str, "timeKeyId");
            SharedPreferences sharedPreferences = bVar.f1029a.getSharedPreferences("KEY_START_STORAGE", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.keyStartStorage()");
            int i = sharedPreferences.getInt(str, -1);
            sharedPreferences.edit().remove(str).apply();
            SharedPreferences sharedPreferences2 = bVar.f1029a.getSharedPreferences("KEY_END_STORAGE", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "context.keyEndStorage()");
            int i2 = sharedPreferences2.getInt(str, -1);
            sharedPreferences2.edit().remove(str).apply();
            Pair pair = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
            int intValue = ((Number) pair.component1()).intValue();
            int intValue2 = ((Number) pair.component2()).intValue();
            PendingIntent broadcast = PendingIntent.getBroadcast(context, intValue, putExtra, 268435456);
            if (Build.VERSION.SDK_INT >= 24) {
                a.setExactAndAllowWhileIdle(0, 0, broadcast);
            } else {
                a.setExact(0, 0, broadcast);
            }
            PendingIntent broadcast2 = PendingIntent.getBroadcast(context, intValue2, putExtra, 268435456);
            if (Build.VERSION.SDK_INT >= 24) {
                a.setExactAndAllowWhileIdle(0, 0, broadcast2);
            } else {
                a.setExact(0, 0, broadcast2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01a8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01c4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo13025a(boolean r18, kotlin.coroutines.Continuation<? super kotlin.Unit> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof p008c.p009a.p024e.p026b.C0963b.C0971h
            if (r2 == 0) goto L_0x0017
            r2 = r1
            c.a.e.b.b$h r2 = (p008c.p009a.p024e.p026b.C0963b.C0971h) r2
            int r3 = r2.f1092b
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f1092b = r3
            goto L_0x001c
        L_0x0017:
            c.a.e.b.b$h r2 = new c.a.e.b.b$h
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f1091a
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r2.f1092b
            r10 = 4
            r11 = 3
            r4 = 1
            r5 = 2
            if (r3 == 0) goto L_0x00a4
            if (r3 == r4) goto L_0x0093
            if (r3 == r5) goto L_0x0072
            if (r3 == r11) goto L_0x0053
            if (r3 != r10) goto L_0x004b
            java.lang.Object r3 = r2.f1098h
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r2.f1097g
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r3 = r2.f1096f
            org.mobileid.requester.web_service.Response r3 = (org.mobileid.requester.web_service.Response) r3
            java.lang.Object r3 = r2.f1095e
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.f1094d
            c.a.e.b.b r2 = (p008c.p009a.p024e.p026b.C0963b) r2
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x01c5
        L_0x004b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0053:
            java.lang.Object r3 = r2.f1098h
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r2.f1097g
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r2.f1096f
            org.mobileid.requester.web_service.Response r5 = (org.mobileid.requester.web_service.Response) r5
            java.lang.Object r6 = r2.f1095e
            java.lang.String r6 = (java.lang.String) r6
            boolean r7 = r2.f1099i
            java.lang.Object r8 = r2.f1094d
            c.a.e.b.b r8 = (p008c.p009a.p024e.p026b.C0963b) r8
            kotlin.ResultKt.throwOnFailure(r1)
            r13 = r5
            r14 = r6
            r6 = r3
            r3 = r8
            goto L_0x01ad
        L_0x0072:
            java.lang.Object r3 = r2.f1098h
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r2.f1097g
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r2.f1096f
            org.mobileid.requester.web_service.Response r5 = (org.mobileid.requester.web_service.Response) r5
            java.lang.Object r6 = r2.f1095e
            java.lang.String r6 = (java.lang.String) r6
            boolean r7 = r2.f1099i
            java.lang.Object r8 = r2.f1094d
            c.a.e.b.b r8 = (p008c.p009a.p024e.p026b.C0963b) r8
            kotlin.ResultKt.throwOnFailure(r1)
            r1 = r3
            r15 = r4
            r13 = r5
            r14 = r6
            r12 = r8
            r8 = r7
            goto L_0x018c
        L_0x0093:
            java.lang.Object r3 = r2.f1095e
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = r2.f1099i
            java.lang.Object r6 = r2.f1094d
            c.a.e.b.b r6 = (p008c.p009a.p024e.p026b.C0963b) r6
            kotlin.ResultKt.throwOnFailure(r1)
            r13 = r3
            r14 = r4
            r12 = r6
            goto L_0x00c5
        L_0x00a4:
            kotlin.ResultKt.throwOnFailure(r1)
            c.a.e.c.a r1 = r0.f1032c
            java.lang.String r3 = r1.mo13035a()
            if (r3 == 0) goto L_0x01cc
            org.mobileid.time_key.web_service.TimeKeyWebService r1 = r0.f1031b
            r2.f1094d = r0
            r6 = r18
            r2.f1099i = r6
            r2.f1095e = r3
            r2.f1092b = r4
            java.lang.Object r1 = r1.synchronizeKeys(r3, r2)
            if (r1 != r9) goto L_0x00c2
            return r9
        L_0x00c2:
            r12 = r0
            r13 = r3
            r14 = r6
        L_0x00c5:
            org.mobileid.requester.web_service.Response r1 = (org.mobileid.requester.web_service.Response) r1
            org.mobileid.requester.web_service.Error r3 = r1.getError()
            if (r3 == 0) goto L_0x00d0
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L_0x00d0:
            java.lang.Object r3 = r1.getResult()
            java.util.Map r3 = (java.util.Map) r3
            r4 = 0
            if (r12 == 0) goto L_0x01cb
            if (r3 == 0) goto L_0x010e
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x00e8:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x010f
            java.lang.Object r7 = r3.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            org.mobileid.access.key.TimeKey$Companion r8 = org.mobileid.access.key.TimeKey.Companion
            java.lang.Object r15 = r7.getKey()
            java.lang.String r15 = (java.lang.String) r15
            boolean r8 = r8.isTimeKeyPrefix(r15)
            if (r8 == 0) goto L_0x00e8
            java.lang.Object r8 = r7.getKey()
            java.lang.Object r7 = r7.getValue()
            r6.put(r8, r7)
            goto L_0x00e8
        L_0x010e:
            r6 = r4
        L_0x010f:
            boolean r3 = r6 instanceof java.util.Map
            if (r3 != 0) goto L_0x0115
            r15 = r4
            goto L_0x0116
        L_0x0115:
            r15 = r6
        L_0x0116:
            if (r15 == 0) goto L_0x01c8
            c.a.a.c$a r3 = p008c.p009a.p010a.C0837c.f761k
            android.content.Context r6 = r12.f1030a
            java.util.List r3 = p008c.p009a.p010a.C0837c.C0838a.m367a((p008c.p009a.p010a.C0837c.C0838a) r3, (android.content.Context) r6, (org.mobileid.access.key_sort.Sort) r4, (int) r5)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0129:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0146
            java.lang.Object r6 = r3.next()
            r7 = r6
            org.mobileid.access.key.Key r7 = (org.mobileid.access.key.Key) r7
            org.mobileid.access.key.TimeKey$Companion r8 = org.mobileid.access.key.TimeKey.Companion
            java.lang.String r7 = r7.getName()
            boolean r7 = r8.isStorageTimeKeyId(r7)
            if (r7 == 0) goto L_0x0129
            r4.add(r6)
            goto L_0x0129
        L_0x0146:
            java.util.ArrayList r8 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r4, r3)
            r8.<init>(r3)
            java.util.Iterator r3 = r4.iterator()
        L_0x0155:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0169
            java.lang.Object r4 = r3.next()
            org.mobileid.access.key.Key r4 = (org.mobileid.access.key.Key) r4
            java.lang.String r4 = r4.getId()
            r8.add(r4)
            goto L_0x0155
        L_0x0169:
            r2.f1094d = r12
            r2.f1099i = r14
            r2.f1095e = r13
            r2.f1096f = r1
            r2.f1097g = r15
            r2.f1098h = r8
            r2.f1092b = r5
            java.lang.String r5 = "DEACTIVATED"
            r3 = r12
            r4 = r15
            r6 = r8
            r7 = r14
            r16 = r8
            r8 = r2
            java.lang.Object r3 = r3.mo13032b(r4, r5, r6, r7, r8)
            if (r3 != r9) goto L_0x0187
            return r9
        L_0x0187:
            r8 = r14
            r14 = r13
            r13 = r1
            r1 = r16
        L_0x018c:
            r2.f1094d = r12
            r2.f1099i = r8
            r2.f1095e = r14
            r2.f1096f = r13
            r2.f1097g = r15
            r2.f1098h = r1
            r2.f1092b = r11
            java.lang.String r5 = "FROZEN"
            r3 = r12
            r4 = r15
            r6 = r1
            r7 = r8
            r11 = r8
            r8 = r2
            java.lang.Object r3 = r3.mo13032b(r4, r5, r6, r7, r8)
            if (r3 != r9) goto L_0x01a9
            return r9
        L_0x01a9:
            r6 = r1
            r7 = r11
            r3 = r12
            r4 = r15
        L_0x01ad:
            r2.f1094d = r3
            r2.f1099i = r7
            r2.f1095e = r14
            r2.f1096f = r13
            r2.f1097g = r4
            r2.f1098h = r6
            r2.f1092b = r10
            java.lang.String r5 = "FROZEN"
            r8 = r2
            java.lang.Object r1 = r3.mo13028a(r4, r5, r6, r7, r8)
            if (r1 != r9) goto L_0x01c5
            return r9
        L_0x01c5:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L_0x01c8:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L_0x01cb:
            throw r4
        L_0x01cc:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p008c.p009a.p024e.p026b.C0963b.mo13025a(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
