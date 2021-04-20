package org.koin.core.module;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0004"}, mo51343d2 = {"plus", "", "Lorg/koin/core/module/Module;", "module", "koin-core"}, mo51344k = 2, mo51345mv = {1, 1, 15})
/* compiled from: Module.kt */
public final class ModuleKt {
    public static final List<Module> plus(List<Module> list, Module module) {
        Intrinsics.checkParameterIsNotNull(list, "$this$plus");
        Intrinsics.checkParameterIsNotNull(module, "module");
        return CollectionsKt.plus(list, CollectionsKt.listOf(module));
    }
}
