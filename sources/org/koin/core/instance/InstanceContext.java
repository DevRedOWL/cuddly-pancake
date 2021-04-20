package org.koin.core.instance;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.koin.core.Koin;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.scope.Scope;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t¢\u0006\u0002\u0010\nR\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tX\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, mo51343d2 = {"Lorg/koin/core/instance/InstanceContext;", "", "koin", "Lorg/koin/core/Koin;", "scope", "Lorg/koin/core/scope/Scope;", "_parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lorg/koin/core/Koin;Lorg/koin/core/scope/Scope;Lkotlin/jvm/functions/Function0;)V", "getKoin", "()Lorg/koin/core/Koin;", "parameters", "getParameters", "()Lorg/koin/core/parameter/DefinitionParameters;", "getScope", "()Lorg/koin/core/scope/Scope;", "koin-core"}, mo51344k = 1, mo51345mv = {1, 1, 15})
/* compiled from: DefinitionInstance.kt */
public final class InstanceContext {
    private final Function0<DefinitionParameters> _parameters;
    private final Koin koin;
    private final DefinitionParameters parameters;
    private final Scope scope;

    public InstanceContext() {
        this((Koin) null, (Scope) null, (Function0) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = r1.invoke();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public InstanceContext(org.koin.core.Koin r1, org.koin.core.scope.Scope r2, kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.koin = r1
            r0.scope = r2
            r0._parameters = r3
            kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> r1 = r0._parameters
            if (r1 == 0) goto L_0x0016
            java.lang.Object r1 = r1.invoke()
            org.koin.core.parameter.DefinitionParameters r1 = (org.koin.core.parameter.DefinitionParameters) r1
            if (r1 == 0) goto L_0x0016
            goto L_0x001a
        L_0x0016:
            org.koin.core.parameter.DefinitionParameters r1 = org.koin.core.parameter.DefinitionParametersKt.emptyParametersHolder()
        L_0x001a:
            r0.parameters = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.koin.core.instance.InstanceContext.<init>(org.koin.core.Koin, org.koin.core.scope.Scope, kotlin.jvm.functions.Function0):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ InstanceContext(org.koin.core.Koin r2, org.koin.core.scope.Scope r3, kotlin.jvm.functions.Function0 r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r1 = this;
            r6 = r5 & 1
            r0 = 0
            if (r6 == 0) goto L_0x0008
            r2 = r0
            org.koin.core.Koin r2 = (org.koin.core.Koin) r2
        L_0x0008:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x0014
            if (r2 == 0) goto L_0x0013
            org.koin.core.scope.Scope r3 = r2.getRootScope()
            goto L_0x0014
        L_0x0013:
            r3 = r0
        L_0x0014:
            r5 = r5 & 4
            if (r5 == 0) goto L_0x001b
            r4 = r0
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
        L_0x001b:
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.koin.core.instance.InstanceContext.<init>(org.koin.core.Koin, org.koin.core.scope.Scope, kotlin.jvm.functions.Function0, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Koin getKoin() {
        return this.koin;
    }

    public final Scope getScope() {
        return this.scope;
    }

    public final DefinitionParameters getParameters() {
        return this.parameters;
    }
}
