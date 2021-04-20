package org.koin.androidx.viewmodel;

import androidx.lifecycle.ViewModelProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo51343d2 = {"<anonymous>", "T", "Landroidx/lifecycle/ViewModel;", "invoke", "()Landroidx/lifecycle/ViewModel;"}, mo51344k = 3, mo51345mv = {1, 1, 15})
/* compiled from: ViewModelResolution.kt */
final class ViewModelResolutionKt$getInstance$1 extends Lambda implements Function0<T> {
    final /* synthetic */ Class $javaClass;
    final /* synthetic */ ViewModelParameters $parameters;
    final /* synthetic */ ViewModelProvider $this_getInstance;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ViewModelResolutionKt$getInstance$1(ViewModelProvider viewModelProvider, ViewModelParameters viewModelParameters, Class cls) {
        super(0);
        this.$this_getInstance = viewModelProvider;
        this.$parameters = viewModelParameters;
        this.$javaClass = cls;
    }

    public final T invoke() {
        if (this.$parameters.getQualifier() != null) {
            return this.$this_getInstance.get(this.$parameters.getQualifier().toString(), this.$javaClass);
        }
        return this.$this_getInstance.get(this.$javaClass);
    }
}
