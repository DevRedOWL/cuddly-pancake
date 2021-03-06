package org.koin.dsl;

import java.util.HashSet;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.DefinitionFactory;
import org.koin.core.definition.Kind;
import org.koin.core.definition.Options;
import org.koin.core.error.DefinitionOverrideException;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.core.scope.ScopeDefinition;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\"\u0010\u0011\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00072\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003JX\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0007\"\u0006\b\u0000\u0010\u0013\u0018\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00182)\b\b\u0010\u0014\u001a#\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u0002H\u00130\u001cj\b\u0012\u0004\u0012\u0002H\u0013`\u001f¢\u0006\u0002\b H\bJ\t\u0010!\u001a\u00020\"HÖ\u0001JX\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0007\"\u0006\b\u0000\u0010\u0013\u0018\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00182)\b\b\u0010\u0014\u001a#\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u0002H\u00130\u001cj\b\u0012\u0004\u0012\u0002H\u0013`\u001f¢\u0006\u0002\b H\bJX\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0007\"\u0006\b\u0000\u0010\u0013\u0018\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00182)\b\b\u0010\u0014\u001a#\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u0002H\u00130\u001cj\b\u0012\u0004\u0012\u0002H\u0013`\u001f¢\u0006\u0002\b H\bJ\b\u0010%\u001a\u00020&H\u0016J\u0018\u0010'\u001a\u00020\u0012*\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R)\u0010\u0005\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007`\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006("}, mo51343d2 = {"Lorg/koin/dsl/ScopeSet;", "", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "(Lorg/koin/core/qualifier/Qualifier;)V", "definitions", "Ljava/util/HashSet;", "Lorg/koin/core/definition/BeanDefinition;", "Lkotlin/collections/HashSet;", "getDefinitions", "()Ljava/util/HashSet;", "getQualifier", "()Lorg/koin/core/qualifier/Qualifier;", "component1", "copy", "createDefinition", "Lorg/koin/core/scope/ScopeDefinition;", "declareDefinition", "", "T", "definition", "options", "Lorg/koin/core/definition/Options;", "equals", "", "other", "factory", "override", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/definition/Definition;", "Lkotlin/ExtensionFunctionType;", "hashCode", "", "scoped", "single", "toString", "", "updateOptions", "koin-core"}, mo51344k = 1, mo51345mv = {1, 1, 15})
/* compiled from: ScopeSet.kt */
public final class ScopeSet {
    private final HashSet<BeanDefinition<?>> definitions = new HashSet<>();
    private final Qualifier qualifier;

    public static /* synthetic */ ScopeSet copy$default(ScopeSet scopeSet, Qualifier qualifier2, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier2 = scopeSet.qualifier;
        }
        return scopeSet.copy(qualifier2);
    }

    public final Qualifier component1() {
        return this.qualifier;
    }

    public final ScopeSet copy(Qualifier qualifier2) {
        Intrinsics.checkParameterIsNotNull(qualifier2, "qualifier");
        return new ScopeSet(qualifier2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ScopeSet) && Intrinsics.areEqual((Object) this.qualifier, (Object) ((ScopeSet) obj).qualifier);
        }
        return true;
    }

    public int hashCode() {
        Qualifier qualifier2 = this.qualifier;
        if (qualifier2 != null) {
            return qualifier2.hashCode();
        }
        return 0;
    }

    public ScopeSet(Qualifier qualifier2) {
        Intrinsics.checkParameterIsNotNull(qualifier2, "qualifier");
        this.qualifier = qualifier2;
    }

    public final Qualifier getQualifier() {
        return this.qualifier;
    }

    public final HashSet<BeanDefinition<?>> getDefinitions() {
        return this.definitions;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Can't use Single in a scope. Use Scoped instead")
    static /* synthetic */ BeanDefinition single$default(ScopeSet scopeSet, Qualifier qualifier2, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            Qualifier qualifier3 = null;
        }
        int i2 = i & 2;
        throw new IllegalStateException("Scoped definition is deprecated and has been replaced with Single scope definitions".toString());
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Can't use Single in a scope. Use Scoped instead")
    private final <T> BeanDefinition<T> single(Qualifier qualifier2, boolean z, Function2<? super Scope, ? super DefinitionParameters, ? extends T> function2) {
        throw new IllegalStateException("Scoped definition is deprecated and has been replaced with Single scope definitions".toString());
    }

    static /* synthetic */ BeanDefinition scoped$default(ScopeSet scopeSet, Qualifier qualifier2, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier2 = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        DefinitionFactory definitionFactory = DefinitionFactory.INSTANCE;
        Qualifier qualifier3 = scopeSet.getQualifier();
        Kind kind = Kind.Scoped;
        Intrinsics.reifiedOperationMarker(4, "T");
        BeanDefinition beanDefinition = new BeanDefinition(qualifier2, qualifier3, Reflection.getOrCreateKotlinClass(Object.class));
        beanDefinition.setDefinition(function2);
        beanDefinition.setKind(kind);
        scopeSet.declareDefinition(beanDefinition, new Options(false, z));
        if (!scopeSet.getDefinitions().contains(beanDefinition)) {
            scopeSet.getDefinitions().add(beanDefinition);
            return beanDefinition;
        }
        throw new DefinitionOverrideException("Can't add definition " + beanDefinition + " for scope " + scopeSet.getQualifier() + " as it already exists");
    }

    private final <T> BeanDefinition<T> scoped(Qualifier qualifier2, boolean z, Function2<? super Scope, ? super DefinitionParameters, ? extends T> function2) {
        DefinitionFactory definitionFactory = DefinitionFactory.INSTANCE;
        Qualifier qualifier3 = getQualifier();
        Kind kind = Kind.Scoped;
        Intrinsics.reifiedOperationMarker(4, "T");
        BeanDefinition<T> beanDefinition = new BeanDefinition<>(qualifier2, qualifier3, Reflection.getOrCreateKotlinClass(Object.class));
        beanDefinition.setDefinition(function2);
        beanDefinition.setKind(kind);
        declareDefinition(beanDefinition, new Options(false, z));
        if (!getDefinitions().contains(beanDefinition)) {
            getDefinitions().add(beanDefinition);
            return beanDefinition;
        }
        throw new DefinitionOverrideException("Can't add definition " + beanDefinition + " for scope " + getQualifier() + " as it already exists");
    }

    static /* synthetic */ BeanDefinition factory$default(ScopeSet scopeSet, Qualifier qualifier2, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier2 = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        DefinitionFactory definitionFactory = DefinitionFactory.INSTANCE;
        Qualifier qualifier3 = scopeSet.getQualifier();
        Kind kind = Kind.Factory;
        Intrinsics.reifiedOperationMarker(4, "T");
        BeanDefinition beanDefinition = new BeanDefinition(qualifier2, qualifier3, Reflection.getOrCreateKotlinClass(Object.class));
        beanDefinition.setDefinition(function2);
        beanDefinition.setKind(kind);
        scopeSet.declareDefinition(beanDefinition, new Options(false, z));
        if (!scopeSet.getDefinitions().contains(beanDefinition)) {
            scopeSet.getDefinitions().add(beanDefinition);
            return beanDefinition;
        }
        throw new DefinitionOverrideException("Can't add definition " + beanDefinition + " for scope " + scopeSet.getQualifier() + " as it already exists");
    }

    private final <T> BeanDefinition<T> factory(Qualifier qualifier2, boolean z, Function2<? super Scope, ? super DefinitionParameters, ? extends T> function2) {
        DefinitionFactory definitionFactory = DefinitionFactory.INSTANCE;
        Qualifier qualifier3 = getQualifier();
        Kind kind = Kind.Factory;
        Intrinsics.reifiedOperationMarker(4, "T");
        BeanDefinition<T> beanDefinition = new BeanDefinition<>(qualifier2, qualifier3, Reflection.getOrCreateKotlinClass(Object.class));
        beanDefinition.setDefinition(function2);
        beanDefinition.setKind(kind);
        declareDefinition(beanDefinition, new Options(false, z));
        if (!getDefinitions().contains(beanDefinition)) {
            getDefinitions().add(beanDefinition);
            return beanDefinition;
        }
        throw new DefinitionOverrideException("Can't add definition " + beanDefinition + " for scope " + getQualifier() + " as it already exists");
    }

    public final ScopeDefinition createDefinition() {
        ScopeDefinition scopeDefinition = new ScopeDefinition(this.qualifier);
        scopeDefinition.getDefinitions().addAll(this.definitions);
        return scopeDefinition;
    }

    public final <T> void declareDefinition(BeanDefinition<T> beanDefinition, Options options) {
        Intrinsics.checkParameterIsNotNull(beanDefinition, "definition");
        Intrinsics.checkParameterIsNotNull(options, "options");
        updateOptions(beanDefinition, options);
    }

    private final void updateOptions(BeanDefinition<?> beanDefinition, Options options) {
        beanDefinition.getOptions().setCreatedAtStart(options.isCreatedAtStart());
        beanDefinition.getOptions().setOverride(options.getOverride());
    }

    public String toString() {
        return "Scope['" + this.qualifier + "']";
    }
}
