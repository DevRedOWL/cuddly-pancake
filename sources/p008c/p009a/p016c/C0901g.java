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
import p008c.p009a.p024e.p027c.C0972a;
import p008c.p009a.p024e.p027c.C0973b;
import p008c.p009a.p024e.p029d.C0980a;

/* renamed from: c.a.c.g */
public final class C0901g extends Lambda implements Function2<Scope, DefinitionParameters, C0972a> {

    /* renamed from: a */
    public static final C0901g f891a = new C0901g();

    public C0901g() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        Scope scope = (Scope) obj;
        Intrinsics.checkNotNullParameter(scope, "$receiver");
        Intrinsics.checkNotNullParameter((DefinitionParameters) obj2, "it");
        return new C0973b((Context) scope.get((KClass<?>) Reflection.getOrCreateKotlinClass(Context.class), (Qualifier) null, (Function0<DefinitionParameters>) null), (C0980a) scope.get((KClass<?>) Reflection.getOrCreateKotlinClass(C0980a.class), (Qualifier) null, (Function0<DefinitionParameters>) null));
    }
}
