package org.koin.core.registry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.koin.core.KoinApplication;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.error.DefinitionOverrideException;
import org.koin.core.error.NoBeanDefFoundException;
import org.koin.core.instance.DefinitionInstance;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.module.Module;
import org.koin.core.qualifier.Qualifier;
import org.koin.ext.KClassExtKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J,\u0010\u0012\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\rj\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005`\u000e2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002J\u0017\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0015H\u0000¢\u0006\u0002\b\u0016J$\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u000bJ\u0016\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\tH\u0002J\u001a\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002J\u001a\u0010\u001f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002J\u0010\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0015J\u0018\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u000bJ\u001c\u0010\"\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050#2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u000bJ\u0014\u0010$\u001a\u00020\u00112\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&J\u0014\u0010(\u001a\u00020\u00112\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J\u0014\u0010*\u001a\u00020\u00112\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J \u0010+\u001a\u00020\u00112\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u00052\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002J\u0014\u0010,\u001a\u00020\u00112\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J\u0014\u0010-\u001a\u00020\u00112\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J\u0010\u0010.\u001a\u00020\u00112\u0006\u0010/\u001a\u00020'H\u0002J\u0012\u00100\u001a\u00020\u00112\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0005J\u0014\u00101\u001a\u00020\u00112\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J \u00102\u001a\u00020\u00112\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u00052\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002J\u0014\u00103\u001a\u00020\u00112\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J\u0014\u00104\u001a\u00020\u00112\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J \u00105\u001a\u00020\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u000b2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J\u0014\u00106\u001a\u00020\u00112\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J\u0010\u00107\u001a\u00020\u00112\u0006\u0010/\u001a\u00020'H\u0002J\u0006\u00108\u001a\u000209J\u001b\u0010:\u001a\u00020\u00112\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&H\u0000¢\u0006\u0002\b;J0\u0010<\u001a\u00020\u0011*\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005`\u00062\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002R&\u0010\u0003\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005`\u0006X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\bX\u0004¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\bX\u0004¢\u0006\u0002\n\u0000R6\u0010\f\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u001c\u0012\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\rj\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005`\u000e0\bX\u0004¢\u0006\u0002\n\u0000R&\u0010\u000f\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005`\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006="}, mo51343d2 = {"Lorg/koin/core/registry/BeanRegistry;", "", "()V", "definitions", "Ljava/util/HashSet;", "Lorg/koin/core/definition/BeanDefinition;", "Lkotlin/collections/HashSet;", "definitionsNames", "", "", "definitionsPrimaryTypes", "Lkotlin/reflect/KClass;", "definitionsSecondaryTypes", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "definitionsToCreate", "close", "", "createSecondaryType", "type", "findAllCreatedAtStartDefinition", "", "findAllCreatedAtStartDefinition$koin_core", "findDefinition", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "clazz", "findDefinitionByName", "name", "findDefinitionBySecondaryType", "kClass", "findDefinitionByType", "getAllDefinitions", "getDefinition", "getDefinitionsForClass", "", "loadModules", "modules", "", "Lorg/koin/core/module/Module;", "removeDefinition", "definition", "removeDefinitionForName", "removeDefinitionForSecondaryType", "removeDefinitionForSecondaryTypes", "removeDefinitionForTypes", "removeDefinitions", "module", "saveDefinition", "saveDefinitionForName", "saveDefinitionForSecondaryType", "saveDefinitionForSecondaryTypes", "saveDefinitionForStart", "saveDefinitionForType", "saveDefinitionForTypes", "saveDefinitions", "size", "", "unloadModules", "unloadModules$koin_core", "addDefinition", "koin-core"}, mo51344k = 1, mo51345mv = {1, 1, 15})
/* compiled from: BeanRegistry.kt */
public final class BeanRegistry {
    private final HashSet<BeanDefinition<?>> definitions = new HashSet<>();
    private final Map<String, BeanDefinition<?>> definitionsNames = new ConcurrentHashMap();
    private final Map<KClass<?>, BeanDefinition<?>> definitionsPrimaryTypes = new ConcurrentHashMap();
    private final Map<KClass<?>, ArrayList<BeanDefinition<?>>> definitionsSecondaryTypes = new ConcurrentHashMap();
    private final HashSet<BeanDefinition<?>> definitionsToCreate = new HashSet<>();

    private final void removeDefinitions(Module module) {
        for (BeanDefinition removeDefinition : module.getDefinitions$koin_core()) {
            removeDefinition(removeDefinition);
        }
    }

    private final void saveDefinitions(Module module) {
        for (BeanDefinition saveDefinition : module.getDefinitions$koin_core()) {
            saveDefinition(saveDefinition);
        }
    }

    public final Set<BeanDefinition<?>> getAllDefinitions() {
        return this.definitions;
    }

    private final void removeDefinition(BeanDefinition<?> beanDefinition) {
        DefinitionInstance<?> instance = beanDefinition.getInstance();
        if (instance != null) {
            instance.close();
        }
        this.definitions.remove(beanDefinition);
        if (beanDefinition.getQualifier() != null) {
            removeDefinitionForName(beanDefinition);
        } else {
            removeDefinitionForTypes(beanDefinition);
        }
        removeDefinitionForSecondaryTypes(beanDefinition);
    }

    public final void saveDefinition(BeanDefinition<?> beanDefinition) {
        Intrinsics.checkParameterIsNotNull(beanDefinition, "definition");
        addDefinition(this.definitions, beanDefinition);
        beanDefinition.createInstanceHolder();
        if (beanDefinition.getQualifier() != null) {
            saveDefinitionForName(beanDefinition);
        } else {
            saveDefinitionForTypes(beanDefinition);
        }
        if (!beanDefinition.getSecondaryTypes().isEmpty()) {
            saveDefinitionForSecondaryTypes(beanDefinition);
        }
        if (beanDefinition.getOptions().isCreatedAtStart()) {
            saveDefinitionForStart(beanDefinition);
        }
    }

    private final void saveDefinitionForSecondaryTypes(BeanDefinition<?> beanDefinition) {
        for (KClass saveDefinitionForSecondaryType : beanDefinition.getSecondaryTypes()) {
            saveDefinitionForSecondaryType(beanDefinition, saveDefinitionForSecondaryType);
        }
    }

    private final void saveDefinitionForSecondaryType(BeanDefinition<?> beanDefinition, KClass<?> kClass) {
        ArrayList<BeanDefinition<?>> arrayList = this.definitionsSecondaryTypes.get(kClass);
        if (arrayList == null) {
            arrayList = createSecondaryType(kClass);
        }
        arrayList.add(beanDefinition);
        if (KoinApplication.Companion.getLogger().isAt(Level.INFO)) {
            Logger logger = KoinApplication.Companion.getLogger();
            logger.info("bind secondary type:'" + KClassExtKt.getFullName(kClass) + "' ~ " + beanDefinition);
        }
    }

    private final ArrayList<BeanDefinition<?>> createSecondaryType(KClass<?> kClass) {
        this.definitionsSecondaryTypes.put(kClass, new ArrayList());
        ArrayList<BeanDefinition<?>> arrayList = this.definitionsSecondaryTypes.get(kClass);
        if (arrayList == null) {
            Intrinsics.throwNpe();
        }
        return arrayList;
    }

    private final void saveDefinitionForStart(BeanDefinition<?> beanDefinition) {
        this.definitionsToCreate.add(beanDefinition);
    }

    private final void addDefinition(HashSet<BeanDefinition<?>> hashSet, BeanDefinition<?> beanDefinition) {
        if (!hashSet.add(beanDefinition) && !beanDefinition.getOptions().getOverride()) {
            throw new DefinitionOverrideException("Already existing definition or try to override an existing one: " + beanDefinition);
        }
    }

    private final void saveDefinitionForTypes(BeanDefinition<?> beanDefinition) {
        saveDefinitionForType(beanDefinition.getPrimaryType(), beanDefinition);
    }

    private final void removeDefinitionForSecondaryTypes(BeanDefinition<?> beanDefinition) {
        for (KClass removeDefinitionForSecondaryType : beanDefinition.getSecondaryTypes()) {
            removeDefinitionForSecondaryType(beanDefinition, removeDefinitionForSecondaryType);
        }
    }

    private final void removeDefinitionForSecondaryType(BeanDefinition<?> beanDefinition, KClass<?> kClass) {
        ArrayList arrayList = this.definitionsSecondaryTypes.get(kClass);
        boolean remove = arrayList != null ? arrayList.remove(beanDefinition) : false;
        if (KoinApplication.Companion.getLogger().isAt(Level.DEBUG) && remove) {
            Logger logger = KoinApplication.Companion.getLogger();
            logger.info("unbind secondary type:'" + KClassExtKt.getFullName(kClass) + "' ~ " + beanDefinition);
        }
    }

    private final void removeDefinitionForTypes(BeanDefinition<?> beanDefinition) {
        KClass<?> primaryType = beanDefinition.getPrimaryType();
        if (Intrinsics.areEqual((Object) this.definitionsPrimaryTypes.get(primaryType), (Object) beanDefinition)) {
            this.definitionsPrimaryTypes.remove(primaryType);
            if (KoinApplication.Companion.getLogger().isAt(Level.DEBUG)) {
                Logger logger = KoinApplication.Companion.getLogger();
                logger.info("unbind type:'" + KClassExtKt.getFullName(primaryType) + "' ~ " + beanDefinition);
            }
        }
    }

    private final void saveDefinitionForType(KClass<?> kClass, BeanDefinition<?> beanDefinition) {
        if (this.definitionsPrimaryTypes.get(kClass) == null || beanDefinition.getOptions().getOverride()) {
            this.definitionsPrimaryTypes.put(kClass, beanDefinition);
            if (KoinApplication.Companion.getLogger().isAt(Level.INFO)) {
                Logger logger = KoinApplication.Companion.getLogger();
                logger.info("bind type:'" + KClassExtKt.getFullName(kClass) + "' ~ " + beanDefinition);
                return;
            }
            return;
        }
        throw new DefinitionOverrideException("Already existing definition or try to override an existing one with type '" + kClass + "' and " + beanDefinition + " but has already registered " + this.definitionsPrimaryTypes.get(kClass));
    }

    private final void removeDefinitionForName(BeanDefinition<?> beanDefinition) {
        Qualifier qualifier = beanDefinition.getQualifier();
        if (qualifier != null) {
            String obj = qualifier.toString();
            if (Intrinsics.areEqual((Object) this.definitionsNames.get(obj), (Object) beanDefinition)) {
                this.definitionsNames.remove(obj);
                if (KoinApplication.Companion.getLogger().isAt(Level.DEBUG)) {
                    Logger logger = KoinApplication.Companion.getLogger();
                    logger.info("unbind qualifier:'" + obj + "' ~ " + beanDefinition);
                }
            }
        }
    }

    private final void saveDefinitionForName(BeanDefinition<?> beanDefinition) {
        Qualifier qualifier = beanDefinition.getQualifier();
        if (qualifier == null) {
            return;
        }
        if (this.definitionsNames.get(qualifier.toString()) == null || beanDefinition.getOptions().getOverride()) {
            this.definitionsNames.put(qualifier.toString(), beanDefinition);
            if (KoinApplication.Companion.getLogger().isAt(Level.INFO)) {
                Logger logger = KoinApplication.Companion.getLogger();
                logger.info("bind qualifier:'" + beanDefinition.getQualifier() + "' ~ " + beanDefinition);
                return;
            }
            return;
        }
        throw new DefinitionOverrideException("Already existing definition or try to override an existing one with qualifier '" + qualifier + "' with " + beanDefinition + " but has already registered " + this.definitionsNames.get(qualifier.toString()));
    }

    public static /* synthetic */ BeanDefinition findDefinition$default(BeanRegistry beanRegistry, Qualifier qualifier, KClass kClass, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        return beanRegistry.findDefinition(qualifier, kClass);
    }

    public final BeanDefinition<?> findDefinition(Qualifier qualifier, KClass<?> kClass) {
        Intrinsics.checkParameterIsNotNull(kClass, "clazz");
        if (qualifier != null) {
            return findDefinitionByName(qualifier.toString());
        }
        BeanDefinition<?> findDefinitionByType = findDefinitionByType(kClass);
        return findDefinitionByType != null ? findDefinitionByType : findDefinitionBySecondaryType(kClass);
    }

    private final BeanDefinition<?> findDefinitionByType(KClass<?> kClass) {
        return this.definitionsPrimaryTypes.get(kClass);
    }

    private final BeanDefinition<?> findDefinitionBySecondaryType(KClass<?> kClass) {
        ArrayList arrayList = this.definitionsSecondaryTypes.get(kClass);
        if (arrayList != null && arrayList.size() == 1) {
            return (BeanDefinition) arrayList.get(0);
        }
        if (arrayList == null || arrayList.size() <= 1) {
            return null;
        }
        throw new NoBeanDefFoundException("Found multiple definitions for type '" + KClassExtKt.getFullName(kClass) + "': " + arrayList + ". Please use the 'bind<P,S>()' function to bind your instance from primary and secondary types.");
    }

    private final BeanDefinition<?> findDefinitionByName(String str) {
        return this.definitionsNames.get(str);
    }

    public final Set<BeanDefinition<?>> findAllCreatedAtStartDefinition$koin_core() {
        return this.definitionsToCreate;
    }

    public final int size() {
        return this.definitions.size();
    }

    public final BeanDefinition<?> getDefinition(KClass<?> kClass) {
        Object obj;
        boolean z;
        Intrinsics.checkParameterIsNotNull(kClass, "clazz");
        Iterator it = this.definitions.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            BeanDefinition beanDefinition = (BeanDefinition) obj;
            if (Intrinsics.areEqual((Object) beanDefinition.getPrimaryType(), (Object) kClass) || beanDefinition.getSecondaryTypes().contains(kClass)) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (BeanDefinition) obj;
    }

    public final void close() {
        for (BeanDefinition close : this.definitions) {
            close.close();
        }
        this.definitions.clear();
        this.definitionsNames.clear();
        this.definitionsPrimaryTypes.clear();
        this.definitionsToCreate.clear();
    }

    public final List<BeanDefinition<?>> getDefinitionsForClass(KClass<?> kClass) {
        Intrinsics.checkParameterIsNotNull(kClass, "clazz");
        Collection arrayList = new ArrayList();
        for (Object next : getAllDefinitions()) {
            BeanDefinition beanDefinition = (BeanDefinition) next;
            if (Intrinsics.areEqual((Object) beanDefinition.getPrimaryType(), (Object) kClass) || (beanDefinition.getSecondaryTypes().contains(kClass) && !beanDefinition.hasScopeSet())) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    public final void loadModules(Iterable<Module> iterable) {
        Intrinsics.checkParameterIsNotNull(iterable, "modules");
        for (Module saveDefinitions : iterable) {
            saveDefinitions(saveDefinitions);
        }
    }

    public final void unloadModules$koin_core(Iterable<Module> iterable) {
        Intrinsics.checkParameterIsNotNull(iterable, "modules");
        for (Module removeDefinitions : iterable) {
            removeDefinitions(removeDefinitions);
        }
    }
}
