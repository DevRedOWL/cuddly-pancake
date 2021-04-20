package org.koin.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.DefinitionFactory;
import org.koin.core.definition.Kind;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.registry.PropertyRegistry;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.core.scope.Scope$declare$definition$1;
import org.koin.core.scope.Scope$declare$definition$2;
import org.koin.core.scope.ScopeDefinition;
import org.koin.ext.KClassExtKt;
import org.mobileid.access.key.PersonalKey;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JA\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00122\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\u0004\u0018\u0001`\u0017¢\u0006\u0002\u0010\u0018J6\u0010\u000f\u001a\u0002H\u0010\"\u0006\b\u0000\u0010\u0010\u0018\u0001\"\u0006\b\u0001\u0010\u0019\u0018\u00012\u0016\b\n\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\u0004\u0018\u0001`\u0017H\b¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\r\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0002\b\u001eJ\u001a\u0010\u001f\u001a\u00020\b2\n\u0010 \u001a\u00060!j\u0002`\"2\u0006\u0010#\u001a\u00020$J@\u0010%\u001a\u00020\u001c\"\u0006\b\u0000\u0010&\u0018\u00012\u0006\u0010'\u001a\u0002H&2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\u0014\b\u0002\u0010(\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0018\u00010)H\b¢\u0006\u0002\u0010*J\u0012\u0010+\u001a\u00020\u001c2\n\u0010 \u001a\u00060!j\u0002`\"J=\u0010,\u001a\u0002H&\"\u0004\b\u0000\u0010&2\n\u0010-\u001a\u0006\u0012\u0002\b\u00030\u00122\b\u0010#\u001a\u0004\u0018\u00010$2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\u0004\u0018\u0001`\u0017¢\u0006\u0002\u0010.J:\u0010,\u001a\u0002H&\"\u0006\b\u0000\u0010&\u0018\u00012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\u0016\b\n\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\u0004\u0018\u0001`\u0017H\b¢\u0006\u0002\u0010/J\u0017\u00100\u001a\b\u0012\u0004\u0012\u0002H&0)\"\u0006\b\u0000\u0010&\u0018\u0001H\bJ\u001a\u00101\u001a\u00020\b2\n\u0010 \u001a\u00060!j\u0002`\"2\u0006\u0010#\u001a\u00020$J<\u00102\u001a\u0004\u0018\u0001H&\"\u0006\b\u0000\u0010&\u0018\u00012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\u0016\b\n\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\u0004\u0018\u0001`\u0017H\b¢\u0006\u0002\u0010/J\u001b\u00103\u001a\u0004\u0018\u0001H&\"\u0004\b\u0000\u0010&2\u0006\u00104\u001a\u00020!¢\u0006\u0002\u00105J!\u00103\u001a\u0002H&\"\u0004\b\u0000\u0010&2\u0006\u00104\u001a\u00020!2\u0006\u00106\u001a\u0002H&¢\u0006\u0002\u00107J\u0012\u00108\u001a\u00020\b2\n\u0010 \u001a\u00060!j\u0002`\"J\u0014\u00109\u001a\u0004\u0018\u00010\b2\n\u0010 \u001a\u00060!j\u0002`\"J;\u0010:\u001a\b\u0012\u0004\u0012\u0002H&0;\"\u0006\b\u0000\u0010&\u0018\u00012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\u0016\b\n\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\u0004\u0018\u0001`\u0017H\bJ=\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H&0;\"\u0006\b\u0000\u0010&\u0018\u00012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\u0016\b\n\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\u0004\u0018\u0001`\u0017H\bJ%\u0010=\u001a\u00020\u001c\"\b\b\u0000\u0010&*\u00020\u00012\u0006\u00104\u001a\u00020!2\u0006\u0010>\u001a\u0002H&¢\u0006\u0002\u0010?R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006@"}, mo51343d2 = {"Lorg/koin/core/Koin;", "", "()V", "propertyRegistry", "Lorg/koin/core/registry/PropertyRegistry;", "getPropertyRegistry", "()Lorg/koin/core/registry/PropertyRegistry;", "rootScope", "Lorg/koin/core/scope/Scope;", "getRootScope", "()Lorg/koin/core/scope/Scope;", "scopeRegistry", "Lorg/koin/core/registry/ScopeRegistry;", "getScopeRegistry", "()Lorg/koin/core/registry/ScopeRegistry;", "bind", "S", "primaryType", "Lkotlin/reflect/KClass;", "secondaryType", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "P", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "close", "", "createEagerInstances", "createEagerInstances$koin_core", "createScope", "scopeId", "", "Lorg/koin/core/scope/ScopeID;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "declare", "T", "instance", "secondaryTypes", "", "(Ljava/lang/Object;Lorg/koin/core/qualifier/Qualifier;Ljava/util/List;)V", "deleteScope", "get", "clazz", "(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getAll", "getOrCreateScope", "getOrNull", "getProperty", "key", "(Ljava/lang/String;)Ljava/lang/Object;", "defaultValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getScope", "getScopeOrNull", "inject", "Lkotlin/Lazy;", "injectOrNull", "setProperty", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "koin-core"}, mo51344k = 1, mo51345mv = {1, 1, 15})
/* compiled from: Koin.kt */
public final class Koin {
    private final PropertyRegistry propertyRegistry = new PropertyRegistry();
    private final Scope rootScope = new Scope("-Root-", true, this);
    private final ScopeRegistry scopeRegistry = new ScopeRegistry();

    private final <T> T get() {
        return get$default(this, (Qualifier) null, (Function0) null, 3, (Object) null);
    }

    private final <T> T get(Qualifier qualifier) {
        return get$default(this, qualifier, (Function0) null, 2, (Object) null);
    }

    private final <T> T getOrNull() {
        return getOrNull$default(this, (Qualifier) null, (Function0) null, 3, (Object) null);
    }

    private final <T> T getOrNull(Qualifier qualifier) {
        return getOrNull$default(this, qualifier, (Function0) null, 2, (Object) null);
    }

    private final <T> Lazy<T> inject() {
        return inject$default(this, (Qualifier) null, (Function0) null, 3, (Object) null);
    }

    private final <T> Lazy<T> inject(Qualifier qualifier) {
        return inject$default(this, qualifier, (Function0) null, 2, (Object) null);
    }

    private final <T> Lazy<T> injectOrNull() {
        return injectOrNull$default(this, (Qualifier) null, (Function0) null, 3, (Object) null);
    }

    private final <T> Lazy<T> injectOrNull(Qualifier qualifier) {
        return injectOrNull$default(this, qualifier, (Function0) null, 2, (Object) null);
    }

    public final ScopeRegistry getScopeRegistry() {
        return this.scopeRegistry;
    }

    public final PropertyRegistry getPropertyRegistry() {
        return this.propertyRegistry;
    }

    public final Scope getRootScope() {
        return this.rootScope;
    }

    static /* synthetic */ Lazy inject$default(Koin koin, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Scope rootScope2 = koin.getRootScope();
        Intrinsics.needClassReification();
        return LazyKt.lazy(new Koin$inject$$inlined$inject$2(rootScope2, qualifier, function0));
    }

    private final <T> Lazy<T> inject(Qualifier qualifier, Function0<DefinitionParameters> function0) {
        Scope rootScope2 = getRootScope();
        Intrinsics.needClassReification();
        return LazyKt.lazy(new Koin$inject$$inlined$inject$1(rootScope2, qualifier, function0));
    }

    static /* synthetic */ Lazy injectOrNull$default(Koin koin, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Scope rootScope2 = koin.getRootScope();
        Intrinsics.needClassReification();
        return LazyKt.lazy(new Koin$injectOrNull$$inlined$injectOrNull$2(rootScope2, qualifier, function0));
    }

    private final <T> Lazy<T> injectOrNull(Qualifier qualifier, Function0<DefinitionParameters> function0) {
        Scope rootScope2 = getRootScope();
        Intrinsics.needClassReification();
        return LazyKt.lazy(new Koin$injectOrNull$$inlined$injectOrNull$1(rootScope2, qualifier, function0));
    }

    static /* synthetic */ Object get$default(Koin koin, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Scope rootScope2 = koin.getRootScope();
        Intrinsics.reifiedOperationMarker(4, "T");
        return rootScope2.get((KClass<?>) Reflection.getOrCreateKotlinClass(Object.class), qualifier, (Function0<DefinitionParameters>) function0);
    }

    private final <T> T get(Qualifier qualifier, Function0<DefinitionParameters> function0) {
        Scope rootScope2 = getRootScope();
        Intrinsics.reifiedOperationMarker(4, "T");
        return rootScope2.get((KClass<?>) Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    static /* synthetic */ Object getOrNull$default(Koin koin, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Scope rootScope2 = koin.getRootScope();
        try {
            Intrinsics.reifiedOperationMarker(4, "T?");
            return rootScope2.get((KClass<?>) Reflection.getOrCreateKotlinClass(Object.class), qualifier, (Function0<DefinitionParameters>) function0);
        } catch (Exception unused) {
            Logger logger = KoinApplication.Companion.getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append("Can't get instance for ");
            Intrinsics.reifiedOperationMarker(4, "T?");
            sb.append(KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(Object.class)));
            logger.error(sb.toString());
            return null;
        }
    }

    private final <T> T getOrNull(Qualifier qualifier, Function0<DefinitionParameters> function0) {
        Scope rootScope2 = getRootScope();
        try {
            Intrinsics.reifiedOperationMarker(4, "T?");
            return rootScope2.get((KClass<?>) Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
        } catch (Exception unused) {
            Logger logger = KoinApplication.Companion.getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append("Can't get instance for ");
            Intrinsics.reifiedOperationMarker(4, "T?");
            sb.append(KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(Object.class)));
            logger.error(sb.toString());
            return null;
        }
    }

    public final <T> T get(KClass<?> kClass, Qualifier qualifier, Function0<DefinitionParameters> function0) {
        Intrinsics.checkParameterIsNotNull(kClass, "clazz");
        return this.rootScope.get(kClass, qualifier, function0);
    }

    static /* synthetic */ void declare$default(Koin koin, Object obj, Qualifier qualifier, List list, int i, Object obj2) {
        BeanDefinition beanDefinition;
        Qualifier qualifier2 = null;
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        Scope rootScope2 = koin.getRootScope();
        if (rootScope2.isRoot()) {
            DefinitionFactory definitionFactory = DefinitionFactory.INSTANCE;
            Kind kind = Kind.Single;
            Intrinsics.reifiedOperationMarker(4, "T");
            beanDefinition = new BeanDefinition(qualifier, (Qualifier) null, Reflection.getOrCreateKotlinClass(Object.class));
            beanDefinition.setDefinition(new Scope$declare$definition$1(obj));
            beanDefinition.setKind(kind);
        } else {
            DefinitionFactory definitionFactory2 = DefinitionFactory.INSTANCE;
            ScopeDefinition scopeDefinition = rootScope2.getScopeDefinition();
            if (scopeDefinition != null) {
                qualifier2 = scopeDefinition.getQualifier();
            }
            Kind kind2 = Kind.Scoped;
            Intrinsics.reifiedOperationMarker(4, "T");
            beanDefinition = new BeanDefinition(qualifier, qualifier2, Reflection.getOrCreateKotlinClass(Object.class));
            beanDefinition.setDefinition(new Scope$declare$definition$2(obj));
            beanDefinition.setKind(kind2);
        }
        if (list != null) {
            beanDefinition.getSecondaryTypes().addAll(list);
        }
        rootScope2.getBeanRegistry().saveDefinition(beanDefinition);
    }

    private final <T> void declare(T t, Qualifier qualifier, List<? extends KClass<?>> list) {
        BeanDefinition beanDefinition;
        Scope rootScope2 = getRootScope();
        Qualifier qualifier2 = null;
        if (rootScope2.isRoot()) {
            DefinitionFactory definitionFactory = DefinitionFactory.INSTANCE;
            Kind kind = Kind.Single;
            Intrinsics.reifiedOperationMarker(4, "T");
            beanDefinition = new BeanDefinition(qualifier, (Qualifier) null, Reflection.getOrCreateKotlinClass(Object.class));
            beanDefinition.setDefinition(new Scope$declare$definition$1(t));
            beanDefinition.setKind(kind);
        } else {
            DefinitionFactory definitionFactory2 = DefinitionFactory.INSTANCE;
            ScopeDefinition scopeDefinition = rootScope2.getScopeDefinition();
            if (scopeDefinition != null) {
                qualifier2 = scopeDefinition.getQualifier();
            }
            Kind kind2 = Kind.Scoped;
            Intrinsics.reifiedOperationMarker(4, "T");
            beanDefinition = new BeanDefinition(qualifier, qualifier2, Reflection.getOrCreateKotlinClass(Object.class));
            beanDefinition.setDefinition(new Scope$declare$definition$2(t));
            beanDefinition.setKind(kind2);
        }
        if (list != null) {
            beanDefinition.getSecondaryTypes().addAll(list);
        }
        rootScope2.getBeanRegistry().saveDefinition(beanDefinition);
    }

    private final <T> List<T> getAll() {
        Scope rootScope2 = getRootScope();
        Intrinsics.reifiedOperationMarker(4, "T");
        return rootScope2.getAll(Reflection.getOrCreateKotlinClass(Object.class));
    }

    static /* synthetic */ Object bind$default(Koin koin, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        Scope rootScope2 = koin.getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.LATITUDE_SOUTH);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(4, PersonalKey.DEFAULT_PREFIX);
        return rootScope2.bind(Reflection.getOrCreateKotlinClass(Object.class), orCreateKotlinClass, function0);
    }

    private final <S, P> S bind(Function0<DefinitionParameters> function0) {
        Scope rootScope2 = getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.LATITUDE_SOUTH);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(4, PersonalKey.DEFAULT_PREFIX);
        return rootScope2.bind(Reflection.getOrCreateKotlinClass(Object.class), orCreateKotlinClass, function0);
    }

    public static /* synthetic */ Object bind$default(Koin koin, KClass kClass, KClass kClass2, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        return koin.bind(kClass, kClass2, function0);
    }

    public final <S> S bind(KClass<?> kClass, KClass<?> kClass2, Function0<DefinitionParameters> function0) {
        Intrinsics.checkParameterIsNotNull(kClass, "primaryType");
        Intrinsics.checkParameterIsNotNull(kClass2, "secondaryType");
        return this.rootScope.bind(kClass, kClass2, function0);
    }

    public final void createEagerInstances$koin_core() {
        this.rootScope.createEagerInstances$koin_core();
    }

    public final Scope createScope(String str, Qualifier qualifier) {
        Intrinsics.checkParameterIsNotNull(str, "scopeId");
        Intrinsics.checkParameterIsNotNull(qualifier, "qualifier");
        if (KoinApplication.Companion.getLogger().isAt(Level.DEBUG)) {
            Logger logger = KoinApplication.Companion.getLogger();
            logger.debug("!- create scope - id:" + str + " q:" + qualifier);
        }
        return this.scopeRegistry.createScopeInstance(this, str, qualifier);
    }

    public final Scope getOrCreateScope(String str, Qualifier qualifier) {
        Intrinsics.checkParameterIsNotNull(str, "scopeId");
        Intrinsics.checkParameterIsNotNull(qualifier, "qualifier");
        Scope scopeInstanceOrNull = this.scopeRegistry.getScopeInstanceOrNull(str);
        return scopeInstanceOrNull != null ? scopeInstanceOrNull : createScope(str, qualifier);
    }

    public final Scope getScope(String str) {
        Intrinsics.checkParameterIsNotNull(str, "scopeId");
        return this.scopeRegistry.getScopeInstance(str);
    }

    public final Scope getScopeOrNull(String str) {
        Intrinsics.checkParameterIsNotNull(str, "scopeId");
        return this.scopeRegistry.getScopeInstanceOrNull(str);
    }

    public final void deleteScope(String str) {
        Intrinsics.checkParameterIsNotNull(str, "scopeId");
        this.scopeRegistry.deleteScopeInstance(str);
    }

    public final <T> T getProperty(String str, T t) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        T property = this.propertyRegistry.getProperty(str);
        return property != null ? property : t;
    }

    public final <T> T getProperty(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        return this.propertyRegistry.getProperty(str);
    }

    public final <T> void setProperty(String str, T t) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(t, "value");
        this.propertyRegistry.saveProperty$koin_core(str, t);
    }

    public final void close() {
        this.scopeRegistry.close();
        this.rootScope.close();
        this.propertyRegistry.close();
    }
}
