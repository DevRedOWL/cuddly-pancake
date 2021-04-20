package org.koin.androidx.viewmodel.ext.android;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.androidx.viewmodel.ViewModelParameters;
import org.koin.androidx.viewmodel.ViewModelScopeResolutionKt;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001aS\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\r¢\u0006\u0002\u0010\u000e\u001aJ\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\n\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\rH\b¢\u0006\u0002\u0010\u000f\u001aT\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0011\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\r\u001aK\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0011\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\n\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\rH\b¨\u0006\u0012"}, mo51343d2 = {"getViewModel", "T", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/scope/Scope;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "clazz", "Lkotlin/reflect/KClass;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lorg/koin/core/scope/Scope;Landroidx/lifecycle/LifecycleOwner;Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "(Lorg/koin/core/scope/Scope;Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "viewModel", "Lkotlin/Lazy;", "koin-androidx-viewmodel_release"}, mo51344k = 2, mo51345mv = {1, 1, 15})
/* compiled from: ScopeExt.kt */
public final class ScopeExtKt {
    public static /* synthetic */ Lazy viewModel$default(Scope scope, LifecycleOwner lifecycleOwner, KClass kClass, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            qualifier = null;
        }
        if ((i & 8) != 0) {
            function0 = null;
        }
        return viewModel(scope, lifecycleOwner, kClass, qualifier, function0);
    }

    public static final <T extends ViewModel> Lazy<T> viewModel(Scope scope, LifecycleOwner lifecycleOwner, KClass<T> kClass, Qualifier qualifier, Function0<DefinitionParameters> function0) {
        Intrinsics.checkParameterIsNotNull(scope, "$this$viewModel");
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        Intrinsics.checkParameterIsNotNull(kClass, "clazz");
        return LazyKt.lazy(new ScopeExtKt$viewModel$1(scope, lifecycleOwner, kClass, qualifier, function0));
    }

    static /* synthetic */ Lazy viewModel$default(Scope scope, LifecycleOwner lifecycleOwner, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        Intrinsics.needClassReification();
        return LazyKt.lazy(new ScopeExtKt$viewModel$2(scope, lifecycleOwner, qualifier, function0));
    }

    private static final <T extends ViewModel> Lazy<T> viewModel(Scope scope, LifecycleOwner lifecycleOwner, Qualifier qualifier, Function0<DefinitionParameters> function0) {
        Intrinsics.needClassReification();
        return LazyKt.lazy(new ScopeExtKt$viewModel$2(scope, lifecycleOwner, qualifier, function0));
    }

    static /* synthetic */ ViewModel getViewModel$default(Scope scope, LifecycleOwner lifecycleOwner, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        Intrinsics.reifiedOperationMarker(4, "T");
        return getViewModel(scope, lifecycleOwner, Reflection.getOrCreateKotlinClass(ViewModel.class), qualifier, function0);
    }

    private static final <T extends ViewModel> T getViewModel(Scope scope, LifecycleOwner lifecycleOwner, Qualifier qualifier, Function0<DefinitionParameters> function0) {
        Intrinsics.reifiedOperationMarker(4, "T");
        return getViewModel(scope, lifecycleOwner, Reflection.getOrCreateKotlinClass(ViewModel.class), qualifier, function0);
    }

    public static /* synthetic */ ViewModel getViewModel$default(Scope scope, LifecycleOwner lifecycleOwner, KClass kClass, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            qualifier = null;
        }
        if ((i & 8) != 0) {
            function0 = null;
        }
        return getViewModel(scope, lifecycleOwner, kClass, qualifier, function0);
    }

    public static final <T extends ViewModel> T getViewModel(Scope scope, LifecycleOwner lifecycleOwner, KClass<T> kClass, Qualifier qualifier, Function0<DefinitionParameters> function0) {
        Intrinsics.checkParameterIsNotNull(scope, "$this$getViewModel");
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        Intrinsics.checkParameterIsNotNull(kClass, "clazz");
        return ViewModelScopeResolutionKt.getViewModel(scope, new ViewModelParameters(kClass, lifecycleOwner, qualifier, (Function0) null, function0, 8, (DefaultConstructorMarker) null));
    }
}
