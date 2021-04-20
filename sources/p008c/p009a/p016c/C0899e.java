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
import org.mobileid.time_key.web_service.TimeKeyWebService;
import p008c.p009a.p024e.p026b.C0962a;
import p008c.p009a.p024e.p026b.C0963b;
import p008c.p009a.p024e.p027c.C0972a;

/* renamed from: c.a.c.e */
public final class C0899e extends Lambda implements Function2<Scope, DefinitionParameters, C0962a> {

    /* renamed from: a */
    public static final C0899e f889a = new C0899e();

    public C0899e() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        Scope scope = (Scope) obj;
        Intrinsics.checkNotNullParameter(scope, "$receiver");
        Intrinsics.checkNotNullParameter((DefinitionParameters) obj2, "it");
        return new C0963b((Context) scope.get((KClass<?>) Reflection.getOrCreateKotlinClass(Context.class), (Qualifier) null, (Function0<DefinitionParameters>) null), (TimeKeyWebService) scope.get((KClass<?>) Reflection.getOrCreateKotlinClass(TimeKeyWebService.class), (Qualifier) null, (Function0<DefinitionParameters>) null), (C0972a) scope.get((KClass<?>) Reflection.getOrCreateKotlinClass(C0972a.class), (Qualifier) null, (Function0<DefinitionParameters>) null));
    }
}
