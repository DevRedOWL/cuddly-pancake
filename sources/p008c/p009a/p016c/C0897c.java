package p008c.p009a.p016c;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.mobileid.access.key.TimeKey;
import p008c.p009a.p024e.p030e.C0984b;

/* renamed from: c.a.c.c */
public final class C0897c extends Lambda implements Function2<Scope, DefinitionParameters, C0984b> {

    /* renamed from: a */
    public static final C0897c f887a = new C0897c();

    public C0897c() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        Scope scope = (Scope) obj;
        DefinitionParameters definitionParameters = (DefinitionParameters) obj2;
        Intrinsics.checkNotNullParameter(scope, "$receiver");
        Intrinsics.checkNotNullParameter(definitionParameters, "<name for destructuring parameter 0>");
        return new C0984b((Context) scope.get((KClass<?>) Reflection.getOrCreateKotlinClass(Context.class), (Qualifier) null, (Function0<DefinitionParameters>) null), (TimeKey) definitionParameters.component1());
    }
}
