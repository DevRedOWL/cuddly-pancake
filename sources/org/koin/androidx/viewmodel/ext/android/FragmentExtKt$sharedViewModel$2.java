package org.koin.androidx.viewmodel.ext.android;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.koin.core.qualifier.Qualifier;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo51343d2 = {"<anonymous>", "T", "Landroidx/lifecycle/ViewModel;", "invoke", "()Landroidx/lifecycle/ViewModel;"}, mo51344k = 3, mo51345mv = {1, 1, 15})
/* compiled from: FragmentExt.kt */
public final class FragmentExtKt$sharedViewModel$2 extends Lambda implements Function0<T> {
    final /* synthetic */ Function0 $from;
    final /* synthetic */ Function0 $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ Fragment $this_sharedViewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentExtKt$sharedViewModel$2(Fragment fragment, Qualifier qualifier, Function0 function0, Function0 function02) {
        super(0);
        this.$this_sharedViewModel = fragment;
        this.$qualifier = qualifier;
        this.$from = function0;
        this.$parameters = function02;
    }

    public final T invoke() {
        Fragment fragment = this.$this_sharedViewModel;
        Qualifier qualifier = this.$qualifier;
        Function0 function0 = this.$from;
        Function0 function02 = this.$parameters;
        Intrinsics.reifiedOperationMarker(4, "T");
        return FragmentExtKt.getSharedViewModel(fragment, Reflection.getOrCreateKotlinClass(ViewModel.class), qualifier, function0, function02);
    }
}
