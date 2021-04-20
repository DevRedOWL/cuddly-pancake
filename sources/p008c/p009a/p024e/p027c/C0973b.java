package p008c.p009a.p024e.p027c;

import android.content.Context;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import p008c.p009a.p024e.p029d.C0980a;

/* renamed from: c.a.e.c.b */
public final class C0973b implements C0972a {

    /* renamed from: a */
    public final Context f1100a;

    /* renamed from: b */
    public final C0980a f1101b;

    @DebugMetadata(mo52052c = "org.mobileid.time_key.push.PushManagerImpl", mo52053f = "PushManagerImpl.kt", mo52054i = {0}, mo52055l = {16}, mo52056m = "enableIfNotPushMessaging", mo52057n = {"this"}, mo52058s = {"L$0"})
    /* renamed from: c.a.e.c.b$a */
    public static final class C0974a extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1102a;

        /* renamed from: b */
        public int f1103b;

        /* renamed from: c */
        public final /* synthetic */ C0973b f1104c;

        /* renamed from: d */
        public Object f1105d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0974a(C0973b bVar, Continuation continuation) {
            super(continuation);
            this.f1104c = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f1102a = obj;
            this.f1103b |= Integer.MIN_VALUE;
            return this.f1104c.mo13034a(this);
        }
    }

    @DebugMetadata(mo52052c = "org.mobileid.time_key.push.PushManagerImpl", mo52053f = "PushManagerImpl.kt", mo52054i = {0}, mo52055l = {28}, mo52056m = "enablePushMessaging", mo52057n = {"this"}, mo52058s = {"L$0"})
    /* renamed from: c.a.e.c.b$b */
    public static final class C0975b extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1106a;

        /* renamed from: b */
        public int f1107b;

        /* renamed from: c */
        public final /* synthetic */ C0973b f1108c;

        /* renamed from: d */
        public Object f1109d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0975b(C0973b bVar, Continuation continuation) {
            super(continuation);
            this.f1108c = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f1106a = obj;
            this.f1107b |= Integer.MIN_VALUE;
            return this.f1108c.mo13036b(this);
        }
    }

    public C0973b(Context context, C0980a aVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(aVar, "applicationTokenReceiver");
        this.f1100a = context;
        this.f1101b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo13034a(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p008c.p009a.p024e.p027c.C0973b.C0974a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            c.a.e.c.b$a r0 = (p008c.p009a.p024e.p027c.C0973b.C0974a) r0
            int r1 = r0.f1103b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f1103b = r1
            goto L_0x0018
        L_0x0013:
            c.a.e.c.b$a r0 = new c.a.e.c.b$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f1102a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1103b
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.f1105d
            c.a.e.c.b r0 = (p008c.p009a.p024e.p027c.C0973b) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0069
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r7)
            android.content.Context r7 = r6.f1100a
            java.lang.String r2 = "$this$getStringFromSharedPreferences"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            java.lang.String r2 = "TOKEN_STORAGE_KEY"
            java.lang.String r4 = "storageKey"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            java.lang.String r4 = "TOKEN_KEY"
            java.lang.String r5 = "valueKey"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            r5 = 0
            android.content.SharedPreferences r7 = r7.getSharedPreferences(r2, r5)
            r2 = 0
            java.lang.String r7 = r7.getString(r4, r2)
            if (r7 == 0) goto L_0x005c
            r5 = 1
        L_0x005c:
            if (r5 != 0) goto L_0x0069
            r0.f1105d = r6
            r0.f1103b = r3
            java.lang.Object r7 = r6.mo13036b(r0)
            if (r7 != r1) goto L_0x0069
            return r1
        L_0x0069:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p008c.p009a.p024e.p027c.C0973b.mo13034a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo13036b(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p008c.p009a.p024e.p027c.C0973b.C0975b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            c.a.e.c.b$b r0 = (p008c.p009a.p024e.p027c.C0973b.C0975b) r0
            int r1 = r0.f1107b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f1107b = r1
            goto L_0x0018
        L_0x0013:
            c.a.e.c.b$b r0 = new c.a.e.c.b$b
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f1106a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1107b
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.f1109d
            c.a.e.c.b r0 = (p008c.p009a.p024e.p027c.C0973b) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0046
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r5)
            c.a.e.d.a r5 = r4.f1101b
            r0.f1109d = r4
            r0.f1107b = r3
            java.lang.Object r5 = r5.mo13038a(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            r0 = r4
        L_0x0046:
            java.lang.String r5 = (java.lang.String) r5
            if (r0 == 0) goto L_0x0080
            java.lang.String r1 = "token"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            android.content.Context r0 = r0.f1100a
            java.lang.String r1 = "$this$putStringToSharedPreferences"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "TOKEN_STORAGE_KEY"
            java.lang.String r2 = "storageKey"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = "TOKEN_KEY"
            java.lang.String r3 = "valueKey"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.lang.String r3 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            r3 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r3)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r5 = r0.putString(r2, r5)
            r5.apply()
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L_0x0080:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p008c.p009a.p024e.p027c.C0973b.mo13036b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: a */
    public String mo13035a() {
        Context context = this.f1100a;
        Intrinsics.checkNotNullParameter(context, "$this$getStringFromSharedPreferences");
        Intrinsics.checkNotNullParameter("TOKEN_STORAGE_KEY", "storageKey");
        Intrinsics.checkNotNullParameter("TOKEN_KEY", "valueKey");
        return context.getSharedPreferences("TOKEN_STORAGE_KEY", 0).getString("TOKEN_KEY", (String) null);
    }
}
