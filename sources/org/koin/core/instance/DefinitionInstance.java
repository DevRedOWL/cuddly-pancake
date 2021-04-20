package org.koin.core.instance;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.koin.core.KoinApplication;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.error.InstanceCreationException;
import org.koin.core.logger.Level;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.scope.Scope;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u0000 \u0012*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0012B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH&J\u001b\u0010\n\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\rJ\u001b\u0010\u000e\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u000b\u001a\u00020\fH&¢\u0006\u0002\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH&R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, mo51343d2 = {"Lorg/koin/core/instance/DefinitionInstance;", "T", "", "beanDefinition", "Lorg/koin/core/definition/BeanDefinition;", "(Lorg/koin/core/definition/BeanDefinition;)V", "getBeanDefinition", "()Lorg/koin/core/definition/BeanDefinition;", "close", "", "create", "context", "Lorg/koin/core/instance/InstanceContext;", "(Lorg/koin/core/instance/InstanceContext;)Ljava/lang/Object;", "get", "isCreated", "", "release", "Companion", "koin-core"}, mo51344k = 1, mo51345mv = {1, 1, 15})
/* compiled from: DefinitionInstance.kt */
public abstract class DefinitionInstance<T> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String ERROR_SEPARATOR = "\n\t";
    private final BeanDefinition<T> beanDefinition;

    public abstract void close();

    public abstract <T> T get(InstanceContext instanceContext);

    public abstract boolean isCreated(InstanceContext instanceContext);

    public abstract void release(InstanceContext instanceContext);

    public DefinitionInstance(BeanDefinition<T> beanDefinition2) {
        Intrinsics.checkParameterIsNotNull(beanDefinition2, "beanDefinition");
        this.beanDefinition = beanDefinition2;
    }

    public final BeanDefinition<T> getBeanDefinition() {
        return this.beanDefinition;
    }

    public <T> T create(InstanceContext instanceContext) {
        Intrinsics.checkParameterIsNotNull(instanceContext, "context");
        if (KoinApplication.Companion.getLogger().isAt(Level.DEBUG)) {
            KoinApplication.Companion.getLogger().debug("| create instance for " + this.beanDefinition);
        }
        try {
            DefinitionParameters parameters = instanceContext.getParameters();
            Function2<Scope, DefinitionParameters, T> definition = this.beanDefinition.getDefinition();
            Scope scope = instanceContext.getScope();
            if (scope != null) {
                return definition.invoke(scope, parameters);
            }
            throw new IllegalStateException("Can't execute definition instance while this context is not registered against any Koin instance".toString());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append(e.toString());
            sb.append(ERROR_SEPARATOR);
            StackTraceElement[] stackTrace = e.getStackTrace();
            Intrinsics.checkExpressionValueIsNotNull(stackTrace, "e.stackTrace");
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                Intrinsics.checkExpressionValueIsNotNull(stackTraceElement, "it");
                String className = stackTraceElement.getClassName();
                Intrinsics.checkExpressionValueIsNotNull(className, "it.className");
                if (!(!StringsKt.contains$default((CharSequence) className, (CharSequence) "sun.reflect", false, 2, (Object) null))) {
                    break;
                }
                arrayList.add(stackTraceElement);
            }
            sb.append(CollectionsKt.joinToString$default(arrayList, ERROR_SEPARATOR, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
            String sb2 = sb.toString();
            KoinApplication.Companion.getLogger().error("Instance creation error : could not create instance for " + this.beanDefinition + ": " + sb2);
            throw new InstanceCreationException("Could not create instance for " + this.beanDefinition, e);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo51343d2 = {"Lorg/koin/core/instance/DefinitionInstance$Companion;", "", "()V", "ERROR_SEPARATOR", "", "koin-core"}, mo51344k = 1, mo51345mv = {1, 1, 15})
    /* compiled from: DefinitionInstance.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
