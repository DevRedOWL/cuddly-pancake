package org.koin.core.definition;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J^\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0006\b\u0000\u0010\u0005\u0018\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072)\b\b\u0010\b\u001a#\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H\u00050\tj\b\u0012\u0004\u0012\u0002H\u0005`\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\bJZ\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0006\b\u0000\u0010\u0005\u0018\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072)\b\b\u0010\b\u001a#\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H\u00050\tj\b\u0012\u0004\u0012\u0002H\u0005`\f¢\u0006\u0002\b\rH\bJZ\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0006\b\u0000\u0010\u0005\u0018\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072)\b\b\u0010\b\u001a#\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H\u00050\tj\b\u0012\u0004\u0012\u0002H\u0005`\f¢\u0006\u0002\b\rH\bJZ\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0006\b\u0000\u0010\u0005\u0018\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072)\b\b\u0010\b\u001a#\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H\u00050\tj\b\u0012\u0004\u0012\u0002H\u0005`\f¢\u0006\u0002\b\rH\b¨\u0006\u0014"}, mo51343d2 = {"Lorg/koin/core/definition/DefinitionFactory;", "", "()V", "createDefinition", "Lorg/koin/core/definition/BeanDefinition;", "T", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "definition", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/definition/Definition;", "Lkotlin/ExtensionFunctionType;", "kind", "Lorg/koin/core/definition/Kind;", "scopeName", "createFactory", "createScoped", "createSingle", "koin-core"}, mo51344k = 1, mo51345mv = {1, 1, 15})
/* compiled from: DefinitionFactory.kt */
public final class DefinitionFactory {
    public static final DefinitionFactory INSTANCE = new DefinitionFactory();

    private DefinitionFactory() {
    }

    static /* synthetic */ BeanDefinition createSingle$default(DefinitionFactory definitionFactory, Qualifier qualifier, Qualifier qualifier2, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            qualifier2 = null;
        }
        Kind kind = Kind.Single;
        Intrinsics.reifiedOperationMarker(4, "T");
        BeanDefinition beanDefinition = new BeanDefinition(qualifier, qualifier2, Reflection.getOrCreateKotlinClass(Object.class));
        beanDefinition.setDefinition(function2);
        beanDefinition.setKind(kind);
        return beanDefinition;
    }

    private final <T> BeanDefinition<T> createSingle(Qualifier qualifier, Qualifier qualifier2, Function2<? super Scope, ? super DefinitionParameters, ? extends T> function2) {
        Kind kind = Kind.Single;
        Intrinsics.reifiedOperationMarker(4, "T");
        BeanDefinition<T> beanDefinition = new BeanDefinition<>(qualifier, qualifier2, Reflection.getOrCreateKotlinClass(Object.class));
        beanDefinition.setDefinition(function2);
        beanDefinition.setKind(kind);
        return beanDefinition;
    }

    static /* synthetic */ BeanDefinition createScoped$default(DefinitionFactory definitionFactory, Qualifier qualifier, Qualifier qualifier2, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            qualifier2 = null;
        }
        Kind kind = Kind.Scoped;
        Intrinsics.reifiedOperationMarker(4, "T");
        BeanDefinition beanDefinition = new BeanDefinition(qualifier, qualifier2, Reflection.getOrCreateKotlinClass(Object.class));
        beanDefinition.setDefinition(function2);
        beanDefinition.setKind(kind);
        return beanDefinition;
    }

    private final <T> BeanDefinition<T> createScoped(Qualifier qualifier, Qualifier qualifier2, Function2<? super Scope, ? super DefinitionParameters, ? extends T> function2) {
        Kind kind = Kind.Scoped;
        Intrinsics.reifiedOperationMarker(4, "T");
        BeanDefinition<T> beanDefinition = new BeanDefinition<>(qualifier, qualifier2, Reflection.getOrCreateKotlinClass(Object.class));
        beanDefinition.setDefinition(function2);
        beanDefinition.setKind(kind);
        return beanDefinition;
    }

    static /* synthetic */ BeanDefinition createFactory$default(DefinitionFactory definitionFactory, Qualifier qualifier, Qualifier qualifier2, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            qualifier2 = null;
        }
        Kind kind = Kind.Factory;
        Intrinsics.reifiedOperationMarker(4, "T");
        BeanDefinition beanDefinition = new BeanDefinition(qualifier, qualifier2, Reflection.getOrCreateKotlinClass(Object.class));
        beanDefinition.setDefinition(function2);
        beanDefinition.setKind(kind);
        return beanDefinition;
    }

    private final <T> BeanDefinition<T> createFactory(Qualifier qualifier, Qualifier qualifier2, Function2<? super Scope, ? super DefinitionParameters, ? extends T> function2) {
        Kind kind = Kind.Factory;
        Intrinsics.reifiedOperationMarker(4, "T");
        BeanDefinition<T> beanDefinition = new BeanDefinition<>(qualifier, qualifier2, Reflection.getOrCreateKotlinClass(Object.class));
        beanDefinition.setDefinition(function2);
        beanDefinition.setKind(kind);
        return beanDefinition;
    }

    private final <T> BeanDefinition<T> createDefinition(Qualifier qualifier, Function2<? super Scope, ? super DefinitionParameters, ? extends T> function2, Kind kind, Qualifier qualifier2) {
        Intrinsics.reifiedOperationMarker(4, "T");
        BeanDefinition<T> beanDefinition = new BeanDefinition<>(qualifier, qualifier2, Reflection.getOrCreateKotlinClass(Object.class));
        beanDefinition.setDefinition(function2);
        beanDefinition.setKind(kind);
        return beanDefinition;
    }
}
