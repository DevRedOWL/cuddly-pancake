package org.koin.core.context;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.KoinApplication;
import org.koin.core.module.Module;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004\u001a#\u0010\u0006\u001a\u00020\u00072\u001b\u0010\b\u001a\u0017\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\tj\u0002`\n¢\u0006\u0002\b\u000b\u001a\u0006\u0010\f\u001a\u00020\u0001\u001a\u0014\u0010\r\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\u000e\u0010\r\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000e"}, mo51343d2 = {"loadKoinModules", "", "modules", "", "Lorg/koin/core/module/Module;", "module", "startKoin", "Lorg/koin/core/KoinApplication;", "appDeclaration", "Lkotlin/Function1;", "Lorg/koin/dsl/KoinAppDeclaration;", "Lkotlin/ExtensionFunctionType;", "stopKoin", "unloadKoinModules", "koin-core"}, mo51344k = 2, mo51345mv = {1, 1, 15})
/* compiled from: GlobalContext.kt */
public final class GlobalContextKt {
    public static final KoinApplication startKoin(Function1<? super KoinApplication, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "appDeclaration");
        KoinApplication create = KoinApplication.Companion.create();
        GlobalContext.start(create);
        function1.invoke(create);
        create.createEagerInstances();
        return create;
    }

    public static final void stopKoin() {
        GlobalContext.stop();
    }

    public static final void loadKoinModules(Module module) {
        Intrinsics.checkParameterIsNotNull(module, "module");
        GlobalContext.get().modules((List<Module>) CollectionsKt.listOf(module));
    }

    public static final void loadKoinModules(List<Module> list) {
        Intrinsics.checkParameterIsNotNull(list, "modules");
        GlobalContext.get().modules(list);
    }

    public static final void unloadKoinModules(Module module) {
        Intrinsics.checkParameterIsNotNull(module, "module");
        GlobalContext.get().unloadModules((List<Module>) CollectionsKt.listOf(module));
    }

    public static final void unloadKoinModules(List<Module> list) {
        Intrinsics.checkParameterIsNotNull(list, "modules");
        GlobalContext.get().unloadModules(list);
    }
}
