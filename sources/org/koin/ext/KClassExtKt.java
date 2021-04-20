package org.koin.ext;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0002\u001a\u0010\u0010\u0005\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0002H\u0002\"\u001e\u0010\u0000\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo51343d2 = {"classNames", "", "Lkotlin/reflect/KClass;", "", "getFullName", "saveFullName", "koin-core"}, mo51344k = 2, mo51345mv = {1, 1, 15})
/* compiled from: KClassExt.kt */
public final class KClassExtKt {
    private static final Map<KClass<?>, String> classNames = new ConcurrentHashMap();

    public static final String getFullName(KClass<?> kClass) {
        Intrinsics.checkParameterIsNotNull(kClass, "$this$getFullName");
        String str = classNames.get(kClass);
        return str != null ? str : saveFullName(kClass);
    }

    private static final String saveFullName(KClass<?> kClass) {
        String name = JvmClassMappingKt.getJavaClass(kClass).getName();
        Map<KClass<?>, String> map = classNames;
        Intrinsics.checkExpressionValueIsNotNull(name, "name");
        map.put(kClass, name);
        return name;
    }
}
