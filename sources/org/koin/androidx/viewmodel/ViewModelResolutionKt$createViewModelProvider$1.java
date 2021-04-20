package org.koin.androidx.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.koin.core.scope.Scope;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, mo51343d2 = {"org/koin/androidx/viewmodel/ViewModelResolutionKt$createViewModelProvider$1", "Landroidx/lifecycle/ViewModelProvider$Factory;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "koin-androidx-viewmodel_release"}, mo51344k = 1, mo51345mv = {1, 1, 15})
/* compiled from: ViewModelResolution.kt */
public final class ViewModelResolutionKt$createViewModelProvider$1 implements ViewModelProvider.Factory {
    final /* synthetic */ ViewModelParameters $parameters;
    final /* synthetic */ Scope $this_createViewModelProvider;

    ViewModelResolutionKt$createViewModelProvider$1(Scope scope, ViewModelParameters viewModelParameters) {
        this.$this_createViewModelProvider = scope;
        this.$parameters = viewModelParameters;
    }

    public <T extends ViewModel> T create(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "modelClass");
        return (ViewModel) this.$this_createViewModelProvider.get((KClass<?>) this.$parameters.getClazz(), this.$parameters.getQualifier(), this.$parameters.getParameters());
    }
}
