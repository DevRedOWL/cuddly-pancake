package p033co.infinum.goldeneye;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, mo51343d2 = {"co/infinum/goldeneye/GoldenEye$Builder$setLogger$1$1", "Lco/infinum/goldeneye/Logger;", "log", "", "message", "", "t", "", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.GoldenEye$Builder$setLogger$$inlined$apply$lambda$1 */
/* compiled from: GoldenEye.kt */
public final class GoldenEye$Builder$setLogger$$inlined$apply$lambda$1 implements Logger {
    final /* synthetic */ Function1 $onMessage$inlined;
    final /* synthetic */ Function1 $onThrowable$inlined;

    GoldenEye$Builder$setLogger$$inlined$apply$lambda$1(Function1 function1, Function1 function12) {
        this.$onMessage$inlined = function1;
        this.$onThrowable$inlined = function12;
    }

    public void log(String str) {
        Intrinsics.checkParameterIsNotNull(str, "message");
        this.$onMessage$inlined.invoke(str);
    }

    public void log(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "t");
        this.$onThrowable$inlined.invoke(th);
    }
}
