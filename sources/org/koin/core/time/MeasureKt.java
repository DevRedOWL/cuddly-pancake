package org.koin.core.time;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a&\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005¨\u0006\b"}, mo51343d2 = {"measureDuration", "Lkotlin/Pair;", "T", "", "code", "Lkotlin/Function0;", "measureDurationOnly", "", "koin-core"}, mo51344k = 2, mo51345mv = {1, 1, 15})
/* compiled from: Measure.kt */
public final class MeasureKt {
    public static final double measureDurationOnly(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "code");
        long nanoTime = System.nanoTime();
        function0.invoke();
        return ((double) (System.nanoTime() - nanoTime)) / 1000000.0d;
    }

    public static final <T> Pair<T, Double> measureDuration(Function0<? extends T> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "code");
        return new Pair<>(function0.invoke(), Double.valueOf(((double) (System.nanoTime() - System.nanoTime())) / 1000000.0d));
    }
}
