package org.koin.core.scope;

import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.Koin;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.instance.DefinitionInstance;
import org.koin.core.instance.InstanceContext;
import org.koin.core.qualifier.Qualifier;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\u0018J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R)\u0010\u0005\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007`\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001b"}, mo51343d2 = {"Lorg/koin/core/scope/ScopeDefinition;", "", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "(Lorg/koin/core/qualifier/Qualifier;)V", "definitions", "Ljava/util/HashSet;", "Lorg/koin/core/definition/BeanDefinition;", "Lkotlin/collections/HashSet;", "getDefinitions", "()Ljava/util/HashSet;", "getQualifier", "()Lorg/koin/core/qualifier/Qualifier;", "component1", "copy", "equals", "", "other", "hashCode", "", "release", "", "instance", "Lorg/koin/core/scope/Scope;", "release$koin_core", "toString", "", "koin-core"}, mo51344k = 1, mo51345mv = {1, 1, 15})
/* compiled from: ScopeDefinition.kt */
public final class ScopeDefinition {
    private final HashSet<BeanDefinition<?>> definitions = new HashSet<>();
    private final Qualifier qualifier;

    public static /* synthetic */ ScopeDefinition copy$default(ScopeDefinition scopeDefinition, Qualifier qualifier2, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier2 = scopeDefinition.qualifier;
        }
        return scopeDefinition.copy(qualifier2);
    }

    public final Qualifier component1() {
        return this.qualifier;
    }

    public final ScopeDefinition copy(Qualifier qualifier2) {
        Intrinsics.checkParameterIsNotNull(qualifier2, "qualifier");
        return new ScopeDefinition(qualifier2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ScopeDefinition) && Intrinsics.areEqual((Object) this.qualifier, (Object) ((ScopeDefinition) obj).qualifier);
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

    public String toString() {
        return "ScopeDefinition(qualifier=" + this.qualifier + ")";
    }

    public ScopeDefinition(Qualifier qualifier2) {
        Intrinsics.checkParameterIsNotNull(qualifier2, "qualifier");
        this.qualifier = qualifier2;
    }

    public final Qualifier getQualifier() {
        return this.qualifier;
    }

    public final HashSet<BeanDefinition<?>> getDefinitions() {
        return this.definitions;
    }

    public final void release$koin_core(Scope scope) {
        Intrinsics.checkParameterIsNotNull(scope, "instance");
        for (BeanDefinition instance : this.definitions) {
            DefinitionInstance instance2 = instance.getInstance();
            if (instance2 != null) {
                instance2.release(new InstanceContext((Koin) null, scope, (Function0) null, 5, (DefaultConstructorMarker) null));
            }
        }
    }
}
