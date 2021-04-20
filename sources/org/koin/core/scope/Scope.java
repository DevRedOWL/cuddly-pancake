package org.koin.core.scope;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.DefinitionFactory;
import org.koin.core.definition.Kind;
import org.koin.core.error.MissingPropertyException;
import org.koin.core.error.NoBeanDefFoundException;
import org.koin.core.instance.DefinitionInstance;
import org.koin.core.instance.InstanceContext;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.registry.BeanRegistry;
import org.koin.core.time.MeasureKt;
import org.koin.ext.KClassExtKt;
import org.mobileid.access.key.PersonalKey;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ?\u0010\u001d\u001a\u0002H\u001e\"\u0004\b\u0000\u0010\u001e2\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030 2\n\u0010!\u001a\u0006\u0012\u0002\b\u00030 2\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0004\u0018\u0001`%¢\u0006\u0002\u0010&J6\u0010\u001d\u001a\u0002H\u001e\"\u0006\b\u0000\u0010\u001e\u0018\u0001\"\u0006\b\u0001\u0010'\u0018\u00012\u0016\b\n\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0004\u0018\u0001`%H\b¢\u0006\u0002\u0010(J\u0006\u0010)\u001a\u00020*J\r\u0010+\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\u000e\u0010-\u001a\u00020\bHÀ\u0003¢\u0006\u0002\b.J+\u0010/\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\r\u00100\u001a\u00020*H\u0000¢\u0006\u0002\b1J@\u00102\u001a\u00020*\"\u0006\b\u0000\u00103\u0018\u00012\u0006\u00104\u001a\u0002H32\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\u0014\b\u0002\u00107\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030 \u0018\u000108H\b¢\u0006\u0002\u00109J\r\u0010:\u001a\u00020*H\u0000¢\u0006\u0002\b;J\u0013\u0010<\u001a\u00020\u00062\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\"\u0010>\u001a\u0006\u0012\u0002\b\u00030?2\b\u00105\u001a\u0004\u0018\u0001062\n\u0010@\u001a\u0006\u0012\u0002\b\u00030 H\u0002JC\u0010A\u001a\u0002H3\"\u0004\b\u0000\u001032\n\u0010@\u001a\u0006\u0012\u0002\b\u00030B2\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0004\u0018\u0001`%H\u0007¢\u0006\u0002\u0010CJ=\u0010A\u001a\u0002H3\"\u0004\b\u0000\u001032\n\u0010@\u001a\u0006\u0012\u0002\b\u00030 2\b\u00105\u001a\u0004\u0018\u0001062\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0004\u0018\u0001`%¢\u0006\u0002\u0010DJ:\u0010A\u001a\u0002H3\"\u0006\b\u0000\u00103\u0018\u00012\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\u0016\b\n\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0004\u0018\u0001`%H\b¢\u0006\u0002\u0010EJ\u0017\u0010F\u001a\b\u0012\u0004\u0012\u0002H308\"\u0006\b\u0000\u00103\u0018\u0001H\bJ\u001e\u0010F\u001a\b\u0012\u0004\u0012\u0002H308\"\u0004\b\u0000\u001032\n\u0010@\u001a\u0006\u0012\u0002\b\u00030 J\u0006\u0010G\u001a\u00020\bJ<\u0010H\u001a\u0004\u0018\u0001H3\"\u0006\b\u0000\u00103\u0018\u00012\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\u0016\b\n\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0004\u0018\u0001`%H\b¢\u0006\u0002\u0010EJ\u0019\u0010I\u001a\u0002H3\"\u0004\b\u0000\u001032\u0006\u0010J\u001a\u00020\u0003¢\u0006\u0002\u0010KJ!\u0010I\u001a\u0002H3\"\u0004\b\u0000\u001032\u0006\u0010J\u001a\u00020\u00032\u0006\u0010L\u001a\u0002H3¢\u0006\u0002\u0010MJ\u001b\u0010N\u001a\u0004\u0018\u0001H3\"\u0004\b\u0000\u001032\u0006\u0010J\u001a\u00020\u0003¢\u0006\u0002\u0010KJ\u0012\u0010O\u001a\u00020\u00002\n\u0010P\u001a\u00060\u0003j\u0002`\u0004J\t\u0010Q\u001a\u00020RHÖ\u0001J;\u0010S\u001a\b\u0012\u0004\u0012\u0002H30T\"\u0006\b\u0000\u00103\u0018\u00012\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\u0016\b\n\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0004\u0018\u0001`%H\bJ=\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H30T\"\u0006\b\u0000\u00103\u0018\u00012\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\u0016\b\n\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0004\u0018\u0001`%H\bJ\u000e\u0010V\u001a\u00020*2\u0006\u0010W\u001a\u00020\u0012J?\u0010X\u001a\u0002H3\"\u0004\b\u0000\u001032\b\u00105\u001a\u0004\u0018\u0001062\n\u0010@\u001a\u0006\u0012\u0002\b\u00030 2\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0004\u0018\u0001`%H\u0002¢\u0006\u0002\u0010YJ\b\u0010Z\u001a\u00020\u0003H\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013X\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006["}, mo51343d2 = {"Lorg/koin/core/scope/Scope;", "", "id", "", "Lorg/koin/core/scope/ScopeID;", "isRoot", "", "_koin", "Lorg/koin/core/Koin;", "(Ljava/lang/String;ZLorg/koin/core/Koin;)V", "get_koin$koin_core", "()Lorg/koin/core/Koin;", "beanRegistry", "Lorg/koin/core/registry/BeanRegistry;", "getBeanRegistry", "()Lorg/koin/core/registry/BeanRegistry;", "callbacks", "Ljava/util/ArrayList;", "Lorg/koin/core/scope/ScopeCallback;", "Lkotlin/collections/ArrayList;", "getId", "()Ljava/lang/String;", "()Z", "scopeDefinition", "Lorg/koin/core/scope/ScopeDefinition;", "getScopeDefinition", "()Lorg/koin/core/scope/ScopeDefinition;", "setScopeDefinition", "(Lorg/koin/core/scope/ScopeDefinition;)V", "bind", "S", "primaryType", "Lkotlin/reflect/KClass;", "secondaryType", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "P", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "close", "", "component1", "component2", "component3", "component3$koin_core", "copy", "createEagerInstances", "createEagerInstances$koin_core", "declare", "T", "instance", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "secondaryTypes", "", "(Ljava/lang/Object;Lorg/koin/core/qualifier/Qualifier;Ljava/util/List;)V", "declareDefinitionsFromScopeSet", "declareDefinitionsFromScopeSet$koin_core", "equals", "other", "findDefinition", "Lorg/koin/core/definition/BeanDefinition;", "clazz", "get", "Ljava/lang/Class;", "(Ljava/lang/Class;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getAll", "getKoin", "getOrNull", "getProperty", "key", "(Ljava/lang/String;)Ljava/lang/Object;", "defaultValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getPropertyOrNull", "getScope", "scopeID", "hashCode", "", "inject", "Lkotlin/Lazy;", "injectOrNull", "registerCallback", "callback", "resolveInstance", "(Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "toString", "koin-core"}, mo51344k = 1, mo51345mv = {1, 1, 15})
/* compiled from: Scope.kt */
public final class Scope {
    private final Koin _koin;
    private final BeanRegistry beanRegistry;
    private final ArrayList<ScopeCallback> callbacks;

    /* renamed from: id */
    private final String f6314id;
    private final boolean isRoot;
    private ScopeDefinition scopeDefinition;

    public static /* synthetic */ Scope copy$default(Scope scope, String str, boolean z, Koin koin, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scope.f6314id;
        }
        if ((i & 2) != 0) {
            z = scope.isRoot;
        }
        if ((i & 4) != 0) {
            koin = scope._koin;
        }
        return scope.copy(str, z, koin);
    }

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

    public final String component1() {
        return this.f6314id;
    }

    public final boolean component2() {
        return this.isRoot;
    }

    public final Koin component3$koin_core() {
        return this._koin;
    }

    public final Scope copy(String str, boolean z, Koin koin) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(koin, "_koin");
        return new Scope(str, z, koin);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Scope) {
                Scope scope = (Scope) obj;
                if (Intrinsics.areEqual((Object) this.f6314id, (Object) scope.f6314id)) {
                    if (!(this.isRoot == scope.isRoot) || !Intrinsics.areEqual((Object) this._koin, (Object) scope._koin)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final <T> T get(Class<?> cls) {
        return get$default(this, cls, (Qualifier) null, (Function0) null, 6, (Object) null);
    }

    public final <T> T get(Class<?> cls, Qualifier qualifier) {
        return get$default(this, cls, qualifier, (Function0) null, 4, (Object) null);
    }

    public int hashCode() {
        String str = this.f6314id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.isRoot;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        Koin koin = this._koin;
        if (koin != null) {
            i = koin.hashCode();
        }
        return i2 + i;
    }

    public Scope(String str, boolean z, Koin koin) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(koin, "_koin");
        this.f6314id = str;
        this.isRoot = z;
        this._koin = koin;
        this.beanRegistry = new BeanRegistry();
        this.callbacks = new ArrayList<>();
    }

    public final String getId() {
        return this.f6314id;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Scope(String str, boolean z, Koin koin, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, koin);
    }

    public final boolean isRoot() {
        return this.isRoot;
    }

    public final Koin get_koin$koin_core() {
        return this._koin;
    }

    public final BeanRegistry getBeanRegistry() {
        return this.beanRegistry;
    }

    public final ScopeDefinition getScopeDefinition() {
        return this.scopeDefinition;
    }

    public final void setScopeDefinition(ScopeDefinition scopeDefinition2) {
        this.scopeDefinition = scopeDefinition2;
    }

    static /* synthetic */ Lazy inject$default(Scope scope, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Intrinsics.needClassReification();
        return LazyKt.lazy(new Scope$inject$1(scope, qualifier, function0));
    }

    private final <T> Lazy<T> inject(Qualifier qualifier, Function0<DefinitionParameters> function0) {
        Intrinsics.needClassReification();
        return LazyKt.lazy(new Scope$inject$1(this, qualifier, function0));
    }

    static /* synthetic */ Lazy injectOrNull$default(Scope scope, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Intrinsics.needClassReification();
        return LazyKt.lazy(new Scope$injectOrNull$1(scope, qualifier, function0));
    }

    private final <T> Lazy<T> injectOrNull(Qualifier qualifier, Function0<DefinitionParameters> function0) {
        Intrinsics.needClassReification();
        return LazyKt.lazy(new Scope$injectOrNull$1(this, qualifier, function0));
    }

    static /* synthetic */ Object get$default(Scope scope, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Intrinsics.reifiedOperationMarker(4, "T");
        return scope.get((KClass<?>) Reflection.getOrCreateKotlinClass(Object.class), qualifier, (Function0<DefinitionParameters>) function0);
    }

    private final <T> T get(Qualifier qualifier, Function0<DefinitionParameters> function0) {
        Intrinsics.reifiedOperationMarker(4, "T");
        return get((KClass<?>) Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    static /* synthetic */ Object getOrNull$default(Scope scope, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        try {
            Intrinsics.reifiedOperationMarker(4, "T");
            return scope.get((KClass<?>) Reflection.getOrCreateKotlinClass(Object.class), qualifier, (Function0<DefinitionParameters>) function0);
        } catch (Exception unused) {
            Logger logger = KoinApplication.Companion.getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append("Can't get instance for ");
            Intrinsics.reifiedOperationMarker(4, "T");
            sb.append(KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(Object.class)));
            logger.error(sb.toString());
            return null;
        }
    }

    private final <T> T getOrNull(Qualifier qualifier, Function0<DefinitionParameters> function0) {
        try {
            Intrinsics.reifiedOperationMarker(4, "T");
            return get((KClass<?>) Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
        } catch (Exception unused) {
            Logger logger = KoinApplication.Companion.getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append("Can't get instance for ");
            Intrinsics.reifiedOperationMarker(4, "T");
            sb.append(KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(Object.class)));
            logger.error(sb.toString());
            return null;
        }
    }

    public final <T> T get(KClass<?> kClass, Qualifier qualifier, Function0<DefinitionParameters> function0) {
        Intrinsics.checkParameterIsNotNull(kClass, "clazz");
        synchronized (this) {
            if (KoinApplication.Companion.getLogger().isAt(Level.DEBUG)) {
                Logger logger = KoinApplication.Companion.getLogger();
                logger.debug("+- get '" + KClassExtKt.getFullName(kClass) + '\'');
                Pair measureDuration = MeasureKt.measureDuration(new Scope$get$$inlined$synchronized$lambda$1(this, kClass, qualifier, function0));
                T component1 = measureDuration.component1();
                double doubleValue = ((Number) measureDuration.component2()).doubleValue();
                Logger logger2 = KoinApplication.Companion.getLogger();
                logger2.debug("+- got '" + KClassExtKt.getFullName(kClass) + "' in " + doubleValue + " ms");
                return component1;
            }
            T resolveInstance = resolveInstance(qualifier, kClass, function0);
            return resolveInstance;
        }
    }

    public static /* synthetic */ Object get$default(Scope scope, Class cls, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return scope.get((Class<?>) cls, qualifier, (Function0<DefinitionParameters>) function0);
    }

    public final <T> T get(Class<?> cls, Qualifier qualifier, Function0<DefinitionParameters> function0) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        synchronized (this) {
            KClass<?> kotlinClass = JvmClassMappingKt.getKotlinClass(cls);
            if (KoinApplication.Companion.getLogger().isAt(Level.DEBUG)) {
                Logger logger = KoinApplication.Companion.getLogger();
                logger.debug("+- get '" + KClassExtKt.getFullName(kotlinClass) + '\'');
                Pair measureDuration = MeasureKt.measureDuration(new Scope$get$$inlined$synchronized$lambda$2(kotlinClass, this, cls, qualifier, function0));
                T component1 = measureDuration.component1();
                double doubleValue = ((Number) measureDuration.component2()).doubleValue();
                Logger logger2 = KoinApplication.Companion.getLogger();
                logger2.debug("+- got '" + KClassExtKt.getFullName(kotlinClass) + "' in " + doubleValue + " ms");
                return component1;
            }
            T resolveInstance = resolveInstance(qualifier, kotlinClass, function0);
            return resolveInstance;
        }
    }

    /* access modifiers changed from: private */
    public final <T> T resolveInstance(Qualifier qualifier, KClass<?> kClass, Function0<DefinitionParameters> function0) {
        return findDefinition(qualifier, kClass).resolveInstance(new InstanceContext(this._koin, this, function0));
    }

    private final BeanDefinition<?> findDefinition(Qualifier qualifier, KClass<?> kClass) {
        BeanDefinition<?> findDefinition = this.beanRegistry.findDefinition(qualifier, kClass);
        if (findDefinition != null) {
            return findDefinition;
        }
        if (!this.isRoot) {
            return this._koin.getRootScope().findDefinition(qualifier, kClass);
        }
        throw new NoBeanDefFoundException("No definition found for '" + KClassExtKt.getFullName(kClass) + "' has been found. Check your module definitions.");
    }

    public final void createEagerInstances$koin_core() {
        if (this.isRoot) {
            Set<BeanDefinition<?>> findAllCreatedAtStartDefinition$koin_core = this.beanRegistry.findAllCreatedAtStartDefinition$koin_core();
            if (!findAllCreatedAtStartDefinition$koin_core.isEmpty()) {
                for (BeanDefinition resolveInstance : findAllCreatedAtStartDefinition$koin_core) {
                    resolveInstance.resolveInstance(new InstanceContext(this._koin, this, (Function0) null, 4, (DefaultConstructorMarker) null));
                }
            }
        }
    }

    static /* synthetic */ void declare$default(Scope scope, Object obj, Qualifier qualifier, List list, int i, Object obj2) {
        BeanDefinition beanDefinition;
        Qualifier qualifier2 = null;
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        if (scope.isRoot()) {
            DefinitionFactory definitionFactory = DefinitionFactory.INSTANCE;
            Kind kind = Kind.Single;
            Intrinsics.reifiedOperationMarker(4, "T");
            beanDefinition = new BeanDefinition(qualifier, (Qualifier) null, Reflection.getOrCreateKotlinClass(Object.class));
            beanDefinition.setDefinition(new Scope$declare$definition$1(obj));
            beanDefinition.setKind(kind);
        } else {
            DefinitionFactory definitionFactory2 = DefinitionFactory.INSTANCE;
            ScopeDefinition scopeDefinition2 = scope.getScopeDefinition();
            if (scopeDefinition2 != null) {
                qualifier2 = scopeDefinition2.getQualifier();
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
        scope.getBeanRegistry().saveDefinition(beanDefinition);
    }

    private final <T> void declare(T t, Qualifier qualifier, List<? extends KClass<?>> list) {
        BeanDefinition beanDefinition;
        Qualifier qualifier2 = null;
        if (isRoot()) {
            DefinitionFactory definitionFactory = DefinitionFactory.INSTANCE;
            Kind kind = Kind.Single;
            Intrinsics.reifiedOperationMarker(4, "T");
            beanDefinition = new BeanDefinition(qualifier, (Qualifier) null, Reflection.getOrCreateKotlinClass(Object.class));
            beanDefinition.setDefinition(new Scope$declare$definition$1(t));
            beanDefinition.setKind(kind);
        } else {
            DefinitionFactory definitionFactory2 = DefinitionFactory.INSTANCE;
            ScopeDefinition scopeDefinition2 = getScopeDefinition();
            if (scopeDefinition2 != null) {
                qualifier2 = scopeDefinition2.getQualifier();
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
        getBeanRegistry().saveDefinition(beanDefinition);
    }

    public final Koin getKoin() {
        return this._koin;
    }

    public final Scope getScope(String str) {
        Intrinsics.checkParameterIsNotNull(str, "scopeID");
        return getKoin().getScope(str);
    }

    public final void registerCallback(ScopeCallback scopeCallback) {
        Intrinsics.checkParameterIsNotNull(scopeCallback, "callback");
        this.callbacks.add(scopeCallback);
    }

    private final <T> List<T> getAll() {
        Intrinsics.reifiedOperationMarker(4, "T");
        return getAll(Reflection.getOrCreateKotlinClass(Object.class));
    }

    public final <T> List<T> getAll(KClass<?> kClass) {
        Intrinsics.checkParameterIsNotNull(kClass, "clazz");
        Iterable<BeanDefinition> definitionsForClass = this.beanRegistry.getDefinitionsForClass(kClass);
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(definitionsForClass, 10));
        for (BeanDefinition instance : definitionsForClass) {
            DefinitionInstance instance2 = instance.getInstance();
            if (instance2 == null) {
                Intrinsics.throwNpe();
            }
            arrayList.add(instance2.get(new InstanceContext(this._koin, this, (Function0) null, 4, (DefaultConstructorMarker) null)));
        }
        return (List) arrayList;
    }

    static /* synthetic */ Object bind$default(Scope scope, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.LATITUDE_SOUTH);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(4, PersonalKey.DEFAULT_PREFIX);
        return scope.bind(Reflection.getOrCreateKotlinClass(Object.class), orCreateKotlinClass, function0);
    }

    private final <S, P> S bind(Function0<DefinitionParameters> function0) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.LATITUDE_SOUTH);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(4, PersonalKey.DEFAULT_PREFIX);
        return bind(Reflection.getOrCreateKotlinClass(Object.class), orCreateKotlinClass, function0);
    }

    public final <S> S bind(KClass<?> kClass, KClass<?> kClass2, Function0<DefinitionParameters> function0) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(kClass, "primaryType");
        Intrinsics.checkParameterIsNotNull(kClass2, "secondaryType");
        for (BeanDefinition beanDefinition : this.beanRegistry.getAllDefinitions()) {
            if (!Intrinsics.areEqual((Object) beanDefinition.getPrimaryType(), (Object) kClass) || !beanDefinition.getSecondaryTypes().contains(kClass2)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                DefinitionInstance instance = beanDefinition.getInstance();
                if (instance == null) {
                    Intrinsics.throwNpe();
                }
                return instance.get(new InstanceContext(getKoin(), this, function0));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final <T> T getProperty(String str, T t) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        return this._koin.getProperty(str, t);
    }

    public final <T> T getPropertyOrNull(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        return this._koin.getProperty(str);
    }

    public final <T> T getProperty(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        T property = this._koin.getProperty(str);
        if (property != null) {
            return property;
        }
        throw new MissingPropertyException("Property '" + str + "' not found");
    }

    public final void declareDefinitionsFromScopeSet$koin_core() {
        HashSet<BeanDefinition<?>> definitions;
        ScopeDefinition scopeDefinition2 = this.scopeDefinition;
        if (scopeDefinition2 != null && (definitions = scopeDefinition2.getDefinitions()) != null) {
            for (BeanDefinition beanDefinition : definitions) {
                this.beanRegistry.saveDefinition(beanDefinition);
                beanDefinition.createInstanceHolder();
            }
        }
    }

    public final void close() {
        synchronized (this) {
            if (KoinApplication.Companion.getLogger().isAt(Level.DEBUG)) {
                Logger logger = KoinApplication.Companion.getLogger();
                logger.info("closing scope:'" + this.f6314id + '\'');
            }
            for (ScopeCallback onScopeClose : this.callbacks) {
                onScopeClose.onScopeClose(this);
            }
            this.callbacks.clear();
            ScopeDefinition scopeDefinition2 = this.scopeDefinition;
            if (scopeDefinition2 != null) {
                scopeDefinition2.release$koin_core(this);
            }
            this.beanRegistry.close();
            this._koin.deleteScope(this.f6314id);
            Unit unit = Unit.INSTANCE;
        }
    }

    public String toString() {
        ScopeDefinition scopeDefinition2 = this.scopeDefinition;
        StringBuilder sb = new StringBuilder();
        sb.append(",set:'");
        sb.append(scopeDefinition2 != null ? scopeDefinition2.getQualifier() : null);
        sb.append('\'');
        String sb2 = sb.toString();
        return "Scope[id:'" + this.f6314id + '\'' + sb2 + ']';
    }
}
