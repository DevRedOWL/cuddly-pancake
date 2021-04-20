package p033co.infinum.goldeneye.extensions;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.utils.AsyncUtils;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0004\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00060\b2\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\u0006\u0012\u0004\u0012\u00020\u00050\nH\u0000\u001aG\u0010\u000b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r2\b\u0010\u000e\u001a\u0004\u0018\u0001H\f2\b\u0010\u000f\u001a\u0004\u0018\u0001H\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u00050\u0011H\u0000¢\u0006\u0002\u0010\u0012\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0013"}, mo51343d2 = {"MAIN_HANDLER", "Landroid/os/Handler;", "getMAIN_HANDLER", "()Landroid/os/Handler;", "async", "", "T", "task", "Lkotlin/Function0;", "onResult", "Lkotlin/Function1;", "ifNotNull", "T1", "T2", "p1", "p2", "action", "Lkotlin/Function2;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "goldeneye_release"}, mo51344k = 2, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.extensions.AnyKt */
/* compiled from: Any.kt */
public final class AnyKt {
    private static final Handler MAIN_HANDLER = new Handler(Looper.getMainLooper());

    public static final Handler getMAIN_HANDLER() {
        return MAIN_HANDLER;
    }

    public static final <T1, T2> void ifNotNull(T1 t1, T2 t2, Function2<? super T1, ? super T2, Unit> function2) {
        Intrinsics.checkParameterIsNotNull(function2, "action");
        if (t1 != null && t2 != null) {
            function2.invoke(t1, t2);
        }
    }

    public static final <T> void async(Function0<? extends T> function0, Function1<? super T, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function0, "task");
        Intrinsics.checkParameterIsNotNull(function1, "onResult");
        AsyncUtils.INSTANCE.getBackgroundHandler().post(new AnyKt$async$1(function0, function1));
    }
}
