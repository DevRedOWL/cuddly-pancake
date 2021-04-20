package org.koin.androidx.viewmodel.ext.android;

import android.content.ComponentCallbacks;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.androidx.viewmodel.ViewModelParameters;
import org.koin.androidx.viewmodel.ViewModelResolutionKt;
import org.koin.core.Koin;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001aK\u0010\u0003\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u0005*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\r¢\u0006\u0002\u0010\u000e\u001aB\u0010\u0003\u001a\u0002H\u0004\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u0005*\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\n\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\rH\b¢\u0006\u0002\u0010\u000f\u001aL\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0011\"\b\b\u0000\u0010\u0004*\u00020\u0005*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\r\u001aC\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0011\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u0005*\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\n\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\rH\b¨\u0006\u0012"}, mo51343d2 = {"getKoin", "Lorg/koin/core/Koin;", "Landroidx/lifecycle/LifecycleOwner;", "getViewModel", "T", "Landroidx/lifecycle/ViewModel;", "clazz", "Lkotlin/reflect/KClass;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "viewModel", "Lkotlin/Lazy;", "koin-androidx-viewmodel_release"}, mo51344k = 2, mo51345mv = {1, 1, 15})
/* compiled from: LifecycleOwnerExt.kt */
public final class LifecycleOwnerExtKt {
    public static /* synthetic */ Lazy viewModel$default(LifecycleOwner lifecycleOwner, KClass kClass, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return viewModel(lifecycleOwner, kClass, qualifier, function0);
    }

    public static final <T extends ViewModel> Lazy<T> viewModel(LifecycleOwner lifecycleOwner, KClass<T> kClass, Qualifier qualifier, Function0<DefinitionParameters> function0) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "$this$viewModel");
        Intrinsics.checkParameterIsNotNull(kClass, "clazz");
        return LazyKt.lazy(new LifecycleOwnerExtKt$viewModel$1(lifecycleOwner, kClass, qualifier, function0));
    }

    static /* synthetic */ Lazy viewModel$default(LifecycleOwner lifecycleOwner, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Intrinsics.needClassReification();
        return LazyKt.lazy(new LifecycleOwnerExtKt$viewModel$2(lifecycleOwner, qualifier, function0));
    }

    private static final <T extends ViewModel> Lazy<T> viewModel(LifecycleOwner lifecycleOwner, Qualifier qualifier, Function0<DefinitionParameters> function0) {
        Intrinsics.needClassReification();
        return LazyKt.lazy(new LifecycleOwnerExtKt$viewModel$2(lifecycleOwner, qualifier, function0));
    }

    static /* synthetic */ ViewModel getViewModel$default(LifecycleOwner lifecycleOwner, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Intrinsics.reifiedOperationMarker(4, "T");
        return getViewModel(lifecycleOwner, Reflection.getOrCreateKotlinClass(ViewModel.class), qualifier, function0);
    }

    private static final <T extends ViewModel> T getViewModel(LifecycleOwner lifecycleOwner, Qualifier qualifier, Function0<DefinitionParameters> function0) {
        Intrinsics.reifiedOperationMarker(4, "T");
        return getViewModel(lifecycleOwner, Reflection.getOrCreateKotlinClass(ViewModel.class), qualifier, function0);
    }

    private static final Koin getKoin(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != null) {
            return ComponentCallbackExtKt.getKoin((ComponentCallbacks) lifecycleOwner);
        }
        throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
    }

    public static /* synthetic */ ViewModel getViewModel$default(LifecycleOwner lifecycleOwner, KClass kClass, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return getViewModel(lifecycleOwner, kClass, qualifier, function0);
    }

    public static final <T extends ViewModel> T getViewModel(LifecycleOwner lifecycleOwner, KClass<T> kClass, Qualifier qualifier, Function0<DefinitionParameters> function0) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "$this$getViewModel");
        Intrinsics.checkParameterIsNotNull(kClass, "clazz");
        return ViewModelResolutionKt.getViewModel(getKoin(lifecycleOwner), new ViewModelParameters(kClass, lifecycleOwner, qualifier, (Function0) null, function0, 8, (DefaultConstructorMarker) null));
    }
}
