package org.koin.androidx.viewmodel;

import androidx.lifecycle.ViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.scope.Scope;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, mo51343d2 = {"getViewModel", "T", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/scope/Scope;", "parameters", "Lorg/koin/androidx/viewmodel/ViewModelParameters;", "(Lorg/koin/core/scope/Scope;Lorg/koin/androidx/viewmodel/ViewModelParameters;)Landroidx/lifecycle/ViewModel;", "koin-androidx-viewmodel_release"}, mo51344k = 2, mo51345mv = {1, 1, 15})
/* compiled from: ViewModelScopeResolution.kt */
public final class ViewModelScopeResolutionKt {
    public static final <T extends ViewModel> T getViewModel(Scope scope, ViewModelParameters<T> viewModelParameters) {
        Intrinsics.checkParameterIsNotNull(scope, "$this$getViewModel");
        Intrinsics.checkParameterIsNotNull(viewModelParameters, "parameters");
        return ViewModelResolutionKt.getInstance(ViewModelResolutionKt.createViewModelProvider(scope, ViewModelResolutionKt.getViewModelStore(viewModelParameters.getOwner(), viewModelParameters), viewModelParameters), viewModelParameters);
    }
}
