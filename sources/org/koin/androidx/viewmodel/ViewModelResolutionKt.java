package org.koin.androidx.viewmodel;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.scope.Scope;
import org.koin.core.time.MeasureKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\u001a'\u0010\t\u001a\u0002H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b¢\u0006\u0002\u0010\n\u001a'\u0010\u000b\u001a\u0002H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b¢\u0006\u0002\u0010\r\u001a\"\u0010\u000e\u001a\u00020\u0006\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u000f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b¨\u0006\u0010"}, mo51343d2 = {"createViewModelProvider", "Landroidx/lifecycle/ViewModelProvider;", "T", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/scope/Scope;", "vmStore", "Landroidx/lifecycle/ViewModelStore;", "parameters", "Lorg/koin/androidx/viewmodel/ViewModelParameters;", "getInstance", "(Landroidx/lifecycle/ViewModelProvider;Lorg/koin/androidx/viewmodel/ViewModelParameters;)Landroidx/lifecycle/ViewModel;", "getViewModel", "Lorg/koin/core/Koin;", "(Lorg/koin/core/Koin;Lorg/koin/androidx/viewmodel/ViewModelParameters;)Landroidx/lifecycle/ViewModel;", "getViewModelStore", "Landroidx/lifecycle/LifecycleOwner;", "koin-androidx-viewmodel_release"}, mo51344k = 2, mo51345mv = {1, 1, 15})
/* compiled from: ViewModelResolution.kt */
public final class ViewModelResolutionKt {
    public static final <T extends ViewModel> T getViewModel(Koin koin, ViewModelParameters<T> viewModelParameters) {
        Intrinsics.checkParameterIsNotNull(koin, "$this$getViewModel");
        Intrinsics.checkParameterIsNotNull(viewModelParameters, "parameters");
        return getInstance(createViewModelProvider(koin.getRootScope(), getViewModelStore(viewModelParameters.getOwner(), viewModelParameters), viewModelParameters), viewModelParameters);
    }

    public static final <T extends ViewModel> T getInstance(ViewModelProvider viewModelProvider, ViewModelParameters<T> viewModelParameters) {
        T t;
        Intrinsics.checkParameterIsNotNull(viewModelProvider, "$this$getInstance");
        Intrinsics.checkParameterIsNotNull(viewModelParameters, "parameters");
        Class<T> javaClass = JvmClassMappingKt.getJavaClass(viewModelParameters.getClazz());
        if (KoinApplication.Companion.getLogger().isAt(Level.DEBUG)) {
            KoinApplication.Companion.getLogger().debug("!- ViewModelProvider getting instance");
            Pair measureDuration = MeasureKt.measureDuration(new ViewModelResolutionKt$getInstance$1(viewModelProvider, viewModelParameters, javaClass));
            T t2 = (ViewModel) measureDuration.component1();
            double doubleValue = ((Number) measureDuration.component2()).doubleValue();
            Logger logger = KoinApplication.Companion.getLogger();
            logger.debug("!- ViewModelProvider got instance in " + doubleValue);
            Intrinsics.checkExpressionValueIsNotNull(t2, "instance");
            return t2;
        }
        if (viewModelParameters.getQualifier() != null) {
            t = viewModelProvider.get(viewModelParameters.getQualifier().toString(), javaClass);
        } else {
            t = viewModelProvider.get(javaClass);
        }
        Intrinsics.checkExpressionValueIsNotNull(t, "if (parameters.qualifier….get(javaClass)\n        }");
        return t;
    }

    public static final <T extends ViewModel> ViewModelStore getViewModelStore(LifecycleOwner lifecycleOwner, ViewModelParameters<T> viewModelParameters) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "$this$getViewModelStore");
        Intrinsics.checkParameterIsNotNull(viewModelParameters, "parameters");
        if (viewModelParameters.getFrom() != null) {
            ViewModelStore viewModelStore = viewModelParameters.getFrom().invoke().getViewModelStore();
            Intrinsics.checkExpressionValueIsNotNull(viewModelStore, "parameters.from.invoke().viewModelStore");
            return viewModelStore;
        } else if (lifecycleOwner instanceof FragmentActivity) {
            ViewModelStore viewModelStore2 = ((FragmentActivity) lifecycleOwner).getViewModelStore();
            Intrinsics.checkExpressionValueIsNotNull(viewModelStore2, "this.viewModelStore");
            return viewModelStore2;
        } else if (lifecycleOwner instanceof Fragment) {
            ViewModelStore viewModelStore3 = ((Fragment) lifecycleOwner).getViewModelStore();
            Intrinsics.checkExpressionValueIsNotNull(viewModelStore3, "this.viewModelStore");
            return viewModelStore3;
        } else {
            throw new IllegalStateException(("Can't getByClass ViewModel '" + viewModelParameters.getClazz() + "' on " + lifecycleOwner + " - Is not a FragmentActivity nor a Fragment neither a valid ViewModelStoreOwner").toString());
        }
    }

    public static final <T extends ViewModel> ViewModelProvider createViewModelProvider(Scope scope, ViewModelStore viewModelStore, ViewModelParameters<T> viewModelParameters) {
        Intrinsics.checkParameterIsNotNull(scope, "$this$createViewModelProvider");
        Intrinsics.checkParameterIsNotNull(viewModelStore, "vmStore");
        Intrinsics.checkParameterIsNotNull(viewModelParameters, "parameters");
        return new ViewModelProvider(viewModelStore, (ViewModelProvider.Factory) new ViewModelResolutionKt$createViewModelProvider$1(scope, viewModelParameters));
    }
}
