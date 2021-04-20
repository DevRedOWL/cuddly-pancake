package p008c.p009a.p016c;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.mobileid.requester.web_service.simple_key.SimpleKeyWebService;
import p008c.p009a.p017d.p021d.C0946a;
import p008c.p009a.p017d.p021d.C0949d;
import p008c.p009a.p017d.p021d.p022e.C0950a;
import p008c.p009a.p024e.p026b.C0962a;

/* renamed from: c.a.c.l */
public final class C0906l extends Lambda implements Function2<Scope, DefinitionParameters, C0946a> {

    /* renamed from: a */
    public static final C0906l f896a = new C0906l();

    public C0906l() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        Scope scope = (Scope) obj;
        DefinitionParameters definitionParameters = (DefinitionParameters) obj2;
        Intrinsics.checkNotNullParameter(scope, "$receiver");
        Intrinsics.checkNotNullParameter(definitionParameters, "<name for destructuring parameter 0>");
        return new C0949d((C0950a) scope.get((KClass<?>) Reflection.getOrCreateKotlinClass(C0950a.class), (Qualifier) null, (Function0<DefinitionParameters>) null), (C0962a) scope.get((KClass<?>) Reflection.getOrCreateKotlinClass(C0962a.class), (Qualifier) null, (Function0<DefinitionParameters>) null), (SimpleKeyWebService) scope.get((KClass<?>) Reflection.getOrCreateKotlinClass(SimpleKeyWebService.class), (Qualifier) null, (Function0<DefinitionParameters>) null), (CoroutineScope) definitionParameters.component1());
    }
}
