package org.koin.core;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.logger.EmptyLogger;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.logger.PrintLogger;
import org.koin.core.module.Module;
import org.koin.core.scope.ScopeDefinition;
import org.koin.core.time.MeasureKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u0000  2\u00020\u0001:\u0001 B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0000J\u0006\u0010\n\u001a\u00020\u0000J\u0010\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\rJ\r\u0010\u000e\u001a\u00020\bH\u0000¢\u0006\u0002\b\u000fJ\u0016\u0010\u0010\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u0014\u0010\u0011\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0016J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0013J\u0012\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007J\u001a\u0010\u001a\u001a\u00020\u00002\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00002\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u001e\"\u00020\u0013¢\u0006\u0002\u0010\u001fJ\u0014\u0010\u001d\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006!"}, mo51343d2 = {"Lorg/koin/core/KoinApplication;", "", "()V", "koin", "Lorg/koin/core/Koin;", "getKoin", "()Lorg/koin/core/Koin;", "close", "", "createEagerInstances", "environmentProperties", "fileProperties", "fileName", "", "loadDefaults", "loadDefaults$koin_core", "loadModulesAndScopes", "modules", "", "Lorg/koin/core/module/Module;", "logger", "Lorg/koin/core/logger/Logger;", "", "printLogger", "level", "Lorg/koin/core/logger/Level;", "properties", "values", "", "unloadModules", "", "([Lorg/koin/core/module/Module;)Lorg/koin/core/KoinApplication;", "Companion", "koin-core"}, mo51344k = 1, mo51345mv = {1, 1, 15})
/* compiled from: KoinApplication.kt */
public final class KoinApplication {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static Logger logger = new EmptyLogger();
    private final Koin koin;

    @JvmStatic
    public static final KoinApplication create() {
        return Companion.create();
    }

    public final KoinApplication printLogger() {
        return printLogger$default(this, (Level) null, 1, (Object) null);
    }

    private KoinApplication() {
        this.koin = new Koin();
    }

    public /* synthetic */ KoinApplication(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final Koin getKoin() {
        return this.koin;
    }

    public final void loadDefaults$koin_core() {
        this.koin.getScopeRegistry().loadDefaultScopes(this.koin);
    }

    public final KoinApplication modules(Module module) {
        Intrinsics.checkParameterIsNotNull(module, "modules");
        return modules((List<Module>) CollectionsKt.listOf(module));
    }

    public final KoinApplication modules(List<Module> list) {
        Intrinsics.checkParameterIsNotNull(list, "modules");
        if (logger.isAt(Level.INFO)) {
            double measureDurationOnly = MeasureKt.measureDurationOnly(new KoinApplication$modules$duration$1(this, list));
            int size = this.koin.getRootScope().getBeanRegistry().getAllDefinitions().size();
            Iterable<ScopeDefinition> scopeSets = this.koin.getScopeRegistry().getScopeSets();
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(scopeSets, 10));
            for (ScopeDefinition definitions : scopeSets) {
                arrayList.add(Integer.valueOf(definitions.getDefinitions().size()));
            }
            int sumOfInt = size + CollectionsKt.sumOfInt((List) arrayList);
            Logger logger2 = logger;
            logger2.info("total " + sumOfInt + " registered definitions");
            Logger logger3 = logger;
            logger3.info("load modules in " + measureDurationOnly + " ms");
        } else {
            loadModulesAndScopes(list);
        }
        return this;
    }

    /* access modifiers changed from: private */
    public final void loadModulesAndScopes(Iterable<Module> iterable) {
        this.koin.getRootScope().getBeanRegistry().loadModules(iterable);
        this.koin.getScopeRegistry().loadScopes$koin_core(iterable);
    }

    public final KoinApplication properties(Map<String, ? extends Object> map) {
        Intrinsics.checkParameterIsNotNull(map, "values");
        this.koin.getPropertyRegistry().saveProperties(map);
        return this;
    }

    public static /* synthetic */ KoinApplication fileProperties$default(KoinApplication koinApplication, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "/koin.properties";
        }
        return koinApplication.fileProperties(str);
    }

    public final KoinApplication fileProperties(String str) {
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        this.koin.getPropertyRegistry().loadPropertiesFromFile(str);
        return this;
    }

    public final KoinApplication environmentProperties() {
        this.koin.getPropertyRegistry().loadEnvironmentProperties();
        return this;
    }

    public final KoinApplication logger(Logger logger2) {
        Intrinsics.checkParameterIsNotNull(logger2, "logger");
        logger = logger2;
        return this;
    }

    public static /* synthetic */ KoinApplication printLogger$default(KoinApplication koinApplication, Level level, int i, Object obj) {
        if ((i & 1) != 0) {
            level = Level.INFO;
        }
        return koinApplication.printLogger(level);
    }

    public final KoinApplication printLogger(Level level) {
        Intrinsics.checkParameterIsNotNull(level, FirebaseAnalytics.Param.LEVEL);
        return logger(new PrintLogger(level));
    }

    public final KoinApplication createEagerInstances() {
        if (logger.isAt(Level.DEBUG)) {
            double measureDurationOnly = MeasureKt.measureDurationOnly(new KoinApplication$createEagerInstances$duration$1(this));
            Logger logger2 = logger;
            logger2.debug("instances started in " + measureDurationOnly + " ms");
        } else {
            this.koin.createEagerInstances$koin_core();
        }
        return this;
    }

    public final void close() {
        synchronized (this) {
            this.koin.close();
            if (logger.isAt(Level.INFO)) {
                logger.info("stopped");
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final KoinApplication unloadModules(Module... moduleArr) {
        Intrinsics.checkParameterIsNotNull(moduleArr, "modules");
        return unloadModules((List<Module>) ArraysKt.toList((T[]) moduleArr));
    }

    public final KoinApplication unloadModules(List<Module> list) {
        Intrinsics.checkParameterIsNotNull(list, "modules");
        Iterable iterable = list;
        this.koin.getRootScope().getBeanRegistry().unloadModules$koin_core(iterable);
        this.koin.getScopeRegistry().unloadScopedDefinitions$koin_core(iterable);
        return this;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo51343d2 = {"Lorg/koin/core/KoinApplication$Companion;", "", "()V", "logger", "Lorg/koin/core/logger/Logger;", "getLogger", "()Lorg/koin/core/logger/Logger;", "setLogger", "(Lorg/koin/core/logger/Logger;)V", "create", "Lorg/koin/core/KoinApplication;", "koin-core"}, mo51344k = 1, mo51345mv = {1, 1, 15})
    /* compiled from: KoinApplication.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger getLogger() {
            return KoinApplication.logger;
        }

        public final void setLogger(Logger logger) {
            Intrinsics.checkParameterIsNotNull(logger, "<set-?>");
            KoinApplication.logger = logger;
        }

        @JvmStatic
        public final KoinApplication create() {
            KoinApplication koinApplication = new KoinApplication((DefaultConstructorMarker) null);
            koinApplication.loadDefaults$koin_core();
            return koinApplication;
        }
    }
}
