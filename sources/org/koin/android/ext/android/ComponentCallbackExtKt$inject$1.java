package org.koin.android.ext.android;

import android.content.ComponentCallbacks;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo51343d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, mo51344k = 3, mo51345mv = {1, 1, 15})
/* compiled from: ComponentCallbackExt.kt */
public final class ComponentCallbackExtKt$inject$1 extends Lambda implements Function0<T> {
    final /* synthetic */ Function0 $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ ComponentCallbacks $this_inject;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComponentCallbackExtKt$inject$1(ComponentCallbacks componentCallbacks, Qualifier qualifier, Function0 function0) {
        super(0);
        this.$this_inject = componentCallbacks;
        this.$qualifier = qualifier;
        this.$parameters = function0;
    }

    public final T invoke() {
        ComponentCallbacks componentCallbacks = this.$this_inject;
        Qualifier qualifier = this.$qualifier;
        Function0 function0 = this.$parameters;
        Scope rootScope = ComponentCallbackExtKt.getKoin(componentCallbacks).getRootScope();
        Intrinsics.reifiedOperationMarker(4, "T");
        return rootScope.get((KClass<?>) Reflection.getOrCreateKotlinClass(Object.class), qualifier, (Function0<DefinitionParameters>) function0);
    }
}
