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
import p008c.p009a.p010a.p011d.C0840a;
import p008c.p009a.p010a.p011d.C0841b;
import p008c.p009a.p024e.p026b.C0962a;

/* renamed from: c.a.c.f */
public final class C0900f extends Lambda implements Function2<Scope, DefinitionParameters, C0840a> {

    /* renamed from: a */
    public static final C0900f f890a = new C0900f();

    public C0900f() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        Scope scope = (Scope) obj;
        Intrinsics.checkNotNullParameter(scope, "$receiver");
        Intrinsics.checkNotNullParameter((DefinitionParameters) obj2, "it");
        return new C0841b((Context) scope.get((KClass<?>) Reflection.getOrCreateKotlinClass(Context.class), (Qualifier) null, (Function0<DefinitionParameters>) null), (C0962a) scope.get((KClass<?>) Reflection.getOrCreateKotlinClass(C0962a.class), (Qualifier) null, (Function0<DefinitionParameters>) null));
    }
}
