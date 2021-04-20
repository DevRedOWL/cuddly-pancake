package org.koin.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000D\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo51343d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;", "org/koin/core/scope/Scope$inject$1", "org/koin/core/KoinComponentKt$inject$$inlined$inject$3"}, mo51344k = 3, mo51345mv = {1, 1, 15})
/* compiled from: Scope.kt */
public final class KoinComponentKt$inject$$inlined$inject$4 extends Lambda implements Function0<T> {
    final /* synthetic */ Function0 $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ Scope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KoinComponentKt$inject$$inlined$inject$4(Scope scope, Qualifier qualifier, Function0 function0) {
        super(0);
        this.this$0 = scope;
        this.$qualifier = qualifier;
        this.$parameters = function0;
    }

    public final T invoke() {
        Scope scope = this.this$0;
        Qualifier qualifier = this.$qualifier;
        Function0 function0 = this.$parameters;
        Intrinsics.reifiedOperationMarker(4, "T");
        return scope.get((KClass<?>) Reflection.getOrCreateKotlinClass(Object.class), qualifier, (Function0<DefinitionParameters>) function0);
    }
}
