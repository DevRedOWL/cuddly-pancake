package org.koin.core.scope;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.DefinitionParameters;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo51343d2 = {"<anonymous>", "T", "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/DefinitionParameters;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/DefinitionParameters;)Ljava/lang/Object;"}, mo51344k = 3, mo51345mv = {1, 1, 15})
/* compiled from: Scope.kt */
public final class Scope$declare$definition$1 extends Lambda implements Function2<Scope, DefinitionParameters, T> {
    final /* synthetic */ Object $instance;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Scope$declare$definition$1(Object obj) {
        super(2);
        this.$instance = obj;
    }

    public final T invoke(Scope scope, DefinitionParameters definitionParameters) {
        Intrinsics.checkParameterIsNotNull(scope, "$this$createSingle");
        Intrinsics.checkParameterIsNotNull(definitionParameters, "it");
        return this.$instance;
    }
}
