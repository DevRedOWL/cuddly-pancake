package p008c.p009a.p010a.p011d;

import android.content.Context;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import p008c.p009a.p024e.p026b.C0962a;

/* renamed from: c.a.a.d.b */
public final class C0841b implements C0840a {

    /* renamed from: a */
    public final Context f772a;

    /* renamed from: b */
    public final C0962a f773b;

    @DebugMetadata(mo52052c = "org.mobileid.access.key_remover.KeyRemoverImpl", mo52053f = "KeyRemoverImpl.kt", mo52054i = {0, 0}, mo52055l = {12}, mo52056m = "removeKey", mo52057n = {"this", "keyId"}, mo52058s = {"L$0", "L$1"})
    /* renamed from: c.a.a.d.b$a */
    public static final class C0842a extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f774a;

        /* renamed from: b */
        public int f775b;

        /* renamed from: c */
        public final /* synthetic */ C0841b f776c;

        /* renamed from: d */
        public Object f777d;

        /* renamed from: e */
        public Object f778e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0842a(C0841b bVar, Continuation continuation) {
            super(continuation);
            this.f776c = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f774a = obj;
            this.f775b |= Integer.MIN_VALUE;
            return this.f776c.mo12923a((String) null, this);
        }
    }

    public C0841b(Context context, C0962a aVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(aVar, "timeKeyManager");
        this.f772a = context;
        this.f773b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo12923a(java.lang.String r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p008c.p009a.p010a.p011d.C0841b.C0842a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            c.a.a.d.b$a r0 = (p008c.p009a.p010a.p011d.C0841b.C0842a) r0
            int r1 = r0.f775b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f775b = r1
            goto L_0x0018
        L_0x0013:
            c.a.a.d.b$a r0 = new c.a.a.d.b$a
            r0.<init>(r7, r9)
        L_0x0018:
            r4 = r0
            java.lang.Object r9 = r4.f774a
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.f775b
            r2 = 1
            if (r1 == 0) goto L_0x003a
            if (r1 != r2) goto L_0x0032
            java.lang.Object r8 = r4.f778e
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r4.f777d
            c.a.a.d.b r8 = (p008c.p009a.p010a.p011d.C0841b) r8
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ Exception -> 0x0058 }
            goto L_0x0064
        L_0x0032:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r9)
            org.mobileid.access.key.TimeKey$Companion r9 = org.mobileid.access.key.TimeKey.Companion
            boolean r9 = r9.isStorageTimeKeyId(r8)
            if (r9 == 0) goto L_0x005d
            c.a.e.b.a r1 = r7.f773b     // Catch:{ Exception -> 0x0058 }
            r3 = 0
            r5 = 2
            r6 = 0
            r4.f777d = r7     // Catch:{ Exception -> 0x0058 }
            r4.f778e = r8     // Catch:{ Exception -> 0x0058 }
            r4.f775b = r2     // Catch:{ Exception -> 0x0058 }
            r2 = r8
            java.lang.Object r8 = p008c.p009a.p014b.C0878g.m457a(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0058 }
            if (r8 != r0) goto L_0x0064
            return r0
        L_0x0058:
            r8 = move-exception
            r8.printStackTrace()
            goto L_0x0064
        L_0x005d:
            c.a.a.c$a r9 = p008c.p009a.p010a.C0837c.f761k
            android.content.Context r0 = r7.f772a
            r9.mo12912a((android.content.Context) r0, (java.lang.String) r8, (boolean) r2)
        L_0x0064:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p008c.p009a.p010a.p011d.C0841b.mo12923a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
