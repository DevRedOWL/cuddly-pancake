package org.mobileid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p008c.p009a.p024e.p025a.C0959a;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000D\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0007\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;", "org/koin/core/scope/Scope$inject$1", "org/koin/core/KoinComponentKt$inject$$inlined$inject$3", "org/koin/core/KoinComponentKt$inject$$inlined$inject$4"}, mo51344k = 3, mo51345mv = {1, 4, 0}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
public final class Api$$special$$inlined$inject$4 extends Lambda implements Function0<C0959a> {
    public final /* synthetic */ Function0 $parameters;
    public final /* synthetic */ Qualifier $qualifier;
    public final /* synthetic */ Scope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Api$$special$$inlined$inject$4(Scope scope, Qualifier qualifier, Function0 function0) {
        super(0);
        this.this$0 = scope;
        this.$qualifier = qualifier;
        this.$parameters = function0;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, c.a.e.a.a] */
    public final C0959a invoke() {
        return this.this$0.get((KClass<?>) Reflection.getOrCreateKotlinClass(C0959a.class), this.$qualifier, (Function0<DefinitionParameters>) this.$parameters);
    }
}
