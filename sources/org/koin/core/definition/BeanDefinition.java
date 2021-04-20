package org.koin.core.definition;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.koin.core.instance.DefinitionInstance;
import org.koin.core.instance.FactoryDefinitionInstance;
import org.koin.core.instance.InstanceContext;
import org.koin.core.instance.ScopeDefinitionInstance;
import org.koin.core.instance.SingleDefinitionInstance;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010C\u001a\u00020!J\u0006\u0010D\u001a\u00020!J\u0013\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010\u0002H\u0002J\u0006\u0010H\u001a\u00020FJ\b\u0010I\u001a\u00020JH\u0016J\u0019\u0010K\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010L\u001a\u00020M¢\u0006\u0002\u0010NJ\b\u0010O\u001a\u00020PH\u0016R;\u0010\t\u001a#\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\nj\b\u0012\u0004\u0012\u00028\u0000`\r¢\u0006\u0002\b\u000eX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR6\u0010\u001f\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020!\u0018\u00010 j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R6\u0010'\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020!\u0018\u00010 j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\u001a\u0010+\u001a\u00020,X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0015\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u001a\u00103\u001a\u000204X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010:R2\u0010<\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070=j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007`>X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006Q"}, mo51343d2 = {"Lorg/koin/core/definition/BeanDefinition;", "T", "", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "scopeName", "primaryType", "Lkotlin/reflect/KClass;", "(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V", "definition", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/definition/Definition;", "Lkotlin/ExtensionFunctionType;", "getDefinition", "()Lkotlin/jvm/functions/Function2;", "setDefinition", "(Lkotlin/jvm/functions/Function2;)V", "instance", "Lorg/koin/core/instance/DefinitionInstance;", "getInstance", "()Lorg/koin/core/instance/DefinitionInstance;", "setInstance", "(Lorg/koin/core/instance/DefinitionInstance;)V", "kind", "Lorg/koin/core/definition/Kind;", "getKind", "()Lorg/koin/core/definition/Kind;", "setKind", "(Lorg/koin/core/definition/Kind;)V", "onClose", "Lkotlin/Function1;", "", "Lorg/koin/core/definition/OnCloseCallback;", "getOnClose", "()Lkotlin/jvm/functions/Function1;", "setOnClose", "(Lkotlin/jvm/functions/Function1;)V", "onRelease", "Lorg/koin/core/definition/OnReleaseCallback;", "getOnRelease", "setOnRelease", "options", "Lorg/koin/core/definition/Options;", "getOptions", "()Lorg/koin/core/definition/Options;", "setOptions", "(Lorg/koin/core/definition/Options;)V", "getPrimaryType", "()Lkotlin/reflect/KClass;", "properties", "Lorg/koin/core/definition/Properties;", "getProperties", "()Lorg/koin/core/definition/Properties;", "setProperties", "(Lorg/koin/core/definition/Properties;)V", "getQualifier", "()Lorg/koin/core/qualifier/Qualifier;", "getScopeName", "secondaryTypes", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getSecondaryTypes", "()Ljava/util/ArrayList;", "setSecondaryTypes", "(Ljava/util/ArrayList;)V", "close", "createInstanceHolder", "equals", "", "other", "hasScopeSet", "hashCode", "", "resolveInstance", "context", "Lorg/koin/core/instance/InstanceContext;", "(Lorg/koin/core/instance/InstanceContext;)Ljava/lang/Object;", "toString", "", "koin-core"}, mo51344k = 1, mo51345mv = {1, 1, 15})
/* compiled from: BeanDefinition.kt */
public final class BeanDefinition<T> {
    public Function2<? super Scope, ? super DefinitionParameters, ? extends T> definition;
    private DefinitionInstance<T> instance;
    public Kind kind;
    private Function1<? super T, Unit> onClose;
    private Function1<? super T, Unit> onRelease;
    private Options options;
    private final KClass<?> primaryType;
    private Properties properties;
    private final Qualifier qualifier;
    private final Qualifier scopeName;
    private ArrayList<KClass<?>> secondaryTypes;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Kind.values().length];

        static {
            $EnumSwitchMapping$0[Kind.Single.ordinal()] = 1;
            $EnumSwitchMapping$0[Kind.Factory.ordinal()] = 2;
            $EnumSwitchMapping$0[Kind.Scoped.ordinal()] = 3;
        }
    }

    public BeanDefinition(Qualifier qualifier2, Qualifier qualifier3, KClass<?> kClass) {
        Intrinsics.checkParameterIsNotNull(kClass, "primaryType");
        this.qualifier = qualifier2;
        this.scopeName = qualifier3;
        this.primaryType = kClass;
        this.secondaryTypes = new ArrayList<>();
        this.options = new Options(false, false, 3, (DefaultConstructorMarker) null);
        this.properties = new Properties((Map) null, 1, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BeanDefinition(Qualifier qualifier2, Qualifier qualifier3, KClass kClass, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : qualifier2, (i & 2) != 0 ? null : qualifier3, kClass);
    }

    public final Qualifier getQualifier() {
        return this.qualifier;
    }

    public final Qualifier getScopeName() {
        return this.scopeName;
    }

    public final KClass<?> getPrimaryType() {
        return this.primaryType;
    }

    public final ArrayList<KClass<?>> getSecondaryTypes() {
        return this.secondaryTypes;
    }

    public final void setSecondaryTypes(ArrayList<KClass<?>> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.secondaryTypes = arrayList;
    }

    public final DefinitionInstance<T> getInstance() {
        return this.instance;
    }

    public final void setInstance(DefinitionInstance<T> definitionInstance) {
        this.instance = definitionInstance;
    }

    public final Function2<Scope, DefinitionParameters, T> getDefinition() {
        Function2<? super Scope, ? super DefinitionParameters, ? extends T> function2 = this.definition;
        if (function2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("definition");
        }
        return function2;
    }

    public final void setDefinition(Function2<? super Scope, ? super DefinitionParameters, ? extends T> function2) {
        Intrinsics.checkParameterIsNotNull(function2, "<set-?>");
        this.definition = function2;
    }

    public final Options getOptions() {
        return this.options;
    }

    public final void setOptions(Options options2) {
        Intrinsics.checkParameterIsNotNull(options2, "<set-?>");
        this.options = options2;
    }

    public final Properties getProperties() {
        return this.properties;
    }

    public final void setProperties(Properties properties2) {
        Intrinsics.checkParameterIsNotNull(properties2, "<set-?>");
        this.properties = properties2;
    }

    public final Kind getKind() {
        Kind kind2 = this.kind;
        if (kind2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kind");
        }
        return kind2;
    }

    public final void setKind(Kind kind2) {
        Intrinsics.checkParameterIsNotNull(kind2, "<set-?>");
        this.kind = kind2;
    }

    public final Function1<T, Unit> getOnRelease() {
        return this.onRelease;
    }

    public final void setOnRelease(Function1<? super T, Unit> function1) {
        this.onRelease = function1;
    }

    public final Function1<T, Unit> getOnClose() {
        return this.onClose;
    }

    public final void setOnClose(Function1<? super T, Unit> function1) {
        this.onClose = function1;
    }

    public final boolean hasScopeSet() {
        return this.scopeName != null;
    }

    public final void createInstanceHolder() {
        DefinitionInstance<T> definitionInstance;
        Kind kind2 = this.kind;
        if (kind2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kind");
        }
        int i = WhenMappings.$EnumSwitchMapping$0[kind2.ordinal()];
        if (i == 1) {
            definitionInstance = new SingleDefinitionInstance<>(this);
        } else if (i == 2) {
            definitionInstance = new FactoryDefinitionInstance<>(this);
        } else if (i == 3) {
            definitionInstance = new ScopeDefinitionInstance<>(this);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.instance = definitionInstance;
    }

    public final <T> T resolveInstance(InstanceContext instanceContext) {
        T t;
        Intrinsics.checkParameterIsNotNull(instanceContext, "context");
        DefinitionInstance<T> definitionInstance = this.instance;
        if (definitionInstance != null && (t = definitionInstance.get(instanceContext)) != null) {
            return t;
        }
        throw new IllegalStateException(("Definition without any InstanceContext - " + this).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0049, code lost:
        if (r2 != null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002b, code lost:
        if (r1 != null) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r14 = this;
            org.koin.core.definition.Kind r0 = r14.kind
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "kind"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0009:
            java.lang.String r0 = r0.toString()
            org.koin.core.qualifier.Qualifier r1 = r14.qualifier
            java.lang.String r2 = "', "
            java.lang.String r3 = ""
            if (r1 == 0) goto L_0x002e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "name:'"
            r1.append(r4)
            org.koin.core.qualifier.Qualifier r4 = r14.qualifier
            r1.append(r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r1 = r3
        L_0x002f:
            org.koin.core.qualifier.Qualifier r4 = r14.scopeName
            if (r4 == 0) goto L_0x004c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "scope:'"
            r4.append(r5)
            org.koin.core.qualifier.Qualifier r5 = r14.scopeName
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            if (r2 == 0) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            r2 = r3
        L_0x004d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "primary_type:'"
            r4.append(r5)
            kotlin.reflect.KClass<?> r5 = r14.primaryType
            java.lang.String r5 = org.koin.ext.KClassExtKt.getFullName(r5)
            r4.append(r5)
            r5 = 39
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.util.ArrayList<kotlin.reflect.KClass<?>> r5 = r14.secondaryTypes
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x00a0
            java.util.ArrayList<kotlin.reflect.KClass<?>> r3 = r14.secondaryTypes
            r5 = r3
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.lang.String r3 = ","
            r6 = r3
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            org.koin.core.definition.BeanDefinition$toString$defOtherTypes$typesAsString$1 r3 = org.koin.core.definition.BeanDefinition$toString$defOtherTypes$typesAsString$1.INSTANCE
            r11 = r3
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            r12 = 30
            r13 = 0
            java.lang.String r3 = kotlin.collections.CollectionsKt.joinToString$default(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = ", secondary_type:"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
        L_0x00a0:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[type:"
            r5.append(r6)
            r5.append(r0)
            r0 = 44
            r5.append(r0)
            r5.append(r2)
            r5.append(r1)
            r5.append(r4)
            r5.append(r3)
            r0 = 93
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.koin.core.definition.BeanDefinition.toString():java.lang.String");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual((Object) getClass(), (Object) obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            BeanDefinition beanDefinition = (BeanDefinition) obj;
            if (!(!Intrinsics.areEqual((Object) this.qualifier, (Object) beanDefinition.qualifier)) && !(!Intrinsics.areEqual((Object) this.primaryType, (Object) beanDefinition.primaryType))) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
    }

    public int hashCode() {
        Qualifier qualifier2 = this.qualifier;
        return ((qualifier2 != null ? qualifier2.hashCode() : 0) * 31) + this.primaryType.hashCode();
    }

    public final void close() {
        DefinitionInstance<T> definitionInstance = this.instance;
        if (definitionInstance != null) {
            definitionInstance.close();
        }
        this.instance = null;
    }
}
