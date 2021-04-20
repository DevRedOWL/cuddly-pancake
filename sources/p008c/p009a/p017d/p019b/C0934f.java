package p008c.p009a.p017d.p019b;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import org.mobileid.Api;
import org.mobileid.access.key_sort.Sort;
import p008c.p009a.p010a.C0837c;
import p008c.p009a.p014b.C0882h;
import p008c.p009a.p014b.p015i.C0890b;
import p008c.p009a.p017d.p023e.C0952a;
import p008c.p009a.p017d.p023e.C0955c;
import p008c.p009a.p017d.p023e.C0957e;

/* renamed from: c.a.d.b.f */
public final class C0934f implements C0933e {

    /* renamed from: a */
    public final Context f971a;

    /* renamed from: c.a.d.b.f$a */
    public static final class C0935a implements C0890b.C0891a {

        /* renamed from: a */
        public final /* synthetic */ Continuation f972a;

        /* renamed from: b */
        public final /* synthetic */ C0934f f973b;

        /* renamed from: c */
        public final /* synthetic */ boolean f974c;

        public C0935a(Continuation continuation, C0934f fVar, boolean z) {
            this.f972a = continuation;
            this.f973b = fVar;
            this.f974c = z;
        }

        /* renamed from: a */
        public void mo12976a() {
        }

        /* renamed from: a */
        public void mo12977a(String str, String str2, C0882h.C0885b bVar) {
            Object obj;
            Intrinsics.checkNotNullParameter(str, "keyPrefix");
            C0934f fVar = this.f973b;
            Continuation continuation = this.f972a;
            if (fVar != null) {
                if (str2 == null && bVar != null) {
                    Intrinsics.checkNotNull(bVar);
                    int i = bVar.f866a;
                    continuation.resumeWith(Result.m6940constructorimpl(i != 7 ? i != 9 ? i != 10 ? new C0952a(Api.RequestKeyResult.REJECTED) : new C0952a(Api.RequestKeyResult.NO_KEY_LEFT) : new C0952a(Api.RequestKeyResult.NO_MASTERCARD) : new C0952a(Api.RequestKeyResult.UNKNOWN)));
                    return;
                }
                if (C0837c.f761k.mo12917b(fVar.f971a, str)) {
                    obj = Result.m6940constructorimpl(new C0952a(Api.RequestKeyResult.ALREADY_EXIST));
                } else {
                    Api.RequestKeyResult requestKeyResult = Api.RequestKeyResult.SUCCESS;
                    Intrinsics.checkNotNull(str2);
                    obj = Result.m6940constructorimpl(new C0957e(requestKeyResult, str, str2));
                }
                continuation.resumeWith(obj);
                return;
            }
            throw null;
        }

        public void found() {
            C0934f fVar = this.f973b;
            Context context = fVar.f971a;
            boolean z = this.f974c;
            if (fVar == null) {
                throw null;
            } else if (z) {
                Intrinsics.checkNotNullParameter(context, "$this$vibrateOneShot");
                if (Build.VERSION.SDK_INT >= 26) {
                    Object systemService = context.getSystemService("vibrator");
                    if (systemService != null) {
                        ((Vibrator) systemService).vibrate(VibrationEffect.createOneShot(60, -1));
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.os.Vibrator");
                }
                Object systemService2 = context.getSystemService("vibrator");
                if (systemService2 != null) {
                    ((Vibrator) systemService2).vibrate(60);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.os.Vibrator");
            }
        }
    }

    public C0934f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f971a = context;
    }

    /* renamed from: a */
    public Object mo13003a(boolean z, Continuation<? super C0955c> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        Context context = this.f971a;
        List a = C0837c.C0838a.m367a(C0837c.f761k, context, (Sort) null, 2);
        C0935a aVar = new C0935a(safeContinuation, this, z);
        if (C0890b.C0894c.f884a.f873a == null) {
            try {
                C0890b.C0894c.f884a.f873a = new C0890b.C0892b(context, a, aVar);
            } catch (Exception e) {
                aVar.mo12977a("", (String) null, new C0882h.C0885b(1, e.toString()));
            }
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
