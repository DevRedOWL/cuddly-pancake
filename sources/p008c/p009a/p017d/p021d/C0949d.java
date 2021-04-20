package p008c.p009a.p017d.p021d;

import java.util.Locale;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.mobileid.Api;
import org.mobileid.access.key.TimeKey;
import org.mobileid.requester.web_service.simple_key.SimpleKeyWebService;
import p008c.p009a.p017d.p021d.p022e.C0950a;
import p008c.p009a.p017d.p023e.C0952a;
import p008c.p009a.p017d.p023e.C0955c;
import p008c.p009a.p024e.p026b.C0962a;

/* renamed from: c.a.d.d.d */
public final class C0949d implements C0946a {

    /* renamed from: a */
    public final C0950a f1012a;

    /* renamed from: b */
    public final C0962a f1013b;

    /* renamed from: c */
    public final SimpleKeyWebService f1014c;

    /* renamed from: d */
    public final CoroutineScope f1015d;

    public C0949d(C0950a aVar, C0962a aVar2, SimpleKeyWebService simpleKeyWebService, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(aVar, "qrValidator");
        Intrinsics.checkNotNullParameter(aVar2, "timeKeyManager");
        Intrinsics.checkNotNullParameter(simpleKeyWebService, "simpleKeyWebService");
        Intrinsics.checkNotNullParameter(coroutineScope, "scope");
        this.f1012a = aVar;
        this.f1013b = aVar2;
        this.f1014c = simpleKeyWebService;
        this.f1015d = coroutineScope;
    }

    /* renamed from: a */
    public Object mo13012a(String str, Continuation<? super C0955c> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        String b = mo13014b(str);
        if (this.f1012a.mo13015a(str) == Api.MobileQRCheckResult.VALID) {
            if (b.length() == 0) {
                safeContinuation.resumeWith(Result.m6940constructorimpl(new C0952a(Api.RequestKeyResult.UNKNOWN)));
            } else if (TimeKey.Companion.isTimeKeyPrefix(b)) {
                Job unused = BuildersKt__Builders_commonKt.launch$default(this.f1015d, Dispatchers.getIO(), (CoroutineStart) null, new C0948c(this, str, safeContinuation, (Continuation) null), 2, (Object) null);
            } else {
                Job unused2 = BuildersKt__Builders_commonKt.launch$default(this.f1015d, Dispatchers.getIO(), (CoroutineStart) null, new C0947b(this, str, safeContinuation, b, (Continuation) null), 2, (Object) null);
            }
        } else {
            safeContinuation.resumeWith(Result.m6940constructorimpl(new C0952a(Api.RequestKeyResult.UNKNOWN)));
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* renamed from: a */
    public Api.MobileQRCheckResult mo13013a(String str) {
        Intrinsics.checkNotNullParameter(str, "mobileQr");
        return this.f1012a.mo13015a(str);
    }

    /* renamed from: b */
    public final String mo13014b(String str) {
        String substringBefore = StringsKt.substringBefore(str, "-", "");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.getDefault()");
        if (substringBefore != null) {
            String upperCase = substringBefore.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            return upperCase;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }
}
