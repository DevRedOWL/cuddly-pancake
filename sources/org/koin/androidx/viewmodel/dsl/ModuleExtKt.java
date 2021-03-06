package org.koin.androidx.viewmodel.dsl;

import androidx.lifecycle.ViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.DefinitionFactory;
import org.koin.core.definition.Kind;
import org.koin.core.definition.Options;
import org.koin.core.module.Module;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000B\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0002\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0004\u001a\u000e\u0010\u0005\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u0004\u001a`\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\b0\u0004\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\t*\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032)\b\b\u0010\u000e\u001a#\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u0002H\b0\u000fj\b\u0012\u0004\u0012\u0002H\b`\u0012¢\u0006\u0002\b\u0013H\b\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo51343d2 = {"ATTRIBUTE_VIEW_MODEL", "", "isViewModel", "", "Lorg/koin/core/definition/BeanDefinition;", "setIsViewModel", "", "viewModel", "T", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/module/Module;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "override", "definition", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/definition/Definition;", "Lkotlin/ExtensionFunctionType;", "koin-androidx-viewmodel_release"}, mo51344k = 2, mo51345mv = {1, 1, 15})
/* compiled from: ModuleExt.kt */
public final class ModuleExtKt {
    public static final String ATTRIBUTE_VIEW_MODEL = "isViewModel";

    static /* synthetic */ BeanDefinition viewModel$default(Module module, Qualifier qualifier, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        DefinitionFactory definitionFactory = DefinitionFactory.INSTANCE;
        Kind kind = Kind.Factory;
        Intrinsics.reifiedOperationMarker(4, "T");
        BeanDefinition beanDefinition = new BeanDefinition(qualifier, (Qualifier) null, Reflection.getOrCreateKotlinClass(Object.class));
        beanDefinition.setDefinition(function2);
        beanDefinition.setKind(kind);
        module.declareDefinition(beanDefinition, new Options(false, z, 1, (DefaultConstructorMarker) null));
        setIsViewModel(beanDefinition);
        return beanDefinition;
    }

    public static final void setIsViewModel(BeanDefinition<?> beanDefinition) {
        Intrinsics.checkParameterIsNotNull(beanDefinition, "$this$setIsViewModel");
        beanDefinition.getProperties().set(ATTRIBUTE_VIEW_MODEL, true);
    }

    public static final boolean isViewModel(BeanDefinition<?> beanDefinition) {
        Intrinsics.checkParameterIsNotNull(beanDefinition, "$this$isViewModel");
        Boolean bool = (Boolean) beanDefinition.getProperties().getOrNull(ATTRIBUTE_VIEW_MODEL);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final <T extends ViewModel> BeanDefinition<T> viewModel(Module module, Qualifier qualifier, boolean z, Function2<? super Scope, ? super DefinitionParameters, ? extends T> function2) {
        DefinitionFactory definitionFactory = DefinitionFactory.INSTANCE;
        Kind kind = Kind.Factory;
        Intrinsics.reifiedOperationMarker(4, "T");
        BeanDefinition<T> beanDefinition = new BeanDefinition<>(qualifier, (Qualifier) null, Reflection.getOrCreateKotlinClass(Object.class));
        beanDefinition.setDefinition(function2);
        beanDefinition.setKind(kind);
        module.declareDefinition(beanDefinition, new Options(false, z, 1, (DefaultConstructorMarker) null));
        setIsViewModel(beanDefinition);
        return beanDefinition;
    }
}
