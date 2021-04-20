package org.koin.androidx.viewmodel.ext.android;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import com.google.firebase.messaging.Constants;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.androidx.viewmodel.ViewModelParameters;
import org.koin.androidx.viewmodel.ViewModelResolutionKt;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000:\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a_\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0012\b\u0002\u0010\b\u001a\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\tj\u0004\u0018\u0001`\u000e¢\u0006\u0002\u0010\u000f\u001aV\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0012\b\n\u0010\b\u001a\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b2\u0016\b\n\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\tj\u0004\u0018\u0001`\u000eH\b¢\u0006\u0002\u0010\u0010\u001a`\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0012\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0012\b\u0002\u0010\b\u001a\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\tj\u0004\u0018\u0001`\u000e\u001aW\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0012\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0012\b\n\u0010\b\u001a\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b2\u0016\b\n\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\tj\u0004\u0018\u0001`\u000eH\b¨\u0006\u0013"}, mo51343d2 = {"getSharedViewModel", "T", "Landroidx/lifecycle/ViewModel;", "Landroidx/fragment/app/Fragment;", "clazz", "Lkotlin/reflect/KClass;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "from", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStoreOwner;", "Lorg/koin/androidx/viewmodel/ViewModelStoreOwnerDefinition;", "parameters", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "(Landroidx/fragment/app/Fragment;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "sharedViewModel", "Lkotlin/Lazy;", "koin-androidx-viewmodel_release"}, mo51344k = 2, mo51345mv = {1, 1, 15})
/* compiled from: FragmentExt.kt */
public final class FragmentExtKt {
    static /* synthetic */ Lazy sharedViewModel$default(Fragment fragment, Qualifier qualifier, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = new FragmentExtKt$sharedViewModel$1(fragment);
        }
        if ((i & 4) != 0) {
            function02 = null;
        }
        Intrinsics.needClassReification();
        return LazyKt.lazy(new FragmentExtKt$sharedViewModel$2(fragment, qualifier, function0, function02));
    }

    private static final <T extends ViewModel> Lazy<T> sharedViewModel(Fragment fragment, Qualifier qualifier, Function0<? extends ViewModelStoreOwner> function0, Function0<DefinitionParameters> function02) {
        Intrinsics.needClassReification();
        return LazyKt.lazy(new FragmentExtKt$sharedViewModel$2(fragment, qualifier, function0, function02));
    }

    public static /* synthetic */ Lazy sharedViewModel$default(Fragment fragment, KClass kClass, Qualifier qualifier, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            function0 = new FragmentExtKt$sharedViewModel$3(fragment);
        }
        if ((i & 8) != 0) {
            function02 = null;
        }
        return sharedViewModel(fragment, kClass, qualifier, function0, function02);
    }

    public static final <T extends ViewModel> Lazy<T> sharedViewModel(Fragment fragment, KClass<T> kClass, Qualifier qualifier, Function0<? extends ViewModelStoreOwner> function0, Function0<DefinitionParameters> function02) {
        Intrinsics.checkParameterIsNotNull(fragment, "$this$sharedViewModel");
        Intrinsics.checkParameterIsNotNull(kClass, "clazz");
        Intrinsics.checkParameterIsNotNull(function0, Constants.MessagePayloadKeys.FROM);
        return LazyKt.lazy(new FragmentExtKt$sharedViewModel$4(fragment, kClass, qualifier, function0, function02));
    }

    static /* synthetic */ ViewModel getSharedViewModel$default(Fragment fragment, Qualifier qualifier, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = new FragmentExtKt$getSharedViewModel$1(fragment);
        }
        if ((i & 4) != 0) {
            function02 = null;
        }
        Intrinsics.reifiedOperationMarker(4, "T");
        return getSharedViewModel(fragment, Reflection.getOrCreateKotlinClass(ViewModel.class), qualifier, function0, function02);
    }

    private static final <T extends ViewModel> T getSharedViewModel(Fragment fragment, Qualifier qualifier, Function0<? extends ViewModelStoreOwner> function0, Function0<DefinitionParameters> function02) {
        Intrinsics.reifiedOperationMarker(4, "T");
        return getSharedViewModel(fragment, Reflection.getOrCreateKotlinClass(ViewModel.class), qualifier, function0, function02);
    }

    public static /* synthetic */ ViewModel getSharedViewModel$default(Fragment fragment, KClass kClass, Qualifier qualifier, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            function0 = new FragmentExtKt$getSharedViewModel$2(fragment);
        }
        if ((i & 8) != 0) {
            function02 = null;
        }
        return getSharedViewModel(fragment, kClass, qualifier, function0, function02);
    }

    public static final <T extends ViewModel> T getSharedViewModel(Fragment fragment, KClass<T> kClass, Qualifier qualifier, Function0<? extends ViewModelStoreOwner> function0, Function0<DefinitionParameters> function02) {
        Intrinsics.checkParameterIsNotNull(fragment, "$this$getSharedViewModel");
        Intrinsics.checkParameterIsNotNull(kClass, "clazz");
        Intrinsics.checkParameterIsNotNull(function0, Constants.MessagePayloadKeys.FROM);
        return ViewModelResolutionKt.getViewModel(ComponentCallbackExtKt.getKoin(fragment), new ViewModelParameters(kClass, fragment, qualifier, function0, function02));
    }
}
