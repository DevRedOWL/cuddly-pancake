package kotlin;

import kotlin.jvm.functions.Function0;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\b\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0007"}, mo51343d2 = {"assert", "", "value", "", "lazyMessage", "Lkotlin/Function0;", "", "kotlin-stdlib"}, mo51344k = 5, mo51345mv = {1, 4, 0}, mo51347xi = 1, mo51348xs = "kotlin/PreconditionsKt")
/* compiled from: AssertionsJVM.kt */
class PreconditionsKt__AssertionsJVMKt {
    /* renamed from: assert  reason: not valid java name */
    private static final void m6937assert(boolean z) {
        if (_Assertions.ENABLED && !z) {
            throw new AssertionError("Assertion failed");
        }
    }

    /* renamed from: assert  reason: not valid java name */
    private static final void m6938assert(boolean z, Function0<? extends Object> function0) {
        if (_Assertions.ENABLED && !z) {
            throw new AssertionError(function0.invoke());
        }
    }
}
