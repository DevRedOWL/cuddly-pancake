package org.koin.androidx.viewmodel.ext.android;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo51343d2 = {"<anonymous>", "T", "Landroidx/lifecycle/ViewModel;", "invoke", "()Landroidx/lifecycle/ViewModel;"}, mo51344k = 3, mo51345mv = {1, 1, 15})
/* compiled from: ScopeExt.kt */
final class ScopeExtKt$viewModel$1 extends Lambda implements Function0<T> {
    final /* synthetic */ KClass $clazz;
    final /* synthetic */ LifecycleOwner $owner;
    final /* synthetic */ Function0 $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ Scope $this_viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScopeExtKt$viewModel$1(Scope scope, LifecycleOwner lifecycleOwner, KClass kClass, Qualifier qualifier, Function0 function0) {
        super(0);
        this.$this_viewModel = scope;
        this.$owner = lifecycleOwner;
        this.$clazz = kClass;
        this.$qualifier = qualifier;
        this.$parameters = function0;
    }

    public final T invoke() {
        return ScopeExtKt.getViewModel(this.$this_viewModel, this.$owner, this.$clazz, this.$qualifier, this.$parameters);
    }
}
