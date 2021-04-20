package org.koin.core;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.mobileid.access.key.PersonalKey;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a:\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00032\u0016\b\n\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007H\b¢\u0006\u0002\u0010\b\u001a>\u0010\t\u001a\u0002H\n\"\u0006\b\u0000\u0010\n\u0018\u0001*\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\n\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007H\b¢\u0006\u0002\u0010\r\u001a?\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\n0\u000f\"\u0006\b\u0000\u0010\n\u0018\u0001*\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\n\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007H\b¨\u0006\u0010"}, mo51343d2 = {"bind", "S", "P", "Lorg/koin/core/KoinComponent;", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lorg/koin/core/KoinComponent;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "get", "T", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "(Lorg/koin/core/KoinComponent;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "inject", "Lkotlin/Lazy;", "koin-core"}, mo51344k = 2, mo51345mv = {1, 1, 15})
/* compiled from: KoinComponent.kt */
public final class KoinComponentKt {
    static /* synthetic */ Object get$default(KoinComponent koinComponent, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Scope rootScope = koinComponent.getKoin().getRootScope();
        Intrinsics.reifiedOperationMarker(4, "T");
        return rootScope.get((KClass<?>) Reflection.getOrCreateKotlinClass(Object.class), qualifier, (Function0<DefinitionParameters>) function0);
    }

    private static final <T> T get(KoinComponent koinComponent, Qualifier qualifier, Function0<DefinitionParameters> function0) {
        Scope rootScope = koinComponent.getKoin().getRootScope();
        Intrinsics.reifiedOperationMarker(4, "T");
        return rootScope.get((KClass<?>) Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    static /* synthetic */ Lazy inject$default(KoinComponent koinComponent, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Scope rootScope = koinComponent.getKoin().getRootScope();
        Intrinsics.needClassReification();
        return LazyKt.lazy(new KoinComponentKt$inject$$inlined$inject$4(rootScope, qualifier, function0));
    }

    private static final <T> Lazy<T> inject(KoinComponent koinComponent, Qualifier qualifier, Function0<DefinitionParameters> function0) {
        Scope rootScope = koinComponent.getKoin().getRootScope();
        Intrinsics.needClassReification();
        return LazyKt.lazy(new KoinComponentKt$inject$$inlined$inject$2(rootScope, qualifier, function0));
    }

    static /* synthetic */ Object bind$default(KoinComponent koinComponent, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        Scope rootScope = koinComponent.getKoin().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.LATITUDE_SOUTH);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(4, PersonalKey.DEFAULT_PREFIX);
        return rootScope.bind(Reflection.getOrCreateKotlinClass(Object.class), orCreateKotlinClass, function0);
    }

    private static final <S, P> S bind(KoinComponent koinComponent, Function0<DefinitionParameters> function0) {
        Scope rootScope = koinComponent.getKoin().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.LATITUDE_SOUTH);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(4, PersonalKey.DEFAULT_PREFIX);
        return rootScope.bind(Reflection.getOrCreateKotlinClass(Object.class), orCreateKotlinClass, function0);
    }
}
