package org.koin.core.scope;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import org.koin.core.qualifier.Qualifier;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo51343d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;", "org/koin/core/scope/Scope$get$2$1"}, mo51344k = 3, mo51345mv = {1, 1, 15})
/* compiled from: Scope.kt */
final class Scope$get$$inlined$synchronized$lambda$2 extends Lambda implements Function0<T> {
    final /* synthetic */ Class $clazz$inlined;
    final /* synthetic */ KClass $kClass;
    final /* synthetic */ Function0 $parameters$inlined;
    final /* synthetic */ Qualifier $qualifier$inlined;
    final /* synthetic */ Scope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Scope$get$$inlined$synchronized$lambda$2(KClass kClass, Scope scope, Class cls, Qualifier qualifier, Function0 function0) {
        super(0);
        this.$kClass = kClass;
        this.this$0 = scope;
        this.$clazz$inlined = cls;
        this.$qualifier$inlined = qualifier;
        this.$parameters$inlined = function0;
    }

    public final T invoke() {
        return this.this$0.resolveInstance(this.$qualifier$inlined, this.$kClass, this.$parameters$inlined);
    }
}
