package org.koin.core.qualifier;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\b\u001a\u000e\u0010\u0000\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, mo51343d2 = {"named", "Lorg/koin/core/qualifier/TypeQualifier;", "T", "Lorg/koin/core/qualifier/StringQualifier;", "name", "", "koin-core"}, mo51344k = 2, mo51345mv = {1, 1, 15})
/* compiled from: Qualifier.kt */
public final class QualifierKt {
    public static final StringQualifier named(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        return new StringQualifier(str);
    }

    private static final <T> TypeQualifier named() {
        Intrinsics.reifiedOperationMarker(4, "T");
        return new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class));
    }
}
