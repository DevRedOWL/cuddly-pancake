package org.koin.core.scope;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.KoinApplication;
import org.koin.core.logger.Logger;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.ext.KClassExtKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo51343d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, mo51344k = 3, mo51345mv = {1, 1, 15})
/* compiled from: Scope.kt */
public final class Scope$injectOrNull$1 extends Lambda implements Function0<T> {
    final /* synthetic */ Function0 $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ Scope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Scope$injectOrNull$1(Scope scope, Qualifier qualifier, Function0 function0) {
        super(0);
        this.this$0 = scope;
        this.$qualifier = qualifier;
        this.$parameters = function0;
    }

    public final T invoke() {
        Scope scope = this.this$0;
        Qualifier qualifier = this.$qualifier;
        Function0 function0 = this.$parameters;
        try {
            Intrinsics.reifiedOperationMarker(4, "T");
            return scope.get((KClass<?>) Reflection.getOrCreateKotlinClass(Object.class), qualifier, (Function0<DefinitionParameters>) function0);
        } catch (Exception unused) {
            Logger logger = KoinApplication.Companion.getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append("Can't get instance for ");
            Intrinsics.reifiedOperationMarker(4, "T");
            sb.append(KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(Object.class)));
            logger.error(sb.toString());
            return null;
        }
    }
}
