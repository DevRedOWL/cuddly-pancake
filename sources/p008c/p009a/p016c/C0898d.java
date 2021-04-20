package p008c.p009a.p016c;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p008c.p009a.p010a.p013f.C0846a;
import p008c.p009a.p010a.p013f.C0847b;
import p008c.p009a.p024e.p026b.C0962a;

/* renamed from: c.a.c.d */
public final class C0898d extends Lambda implements Function2<Scope, DefinitionParameters, C0846a> {

    /* renamed from: a */
    public static final C0898d f888a = new C0898d();

    public C0898d() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        Scope scope = (Scope) obj;
        Intrinsics.checkNotNullParameter(scope, "$receiver");
        Intrinsics.checkNotNullParameter((DefinitionParameters) obj2, "it");
        return new C0847b((C0962a) scope.get((KClass<?>) Reflection.getOrCreateKotlinClass(C0962a.class), (Qualifier) null, (Function0<DefinitionParameters>) null));
    }
}
