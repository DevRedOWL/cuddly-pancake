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
import p008c.p009a.p024e.p025a.C0959a;

/* renamed from: c.a.c.i */
public final class C0903i extends Lambda implements Function2<Scope, DefinitionParameters, C0959a> {

    /* renamed from: a */
    public static final C0903i f893a = new C0903i();

    public C0903i() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        Scope scope = (Scope) obj;
        Intrinsics.checkNotNullParameter(scope, "$receiver");
        Intrinsics.checkNotNullParameter((DefinitionParameters) obj2, "it");
        return new C0959a((Context) scope.get((KClass<?>) Reflection.getOrCreateKotlinClass(Context.class), (Qualifier) null, (Function0<DefinitionParameters>) null));
    }
}
